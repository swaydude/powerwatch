package com.google.android.gms.common.wrappers;

/* JADX INFO: loaded from: classes.dex */
public class PackageManagerWrapper {
    private final android.content.Context zzhx;

    public PackageManagerWrapper(android.content.Context context) {
        this.zzhx = context;
    }

    public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String str, int i) throws android.content.pm.PackageManager.NameNotFoundException {
        return this.zzhx.getPackageManager().getApplicationInfo(str, i);
    }

    public android.content.pm.PackageInfo getPackageInfo(java.lang.String str, int i) throws android.content.pm.PackageManager.NameNotFoundException {
        return this.zzhx.getPackageManager().getPackageInfo(str, i);
    }

    public final android.content.pm.PackageInfo zza(java.lang.String str, int i, int i2) throws android.content.pm.PackageManager.NameNotFoundException {
        return this.zzhx.getPackageManager().getPackageInfo(str, 64);
    }

    public final java.lang.String[] getPackagesForUid(int i) {
        return this.zzhx.getPackageManager().getPackagesForUid(i);
    }

    public final boolean zzb(int i, java.lang.String str) {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()) {
            try {
                ((android.app.AppOpsManager) this.zzhx.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (java.lang.SecurityException unused) {
                return false;
            }
        }
        java.lang.String[] packagesForUid = this.zzhx.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (java.lang.String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int checkCallingOrSelfPermission(java.lang.String str) {
        return this.zzhx.checkCallingOrSelfPermission(str);
    }

    public int checkPermission(java.lang.String str, java.lang.String str2) {
        return this.zzhx.getPackageManager().checkPermission(str, str2);
    }

    public java.lang.CharSequence getApplicationLabel(java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        return this.zzhx.getPackageManager().getApplicationLabel(this.zzhx.getPackageManager().getApplicationInfo(str, 0));
    }

    public boolean isCallerInstantApp() {
        java.lang.String nameForUid;
        if (android.os.Binder.getCallingUid() == android.os.Process.myUid()) {
            return com.google.android.gms.common.wrappers.InstantApps.isInstantApp(this.zzhx);
        }
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO() || (nameForUid = this.zzhx.getPackageManager().getNameForUid(android.os.Binder.getCallingUid())) == null) {
            return false;
        }
        return this.zzhx.getPackageManager().isInstantApp(nameForUid);
    }
}
