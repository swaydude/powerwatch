package com.google.android.gms.common.stats;

/* JADX INFO: loaded from: classes.dex */
public class WakeLockTracker {
    private static java.lang.Boolean zzgd;
    private static com.google.android.gms.common.stats.WakeLockTracker zzgc = new com.google.android.gms.common.stats.WakeLockTracker();
    private static boolean zzge = false;

    public static com.google.android.gms.common.stats.WakeLockTracker getInstance() {
        return zzgc;
    }

    public void registerAcquireEvent(android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4) {
        registerEvent(context, intent.getStringExtra(com.google.android.gms.common.stats.LoggingConstants.EXTRA_WAKE_LOCK_KEY), 7, str, str2, str3, i, java.util.Arrays.asList(str4));
    }

    public void registerReleaseEvent(android.content.Context context, android.content.Intent intent) {
        registerEvent(context, intent.getStringExtra(com.google.android.gms.common.stats.LoggingConstants.EXTRA_WAKE_LOCK_KEY), 8, null, null, null, 0, null);
    }

    public void registerEvent(android.content.Context context, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.util.List<java.lang.String> list) {
        registerEvent(context, str, i, str2, str3, str4, i2, list, 0L);
    }

    public void registerEvent(android.content.Context context, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.util.List<java.lang.String> list, long j) {
        if (zzw()) {
            if (android.text.TextUtils.isEmpty(str)) {
                java.lang.String strValueOf = java.lang.String.valueOf(str);
                android.util.Log.e("WakeLockTracker", strValueOf.length() != 0 ? "missing wakeLock key. ".concat(strValueOf) : new java.lang.String("missing wakeLock key. "));
            } else if (7 == i || 8 == i || 10 == i || 11 == i) {
                zza(context, new com.google.android.gms.common.stats.WakeLockEvent(java.lang.System.currentTimeMillis(), i, str2, i2, com.google.android.gms.common.stats.StatsUtils.zza(list), str, android.os.SystemClock.elapsedRealtime(), com.google.android.gms.common.util.zza.zzg(context), str3, com.google.android.gms.common.stats.StatsUtils.zzi(context.getPackageName()), com.google.android.gms.common.util.zza.zzh(context), j, str4, false));
            }
        }
    }

    public void registerDeadlineEvent(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.util.List<java.lang.String> list, boolean z, long j) {
        if (zzw()) {
            zza(context, new com.google.android.gms.common.stats.WakeLockEvent(java.lang.System.currentTimeMillis(), 16, str, i, com.google.android.gms.common.stats.StatsUtils.zza(list), null, j, com.google.android.gms.common.util.zza.zzg(context), str2, com.google.android.gms.common.stats.StatsUtils.zzi(context.getPackageName()), com.google.android.gms.common.util.zza.zzh(context), 0L, str3, z));
        }
    }

    private static void zza(android.content.Context context, com.google.android.gms.common.stats.WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new android.content.Intent().setComponent(com.google.android.gms.common.stats.LoggingConstants.zzfg).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (java.lang.Exception e) {
            android.util.Log.wtf("WakeLockTracker", e);
        }
    }

    private static boolean zzw() {
        if (zzgd == null) {
            zzgd = false;
        }
        return zzgd.booleanValue();
    }
}
