package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfs extends com.google.android.gms.internal.fitness.zzfc {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.fitness.zzfs.class.getName());
    private static final boolean zzrt = com.google.android.gms.internal.fitness.zzja.zzdf();
    com.google.android.gms.internal.fitness.zzfv zzru;

    public static com.google.android.gms.internal.fitness.zzfs zza(byte[] bArr) {
        return new com.google.android.gms.internal.fitness.zzfs.zza(bArr, 0, bArr.length);
    }

    public static int zzb(boolean z) {
        return 1;
    }

    public static int zzc(double d) {
        return 8;
    }

    public static int zzc(float f) {
        return 4;
    }

    public static int zze(long j) {
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

    public static int zzg(long j) {
        return 8;
    }

    public static int zzh(long j) {
        return 8;
    }

    private static long zzi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzr(int i) {
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

    public static int zzt(int i) {
        return 4;
    }

    public static int zzu(int i) {
        return 4;
    }

    private static int zzw(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void zza(int i, long j) throws java.io.IOException;

    public abstract void zza(int i, com.google.android.gms.internal.fitness.zzff zzffVar) throws java.io.IOException;

    public abstract void zza(int i, com.google.android.gms.internal.fitness.zzho zzhoVar) throws java.io.IOException;

    abstract void zza(int i, com.google.android.gms.internal.fitness.zzho zzhoVar, com.google.android.gms.internal.fitness.zzic zzicVar) throws java.io.IOException;

    public abstract void zza(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zza(int i, boolean z) throws java.io.IOException;

    public abstract void zza(long j) throws java.io.IOException;

    public abstract void zza(com.google.android.gms.internal.fitness.zzff zzffVar) throws java.io.IOException;

    public abstract int zzaw();

    public abstract void zzb(int i, int i2) throws java.io.IOException;

    public abstract void zzb(int i, com.google.android.gms.internal.fitness.zzff zzffVar) throws java.io.IOException;

    public abstract void zzb(com.google.android.gms.internal.fitness.zzho zzhoVar) throws java.io.IOException;

    abstract void zzb(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void zzc(byte b) throws java.io.IOException;

    public abstract void zzc(int i, int i2) throws java.io.IOException;

    public abstract void zzc(int i, long j) throws java.io.IOException;

    public abstract void zzc(long j) throws java.io.IOException;

    public abstract void zzd(int i, int i2) throws java.io.IOException;

    public abstract void zzf(int i, int i2) throws java.io.IOException;

    public abstract void zzl(int i) throws java.io.IOException;

    public abstract void zzm(int i) throws java.io.IOException;

    public abstract void zzm(java.lang.String str) throws java.io.IOException;

    public abstract void zzo(int i) throws java.io.IOException;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class zzb extends java.io.IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(java.lang.Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzb(java.lang.String str, java.lang.Throwable th) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new java.lang.String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }
    }

    private zzfs() {
    }

    public final void zze(int i, int i2) throws java.io.IOException {
        zzd(i, zzw(i2));
    }

    public final void zzb(int i, long j) throws java.io.IOException {
        zza(i, zzi(j));
    }

    public final void zza(int i, float f) throws java.io.IOException {
        zzf(i, java.lang.Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) throws java.io.IOException {
        zzc(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void zzn(int i) throws java.io.IOException {
        zzm(zzw(i));
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    static class zza extends com.google.android.gms.internal.fitness.zzfs {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] bArr, int i, int i2) {
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

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzb(int i, int i2) throws java.io.IOException {
            zzm((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzc(int i, int i2) throws java.io.IOException {
            zzb(i, 0);
            zzl(i2);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzd(int i, int i2) throws java.io.IOException {
            zzb(i, 0);
            zzm(i2);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzf(int i, int i2) throws java.io.IOException {
            zzb(i, 5);
            zzo(i2);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zza(int i, long j) throws java.io.IOException {
            zzb(i, 0);
            zza(j);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzc(int i, long j) throws java.io.IOException {
            zzb(i, 1);
            zzc(j);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zza(int i, boolean z) throws java.io.IOException {
            zzb(i, 0);
            zzc(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zza(int i, java.lang.String str) throws java.io.IOException {
            zzb(i, 2);
            zzm(str);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zza(int i, com.google.android.gms.internal.fitness.zzff zzffVar) throws java.io.IOException {
            zzb(i, 2);
            zza(zzffVar);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zza(com.google.android.gms.internal.fitness.zzff zzffVar) throws java.io.IOException {
            zzm(zzffVar.size());
            zzffVar.zza(this);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzb(byte[] bArr, int i, int i2) throws java.io.IOException {
            zzm(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        final void zza(int i, com.google.android.gms.internal.fitness.zzho zzhoVar, com.google.android.gms.internal.fitness.zzic zzicVar) throws java.io.IOException {
            zzb(i, 2);
            com.google.android.gms.internal.fitness.zzex zzexVar = (com.google.android.gms.internal.fitness.zzex) zzhoVar;
            int iZzah = zzexVar.zzah();
            if (iZzah == -1) {
                iZzah = zzicVar.zzk(zzexVar);
                zzexVar.zzg(iZzah);
            }
            zzm(iZzah);
            zzicVar.zza(zzhoVar, this.zzru);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zza(int i, com.google.android.gms.internal.fitness.zzho zzhoVar) throws java.io.IOException {
            zzb(1, 3);
            zzd(2, i);
            zzb(3, 2);
            zzb(zzhoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzb(int i, com.google.android.gms.internal.fitness.zzff zzffVar) throws java.io.IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzffVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzb(com.google.android.gms.internal.fitness.zzho zzhoVar) throws java.io.IOException {
            zzm(zzhoVar.zzbk());
            zzhoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzc(byte b) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.fitness.zzfs.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzl(int i) throws java.io.IOException {
            if (i >= 0) {
                zzm(i);
            } else {
                zza(i);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzm(int i) throws java.io.IOException {
            if (!com.google.android.gms.internal.fitness.zzfs.zzrt || com.google.android.gms.internal.fitness.zzfd.zzan() || zzaw() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.buffer;
                        int i2 = this.position;
                        this.position = i2 + 1;
                        bArr[i2] = (byte) ((i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128);
                        i >>>= 7;
                    } catch (java.lang.IndexOutOfBoundsException e) {
                        throw new com.google.android.gms.internal.fitness.zzfs.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
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
                com.google.android.gms.internal.fitness.zzja.zza(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            com.google.android.gms.internal.fitness.zzja.zza(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.buffer;
                int i7 = this.position;
                this.position = i7 + 1;
                com.google.android.gms.internal.fitness.zzja.zza(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.buffer;
            int i8 = this.position;
            this.position = i8 + 1;
            com.google.android.gms.internal.fitness.zzja.zza(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                com.google.android.gms.internal.fitness.zzja.zza(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            com.google.android.gms.internal.fitness.zzja.zza(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                com.google.android.gms.internal.fitness.zzja.zza(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            com.google.android.gms.internal.fitness.zzja.zza(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.buffer;
            int i15 = this.position;
            this.position = i15 + 1;
            com.google.android.gms.internal.fitness.zzja.zza(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzo(int i) throws java.io.IOException {
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
                throw new com.google.android.gms.internal.fitness.zzfs.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zza(long j) throws java.io.IOException {
            if (com.google.android.gms.internal.fitness.zzfs.zzrt && zzaw() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    com.google.android.gms.internal.fitness.zzja.zza(bArr, i, (byte) ((((int) j) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                com.google.android.gms.internal.fitness.zzja.zza(bArr2, i2, (byte) j);
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
                    throw new com.google.android.gms.internal.fitness.zzfs.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzc(long j) throws java.io.IOException {
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
                throw new com.google.android.gms.internal.fitness.zzfs.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        private final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                java.lang.System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.fitness.zzfs.zzb(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), java.lang.Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzfc
        public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final void zzm(java.lang.String str) throws java.io.IOException {
            int i = this.position;
            try {
                int iZzr = zzr(str.length() * 3);
                int iZzr2 = zzr(str.length());
                if (iZzr2 == iZzr) {
                    int i2 = i + iZzr2;
                    this.position = i2;
                    int iZzb = com.google.android.gms.internal.fitness.zzjc.zzb(str, this.buffer, i2, zzaw());
                    this.position = i;
                    zzm((iZzb - i) - iZzr2);
                    this.position = iZzb;
                    return;
                }
                zzm(com.google.android.gms.internal.fitness.zzjc.zza(str));
                this.position = com.google.android.gms.internal.fitness.zzjc.zzb(str, this.buffer, this.position, zzaw());
            } catch (com.google.android.gms.internal.fitness.zzjd e) {
                this.position = i;
                zza(str, e);
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new com.google.android.gms.internal.fitness.zzfs.zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzfs
        public final int zzaw() {
            return this.limit - this.position;
        }
    }

    public final void zzb(long j) throws java.io.IOException {
        zza(zzi(j));
    }

    public final void zzb(float f) throws java.io.IOException {
        zzo(java.lang.Float.floatToRawIntBits(f));
    }

    public final void zzb(double d) throws java.io.IOException {
        zzc(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void zza(boolean z) throws java.io.IOException {
        zzc(z ? (byte) 1 : (byte) 0);
    }

    public static int zzg(int i, int i2) {
        return zzp(i) + zzq(i2);
    }

    public static int zzh(int i, int i2) {
        return zzp(i) + zzr(i2);
    }

    public static int zzi(int i, int i2) {
        return zzp(i) + zzr(zzw(i2));
    }

    public static int zzj(int i, int i2) {
        return zzp(i) + 4;
    }

    public static int zzk(int i, int i2) {
        return zzp(i) + 4;
    }

    public static int zzd(int i, long j) {
        return zzp(i) + zze(j);
    }

    public static int zze(int i, long j) {
        return zzp(i) + zze(j);
    }

    public static int zzf(int i, long j) {
        return zzp(i) + zze(zzi(j));
    }

    public static int zzg(int i, long j) {
        return zzp(i) + 8;
    }

    public static int zzh(int i, long j) {
        return zzp(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzp(i) + 4;
    }

    public static int zzb(int i, double d) {
        return zzp(i) + 8;
    }

    public static int zzb(int i, boolean z) {
        return zzp(i) + 1;
    }

    public static int zzl(int i, int i2) {
        return zzp(i) + zzq(i2);
    }

    public static int zzb(int i, java.lang.String str) {
        return zzp(i) + zzn(str);
    }

    public static int zzc(int i, com.google.android.gms.internal.fitness.zzff zzffVar) {
        int iZzp = zzp(i);
        int size = zzffVar.size();
        return iZzp + zzr(size) + size;
    }

    public static int zza(int i, com.google.android.gms.internal.fitness.zzgt zzgtVar) {
        int iZzp = zzp(i);
        int iZzbk = zzgtVar.zzbk();
        return iZzp + zzr(iZzbk) + iZzbk;
    }

    static int zzb(int i, com.google.android.gms.internal.fitness.zzho zzhoVar, com.google.android.gms.internal.fitness.zzic zzicVar) {
        return zzp(i) + zza(zzhoVar, zzicVar);
    }

    public static int zzb(int i, com.google.android.gms.internal.fitness.zzho zzhoVar) {
        return (zzp(1) << 1) + zzh(2, i) + zzp(3) + zzc(zzhoVar);
    }

    public static int zzd(int i, com.google.android.gms.internal.fitness.zzff zzffVar) {
        return (zzp(1) << 1) + zzh(2, i) + zzc(3, zzffVar);
    }

    public static int zzb(int i, com.google.android.gms.internal.fitness.zzgt zzgtVar) {
        return (zzp(1) << 1) + zzh(2, i) + zza(3, zzgtVar);
    }

    public static int zzp(int i) {
        return zzr(i << 3);
    }

    public static int zzq(int i) {
        if (i >= 0) {
            return zzr(i);
        }
        return 10;
    }

    public static int zzs(int i) {
        return zzr(zzw(i));
    }

    public static int zzd(long j) {
        return zze(j);
    }

    public static int zzf(long j) {
        return zze(zzi(j));
    }

    public static int zzv(int i) {
        return zzq(i);
    }

    public static int zzn(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.fitness.zzjc.zza(str);
        } catch (com.google.android.gms.internal.fitness.zzjd unused) {
            length = str.getBytes(com.google.android.gms.internal.fitness.zzgk.UTF_8).length;
        }
        return zzr(length) + length;
    }

    public static int zza(com.google.android.gms.internal.fitness.zzgt zzgtVar) {
        int iZzbk = zzgtVar.zzbk();
        return zzr(iZzbk) + iZzbk;
    }

    public static int zzb(com.google.android.gms.internal.fitness.zzff zzffVar) {
        int size = zzffVar.size();
        return zzr(size) + size;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        return zzr(length) + length;
    }

    public static int zzc(com.google.android.gms.internal.fitness.zzho zzhoVar) {
        int iZzbk = zzhoVar.zzbk();
        return zzr(iZzbk) + iZzbk;
    }

    static int zza(com.google.android.gms.internal.fitness.zzho zzhoVar, com.google.android.gms.internal.fitness.zzic zzicVar) {
        com.google.android.gms.internal.fitness.zzex zzexVar = (com.google.android.gms.internal.fitness.zzex) zzhoVar;
        int iZzah = zzexVar.zzah();
        if (iZzah == -1) {
            iZzah = zzicVar.zzk(zzexVar);
            zzexVar.zzg(iZzah);
        }
        return zzr(iZzah) + iZzah;
    }

    final void zza(java.lang.String str, com.google.android.gms.internal.fitness.zzjd zzjdVar) throws java.io.IOException {
        logger.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzjdVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.fitness.zzgk.UTF_8);
        try {
            zzm(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (com.google.android.gms.internal.fitness.zzfs.zzb e) {
            throw e;
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.fitness.zzfs.zzb(e2);
        }
    }

    @java.lang.Deprecated
    static int zzc(int i, com.google.android.gms.internal.fitness.zzho zzhoVar, com.google.android.gms.internal.fitness.zzic zzicVar) {
        int iZzp = zzp(i) << 1;
        com.google.android.gms.internal.fitness.zzex zzexVar = (com.google.android.gms.internal.fitness.zzex) zzhoVar;
        int iZzah = zzexVar.zzah();
        if (iZzah == -1) {
            iZzah = zzicVar.zzk(zzexVar);
            zzexVar.zzg(iZzah);
        }
        return iZzp + iZzah;
    }

    @java.lang.Deprecated
    public static int zzd(com.google.android.gms.internal.fitness.zzho zzhoVar) {
        return zzhoVar.zzbk();
    }

    @java.lang.Deprecated
    public static int zzx(int i) {
        return zzr(i);
    }
}
