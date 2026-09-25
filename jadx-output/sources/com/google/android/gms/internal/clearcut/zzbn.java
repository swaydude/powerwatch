package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbn extends com.google.android.gms.internal.clearcut.zzba {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.android.gms.internal.clearcut.zzbn.class.getName());
    private static final boolean zzfy = com.google.android.gms.internal.clearcut.zzfd.zzed();
    com.google.android.gms.internal.clearcut.zzbp zzfz;

    static class zza extends com.google.android.gms.internal.clearcut.zzbn {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] bArr, int i, int i2) {
            super();
            java.util.Objects.requireNonNull(bArr, "buffer");
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
            }
            this.buffer = bArr;
            this.offset = i;
            this.position = i;
            this.limit = i3;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public void flush() {
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                java.lang.System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), java.lang.Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b) throws java.io.IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, long j) throws java.io.IOException {
            zzb(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException {
            zzb(i, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException {
            zzb(i, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
            zzb(i, 2);
            com.google.android.gms.internal.clearcut.zzas zzasVar = (com.google.android.gms.internal.clearcut.zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, java.lang.String str) throws java.io.IOException {
            zzb(i, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
            com.google.android.gms.internal.clearcut.zzas zzasVar = (com.google.android.gms.internal.clearcut.zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return this.limit - this.position;
        }

        public final int zzai() {
            return this.position - this.offset;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, int i2) throws java.io.IOException {
            zzo((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, boolean z) throws java.io.IOException {
            zzb(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j) throws java.io.IOException {
            if (com.google.android.gms.internal.clearcut.zzbn.zzfy && zzag() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    com.google.android.gms.internal.clearcut.zzfd.zza(bArr, i, (byte) ((((int) j) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                com.google.android.gms.internal.clearcut.zzfd.zza(bArr2, i2, (byte) j);
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
                    throw new com.google.android.gms.internal.clearcut.zzbn.zzc(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, int i2) throws java.io.IOException {
            zzb(i, 0);
            zzn(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, long j) throws java.io.IOException {
            zzb(i, 1);
            zzd(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i, int i2) throws java.io.IOException {
            zzb(i, 0);
            zzo(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j) throws java.io.IOException {
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
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] bArr, int i, int i2) throws java.io.IOException {
            zzo(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i, int i2) throws java.io.IOException {
            zzb(i, 5);
            zzq(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(java.lang.String str) throws java.io.IOException {
            int i = this.position;
            try {
                int iZzt = zzt(str.length() * 3);
                int iZzt2 = zzt(str.length());
                if (iZzt2 != iZzt) {
                    zzo(com.google.android.gms.internal.clearcut.zzff.zza(str));
                    this.position = com.google.android.gms.internal.clearcut.zzff.zza(str, this.buffer, this.position, zzag());
                    return;
                }
                int i2 = i + iZzt2;
                this.position = i2;
                int iZza = com.google.android.gms.internal.clearcut.zzff.zza(str, this.buffer, i2, zzag());
                this.position = i;
                zzo((iZza - i) - iZzt2);
                this.position = iZza;
            } catch (com.google.android.gms.internal.clearcut.zzfi e) {
                this.position = i;
                zza(str, e);
            } catch (java.lang.IndexOutOfBoundsException e2) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i) throws java.io.IOException {
            if (i >= 0) {
                zzo(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i) throws java.io.IOException {
            if (com.google.android.gms.internal.clearcut.zzbn.zzfy && zzag() >= 10) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    com.google.android.gms.internal.clearcut.zzfd.zza(bArr, i2, (byte) ((i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                com.google.android.gms.internal.clearcut.zzfd.zza(bArr2, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i4 = this.position;
                    this.position = i4 + 1;
                    bArr3[i4] = (byte) ((i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128);
                    i >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new com.google.android.gms.internal.clearcut.zzbn.zzc(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            bArr4[i5] = (byte) i;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i) throws java.io.IOException {
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
                bArr[i5] = i >> 24;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(this.limit), 1), e);
            }
        }
    }

    static final class zzb extends com.google.android.gms.internal.clearcut.zzbn.zza {
        private final java.nio.ByteBuffer zzga;
        private int zzgb;

        zzb(java.nio.ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.zzga = byteBuffer;
            this.zzgb = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn.zza, com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.zzga.position(this.zzgb + zzai());
        }
    }

    public static class zzc extends java.io.IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzc(java.lang.String str) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new java.lang.String("CodedOutputStream was writing to a flat byte array and ran out of space.: "));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        zzc(java.lang.String str, java.lang.Throwable th) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new java.lang.String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }

        zzc(java.lang.Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    static final class zzd extends com.google.android.gms.internal.clearcut.zzbn {
        private final int zzgb;
        private final java.nio.ByteBuffer zzgc;
        private final java.nio.ByteBuffer zzgd;

        zzd(java.nio.ByteBuffer byteBuffer) {
            super();
            this.zzgc = byteBuffer;
            this.zzgd = byteBuffer.duplicate().order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.zzgb = byteBuffer.position();
        }

        private final void zzi(java.lang.String str) throws java.io.IOException {
            try {
                com.google.android.gms.internal.clearcut.zzff.zza(str, this.zzgd);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.zzgc.position(this.zzgd.position());
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                this.zzgd.put(bArr, i, i2);
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e);
            } catch (java.nio.BufferOverflowException e2) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b) throws java.io.IOException {
            try {
                this.zzgd.put(b);
            } catch (java.nio.BufferOverflowException e) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, long j) throws java.io.IOException {
            zzb(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException {
            zzb(i, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException {
            zzb(i, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
            zzb(i, 2);
            zza(zzdoVar, zzefVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, java.lang.String str) throws java.io.IOException {
            zzb(i, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
            com.google.android.gms.internal.clearcut.zzas zzasVar = (com.google.android.gms.internal.clearcut.zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return this.zzgd.remaining();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, int i2) throws java.io.IOException {
            zzo((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, boolean z) throws java.io.IOException {
            zzb(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j) throws java.io.IOException {
            while (((-128) & j) != 0) {
                try {
                    this.zzgd.put((byte) ((((int) j) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128));
                    j >>>= 7;
                } catch (java.nio.BufferOverflowException e) {
                    throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e);
                }
            }
            this.zzgd.put((byte) j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, int i2) throws java.io.IOException {
            zzb(i, 0);
            zzn(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, long j) throws java.io.IOException {
            zzb(i, 1);
            zzd(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i, int i2) throws java.io.IOException {
            zzb(i, 0);
            zzo(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j) throws java.io.IOException {
            try {
                this.zzgd.putLong(j);
            } catch (java.nio.BufferOverflowException e) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] bArr, int i, int i2) throws java.io.IOException {
            zzo(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i, int i2) throws java.io.IOException {
            zzb(i, 5);
            zzq(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(java.lang.String str) throws java.io.IOException {
            int iPosition = this.zzgd.position();
            try {
                int iZzt = zzt(str.length() * 3);
                int iZzt2 = zzt(str.length());
                if (iZzt2 != iZzt) {
                    zzo(com.google.android.gms.internal.clearcut.zzff.zza(str));
                    zzi(str);
                    return;
                }
                int iPosition2 = this.zzgd.position() + iZzt2;
                this.zzgd.position(iPosition2);
                zzi(str);
                int iPosition3 = this.zzgd.position();
                this.zzgd.position(iPosition);
                zzo(iPosition3 - iPosition2);
                this.zzgd.position(iPosition3);
            } catch (com.google.android.gms.internal.clearcut.zzfi e) {
                this.zzgd.position(iPosition);
                zza(str, e);
            } catch (java.lang.IllegalArgumentException e2) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i) throws java.io.IOException {
            if (i >= 0) {
                zzo(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i) throws java.io.IOException {
            while ((i & (-128)) != 0) {
                try {
                    this.zzgd.put((byte) ((i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128));
                    i >>>= 7;
                } catch (java.nio.BufferOverflowException e) {
                    throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e);
                }
            }
            this.zzgd.put((byte) i);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i) throws java.io.IOException {
            try {
                this.zzgd.putInt(i);
            } catch (java.nio.BufferOverflowException e) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e);
            }
        }
    }

    static final class zze extends com.google.android.gms.internal.clearcut.zzbn {
        private final java.nio.ByteBuffer zzgc;
        private final java.nio.ByteBuffer zzgd;
        private final long zzge;
        private final long zzgf;
        private final long zzgg;
        private final long zzgh;
        private long zzgi;

        zze(java.nio.ByteBuffer byteBuffer) {
            super();
            this.zzgc = byteBuffer;
            this.zzgd = byteBuffer.duplicate().order(java.nio.ByteOrder.LITTLE_ENDIAN);
            long jZzb = com.google.android.gms.internal.clearcut.zzfd.zzb(byteBuffer);
            this.zzge = jZzb;
            long jPosition = ((long) byteBuffer.position()) + jZzb;
            this.zzgf = jPosition;
            long jLimit = jZzb + ((long) byteBuffer.limit());
            this.zzgg = jLimit;
            this.zzgh = jLimit - 10;
            this.zzgi = jPosition;
        }

        private final void zzk(long j) {
            this.zzgd.position((int) (j - this.zzge));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.zzgc.position((int) (this.zzgi - this.zzge));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.zzgg - j;
                long j3 = this.zzgi;
                if (j2 >= j3) {
                    com.google.android.gms.internal.clearcut.zzfd.zza(bArr, i, j3, j);
                    this.zzgi += j;
                    return;
                }
            }
            java.util.Objects.requireNonNull(bArr, "value");
            throw new com.google.android.gms.internal.clearcut.zzbn.zzc(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.zzgi), java.lang.Long.valueOf(this.zzgg), java.lang.Integer.valueOf(i2)));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b) throws java.io.IOException {
            long j = this.zzgi;
            if (j >= this.zzgg) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.zzgi), java.lang.Long.valueOf(this.zzgg), 1));
            }
            this.zzgi = 1 + j;
            com.google.android.gms.internal.clearcut.zzfd.zza(j, b);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, long j) throws java.io.IOException {
            zzb(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException {
            zzb(i, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException {
            zzb(i, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
            zzb(i, 2);
            zza(zzdoVar, zzefVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, java.lang.String str) throws java.io.IOException {
            zzb(i, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        final void zza(com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
            com.google.android.gms.internal.clearcut.zzas zzasVar = (com.google.android.gms.internal.clearcut.zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return (int) (this.zzgg - this.zzgi);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, int i2) throws java.io.IOException {
            zzo((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, boolean z) throws java.io.IOException {
            zzb(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j) throws java.io.IOException {
            long j2;
            if (this.zzgi <= this.zzgh) {
                while (true) {
                    long j3 = j & (-128);
                    j2 = this.zzgi;
                    if (j3 == 0) {
                        break;
                    }
                    this.zzgi = j2 + 1;
                    com.google.android.gms.internal.clearcut.zzfd.zza(j2, (byte) ((((int) j) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128));
                    j >>>= 7;
                }
            } else {
                while (true) {
                    j2 = this.zzgi;
                    if (j2 >= this.zzgg) {
                        throw new com.google.android.gms.internal.clearcut.zzbn.zzc(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.zzgi), java.lang.Long.valueOf(this.zzgg), 1));
                    }
                    if ((j & (-128)) != 0) {
                        this.zzgi = j2 + 1;
                        com.google.android.gms.internal.clearcut.zzfd.zza(j2, (byte) ((((int) j) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128));
                        j >>>= 7;
                    }
                }
            }
            this.zzgi = 1 + j2;
            com.google.android.gms.internal.clearcut.zzfd.zza(j2, (byte) j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, int i2) throws java.io.IOException {
            zzb(i, 0);
            zzn(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, long j) throws java.io.IOException {
            zzb(i, 1);
            zzd(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i, int i2) throws java.io.IOException {
            zzb(i, 0);
            zzo(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j) throws java.io.IOException {
            this.zzgd.putLong((int) (this.zzgi - this.zzge), j);
            this.zzgi += 8;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] bArr, int i, int i2) throws java.io.IOException {
            zzo(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i, int i2) throws java.io.IOException {
            zzb(i, 5);
            zzq(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(java.lang.String str) throws java.io.IOException {
            long j = this.zzgi;
            try {
                int iZzt = zzt(str.length() * 3);
                int iZzt2 = zzt(str.length());
                if (iZzt2 != iZzt) {
                    int iZza = com.google.android.gms.internal.clearcut.zzff.zza(str);
                    zzo(iZza);
                    zzk(this.zzgi);
                    com.google.android.gms.internal.clearcut.zzff.zza(str, this.zzgd);
                    this.zzgi += (long) iZza;
                    return;
                }
                int i = ((int) (this.zzgi - this.zzge)) + iZzt2;
                this.zzgd.position(i);
                com.google.android.gms.internal.clearcut.zzff.zza(str, this.zzgd);
                int iPosition = this.zzgd.position() - i;
                zzo(iPosition);
                this.zzgi += (long) iPosition;
            } catch (com.google.android.gms.internal.clearcut.zzfi e) {
                this.zzgi = j;
                zzk(j);
                zza(str, e);
            } catch (java.lang.IllegalArgumentException e2) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e2);
            } catch (java.lang.IndexOutOfBoundsException e3) {
                throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i) throws java.io.IOException {
            if (i >= 0) {
                zzo(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i) throws java.io.IOException {
            long j;
            if (this.zzgi <= this.zzgh) {
                while ((i & (-128)) != 0) {
                    long j2 = this.zzgi;
                    this.zzgi = j2 + 1;
                    com.google.android.gms.internal.clearcut.zzfd.zza(j2, (byte) ((i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128));
                    i >>>= 7;
                }
                j = this.zzgi;
            } else {
                while (true) {
                    j = this.zzgi;
                    if (j >= this.zzgg) {
                        throw new com.google.android.gms.internal.clearcut.zzbn.zzc(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(this.zzgi), java.lang.Long.valueOf(this.zzgg), 1));
                    }
                    if ((i & (-128)) != 0) {
                        this.zzgi = j + 1;
                        com.google.android.gms.internal.clearcut.zzfd.zza(j, (byte) ((i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128));
                        i >>>= 7;
                    }
                }
            }
            this.zzgi = 1 + j;
            com.google.android.gms.internal.clearcut.zzfd.zza(j, (byte) i);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i) throws java.io.IOException {
            this.zzgd.putInt((int) (this.zzgi - this.zzge), i);
            this.zzgi += 4;
        }
    }

    private zzbn() {
    }

    public static int zza(int i, com.google.android.gms.internal.clearcut.zzcv zzcvVar) {
        int iZzr = zzr(i);
        int iZzas = zzcvVar.zzas();
        return iZzr + zzt(iZzas) + iZzas;
    }

    public static int zza(com.google.android.gms.internal.clearcut.zzcv zzcvVar) {
        int iZzas = zzcvVar.zzas();
        return zzt(iZzas) + iZzas;
    }

    public static com.google.android.gms.internal.clearcut.zzbn zza(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new com.google.android.gms.internal.clearcut.zzbn.zzb(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new java.lang.IllegalArgumentException("ByteBuffer is read-only");
        }
        return com.google.android.gms.internal.clearcut.zzfd.zzee() ? new com.google.android.gms.internal.clearcut.zzbn.zze(byteBuffer) : new com.google.android.gms.internal.clearcut.zzbn.zzd(byteBuffer);
    }

    public static int zzb(double d) {
        return 8;
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzb(int i, double d) {
        return zzr(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzr(i) + 4;
    }

    public static int zzb(int i, com.google.android.gms.internal.clearcut.zzcv zzcvVar) {
        return (zzr(1) << 1) + zzh(2, i) + zza(3, zzcvVar);
    }

    static int zzb(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzef zzefVar) {
        return zzr(i) + zzb(zzdoVar, zzefVar);
    }

    public static int zzb(int i, java.lang.String str) {
        return zzr(i) + zzh(str);
    }

    public static int zzb(com.google.android.gms.internal.clearcut.zzbb zzbbVar) {
        int size = zzbbVar.size();
        return zzt(size) + size;
    }

    static int zzb(com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzef zzefVar) {
        com.google.android.gms.internal.clearcut.zzas zzasVar = (com.google.android.gms.internal.clearcut.zzas) zzdoVar;
        int iZzs = zzasVar.zzs();
        if (iZzs == -1) {
            iZzs = zzefVar.zzm(zzasVar);
            zzasVar.zzf(iZzs);
        }
        return zzt(iZzs) + iZzs;
    }

    public static int zzb(boolean z) {
        return 1;
    }

    public static int zzc(int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) {
        int iZzr = zzr(i);
        int size = zzbbVar.size();
        return iZzr + zzt(size) + size;
    }

    public static int zzc(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        return zzr(i) + zzc(zzdoVar);
    }

    @java.lang.Deprecated
    static int zzc(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzef zzefVar) {
        int iZzr = zzr(i) << 1;
        com.google.android.gms.internal.clearcut.zzas zzasVar = (com.google.android.gms.internal.clearcut.zzas) zzdoVar;
        int iZzs = zzasVar.zzs();
        if (iZzs == -1) {
            iZzs = zzefVar.zzm(zzasVar);
            zzasVar.zzf(iZzs);
        }
        return iZzr + iZzs;
    }

    public static int zzc(int i, boolean z) {
        return zzr(i) + 1;
    }

    public static int zzc(com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        int iZzas = zzdoVar.zzas();
        return zzt(iZzas) + iZzas;
    }

    public static com.google.android.gms.internal.clearcut.zzbn zzc(byte[] bArr) {
        return new com.google.android.gms.internal.clearcut.zzbn.zza(bArr, 0, bArr.length);
    }

    public static int zzd(int i, long j) {
        return zzr(i) + zzf(j);
    }

    public static int zzd(int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) {
        return (zzr(1) << 1) + zzh(2, i) + zzc(3, zzbbVar);
    }

    public static int zzd(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        return (zzr(1) << 1) + zzh(2, i) + zzc(3, zzdoVar);
    }

    @java.lang.Deprecated
    public static int zzd(com.google.android.gms.internal.clearcut.zzdo zzdoVar) {
        return zzdoVar.zzas();
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        return zzt(length) + length;
    }

    public static int zze(int i, long j) {
        return zzr(i) + zzf(j);
    }

    public static int zze(long j) {
        return zzf(j);
    }

    public static int zzf(int i, long j) {
        return zzr(i) + zzf(zzj(j));
    }

    public static int zzf(long j) {
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

    public static int zzg(int i, int i2) {
        return zzr(i) + zzs(i2);
    }

    public static int zzg(int i, long j) {
        return zzr(i) + 8;
    }

    public static int zzg(long j) {
        return zzf(zzj(j));
    }

    public static int zzh(int i, int i2) {
        return zzr(i) + zzt(i2);
    }

    public static int zzh(int i, long j) {
        return zzr(i) + 8;
    }

    public static int zzh(long j) {
        return 8;
    }

    public static int zzh(java.lang.String str) {
        int length;
        try {
            length = com.google.android.gms.internal.clearcut.zzff.zza(str);
        } catch (com.google.android.gms.internal.clearcut.zzfi unused) {
            length = str.getBytes(com.google.android.gms.internal.clearcut.zzci.UTF_8).length;
        }
        return zzt(length) + length;
    }

    public static int zzi(int i, int i2) {
        return zzr(i) + zzt(zzy(i2));
    }

    public static int zzi(long j) {
        return 8;
    }

    public static int zzj(int i, int i2) {
        return zzr(i) + 4;
    }

    private static long zzj(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzk(int i, int i2) {
        return zzr(i) + 4;
    }

    public static int zzl(int i, int i2) {
        return zzr(i) + zzs(i2);
    }

    public static int zzr(int i) {
        return zzt(i << 3);
    }

    public static int zzs(int i) {
        if (i >= 0) {
            return zzt(i);
        }
        return 10;
    }

    public static int zzt(int i) {
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

    public static int zzu(int i) {
        return zzt(zzy(i));
    }

    public static int zzv(int i) {
        return 4;
    }

    public static int zzw(int i) {
        return 4;
    }

    public static int zzx(int i) {
        return zzs(i);
    }

    private static int zzy(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @java.lang.Deprecated
    public static int zzz(int i) {
        return zzt(i);
    }

    public abstract void flush() throws java.io.IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws java.io.IOException;

    public abstract void zza(byte b) throws java.io.IOException;

    public final void zza(double d) throws java.io.IOException {
        zzd(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void zza(float f) throws java.io.IOException {
        zzq(java.lang.Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) throws java.io.IOException {
        zzc(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void zza(int i, float f) throws java.io.IOException {
        zzf(i, java.lang.Float.floatToRawIntBits(f));
    }

    public abstract void zza(int i, long j) throws java.io.IOException;

    public abstract void zza(int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException;

    public abstract void zza(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException;

    abstract void zza(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException;

    public abstract void zza(int i, java.lang.String str) throws java.io.IOException;

    public abstract void zza(com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException;

    abstract void zza(com.google.android.gms.internal.clearcut.zzdo zzdoVar, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException;

    final void zza(java.lang.String str, com.google.android.gms.internal.clearcut.zzfi zzfiVar) throws java.io.IOException {
        logger.logp(java.util.logging.Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) zzfiVar);
        byte[] bytes = str.getBytes(com.google.android.gms.internal.clearcut.zzci.UTF_8);
        try {
            zzo(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (com.google.android.gms.internal.clearcut.zzbn.zzc e) {
            throw e;
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.clearcut.zzbn.zzc(e2);
        }
    }

    public final void zza(boolean z) throws java.io.IOException {
        zza(z ? (byte) 1 : (byte) 0);
    }

    public abstract int zzag();

    public abstract void zzb(int i, int i2) throws java.io.IOException;

    public final void zzb(int i, long j) throws java.io.IOException {
        zza(i, zzj(j));
    }

    public abstract void zzb(int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException;

    public abstract void zzb(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException;

    public abstract void zzb(int i, boolean z) throws java.io.IOException;

    public abstract void zzb(long j) throws java.io.IOException;

    public abstract void zzb(com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException;

    public abstract void zzc(int i, int i2) throws java.io.IOException;

    public abstract void zzc(int i, long j) throws java.io.IOException;

    public final void zzc(long j) throws java.io.IOException {
        zzb(zzj(j));
    }

    public abstract void zzd(int i, int i2) throws java.io.IOException;

    public abstract void zzd(long j) throws java.io.IOException;

    abstract void zzd(byte[] bArr, int i, int i2) throws java.io.IOException;

    public final void zze(int i, int i2) throws java.io.IOException {
        zzd(i, zzy(i2));
    }

    public abstract void zzf(int i, int i2) throws java.io.IOException;

    public abstract void zzg(java.lang.String str) throws java.io.IOException;

    public abstract void zzn(int i) throws java.io.IOException;

    public abstract void zzo(int i) throws java.io.IOException;

    public final void zzp(int i) throws java.io.IOException {
        zzo(zzy(i));
    }

    public abstract void zzq(int i) throws java.io.IOException;
}
