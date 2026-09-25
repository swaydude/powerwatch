package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzjs {
    private static final com.google.android.gms.internal.vision.zzjt zzabk;

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzbw(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean zzg(byte[] bArr) {
        return zzabk.zzf(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzv(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static boolean zzf(byte[] bArr, int i, int i2) {
        return zzabk.zzf(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzg(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return zzbw(b);
        }
        if (i3 == 1) {
            return zzv(b, bArr[i]);
        }
        if (i3 == 2) {
            return zzd(b, bArr[i], bArr[i + 1]);
        }
        throw new java.lang.AssertionError();
    }

    static int zza(java.lang.CharSequence charSequence) {
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
                                throw new com.google.android.gms.internal.vision.zzjv(i2, length2);
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static int zza(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        return zzabk.zzb(charSequence, bArr, i, i2);
    }

    static java.lang.String zzh(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.vision.zzhc {
        return zzabk.zzh(bArr, i, i2);
    }

    static {
        com.google.android.gms.internal.vision.zzjt zzjwVar;
        if ((com.google.android.gms.internal.vision.zzjp.zzij() && com.google.android.gms.internal.vision.zzjp.zzik()) && !com.google.android.gms.internal.vision.zzfa.zzdr()) {
            zzjwVar = new com.google.android.gms.internal.vision.zzjy();
        } else {
            zzjwVar = new com.google.android.gms.internal.vision.zzjw();
        }
        zzabk = zzjwVar;
    }
}
