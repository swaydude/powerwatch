package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public class AndroidUtilsLight {
    private static volatile int zzgf = -1;

    public static byte[] getPackageCertificateHashBytes(android.content.Context context, java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        java.security.MessageDigest messageDigestZzj;
        android.content.pm.PackageInfo packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(str, 64);
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1 || (messageDigestZzj = zzj("SHA1")) == null) {
            return null;
        }
        return messageDigestZzj.digest(packageInfo.signatures[0].toByteArray());
    }

    public static java.security.MessageDigest zzj(java.lang.String str) {
        for (int i = 0; i < 2; i++) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    @java.lang.Deprecated
    public static android.content.Context getDeviceProtectedStorageContext(android.content.Context context) {
        return com.google.android.gms.internal.common.zzg.zzam() ? com.google.android.gms.internal.common.zzg.getDeviceProtectedStorageContext(context) : context;
    }
}
