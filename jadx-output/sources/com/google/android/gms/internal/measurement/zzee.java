package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
class zzee extends com.google.android.gms.internal.measurement.zzef {
    protected final byte[] zzb;

    zzee(byte[] bArr) {
        java.util.Objects.requireNonNull(bArr);
        this.zzb = bArr;
    }

    protected int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final com.google.android.gms.internal.measurement.zzdu zza(int i, int i2) {
        int iZzb = zzb(0, i2, zza());
        if (iZzb == 0) {
            return com.google.android.gms.internal.measurement.zzdu.zza;
        }
        return new com.google.android.gms.internal.measurement.zzeb(this.zzb, zze(), iZzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    final void zza(com.google.android.gms.internal.measurement.zzdv zzdvVar) throws java.io.IOException {
        zzdvVar.zza(this.zzb, zze(), zza());
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    protected final java.lang.String zza(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zzb, zze(), zza(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final boolean zzc() {
        int iZze = zze();
        return com.google.android.gms.internal.measurement.zzie.zza(this.zzb, iZze, zza() + iZze);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzdu) || zza() != ((com.google.android.gms.internal.measurement.zzdu) obj).zza()) {
            return false;
        }
        if (zza() == 0) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzee) {
            com.google.android.gms.internal.measurement.zzee zzeeVar = (com.google.android.gms.internal.measurement.zzee) obj;
            int iZzd = zzd();
            int iZzd2 = zzeeVar.zzd();
            if (iZzd == 0 || iZzd2 == 0 || iZzd == iZzd2) {
                return zza(zzeeVar, 0, zza());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzef
    final boolean zza(com.google.android.gms.internal.measurement.zzdu zzduVar, int i, int i2) {
        if (i2 > zzduVar.zza()) {
            int iZza = zza();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(iZza);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 > zzduVar.zza()) {
            int iZza2 = zzduVar.zza();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(iZza2);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (zzduVar instanceof com.google.android.gms.internal.measurement.zzee) {
            com.google.android.gms.internal.measurement.zzee zzeeVar = (com.google.android.gms.internal.measurement.zzee) zzduVar;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzeeVar.zzb;
            int iZze = zze() + i2;
            int iZze2 = zze();
            int iZze3 = zzeeVar.zze();
            while (iZze2 < iZze) {
                if (bArr[iZze2] != bArr2[iZze3]) {
                    return false;
                }
                iZze2++;
                iZze3++;
            }
            return true;
        }
        return zzduVar.zza(0, i2).equals(zza(0, i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    protected final int zza(int i, int i2, int i3) {
        return com.google.android.gms.internal.measurement.zzff.zza(i, this.zzb, zze(), i3);
    }
}
