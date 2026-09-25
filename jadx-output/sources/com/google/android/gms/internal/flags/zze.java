package com.google.android.gms.internal.flags;

/* JADX INFO: loaded from: classes.dex */
public final class zze {
    public static <T> T zza(java.util.concurrent.Callable<T> callable) throws java.lang.Exception {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        try {
            android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
