package com.google.firebase.heartbeatinfo;

/* JADX INFO: compiled from: com.google.firebase:firebase-common@@19.3.0 */
/* JADX INFO: loaded from: classes2.dex */
class HeartBeatInfoStorage {
    private static final java.lang.String GLOBAL = "fire-global";
    private static com.google.firebase.heartbeatinfo.HeartBeatInfoStorage instance = null;
    private static final java.lang.String preferencesName = "FirebaseAppHeartBeat";
    private final android.content.SharedPreferences sharedPreferences;

    private HeartBeatInfoStorage(android.content.Context context) {
        this.sharedPreferences = context.getSharedPreferences(preferencesName, 0);
    }

    HeartBeatInfoStorage(android.content.SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    static synchronized com.google.firebase.heartbeatinfo.HeartBeatInfoStorage getInstance(android.content.Context context) {
        if (instance == null) {
            instance = new com.google.firebase.heartbeatinfo.HeartBeatInfoStorage(context);
        }
        return instance;
    }

    synchronized boolean shouldSendSdkHeartBeat(java.lang.String str, long j) {
        if (!this.sharedPreferences.contains(str)) {
            this.sharedPreferences.edit().putLong(str, j).apply();
            return true;
        }
        if (j - this.sharedPreferences.getLong(str, -1L) < 86400000) {
            return false;
        }
        this.sharedPreferences.edit().putLong(str, j).apply();
        return true;
    }

    synchronized boolean shouldSendGlobalHeartBeat(long j) {
        return shouldSendSdkHeartBeat(GLOBAL, j);
    }
}
