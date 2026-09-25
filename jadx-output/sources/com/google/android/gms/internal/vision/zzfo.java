package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfo extends com.google.android.gms.internal.vision.zzfr {
    private final int zzsb;
    private final int zzsc;

    zzfo(byte[] bArr, int i, int i2) {
        super(bArr);
        zzc(i, i + i2, bArr.length);
        this.zzsb = i;
        this.zzsc = i2;
    }

    @Override // com.google.android.gms.internal.vision.zzfr, com.google.android.gms.internal.vision.zzfh
    public final byte zzan(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzse[this.zzsb + i];
        }
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.vision.zzfr, com.google.android.gms.internal.vision.zzfh
    final byte zzao(int i) {
        return this.zzse[this.zzsb + i];
    }

    @Override // com.google.android.gms.internal.vision.zzfr, com.google.android.gms.internal.vision.zzfh
    public final int size() {
        return this.zzsc;
    }

    @Override // com.google.android.gms.internal.vision.zzfr
    protected final int zzeu() {
        return this.zzsb;
    }

    @Override // com.google.android.gms.internal.vision.zzfr, com.google.android.gms.internal.vision.zzfh
    protected final void zza(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.zzse, zzeu(), bArr, 0, i3);
    }
}
