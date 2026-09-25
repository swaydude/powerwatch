package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public final class GmsLogger {
    private static final int zzef = 15;
    private static final java.lang.String zzeg = null;
    private final java.lang.String zzeh;
    private final java.lang.String zzei;

    public GmsLogger(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "log tag cannot be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zzeh = str;
        if (str2 == null || str2.length() <= 0) {
            this.zzei = null;
        } else {
            this.zzei = str2;
        }
    }

    public final boolean canLogPii() {
        return false;
    }

    public GmsLogger(java.lang.String str) {
        this(str, null);
    }

    public final boolean canLog(int i) {
        return android.util.Log.isLoggable(this.zzeh, i);
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        if (canLog(3)) {
            android.util.Log.d(str, zzh(str2));
        }
    }

    public final void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(3)) {
            android.util.Log.d(str, zzh(str2), th);
        }
    }

    public final void v(java.lang.String str, java.lang.String str2) {
        if (canLog(2)) {
            android.util.Log.v(str, zzh(str2));
        }
    }

    public final void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(2)) {
            android.util.Log.v(str, zzh(str2), th);
        }
    }

    public final void i(java.lang.String str, java.lang.String str2) {
        if (canLog(4)) {
            android.util.Log.i(str, zzh(str2));
        }
    }

    public final void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(4)) {
            android.util.Log.i(str, zzh(str2), th);
        }
    }

    public final void w(java.lang.String str, java.lang.String str2) {
        if (canLog(5)) {
            android.util.Log.w(str, zzh(str2));
        }
    }

    public final void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(5)) {
            android.util.Log.w(str, zzh(str2), th);
        }
    }

    public final void wfmt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (canLog(5)) {
            android.util.Log.w(this.zzeh, zza(str2, objArr));
        }
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        if (canLog(6)) {
            android.util.Log.e(str, zzh(str2));
        }
    }

    public final void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(6)) {
            android.util.Log.e(str, zzh(str2), th);
        }
    }

    public final void efmt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (canLog(6)) {
            android.util.Log.e(str, zza(str2, objArr));
        }
    }

    public final void wtf(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(7)) {
            android.util.Log.e(str, zzh(str2), th);
            android.util.Log.wtf(str, zzh(str2), th);
        }
    }

    public final void pii(java.lang.String str, java.lang.String str2) {
        if (canLogPii()) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            android.util.Log.i(" PII_LOG".length() != 0 ? strValueOf.concat(" PII_LOG") : new java.lang.String(strValueOf), zzh(str2));
        }
    }

    public final void pii(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLogPii()) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            android.util.Log.i(" PII_LOG".length() != 0 ? strValueOf.concat(" PII_LOG") : new java.lang.String(strValueOf), zzh(str2), th);
        }
    }

    private final java.lang.String zzh(java.lang.String str) {
        java.lang.String str2 = this.zzei;
        return str2 == null ? str : str2.concat(str);
    }

    private final java.lang.String zza(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = java.lang.String.format(str, objArr);
        java.lang.String str3 = this.zzei;
        return str3 == null ? str2 : str3.concat(str2);
    }
}
