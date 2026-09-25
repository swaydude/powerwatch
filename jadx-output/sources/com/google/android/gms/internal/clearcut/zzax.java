package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzax {
    static int zza(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.clearcut.zzay zzayVar) throws com.google.android.gms.internal.clearcut.zzco {
        if ((i >>> 3) == 0) {
            throw com.google.android.gms.internal.clearcut.zzco.zzbm();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzb(bArr, i2, zzayVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zzayVar) + zzayVar.zzfd;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw com.google.android.gms.internal.clearcut.zzco.zzbm();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zzayVar);
            i6 = zzayVar.zzfd;
            if (i6 == i5) {
                break;
            }
            i2 = zza(i6, bArr, i2, i3, zzayVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw com.google.android.gms.internal.clearcut.zzco.zzbo();
        }
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.clearcut.zzcn<?> zzcnVar, com.google.android.gms.internal.clearcut.zzay zzayVar) {
        com.google.android.gms.internal.clearcut.zzch zzchVar = (com.google.android.gms.internal.clearcut.zzch) zzcnVar;
        int iZza = zza(bArr, i2, zzayVar);
        while (true) {
            zzchVar.zzac(zzayVar.zzfd);
            if (iZza >= i3) {
                break;
            }
            int iZza2 = zza(bArr, iZza, zzayVar);
            if (i != zzayVar.zzfd) {
                break;
            }
            iZza = zza(bArr, iZza2, zzayVar);
        }
        return iZza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.clearcut.zzey zzeyVar, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        if ((i >>> 3) == 0) {
            throw com.google.android.gms.internal.clearcut.zzco.zzbm();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzb = zzb(bArr, i2, zzayVar);
            zzeyVar.zzb(i, java.lang.Long.valueOf(zzayVar.zzfe));
            return iZzb;
        }
        if (i4 == 1) {
            zzeyVar.zzb(i, java.lang.Long.valueOf(zzd(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZza = zza(bArr, i2, zzayVar);
            int i5 = zzayVar.zzfd;
            zzeyVar.zzb(i, i5 == 0 ? com.google.android.gms.internal.clearcut.zzbb.zzfi : com.google.android.gms.internal.clearcut.zzbb.zzb(bArr, iZza, i5));
            return iZza + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw com.google.android.gms.internal.clearcut.zzco.zzbm();
            }
            zzeyVar.zzb(i, java.lang.Integer.valueOf(zzc(bArr, i2)));
            return i2 + 4;
        }
        com.google.android.gms.internal.clearcut.zzey zzeyVarZzeb = com.google.android.gms.internal.clearcut.zzey.zzeb();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (i2 < i3) {
            int iZza2 = zza(bArr, i2, zzayVar);
            int i8 = zzayVar.zzfd;
            i7 = i8;
            if (i8 == i6) {
                i2 = iZza2;
                break;
            }
            int iZza3 = zza(i7, bArr, iZza2, i3, zzeyVarZzeb, zzayVar);
            i7 = i8;
            i2 = iZza3;
        }
        if (i2 > i3 || i7 != i6) {
            throw com.google.android.gms.internal.clearcut.zzco.zzbo();
        }
        zzeyVar.zzb(i, zzeyVarZzeb);
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, com.google.android.gms.internal.clearcut.zzay zzayVar) {
        int i3;
        int i4;
        int i5 = i & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            int i7 = i5 | ((b & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & kotlin.jvm.internal.ByteCompanionObject.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                zzayVar.zzfd = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            zzayVar.zzfd = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        zzayVar.zzfd = i5 | i4;
        return i6;
    }

    static int zza(byte[] bArr, int i, com.google.android.gms.internal.clearcut.zzay zzayVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zza(b, bArr, i2, zzayVar);
        }
        zzayVar.zzfd = b;
        return i2;
    }

    static int zza(byte[] bArr, int i, com.google.android.gms.internal.clearcut.zzcn<?> zzcnVar, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        com.google.android.gms.internal.clearcut.zzch zzchVar = (com.google.android.gms.internal.clearcut.zzch) zzcnVar;
        int iZza = zza(bArr, i, zzayVar);
        int i2 = zzayVar.zzfd + iZza;
        while (iZza < i2) {
            iZza = zza(bArr, iZza, zzayVar);
            zzchVar.zzac(zzayVar.zzfd);
        }
        if (iZza == i2) {
            return iZza;
        }
        throw com.google.android.gms.internal.clearcut.zzco.zzbl();
    }

    static int zzb(byte[] bArr, int i, com.google.android.gms.internal.clearcut.zzay zzayVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzayVar.zzfe = j;
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
        zzayVar.zzfe = j2;
        return i3;
    }

    static int zzc(byte[] bArr, int i) {
        return ((bArr[i + 3] & kotlin.UByte.MAX_VALUE) << 24) | (bArr[i] & kotlin.UByte.MAX_VALUE) | ((bArr[i + 1] & kotlin.UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & kotlin.UByte.MAX_VALUE) << 16);
    }

    static int zzc(byte[] bArr, int i, com.google.android.gms.internal.clearcut.zzay zzayVar) {
        int iZza = zza(bArr, i, zzayVar);
        int i2 = zzayVar.zzfd;
        if (i2 == 0) {
            zzayVar.zzff = "";
            return iZza;
        }
        zzayVar.zzff = new java.lang.String(bArr, iZza, i2, com.google.android.gms.internal.clearcut.zzci.UTF_8);
        return iZza + i2;
    }

    static int zzd(byte[] bArr, int i, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        int iZza = zza(bArr, i, zzayVar);
        int i2 = zzayVar.zzfd;
        if (i2 == 0) {
            zzayVar.zzff = "";
            return iZza;
        }
        int i3 = iZza + i2;
        if (!com.google.android.gms.internal.clearcut.zzff.zze(bArr, iZza, i3)) {
            throw com.google.android.gms.internal.clearcut.zzco.zzbp();
        }
        zzayVar.zzff = new java.lang.String(bArr, iZza, i2, com.google.android.gms.internal.clearcut.zzci.UTF_8);
        return i3;
    }

    static long zzd(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double zze(byte[] bArr, int i) {
        return java.lang.Double.longBitsToDouble(zzd(bArr, i));
    }

    static int zze(byte[] bArr, int i, com.google.android.gms.internal.clearcut.zzay zzayVar) {
        int iZza = zza(bArr, i, zzayVar);
        int i2 = zzayVar.zzfd;
        if (i2 == 0) {
            zzayVar.zzff = com.google.android.gms.internal.clearcut.zzbb.zzfi;
            return iZza;
        }
        zzayVar.zzff = com.google.android.gms.internal.clearcut.zzbb.zzb(bArr, iZza, i2);
        return iZza + i2;
    }

    static float zzf(byte[] bArr, int i) {
        return java.lang.Float.intBitsToFloat(zzc(bArr, i));
    }
}
