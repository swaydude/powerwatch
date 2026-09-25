package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzft {
    int zzsf;
    int zzsg;
    private int zzsh;
    com.google.android.gms.internal.vision.zzfy zzsi;
    private boolean zzsj;

    static com.google.android.gms.internal.vision.zzft zza(byte[] bArr, int i, int i2, boolean z) {
        com.google.android.gms.internal.vision.zzfv zzfvVar = new com.google.android.gms.internal.vision.zzfv(bArr, 0, i2, false);
        try {
            zzfvVar.zzas(i2);
            return zzfvVar;
        } catch (com.google.android.gms.internal.vision.zzhc e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static int zzau(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zzr(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract double readDouble() throws java.io.IOException;

    public abstract float readFloat() throws java.io.IOException;

    public abstract java.lang.String readString() throws java.io.IOException;

    public abstract void zzaq(int i) throws com.google.android.gms.internal.vision.zzhc;

    public abstract boolean zzar(int i) throws java.io.IOException;

    public abstract int zzas(int i) throws com.google.android.gms.internal.vision.zzhc;

    public abstract void zzat(int i);

    public abstract boolean zzdt() throws java.io.IOException;

    public abstract long zzdw() throws java.io.IOException;

    public abstract long zzdx() throws java.io.IOException;

    public abstract int zzdy() throws java.io.IOException;

    public abstract long zzdz() throws java.io.IOException;

    public abstract int zzea() throws java.io.IOException;

    public abstract boolean zzeb() throws java.io.IOException;

    public abstract java.lang.String zzec() throws java.io.IOException;

    public abstract com.google.android.gms.internal.vision.zzfh zzed() throws java.io.IOException;

    public abstract int zzee() throws java.io.IOException;

    public abstract int zzef() throws java.io.IOException;

    public abstract int zzeg() throws java.io.IOException;

    public abstract long zzeh() throws java.io.IOException;

    public abstract int zzei() throws java.io.IOException;

    public abstract long zzej() throws java.io.IOException;

    public abstract int zzex() throws java.io.IOException;

    abstract long zzey() throws java.io.IOException;

    public abstract int zzez();

    private zzft() {
        this.zzsg = 100;
        this.zzsh = Integer.MAX_VALUE;
        this.zzsj = false;
    }
}
