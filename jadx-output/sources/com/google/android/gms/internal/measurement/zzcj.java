package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcj {
    private static volatile com.google.android.gms.internal.measurement.zzcy<java.lang.Boolean> zza = com.google.android.gms.internal.measurement.zzcy.zzc();
    private static final java.lang.Object zzb = new java.lang.Object();

    private static boolean zza(android.content.Context context) {
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
        if (zza.zza()) {
            return zza.zzb().booleanValue();
        }
        synchronized (zzb) {
            if (zza.zza()) {
                return zza.zzb().booleanValue();
            }
            if (("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) && zza(context)) {
                z = true;
            }
            zza = com.google.android.gms.internal.measurement.zzcy.zza(java.lang.Boolean.valueOf(z));
            return zza.zzb().booleanValue();
        }
    }
}
