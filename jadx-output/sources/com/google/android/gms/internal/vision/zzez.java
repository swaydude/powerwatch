package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzez {
    static int zza(byte[] bArr, int i, com.google.android.gms.internal.vision.zzfb zzfbVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zza(b, bArr, i2, zzfbVar);
        }
        zzfbVar.zzro = b;
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, com.google.android.gms.internal.vision.zzfb zzfbVar) {
        int i3 = i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzfbVar.zzro = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzfbVar.zzro = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzfbVar.zzro = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzfbVar.zzro = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzfbVar.zzro = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzb(byte[] bArr, int i, com.google.android.gms.internal.vision.zzfb zzfbVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzfbVar.zzrp = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE)) << i4;
            b = b2;
            i3 = i5;
        }
        zzfbVar.zzrp = j2;
        return i3;
    }

    static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & kotlin.UByte.MAX_VALUE) << 24) | (bArr[i] & kotlin.UByte.MAX_VALUE) | ((bArr[i + 1] & kotlin.UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & kotlin.UByte.MAX_VALUE) << 16);
    }

    static long zzb(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double zzc(byte[] bArr, int i) {
        return java.lang.Double.longBitsToDouble(zzb(bArr, i));
    }

    static float zzd(byte[] bArr, int i) {
        return java.lang.Float.intBitsToFloat(zza(bArr, i));
    }

    static int zzc(byte[] bArr, int i, com.google.android.gms.internal.vision.zzfb zzfbVar) throws com.google.android.gms.internal.vision.zzhc {
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro;
        if (i2 < 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgn();
        }
        if (i2 == 0) {
            zzfbVar.zzrq = "";
            return iZza;
        }
        zzfbVar.zzrq = new java.lang.String(bArr, iZza, i2, com.google.android.gms.internal.vision.zzgt.UTF_8);
        return iZza + i2;
    }

    static int zzd(byte[] bArr, int i, com.google.android.gms.internal.vision.zzfb zzfbVar) throws com.google.android.gms.internal.vision.zzhc {
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro;
        if (i2 < 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgn();
        }
        if (i2 == 0) {
            zzfbVar.zzrq = "";
            return iZza;
        }
        zzfbVar.zzrq = com.google.android.gms.internal.vision.zzjs.zzh(bArr, iZza, i2);
        return iZza + i2;
    }

    static int zze(byte[] bArr, int i, com.google.android.gms.internal.vision.zzfb zzfbVar) throws com.google.android.gms.internal.vision.zzhc {
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro;
        if (i2 < 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgn();
        }
        if (i2 > bArr.length - iZza) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
        if (i2 == 0) {
            zzfbVar.zzrq = com.google.android.gms.internal.vision.zzfh.zzrx;
            return iZza;
        }
        zzfbVar.zzrq = com.google.android.gms.internal.vision.zzfh.zza(bArr, iZza, i2);
        return iZza + i2;
    }

    static int zza(com.google.android.gms.internal.vision.zzir zzirVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        int iZza = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZza = zza(i3, bArr, iZza, zzfbVar);
            i3 = zzfbVar.zzro;
        }
        int i4 = iZza;
        if (i3 < 0 || i3 > i2 - i4) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
        java.lang.Object objNewInstance = zzirVar.newInstance();
        int i5 = i3 + i4;
        zzirVar.zza(objNewInstance, bArr, i4, i5, zzfbVar);
        zzirVar.zzg(objNewInstance);
        zzfbVar.zzrq = objNewInstance;
        return i5;
    }

    static int zza(com.google.android.gms.internal.vision.zzir zzirVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzig zzigVar = (com.google.android.gms.internal.vision.zzig) zzirVar;
        java.lang.Object objNewInstance = zzigVar.newInstance();
        int iZza = zzigVar.zza(objNewInstance, bArr, i, i2, i3, zzfbVar);
        zzigVar.zzg(objNewInstance);
        zzfbVar.zzrq = objNewInstance;
        return iZza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.vision.zzgz<?> zzgzVar, com.google.android.gms.internal.vision.zzfb zzfbVar) {
        com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) zzgzVar;
        int iZza = zza(bArr, i2, zzfbVar);
        zzguVar.zzbl(zzfbVar.zzro);
        while (iZza < i3) {
            int iZza2 = zza(bArr, iZza, zzfbVar);
            if (i != zzfbVar.zzro) {
                break;
            }
            iZza = zza(bArr, iZza2, zzfbVar);
            zzguVar.zzbl(zzfbVar.zzro);
        }
        return iZza;
    }

    static int zza(byte[] bArr, int i, com.google.android.gms.internal.vision.zzgz<?> zzgzVar, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) zzgzVar;
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro + iZza;
        while (iZza < i2) {
            iZza = zza(bArr, iZza, zzfbVar);
            zzguVar.zzbl(zzfbVar.zzro);
        }
        if (iZza == i2) {
            return iZza;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }

    static int zzb(byte[] bArr, int i, com.google.android.gms.internal.vision.zzgz<?> zzgzVar, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) zzgzVar;
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro + iZza;
        while (iZza < i2) {
            iZza = zzb(bArr, iZza, zzfbVar);
            zzhqVar.zzac(zzfbVar.zzrp);
        }
        if (iZza == i2) {
            return iZza;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }

    static int zzc(byte[] bArr, int i, com.google.android.gms.internal.vision.zzgz<?> zzgzVar, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) zzgzVar;
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro + iZza;
        while (iZza < i2) {
            zzguVar.zzbl(zza(bArr, iZza));
            iZza += 4;
        }
        if (iZza == i2) {
            return iZza;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }

    static int zzd(byte[] bArr, int i, com.google.android.gms.internal.vision.zzgz<?> zzgzVar, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) zzgzVar;
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro + iZza;
        while (iZza < i2) {
            zzhqVar.zzac(zzb(bArr, iZza));
            iZza += 8;
        }
        if (iZza == i2) {
            return iZza;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }

    static int zze(byte[] bArr, int i, com.google.android.gms.internal.vision.zzgz<?> zzgzVar, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzgo zzgoVar = (com.google.android.gms.internal.vision.zzgo) zzgzVar;
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro + iZza;
        while (iZza < i2) {
            zzgoVar.zzu(zzd(bArr, iZza));
            iZza += 4;
        }
        if (iZza == i2) {
            return iZza;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }

    static int zzf(byte[] bArr, int i, com.google.android.gms.internal.vision.zzgz<?> zzgzVar, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzgb zzgbVar = (com.google.android.gms.internal.vision.zzgb) zzgzVar;
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro + iZza;
        while (iZza < i2) {
            zzgbVar.zzc(zzc(bArr, iZza));
            iZza += 8;
        }
        if (iZza == i2) {
            return iZza;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }

    static int zzg(byte[] bArr, int i, com.google.android.gms.internal.vision.zzgz<?> zzgzVar, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzff zzffVar = (com.google.android.gms.internal.vision.zzff) zzgzVar;
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro + iZza;
        while (iZza < i2) {
            iZza = zzb(bArr, iZza, zzfbVar);
            zzffVar.addBoolean(zzfbVar.zzrp != 0);
        }
        if (iZza == i2) {
            return iZza;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }

    static int zzh(byte[] bArr, int i, com.google.android.gms.internal.vision.zzgz<?> zzgzVar, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) zzgzVar;
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro + iZza;
        while (iZza < i2) {
            iZza = zza(bArr, iZza, zzfbVar);
            zzguVar.zzbl(com.google.android.gms.internal.vision.zzft.zzau(zzfbVar.zzro));
        }
        if (iZza == i2) {
            return iZza;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }

    static int zzi(byte[] bArr, int i, com.google.android.gms.internal.vision.zzgz<?> zzgzVar, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) zzgzVar;
        int iZza = zza(bArr, i, zzfbVar);
        int i2 = zzfbVar.zzro + iZza;
        while (iZza < i2) {
            iZza = zzb(bArr, iZza, zzfbVar);
            zzhqVar.zzac(com.google.android.gms.internal.vision.zzft.zzr(zzfbVar.zzrp));
        }
        if (iZza == i2) {
            return iZza;
        }
        throw com.google.android.gms.internal.vision.zzhc.zzgm();
    }

    static int zza(com.google.android.gms.internal.vision.zzir<?> zzirVar, int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.vision.zzgz<?> zzgzVar, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        int iZza = zza(zzirVar, bArr, i2, i3, zzfbVar);
        zzgzVar.add(zzfbVar.zzrq);
        while (iZza < i3) {
            int iZza2 = zza(bArr, iZza, zzfbVar);
            if (i != zzfbVar.zzro) {
                break;
            }
            iZza = zza(zzirVar, bArr, iZza2, i3, zzfbVar);
            zzgzVar.add(zzfbVar.zzrq);
        }
        return iZza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.vision.zzjm zzjmVar, com.google.android.gms.internal.vision.zzfb zzfbVar) throws com.google.android.gms.internal.vision.zzhc {
        if ((i >>> 3) == 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgp();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzb = zzb(bArr, i2, zzfbVar);
            zzjmVar.zzb(i, java.lang.Long.valueOf(zzfbVar.zzrp));
            return iZzb;
        }
        if (i4 == 1) {
            zzjmVar.zzb(i, java.lang.Long.valueOf(zzb(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZza = zza(bArr, i2, zzfbVar);
            int i5 = zzfbVar.zzro;
            if (i5 < 0) {
                throw com.google.android.gms.internal.vision.zzhc.zzgn();
            }
            if (i5 > bArr.length - iZza) {
                throw com.google.android.gms.internal.vision.zzhc.zzgm();
            }
            if (i5 == 0) {
                zzjmVar.zzb(i, com.google.android.gms.internal.vision.zzfh.zzrx);
            } else {
                zzjmVar.zzb(i, com.google.android.gms.internal.vision.zzfh.zza(bArr, iZza, i5));
            }
            return iZza + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzjmVar.zzb(i, java.lang.Integer.valueOf(zza(bArr, i2)));
                return i2 + 4;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgp();
        }
        com.google.android.gms.internal.vision.zzjm zzjmVarZzih = com.google.android.gms.internal.vision.zzjm.zzih();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (i2 < i3) {
            int iZza2 = zza(bArr, i2, zzfbVar);
            int i8 = zzfbVar.zzro;
            i7 = i8;
            if (i8 == i6) {
                i2 = iZza2;
                break;
            }
            int iZza3 = zza(i7, bArr, iZza2, i3, zzjmVarZzih, zzfbVar);
            i7 = i8;
            i2 = iZza3;
        }
        if (i2 > i3 || i7 != i6) {
            throw com.google.android.gms.internal.vision.zzhc.zzgs();
        }
        zzjmVar.zzb(i, zzjmVarZzih);
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.vision.zzfb zzfbVar) throws com.google.android.gms.internal.vision.zzhc {
        if ((i >>> 3) == 0) {
            throw com.google.android.gms.internal.vision.zzhc.zzgp();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzb(bArr, i2, zzfbVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zzfbVar) + zzfbVar.zzro;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw com.google.android.gms.internal.vision.zzhc.zzgp();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zzfbVar);
            i6 = zzfbVar.zzro;
            if (i6 == i5) {
                break;
            }
            i2 = zza(i6, bArr, i2, i3, zzfbVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw com.google.android.gms.internal.vision.zzhc.zzgs();
        }
        return i2;
    }
}
