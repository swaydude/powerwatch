package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzig<T> implements com.google.android.gms.internal.vision.zzir<T> {
    private static final int[] zzys = new int[0];
    private static final sun.misc.Unsafe zzyt = com.google.android.gms.internal.vision.zzjp.zzil();
    private final int[] zzyu;
    private final java.lang.Object[] zzyv;
    private final int zzyw;
    private final int zzyx;
    private final com.google.android.gms.internal.vision.zzic zzyy;
    private final boolean zzyz;
    private final boolean zzza;
    private final boolean zzzb;
    private final boolean zzzc;
    private final int[] zzzd;
    private final int zzze;
    private final int zzzf;
    private final com.google.android.gms.internal.vision.zzik zzzg;
    private final com.google.android.gms.internal.vision.zzhm zzzh;
    private final com.google.android.gms.internal.vision.zzjj<?, ?> zzzi;
    private final com.google.android.gms.internal.vision.zzgf<?> zzzj;
    private final com.google.android.gms.internal.vision.zzhv zzzk;

    private zzig(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.vision.zzic zzicVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, com.google.android.gms.internal.vision.zzik zzikVar, com.google.android.gms.internal.vision.zzhm zzhmVar, com.google.android.gms.internal.vision.zzjj<?, ?> zzjjVar, com.google.android.gms.internal.vision.zzgf<?> zzgfVar, com.google.android.gms.internal.vision.zzhv zzhvVar) {
        this.zzyu = iArr;
        this.zzyv = objArr;
        this.zzyw = i;
        this.zzyx = i2;
        this.zzza = zzicVar instanceof com.google.android.gms.internal.vision.zzgs;
        this.zzzb = z;
        this.zzyz = zzgfVar != null && zzgfVar.zze(zzicVar);
        this.zzzc = false;
        this.zzzd = iArr2;
        this.zzze = i3;
        this.zzzf = i4;
        this.zzzg = zzikVar;
        this.zzzh = zzhmVar;
        this.zzzi = zzjjVar;
        this.zzzj = zzgfVar;
        this.zzyy = zzicVar;
        this.zzzk = zzhvVar;
    }

    private static boolean zzbr(int i) {
        return (i & 536870912) != 0;
    }

    static <T> com.google.android.gms.internal.vision.zzig<T> zza(java.lang.Class<T> cls, com.google.android.gms.internal.vision.zzia zziaVar, com.google.android.gms.internal.vision.zzik zzikVar, com.google.android.gms.internal.vision.zzhm zzhmVar, com.google.android.gms.internal.vision.zzjj<?, ?> zzjjVar, com.google.android.gms.internal.vision.zzgf<?> zzgfVar, com.google.android.gms.internal.vision.zzhv zzhvVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        boolean z;
        int i17;
        com.google.android.gms.internal.vision.zzip zzipVar;
        int i18;
        int i19;
        int iObjectFieldOffset;
        java.lang.String str;
        int iObjectFieldOffset2;
        int i20;
        java.lang.reflect.Field fieldZza;
        int i21;
        char cCharAt9;
        int i22;
        java.lang.reflect.Field fieldZza2;
        java.lang.reflect.Field fieldZza3;
        int i23;
        char cCharAt10;
        int i24;
        char cCharAt11;
        int i25;
        char cCharAt12;
        int i26;
        char cCharAt13;
        char cCharAt14;
        if (zziaVar instanceof com.google.android.gms.internal.vision.zzip) {
            com.google.android.gms.internal.vision.zzip zzipVar2 = (com.google.android.gms.internal.vision.zzip) zziaVar;
            int i27 = 0;
            boolean z2 = zzipVar2.zzhi() == com.google.android.gms.internal.vision.zzgs.zzf.zzwu;
            java.lang.String strZzhp = zzipVar2.zzhp();
            int length = strZzhp.length();
            int iCharAt3 = strZzhp.charAt(0);
            if (iCharAt3 >= 55296) {
                int i28 = iCharAt3 & 8191;
                int i29 = 1;
                int i30 = 13;
                while (true) {
                    i = i29 + 1;
                    cCharAt14 = strZzhp.charAt(i29);
                    if (cCharAt14 < 55296) {
                        break;
                    }
                    i28 |= (cCharAt14 & 8191) << i30;
                    i30 += 13;
                    i29 = i;
                }
                iCharAt3 = i28 | (cCharAt14 << i30);
            } else {
                i = 1;
            }
            int i31 = i + 1;
            int iCharAt4 = strZzhp.charAt(i);
            if (iCharAt4 >= 55296) {
                int i32 = iCharAt4 & 8191;
                int i33 = 13;
                while (true) {
                    i26 = i31 + 1;
                    cCharAt13 = strZzhp.charAt(i31);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i32 |= (cCharAt13 & 8191) << i33;
                    i33 += 13;
                    i31 = i26;
                }
                iCharAt4 = i32 | (cCharAt13 << i33);
                i31 = i26;
            }
            if (iCharAt4 == 0) {
                iArr = zzys;
                i6 = 0;
                i3 = 0;
                iCharAt = 0;
                i4 = 0;
                iCharAt2 = 0;
                i5 = 0;
            } else {
                int i34 = i31 + 1;
                int iCharAt5 = strZzhp.charAt(i31);
                if (iCharAt5 >= 55296) {
                    int i35 = iCharAt5 & 8191;
                    int i36 = 13;
                    while (true) {
                        i14 = i34 + 1;
                        cCharAt8 = strZzhp.charAt(i34);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i35 |= (cCharAt8 & 8191) << i36;
                        i36 += 13;
                        i34 = i14;
                    }
                    iCharAt5 = i35 | (cCharAt8 << i36);
                    i34 = i14;
                }
                int i37 = i34 + 1;
                int iCharAt6 = strZzhp.charAt(i34);
                if (iCharAt6 >= 55296) {
                    int i38 = iCharAt6 & 8191;
                    int i39 = 13;
                    while (true) {
                        i13 = i37 + 1;
                        cCharAt7 = strZzhp.charAt(i37);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i38 |= (cCharAt7 & 8191) << i39;
                        i39 += 13;
                        i37 = i13;
                    }
                    iCharAt6 = i38 | (cCharAt7 << i39);
                    i37 = i13;
                }
                int i40 = i37 + 1;
                iCharAt = strZzhp.charAt(i37);
                if (iCharAt >= 55296) {
                    int i41 = iCharAt & 8191;
                    int i42 = 13;
                    while (true) {
                        i12 = i40 + 1;
                        cCharAt6 = strZzhp.charAt(i40);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i41 |= (cCharAt6 & 8191) << i42;
                        i42 += 13;
                        i40 = i12;
                    }
                    iCharAt = i41 | (cCharAt6 << i42);
                    i40 = i12;
                }
                int i43 = i40 + 1;
                int iCharAt7 = strZzhp.charAt(i40);
                if (iCharAt7 >= 55296) {
                    int i44 = iCharAt7 & 8191;
                    int i45 = 13;
                    while (true) {
                        i11 = i43 + 1;
                        cCharAt5 = strZzhp.charAt(i43);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i44 |= (cCharAt5 & 8191) << i45;
                        i45 += 13;
                        i43 = i11;
                    }
                    iCharAt7 = i44 | (cCharAt5 << i45);
                    i43 = i11;
                }
                int i46 = i43 + 1;
                iCharAt2 = strZzhp.charAt(i43);
                if (iCharAt2 >= 55296) {
                    int i47 = iCharAt2 & 8191;
                    int i48 = 13;
                    while (true) {
                        i10 = i46 + 1;
                        cCharAt4 = strZzhp.charAt(i46);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i47 |= (cCharAt4 & 8191) << i48;
                        i48 += 13;
                        i46 = i10;
                    }
                    iCharAt2 = i47 | (cCharAt4 << i48);
                    i46 = i10;
                }
                int i49 = i46 + 1;
                int iCharAt8 = strZzhp.charAt(i46);
                if (iCharAt8 >= 55296) {
                    int i50 = iCharAt8 & 8191;
                    int i51 = 13;
                    while (true) {
                        i9 = i49 + 1;
                        cCharAt3 = strZzhp.charAt(i49);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i50 |= (cCharAt3 & 8191) << i51;
                        i51 += 13;
                        i49 = i9;
                    }
                    iCharAt8 = i50 | (cCharAt3 << i51);
                    i49 = i9;
                }
                int i52 = i49 + 1;
                int iCharAt9 = strZzhp.charAt(i49);
                if (iCharAt9 >= 55296) {
                    int i53 = iCharAt9 & 8191;
                    int i54 = i52;
                    int i55 = 13;
                    while (true) {
                        i8 = i54 + 1;
                        cCharAt2 = strZzhp.charAt(i54);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i53 |= (cCharAt2 & 8191) << i55;
                        i55 += 13;
                        i54 = i8;
                    }
                    iCharAt9 = i53 | (cCharAt2 << i55);
                    i2 = i8;
                } else {
                    i2 = i52;
                }
                int i56 = i2 + 1;
                int iCharAt10 = strZzhp.charAt(i2);
                if (iCharAt10 >= 55296) {
                    int i57 = iCharAt10 & 8191;
                    int i58 = i56;
                    int i59 = 13;
                    while (true) {
                        i7 = i58 + 1;
                        cCharAt = strZzhp.charAt(i58);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i57 |= (cCharAt & 8191) << i59;
                        i59 += 13;
                        i58 = i7;
                    }
                    iCharAt10 = i57 | (cCharAt << i59);
                    i56 = i7;
                }
                int[] iArr2 = new int[iCharAt10 + iCharAt8 + iCharAt9];
                int i60 = (iCharAt5 << 1) + iCharAt6;
                i3 = iCharAt7;
                i4 = i60;
                i5 = iCharAt10;
                i27 = iCharAt5;
                i31 = i56;
                int i61 = iCharAt8;
                iArr = iArr2;
                i6 = i61;
            }
            sun.misc.Unsafe unsafe = zzyt;
            java.lang.Object[] objArrZzhq = zzipVar2.zzhq();
            java.lang.Class<?> cls2 = zzipVar2.zzhk().getClass();
            int i62 = i31;
            int[] iArr3 = new int[iCharAt2 * 3];
            java.lang.Object[] objArr = new java.lang.Object[iCharAt2 << 1];
            int i63 = i5 + i6;
            int i64 = i5;
            int i65 = i62;
            int i66 = i63;
            int i67 = 0;
            int i68 = 0;
            while (i65 < length) {
                int i69 = i65 + 1;
                int iCharAt11 = strZzhp.charAt(i65);
                int i70 = length;
                if (iCharAt11 >= 55296) {
                    int i71 = iCharAt11 & 8191;
                    int i72 = i69;
                    int i73 = 13;
                    while (true) {
                        i25 = i72 + 1;
                        cCharAt12 = strZzhp.charAt(i72);
                        i15 = i5;
                        if (cCharAt12 < 55296) {
                            break;
                        }
                        i71 |= (cCharAt12 & 8191) << i73;
                        i73 += 13;
                        i72 = i25;
                        i5 = i15;
                    }
                    iCharAt11 = i71 | (cCharAt12 << i73);
                    i16 = i25;
                } else {
                    i15 = i5;
                    i16 = i69;
                }
                int i74 = i16 + 1;
                int iCharAt12 = strZzhp.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i24 = i76 + 1;
                        cCharAt11 = strZzhp.charAt(i76);
                        z = z2;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i75 |= (cCharAt11 & 8191) << i77;
                        i77 += 13;
                        i76 = i24;
                        z2 = z;
                    }
                    iCharAt12 = i75 | (cCharAt11 << i77);
                    i17 = i24;
                } else {
                    z = z2;
                    i17 = i74;
                }
                int i78 = iCharAt12 & 255;
                int i79 = i3;
                if ((iCharAt12 & 1024) != 0) {
                    iArr[i67] = i68;
                    i67++;
                }
                int i80 = iCharAt;
                if (i78 >= 51) {
                    int i81 = i17 + 1;
                    int iCharAt13 = strZzhp.charAt(i17);
                    char c = 55296;
                    if (iCharAt13 >= 55296) {
                        int i82 = iCharAt13 & 8191;
                        int i83 = 13;
                        while (true) {
                            i23 = i81 + 1;
                            cCharAt10 = strZzhp.charAt(i81);
                            if (cCharAt10 < c) {
                                break;
                            }
                            i82 |= (cCharAt10 & 8191) << i83;
                            i83 += 13;
                            i81 = i23;
                            c = 55296;
                        }
                        iCharAt13 = i82 | (cCharAt10 << i83);
                        i81 = i23;
                    }
                    int i84 = i78 - 51;
                    int i85 = i81;
                    if (i84 == 9 || i84 == 17) {
                        objArr[((i68 / 3) << 1) + 1] = objArrZzhq[i4];
                        i4++;
                    } else if (i84 == 12 && (iCharAt3 & 1) == 1) {
                        objArr[((i68 / 3) << 1) + 1] = objArrZzhq[i4];
                        i4++;
                    }
                    int i86 = iCharAt13 << 1;
                    java.lang.Object obj = objArrZzhq[i86];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldZza2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldZza2 = zza(cls2, (java.lang.String) obj);
                        objArrZzhq[i86] = fieldZza2;
                    }
                    zzipVar = zzipVar2;
                    java.lang.String str2 = strZzhp;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza2);
                    int i87 = i86 + 1;
                    java.lang.Object obj2 = objArrZzhq[i87];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldZza3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldZza3 = zza(cls2, (java.lang.String) obj2);
                        objArrZzhq[i87] = fieldZza3;
                    }
                    cls2 = cls2;
                    i18 = i4;
                    i17 = i85;
                    str = str2;
                    i20 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                    i27 = i27;
                } else {
                    zzipVar = zzipVar2;
                    java.lang.String str3 = strZzhp;
                    i18 = i4 + 1;
                    java.lang.reflect.Field fieldZza4 = zza(cls2, (java.lang.String) objArrZzhq[i4]);
                    if (i78 == 9 || i78 == 17) {
                        i19 = 1;
                        objArr[((i68 / 3) << 1) + 1] = fieldZza4.getType();
                    } else {
                        if (i78 == 27 || i78 == 49) {
                            i19 = 1;
                            i22 = i18 + 1;
                            objArr[((i68 / 3) << 1) + 1] = objArrZzhq[i18];
                        } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                            i19 = 1;
                            if ((iCharAt3 & 1) == 1) {
                                i22 = i18 + 1;
                                objArr[((i68 / 3) << 1) + 1] = objArrZzhq[i18];
                            }
                        } else if (i78 == 50) {
                            int i88 = i64 + 1;
                            iArr[i64] = i68;
                            int i89 = (i68 / 3) << 1;
                            int i90 = i18 + 1;
                            objArr[i89] = objArrZzhq[i18];
                            if ((iCharAt12 & 2048) != 0) {
                                i18 = i90 + 1;
                                objArr[i89 + 1] = objArrZzhq[i90];
                                i64 = i88;
                                i19 = 1;
                            } else {
                                i18 = i90;
                                i19 = 1;
                                i64 = i88;
                            }
                        } else {
                            i19 = 1;
                        }
                        i18 = i22;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza4);
                    if ((iCharAt3 & 1) != i19 || i78 > 17) {
                        str = str3;
                        iObjectFieldOffset2 = 0;
                        i20 = 0;
                    } else {
                        int i91 = i17 + 1;
                        str = str3;
                        int iCharAt14 = str.charAt(i17);
                        if (iCharAt14 >= 55296) {
                            int i92 = iCharAt14 & 8191;
                            int i93 = 13;
                            while (true) {
                                i21 = i91 + 1;
                                cCharAt9 = str.charAt(i91);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i92 |= (cCharAt9 & 8191) << i93;
                                i93 += 13;
                                i91 = i21;
                            }
                            iCharAt14 = i92 | (cCharAt9 << i93);
                            i91 = i21;
                        }
                        int i94 = (i27 << 1) + (iCharAt14 / 32);
                        java.lang.Object obj3 = objArrZzhq[i94];
                        if (obj3 instanceof java.lang.reflect.Field) {
                            fieldZza = (java.lang.reflect.Field) obj3;
                        } else {
                            fieldZza = zza(cls2, (java.lang.String) obj3);
                            objArrZzhq[i94] = fieldZza;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza);
                        i20 = iCharAt14 % 32;
                        i17 = i91;
                    }
                    if (i78 >= 18 && i78 <= 49) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                }
                int i95 = i68 + 1;
                iArr3[i68] = iCharAt11;
                int i96 = i95 + 1;
                iArr3[i95] = iObjectFieldOffset | ((iCharAt12 & 256) != 0 ? net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY : 0) | ((iCharAt12 & 512) != 0 ? 536870912 : 0) | (i78 << 20);
                i68 = i96 + 1;
                iArr3[i96] = (i20 << 20) | iObjectFieldOffset2;
                i27 = i27;
                strZzhp = str;
                i65 = i17;
                cls2 = cls2;
                i3 = i79;
                length = i70;
                i5 = i15;
                z2 = z;
                iCharAt = i80;
                i4 = i18;
                zzipVar2 = zzipVar;
            }
            return new com.google.android.gms.internal.vision.zzig<>(iArr3, objArr, iCharAt, i3, zzipVar2.zzhk(), z2, false, iArr, i5, i63, zzikVar, zzhmVar, zzjjVar, zzgfVar, zzhvVar);
        }
        ((com.google.android.gms.internal.vision.zzjg) zziaVar).zzhi();
        int i97 = com.google.android.gms.internal.vision.zzgs.zzf.zzwu;
        throw new java.lang.NoSuchMethodError();
    }

    private static java.lang.reflect.Field zza(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.String name = cls.getName();
            java.lang.String string = java.util.Arrays.toString(declaredFields);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40 + java.lang.String.valueOf(name).length() + java.lang.String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final T newInstance() {
        return (T) this.zzzg.newInstance(this.zzyy);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.vision.zzir
    public final boolean equals(T t, T t2) {
        int length = this.zzyu.length;
        int i = 0;
        while (true) {
            boolean zZze = true;
            if (i < length) {
                int iZzbp = zzbp(i);
                long j = iZzbp & 1048575;
                switch ((iZzbp & 267386880) >>> 20) {
                    case 0:
                        if (!zzc(t, t2, i) || java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zzjp.zzo(t, j)) != java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zzjp.zzo(t2, j))) {
                            zZze = false;
                        }
                        break;
                    case 1:
                        if (!zzc(t, t2, i) || java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zzjp.zzn(t, j)) != java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zzjp.zzn(t2, j))) {
                            zZze = false;
                        }
                        break;
                    case 2:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzl(t, j) != com.google.android.gms.internal.vision.zzjp.zzl(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 3:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzl(t, j) != com.google.android.gms.internal.vision.zzjp.zzl(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 4:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzk(t, j) != com.google.android.gms.internal.vision.zzjp.zzk(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 5:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzl(t, j) != com.google.android.gms.internal.vision.zzjp.zzl(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 6:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzk(t, j) != com.google.android.gms.internal.vision.zzjp.zzk(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 7:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzm(t, j) != com.google.android.gms.internal.vision.zzjp.zzm(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 8:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.vision.zzit.zze(com.google.android.gms.internal.vision.zzjp.zzp(t, j), com.google.android.gms.internal.vision.zzjp.zzp(t2, j))) {
                            zZze = false;
                        }
                        break;
                    case 9:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.vision.zzit.zze(com.google.android.gms.internal.vision.zzjp.zzp(t, j), com.google.android.gms.internal.vision.zzjp.zzp(t2, j))) {
                            zZze = false;
                        }
                        break;
                    case 10:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.vision.zzit.zze(com.google.android.gms.internal.vision.zzjp.zzp(t, j), com.google.android.gms.internal.vision.zzjp.zzp(t2, j))) {
                            zZze = false;
                        }
                        break;
                    case 11:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzk(t, j) != com.google.android.gms.internal.vision.zzjp.zzk(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 12:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzk(t, j) != com.google.android.gms.internal.vision.zzjp.zzk(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 13:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzk(t, j) != com.google.android.gms.internal.vision.zzjp.zzk(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 14:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzl(t, j) != com.google.android.gms.internal.vision.zzjp.zzl(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 15:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzk(t, j) != com.google.android.gms.internal.vision.zzjp.zzk(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 16:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.vision.zzjp.zzl(t, j) != com.google.android.gms.internal.vision.zzjp.zzl(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 17:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.vision.zzit.zze(com.google.android.gms.internal.vision.zzjp.zzp(t, j), com.google.android.gms.internal.vision.zzjp.zzp(t2, j))) {
                            zZze = false;
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
                        zZze = com.google.android.gms.internal.vision.zzit.zze(com.google.android.gms.internal.vision.zzjp.zzp(t, j), com.google.android.gms.internal.vision.zzjp.zzp(t2, j));
                        break;
                    case 50:
                        zZze = com.google.android.gms.internal.vision.zzit.zze(com.google.android.gms.internal.vision.zzjp.zzp(t, j), com.google.android.gms.internal.vision.zzjp.zzp(t2, j));
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
                        long jZzbq = zzbq(i) & 1048575;
                        if (com.google.android.gms.internal.vision.zzjp.zzk(t, jZzbq) != com.google.android.gms.internal.vision.zzjp.zzk(t2, jZzbq) || !com.google.android.gms.internal.vision.zzit.zze(com.google.android.gms.internal.vision.zzjp.zzp(t, j), com.google.android.gms.internal.vision.zzjp.zzp(t2, j))) {
                            zZze = false;
                        }
                        break;
                }
                if (!zZze) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzzi.zzv(t).equals(this.zzzi.zzv(t2))) {
                    return false;
                }
                if (this.zzyz) {
                    return this.zzzj.zze(t).equals(this.zzzj.zze(t2));
                }
                return true;
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final int hashCode(T t) {
        int i;
        int iZzab;
        int length = this.zzyu.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzbp = zzbp(i3);
            int i4 = this.zzyu[i3];
            long j = 1048575 & iZzbp;
            int iHashCode = 37;
            switch ((iZzbp & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzgt.zzab(java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.zzjp.zzo(t, j)));
                    i2 = i + iZzab;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzab = java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.zzjp.zzn(t, j));
                    i2 = i + iZzab;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzgt.zzab(com.google.android.gms.internal.vision.zzjp.zzl(t, j));
                    i2 = i + iZzab;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzgt.zzab(com.google.android.gms.internal.vision.zzjp.zzl(t, j));
                    i2 = i + iZzab;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzjp.zzk(t, j);
                    i2 = i + iZzab;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzgt.zzab(com.google.android.gms.internal.vision.zzjp.zzl(t, j));
                    i2 = i + iZzab;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzjp.zzk(t, j);
                    i2 = i + iZzab;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzgt.zzm(com.google.android.gms.internal.vision.zzjp.zzm(t, j));
                    i2 = i + iZzab;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzab = ((java.lang.String) com.google.android.gms.internal.vision.zzjp.zzp(t, j)).hashCode();
                    i2 = i + iZzab;
                    break;
                case 9:
                    java.lang.Object objZzp = com.google.android.gms.internal.vision.zzjp.zzp(t, j);
                    if (objZzp != null) {
                        iHashCode = objZzp.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzjp.zzp(t, j).hashCode();
                    i2 = i + iZzab;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzjp.zzk(t, j);
                    i2 = i + iZzab;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzjp.zzk(t, j);
                    i2 = i + iZzab;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzjp.zzk(t, j);
                    i2 = i + iZzab;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzgt.zzab(com.google.android.gms.internal.vision.zzjp.zzl(t, j));
                    i2 = i + iZzab;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzjp.zzk(t, j);
                    i2 = i + iZzab;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzgt.zzab(com.google.android.gms.internal.vision.zzjp.zzl(t, j));
                    i2 = i + iZzab;
                    break;
                case 17:
                    java.lang.Object objZzp2 = com.google.android.gms.internal.vision.zzjp.zzp(t, j);
                    if (objZzp2 != null) {
                        iHashCode = objZzp2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzjp.zzp(t, j).hashCode();
                    i2 = i + iZzab;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzab = com.google.android.gms.internal.vision.zzjp.zzp(t, j).hashCode();
                    i2 = i + iZzab;
                    break;
                case 51:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = com.google.android.gms.internal.vision.zzgt.zzab(java.lang.Double.doubleToLongBits(zzf(t, j)));
                        i2 = i + iZzab;
                    }
                    break;
                case 52:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = java.lang.Float.floatToIntBits(zzg(t, j));
                        i2 = i + iZzab;
                    }
                    break;
                case 53:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = com.google.android.gms.internal.vision.zzgt.zzab(zzi(t, j));
                        i2 = i + iZzab;
                    }
                    break;
                case 54:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = com.google.android.gms.internal.vision.zzgt.zzab(zzi(t, j));
                        i2 = i + iZzab;
                    }
                    break;
                case 55:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = zzh(t, j);
                        i2 = i + iZzab;
                    }
                    break;
                case 56:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = com.google.android.gms.internal.vision.zzgt.zzab(zzi(t, j));
                        i2 = i + iZzab;
                    }
                    break;
                case 57:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = zzh(t, j);
                        i2 = i + iZzab;
                    }
                    break;
                case 58:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = com.google.android.gms.internal.vision.zzgt.zzm(zzj(t, j));
                        i2 = i + iZzab;
                    }
                    break;
                case 59:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = ((java.lang.String) com.google.android.gms.internal.vision.zzjp.zzp(t, j)).hashCode();
                        i2 = i + iZzab;
                    }
                    break;
                case 60:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = com.google.android.gms.internal.vision.zzjp.zzp(t, j).hashCode();
                        i2 = i + iZzab;
                    }
                    break;
                case 61:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = com.google.android.gms.internal.vision.zzjp.zzp(t, j).hashCode();
                        i2 = i + iZzab;
                    }
                    break;
                case 62:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = zzh(t, j);
                        i2 = i + iZzab;
                    }
                    break;
                case 63:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = zzh(t, j);
                        i2 = i + iZzab;
                    }
                    break;
                case 64:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = zzh(t, j);
                        i2 = i + iZzab;
                    }
                    break;
                case 65:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = com.google.android.gms.internal.vision.zzgt.zzab(zzi(t, j));
                        i2 = i + iZzab;
                    }
                    break;
                case 66:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = zzh(t, j);
                        i2 = i + iZzab;
                    }
                    break;
                case 67:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = com.google.android.gms.internal.vision.zzgt.zzab(zzi(t, j));
                        i2 = i + iZzab;
                    }
                    break;
                case 68:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzab = com.google.android.gms.internal.vision.zzjp.zzp(t, j).hashCode();
                        i2 = i + iZzab;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzzi.zzv(t).hashCode();
        return this.zzyz ? (iHashCode2 * 53) + this.zzzj.zze(t).hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final void zzd(T t, T t2) {
        java.util.Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzyu.length; i += 3) {
            int iZzbp = zzbp(i);
            long j = 1048575 & iZzbp;
            int i2 = this.zzyu[i];
            switch ((iZzbp & 267386880) >>> 20) {
                case 0:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zza(t, j, com.google.android.gms.internal.vision.zzjp.zzo(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 1:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, j, com.google.android.gms.internal.vision.zzjp.zzn(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 2:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, j, com.google.android.gms.internal.vision.zzjp.zzl(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 3:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, j, com.google.android.gms.internal.vision.zzjp.zzl(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 4:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zzb(t, j, com.google.android.gms.internal.vision.zzjp.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 5:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, j, com.google.android.gms.internal.vision.zzjp.zzl(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 6:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zzb(t, j, com.google.android.gms.internal.vision.zzjp.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 7:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zza(t, j, com.google.android.gms.internal.vision.zzjp.zzm(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 8:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zza(t, j, com.google.android.gms.internal.vision.zzjp.zzp(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zza(t, j, com.google.android.gms.internal.vision.zzjp.zzp(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 11:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zzb(t, j, com.google.android.gms.internal.vision.zzjp.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 12:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zzb(t, j, com.google.android.gms.internal.vision.zzjp.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 13:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zzb(t, j, com.google.android.gms.internal.vision.zzjp.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 14:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, j, com.google.android.gms.internal.vision.zzjp.zzl(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 15:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zzb(t, j, com.google.android.gms.internal.vision.zzjp.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 16:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, j, com.google.android.gms.internal.vision.zzjp.zzl(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 17:
                    zza(t, t2, i);
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
                    this.zzzh.zza(t, t2, j);
                    break;
                case 50:
                    com.google.android.gms.internal.vision.zzit.zza(this.zzzk, t, t2, j);
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
                        com.google.android.gms.internal.vision.zzjp.zza(t, j, com.google.android.gms.internal.vision.zzjp.zzp(t2, j));
                        zzb(t, i2, i);
                    }
                    break;
                case 60:
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
                        com.google.android.gms.internal.vision.zzjp.zza(t, j, com.google.android.gms.internal.vision.zzjp.zzp(t2, j));
                        zzb(t, i2, i);
                    }
                    break;
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzzb) {
            return;
        }
        com.google.android.gms.internal.vision.zzit.zza(this.zzzi, t, t2);
        if (this.zzyz) {
            com.google.android.gms.internal.vision.zzit.zza(this.zzzj, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long jZzbp = zzbp(i) & 1048575;
        if (zza(t2, i)) {
            java.lang.Object objZzp = com.google.android.gms.internal.vision.zzjp.zzp(t, jZzbp);
            java.lang.Object objZzp2 = com.google.android.gms.internal.vision.zzjp.zzp(t2, jZzbp);
            if (objZzp != null && objZzp2 != null) {
                com.google.android.gms.internal.vision.zzjp.zza(t, jZzbp, com.google.android.gms.internal.vision.zzgt.zzb(objZzp, objZzp2));
                zzb(t, i);
            } else if (objZzp2 != null) {
                com.google.android.gms.internal.vision.zzjp.zza(t, jZzbp, objZzp2);
                zzb(t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int iZzbp = zzbp(i);
        int i2 = this.zzyu[i];
        long j = iZzbp & 1048575;
        if (zza(t2, i2, i)) {
            java.lang.Object objZzp = com.google.android.gms.internal.vision.zzjp.zzp(t, j);
            java.lang.Object objZzp2 = com.google.android.gms.internal.vision.zzjp.zzp(t2, j);
            if (objZzp != null && objZzp2 != null) {
                com.google.android.gms.internal.vision.zzjp.zza(t, j, com.google.android.gms.internal.vision.zzgt.zzb(objZzp, objZzp2));
                zzb(t, i2, i);
            } else if (objZzp2 != null) {
                com.google.android.gms.internal.vision.zzjp.zza(t, j, objZzp2);
                zzb(t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:421:0x090b A[PHI: r6
      0x090b: PHI (r6v4 int) = 
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
      (r6v16 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v1 int)
      (r6v17 int)
      (r6v1 int)
     binds: [B:256:0x0545, B:459:0x09b0, B:453:0x0994, B:450:0x0982, B:447:0x0973, B:444:0x0966, B:441:0x0959, B:437:0x094e, B:434:0x0943, B:431:0x0936, B:428:0x0929, B:425:0x0916, B:396:0x081f, B:390:0x0802, B:384:0x07e5, B:378:0x07c8, B:372:0x07aa, B:366:0x078c, B:360:0x076e, B:354:0x0750, B:348:0x0732, B:342:0x0714, B:336:0x06f6, B:330:0x06d8, B:324:0x06ba, B:318:0x069c, B:313:0x0668, B:310:0x065b, B:307:0x064b, B:304:0x063b, B:301:0x062b, B:298:0x061d, B:295:0x0610, B:292:0x0603, B:286:0x05e5, B:283:0x05d1, B:280:0x05bf, B:277:0x05af, B:274:0x059f, B:439:0x0955, B:271:0x0592, B:268:0x0584, B:265:0x0574, B:262:0x0564, B:420:0x090a, B:259:0x054e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.vision.zzir
    public final int zzr(T t) {
        int i;
        int i2;
        long j;
        int iZzd;
        int iZzb;
        int iZzp;
        int iZzv;
        int iZzy;
        int iZzba;
        int iZzbc;
        int iZzb2;
        int iZzy2;
        int iZzba2;
        int iZzbc2;
        int i3 = 267386880;
        int i4 = 1;
        if (this.zzzb) {
            sun.misc.Unsafe unsafe = zzyt;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zzyu.length) {
                int iZzbp = zzbp(i5);
                int i7 = (iZzbp & i3) >>> 20;
                int i8 = this.zzyu[i5];
                long j2 = iZzbp & 1048575;
                int i9 = (i7 < com.google.android.gms.internal.vision.zzgn.DOUBLE_LIST_PACKED.id() || i7 > com.google.android.gms.internal.vision.zzgn.SINT64_LIST_PACKED.id()) ? 0 : this.zzyu[i5 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzb(i8, 0.0d);
                            i6 += iZzb2;
                        }
                        break;
                    case 1:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzb(i8, 0.0f);
                            i6 += iZzb2;
                        }
                        break;
                    case 2:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzd(i8, com.google.android.gms.internal.vision.zzjp.zzl(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 3:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zze(i8, com.google.android.gms.internal.vision.zzjp.zzl(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 4:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzl(i8, com.google.android.gms.internal.vision.zzjp.zzk(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 5:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzg(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 6:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzo(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 7:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzb(i8, true);
                            i6 += iZzb2;
                        }
                        break;
                    case 8:
                        if (zza(t, i5)) {
                            java.lang.Object objZzp = com.google.android.gms.internal.vision.zzjp.zzp(t, j2);
                            if (objZzp instanceof com.google.android.gms.internal.vision.zzfh) {
                                iZzb2 = com.google.android.gms.internal.vision.zzga.zzc(i8, (com.google.android.gms.internal.vision.zzfh) objZzp);
                            } else {
                                iZzb2 = com.google.android.gms.internal.vision.zzga.zzb(i8, (java.lang.String) objZzp);
                            }
                            i6 += iZzb2;
                        }
                        break;
                    case 9:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzit.zzc(i8, com.google.android.gms.internal.vision.zzjp.zzp(t, j2), zzbm(i5));
                            i6 += iZzb2;
                        }
                        break;
                    case 10:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzc(i8, (com.google.android.gms.internal.vision.zzfh) com.google.android.gms.internal.vision.zzjp.zzp(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 11:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzm(i8, com.google.android.gms.internal.vision.zzjp.zzk(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 12:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzq(i8, com.google.android.gms.internal.vision.zzjp.zzk(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 13:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzp(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 14:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzh(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 15:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzn(i8, com.google.android.gms.internal.vision.zzjp.zzk(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 16:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzf(i8, com.google.android.gms.internal.vision.zzjp.zzl(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 17:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzc(i8, (com.google.android.gms.internal.vision.zzic) com.google.android.gms.internal.vision.zzjp.zzp(t, j2), zzbm(i5));
                            i6 += iZzb2;
                        }
                        break;
                    case 18:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzw(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 19:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzv(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 20:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzo(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 21:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzp(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 22:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzs(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 23:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzw(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 24:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzv(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 25:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzx(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 26:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzc(i8, zze(t, j2));
                        i6 += iZzb2;
                        break;
                    case 27:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzc(i8, zze(t, j2), zzbm(i5));
                        i6 += iZzb2;
                        break;
                    case 28:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzd(i8, zze(t, j2));
                        i6 += iZzb2;
                        break;
                    case 29:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzt(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 30:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzr(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 31:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzv(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 32:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzw(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 33:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzu(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 34:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzq(i8, zze(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 35:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzy((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 36:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzx((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 37:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzq((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 38:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzr((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 39:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzu((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 40:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzy((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 41:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzx((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 42:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzz((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 43:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzv((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 44:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzt((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 45:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzx((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 46:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzy((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 47:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzw((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 48:
                        iZzy2 = com.google.android.gms.internal.vision.zzit.zzs((java.util.List) unsafe.getObject(t, j2));
                        if (iZzy2 > 0) {
                            if (this.zzzc) {
                                unsafe.putInt(t, i9, iZzy2);
                            }
                            iZzba2 = com.google.android.gms.internal.vision.zzga.zzba(i8);
                            iZzbc2 = com.google.android.gms.internal.vision.zzga.zzbc(iZzy2);
                            iZzb2 = iZzba2 + iZzbc2 + iZzy2;
                            i6 += iZzb2;
                        }
                        break;
                    case 49:
                        iZzb2 = com.google.android.gms.internal.vision.zzit.zzd(i8, zze(t, j2), zzbm(i5));
                        i6 += iZzb2;
                        break;
                    case 50:
                        iZzb2 = this.zzzk.zzb(i8, com.google.android.gms.internal.vision.zzjp.zzp(t, j2), zzbn(i5));
                        i6 += iZzb2;
                        break;
                    case 51:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzb(i8, 0.0d);
                            i6 += iZzb2;
                        }
                        break;
                    case 52:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzb(i8, 0.0f);
                            i6 += iZzb2;
                        }
                        break;
                    case 53:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzd(i8, zzi(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 54:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zze(i8, zzi(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 55:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzl(i8, zzh(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 56:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzg(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 57:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzo(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 58:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzb(i8, true);
                            i6 += iZzb2;
                        }
                        break;
                    case 59:
                        if (zza(t, i8, i5)) {
                            java.lang.Object objZzp2 = com.google.android.gms.internal.vision.zzjp.zzp(t, j2);
                            if (objZzp2 instanceof com.google.android.gms.internal.vision.zzfh) {
                                iZzb2 = com.google.android.gms.internal.vision.zzga.zzc(i8, (com.google.android.gms.internal.vision.zzfh) objZzp2);
                            } else {
                                iZzb2 = com.google.android.gms.internal.vision.zzga.zzb(i8, (java.lang.String) objZzp2);
                            }
                            i6 += iZzb2;
                        }
                        break;
                    case 60:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzit.zzc(i8, com.google.android.gms.internal.vision.zzjp.zzp(t, j2), zzbm(i5));
                            i6 += iZzb2;
                        }
                        break;
                    case 61:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzc(i8, (com.google.android.gms.internal.vision.zzfh) com.google.android.gms.internal.vision.zzjp.zzp(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 62:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzm(i8, zzh(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 63:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzq(i8, zzh(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 64:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzp(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 65:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzh(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 66:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzn(i8, zzh(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 67:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzf(i8, zzi(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 68:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.vision.zzga.zzc(i8, (com.google.android.gms.internal.vision.zzic) com.google.android.gms.internal.vision.zzjp.zzp(t, j2), zzbm(i5));
                            i6 += iZzb2;
                        }
                        break;
                }
                i5 += 3;
                i3 = 267386880;
            }
            return i6 + zza(this.zzzi, t);
        }
        sun.misc.Unsafe unsafe2 = zzyt;
        int i10 = -1;
        int i11 = 0;
        int iZzb3 = 0;
        int i12 = 0;
        while (i11 < this.zzyu.length) {
            int iZzbp2 = zzbp(i11);
            int[] iArr = this.zzyu;
            int i13 = iArr[i11];
            int i14 = (iZzbp2 & 267386880) >>> 20;
            if (i14 <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & 1048575;
                i2 = i4 << (i15 >>> 20);
                if (i16 != i10) {
                    i12 = unsafe2.getInt(t, i16);
                    i10 = i16;
                }
                i = i15;
            } else {
                i = (!this.zzzc || i14 < com.google.android.gms.internal.vision.zzgn.DOUBLE_LIST_PACKED.id() || i14 > com.google.android.gms.internal.vision.zzgn.SINT64_LIST_PACKED.id()) ? 0 : this.zzyu[i11 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = iZzbp2 & 1048575;
            switch (i14) {
                case 0:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.vision.zzga.zzb(i13, 0.0d);
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.vision.zzga.zzb(i13, 0.0f);
                    }
                    break;
                case 2:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.vision.zzga.zzd(i13, unsafe2.getLong(t, j3));
                        iZzb3 += iZzd;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.vision.zzga.zze(i13, unsafe2.getLong(t, j3));
                        iZzb3 += iZzd;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.vision.zzga.zzl(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzd;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.vision.zzga.zzg(i13, 0L);
                        iZzb3 += iZzd;
                    }
                    break;
                case 6:
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.vision.zzga.zzo(i13, 0);
                    }
                    j = 0;
                    break;
                case 7:
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.vision.zzga.zzb(i13, true);
                    }
                    j = 0;
                    break;
                case 8:
                    if ((i12 & i2) != 0) {
                        java.lang.Object object = unsafe2.getObject(t, j3);
                        if (object instanceof com.google.android.gms.internal.vision.zzfh) {
                            iZzb = com.google.android.gms.internal.vision.zzga.zzc(i13, (com.google.android.gms.internal.vision.zzfh) object);
                        } else {
                            iZzb = com.google.android.gms.internal.vision.zzga.zzb(i13, (java.lang.String) object);
                        }
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.vision.zzit.zzc(i13, unsafe2.getObject(t, j3), zzbm(i11));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzc(i13, (com.google.android.gms.internal.vision.zzfh) unsafe2.getObject(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzm(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzq(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i12 & i2) != 0) {
                        iZzp = com.google.android.gms.internal.vision.zzga.zzp(i13, 0);
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzh(i13, 0L);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzn(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzf(i13, unsafe2.getLong(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzc(i13, (com.google.android.gms.internal.vision.zzic) unsafe2.getObject(t, j3), zzbm(i11));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 18:
                    iZzb = com.google.android.gms.internal.vision.zzit.zzw(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 19:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzv(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 20:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzo(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 21:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzp(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 22:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzs(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 23:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzw(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 24:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzv(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 25:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzx(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 26:
                    iZzb = com.google.android.gms.internal.vision.zzit.zzc(i13, (java.util.List) unsafe2.getObject(t, j3));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 27:
                    iZzb = com.google.android.gms.internal.vision.zzit.zzc(i13, (java.util.List<?>) unsafe2.getObject(t, j3), zzbm(i11));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 28:
                    iZzb = com.google.android.gms.internal.vision.zzit.zzd(i13, (java.util.List) unsafe2.getObject(t, j3));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 29:
                    iZzb = com.google.android.gms.internal.vision.zzit.zzt(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 30:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzr(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 31:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzv(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 32:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzw(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 33:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzu(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 34:
                    iZzv = com.google.android.gms.internal.vision.zzit.zzq(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 35:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzy((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 36:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzx((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 37:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzq((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 38:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzr((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 39:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzu((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 40:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzy((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 41:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzx((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 42:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzz((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 43:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzv((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 44:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzt((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 45:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzx((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 46:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzy((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 47:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzw((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 48:
                    iZzy = com.google.android.gms.internal.vision.zzit.zzs((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzy > 0) {
                        if (this.zzzc) {
                            unsafe2.putInt(t, i, iZzy);
                        }
                        iZzba = com.google.android.gms.internal.vision.zzga.zzba(i13);
                        iZzbc = com.google.android.gms.internal.vision.zzga.zzbc(iZzy);
                        iZzp = iZzba + iZzbc + iZzy;
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 49:
                    iZzb = com.google.android.gms.internal.vision.zzit.zzd(i13, (java.util.List) unsafe2.getObject(t, j3), zzbm(i11));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 50:
                    iZzb = this.zzzk.zzb(i13, unsafe2.getObject(t, j3), zzbn(i11));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 51:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzb(i13, 0.0d);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza(t, i13, i11)) {
                        iZzp = com.google.android.gms.internal.vision.zzga.zzb(i13, 0.0f);
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzd(i13, zzi(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zze(i13, zzi(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzl(i13, zzh(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzg(i13, 0L);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza(t, i13, i11)) {
                        iZzp = com.google.android.gms.internal.vision.zzga.zzo(i13, 0);
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza(t, i13, i11)) {
                        iZzp = com.google.android.gms.internal.vision.zzga.zzb(i13, true);
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza(t, i13, i11)) {
                        java.lang.Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof com.google.android.gms.internal.vision.zzfh) {
                            iZzb = com.google.android.gms.internal.vision.zzga.zzc(i13, (com.google.android.gms.internal.vision.zzfh) object2);
                        } else {
                            iZzb = com.google.android.gms.internal.vision.zzga.zzb(i13, (java.lang.String) object2);
                        }
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzit.zzc(i13, unsafe2.getObject(t, j3), zzbm(i11));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzc(i13, (com.google.android.gms.internal.vision.zzfh) unsafe2.getObject(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzm(i13, zzh(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzq(i13, zzh(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza(t, i13, i11)) {
                        iZzp = com.google.android.gms.internal.vision.zzga.zzp(i13, 0);
                        iZzb3 += iZzp;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzh(i13, 0L);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzn(i13, zzh(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzf(i13, zzi(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.vision.zzga.zzc(i13, (com.google.android.gms.internal.vision.zzic) unsafe2.getObject(t, j3), zzbm(i11));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            i11 += 3;
            i4 = 1;
        }
        int iZzc = 0;
        int iZza = iZzb3 + zza(this.zzzi, t);
        if (!this.zzyz) {
            return iZza;
        }
        com.google.android.gms.internal.vision.zzgi<T> zzgiVarZze = this.zzzj.zze(t);
        for (int i17 = 0; i17 < zzgiVarZze.zztb.zzhx(); i17++) {
            java.util.Map.Entry entryZzbu = zzgiVarZze.zztb.zzbu(i17);
            iZzc += com.google.android.gms.internal.vision.zzgi.zzc((com.google.android.gms.internal.vision.zzgk) entryZzbu.getKey(), entryZzbu.getValue());
        }
        for (java.util.Map.Entry entry : zzgiVarZze.zztb.zzhy()) {
            iZzc += com.google.android.gms.internal.vision.zzgi.zzc((com.google.android.gms.internal.vision.zzgk) entry.getKey(), entry.getValue());
        }
        return iZza + iZzc;
    }

    private static <UT, UB> int zza(com.google.android.gms.internal.vision.zzjj<UT, UB> zzjjVar, T t) {
        return zzjjVar.zzr(zzjjVar.zzv(t));
    }

    private static java.util.List<?> zze(java.lang.Object obj, long j) {
        return (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(obj, j);
    }

    /* JADX WARN: Code duplicated, block: B:178:0x054a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.vision.zzir
    public final void zza(T t, com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException {
        java.util.Iterator it;
        java.util.Map.Entry<?, ?> entry;
        java.util.Iterator itDescendingIterator;
        java.util.Map.Entry<?, ?> entry2;
        if (zzkgVar.zzfj() == com.google.android.gms.internal.vision.zzgs.zzf.zzwx) {
            zza(this.zzzi, t, zzkgVar);
            if (this.zzyz) {
                com.google.android.gms.internal.vision.zzgi<T> zzgiVarZze = this.zzzj.zze(t);
                if (zzgiVarZze.zztb.isEmpty()) {
                    itDescendingIterator = null;
                    entry2 = null;
                } else {
                    itDescendingIterator = zzgiVarZze.descendingIterator();
                    entry2 = (java.util.Map.Entry) itDescendingIterator.next();
                }
            } else {
                itDescendingIterator = null;
                entry2 = null;
            }
            for (int length = this.zzyu.length - 3; length >= 0; length -= 3) {
                int iZzbp = zzbp(length);
                int i = this.zzyu[length];
                while (entry2 != null && this.zzzj.zza(entry2) > i) {
                    this.zzzj.zza(zzkgVar, entry2);
                    entry2 = itDescendingIterator.hasNext() ? (java.util.Map.Entry) itDescendingIterator.next() : null;
                }
                switch ((iZzbp & 267386880) >>> 20) {
                    case 0:
                        if (zza(t, length)) {
                            zzkgVar.zza(i, com.google.android.gms.internal.vision.zzjp.zzo(t, iZzbp & 1048575));
                        }
                        break;
                    case 1:
                        if (zza(t, length)) {
                            zzkgVar.zza(i, com.google.android.gms.internal.vision.zzjp.zzn(t, iZzbp & 1048575));
                        }
                        break;
                    case 2:
                        if (zza(t, length)) {
                            zzkgVar.zzi(i, com.google.android.gms.internal.vision.zzjp.zzl(t, iZzbp & 1048575));
                        }
                        break;
                    case 3:
                        if (zza(t, length)) {
                            zzkgVar.zza(i, com.google.android.gms.internal.vision.zzjp.zzl(t, iZzbp & 1048575));
                        }
                        break;
                    case 4:
                        if (zza(t, length)) {
                            zzkgVar.zzh(i, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp & 1048575));
                        }
                        break;
                    case 5:
                        if (zza(t, length)) {
                            zzkgVar.zzc(i, com.google.android.gms.internal.vision.zzjp.zzl(t, iZzbp & 1048575));
                        }
                        break;
                    case 6:
                        if (zza(t, length)) {
                            zzkgVar.zzk(i, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp & 1048575));
                        }
                        break;
                    case 7:
                        if (zza(t, length)) {
                            zzkgVar.zza(i, com.google.android.gms.internal.vision.zzjp.zzm(t, iZzbp & 1048575));
                        }
                        break;
                    case 8:
                        if (zza(t, length)) {
                            zza(i, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar);
                        }
                        break;
                    case 9:
                        if (zza(t, length)) {
                            zzkgVar.zza(i, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzbm(length));
                        }
                        break;
                    case 10:
                        if (zza(t, length)) {
                            zzkgVar.zza(i, (com.google.android.gms.internal.vision.zzfh) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575));
                        }
                        break;
                    case 11:
                        if (zza(t, length)) {
                            zzkgVar.zzi(i, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp & 1048575));
                        }
                        break;
                    case 12:
                        if (zza(t, length)) {
                            zzkgVar.zzs(i, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp & 1048575));
                        }
                        break;
                    case 13:
                        if (zza(t, length)) {
                            zzkgVar.zzr(i, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp & 1048575));
                        }
                        break;
                    case 14:
                        if (zza(t, length)) {
                            zzkgVar.zzj(i, com.google.android.gms.internal.vision.zzjp.zzl(t, iZzbp & 1048575));
                        }
                        break;
                    case 15:
                        if (zza(t, length)) {
                            zzkgVar.zzj(i, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp & 1048575));
                        }
                        break;
                    case 16:
                        if (zza(t, length)) {
                            zzkgVar.zzb(i, com.google.android.gms.internal.vision.zzjp.zzl(t, iZzbp & 1048575));
                        }
                        break;
                    case 17:
                        if (zza(t, length)) {
                            zzkgVar.zzb(i, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzbm(length));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.vision.zzit.zza(this.zzyu[length], (java.util.List<java.lang.Double>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 19:
                        com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[length], (java.util.List<java.lang.Float>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 20:
                        com.google.android.gms.internal.vision.zzit.zzc(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 21:
                        com.google.android.gms.internal.vision.zzit.zzd(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 22:
                        com.google.android.gms.internal.vision.zzit.zzh(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 23:
                        com.google.android.gms.internal.vision.zzit.zzf(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 24:
                        com.google.android.gms.internal.vision.zzit.zzk(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 25:
                        com.google.android.gms.internal.vision.zzit.zzn(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 26:
                        com.google.android.gms.internal.vision.zzit.zza(this.zzyu[length], (java.util.List<java.lang.String>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar);
                        break;
                    case 27:
                        com.google.android.gms.internal.vision.zzit.zza(this.zzyu[length], (java.util.List<?>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, zzbm(length));
                        break;
                    case 28:
                        com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar);
                        break;
                    case 29:
                        com.google.android.gms.internal.vision.zzit.zzi(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 30:
                        com.google.android.gms.internal.vision.zzit.zzm(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 31:
                        com.google.android.gms.internal.vision.zzit.zzl(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 32:
                        com.google.android.gms.internal.vision.zzit.zzg(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 33:
                        com.google.android.gms.internal.vision.zzit.zzj(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 34:
                        com.google.android.gms.internal.vision.zzit.zze(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, false);
                        break;
                    case 35:
                        com.google.android.gms.internal.vision.zzit.zza(this.zzyu[length], (java.util.List<java.lang.Double>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 36:
                        com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[length], (java.util.List<java.lang.Float>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 37:
                        com.google.android.gms.internal.vision.zzit.zzc(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 38:
                        com.google.android.gms.internal.vision.zzit.zzd(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 39:
                        com.google.android.gms.internal.vision.zzit.zzh(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 40:
                        com.google.android.gms.internal.vision.zzit.zzf(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 41:
                        com.google.android.gms.internal.vision.zzit.zzk(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 42:
                        com.google.android.gms.internal.vision.zzit.zzn(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 43:
                        com.google.android.gms.internal.vision.zzit.zzi(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 44:
                        com.google.android.gms.internal.vision.zzit.zzm(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 45:
                        com.google.android.gms.internal.vision.zzit.zzl(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 46:
                        com.google.android.gms.internal.vision.zzit.zzg(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 47:
                        com.google.android.gms.internal.vision.zzit.zzj(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 48:
                        com.google.android.gms.internal.vision.zzit.zze(this.zzyu[length], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, true);
                        break;
                    case 49:
                        com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[length], (java.util.List<?>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar, zzbm(length));
                        break;
                    case 50:
                        zza(zzkgVar, i, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), length);
                        break;
                    case 51:
                        if (zza(t, i, length)) {
                            zzkgVar.zza(i, zzf(t, iZzbp & 1048575));
                        }
                        break;
                    case 52:
                        if (zza(t, i, length)) {
                            zzkgVar.zza(i, zzg(t, iZzbp & 1048575));
                        }
                        break;
                    case 53:
                        if (zza(t, i, length)) {
                            zzkgVar.zzi(i, zzi(t, iZzbp & 1048575));
                        }
                        break;
                    case 54:
                        if (zza(t, i, length)) {
                            zzkgVar.zza(i, zzi(t, iZzbp & 1048575));
                        }
                        break;
                    case 55:
                        if (zza(t, i, length)) {
                            zzkgVar.zzh(i, zzh(t, iZzbp & 1048575));
                        }
                        break;
                    case 56:
                        if (zza(t, i, length)) {
                            zzkgVar.zzc(i, zzi(t, iZzbp & 1048575));
                        }
                        break;
                    case 57:
                        if (zza(t, i, length)) {
                            zzkgVar.zzk(i, zzh(t, iZzbp & 1048575));
                        }
                        break;
                    case 58:
                        if (zza(t, i, length)) {
                            zzkgVar.zza(i, zzj(t, iZzbp & 1048575));
                        }
                        break;
                    case 59:
                        if (zza(t, i, length)) {
                            zza(i, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzkgVar);
                        }
                        break;
                    case 60:
                        if (zza(t, i, length)) {
                            zzkgVar.zza(i, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzbm(length));
                        }
                        break;
                    case 61:
                        if (zza(t, i, length)) {
                            zzkgVar.zza(i, (com.google.android.gms.internal.vision.zzfh) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575));
                        }
                        break;
                    case 62:
                        if (zza(t, i, length)) {
                            zzkgVar.zzi(i, zzh(t, iZzbp & 1048575));
                        }
                        break;
                    case 63:
                        if (zza(t, i, length)) {
                            zzkgVar.zzs(i, zzh(t, iZzbp & 1048575));
                        }
                        break;
                    case 64:
                        if (zza(t, i, length)) {
                            zzkgVar.zzr(i, zzh(t, iZzbp & 1048575));
                        }
                        break;
                    case 65:
                        if (zza(t, i, length)) {
                            zzkgVar.zzj(i, zzi(t, iZzbp & 1048575));
                        }
                        break;
                    case 66:
                        if (zza(t, i, length)) {
                            zzkgVar.zzj(i, zzh(t, iZzbp & 1048575));
                        }
                        break;
                    case 67:
                        if (zza(t, i, length)) {
                            zzkgVar.zzb(i, zzi(t, iZzbp & 1048575));
                        }
                        break;
                    case 68:
                        if (zza(t, i, length)) {
                            zzkgVar.zzb(i, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575), zzbm(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.zzzj.zza(zzkgVar, entry2);
                entry2 = itDescendingIterator.hasNext() ? (java.util.Map.Entry) itDescendingIterator.next() : null;
            }
            return;
        }
        if (this.zzzb) {
            if (this.zzyz) {
                com.google.android.gms.internal.vision.zzgi<T> zzgiVarZze2 = this.zzzj.zze(t);
                if (zzgiVarZze2.zztb.isEmpty()) {
                    it = null;
                    entry = null;
                } else {
                    it = zzgiVarZze2.iterator();
                    entry = (java.util.Map.Entry) it.next();
                }
            } else {
                it = null;
                entry = null;
            }
            int length2 = this.zzyu.length;
            for (int i2 = 0; i2 < length2; i2 += 3) {
                int iZzbp2 = zzbp(i2);
                int i3 = this.zzyu[i2];
                while (entry != null && this.zzzj.zza(entry) <= i3) {
                    this.zzzj.zza(zzkgVar, entry);
                    entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                }
                switch ((iZzbp2 & 267386880) >>> 20) {
                    case 0:
                        if (zza(t, i2)) {
                            zzkgVar.zza(i3, com.google.android.gms.internal.vision.zzjp.zzo(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 1:
                        if (zza(t, i2)) {
                            zzkgVar.zza(i3, com.google.android.gms.internal.vision.zzjp.zzn(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 2:
                        if (zza(t, i2)) {
                            zzkgVar.zzi(i3, com.google.android.gms.internal.vision.zzjp.zzl(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 3:
                        if (zza(t, i2)) {
                            zzkgVar.zza(i3, com.google.android.gms.internal.vision.zzjp.zzl(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 4:
                        if (zza(t, i2)) {
                            zzkgVar.zzh(i3, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 5:
                        if (zza(t, i2)) {
                            zzkgVar.zzc(i3, com.google.android.gms.internal.vision.zzjp.zzl(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 6:
                        if (zza(t, i2)) {
                            zzkgVar.zzk(i3, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 7:
                        if (zza(t, i2)) {
                            zzkgVar.zza(i3, com.google.android.gms.internal.vision.zzjp.zzm(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 8:
                        if (zza(t, i2)) {
                            zza(i3, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar);
                        }
                        break;
                    case 9:
                        if (zza(t, i2)) {
                            zzkgVar.zza(i3, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzbm(i2));
                        }
                        break;
                    case 10:
                        if (zza(t, i2)) {
                            zzkgVar.zza(i3, (com.google.android.gms.internal.vision.zzfh) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 11:
                        if (zza(t, i2)) {
                            zzkgVar.zzi(i3, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 12:
                        if (zza(t, i2)) {
                            zzkgVar.zzs(i3, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 13:
                        if (zza(t, i2)) {
                            zzkgVar.zzr(i3, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 14:
                        if (zza(t, i2)) {
                            zzkgVar.zzj(i3, com.google.android.gms.internal.vision.zzjp.zzl(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 15:
                        if (zza(t, i2)) {
                            zzkgVar.zzj(i3, com.google.android.gms.internal.vision.zzjp.zzk(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 16:
                        if (zza(t, i2)) {
                            zzkgVar.zzb(i3, com.google.android.gms.internal.vision.zzjp.zzl(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 17:
                        if (zza(t, i2)) {
                            zzkgVar.zzb(i3, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzbm(i2));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.vision.zzit.zza(this.zzyu[i2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 19:
                        com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[i2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 20:
                        com.google.android.gms.internal.vision.zzit.zzc(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 21:
                        com.google.android.gms.internal.vision.zzit.zzd(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 22:
                        com.google.android.gms.internal.vision.zzit.zzh(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 23:
                        com.google.android.gms.internal.vision.zzit.zzf(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 24:
                        com.google.android.gms.internal.vision.zzit.zzk(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 25:
                        com.google.android.gms.internal.vision.zzit.zzn(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 26:
                        com.google.android.gms.internal.vision.zzit.zza(this.zzyu[i2], (java.util.List<java.lang.String>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar);
                        break;
                    case 27:
                        com.google.android.gms.internal.vision.zzit.zza(this.zzyu[i2], (java.util.List<?>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, zzbm(i2));
                        break;
                    case 28:
                        com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar);
                        break;
                    case 29:
                        com.google.android.gms.internal.vision.zzit.zzi(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 30:
                        com.google.android.gms.internal.vision.zzit.zzm(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 31:
                        com.google.android.gms.internal.vision.zzit.zzl(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 32:
                        com.google.android.gms.internal.vision.zzit.zzg(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 33:
                        com.google.android.gms.internal.vision.zzit.zzj(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 34:
                        com.google.android.gms.internal.vision.zzit.zze(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, false);
                        break;
                    case 35:
                        com.google.android.gms.internal.vision.zzit.zza(this.zzyu[i2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 36:
                        com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[i2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 37:
                        com.google.android.gms.internal.vision.zzit.zzc(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 38:
                        com.google.android.gms.internal.vision.zzit.zzd(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 39:
                        com.google.android.gms.internal.vision.zzit.zzh(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 40:
                        com.google.android.gms.internal.vision.zzit.zzf(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 41:
                        com.google.android.gms.internal.vision.zzit.zzk(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 42:
                        com.google.android.gms.internal.vision.zzit.zzn(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 43:
                        com.google.android.gms.internal.vision.zzit.zzi(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 44:
                        com.google.android.gms.internal.vision.zzit.zzm(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 45:
                        com.google.android.gms.internal.vision.zzit.zzl(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 46:
                        com.google.android.gms.internal.vision.zzit.zzg(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 47:
                        com.google.android.gms.internal.vision.zzit.zzj(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 48:
                        com.google.android.gms.internal.vision.zzit.zze(this.zzyu[i2], (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, true);
                        break;
                    case 49:
                        com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[i2], (java.util.List<?>) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar, zzbm(i2));
                        break;
                    case 50:
                        zza(zzkgVar, i3, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), i2);
                        break;
                    case 51:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zza(i3, zzf(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 52:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zza(i3, zzg(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 53:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zzi(i3, zzi(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 54:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zza(i3, zzi(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 55:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zzh(i3, zzh(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 56:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zzc(i3, zzi(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 57:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zzk(i3, zzh(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 58:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zza(i3, zzj(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 59:
                        if (zza(t, i3, i2)) {
                            zza(i3, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzkgVar);
                        }
                        break;
                    case 60:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zza(i3, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzbm(i2));
                        }
                        break;
                    case 61:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zza(i3, (com.google.android.gms.internal.vision.zzfh) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 62:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zzi(i3, zzh(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 63:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zzs(i3, zzh(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 64:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zzr(i3, zzh(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 65:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zzj(i3, zzi(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 66:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zzj(i3, zzh(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 67:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zzb(i3, zzi(t, iZzbp2 & 1048575));
                        }
                        break;
                    case 68:
                        if (zza(t, i3, i2)) {
                            zzkgVar.zzb(i3, com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp2 & 1048575), zzbm(i2));
                        }
                        break;
                }
            }
            while (entry != null) {
                this.zzzj.zza(zzkgVar, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            zza(this.zzzi, t, zzkgVar);
            return;
        }
        zzb(t, zzkgVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    private final void zzb(T t, com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException {
        java.util.Iterator it;
        java.util.Map.Entry<?, ?> entry;
        int i;
        if (this.zzyz) {
            com.google.android.gms.internal.vision.zzgi<T> zzgiVarZze = this.zzzj.zze(t);
            if (zzgiVarZze.zztb.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = zzgiVarZze.iterator();
                entry = (java.util.Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int i2 = -1;
        int length = this.zzyu.length;
        sun.misc.Unsafe unsafe = zzyt;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int iZzbp = zzbp(i3);
            int[] iArr = this.zzyu;
            int i5 = iArr[i3];
            int i6 = (267386880 & iZzbp) >>> 20;
            if (this.zzzb || i6 > 17) {
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
            while (entry != null && this.zzzj.zza(entry) <= i5) {
                this.zzzj.zza(zzkgVar, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            long j = iZzbp & 1048575;
            int i9 = i3;
            switch (i6) {
                case 0:
                    if ((i & i4) != 0) {
                        zzkgVar.zza(i5, com.google.android.gms.internal.vision.zzjp.zzo(t, j));
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 1:
                    if ((i & i4) != 0) {
                        zzkgVar.zza(i5, com.google.android.gms.internal.vision.zzjp.zzn(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 2:
                    if ((i & i4) != 0) {
                        zzkgVar.zzi(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 3:
                    if ((i & i4) != 0) {
                        zzkgVar.zza(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 4:
                    if ((i & i4) != 0) {
                        zzkgVar.zzh(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 5:
                    if ((i & i4) != 0) {
                        zzkgVar.zzc(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 6:
                    if ((i & i4) != 0) {
                        zzkgVar.zzk(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 7:
                    if ((i & i4) != 0) {
                        zzkgVar.zza(i5, com.google.android.gms.internal.vision.zzjp.zzm(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 8:
                    if ((i & i4) != 0) {
                        zza(i5, unsafe.getObject(t, j), zzkgVar);
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 9:
                    if ((i & i4) != 0) {
                        zzkgVar.zza(i5, unsafe.getObject(t, j), zzbm(i9));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 10:
                    if ((i & i4) != 0) {
                        zzkgVar.zza(i5, (com.google.android.gms.internal.vision.zzfh) unsafe.getObject(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 11:
                    if ((i & i4) != 0) {
                        zzkgVar.zzi(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 12:
                    if ((i & i4) != 0) {
                        zzkgVar.zzs(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 13:
                    if ((i & i4) != 0) {
                        zzkgVar.zzr(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 14:
                    if ((i & i4) != 0) {
                        zzkgVar.zzj(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 15:
                    if ((i & i4) != 0) {
                        zzkgVar.zzj(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 16:
                    if ((i & i4) != 0) {
                        zzkgVar.zzb(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 17:
                    if ((i & i4) != 0) {
                        zzkgVar.zzb(i5, unsafe.getObject(t, j), zzbm(i9));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 18:
                    com.google.android.gms.internal.vision.zzit.zza(this.zzyu[i9], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 19:
                    com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[i9], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 20:
                    com.google.android.gms.internal.vision.zzit.zzc(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 21:
                    com.google.android.gms.internal.vision.zzit.zzd(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 22:
                    com.google.android.gms.internal.vision.zzit.zzh(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 23:
                    com.google.android.gms.internal.vision.zzit.zzf(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 24:
                    com.google.android.gms.internal.vision.zzit.zzk(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 25:
                    com.google.android.gms.internal.vision.zzit.zzn(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 26:
                    com.google.android.gms.internal.vision.zzit.zza(this.zzyu[i9], (java.util.List<java.lang.String>) unsafe.getObject(t, j), zzkgVar);
                    break;
                case 27:
                    com.google.android.gms.internal.vision.zzit.zza(this.zzyu[i9], (java.util.List<?>) unsafe.getObject(t, j), zzkgVar, zzbm(i9));
                    break;
                case 28:
                    com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar);
                    break;
                case 29:
                    com.google.android.gms.internal.vision.zzit.zzi(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 30:
                    com.google.android.gms.internal.vision.zzit.zzm(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 31:
                    com.google.android.gms.internal.vision.zzit.zzl(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 32:
                    com.google.android.gms.internal.vision.zzit.zzg(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 33:
                    com.google.android.gms.internal.vision.zzit.zzj(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 34:
                    com.google.android.gms.internal.vision.zzit.zze(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 35:
                    com.google.android.gms.internal.vision.zzit.zza(this.zzyu[i9], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 36:
                    com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[i9], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 37:
                    com.google.android.gms.internal.vision.zzit.zzc(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 38:
                    com.google.android.gms.internal.vision.zzit.zzd(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 39:
                    com.google.android.gms.internal.vision.zzit.zzh(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 40:
                    com.google.android.gms.internal.vision.zzit.zzf(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 41:
                    com.google.android.gms.internal.vision.zzit.zzk(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 42:
                    com.google.android.gms.internal.vision.zzit.zzn(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 43:
                    com.google.android.gms.internal.vision.zzit.zzi(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 44:
                    com.google.android.gms.internal.vision.zzit.zzm(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 45:
                    com.google.android.gms.internal.vision.zzit.zzl(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 46:
                    com.google.android.gms.internal.vision.zzit.zzg(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 47:
                    com.google.android.gms.internal.vision.zzit.zzj(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 48:
                    com.google.android.gms.internal.vision.zzit.zze(this.zzyu[i9], (java.util.List) unsafe.getObject(t, j), zzkgVar, true);
                    break;
                case 49:
                    com.google.android.gms.internal.vision.zzit.zzb(this.zzyu[i9], (java.util.List<?>) unsafe.getObject(t, j), zzkgVar, zzbm(i9));
                    break;
                case 50:
                    zza(zzkgVar, i5, unsafe.getObject(t, j), i9);
                    break;
                case 51:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zza(i5, zzf(t, j));
                    }
                    break;
                case 52:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zza(i5, zzg(t, j));
                    }
                    break;
                case 53:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zzi(i5, zzi(t, j));
                    }
                    break;
                case 54:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zza(i5, zzi(t, j));
                    }
                    break;
                case 55:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zzh(i5, zzh(t, j));
                    }
                    break;
                case 56:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zzc(i5, zzi(t, j));
                    }
                    break;
                case 57:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zzk(i5, zzh(t, j));
                    }
                    break;
                case 58:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zza(i5, zzj(t, j));
                    }
                    break;
                case 59:
                    if (zza(t, i5, i9)) {
                        zza(i5, unsafe.getObject(t, j), zzkgVar);
                    }
                    break;
                case 60:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zza(i5, unsafe.getObject(t, j), zzbm(i9));
                    }
                    break;
                case 61:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zza(i5, (com.google.android.gms.internal.vision.zzfh) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zzi(i5, zzh(t, j));
                    }
                    break;
                case 63:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zzs(i5, zzh(t, j));
                    }
                    break;
                case 64:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zzr(i5, zzh(t, j));
                    }
                    break;
                case 65:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zzj(i5, zzi(t, j));
                    }
                    break;
                case 66:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zzj(i5, zzh(t, j));
                    }
                    break;
                case 67:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zzb(i5, zzi(t, j));
                    }
                    break;
                case 68:
                    if (zza(t, i5, i9)) {
                        zzkgVar.zzb(i5, unsafe.getObject(t, j), zzbm(i9));
                    }
                    break;
            }
            i3 = i9 + 3;
        }
        while (entry != null) {
            this.zzzj.zza(zzkgVar, entry);
            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
        }
        zza(this.zzzi, t, zzkgVar);
    }

    private final <K, V> void zza(com.google.android.gms.internal.vision.zzkg zzkgVar, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        if (obj != null) {
            zzkgVar.zza(i, this.zzzk.zzp(zzbn(i2)), this.zzzk.zzl(obj));
        }
    }

    private static <UT, UB> void zza(com.google.android.gms.internal.vision.zzjj<UT, UB> zzjjVar, T t, com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException {
        zzjjVar.zza(zzjjVar.zzv(t), zzkgVar);
    }

    /* JADX WARN: Code duplicated, block: B:164:0x05cc A[LOOP:5: B:162:0x05c8->B:164:0x05cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x05d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.internal.vision.zzir
    public final void zza(T t, com.google.android.gms.internal.vision.zzis zzisVar, com.google.android.gms.internal.vision.zzgd zzgdVar) throws java.io.IOException {
        int i;
        java.util.Objects.requireNonNull(zzgdVar);
        com.google.android.gms.internal.vision.zzjj<?, ?> zzjjVar = this.zzzi;
        com.google.android.gms.internal.vision.zzgf<?> zzgfVar = this.zzzj;
        com.google.android.gms.internal.vision.zzgi zzgiVarZzf = null;
        java.lang.Object objZza = null;
        while (true) {
            try {
                int iZzdu = zzisVar.zzdu();
                int iZzbs = zzbs(iZzdu);
                if (iZzbs >= 0) {
                    int iZzbp = zzbp(iZzbs);
                    switch ((267386880 & iZzbp) >>> 20) {
                        case 0:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, zzisVar.readDouble());
                            zzb(t, iZzbs);
                            continue;
                        case 1:
                            com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, iZzbp & 1048575, zzisVar.readFloat());
                            zzb(t, iZzbs);
                            continue;
                        case 2:
                            com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, iZzbp & 1048575, zzisVar.zzdx());
                            zzb(t, iZzbs);
                            continue;
                        case 3:
                            com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, iZzbp & 1048575, zzisVar.zzdw());
                            zzb(t, iZzbs);
                            continue;
                        case 4:
                            com.google.android.gms.internal.vision.zzjp.zzb(t, iZzbp & 1048575, zzisVar.zzdy());
                            zzb(t, iZzbs);
                            continue;
                        case 5:
                            com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, iZzbp & 1048575, zzisVar.zzdz());
                            zzb(t, iZzbs);
                            continue;
                        case 6:
                            com.google.android.gms.internal.vision.zzjp.zzb(t, iZzbp & 1048575, zzisVar.zzea());
                            zzb(t, iZzbs);
                            continue;
                        case 7:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, zzisVar.zzeb());
                            zzb(t, iZzbs);
                            continue;
                        case 8:
                            zza(t, iZzbp, zzisVar);
                            zzb(t, iZzbs);
                            continue;
                        case 9:
                            if (zza(t, iZzbs)) {
                                long j = iZzbp & 1048575;
                                com.google.android.gms.internal.vision.zzjp.zza(t, j, com.google.android.gms.internal.vision.zzgt.zzb(com.google.android.gms.internal.vision.zzjp.zzp(t, j), zzisVar.zza(zzbm(iZzbs), zzgdVar)));
                            } else {
                                com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, zzisVar.zza(zzbm(iZzbs), zzgdVar));
                                zzb(t, iZzbs);
                                continue;
                            }
                            break;
                        case 10:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, zzisVar.zzed());
                            zzb(t, iZzbs);
                            continue;
                        case 11:
                            com.google.android.gms.internal.vision.zzjp.zzb(t, iZzbp & 1048575, zzisVar.zzee());
                            zzb(t, iZzbs);
                            continue;
                        case 12:
                            int iZzef = zzisVar.zzef();
                            com.google.android.gms.internal.vision.zzgy zzgyVarZzbo = zzbo(iZzbs);
                            if (zzgyVarZzbo == null || zzgyVarZzbo.zzf(iZzef)) {
                                com.google.android.gms.internal.vision.zzjp.zzb(t, iZzbp & 1048575, iZzef);
                                zzb(t, iZzbs);
                                continue;
                            } else {
                                objZza = com.google.android.gms.internal.vision.zzit.zza(iZzdu, iZzef, objZza, (com.google.android.gms.internal.vision.zzjj<UT, java.lang.Object>) zzjjVar);
                            }
                            break;
                        case 13:
                            com.google.android.gms.internal.vision.zzjp.zzb(t, iZzbp & 1048575, zzisVar.zzeg());
                            zzb(t, iZzbs);
                            continue;
                        case 14:
                            com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, iZzbp & 1048575, zzisVar.zzeh());
                            zzb(t, iZzbs);
                            continue;
                        case 15:
                            com.google.android.gms.internal.vision.zzjp.zzb(t, iZzbp & 1048575, zzisVar.zzei());
                            zzb(t, iZzbs);
                            continue;
                        case 16:
                            com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t, iZzbp & 1048575, zzisVar.zzej());
                            zzb(t, iZzbs);
                            continue;
                        case 17:
                            if (zza(t, iZzbs)) {
                                long j2 = iZzbp & 1048575;
                                com.google.android.gms.internal.vision.zzjp.zza(t, j2, com.google.android.gms.internal.vision.zzgt.zzb(com.google.android.gms.internal.vision.zzjp.zzp(t, j2), zzisVar.zzc(zzbm(iZzbs), zzgdVar)));
                            } else {
                                com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, zzisVar.zzc(zzbm(iZzbs), zzgdVar));
                                zzb(t, iZzbs);
                                continue;
                            }
                            break;
                        case 18:
                            zzisVar.zza(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 19:
                            zzisVar.zzb(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 20:
                            zzisVar.zzd(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 21:
                            zzisVar.zzc(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 22:
                            zzisVar.zze(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 23:
                            zzisVar.zzf(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 24:
                            zzisVar.zzg(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 25:
                            zzisVar.zzh(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 26:
                            if (zzbr(iZzbp)) {
                                zzisVar.zzi(this.zzzh.zza(t, iZzbp & 1048575));
                            } else {
                                zzisVar.readStringList(this.zzzh.zza(t, iZzbp & 1048575));
                                continue;
                            }
                            break;
                        case 27:
                            zzisVar.zza(this.zzzh.zza(t, iZzbp & 1048575), zzbm(iZzbs), zzgdVar);
                            continue;
                        case 28:
                            zzisVar.zzj(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 29:
                            zzisVar.zzk(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 30:
                            java.util.List<java.lang.Integer> listZza = this.zzzh.zza(t, iZzbp & 1048575);
                            zzisVar.zzl(listZza);
                            objZza = com.google.android.gms.internal.vision.zzit.zza(iZzdu, listZza, zzbo(iZzbs), objZza, (com.google.android.gms.internal.vision.zzjj<UT, java.lang.Object>) zzjjVar);
                            continue;
                        case 31:
                            zzisVar.zzm(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 32:
                            zzisVar.zzn(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 33:
                            zzisVar.zzo(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 34:
                            zzisVar.zzp(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 35:
                            zzisVar.zza(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 36:
                            zzisVar.zzb(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 37:
                            zzisVar.zzd(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 38:
                            zzisVar.zzc(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 39:
                            zzisVar.zze(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 40:
                            zzisVar.zzf(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 41:
                            zzisVar.zzg(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 42:
                            zzisVar.zzh(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 43:
                            zzisVar.zzk(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 44:
                            java.util.List<java.lang.Integer> listZza2 = this.zzzh.zza(t, iZzbp & 1048575);
                            zzisVar.zzl(listZza2);
                            objZza = com.google.android.gms.internal.vision.zzit.zza(iZzdu, listZza2, zzbo(iZzbs), objZza, (com.google.android.gms.internal.vision.zzjj<UT, java.lang.Object>) zzjjVar);
                            continue;
                        case 45:
                            zzisVar.zzm(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 46:
                            zzisVar.zzn(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 47:
                            zzisVar.zzo(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 48:
                            zzisVar.zzp(this.zzzh.zza(t, iZzbp & 1048575));
                            continue;
                        case 49:
                            zzisVar.zzb(this.zzzh.zza(t, iZzbp & 1048575), zzbm(iZzbs), zzgdVar);
                            continue;
                        case 50:
                            java.lang.Object objZzbn = zzbn(iZzbs);
                            long jZzbp = zzbp(iZzbs) & 1048575;
                            java.lang.Object objZzp = com.google.android.gms.internal.vision.zzjp.zzp(t, jZzbp);
                            if (objZzp == null) {
                                objZzp = this.zzzk.zzo(objZzbn);
                                com.google.android.gms.internal.vision.zzjp.zza(t, jZzbp, objZzp);
                            } else if (this.zzzk.zzm(objZzp)) {
                                java.lang.Object objZzo = this.zzzk.zzo(objZzbn);
                                this.zzzk.zzc(objZzo, objZzp);
                                com.google.android.gms.internal.vision.zzjp.zza(t, jZzbp, objZzo);
                                objZzp = objZzo;
                            }
                            zzisVar.zza(this.zzzk.zzk(objZzp), this.zzzk.zzp(objZzbn), zzgdVar);
                            continue;
                        case 51:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Double.valueOf(zzisVar.readDouble()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 52:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Float.valueOf(zzisVar.readFloat()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 53:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Long.valueOf(zzisVar.zzdx()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 54:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Long.valueOf(zzisVar.zzdw()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 55:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Integer.valueOf(zzisVar.zzdy()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 56:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Long.valueOf(zzisVar.zzdz()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 57:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Integer.valueOf(zzisVar.zzea()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 58:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Boolean.valueOf(zzisVar.zzeb()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 59:
                            zza(t, iZzbp, zzisVar);
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 60:
                            if (zza(t, iZzdu, iZzbs)) {
                                long j3 = iZzbp & 1048575;
                                com.google.android.gms.internal.vision.zzjp.zza(t, j3, com.google.android.gms.internal.vision.zzgt.zzb(com.google.android.gms.internal.vision.zzjp.zzp(t, j3), zzisVar.zza(zzbm(iZzbs), zzgdVar)));
                            } else {
                                com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, zzisVar.zza(zzbm(iZzbs), zzgdVar));
                                zzb(t, iZzbs);
                            }
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 61:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, zzisVar.zzed());
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 62:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Integer.valueOf(zzisVar.zzee()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 63:
                            int iZzef2 = zzisVar.zzef();
                            com.google.android.gms.internal.vision.zzgy zzgyVarZzbo2 = zzbo(iZzbs);
                            if (zzgyVarZzbo2 == null || zzgyVarZzbo2.zzf(iZzef2)) {
                                com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Integer.valueOf(iZzef2));
                                zzb(t, iZzdu, iZzbs);
                                continue;
                            } else {
                                objZza = com.google.android.gms.internal.vision.zzit.zza(iZzdu, iZzef2, objZza, (com.google.android.gms.internal.vision.zzjj<UT, java.lang.Object>) zzjjVar);
                            }
                            break;
                        case 64:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Integer.valueOf(zzisVar.zzeg()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 65:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Long.valueOf(zzisVar.zzeh()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 66:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Integer.valueOf(zzisVar.zzei()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 67:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, java.lang.Long.valueOf(zzisVar.zzej()));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        case 68:
                            com.google.android.gms.internal.vision.zzjp.zza(t, iZzbp & 1048575, zzisVar.zzc(zzbm(iZzbs), zzgdVar));
                            zzb(t, iZzdu, iZzbs);
                            continue;
                        default:
                            if (objZza == null) {
                                try {
                                    objZza = zzjjVar.zzif();
                                } catch (com.google.android.gms.internal.vision.zzhb unused) {
                                    zzjjVar.zza(zzisVar);
                                    if (objZza == null) {
                                        objZza = zzjjVar.zzw(t);
                                    }
                                    if (!zzjjVar.zza((java.lang.Object) objZza, zzisVar)) {
                                        for (int i2 = this.zzze; i2 < this.zzzf; i2++) {
                                            objZza = zza((java.lang.Object) t, this.zzzd[i2], objZza, (com.google.android.gms.internal.vision.zzjj<UT, java.lang.Object>) zzjjVar);
                                        }
                                        if (objZza != null) {
                                            zzjjVar.zzg(t, (java.lang.Object) objZza);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                break;
                            }
                            if (!zzjjVar.zza((java.lang.Object) objZza, zzisVar)) {
                                for (int i3 = this.zzze; i3 < this.zzzf; i3++) {
                                    objZza = zza((java.lang.Object) t, this.zzzd[i3], objZza, (com.google.android.gms.internal.vision.zzjj<UT, java.lang.Object>) zzjjVar);
                                }
                                if (objZza != null) {
                                    zzjjVar.zzg(t, (java.lang.Object) objZza);
                                    return;
                                }
                                return;
                            }
                            break;
                            break;
                    }
                    for (i = this.zzze; i < this.zzzf; i++) {
                        objZza = zza((java.lang.Object) t, this.zzzd[i], objZza, (com.google.android.gms.internal.vision.zzjj<UT, java.lang.Object>) zzjjVar);
                    }
                    if (objZza != null) {
                        zzjjVar.zzg(t, (java.lang.Object) objZza);
                    }
                    throw th;
                }
                if (iZzdu == Integer.MAX_VALUE) {
                    for (int i4 = this.zzze; i4 < this.zzzf; i4++) {
                        objZza = zza((java.lang.Object) t, this.zzzd[i4], objZza, (com.google.android.gms.internal.vision.zzjj<UT, java.lang.Object>) zzjjVar);
                    }
                    if (objZza != null) {
                        zzjjVar.zzg(t, (java.lang.Object) objZza);
                        return;
                    }
                    return;
                }
                java.lang.Object objZza2 = !this.zzyz ? null : zzgfVar.zza(zzgdVar, this.zzyy, iZzdu);
                if (objZza2 != null) {
                    if (zzgiVarZzf == null) {
                        zzgiVarZzf = zzgfVar.zzf(t);
                    }
                    com.google.android.gms.internal.vision.zzgi zzgiVar = zzgiVarZzf;
                    objZza = zzgfVar.zza(zzisVar, objZza2, zzgdVar, zzgiVar, objZza, zzjjVar);
                    zzgiVarZzf = zzgiVar;
                } else {
                    zzjjVar.zza(zzisVar);
                    if (objZza == null) {
                        objZza = zzjjVar.zzw(t);
                    }
                    if (!zzjjVar.zza((java.lang.Object) objZza, zzisVar)) {
                        for (int i5 = this.zzze; i5 < this.zzzf; i5++) {
                            objZza = zza((java.lang.Object) t, this.zzzd[i5], objZza, (com.google.android.gms.internal.vision.zzjj<UT, java.lang.Object>) zzjjVar);
                        }
                        if (objZza != null) {
                            zzjjVar.zzg(t, (java.lang.Object) objZza);
                            return;
                        }
                        return;
                    }
                }
            } catch (java.lang.Throwable th) {
                while (i < this.zzzf) {
                    objZza = zza((java.lang.Object) t, this.zzzd[i], objZza, (com.google.android.gms.internal.vision.zzjj<UT, java.lang.Object>) zzjjVar);
                }
                if (objZza != null) {
                    zzjjVar.zzg(t, (java.lang.Object) objZza);
                }
                throw th;
            }
        }
    }

    private static com.google.android.gms.internal.vision.zzjm zzs(java.lang.Object obj) {
        com.google.android.gms.internal.vision.zzgs zzgsVar = (com.google.android.gms.internal.vision.zzgs) obj;
        com.google.android.gms.internal.vision.zzjm zzjmVar = zzgsVar.zzwd;
        if (zzjmVar != com.google.android.gms.internal.vision.zzjm.zzig()) {
            return zzjmVar;
        }
        com.google.android.gms.internal.vision.zzjm zzjmVarZzih = com.google.android.gms.internal.vision.zzjm.zzih();
        zzgsVar.zzwd = zzjmVarZzih;
        return zzjmVarZzih;
    }

    private static int zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.vision.zzka zzkaVar, java.lang.Class<?> cls, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        switch (com.google.android.gms.internal.vision.zzif.zzrr[zzkaVar.ordinal()]) {
            case 1:
                int iZzb = com.google.android.gms.internal.vision.zzez.zzb(bArr, i, zzfbVar);
                zzfbVar.zzrq = java.lang.Boolean.valueOf(zzfbVar.zzrp != 0);
                return iZzb;
            case 2:
                return com.google.android.gms.internal.vision.zzez.zze(bArr, i, zzfbVar);
            case 3:
                zzfbVar.zzrq = java.lang.Double.valueOf(com.google.android.gms.internal.vision.zzez.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzfbVar.zzrq = java.lang.Integer.valueOf(com.google.android.gms.internal.vision.zzez.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzfbVar.zzrq = java.lang.Long.valueOf(com.google.android.gms.internal.vision.zzez.zzb(bArr, i));
                return i + 8;
            case 8:
                zzfbVar.zzrq = java.lang.Float.valueOf(com.google.android.gms.internal.vision.zzez.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZza = com.google.android.gms.internal.vision.zzez.zza(bArr, i, zzfbVar);
                zzfbVar.zzrq = java.lang.Integer.valueOf(zzfbVar.zzro);
                return iZza;
            case 12:
            case 13:
                int iZzb2 = com.google.android.gms.internal.vision.zzez.zzb(bArr, i, zzfbVar);
                zzfbVar.zzrq = java.lang.Long.valueOf(zzfbVar.zzrp);
                return iZzb2;
            case 14:
                return com.google.android.gms.internal.vision.zzez.zza(com.google.android.gms.internal.vision.zzin.zzho().zzf(cls), bArr, i, i2, zzfbVar);
            case 15:
                int iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr, i, zzfbVar);
                zzfbVar.zzrq = java.lang.Integer.valueOf(com.google.android.gms.internal.vision.zzft.zzau(zzfbVar.zzro));
                return iZza2;
            case 16:
                int iZzb3 = com.google.android.gms.internal.vision.zzez.zzb(bArr, i, zzfbVar);
                zzfbVar.zzrq = java.lang.Long.valueOf(com.google.android.gms.internal.vision.zzft.zzr(zzfbVar.zzrp));
                return iZzb3;
            case 17:
                return com.google.android.gms.internal.vision.zzez.zzd(bArr, i, zzfbVar);
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        int iZza;
        int iZza2 = i;
        sun.misc.Unsafe unsafe = zzyt;
        com.google.android.gms.internal.vision.zzgz zzgzVarZzag = (com.google.android.gms.internal.vision.zzgz) unsafe.getObject(t, j2);
        if (!zzgzVarZzag.zzdo()) {
            int size = zzgzVarZzag.size();
            zzgzVarZzag = zzgzVarZzag.zzag(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, zzgzVarZzag);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return com.google.android.gms.internal.vision.zzez.zzf(bArr, iZza2, zzgzVarZzag, zzfbVar);
                }
                if (i5 == 1) {
                    com.google.android.gms.internal.vision.zzgb zzgbVar = (com.google.android.gms.internal.vision.zzgb) zzgzVarZzag;
                    zzgbVar.zzc(com.google.android.gms.internal.vision.zzez.zzc(bArr, i));
                    while (true) {
                        int i8 = iZza2 + 8;
                        if (i8 >= i2) {
                            return i8;
                        }
                        iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr, i8, zzfbVar);
                        if (i3 != zzfbVar.zzro) {
                            return i8;
                        }
                        zzgbVar.zzc(com.google.android.gms.internal.vision.zzez.zzc(bArr, iZza2));
                    }
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return com.google.android.gms.internal.vision.zzez.zze(bArr, iZza2, zzgzVarZzag, zzfbVar);
                }
                if (i5 == 5) {
                    com.google.android.gms.internal.vision.zzgo zzgoVar = (com.google.android.gms.internal.vision.zzgo) zzgzVarZzag;
                    zzgoVar.zzu(com.google.android.gms.internal.vision.zzez.zzd(bArr, i));
                    while (true) {
                        int i9 = iZza2 + 4;
                        if (i9 >= i2) {
                            return i9;
                        }
                        iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr, i9, zzfbVar);
                        if (i3 != zzfbVar.zzro) {
                            return i9;
                        }
                        zzgoVar.zzu(com.google.android.gms.internal.vision.zzez.zzd(bArr, iZza2));
                    }
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return com.google.android.gms.internal.vision.zzez.zzb(bArr, iZza2, zzgzVarZzag, zzfbVar);
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.vision.zzhq zzhqVar = (com.google.android.gms.internal.vision.zzhq) zzgzVarZzag;
                    int iZzb = com.google.android.gms.internal.vision.zzez.zzb(bArr, iZza2, zzfbVar);
                    zzhqVar.zzac(zzfbVar.zzrp);
                    while (iZzb < i2) {
                        int iZza3 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZzb, zzfbVar);
                        if (i3 != zzfbVar.zzro) {
                            return iZzb;
                        }
                        iZzb = com.google.android.gms.internal.vision.zzez.zzb(bArr, iZza3, zzfbVar);
                        zzhqVar.zzac(zzfbVar.zzrp);
                    }
                    return iZzb;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return com.google.android.gms.internal.vision.zzez.zza(bArr, iZza2, (com.google.android.gms.internal.vision.zzgz<?>) zzgzVarZzag, zzfbVar);
                }
                if (i5 == 0) {
                    return com.google.android.gms.internal.vision.zzez.zza(i3, bArr, i, i2, (com.google.android.gms.internal.vision.zzgz<?>) zzgzVarZzag, zzfbVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return com.google.android.gms.internal.vision.zzez.zzd(bArr, iZza2, zzgzVarZzag, zzfbVar);
                }
                if (i5 == 1) {
                    com.google.android.gms.internal.vision.zzhq zzhqVar2 = (com.google.android.gms.internal.vision.zzhq) zzgzVarZzag;
                    zzhqVar2.zzac(com.google.android.gms.internal.vision.zzez.zzb(bArr, i));
                    while (true) {
                        int i10 = iZza2 + 8;
                        if (i10 >= i2) {
                            return i10;
                        }
                        iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr, i10, zzfbVar);
                        if (i3 != zzfbVar.zzro) {
                            return i10;
                        }
                        zzhqVar2.zzac(com.google.android.gms.internal.vision.zzez.zzb(bArr, iZza2));
                    }
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return com.google.android.gms.internal.vision.zzez.zzc(bArr, iZza2, zzgzVarZzag, zzfbVar);
                }
                if (i5 == 5) {
                    com.google.android.gms.internal.vision.zzgu zzguVar = (com.google.android.gms.internal.vision.zzgu) zzgzVarZzag;
                    zzguVar.zzbl(com.google.android.gms.internal.vision.zzez.zza(bArr, i));
                    while (true) {
                        int i11 = iZza2 + 4;
                        if (i11 >= i2) {
                            return i11;
                        }
                        iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr, i11, zzfbVar);
                        if (i3 != zzfbVar.zzro) {
                            return i11;
                        }
                        zzguVar.zzbl(com.google.android.gms.internal.vision.zzez.zza(bArr, iZza2));
                    }
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return com.google.android.gms.internal.vision.zzez.zzg(bArr, iZza2, zzgzVarZzag, zzfbVar);
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.vision.zzff zzffVar = (com.google.android.gms.internal.vision.zzff) zzgzVarZzag;
                    int iZzb2 = com.google.android.gms.internal.vision.zzez.zzb(bArr, iZza2, zzfbVar);
                    zzffVar.addBoolean(zzfbVar.zzrp != 0);
                    while (iZzb2 < i2) {
                        int iZza4 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZzb2, zzfbVar);
                        if (i3 != zzfbVar.zzro) {
                            return iZzb2;
                        }
                        iZzb2 = com.google.android.gms.internal.vision.zzez.zzb(bArr, iZza4, zzfbVar);
                        zzffVar.addBoolean(zzfbVar.zzrp != 0);
                    }
                    return iZzb2;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza2, zzfbVar);
                        int i12 = zzfbVar.zzro;
                        if (i12 < 0) {
                            throw com.google.android.gms.internal.vision.zzhc.zzgn();
                        }
                        if (i12 == 0) {
                            zzgzVarZzag.add("");
                        } else {
                            zzgzVarZzag.add(new java.lang.String(bArr, iZza2, i12, com.google.android.gms.internal.vision.zzgt.UTF_8));
                            iZza2 += i12;
                        }
                        while (iZza2 < i2) {
                            int iZza5 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza2, zzfbVar);
                            if (i3 != zzfbVar.zzro) {
                                break;
                            } else {
                                iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza5, zzfbVar);
                                int i13 = zzfbVar.zzro;
                                if (i13 < 0) {
                                    throw com.google.android.gms.internal.vision.zzhc.zzgn();
                                }
                                if (i13 == 0) {
                                    zzgzVarZzag.add("");
                                } else {
                                    zzgzVarZzag.add(new java.lang.String(bArr, iZza2, i13, com.google.android.gms.internal.vision.zzgt.UTF_8));
                                    iZza2 += i13;
                                }
                            }
                        }
                    } else {
                        iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza2, zzfbVar);
                        int i14 = zzfbVar.zzro;
                        if (i14 < 0) {
                            throw com.google.android.gms.internal.vision.zzhc.zzgn();
                        }
                        if (i14 == 0) {
                            zzgzVarZzag.add("");
                        } else {
                            int i15 = iZza2 + i14;
                            if (!com.google.android.gms.internal.vision.zzjs.zzf(bArr, iZza2, i15)) {
                                throw com.google.android.gms.internal.vision.zzhc.zzgt();
                            }
                            zzgzVarZzag.add(new java.lang.String(bArr, iZza2, i14, com.google.android.gms.internal.vision.zzgt.UTF_8));
                            iZza2 = i15;
                        }
                        while (iZza2 < i2) {
                            int iZza6 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza2, zzfbVar);
                            if (i3 != zzfbVar.zzro) {
                                break;
                            } else {
                                iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza6, zzfbVar);
                                int i16 = zzfbVar.zzro;
                                if (i16 < 0) {
                                    throw com.google.android.gms.internal.vision.zzhc.zzgn();
                                }
                                if (i16 == 0) {
                                    zzgzVarZzag.add("");
                                } else {
                                    int i17 = iZza2 + i16;
                                    if (!com.google.android.gms.internal.vision.zzjs.zzf(bArr, iZza2, i17)) {
                                        throw com.google.android.gms.internal.vision.zzhc.zzgt();
                                    }
                                    zzgzVarZzag.add(new java.lang.String(bArr, iZza2, i16, com.google.android.gms.internal.vision.zzgt.UTF_8));
                                    iZza2 = i17;
                                }
                            }
                        }
                    }
                }
                break;
            case 27:
                if (i5 == 2) {
                    return com.google.android.gms.internal.vision.zzez.zza(zzbm(i6), i3, bArr, i, i2, zzgzVarZzag, zzfbVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int iZza7 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza2, zzfbVar);
                    int i18 = zzfbVar.zzro;
                    if (i18 < 0) {
                        throw com.google.android.gms.internal.vision.zzhc.zzgn();
                    }
                    if (i18 > bArr.length - iZza7) {
                        throw com.google.android.gms.internal.vision.zzhc.zzgm();
                    }
                    if (i18 == 0) {
                        zzgzVarZzag.add(com.google.android.gms.internal.vision.zzfh.zzrx);
                    } else {
                        zzgzVarZzag.add(com.google.android.gms.internal.vision.zzfh.zza(bArr, iZza7, i18));
                        iZza7 += i18;
                    }
                    while (iZza7 < i2) {
                        int iZza8 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza7, zzfbVar);
                        if (i3 != zzfbVar.zzro) {
                            return iZza7;
                        }
                        iZza7 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza8, zzfbVar);
                        int i19 = zzfbVar.zzro;
                        if (i19 < 0) {
                            throw com.google.android.gms.internal.vision.zzhc.zzgn();
                        }
                        if (i19 > bArr.length - iZza7) {
                            throw com.google.android.gms.internal.vision.zzhc.zzgm();
                        }
                        if (i19 == 0) {
                            zzgzVarZzag.add(com.google.android.gms.internal.vision.zzfh.zzrx);
                        } else {
                            zzgzVarZzag.add(com.google.android.gms.internal.vision.zzfh.zza(bArr, iZza7, i19));
                            iZza7 += i19;
                        }
                    }
                    return iZza7;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    iZza = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza2, (com.google.android.gms.internal.vision.zzgz<?>) zzgzVarZzag, zzfbVar);
                } else if (i5 == 0) {
                    iZza = com.google.android.gms.internal.vision.zzez.zza(i3, bArr, i, i2, (com.google.android.gms.internal.vision.zzgz<?>) zzgzVarZzag, zzfbVar);
                }
                com.google.android.gms.internal.vision.zzgs zzgsVar = (com.google.android.gms.internal.vision.zzgs) t;
                com.google.android.gms.internal.vision.zzjm zzjmVar = zzgsVar.zzwd;
                if (zzjmVar == com.google.android.gms.internal.vision.zzjm.zzig()) {
                    zzjmVar = null;
                }
                com.google.android.gms.internal.vision.zzjm zzjmVar2 = (com.google.android.gms.internal.vision.zzjm) com.google.android.gms.internal.vision.zzit.zza(i4, (java.util.List<java.lang.Integer>) zzgzVarZzag, zzbo(i6), zzjmVar, (com.google.android.gms.internal.vision.zzjj<UT, com.google.android.gms.internal.vision.zzjm>) this.zzzi);
                if (zzjmVar2 != null) {
                    zzgsVar.zzwd = zzjmVar2;
                }
                return iZza;
            case 33:
            case 47:
                if (i5 == 2) {
                    return com.google.android.gms.internal.vision.zzez.zzh(bArr, iZza2, zzgzVarZzag, zzfbVar);
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.vision.zzgu zzguVar2 = (com.google.android.gms.internal.vision.zzgu) zzgzVarZzag;
                    int iZza9 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza2, zzfbVar);
                    zzguVar2.zzbl(com.google.android.gms.internal.vision.zzft.zzau(zzfbVar.zzro));
                    while (iZza9 < i2) {
                        int iZza10 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza9, zzfbVar);
                        if (i3 != zzfbVar.zzro) {
                            return iZza9;
                        }
                        iZza9 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza10, zzfbVar);
                        zzguVar2.zzbl(com.google.android.gms.internal.vision.zzft.zzau(zzfbVar.zzro));
                    }
                    return iZza9;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return com.google.android.gms.internal.vision.zzez.zzi(bArr, iZza2, zzgzVarZzag, zzfbVar);
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.vision.zzhq zzhqVar3 = (com.google.android.gms.internal.vision.zzhq) zzgzVarZzag;
                    int iZzb3 = com.google.android.gms.internal.vision.zzez.zzb(bArr, iZza2, zzfbVar);
                    zzhqVar3.zzac(com.google.android.gms.internal.vision.zzft.zzr(zzfbVar.zzrp));
                    while (iZzb3 < i2) {
                        int iZza11 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZzb3, zzfbVar);
                        if (i3 != zzfbVar.zzro) {
                            return iZzb3;
                        }
                        iZzb3 = com.google.android.gms.internal.vision.zzez.zzb(bArr, iZza11, zzfbVar);
                        zzhqVar3.zzac(com.google.android.gms.internal.vision.zzft.zzr(zzfbVar.zzrp));
                    }
                    return iZzb3;
                }
                break;
            case 49:
                if (i5 == 3) {
                    com.google.android.gms.internal.vision.zzir zzirVarZzbm = zzbm(i6);
                    int i20 = (i3 & (-8)) | 4;
                    iZza2 = com.google.android.gms.internal.vision.zzez.zza(zzirVarZzbm, bArr, i, i2, i20, zzfbVar);
                    zzgzVarZzag.add(zzfbVar.zzrq);
                    while (iZza2 < i2) {
                        int iZza12 = com.google.android.gms.internal.vision.zzez.zza(bArr, iZza2, zzfbVar);
                        if (i3 == zzfbVar.zzro) {
                            iZza2 = com.google.android.gms.internal.vision.zzez.zza(zzirVarZzbm, bArr, iZza12, i2, i20, zzfbVar);
                            zzgzVarZzag.add(zzfbVar.zzrq);
                        }
                    }
                }
                break;
        }
        return iZza2;
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        sun.misc.Unsafe unsafe = zzyt;
        java.lang.Object objZzbn = zzbn(i3);
        java.lang.Object object = unsafe.getObject(t, j);
        if (this.zzzk.zzm(object)) {
            java.lang.Object objZzo = this.zzzk.zzo(objZzbn);
            this.zzzk.zzc(objZzo, object);
            unsafe.putObject(t, j, objZzo);
            object = objZzo;
        }
        com.google.android.gms.internal.vision.zzht<?, ?> zzhtVarZzp = this.zzzk.zzp(objZzbn);
        java.util.Map<?, ?> mapZzk = this.zzzk.zzk(object);
        int iZza = com.google.android.gms.internal.vision.zzez.zza(bArr, i, zzfbVar);
        int i4 = zzfbVar.zzro;
        if (i4 < 0 || i4 > i2 - iZza) {
            throw com.google.android.gms.internal.vision.zzhc.zzgm();
        }
        int i5 = i4 + iZza;
        K k = zzhtVarZzp.zzyn;
        V v = zzhtVarZzp.zzgc;
        while (iZza < i5) {
            int iZza2 = iZza + 1;
            int i6 = bArr[iZza];
            if (i6 < 0) {
                iZza2 = com.google.android.gms.internal.vision.zzez.zza(i6, bArr, iZza2, zzfbVar);
                i6 = zzfbVar.zzro;
            }
            int i7 = iZza2;
            int i8 = i6 >>> 3;
            int i9 = i6 & 7;
            if (i8 == 1) {
                if (i9 == zzhtVarZzp.zzym.zziq()) {
                    iZza = zza(bArr, i7, i2, zzhtVarZzp.zzym, (java.lang.Class<?>) null, zzfbVar);
                    k = (K) zzfbVar.zzrq;
                } else {
                    iZza = com.google.android.gms.internal.vision.zzez.zza(i6, bArr, i7, i2, zzfbVar);
                }
            } else if (i8 == 2 && i9 == zzhtVarZzp.zzyo.zziq()) {
                iZza = zza(bArr, i7, i2, zzhtVarZzp.zzyo, zzhtVarZzp.zzgc.getClass(), zzfbVar);
                v = zzfbVar.zzrq;
            } else {
                iZza = com.google.android.gms.internal.vision.zzez.zza(i6, bArr, i7, i2, zzfbVar);
            }
        }
        if (iZza != i5) {
            throw com.google.android.gms.internal.vision.zzhc.zzgs();
        }
        mapZzk.put(k, v);
        return i5;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        int iZzb;
        sun.misc.Unsafe unsafe = zzyt;
        long j2 = this.zzyu[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Double.valueOf(com.google.android.gms.internal.vision.zzez.zzc(bArr, i)));
                iZzb = i + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Float.valueOf(com.google.android.gms.internal.vision.zzez.zzd(bArr, i)));
                iZzb = i + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.vision.zzez.zzb(bArr, i, zzfbVar);
                unsafe.putObject(t, j, java.lang.Long.valueOf(zzfbVar.zzrp));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.vision.zzez.zza(bArr, i, zzfbVar);
                unsafe.putObject(t, j, java.lang.Integer.valueOf(zzfbVar.zzro));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.android.gms.internal.vision.zzez.zzb(bArr, i)));
                iZzb = i + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.android.gms.internal.vision.zzez.zza(bArr, i)));
                iZzb = i + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.vision.zzez.zzb(bArr, i, zzfbVar);
                unsafe.putObject(t, j, java.lang.Boolean.valueOf(zzfbVar.zzrp != 0));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZza = com.google.android.gms.internal.vision.zzez.zza(bArr, i, zzfbVar);
                int i9 = zzfbVar.zzro;
                if (i9 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !com.google.android.gms.internal.vision.zzjs.zzf(bArr, iZza, iZza + i9)) {
                        throw com.google.android.gms.internal.vision.zzhc.zzgt();
                    }
                    unsafe.putObject(t, j, new java.lang.String(bArr, iZza, i9, com.google.android.gms.internal.vision.zzgt.UTF_8));
                    iZza += i9;
                }
                unsafe.putInt(t, j2, i4);
                return iZza;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iZza2 = com.google.android.gms.internal.vision.zzez.zza(zzbm(i8), bArr, i, i2, zzfbVar);
                java.lang.Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, zzfbVar.zzrq);
                } else {
                    unsafe.putObject(t, j, com.google.android.gms.internal.vision.zzgt.zzb(object, zzfbVar.zzrq));
                }
                unsafe.putInt(t, j2, i4);
                return iZza2;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.vision.zzez.zze(bArr, i, zzfbVar);
                unsafe.putObject(t, j, zzfbVar.zzrq);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iZza3 = com.google.android.gms.internal.vision.zzez.zza(bArr, i, zzfbVar);
                int i10 = zzfbVar.zzro;
                com.google.android.gms.internal.vision.zzgy zzgyVarZzbo = zzbo(i8);
                if (zzgyVarZzbo == null || zzgyVarZzbo.zzf(i10)) {
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(i10));
                    iZzb = iZza3;
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                zzs(t).zzb(i3, java.lang.Long.valueOf(i10));
                return iZza3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.vision.zzez.zza(bArr, i, zzfbVar);
                unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.android.gms.internal.vision.zzft.zzau(zzfbVar.zzro)));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.vision.zzez.zzb(bArr, i, zzfbVar);
                unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.android.gms.internal.vision.zzft.zzr(zzfbVar.zzrp)));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.vision.zzez.zza(zzbm(i8), bArr, i, i2, (i3 & (-8)) | 4, zzfbVar);
                java.lang.Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object2 == null) {
                    unsafe.putObject(t, j, zzfbVar.zzrq);
                } else {
                    unsafe.putObject(t, j, com.google.android.gms.internal.vision.zzgt.zzb(object2, zzfbVar.zzrq));
                }
                unsafe.putInt(t, j2, i4);
                return iZzb;
            default:
                return i;
        }
    }

    private final com.google.android.gms.internal.vision.zzir zzbm(int i) {
        int i2 = (i / 3) << 1;
        com.google.android.gms.internal.vision.zzir zzirVar = (com.google.android.gms.internal.vision.zzir) this.zzyv[i2];
        if (zzirVar != null) {
            return zzirVar;
        }
        com.google.android.gms.internal.vision.zzir<T> zzirVarZzf = com.google.android.gms.internal.vision.zzin.zzho().zzf((java.lang.Class) this.zzyv[i2 + 1]);
        this.zzyv[i2] = zzirVarZzf;
        return zzirVarZzf;
    }

    private final java.lang.Object zzbn(int i) {
        return this.zzyv[(i / 3) << 1];
    }

    private final com.google.android.gms.internal.vision.zzgy zzbo(int i) {
        return (com.google.android.gms.internal.vision.zzgy) this.zzyv[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Code duplicated, block: B:213:0x067d  */
    /* JADX WARN: Code duplicated, block: B:214:0x0683  */
    /* JADX WARN: Code duplicated, block: B:216:0x0693  */
    /* JADX WARN: Code duplicated, block: B:219:0x0698  */
    /* JADX WARN: Code duplicated, block: B:221:0x06a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r33v1, types: [T] */
    final int zza(T t, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.vision.zzfb zzfbVar) throws java.io.IOException {
        sun.misc.Unsafe unsafe;
        int i4;
        com.google.android.gms.internal.vision.zzig<T> zzigVar;
        int i5;
        int i6;
        ?? r14;
        int i7;
        int iZza;
        int iZzbs;
        int i8;
        int iZzb;
        int i9;
        boolean z;
        int i10;
        com.google.android.gms.internal.vision.zzfb zzfbVar2;
        int i11;
        byte[] bArr2;
        byte[] bArr3;
        java.lang.Object obj;
        int i12;
        java.lang.Object objZza;
        java.lang.Object objValueOf;
        java.lang.Object objZzb;
        byte[] bArr4;
        int iZzf;
        java.lang.Object obj2;
        int i13;
        int i14;
        int i15;
        byte[] bArr5;
        int i16;
        byte[] bArr6;
        int i17;
        int i18;
        int i19;
        com.google.android.gms.internal.vision.zzig<T> zzigVar2 = this;
        T t2 = t;
        byte[] bArr7 = bArr;
        int i20 = i2;
        int i21 = i3;
        com.google.android.gms.internal.vision.zzfb zzfbVar3 = zzfbVar;
        sun.misc.Unsafe unsafe2 = zzyt;
        int iZza2 = i;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        while (true) {
            java.lang.Object objValueOf2 = null;
            if (iZza2 < i20) {
                int i27 = iZza2 + 1;
                byte b = bArr7[iZza2];
                if (b < 0) {
                    iZza = com.google.android.gms.internal.vision.zzez.zza(b, bArr7, i27, zzfbVar3);
                    i7 = zzfbVar3.zzro;
                } else {
                    i7 = b;
                    iZza = i27;
                }
                int i28 = i7 >>> 3;
                int i29 = i7 & 7;
                if (i28 > i22) {
                    iZzbs = zzigVar2.zzt(i28, i23 / 3);
                } else {
                    iZzbs = zzigVar2.zzbs(i28);
                }
                int i30 = iZzbs;
                if (i30 == -1) {
                    i8 = i28;
                    iZzb = iZza;
                    i9 = i7;
                    unsafe = unsafe2;
                    i3 = i21;
                    z = true;
                    i10 = 0;
                } else {
                    int[] iArr = zzigVar2.zzyu;
                    int i31 = iArr[i30 + 1];
                    int i32 = (i31 & 267386880) >>> 20;
                    int i33 = i7;
                    long j = i31 & 1048575;
                    if (i32 <= 17) {
                        int i34 = iArr[i30 + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        if (i36 != i26) {
                            if (i26 != -1) {
                                unsafe2.putInt((java.lang.Object) t2, i26, i25);
                            }
                            i25 = unsafe2.getInt((java.lang.Object) t2, i36);
                            i26 = i36;
                        }
                        switch (i32) {
                            case 0:
                                bArr5 = bArr;
                                i13 = i30;
                                i14 = i28;
                                i26 = i26;
                                i15 = i33;
                                i16 = iZza;
                                if (i29 == 1) {
                                    com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t2, j, com.google.android.gms.internal.vision.zzez.zzc(bArr5, i16));
                                    iZza2 = i16 + 8;
                                    i25 |= i35;
                                    i26 = i26;
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr5;
                                } else {
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 1:
                                bArr5 = bArr;
                                i13 = i30;
                                i14 = i28;
                                i26 = i26;
                                i15 = i33;
                                i16 = iZza;
                                if (i29 == 5) {
                                    com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t2, j, com.google.android.gms.internal.vision.zzez.zzd(bArr5, i16));
                                    iZza2 = i16 + 4;
                                    i25 |= i35;
                                    i26 = i26;
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr5;
                                } else {
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr6 = bArr;
                                i13 = i30;
                                i14 = i28;
                                i26 = i26;
                                i15 = i33;
                                i16 = iZza;
                                if (i29 == 0) {
                                    int iZzb2 = com.google.android.gms.internal.vision.zzez.zzb(bArr6, i16, zzfbVar3);
                                    unsafe2.putLong(t, j, zzfbVar3.zzrp);
                                    i25 |= i35;
                                    iZza2 = iZzb2;
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    i26 = i26;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr6;
                                } else {
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr6 = bArr;
                                i13 = i30;
                                i14 = i28;
                                i26 = i26;
                                i15 = i33;
                                i16 = iZza;
                                if (i29 == 0) {
                                    iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr6, i16, zzfbVar3);
                                    unsafe2.putInt((java.lang.Object) t2, j, zzfbVar3.zzro);
                                    i25 |= i35;
                                    i26 = i26;
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr6;
                                } else {
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 5:
                            case 14:
                                i13 = i30;
                                i14 = i28;
                                i15 = i33;
                                if (i29 == 1) {
                                    bArr6 = bArr;
                                    i26 = i26;
                                    unsafe2.putLong(t, j, com.google.android.gms.internal.vision.zzez.zzb(bArr, iZza));
                                    iZza2 = iZza + 8;
                                    i25 |= i35;
                                    i26 = i26;
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr6;
                                } else {
                                    i26 = i26;
                                    i16 = iZza;
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr5 = bArr;
                                i13 = i30;
                                i14 = i28;
                                i15 = i33;
                                if (i29 == 5) {
                                    unsafe2.putInt((java.lang.Object) t2, j, com.google.android.gms.internal.vision.zzez.zza(bArr5, iZza));
                                    iZza2 = iZza + 4;
                                    i25 |= i35;
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr5;
                                } else {
                                    i16 = iZza;
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 7:
                                bArr6 = bArr;
                                i13 = i30;
                                i14 = i28;
                                i15 = i33;
                                if (i29 == 0) {
                                    iZza2 = com.google.android.gms.internal.vision.zzez.zzb(bArr6, iZza, zzfbVar3);
                                    com.google.android.gms.internal.vision.zzjp.zza((java.lang.Object) t2, j, zzfbVar3.zzrp != 0);
                                    i25 |= i35;
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr6;
                                } else {
                                    i16 = iZza;
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 8:
                                bArr6 = bArr;
                                i13 = i30;
                                i14 = i28;
                                i15 = i33;
                                if (i29 == 2) {
                                    if ((536870912 & i31) == 0) {
                                        iZza2 = com.google.android.gms.internal.vision.zzez.zzc(bArr6, iZza, zzfbVar3);
                                    } else {
                                        iZza2 = com.google.android.gms.internal.vision.zzez.zzd(bArr6, iZza, zzfbVar3);
                                    }
                                    unsafe2.putObject((java.lang.Object) t2, j, zzfbVar3.zzrq);
                                    i25 |= i35;
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr6;
                                } else {
                                    i16 = iZza;
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 9:
                                bArr6 = bArr;
                                i13 = i30;
                                i14 = i28;
                                i15 = i33;
                                if (i29 == 2) {
                                    iZza2 = com.google.android.gms.internal.vision.zzez.zza(zzigVar2.zzbm(i13), bArr6, iZza, i2, zzfbVar3);
                                    if ((i25 & i35) == 0) {
                                        unsafe2.putObject((java.lang.Object) t2, j, zzfbVar3.zzrq);
                                    } else {
                                        unsafe2.putObject((java.lang.Object) t2, j, com.google.android.gms.internal.vision.zzgt.zzb(unsafe2.getObject((java.lang.Object) t2, j), zzfbVar3.zzrq));
                                    }
                                    i25 |= i35;
                                    i24 = i15;
                                    i23 = i13;
                                    i21 = i3;
                                    bArr7 = bArr6;
                                    i20 = i2;
                                    i22 = i14;
                                } else {
                                    i16 = iZza;
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 10:
                                bArr6 = bArr;
                                i13 = i30;
                                i14 = i28;
                                i15 = i33;
                                if (i29 == 2) {
                                    iZza2 = com.google.android.gms.internal.vision.zzez.zze(bArr6, iZza, zzfbVar3);
                                    unsafe2.putObject((java.lang.Object) t2, j, zzfbVar3.zzrq);
                                    i25 |= i35;
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr6;
                                } else {
                                    i16 = iZza;
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 12:
                                bArr6 = bArr;
                                i13 = i30;
                                i14 = i28;
                                i15 = i33;
                                if (i29 == 0) {
                                    iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr6, iZza, zzfbVar3);
                                    int i37 = zzfbVar3.zzro;
                                    com.google.android.gms.internal.vision.zzgy zzgyVarZzbo = zzigVar2.zzbo(i13);
                                    if (zzgyVarZzbo == null || zzgyVarZzbo.zzf(i37)) {
                                        unsafe2.putInt((java.lang.Object) t2, j, i37);
                                        i25 |= i35;
                                    } else {
                                        zzs(t).zzb(i15, java.lang.Long.valueOf(i37));
                                    }
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr6;
                                } else {
                                    i16 = iZza;
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 15:
                                bArr6 = bArr;
                                i13 = i30;
                                i14 = i28;
                                i15 = i33;
                                if (i29 == 0) {
                                    iZza2 = com.google.android.gms.internal.vision.zzez.zza(bArr6, iZza, zzfbVar3);
                                    unsafe2.putInt((java.lang.Object) t2, j, com.google.android.gms.internal.vision.zzft.zzau(zzfbVar3.zzro));
                                    i25 |= i35;
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr6;
                                } else {
                                    i16 = iZza;
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 16:
                                i13 = i30;
                                i14 = i28;
                                i15 = i33;
                                if (i29 == 0) {
                                    bArr6 = bArr;
                                    int iZzb3 = com.google.android.gms.internal.vision.zzez.zzb(bArr6, iZza, zzfbVar3);
                                    unsafe2.putLong(t, j, com.google.android.gms.internal.vision.zzft.zzr(zzfbVar3.zzrp));
                                    i25 |= i35;
                                    i24 = i15;
                                    i23 = i13;
                                    i22 = i14;
                                    iZza2 = iZzb3;
                                    i20 = i2;
                                    i21 = i3;
                                    bArr7 = bArr6;
                                } else {
                                    i16 = iZza;
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            case 17:
                                if (i29 == 3) {
                                    iZza2 = com.google.android.gms.internal.vision.zzez.zza(zzigVar2.zzbm(i30), bArr, iZza, i2, (i28 << 3) | 4, zzfbVar);
                                    if ((i25 & i35) == 0) {
                                        unsafe2.putObject((java.lang.Object) t2, j, zzfbVar3.zzrq);
                                    } else {
                                        unsafe2.putObject((java.lang.Object) t2, j, com.google.android.gms.internal.vision.zzgt.zzb(unsafe2.getObject((java.lang.Object) t2, j), zzfbVar3.zzrq));
                                    }
                                    i25 |= i35;
                                    i24 = i33;
                                    i23 = i30;
                                    i22 = i28;
                                    bArr7 = bArr;
                                    i20 = i2;
                                    i21 = i3;
                                } else {
                                    i13 = i30;
                                    i14 = i28;
                                    i15 = i33;
                                    i16 = iZza;
                                    i3 = i3;
                                    iZzb = i16;
                                    unsafe = unsafe2;
                                    i9 = i15;
                                    i10 = i13;
                                    i8 = i14;
                                    z = true;
                                    i26 = i26;
                                }
                                break;
                            default:
                                i13 = i30;
                                i14 = i28;
                                i15 = i33;
                                i16 = iZza;
                                i3 = i3;
                                iZzb = i16;
                                unsafe = unsafe2;
                                i9 = i15;
                                i10 = i13;
                                i8 = i14;
                                z = true;
                                i26 = i26;
                                break;
                        }
                    } else {
                        int i38 = i26;
                        int i39 = iZza;
                        if (i32 != 27) {
                            i17 = i25;
                            if (i32 <= 49) {
                                i18 = i33;
                                z = true;
                                unsafe = unsafe2;
                                i10 = i30;
                                i8 = i28;
                                iZza2 = zza(t, bArr, i39, i2, i33, i28, i29, i30, i31, i32, j, zzfbVar);
                                if (iZza2 == i39) {
                                    iZzb = iZza2;
                                    i26 = i38;
                                    i9 = i18;
                                    i25 = i17;
                                } else {
                                    zzigVar2 = this;
                                    t2 = t;
                                    bArr7 = bArr;
                                    i20 = i2;
                                    i21 = i3;
                                    zzfbVar3 = zzfbVar;
                                    i26 = i38;
                                    i24 = i18;
                                    i22 = i8;
                                    i25 = i17;
                                    i23 = i10;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i19 = i39;
                                i18 = i33;
                                unsafe = unsafe2;
                                i10 = i30;
                                i8 = i28;
                                z = true;
                                if (i32 != 50) {
                                    iZza2 = zza(t, bArr, i19, i2, i18, i8, i29, i31, i32, j, i10, zzfbVar);
                                    if (iZza2 != i19) {
                                        zzigVar2 = this;
                                        t2 = t;
                                        i20 = i2;
                                        i21 = i3;
                                        i24 = i18;
                                        i22 = i8;
                                        i26 = i38;
                                        i25 = i17;
                                        i23 = i10;
                                        unsafe2 = unsafe;
                                        bArr7 = bArr;
                                        zzfbVar3 = zzfbVar;
                                    }
                                } else if (i29 == 2) {
                                    iZza2 = zza(t, bArr, i19, i2, i10, j, zzfbVar);
                                    if (iZza2 != i19) {
                                        zzigVar2 = this;
                                        t2 = t;
                                        bArr7 = bArr;
                                        i20 = i2;
                                        i21 = i3;
                                        zzfbVar3 = zzfbVar;
                                        i26 = i38;
                                        i24 = i18;
                                        i22 = i8;
                                        i25 = i17;
                                        i23 = i10;
                                        unsafe2 = unsafe;
                                    }
                                }
                                iZzb = iZza2;
                                i26 = i38;
                                i9 = i18;
                                i25 = i17;
                            }
                        } else if (i29 == 2) {
                            com.google.android.gms.internal.vision.zzgz zzgzVarZzag = (com.google.android.gms.internal.vision.zzgz) unsafe2.getObject((java.lang.Object) t2, j);
                            if (!zzgzVarZzag.zzdo()) {
                                int size = zzgzVarZzag.size();
                                zzgzVarZzag = zzgzVarZzag.zzag(size == 0 ? 10 : size << 1);
                                unsafe2.putObject((java.lang.Object) t2, j, zzgzVarZzag);
                            }
                            iZza2 = com.google.android.gms.internal.vision.zzez.zza(zzigVar2.zzbm(i30), i33, bArr, i39, i2, zzgzVarZzag, zzfbVar);
                            i24 = i33;
                            i23 = i30;
                            i22 = i28;
                            i26 = i38;
                            i25 = i25;
                            bArr7 = bArr;
                            i20 = i2;
                            i21 = i3;
                        } else {
                            i17 = i25;
                            i18 = i33;
                            i19 = i39;
                            unsafe = unsafe2;
                            i10 = i30;
                            i8 = i28;
                            z = true;
                        }
                        iZzb = i19;
                        i26 = i38;
                        i9 = i18;
                        i25 = i17;
                    }
                }
                if (i9 != i3 || i3 == 0) {
                    if (this.zzyz) {
                        zzfbVar2 = zzfbVar;
                        if (zzfbVar2.zzcm != com.google.android.gms.internal.vision.zzgd.zzfl()) {
                            com.google.android.gms.internal.vision.zzic zzicVar = this.zzyy;
                            com.google.android.gms.internal.vision.zzjj<?, ?> zzjjVar = this.zzzi;
                            i11 = i8;
                            com.google.android.gms.internal.vision.zzgs.zzg zzgVarZza = zzfbVar2.zzcm.zza(zzicVar, i11);
                            if (zzgVarZza == null) {
                                iZza2 = com.google.android.gms.internal.vision.zzez.zza(i9, bArr, iZzb, i2, zzs(t), zzfbVar);
                                i25 = i25;
                                i26 = i26;
                                bArr2 = bArr;
                                i2 = i2;
                                t2 = t;
                            } else {
                                T t3 = t;
                                com.google.android.gms.internal.vision.zzgs.zze zzeVar = (com.google.android.gms.internal.vision.zzgs.zze) t3;
                                zzeVar.zzgk();
                                com.google.android.gms.internal.vision.zzgi<com.google.android.gms.internal.vision.zzgs.zzd> zzgiVar = zzeVar.zzwk;
                                if (zzgVarZza.zzxb.zzwi && zzgVarZza.zzxb.zzwj) {
                                    switch (com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()]) {
                                        case 1:
                                            bArr4 = bArr;
                                            com.google.android.gms.internal.vision.zzgb zzgbVar = new com.google.android.gms.internal.vision.zzgb();
                                            iZzf = com.google.android.gms.internal.vision.zzez.zzf(bArr4, iZzb, zzgbVar, zzfbVar2);
                                            obj2 = zzgbVar;
                                            iZzb = iZzf;
                                            i25 = i25;
                                            i26 = i26;
                                            i2 = i2;
                                            bArr2 = bArr4;
                                            objZzb = obj2;
                                            objZzb = obj;
                                            zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                            break;
                                        case 2:
                                            bArr4 = bArr;
                                            com.google.android.gms.internal.vision.zzgo zzgoVar = new com.google.android.gms.internal.vision.zzgo();
                                            iZzf = com.google.android.gms.internal.vision.zzez.zze(bArr4, iZzb, zzgoVar, zzfbVar2);
                                            obj2 = zzgoVar;
                                            iZzb = iZzf;
                                            i25 = i25;
                                            i26 = i26;
                                            i2 = i2;
                                            bArr2 = bArr4;
                                            objZzb = obj2;
                                            objZzb = obj;
                                            zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                            break;
                                        case 3:
                                        case 4:
                                            bArr4 = bArr;
                                            com.google.android.gms.internal.vision.zzhq zzhqVar = new com.google.android.gms.internal.vision.zzhq();
                                            iZzf = com.google.android.gms.internal.vision.zzez.zzb(bArr4, iZzb, zzhqVar, zzfbVar2);
                                            obj2 = zzhqVar;
                                            iZzb = iZzf;
                                            i25 = i25;
                                            i26 = i26;
                                            i2 = i2;
                                            bArr2 = bArr4;
                                            objZzb = obj2;
                                            objZzb = obj;
                                            zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                            break;
                                        case 5:
                                        case 6:
                                            bArr4 = bArr;
                                            com.google.android.gms.internal.vision.zzgu zzguVar = new com.google.android.gms.internal.vision.zzgu();
                                            iZzf = com.google.android.gms.internal.vision.zzez.zza(bArr4, iZzb, zzguVar, zzfbVar2);
                                            obj2 = zzguVar;
                                            iZzb = iZzf;
                                            i25 = i25;
                                            i26 = i26;
                                            i2 = i2;
                                            bArr2 = bArr4;
                                            objZzb = obj2;
                                            objZzb = obj;
                                            zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                            break;
                                        case 7:
                                        case 8:
                                            bArr4 = bArr;
                                            com.google.android.gms.internal.vision.zzhq zzhqVar2 = new com.google.android.gms.internal.vision.zzhq();
                                            iZzf = com.google.android.gms.internal.vision.zzez.zzd(bArr4, iZzb, zzhqVar2, zzfbVar2);
                                            obj2 = zzhqVar2;
                                            iZzb = iZzf;
                                            i25 = i25;
                                            i26 = i26;
                                            i2 = i2;
                                            bArr2 = bArr4;
                                            objZzb = obj2;
                                            objZzb = obj;
                                            zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                            break;
                                        case 9:
                                        case 10:
                                            bArr4 = bArr;
                                            com.google.android.gms.internal.vision.zzgu zzguVar2 = new com.google.android.gms.internal.vision.zzgu();
                                            iZzf = com.google.android.gms.internal.vision.zzez.zzc(bArr4, iZzb, zzguVar2, zzfbVar2);
                                            obj2 = zzguVar2;
                                            iZzb = iZzf;
                                            i25 = i25;
                                            i26 = i26;
                                            i2 = i2;
                                            bArr2 = bArr4;
                                            objZzb = obj2;
                                            objZzb = obj;
                                            zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                            break;
                                        case 11:
                                            bArr4 = bArr;
                                            com.google.android.gms.internal.vision.zzff zzffVar = new com.google.android.gms.internal.vision.zzff();
                                            iZzf = com.google.android.gms.internal.vision.zzez.zzg(bArr4, iZzb, zzffVar, zzfbVar2);
                                            obj2 = zzffVar;
                                            iZzb = iZzf;
                                            i25 = i25;
                                            i26 = i26;
                                            i2 = i2;
                                            bArr2 = bArr4;
                                            objZzb = obj2;
                                            objZzb = obj;
                                            zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                            break;
                                        case 12:
                                            bArr4 = bArr;
                                            com.google.android.gms.internal.vision.zzgu zzguVar3 = new com.google.android.gms.internal.vision.zzgu();
                                            iZzf = com.google.android.gms.internal.vision.zzez.zzh(bArr4, iZzb, zzguVar3, zzfbVar2);
                                            obj2 = zzguVar3;
                                            iZzb = iZzf;
                                            i25 = i25;
                                            i26 = i26;
                                            i2 = i2;
                                            bArr2 = bArr4;
                                            objZzb = obj2;
                                            objZzb = obj;
                                            zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                            break;
                                        case 13:
                                            bArr4 = bArr;
                                            com.google.android.gms.internal.vision.zzhq zzhqVar3 = new com.google.android.gms.internal.vision.zzhq();
                                            iZzf = com.google.android.gms.internal.vision.zzez.zzi(bArr4, iZzb, zzhqVar3, zzfbVar2);
                                            obj2 = zzhqVar3;
                                            iZzb = iZzf;
                                            i25 = i25;
                                            i26 = i26;
                                            i2 = i2;
                                            bArr2 = bArr4;
                                            objZzb = obj2;
                                            objZzb = obj;
                                            zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                            break;
                                        case 14:
                                            com.google.android.gms.internal.vision.zzgu zzguVar4 = new com.google.android.gms.internal.vision.zzgu();
                                            bArr3 = bArr;
                                            int iZza3 = com.google.android.gms.internal.vision.zzez.zza(bArr3, iZzb, zzguVar4, zzfbVar2);
                                            com.google.android.gms.internal.vision.zzjm zzjmVar = zzeVar.zzwd;
                                            if (zzjmVar == com.google.android.gms.internal.vision.zzjm.zzig()) {
                                                zzjmVar = null;
                                            }
                                            com.google.android.gms.internal.vision.zzjm zzjmVar2 = (com.google.android.gms.internal.vision.zzjm) com.google.android.gms.internal.vision.zzit.zza(i11, (java.util.List<java.lang.Integer>) zzguVar4, zzgVarZza.zzxb.zzwg, zzjmVar, (com.google.android.gms.internal.vision.zzjj<UT, com.google.android.gms.internal.vision.zzjm>) zzjjVar);
                                            if (zzjmVar2 != null) {
                                                zzeVar.zzwd = zzjmVar2;
                                            }
                                            zzgiVar.zza(zzgVarZza.zzxb, zzguVar4);
                                            iZzb = iZza3;
                                            i25 = i25;
                                            i26 = i26;
                                            i2 = i2;
                                            bArr2 = bArr3;
                                            break;
                                        default:
                                            java.lang.String strValueOf = java.lang.String.valueOf(zzgVarZza.zzxb.zzwh);
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 23);
                                            sb.append("Type cannot be packed: ");
                                            sb.append(strValueOf);
                                            throw new java.lang.IllegalStateException(sb.toString());
                                    }
                                } else {
                                    bArr3 = bArr;
                                    if (zzgVarZza.zzxb.zzwh == com.google.android.gms.internal.vision.zzka.zzabz) {
                                        iZzb = com.google.android.gms.internal.vision.zzez.zza(bArr3, iZzb, zzfbVar2);
                                        if (zzgVarZza.zzxb.zzwg.zzg(zzfbVar2.zzro) == null) {
                                            com.google.android.gms.internal.vision.zzjm zzjmVarZzih = zzeVar.zzwd;
                                            if (zzjmVarZzih == com.google.android.gms.internal.vision.zzjm.zzig()) {
                                                zzjmVarZzih = com.google.android.gms.internal.vision.zzjm.zzih();
                                                zzeVar.zzwd = zzjmVarZzih;
                                            }
                                            com.google.android.gms.internal.vision.zzit.zza(i11, zzfbVar2.zzro, zzjmVarZzih, (com.google.android.gms.internal.vision.zzjj<UT, com.google.android.gms.internal.vision.zzjm>) zzjjVar);
                                            i25 = i25;
                                            i26 = i26;
                                            i2 = i2;
                                            bArr2 = bArr3;
                                        } else {
                                            objValueOf = java.lang.Integer.valueOf(zzfbVar2.zzro);
                                            i2 = i2;
                                        }
                                    } else {
                                        switch (com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()]) {
                                            case 1:
                                                bArr2 = bArr3;
                                                objValueOf2 = java.lang.Double.valueOf(com.google.android.gms.internal.vision.zzez.zzc(bArr2, iZzb));
                                                iZzb += 8;
                                                obj = objValueOf2;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17 || i12 == 18) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 2:
                                                bArr2 = bArr3;
                                                objValueOf2 = java.lang.Float.valueOf(com.google.android.gms.internal.vision.zzez.zzd(bArr2, iZzb));
                                                iZzb += 4;
                                                obj = objValueOf2;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 3:
                                            case 4:
                                                i25 = i25;
                                                i26 = i26;
                                                i2 = i2;
                                                bArr2 = bArr3;
                                                iZzb = com.google.android.gms.internal.vision.zzez.zzb(bArr2, iZzb, zzfbVar2);
                                                objValueOf2 = java.lang.Long.valueOf(zzfbVar2.zzrp);
                                                obj = objValueOf2;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 5:
                                            case 6:
                                                i25 = i25;
                                                i26 = i26;
                                                i2 = i2;
                                                bArr2 = bArr3;
                                                iZzb = com.google.android.gms.internal.vision.zzez.zza(bArr2, iZzb, zzfbVar2);
                                                objValueOf2 = java.lang.Integer.valueOf(zzfbVar2.zzro);
                                                obj = objValueOf2;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 7:
                                            case 8:
                                                bArr2 = bArr3;
                                                objValueOf2 = java.lang.Long.valueOf(com.google.android.gms.internal.vision.zzez.zzb(bArr2, iZzb));
                                                iZzb += 8;
                                                obj = objValueOf2;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 9:
                                            case 10:
                                                bArr2 = bArr3;
                                                objValueOf2 = java.lang.Integer.valueOf(com.google.android.gms.internal.vision.zzez.zza(bArr2, iZzb));
                                                iZzb += 4;
                                                obj = objValueOf2;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 11:
                                                i25 = i25;
                                                i26 = i26;
                                                i2 = i2;
                                                bArr2 = bArr3;
                                                iZzb = com.google.android.gms.internal.vision.zzez.zzb(bArr2, iZzb, zzfbVar2);
                                                if (zzfbVar2.zzrp == 0) {
                                                    z = false;
                                                }
                                                objValueOf2 = java.lang.Boolean.valueOf(z);
                                                obj = objValueOf2;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 12:
                                                i25 = i25;
                                                i26 = i26;
                                                i2 = i2;
                                                bArr2 = bArr3;
                                                iZzb = com.google.android.gms.internal.vision.zzez.zza(bArr2, iZzb, zzfbVar2);
                                                objValueOf2 = java.lang.Integer.valueOf(com.google.android.gms.internal.vision.zzft.zzau(zzfbVar2.zzro));
                                                obj = objValueOf2;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 13:
                                                i25 = i25;
                                                i26 = i26;
                                                i2 = i2;
                                                bArr2 = bArr3;
                                                iZzb = com.google.android.gms.internal.vision.zzez.zzb(bArr2, iZzb, zzfbVar2);
                                                objValueOf2 = java.lang.Long.valueOf(com.google.android.gms.internal.vision.zzft.zzr(zzfbVar2.zzrp));
                                                obj = objValueOf2;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 14:
                                                throw new java.lang.IllegalStateException("Shouldn't reach here.");
                                            case 15:
                                                i25 = i25;
                                                i26 = i26;
                                                i2 = i2;
                                                bArr2 = bArr3;
                                                iZzb = com.google.android.gms.internal.vision.zzez.zze(bArr2, iZzb, zzfbVar2);
                                                obj = zzfbVar2.zzrq;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 16:
                                                i25 = i25;
                                                i26 = i26;
                                                i2 = i2;
                                                bArr2 = bArr3;
                                                iZzb = com.google.android.gms.internal.vision.zzez.zzc(bArr2, iZzb, zzfbVar2);
                                                obj = zzfbVar2.zzrq;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 17:
                                                i25 = i25;
                                                i2 = i2;
                                                i26 = i26;
                                                bArr2 = bArr3;
                                                iZzb = com.google.android.gms.internal.vision.zzez.zza(com.google.android.gms.internal.vision.zzin.zzho().zzf(zzgVarZza.zzxa.getClass()), bArr, iZzb, i2, (i11 << 3) | 4, zzfbVar);
                                                obj = zzfbVar2.zzrq;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                            case 18:
                                                iZzb = com.google.android.gms.internal.vision.zzez.zza(com.google.android.gms.internal.vision.zzin.zzho().zzf(zzgVarZza.zzxa.getClass()), bArr3, iZzb, i2, zzfbVar2);
                                                i2 = i2;
                                                objValueOf = zzfbVar2.zzrq;
                                                break;
                                            default:
                                                i25 = i25;
                                                i26 = i26;
                                                i2 = i2;
                                                bArr2 = bArr3;
                                                obj = objValueOf2;
                                                if (zzgVarZza.zzxb.zzwi) {
                                                    zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                                } else {
                                                    i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                                    if (i12 != 17) {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    } else {
                                                        objZzb = obj;
                                                        objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                                        objZzb = obj;
                                                        if (objZza != null) {
                                                            objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                                        }
                                                    }
                                                    objZzb = obj;
                                                    zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                                }
                                                break;
                                        }
                                    }
                                    bArr2 = bArr3;
                                    obj = objValueOf;
                                    if (zzgVarZza.zzxb.zzwi) {
                                        zzgiVar.zzb(zzgVarZza.zzxb, obj);
                                    } else {
                                        i12 = com.google.android.gms.internal.vision.zzfc.zzrr[zzgVarZza.zzxb.zzwh.ordinal()];
                                        if (i12 != 17) {
                                            objZzb = obj;
                                            objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                            objZzb = obj;
                                            if (objZza != null) {
                                                objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                            }
                                        } else {
                                            objZzb = obj;
                                            objZza = zzgiVar.zza(zzgVarZza.zzxb);
                                            objZzb = obj;
                                            if (objZza != null) {
                                                objZzb = com.google.android.gms.internal.vision.zzgt.zzb(objZza, obj);
                                            }
                                        }
                                        objZzb = obj;
                                        zzgiVar.zza(zzgVarZza.zzxb, objZzb);
                                    }
                                }
                                iZza2 = iZzb;
                                t2 = t3;
                            }
                        }
                        i20 = i2;
                        i24 = i9;
                        zzigVar2 = this;
                        zzfbVar3 = zzfbVar2;
                        i22 = i11;
                        i23 = i10;
                        unsafe2 = unsafe;
                        i25 = i25;
                        bArr7 = bArr2;
                        i21 = i3;
                        i26 = i26;
                    } else {
                        zzfbVar2 = zzfbVar;
                    }
                    i25 = i25;
                    i26 = i26;
                    i11 = i8;
                    bArr2 = bArr;
                    i2 = i2;
                    iZza2 = com.google.android.gms.internal.vision.zzez.zza(i9, bArr, iZzb, i2, zzs(t), zzfbVar);
                    t2 = t;
                    i20 = i2;
                    i24 = i9;
                    zzigVar2 = this;
                    zzfbVar3 = zzfbVar2;
                    i22 = i11;
                    i23 = i10;
                    unsafe2 = unsafe;
                    i25 = i25;
                    bArr7 = bArr2;
                    i21 = i3;
                    i26 = i26;
                } else {
                    zzigVar = this;
                    r14 = t;
                    iZza2 = iZzb;
                    i5 = i25;
                    i24 = i9;
                    i6 = -1;
                    i4 = i2;
                }
            } else {
                int i40 = i25;
                unsafe = unsafe2;
                i3 = i21;
                i4 = i20;
                zzigVar = zzigVar2;
                i5 = i40;
                i6 = -1;
                r14 = t2;
            }
        }
        if (i26 != i6) {
            unsafe.putInt((java.lang.Object) r14, i26, i5);
        }
        com.google.android.gms.internal.vision.zzjm zzjmVar3 = null;
        for (int i41 = zzigVar.zzze; i41 < zzigVar.zzzf; i41++) {
            zzjmVar3 = (com.google.android.gms.internal.vision.zzjm) zzigVar.zza((java.lang.Object) r14, zzigVar.zzzd[i41], zzjmVar3, (com.google.android.gms.internal.vision.zzjj<UT, com.google.android.gms.internal.vision.zzjm>) zzigVar.zzzi);
        }
        if (zzjmVar3 != null) {
            zzigVar.zzzi.zzg(r14, zzjmVar3);
        }
        if (i3 == 0) {
            if (iZza2 != i4) {
                throw com.google.android.gms.internal.vision.zzhc.zzgs();
            }
        } else if (iZza2 > i4 || i24 != i3) {
            throw com.google.android.gms.internal.vision.zzhc.zzgs();
        }
        return iZza2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:87:0x01a4  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022e, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e2, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020f, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0061. Please report as an issue. */
    @Override // com.google.android.gms.internal.vision.zzir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.vision.zzfb r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzig.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.zzfb):void");
    }

    @Override // com.google.android.gms.internal.vision.zzir
    public final void zzg(T t) {
        int i;
        int i2 = this.zzze;
        while (true) {
            i = this.zzzf;
            if (i2 >= i) {
                break;
            }
            long jZzbp = zzbp(this.zzzd[i2]) & 1048575;
            java.lang.Object objZzp = com.google.android.gms.internal.vision.zzjp.zzp(t, jZzbp);
            if (objZzp != null) {
                com.google.android.gms.internal.vision.zzjp.zza(t, jZzbp, this.zzzk.zzn(objZzp));
            }
            i2++;
        }
        int length = this.zzzd.length;
        while (i < length) {
            this.zzzh.zzb(t, this.zzzd[i]);
            i++;
        }
        this.zzzi.zzg(t);
        if (this.zzyz) {
            this.zzzj.zzg(t);
        }
    }

    private final <UT, UB> UB zza(java.lang.Object obj, int i, UB ub, com.google.android.gms.internal.vision.zzjj<UT, UB> zzjjVar) {
        com.google.android.gms.internal.vision.zzgy zzgyVarZzbo;
        int i2 = this.zzyu[i];
        java.lang.Object objZzp = com.google.android.gms.internal.vision.zzjp.zzp(obj, zzbp(i) & 1048575);
        return (objZzp == null || (zzgyVarZzbo = zzbo(i)) == null) ? ub : (UB) zza(i, i2, this.zzzk.zzk(objZzp), zzgyVarZzbo, ub, zzjjVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, java.util.Map<K, V> map, com.google.android.gms.internal.vision.zzgy zzgyVar, UB ub, com.google.android.gms.internal.vision.zzjj<UT, UB> zzjjVar) {
        com.google.android.gms.internal.vision.zzht<?, ?> zzhtVarZzp = this.zzzk.zzp(zzbn(i));
        java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (!zzgyVar.zzf(((java.lang.Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzjjVar.zzif();
                }
                com.google.android.gms.internal.vision.zzfp zzfpVarZzap = com.google.android.gms.internal.vision.zzfh.zzap(com.google.android.gms.internal.vision.zzhu.zza(zzhtVarZzp, next.getKey(), next.getValue()));
                try {
                    com.google.android.gms.internal.vision.zzhu.zza(zzfpVarZzap.zzew(), zzhtVarZzp, next.getKey(), next.getValue());
                    zzjjVar.zza(ub, i2, zzfpVarZzap.zzev());
                    it.remove();
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0 A[LOOP:2: B:57:0x00de->B:62:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.vision.zzir] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.vision.zzir] */
    @Override // com.google.android.gms.internal.vision.zzir
    public final boolean zzt(T t) {
        int i;
        java.util.List list;
        ?? Zzbm;
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= this.zzze) {
                return !this.zzyz || this.zzzj.zze(t).isInitialized();
            }
            int i6 = this.zzzd[i4];
            int i7 = this.zzyu[i6];
            int iZzbp = zzbp(i6);
            if (this.zzzb) {
                i = 0;
            } else {
                int i8 = this.zzyu[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = zzyt.getInt(t, i9);
                    i3 = i9;
                }
            }
            if (((268435456 & iZzbp) != 0) && !zza(t, i6, i5, i)) {
                return false;
            }
            int i10 = (267386880 & iZzbp) >>> 20;
            if (i10 == 9 || i10 == 17) {
                if (zza(t, i6, i5, i) && !zza(t, iZzbp, zzbm(i6))) {
                    return false;
                }
            } else if (i10 == 27) {
                list = (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575);
                if (!list.isEmpty()) {
                    Zzbm = zzbm(i6);
                    for (i2 = 0; i2 < list.size(); i2++) {
                        if (!Zzbm.zzt(list.get(i2))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i10 == 60 || i10 == 68) {
                if (zza(t, i7, i6) && !zza(t, iZzbp, zzbm(i6))) {
                    return false;
                }
            } else if (i10 == 49) {
                list = (java.util.List) com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575);
                if (!list.isEmpty()) {
                    Zzbm = zzbm(i6);
                    while (i2 < list.size()) {
                        if (!Zzbm.zzt(list.get(i2))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i10 != 50) {
                continue;
            } else {
                java.util.Map<?, ?> mapZzl = this.zzzk.zzl(com.google.android.gms.internal.vision.zzjp.zzp(t, iZzbp & 1048575));
                if (!mapZzl.isEmpty()) {
                    if (this.zzzk.zzp(zzbn(i6)).zzyo.zzip() == com.google.android.gms.internal.vision.zzkd.MESSAGE) {
                        ?? Zzf = 0;
                        for (java.lang.Object obj : mapZzl.values()) {
                            if (Zzf == 0) {
                                Zzf = Zzf;
                                Zzf = com.google.android.gms.internal.vision.zzin.zzho().zzf(obj.getClass());
                            }
                            Zzf = Zzf;
                            if (!Zzf.zzt(obj)) {
                                z = false;
                                break;
                            }
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i4++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(java.lang.Object obj, int i, com.google.android.gms.internal.vision.zzir zzirVar) {
        return zzirVar.zzt(com.google.android.gms.internal.vision.zzjp.zzp(obj, i & 1048575));
    }

    private static void zza(int i, java.lang.Object obj, com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zzkgVar.zza(i, (java.lang.String) obj);
        } else {
            zzkgVar.zza(i, (com.google.android.gms.internal.vision.zzfh) obj);
        }
    }

    private final void zza(java.lang.Object obj, int i, com.google.android.gms.internal.vision.zzis zzisVar) throws java.io.IOException {
        if (zzbr(i)) {
            com.google.android.gms.internal.vision.zzjp.zza(obj, i & 1048575, zzisVar.zzec());
        } else if (this.zzza) {
            com.google.android.gms.internal.vision.zzjp.zza(obj, i & 1048575, zzisVar.readString());
        } else {
            com.google.android.gms.internal.vision.zzjp.zza(obj, i & 1048575, zzisVar.zzed());
        }
    }

    private final int zzbp(int i) {
        return this.zzyu[i + 1];
    }

    private final int zzbq(int i) {
        return this.zzyu[i + 2];
    }

    private static <T> double zzf(T t, long j) {
        return ((java.lang.Double) com.google.android.gms.internal.vision.zzjp.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((java.lang.Float) com.google.android.gms.internal.vision.zzjp.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.vision.zzjp.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.vision.zzjp.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((java.lang.Boolean) com.google.android.gms.internal.vision.zzjp.zzp(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzzb) {
            return zza(t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzzb) {
            int iZzbp = zzbp(i);
            long j = iZzbp & 1048575;
            switch ((iZzbp & 267386880) >>> 20) {
                case 0:
                    return com.google.android.gms.internal.vision.zzjp.zzo(t, j) != 0.0d;
                case 1:
                    return com.google.android.gms.internal.vision.zzjp.zzn(t, j) != 0.0f;
                case 2:
                    return com.google.android.gms.internal.vision.zzjp.zzl(t, j) != 0;
                case 3:
                    return com.google.android.gms.internal.vision.zzjp.zzl(t, j) != 0;
                case 4:
                    return com.google.android.gms.internal.vision.zzjp.zzk(t, j) != 0;
                case 5:
                    return com.google.android.gms.internal.vision.zzjp.zzl(t, j) != 0;
                case 6:
                    return com.google.android.gms.internal.vision.zzjp.zzk(t, j) != 0;
                case 7:
                    return com.google.android.gms.internal.vision.zzjp.zzm(t, j);
                case 8:
                    java.lang.Object objZzp = com.google.android.gms.internal.vision.zzjp.zzp(t, j);
                    if (objZzp instanceof java.lang.String) {
                        return !((java.lang.String) objZzp).isEmpty();
                    }
                    if (objZzp instanceof com.google.android.gms.internal.vision.zzfh) {
                        return !com.google.android.gms.internal.vision.zzfh.zzrx.equals(objZzp);
                    }
                    throw new java.lang.IllegalArgumentException();
                case 9:
                    return com.google.android.gms.internal.vision.zzjp.zzp(t, j) != null;
                case 10:
                    return !com.google.android.gms.internal.vision.zzfh.zzrx.equals(com.google.android.gms.internal.vision.zzjp.zzp(t, j));
                case 11:
                    return com.google.android.gms.internal.vision.zzjp.zzk(t, j) != 0;
                case 12:
                    return com.google.android.gms.internal.vision.zzjp.zzk(t, j) != 0;
                case 13:
                    return com.google.android.gms.internal.vision.zzjp.zzk(t, j) != 0;
                case 14:
                    return com.google.android.gms.internal.vision.zzjp.zzl(t, j) != 0;
                case 15:
                    return com.google.android.gms.internal.vision.zzjp.zzk(t, j) != 0;
                case 16:
                    return com.google.android.gms.internal.vision.zzjp.zzl(t, j) != 0;
                case 17:
                    return com.google.android.gms.internal.vision.zzjp.zzp(t, j) != null;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        int iZzbq = zzbq(i);
        return (com.google.android.gms.internal.vision.zzjp.zzk(t, (long) (iZzbq & 1048575)) & (1 << (iZzbq >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zzzb) {
            return;
        }
        int iZzbq = zzbq(i);
        long j = iZzbq & 1048575;
        com.google.android.gms.internal.vision.zzjp.zzb(t, j, com.google.android.gms.internal.vision.zzjp.zzk(t, j) | (1 << (iZzbq >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return com.google.android.gms.internal.vision.zzjp.zzk(t, (long) (zzbq(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        com.google.android.gms.internal.vision.zzjp.zzb(t, zzbq(i2) & 1048575, i);
    }

    private final int zzbs(int i) {
        if (i < this.zzyw || i > this.zzyx) {
            return -1;
        }
        return zzu(i, 0);
    }

    private final int zzt(int i, int i2) {
        if (i < this.zzyw || i > this.zzyx) {
            return -1;
        }
        return zzu(i, i2);
    }

    private final int zzu(int i, int i2) {
        int length = (this.zzyu.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzyu[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
