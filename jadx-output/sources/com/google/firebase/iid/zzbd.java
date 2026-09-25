package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbd {
    private static final long zza = java.util.concurrent.TimeUnit.MINUTES.toMillis(1);
    private static final java.lang.Object zzb = new java.lang.Object();
    private static com.google.android.gms.stats.WakeLock zzc;

    public static android.content.ComponentName zza(android.content.Context context, android.content.Intent intent) {
        synchronized (zzb) {
            if (zzc == null) {
                com.google.android.gms.stats.WakeLock wakeLock = new com.google.android.gms.stats.WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                zzc = wakeLock;
                wakeLock.setReferenceCounted(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            zza(intent, true);
            android.content.ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!booleanExtra) {
                zzc.acquire(zza);
            }
            return componentNameStartService;
        }
    }

    private static void zza(android.content.Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static void zza(android.content.Intent intent) {
        synchronized (zzb) {
            if (zzc != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                zza(intent, false);
                zzc.release();
            }
        }
    }
}
