package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfi extends com.google.android.gms.internal.fitness.zzfp {
    private final int zzrm;
    private final int zzrn;

    zzfi(byte[] bArr, int i, int i2) {
        super(bArr);
        zzb(i, i + i2, bArr.length);
        this.zzrm = i;
        this.zzrn = i2;
    }

    @Override // com.google.android.gms.internal.fitness.zzfp, com.google.android.gms.internal.fitness.zzff
    public final byte zzh(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzrp[this.zzrm + i];
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

    @Override // com.google.android.gms.internal.fitness.zzfp, com.google.android.gms.internal.fitness.zzff
    final byte zzi(int i) {
        return this.zzrp[this.zzrm + i];
    }

    @Override // com.google.android.gms.internal.fitness.zzfp, com.google.android.gms.internal.fitness.zzff
    public final int size() {
        return this.zzrn;
    }

    @Override // com.google.android.gms.internal.fitness.zzfp
    protected final int zzas() {
        return this.zzrm;
    }
}
