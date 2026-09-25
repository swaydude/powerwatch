package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzen extends com.google.android.gms.internal.measurement.zzdv {
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.zzen.class.getName());
    private static final boolean zzc = com.google.android.gms.internal.measurement.zzib.zza();
    com.google.android.gms.internal.measurement.zzep zza;

    public static com.google.android.gms.internal.measurement.zzen zza(byte[] bArr) {
        return new com.google.android.gms.internal.measurement.zzen.zzb(bArr, 0, bArr.length);
    }

    public static int zzb(double d) {
        return 8;
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzb(boolean z) {
        return 1;
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

    public static int zzg(int i) {
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

    public static int zzg(long j) {
        return 8;
    }

    public static int zzh(long j) {
        return 8;
    }

    public static int zzi(int i) {
        return 4;
    }

    private static long zzi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzj(int i) {
        return 4;
    }

    private static int zzm(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b) throws java.io.IOException;

    public abstract void zza(int i) throws java.io.IOException;

    public abstract void zza(int i, int i2) throws java.io.IOException;

    public abstract void zza(int i, long j) throws java.io.IOException;

    public abstract void zza(int i, com.google.android.gms.internal.measurement.zzdu zzduVar) throws java.io.IOException;

    public abstract void zza(int i, com.google.android.gms.internal.measurement.zzgo zzgoVar) throws java.io.IOException;

    abstract void zza(int i, com.google.android.gms.internal.measurement.zzgo zzgoVar, com.google.android.gms.internal.measurement.zzhd zzhdVar) throws java.io.IOException;

    public abstract void zza(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zza(int i, boolean z) throws java.io.IOException;

    public abstract void zza(long j) throws java.io.IOException;

    public abstract void zza(com.google.android.gms.internal.measurement.zzdu zzduVar) throws java.io.IOException;

    public abstract void zza(com.google.android.gms.internal.measurement.zzgo zzgoVar) throws java.io.IOException;

    public abstract void zza(java.lang.String str) throws java.io.IOException;

    public abstract void zzb(int i) throws java.io.IOException;

    public abstract void zzb(int i, int i2) throws java.io.IOException;

    public abstract void zzb(int i, com.google.android.gms.internal.measurement.zzdu zzduVar) throws java.io.IOException;

    abstract void zzb(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void zzc(int i, int i2) throws java.io.IOException;

    public abstract void zzc(int i, long j) throws java.io.IOException;

    public abstract void zzc(long j) throws java.io.IOException;

    public abstract void zzd(int i) throws java.io.IOException;

    public abstract void zze(int i, int i2) throws java.io.IOException;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
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

    private zzen() {
    }

    public final void zzd(int i, int i2) throws java.io.IOException {
        zzc(i, zzm(i2));
    }

    public final void zzb(int i, long j) throws java.io.IOException {
        zza(i, zzi(j));
    }

    public final void zza(int i, float f) throws java.io.IOException {
        zze(i, java.lang.Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) throws java.io.IOException {
        zzc(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void zzc(int i) throws java.io.IOException {
        zzb(zzm(i));
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
    static class zzb extends com.google.android.gms.internal.measurement.zzen {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        zzb(byte[] bArr, int i, int i2) {
            super();
            java.util.Objects.requireNonNull(bArr, "buffer");
            int i3 = i2 + 0;
            if ((i2 | 0 | (bArr.length - i3)) < 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), 0, java.lang.Integer.valueOf(i2)));
            }
            this.zzb = bArr;
            this.zzc = 0;
            this.zze = 0;
            this.zzd = i3;
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(int i, int i2) throws java.io.IOException {
            zzb((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zzb(int i, int i2) throws java.io.IOException {
            zza(i, 0);
            zza(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zzc(int i, int i2) throws java.io.IOException {
            zza(i, 0);
            zzb(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zze(int i, int i2) throws java.io.IOException {
            zza(i, 5);
            zzd(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(int i, long j) throws java.io.IOException {
            zza(i, 0);
            zza(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zzc(int i, long j) throws java.io.IOException {
            zza(i, 1);
            zzc(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(int i, boolean z) throws java.io.IOException {
            zza(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(int i, java.lang.String str) throws java.io.IOException {
            zza(i, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(int i, com.google.android.gms.internal.measurement.zzdu zzduVar) throws java.io.IOException {
            zza(i, 2);
            zza(zzduVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(com.google.android.gms.internal.measurement.zzdu zzduVar) throws java.io.IOException {
            zzb(zzduVar.zza());
            zzduVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zzb(byte[] bArr, int i, int i2) throws java.io.IOException {
            zzb(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        final void zza(int i, com.google.android.gms.internal.measurement.zzgo zzgoVar, com.google.android.gms.internal.measurement.zzhd zzhdVar) throws java.io.IOException {
            zza(i, 2);
            com.google.android.gms.internal.measurement.zzdl zzdlVar = (com.google.android.gms.internal.measurement.zzdl) zzgoVar;
            int iZzbj = zzdlVar.zzbj();
            if (iZzbj == -1) {
                iZzbj = zzhdVar.zzb(zzdlVar);
                zzdlVar.zzc(iZzbj);
            }
            zzb(iZzbj);
            zzhdVar.zza(zzgoVar, this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(int i, com.google.android.gms.internal.measurement.zzgo zzgoVar) throws java.io.IOException {
            zza(1, 3);
            zzc(2, i);
            zza(3, 2);
            zza(zzgoVar);
            zza(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zzb(int i, com.google.android.gms.internal.measurement.zzdu zzduVar) throws java.io.IOException {
            zza(1, 3);
            zzc(2, i);
            zza(3, zzduVar);
            zza(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(com.google.android.gms.internal.measurement.zzgo zzgoVar) throws java.io.IOException {
            zzb(zzgoVar.zzbn());
            zzgoVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(byte b) throws java.io.IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                this.zze = i + 1;
                bArr[i] = b;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.measurement.zzen.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zze), java.lang.Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(int i) throws java.io.IOException {
            if (i >= 0) {
                zzb(i);
            } else {
                zza(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zzb(int i) throws java.io.IOException {
            if (!com.google.android.gms.internal.measurement.zzen.zzc || com.google.android.gms.internal.measurement.zzdr.zza() || zza() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.zzb;
                        int i2 = this.zze;
                        this.zze = i2 + 1;
                        bArr[i2] = (byte) ((i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128);
                        i >>>= 7;
                    } catch (java.lang.IndexOutOfBoundsException e) {
                        throw new com.google.android.gms.internal.measurement.zzen.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zze), java.lang.Integer.valueOf(this.zzd), 1), e);
                    }
                }
                byte[] bArr2 = this.zzb;
                int i3 = this.zze;
                this.zze = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i4 = this.zze;
                this.zze = i4 + 1;
                com.google.android.gms.internal.measurement.zzib.zza(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i5 = this.zze;
            this.zze = i5 + 1;
            com.google.android.gms.internal.measurement.zzib.zza(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.zzb;
                int i7 = this.zze;
                this.zze = i7 + 1;
                com.google.android.gms.internal.measurement.zzib.zza(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.zzb;
            int i8 = this.zze;
            this.zze = i8 + 1;
            com.google.android.gms.internal.measurement.zzib.zza(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.zzb;
                int i10 = this.zze;
                this.zze = i10 + 1;
                com.google.android.gms.internal.measurement.zzib.zza(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.zzb;
            int i11 = this.zze;
            this.zze = i11 + 1;
            com.google.android.gms.internal.measurement.zzib.zza(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.zzb;
                int i13 = this.zze;
                this.zze = i13 + 1;
                com.google.android.gms.internal.measurement.zzib.zza(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.zzb;
            int i14 = this.zze;
            this.zze = i14 + 1;
            com.google.android.gms.internal.measurement.zzib.zza(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.zzb;
            int i15 = this.zze;
            this.zze = i15 + 1;
            com.google.android.gms.internal.measurement.zzib.zza(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zzd(int i) throws java.io.IOException {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zze;
                int i3 = i2 + 1;
                this.zze = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.zze = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.zze = i5;
                bArr[i4] = (byte) (i >> 16);
                this.zze = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.measurement.zzen.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zze), java.lang.Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(long j) throws java.io.IOException {
            if (com.google.android.gms.internal.measurement.zzen.zzc && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i = this.zze;
                    this.zze = i + 1;
                    com.google.android.gms.internal.measurement.zzib.zza(bArr, i, (byte) ((((int) j) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i2 = this.zze;
                this.zze = i2 + 1;
                com.google.android.gms.internal.measurement.zzib.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i3 = this.zze;
                    this.zze = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128);
                    j >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new com.google.android.gms.internal.measurement.zzen.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zze), java.lang.Integer.valueOf(this.zzd), 1), e);
                }
            }
            byte[] bArr4 = this.zzb;
            int i4 = this.zze;
            this.zze = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zzc(long j) throws java.io.IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                int i2 = i + 1;
                this.zze = i2;
                bArr[i] = (byte) j;
                int i3 = i2 + 1;
                this.zze = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i3 + 1;
                this.zze = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i4 + 1;
                this.zze = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i5 + 1;
                this.zze = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i6 + 1;
                this.zze = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i7 + 1;
                this.zze = i8;
                bArr[i7] = (byte) (j >> 48);
                this.zze = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.measurement.zzen.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zze), java.lang.Integer.valueOf(this.zzd), 1), e);
            }
        }

        private final void zzc(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                java.lang.System.arraycopy(bArr, i, this.zzb, this.zze, i2);
                this.zze += i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.measurement.zzen.zza(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zze), java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzdv
        public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final void zza(java.lang.String str) throws java.io.IOException {
            int i = this.zze;
            try {
                int iZzg = zzg(str.length() * 3);
                int iZzg2 = zzg(str.length());
                if (iZzg2 == iZzg) {
                    int i2 = i + iZzg2;
                    this.zze = i2;
                    int iZza = com.google.android.gms.internal.measurement.zzie.zza(str, this.zzb, i2, zza());
                    this.zze = i;
                    zzb((iZza - i) - iZzg2);
                    this.zze = iZza;
                    return;
                }
                zzb(com.google.android.gms.internal.measurement.zzie.zza(str));
                this.zze = com.google.android.gms.internal.measurement.zzie.zza(str, this.zzb, this.zze, zza());
            } catch (com.google.android.gms.internal.measurement.zzih e) {
                this.zze = i;
                zza(str, e);
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new com.google.android.gms.internal.measurement.zzen.zza(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzen
        public final int zza() {
            return this.zzd - this.zze;
        }
    }

    public final void zzb(long j) throws java.io.IOException {
        zza(zzi(j));
    }

    public final void zza(float f) throws java.io.IOException {
        zzd(java.lang.Float.floatToRawIntBits(f));
    }

    public final void zza(double d) throws java.io.IOException {
        zzc(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void zza(boolean z) throws java.io.IOException {
        zza(z ? (byte) 1 : (byte) 0);
    }

    public static int zzf(int i, int i2) {
        return zze(i) + zzf(i2);
    }

    public static int zzg(int i, int i2) {
        return zze(i) + zzg(i2);
    }

    public static int zzh(int i, int i2) {
        return zze(i) + zzg(zzm(i2));
    }

    public static int zzi(int i, int i2) {
        return zze(i) + 4;
    }

    public static int zzj(int i, int i2) {
        return zze(i) + 4;
    }

    public static int zzd(int i, long j) {
        return zze(i) + zze(j);
    }

    public static int zze(int i, long j) {
        return zze(i) + zze(j);
    }

    public static int zzf(int i, long j) {
        return zze(i) + zze(zzi(j));
    }

    public static int zzg(int i, long j) {
        return zze(i) + 8;
    }

    public static int zzh(int i, long j) {
        return zze(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zze(i) + 4;
    }

    public static int zzb(int i, double d) {
        return zze(i) + 8;
    }

    public static int zzb(int i, boolean z) {
        return zze(i) + 1;
    }

    public static int zzk(int i, int i2) {
        return zze(i) + zzf(i2);
    }

    public static int zzb(int i, java.lang.String str) {
        return zze(i) + zzb(str);
    }

    public static int zzc(int i, com.google.android.gms.internal.measurement.zzdu zzduVar) {
        int iZze = zze(i);
        int iZza = zzduVar.zza();
        return iZze + zzg(iZza) + iZza;
    }

    public static int zza(int i, com.google.android.gms.internal.measurement.zzft zzftVar) {
        int iZze = zze(i);
        int iZzb = zzftVar.zzb();
        return iZze + zzg(iZzb) + iZzb;
    }

    static int zzb(int i, com.google.android.gms.internal.measurement.zzgo zzgoVar, com.google.android.gms.internal.measurement.zzhd zzhdVar) {
        return zze(i) + zza(zzgoVar, zzhdVar);
    }

    public static int zzb(int i, com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        return (zze(1) << 1) + zzg(2, i) + zze(3) + zzb(zzgoVar);
    }

    public static int zzd(int i, com.google.android.gms.internal.measurement.zzdu zzduVar) {
        return (zze(1) << 1) + zzg(2, i) + zzc(3, zzduVar);
    }

    public static int zzb(int i, com.google.android.gms.internal.measurement.zzft zzftVar) {
        return (zze(1) << 1) + zzg(2, i) + zza(3, zzftVar);
    }

    public static int zze(int i) {
        return zzg(i << 3);
    }

    public static int zzf(int i) {
        if (i >= 0) {
            return zzg(i);
        }
        return 10;
    }

    public static int zzh(int i) {
        return zzg(zzm(i));
    }

    public static int zzd(long j) {
        return zze(j);
    }

    public static int zzf(long j) {
        return zze(zzi(j));
    }

    public static int zzk(int i) {
        return zzf(i);
    }

    public static int zzb(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.measurement.zzie.zza(str);
        } catch (com.google.android.gms.internal.measurement.zzih unused) {
            length = str.getBytes(com.google.android.gms.internal.measurement.zzff.zza).length;
        }
        return zzg(length) + length;
    }

    public static int zza(com.google.android.gms.internal.measurement.zzft zzftVar) {
        int iZzb = zzftVar.zzb();
        return zzg(iZzb) + iZzb;
    }

    public static int zzb(com.google.android.gms.internal.measurement.zzdu zzduVar) {
        int iZza = zzduVar.zza();
        return zzg(iZza) + iZza;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        return zzg(length) + length;
    }

    public static int zzb(com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        int iZzbn = zzgoVar.zzbn();
        return zzg(iZzbn) + iZzbn;
    }

    static int zza(com.google.android.gms.internal.measurement.zzgo zzgoVar, com.google.android.gms.internal.measurement.zzhd zzhdVar) {
        com.google.android.gms.internal.measurement.zzdl zzdlVar = (com.google.android.gms.internal.measurement.zzdl) zzgoVar;
        int iZzbj = zzdlVar.zzbj();
        if (iZzbj == -1) {
            iZzbj = zzhdVar.zzb(zzdlVar);
            zzdlVar.zzc(iZzbj);
        }
        return zzg(iZzbj) + iZzbj;
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zza(java.lang.String str, com.google.android.gms.internal.measurement.zzih zzihVar) throws java.io.IOException {
        zzb.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzihVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.measurement.zzff.zza);
        try {
            zzb(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (com.google.android.gms.internal.measurement.zzen.zza e) {
            throw e;
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.measurement.zzen.zza(e2);
        }
    }

    @java.lang.Deprecated
    static int zzc(int i, com.google.android.gms.internal.measurement.zzgo zzgoVar, com.google.android.gms.internal.measurement.zzhd zzhdVar) {
        int iZze = zze(i) << 1;
        com.google.android.gms.internal.measurement.zzdl zzdlVar = (com.google.android.gms.internal.measurement.zzdl) zzgoVar;
        int iZzbj = zzdlVar.zzbj();
        if (iZzbj == -1) {
            iZzbj = zzhdVar.zzb(zzdlVar);
            zzdlVar.zzc(iZzbj);
        }
        return iZze + iZzbj;
    }

    @java.lang.Deprecated
    public static int zzc(com.google.android.gms.internal.measurement.zzgo zzgoVar) {
        return zzgoVar.zzbn();
    }

    @java.lang.Deprecated
    public static int zzl(int i) {
        return zzg(i);
    }
}
