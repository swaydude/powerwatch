package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzga extends com.google.android.gms.internal.vision.zzfi {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.vision.zzga.class.getName());
    private static final boolean zzsr = com.google.android.gms.internal.vision.zzjp.zzij();
    com.google.android.gms.internal.vision.zzgc zzss;

    private static long zzaa(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzb(double d) {
        return 8;
    }

    public static int zzbc(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzbe(int i) {
        return 4;
    }

    public static int zzbf(int i) {
        return 4;
    }

    private static int zzbh(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static com.google.android.gms.internal.vision.zzga zze(byte[] bArr) {
        return new com.google.android.gms.internal.vision.zzga.zzb(bArr, 0, bArr.length);
    }

    public static int zzl(boolean z) {
        return 1;
    }

    public static int zzt(float f) {
        return 4;
    }

    public static int zzw(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzy(long j) {
        return 8;
    }

    public static int zzz(long j) {
        return 8;
    }

    public abstract void zza(int i, long j) throws java.io.IOException;

    public abstract void zza(int i, com.google.android.gms.internal.vision.zzfh zzfhVar) throws java.io.IOException;

    public abstract void zza(int i, com.google.android.gms.internal.vision.zzic zzicVar) throws java.io.IOException;

    abstract void zza(int i, com.google.android.gms.internal.vision.zzic zzicVar, com.google.android.gms.internal.vision.zzir zzirVar) throws java.io.IOException;

    public abstract void zza(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zza(int i, boolean z) throws java.io.IOException;

    public abstract void zza(com.google.android.gms.internal.vision.zzfh zzfhVar) throws java.io.IOException;

    public abstract void zzaw(int i) throws java.io.IOException;

    public abstract void zzax(int i) throws java.io.IOException;

    public abstract void zzaz(int i) throws java.io.IOException;

    public abstract void zzb(int i, com.google.android.gms.internal.vision.zzfh zzfhVar) throws java.io.IOException;

    public abstract void zzb(com.google.android.gms.internal.vision.zzic zzicVar) throws java.io.IOException;

    public abstract void zzc(byte b) throws java.io.IOException;

    public abstract void zzc(int i, long j) throws java.io.IOException;

    abstract void zze(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract int zzfg();

    public abstract void zzg(int i, int i2) throws java.io.IOException;

    public abstract void zzh(int i, int i2) throws java.io.IOException;

    public abstract void zzi(int i, int i2) throws java.io.IOException;

    public abstract void zzk(int i, int i2) throws java.io.IOException;

    public abstract void zzs(long j) throws java.io.IOException;

    public abstract void zzu(long j) throws java.io.IOException;

    public abstract void zzx(java.lang.String str) throws java.io.IOException;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static class zza extends java.io.IOException {
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zza(java.lang.Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zza(java.lang.String str, java.lang.Throwable th) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new java.lang.String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }
    }

    private zzga() {
    }

    public final void zzj(int i, int i2) throws java.io.IOException {
        zzi(i, zzbh(i2));
    }

    public final void zzb(int i, long j) throws java.io.IOException {
        zza(i, zzaa(j));
    }

    public final void zza(int i, float f) throws java.io.IOException {
        zzk(i, java.lang.Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) throws java.io.IOException {
        zzc(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void zzay(int i) throws java.io.IOException {
        zzax(zzbh(i));
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    static class zzb extends com.google.android.gms.internal.vision.zzga {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zzb(byte[] bArr, int i, int i2) {
            super();
            java.util.Objects.requireNonNull(bArr, "buffer");
            int i3 = i2 + 0;
            if ((i2 | 0 | (bArr.length - i3)) < 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), 0, java.lang.Integer.valueOf(i2)));
            }
            this.buffer = bArr;
            this.offset = 0;
            this.position = 0;
            this.limit = i3;
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzg(int i, int i2) throws java.io.IOException {
            zzax((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzh(int i, int i2) throws java.io.IOException {
            zzg(i, 0);
            zzaw(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzi(int i, int i2) throws java.io.IOException {
            zzg(i, 0);
            zzax(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzk(int i, int i2) throws java.io.IOException {
            zzg(i, 5);
            zzaz(i2);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zza(int i, long j) throws java.io.IOException {
            zzg(i, 0);
            zzs(j);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzc(int i, long j) throws java.io.IOException {
            zzg(i, 1);
            zzu(j);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zza(int i, boolean z) throws java.io.IOException {
            zzg(i, 0);
            zzc(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zza(int i, java.lang.String str) throws java.io.IOException {
            zzg(i, 2);
            zzx(str);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zza(int i, com.google.android.gms.internal.vision.zzfh zzfhVar) throws java.io.IOException {
            zzg(i, 2);
            zza(zzfhVar);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zza(com.google.android.gms.internal.vision.zzfh zzfhVar) throws java.io.IOException {
            zzax(zzfhVar.size());
            zzfhVar.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zze(byte[] bArr, int i, int i2) throws java.io.IOException {
            zzax(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        final void zza(int i, com.google.android.gms.internal.vision.zzic zzicVar, com.google.android.gms.internal.vision.zzir zzirVar) throws java.io.IOException {
            zzg(i, 2);
            com.google.android.gms.internal.vision.zzet zzetVar = (com.google.android.gms.internal.vision.zzet) zzicVar;
            int iZzdl = zzetVar.zzdl();
            if (iZzdl == -1) {
                iZzdl = zzirVar.zzr(zzetVar);
                zzetVar.zzad(iZzdl);
            }
            zzax(iZzdl);
            zzirVar.zza(zzicVar, this.zzss);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zza(int i, com.google.android.gms.internal.vision.zzic zzicVar) throws java.io.IOException {
            zzg(1, 3);
            zzi(2, i);
            zzg(3, 2);
            zzb(zzicVar);
            zzg(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzb(int i, com.google.android.gms.internal.vision.zzfh zzfhVar) throws java.io.IOException {
            zzg(1, 3);
            zzi(2, i);
            zza(3, zzfhVar);
            zzg(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzb(com.google.android.gms.internal.vision.zzic zzicVar) throws java.io.IOException {
            zzax(zzicVar.zzgf());
            zzicVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzc(byte b) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.vision.zzga.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzaw(int i) throws java.io.IOException {
            if (i >= 0) {
                zzax(i);
            } else {
                zzs(i);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzax(int i) throws java.io.IOException {
            if (!com.google.android.gms.internal.vision.zzga.zzsr || com.google.android.gms.internal.vision.zzfa.zzdr() || zzfg() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.buffer;
                        int i2 = this.position;
                        this.position = i2 + 1;
                        bArr[i2] = (byte) ((i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128);
                        i >>>= 7;
                    } catch (java.lang.IndexOutOfBoundsException e) {
                        throw new com.google.android.gms.internal.vision.zzga.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
                    }
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                com.google.android.gms.internal.vision.zzjp.zza(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            com.google.android.gms.internal.vision.zzjp.zza(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.buffer;
                int i7 = this.position;
                this.position = i7 + 1;
                com.google.android.gms.internal.vision.zzjp.zza(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.buffer;
            int i8 = this.position;
            this.position = i8 + 1;
            com.google.android.gms.internal.vision.zzjp.zza(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                com.google.android.gms.internal.vision.zzjp.zza(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            com.google.android.gms.internal.vision.zzjp.zza(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                com.google.android.gms.internal.vision.zzjp.zza(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            com.google.android.gms.internal.vision.zzjp.zza(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.buffer;
            int i15 = this.position;
            this.position = i15 + 1;
            com.google.android.gms.internal.vision.zzjp.zza(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzaz(int i) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.position = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.position = i5;
                bArr[i4] = (byte) (i >> 16);
                this.position = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.vision.zzga.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzs(long j) throws java.io.IOException {
            if (com.google.android.gms.internal.vision.zzga.zzsr && zzfg() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    com.google.android.gms.internal.vision.zzjp.zza(bArr, i, (byte) ((((int) j) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                com.google.android.gms.internal.vision.zzjp.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128);
                    j >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new com.google.android.gms.internal.vision.zzga.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzu(long j) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = (byte) j;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i3 + 1;
                this.position = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i4 + 1;
                this.position = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i5 + 1;
                this.position = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i6 + 1;
                this.position = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i7 + 1;
                this.position = i8;
                bArr[i7] = (byte) (j >> 48);
                this.position = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.vision.zzga.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        private final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                java.lang.System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.vision.zzga.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), java.lang.Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzfi
        public final void zzc(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final void zzx(java.lang.String str) throws java.io.IOException {
            int i = this.position;
            try {
                int iZzbc = zzbc(str.length() * 3);
                int iZzbc2 = zzbc(str.length());
                if (iZzbc2 == iZzbc) {
                    int i2 = i + iZzbc2;
                    this.position = i2;
                    int iZza = com.google.android.gms.internal.vision.zzjs.zza(str, this.buffer, i2, zzfg());
                    this.position = i;
                    zzax((iZza - i) - iZzbc2);
                    this.position = iZza;
                    return;
                }
                zzax(com.google.android.gms.internal.vision.zzjs.zza(str));
                this.position = com.google.android.gms.internal.vision.zzjs.zza(str, this.buffer, this.position, zzfg());
            } catch (com.google.android.gms.internal.vision.zzjv e) {
                this.position = i;
                zza(str, e);
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new com.google.android.gms.internal.vision.zzga.zza(e2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzga
        public final int zzfg() {
            return this.limit - this.position;
        }
    }

    public final void zzt(long j) throws java.io.IOException {
        zzs(zzaa(j));
    }

    public final void zzs(float f) throws java.io.IOException {
        zzaz(java.lang.Float.floatToRawIntBits(f));
    }

    public final void zza(double d) throws java.io.IOException {
        zzu(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void zzk(boolean z) throws java.io.IOException {
        zzc(z ? (byte) 1 : (byte) 0);
    }

    public static int zzl(int i, int i2) {
        return zzba(i) + zzbb(i2);
    }

    public static int zzm(int i, int i2) {
        return zzba(i) + zzbc(i2);
    }

    public static int zzn(int i, int i2) {
        return zzba(i) + zzbc(zzbh(i2));
    }

    public static int zzo(int i, int i2) {
        return zzba(i) + 4;
    }

    public static int zzp(int i, int i2) {
        return zzba(i) + 4;
    }

    public static int zzd(int i, long j) {
        return zzba(i) + zzw(j);
    }

    public static int zze(int i, long j) {
        return zzba(i) + zzw(j);
    }

    public static int zzf(int i, long j) {
        return zzba(i) + zzw(zzaa(j));
    }

    public static int zzg(int i, long j) {
        return zzba(i) + 8;
    }

    public static int zzh(int i, long j) {
        return zzba(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzba(i) + 4;
    }

    public static int zzb(int i, double d) {
        return zzba(i) + 8;
    }

    public static int zzb(int i, boolean z) {
        return zzba(i) + 1;
    }

    public static int zzq(int i, int i2) {
        return zzba(i) + zzbb(i2);
    }

    public static int zzb(int i, java.lang.String str) {
        return zzba(i) + zzy(str);
    }

    public static int zzc(int i, com.google.android.gms.internal.vision.zzfh zzfhVar) {
        int iZzba = zzba(i);
        int size = zzfhVar.size();
        return iZzba + zzbc(size) + size;
    }

    public static int zza(int i, com.google.android.gms.internal.vision.zzhh zzhhVar) {
        int iZzba = zzba(i);
        int iZzgf = zzhhVar.zzgf();
        return iZzba + zzbc(iZzgf) + iZzgf;
    }

    static int zzb(int i, com.google.android.gms.internal.vision.zzic zzicVar, com.google.android.gms.internal.vision.zzir zzirVar) {
        return zzba(i) + zza(zzicVar, zzirVar);
    }

    public static int zzb(int i, com.google.android.gms.internal.vision.zzic zzicVar) {
        return (zzba(1) << 1) + zzm(2, i) + zzba(3) + zzc(zzicVar);
    }

    public static int zzd(int i, com.google.android.gms.internal.vision.zzfh zzfhVar) {
        return (zzba(1) << 1) + zzm(2, i) + zzc(3, zzfhVar);
    }

    public static int zzb(int i, com.google.android.gms.internal.vision.zzhh zzhhVar) {
        return (zzba(1) << 1) + zzm(2, i) + zza(3, zzhhVar);
    }

    public static int zzba(int i) {
        return zzbc(i << 3);
    }

    public static int zzbb(int i) {
        if (i >= 0) {
            return zzbc(i);
        }
        return 10;
    }

    public static int zzbd(int i) {
        return zzbc(zzbh(i));
    }

    public static int zzv(long j) {
        return zzw(j);
    }

    public static int zzx(long j) {
        return zzw(zzaa(j));
    }

    public static int zzbg(int i) {
        return zzbb(i);
    }

    public static int zzy(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.vision.zzjs.zza(str);
        } catch (com.google.android.gms.internal.vision.zzjv unused) {
            length = str.getBytes(com.google.android.gms.internal.vision.zzgt.UTF_8).length;
        }
        return zzbc(length) + length;
    }

    public static int zza(com.google.android.gms.internal.vision.zzhh zzhhVar) {
        int iZzgf = zzhhVar.zzgf();
        return zzbc(iZzgf) + iZzgf;
    }

    public static int zzb(com.google.android.gms.internal.vision.zzfh zzfhVar) {
        int size = zzfhVar.size();
        return zzbc(size) + size;
    }

    public static int zzf(byte[] bArr) {
        int length = bArr.length;
        return zzbc(length) + length;
    }

    public static int zzc(com.google.android.gms.internal.vision.zzic zzicVar) {
        int iZzgf = zzicVar.zzgf();
        return zzbc(iZzgf) + iZzgf;
    }

    static int zza(com.google.android.gms.internal.vision.zzic zzicVar, com.google.android.gms.internal.vision.zzir zzirVar) {
        com.google.android.gms.internal.vision.zzet zzetVar = (com.google.android.gms.internal.vision.zzet) zzicVar;
        int iZzdl = zzetVar.zzdl();
        if (iZzdl == -1) {
            iZzdl = zzirVar.zzr(zzetVar);
            zzetVar.zzad(iZzdl);
        }
        return zzbc(iZzdl) + iZzdl;
    }

    public final void zzfh() {
        if (zzfg() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zza(java.lang.String str, com.google.android.gms.internal.vision.zzjv zzjvVar) throws java.io.IOException {
        logger.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzjvVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.vision.zzgt.UTF_8);
        try {
            zzax(bytes.length);
            zzc(bytes, 0, bytes.length);
        } catch (com.google.android.gms.internal.vision.zzga.zza e) {
            throw e;
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.vision.zzga.zza(e2);
        }
    }

    @java.lang.Deprecated
    static int zzc(int i, com.google.android.gms.internal.vision.zzic zzicVar, com.google.android.gms.internal.vision.zzir zzirVar) {
        int iZzba = zzba(i) << 1;
        com.google.android.gms.internal.vision.zzet zzetVar = (com.google.android.gms.internal.vision.zzet) zzicVar;
        int iZzdl = zzetVar.zzdl();
        if (iZzdl == -1) {
            iZzdl = zzirVar.zzr(zzetVar);
            zzetVar.zzad(iZzdl);
        }
        return iZzba + iZzdl;
    }

    @java.lang.Deprecated
    public static int zzd(com.google.android.gms.internal.vision.zzic zzicVar) {
        return zzicVar.zzgf();
    }

    @java.lang.Deprecated
    public static int zzbi(int i) {
        return zzbc(i);
    }
}
