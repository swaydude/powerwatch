package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzeg {
    int zza;
    int zzb;
    com.google.android.gms.internal.measurement.zzel zzc;
    private int zzd;
    private boolean zze;

    public static long zza(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static com.google.android.gms.internal.measurement.zzeg zza(byte[] bArr, int i, int i2, boolean z) {
        com.google.android.gms.internal.measurement.zzei zzeiVar = new com.google.android.gms.internal.measurement.zzei(bArr, 0, i2, false);
        try {
            zzeiVar.zzc(i2);
            return zzeiVar;
        } catch (com.google.android.gms.internal.measurement.zzfo e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static int zze(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int zza() throws java.io.IOException;

    public abstract void zza(int i) throws com.google.android.gms.internal.measurement.zzfo;

    public abstract double zzb() throws java.io.IOException;

    public abstract boolean zzb(int i) throws java.io.IOException;

    public abstract float zzc() throws java.io.IOException;

    public abstract int zzc(int i) throws com.google.android.gms.internal.measurement.zzfo;

    public abstract long zzd() throws java.io.IOException;

    public abstract void zzd(int i);

    public abstract long zze() throws java.io.IOException;

    public abstract int zzf() throws java.io.IOException;

    public abstract long zzg() throws java.io.IOException;

    public abstract int zzh() throws java.io.IOException;

    public abstract boolean zzi() throws java.io.IOException;

    public abstract java.lang.String zzj() throws java.io.IOException;

    public abstract java.lang.String zzk() throws java.io.IOException;

    public abstract com.google.android.gms.internal.measurement.zzdu zzl() throws java.io.IOException;

    public abstract int zzm() throws java.io.IOException;

    public abstract int zzn() throws java.io.IOException;

    public abstract int zzo() throws java.io.IOException;

    public abstract long zzp() throws java.io.IOException;

    public abstract int zzq() throws java.io.IOException;

    public abstract long zzr() throws java.io.IOException;

    abstract long zzs() throws java.io.IOException;

    public abstract boolean zzt() throws java.io.IOException;

    public abstract int zzu();

    private zzeg() {
        this.zzb = 100;
        this.zzd = Integer.MAX_VALUE;
        this.zze = false;
    }
}
