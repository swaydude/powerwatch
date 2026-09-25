package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
@javax.annotation.CheckReturnValue
public class GoogleSignatureVerifier {
    private static com.google.android.gms.common.GoogleSignatureVerifier zzam;
    private final android.content.Context mContext;
    private volatile java.lang.String zzan;

    private GoogleSignatureVerifier(android.content.Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static com.google.android.gms.common.GoogleSignatureVerifier getInstance(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        synchronized (com.google.android.gms.common.GoogleSignatureVerifier.class) {
            if (zzam == null) {
                com.google.android.gms.common.zzc.zza(context);
                zzam = new com.google.android.gms.common.GoogleSignatureVerifier(context);
            }
        }
        return zzam;
    }

    public boolean isUidGoogleSigned(int i) {
        com.google.android.gms.common.zzm zzmVarZzb;
        java.lang.String[] packagesForUid = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.mContext).getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            zzmVarZzb = com.google.android.gms.common.zzm.zzb("no pkgs");
        } else {
            zzmVarZzb = null;
            for (java.lang.String str : packagesForUid) {
                zzmVarZzb = zza(str, i);
                if (zzmVarZzb.zzad) {
                    break;
                }
            }
        }
        zzmVarZzb.zzf();
        return zzmVarZzb.zzad;
    }

    public boolean isPackageGoogleSigned(java.lang.String str) {
        com.google.android.gms.common.zzm zzmVarZzc = zzc(str);
        zzmVarZzc.zzf();
        return zzmVarZzc.zzad;
    }

    public static boolean zza(android.content.pm.PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? zza(packageInfo, com.google.android.gms.common.zzh.zzx) : zza(packageInfo, com.google.android.gms.common.zzh.zzx[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean isGooglePublicSignedPackage(android.content.pm.PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true)) {
            if (com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext)) {
                return true;
            }
            android.util.Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    private final com.google.android.gms.common.zzm zza(java.lang.String str, int i) {
        try {
            android.content.pm.PackageInfo packageInfoZza = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.mContext).zza(str, 64, i);
            boolean zHonorsDebugCertificates = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext);
            if (packageInfoZza == null) {
                return com.google.android.gms.common.zzm.zzb("null pkg");
            }
            if (packageInfoZza.signatures.length != 1) {
                return com.google.android.gms.common.zzm.zzb("single cert required");
            }
            com.google.android.gms.common.zzf zzfVar = new com.google.android.gms.common.zzf(packageInfoZza.signatures[0].toByteArray());
            java.lang.String str2 = packageInfoZza.packageName;
            com.google.android.gms.common.zzm zzmVarZza = com.google.android.gms.common.zzc.zza(str2, zzfVar, zHonorsDebugCertificates, false);
            return (!zzmVarZza.zzad || packageInfoZza.applicationInfo == null || (packageInfoZza.applicationInfo.flags & 2) == 0 || !com.google.android.gms.common.zzc.zza(str2, zzfVar, false, true).zzad) ? zzmVarZza : com.google.android.gms.common.zzm.zzb("debuggable release cert app rejected");
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            return com.google.android.gms.common.zzm.zzb(strValueOf.length() != 0 ? "no pkg ".concat(strValueOf) : new java.lang.String("no pkg "));
        }
    }

    private final com.google.android.gms.common.zzm zzc(java.lang.String str) {
        com.google.android.gms.common.zzm zzmVarZzb;
        if (str == null) {
            return com.google.android.gms.common.zzm.zzb("null pkg");
        }
        if (str.equals(this.zzan)) {
            return com.google.android.gms.common.zzm.zze();
        }
        try {
            android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.mContext).getPackageInfo(str, 64);
            boolean zHonorsDebugCertificates = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext);
            if (packageInfo == null) {
                zzmVarZzb = com.google.android.gms.common.zzm.zzb("null pkg");
            } else if (packageInfo.signatures.length != 1) {
                zzmVarZzb = com.google.android.gms.common.zzm.zzb("single cert required");
            } else {
                com.google.android.gms.common.zzf zzfVar = new com.google.android.gms.common.zzf(packageInfo.signatures[0].toByteArray());
                java.lang.String str2 = packageInfo.packageName;
                com.google.android.gms.common.zzm zzmVarZza = com.google.android.gms.common.zzc.zza(str2, zzfVar, zHonorsDebugCertificates, false);
                zzmVarZzb = (!zzmVarZza.zzad || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !com.google.android.gms.common.zzc.zza(str2, zzfVar, false, true).zzad) ? zzmVarZza : com.google.android.gms.common.zzm.zzb("debuggable release cert app rejected");
            }
            if (zzmVarZzb.zzad) {
                this.zzan = str;
            }
            return zzmVarZzb;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            return com.google.android.gms.common.zzm.zzb(strValueOf.length() != 0 ? "no pkg ".concat(strValueOf) : new java.lang.String("no pkg "));
        }
    }

    private static com.google.android.gms.common.zze zza(android.content.pm.PackageInfo packageInfo, com.google.android.gms.common.zze... zzeVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        com.google.android.gms.common.zzf zzfVar = new com.google.android.gms.common.zzf(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < zzeVarArr.length; i++) {
            if (zzeVarArr[i].equals(zzfVar)) {
                return zzeVarArr[i];
            }
        }
        return null;
    }
}
