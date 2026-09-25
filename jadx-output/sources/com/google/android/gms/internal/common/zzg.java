package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes.dex */
public final class zzg {
    private static volatile boolean zziy = !zzam();

    public static boolean zzam() {
        return android.os.Build.VERSION.SDK_INT >= 24;
    }

    public static android.content.Context getDeviceProtectedStorageContext(android.content.Context context) {
        return context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext();
    }
}
