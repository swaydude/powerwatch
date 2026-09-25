package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhs<T> implements com.google.android.gms.internal.fitness.zzic<T> {
    private static final int[] zzxq = new int[0];
    private static final sun.misc.Unsafe zzxr = com.google.android.gms.internal.fitness.zzja.zzdh();
    private final com.google.android.gms.internal.fitness.zzho zzxm;
    private final com.google.android.gms.internal.fitness.zziu<?, ?> zzxn;
    private final boolean zzxo;
    private final com.google.android.gms.internal.fitness.zzfw<?> zzxp;
    private final int[] zzxs;
    private final java.lang.Object[] zzxt;
    private final int zzxu;
    private final int zzxv;
    private final boolean zzxw;
    private final boolean zzxx;
    private final boolean zzxy;
    private final int[] zzxz;
    private final int zzya;
    private final int zzyb;
    private final com.google.android.gms.internal.fitness.zzht zzyc;
    private final com.google.android.gms.internal.fitness.zzgy zzyd;
    private final com.google.android.gms.internal.fitness.zzhh zzye;

    private zzhs(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.fitness.zzho zzhoVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, com.google.android.gms.internal.fitness.zzht zzhtVar, com.google.android.gms.internal.fitness.zzgy zzgyVar, com.google.android.gms.internal.fitness.zziu<?, ?> zziuVar, com.google.android.gms.internal.fitness.zzfw<?> zzfwVar, com.google.android.gms.internal.fitness.zzhh zzhhVar) {
        this.zzxs = iArr;
        this.zzxt = objArr;
        this.zzxu = i;
        this.zzxv = i2;
        this.zzxw = zzhoVar instanceof com.google.android.gms.internal.fitness.zzgg;
        this.zzxx = z;
        this.zzxo = zzfwVar != null && zzfwVar.zze(zzhoVar);
        this.zzxy = false;
        this.zzxz = iArr2;
        this.zzya = i3;
        this.zzyb = i4;
        this.zzyc = zzhtVar;
        this.zzyd = zzgyVar;
        this.zzxn = zziuVar;
        this.zzxp = zzfwVar;
        this.zzxm = zzhoVar;
        this.zzye = zzhhVar;
    }

    static <T> com.google.android.gms.internal.fitness.zzhs<T> zza(java.lang.Class<T> cls, com.google.android.gms.internal.fitness.zzhm zzhmVar, com.google.android.gms.internal.fitness.zzht zzhtVar, com.google.android.gms.internal.fitness.zzgy zzgyVar, com.google.android.gms.internal.fitness.zziu<?, ?> zziuVar, com.google.android.gms.internal.fitness.zzfw<?> zzfwVar, com.google.android.gms.internal.fitness.zzhh zzhhVar) {
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
        com.google.android.gms.internal.fitness.zzhz zzhzVar;
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
        if (zzhmVar instanceof com.google.android.gms.internal.fitness.zzhz) {
            com.google.android.gms.internal.fitness.zzhz zzhzVar2 = (com.google.android.gms.internal.fitness.zzhz) zzhmVar;
            int i27 = 0;
            boolean z2 = zzhzVar2.zzch() == com.google.android.gms.internal.fitness.zzgg.zze.zzvu;
            java.lang.String strZzcn = zzhzVar2.zzcn();
            int length = strZzcn.length();
            int iCharAt3 = strZzcn.charAt(0);
            if (iCharAt3 >= 55296) {
                int i28 = iCharAt3 & 8191;
                int i29 = 1;
                int i30 = 13;
                while (true) {
                    i = i29 + 1;
                    cCharAt14 = strZzcn.charAt(i29);
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
            int iCharAt4 = strZzcn.charAt(i);
            if (iCharAt4 >= 55296) {
                int i32 = iCharAt4 & 8191;
                int i33 = 13;
                while (true) {
                    i26 = i31 + 1;
                    cCharAt13 = strZzcn.charAt(i31);
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
                iArr = zzxq;
                i6 = 0;
                i3 = 0;
                iCharAt = 0;
                i4 = 0;
                iCharAt2 = 0;
                i5 = 0;
            } else {
                int i34 = i31 + 1;
                int iCharAt5 = strZzcn.charAt(i31);
                if (iCharAt5 >= 55296) {
                    int i35 = iCharAt5 & 8191;
                    int i36 = 13;
                    while (true) {
                        i14 = i34 + 1;
                        cCharAt8 = strZzcn.charAt(i34);
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
                int iCharAt6 = strZzcn.charAt(i34);
                if (iCharAt6 >= 55296) {
                    int i38 = iCharAt6 & 8191;
                    int i39 = 13;
                    while (true) {
                        i13 = i37 + 1;
                        cCharAt7 = strZzcn.charAt(i37);
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
                iCharAt = strZzcn.charAt(i37);
                if (iCharAt >= 55296) {
                    int i41 = iCharAt & 8191;
                    int i42 = 13;
                    while (true) {
                        i12 = i40 + 1;
                        cCharAt6 = strZzcn.charAt(i40);
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
                int iCharAt7 = strZzcn.charAt(i40);
                if (iCharAt7 >= 55296) {
                    int i44 = iCharAt7 & 8191;
                    int i45 = 13;
                    while (true) {
                        i11 = i43 + 1;
                        cCharAt5 = strZzcn.charAt(i43);
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
                iCharAt2 = strZzcn.charAt(i43);
                if (iCharAt2 >= 55296) {
                    int i47 = iCharAt2 & 8191;
                    int i48 = 13;
                    while (true) {
                        i10 = i46 + 1;
                        cCharAt4 = strZzcn.charAt(i46);
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
                int iCharAt8 = strZzcn.charAt(i46);
                if (iCharAt8 >= 55296) {
                    int i50 = iCharAt8 & 8191;
                    int i51 = 13;
                    while (true) {
                        i9 = i49 + 1;
                        cCharAt3 = strZzcn.charAt(i49);
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
                int iCharAt9 = strZzcn.charAt(i49);
                if (iCharAt9 >= 55296) {
                    int i53 = iCharAt9 & 8191;
                    int i54 = i52;
                    int i55 = 13;
                    while (true) {
                        i8 = i54 + 1;
                        cCharAt2 = strZzcn.charAt(i54);
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
                int iCharAt10 = strZzcn.charAt(i2);
                if (iCharAt10 >= 55296) {
                    int i57 = iCharAt10 & 8191;
                    int i58 = i56;
                    int i59 = 13;
                    while (true) {
                        i7 = i58 + 1;
                        cCharAt = strZzcn.charAt(i58);
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
            sun.misc.Unsafe unsafe = zzxr;
            java.lang.Object[] objArrZzco = zzhzVar2.zzco();
            java.lang.Class<?> cls2 = zzhzVar2.zzcj().getClass();
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
                int iCharAt11 = strZzcn.charAt(i65);
                int i70 = length;
                if (iCharAt11 >= 55296) {
                    int i71 = iCharAt11 & 8191;
                    int i72 = i69;
                    int i73 = 13;
                    while (true) {
                        i25 = i72 + 1;
                        cCharAt12 = strZzcn.charAt(i72);
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
                int iCharAt12 = strZzcn.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i24 = i76 + 1;
                        cCharAt11 = strZzcn.charAt(i76);
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
                    int iCharAt13 = strZzcn.charAt(i17);
                    char c = 55296;
                    if (iCharAt13 >= 55296) {
                        int i82 = iCharAt13 & 8191;
                        int i83 = 13;
                        while (true) {
                            i23 = i81 + 1;
                            cCharAt10 = strZzcn.charAt(i81);
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
                        objArr[((i68 / 3) << 1) + 1] = objArrZzco[i4];
                        i4++;
                    } else if (i84 == 12 && (iCharAt3 & 1) == 1) {
                        objArr[((i68 / 3) << 1) + 1] = objArrZzco[i4];
                        i4++;
                    }
                    int i86 = iCharAt13 << 1;
                    java.lang.Object obj = objArrZzco[i86];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldZza2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldZza2 = zza(cls2, (java.lang.String) obj);
                        objArrZzco[i86] = fieldZza2;
                    }
                    zzhzVar = zzhzVar2;
                    java.lang.String str2 = strZzcn;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza2);
                    int i87 = i86 + 1;
                    java.lang.Object obj2 = objArrZzco[i87];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldZza3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldZza3 = zza(cls2, (java.lang.String) obj2);
                        objArrZzco[i87] = fieldZza3;
                    }
                    cls2 = cls2;
                    i18 = i4;
                    i17 = i85;
                    str = str2;
                    i20 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                    i27 = i27;
                } else {
                    zzhzVar = zzhzVar2;
                    java.lang.String str3 = strZzcn;
                    i18 = i4 + 1;
                    java.lang.reflect.Field fieldZza4 = zza(cls2, (java.lang.String) objArrZzco[i4]);
                    if (i78 == 9 || i78 == 17) {
                        i19 = 1;
                        objArr[((i68 / 3) << 1) + 1] = fieldZza4.getType();
                    } else {
                        if (i78 == 27 || i78 == 49) {
                            i19 = 1;
                            i22 = i18 + 1;
                            objArr[((i68 / 3) << 1) + 1] = objArrZzco[i18];
                        } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                            i19 = 1;
                            if ((iCharAt3 & 1) == 1) {
                                i22 = i18 + 1;
                                objArr[((i68 / 3) << 1) + 1] = objArrZzco[i18];
                            }
                        } else if (i78 == 50) {
                            int i88 = i64 + 1;
                            iArr[i64] = i68;
                            int i89 = (i68 / 3) << 1;
                            int i90 = i18 + 1;
                            objArr[i89] = objArrZzco[i18];
                            if ((iCharAt12 & 2048) != 0) {
                                i18 = i90 + 1;
                                objArr[i89 + 1] = objArrZzco[i90];
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
                        java.lang.Object obj3 = objArrZzco[i94];
                        if (obj3 instanceof java.lang.reflect.Field) {
                            fieldZza = (java.lang.reflect.Field) obj3;
                        } else {
                            fieldZza = zza(cls2, (java.lang.String) obj3);
                            objArrZzco[i94] = fieldZza;
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
                strZzcn = str;
                i65 = i17;
                cls2 = cls2;
                i3 = i79;
                length = i70;
                i5 = i15;
                z2 = z;
                iCharAt = i80;
                i4 = i18;
                zzhzVar2 = zzhzVar;
            }
            return new com.google.android.gms.internal.fitness.zzhs<>(iArr3, objArr, iCharAt, i3, zzhzVar2.zzcj(), z2, false, iArr, i5, i63, zzhtVar, zzgyVar, zziuVar, zzfwVar, zzhhVar);
        }
        ((com.google.android.gms.internal.fitness.zzin) zzhmVar).zzch();
        int i97 = com.google.android.gms.internal.fitness.zzgg.zze.zzvu;
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

    /* JADX WARN: Code duplicated, block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.fitness.zzic
    public final boolean equals(T t, T t2) {
        int length = this.zzxs.length;
        int i = 0;
        while (true) {
            boolean zZze = true;
            if (i < length) {
                int iZzag = zzag(i);
                long j = iZzag & 1048575;
                switch ((iZzag & 267386880) >>> 20) {
                    case 0:
                        if (!zzc(t, t2, i) || java.lang.Double.doubleToLongBits(com.google.android.gms.internal.fitness.zzja.zzn(t, j)) != java.lang.Double.doubleToLongBits(com.google.android.gms.internal.fitness.zzja.zzn(t2, j))) {
                            zZze = false;
                        }
                        break;
                    case 1:
                        if (!zzc(t, t2, i) || java.lang.Float.floatToIntBits(com.google.android.gms.internal.fitness.zzja.zzm(t, j)) != java.lang.Float.floatToIntBits(com.google.android.gms.internal.fitness.zzja.zzm(t2, j))) {
                            zZze = false;
                        }
                        break;
                    case 2:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzk(t, j) != com.google.android.gms.internal.fitness.zzja.zzk(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 3:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzk(t, j) != com.google.android.gms.internal.fitness.zzja.zzk(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 4:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzj(t, j) != com.google.android.gms.internal.fitness.zzja.zzj(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 5:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzk(t, j) != com.google.android.gms.internal.fitness.zzja.zzk(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 6:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzj(t, j) != com.google.android.gms.internal.fitness.zzja.zzj(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 7:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzl(t, j) != com.google.android.gms.internal.fitness.zzja.zzl(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 8:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.fitness.zzie.zze(com.google.android.gms.internal.fitness.zzja.zzo(t, j), com.google.android.gms.internal.fitness.zzja.zzo(t2, j))) {
                            zZze = false;
                        }
                        break;
                    case 9:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.fitness.zzie.zze(com.google.android.gms.internal.fitness.zzja.zzo(t, j), com.google.android.gms.internal.fitness.zzja.zzo(t2, j))) {
                            zZze = false;
                        }
                        break;
                    case 10:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.fitness.zzie.zze(com.google.android.gms.internal.fitness.zzja.zzo(t, j), com.google.android.gms.internal.fitness.zzja.zzo(t2, j))) {
                            zZze = false;
                        }
                        break;
                    case 11:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzj(t, j) != com.google.android.gms.internal.fitness.zzja.zzj(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 12:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzj(t, j) != com.google.android.gms.internal.fitness.zzja.zzj(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 13:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzj(t, j) != com.google.android.gms.internal.fitness.zzja.zzj(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 14:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzk(t, j) != com.google.android.gms.internal.fitness.zzja.zzk(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 15:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzj(t, j) != com.google.android.gms.internal.fitness.zzja.zzj(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 16:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.fitness.zzja.zzk(t, j) != com.google.android.gms.internal.fitness.zzja.zzk(t2, j)) {
                            zZze = false;
                        }
                        break;
                    case 17:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.fitness.zzie.zze(com.google.android.gms.internal.fitness.zzja.zzo(t, j), com.google.android.gms.internal.fitness.zzja.zzo(t2, j))) {
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
                        zZze = com.google.android.gms.internal.fitness.zzie.zze(com.google.android.gms.internal.fitness.zzja.zzo(t, j), com.google.android.gms.internal.fitness.zzja.zzo(t2, j));
                        break;
                    case 50:
                        zZze = com.google.android.gms.internal.fitness.zzie.zze(com.google.android.gms.internal.fitness.zzja.zzo(t, j), com.google.android.gms.internal.fitness.zzja.zzo(t2, j));
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
                        if (com.google.android.gms.internal.fitness.zzja.zzj(t, jZzah) != com.google.android.gms.internal.fitness.zzja.zzj(t2, jZzah) || !com.google.android.gms.internal.fitness.zzie.zze(com.google.android.gms.internal.fitness.zzja.zzo(t, j), com.google.android.gms.internal.fitness.zzja.zzo(t2, j))) {
                            zZze = false;
                        }
                        break;
                }
                if (!zZze) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzxn.zzm(t).equals(this.zzxn.zzm(t2))) {
                    return false;
                }
                if (this.zzxo) {
                    return this.zzxp.zza(t).equals(this.zzxp.zza(t2));
                }
                return true;
            }
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzic
    public final int hashCode(T t) {
        int i;
        int iZzj;
        int length = this.zzxs.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzag = zzag(i3);
            int i4 = this.zzxs[i3];
            long j = 1048575 & iZzag;
            int iHashCode = 37;
            switch ((iZzag & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(java.lang.Double.doubleToLongBits(com.google.android.gms.internal.fitness.zzja.zzn(t, j)));
                    i2 = i + iZzj;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzj = java.lang.Float.floatToIntBits(com.google.android.gms.internal.fitness.zzja.zzm(t, j));
                    i2 = i + iZzj;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(com.google.android.gms.internal.fitness.zzja.zzk(t, j));
                    i2 = i + iZzj;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(com.google.android.gms.internal.fitness.zzja.zzk(t, j));
                    i2 = i + iZzj;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzja.zzj(t, j);
                    i2 = i + iZzj;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(com.google.android.gms.internal.fitness.zzja.zzk(t, j));
                    i2 = i + iZzj;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzja.zzj(t, j);
                    i2 = i + iZzj;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzgk.zzc(com.google.android.gms.internal.fitness.zzja.zzl(t, j));
                    i2 = i + iZzj;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzj = ((java.lang.String) com.google.android.gms.internal.fitness.zzja.zzo(t, j)).hashCode();
                    i2 = i + iZzj;
                    break;
                case 9:
                    java.lang.Object objZzo = com.google.android.gms.internal.fitness.zzja.zzo(t, j);
                    if (objZzo != null) {
                        iHashCode = objZzo.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzja.zzo(t, j).hashCode();
                    i2 = i + iZzj;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzja.zzj(t, j);
                    i2 = i + iZzj;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzja.zzj(t, j);
                    i2 = i + iZzj;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzja.zzj(t, j);
                    i2 = i + iZzj;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(com.google.android.gms.internal.fitness.zzja.zzk(t, j));
                    i2 = i + iZzj;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzja.zzj(t, j);
                    i2 = i + iZzj;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(com.google.android.gms.internal.fitness.zzja.zzk(t, j));
                    i2 = i + iZzj;
                    break;
                case 17:
                    java.lang.Object objZzo2 = com.google.android.gms.internal.fitness.zzja.zzo(t, j);
                    if (objZzo2 != null) {
                        iHashCode = objZzo2.hashCode();
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
                    iZzj = com.google.android.gms.internal.fitness.zzja.zzo(t, j).hashCode();
                    i2 = i + iZzj;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzj = com.google.android.gms.internal.fitness.zzja.zzo(t, j).hashCode();
                    i2 = i + iZzj;
                    break;
                case 51:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(java.lang.Double.doubleToLongBits(zze(t, j)));
                        i2 = i + iZzj;
                    }
                    break;
                case 52:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = java.lang.Float.floatToIntBits(zzf(t, j));
                        i2 = i + iZzj;
                    }
                    break;
                case 53:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(zzh(t, j));
                        i2 = i + iZzj;
                    }
                    break;
                case 54:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(zzh(t, j));
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
                        iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(zzh(t, j));
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
                        iZzj = com.google.android.gms.internal.fitness.zzgk.zzc(zzi(t, j));
                        i2 = i + iZzj;
                    }
                    break;
                case 59:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = ((java.lang.String) com.google.android.gms.internal.fitness.zzja.zzo(t, j)).hashCode();
                        i2 = i + iZzj;
                    }
                    break;
                case 60:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = com.google.android.gms.internal.fitness.zzja.zzo(t, j).hashCode();
                        i2 = i + iZzj;
                    }
                    break;
                case 61:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = com.google.android.gms.internal.fitness.zzja.zzo(t, j).hashCode();
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
                        iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(zzh(t, j));
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
                        iZzj = com.google.android.gms.internal.fitness.zzgk.zzj(zzh(t, j));
                        i2 = i + iZzj;
                    }
                    break;
                case 68:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZzj = com.google.android.gms.internal.fitness.zzja.zzo(t, j).hashCode();
                        i2 = i + iZzj;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzxn.zzm(t).hashCode();
        return this.zzxo ? (iHashCode2 * 53) + this.zzxp.zza(t).hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.fitness.zzic
    public final void zzd(T t, T t2) {
        java.util.Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzxs.length; i += 3) {
            int iZzag = zzag(i);
            long j = 1048575 & iZzag;
            int i2 = this.zzxs[i];
            switch ((iZzag & 267386880) >>> 20) {
                case 0:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza(t, j, com.google.android.gms.internal.fitness.zzja.zzn(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 1:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzm(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 2:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 3:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 4:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 5:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 6:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 7:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza(t, j, com.google.android.gms.internal.fitness.zzja.zzl(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 8:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza(t, j, com.google.android.gms.internal.fitness.zzja.zzo(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza(t, j, com.google.android.gms.internal.fitness.zzja.zzo(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 11:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 12:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 13:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 14:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzk(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 15:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzj(t2, j));
                        zzb(t, i);
                    }
                    break;
                case 16:
                    if (zza(t2, i)) {
                        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzk(t2, j));
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
                    this.zzyd.zza(t, t2, j);
                    break;
                case 50:
                    com.google.android.gms.internal.fitness.zzie.zza(this.zzye, t, t2, j);
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
                        com.google.android.gms.internal.fitness.zzja.zza(t, j, com.google.android.gms.internal.fitness.zzja.zzo(t2, j));
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
                        com.google.android.gms.internal.fitness.zzja.zza(t, j, com.google.android.gms.internal.fitness.zzja.zzo(t2, j));
                        zzb(t, i2, i);
                    }
                    break;
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzxx) {
            return;
        }
        com.google.android.gms.internal.fitness.zzie.zza(this.zzxn, t, t2);
        if (this.zzxo) {
            com.google.android.gms.internal.fitness.zzie.zza(this.zzxp, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long jZzag = zzag(i) & 1048575;
        if (zza(t2, i)) {
            java.lang.Object objZzo = com.google.android.gms.internal.fitness.zzja.zzo(t, jZzag);
            java.lang.Object objZzo2 = com.google.android.gms.internal.fitness.zzja.zzo(t2, jZzag);
            if (objZzo != null && objZzo2 != null) {
                com.google.android.gms.internal.fitness.zzja.zza(t, jZzag, com.google.android.gms.internal.fitness.zzgk.zzb(objZzo, objZzo2));
                zzb(t, i);
            } else if (objZzo2 != null) {
                com.google.android.gms.internal.fitness.zzja.zza(t, jZzag, objZzo2);
                zzb(t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int iZzag = zzag(i);
        int i2 = this.zzxs[i];
        long j = iZzag & 1048575;
        if (zza(t2, i2, i)) {
            java.lang.Object objZzo = com.google.android.gms.internal.fitness.zzja.zzo(t, j);
            java.lang.Object objZzo2 = com.google.android.gms.internal.fitness.zzja.zzo(t2, j);
            if (objZzo != null && objZzo2 != null) {
                com.google.android.gms.internal.fitness.zzja.zza(t, j, com.google.android.gms.internal.fitness.zzgk.zzb(objZzo, objZzo2));
                zzb(t, i2, i);
            } else if (objZzo2 != null) {
                com.google.android.gms.internal.fitness.zzja.zza(t, j, objZzo2);
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
    @Override // com.google.android.gms.internal.fitness.zzic
    public final int zzk(T t) {
        int i;
        int i2;
        long j;
        int iZzd;
        int iZzb;
        int iZzk;
        int iZzv;
        int iZzj;
        int iZzp;
        int iZzr;
        int iZzb2;
        int iZzj2;
        int iZzp2;
        int iZzr2;
        int i3 = 267386880;
        int i4 = 1;
        if (this.zzxx) {
            sun.misc.Unsafe unsafe = zzxr;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zzxs.length) {
                int iZzag = zzag(i5);
                int i7 = (iZzag & i3) >>> 20;
                int i8 = this.zzxs[i5];
                long j2 = iZzag & 1048575;
                int i9 = (i7 < com.google.android.gms.internal.fitness.zzgc.DOUBLE_LIST_PACKED.id() || i7 > com.google.android.gms.internal.fitness.zzgc.SINT64_LIST_PACKED.id()) ? 0 : this.zzxs[i5 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzb(i8, 0.0d);
                            i6 += iZzb2;
                        }
                        break;
                    case 1:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzb(i8, 0.0f);
                            i6 += iZzb2;
                        }
                        break;
                    case 2:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzd(i8, com.google.android.gms.internal.fitness.zzja.zzk(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 3:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zze(i8, com.google.android.gms.internal.fitness.zzja.zzk(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 4:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzg(i8, com.google.android.gms.internal.fitness.zzja.zzj(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 5:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzg(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 6:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzj(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 7:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzb(i8, true);
                            i6 += iZzb2;
                        }
                        break;
                    case 8:
                        if (zza(t, i5)) {
                            java.lang.Object objZzo = com.google.android.gms.internal.fitness.zzja.zzo(t, j2);
                            if (objZzo instanceof com.google.android.gms.internal.fitness.zzff) {
                                iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzc(i8, (com.google.android.gms.internal.fitness.zzff) objZzo);
                            } else {
                                iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzb(i8, (java.lang.String) objZzo);
                            }
                            i6 += iZzb2;
                        }
                        break;
                    case 9:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzie.zzc(i8, com.google.android.gms.internal.fitness.zzja.zzo(t, j2), zzae(i5));
                            i6 += iZzb2;
                        }
                        break;
                    case 10:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzc(i8, (com.google.android.gms.internal.fitness.zzff) com.google.android.gms.internal.fitness.zzja.zzo(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 11:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzh(i8, com.google.android.gms.internal.fitness.zzja.zzj(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 12:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzl(i8, com.google.android.gms.internal.fitness.zzja.zzj(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 13:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzk(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 14:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzh(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 15:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzi(i8, com.google.android.gms.internal.fitness.zzja.zzj(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 16:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzf(i8, com.google.android.gms.internal.fitness.zzja.zzk(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 17:
                        if (zza(t, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzc(i8, (com.google.android.gms.internal.fitness.zzho) com.google.android.gms.internal.fitness.zzja.zzo(t, j2), zzae(i5));
                            i6 += iZzb2;
                        }
                        break;
                    case 18:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzw(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 19:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzv(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 20:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzo(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 21:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzp(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 22:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzs(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 23:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzw(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 24:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzv(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 25:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzx(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 26:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzc(i8, zzd(t, j2));
                        i6 += iZzb2;
                        break;
                    case 27:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzc(i8, zzd(t, j2), zzae(i5));
                        i6 += iZzb2;
                        break;
                    case 28:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzd(i8, zzd(t, j2));
                        i6 += iZzb2;
                        break;
                    case 29:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzt(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 30:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzr(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 31:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzv(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 32:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzw(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 33:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzu(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 34:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzq(i8, zzd(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 35:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzj((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 36:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 37:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzb((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 38:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzc((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 39:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzf((java.util.List<java.lang.Integer>) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 40:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzj((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 41:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 42:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzk((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 43:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzg((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 44:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zze((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 45:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 46:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzj((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 47:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzh((java.util.List) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 48:
                        iZzj2 = com.google.android.gms.internal.fitness.zzie.zzd((java.util.List<java.lang.Long>) unsafe.getObject(t, j2));
                        if (iZzj2 > 0) {
                            if (this.zzxy) {
                                unsafe.putInt(t, i9, iZzj2);
                            }
                            iZzp2 = com.google.android.gms.internal.fitness.zzfs.zzp(i8);
                            iZzr2 = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj2);
                            iZzb2 = iZzp2 + iZzr2 + iZzj2;
                            i6 += iZzb2;
                        }
                        break;
                    case 49:
                        iZzb2 = com.google.android.gms.internal.fitness.zzie.zzd(i8, zzd(t, j2), zzae(i5));
                        i6 += iZzb2;
                        break;
                    case 50:
                        iZzb2 = this.zzye.zzb(i8, com.google.android.gms.internal.fitness.zzja.zzo(t, j2), zzaf(i5));
                        i6 += iZzb2;
                        break;
                    case 51:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzb(i8, 0.0d);
                            i6 += iZzb2;
                        }
                        break;
                    case 52:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzb(i8, 0.0f);
                            i6 += iZzb2;
                        }
                        break;
                    case 53:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzd(i8, zzh(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 54:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zze(i8, zzh(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 55:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzg(i8, zzg(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 56:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzg(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 57:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzj(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 58:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzb(i8, true);
                            i6 += iZzb2;
                        }
                        break;
                    case 59:
                        if (zza(t, i8, i5)) {
                            java.lang.Object objZzo2 = com.google.android.gms.internal.fitness.zzja.zzo(t, j2);
                            if (objZzo2 instanceof com.google.android.gms.internal.fitness.zzff) {
                                iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzc(i8, (com.google.android.gms.internal.fitness.zzff) objZzo2);
                            } else {
                                iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzb(i8, (java.lang.String) objZzo2);
                            }
                            i6 += iZzb2;
                        }
                        break;
                    case 60:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzie.zzc(i8, com.google.android.gms.internal.fitness.zzja.zzo(t, j2), zzae(i5));
                            i6 += iZzb2;
                        }
                        break;
                    case 61:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzc(i8, (com.google.android.gms.internal.fitness.zzff) com.google.android.gms.internal.fitness.zzja.zzo(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 62:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzh(i8, zzg(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 63:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzl(i8, zzg(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 64:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzk(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 65:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzh(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 66:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzi(i8, zzg(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 67:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzf(i8, zzh(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 68:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.fitness.zzfs.zzc(i8, (com.google.android.gms.internal.fitness.zzho) com.google.android.gms.internal.fitness.zzja.zzo(t, j2), zzae(i5));
                            i6 += iZzb2;
                        }
                        break;
                }
                i5 += 3;
                i3 = 267386880;
            }
            return i6 + zza(this.zzxn, t);
        }
        sun.misc.Unsafe unsafe2 = zzxr;
        int i10 = -1;
        int i11 = 0;
        int iZzb3 = 0;
        int i12 = 0;
        while (i11 < this.zzxs.length) {
            int iZzag2 = zzag(i11);
            int[] iArr = this.zzxs;
            int i13 = iArr[i11];
            int i14 = (iZzag2 & 267386880) >>> 20;
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
                i = (!this.zzxy || i14 < com.google.android.gms.internal.fitness.zzgc.DOUBLE_LIST_PACKED.id() || i14 > com.google.android.gms.internal.fitness.zzgc.SINT64_LIST_PACKED.id()) ? 0 : this.zzxs[i11 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = iZzag2 & 1048575;
            switch (i14) {
                case 0:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.fitness.zzfs.zzb(i13, 0.0d);
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.fitness.zzfs.zzb(i13, 0.0f);
                    }
                    break;
                case 2:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.fitness.zzfs.zzd(i13, unsafe2.getLong(t, j3));
                        iZzb3 += iZzd;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.fitness.zzfs.zze(i13, unsafe2.getLong(t, j3));
                        iZzb3 += iZzd;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.fitness.zzfs.zzg(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzd;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.fitness.zzfs.zzg(i13, 0L);
                        iZzb3 += iZzd;
                    }
                    break;
                case 6:
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.fitness.zzfs.zzj(i13, 0);
                    }
                    j = 0;
                    break;
                case 7:
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.fitness.zzfs.zzb(i13, true);
                    }
                    j = 0;
                    break;
                case 8:
                    if ((i12 & i2) != 0) {
                        java.lang.Object object = unsafe2.getObject(t, j3);
                        if (object instanceof com.google.android.gms.internal.fitness.zzff) {
                            iZzb = com.google.android.gms.internal.fitness.zzfs.zzc(i13, (com.google.android.gms.internal.fitness.zzff) object);
                        } else {
                            iZzb = com.google.android.gms.internal.fitness.zzfs.zzb(i13, (java.lang.String) object);
                        }
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.fitness.zzie.zzc(i13, unsafe2.getObject(t, j3), zzae(i11));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzc(i13, (com.google.android.gms.internal.fitness.zzff) unsafe2.getObject(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzh(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzl(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i12 & i2) != 0) {
                        iZzk = com.google.android.gms.internal.fitness.zzfs.zzk(i13, 0);
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzh(i13, 0L);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzi(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzf(i13, unsafe2.getLong(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzc(i13, (com.google.android.gms.internal.fitness.zzho) unsafe2.getObject(t, j3), zzae(i11));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 18:
                    iZzb = com.google.android.gms.internal.fitness.zzie.zzw(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 19:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzv(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 20:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzo(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 21:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzp(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 22:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzs(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 23:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzw(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 24:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzv(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 25:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzx(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 26:
                    iZzb = com.google.android.gms.internal.fitness.zzie.zzc(i13, (java.util.List) unsafe2.getObject(t, j3));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 27:
                    iZzb = com.google.android.gms.internal.fitness.zzie.zzc(i13, (java.util.List<?>) unsafe2.getObject(t, j3), zzae(i11));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 28:
                    iZzb = com.google.android.gms.internal.fitness.zzie.zzd(i13, (java.util.List) unsafe2.getObject(t, j3));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 29:
                    iZzb = com.google.android.gms.internal.fitness.zzie.zzt(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 30:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzr(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 31:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzv(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 32:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzw(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 33:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzu(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 34:
                    iZzv = com.google.android.gms.internal.fitness.zzie.zzq(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzv;
                    j = 0;
                    break;
                case 35:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzj((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 36:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 37:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzb((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 38:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzc((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 39:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzf((java.util.List<java.lang.Integer>) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 40:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzj((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 41:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 42:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzk((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 43:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzg((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 44:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zze((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 45:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 46:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzj((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 47:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzh((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 48:
                    iZzj = com.google.android.gms.internal.fitness.zzie.zzd((java.util.List<java.lang.Long>) unsafe2.getObject(t, j3));
                    if (iZzj > 0) {
                        if (this.zzxy) {
                            unsafe2.putInt(t, i, iZzj);
                        }
                        iZzp = com.google.android.gms.internal.fitness.zzfs.zzp(i13);
                        iZzr = com.google.android.gms.internal.fitness.zzfs.zzr(iZzj);
                        iZzk = iZzp + iZzr + iZzj;
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 49:
                    iZzb = com.google.android.gms.internal.fitness.zzie.zzd(i13, (java.util.List) unsafe2.getObject(t, j3), zzae(i11));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 50:
                    iZzb = this.zzye.zzb(i13, unsafe2.getObject(t, j3), zzaf(i11));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 51:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzb(i13, 0.0d);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza(t, i13, i11)) {
                        iZzk = com.google.android.gms.internal.fitness.zzfs.zzb(i13, 0.0f);
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzd(i13, zzh(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zze(i13, zzh(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzg(i13, zzg(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzg(i13, 0L);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza(t, i13, i11)) {
                        iZzk = com.google.android.gms.internal.fitness.zzfs.zzj(i13, 0);
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza(t, i13, i11)) {
                        iZzk = com.google.android.gms.internal.fitness.zzfs.zzb(i13, true);
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza(t, i13, i11)) {
                        java.lang.Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof com.google.android.gms.internal.fitness.zzff) {
                            iZzb = com.google.android.gms.internal.fitness.zzfs.zzc(i13, (com.google.android.gms.internal.fitness.zzff) object2);
                        } else {
                            iZzb = com.google.android.gms.internal.fitness.zzfs.zzb(i13, (java.lang.String) object2);
                        }
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzie.zzc(i13, unsafe2.getObject(t, j3), zzae(i11));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzc(i13, (com.google.android.gms.internal.fitness.zzff) unsafe2.getObject(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzh(i13, zzg(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzl(i13, zzg(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza(t, i13, i11)) {
                        iZzk = com.google.android.gms.internal.fitness.zzfs.zzk(i13, 0);
                        iZzb3 += iZzk;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzh(i13, 0L);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzi(i13, zzg(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzf(i13, zzh(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.fitness.zzfs.zzc(i13, (com.google.android.gms.internal.fitness.zzho) unsafe2.getObject(t, j3), zzae(i11));
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
        int iZzb4 = 0;
        int iZza = iZzb3 + zza(this.zzxn, t);
        if (!this.zzxo) {
            return iZza;
        }
        com.google.android.gms.internal.fitness.zzgb<T> zzgbVarZza = this.zzxp.zza(t);
        for (int i17 = 0; i17 < zzgbVarZza.zzsj.zzcq(); i17++) {
            java.util.Map.Entry entryZzaj = zzgbVarZza.zzsj.zzaj(i17);
            iZzb4 += com.google.android.gms.internal.fitness.zzgb.zzb((com.google.android.gms.internal.fitness.zzgd<?>) entryZzaj.getKey(), entryZzaj.getValue());
        }
        for (java.util.Map.Entry entry : zzgbVarZza.zzsj.zzcr()) {
            iZzb4 += com.google.android.gms.internal.fitness.zzgb.zzb((com.google.android.gms.internal.fitness.zzgd<?>) entry.getKey(), entry.getValue());
        }
        return iZza + iZzb4;
    }

    private static <UT, UB> int zza(com.google.android.gms.internal.fitness.zziu<UT, UB> zziuVar, T t) {
        return zziuVar.zzk(zziuVar.zzm(t));
    }

    private static java.util.List<?> zzd(java.lang.Object obj, long j) {
        return (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(obj, j);
    }

    /* JADX WARN: Code duplicated, block: B:178:0x054a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.fitness.zzic
    public final void zza(T t, com.google.android.gms.internal.fitness.zzjo zzjoVar) throws java.io.IOException {
        java.util.Iterator it;
        java.util.Map.Entry<?, ?> entry;
        java.util.Iterator itDescendingIterator;
        java.util.Map.Entry<?, ?> entry2;
        if (zzjoVar.zzay() == com.google.android.gms.internal.fitness.zzgg.zze.zzvx) {
            zza(this.zzxn, t, zzjoVar);
            if (this.zzxo) {
                com.google.android.gms.internal.fitness.zzgb<T> zzgbVarZza = this.zzxp.zza(t);
                if (zzgbVarZza.zzsj.isEmpty()) {
                    itDescendingIterator = null;
                    entry2 = null;
                } else {
                    itDescendingIterator = zzgbVarZza.descendingIterator();
                    entry2 = (java.util.Map.Entry) itDescendingIterator.next();
                }
            } else {
                itDescendingIterator = null;
                entry2 = null;
            }
            for (int length = this.zzxs.length - 3; length >= 0; length -= 3) {
                int iZzag = zzag(length);
                int i = this.zzxs[length];
                while (entry2 != null && this.zzxp.zza(entry2) > i) {
                    this.zzxp.zza(zzjoVar, entry2);
                    entry2 = itDescendingIterator.hasNext() ? (java.util.Map.Entry) itDescendingIterator.next() : null;
                }
                switch ((iZzag & 267386880) >>> 20) {
                    case 0:
                        if (zza(t, length)) {
                            zzjoVar.zza(i, com.google.android.gms.internal.fitness.zzja.zzn(t, iZzag & 1048575));
                        }
                        break;
                    case 1:
                        if (zza(t, length)) {
                            zzjoVar.zza(i, com.google.android.gms.internal.fitness.zzja.zzm(t, iZzag & 1048575));
                        }
                        break;
                    case 2:
                        if (zza(t, length)) {
                            zzjoVar.zzi(i, com.google.android.gms.internal.fitness.zzja.zzk(t, iZzag & 1048575));
                        }
                        break;
                    case 3:
                        if (zza(t, length)) {
                            zzjoVar.zza(i, com.google.android.gms.internal.fitness.zzja.zzk(t, iZzag & 1048575));
                        }
                        break;
                    case 4:
                        if (zza(t, length)) {
                            zzjoVar.zzc(i, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag & 1048575));
                        }
                        break;
                    case 5:
                        if (zza(t, length)) {
                            zzjoVar.zzc(i, com.google.android.gms.internal.fitness.zzja.zzk(t, iZzag & 1048575));
                        }
                        break;
                    case 6:
                        if (zza(t, length)) {
                            zzjoVar.zzf(i, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag & 1048575));
                        }
                        break;
                    case 7:
                        if (zza(t, length)) {
                            zzjoVar.zza(i, com.google.android.gms.internal.fitness.zzja.zzl(t, iZzag & 1048575));
                        }
                        break;
                    case 8:
                        if (zza(t, length)) {
                            zza(i, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar);
                        }
                        break;
                    case 9:
                        if (zza(t, length)) {
                            zzjoVar.zza(i, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzae(length));
                        }
                        break;
                    case 10:
                        if (zza(t, length)) {
                            zzjoVar.zza(i, (com.google.android.gms.internal.fitness.zzff) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575));
                        }
                        break;
                    case 11:
                        if (zza(t, length)) {
                            zzjoVar.zzd(i, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag & 1048575));
                        }
                        break;
                    case 12:
                        if (zza(t, length)) {
                            zzjoVar.zzn(i, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag & 1048575));
                        }
                        break;
                    case 13:
                        if (zza(t, length)) {
                            zzjoVar.zzm(i, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag & 1048575));
                        }
                        break;
                    case 14:
                        if (zza(t, length)) {
                            zzjoVar.zzj(i, com.google.android.gms.internal.fitness.zzja.zzk(t, iZzag & 1048575));
                        }
                        break;
                    case 15:
                        if (zza(t, length)) {
                            zzjoVar.zze(i, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag & 1048575));
                        }
                        break;
                    case 16:
                        if (zza(t, length)) {
                            zzjoVar.zzb(i, com.google.android.gms.internal.fitness.zzja.zzk(t, iZzag & 1048575));
                        }
                        break;
                    case 17:
                        if (zza(t, length)) {
                            zzjoVar.zzb(i, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzae(length));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[length], (java.util.List<java.lang.Double>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 19:
                        com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[length], (java.util.List<java.lang.Float>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 20:
                        com.google.android.gms.internal.fitness.zzie.zzc(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 21:
                        com.google.android.gms.internal.fitness.zzie.zzd(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 22:
                        com.google.android.gms.internal.fitness.zzie.zzh(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 23:
                        com.google.android.gms.internal.fitness.zzie.zzf(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 24:
                        com.google.android.gms.internal.fitness.zzie.zzk(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 25:
                        com.google.android.gms.internal.fitness.zzie.zzn(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 26:
                        com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[length], (java.util.List<java.lang.String>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar);
                        break;
                    case 27:
                        com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[length], (java.util.List<?>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, zzae(length));
                        break;
                    case 28:
                        com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar);
                        break;
                    case 29:
                        com.google.android.gms.internal.fitness.zzie.zzi(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 30:
                        com.google.android.gms.internal.fitness.zzie.zzm(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 31:
                        com.google.android.gms.internal.fitness.zzie.zzl(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 32:
                        com.google.android.gms.internal.fitness.zzie.zzg(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 33:
                        com.google.android.gms.internal.fitness.zzie.zzj(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 34:
                        com.google.android.gms.internal.fitness.zzie.zze(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, false);
                        break;
                    case 35:
                        com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[length], (java.util.List<java.lang.Double>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 36:
                        com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[length], (java.util.List<java.lang.Float>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 37:
                        com.google.android.gms.internal.fitness.zzie.zzc(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 38:
                        com.google.android.gms.internal.fitness.zzie.zzd(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 39:
                        com.google.android.gms.internal.fitness.zzie.zzh(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 40:
                        com.google.android.gms.internal.fitness.zzie.zzf(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 41:
                        com.google.android.gms.internal.fitness.zzie.zzk(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 42:
                        com.google.android.gms.internal.fitness.zzie.zzn(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 43:
                        com.google.android.gms.internal.fitness.zzie.zzi(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 44:
                        com.google.android.gms.internal.fitness.zzie.zzm(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 45:
                        com.google.android.gms.internal.fitness.zzie.zzl(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 46:
                        com.google.android.gms.internal.fitness.zzie.zzg(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 47:
                        com.google.android.gms.internal.fitness.zzie.zzj(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 48:
                        com.google.android.gms.internal.fitness.zzie.zze(this.zzxs[length], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, true);
                        break;
                    case 49:
                        com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[length], (java.util.List<?>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar, zzae(length));
                        break;
                    case 50:
                        zza(zzjoVar, i, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), length);
                        break;
                    case 51:
                        if (zza(t, i, length)) {
                            zzjoVar.zza(i, zze(t, iZzag & 1048575));
                        }
                        break;
                    case 52:
                        if (zza(t, i, length)) {
                            zzjoVar.zza(i, zzf(t, iZzag & 1048575));
                        }
                        break;
                    case 53:
                        if (zza(t, i, length)) {
                            zzjoVar.zzi(i, zzh(t, iZzag & 1048575));
                        }
                        break;
                    case 54:
                        if (zza(t, i, length)) {
                            zzjoVar.zza(i, zzh(t, iZzag & 1048575));
                        }
                        break;
                    case 55:
                        if (zza(t, i, length)) {
                            zzjoVar.zzc(i, zzg(t, iZzag & 1048575));
                        }
                        break;
                    case 56:
                        if (zza(t, i, length)) {
                            zzjoVar.zzc(i, zzh(t, iZzag & 1048575));
                        }
                        break;
                    case 57:
                        if (zza(t, i, length)) {
                            zzjoVar.zzf(i, zzg(t, iZzag & 1048575));
                        }
                        break;
                    case 58:
                        if (zza(t, i, length)) {
                            zzjoVar.zza(i, zzi(t, iZzag & 1048575));
                        }
                        break;
                    case 59:
                        if (zza(t, i, length)) {
                            zza(i, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzjoVar);
                        }
                        break;
                    case 60:
                        if (zza(t, i, length)) {
                            zzjoVar.zza(i, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzae(length));
                        }
                        break;
                    case 61:
                        if (zza(t, i, length)) {
                            zzjoVar.zza(i, (com.google.android.gms.internal.fitness.zzff) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575));
                        }
                        break;
                    case 62:
                        if (zza(t, i, length)) {
                            zzjoVar.zzd(i, zzg(t, iZzag & 1048575));
                        }
                        break;
                    case 63:
                        if (zza(t, i, length)) {
                            zzjoVar.zzn(i, zzg(t, iZzag & 1048575));
                        }
                        break;
                    case 64:
                        if (zza(t, i, length)) {
                            zzjoVar.zzm(i, zzg(t, iZzag & 1048575));
                        }
                        break;
                    case 65:
                        if (zza(t, i, length)) {
                            zzjoVar.zzj(i, zzh(t, iZzag & 1048575));
                        }
                        break;
                    case 66:
                        if (zza(t, i, length)) {
                            zzjoVar.zze(i, zzg(t, iZzag & 1048575));
                        }
                        break;
                    case 67:
                        if (zza(t, i, length)) {
                            zzjoVar.zzb(i, zzh(t, iZzag & 1048575));
                        }
                        break;
                    case 68:
                        if (zza(t, i, length)) {
                            zzjoVar.zzb(i, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575), zzae(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.zzxp.zza(zzjoVar, entry2);
                entry2 = itDescendingIterator.hasNext() ? (java.util.Map.Entry) itDescendingIterator.next() : null;
            }
            return;
        }
        if (this.zzxx) {
            if (this.zzxo) {
                com.google.android.gms.internal.fitness.zzgb<T> zzgbVarZza2 = this.zzxp.zza(t);
                if (zzgbVarZza2.zzsj.isEmpty()) {
                    it = null;
                    entry = null;
                } else {
                    it = zzgbVarZza2.iterator();
                    entry = (java.util.Map.Entry) it.next();
                }
            } else {
                it = null;
                entry = null;
            }
            int length2 = this.zzxs.length;
            for (int i2 = 0; i2 < length2; i2 += 3) {
                int iZzag2 = zzag(i2);
                int i3 = this.zzxs[i2];
                while (entry != null && this.zzxp.zza(entry) <= i3) {
                    this.zzxp.zza(zzjoVar, entry);
                    entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                }
                switch ((iZzag2 & 267386880) >>> 20) {
                    case 0:
                        if (zza(t, i2)) {
                            zzjoVar.zza(i3, com.google.android.gms.internal.fitness.zzja.zzn(t, iZzag2 & 1048575));
                        }
                        break;
                    case 1:
                        if (zza(t, i2)) {
                            zzjoVar.zza(i3, com.google.android.gms.internal.fitness.zzja.zzm(t, iZzag2 & 1048575));
                        }
                        break;
                    case 2:
                        if (zza(t, i2)) {
                            zzjoVar.zzi(i3, com.google.android.gms.internal.fitness.zzja.zzk(t, iZzag2 & 1048575));
                        }
                        break;
                    case 3:
                        if (zza(t, i2)) {
                            zzjoVar.zza(i3, com.google.android.gms.internal.fitness.zzja.zzk(t, iZzag2 & 1048575));
                        }
                        break;
                    case 4:
                        if (zza(t, i2)) {
                            zzjoVar.zzc(i3, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag2 & 1048575));
                        }
                        break;
                    case 5:
                        if (zza(t, i2)) {
                            zzjoVar.zzc(i3, com.google.android.gms.internal.fitness.zzja.zzk(t, iZzag2 & 1048575));
                        }
                        break;
                    case 6:
                        if (zza(t, i2)) {
                            zzjoVar.zzf(i3, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag2 & 1048575));
                        }
                        break;
                    case 7:
                        if (zza(t, i2)) {
                            zzjoVar.zza(i3, com.google.android.gms.internal.fitness.zzja.zzl(t, iZzag2 & 1048575));
                        }
                        break;
                    case 8:
                        if (zza(t, i2)) {
                            zza(i3, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar);
                        }
                        break;
                    case 9:
                        if (zza(t, i2)) {
                            zzjoVar.zza(i3, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzae(i2));
                        }
                        break;
                    case 10:
                        if (zza(t, i2)) {
                            zzjoVar.zza(i3, (com.google.android.gms.internal.fitness.zzff) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575));
                        }
                        break;
                    case 11:
                        if (zza(t, i2)) {
                            zzjoVar.zzd(i3, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag2 & 1048575));
                        }
                        break;
                    case 12:
                        if (zza(t, i2)) {
                            zzjoVar.zzn(i3, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag2 & 1048575));
                        }
                        break;
                    case 13:
                        if (zza(t, i2)) {
                            zzjoVar.zzm(i3, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag2 & 1048575));
                        }
                        break;
                    case 14:
                        if (zza(t, i2)) {
                            zzjoVar.zzj(i3, com.google.android.gms.internal.fitness.zzja.zzk(t, iZzag2 & 1048575));
                        }
                        break;
                    case 15:
                        if (zza(t, i2)) {
                            zzjoVar.zze(i3, com.google.android.gms.internal.fitness.zzja.zzj(t, iZzag2 & 1048575));
                        }
                        break;
                    case 16:
                        if (zza(t, i2)) {
                            zzjoVar.zzb(i3, com.google.android.gms.internal.fitness.zzja.zzk(t, iZzag2 & 1048575));
                        }
                        break;
                    case 17:
                        if (zza(t, i2)) {
                            zzjoVar.zzb(i3, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzae(i2));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[i2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 19:
                        com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[i2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 20:
                        com.google.android.gms.internal.fitness.zzie.zzc(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 21:
                        com.google.android.gms.internal.fitness.zzie.zzd(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 22:
                        com.google.android.gms.internal.fitness.zzie.zzh(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 23:
                        com.google.android.gms.internal.fitness.zzie.zzf(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 24:
                        com.google.android.gms.internal.fitness.zzie.zzk(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 25:
                        com.google.android.gms.internal.fitness.zzie.zzn(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 26:
                        com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[i2], (java.util.List<java.lang.String>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar);
                        break;
                    case 27:
                        com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[i2], (java.util.List<?>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, zzae(i2));
                        break;
                    case 28:
                        com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar);
                        break;
                    case 29:
                        com.google.android.gms.internal.fitness.zzie.zzi(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 30:
                        com.google.android.gms.internal.fitness.zzie.zzm(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 31:
                        com.google.android.gms.internal.fitness.zzie.zzl(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 32:
                        com.google.android.gms.internal.fitness.zzie.zzg(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 33:
                        com.google.android.gms.internal.fitness.zzie.zzj(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 34:
                        com.google.android.gms.internal.fitness.zzie.zze(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, false);
                        break;
                    case 35:
                        com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[i2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 36:
                        com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[i2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 37:
                        com.google.android.gms.internal.fitness.zzie.zzc(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 38:
                        com.google.android.gms.internal.fitness.zzie.zzd(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 39:
                        com.google.android.gms.internal.fitness.zzie.zzh(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 40:
                        com.google.android.gms.internal.fitness.zzie.zzf(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 41:
                        com.google.android.gms.internal.fitness.zzie.zzk(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 42:
                        com.google.android.gms.internal.fitness.zzie.zzn(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 43:
                        com.google.android.gms.internal.fitness.zzie.zzi(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 44:
                        com.google.android.gms.internal.fitness.zzie.zzm(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 45:
                        com.google.android.gms.internal.fitness.zzie.zzl(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 46:
                        com.google.android.gms.internal.fitness.zzie.zzg(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 47:
                        com.google.android.gms.internal.fitness.zzie.zzj(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 48:
                        com.google.android.gms.internal.fitness.zzie.zze(this.zzxs[i2], (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, true);
                        break;
                    case 49:
                        com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[i2], (java.util.List<?>) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar, zzae(i2));
                        break;
                    case 50:
                        zza(zzjoVar, i3, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), i2);
                        break;
                    case 51:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zza(i3, zze(t, iZzag2 & 1048575));
                        }
                        break;
                    case 52:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zza(i3, zzf(t, iZzag2 & 1048575));
                        }
                        break;
                    case 53:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zzi(i3, zzh(t, iZzag2 & 1048575));
                        }
                        break;
                    case 54:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zza(i3, zzh(t, iZzag2 & 1048575));
                        }
                        break;
                    case 55:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zzc(i3, zzg(t, iZzag2 & 1048575));
                        }
                        break;
                    case 56:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zzc(i3, zzh(t, iZzag2 & 1048575));
                        }
                        break;
                    case 57:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zzf(i3, zzg(t, iZzag2 & 1048575));
                        }
                        break;
                    case 58:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zza(i3, zzi(t, iZzag2 & 1048575));
                        }
                        break;
                    case 59:
                        if (zza(t, i3, i2)) {
                            zza(i3, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzjoVar);
                        }
                        break;
                    case 60:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zza(i3, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzae(i2));
                        }
                        break;
                    case 61:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zza(i3, (com.google.android.gms.internal.fitness.zzff) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575));
                        }
                        break;
                    case 62:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zzd(i3, zzg(t, iZzag2 & 1048575));
                        }
                        break;
                    case 63:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zzn(i3, zzg(t, iZzag2 & 1048575));
                        }
                        break;
                    case 64:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zzm(i3, zzg(t, iZzag2 & 1048575));
                        }
                        break;
                    case 65:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zzj(i3, zzh(t, iZzag2 & 1048575));
                        }
                        break;
                    case 66:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zze(i3, zzg(t, iZzag2 & 1048575));
                        }
                        break;
                    case 67:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zzb(i3, zzh(t, iZzag2 & 1048575));
                        }
                        break;
                    case 68:
                        if (zza(t, i3, i2)) {
                            zzjoVar.zzb(i3, com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag2 & 1048575), zzae(i2));
                        }
                        break;
                }
            }
            while (entry != null) {
                this.zzxp.zza(zzjoVar, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            zza(this.zzxn, t, zzjoVar);
            return;
        }
        zzb(t, zzjoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    private final void zzb(T t, com.google.android.gms.internal.fitness.zzjo zzjoVar) throws java.io.IOException {
        java.util.Iterator it;
        java.util.Map.Entry<?, ?> entry;
        int i;
        if (this.zzxo) {
            com.google.android.gms.internal.fitness.zzgb<T> zzgbVarZza = this.zzxp.zza(t);
            if (zzgbVarZza.zzsj.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = zzgbVarZza.iterator();
                entry = (java.util.Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int i2 = -1;
        int length = this.zzxs.length;
        sun.misc.Unsafe unsafe = zzxr;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int iZzag = zzag(i3);
            int[] iArr = this.zzxs;
            int i5 = iArr[i3];
            int i6 = (267386880 & iZzag) >>> 20;
            if (this.zzxx || i6 > 17) {
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
            while (entry != null && this.zzxp.zza(entry) <= i5) {
                this.zzxp.zza(zzjoVar, entry);
                entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
            }
            long j = iZzag & 1048575;
            int i9 = i3;
            switch (i6) {
                case 0:
                    if ((i & i4) != 0) {
                        zzjoVar.zza(i5, com.google.android.gms.internal.fitness.zzja.zzn(t, j));
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 1:
                    if ((i & i4) != 0) {
                        zzjoVar.zza(i5, com.google.android.gms.internal.fitness.zzja.zzm(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 2:
                    if ((i & i4) != 0) {
                        zzjoVar.zzi(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 3:
                    if ((i & i4) != 0) {
                        zzjoVar.zza(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 4:
                    if ((i & i4) != 0) {
                        zzjoVar.zzc(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 5:
                    if ((i & i4) != 0) {
                        zzjoVar.zzc(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 6:
                    if ((i & i4) != 0) {
                        zzjoVar.zzf(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 7:
                    if ((i & i4) != 0) {
                        zzjoVar.zza(i5, com.google.android.gms.internal.fitness.zzja.zzl(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 8:
                    if ((i & i4) != 0) {
                        zza(i5, unsafe.getObject(t, j), zzjoVar);
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 9:
                    if ((i & i4) != 0) {
                        zzjoVar.zza(i5, unsafe.getObject(t, j), zzae(i9));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 10:
                    if ((i & i4) != 0) {
                        zzjoVar.zza(i5, (com.google.android.gms.internal.fitness.zzff) unsafe.getObject(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 11:
                    if ((i & i4) != 0) {
                        zzjoVar.zzd(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 12:
                    if ((i & i4) != 0) {
                        zzjoVar.zzn(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 13:
                    if ((i & i4) != 0) {
                        zzjoVar.zzm(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 14:
                    if ((i & i4) != 0) {
                        zzjoVar.zzj(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 15:
                    if ((i & i4) != 0) {
                        zzjoVar.zze(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 16:
                    if ((i & i4) != 0) {
                        zzjoVar.zzb(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 17:
                    if ((i & i4) != 0) {
                        zzjoVar.zzb(i5, unsafe.getObject(t, j), zzae(i9));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 18:
                    com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[i9], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 19:
                    com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[i9], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 20:
                    com.google.android.gms.internal.fitness.zzie.zzc(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 21:
                    com.google.android.gms.internal.fitness.zzie.zzd(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 22:
                    com.google.android.gms.internal.fitness.zzie.zzh(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 23:
                    com.google.android.gms.internal.fitness.zzie.zzf(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 24:
                    com.google.android.gms.internal.fitness.zzie.zzk(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 25:
                    com.google.android.gms.internal.fitness.zzie.zzn(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 26:
                    com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[i9], (java.util.List<java.lang.String>) unsafe.getObject(t, j), zzjoVar);
                    break;
                case 27:
                    com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[i9], (java.util.List<?>) unsafe.getObject(t, j), zzjoVar, zzae(i9));
                    break;
                case 28:
                    com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar);
                    break;
                case 29:
                    com.google.android.gms.internal.fitness.zzie.zzi(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 30:
                    com.google.android.gms.internal.fitness.zzie.zzm(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 31:
                    com.google.android.gms.internal.fitness.zzie.zzl(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 32:
                    com.google.android.gms.internal.fitness.zzie.zzg(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 33:
                    com.google.android.gms.internal.fitness.zzie.zzj(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 34:
                    com.google.android.gms.internal.fitness.zzie.zze(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 35:
                    com.google.android.gms.internal.fitness.zzie.zza(this.zzxs[i9], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 36:
                    com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[i9], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 37:
                    com.google.android.gms.internal.fitness.zzie.zzc(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 38:
                    com.google.android.gms.internal.fitness.zzie.zzd(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 39:
                    com.google.android.gms.internal.fitness.zzie.zzh(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 40:
                    com.google.android.gms.internal.fitness.zzie.zzf(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 41:
                    com.google.android.gms.internal.fitness.zzie.zzk(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 42:
                    com.google.android.gms.internal.fitness.zzie.zzn(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 43:
                    com.google.android.gms.internal.fitness.zzie.zzi(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 44:
                    com.google.android.gms.internal.fitness.zzie.zzm(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 45:
                    com.google.android.gms.internal.fitness.zzie.zzl(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 46:
                    com.google.android.gms.internal.fitness.zzie.zzg(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 47:
                    com.google.android.gms.internal.fitness.zzie.zzj(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 48:
                    com.google.android.gms.internal.fitness.zzie.zze(this.zzxs[i9], (java.util.List) unsafe.getObject(t, j), zzjoVar, true);
                    break;
                case 49:
                    com.google.android.gms.internal.fitness.zzie.zzb(this.zzxs[i9], (java.util.List<?>) unsafe.getObject(t, j), zzjoVar, zzae(i9));
                    break;
                case 50:
                    zza(zzjoVar, i5, unsafe.getObject(t, j), i9);
                    break;
                case 51:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zza(i5, zze(t, j));
                    }
                    break;
                case 52:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zza(i5, zzf(t, j));
                    }
                    break;
                case 53:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zzi(i5, zzh(t, j));
                    }
                    break;
                case 54:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zza(i5, zzh(t, j));
                    }
                    break;
                case 55:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zzc(i5, zzg(t, j));
                    }
                    break;
                case 56:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zzc(i5, zzh(t, j));
                    }
                    break;
                case 57:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zzf(i5, zzg(t, j));
                    }
                    break;
                case 58:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zza(i5, zzi(t, j));
                    }
                    break;
                case 59:
                    if (zza(t, i5, i9)) {
                        zza(i5, unsafe.getObject(t, j), zzjoVar);
                    }
                    break;
                case 60:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zza(i5, unsafe.getObject(t, j), zzae(i9));
                    }
                    break;
                case 61:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zza(i5, (com.google.android.gms.internal.fitness.zzff) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zzd(i5, zzg(t, j));
                    }
                    break;
                case 63:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zzn(i5, zzg(t, j));
                    }
                    break;
                case 64:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zzm(i5, zzg(t, j));
                    }
                    break;
                case 65:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zzj(i5, zzh(t, j));
                    }
                    break;
                case 66:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zze(i5, zzg(t, j));
                    }
                    break;
                case 67:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zzb(i5, zzh(t, j));
                    }
                    break;
                case 68:
                    if (zza(t, i5, i9)) {
                        zzjoVar.zzb(i5, unsafe.getObject(t, j), zzae(i9));
                    }
                    break;
            }
            i3 = i9 + 3;
        }
        while (entry != null) {
            this.zzxp.zza(zzjoVar, entry);
            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
        }
        zza(this.zzxn, t, zzjoVar);
    }

    private final <K, V> void zza(com.google.android.gms.internal.fitness.zzjo zzjoVar, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        if (obj != null) {
            zzjoVar.zza(i, this.zzye.zzh(zzaf(i2)), this.zzye.zzf(obj));
        }
    }

    private static <UT, UB> void zza(com.google.android.gms.internal.fitness.zziu<UT, UB> zziuVar, T t, com.google.android.gms.internal.fitness.zzjo zzjoVar) throws java.io.IOException {
        zziuVar.zza(zziuVar.zzm(t), zzjoVar);
    }

    private final com.google.android.gms.internal.fitness.zzic zzae(int i) {
        int i2 = (i / 3) << 1;
        com.google.android.gms.internal.fitness.zzic zzicVar = (com.google.android.gms.internal.fitness.zzic) this.zzxt[i2];
        if (zzicVar != null) {
            return zzicVar;
        }
        com.google.android.gms.internal.fitness.zzic<T> zzicVarZze = com.google.android.gms.internal.fitness.zzia.zzcp().zze((java.lang.Class) this.zzxt[i2 + 1]);
        this.zzxt[i2] = zzicVarZze;
        return zzicVarZze;
    }

    private final java.lang.Object zzaf(int i) {
        return this.zzxt[(i / 3) << 1];
    }

    @Override // com.google.android.gms.internal.fitness.zzic
    public final void zzc(T t) {
        int i;
        int i2 = this.zzya;
        while (true) {
            i = this.zzyb;
            if (i2 >= i) {
                break;
            }
            long jZzag = zzag(this.zzxz[i2]) & 1048575;
            java.lang.Object objZzo = com.google.android.gms.internal.fitness.zzja.zzo(t, jZzag);
            if (objZzo != null) {
                com.google.android.gms.internal.fitness.zzja.zza(t, jZzag, this.zzye.zzg(objZzo));
            }
            i2++;
        }
        int length = this.zzxz.length;
        while (i < length) {
            this.zzyd.zza(t, this.zzxz[i]);
            i++;
        }
        this.zzxn.zzc(t);
        if (this.zzxo) {
            this.zzxp.zzc(t);
        }
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
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.fitness.zzic] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.fitness.zzic] */
    @Override // com.google.android.gms.internal.fitness.zzic
    public final boolean zzj(T t) {
        int i;
        java.util.List list;
        ?? Zzae;
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= this.zzya) {
                return !this.zzxo || this.zzxp.zza(t).isInitialized();
            }
            int i6 = this.zzxz[i4];
            int i7 = this.zzxs[i6];
            int iZzag = zzag(i6);
            if (this.zzxx) {
                i = 0;
            } else {
                int i8 = this.zzxs[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = zzxr.getInt(t, i9);
                    i3 = i9;
                }
            }
            if (((268435456 & iZzag) != 0) && !zza(t, i6, i5, i)) {
                return false;
            }
            int i10 = (267386880 & iZzag) >>> 20;
            if (i10 == 9 || i10 == 17) {
                if (zza(t, i6, i5, i) && !zza(t, iZzag, zzae(i6))) {
                    return false;
                }
            } else if (i10 == 27) {
                list = (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575);
                if (!list.isEmpty()) {
                    Zzae = zzae(i6);
                    for (i2 = 0; i2 < list.size(); i2++) {
                        if (!Zzae.zzj(list.get(i2))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i10 == 60 || i10 == 68) {
                if (zza(t, i7, i6) && !zza(t, iZzag, zzae(i6))) {
                    return false;
                }
            } else if (i10 == 49) {
                list = (java.util.List) com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575);
                if (!list.isEmpty()) {
                    Zzae = zzae(i6);
                    while (i2 < list.size()) {
                        if (!Zzae.zzj(list.get(i2))) {
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
                java.util.Map<?, ?> mapZzf = this.zzye.zzf(com.google.android.gms.internal.fitness.zzja.zzo(t, iZzag & 1048575));
                if (!mapZzf.isEmpty()) {
                    if (this.zzye.zzh(zzaf(i6)).zzxi.zzdl() == com.google.android.gms.internal.fitness.zzjl.MESSAGE) {
                        ?? Zze = 0;
                        for (java.lang.Object obj : mapZzf.values()) {
                            if (Zze == 0) {
                                Zze = Zze;
                                Zze = com.google.android.gms.internal.fitness.zzia.zzcp().zze(obj.getClass());
                            }
                            Zze = Zze;
                            if (!Zze.zzj(obj)) {
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
    private static boolean zza(java.lang.Object obj, int i, com.google.android.gms.internal.fitness.zzic zzicVar) {
        return zzicVar.zzj(com.google.android.gms.internal.fitness.zzja.zzo(obj, i & 1048575));
    }

    private static void zza(int i, java.lang.Object obj, com.google.android.gms.internal.fitness.zzjo zzjoVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zzjoVar.zza(i, (java.lang.String) obj);
        } else {
            zzjoVar.zza(i, (com.google.android.gms.internal.fitness.zzff) obj);
        }
    }

    private final int zzag(int i) {
        return this.zzxs[i + 1];
    }

    private final int zzah(int i) {
        return this.zzxs[i + 2];
    }

    private static <T> double zze(T t, long j) {
        return ((java.lang.Double) com.google.android.gms.internal.fitness.zzja.zzo(t, j)).doubleValue();
    }

    private static <T> float zzf(T t, long j) {
        return ((java.lang.Float) com.google.android.gms.internal.fitness.zzja.zzo(t, j)).floatValue();
    }

    private static <T> int zzg(T t, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.fitness.zzja.zzo(t, j)).intValue();
    }

    private static <T> long zzh(T t, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.fitness.zzja.zzo(t, j)).longValue();
    }

    private static <T> boolean zzi(T t, long j) {
        return ((java.lang.Boolean) com.google.android.gms.internal.fitness.zzja.zzo(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza(t, i) == zza(t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzxx) {
            return zza(t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzxx) {
            int iZzag = zzag(i);
            long j = iZzag & 1048575;
            switch ((iZzag & 267386880) >>> 20) {
                case 0:
                    return com.google.android.gms.internal.fitness.zzja.zzn(t, j) != 0.0d;
                case 1:
                    return com.google.android.gms.internal.fitness.zzja.zzm(t, j) != 0.0f;
                case 2:
                    return com.google.android.gms.internal.fitness.zzja.zzk(t, j) != 0;
                case 3:
                    return com.google.android.gms.internal.fitness.zzja.zzk(t, j) != 0;
                case 4:
                    return com.google.android.gms.internal.fitness.zzja.zzj(t, j) != 0;
                case 5:
                    return com.google.android.gms.internal.fitness.zzja.zzk(t, j) != 0;
                case 6:
                    return com.google.android.gms.internal.fitness.zzja.zzj(t, j) != 0;
                case 7:
                    return com.google.android.gms.internal.fitness.zzja.zzl(t, j);
                case 8:
                    java.lang.Object objZzo = com.google.android.gms.internal.fitness.zzja.zzo(t, j);
                    if (objZzo instanceof java.lang.String) {
                        return !((java.lang.String) objZzo).isEmpty();
                    }
                    if (objZzo instanceof com.google.android.gms.internal.fitness.zzff) {
                        return !com.google.android.gms.internal.fitness.zzff.zzri.equals(objZzo);
                    }
                    throw new java.lang.IllegalArgumentException();
                case 9:
                    return com.google.android.gms.internal.fitness.zzja.zzo(t, j) != null;
                case 10:
                    return !com.google.android.gms.internal.fitness.zzff.zzri.equals(com.google.android.gms.internal.fitness.zzja.zzo(t, j));
                case 11:
                    return com.google.android.gms.internal.fitness.zzja.zzj(t, j) != 0;
                case 12:
                    return com.google.android.gms.internal.fitness.zzja.zzj(t, j) != 0;
                case 13:
                    return com.google.android.gms.internal.fitness.zzja.zzj(t, j) != 0;
                case 14:
                    return com.google.android.gms.internal.fitness.zzja.zzk(t, j) != 0;
                case 15:
                    return com.google.android.gms.internal.fitness.zzja.zzj(t, j) != 0;
                case 16:
                    return com.google.android.gms.internal.fitness.zzja.zzk(t, j) != 0;
                case 17:
                    return com.google.android.gms.internal.fitness.zzja.zzo(t, j) != null;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        int iZzah = zzah(i);
        return (com.google.android.gms.internal.fitness.zzja.zzj(t, (long) (iZzah & 1048575)) & (1 << (iZzah >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zzxx) {
            return;
        }
        int iZzah = zzah(i);
        long j = iZzah & 1048575;
        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, j, com.google.android.gms.internal.fitness.zzja.zzj(t, j) | (1 << (iZzah >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return com.google.android.gms.internal.fitness.zzja.zzj(t, (long) (zzah(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        com.google.android.gms.internal.fitness.zzja.zza((java.lang.Object) t, zzah(i2) & 1048575, i);
    }
}
