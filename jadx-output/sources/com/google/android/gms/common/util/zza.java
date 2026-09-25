package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class zza {
    private static long zzgv;
    private static final android.content.IntentFilter filter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static float zzgw = Float.NaN;

    public static int zzg(android.content.Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        android.content.Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, filter);
        int i = ((intentRegisterReceiver == null ? 0 : intentRegisterReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return (com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch() ? powerManager.isInteractive() : powerManager.isScreenOn() ? 2 : 0) | i;
    }

    public static synchronized float zzh(android.content.Context context) {
        if (android.os.SystemClock.elapsedRealtime() - zzgv < 60000 && !java.lang.Float.isNaN(zzgw)) {
            return zzgw;
        }
        android.content.Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, filter);
        if (intentRegisterReceiver != null) {
            zzgw = intentRegisterReceiver.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        }
        zzgv = android.os.SystemClock.elapsedRealtime();
        return zzgw;
    }
}
