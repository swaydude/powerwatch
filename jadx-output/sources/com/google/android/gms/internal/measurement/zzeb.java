package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzeb extends com.google.android.gms.internal.measurement.zzee {
    private final int zzc;
    private final int zzd;

    zzeb(byte[] bArr, int i, int i2) {
        super(bArr);
        zzb(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzee, com.google.android.gms.internal.measurement.zzdu
    public final byte zza(int i) {
        int iZza = zza();
        if (((iZza - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
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
        sb2.append(iZza);
        throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzee, com.google.android.gms.internal.measurement.zzdu
    final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.measurement.zzee, com.google.android.gms.internal.measurement.zzdu
    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzee
    protected final int zze() {
        return this.zzc;
    }
}
