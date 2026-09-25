package com.google.android.gms.ads.identifier;

/* JADX INFO: loaded from: classes.dex */
public final class zzb {
    private android.content.SharedPreferences zzs;

    public zzb(android.content.Context context) {
        try {
            android.content.Context remoteContext = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(context);
            this.zzs = remoteContext == null ? null : remoteContext.getSharedPreferences("google_ads_flags", 0);
        } catch (java.lang.Throwable th) {
            android.util.Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.zzs = null;
        }
    }

    public final boolean getBoolean(java.lang.String str, boolean z) {
        try {
            android.content.SharedPreferences sharedPreferences = this.zzs;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (java.lang.Throwable th) {
            android.util.Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    final float getFloat(java.lang.String str, float f) {
        try {
            android.content.SharedPreferences sharedPreferences = this.zzs;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (java.lang.Throwable th) {
            android.util.Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    final java.lang.String getString(java.lang.String str, java.lang.String str2) {
        try {
            android.content.SharedPreferences sharedPreferences = this.zzs;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (java.lang.Throwable th) {
            android.util.Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
