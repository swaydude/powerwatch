package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzao {
    private final java.lang.String zzef;
    private final android.net.Uri zzeg;
    private final java.lang.String zzeh;
    private final java.lang.String zzei;
    private final boolean zzej;
    private final boolean zzek;

    public zzao(android.net.Uri uri) {
        this(null, uri, "", "", false, false);
    }

    private zzao(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        this.zzef = str;
        this.zzeg = uri;
        this.zzeh = str2;
        this.zzei = str3;
        this.zzej = z;
        this.zzek = z2;
    }

    public final <T> com.google.android.gms.internal.clearcut.zzae<T> zza(java.lang.String str, T t, com.google.android.gms.internal.clearcut.zzan<T> zzanVar) {
        return com.google.android.gms.internal.clearcut.zzae.zza(this, str, t, zzanVar);
    }

    public final com.google.android.gms.internal.clearcut.zzae<java.lang.String> zza(java.lang.String str, java.lang.String str2) {
        return com.google.android.gms.internal.clearcut.zzae.zza(this, str, (java.lang.String) null);
    }

    public final com.google.android.gms.internal.clearcut.zzae<java.lang.Boolean> zzc(java.lang.String str, boolean z) {
        return com.google.android.gms.internal.clearcut.zzae.zza(this, str, false);
    }

    public final com.google.android.gms.internal.clearcut.zzao zzc(java.lang.String str) {
        boolean z = this.zzej;
        if (z) {
            throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new com.google.android.gms.internal.clearcut.zzao(this.zzef, this.zzeg, str, this.zzei, z, this.zzek);
    }

    public final com.google.android.gms.internal.clearcut.zzao zzd(java.lang.String str) {
        return new com.google.android.gms.internal.clearcut.zzao(this.zzef, this.zzeg, this.zzeh, str, this.zzej, this.zzek);
    }
}
