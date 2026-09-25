package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
@javax.annotation.CheckReturnValue
final class zzc {
    private static volatile com.google.android.gms.common.internal.zzm zzn;
    private static final java.lang.Object zzo = new java.lang.Object();
    private static android.content.Context zzp;

    static synchronized void zza(android.content.Context context) {
        if (zzp != null) {
            android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            zzp = context.getApplicationContext();
        }
    }

    static com.google.android.gms.common.zzm zza(java.lang.String str, com.google.android.gms.common.zze zzeVar, boolean z, boolean z2) {
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return zzb(str, zzeVar, z, z2);
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static com.google.android.gms.common.zzm zzb(final java.lang.String str, final com.google.android.gms.common.zze zzeVar, final boolean z, boolean z2) {
        try {
            if (zzn == null) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzp);
                synchronized (zzo) {
                    if (zzn == null) {
                        zzn = com.google.android.gms.common.internal.zzn.zzc(com.google.android.gms.dynamite.DynamiteModule.load(zzp, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzp);
            try {
                if (zzn.zza(new com.google.android.gms.common.zzk(str, zzeVar, z, z2), com.google.android.gms.dynamic.ObjectWrapper.wrap(zzp.getPackageManager()))) {
                    return com.google.android.gms.common.zzm.zze();
                }
                return com.google.android.gms.common.zzm.zza(new java.util.concurrent.Callable(z, str, zzeVar) { // from class: com.google.android.gms.common.zzd
                    private final boolean zzq;
                    private final java.lang.String zzr;
                    private final com.google.android.gms.common.zze zzs;

                    {
                        this.zzq = z;
                        this.zzr = str;
                        this.zzs = zzeVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        boolean z3 = this.zzq;
                        java.lang.String str2 = this.zzr;
                        com.google.android.gms.common.zze zzeVar2 = this.zzs;
                        return com.google.android.gms.common.zzm.zzc(str2, zzeVar2, z3, !z3 && com.google.android.gms.common.zzc.zzb(str2, zzeVar2, true, false).zzad);
                    }
                });
            } catch (android.os.RemoteException e) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return com.google.android.gms.common.zzm.zza("module call", e);
            }
        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e2) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            java.lang.String strValueOf = java.lang.String.valueOf(e2.getMessage());
            return com.google.android.gms.common.zzm.zza(strValueOf.length() != 0 ? "module init: ".concat(strValueOf) : new java.lang.String("module init: "), e2);
        }
    }
}
