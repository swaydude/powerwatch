package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    public static <T> T checkNotNull(T t) {
        java.util.Objects.requireNonNull(t, "null reference");
        return t;
    }

    public static java.lang.String checkNotEmpty(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static java.lang.String checkNotEmpty(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
        return str;
    }

    public static <T> T checkNotNull(T t, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj));
    }

    public static int checkNotZero(int i, java.lang.Object obj) {
        if (i != 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
    }

    public static int checkNotZero(int i) {
        if (i != 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException("Given Integer is zero");
    }

    public static long checkNotZero(long j, java.lang.Object obj) {
        if (j != 0) {
            return j;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
    }

    public static long checkNotZero(long j) {
        if (j != 0) {
            return j;
        }
        throw new java.lang.IllegalArgumentException("Given Long is zero");
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void checkState(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    public static void checkState(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.format(str, objArr));
        }
    }

    public static void checkArgument(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    private Preconditions() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    public static void checkMainThread(java.lang.String str) {
        if (!com.google.android.gms.common.util.zzc.isMainThread()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    public static void checkNotMainThread(java.lang.String str) {
        if (com.google.android.gms.common.util.zzc.isMainThread()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void checkHandlerThread(android.os.Handler handler) {
        checkHandlerThread(handler, "Must be called on the handler thread");
    }

    public static void checkHandlerThread(android.os.Handler handler, java.lang.String str) {
        if (android.os.Looper.myLooper() != handler.getLooper()) {
            throw new java.lang.IllegalStateException(str);
        }
    }
}
