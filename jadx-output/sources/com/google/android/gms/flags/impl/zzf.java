package com.google.android.gms.flags.impl;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends com.google.android.gms.flags.impl.zza<java.lang.Long> {
    public static java.lang.Long zza(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Long l) {
        try {
            return (java.lang.Long) com.google.android.gms.internal.flags.zze.zza(new com.google.android.gms.flags.impl.zzg(sharedPreferences, str, l));
        } catch (java.lang.Exception e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new java.lang.String("Flag value not available, returning default: "));
            return l;
        }
    }
}
