package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public class WorkSourceUtil {
    private static final int zzhj = android.os.Process.myUid();
    private static final java.lang.reflect.Method zzhk = zzx();
    private static final java.lang.reflect.Method zzhl = zzy();
    private static final java.lang.reflect.Method zzhm = zzz();
    private static final java.lang.reflect.Method zzhn = zzaa();
    private static final java.lang.reflect.Method zzho = zzab();
    private static final java.lang.reflect.Method zzhp = zzac();
    private static final java.lang.reflect.Method zzhq = zzad();

    private WorkSourceUtil() {
    }

    private static android.os.WorkSource zza(int i, java.lang.String str) {
        android.os.WorkSource workSource = new android.os.WorkSource();
        zza(workSource, i, str);
        return workSource;
    }

    public static android.os.WorkSource fromPackage(android.content.Context context, java.lang.String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                android.content.pm.ApplicationInfo applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    java.lang.String strValueOf = java.lang.String.valueOf(str);
                    android.util.Log.e("WorkSourceUtil", strValueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(strValueOf) : new java.lang.String("Could not get applicationInfo from package: "));
                    return null;
                }
                return zza(applicationInfo.uid, str);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                java.lang.String strValueOf2 = java.lang.String.valueOf(str);
                android.util.Log.e("WorkSourceUtil", strValueOf2.length() != 0 ? "Could not find package: ".concat(strValueOf2) : new java.lang.String("Could not find package: "));
            }
        }
        return null;
    }

    private static void zza(android.os.WorkSource workSource, int i, java.lang.String str) {
        java.lang.reflect.Method method = zzhl;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, java.lang.Integer.valueOf(i), str);
                return;
            } catch (java.lang.Exception e) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        java.lang.reflect.Method method2 = zzhk;
        if (method2 != null) {
            try {
                method2.invoke(workSource, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception e2) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.reflect.Method method;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            android.util.Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        int iZzd = zzd(context, str);
        if (iZzd < 0) {
            return null;
        }
        android.os.WorkSource workSource = new android.os.WorkSource();
        java.lang.reflect.Method method2 = zzhp;
        if (method2 == null || (method = zzhq) == null) {
            zza(workSource, iZzd, str);
        } else {
            try {
                java.lang.Object objInvoke = method2.invoke(workSource, new java.lang.Object[0]);
                int i = zzhj;
                if (iZzd != i) {
                    method.invoke(objInvoke, java.lang.Integer.valueOf(iZzd), str);
                }
                method.invoke(objInvoke, java.lang.Integer.valueOf(i), str2);
            } catch (java.lang.Exception e) {
                android.util.Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e);
            }
        }
        return workSource;
    }

    private static int zza(android.os.WorkSource workSource) {
        java.lang.reflect.Method method = zzhm;
        if (method != null) {
            try {
                return ((java.lang.Integer) method.invoke(workSource, new java.lang.Object[0])).intValue();
            } catch (java.lang.Exception e) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    private static java.lang.String zza(android.os.WorkSource workSource, int i) {
        java.lang.reflect.Method method = zzho;
        if (method == null) {
            return null;
        }
        try {
            return (java.lang.String) method.invoke(workSource, java.lang.Integer.valueOf(i));
        } catch (java.lang.Exception e) {
            android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    public static java.util.List<java.lang.String> getNames(android.os.WorkSource workSource) {
        int iZza = workSource == null ? 0 : zza(workSource);
        if (iZza == 0) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < iZza; i++) {
            java.lang.String strZza = zza(workSource, i);
            if (!com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(strZza)) {
                arrayList.add(strZza);
            }
        }
        return arrayList;
    }

    public static boolean hasWorkSourcePermission(android.content.Context context) {
        return (context == null || context.getPackageManager() == null || com.google.android.gms.common.wrappers.Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    private static int zzd(android.content.Context context, java.lang.String str) {
        try {
            android.content.pm.ApplicationInfo applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                java.lang.String strValueOf = java.lang.String.valueOf(str);
                android.util.Log.e("WorkSourceUtil", strValueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(strValueOf) : new java.lang.String("Could not get applicationInfo from package: "));
                return -1;
            }
            return applicationInfo.uid;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(str);
            android.util.Log.e("WorkSourceUtil", strValueOf2.length() != 0 ? "Could not find package: ".concat(strValueOf2) : new java.lang.String("Could not find package: "));
            return -1;
        }
    }

    private static java.lang.reflect.Method zzx() {
        try {
            return android.os.WorkSource.class.getMethod("add", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method zzy() {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                return android.os.WorkSource.class.getMethod("add", java.lang.Integer.TYPE, java.lang.String.class);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    private static java.lang.reflect.Method zzz() {
        try {
            return android.os.WorkSource.class.getMethod("size", new java.lang.Class[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method zzaa() {
        try {
            return android.os.WorkSource.class.getMethod("get", java.lang.Integer.TYPE);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method zzab() {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                return android.os.WorkSource.class.getMethod("getName", java.lang.Integer.TYPE);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    private static final java.lang.reflect.Method zzac() {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastP()) {
            try {
                return android.os.WorkSource.class.getMethod("createWorkChain", new java.lang.Class[0]);
            } catch (java.lang.Exception e) {
                android.util.Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        return null;
    }

    private static final java.lang.reflect.Method zzad() {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastP()) {
            try {
                return java.lang.Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", java.lang.Integer.TYPE, java.lang.String.class);
            } catch (java.lang.Exception e) {
                android.util.Log.w("WorkSourceUtil", "Missing WorkChain class", e);
            }
        }
        return null;
    }
}
