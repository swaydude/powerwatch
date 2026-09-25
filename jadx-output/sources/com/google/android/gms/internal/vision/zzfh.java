package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfh implements java.io.Serializable, java.lang.Iterable<java.lang.Byte> {
    public static final com.google.android.gms.internal.vision.zzfh zzrx = new com.google.android.gms.internal.vision.zzfr(com.google.android.gms.internal.vision.zzgt.zzxc);
    private static final com.google.android.gms.internal.vision.zzfn zzry;
    private static final java.util.Comparator<com.google.android.gms.internal.vision.zzfh> zzrz;
    private int zzmi = 0;

    zzfh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zza(byte b) {
        return b & kotlin.UByte.MAX_VALUE;
    }

    public abstract boolean equals(java.lang.Object obj);

    public abstract int size();

    protected abstract java.lang.String zza(java.nio.charset.Charset charset);

    abstract void zza(com.google.android.gms.internal.vision.zzfi zzfiVar) throws java.io.IOException;

    protected abstract void zza(byte[] bArr, int i, int i2, int i3);

    public abstract byte zzan(int i);

    abstract byte zzao(int i);

    protected abstract int zzb(int i, int i2, int i3);

    public abstract boolean zzes();

    public abstract com.google.android.gms.internal.vision.zzfh zzf(int i, int i2);

    public static com.google.android.gms.internal.vision.zzfh zza(byte[] bArr, int i, int i2) {
        zzc(i, i + i2, bArr.length);
        return new com.google.android.gms.internal.vision.zzfr(zzry.zzd(bArr, i, i2));
    }

    static com.google.android.gms.internal.vision.zzfh zzd(byte[] bArr) {
        return new com.google.android.gms.internal.vision.zzfr(bArr);
    }

    static com.google.android.gms.internal.vision.zzfh zzb(byte[] bArr, int i, int i2) {
        return new com.google.android.gms.internal.vision.zzfo(bArr, i, i2);
    }

    public static com.google.android.gms.internal.vision.zzfh zzw(java.lang.String str) {
        return new com.google.android.gms.internal.vision.zzfr(str.getBytes(com.google.android.gms.internal.vision.zzgt.UTF_8));
    }

    public final java.lang.String zzer() {
        return size() == 0 ? "" : zza(com.google.android.gms.internal.vision.zzgt.UTF_8);
    }

    public final int hashCode() {
        int iZzb = this.zzmi;
        if (iZzb == 0) {
            int size = size();
            iZzb = zzb(size, 0, size);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzmi = iZzb;
        }
        return iZzb;
    }

    static com.google.android.gms.internal.vision.zzfp zzap(int i) {
        return new com.google.android.gms.internal.vision.zzfp(i, null);
    }

    protected final int zzet() {
        return this.zzmi;
    }

    static int zzc(int i, int i2, int i3) {
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
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(size());
        objArr[2] = size() <= 50 ? com.google.android.gms.internal.vision.zzjf.zzd(this) : java.lang.String.valueOf(com.google.android.gms.internal.vision.zzjf.zzd(zzf(0, 47))).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return new com.google.android.gms.internal.vision.zzfk(this);
    }

    static {
        com.google.android.gms.internal.vision.zzfk zzfkVar = null;
        zzry = com.google.android.gms.internal.vision.zzfa.zzdr() ? new com.google.android.gms.internal.vision.zzfu(zzfkVar) : new com.google.android.gms.internal.vision.zzfl(zzfkVar);
        zzrz = new com.google.android.gms.internal.vision.zzfj();
    }
}
