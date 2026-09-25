package com.google.android.gms.internal.firebase_messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.gms.internal.firebase_messaging.zzk.class.getName());

    private zzk() {
    }

    public static void zza(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.io.InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e) {
                try {
                    zza.logp(java.util.logging.Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (java.lang.Throwable) e);
                } catch (java.io.IOException e2) {
                    throw new java.lang.AssertionError(e2);
                }
            }
        }
    }
}
