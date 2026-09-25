package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbb implements java.io.Serializable, java.lang.Iterable<java.lang.Byte> {
    public static final com.google.android.gms.internal.clearcut.zzbb zzfi = new com.google.android.gms.internal.clearcut.zzbi(com.google.android.gms.internal.clearcut.zzci.zzkt);
    private static final com.google.android.gms.internal.clearcut.zzbf zzfj;
    private int zzfk = 0;

    static {
        com.google.android.gms.internal.clearcut.zzbc zzbcVar = null;
        zzfj = com.google.android.gms.internal.clearcut.zzaw.zzx() ? new com.google.android.gms.internal.clearcut.zzbj(zzbcVar) : new com.google.android.gms.internal.clearcut.zzbd(zzbcVar);
    }

    zzbb() {
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

    public static com.google.android.gms.internal.clearcut.zzbb zzb(byte[] bArr, int i, int i2) {
        return new com.google.android.gms.internal.clearcut.zzbi(zzfj.zzc(bArr, i, i2));
    }

    public static com.google.android.gms.internal.clearcut.zzbb zzf(java.lang.String str) {
        return new com.google.android.gms.internal.clearcut.zzbi(str.getBytes(com.google.android.gms.internal.clearcut.zzci.UTF_8));
    }

    static com.google.android.gms.internal.clearcut.zzbg zzk(int i) {
        return new com.google.android.gms.internal.clearcut.zzbg(i, null);
    }

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int iZza = this.zzfk;
        if (iZza == 0) {
            int size = size();
            iZza = zza(size, 0, size);
            if (iZza == 0) {
                iZza = 1;
            }
            this.zzfk = iZza;
        }
        return iZza;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return new com.google.android.gms.internal.clearcut.zzbc(this);
    }

    public abstract int size();

    public final java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }

    protected abstract int zza(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.clearcut.zzbb zza(int i, int i2);

    protected abstract java.lang.String zza(java.nio.charset.Charset charset);

    abstract void zza(com.google.android.gms.internal.clearcut.zzba zzbaVar) throws java.io.IOException;

    public abstract boolean zzaa();

    protected final int zzab() {
        return this.zzfk;
    }

    public abstract byte zzj(int i);

    public final java.lang.String zzz() {
        return size() == 0 ? "" : zza(com.google.android.gms.internal.clearcut.zzci.UTF_8);
    }
}
