package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
@javax.annotation.CheckReturnValue
class zzm {
    private static final com.google.android.gms.common.zzm zzac = new com.google.android.gms.common.zzm(true, null, null);
    private final java.lang.Throwable cause;
    final boolean zzad;
    private final java.lang.String zzae;

    zzm(boolean z, @javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        this.zzad = z;
        this.zzae = str;
        this.cause = th;
    }

    static com.google.android.gms.common.zzm zze() {
        return zzac;
    }

    static com.google.android.gms.common.zzm zza(java.util.concurrent.Callable<java.lang.String> callable) {
        return new com.google.android.gms.common.zzo(callable);
    }

    static com.google.android.gms.common.zzm zzb(java.lang.String str) {
        return new com.google.android.gms.common.zzm(false, str, null);
    }

    static com.google.android.gms.common.zzm zza(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.gms.common.zzm(false, str, th);
    }

    @javax.annotation.Nullable
    java.lang.String getErrorMessage() {
        return this.zzae;
    }

    final void zzf() {
        if (this.zzad || !android.util.Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.cause != null) {
            android.util.Log.d("GoogleCertificatesRslt", getErrorMessage(), this.cause);
        } else {
            android.util.Log.d("GoogleCertificatesRslt", getErrorMessage());
        }
    }

    static java.lang.String zzc(java.lang.String str, com.google.android.gms.common.zze zzeVar, boolean z, boolean z2) {
        return java.lang.String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", z2 ? "debug cert rejected" : "not whitelisted", str, com.google.android.gms.common.util.Hex.bytesToStringLowercase(com.google.android.gms.common.util.AndroidUtilsLight.zzj(io.fabric.sdk.android.services.common.CommonUtils.SHA1_INSTANCE).digest(zzeVar.getBytes())), java.lang.Boolean.valueOf(z), "12451009.false");
    }
}
