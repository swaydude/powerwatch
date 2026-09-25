package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzp {
    private static java.lang.Object sLock = new java.lang.Object();
    private static boolean zzeo;
    private static java.lang.String zzep;
    private static int zzeq;

    public static java.lang.String zzc(android.content.Context context) {
        zze(context);
        return zzep;
    }

    public static int zzd(android.content.Context context) {
        zze(context);
        return zzeq;
    }

    private static void zze(android.content.Context context) {
        synchronized (sLock) {
            if (zzeo) {
                return;
            }
            zzeo = true;
            try {
                android.os.Bundle bundle = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                zzep = bundle.getString("com.google.app.id");
                zzeq = bundle.getInt("com.google.android.gms.version");
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
        }
    }
}
