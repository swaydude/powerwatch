package com.google.android.gms.flags.impl;

/* JADX INFO: loaded from: classes.dex */
public final class zzb extends com.google.android.gms.flags.impl.zza<java.lang.Boolean> {
    public static java.lang.Boolean zza(android.content.SharedPreferences sharedPreferences, java.lang.String str, java.lang.Boolean bool) {
        try {
            return (java.lang.Boolean) com.google.android.gms.internal.flags.zze.zza(new com.google.android.gms.flags.impl.zzc(sharedPreferences, str, bool));
        } catch (java.lang.Exception e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new java.lang.String("Flag value not available, returning default: "));
            return bool;
        }
    }
}
