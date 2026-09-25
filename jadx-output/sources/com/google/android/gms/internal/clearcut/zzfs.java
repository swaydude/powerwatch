package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzfs {
    private final java.nio.ByteBuffer zzgd;
    private com.google.android.gms.internal.clearcut.zzbn zzrh;
    private int zzri;

    private zzfs(java.nio.ByteBuffer byteBuffer) {
        this.zzgd = byteBuffer;
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    private zzfs(byte[] bArr, int i, int i2) {
        this(java.nio.ByteBuffer.wrap(bArr, i, i2));
    }

    private static int zza(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(charSequence, i2) < 65536) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new java.lang.IllegalArgumentException(sb.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j);
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    private final void zzao(int i) throws java.io.IOException {
        byte b = (byte) i;
        if (!this.zzgd.hasRemaining()) {
            throw new com.google.android.gms.internal.clearcut.zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(b);
    }

    private final void zzap(int i) throws java.io.IOException {
        while ((i & (-128)) != 0) {
            zzao((i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128);
            i >>>= 7;
        }
        zzao(i);
    }

    public static int zzb(int i, com.google.android.gms.internal.clearcut.zzfz zzfzVar) {
        int iZzr = zzr(i);
        int iZzas = zzfzVar.zzas();
        return iZzr + zzz(iZzas) + iZzas;
    }

    public static int zzb(int i, java.lang.String str) {
        return zzr(i) + zzh(str);
    }

    public static int zzb(int i, byte[] bArr) {
        return zzr(i) + zzh(bArr);
    }

    public static int zzd(int i, long j) {
        return zzr(i) + zzo(j);
    }

    private static void zzd(java.lang.CharSequence charSequence, java.nio.ByteBuffer byteBuffer) {
        int i;
        int i2;
        char cCharAt;
        int i3;
        int i4;
        if (byteBuffer.isReadOnly()) {
            throw new java.nio.ReadOnlyBufferException();
        }
        int i5 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 >= 128) {
                    if (cCharAt2 < 2048) {
                        i3 = (cCharAt2 >>> 6) | 960;
                    } else {
                        if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                            int i6 = i5 + 1;
                            if (i6 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i6);
                                if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                    byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint & 63) | 128));
                                    i5 = i6;
                                } else {
                                    i5 = i6;
                                }
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(39);
                            sb.append("Unpaired surrogate at index ");
                            sb.append(i5 - 1);
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                        byteBuffer.put((byte) ((cCharAt2 >>> '\f') | 480));
                        i3 = ((cCharAt2 >>> 6) & 63) | 128;
                    }
                    byteBuffer.put((byte) i3);
                    i4 = (cCharAt2 & '?') | 128;
                    i4 = cCharAt2;
                    byteBuffer.put((byte) i4);
                } else {
                    i4 = cCharAt2;
                    byteBuffer.put((byte) i4);
                }
                i5++;
            }
            return;
        }
        try {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i7 = iRemaining + iArrayOffset;
            while (i5 < length2) {
                int i8 = i5 + iArrayOffset;
                if (i8 >= i7 || (cCharAt = charSequence.charAt(i5)) >= 128) {
                    break;
                }
                bArrArray[i8] = (byte) cCharAt;
                i5++;
            }
            if (i5 == length2) {
                i = iArrayOffset + length2;
            } else {
                i = iArrayOffset + i5;
                while (i5 < length2) {
                    char cCharAt4 = charSequence.charAt(i5);
                    if (cCharAt4 >= 128 || i >= i7) {
                        if (cCharAt4 < 2048 && i <= i7 - 2) {
                            int i9 = i + 1;
                            bArrArray[i] = (byte) ((cCharAt4 >>> 6) | 960);
                            i = i9 + 1;
                            bArrArray[i9] = (byte) ((cCharAt4 & '?') | 128);
                        } else {
                            if ((cCharAt4 >= 55296 && 57343 >= cCharAt4) || i > i7 - 3) {
                                if (i > i7 - 4) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(37);
                                    sb2.append("Failed writing ");
                                    sb2.append(cCharAt4);
                                    sb2.append(" at index ");
                                    sb2.append(i);
                                    throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
                                }
                                int i10 = i5 + 1;
                                if (i10 != charSequence.length()) {
                                    char cCharAt5 = charSequence.charAt(i10);
                                    if (java.lang.Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                        int codePoint2 = java.lang.Character.toCodePoint(cCharAt4, cCharAt5);
                                        int i11 = i + 1;
                                        bArrArray[i] = (byte) ((codePoint2 >>> 18) | 240);
                                        int i12 = i11 + 1;
                                        bArrArray[i11] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                        int i13 = i12 + 1;
                                        bArrArray[i12] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                        i = i13 + 1;
                                        bArrArray[i13] = (byte) ((codePoint2 & 63) | 128);
                                        i5 = i10;
                                    } else {
                                        i5 = i10;
                                    }
                                }
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(39);
                                sb3.append("Unpaired surrogate at index ");
                                sb3.append(i5 - 1);
                                throw new java.lang.IllegalArgumentException(sb3.toString());
                            }
                            int i14 = i + 1;
                            bArrArray[i] = (byte) ((cCharAt4 >>> '\f') | 480);
                            int i15 = i14 + 1;
                            bArrArray[i14] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                            i2 = i15 + 1;
                            bArrArray[i15] = (byte) ((cCharAt4 & '?') | 128);
                        }
                        i5++;
                    } else {
                        i2 = i + 1;
                        bArrArray[i] = (byte) cCharAt4;
                    }
                    i = i2;
                    i5++;
                }
            }
            byteBuffer.position(i - byteBuffer.arrayOffset());
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            java.nio.BufferOverflowException bufferOverflowException = new java.nio.BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    public static com.google.android.gms.internal.clearcut.zzfs zzg(byte[] bArr) {
        return zzh(bArr, 0, bArr.length);
    }

    public static int zzh(java.lang.String str) {
        int iZza = zza(str);
        return zzz(iZza) + iZza;
    }

    public static int zzh(byte[] bArr) {
        return zzz(bArr.length) + bArr.length;
    }

    public static com.google.android.gms.internal.clearcut.zzfs zzh(byte[] bArr, int i, int i2) {
        return new com.google.android.gms.internal.clearcut.zzfs(bArr, 0, i2);
    }

    public static long zzj(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzo(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int zzr(int i) {
        return zzz(i << 3);
    }

    public static int zzs(int i) {
        if (i >= 0) {
            return zzz(i);
        }
        return 10;
    }

    private static int zzz(int i) {
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

    public final void zza(int i, com.google.android.gms.internal.clearcut.zzfz zzfzVar) throws java.io.IOException {
        zzb(i, 2);
        if (zzfzVar.zzrs < 0) {
            zzfzVar.zzas();
        }
        zzap(zzfzVar.zzrs);
        zzfzVar.zza(this);
    }

    public final void zza(int i, java.lang.String str) throws java.io.IOException {
        zzb(i, 2);
        try {
            int iZzz = zzz(str.length());
            if (iZzz != zzz(str.length() * 3)) {
                zzap(zza(str));
                zzd(str, this.zzgd);
                return;
            }
            int iPosition = this.zzgd.position();
            if (this.zzgd.remaining() < iZzz) {
                throw new com.google.android.gms.internal.clearcut.zzft(iPosition + iZzz, this.zzgd.limit());
            }
            this.zzgd.position(iPosition + iZzz);
            zzd(str, this.zzgd);
            int iPosition2 = this.zzgd.position();
            this.zzgd.position(iPosition);
            zzap((iPosition2 - iPosition) - iZzz);
            this.zzgd.position(iPosition2);
        } catch (java.nio.BufferOverflowException e) {
            com.google.android.gms.internal.clearcut.zzft zzftVar = new com.google.android.gms.internal.clearcut.zzft(this.zzgd.position(), this.zzgd.limit());
            zzftVar.initCause(e);
            throw zzftVar;
        }
    }

    public final void zza(int i, byte[] bArr) throws java.io.IOException {
        zzb(i, 2);
        zzap(bArr.length);
        int length = bArr.length;
        if (this.zzgd.remaining() < length) {
            throw new com.google.android.gms.internal.clearcut.zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(bArr, 0, length);
    }

    public final void zzb(int i, int i2) throws java.io.IOException {
        zzap((i << 3) | i2);
    }

    public final void zzb(int i, boolean z) throws java.io.IOException {
        zzb(25, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        if (!this.zzgd.hasRemaining()) {
            throw new com.google.android.gms.internal.clearcut.zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(b);
    }

    public final void zzc(int i, int i2) throws java.io.IOException {
        zzb(i, 0);
        if (i2 >= 0) {
            zzap(i2);
        } else {
            zzn(i2);
        }
    }

    public final void zze(int i, com.google.android.gms.internal.clearcut.zzdo zzdoVar) throws java.io.IOException {
        if (this.zzrh != null) {
            if (this.zzri != this.zzgd.position()) {
                this.zzrh.write(this.zzgd.array(), this.zzri, this.zzgd.position() - this.zzri);
            }
            com.google.android.gms.internal.clearcut.zzbn zzbnVar = this.zzrh;
            zzbnVar.zza(i, zzdoVar);
            zzbnVar.flush();
            this.zzri = this.zzgd.position();
        }
        this.zzrh = com.google.android.gms.internal.clearcut.zzbn.zza(this.zzgd);
        this.zzri = this.zzgd.position();
        com.google.android.gms.internal.clearcut.zzbn zzbnVar2 = this.zzrh;
        zzbnVar2.zza(i, zzdoVar);
        zzbnVar2.flush();
        this.zzri = this.zzgd.position();
    }

    public final void zzem() {
        if (this.zzgd.remaining() != 0) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Did not write as much data as expected, %s bytes remaining.", java.lang.Integer.valueOf(this.zzgd.remaining())));
        }
    }

    public final void zzi(int i, long j) throws java.io.IOException {
        zzb(i, 0);
        zzn(j);
    }

    public final void zzn(long j) throws java.io.IOException {
        while (((-128) & j) != 0) {
            zzao((((int) j) & kotlinx.coroutines.scheduling.WorkQueueKt.MASK) | 128);
            j >>>= 7;
        }
        zzao((int) j);
    }
}
