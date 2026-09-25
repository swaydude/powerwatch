package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbk {
    final java.lang.String zzgk;
    final android.net.Uri zzgl;
    final java.lang.String zzgm;
    final java.lang.String zzgn;
    final boolean zzgo;
    final boolean zzgp;
    final boolean zzgq;
    final boolean zzgr;

    @javax.annotation.Nullable
    final com.google.android.gms.internal.vision.zzcl<android.content.Context, java.lang.Boolean> zzgs;

    public zzbk(android.net.Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzbk(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, @javax.annotation.Nullable com.google.android.gms.internal.vision.zzcl<android.content.Context, java.lang.Boolean> zzclVar) {
        this.zzgk = str;
        this.zzgl = uri;
        this.zzgm = str2;
        this.zzgn = str3;
        this.zzgo = z;
        this.zzgp = z2;
        this.zzgq = z3;
        this.zzgr = z4;
        this.zzgs = zzclVar;
    }

    public final com.google.android.gms.internal.vision.zzbk zzf(java.lang.String str) {
        boolean z = this.zzgo;
        if (z) {
            throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new com.google.android.gms.internal.vision.zzbk(this.zzgk, this.zzgl, str, this.zzgn, z, this.zzgp, this.zzgq, this.zzgr, this.zzgs);
    }

    public final com.google.android.gms.internal.vision.zzbe<java.lang.Boolean> zza(java.lang.String str, boolean z) {
        return com.google.android.gms.internal.vision.zzbe.zza(this, str, z);
    }

    public final <T> com.google.android.gms.internal.vision.zzbe<T> zza(java.lang.String str, T t, com.google.android.gms.internal.vision.zzbh<T> zzbhVar) {
        return com.google.android.gms.internal.vision.zzbe.zza(this, str, t, zzbhVar);
    }
}
