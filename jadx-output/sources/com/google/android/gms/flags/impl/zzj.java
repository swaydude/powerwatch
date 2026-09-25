package com.google.android.gms.flags.impl;

/* JADX INFO: loaded from: classes.dex */
public final class zzj {
    private static android.content.SharedPreferences zzw;

    public static android.content.SharedPreferences zza(android.content.Context context) throws java.lang.Exception {
        android.content.SharedPreferences sharedPreferences;
        synchronized (android.content.SharedPreferences.class) {
            if (zzw == null) {
                zzw = (android.content.SharedPreferences) com.google.android.gms.internal.flags.zze.zza(new com.google.android.gms.flags.impl.zzk(context));
            }
            sharedPreferences = zzw;
        }
        return sharedPreferences;
    }
}
