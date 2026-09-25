package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public class ClientLibraryUtils {
    private ClientLibraryUtils() {
    }

    public static boolean isPackageSide() {
        return false;
    }

    public static int getClientVersion(android.content.Context context, java.lang.String str) {
        android.os.Bundle bundle;
        android.content.pm.PackageInfo packageInfoZzb = zzb(context, str);
        if (packageInfoZzb == null || packageInfoZzb.applicationInfo == null || (bundle = packageInfoZzb.applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    private static android.content.pm.PackageInfo zzb(android.content.Context context, java.lang.String str) {
        try {
            return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(str, 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean zzc(android.content.Context context, java.lang.String str) {
        "com.google.android.gms".equals(str);
        try {
            return (com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(str, 0).flags & 2097152) != 0;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }
}
