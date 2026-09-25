package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfz {
    final com.google.android.gms.measurement.internal.zzgo zza;

    zzfz(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        this.zza = zzgoVar;
    }

    protected final void zza() {
        this.zza.zzae();
        zza(this.zza.zzn().getPackageName());
    }

    protected final void zza(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            this.zza.zzr().zzj().zza("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.zza.zzq().zzd();
        if (!zzb()) {
            this.zza.zzr().zzv().zza("Install Referrer Reporter is not available");
            return;
        }
        com.google.android.gms.measurement.internal.zzgc zzgcVar = new com.google.android.gms.measurement.internal.zzgc(this, str);
        this.zza.zzq().zzd();
        android.content.Intent intent = new android.content.Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new android.content.ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        android.content.pm.PackageManager packageManager = this.zza.zzn().getPackageManager();
        if (packageManager == null) {
            this.zza.zzr().zzj().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            android.content.pm.ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                java.lang.String str2 = resolveInfo.serviceInfo.packageName;
                if (resolveInfo.serviceInfo.name != null && "com.android.vending".equals(str2) && zzb()) {
                    try {
                        this.zza.zzr().zzx().zza("Install Referrer Service is", com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(this.zza.zzn(), new android.content.Intent(intent), zzgcVar, 1) ? "available" : "not available");
                        return;
                    } catch (java.lang.Exception e) {
                        this.zza.zzr().zzf().zza("Exception occurred while binding to Install Referrer Service", e.getMessage());
                        return;
                    }
                }
                this.zza.zzr().zzi().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            return;
        }
        this.zza.zzr().zzv().zza("Play Service for fetching Install Referrer is unavailable on device");
    }

    private final boolean zzb() {
        try {
            com.google.android.gms.common.wrappers.PackageManagerWrapper packageManagerWrapperPackageManager = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zza.zzn());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.zza.zzr().zzx().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (java.lang.Exception e) {
            this.zza.zzr().zzx().zza("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    final android.os.Bundle zza(java.lang.String str, com.google.android.gms.internal.measurement.zzd zzdVar) {
        this.zza.zzq().zzd();
        if (zzdVar == null) {
            this.zza.zzr().zzi().zza("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package_name", str);
        try {
            android.os.Bundle bundleZza = zzdVar.zza(bundle);
            if (bundleZza != null) {
                return bundleZza;
            }
            this.zza.zzr().zzf().zza("Install Referrer Service returned a null response");
            return null;
        } catch (java.lang.Exception e) {
            this.zza.zzr().zzf().zza("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
