package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzff implements java.io.Serializable, java.lang.Iterable<java.lang.Byte> {
    public static final com.google.android.gms.internal.fitness.zzff zzri = new com.google.android.gms.internal.fitness.zzfp(com.google.android.gms.internal.fitness.zzgk.zzvz);
    private static final com.google.android.gms.internal.fitness.zzfl zzrj;
    private static final java.util.Comparator<com.google.android.gms.internal.fitness.zzff> zzrl;
    private int zzrk = 0;

    zzff() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zza(byte b) {
        return b & kotlin.UByte.MAX_VALUE;
    }

    public abstract boolean equals(java.lang.Object obj);

    public abstract int size();

    protected abstract int zza(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.fitness.zzff zza(int i, int i2);

    protected abstract java.lang.String zza(java.nio.charset.Charset charset);

    abstract void zza(com.google.android.gms.internal.fitness.zzfc zzfcVar) throws java.io.IOException;

    public abstract boolean zzaq();

    public abstract byte zzh(int i);

    abstract byte zzi(int i);

    public static com.google.android.gms.internal.fitness.zzff zzl(java.lang.String str) {
        return new com.google.android.gms.internal.fitness.zzfp(str.getBytes(com.google.android.gms.internal.fitness.zzgk.UTF_8));
    }

    public final java.lang.String zzap() {
        return size() == 0 ? "" : zza(com.google.android.gms.internal.fitness.zzgk.UTF_8);
    }

    public final int hashCode() {
        int iZza = this.zzrk;
        if (iZza == 0) {
            int size = size();
            iZza = zza(size, 0, size);
            if (iZza == 0) {
                iZza = 1;
            }
            this.zzrk = iZza;
        }
        return iZza;
    }

    static com.google.android.gms.internal.fitness.zzfn zzj(int i) {
        return new com.google.android.gms.internal.fitness.zzfn(i, null);
    }

    protected final int zzar() {
        return this.zzrk;
    }

    static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new java.lang.IndexOutOfBoundsException(sb3.toString());
    }

    public final java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return new com.google.android.gms.internal.fitness.zzfe(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        com.google.android.gms.internal.fitness.zzfe zzfeVar = null;
        zzrj = com.google.android.gms.internal.fitness.zzfd.zzan() ? new com.google.android.gms.internal.fitness.zzfo(zzfeVar) : new com.google.android.gms.internal.fitness.zzfj(zzfeVar);
        zzrl = new com.google.android.gms.internal.fitness.zzfh();
    }
}
