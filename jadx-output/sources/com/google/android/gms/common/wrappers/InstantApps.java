package com.google.android.gms.common.wrappers;

/* JADX INFO: loaded from: classes.dex */
public class InstantApps {
    private static android.content.Context zzhv;
    private static java.lang.Boolean zzhw;

    public static synchronized boolean isInstantApp(android.content.Context context) {
        java.lang.Boolean bool;
        android.content.Context applicationContext = context.getApplicationContext();
        android.content.Context context2 = zzhv;
        if (context2 != null && (bool = zzhw) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        zzhw = null;
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            zzhw = java.lang.Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                zzhw = true;
            } catch (java.lang.ClassNotFoundException unused) {
                zzhw = false;
            }
        }
        zzhv = applicationContext;
        return zzhw.booleanValue();
    }
}
