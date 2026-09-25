package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfr {
    private int zzrq;
    private int zzrr;
    private boolean zzrs;

    static com.google.android.gms.internal.fitness.zzfr zza(byte[] bArr, int i, int i2, boolean z) {
        com.google.android.gms.internal.fitness.zzft zzftVar = new com.google.android.gms.internal.fitness.zzft(bArr, 0, i2, false);
        try {
            zzftVar.zzk(i2);
            return zzftVar;
        } catch (com.google.android.gms.internal.fitness.zzgo e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public abstract int zzav();

    public abstract int zzk(int i) throws com.google.android.gms.internal.fitness.zzgo;

    private zzfr() {
        this.zzrq = 100;
        this.zzrr = Integer.MAX_VALUE;
        this.zzrs = false;
    }
}
