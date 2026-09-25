package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfn {
    private final byte[] buffer;
    private final com.google.android.gms.internal.fitness.zzfs zzro;

    private zzfn(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzro = com.google.android.gms.internal.fitness.zzfs.zza(bArr);
    }

    public final com.google.android.gms.internal.fitness.zzff zzat() {
        if (this.zzro.zzaw() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
        return new com.google.android.gms.internal.fitness.zzfp(this.buffer);
    }

    public final com.google.android.gms.internal.fitness.zzfs zzau() {
        return this.zzro;
    }

    /* synthetic */ zzfn(int i, com.google.android.gms.internal.fitness.zzfe zzfeVar) {
        this(i);
    }
}
