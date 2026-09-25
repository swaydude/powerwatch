package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceProperties {
    private static java.lang.Boolean zzgn;
    private static java.lang.Boolean zzgo;
    private static java.lang.Boolean zzgp;
    private static java.lang.Boolean zzgq;
    private static java.lang.Boolean zzgr;
    private static java.lang.Boolean zzgs;
    private static java.lang.Boolean zzgt;
    private static java.lang.Boolean zzgu;

    private DeviceProperties() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    public static boolean isTablet(android.content.res.Resources resources) {
        boolean z;
        if (resources == null) {
            return false;
        }
        if (zzgn == null) {
            if (!((resources.getConfiguration().screenLayout & 15) > 3)) {
                if (zzgo == null) {
                    android.content.res.Configuration configuration = resources.getConfiguration();
                    zzgo = java.lang.Boolean.valueOf((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600);
                }
                z = zzgo.booleanValue();
            }
            zzgn = java.lang.Boolean.valueOf(z);
        }
        return zzgn.booleanValue();
    }

    public static boolean isWearable(android.content.Context context) {
        if (zzgp == null) {
            zzgp = java.lang.Boolean.valueOf(com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return zzgp.booleanValue();
    }

    public static boolean isWearableWithoutPlayStore(android.content.Context context) {
        if (!isWearable(context)) {
            return false;
        }
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastN()) {
            return isSidewinder(context) && !com.google.android.gms.common.util.PlatformVersion.isAtLeastO();
        }
        return true;
    }

    public static boolean isSidewinder(android.content.Context context) {
        if (zzgq == null) {
            zzgq = java.lang.Boolean.valueOf(com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return zzgq.booleanValue();
    }

    public static boolean isLatchsky(android.content.Context context) {
        if (zzgr == null) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            zzgr = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return zzgr.booleanValue();
    }

    public static boolean zzf(android.content.Context context) {
        if (zzgs == null) {
            zzgs = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return zzgs.booleanValue();
    }

    public static boolean isAuto(android.content.Context context) {
        if (zzgt == null) {
            zzgt = java.lang.Boolean.valueOf(com.google.android.gms.common.util.PlatformVersion.isAtLeastO() && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"));
        }
        return zzgt.booleanValue();
    }

    public static boolean isTv(android.content.Context context) {
        if (zzgu == null) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            zzgu = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return zzgu.booleanValue();
    }

    public static boolean isUserBuild() {
        return "user".equals(android.os.Build.TYPE);
    }
}
