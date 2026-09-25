package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayCutoutCompat {
    private final java.lang.Object mDisplayCutout;

    public DisplayCutoutCompat(android.graphics.Rect rect, java.util.List<android.graphics.Rect> list) {
        this(android.os.Build.VERSION.SDK_INT >= 28 ? new android.view.DisplayCutout(rect, list) : null);
    }

    private DisplayCutoutCompat(java.lang.Object obj) {
        this.mDisplayCutout = obj;
    }

    public int getSafeInsetTop() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return ((android.view.DisplayCutout) this.mDisplayCutout).getSafeInsetTop();
        }
        return 0;
    }

    public int getSafeInsetBottom() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return ((android.view.DisplayCutout) this.mDisplayCutout).getSafeInsetBottom();
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return ((android.view.DisplayCutout) this.mDisplayCutout).getSafeInsetLeft();
        }
        return 0;
    }

    public int getSafeInsetRight() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return ((android.view.DisplayCutout) this.mDisplayCutout).getSafeInsetRight();
        }
        return 0;
    }

    public java.util.List<android.graphics.Rect> getBoundingRects() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return ((android.view.DisplayCutout) this.mDisplayCutout).getBoundingRects();
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        java.lang.Object obj2 = this.mDisplayCutout;
        java.lang.Object obj3 = ((androidx.core.view.DisplayCutoutCompat) obj).mDisplayCutout;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    public int hashCode() {
        java.lang.Object obj = this.mDisplayCutout;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    static androidx.core.view.DisplayCutoutCompat wrap(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new androidx.core.view.DisplayCutoutCompat(obj);
    }
}
