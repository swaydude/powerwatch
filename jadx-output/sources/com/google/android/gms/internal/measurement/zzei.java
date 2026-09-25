package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzei extends com.google.android.gms.internal.measurement.zzeg {
    private final byte[] zzd;
    private final boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzei(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzk = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zzf = i2 + i;
        this.zzh = i;
        this.zzi = i;
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zza() throws java.io.IOException {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int iZzv = zzv();
        this.zzj = iZzv;
        if ((iZzv >>> 3) != 0) {
            return iZzv;
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final void zza(int i) throws com.google.android.gms.internal.measurement.zzfo {
        if (this.zzj != i) {
            throw com.google.android.gms.internal.measurement.zzfo.zze();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final boolean zzb(int i) throws java.io.IOException {
        int iZza;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzf - this.zzh >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.zzd;
                    int i4 = this.zzh;
                    this.zzh = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw com.google.android.gms.internal.measurement.zzfo.zzc();
            }
            while (i3 < 10) {
                if (zzaa() < 0) {
                    i3++;
                }
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzc();
            return true;
        }
        if (i2 == 1) {
            zzf(8);
            return true;
        }
        if (i2 == 2) {
            zzf(zzv());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                zzf(4);
                return true;
            }
            throw com.google.android.gms.internal.measurement.zzfo.zzf();
        }
        do {
            iZza = zza();
            if (iZza == 0) {
                break;
            }
        } while (zzb(iZza));
        zza(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final double zzb() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final float zzc() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final long zzd() throws java.io.IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final long zze() throws java.io.IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzf() throws java.io.IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final long zzg() throws java.io.IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzh() throws java.io.IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final boolean zzi() throws java.io.IOException {
        return zzw() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final java.lang.String zzj() throws java.io.IOException {
        int iZzv = zzv();
        if (iZzv > 0 && iZzv <= this.zzf - this.zzh) {
            java.lang.String str = new java.lang.String(this.zzd, this.zzh, iZzv, com.google.android.gms.internal.measurement.zzff.zza);
            this.zzh += iZzv;
            return str;
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv < 0) {
            throw com.google.android.gms.internal.measurement.zzfo.zzb();
        }
        throw com.google.android.gms.internal.measurement.zzfo.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final java.lang.String zzk() throws java.io.IOException {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (iZzv <= i - i2) {
                java.lang.String strZzb = com.google.android.gms.internal.measurement.zzie.zzb(this.zzd, i2, iZzv);
                this.zzh += iZzv;
                return strZzb;
            }
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv <= 0) {
            throw com.google.android.gms.internal.measurement.zzfo.zzb();
        }
        throw com.google.android.gms.internal.measurement.zzfo.zza();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    @Override // com.google.android.gms.internal.measurement.zzeg
    public final com.google.android.gms.internal.measurement.zzdu zzl() throws java.io.IOException {
        byte[] bArrCopyOfRange;
        int iZzv = zzv();
        if (iZzv > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (iZzv <= i - i2) {
                com.google.android.gms.internal.measurement.zzdu zzduVarZza = com.google.android.gms.internal.measurement.zzdu.zza(this.zzd, i2, iZzv);
                this.zzh += iZzv;
                return zzduVarZza;
            }
        }
        if (iZzv == 0) {
            return com.google.android.gms.internal.measurement.zzdu.zza;
        }
        if (iZzv > 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (iZzv <= i3 - i4) {
                int i5 = iZzv + i4;
                this.zzh = i5;
                bArrCopyOfRange = java.util.Arrays.copyOfRange(this.zzd, i4, i5);
            } else {
                if (iZzv <= 0) {
                    throw com.google.android.gms.internal.measurement.zzfo.zza();
                }
                if (iZzv == 0) {
                    bArrCopyOfRange = com.google.android.gms.internal.measurement.zzff.zzb;
                } else {
                    throw com.google.android.gms.internal.measurement.zzfo.zzb();
                }
            }
        } else {
            if (iZzv <= 0) {
                throw com.google.android.gms.internal.measurement.zzfo.zza();
            }
            if (iZzv == 0) {
                bArrCopyOfRange = com.google.android.gms.internal.measurement.zzff.zzb;
            } else {
                throw com.google.android.gms.internal.measurement.zzfo.zzb();
            }
        }
        return com.google.android.gms.internal.measurement.zzdu.zza(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzm() throws java.io.IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzn() throws java.io.IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzo() throws java.io.IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final long zzp() throws java.io.IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzq() throws java.io.IOException {
        return zze(zzv());
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final long zzr() throws java.io.IOException {
        return zza(zzw());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzv() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 == r0) goto L6b
            byte[] r2 = r5.zzd
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.zzh = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.zzh = r1
            return r0
        L6b:
            long r0 = r5.zzs()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzv():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzw() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.zzh
            int r1 = r11.zzf
            if (r1 == r0) goto Lb8
            byte[] r2 = r11.zzd
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r11.zzh = r3
            long r0 = (long) r0
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto Lb8
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L25
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
        L22:
            long r2 = (long) r0
            goto Lb5
        L25:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L36
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto Lb5
        L36:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L44
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L22
        L44:
            long r3 = (long) r0
            int r0 = r1 + 1
            r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L5b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L57:
            long r2 = r3 ^ r1
            r1 = r0
            goto Lb5
        L5b:
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L70
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L6d:
            long r2 = r3 ^ r5
            goto Lb5
        L70:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L83
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L57
        L83:
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L96
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L6d
        L96:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto Lb3
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto Lb8
            goto Lb4
        Lb3:
            r1 = r0
        Lb4:
            r2 = r3
        Lb5:
            r11.zzh = r1
            return r2
        Lb8:
            long r0 = r11.zzs()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzei.zzw():long");
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    final long zzs() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZzaa = zzaa();
            j |= ((long) (bZzaa & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE)) << i;
            if ((bZzaa & kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw com.google.android.gms.internal.measurement.zzfo.zzc();
    }

    private final int zzx() throws java.io.IOException {
        int i = this.zzh;
        if (this.zzf - i < 4) {
            throw com.google.android.gms.internal.measurement.zzfo.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 4;
        return ((bArr[i + 3] & kotlin.UByte.MAX_VALUE) << 24) | (bArr[i] & kotlin.UByte.MAX_VALUE) | ((bArr[i + 1] & kotlin.UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & kotlin.UByte.MAX_VALUE) << 16);
    }

    private final long zzy() throws java.io.IOException {
        int i = this.zzh;
        if (this.zzf - i < 8) {
            throw com.google.android.gms.internal.measurement.zzfo.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzc(int i) throws com.google.android.gms.internal.measurement.zzfo {
        if (i < 0) {
            throw com.google.android.gms.internal.measurement.zzfo.zzb();
        }
        int iZzu = i + zzu();
        int i2 = this.zzk;
        if (iZzu > i2) {
            throw com.google.android.gms.internal.measurement.zzfo.zza();
        }
        this.zzk = iZzu;
        zzz();
        return i2;
    }

    private final void zzz() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i2 = i - this.zzi;
        int i3 = this.zzk;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzg = i4;
            this.zzf = i - i4;
            return;
        }
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final void zzd(int i) {
        this.zzk = i;
        zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final boolean zzt() throws java.io.IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    public final int zzu() {
        return this.zzh - this.zzi;
    }

    private final byte zzaa() throws java.io.IOException {
        int i = this.zzh;
        if (i == this.zzf) {
            throw com.google.android.gms.internal.measurement.zzfo.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 1;
        return bArr[i];
    }

    private final void zzf(int i) throws java.io.IOException {
        if (i >= 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (i <= i2 - i3) {
                this.zzh = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw com.google.android.gms.internal.measurement.zzfo.zzb();
        }
        throw com.google.android.gms.internal.measurement.zzfo.zza();
    }
}
