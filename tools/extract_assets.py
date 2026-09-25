#!/usr/bin/env python3
"""Extract PowerWatch2 art assets from the decompiled APK into the iOS asset catalog.

Sources (project.md §8.2):
  - res/mipmap-*  : full union — app chrome icons, tab icons, product art, app icon.
  - res/drawable* : raster images referenced by app code (R.drawable.* in jadx sources),
                    so only the app's own art lands in the catalog (no AppCompat noise).

Outputs:
  - <asset-catalog>/<name>.imageset/ with density-tagged files (mdpi=1x, xhdpi=2x, xxhdpi=3x)
  - <asset-catalog>/AppIcon.appiconset/ from the largest app_icon.png resized to 1024x1024
  - a name map printed to stdout (original Android names are preserved for traceability)

Usage: python3 tools/extract_assets.py
"""
import json
import os
import re
import shutil
import subprocess
import sys

ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
RES = os.path.join(ROOT, "apktool-output", "res")
JADX = os.path.join(ROOT, "jadx-output", "sources", "powerwatch")
CATALOG = os.path.join(ROOT, "ios", "PowerWatch", "Resources", "Assets.xcassets")

# density -> iOS scale (hdpi 1.5x and xxxhdpi 4x are skipped to stay within 1x/2x/3x)
DENSITY_SCALE = {"mdpi": "1x", "xhdpi": "2x", "xxhdpi": "3x"}
RASTER_EXTS = (".png", ".jpg", ".jpeg", ".webp")


def referenced_drawables():
    """All drawable names referenced by app code (R.drawable.*) or layouts (@drawable/*)."""
    names = set()
    for dirpath, _, files in os.walk(JADX):
        for f in files:
            if not f.endswith((".java", ".kt")):
                continue
            with open(os.path.join(dirpath, f), encoding="utf-8", errors="ignore") as fh:
                for m in re.finditer(r"R\.drawable\.([a-z0-9_]+)", fh.read()):
                    names.add(m.group(1))
    layout_dir = os.path.join(RES, "layout")
    if os.path.isdir(layout_dir):
        for f in os.listdir(layout_dir):
            with open(os.path.join(layout_dir, f), encoding="utf-8", errors="ignore") as fh:
                for m in re.finditer(r"@(?:drawable|mipmap)/([a-z0-9_]+)", fh.read()):
                    names.add(m.group(1))
    return names


def mipmap_union():
    """name -> {scale: path} across mipmap-* (excluding anydpi adaptive icons)."""
    out = {}
    for d in sorted(os.listdir(RES)):
        if not d.startswith("mipmap-") or d == "mipmap-anydpi-v26":
            continue
        scale = DENSITY_SCALE.get(d.replace("mipmap-", ""))
        if not scale:
            continue
        for f in os.listdir(os.path.join(RES, d)):
            if f.lower().endswith(RASTER_EXTS):
                name = os.path.splitext(f)[0]
                out.setdefault(name, {})[scale] = os.path.join(RES, d, f)
    return out


DENSITY_RANK = {"mdpi": 1, "hdpi": 2, "xhdpi": 3, "xxhdpi": 4, "xxxhdpi": 5}

# AppCompat / Material / framework asset prefixes — not app art.
LIBRARY_PREFIXES = ("abc_", "mtrl_", "design_", "notification_", "test_level_", "preference_",
                    "tooltip_", "sp_default", "toast", "btn_check", "btn_radio", "ic_ab", "ic_clear",
                    "ic_commit", "ic_searchapi", "ic_dialog", "ic_event", "ic_group", "ic_email",
                    "ic_info", "ic_lock", "ic_menu", "ic_person", "ic_phone", "ic_star", "ic_warning",
                    "ic_launcher", "ic_input", "ic_arrow", "ic_call", "ic_visibility", "ic_fuzzy",
                    "circular_progress_", "item_background_", "rating_bar", "checkable_", "ic_check",
                    "ic_mtrl", "ic_spinner", "ic_vector", "ic_abc", "ic_search", "ic_home", "ic_crop")


def is_app_asset(name):
    return not any(name.startswith(p) for p in LIBRARY_PREFIXES)


def referenced_rasters(names):
    """name -> {scale: path} for drawable* rasters whose names the app code references."""
    best = {}  # (name, scale) -> (rank, path)
    for d in sorted(os.listdir(RES)):
        if not d.startswith("drawable"):
            continue
        density = None
        for part in d[len("drawable"):].split("-"):
            if part in DENSITY_RANK:
                density = part
        scale = DENSITY_SCALE.get(density, "1x")
        base = os.path.join(RES, d)
        for f in os.listdir(base):
            if not f.lower().endswith(RASTER_EXTS):
                continue
            name = os.path.splitext(f)[0]
            if name not in names or not is_app_asset(name):
                continue
            rank = DENSITY_RANK.get(density, 0)
            cur = best.get((name, scale))
            if cur is None or rank > cur[0]:
                best[(name, scale)] = (rank, os.path.join(base, f))
    out = {}
    for (name, scale), (_, path) in best.items():
        out.setdefault(name, {})[scale] = path
    return out


def emit_imageset(name, files_by_scale):
    outdir = os.path.join(CATALOG, f"{name}.imageset")
    os.makedirs(outdir, exist_ok=True)
    images = []
    for scale in ("1x", "2x", "3x"):
        if scale not in files_by_scale:
            continue
        src = files_by_scale[scale]
        ext = os.path.splitext(src)[1].lower()
        if ext in (".jpeg",):
            ext = ".jpg"
        if ext == ".webp":  # xcassets has no webp; transcode to png via ImageIO
            tmp = f"/tmp/pwwebp-{name}-{scale}.png"
            subprocess.run(["sips", "-s", "format", "png", src, "--out", tmp],
                           check=True, capture_output=True)
            src, ext = tmp, ".png"
        dst = os.path.join(outdir, f"{name}-{scale}{ext}")
        shutil.copyfile(src, dst)
        images.append({"idiom": "universal", "scale": scale, "filename": f"{name}-{scale}{ext}"})
    with open(os.path.join(outdir, "Contents.json"), "w") as fh:
        json.dump({"info": {"author": "xcode", "version": 1}, "images": images}, fh, indent=2)
    print(f"  {name:28s} {','.join(files_by_scale)}")


def emit_app_icon(app_icons):
    # also consider densities outside the 1x/2x/3x scale set (e.g. xxxhdpi)
    icons = dict(app_icons)
    for dens in ("xxxhdpi", "xxhdpi", "xhdpi", "hdpi", "mdpi"):
        p = os.path.join(RES, f"mipmap-{dens}", "app_icon.png")
        if os.path.exists(p):
            icons[dens] = p
    # largest source wins; iOS 17+ accepts a single 1024x1024 universal icon
    sizes = []
    for scale, path in icons.items():
        w, h = png_size(path)
        sizes.append((w, scale, path))
    sizes.sort(reverse=True)
    best = sizes[0][2]
    outdir = os.path.join(CATALOG, "AppIcon.appiconset")
    os.makedirs(outdir, exist_ok=True)
    dst = os.path.join(outdir, "app_icon-1024.png")
    subprocess.run(["sips", "-z", "1024", "1024", best, "--out", dst],
                   check=True, capture_output=True)
    contents = {
        "info": {"author": "xcode", "version": 1},
        "images": [{"size": "1024x1024", "idiom": "universal", "filename": "app_icon-1024.png",
                    "platform": "ios"}],
    }
    with open(os.path.join(outdir, "Contents.json"), "w") as fh:
        json.dump(contents, fh, indent=2)
    print(f"  AppIcon                          <- {os.path.relpath(best, RES)} (1024)")


def png_size(path):
    r = subprocess.run(["sips", "-g", "pixelWidth", "-g", "pixelHeight", path],
                       capture_output=True, text=True)
    w = int(re.search(r"pixelWidth:\s*(\d+)", r.stdout).group(1))
    h = int(re.search(r"pixelHeight:\s*(\d+)", r.stdout).group(1))
    return w, h


def main():
    os.makedirs(CATALOG, exist_ok=True)
    print("== mipmap-* (app chrome, tabs, product art) ==")
    mips = mipmap_union()
    for name in sorted(mips):
        if name == "app_icon":
            continue  # handled by emit_app_icon
        emit_imageset(name, mips[name])
    print("== App icon ==")
    emit_app_icon(mips["app_icon"])
    print("== drawable* rasters referenced by app code ==")
    refs = referenced_drawables()
    rasters = referenced_rasters(refs)
    for name in sorted(rasters):
        emit_imageset(name, rasters[name])
    missing = sorted(n for n in refs
                     if not any(os.path.exists(os.path.join(RES, d, n + e))
                                for d in os.listdir(RES) if d.startswith("drawable")
                                for e in RASTER_EXTS))
    print(f"== {len(missing)} referenced names are XML/vector (recreated as SF Symbols) ==")
    for n in missing[:40]:
        print(f"  {n}")
    print("done.")


if __name__ == "__main__":
    sys.exit(main())
