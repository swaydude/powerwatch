package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzbg {
    private final byte[] buffer;
    private final com.google.android.gms.internal.clearcut.zzbn zzfo;

    private zzbg(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzfo = com.google.android.gms.internal.clearcut.zzbn.zzc(bArr);
    }

    /* synthetic */ zzbg(int i, com.google.android.gms.internal.clearcut.zzbc zzbcVar) {
        this(i);
    }

    public final com.google.android.gms.internal.clearcut.zzbb zzad() {
        if (this.zzfo.zzag() == 0) {
            return new com.google.android.gms.internal.clearcut.zzbi(this.buffer);
        }
        throw new java.lang.IllegalStateException("Did not write as much data as expected.");
    }

    public final com.google.android.gms.internal.clearcut.zzbn zzae() {
        return this.zzfo;
    }
}
