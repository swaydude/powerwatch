package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public class zzco extends java.io.IOException {
    private com.google.android.gms.internal.clearcut.zzdo zzkw;

    public zzco(java.lang.String str) {
        super(str);
        this.zzkw = null;
    }

    static com.google.android.gms.internal.clearcut.zzco zzbl() {
        return new com.google.android.gms.internal.clearcut.zzco("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static com.google.android.gms.internal.clearcut.zzco zzbm() {
        return new com.google.android.gms.internal.clearcut.zzco("Protocol message contained an invalid tag (zero).");
    }

    static com.google.android.gms.internal.clearcut.zzcp zzbn() {
        return new com.google.android.gms.internal.clearcut.zzcp("Protocol message tag had invalid wire type.");
    }

    static com.google.android.gms.internal.clearcut.zzco zzbo() {
        return new com.google.android.gms.internal.clearcut.zzco("Failed to parse the message.");
    }

    static com.google.android.gms.internal.clearcut.zzco zzbp() {
        return new com.google.android.gms.internal.clearcut.zzco("Protocol message had invalid UTF-8.");
    }

    public final com.google.android.gms.internal.clearcut.zzco zzg(com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        this.zzkw = zzdoVar;
        return this;
    }
}
