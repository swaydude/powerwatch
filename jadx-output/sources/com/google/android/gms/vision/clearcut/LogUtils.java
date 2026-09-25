package com.google.android.gms.vision.clearcut;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class LogUtils {
    public static com.google.android.gms.internal.vision.zzea.zza zza(android.content.Context context) {
        com.google.android.gms.internal.vision.zzea.zza.C0029zza c0029zzaZzl = com.google.android.gms.internal.vision.zzea.zza.zzcj().zzl(context.getPackageName());
        java.lang.String strZzb = zzb(context);
        if (strZzb != null) {
            c0029zzaZzl.zzm(strZzb);
        }
        return (com.google.android.gms.internal.vision.zzea.zza) ((com.google.android.gms.internal.vision.zzgs) c0029zzaZzl.zzgc());
    }

    private static java.lang.String zzb(android.content.Context context) {
        try {
            return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.google.android.gms.vision.L.e(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }
}
