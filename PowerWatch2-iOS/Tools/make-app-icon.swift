#!/usr/bin/env swift
//
//  make-app-icon.swift — rebuilds the iOS app icon from the artwork that ships in
//  the Android APK, so the port carries the same mark as PowerWatch2 on Android.
//
//  Usage:
//      swift Tools/make-app-icon.swift <apk> [output.png]
//
//  Where the art comes from (EVIDENCE.md E-64):
//
//    * `aapt2 dump badging` reports the launcher icon as
//      `res/mipmap-xxxhdpi-v4/app_icon.png` (192x192, no alpha): the Matrix mark in
//      white on a maroon→red→orange glow. That is what a user sees on Android, so it
//      defines colour, glow and layout.
//    * `res/mipmap-anydpi-v26/ic_launcher.xml` is *not* used: its layers resolve to
//      `@drawable/ic_launcher_foreground` (the stock Android Studio bugdroid) and
//      `@drawable/ic_launcher_background` (the stock `#ff26a69a` grid), i.e. Matrix
//      never replaced the template.
//    * the largest copy of the mark itself is `res/mipmap-xxhdpi-v4/splash_icon.png`
//      (237x444, RGBA) — the same shape, 1.4x taller than the tile's glyph — so it
//      is the shape source, recoloured white like the launcher tile's glyph.
//
//  The background is never hand-picked and never guessed: the tile's own pixels are
//  kept and the glyph area (plus the tile's dark rounded edge) is filled by
//  Gauss-Seidel diffusion from the surrounding ring, so the glow is reproduced rather
//  than approximated. Then the background is upscaled and the crisp mark is stamped
//  where the tile puts its own glyph. iOS wants one opaque square with no pre-rounded
//  corners, which is exactly why the 192 px tile cannot simply be blown up.

import CoreGraphics
import Foundation
import ImageIO

// MARK: - Arguments

let arguments = CommandLine.arguments
guard arguments.count >= 2 else {
    FileHandle.standardError.write(Data("usage: make-app-icon.swift <apk> [output.png]\n".utf8))
    exit(64)
}
let apkURL = URL(fileURLWithPath: arguments[1])
let outputURL = arguments.count > 2
    ? URL(fileURLWithPath: arguments[2])
    : URL(fileURLWithPath: "Sources/Resources/Assets.xcassets/AppIcon.appiconset/appicon-1024.png",
          relativeTo: URL(fileURLWithPath: #file)
              .deletingLastPathComponent()   // Tools
              .deletingLastPathComponent())  // PowerWatch2-iOS

let side = 1024
let tileEntry = "res/mipmap-xxxhdpi-v4/app_icon.png"
let glyphEntry = "res/mipmap-xxhdpi-v4/splash_icon.png"
/// How much of the tile's own dark outline is thrown away before the fill.
let edgeTrim = 5
/// The launcher tile's glyph is pure white, which makes it separable from the glow.
let whiteThreshold: UInt8 = 235

// MARK: - Loading

func entry(from apk: URL, path: String) -> Data? {
    let process = Process()
    process.executableURL = URL(fileURLWithPath: "/usr/bin/unzip")
    process.arguments = ["-p", apk.path, path]
    let pipe = Pipe()
    process.standardOutput = pipe
    process.standardError = Pipe()
    do { try process.run() } catch { return nil }
    let data = pipe.fileHandleForReading.readDataToEndOfFile()
    process.waitUntilExit()
    return process.terminationStatus == 0 && !data.isEmpty ? data : nil
}

struct Bitmap {
    let width: Int
    let height: Int
    /// RGBA8, sRGB, premultiplied.
    let pixels: [UInt8]

    subscript(_ x: Int, _ y: Int) -> (r: UInt8, g: UInt8, b: UInt8, a: UInt8) {
        let i = (y * width + x) * 4
        return (pixels[i], pixels[i + 1], pixels[i + 2], pixels[i + 3])
    }
}

let sRGB = CGColorSpace(name: CGColorSpace.sRGB)!

func bitmap(_ data: Data) -> Bitmap? {
    guard let source = CGImageSourceCreateWithData(data as CFData, nil),
          let image = CGImageSourceCreateImageAtIndex(source, 0, nil) else { return nil }
    let width = image.width, height = image.height
    var pixels = [UInt8](repeating: 0, count: width * height * 4)
    guard let context = CGContext(data: &pixels, width: width, height: height, bitsPerComponent: 8,
                                  bytesPerRow: width * 4, space: sRGB,
                                  bitmapInfo: CGImageAlphaInfo.premultipliedLast.rawValue) else { return nil }
    context.draw(image, in: CGRect(x: 0, y: 0, width: width, height: height))
    return Bitmap(width: width, height: height, pixels: pixels)
}

func cgImage(from bitmap: Bitmap) -> CGImage? {
    var copy = bitmap.pixels
    guard let context = CGContext(data: &copy, width: bitmap.width, height: bitmap.height,
                                  bitsPerComponent: 8, bytesPerRow: bitmap.width * 4, space: sRGB,
                                  bitmapInfo: CGImageAlphaInfo.premultipliedLast.rawValue) else { return nil }
    return context.makeImage()
}

func upscaled(_ image: Bitmap, to size: Int) -> Bitmap? {
    guard let source = cgImage(from: image) else { return nil }
    var out = [UInt8](repeating: 0, count: size * size * 4)
    guard let context = CGContext(data: &out, width: size, height: size, bitsPerComponent: 8,
                                  bytesPerRow: size * 4, space: sRGB,
                                  bitmapInfo: CGImageAlphaInfo.premultipliedLast.rawValue) else { return nil }
    context.interpolationQuality = .high
    context.setShouldAntialias(true)
    context.draw(source, in: CGRect(x: 0, y: 0, width: size, height: size))
    return Bitmap(width: size, height: size, pixels: out)
}

guard let tileData = entry(from: apkURL, path: tileEntry), let tile = bitmap(tileData) else {
    fatalError("could not read \(tileEntry) from \(apkURL.path)")
}
guard let glyphData = entry(from: apkURL, path: glyphEntry), let glyph = bitmap(glyphData) else {
    fatalError("could not read \(glyphEntry) from \(apkURL.path)")
}

// MARK: - Measuring

func boundingBox(ofWhite image: Bitmap) -> CGRect? {
    var minX = image.width, minY = image.height, maxX = -1, maxY = -1
    for y in 0..<image.height {
        for x in 0..<image.width where image[x, y].r > whiteThreshold
            && image[x, y].g > whiteThreshold && image[x, y].b > whiteThreshold {
            minX = min(minX, x); minY = min(minY, y); maxX = max(maxX, x); maxY = max(maxY, y)
        }
    }
    return maxX >= minX ? CGRect(x: minX, y: minY, width: maxX - minX + 1, height: maxY - minY + 1) : nil
}

func boundingBox(ofOpaque image: Bitmap) -> CGRect? {
    var minX = image.width, minY = image.height, maxX = -1, maxY = -1
    for y in 0..<image.height {
        for x in 0..<image.width where image[x, y].a > 8 {
            minX = min(minX, x); minY = min(minY, y); maxX = max(maxX, x); maxY = max(maxY, y)
        }
    }
    return maxX >= minX ? CGRect(x: minX, y: minY, width: maxX - minX + 1, height: maxY - minY + 1) : nil
}

guard let tileGlyph = boundingBox(ofWhite: tile) else {
    fatalError("\(tileEntry) has no white glyph to measure")
}
guard let sourceGlyph = boundingBox(ofOpaque: glyph) else {
    fatalError("\(glyphEntry) has no opaque artwork to measure")
}

// MARK: - Reconstructing the background

/// Keeps every background pixel of the tile and fills the glyph (and the tile's own
/// dark outline) by averaging neighbours until the hole is smooth. The region it has
/// to invent is bounded on all sides by real pixels, and the real pixels are a smooth
/// glow, so diffusion lands on the original rather than on a guess.
func reconstructedBackground(of image: Bitmap) -> Bitmap {
    let w = image.width, h = image.height
    var red = [Double](repeating: 0, count: w * h)
    var green = [Double](repeating: 0, count: w * h)
    var blue = [Double](repeating: 0, count: w * h)
    var known = [Bool](repeating: false, count: w * h)

    let glyphMinX = Int(tileGlyph.minX.rounded(.down)) - 2
    let glyphMinY = Int(tileGlyph.minY.rounded(.down)) - 2
    let glyphMaxX = Int(tileGlyph.maxX.rounded(.up)) + 2
    let glyphMaxY = Int(tileGlyph.maxY.rounded(.up)) + 2

    for y in 0..<h {
        for x in 0..<w {
            let i = y * w + x
            let p = image[x, y]
            let insideGlyph = x >= glyphMinX && x <= glyphMaxX && y >= glyphMinY && y <= glyphMaxY
            let outsideEdge = x >= edgeTrim && y >= edgeTrim && x < w - edgeTrim && y < h - edgeTrim
            let whiteGlyphPixel = p.r > whiteThreshold && p.g > whiteThreshold && p.b > whiteThreshold
            if outsideEdge && !(insideGlyph && whiteGlyphPixel) {
                red[i] = Double(p.r); green[i] = Double(p.g); blue[i] = Double(p.b)
                known[i] = true
            }
        }
    }

    // Seed the holes with the mean background colour so a pixel the sweep somehow
    // never reaches can still not turn up black.
    var sums = (0.0, 0.0, 0.0)
    var seeds = 0
    for i in 0..<(w * h) where known[i] {
        sums.0 += red[i]; sums.1 += green[i]; sums.2 += blue[i]; seeds += 1
    }
    guard seeds > 0 else { fatalError("\(image.width)x\(image.height) tile has no background left to sample") }
    for i in 0..<(w * h) where !known[i] {
        red[i] = sums.0 / Double(seeds)
        green[i] = sums.1 / Double(seeds)
        blue[i] = sums.2 / Double(seeds)
    }

    // Gauss-Seidel: sweep in both directions so information travels quickly.
    func average(_ x: Int, _ y: Int) -> (Double, Double, Double)? {
        var sums = (0.0, 0.0, 0.0), hits = 0
        for (dx, dy) in [(-1, 0), (1, 0), (0, -1), (0, 1)] {
            let nx = x + dx, ny = y + dy
            guard nx >= 0, ny >= 0, nx < w, ny < h else { continue }
            let j = ny * w + nx
            guard known[j] else { continue }
            sums.0 += red[j]; sums.1 += green[j]; sums.2 += blue[j]; hits += 1
        }
        guard hits > 0 else { return nil }
        return (sums.0 / Double(hits), sums.1 / Double(hits), sums.2 / Double(hits))
    }

    for _ in 0..<6000 {
        var moved = 0.0
        for y in 0..<h {
            for x in 0..<w {
                let i = y * w + x
                guard !known[i], let value = average(x, y) else { continue }
                moved += abs(red[i] - value.0) + abs(green[i] - value.1) + abs(blue[i] - value.2)
                red[i] = value.0; green[i] = value.1; blue[i] = value.2
                known[i] = true
            }
        }
        if moved < 0.5 { break }
    }
    var pixels = [UInt8](repeating: 0, count: w * h * 4)
    for i in 0..<(w * h) {
        pixels[i * 4] = UInt8(max(0, min(255, red[i].rounded())))
        pixels[i * 4 + 1] = UInt8(max(0, min(255, green[i].rounded())))
        pixels[i * 4 + 2] = UInt8(max(0, min(255, blue[i].rounded())))
        pixels[i * 4 + 3] = 255
    }
    return Bitmap(width: w, height: h, pixels: pixels)
}

let background = reconstructedBackground(of: tile)
guard let enlarged = upscaled(background, to: side) else {
    fatalError("could not upscale the reconstructed background")
}

// MARK: - Composing

// The background is already the full square at the right size; draw it, then stamp
// the crisp mark over it. `noneSkipLast` keeps the PNG opaque.
guard let canvas = CGContext(data: nil, width: side, height: side, bitsPerComponent: 8,
                             bytesPerRow: side * 4, space: sRGB,
                             bitmapInfo: CGImageAlphaInfo.noneSkipLast.rawValue) else {
    fatalError("could not create the \(side)x\(side) canvas")
}
guard let backgroundImage = cgImage(from: enlarged) else {
    fatalError("could not realise the background image")
}
canvas.interpolationQuality = .high
canvas.draw(backgroundImage, in: CGRect(x: 0, y: 0, width: side, height: side))

// Recolour the splash artwork white, keeping its anti-aliased alpha: under
// premultiplication, white is simply (a, a, a, a).
var whitePixels = [UInt8](repeating: 0, count: glyph.width * glyph.height * 4)
for i in stride(from: 0, to: whitePixels.count, by: 4) {
    let a = glyph.pixels[i + 3]
    whitePixels[i] = a; whitePixels[i + 1] = a; whitePixels[i + 2] = a; whitePixels[i + 3] = a
}
guard let whiteContext = CGContext(data: &whitePixels, width: glyph.width, height: glyph.height,
                                   bitsPerComponent: 8, bytesPerRow: glyph.width * 4, space: sRGB,
                                   bitmapInfo: CGImageAlphaInfo.premultipliedLast.rawValue),
      let whiteImage = whiteContext.makeImage() else {
    fatalError("could not recolour \(glyphEntry)")
}

// Lay the mark exactly where the launcher tile puts its own glyph. Bitmap rows run
// from the top while CoreGraphics runs from the bottom, hence the flips.
let targetWidth = tileGlyph.width / CGFloat(tile.width) * CGFloat(side)
let targetHeight = tileGlyph.height / CGFloat(tile.height) * CGFloat(side)
let targetX = tileGlyph.minX / CGFloat(tile.width) * CGFloat(side)
let targetTop = tileGlyph.minY / CGFloat(tile.height) * CGFloat(side)
let scale = min(targetWidth / sourceGlyph.width, targetHeight / sourceGlyph.height)
let drawLeft = targetX - sourceGlyph.minX * scale
let drawTop = targetTop - sourceGlyph.minY * scale
canvas.draw(whiteImage, in: CGRect(x: drawLeft,
                                   y: CGFloat(side) - drawTop - CGFloat(glyph.height) * scale,
                                   width: CGFloat(glyph.width) * scale,
                                   height: CGFloat(glyph.height) * scale))

guard let image = canvas.makeImage() else { fatalError("could not render the icon") }
try? FileManager.default.createDirectory(at: outputURL.deletingLastPathComponent(),
                                        withIntermediateDirectories: true)
guard let destination = CGImageDestinationCreateWithURL(outputURL as CFURL, "public.png" as CFString, 1, nil) else {
    fatalError("could not open \(outputURL.path) for writing")
}
CGImageDestinationAddImage(destination, image, nil)
guard CGImageDestinationFinalize(destination) == true else {
    fatalError("could not write \(outputURL.path)")
}

print("tile        \(tile.width)x\(tile.height)  \(tileEntry)")
print("glyph       \(glyph.width)x\(glyph.height)  \(glyphEntry)")
print("glyph box   tile x \(Int(tileGlyph.minX))...\(Int(tileGlyph.maxX)) y \(Int(tileGlyph.minY))...\(Int(tileGlyph.maxY))"
    + "  →  \(Int(targetX)),\(Int(targetTop)) \(Int(targetWidth))x\(Int(targetHeight))")
print("mark        source box \(Int(sourceGlyph.minX)),\(Int(sourceGlyph.minY)) "
    + "\(Int(sourceGlyph.width))x\(Int(sourceGlyph.height)) at \(String(format: "%.2f", scale))x")
print("wrote       \(outputURL.path)")
