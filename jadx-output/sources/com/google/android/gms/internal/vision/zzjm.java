package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjm {
    private static final com.google.android.gms.internal.vision.zzjm zzaaj = new com.google.android.gms.internal.vision.zzjm(0, new int[0], new java.lang.Object[0], false);
    private int count;
    private int[] zzaak;
    private boolean zzrj;
    private int zzwe;
    private java.lang.Object[] zzyv;

    public static com.google.android.gms.internal.vision.zzjm zzig() {
        return zzaaj;
    }

    static com.google.android.gms.internal.vision.zzjm zzih() {
        return new com.google.android.gms.internal.vision.zzjm();
    }

    static com.google.android.gms.internal.vision.zzjm zza(com.google.android.gms.internal.vision.zzjm zzjmVar, com.google.android.gms.internal.vision.zzjm zzjmVar2) {
        int i = zzjmVar.count + zzjmVar2.count;
        int[] iArrCopyOf = java.util.Arrays.copyOf(zzjmVar.zzaak, i);
        java.lang.System.arraycopy(zzjmVar2.zzaak, 0, iArrCopyOf, zzjmVar.count, zzjmVar2.count);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(zzjmVar.zzyv, i);
        java.lang.System.arraycopy(zzjmVar2.zzyv, 0, objArrCopyOf, zzjmVar.count, zzjmVar2.count);
        return new com.google.android.gms.internal.vision.zzjm(i, iArrCopyOf, objArrCopyOf, true);
    }

    private zzjm() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzjm(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zzwe = -1;
        this.count = i;
        this.zzaak = iArr;
        this.zzyv = objArr;
        this.zzrj = z;
    }

    public final void zzdp() {
        this.zzrj = false;
    }

    final void zza(com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException {
        if (zzkgVar.zzfj() == com.google.android.gms.internal.vision.zzgs.zzf.zzwx) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzkgVar.zza(this.zzaak[i] >>> 3, this.zzyv[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzkgVar.zza(this.zzaak[i2] >>> 3, this.zzyv[i2]);
        }
    }

    public final void zzb(com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException {
        if (this.count == 0) {
            return;
        }
        if (zzkgVar.zzfj() == com.google.android.gms.internal.vision.zzgs.zzf.zzww) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzaak[i], this.zzyv[i], zzkgVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzaak[i2], this.zzyv[i2], zzkgVar);
        }
    }

    private static void zzb(int i, java.lang.Object obj, com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzkgVar.zzi(i2, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            zzkgVar.zzc(i2, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            zzkgVar.zza(i2, (com.google.android.gms.internal.vision.zzfh) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                zzkgVar.zzk(i2, ((java.lang.Integer) obj).intValue());
                return;
            }
            throw new java.lang.RuntimeException(com.google.android.gms.internal.vision.zzhc.zzgr());
        }
        if (zzkgVar.zzfj() == com.google.android.gms.internal.vision.zzgs.zzf.zzww) {
            zzkgVar.zzbj(i2);
            ((com.google.android.gms.internal.vision.zzjm) obj).zzb(zzkgVar);
            zzkgVar.zzbk(i2);
        } else {
            zzkgVar.zzbk(i2);
            ((com.google.android.gms.internal.vision.zzjm) obj).zzb(zzkgVar);
            zzkgVar.zzbj(i2);
        }
    }

    public final int zzii() {
        int i = this.zzwe;
        if (i != -1) {
            return i;
        }
        int iZzd = 0;
        for (int i2 = 0; i2 < this.count; i2++) {
            iZzd += com.google.android.gms.internal.vision.zzga.zzd(this.zzaak[i2] >>> 3, (com.google.android.gms.internal.vision.zzfh) this.zzyv[i2]);
        }
        this.zzwe = iZzd;
        return iZzd;
    }

    public final int zzgf() {
        int iZze;
        int i = this.zzwe;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzaak[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iZze = com.google.android.gms.internal.vision.zzga.zze(i5, ((java.lang.Long) this.zzyv[i3]).longValue());
            } else if (i6 == 1) {
                iZze = com.google.android.gms.internal.vision.zzga.zzg(i5, ((java.lang.Long) this.zzyv[i3]).longValue());
            } else if (i6 == 2) {
                iZze = com.google.android.gms.internal.vision.zzga.zzc(i5, (com.google.android.gms.internal.vision.zzfh) this.zzyv[i3]);
            } else if (i6 == 3) {
                iZze = (com.google.android.gms.internal.vision.zzga.zzba(i5) << 1) + ((com.google.android.gms.internal.vision.zzjm) this.zzyv[i3]).zzgf();
            } else if (i6 == 5) {
                iZze = com.google.android.gms.internal.vision.zzga.zzo(i5, ((java.lang.Integer) this.zzyv[i3]).intValue());
            } else {
                throw new java.lang.IllegalStateException(com.google.android.gms.internal.vision.zzhc.zzgr());
            }
            i2 += iZze;
        }
        this.zzwe = i2;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[RETURN] */
    public final boolean equals(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.vision.zzjm)) {
            return false;
        }
        com.google.android.gms.internal.vision.zzjm zzjmVar = (com.google.android.gms.internal.vision.zzjm) obj;
        int i = this.count;
        if (i == zzjmVar.count) {
            int[] iArr = this.zzaak;
            int[] iArr2 = zzjmVar.zzaak;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                java.lang.Object[] objArr = this.zzyv;
                java.lang.Object[] objArr2 = zzjmVar.zzyv;
                int i3 = this.count;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        if (!z2) {
                            return true;
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzaak;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        java.lang.Object[] objArr = this.zzyv;
        int i6 = this.count;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    final void zza(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            com.google.android.gms.internal.vision.zzid.zza(sb, i, java.lang.String.valueOf(this.zzaak[i2] >>> 3), this.zzyv[i2]);
        }
    }

    final void zzb(int i, java.lang.Object obj) {
        if (!this.zzrj) {
            throw new java.lang.UnsupportedOperationException();
        }
        int i2 = this.count;
        int[] iArr = this.zzaak;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.zzaak = java.util.Arrays.copyOf(iArr, i3);
            this.zzyv = java.util.Arrays.copyOf(this.zzyv, i3);
        }
        int[] iArr2 = this.zzaak;
        int i4 = this.count;
        iArr2[i4] = i;
        this.zzyv[i4] = obj;
        this.count = i4 + 1;
    }
}
