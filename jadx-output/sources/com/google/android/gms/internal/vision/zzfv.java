package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfv extends com.google.android.gms.internal.vision.zzft {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzsk;
    private int zzsl;
    private int zzsm;
    private int zzsn;
    private int zzso;

    private zzfv(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzso = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzsm = i;
        this.zzsk = z;
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final int zzex() throws java.io.IOException {
        if (zzdt()) {
            this.zzsn = 0;
            return 0;
        }
        int iZzfa = zzfa();
        this.zzsn = iZzfa;
        if ((iZzfa >>> 3) != 0) {
            return iZzfa;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgp();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final void zzaq(int i) throws com.google.android.gms.internal.vision.zzhc {
        if (this.zzsn != i) {
            throw com.google.android.gms.internal.vision.zzhc.zzgq();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final boolean zzar(int i) throws java.io.IOException {
        int iZzex;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.limit - this.pos >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw com.google.android.gms.internal.vision.zzhc.zzgo();
            }
            while (i3 < 10) {
                if (zzff() < 0) {
                    i3++;
                }
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgo();
            return true;
        }
        if (i2 == 1) {
            zzav(8);
            return true;
        }
        if (i2 == 2) {
            zzav(zzfa());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                zzav(4);
                return true;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgr();
        }
        do {
            iZzex = zzex();
            if (iZzex == 0) {
                break;
            }
        } while (zzar(iZzex));
        zzaq(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final double readDouble() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(zzfd());
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final float readFloat() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(zzfc());
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final long zzdw() throws java.io.IOException {
        return zzfb();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final long zzdx() throws java.io.IOException {
        return zzfb();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final int zzdy() throws java.io.IOException {
        return zzfa();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final long zzdz() throws java.io.IOException {
        return zzfd();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final int zzea() throws java.io.IOException {
        return zzfc();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final boolean zzeb() throws java.io.IOException {
        return zzfb() != 0;
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final java.lang.String readString() throws java.io.IOException {
        int iZzfa = zzfa();
        if (iZzfa > 0 && iZzfa <= this.limit - this.pos) {
            java.lang.String str = new java.lang.String(this.buffer, this.pos, iZzfa, com.google.android.gms.internal.vision.zzgt.UTF_8);
            this.pos += iZzfa;
            return str;
        }
        if (iZzfa == 0) {
            return "";
        }
        if (iZzfa < 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgn();
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final java.lang.String zzec() throws java.io.IOException {
        int iZzfa = zzfa();
        if (iZzfa > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (iZzfa <= i - i2) {
                java.lang.String strZzh = com.google.android.gms.internal.vision.zzjs.zzh(this.buffer, i2, iZzfa);
                this.pos += iZzfa;
                return strZzh;
            }
        }
        if (iZzfa == 0) {
            return "";
        }
        if (iZzfa <= 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgn();
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    @Override // com.google.android.gms.internal.vision.zzft
    public final com.google.android.gms.internal.vision.zzfh zzed() throws java.io.IOException {
        byte[] bArrCopyOfRange;
        int iZzfa = zzfa();
        if (iZzfa > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (iZzfa <= i - i2) {
                com.google.android.gms.internal.vision.zzfh zzfhVarZza = com.google.android.gms.internal.vision.zzfh.zza(this.buffer, i2, iZzfa);
                this.pos += iZzfa;
                return zzfhVarZza;
            }
        }
        if (iZzfa == 0) {
            return com.google.android.gms.internal.vision.zzfh.zzrx;
        }
        if (iZzfa > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (iZzfa <= i3 - i4) {
                int i5 = iZzfa + i4;
                this.pos = i5;
                bArrCopyOfRange = java.util.Arrays.copyOfRange(this.buffer, i4, i5);
            } else {
                if (iZzfa <= 0) {
                    throw com.google.android.gms.internal.vision.zzhc.zzgm();
                }
                if (iZzfa == 0) {
                    bArrCopyOfRange = com.google.android.gms.internal.vision.zzgt.zzxc;
                } else {
                    throw com.google.android.gms.internal.vision.zzhc.zzgn();
                }
            }
        } else {
            if (iZzfa <= 0) {
                throw com.google.android.gms.internal.vision.zzhc.zzgm();
            }
            if (iZzfa == 0) {
                bArrCopyOfRange = com.google.android.gms.internal.vision.zzgt.zzxc;
            } else {
                throw com.google.android.gms.internal.vision.zzhc.zzgn();
            }
        }
        return com.google.android.gms.internal.vision.zzfh.zzd(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final int zzee() throws java.io.IOException {
        return zzfa();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final int zzef() throws java.io.IOException {
        return zzfa();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final int zzeg() throws java.io.IOException {
        return zzfc();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final long zzeh() throws java.io.IOException {
        return zzfd();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final int zzei() throws java.io.IOException {
        return zzau(zzfa());
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final long zzej() throws java.io.IOException {
        return zzr(zzfb());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzfa() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.limit
            if (r1 == r0) goto L6b
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.pos = r3
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
            r5.pos = r1
            return r0
        L6b:
            long r0 = r5.zzey()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfv.zzfa():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzfb() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.pos
            int r1 = r11.limit
            if (r1 == r0) goto Lb8
            byte[] r2 = r11.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r11.pos = r3
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
            r11.pos = r1
            return r2
        Lb8:
            long r0 = r11.zzey()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfv.zzfb():long");
    }

    @Override // com.google.android.gms.internal.vision.zzft
    final long zzey() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZzff = zzff();
            j |= ((long) (bZzff & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE)) << i;
            if ((bZzff & kotlin.jvm.internal.ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgo();
    }

    private final int zzfc() throws java.io.IOException {
        int i = this.pos;
        if (this.limit - i < 4) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & kotlin.UByte.MAX_VALUE) << 24) | (bArr[i] & kotlin.UByte.MAX_VALUE) | ((bArr[i + 1] & kotlin.UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & kotlin.UByte.MAX_VALUE) << 16);
    }

    private final long zzfd() throws java.io.IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final int zzas(int i) throws com.google.android.gms.internal.vision.zzhc {
        if (i < 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgn();
        }
        int iZzez = i + zzez();
        int i2 = this.zzso;
        if (iZzez > i2) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
        this.zzso = iZzez;
        zzfe();
        return i2;
    }

    private final void zzfe() {
        int i = this.limit + this.zzsl;
        this.limit = i;
        int i2 = i - this.zzsm;
        int i3 = this.zzso;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzsl = i4;
            this.limit = i - i4;
            return;
        }
        this.zzsl = 0;
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final void zzat(int i) {
        this.zzso = i;
        zzfe();
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final boolean zzdt() throws java.io.IOException {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.vision.zzft
    public final int zzez() {
        return this.pos - this.zzsm;
    }

    private final byte zzff() throws java.io.IOException {
        int i = this.pos;
        if (i == this.limit) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 1;
        return bArr[i];
    }

    private final void zzav(int i) throws java.io.IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgn();
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }
}
