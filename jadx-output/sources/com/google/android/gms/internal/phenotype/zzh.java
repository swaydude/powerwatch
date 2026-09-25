package com.google.android.gms.internal.phenotype;

/* JADX INFO: loaded from: classes.dex */
public final class zzh<T> {
    private static final java.lang.Object zzak = new java.lang.Object();
    private static android.content.Context zzal = null;
    private static boolean zzam = false;
    private static volatile java.lang.Boolean zzan;
    private static volatile java.lang.Boolean zzbq;

    public static void init(android.content.Context context) {
        android.content.Context applicationContext;
        synchronized (zzak) {
            if ((android.os.Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                context = applicationContext;
            }
            if (zzal != context) {
                zzan = null;
            }
            zzal = context;
        }
        zzam = false;
    }

    public static void maybeInit(android.content.Context context) {
        if (zzal == null) {
            init(context);
        }
    }
}
