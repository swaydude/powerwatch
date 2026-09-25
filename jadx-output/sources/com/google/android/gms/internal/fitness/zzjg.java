package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzjg extends com.google.android.gms.internal.fitness.zzjb {
    zzjg() {
    }

    @Override // com.google.android.gms.internal.fitness.zzjb
    final int zzb(int i, byte[] bArr, int i2, int i3) {
        int i4;
        long j;
        if ((i2 | i3 | (bArr.length - i3)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("Array length=%d, index=%d, limit=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        }
        long j2 = i2;
        int i5 = (int) (((long) i3) - j2);
        if (i5 >= 16) {
            long j3 = j2;
            i4 = 0;
            while (true) {
                if (i4 >= i5) {
                    i4 = i5;
                    break;
                }
                long j4 = j3 + 1;
                if (com.google.android.gms.internal.fitness.zzja.zza(bArr, j3) < 0) {
                    break;
                }
                i4++;
                j3 = j4;
            }
        } else {
            i4 = 0;
        }
        int i6 = i5 - i4;
        long j5 = j2 + ((long) i4);
        while (true) {
            byte bZza = 0;
            while (i6 > 0) {
                long j6 = j5 + 1;
                bZza = com.google.android.gms.internal.fitness.zzja.zza(bArr, j5);
                if (bZza < 0) {
                    j5 = j6;
                    break;
                }
                i6--;
                j5 = j6;
            }
            if (i6 == 0) {
                return 0;
            }
            int i7 = i6 - 1;
            if (bZza < -32) {
                if (i7 == 0) {
                    return bZza;
                }
                i6 = i7 - 1;
                if (bZza >= -62) {
                    j = j5 + 1;
                    if (com.google.android.gms.internal.fitness.zzja.zza(bArr, j5) > -65) {
                    }
                }
                return -1;
            }
            if (bZza >= -16) {
                if (i7 < 3) {
                    return zza(bArr, bZza, j5, i7);
                }
                i6 = i7 - 3;
                long j7 = j5 + 1;
                byte bZza2 = com.google.android.gms.internal.fitness.zzja.zza(bArr, j5);
                if (bZza2 <= -65 && (((bZza << 28) + (bZza2 + 112)) >> 30) == 0) {
                    long j8 = j7 + 1;
                    if (com.google.android.gms.internal.fitness.zzja.zza(bArr, j7) <= -65) {
                        j = j8 + 1;
                        if (com.google.android.gms.internal.fitness.zzja.zza(bArr, j8) > -65) {
                        }
                    }
                }
                return -1;
            }
            if (i7 < 2) {
                return zza(bArr, bZza, j5, i7);
            }
            i6 = i7 - 2;
            long j9 = j5 + 1;
            byte bZza3 = com.google.android.gms.internal.fitness.zzja.zza(bArr, j5);
            if (bZza3 <= -65 && ((bZza != -32 || bZza3 >= -96) && (bZza != -19 || bZza3 < -96))) {
                j5 = j9 + 1;
                if (com.google.android.gms.internal.fitness.zzja.zza(bArr, j9) > -65) {
                }
            }
            return -1;
            j5 = j;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjb
    final int zza(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        int i3;
        char cCharAt;
        long j4 = i;
        long j5 = ((long) i2) + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char cCharAt2 = charSequence.charAt(length - 1);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(cCharAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            com.google.android.gms.internal.fitness.zzja.zza(bArr, j4, (byte) cCharAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char cCharAt3 = charSequence.charAt(i4);
            if (cCharAt3 >= c || j4 >= j5) {
                if (cCharAt3 < 2048 && j4 <= j5 - 2) {
                    long j6 = j4 + j;
                    com.google.android.gms.internal.fitness.zzja.zza(bArr, j4, (byte) ((cCharAt3 >>> 6) | 960));
                    com.google.android.gms.internal.fitness.zzja.zza(bArr, j6, (byte) ((cCharAt3 & '?') | 128));
                    j2 = j6 + j;
                    j3 = j;
                } else {
                    if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j4 > j5 - 3) {
                        if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char cCharAt4 = charSequence.charAt(i5);
                                if (java.lang.Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = java.lang.Character.toCodePoint(cCharAt3, cCharAt4);
                                    long j7 = j4 + 1;
                                    com.google.android.gms.internal.fitness.zzja.zza(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    long j8 = j7 + 1;
                                    com.google.android.gms.internal.fitness.zzja.zza(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j9 = j8 + 1;
                                    com.google.android.gms.internal.fitness.zzja.zza(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 = 1;
                                    j2 = j9 + 1;
                                    com.google.android.gms.internal.fitness.zzja.zza(bArr, j9, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new com.google.android.gms.internal.fitness.zzjd(i4 - 1, length);
                        }
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i4 + 1) == length || !java.lang.Character.isSurrogatePair(cCharAt3, charSequence.charAt(i3)))) {
                            throw new com.google.android.gms.internal.fitness.zzjd(i4, length);
                        }
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(cCharAt3);
                        sb2.append(" at index ");
                        sb2.append(j4);
                        throw new java.lang.ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    long j10 = j4 + j;
                    com.google.android.gms.internal.fitness.zzja.zza(bArr, j4, (byte) ((cCharAt3 >>> '\f') | 480));
                    long j11 = j10 + j;
                    com.google.android.gms.internal.fitness.zzja.zza(bArr, j10, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                    com.google.android.gms.internal.fitness.zzja.zza(bArr, j11, (byte) ((cCharAt3 & '?') | 128));
                    j2 = j11 + 1;
                    j3 = 1;
                }
                i4++;
                c = 128;
                long j12 = j3;
                j4 = j2;
                j = j12;
            } else {
                long j13 = j4 + j;
                com.google.android.gms.internal.fitness.zzja.zza(bArr, j4, (byte) cCharAt3);
                j3 = j;
                j2 = j13;
            }
            i4++;
            c = 128;
            long j14 = j3;
            j4 = j2;
            j = j14;
        }
        return (int) j4;
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return com.google.android.gms.internal.fitness.zzjc.zzal(i);
        }
        if (i2 == 1) {
            return com.google.android.gms.internal.fitness.zzjc.zzo(i, com.google.android.gms.internal.fitness.zzja.zza(bArr, j));
        }
        if (i2 == 2) {
            return com.google.android.gms.internal.fitness.zzjc.zzc(i, com.google.android.gms.internal.fitness.zzja.zza(bArr, j), com.google.android.gms.internal.fitness.zzja.zza(bArr, j + 1));
        }
        throw new java.lang.AssertionError();
    }
}
