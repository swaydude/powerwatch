package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzdu implements java.io.Serializable, java.lang.Iterable<java.lang.Byte> {
    public static final com.google.android.gms.internal.measurement.zzdu zza = new com.google.android.gms.internal.measurement.zzee(com.google.android.gms.internal.measurement.zzff.zzb);
    private static final com.google.android.gms.internal.measurement.zzea zzb;
    private static final java.util.Comparator<com.google.android.gms.internal.measurement.zzdu> zzd;
    private int zzc = 0;

    zzdu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & kotlin.UByte.MAX_VALUE;
    }

    public abstract boolean equals(java.lang.Object obj);

    public abstract byte zza(int i);

    public abstract int zza();

    protected abstract int zza(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.measurement.zzdu zza(int i, int i2);

    protected abstract java.lang.String zza(java.nio.charset.Charset charset);

    abstract void zza(com.google.android.gms.internal.measurement.zzdv zzdvVar) throws java.io.IOException;

    abstract byte zzb(int i);

    public abstract boolean zzc();

    public static com.google.android.gms.internal.measurement.zzdu zza(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new com.google.android.gms.internal.measurement.zzee(zzb.zza(bArr, i, i2));
    }

    static com.google.android.gms.internal.measurement.zzdu zza(byte[] bArr) {
        return new com.google.android.gms.internal.measurement.zzee(bArr);
    }

    public static com.google.android.gms.internal.measurement.zzdu zza(java.lang.String str) {
        return new com.google.android.gms.internal.measurement.zzee(str.getBytes(com.google.android.gms.internal.measurement.zzff.zza));
    }

    public final java.lang.String zzb() {
        return zza() == 0 ? "" : zza(com.google.android.gms.internal.measurement.zzff.zza);
    }

    public final int hashCode() {
        int iZza = this.zzc;
        if (iZza == 0) {
            int iZza2 = zza();
            iZza = zza(iZza2, 0, iZza2);
            if (iZza == 0) {
                iZza = 1;
            }
            this.zzc = iZza;
        }
        return iZza;
    }

    static com.google.android.gms.internal.measurement.zzec zzc(int i) {
        return new com.google.android.gms.internal.measurement.zzec(i, null);
    }

    protected final int zzd() {
        return this.zzc;
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
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(zza());
        objArr[2] = zza() <= 50 ? com.google.android.gms.internal.measurement.zzhr.zza(this) : java.lang.String.valueOf(com.google.android.gms.internal.measurement.zzhr.zza(zza(0, 47))).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return new com.google.android.gms.internal.measurement.zzdx(this);
    }

    static {
        com.google.android.gms.internal.measurement.zzdx zzdxVar = null;
        zzb = com.google.android.gms.internal.measurement.zzdr.zza() ? new com.google.android.gms.internal.measurement.zzeh(zzdxVar) : new com.google.android.gms.internal.measurement.zzdy(zzdxVar);
        zzd = new com.google.android.gms.internal.measurement.zzdw();
    }
}
