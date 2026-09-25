package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzds<T> implements com.google.android.gms.internal.clearcut.zzef<T> {
    private static final sun.misc.Unsafe zzmh = com.google.android.gms.internal.clearcut.zzfd.zzef();
    private final int[] zzmi;
    private final java.lang.Object[] zzmj;
    private final int zzmk;
    private final int zzml;
    private final int zzmm;
    private final com.google.android.gms.internal.clearcut.zzdo zzmn;
    private final boolean zzmo;
    private final boolean zzmp;
    private final boolean zzmq;
    private final boolean zzmr;
    private final int[] zzms;
    private final int[] zzmt;
    private final int[] zzmu;
    private final com.google.android.gms.internal.clearcut.zzdw zzmv;
    private final com.google.android.gms.internal.clearcut.zzcy zzmw;
    private final com.google.android.gms.internal.clearcut.zzex<?, ?> zzmx;
    private final com.google.android.gms.internal.clearcut.zzbu<?> zzmy;
    private final com.google.android.gms.internal.clearcut.zzdj zzmz;

    private zzds(int[] iArr, java.lang.Object[] objArr, int i, int i2, int i3, com.google.android.gms.internal.clearcut.zzdo zzdoVar, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, com.google.android.gms.internal.clearcut.zzdw zzdwVar, com.google.android.gms.internal.clearcut.zzcy zzcyVar, com.google.android.gms.internal.clearcut.zzex<?, ?> zzexVar, com.google.android.gms.internal.clearcut.zzbu<?> zzbuVar, com.google.android.gms.internal.clearcut.zzdj zzdjVar) {
        this.zzmi = iArr;
        this.zzmj = objArr;
        this.zzmk = i;
        this.zzml = i2;
        this.zzmm = i3;
        this.zzmp = zzdoVar instanceof com.google.android.gms.internal.clearcut.zzcg;
        this.zzmq = z;
        this.zzmo = zzbuVar != null && zzbuVar.zze(zzdoVar);
        this.zzmr = false;
        this.zzms = iArr2;
        this.zzmt = iArr3;
        this.zzmu = iArr4;
        this.zzmv = zzdwVar;
        this.zzmw = zzcyVar;
        this.zzmx = zzexVar;
        this.zzmy = zzbuVar;
        this.zzmn = zzdoVar;
        this.zzmz = zzdjVar;
    }

    private static int zza(int i, byte[] bArr, int i2, int i3, java.lang.Object obj, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        return com.google.android.gms.internal.clearcut.zzax.zza(i, bArr, i2, i3, zzn(obj), zzayVar);
    }

    private static int zza(com.google.android.gms.internal.clearcut.zzef<?> zzefVar, int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.clearcut.zzcn<?> zzcnVar, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        int iZza = zza((com.google.android.gms.internal.clearcut.zzef) zzefVar, bArr, i2, i3, zzayVar);
        while (true) {
            zzcnVar.add(zzayVar.zzff);
            if (iZza >= i3) {
                break;
            }
            int iZza2 = com.google.android.gms.internal.clearcut.zzax.zza(bArr, iZza, zzayVar);
            if (i != zzayVar.zzfd) {
                break;
            }
            iZza = zza((com.google.android.gms.internal.clearcut.zzef) zzefVar, bArr, iZza2, i3, zzayVar);
        }
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(com.google.android.gms.internal.clearcut.zzef zzefVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        com.google.android.gms.internal.clearcut.zzds zzdsVar = (com.google.android.gms.internal.clearcut.zzds) zzefVar;
        java.lang.Object objNewInstance = zzdsVar.newInstance();
        int iZza = zzdsVar.zza(objNewInstance, bArr, i, i2, i3, zzayVar);
        zzdsVar.zzc(objNewInstance);
        zzayVar.zzff = objNewInstance;
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int zza(com.google.android.gms.internal.clearcut.zzef zzefVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        int iZza = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZza = com.google.android.gms.internal.clearcut.zzax.zza(i3, bArr, iZza, zzayVar);
            i3 = zzayVar.zzfd;
        }
        int i4 = iZza;
        if (i3 < 0 || i3 > i2 - i4) {
            throw com.google.android.gms.internal.clearcut.zzco.zzbl();
        }
        java.lang.Object objNewInstance = zzefVar.newInstance();
        int i5 = i3 + i4;
        zzefVar.zza(objNewInstance, bArr, i4, i5, zzayVar);
        zzefVar.zzc(objNewInstance);
        zzayVar.zzff = objNewInstance;
        return i5;
    }

    private static <UT, UB> int zza(com.google.android.gms.internal.clearcut.zzex<UT, UB> zzexVar, T t) {
        return zzexVar.zzm(zzexVar.zzq(t));
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        java.lang.Object objValueOf;
        java.lang.Object objValueOf2;
        int iZzb;
        long jZza;
        int iZzm;
        java.lang.Object objValueOf3;
        int i9;
        sun.misc.Unsafe unsafe = zzmh;
        long j2 = this.zzmi[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                objValueOf = java.lang.Double.valueOf(com.google.android.gms.internal.clearcut.zzax.zze(bArr, i));
                unsafe.putObject(t, j, objValueOf);
                iZzb = i + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                objValueOf2 = java.lang.Float.valueOf(com.google.android.gms.internal.clearcut.zzax.zzf(bArr, i));
                unsafe.putObject(t, j, objValueOf2);
                iZzb = i + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.clearcut.zzax.zzb(bArr, i, zzayVar);
                jZza = zzayVar.zzfe;
                objValueOf3 = java.lang.Long.valueOf(jZza);
                unsafe.putObject(t, j, objValueOf3);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.clearcut.zzax.zza(bArr, i, zzayVar);
                iZzm = zzayVar.zzfd;
                objValueOf3 = java.lang.Integer.valueOf(iZzm);
                unsafe.putObject(t, j, objValueOf3);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                objValueOf = java.lang.Long.valueOf(com.google.android.gms.internal.clearcut.zzax.zzd(bArr, i));
                unsafe.putObject(t, j, objValueOf);
                iZzb = i + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                objValueOf2 = java.lang.Integer.valueOf(com.google.android.gms.internal.clearcut.zzax.zzc(bArr, i));
                unsafe.putObject(t, j, objValueOf2);
                iZzb = i + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.clearcut.zzax.zzb(bArr, i, zzayVar);
                objValueOf3 = java.lang.Boolean.valueOf(zzayVar.zzfe != 0);
                unsafe.putObject(t, j, objValueOf3);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.clearcut.zzax.zza(bArr, i, zzayVar);
                i9 = zzayVar.zzfd;
                if (i9 == 0) {
                    objValueOf3 = "";
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                if ((i6 & 536870912) != 0 && !com.google.android.gms.internal.clearcut.zzff.zze(bArr, iZzb, iZzb + i9)) {
                    throw com.google.android.gms.internal.clearcut.zzco.zzbp();
                }
                unsafe.putObject(t, j, new java.lang.String(bArr, iZzb, i9, com.google.android.gms.internal.clearcut.zzci.UTF_8));
                iZzb += i9;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                iZzb = zza(zzad(i8), bArr, i, i2, zzayVar);
                java.lang.Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                objValueOf3 = zzayVar.zzff;
                if (object != null) {
                    objValueOf3 = com.google.android.gms.internal.clearcut.zzci.zza(object, objValueOf3);
                }
                unsafe.putObject(t, j, objValueOf3);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.clearcut.zzax.zza(bArr, i, zzayVar);
                i9 = zzayVar.zzfd;
                if (i9 == 0) {
                    objValueOf3 = com.google.android.gms.internal.clearcut.zzbb.zzfi;
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                unsafe.putObject(t, j, com.google.android.gms.internal.clearcut.zzbb.zzb(bArr, iZzb, i9));
                iZzb += i9;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iZza = com.google.android.gms.internal.clearcut.zzax.zza(bArr, i, zzayVar);
                int i10 = zzayVar.zzfd;
                com.google.android.gms.internal.clearcut.zzck<?> zzckVarZzaf = zzaf(i8);
                if (zzckVarZzaf != null && zzckVarZzaf.zzb(i10) == null) {
                    zzn(t).zzb(i3, java.lang.Long.valueOf(i10));
                    return iZza;
                }
                unsafe.putObject(t, j, java.lang.Integer.valueOf(i10));
                iZzb = iZza;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.clearcut.zzax.zza(bArr, i, zzayVar);
                iZzm = com.google.android.gms.internal.clearcut.zzbk.zzm(zzayVar.zzfd);
                objValueOf3 = java.lang.Integer.valueOf(iZzm);
                unsafe.putObject(t, j, objValueOf3);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.clearcut.zzax.zzb(bArr, i, zzayVar);
                jZza = com.google.android.gms.internal.clearcut.zzbk.zza(zzayVar.zzfe);
                objValueOf3 = java.lang.Long.valueOf(jZza);
                unsafe.putObject(t, j, objValueOf3);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                iZzb = zza(zzad(i8), bArr, i, i2, (i3 & (-8)) | 4, zzayVar);
                java.lang.Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                objValueOf3 = zzayVar.zzff;
                if (object2 != null) {
                    objValueOf3 = com.google.android.gms.internal.clearcut.zzci.zza(object2, objValueOf3);
                }
                unsafe.putObject(t, j, objValueOf3);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:126:0x0233 A[LOOP:9: B:127:0x0234->B:126:0x0233, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x0239  */
    /* JADX WARN: Code duplicated, block: B:131:0x0241  */
    /* JADX WARN: Code duplicated, block: B:247:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01de -> B:91:0x01b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0249 -> B:125:0x0231). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0157 -> B:64:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01a8 -> B:79:0x0189). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final int zza(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.clearcut.zzay r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.zzay):int");
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, long j, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        sun.misc.Unsafe unsafe = zzmh;
        java.lang.Object objZzae = zzae(i3);
        java.lang.Object object = unsafe.getObject(t, j);
        if (this.zzmz.zzi(object)) {
            java.lang.Object objZzk = this.zzmz.zzk(objZzae);
            this.zzmz.zzb(objZzk, object);
            unsafe.putObject(t, j, objZzk);
            object = objZzk;
        }
        com.google.android.gms.internal.clearcut.zzdh<?, ?> zzdhVarZzl = this.zzmz.zzl(objZzae);
        java.util.Map<?, ?> mapZzg = this.zzmz.zzg(object);
        int iZza = com.google.android.gms.internal.clearcut.zzax.zza(bArr, i, zzayVar);
        int i5 = zzayVar.zzfd;
        if (i5 < 0 || i5 > i2 - iZza) {
            throw com.google.android.gms.internal.clearcut.zzco.zzbl();
        }
        int i6 = i5 + iZza;
        K k = zzdhVarZzl.zzmc;
        V v = zzdhVarZzl.zzdu;
        while (iZza < i6) {
            int iZza2 = iZza + 1;
            int i7 = bArr[iZza];
            if (i7 < 0) {
                iZza2 = com.google.android.gms.internal.clearcut.zzax.zza(i7, bArr, iZza2, zzayVar);
                i7 = zzayVar.zzfd;
            }
            int i8 = iZza2;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 != 1) {
                if (i9 == 2 && i10 == zzdhVarZzl.zzmd.zzel()) {
                    iZza = zza(bArr, i8, i2, zzdhVarZzl.zzmd, zzdhVarZzl.zzdu.getClass(), zzayVar);
                    v = zzayVar.zzff;
                } else {
                    iZza = com.google.android.gms.internal.clearcut.zzax.zza(i7, bArr, i8, i2, zzayVar);
                }
            } else if (i10 == zzdhVarZzl.zzmb.zzel()) {
                iZza = zza(bArr, i8, i2, zzdhVarZzl.zzmb, (java.lang.Class<?>) null, zzayVar);
                k = (K) zzayVar.zzff;
            } else {
                iZza = com.google.android.gms.internal.clearcut.zzax.zza(i7, bArr, i8, i2, zzayVar);
            }
        }
        if (iZza != i6) {
            throw com.google.android.gms.internal.clearcut.zzco.zzbo();
        }
        mapZzg.put(k, v);
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0370 A[ADDED_TO_REGION] */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0068. Please report as an issue. */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        sun.misc.Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        int i7;
        T t2;
        com.google.android.gms.internal.clearcut.zzck<?> zzckVarZzaf;
        int i8;
        int iZza;
        int i9;
        int i10;
        int i11;
        int i12;
        com.google.android.gms.internal.clearcut.zzay zzayVar2;
        int i13;
        int i14;
        int i15;
        long j;
        java.lang.Object objZza;
        com.google.android.gms.internal.clearcut.zzay zzayVar3;
        int iZze;
        com.google.android.gms.internal.clearcut.zzds<T> zzdsVar = this;
        T t3 = t;
        bArr = bArr;
        i2 = i2;
        int i16 = i3;
        com.google.android.gms.internal.clearcut.zzay zzayVar4 = zzayVar;
        sun.misc.Unsafe unsafe2 = zzmh;
        int i17 = -1;
        int iZza2 = i;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        while (true) {
            if (iZza2 < i2) {
                int i21 = iZza2 + 1;
                byte b = bArr[iZza2];
                if (b < 0) {
                    iZza = com.google.android.gms.internal.clearcut.zzax.zza(b, bArr, i21, zzayVar4);
                    i8 = zzayVar4.zzfd;
                } else {
                    i8 = b;
                    iZza = i21;
                }
                int i22 = i8 >>> 3;
                int i23 = i8 & 7;
                int iZzai = zzdsVar.zzai(i22);
                if (iZzai != i17) {
                    int[] iArr = zzdsVar.zzmi;
                    int i24 = iArr[iZzai + 1];
                    int i25 = (i24 & 267386880) >>> 20;
                    int i26 = i8;
                    long j2 = i24 & 1048575;
                    if (i25 <= 17) {
                        int i27 = iArr[iZzai + 2];
                        int i28 = 1 << (i27 >>> 20);
                        int i29 = i27 & 1048575;
                        if (i29 != i20) {
                            if (i20 != -1) {
                                unsafe2.putInt(t3, i20, i19);
                            }
                            i19 = unsafe2.getInt(t3, i29);
                            i20 = i29;
                        }
                        switch (i25) {
                            case 0:
                                i5 = i26;
                                zzayVar2 = zzayVar;
                                i13 = iZza;
                                i14 = i20;
                                bArr = bArr;
                                if (i23 == 1) {
                                    com.google.android.gms.internal.clearcut.zzfd.zza(t3, j2, com.google.android.gms.internal.clearcut.zzax.zze(bArr, i13));
                                    iZza2 = i13 + 8;
                                    i19 |= i28;
                                    i20 = i14;
                                    i2 = i2;
                                    i18 = i5;
                                    zzayVar4 = zzayVar2;
                                    i17 = -1;
                                    i16 = i3;
                                } else {
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3 || i3 == 0) {
                                        iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                        zzdsVar = this;
                                        t3 = t;
                                        i16 = i3;
                                        i18 = i5;
                                        unsafe2 = unsafe;
                                        i17 = -1;
                                        zzayVar4 = zzayVar;
                                    } else {
                                        i6 = i20;
                                        i7 = -1;
                                        i4 = i12;
                                    }
                                }
                                break;
                            case 1:
                                i5 = i26;
                                zzayVar2 = zzayVar;
                                i13 = iZza;
                                i14 = i20;
                                bArr = bArr;
                                if (i23 == 5) {
                                    com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t3, j2, com.google.android.gms.internal.clearcut.zzax.zzf(bArr, i13));
                                    iZza2 = i13 + 4;
                                    i19 |= i28;
                                    i20 = i14;
                                    i2 = i2;
                                    i18 = i5;
                                    zzayVar4 = zzayVar2;
                                    i17 = -1;
                                    i16 = i3;
                                } else {
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 2:
                            case 3:
                                i5 = i26;
                                i13 = iZza;
                                i14 = i20;
                                bArr = bArr;
                                if (i23 == 0) {
                                    int iZzb = com.google.android.gms.internal.clearcut.zzax.zzb(bArr, i13, zzayVar);
                                    unsafe2.putLong(t, j2, zzayVar.zzfe);
                                    i19 |= i28;
                                    i20 = i14;
                                    i2 = i2;
                                    i18 = i5;
                                    zzayVar4 = zzayVar;
                                    iZza2 = iZzb;
                                    i17 = -1;
                                    i16 = i3;
                                } else {
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 4:
                            case 11:
                                i5 = i26;
                                zzayVar2 = zzayVar;
                                i13 = iZza;
                                i14 = i20;
                                bArr = bArr;
                                if (i23 == 0) {
                                    iZza2 = com.google.android.gms.internal.clearcut.zzax.zza(bArr, i13, zzayVar2);
                                    unsafe2.putInt(t3, j2, zzayVar2.zzfd);
                                    i19 |= i28;
                                    i20 = i14;
                                    i2 = i2;
                                    i18 = i5;
                                    zzayVar4 = zzayVar2;
                                    i17 = -1;
                                    i16 = i3;
                                } else {
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 5:
                            case 14:
                                i5 = i26;
                                zzayVar2 = zzayVar;
                                i14 = i20;
                                bArr = bArr;
                                if (i23 == 1) {
                                    unsafe2.putLong(t, j2, com.google.android.gms.internal.clearcut.zzax.zzd(bArr, iZza));
                                    iZza2 = iZza + 8;
                                    i19 |= i28;
                                    i20 = i14;
                                    i2 = i2;
                                    i18 = i5;
                                    zzayVar4 = zzayVar2;
                                    i17 = -1;
                                    i16 = i3;
                                } else {
                                    i13 = iZza;
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 6:
                            case 13:
                                i5 = i26;
                                i15 = i2;
                                zzayVar2 = zzayVar;
                                i14 = i20;
                                bArr = bArr;
                                if (i23 == 5) {
                                    unsafe2.putInt(t3, j2, com.google.android.gms.internal.clearcut.zzax.zzc(bArr, iZza));
                                    iZza2 = iZza + 4;
                                    i19 |= i28;
                                    i20 = i14;
                                    i2 = i15;
                                    i18 = i5;
                                    zzayVar4 = zzayVar2;
                                    i17 = -1;
                                    i16 = i3;
                                } else {
                                    i13 = iZza;
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 7:
                                i5 = i26;
                                i15 = i2;
                                zzayVar2 = zzayVar;
                                i14 = i20;
                                bArr = bArr;
                                if (i23 == 0) {
                                    iZza2 = com.google.android.gms.internal.clearcut.zzax.zzb(bArr, iZza, zzayVar2);
                                    com.google.android.gms.internal.clearcut.zzfd.zza(t3, j2, zzayVar2.zzfe != 0);
                                    i19 |= i28;
                                    i20 = i14;
                                    i2 = i15;
                                    i18 = i5;
                                    zzayVar4 = zzayVar2;
                                    i17 = -1;
                                    i16 = i3;
                                } else {
                                    i13 = iZza;
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 8:
                                i5 = i26;
                                i15 = i2;
                                zzayVar2 = zzayVar;
                                i14 = i20;
                                j = j2;
                                bArr = bArr;
                                if (i23 == 2) {
                                    iZza2 = (i24 & 536870912) == 0 ? com.google.android.gms.internal.clearcut.zzax.zzc(bArr, iZza, zzayVar2) : com.google.android.gms.internal.clearcut.zzax.zzd(bArr, iZza, zzayVar2);
                                    objZza = zzayVar2.zzff;
                                    unsafe2.putObject(t3, j, objZza);
                                    i19 |= i28;
                                    i20 = i14;
                                    i2 = i15;
                                    i18 = i5;
                                    zzayVar4 = zzayVar2;
                                    i17 = -1;
                                    i16 = i3;
                                } else {
                                    i13 = iZza;
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 9:
                                i5 = i26;
                                zzayVar2 = zzayVar;
                                i14 = i20;
                                j = j2;
                                bArr = bArr;
                                if (i23 == 2) {
                                    i15 = i2;
                                    iZza2 = zza(zzdsVar.zzad(iZzai), bArr, iZza, i15, zzayVar2);
                                    objZza = (i19 & i28) == 0 ? zzayVar2.zzff : com.google.android.gms.internal.clearcut.zzci.zza(unsafe2.getObject(t3, j), zzayVar2.zzff);
                                    unsafe2.putObject(t3, j, objZza);
                                    i19 |= i28;
                                    i20 = i14;
                                    i2 = i15;
                                    i18 = i5;
                                    zzayVar4 = zzayVar2;
                                    i17 = -1;
                                    i16 = i3;
                                } else {
                                    i13 = iZza;
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 10:
                                i5 = i26;
                                zzayVar3 = zzayVar;
                                i17 = -1;
                                bArr = bArr;
                                if (i23 == 2) {
                                    iZze = com.google.android.gms.internal.clearcut.zzax.zze(bArr, iZza, zzayVar3);
                                    unsafe2.putObject(t3, j2, zzayVar3.zzff);
                                    i19 |= i28;
                                    iZza2 = iZze;
                                    i18 = i5;
                                    zzayVar4 = zzayVar3;
                                    i16 = i3;
                                } else {
                                    i13 = iZza;
                                    i14 = i20;
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 12:
                                i5 = i26;
                                zzayVar3 = zzayVar;
                                i17 = -1;
                                bArr = bArr;
                                if (i23 == 0) {
                                    iZza2 = com.google.android.gms.internal.clearcut.zzax.zza(bArr, iZza, zzayVar3);
                                    int i30 = zzayVar3.zzfd;
                                    com.google.android.gms.internal.clearcut.zzck<?> zzckVarZzaf2 = zzdsVar.zzaf(iZzai);
                                    if (zzckVarZzaf2 == null || zzckVarZzaf2.zzb(i30) != null) {
                                        unsafe2.putInt(t3, j2, i30);
                                        i19 |= i28;
                                    } else {
                                        zzn(t).zzb(i5, java.lang.Long.valueOf(i30));
                                    }
                                    i18 = i5;
                                    zzayVar4 = zzayVar3;
                                    i16 = i3;
                                } else {
                                    i13 = iZza;
                                    i14 = i20;
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 15:
                                i5 = i26;
                                zzayVar3 = zzayVar;
                                i17 = -1;
                                bArr = bArr;
                                if (i23 == 0) {
                                    iZze = com.google.android.gms.internal.clearcut.zzax.zza(bArr, iZza, zzayVar3);
                                    unsafe2.putInt(t3, j2, com.google.android.gms.internal.clearcut.zzbk.zzm(zzayVar3.zzfd));
                                    i19 |= i28;
                                    iZza2 = iZze;
                                    i18 = i5;
                                    zzayVar4 = zzayVar3;
                                    i16 = i3;
                                } else {
                                    i13 = iZza;
                                    i14 = i20;
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 16:
                                i5 = i26;
                                i17 = -1;
                                if (i23 == 0) {
                                    bArr = bArr;
                                    int iZzb2 = com.google.android.gms.internal.clearcut.zzax.zzb(bArr, iZza, zzayVar);
                                    unsafe2.putLong(t, j2, com.google.android.gms.internal.clearcut.zzbk.zza(zzayVar.zzfe));
                                    i19 |= i28;
                                    i18 = i5;
                                    zzayVar4 = zzayVar;
                                    iZza2 = iZzb2;
                                    i2 = i2;
                                    i16 = i3;
                                } else {
                                    i13 = iZza;
                                    i14 = i20;
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            case 17:
                                if (i23 == 3) {
                                    i5 = i26;
                                    i17 = -1;
                                    iZza2 = zza(zzdsVar.zzad(iZzai), bArr, iZza, i2, (i22 << 3) | 4, zzayVar);
                                    zzayVar3 = zzayVar;
                                    unsafe2.putObject(t3, j2, (i19 & i28) == 0 ? zzayVar3.zzff : com.google.android.gms.internal.clearcut.zzci.zza(unsafe2.getObject(t3, j2), zzayVar3.zzff));
                                    i19 |= i28;
                                    bArr = bArr;
                                    i18 = i5;
                                    zzayVar4 = zzayVar3;
                                    i16 = i3;
                                } else {
                                    i5 = i26;
                                    i13 = iZza;
                                    i14 = i20;
                                    i20 = i14;
                                    i3 = i3;
                                    i12 = i13;
                                    unsafe = unsafe2;
                                    if (i5 == i3) {
                                    }
                                    iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                    zzdsVar = this;
                                    t3 = t;
                                    i16 = i3;
                                    i18 = i5;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                    zzayVar4 = zzayVar;
                                }
                                break;
                            default:
                                i5 = i26;
                                i13 = iZza;
                                i14 = i20;
                                i20 = i14;
                                i3 = i3;
                                i12 = i13;
                                unsafe = unsafe2;
                                if (i5 == i3) {
                                }
                                iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                                zzdsVar = this;
                                t3 = t;
                                i16 = i3;
                                i18 = i5;
                                unsafe2 = unsafe;
                                i17 = -1;
                                zzayVar4 = zzayVar;
                                break;
                        }
                    } else {
                        int i31 = iZza;
                        i11 = i20;
                        if (i25 == 27) {
                            if (i23 == 2) {
                                com.google.android.gms.internal.clearcut.zzcn zzcnVarZzi = (com.google.android.gms.internal.clearcut.zzcn) unsafe2.getObject(t3, j2);
                                if (!zzcnVarZzi.zzu()) {
                                    int size = zzcnVarZzi.size();
                                    zzcnVarZzi = zzcnVarZzi.zzi(size == 0 ? 10 : size << 1);
                                    unsafe2.putObject(t3, j2, zzcnVarZzi);
                                }
                                com.google.android.gms.internal.clearcut.zzcn zzcnVar = zzcnVarZzi;
                                com.google.android.gms.internal.clearcut.zzef zzefVarZzad = zzdsVar.zzad(iZzai);
                                i18 = i26;
                                iZza2 = zza((com.google.android.gms.internal.clearcut.zzef<?>) zzefVarZzad, i18, bArr, i31, i2, (com.google.android.gms.internal.clearcut.zzcn<?>) zzcnVar, zzayVar);
                                i16 = i3;
                                i20 = i11;
                                i19 = i19;
                            } else {
                                i9 = i31;
                                i10 = i26;
                            }
                            i17 = -1;
                            zzayVar4 = zzayVar;
                        } else {
                            i19 = i19;
                            if (i25 <= 49) {
                                unsafe = unsafe2;
                                iZza2 = zza(t, bArr, i31, i2, i26, i22, i23, iZzai, i24, i25, j2, zzayVar);
                                if (iZza2 == i31) {
                                    i10 = i26;
                                    i5 = i10;
                                    i12 = iZza2;
                                    i20 = i11;
                                    i19 = i19;
                                } else {
                                    i10 = i26;
                                    zzdsVar = this;
                                    t3 = t;
                                    bArr = bArr;
                                    i18 = i10;
                                    i2 = i2;
                                    i16 = i3;
                                    zzayVar4 = zzayVar;
                                    i20 = i11;
                                    i19 = i19;
                                    unsafe2 = unsafe;
                                    i17 = -1;
                                }
                            } else {
                                i9 = i31;
                                unsafe = unsafe2;
                                if (i25 != 50) {
                                    iZza2 = zza(t, bArr, i9, i2, i10, i22, i23, i24, i25, j2, iZzai, zzayVar);
                                    if (iZza2 == i9) {
                                        i10 = i26;
                                        i5 = i10;
                                        i12 = iZza2;
                                        i20 = i11;
                                        i19 = i19;
                                    } else {
                                        i10 = i26;
                                        zzdsVar = this;
                                        t3 = t;
                                        bArr = bArr;
                                        i18 = i10;
                                        i2 = i2;
                                        i16 = i3;
                                        zzayVar4 = zzayVar;
                                        i20 = i11;
                                        i19 = i19;
                                        unsafe2 = unsafe;
                                        i17 = -1;
                                    }
                                } else if (i23 == 2) {
                                    iZza2 = zza(t, bArr, i9, i2, iZzai, i22, j2, zzayVar);
                                    if (iZza2 == i9) {
                                        i10 = i26;
                                        i5 = i10;
                                        i12 = iZza2;
                                        i20 = i11;
                                        i19 = i19;
                                    } else {
                                        i10 = i26;
                                        zzdsVar = this;
                                        t3 = t;
                                        bArr = bArr;
                                        i18 = i10;
                                        i2 = i2;
                                        i16 = i3;
                                        zzayVar4 = zzayVar;
                                        i20 = i11;
                                        i19 = i19;
                                        unsafe2 = unsafe;
                                        i17 = -1;
                                    }
                                } else {
                                    i10 = i26;
                                    i5 = i10;
                                    i12 = i9;
                                    i20 = i11;
                                    i19 = i19;
                                }
                            }
                            if (i5 == i3) {
                            }
                            iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                            zzdsVar = this;
                            t3 = t;
                            i16 = i3;
                            i18 = i5;
                            unsafe2 = unsafe;
                            i17 = -1;
                            zzayVar4 = zzayVar;
                        }
                    }
                } else {
                    i9 = iZza;
                    i10 = i8;
                    i11 = i20;
                }
                unsafe = unsafe2;
                i5 = i10;
                i12 = i9;
                i20 = i11;
                i19 = i19;
                if (i5 == i3) {
                }
                iZza2 = zza(i5, bArr, i12, i2, t, zzayVar);
                zzdsVar = this;
                t3 = t;
                i16 = i3;
                i18 = i5;
                unsafe2 = unsafe;
                i17 = -1;
                zzayVar4 = zzayVar;
            } else {
                int i32 = i20;
                unsafe = unsafe2;
                i3 = i16;
                i4 = iZza2;
                i5 = i18;
                i6 = i32;
                i7 = -1;
            }
        }
        if (i6 != i7) {
            t2 = t;
            unsafe.putInt(t2, i6, i19);
        } else {
            t2 = t;
        }
        int[] iArr2 = this.zzmt;
        if (iArr2 != null) {
            java.lang.Object objZza2 = null;
            for (int i33 : iArr2) {
                com.google.android.gms.internal.clearcut.zzex zzexVar = this.zzmx;
                int i34 = this.zzmi[i33];
                java.lang.Object objZzo = com.google.android.gms.internal.clearcut.zzfd.zzo(t2, zzag(i33) & 1048575);
                if (objZzo != null && (zzckVarZzaf = zzaf(i33)) != null) {
                    objZza2 = zza(i33, i34, this.zzmz.zzg(objZzo), zzckVarZzaf, objZza2, (com.google.android.gms.internal.clearcut.zzex<UT, java.lang.Object>) zzexVar);
                }
                objZza2 = (com.google.android.gms.internal.clearcut.zzey) objZza2;
            }
            if (objZza2 != null) {
                this.zzmx.zzf(t2, objZza2);
            }
        }
        if (i3 == 0) {
            if (i4 != i2) {
                throw com.google.android.gms.internal.clearcut.zzco.zzbo();
            }
        } else if (i4 > i2 || i5 != i3) {
            throw com.google.android.gms.internal.clearcut.zzco.zzbo();
        }
        return i4;
    }

    private static int zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.clearcut.zzfl zzflVar, java.lang.Class<?> cls, com.google.android.gms.internal.clearcut.zzay zzayVar) throws java.io.IOException {
        int iZzb;
        java.lang.Object objValueOf;
        java.lang.Object objValueOf2;
        java.lang.Object objValueOf3;
        int iZzm;
        long jZza;
        switch (com.google.android.gms.internal.clearcut.zzdt.zzgq[zzflVar.ordinal()]) {
            case 1:
                iZzb = com.google.android.gms.internal.clearcut.zzax.zzb(bArr, i, zzayVar);
                objValueOf = java.lang.Boolean.valueOf(zzayVar.zzfe != 0);
                zzayVar.zzff = objValueOf;
                return iZzb;
            case 2:
                return com.google.android.gms.internal.clearcut.zzax.zze(bArr, i, zzayVar);
            case 3:
                objValueOf2 = java.lang.Double.valueOf(com.google.android.gms.internal.clearcut.zzax.zze(bArr, i));
                zzayVar.zzff = objValueOf2;
                return i + 8;
            case 4:
            case 5:
                objValueOf3 = java.lang.Integer.valueOf(com.google.android.gms.internal.clearcut.zzax.zzc(bArr, i));
                zzayVar.zzff = objValueOf3;
                return i + 4;
            case 6:
            case 7:
                objValueOf2 = java.lang.Long.valueOf(com.google.android.gms.internal.clearcut.zzax.zzd(bArr, i));
                zzayVar.zzff = objValueOf2;
                return i + 8;
            case 8:
                objValueOf3 = java.lang.Float.valueOf(com.google.android.gms.internal.clearcut.zzax.zzf(bArr, i));
                zzayVar.zzff = objValueOf3;
                return i + 4;
            case 9:
            case 10:
            case 11:
                iZzb = com.google.android.gms.internal.clearcut.zzax.zza(bArr, i, zzayVar);
                iZzm = zzayVar.zzfd;
                objValueOf = java.lang.Integer.valueOf(iZzm);
                zzayVar.zzff = objValueOf;
                return iZzb;
            case 12:
            case 13:
                iZzb = com.google.android.gms.internal.clearcut.zzax.zzb(bArr, i, zzayVar);
                jZza = zzayVar.zzfe;
                objValueOf = java.lang.Long.valueOf(jZza);
                zzayVar.zzff = objValueOf;
                return iZzb;
            case 14:
                return zza((com.google.android.gms.internal.clearcut.zzef) com.google.android.gms.internal.clearcut.zzea.zzcm().zze(cls), bArr, i, i2, zzayVar);
            case 15:
                iZzb = com.google.android.gms.internal.clearcut.zzax.zza(bArr, i, zzayVar);
                iZzm = com.google.android.gms.internal.clearcut.zzbk.zzm(zzayVar.zzfd);
                objValueOf = java.lang.Integer.valueOf(iZzm);
                zzayVar.zzff = objValueOf;
                return iZzb;
            case 16:
                iZzb = com.google.android.gms.internal.clearcut.zzax.zzb(bArr, i, zzayVar);
                jZza = com.google.android.gms.internal.clearcut.zzbk.zza(zzayVar.zzfe);
                objValueOf = java.lang.Long.valueOf(jZza);
                zzayVar.zzff = objValueOf;
                return iZzb;
            case 17:
                return com.google.android.gms.internal.clearcut.zzax.zzd(bArr, i, zzayVar);
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    static <T> com.google.android.gms.internal.clearcut.zzds<T> zza(java.lang.Class<T> cls, com.google.android.gms.internal.clearcut.zzdm zzdmVar, com.google.android.gms.internal.clearcut.zzdw zzdwVar, com.google.android.gms.internal.clearcut.zzcy zzcyVar, com.google.android.gms.internal.clearcut.zzex<?, ?> zzexVar, com.google.android.gms.internal.clearcut.zzbu<?> zzbuVar, com.google.android.gms.internal.clearcut.zzdj zzdjVar) {
        int iZzcu;
        int i;
        int i2;
        int iZza;
        int iZzdg;
        int iZza2;
        if (!(zzdmVar instanceof com.google.android.gms.internal.clearcut.zzec)) {
            ((com.google.android.gms.internal.clearcut.zzes) zzdmVar).zzcf();
            throw new java.lang.NoSuchMethodError();
        }
        com.google.android.gms.internal.clearcut.zzec zzecVar = (com.google.android.gms.internal.clearcut.zzec) zzdmVar;
        boolean z = zzecVar.zzcf() == com.google.android.gms.internal.clearcut.zzcg.zzg.zzkm;
        if (zzecVar.getFieldCount() == 0) {
            iZzcu = 0;
            i = 0;
            i2 = 0;
        } else {
            int iZzcp = zzecVar.zzcp();
            int iZzcq = zzecVar.zzcq();
            iZzcu = zzecVar.zzcu();
            i = iZzcp;
            i2 = iZzcq;
        }
        int[] iArr = new int[iZzcu << 2];
        java.lang.Object[] objArr = new java.lang.Object[iZzcu << 1];
        int[] iArr2 = zzecVar.zzcr() > 0 ? new int[zzecVar.zzcr()] : null;
        int[] iArr3 = zzecVar.zzcs() > 0 ? new int[zzecVar.zzcs()] : null;
        com.google.android.gms.internal.clearcut.zzed zzedVarZzco = zzecVar.zzco();
        if (zzedVarZzco.next()) {
            int iZzcx = zzedVarZzco.zzcx();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (iZzcx >= zzecVar.zzcv() || i3 >= ((iZzcx - i) << 2)) {
                    if (zzedVarZzco.zzda()) {
                        iZza = (int) com.google.android.gms.internal.clearcut.zzfd.zza(zzedVarZzco.zzdb());
                        iZza2 = (int) com.google.android.gms.internal.clearcut.zzfd.zza(zzedVarZzco.zzdc());
                        iZzdg = 0;
                    } else {
                        iZza = (int) com.google.android.gms.internal.clearcut.zzfd.zza(zzedVarZzco.zzdd());
                        if (zzedVarZzco.zzde()) {
                            iZza2 = (int) com.google.android.gms.internal.clearcut.zzfd.zza(zzedVarZzco.zzdf());
                            iZzdg = zzedVarZzco.zzdg();
                        } else {
                            iZzdg = 0;
                            iZza2 = 0;
                        }
                    }
                    iArr[i3] = zzedVarZzco.zzcx();
                    int i6 = i3 + 1;
                    iArr[i6] = (zzedVarZzco.zzdi() ? 536870912 : 0) | (zzedVarZzco.zzdh() ? net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY : 0) | (zzedVarZzco.zzcy() << 20) | iZza;
                    iArr[i3 + 2] = (iZzdg << 20) | iZza2;
                    if (zzedVarZzco.zzdl() != null) {
                        int i7 = (i3 / 4) << 1;
                        objArr[i7] = zzedVarZzco.zzdl();
                        if (zzedVarZzco.zzdj() != null) {
                            objArr[i7 + 1] = zzedVarZzco.zzdj();
                        } else if (zzedVarZzco.zzdk() != null) {
                            objArr[i7 + 1] = zzedVarZzco.zzdk();
                        }
                    } else if (zzedVarZzco.zzdj() != null) {
                        objArr[((i3 / 4) << 1) + 1] = zzedVarZzco.zzdj();
                    } else if (zzedVarZzco.zzdk() != null) {
                        objArr[((i3 / 4) << 1) + 1] = zzedVarZzco.zzdk();
                    }
                    int iZzcy = zzedVarZzco.zzcy();
                    if (iZzcy == com.google.android.gms.internal.clearcut.zzcb.MAP.ordinal()) {
                        iArr2[i4] = i3;
                        i4++;
                    } else if (iZzcy >= 18 && iZzcy <= 49) {
                        iArr3[i5] = iArr[i6] & 1048575;
                        i5++;
                    }
                    if (!zzedVarZzco.next()) {
                        break;
                    }
                    iZzcx = zzedVarZzco.zzcx();
                } else {
                    for (int i8 = 0; i8 < 4; i8++) {
                        iArr[i3 + i8] = -1;
                    }
                }
                i3 += 4;
            }
        }
        return new com.google.android.gms.internal.clearcut.zzds<>(iArr, objArr, i, i2, zzecVar.zzcv(), zzecVar.zzch(), z, false, zzecVar.zzct(), iArr2, iArr3, zzdwVar, zzcyVar, zzexVar, zzbuVar, zzdjVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, java.util.Map<K, V> map, com.google.android.gms.internal.clearcut.zzck<?> zzckVar, UB ub, com.google.android.gms.internal.clearcut.zzex<UT, UB> zzexVar) {
        com.google.android.gms.internal.clearcut.zzdh<?, ?> zzdhVarZzl = this.zzmz.zzl(zzae(i));
        java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (zzckVar.zzb(((java.lang.Integer) next.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = zzexVar.zzdz();
                }
                com.google.android.gms.internal.clearcut.zzbg zzbgVarZzk = com.google.android.gms.internal.clearcut.zzbb.zzk(com.google.android.gms.internal.clearcut.zzdg.zza(zzdhVarZzl, next.getKey(), next.getValue()));
                try {
                    com.google.android.gms.internal.clearcut.zzdg.zza(zzbgVarZzk.zzae(), zzdhVarZzl, next.getKey(), next.getValue());
                    zzexVar.zza(ub, i2, zzbgVarZzk.zzad());
                    it.remove();
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static void zza(int i, java.lang.Object obj, com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zzfrVar.zza(i, (java.lang.String) obj);
        } else {
            zzfrVar.zza(i, (com.google.android.gms.internal.clearcut.zzbb) obj);
        }
    }

    private static <UT, UB> void zza(com.google.android.gms.internal.clearcut.zzex<UT, UB> zzexVar, T t, com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        zzexVar.zza(zzexVar.zzq(t), zzfrVar);
    }

    private final <K, V> void zza(com.google.android.gms.internal.clearcut.zzfr zzfrVar, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        if (obj != null) {
            zzfrVar.zza(i, this.zzmz.zzl(zzae(i2)), this.zzmz.zzh(obj));
        }
    }

    private final void zza(T t, T t2, int i) {
        long jZzag = zzag(i) & 1048575;
        if (zza(t2, i)) {
            java.lang.Object objZzo = com.google.android.gms.internal.clearcut.zzfd.zzo(t, jZzag);
            java.lang.Object objZzo2 = com.google.android.gms.internal.clearcut.zzfd.zzo(t2, jZzag);
            if (objZzo != null && objZzo2 != null) {
                com.google.android.gms.internal.clearcut.zzfd.zza(t, jZzag, com.google.android.gms.internal.clearcut.zzci.zza(objZzo, objZzo2));
                zzb(t, i);
            } else if (objZzo2 != null) {
                com.google.android.gms.internal.clearcut.zzfd.zza(t, jZzag, objZzo2);
                zzb(t, i);
            }
        }
    }

    private final boolean zza(T t, int i) {
        if (!this.zzmq) {
            int iZzah = zzah(i);
            return (com.google.android.gms.internal.clearcut.zzfd.zzj(t, (long) (iZzah & 1048575)) & (1 << (iZzah >>> 20))) != 0;
        }
        int iZzag = zzag(i);
        long j = iZzag & 1048575;
        switch ((iZzag & 267386880) >>> 20) {
            case 0:
                return com.google.android.gms.internal.clearcut.zzfd.zzn(t, j) != 0.0d;
            case 1:
                return com.google.android.gms.internal.clearcut.zzfd.zzm(t, j) != 0.0f;
            case 2:
                return com.google.android.gms.internal.clearcut.zzfd.zzk(t, j) != 0;
            case 3:
                return com.google.android.gms.internal.clearcut.zzfd.zzk(t, j) != 0;
            case 4:
                return com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != 0;
            case 5:
                return com.google.android.gms.internal.clearcut.zzfd.zzk(t, j) != 0;
            case 6:
                return com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != 0;
            case 7:
                return com.google.android.gms.internal.clearcut.zzfd.zzl(t, j);
            case 8:
                java.lang.Object objZzo = com.google.android.gms.internal.clearcut.zzfd.zzo(t, j);
                if (objZzo instanceof java.lang.String) {
                    return !((java.lang.String) objZzo).isEmpty();
                }
                if (objZzo instanceof com.google.android.gms.internal.clearcut.zzbb) {
                    return !com.google.android.gms.internal.clearcut.zzbb.zzfi.equals(objZzo);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.clearcut.zzfd.zzo(t, j) != null;
            case 10:
                return !com.google.android.gms.internal.clearcut.zzbb.zzfi.equals(com.google.android.gms.internal.clearcut.zzfd.zzo(t, j));
            case 11:
                return com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != 0;
            case 12:
                return com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != 0;
            case 13:
                return com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != 0;
            case 14:
                return com.google.android.gms.internal.clearcut.zzfd.zzk(t, j) != 0;
            case 15:
                return com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != 0;
            case 16:
                return com.google.android.gms.internal.clearcut.zzfd.zzk(t, j) != 0;
            case 17:
                return com.google.android.gms.internal.clearcut.zzfd.zzo(t, j) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return com.google.android.gms.internal.clearcut.zzfd.zzj(t, (long) (zzah(i2) & 1048575)) == i;
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzmq) {
            return zza(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(java.lang.Object obj, int i, com.google.android.gms.internal.clearcut.zzef zzefVar) {
        return zzefVar.zzo(com.google.android.gms.internal.clearcut.zzfd.zzo(obj, i & 1048575));
    }

    private final com.google.android.gms.internal.clearcut.zzef zzad(int i) {
        int i2 = (i / 4) << 1;
        com.google.android.gms.internal.clearcut.zzef zzefVar = (com.google.android.gms.internal.clearcut.zzef) this.zzmj[i2];
        if (zzefVar != null) {
            return zzefVar;
        }
        com.google.android.gms.internal.clearcut.zzef<T> zzefVarZze = com.google.android.gms.internal.clearcut.zzea.zzcm().zze((java.lang.Class) this.zzmj[i2 + 1]);
        this.zzmj[i2] = zzefVarZze;
        return zzefVarZze;
    }

    private final java.lang.Object zzae(int i) {
        return this.zzmj[(i / 4) << 1];
    }

    private final com.google.android.gms.internal.clearcut.zzck<?> zzaf(int i) {
        return (com.google.android.gms.internal.clearcut.zzck) this.zzmj[((i / 4) << 1) + 1];
    }

    private final int zzag(int i) {
        return this.zzmi[i + 1];
    }

    private final int zzah(int i) {
        return this.zzmi[i + 2];
    }

    private final int zzai(int i) {
        int i2 = this.zzmk;
        if (i >= i2) {
            int i3 = this.zzmm;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (this.zzmi[i4] == i) {
                    return i4;
                }
                return -1;
            }
            if (i <= this.zzml) {
                int i5 = i3 - i2;
                int length = (this.zzmi.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = this.zzmi[i7];
                    if (i == i8) {
                        return i7;
                    }
                    if (i < i8) {
                        length = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void zzb(T t, int i) {
        if (this.zzmq) {
            return;
        }
        int iZzah = zzah(i);
        long j = iZzah & 1048575;
        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) | (1 << (iZzah >>> 20)));
    }

    private final void zzb(T t, int i, int i2) {
        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, zzah(i2) & 1048575, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private final void zzb(T t, com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        java.util.Iterator it;
        java.util.Map.Entry<?, ?> entry;
        int i;
        if (this.zzmo) {
            com.google.android.gms.internal.clearcut.zzby<T> zzbyVarZza = this.zzmy.zza(t);
            if (zzbyVarZza.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = zzbyVarZza.iterator();
                entry = (java.util.Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int i2 = -1;
        int length = this.zzmi.length;
        sun.misc.Unsafe unsafe = zzmh;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int iZzag = zzag(i3);
            int[] iArr = this.zzmi;
            int i5 = iArr[i3];
            int i6 = (267386880 & iZzag) >>> 20;
            if (this.zzmq || i6 > 17) {
                i = 0;
            } else {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i2) {
                    i4 = unsafe.getInt(t, i8);
                    i2 = i8;
                }
                i = 1 << (i7 >>> 20);
            }
            while (entry != null && this.zzmy.zza(entry) <= i5) {
                this.zzmy.zza(zzfrVar, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            long j = iZzag & 1048575;
            int i9 = i3;
            switch (i6) {
                case 0:
                    if ((i & i4) != 0) {
                        zzfrVar.zza(i5, com.google.android.gms.internal.clearcut.zzfd.zzn(t, j));
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 1:
                    if ((i & i4) != 0) {
                        zzfrVar.zza(i5, com.google.android.gms.internal.clearcut.zzfd.zzm(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 2:
                    if ((i & i4) != 0) {
                        zzfrVar.zzi(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 3:
                    if ((i & i4) != 0) {
                        zzfrVar.zza(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 4:
                    if ((i & i4) != 0) {
                        zzfrVar.zzc(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 5:
                    if ((i & i4) != 0) {
                        zzfrVar.zzc(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 6:
                    if ((i & i4) != 0) {
                        zzfrVar.zzf(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 7:
                    if ((i & i4) != 0) {
                        zzfrVar.zzb(i5, com.google.android.gms.internal.clearcut.zzfd.zzl(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 8:
                    if ((i & i4) != 0) {
                        zza(i5, unsafe.getObject(t, j), zzfrVar);
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 9:
                    if ((i & i4) != 0) {
                        zzfrVar.zza(i5, unsafe.getObject(t, j), zzad(i9));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 10:
                    if ((i & i4) != 0) {
                        zzfrVar.zza(i5, (com.google.android.gms.internal.clearcut.zzbb) unsafe.getObject(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 11:
                    if ((i & i4) != 0) {
                        zzfrVar.zzd(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 12:
                    if ((i & i4) != 0) {
                        zzfrVar.zzn(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 13:
                    if ((i & i4) != 0) {
                        zzfrVar.zzm(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 14:
                    if ((i & i4) != 0) {
                        zzfrVar.zzj(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 15:
                    if ((i & i4) != 0) {
                        zzfrVar.zze(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 16:
                    if ((i & i4) != 0) {
                        zzfrVar.zzb(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 17:
                    if ((i & i4) != 0) {
                        zzfrVar.zzb(i5, unsafe.getObject(t, j), zzad(i9));
                    } else {
                        continue;
                    }
                    i3 = i9 + 4;
                    break;
                case 18:
                    com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[i9], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 19:
                    com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[i9], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 20:
                    com.google.android.gms.internal.clearcut.zzeh.zzc(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 21:
                    com.google.android.gms.internal.clearcut.zzeh.zzd(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 22:
                    com.google.android.gms.internal.clearcut.zzeh.zzh(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 23:
                    com.google.android.gms.internal.clearcut.zzeh.zzf(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 24:
                    com.google.android.gms.internal.clearcut.zzeh.zzk(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 25:
                    com.google.android.gms.internal.clearcut.zzeh.zzn(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 26:
                    com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[i9], (java.util.List<java.lang.String>) unsafe.getObject(t, j), zzfrVar);
                    break;
                case 27:
                    com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[i9], (java.util.List<?>) unsafe.getObject(t, j), zzfrVar, zzad(i9));
                    break;
                case 28:
                    com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar);
                    break;
                case 29:
                    com.google.android.gms.internal.clearcut.zzeh.zzi(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 30:
                    com.google.android.gms.internal.clearcut.zzeh.zzm(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 31:
                    com.google.android.gms.internal.clearcut.zzeh.zzl(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 32:
                    com.google.android.gms.internal.clearcut.zzeh.zzg(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 33:
                    com.google.android.gms.internal.clearcut.zzeh.zzj(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 34:
                    com.google.android.gms.internal.clearcut.zzeh.zze(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, false);
                    continue;
                    i3 = i9 + 4;
                    break;
                case 35:
                    com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[i9], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 36:
                    com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[i9], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 37:
                    com.google.android.gms.internal.clearcut.zzeh.zzc(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 38:
                    com.google.android.gms.internal.clearcut.zzeh.zzd(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 39:
                    com.google.android.gms.internal.clearcut.zzeh.zzh(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 40:
                    com.google.android.gms.internal.clearcut.zzeh.zzf(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 41:
                    com.google.android.gms.internal.clearcut.zzeh.zzk(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 42:
                    com.google.android.gms.internal.clearcut.zzeh.zzn(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 43:
                    com.google.android.gms.internal.clearcut.zzeh.zzi(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 44:
                    com.google.android.gms.internal.clearcut.zzeh.zzm(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 45:
                    com.google.android.gms.internal.clearcut.zzeh.zzl(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 46:
                    com.google.android.gms.internal.clearcut.zzeh.zzg(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 47:
                    com.google.android.gms.internal.clearcut.zzeh.zzj(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 48:
                    com.google.android.gms.internal.clearcut.zzeh.zze(this.zzmi[i9], (java.util.List) unsafe.getObject(t, j), zzfrVar, true);
                    break;
                case 49:
                    com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[i9], (java.util.List<?>) unsafe.getObject(t, j), zzfrVar, zzad(i9));
                    break;
                case 50:
                    zza(zzfrVar, i5, unsafe.getObject(t, j), i9);
                    break;
                case 51:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zza(i5, zze(t, j));
                    }
                    break;
                case 52:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zza(i5, zzf(t, j));
                    }
                    break;
                case 53:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zzi(i5, zzh(t, j));
                    }
                    break;
                case 54:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zza(i5, zzh(t, j));
                    }
                    break;
                case 55:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zzc(i5, zzg(t, j));
                    }
                    break;
                case 56:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zzc(i5, zzh(t, j));
                    }
                    break;
                case 57:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zzf(i5, zzg(t, j));
                    }
                    break;
                case 58:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zzb(i5, zzi(t, j));
                    }
                    break;
                case 59:
                    if (zza(t, i5, i9)) {
                        zza(i5, unsafe.getObject(t, j), zzfrVar);
                    }
                    break;
                case 60:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zza(i5, unsafe.getObject(t, j), zzad(i9));
                    }
                    break;
                case 61:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zza(i5, (com.google.android.gms.internal.clearcut.zzbb) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zzd(i5, zzg(t, j));
                    }
                    break;
                case 63:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zzn(i5, zzg(t, j));
                    }
                    break;
                case 64:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zzm(i5, zzg(t, j));
                    }
                    break;
                case 65:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zzj(i5, zzh(t, j));
                    }
                    break;
                case 66:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zze(i5, zzg(t, j));
                    }
                    break;
                case 67:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zzb(i5, zzh(t, j));
                    }
                    break;
                case 68:
                    if (zza(t, i5, i9)) {
                        zzfrVar.zzb(i5, unsafe.getObject(t, j), zzad(i9));
                    }
                    break;
            }
            i3 = i9 + 4;
        }
        while (entry != null) {
            this.zzmy.zza(zzfrVar, entry);
            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
        }
        zza(this.zzmx, t, zzfrVar);
    }

    private final void zzb(T t, T t2, int i) {
        int iZzag = zzag(i);
        int i2 = this.zzmi[i];
        long j = iZzag & 1048575;
        if (zza(t2, i2, i)) {
            java.lang.Object objZzo = com.google.android.gms.internal.clearcut.zzfd.zzo(t, j);
            java.lang.Object objZzo2 = com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j);
            if (objZzo != null && objZzo2 != null) {
                com.google.android.gms.internal.clearcut.zzfd.zza(t, j, com.google.android.gms.internal.clearcut.zzci.zza(objZzo, objZzo2));
                zzb(t, i2, i);
            } else if (objZzo2 != null) {
                com.google.android.gms.internal.clearcut.zzfd.zza(t, j, objZzo2);
                zzb(t, i2, i);
            }
        }
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
    }

    private static <E> java.util.List<E> zzd(java.lang.Object obj, long j) {
        return (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(obj, j);
    }

    private static <T> double zze(T t, long j) {
        return ((java.lang.Double) com.google.android.gms.internal.clearcut.zzfd.zzo(t, j)).doubleValue();
    }

    private static <T> float zzf(T t, long j) {
        return ((java.lang.Float) com.google.android.gms.internal.clearcut.zzfd.zzo(t, j)).floatValue();
    }

    private static <T> int zzg(T t, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.clearcut.zzfd.zzo(t, j)).intValue();
    }

    private static <T> long zzh(T t, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.clearcut.zzfd.zzo(t, j)).longValue();
    }

    private static <T> boolean zzi(T t, long j) {
        return ((java.lang.Boolean) com.google.android.gms.internal.clearcut.zzfd.zzo(t, j)).booleanValue();
    }

    private static com.google.android.gms.internal.clearcut.zzey zzn(java.lang.Object obj) {
        com.google.android.gms.internal.clearcut.zzcg zzcgVar = (com.google.android.gms.internal.clearcut.zzcg) obj;
        com.google.android.gms.internal.clearcut.zzey zzeyVar = zzcgVar.zzjp;
        if (zzeyVar != com.google.android.gms.internal.clearcut.zzey.zzea()) {
            return zzeyVar;
        }
        com.google.android.gms.internal.clearcut.zzey zzeyVarZzeb = com.google.android.gms.internal.clearcut.zzey.zzeb();
        zzcgVar.zzjp = zzeyVarZzeb;
        return zzeyVarZzeb;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a2  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    public final boolean equals(T t, T t2) {
        int length = this.zzmi.length;
        int i = 0;
        while (true) {
            boolean zZzd = true;
            if (i >= length) {
                if (!this.zzmx.zzq(t).equals(this.zzmx.zzq(t2))) {
                    return false;
                }
                if (this.zzmo) {
                    return this.zzmy.zza(t).equals(this.zzmy.zza(t2));
                }
                return true;
            }
            int iZzag = zzag(i);
            long j = iZzag & 1048575;
            switch ((iZzag & 267386880) >>> 20) {
                case 0:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzk(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzk(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 1:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 2:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzk(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzk(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 3:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzk(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzk(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 4:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 5:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzk(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzk(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 6:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 7:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzl(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzl(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 8:
                    if (!zzc(t, t2, i) || !com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(t, j), com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j))) {
                        zZzd = false;
                    }
                    break;
                case 9:
                    if (!zzc(t, t2, i) || !com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(t, j), com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j))) {
                        zZzd = false;
                    }
                    break;
                case 10:
                    if (!zzc(t, t2, i) || !com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(t, j), com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j))) {
                        zZzd = false;
                    }
                    break;
                case 11:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 12:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 13:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 14:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzk(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzk(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 15:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzj(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 16:
                    if (!zzc(t, t2, i) || com.google.android.gms.internal.clearcut.zzfd.zzk(t, j) != com.google.android.gms.internal.clearcut.zzfd.zzk(t2, j)) {
                        zZzd = false;
                    }
                    break;
                case 17:
                    if (!zzc(t, t2, i) || !com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(t, j), com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j))) {
                        zZzd = false;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    zZzd = com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(t, j), com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzah = zzah(i) & 1048575;
                    if (com.google.android.gms.internal.clearcut.zzfd.zzj(t, jZzah) != com.google.android.gms.internal.clearcut.zzfd.zzj(t2, jZzah) || !com.google.android.gms.internal.clearcut.zzeh.zzd(com.google.android.gms.internal.clearcut.zzfd.zzo(t, j), com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j))) {
                        zZzd = false;
                    }
                    break;
            }
            if (!zZzd) {
                return false;
            }
            i += 4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v13 java.lang.Object) = (r3v11 java.lang.Object), (r3v14 java.lang.Object) binds: [B:67:0x00e0, B:62:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    public final int hashCode(T t) {
        int i;
        double dZzn;
        float fZzm;
        long jZzk;
        int iZzj;
        boolean zZzl;
        java.lang.Object objZzo;
        java.lang.Object objZzo2;
        int length = this.zzmi.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 4) {
            int iZzag = zzag(i3);
            int i4 = this.zzmi[i3];
            long j = 1048575 & iZzag;
            int iHashCode = 37;
            switch ((iZzag & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    dZzn = com.google.android.gms.internal.clearcut.zzfd.zzn(t, j);
                    jZzk = java.lang.Double.doubleToLongBits(dZzn);
                    iZzj = com.google.android.gms.internal.clearcut.zzci.zzl(jZzk);
                    i2 = i + iZzj;
                    break;
                case 1:
                    i = i2 * 53;
                    fZzm = com.google.android.gms.internal.clearcut.zzfd.zzm(t, j);
                    iZzj = java.lang.Float.floatToIntBits(fZzm);
                    i2 = i + iZzj;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    jZzk = com.google.android.gms.internal.clearcut.zzfd.zzk(t, j);
                    iZzj = com.google.android.gms.internal.clearcut.zzci.zzl(jZzk);
                    i2 = i + iZzj;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.clearcut.zzfd.zzj(t, j);
                    i2 = i + iZzj;
                    break;
                case 7:
                    i = i2 * 53;
                    zZzl = com.google.android.gms.internal.clearcut.zzfd.zzl(t, j);
                    iZzj = com.google.android.gms.internal.clearcut.zzci.zzc(zZzl);
                    i2 = i + iZzj;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzj = ((java.lang.String) com.google.android.gms.internal.clearcut.zzfd.zzo(t, j)).hashCode();
                    i2 = i + iZzj;
                    break;
                case 9:
                    objZzo = com.google.android.gms.internal.clearcut.zzfd.zzo(t, j);
                    if (objZzo != null) {
                        iHashCode = objZzo.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i = i2 * 53;
                    objZzo2 = com.google.android.gms.internal.clearcut.zzfd.zzo(t, j);
                    iZzj = objZzo2.hashCode();
                    i2 = i + iZzj;
                    break;
                case 17:
                    objZzo = com.google.android.gms.internal.clearcut.zzfd.zzo(t, j);
                    if (objZzo != null) {
                        iHashCode = objZzo.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 51:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        dZzn = zze(t, j);
                        jZzk = java.lang.Double.doubleToLongBits(dZzn);
                        iZzj = com.google.android.gms.internal.clearcut.zzci.zzl(jZzk);
                        i2 = i + iZzj;
                    }
                    break;
                case 52:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        fZzm = zzf(t, j);
                        iZzj = java.lang.Float.floatToIntBits(fZzm);
                        i2 = i + iZzj;
                    }
                    break;
                case 53:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        jZzk = zzh(t, j);
                        iZzj = com.google.android.gms.internal.clearcut.zzci.zzl(jZzk);
                        i2 = i + iZzj;
                    }
                    break;
                case 54:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        jZzk = zzh(t, j);
                        iZzj = com.google.android.gms.internal.clearcut.zzci.zzl(jZzk);
                        i2 = i + iZzj;
                    }
                    break;
                case 55:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzg(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 56:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        jZzk = zzh(t, j);
                        iZzj = com.google.android.gms.internal.clearcut.zzci.zzl(jZzk);
                        i2 = i + iZzj;
                    }
                    break;
                case 57:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzg(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 58:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        zZzl = zzi(t, j);
                        iZzj = com.google.android.gms.internal.clearcut.zzci.zzc(zZzl);
                        i2 = i + iZzj;
                    }
                    break;
                case 59:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = ((java.lang.String) com.google.android.gms.internal.clearcut.zzfd.zzo(t, j)).hashCode();
                        i2 = i + iZzj;
                    }
                    break;
                case 60:
                    if (zza(t, i4, i3)) {
                        objZzo2 = com.google.android.gms.internal.clearcut.zzfd.zzo(t, j);
                        i = i2 * 53;
                        iZzj = objZzo2.hashCode();
                        i2 = i + iZzj;
                    }
                    break;
                case 61:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        objZzo2 = com.google.android.gms.internal.clearcut.zzfd.zzo(t, j);
                        iZzj = objZzo2.hashCode();
                        i2 = i + iZzj;
                    }
                    break;
                case 62:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzg(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 63:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzg(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 64:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzg(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 65:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        jZzk = zzh(t, j);
                        iZzj = com.google.android.gms.internal.clearcut.zzci.zzl(jZzk);
                        i2 = i + iZzj;
                    }
                    break;
                case 66:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = zzg(t, j);
                        i2 = i + iZzj;
                    }
                    break;
                case 67:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        jZzk = zzh(t, j);
                        iZzj = com.google.android.gms.internal.clearcut.zzci.zzl(jZzk);
                        i2 = i + iZzj;
                    }
                    break;
                case 68:
                    if (zza(t, i4, i3)) {
                        objZzo2 = com.google.android.gms.internal.clearcut.zzfd.zzo(t, j);
                        i = i2 * 53;
                        iZzj = objZzo2.hashCode();
                        i2 = i + iZzj;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzmx.zzq(t).hashCode();
        return this.zzmo ? (iHashCode2 * 53) + this.zzmy.zza(t).hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final T newInstance() {
        return (T) this.zzmv.newInstance(this.zzmn);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0385  */
    /* JADX WARN: Code duplicated, block: B:139:0x0400  */
    /* JADX WARN: Code duplicated, block: B:142:0x0413  */
    /* JADX WARN: Code duplicated, block: B:145:0x0428  */
    /* JADX WARN: Code duplicated, block: B:192:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:295:0x0842  */
    /* JADX WARN: Code duplicated, block: B:322:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:325:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:328:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zza(T t, com.google.android.gms.internal.clearcut.zzfr zzfrVar) throws java.io.IOException {
        java.util.Iterator it;
        java.util.Map.Entry<?, ?> entry;
        double dZzn;
        float fZzm;
        long jZzk;
        long jZzk2;
        int iZzj;
        long jZzk3;
        int iZzj2;
        boolean zZzl;
        int iZzj3;
        int iZzj4;
        int iZzj5;
        long jZzk4;
        int iZzj6;
        long jZzk5;
        java.util.Iterator itDescendingIterator;
        java.util.Map.Entry<?, ?> entry2;
        double dZzn2;
        float fZzm2;
        long jZzk6;
        long jZzk7;
        int iZzj7;
        long jZzk8;
        int iZzj8;
        boolean zZzl2;
        int iZzj9;
        int iZzj10;
        int iZzj11;
        long jZzk9;
        int iZzj12;
        long jZzk10;
        if (zzfrVar.zzaj() == com.google.android.gms.internal.clearcut.zzcg.zzg.zzkp) {
            zza(this.zzmx, t, zzfrVar);
            if (this.zzmo) {
                com.google.android.gms.internal.clearcut.zzby<T> zzbyVarZza = this.zzmy.zza(t);
                if (zzbyVarZza.isEmpty()) {
                    itDescendingIterator = null;
                    entry2 = null;
                } else {
                    itDescendingIterator = zzbyVarZza.descendingIterator();
                    entry2 = (java.util.Map.Entry) itDescendingIterator.next();
                }
            } else {
                itDescendingIterator = null;
                entry2 = null;
            }
            for (int length = this.zzmi.length - 4; length >= 0; length -= 4) {
                int iZzag = zzag(length);
                int i = this.zzmi[length];
                while (entry2 != null && this.zzmy.zza(entry2) > i) {
                    this.zzmy.zza(zzfrVar, entry2);
                    entry2 = itDescendingIterator.hasNext() ? (java.util.Map.Entry) itDescendingIterator.next() : null;
                }
                switch ((iZzag & 267386880) >>> 20) {
                    case 0:
                        if (zza(t, length)) {
                            dZzn2 = com.google.android.gms.internal.clearcut.zzfd.zzn(t, iZzag & 1048575);
                            zzfrVar.zza(i, dZzn2);
                        }
                        break;
                    case 1:
                        if (zza(t, length)) {
                            fZzm2 = com.google.android.gms.internal.clearcut.zzfd.zzm(t, iZzag & 1048575);
                            zzfrVar.zza(i, fZzm2);
                        }
                        break;
                    case 2:
                        if (zza(t, length)) {
                            jZzk6 = com.google.android.gms.internal.clearcut.zzfd.zzk(t, iZzag & 1048575);
                            zzfrVar.zzi(i, jZzk6);
                        }
                        break;
                    case 3:
                        if (zza(t, length)) {
                            jZzk7 = com.google.android.gms.internal.clearcut.zzfd.zzk(t, iZzag & 1048575);
                            zzfrVar.zza(i, jZzk7);
                        }
                        break;
                    case 4:
                        if (zza(t, length)) {
                            iZzj7 = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag & 1048575);
                            zzfrVar.zzc(i, iZzj7);
                        }
                        break;
                    case 5:
                        if (zza(t, length)) {
                            jZzk8 = com.google.android.gms.internal.clearcut.zzfd.zzk(t, iZzag & 1048575);
                            zzfrVar.zzc(i, jZzk8);
                        }
                        break;
                    case 6:
                        if (zza(t, length)) {
                            iZzj8 = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag & 1048575);
                            zzfrVar.zzf(i, iZzj8);
                        }
                        break;
                    case 7:
                        if (zza(t, length)) {
                            zZzl2 = com.google.android.gms.internal.clearcut.zzfd.zzl(t, iZzag & 1048575);
                            zzfrVar.zzb(i, zZzl2);
                        }
                        break;
                    case 8:
                        if (zza(t, length)) {
                            zza(i, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar);
                        }
                        break;
                    case 9:
                        if (zza(t, length)) {
                            zzfrVar.zza(i, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzad(length));
                        }
                        break;
                    case 10:
                        if (zza(t, length)) {
                            zzfrVar.zza(i, (com.google.android.gms.internal.clearcut.zzbb) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575));
                        }
                        break;
                    case 11:
                        if (zza(t, length)) {
                            iZzj9 = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag & 1048575);
                            zzfrVar.zzd(i, iZzj9);
                        }
                        break;
                    case 12:
                        if (zza(t, length)) {
                            iZzj10 = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag & 1048575);
                            zzfrVar.zzn(i, iZzj10);
                        }
                        break;
                    case 13:
                        if (zza(t, length)) {
                            iZzj11 = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag & 1048575);
                            zzfrVar.zzm(i, iZzj11);
                        }
                        break;
                    case 14:
                        if (zza(t, length)) {
                            jZzk9 = com.google.android.gms.internal.clearcut.zzfd.zzk(t, iZzag & 1048575);
                            zzfrVar.zzj(i, jZzk9);
                        }
                        break;
                    case 15:
                        if (zza(t, length)) {
                            iZzj12 = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag & 1048575);
                            zzfrVar.zze(i, iZzj12);
                        }
                        break;
                    case 16:
                        if (zza(t, length)) {
                            jZzk10 = com.google.android.gms.internal.clearcut.zzfd.zzk(t, iZzag & 1048575);
                            zzfrVar.zzb(i, jZzk10);
                        }
                        break;
                    case 17:
                        if (zza(t, length)) {
                            zzfrVar.zzb(i, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzad(length));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[length], (java.util.List<java.lang.Double>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 19:
                        com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[length], (java.util.List<java.lang.Float>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 20:
                        com.google.android.gms.internal.clearcut.zzeh.zzc(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 21:
                        com.google.android.gms.internal.clearcut.zzeh.zzd(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 22:
                        com.google.android.gms.internal.clearcut.zzeh.zzh(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 23:
                        com.google.android.gms.internal.clearcut.zzeh.zzf(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 24:
                        com.google.android.gms.internal.clearcut.zzeh.zzk(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 25:
                        com.google.android.gms.internal.clearcut.zzeh.zzn(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 26:
                        com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[length], (java.util.List<java.lang.String>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar);
                        break;
                    case 27:
                        com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[length], (java.util.List<?>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, zzad(length));
                        break;
                    case 28:
                        com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar);
                        break;
                    case 29:
                        com.google.android.gms.internal.clearcut.zzeh.zzi(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 30:
                        com.google.android.gms.internal.clearcut.zzeh.zzm(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 31:
                        com.google.android.gms.internal.clearcut.zzeh.zzl(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 32:
                        com.google.android.gms.internal.clearcut.zzeh.zzg(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 33:
                        com.google.android.gms.internal.clearcut.zzeh.zzj(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 34:
                        com.google.android.gms.internal.clearcut.zzeh.zze(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, false);
                        break;
                    case 35:
                        com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[length], (java.util.List<java.lang.Double>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 36:
                        com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[length], (java.util.List<java.lang.Float>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 37:
                        com.google.android.gms.internal.clearcut.zzeh.zzc(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 38:
                        com.google.android.gms.internal.clearcut.zzeh.zzd(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 39:
                        com.google.android.gms.internal.clearcut.zzeh.zzh(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 40:
                        com.google.android.gms.internal.clearcut.zzeh.zzf(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 41:
                        com.google.android.gms.internal.clearcut.zzeh.zzk(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 42:
                        com.google.android.gms.internal.clearcut.zzeh.zzn(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 43:
                        com.google.android.gms.internal.clearcut.zzeh.zzi(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 44:
                        com.google.android.gms.internal.clearcut.zzeh.zzm(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 45:
                        com.google.android.gms.internal.clearcut.zzeh.zzl(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 46:
                        com.google.android.gms.internal.clearcut.zzeh.zzg(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 47:
                        com.google.android.gms.internal.clearcut.zzeh.zzj(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 48:
                        com.google.android.gms.internal.clearcut.zzeh.zze(this.zzmi[length], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, true);
                        break;
                    case 49:
                        com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[length], (java.util.List<?>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar, zzad(length));
                        break;
                    case 50:
                        zza(zzfrVar, i, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), length);
                        break;
                    case 51:
                        if (zza(t, i, length)) {
                            dZzn2 = zze(t, iZzag & 1048575);
                            zzfrVar.zza(i, dZzn2);
                        }
                        break;
                    case 52:
                        if (zza(t, i, length)) {
                            fZzm2 = zzf(t, iZzag & 1048575);
                            zzfrVar.zza(i, fZzm2);
                        }
                        break;
                    case 53:
                        if (zza(t, i, length)) {
                            jZzk6 = zzh(t, iZzag & 1048575);
                            zzfrVar.zzi(i, jZzk6);
                        }
                        break;
                    case 54:
                        if (zza(t, i, length)) {
                            jZzk7 = zzh(t, iZzag & 1048575);
                            zzfrVar.zza(i, jZzk7);
                        }
                        break;
                    case 55:
                        if (zza(t, i, length)) {
                            iZzj7 = zzg(t, iZzag & 1048575);
                            zzfrVar.zzc(i, iZzj7);
                        }
                        break;
                    case 56:
                        if (zza(t, i, length)) {
                            jZzk8 = zzh(t, iZzag & 1048575);
                            zzfrVar.zzc(i, jZzk8);
                        }
                        break;
                    case 57:
                        if (zza(t, i, length)) {
                            iZzj8 = zzg(t, iZzag & 1048575);
                            zzfrVar.zzf(i, iZzj8);
                        }
                        break;
                    case 58:
                        if (zza(t, i, length)) {
                            zZzl2 = zzi(t, iZzag & 1048575);
                            zzfrVar.zzb(i, zZzl2);
                        }
                        break;
                    case 59:
                        if (zza(t, i, length)) {
                            zza(i, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzfrVar);
                        }
                        break;
                    case 60:
                        if (zza(t, i, length)) {
                            zzfrVar.zza(i, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzad(length));
                        }
                        break;
                    case 61:
                        if (zza(t, i, length)) {
                            zzfrVar.zza(i, (com.google.android.gms.internal.clearcut.zzbb) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575));
                        }
                        break;
                    case 62:
                        if (zza(t, i, length)) {
                            iZzj9 = zzg(t, iZzag & 1048575);
                            zzfrVar.zzd(i, iZzj9);
                        }
                        break;
                    case 63:
                        if (zza(t, i, length)) {
                            iZzj10 = zzg(t, iZzag & 1048575);
                            zzfrVar.zzn(i, iZzj10);
                        }
                        break;
                    case 64:
                        if (zza(t, i, length)) {
                            iZzj11 = zzg(t, iZzag & 1048575);
                            zzfrVar.zzm(i, iZzj11);
                        }
                        break;
                    case 65:
                        if (zza(t, i, length)) {
                            jZzk9 = zzh(t, iZzag & 1048575);
                            zzfrVar.zzj(i, jZzk9);
                        }
                        break;
                    case 66:
                        if (zza(t, i, length)) {
                            iZzj12 = zzg(t, iZzag & 1048575);
                            zzfrVar.zze(i, iZzj12);
                        }
                        break;
                    case 67:
                        if (zza(t, i, length)) {
                            jZzk10 = zzh(t, iZzag & 1048575);
                            zzfrVar.zzb(i, jZzk10);
                        }
                        break;
                    case 68:
                        if (zza(t, i, length)) {
                            zzfrVar.zzb(i, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575), zzad(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.zzmy.zza(zzfrVar, entry2);
                entry2 = itDescendingIterator.hasNext() ? (java.util.Map.Entry) itDescendingIterator.next() : null;
            }
            return;
        }
        if (!this.zzmq) {
            zzb(t, zzfrVar);
            return;
        }
        if (this.zzmo) {
            com.google.android.gms.internal.clearcut.zzby<T> zzbyVarZza2 = this.zzmy.zza(t);
            if (zzbyVarZza2.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = zzbyVarZza2.iterator();
                entry = (java.util.Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length2 = this.zzmi.length;
        for (int i2 = 0; i2 < length2; i2 += 4) {
            int iZzag2 = zzag(i2);
            int i3 = this.zzmi[i2];
            while (entry != null && this.zzmy.zza(entry) <= i3) {
                this.zzmy.zza(zzfrVar, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            switch ((iZzag2 & 267386880) >>> 20) {
                case 0:
                    if (zza(t, i2)) {
                        dZzn = com.google.android.gms.internal.clearcut.zzfd.zzn(t, iZzag2 & 1048575);
                        zzfrVar.zza(i3, dZzn);
                    }
                    break;
                case 1:
                    if (zza(t, i2)) {
                        fZzm = com.google.android.gms.internal.clearcut.zzfd.zzm(t, iZzag2 & 1048575);
                        zzfrVar.zza(i3, fZzm);
                    }
                    break;
                case 2:
                    if (zza(t, i2)) {
                        jZzk = com.google.android.gms.internal.clearcut.zzfd.zzk(t, iZzag2 & 1048575);
                        zzfrVar.zzi(i3, jZzk);
                    }
                    break;
                case 3:
                    if (zza(t, i2)) {
                        jZzk2 = com.google.android.gms.internal.clearcut.zzfd.zzk(t, iZzag2 & 1048575);
                        zzfrVar.zza(i3, jZzk2);
                    }
                    break;
                case 4:
                    if (zza(t, i2)) {
                        iZzj = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag2 & 1048575);
                        zzfrVar.zzc(i3, iZzj);
                    }
                    break;
                case 5:
                    if (zza(t, i2)) {
                        jZzk3 = com.google.android.gms.internal.clearcut.zzfd.zzk(t, iZzag2 & 1048575);
                        zzfrVar.zzc(i3, jZzk3);
                    }
                    break;
                case 6:
                    if (zza(t, i2)) {
                        iZzj2 = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag2 & 1048575);
                        zzfrVar.zzf(i3, iZzj2);
                    }
                    break;
                case 7:
                    if (zza(t, i2)) {
                        zZzl = com.google.android.gms.internal.clearcut.zzfd.zzl(t, iZzag2 & 1048575);
                        zzfrVar.zzb(i3, zZzl);
                    }
                    break;
                case 8:
                    if (zza(t, i2)) {
                        zza(i3, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar);
                    }
                    break;
                case 9:
                    if (zza(t, i2)) {
                        zzfrVar.zza(i3, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzad(i2));
                    }
                    break;
                case 10:
                    if (zza(t, i2)) {
                        zzfrVar.zza(i3, (com.google.android.gms.internal.clearcut.zzbb) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575));
                    }
                    break;
                case 11:
                    if (zza(t, i2)) {
                        iZzj3 = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag2 & 1048575);
                        zzfrVar.zzd(i3, iZzj3);
                    }
                    break;
                case 12:
                    if (zza(t, i2)) {
                        iZzj4 = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag2 & 1048575);
                        zzfrVar.zzn(i3, iZzj4);
                    }
                    break;
                case 13:
                    if (zza(t, i2)) {
                        iZzj5 = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag2 & 1048575);
                        zzfrVar.zzm(i3, iZzj5);
                    }
                    break;
                case 14:
                    if (zza(t, i2)) {
                        jZzk4 = com.google.android.gms.internal.clearcut.zzfd.zzk(t, iZzag2 & 1048575);
                        zzfrVar.zzj(i3, jZzk4);
                    }
                    break;
                case 15:
                    if (zza(t, i2)) {
                        iZzj6 = com.google.android.gms.internal.clearcut.zzfd.zzj(t, iZzag2 & 1048575);
                        zzfrVar.zze(i3, iZzj6);
                    }
                    break;
                case 16:
                    if (zza(t, i2)) {
                        jZzk5 = com.google.android.gms.internal.clearcut.zzfd.zzk(t, iZzag2 & 1048575);
                        zzfrVar.zzb(i3, jZzk5);
                    }
                    break;
                case 17:
                    if (zza(t, i2)) {
                        zzfrVar.zzb(i3, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzad(i2));
                    }
                    break;
                case 18:
                    com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[i2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 19:
                    com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[i2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 20:
                    com.google.android.gms.internal.clearcut.zzeh.zzc(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 21:
                    com.google.android.gms.internal.clearcut.zzeh.zzd(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 22:
                    com.google.android.gms.internal.clearcut.zzeh.zzh(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 23:
                    com.google.android.gms.internal.clearcut.zzeh.zzf(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 24:
                    com.google.android.gms.internal.clearcut.zzeh.zzk(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 25:
                    com.google.android.gms.internal.clearcut.zzeh.zzn(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 26:
                    com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[i2], (java.util.List<java.lang.String>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar);
                    break;
                case 27:
                    com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[i2], (java.util.List<?>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, zzad(i2));
                    break;
                case 28:
                    com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar);
                    break;
                case 29:
                    com.google.android.gms.internal.clearcut.zzeh.zzi(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 30:
                    com.google.android.gms.internal.clearcut.zzeh.zzm(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 31:
                    com.google.android.gms.internal.clearcut.zzeh.zzl(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 32:
                    com.google.android.gms.internal.clearcut.zzeh.zzg(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 33:
                    com.google.android.gms.internal.clearcut.zzeh.zzj(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 34:
                    com.google.android.gms.internal.clearcut.zzeh.zze(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, false);
                    break;
                case 35:
                    com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmi[i2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 36:
                    com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[i2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 37:
                    com.google.android.gms.internal.clearcut.zzeh.zzc(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 38:
                    com.google.android.gms.internal.clearcut.zzeh.zzd(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 39:
                    com.google.android.gms.internal.clearcut.zzeh.zzh(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 40:
                    com.google.android.gms.internal.clearcut.zzeh.zzf(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 41:
                    com.google.android.gms.internal.clearcut.zzeh.zzk(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 42:
                    com.google.android.gms.internal.clearcut.zzeh.zzn(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 43:
                    com.google.android.gms.internal.clearcut.zzeh.zzi(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 44:
                    com.google.android.gms.internal.clearcut.zzeh.zzm(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 45:
                    com.google.android.gms.internal.clearcut.zzeh.zzl(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 46:
                    com.google.android.gms.internal.clearcut.zzeh.zzg(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 47:
                    com.google.android.gms.internal.clearcut.zzeh.zzj(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 48:
                    com.google.android.gms.internal.clearcut.zzeh.zze(this.zzmi[i2], (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, true);
                    break;
                case 49:
                    com.google.android.gms.internal.clearcut.zzeh.zzb(this.zzmi[i2], (java.util.List<?>) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar, zzad(i2));
                    break;
                case 50:
                    zza(zzfrVar, i3, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), i2);
                    break;
                case 51:
                    if (zza(t, i3, i2)) {
                        dZzn = zze(t, iZzag2 & 1048575);
                        zzfrVar.zza(i3, dZzn);
                    }
                    break;
                case 52:
                    if (zza(t, i3, i2)) {
                        fZzm = zzf(t, iZzag2 & 1048575);
                        zzfrVar.zza(i3, fZzm);
                    }
                    break;
                case 53:
                    if (zza(t, i3, i2)) {
                        jZzk = zzh(t, iZzag2 & 1048575);
                        zzfrVar.zzi(i3, jZzk);
                    }
                    break;
                case 54:
                    if (zza(t, i3, i2)) {
                        jZzk2 = zzh(t, iZzag2 & 1048575);
                        zzfrVar.zza(i3, jZzk2);
                    }
                    break;
                case 55:
                    if (zza(t, i3, i2)) {
                        iZzj = zzg(t, iZzag2 & 1048575);
                        zzfrVar.zzc(i3, iZzj);
                    }
                    break;
                case 56:
                    if (zza(t, i3, i2)) {
                        jZzk3 = zzh(t, iZzag2 & 1048575);
                        zzfrVar.zzc(i3, jZzk3);
                    }
                    break;
                case 57:
                    if (zza(t, i3, i2)) {
                        iZzj2 = zzg(t, iZzag2 & 1048575);
                        zzfrVar.zzf(i3, iZzj2);
                    }
                    break;
                case 58:
                    if (zza(t, i3, i2)) {
                        zZzl = zzi(t, iZzag2 & 1048575);
                        zzfrVar.zzb(i3, zZzl);
                    }
                    break;
                case 59:
                    if (zza(t, i3, i2)) {
                        zza(i3, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzfrVar);
                    }
                    break;
                case 60:
                    if (zza(t, i3, i2)) {
                        zzfrVar.zza(i3, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzad(i2));
                    }
                    break;
                case 61:
                    if (zza(t, i3, i2)) {
                        zzfrVar.zza(i3, (com.google.android.gms.internal.clearcut.zzbb) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575));
                    }
                    break;
                case 62:
                    if (zza(t, i3, i2)) {
                        iZzj3 = zzg(t, iZzag2 & 1048575);
                        zzfrVar.zzd(i3, iZzj3);
                    }
                    break;
                case 63:
                    if (zza(t, i3, i2)) {
                        iZzj4 = zzg(t, iZzag2 & 1048575);
                        zzfrVar.zzn(i3, iZzj4);
                    }
                    break;
                case 64:
                    if (zza(t, i3, i2)) {
                        iZzj5 = zzg(t, iZzag2 & 1048575);
                        zzfrVar.zzm(i3, iZzj5);
                    }
                    break;
                case 65:
                    if (zza(t, i3, i2)) {
                        jZzk4 = zzh(t, iZzag2 & 1048575);
                        zzfrVar.zzj(i3, jZzk4);
                    }
                    break;
                case 66:
                    if (zza(t, i3, i2)) {
                        iZzj6 = zzg(t, iZzag2 & 1048575);
                        zzfrVar.zze(i3, iZzj6);
                    }
                    break;
                case 67:
                    if (zza(t, i3, i2)) {
                        jZzk5 = zzh(t, iZzag2 & 1048575);
                        zzfrVar.zzb(i3, jZzk5);
                    }
                    break;
                case 68:
                    if (zza(t, i3, i2)) {
                        zzfrVar.zzb(i3, com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag2 & 1048575), zzad(i2));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.zzmy.zza(zzfrVar, entry);
            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
        }
        zza(this.zzmx, t, zzfrVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0164, code lost:
    
        if (r0 == r15) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
    
        if (r0 == r15) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a1, code lost:
    
        if (r0 == r15) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a3, code lost:
    
        r2 = r0;
     */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.clearcut.zzay r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.zzay):void");
    }

    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(T t) {
        int[] iArr = this.zzmt;
        if (iArr != null) {
            for (int i : iArr) {
                long jZzag = zzag(i) & 1048575;
                java.lang.Object objZzo = com.google.android.gms.internal.clearcut.zzfd.zzo(t, jZzag);
                if (objZzo != null) {
                    com.google.android.gms.internal.clearcut.zzfd.zza(t, jZzag, this.zzmz.zzj(objZzo));
                }
            }
        }
        int[] iArr2 = this.zzmu;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.zzmw.zza(t, i2);
            }
        }
        this.zzmx.zzc(t);
        if (this.zzmo) {
            this.zzmy.zzc(t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    @Override // com.google.android.gms.internal.clearcut.zzef
    public final void zzc(T t, T t2) {
        java.util.Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzmi.length; i += 4) {
            int iZzag = zzag(i);
            long j = 1048575 & iZzag;
            int i2 = this.zzmi[i];
            switch ((iZzag & 267386880) >>> 20) {
                case 0:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza(t, j, com.google.android.gms.internal.clearcut.zzfd.zzn(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 1:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzm(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 2:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 3:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 4:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 5:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 6:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 7:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza(t, j, com.google.android.gms.internal.clearcut.zzfd.zzl(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 8:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza(t, j, com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 9:
                case 17:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza(t, j, com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 11:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 12:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 13:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 14:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 15:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 16:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza((java.lang.Object) t, j, com.google.android.gms.internal.clearcut.zzfd.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzmw.zza(t, t2, j);
                    break;
                case 50:
                    com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmz, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza(t2, i2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza(t, j, com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j));
                        zzb(t, i2, i);
                    }
                    break;
                case 60:
                case 68:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza(t2, i2, i)) {
                        com.google.android.gms.internal.clearcut.zzfd.zza(t, j, com.google.android.gms.internal.clearcut.zzfd.zzo(t2, j));
                        zzb(t, i2, i);
                    }
                    break;
            }
        }
        if (this.zzmq) {
            return;
        }
        com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmx, t, t2);
        if (this.zzmo) {
            com.google.android.gms.internal.clearcut.zzeh.zza(this.zzmy, t, t2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x020d A[PHI: r5
      0x020d: PHI (r5v71 int) = 
      (r5v34 int)
      (r5v37 int)
      (r5v40 int)
      (r5v43 int)
      (r5v46 int)
      (r5v49 int)
      (r5v52 int)
      (r5v55 int)
      (r5v58 int)
      (r5v61 int)
      (r5v64 int)
      (r5v67 int)
      (r5v70 int)
      (r5v75 int)
     binds: [B:141:0x020b, B:136:0x01fa, B:131:0x01e9, B:126:0x01d8, B:121:0x01c7, B:116:0x01b6, B:111:0x01a5, B:106:0x0193, B:101:0x0181, B:96:0x016f, B:91:0x015d, B:86:0x014b, B:81:0x0139, B:76:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x029f  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:174:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:185:0x0306  */
    /* JADX WARN: Code duplicated, block: B:186:0x030a A[PHI: r5
      0x030a: PHI (r5v94 java.lang.Object) = (r5v12 java.lang.Object), (r5v92 java.lang.Object), (r5v96 java.lang.Object) binds: [B:193:0x0331, B:45:0x00ab, B:185:0x0306] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:189:0x0317  */
    /* JADX WARN: Code duplicated, block: B:195:0x0334 A[PHI: r5
      0x0334: PHI (r5v90 java.lang.Object) = (r5v12 java.lang.Object), (r5v92 java.lang.Object) binds: [B:193:0x0331, B:45:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:198:0x0342  */
    /* JADX WARN: Code duplicated, block: B:201:0x034e  */
    /* JADX WARN: Code duplicated, block: B:204:0x035a  */
    /* JADX WARN: Code duplicated, block: B:219:0x0396  */
    /* JADX WARN: Code duplicated, block: B:222:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:374:0x05fa A[PHI: r4
      0x05fa: PHI (r4v105 int) = 
      (r4v68 int)
      (r4v71 int)
      (r4v74 int)
      (r4v77 int)
      (r4v80 int)
      (r4v83 int)
      (r4v86 int)
      (r4v89 int)
      (r4v92 int)
      (r4v95 int)
      (r4v98 int)
      (r4v101 int)
      (r4v104 int)
      (r4v109 int)
     binds: [B:373:0x05f8, B:368:0x05e7, B:363:0x05d6, B:358:0x05c5, B:353:0x05b4, B:348:0x05a3, B:343:0x0592, B:338:0x0580, B:333:0x056e, B:328:0x055c, B:323:0x054a, B:318:0x0538, B:313:0x0526, B:308:0x0514] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:390:0x06aa A[PHI: r6
      0x06aa: PHI (r6v4 int) = 
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v13 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v14 int)
      (r6v1 int)
     binds: [B:245:0x040b, B:435:0x0751, B:432:0x0747, B:426:0x0732, B:423:0x0720, B:419:0x0711, B:415:0x0704, B:411:0x06f7, B:407:0x06ec, B:404:0x06e1, B:400:0x06d4, B:396:0x06c7, B:393:0x06b4, B:371:0x05f4, B:366:0x05e3, B:361:0x05d2, B:356:0x05c1, B:351:0x05b0, B:346:0x059f, B:341:0x058e, B:336:0x057c, B:331:0x056a, B:326:0x0558, B:321:0x0546, B:316:0x0534, B:311:0x0522, B:306:0x0510, B:301:0x04dc, B:298:0x04cf, B:295:0x04bf, B:292:0x04af, B:289:0x049f, B:286:0x0491, B:283:0x0484, B:280:0x047c, B:275:0x046c, B:272:0x0464, B:269:0x045c, B:266:0x0450, B:263:0x0444, B:409:0x06f3, B:260:0x043c, B:257:0x0434, B:254:0x0428, B:251:0x041c, B:389:0x06a9, B:248:0x0414] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:421:0x0717 A[PHI: r4
      0x0717: PHI (r4v140 java.lang.Object) = (r4v14 java.lang.Object), (r4v136 java.lang.Object), (r4v143 java.lang.Object) binds: [B:428:0x073a, B:277:0x0474, B:420:0x0713] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:430:0x073d A[PHI: r4
      0x073d: PHI (r4v132 java.lang.Object) = (r4v14 java.lang.Object), (r4v136 java.lang.Object) binds: [B:428:0x073a, B:277:0x0474] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0414, code lost:
    
        if (zza(r20, r15, r5) != false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0434, code lost:
    
        if (zza(r20, r15, r5) != false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x043c, code lost:
    
        if (zza(r20, r15, r5) != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x045c, code lost:
    
        if (zza(r20, r15, r5) != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0464, code lost:
    
        if (zza(r20, r15, r5) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x047c, code lost:
    
        if (zza(r20, r15, r5) != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x06b4, code lost:
    
        if ((r12 & r18) != 0) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x06b6, code lost:
    
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzdo) r2.getObject(r20, r10), zzad(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x06e1, code lost:
    
        if ((r12 & r18) != 0) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x06e3, code lost:
    
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x06ec, code lost:
    
        if ((r12 & r18) != 0) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x06ee, code lost:
    
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzk(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0711, code lost:
    
        if ((r12 & r18) != 0) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0713, code lost:
    
        r4 = r2.getObject(r20, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0720, code lost:
    
        if ((r12 & r18) != 0) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0722, code lost:
    
        r4 = com.google.android.gms.internal.clearcut.zzeh.zzc(r15, r2.getObject(r20, r10), zzad(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0747, code lost:
    
        if ((r12 & r18) != 0) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0749, code lost:
    
        r4 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, true);
     */
    @Override // com.google.android.gms.internal.clearcut.zzef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzm(T r20) {
        /*
            Method dump skipped, instruction units count: 2290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzds.zzm(java.lang.Object):int");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6 A[EDGE_INSN: B:53:0x00c6->B:54:0x00c7 BREAK  A[LOOP:1: B:45:0x00a6->B:103:?]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:70:0x0103 A[LOOP:2: B:65:0x00f1->B:70:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0106 A[EDGE_INSN: B:71:0x0106->B:72:0x0107 BREAK  A[LOOP:2: B:65:0x00f1->B:70:0x0103]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x011d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.google.android.gms.internal.clearcut.zzef] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27, types: [com.google.android.gms.internal.clearcut.zzef] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    @Override // com.google.android.gms.internal.clearcut.zzef
    public final boolean zzo(T t) {
        int i;
        java.util.List list;
        boolean z;
        ?? Zzad;
        int i2;
        boolean z2;
        int[] iArr = this.zzms;
        if (iArr != null && iArr.length != 0) {
            int i3 = -1;
            int i4 = 0;
            for (int i5 : iArr) {
                int iZzai = zzai(i5);
                int iZzag = zzag(iZzai);
                if (this.zzmq) {
                    i = 0;
                } else {
                    int i6 = this.zzmi[iZzai + 2];
                    int i7 = i6 & 1048575;
                    i = 1 << (i6 >>> 20);
                    if (i7 != i3) {
                        i4 = zzmh.getInt(t, i7);
                        i3 = i7;
                    }
                }
                if (((268435456 & iZzag) != 0) && !zza(t, iZzai, i4, i)) {
                    return false;
                }
                int i8 = (267386880 & iZzag) >>> 20;
                if (i8 == 9 || i8 == 17) {
                    if (zza(t, iZzai, i4, i) && !zza(t, iZzag, zzad(iZzai))) {
                        return false;
                    }
                } else if (i8 == 27) {
                    list = (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575);
                    if (!list.isEmpty()) {
                        z = true;
                        break;
                    }
                    Zzad = zzad(iZzai);
                    i2 = 0;
                    while (true) {
                        if (i2 < list.size()) {
                            z = true;
                            break;
                        }
                        if (!Zzad.zzo(list.get(i2))) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    if (!z) {
                        return false;
                    }
                } else if (i8 == 60 || i8 == 68) {
                    if (zza(t, i5, iZzai) && !zza(t, iZzag, zzad(iZzai))) {
                        return false;
                    }
                } else if (i8 == 49) {
                    list = (java.util.List) com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575);
                    if (!list.isEmpty()) {
                        z = true;
                        break;
                    }
                    Zzad = zzad(iZzai);
                    i2 = 0;
                    while (true) {
                        if (i2 < list.size()) {
                            z = true;
                            break;
                        }
                        if (!Zzad.zzo(list.get(i2))) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    if (!z) {
                        return false;
                    }
                } else if (i8 != 50) {
                    continue;
                } else {
                    java.util.Map<?, ?> mapZzh = this.zzmz.zzh(com.google.android.gms.internal.clearcut.zzfd.zzo(t, iZzag & 1048575));
                    if (mapZzh.isEmpty()) {
                        z2 = true;
                        break;
                    }
                    if (this.zzmz.zzl(zzae(iZzai)).zzmd.zzek() != com.google.android.gms.internal.clearcut.zzfq.MESSAGE) {
                        z2 = true;
                        break;
                    }
                    ?? Zze = 0;
                    java.util.Iterator<?> it = mapZzh.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = true;
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (Zze == 0) {
                            Zze = Zze;
                            Zze = com.google.android.gms.internal.clearcut.zzea.zzcm().zze(next.getClass());
                        }
                        Zze = Zze;
                        if (!Zze.zzo(next)) {
                            z2 = false;
                            break;
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                }
            }
            if (this.zzmo && !this.zzmy.zza(t).isInitialized()) {
                return false;
            }
        }
        return true;
    }
}
