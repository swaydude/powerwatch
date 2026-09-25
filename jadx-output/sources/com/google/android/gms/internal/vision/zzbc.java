package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbc {
    private static volatile com.google.android.gms.internal.vision.zzcn<java.lang.Boolean> zzfv = com.google.android.gms.internal.vision.zzcn.zzbx();
    private static final java.lang.Object zzfw = new java.lang.Object();

    private static boolean zzh(android.content.Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean zza(android.content.Context context, android.net.Uri uri) {
        android.content.pm.ProviderInfo providerInfoResolveContentProvider;
        java.lang.String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            android.util.Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (zzfv.isPresent()) {
            return zzfv.get().booleanValue();
        }
        synchronized (zzfw) {
            if (zzfv.isPresent()) {
                return zzfv.get().booleanValue();
            }
            if (("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) && zzh(context)) {
                z = true;
            }
            zzfv = com.google.android.gms.internal.vision.zzcn.zzb(java.lang.Boolean.valueOf(z));
            return zzfv.get().booleanValue();
        }
    }
}
