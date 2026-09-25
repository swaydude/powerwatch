package com.google.android.gms.flags.impl;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends com.google.android.gms.flags.impl.zza<java.lang.String> {
    public static java.lang.String zza(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.String str2) {
        try {
            return (java.lang.String) com.google.android.gms.internal.flags.zze.zza(new com.google.android.gms.flags.impl.zzi(sharedPreferences, str, str2));
        } catch (java.lang.Exception e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new java.lang.String("Flag value not available, returning default: "));
            return str2;
        }
    }
}
