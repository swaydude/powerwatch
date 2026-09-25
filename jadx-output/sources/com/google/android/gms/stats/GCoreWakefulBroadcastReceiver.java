package com.google.android.gms.stats;

/* JADX INFO: loaded from: classes.dex */
public abstract class GCoreWakefulBroadcastReceiver extends androidx.legacy.content.WakefulBroadcastReceiver {
    private static java.lang.String TAG = "GCoreWakefulBroadcastReceiver";

    public static boolean completeWakefulIntent(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        if (context != null) {
            com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerReleaseEvent(context, intent);
        } else {
            java.lang.String str = TAG;
            java.lang.String strValueOf = java.lang.String.valueOf(intent.toUri(0));
            android.util.Log.w(str, strValueOf.length() != 0 ? "context shouldn't be null. intent: ".concat(strValueOf) : new java.lang.String("context shouldn't be null. intent: "));
        }
        return androidx.legacy.content.WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
