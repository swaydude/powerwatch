package com.google.android.gms.flags.impl;

/* JADX INFO: loaded from: classes.dex */
public final class zzd extends com.google.android.gms.flags.impl.zza<java.lang.Integer> {
    public static java.lang.Integer zza(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Integer num) {
        try {
            return (java.lang.Integer) com.google.android.gms.internal.flags.zze.zza(new com.google.android.gms.flags.impl.zze(sharedPreferences, str, num));
        } catch (java.lang.Exception e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new java.lang.String("Flag value not available, returning default: "));
            return num;
        }
    }
}
