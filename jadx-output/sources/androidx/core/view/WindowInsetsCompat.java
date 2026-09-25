package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat {
    private final java.lang.Object mInsets;

    private WindowInsetsCompat(java.lang.Object obj) {
        this.mInsets = obj;
    }

    public WindowInsetsCompat(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            this.mInsets = windowInsetsCompat != null ? new android.view.WindowInsets((android.view.WindowInsets) windowInsetsCompat.mInsets) : null;
        } else {
            this.mInsets = null;
        }
    }

    public int getSystemWindowInsetLeft() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.mInsets).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int getSystemWindowInsetTop() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.mInsets).getSystemWindowInsetTop();
        }
        return 0;
    }

    public int getSystemWindowInsetRight() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.mInsets).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int getSystemWindowInsetBottom() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.mInsets).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public boolean hasSystemWindowInsets() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.mInsets).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean hasInsets() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.mInsets).hasInsets();
        }
        return false;
    }

    public boolean isConsumed() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.WindowInsets) this.mInsets).isConsumed();
        }
        return false;
    }

    public boolean isRound() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.mInsets).isRound();
        }
        return false;
    }

    public androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return new androidx.core.view.WindowInsetsCompat(((android.view.WindowInsets) this.mInsets).consumeSystemWindowInsets());
        }
        return null;
    }

    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(int i, int i2, int i3, int i4) {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return new androidx.core.view.WindowInsetsCompat(((android.view.WindowInsets) this.mInsets).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(android.graphics.Rect rect) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return new androidx.core.view.WindowInsetsCompat(((android.view.WindowInsets) this.mInsets).replaceSystemWindowInsets(rect));
        }
        return null;
    }

    public int getStableInsetTop() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.WindowInsets) this.mInsets).getStableInsetTop();
        }
        return 0;
    }

    public int getStableInsetLeft() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.WindowInsets) this.mInsets).getStableInsetLeft();
        }
        return 0;
    }

    public int getStableInsetRight() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.WindowInsets) this.mInsets).getStableInsetRight();
        }
        return 0;
    }

    public int getStableInsetBottom() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.WindowInsets) this.mInsets).getStableInsetBottom();
        }
        return 0;
    }

    public boolean hasStableInsets() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.WindowInsets) this.mInsets).hasStableInsets();
        }
        return false;
    }

    public androidx.core.view.WindowInsetsCompat consumeStableInsets() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return new androidx.core.view.WindowInsetsCompat(((android.view.WindowInsets) this.mInsets).consumeStableInsets());
        }
        return null;
    }

    public androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.DisplayCutoutCompat.wrap(((android.view.WindowInsets) this.mInsets).getDisplayCutout());
        }
        return null;
    }

    public androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
        return android.os.Build.VERSION.SDK_INT >= 28 ? new androidx.core.view.WindowInsetsCompat(((android.view.WindowInsets) this.mInsets).consumeDisplayCutout()) : this;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        java.lang.Object obj2 = this.mInsets;
        java.lang.Object obj3 = ((androidx.core.view.WindowInsetsCompat) obj).mInsets;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    public int hashCode() {
        java.lang.Object obj = this.mInsets;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    static androidx.core.view.WindowInsetsCompat wrap(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new androidx.core.view.WindowInsetsCompat(obj);
    }

    static java.lang.Object unwrap(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat == null) {
            return null;
        }
        return windowInsetsCompat.mInsets;
    }
}
