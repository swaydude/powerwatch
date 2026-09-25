package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    public static void checkArgument(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static <T> T checkNotNull(T t) {
        java.util.Objects.requireNonNull(t);
        return t;
    }

    public static <T> T checkNotNull(T t, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj));
    }

    public static void checkState(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void checkState(boolean z) {
        checkState(z, null);
    }

    public static int checkArgumentNonnegative(int i, java.lang.String str) {
        if (i >= 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(str);
    }

    public static int checkArgumentNonnegative(int i) {
        if (i >= 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static int checkArgumentInRange(int i, int i2, int i3, java.lang.String str) {
        if (i < i2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too low)", str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        }
        if (i <= i3) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s is out of range of [%d, %d] (too high)", str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
    }

    private Preconditions() {
    }
}
