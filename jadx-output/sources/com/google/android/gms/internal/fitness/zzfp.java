package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
class zzfp extends com.google.android.gms.internal.fitness.zzfm {
    protected final byte[] zzrp;

    zzfp(byte[] bArr) {
        java.util.Objects.requireNonNull(bArr);
        this.zzrp = bArr;
    }

    protected int zzas() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fitness.zzff
    public byte zzh(int i) {
        return this.zzrp[i];
    }

    @Override // com.google.android.gms.internal.fitness.zzff
    byte zzi(int i) {
        return this.zzrp[i];
    }

    @Override // com.google.android.gms.internal.fitness.zzff
    public int size() {
        return this.zzrp.length;
    }

    @Override // com.google.android.gms.internal.fitness.zzff
    public final com.google.android.gms.internal.fitness.zzff zza(int i, int i2) {
        int iZzb = zzb(0, i2, size());
        if (iZzb == 0) {
            return com.google.android.gms.internal.fitness.zzff.zzri;
        }
        return new com.google.android.gms.internal.fitness.zzfi(this.zzrp, zzas(), iZzb);
    }

    @Override // com.google.android.gms.internal.fitness.zzff
    final void zza(com.google.android.gms.internal.fitness.zzfc zzfcVar) throws java.io.IOException {
        zzfcVar.zza(this.zzrp, zzas(), size());
    }

    @Override // com.google.android.gms.internal.fitness.zzff
    protected final java.lang.String zza(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zzrp, zzas(), size(), charset);
    }

    @Override // com.google.android.gms.internal.fitness.zzff
    public final boolean zzaq() {
        int iZzas = zzas();
        return com.google.android.gms.internal.fitness.zzjc.zzc(this.zzrp, iZzas, size() + iZzas);
    }

    @Override // com.google.android.gms.internal.fitness.zzff
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.fitness.zzff) || size() != ((com.google.android.gms.internal.fitness.zzff) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.fitness.zzfp) {
            com.google.android.gms.internal.fitness.zzfp zzfpVar = (com.google.android.gms.internal.fitness.zzfp) obj;
            int iZzar = zzar();
            int iZzar2 = zzfpVar.zzar();
            if (iZzar == 0 || iZzar2 == 0 || iZzar == iZzar2) {
                return zza(zzfpVar, 0, size());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.fitness.zzfm
    final boolean zza(com.google.android.gms.internal.fitness.zzff zzffVar, int i, int i2) {
        if (i2 > zzffVar.size()) {
            int size = size();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 > zzffVar.size()) {
            int size2 = zzffVar.size();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (zzffVar instanceof com.google.android.gms.internal.fitness.zzfp) {
            com.google.android.gms.internal.fitness.zzfp zzfpVar = (com.google.android.gms.internal.fitness.zzfp) zzffVar;
            byte[] bArr = this.zzrp;
            byte[] bArr2 = zzfpVar.zzrp;
            int iZzas = zzas() + i2;
            int iZzas2 = zzas();
            int iZzas3 = zzfpVar.zzas();
            while (iZzas2 < iZzas) {
                if (bArr[iZzas2] != bArr2[iZzas3]) {
                    return false;
                }
                iZzas2++;
                iZzas3++;
            }
            return true;
        }
        return zzffVar.zza(0, i2).equals(zza(0, i2));
    }

    @Override // com.google.android.gms.internal.fitness.zzff
    protected final int zza(int i, int i2, int i3) {
        return com.google.android.gms.internal.fitness.zzgk.zza(i, this.zzrp, zzas(), i3);
    }
}
