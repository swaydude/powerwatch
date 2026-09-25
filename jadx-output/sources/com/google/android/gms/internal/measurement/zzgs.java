package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgs<T> implements com.google.android.gms.internal.measurement.zzhd<T> {
    private static final int[] zza = new int[0];
    private static final sun.misc.Unsafe zzb = com.google.android.gms.internal.measurement.zzib.zzc();
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.measurement.zzgo zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int[] zzl;
    private final int zzm;
    private final int zzn;
    private final com.google.android.gms.internal.measurement.zzgw zzo;
    private final com.google.android.gms.internal.measurement.zzfy zzp;
    private final com.google.android.gms.internal.measurement.zzhv<?, ?> zzq;
    private final com.google.android.gms.internal.measurement.zzes<?> zzr;
    private final com.google.android.gms.internal.measurement.zzgh zzs;

    private zzgs(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.measurement.zzgo zzgoVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, com.google.android.gms.internal.measurement.zzgw zzgwVar, com.google.android.gms.internal.measurement.zzfy zzfyVar, com.google.android.gms.internal.measurement.zzhv<?, ?> zzhvVar, com.google.android.gms.internal.measurement.zzes<?> zzesVar, com.google.android.gms.internal.measurement.zzgh zzghVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgoVar instanceof com.google.android.gms.internal.measurement.zzfd;
        this.zzj = z;
        this.zzh = zzesVar != null && zzesVar.zza(zzgoVar);
        this.zzk = false;
        this.zzl = iArr2;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzgwVar;
        this.zzp = zzfyVar;
        this.zzq = zzhvVar;
        this.zzr = zzesVar;
        this.zzg = zzgoVar;
        this.zzs = zzghVar;
    }

    private static boolean zzf(int i) {
        return (i & 536870912) != 0;
    }

    static <T> com.google.android.gms.internal.measurement.zzgs<T> zza(java.lang.Class<T> cls, com.google.android.gms.internal.measurement.zzgm zzgmVar, com.google.android.gms.internal.measurement.zzgw zzgwVar, com.google.android.gms.internal.measurement.zzfy zzfyVar, com.google.android.gms.internal.measurement.zzhv<?, ?> zzhvVar, com.google.android.gms.internal.measurement.zzes<?> zzesVar, com.google.android.gms.internal.measurement.zzgh zzghVar) {
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
        com.google.android.gms.internal.measurement.zzhb zzhbVar;
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
        if (zzgmVar instanceof com.google.android.gms.internal.measurement.zzhb) {
            com.google.android.gms.internal.measurement.zzhb zzhbVar2 = (com.google.android.gms.internal.measurement.zzhb) zzgmVar;
            int i27 = 0;
            boolean z2 = zzhbVar2.zza() == com.google.android.gms.internal.measurement.zzfd.zze.zzi;
            java.lang.String strZzd = zzhbVar2.zzd();
            int length = strZzd.length();
            int iCharAt3 = strZzd.charAt(0);
            if (iCharAt3 >= 55296) {
                int i28 = iCharAt3 & 8191;
                int i29 = 1;
                int i30 = 13;
                while (true) {
                    i = i29 + 1;
                    cCharAt14 = strZzd.charAt(i29);
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
            int iCharAt4 = strZzd.charAt(i);
            if (iCharAt4 >= 55296) {
                int i32 = iCharAt4 & 8191;
                int i33 = 13;
                while (true) {
                    i26 = i31 + 1;
                    cCharAt13 = strZzd.charAt(i31);
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
                iArr = zza;
                i6 = 0;
                i3 = 0;
                iCharAt = 0;
                i4 = 0;
                iCharAt2 = 0;
                i5 = 0;
            } else {
                int i34 = i31 + 1;
                int iCharAt5 = strZzd.charAt(i31);
                if (iCharAt5 >= 55296) {
                    int i35 = iCharAt5 & 8191;
                    int i36 = 13;
                    while (true) {
                        i14 = i34 + 1;
                        cCharAt8 = strZzd.charAt(i34);
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
                int iCharAt6 = strZzd.charAt(i34);
                if (iCharAt6 >= 55296) {
                    int i38 = iCharAt6 & 8191;
                    int i39 = 13;
                    while (true) {
                        i13 = i37 + 1;
                        cCharAt7 = strZzd.charAt(i37);
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
                iCharAt = strZzd.charAt(i37);
                if (iCharAt >= 55296) {
                    int i41 = iCharAt & 8191;
                    int i42 = 13;
                    while (true) {
                        i12 = i40 + 1;
                        cCharAt6 = strZzd.charAt(i40);
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
                int iCharAt7 = strZzd.charAt(i40);
                if (iCharAt7 >= 55296) {
                    int i44 = iCharAt7 & 8191;
                    int i45 = 13;
                    while (true) {
                        i11 = i43 + 1;
                        cCharAt5 = strZzd.charAt(i43);
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
                iCharAt2 = strZzd.charAt(i43);
                if (iCharAt2 >= 55296) {
                    int i47 = iCharAt2 & 8191;
                    int i48 = 13;
                    while (true) {
                        i10 = i46 + 1;
                        cCharAt4 = strZzd.charAt(i46);
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
                int iCharAt8 = strZzd.charAt(i46);
                if (iCharAt8 >= 55296) {
                    int i50 = iCharAt8 & 8191;
                    int i51 = 13;
                    while (true) {
                        i9 = i49 + 1;
                        cCharAt3 = strZzd.charAt(i49);
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
                int iCharAt9 = strZzd.charAt(i49);
                if (iCharAt9 >= 55296) {
                    int i53 = iCharAt9 & 8191;
                    int i54 = i52;
                    int i55 = 13;
                    while (true) {
                        i8 = i54 + 1;
                        cCharAt2 = strZzd.charAt(i54);
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
                int iCharAt10 = strZzd.charAt(i2);
                if (iCharAt10 >= 55296) {
                    int i57 = iCharAt10 & 8191;
                    int i58 = i56;
                    int i59 = 13;
                    while (true) {
                        i7 = i58 + 1;
                        cCharAt = strZzd.charAt(i58);
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
            sun.misc.Unsafe unsafe = zzb;
            java.lang.Object[] objArrZze = zzhbVar2.zze();
            java.lang.Class<?> cls2 = zzhbVar2.zzc().getClass();
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
                int iCharAt11 = strZzd.charAt(i65);
                int i70 = length;
                if (iCharAt11 >= 55296) {
                    int i71 = iCharAt11 & 8191;
                    int i72 = i69;
                    int i73 = 13;
                    while (true) {
                        i25 = i72 + 1;
                        cCharAt12 = strZzd.charAt(i72);
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
                int iCharAt12 = strZzd.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i24 = i76 + 1;
                        cCharAt11 = strZzd.charAt(i76);
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
                    int iCharAt13 = strZzd.charAt(i17);
                    char c = 55296;
                    if (iCharAt13 >= 55296) {
                        int i82 = iCharAt13 & 8191;
                        int i83 = 13;
                        while (true) {
                            i23 = i81 + 1;
                            cCharAt10 = strZzd.charAt(i81);
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
                        objArr[((i68 / 3) << 1) + 1] = objArrZze[i4];
                        i4++;
                    } else if (i84 == 12 && (iCharAt3 & 1) == 1) {
                        objArr[((i68 / 3) << 1) + 1] = objArrZze[i4];
                        i4++;
                    }
                    int i86 = iCharAt13 << 1;
                    java.lang.Object obj = objArrZze[i86];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldZza2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldZza2 = zza(cls2, (java.lang.String) obj);
                        objArrZze[i86] = fieldZza2;
                    }
                    zzhbVar = zzhbVar2;
                    java.lang.String str2 = strZzd;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza2);
                    int i87 = i86 + 1;
                    java.lang.Object obj2 = objArrZze[i87];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldZza3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldZza3 = zza(cls2, (java.lang.String) obj2);
                        objArrZze[i87] = fieldZza3;
                    }
                    cls2 = cls2;
                    i18 = i4;
                    i17 = i85;
                    str = str2;
                    i20 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza3);
                    i27 = i27;
                } else {
                    zzhbVar = zzhbVar2;
                    java.lang.String str3 = strZzd;
                    i18 = i4 + 1;
                    java.lang.reflect.Field fieldZza4 = zza(cls2, (java.lang.String) objArrZze[i4]);
                    if (i78 == 9 || i78 == 17) {
                        i19 = 1;
                        objArr[((i68 / 3) << 1) + 1] = fieldZza4.getType();
                    } else {
                        if (i78 == 27 || i78 == 49) {
                            i19 = 1;
                            i22 = i18 + 1;
                            objArr[((i68 / 3) << 1) + 1] = objArrZze[i18];
                        } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                            i19 = 1;
                            if ((iCharAt3 & 1) == 1) {
                                i22 = i18 + 1;
                                objArr[((i68 / 3) << 1) + 1] = objArrZze[i18];
                            }
                        } else if (i78 == 50) {
                            int i88 = i64 + 1;
                            iArr[i64] = i68;
                            int i89 = (i68 / 3) << 1;
                            int i90 = i18 + 1;
                            objArr[i89] = objArrZze[i18];
                            if ((iCharAt12 & 2048) != 0) {
                                i18 = i90 + 1;
                                objArr[i89 + 1] = objArrZze[i90];
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
                        java.lang.Object obj3 = objArrZze[i94];
                        if (obj3 instanceof java.lang.reflect.Field) {
                            fieldZza = (java.lang.reflect.Field) obj3;
                        } else {
                            fieldZza = zza(cls2, (java.lang.String) obj3);
                            objArrZze[i94] = fieldZza;
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
                strZzd = str;
                i65 = i17;
                cls2 = cls2;
                i3 = i79;
                length = i70;
                i5 = i15;
                z2 = z;
                iCharAt = i80;
                i4 = i18;
                zzhbVar2 = zzhbVar;
            }
            return new com.google.android.gms.internal.measurement.zzgs<>(iArr3, objArr, iCharAt, i3, zzhbVar2.zzc(), z2, false, iArr, i5, i63, zzgwVar, zzfyVar, zzhvVar, zzesVar, zzghVar);
        }
        ((com.google.android.gms.internal.measurement.zzhs) zzgmVar).zza();
        int i97 = com.google.android.gms.internal.measurement.zzfd.zze.zzi;
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

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final T zza() {
        return (T) this.zzo.zza(this.zzg);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c1  */
    @Override // com.google.android.gms.internal.measurement.zzhd
    public final boolean zza(T t, T t2) {
        int length = this.zzc.length;
        int i = 0;
        while (true) {
            boolean zZza = true;
            if (i < length) {
                int iZzd = zzd(i);
                long j = iZzd & 1048575;
                switch ((iZzd & 267386880) >>> 20) {
                    case 0:
                        if (!zzc(t, t2, i) || java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzib.zze(t, j)) != java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzib.zze(t2, j))) {
                            zZza = false;
                        }
                        break;
                    case 1:
                        if (!zzc(t, t2, i) || java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzib.zzd(t, j)) != java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzib.zzd(t2, j))) {
                            zZza = false;
                        }
                        break;
                    case 2:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zzb(t, j) != com.google.android.gms.internal.measurement.zzib.zzb(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 3:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zzb(t, j) != com.google.android.gms.internal.measurement.zzib.zzb(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 4:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zza(t, j) != com.google.android.gms.internal.measurement.zzib.zza(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 5:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zzb(t, j) != com.google.android.gms.internal.measurement.zzib.zzb(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 6:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zza(t, j) != com.google.android.gms.internal.measurement.zzib.zza(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 7:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zzc(t, j) != com.google.android.gms.internal.measurement.zzib.zzc(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 8:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.measurement.zzhf.zza(com.google.android.gms.internal.measurement.zzib.zzf(t, j), com.google.android.gms.internal.measurement.zzib.zzf(t2, j))) {
                            zZza = false;
                        }
                        break;
                    case 9:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.measurement.zzhf.zza(com.google.android.gms.internal.measurement.zzib.zzf(t, j), com.google.android.gms.internal.measurement.zzib.zzf(t2, j))) {
                            zZza = false;
                        }
                        break;
                    case 10:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.measurement.zzhf.zza(com.google.android.gms.internal.measurement.zzib.zzf(t, j), com.google.android.gms.internal.measurement.zzib.zzf(t2, j))) {
                            zZza = false;
                        }
                        break;
                    case 11:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zza(t, j) != com.google.android.gms.internal.measurement.zzib.zza(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 12:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zza(t, j) != com.google.android.gms.internal.measurement.zzib.zza(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 13:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zza(t, j) != com.google.android.gms.internal.measurement.zzib.zza(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 14:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zzb(t, j) != com.google.android.gms.internal.measurement.zzib.zzb(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 15:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zza(t, j) != com.google.android.gms.internal.measurement.zzib.zza(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 16:
                        if (!zzc(t, t2, i) || com.google.android.gms.internal.measurement.zzib.zzb(t, j) != com.google.android.gms.internal.measurement.zzib.zzb(t2, j)) {
                            zZza = false;
                        }
                        break;
                    case 17:
                        if (!zzc(t, t2, i) || !com.google.android.gms.internal.measurement.zzhf.zza(com.google.android.gms.internal.measurement.zzib.zzf(t, j), com.google.android.gms.internal.measurement.zzib.zzf(t2, j))) {
                            zZza = false;
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
                        zZza = com.google.android.gms.internal.measurement.zzhf.zza(com.google.android.gms.internal.measurement.zzib.zzf(t, j), com.google.android.gms.internal.measurement.zzib.zzf(t2, j));
                        break;
                    case 50:
                        zZza = com.google.android.gms.internal.measurement.zzhf.zza(com.google.android.gms.internal.measurement.zzib.zzf(t, j), com.google.android.gms.internal.measurement.zzib.zzf(t2, j));
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
                        long jZze = zze(i) & 1048575;
                        if (com.google.android.gms.internal.measurement.zzib.zza(t, jZze) != com.google.android.gms.internal.measurement.zzib.zza(t2, jZze) || !com.google.android.gms.internal.measurement.zzhf.zza(com.google.android.gms.internal.measurement.zzib.zzf(t, j), com.google.android.gms.internal.measurement.zzib.zzf(t2, j))) {
                            zZza = false;
                        }
                        break;
                }
                if (!zZza) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzq.zzb(t).equals(this.zzq.zzb(t2))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzr.zza(t).equals(this.zzr.zza(t2));
                }
                return true;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final int zza(T t) {
        int i;
        int iZza;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzd = zzd(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzd;
            int iHashCode = 37;
            switch ((iZzd & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzff.zza(java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzib.zze(t, j)));
                    i2 = i + iZza;
                    break;
                case 1:
                    i = i2 * 53;
                    iZza = java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzib.zzd(t, j));
                    i2 = i + iZza;
                    break;
                case 2:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzff.zza(com.google.android.gms.internal.measurement.zzib.zzb(t, j));
                    i2 = i + iZza;
                    break;
                case 3:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzff.zza(com.google.android.gms.internal.measurement.zzib.zzb(t, j));
                    i2 = i + iZza;
                    break;
                case 4:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzib.zza(t, j);
                    i2 = i + iZza;
                    break;
                case 5:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzff.zza(com.google.android.gms.internal.measurement.zzib.zzb(t, j));
                    i2 = i + iZza;
                    break;
                case 6:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzib.zza(t, j);
                    i2 = i + iZza;
                    break;
                case 7:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzff.zza(com.google.android.gms.internal.measurement.zzib.zzc(t, j));
                    i2 = i + iZza;
                    break;
                case 8:
                    i = i2 * 53;
                    iZza = ((java.lang.String) com.google.android.gms.internal.measurement.zzib.zzf(t, j)).hashCode();
                    i2 = i + iZza;
                    break;
                case 9:
                    java.lang.Object objZzf = com.google.android.gms.internal.measurement.zzib.zzf(t, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzib.zzf(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 11:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzib.zza(t, j);
                    i2 = i + iZza;
                    break;
                case 12:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzib.zza(t, j);
                    i2 = i + iZza;
                    break;
                case 13:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzib.zza(t, j);
                    i2 = i + iZza;
                    break;
                case 14:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzff.zza(com.google.android.gms.internal.measurement.zzib.zzb(t, j));
                    i2 = i + iZza;
                    break;
                case 15:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzib.zza(t, j);
                    i2 = i + iZza;
                    break;
                case 16:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzff.zza(com.google.android.gms.internal.measurement.zzib.zzb(t, j));
                    i2 = i + iZza;
                    break;
                case 17:
                    java.lang.Object objZzf2 = com.google.android.gms.internal.measurement.zzib.zzf(t, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
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
                    iZza = com.google.android.gms.internal.measurement.zzib.zzf(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 50:
                    i = i2 * 53;
                    iZza = com.google.android.gms.internal.measurement.zzib.zzf(t, j).hashCode();
                    i2 = i + iZza;
                    break;
                case 51:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = com.google.android.gms.internal.measurement.zzff.zza(java.lang.Double.doubleToLongBits(zzb(t, j)));
                        i2 = i + iZza;
                    }
                    break;
                case 52:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = java.lang.Float.floatToIntBits(zzc(t, j));
                        i2 = i + iZza;
                    }
                    break;
                case 53:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = com.google.android.gms.internal.measurement.zzff.zza(zze(t, j));
                        i2 = i + iZza;
                    }
                    break;
                case 54:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = com.google.android.gms.internal.measurement.zzff.zza(zze(t, j));
                        i2 = i + iZza;
                    }
                    break;
                case 55:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzd(t, j);
                        i2 = i + iZza;
                    }
                    break;
                case 56:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = com.google.android.gms.internal.measurement.zzff.zza(zze(t, j));
                        i2 = i + iZza;
                    }
                    break;
                case 57:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzd(t, j);
                        i2 = i + iZza;
                    }
                    break;
                case 58:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = com.google.android.gms.internal.measurement.zzff.zza(zzf(t, j));
                        i2 = i + iZza;
                    }
                    break;
                case 59:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = ((java.lang.String) com.google.android.gms.internal.measurement.zzib.zzf(t, j)).hashCode();
                        i2 = i + iZza;
                    }
                    break;
                case 60:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = com.google.android.gms.internal.measurement.zzib.zzf(t, j).hashCode();
                        i2 = i + iZza;
                    }
                    break;
                case 61:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = com.google.android.gms.internal.measurement.zzib.zzf(t, j).hashCode();
                        i2 = i + iZza;
                    }
                    break;
                case 62:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzd(t, j);
                        i2 = i + iZza;
                    }
                    break;
                case 63:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzd(t, j);
                        i2 = i + iZza;
                    }
                    break;
                case 64:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzd(t, j);
                        i2 = i + iZza;
                    }
                    break;
                case 65:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = com.google.android.gms.internal.measurement.zzff.zza(zze(t, j));
                        i2 = i + iZza;
                    }
                    break;
                case 66:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = zzd(t, j);
                        i2 = i + iZza;
                    }
                    break;
                case 67:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = com.google.android.gms.internal.measurement.zzff.zza(zze(t, j));
                        i2 = i + iZza;
                    }
                    break;
                case 68:
                    if (zza(t, i4, i3)) {
                        i = i2 * 53;
                        iZza = com.google.android.gms.internal.measurement.zzib.zzf(t, j).hashCode();
                        i2 = i + iZza;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzq.zzb(t).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzr.zza(t).hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zzb(T t, T t2) {
        java.util.Objects.requireNonNull(t2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzd = zzd(i);
            long j = 1048575 & iZzd;
            int i2 = this.zzc[i];
            switch ((iZzd & 267386880) >>> 20) {
                case 0:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza(t, j, com.google.android.gms.internal.measurement.zzib.zze(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 1:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zzd(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 2:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zzb(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 3:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zzb(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 4:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zza(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 5:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zzb(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 6:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zza(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 7:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza(t, j, com.google.android.gms.internal.measurement.zzib.zzc(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 8:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza(t, j, com.google.android.gms.internal.measurement.zzib.zzf(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza(t, j, com.google.android.gms.internal.measurement.zzib.zzf(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 11:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zza(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 12:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zza(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 13:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zza(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 14:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zzb(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 15:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zza(t2, j));
                        zzb((java.lang.Object) t, i);
                    }
                    break;
                case 16:
                    if (zza((java.lang.Object) t2, i)) {
                        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zzb(t2, j));
                        zzb((java.lang.Object) t, i);
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
                    this.zzp.zza(t, t2, j);
                    break;
                case 50:
                    com.google.android.gms.internal.measurement.zzhf.zza(this.zzs, t, t2, j);
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
                        com.google.android.gms.internal.measurement.zzib.zza(t, j, com.google.android.gms.internal.measurement.zzib.zzf(t2, j));
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
                        com.google.android.gms.internal.measurement.zzib.zza(t, j, com.google.android.gms.internal.measurement.zzib.zzf(t2, j));
                        zzb(t, i2, i);
                    }
                    break;
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        com.google.android.gms.internal.measurement.zzhf.zza(this.zzq, t, t2);
        if (this.zzh) {
            com.google.android.gms.internal.measurement.zzhf.zza(this.zzr, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long jZzd = zzd(i) & 1048575;
        if (zza((java.lang.Object) t2, i)) {
            java.lang.Object objZzf = com.google.android.gms.internal.measurement.zzib.zzf(t, jZzd);
            java.lang.Object objZzf2 = com.google.android.gms.internal.measurement.zzib.zzf(t2, jZzd);
            if (objZzf != null && objZzf2 != null) {
                com.google.android.gms.internal.measurement.zzib.zza(t, jZzd, com.google.android.gms.internal.measurement.zzff.zza(objZzf, objZzf2));
                zzb((java.lang.Object) t, i);
            } else if (objZzf2 != null) {
                com.google.android.gms.internal.measurement.zzib.zza(t, jZzd, objZzf2);
                zzb((java.lang.Object) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int iZzd = zzd(i);
        int i2 = this.zzc[i];
        long j = iZzd & 1048575;
        if (zza(t2, i2, i)) {
            java.lang.Object objZzf = com.google.android.gms.internal.measurement.zzib.zzf(t, j);
            java.lang.Object objZzf2 = com.google.android.gms.internal.measurement.zzib.zzf(t2, j);
            if (objZzf != null && objZzf2 != null) {
                com.google.android.gms.internal.measurement.zzib.zza(t, j, com.google.android.gms.internal.measurement.zzff.zza(objZzf, objZzf2));
                zzb(t, i2, i);
            } else if (objZzf2 != null) {
                com.google.android.gms.internal.measurement.zzib.zza(t, j, objZzf2);
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
    @Override // com.google.android.gms.internal.measurement.zzhd
    public final int zzb(T t) {
        int i;
        int i2;
        long j;
        int iZzd;
        int iZzb;
        int iZzj;
        int iZzh;
        int iZzi;
        int iZze;
        int iZzg;
        int iZzb2;
        int iZzi2;
        int iZze2;
        int iZzg2;
        int i3 = 267386880;
        int i4 = 1;
        if (this.zzj) {
            sun.misc.Unsafe unsafe = zzb;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zzc.length) {
                int iZzd2 = zzd(i5);
                int i7 = (iZzd2 & i3) >>> 20;
                int i8 = this.zzc[i5];
                long j2 = iZzd2 & 1048575;
                int i9 = (i7 < com.google.android.gms.internal.measurement.zzex.DOUBLE_LIST_PACKED.zza() || i7 > com.google.android.gms.internal.measurement.zzex.SINT64_LIST_PACKED.zza()) ? 0 : this.zzc[i5 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzb(i8, 0.0d);
                            i6 += iZzb2;
                        }
                        break;
                    case 1:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzb(i8, 0.0f);
                            i6 += iZzb2;
                        }
                        break;
                    case 2:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzd(i8, com.google.android.gms.internal.measurement.zzib.zzb(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 3:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zze(i8, com.google.android.gms.internal.measurement.zzib.zzb(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 4:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzf(i8, com.google.android.gms.internal.measurement.zzib.zza(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 5:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzg(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 6:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzi(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 7:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzb(i8, true);
                            i6 += iZzb2;
                        }
                        break;
                    case 8:
                        if (zza((java.lang.Object) t, i5)) {
                            java.lang.Object objZzf = com.google.android.gms.internal.measurement.zzib.zzf(t, j2);
                            if (objZzf instanceof com.google.android.gms.internal.measurement.zzdu) {
                                iZzb2 = com.google.android.gms.internal.measurement.zzen.zzc(i8, (com.google.android.gms.internal.measurement.zzdu) objZzf);
                            } else {
                                iZzb2 = com.google.android.gms.internal.measurement.zzen.zzb(i8, (java.lang.String) objZzf);
                            }
                            i6 += iZzb2;
                        }
                        break;
                    case 9:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzhf.zza(i8, com.google.android.gms.internal.measurement.zzib.zzf(t, j2), zza(i5));
                            i6 += iZzb2;
                        }
                        break;
                    case 10:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzc(i8, (com.google.android.gms.internal.measurement.zzdu) com.google.android.gms.internal.measurement.zzib.zzf(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 11:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzg(i8, com.google.android.gms.internal.measurement.zzib.zza(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 12:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzk(i8, com.google.android.gms.internal.measurement.zzib.zza(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 13:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzj(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 14:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzh(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 15:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzh(i8, com.google.android.gms.internal.measurement.zzib.zza(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 16:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzf(i8, com.google.android.gms.internal.measurement.zzib.zzb(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 17:
                        if (zza((java.lang.Object) t, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzc(i8, (com.google.android.gms.internal.measurement.zzgo) com.google.android.gms.internal.measurement.zzib.zzf(t, j2), zza(i5));
                            i6 += iZzb2;
                        }
                        break;
                    case 18:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzi(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 19:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzh(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 20:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zza(i8, (java.util.List<java.lang.Long>) zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 21:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzb(i8, (java.util.List<java.lang.Long>) zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 22:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zze(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 23:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzi(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 24:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzh(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 25:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzj(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 26:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zza(i8, zza(t, j2));
                        i6 += iZzb2;
                        break;
                    case 27:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zza(i8, zza(t, j2), zza(i5));
                        i6 += iZzb2;
                        break;
                    case 28:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzb(i8, zza(t, j2));
                        i6 += iZzb2;
                        break;
                    case 29:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzf(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 30:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzd(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 31:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzh(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 32:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzi(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 33:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzg(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 34:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzc(i8, zza(t, j2), false);
                        i6 += iZzb2;
                        break;
                    case 35:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 36:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzh((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 37:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zza((java.util.List<java.lang.Long>) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 38:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzb((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 39:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zze((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 40:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 41:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzh((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 42:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzj((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 43:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzf((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 44:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzd((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 45:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzh((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 46:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 47:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzg((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 48:
                        iZzi2 = com.google.android.gms.internal.measurement.zzhf.zzc((java.util.List) unsafe.getObject(t, j2));
                        if (iZzi2 > 0) {
                            if (this.zzk) {
                                unsafe.putInt(t, i9, iZzi2);
                            }
                            iZze2 = com.google.android.gms.internal.measurement.zzen.zze(i8);
                            iZzg2 = com.google.android.gms.internal.measurement.zzen.zzg(iZzi2);
                            iZzb2 = iZze2 + iZzg2 + iZzi2;
                            i6 += iZzb2;
                        }
                        break;
                    case 49:
                        iZzb2 = com.google.android.gms.internal.measurement.zzhf.zzb(i8, (java.util.List<com.google.android.gms.internal.measurement.zzgo>) zza(t, j2), zza(i5));
                        i6 += iZzb2;
                        break;
                    case 50:
                        iZzb2 = this.zzs.zza(i8, com.google.android.gms.internal.measurement.zzib.zzf(t, j2), zzb(i5));
                        i6 += iZzb2;
                        break;
                    case 51:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzb(i8, 0.0d);
                            i6 += iZzb2;
                        }
                        break;
                    case 52:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzb(i8, 0.0f);
                            i6 += iZzb2;
                        }
                        break;
                    case 53:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzd(i8, zze(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 54:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zze(i8, zze(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 55:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzf(i8, zzd(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 56:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzg(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 57:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzi(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 58:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzb(i8, true);
                            i6 += iZzb2;
                        }
                        break;
                    case 59:
                        if (zza(t, i8, i5)) {
                            java.lang.Object objZzf2 = com.google.android.gms.internal.measurement.zzib.zzf(t, j2);
                            if (objZzf2 instanceof com.google.android.gms.internal.measurement.zzdu) {
                                iZzb2 = com.google.android.gms.internal.measurement.zzen.zzc(i8, (com.google.android.gms.internal.measurement.zzdu) objZzf2);
                            } else {
                                iZzb2 = com.google.android.gms.internal.measurement.zzen.zzb(i8, (java.lang.String) objZzf2);
                            }
                            i6 += iZzb2;
                        }
                        break;
                    case 60:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzhf.zza(i8, com.google.android.gms.internal.measurement.zzib.zzf(t, j2), zza(i5));
                            i6 += iZzb2;
                        }
                        break;
                    case 61:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzc(i8, (com.google.android.gms.internal.measurement.zzdu) com.google.android.gms.internal.measurement.zzib.zzf(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 62:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzg(i8, zzd(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 63:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzk(i8, zzd(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 64:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzj(i8, 0);
                            i6 += iZzb2;
                        }
                        break;
                    case 65:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzh(i8, 0L);
                            i6 += iZzb2;
                        }
                        break;
                    case 66:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzh(i8, zzd(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 67:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzf(i8, zze(t, j2));
                            i6 += iZzb2;
                        }
                        break;
                    case 68:
                        if (zza(t, i8, i5)) {
                            iZzb2 = com.google.android.gms.internal.measurement.zzen.zzc(i8, (com.google.android.gms.internal.measurement.zzgo) com.google.android.gms.internal.measurement.zzib.zzf(t, j2), zza(i5));
                            i6 += iZzb2;
                        }
                        break;
                }
                i5 += 3;
                i3 = 267386880;
            }
            return i6 + zza((com.google.android.gms.internal.measurement.zzhv) this.zzq, (java.lang.Object) t);
        }
        sun.misc.Unsafe unsafe2 = zzb;
        int i10 = -1;
        int i11 = 0;
        int iZzb3 = 0;
        int i12 = 0;
        while (i11 < this.zzc.length) {
            int iZzd3 = zzd(i11);
            int[] iArr = this.zzc;
            int i13 = iArr[i11];
            int i14 = (iZzd3 & 267386880) >>> 20;
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
                i = (!this.zzk || i14 < com.google.android.gms.internal.measurement.zzex.DOUBLE_LIST_PACKED.zza() || i14 > com.google.android.gms.internal.measurement.zzex.SINT64_LIST_PACKED.zza()) ? 0 : this.zzc[i11 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = iZzd3 & 1048575;
            switch (i14) {
                case 0:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.measurement.zzen.zzb(i13, 0.0d);
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.measurement.zzen.zzb(i13, 0.0f);
                    }
                    break;
                case 2:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.measurement.zzen.zzd(i13, unsafe2.getLong(t, j3));
                        iZzb3 += iZzd;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.measurement.zzen.zze(i13, unsafe2.getLong(t, j3));
                        iZzb3 += iZzd;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.measurement.zzen.zzf(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzd;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i12 & i2) != 0) {
                        iZzd = com.google.android.gms.internal.measurement.zzen.zzg(i13, 0L);
                        iZzb3 += iZzd;
                    }
                    break;
                case 6:
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.measurement.zzen.zzi(i13, 0);
                    }
                    j = 0;
                    break;
                case 7:
                    if ((i12 & i2) != 0) {
                        iZzb3 += com.google.android.gms.internal.measurement.zzen.zzb(i13, true);
                    }
                    j = 0;
                    break;
                case 8:
                    if ((i12 & i2) != 0) {
                        java.lang.Object object = unsafe2.getObject(t, j3);
                        if (object instanceof com.google.android.gms.internal.measurement.zzdu) {
                            iZzb = com.google.android.gms.internal.measurement.zzen.zzc(i13, (com.google.android.gms.internal.measurement.zzdu) object);
                        } else {
                            iZzb = com.google.android.gms.internal.measurement.zzen.zzb(i13, (java.lang.String) object);
                        }
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.measurement.zzhf.zza(i13, unsafe2.getObject(t, j3), zza(i11));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzc(i13, (com.google.android.gms.internal.measurement.zzdu) unsafe2.getObject(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzg(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzk(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i12 & i2) != 0) {
                        iZzj = com.google.android.gms.internal.measurement.zzen.zzj(i13, 0);
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzh(i13, 0L);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzh(i13, unsafe2.getInt(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzf(i13, unsafe2.getLong(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i12 & i2) != 0) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzc(i13, (com.google.android.gms.internal.measurement.zzgo) unsafe2.getObject(t, j3), zza(i11));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 18:
                    iZzb = com.google.android.gms.internal.measurement.zzhf.zzi(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 19:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zzh(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 20:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zza(i13, (java.util.List<java.lang.Long>) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 21:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zzb(i13, (java.util.List<java.lang.Long>) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 22:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zze(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 23:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zzi(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 24:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zzh(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 25:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zzj(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 26:
                    iZzb = com.google.android.gms.internal.measurement.zzhf.zza(i13, (java.util.List<?>) unsafe2.getObject(t, j3));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 27:
                    iZzb = com.google.android.gms.internal.measurement.zzhf.zza(i13, (java.util.List<?>) unsafe2.getObject(t, j3), zza(i11));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 28:
                    iZzb = com.google.android.gms.internal.measurement.zzhf.zzb(i13, (java.util.List) unsafe2.getObject(t, j3));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 29:
                    iZzb = com.google.android.gms.internal.measurement.zzhf.zzf(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 30:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zzd(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 31:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zzh(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 32:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zzi(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 33:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zzg(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 34:
                    iZzh = com.google.android.gms.internal.measurement.zzhf.zzc(i13, (java.util.List) unsafe2.getObject(t, j3), false);
                    iZzb3 += iZzh;
                    j = 0;
                    break;
                case 35:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 36:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzh((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 37:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zza((java.util.List<java.lang.Long>) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 38:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzb((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 39:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zze((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 40:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 41:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzh((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 42:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzj((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 43:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzf((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 44:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzd((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 45:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzh((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 46:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 47:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzg((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 48:
                    iZzi = com.google.android.gms.internal.measurement.zzhf.zzc((java.util.List) unsafe2.getObject(t, j3));
                    if (iZzi > 0) {
                        if (this.zzk) {
                            unsafe2.putInt(t, i, iZzi);
                        }
                        iZze = com.google.android.gms.internal.measurement.zzen.zze(i13);
                        iZzg = com.google.android.gms.internal.measurement.zzen.zzg(iZzi);
                        iZzj = iZze + iZzg + iZzi;
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 49:
                    iZzb = com.google.android.gms.internal.measurement.zzhf.zzb(i13, (java.util.List<com.google.android.gms.internal.measurement.zzgo>) unsafe2.getObject(t, j3), zza(i11));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 50:
                    iZzb = this.zzs.zza(i13, unsafe2.getObject(t, j3), zzb(i11));
                    iZzb3 += iZzb;
                    j = 0;
                    break;
                case 51:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzb(i13, 0.0d);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza(t, i13, i11)) {
                        iZzj = com.google.android.gms.internal.measurement.zzen.zzb(i13, 0.0f);
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzd(i13, zze(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zze(i13, zze(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzf(i13, zzd(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzg(i13, 0L);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza(t, i13, i11)) {
                        iZzj = com.google.android.gms.internal.measurement.zzen.zzi(i13, 0);
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza(t, i13, i11)) {
                        iZzj = com.google.android.gms.internal.measurement.zzen.zzb(i13, true);
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza(t, i13, i11)) {
                        java.lang.Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof com.google.android.gms.internal.measurement.zzdu) {
                            iZzb = com.google.android.gms.internal.measurement.zzen.zzc(i13, (com.google.android.gms.internal.measurement.zzdu) object2);
                        } else {
                            iZzb = com.google.android.gms.internal.measurement.zzen.zzb(i13, (java.lang.String) object2);
                        }
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzhf.zza(i13, unsafe2.getObject(t, j3), zza(i11));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzc(i13, (com.google.android.gms.internal.measurement.zzdu) unsafe2.getObject(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzg(i13, zzd(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzk(i13, zzd(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza(t, i13, i11)) {
                        iZzj = com.google.android.gms.internal.measurement.zzen.zzj(i13, 0);
                        iZzb3 += iZzj;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzh(i13, 0L);
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzh(i13, zzd(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzf(i13, zze(t, j3));
                        iZzb3 += iZzb;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza(t, i13, i11)) {
                        iZzb = com.google.android.gms.internal.measurement.zzen.zzc(i13, (com.google.android.gms.internal.measurement.zzgo) unsafe2.getObject(t, j3), zza(i11));
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
        int iZza = 0;
        int iZza2 = iZzb3 + zza((com.google.android.gms.internal.measurement.zzhv) this.zzq, (java.lang.Object) t);
        if (!this.zzh) {
            return iZza2;
        }
        com.google.android.gms.internal.measurement.zzew<T> zzewVarZza = this.zzr.zza(t);
        for (int i17 = 0; i17 < zzewVarZza.zza.zzc(); i17++) {
            java.util.Map.Entry entryZzb = zzewVarZza.zza.zzb(i17);
            iZza += com.google.android.gms.internal.measurement.zzew.zza((com.google.android.gms.internal.measurement.zzey<?>) entryZzb.getKey(), entryZzb.getValue());
        }
        for (java.util.Map.Entry entry : zzewVarZza.zza.zzd()) {
            iZza += com.google.android.gms.internal.measurement.zzew.zza((com.google.android.gms.internal.measurement.zzey<?>) entry.getKey(), entry.getValue());
        }
        return iZza2 + iZza;
    }

    private static <UT, UB> int zza(com.google.android.gms.internal.measurement.zzhv<UT, UB> zzhvVar, T t) {
        return zzhvVar.zzf(zzhvVar.zzb(t));
    }

    private static java.util.List<?> zza(java.lang.Object obj, long j) {
        return (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(obj, j);
    }

    /* JADX WARN: Code duplicated, block: B:178:0x054a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zza(T t, com.google.android.gms.internal.measurement.zzis zzisVar) throws java.io.IOException {
        java.util.Iterator itZzd;
        java.util.Map.Entry<?, ?> entry;
        java.util.Iterator itZze;
        java.util.Map.Entry<?, ?> entry2;
        if (zzisVar.zza() == com.google.android.gms.internal.measurement.zzfd.zze.zzk) {
            zza(this.zzq, t, zzisVar);
            if (this.zzh) {
                com.google.android.gms.internal.measurement.zzew<T> zzewVarZza = this.zzr.zza(t);
                if (zzewVarZza.zza.isEmpty()) {
                    itZze = null;
                    entry2 = null;
                } else {
                    itZze = zzewVarZza.zze();
                    entry2 = (java.util.Map.Entry) itZze.next();
                }
            } else {
                itZze = null;
                entry2 = null;
            }
            for (int length = this.zzc.length - 3; length >= 0; length -= 3) {
                int iZzd = zzd(length);
                int i = this.zzc[length];
                while (entry2 != null && this.zzr.zza(entry2) > i) {
                    this.zzr.zza(zzisVar, entry2);
                    entry2 = itZze.hasNext() ? (java.util.Map.Entry) itZze.next() : null;
                }
                switch ((iZzd & 267386880) >>> 20) {
                    case 0:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zza(i, com.google.android.gms.internal.measurement.zzib.zze(t, iZzd & 1048575));
                        }
                        break;
                    case 1:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zza(i, com.google.android.gms.internal.measurement.zzib.zzd(t, iZzd & 1048575));
                        }
                        break;
                    case 2:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zza(i, com.google.android.gms.internal.measurement.zzib.zzb(t, iZzd & 1048575));
                        }
                        break;
                    case 3:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zzc(i, com.google.android.gms.internal.measurement.zzib.zzb(t, iZzd & 1048575));
                        }
                        break;
                    case 4:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zzc(i, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575));
                        }
                        break;
                    case 5:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zzd(i, com.google.android.gms.internal.measurement.zzib.zzb(t, iZzd & 1048575));
                        }
                        break;
                    case 6:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zzd(i, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575));
                        }
                        break;
                    case 7:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zza(i, com.google.android.gms.internal.measurement.zzib.zzc(t, iZzd & 1048575));
                        }
                        break;
                    case 8:
                        if (zza((java.lang.Object) t, length)) {
                            zza(i, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar);
                        }
                        break;
                    case 9:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zza(i, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zza(length));
                        }
                        break;
                    case 10:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zza(i, (com.google.android.gms.internal.measurement.zzdu) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575));
                        }
                        break;
                    case 11:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zze(i, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575));
                        }
                        break;
                    case 12:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zzb(i, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575));
                        }
                        break;
                    case 13:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zza(i, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575));
                        }
                        break;
                    case 14:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zzb(i, com.google.android.gms.internal.measurement.zzib.zzb(t, iZzd & 1048575));
                        }
                        break;
                    case 15:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zzf(i, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575));
                        }
                        break;
                    case 16:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zze(i, com.google.android.gms.internal.measurement.zzib.zzb(t, iZzd & 1048575));
                        }
                        break;
                    case 17:
                        if (zza((java.lang.Object) t, length)) {
                            zzisVar.zzb(i, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zza(length));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[length], (java.util.List<java.lang.Double>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 19:
                        com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[length], (java.util.List<java.lang.Float>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 20:
                        com.google.android.gms.internal.measurement.zzhf.zzc(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 21:
                        com.google.android.gms.internal.measurement.zzhf.zzd(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 22:
                        com.google.android.gms.internal.measurement.zzhf.zzh(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 23:
                        com.google.android.gms.internal.measurement.zzhf.zzf(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 24:
                        com.google.android.gms.internal.measurement.zzhf.zzk(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 25:
                        com.google.android.gms.internal.measurement.zzhf.zzn(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 26:
                        com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[length], (java.util.List<java.lang.String>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar);
                        break;
                    case 27:
                        com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[length], (java.util.List<?>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, zza(length));
                        break;
                    case 28:
                        com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[length], (java.util.List<com.google.android.gms.internal.measurement.zzdu>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar);
                        break;
                    case 29:
                        com.google.android.gms.internal.measurement.zzhf.zzi(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 30:
                        com.google.android.gms.internal.measurement.zzhf.zzm(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 31:
                        com.google.android.gms.internal.measurement.zzhf.zzl(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 32:
                        com.google.android.gms.internal.measurement.zzhf.zzg(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 33:
                        com.google.android.gms.internal.measurement.zzhf.zzj(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 34:
                        com.google.android.gms.internal.measurement.zzhf.zze(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, false);
                        break;
                    case 35:
                        com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[length], (java.util.List<java.lang.Double>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 36:
                        com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[length], (java.util.List<java.lang.Float>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 37:
                        com.google.android.gms.internal.measurement.zzhf.zzc(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 38:
                        com.google.android.gms.internal.measurement.zzhf.zzd(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 39:
                        com.google.android.gms.internal.measurement.zzhf.zzh(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 40:
                        com.google.android.gms.internal.measurement.zzhf.zzf(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 41:
                        com.google.android.gms.internal.measurement.zzhf.zzk(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 42:
                        com.google.android.gms.internal.measurement.zzhf.zzn(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 43:
                        com.google.android.gms.internal.measurement.zzhf.zzi(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 44:
                        com.google.android.gms.internal.measurement.zzhf.zzm(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 45:
                        com.google.android.gms.internal.measurement.zzhf.zzl(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 46:
                        com.google.android.gms.internal.measurement.zzhf.zzg(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 47:
                        com.google.android.gms.internal.measurement.zzhf.zzj(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 48:
                        com.google.android.gms.internal.measurement.zzhf.zze(this.zzc[length], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, true);
                        break;
                    case 49:
                        com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[length], (java.util.List<?>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar, zza(length));
                        break;
                    case 50:
                        zza(zzisVar, i, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), length);
                        break;
                    case 51:
                        if (zza(t, i, length)) {
                            zzisVar.zza(i, zzb(t, iZzd & 1048575));
                        }
                        break;
                    case 52:
                        if (zza(t, i, length)) {
                            zzisVar.zza(i, zzc(t, iZzd & 1048575));
                        }
                        break;
                    case 53:
                        if (zza(t, i, length)) {
                            zzisVar.zza(i, zze(t, iZzd & 1048575));
                        }
                        break;
                    case 54:
                        if (zza(t, i, length)) {
                            zzisVar.zzc(i, zze(t, iZzd & 1048575));
                        }
                        break;
                    case 55:
                        if (zza(t, i, length)) {
                            zzisVar.zzc(i, zzd(t, iZzd & 1048575));
                        }
                        break;
                    case 56:
                        if (zza(t, i, length)) {
                            zzisVar.zzd(i, zze(t, iZzd & 1048575));
                        }
                        break;
                    case 57:
                        if (zza(t, i, length)) {
                            zzisVar.zzd(i, zzd(t, iZzd & 1048575));
                        }
                        break;
                    case 58:
                        if (zza(t, i, length)) {
                            zzisVar.zza(i, zzf(t, iZzd & 1048575));
                        }
                        break;
                    case 59:
                        if (zza(t, i, length)) {
                            zza(i, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zzisVar);
                        }
                        break;
                    case 60:
                        if (zza(t, i, length)) {
                            zzisVar.zza(i, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zza(length));
                        }
                        break;
                    case 61:
                        if (zza(t, i, length)) {
                            zzisVar.zza(i, (com.google.android.gms.internal.measurement.zzdu) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575));
                        }
                        break;
                    case 62:
                        if (zza(t, i, length)) {
                            zzisVar.zze(i, zzd(t, iZzd & 1048575));
                        }
                        break;
                    case 63:
                        if (zza(t, i, length)) {
                            zzisVar.zzb(i, zzd(t, iZzd & 1048575));
                        }
                        break;
                    case 64:
                        if (zza(t, i, length)) {
                            zzisVar.zza(i, zzd(t, iZzd & 1048575));
                        }
                        break;
                    case 65:
                        if (zza(t, i, length)) {
                            zzisVar.zzb(i, zze(t, iZzd & 1048575));
                        }
                        break;
                    case 66:
                        if (zza(t, i, length)) {
                            zzisVar.zzf(i, zzd(t, iZzd & 1048575));
                        }
                        break;
                    case 67:
                        if (zza(t, i, length)) {
                            zzisVar.zze(i, zze(t, iZzd & 1048575));
                        }
                        break;
                    case 68:
                        if (zza(t, i, length)) {
                            zzisVar.zzb(i, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575), zza(length));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                this.zzr.zza(zzisVar, entry2);
                entry2 = itZze.hasNext() ? (java.util.Map.Entry) itZze.next() : null;
            }
            return;
        }
        if (this.zzj) {
            if (this.zzh) {
                com.google.android.gms.internal.measurement.zzew<T> zzewVarZza2 = this.zzr.zza(t);
                if (zzewVarZza2.zza.isEmpty()) {
                    itZzd = null;
                    entry = null;
                } else {
                    itZzd = zzewVarZza2.zzd();
                    entry = (java.util.Map.Entry) itZzd.next();
                }
            } else {
                itZzd = null;
                entry = null;
            }
            int length2 = this.zzc.length;
            for (int i2 = 0; i2 < length2; i2 += 3) {
                int iZzd2 = zzd(i2);
                int i3 = this.zzc[i2];
                while (entry != null && this.zzr.zza(entry) <= i3) {
                    this.zzr.zza(zzisVar, entry);
                    entry = itZzd.hasNext() ? (java.util.Map.Entry) itZzd.next() : null;
                }
                switch ((iZzd2 & 267386880) >>> 20) {
                    case 0:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zza(i3, com.google.android.gms.internal.measurement.zzib.zze(t, iZzd2 & 1048575));
                        }
                        break;
                    case 1:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zza(i3, com.google.android.gms.internal.measurement.zzib.zzd(t, iZzd2 & 1048575));
                        }
                        break;
                    case 2:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zza(i3, com.google.android.gms.internal.measurement.zzib.zzb(t, iZzd2 & 1048575));
                        }
                        break;
                    case 3:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zzc(i3, com.google.android.gms.internal.measurement.zzib.zzb(t, iZzd2 & 1048575));
                        }
                        break;
                    case 4:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zzc(i3, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd2 & 1048575));
                        }
                        break;
                    case 5:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zzd(i3, com.google.android.gms.internal.measurement.zzib.zzb(t, iZzd2 & 1048575));
                        }
                        break;
                    case 6:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zzd(i3, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd2 & 1048575));
                        }
                        break;
                    case 7:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zza(i3, com.google.android.gms.internal.measurement.zzib.zzc(t, iZzd2 & 1048575));
                        }
                        break;
                    case 8:
                        if (zza((java.lang.Object) t, i2)) {
                            zza(i3, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar);
                        }
                        break;
                    case 9:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zza(i3, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zza(i2));
                        }
                        break;
                    case 10:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zza(i3, (com.google.android.gms.internal.measurement.zzdu) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575));
                        }
                        break;
                    case 11:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zze(i3, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd2 & 1048575));
                        }
                        break;
                    case 12:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zzb(i3, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd2 & 1048575));
                        }
                        break;
                    case 13:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zza(i3, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd2 & 1048575));
                        }
                        break;
                    case 14:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zzb(i3, com.google.android.gms.internal.measurement.zzib.zzb(t, iZzd2 & 1048575));
                        }
                        break;
                    case 15:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zzf(i3, com.google.android.gms.internal.measurement.zzib.zza(t, iZzd2 & 1048575));
                        }
                        break;
                    case 16:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zze(i3, com.google.android.gms.internal.measurement.zzib.zzb(t, iZzd2 & 1048575));
                        }
                        break;
                    case 17:
                        if (zza((java.lang.Object) t, i2)) {
                            zzisVar.zzb(i3, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zza(i2));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[i2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 19:
                        com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[i2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 20:
                        com.google.android.gms.internal.measurement.zzhf.zzc(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 21:
                        com.google.android.gms.internal.measurement.zzhf.zzd(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 22:
                        com.google.android.gms.internal.measurement.zzhf.zzh(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 23:
                        com.google.android.gms.internal.measurement.zzhf.zzf(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 24:
                        com.google.android.gms.internal.measurement.zzhf.zzk(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 25:
                        com.google.android.gms.internal.measurement.zzhf.zzn(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 26:
                        com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[i2], (java.util.List<java.lang.String>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar);
                        break;
                    case 27:
                        com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[i2], (java.util.List<?>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, zza(i2));
                        break;
                    case 28:
                        com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[i2], (java.util.List<com.google.android.gms.internal.measurement.zzdu>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar);
                        break;
                    case 29:
                        com.google.android.gms.internal.measurement.zzhf.zzi(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 30:
                        com.google.android.gms.internal.measurement.zzhf.zzm(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 31:
                        com.google.android.gms.internal.measurement.zzhf.zzl(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 32:
                        com.google.android.gms.internal.measurement.zzhf.zzg(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 33:
                        com.google.android.gms.internal.measurement.zzhf.zzj(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 34:
                        com.google.android.gms.internal.measurement.zzhf.zze(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, false);
                        break;
                    case 35:
                        com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[i2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 36:
                        com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[i2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 37:
                        com.google.android.gms.internal.measurement.zzhf.zzc(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 38:
                        com.google.android.gms.internal.measurement.zzhf.zzd(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 39:
                        com.google.android.gms.internal.measurement.zzhf.zzh(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 40:
                        com.google.android.gms.internal.measurement.zzhf.zzf(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 41:
                        com.google.android.gms.internal.measurement.zzhf.zzk(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 42:
                        com.google.android.gms.internal.measurement.zzhf.zzn(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 43:
                        com.google.android.gms.internal.measurement.zzhf.zzi(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 44:
                        com.google.android.gms.internal.measurement.zzhf.zzm(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 45:
                        com.google.android.gms.internal.measurement.zzhf.zzl(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 46:
                        com.google.android.gms.internal.measurement.zzhf.zzg(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 47:
                        com.google.android.gms.internal.measurement.zzhf.zzj(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 48:
                        com.google.android.gms.internal.measurement.zzhf.zze(this.zzc[i2], (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, true);
                        break;
                    case 49:
                        com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[i2], (java.util.List<?>) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar, zza(i2));
                        break;
                    case 50:
                        zza(zzisVar, i3, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), i2);
                        break;
                    case 51:
                        if (zza(t, i3, i2)) {
                            zzisVar.zza(i3, zzb(t, iZzd2 & 1048575));
                        }
                        break;
                    case 52:
                        if (zza(t, i3, i2)) {
                            zzisVar.zza(i3, zzc(t, iZzd2 & 1048575));
                        }
                        break;
                    case 53:
                        if (zza(t, i3, i2)) {
                            zzisVar.zza(i3, zze(t, iZzd2 & 1048575));
                        }
                        break;
                    case 54:
                        if (zza(t, i3, i2)) {
                            zzisVar.zzc(i3, zze(t, iZzd2 & 1048575));
                        }
                        break;
                    case 55:
                        if (zza(t, i3, i2)) {
                            zzisVar.zzc(i3, zzd(t, iZzd2 & 1048575));
                        }
                        break;
                    case 56:
                        if (zza(t, i3, i2)) {
                            zzisVar.zzd(i3, zze(t, iZzd2 & 1048575));
                        }
                        break;
                    case 57:
                        if (zza(t, i3, i2)) {
                            zzisVar.zzd(i3, zzd(t, iZzd2 & 1048575));
                        }
                        break;
                    case 58:
                        if (zza(t, i3, i2)) {
                            zzisVar.zza(i3, zzf(t, iZzd2 & 1048575));
                        }
                        break;
                    case 59:
                        if (zza(t, i3, i2)) {
                            zza(i3, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zzisVar);
                        }
                        break;
                    case 60:
                        if (zza(t, i3, i2)) {
                            zzisVar.zza(i3, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zza(i2));
                        }
                        break;
                    case 61:
                        if (zza(t, i3, i2)) {
                            zzisVar.zza(i3, (com.google.android.gms.internal.measurement.zzdu) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575));
                        }
                        break;
                    case 62:
                        if (zza(t, i3, i2)) {
                            zzisVar.zze(i3, zzd(t, iZzd2 & 1048575));
                        }
                        break;
                    case 63:
                        if (zza(t, i3, i2)) {
                            zzisVar.zzb(i3, zzd(t, iZzd2 & 1048575));
                        }
                        break;
                    case 64:
                        if (zza(t, i3, i2)) {
                            zzisVar.zza(i3, zzd(t, iZzd2 & 1048575));
                        }
                        break;
                    case 65:
                        if (zza(t, i3, i2)) {
                            zzisVar.zzb(i3, zze(t, iZzd2 & 1048575));
                        }
                        break;
                    case 66:
                        if (zza(t, i3, i2)) {
                            zzisVar.zzf(i3, zzd(t, iZzd2 & 1048575));
                        }
                        break;
                    case 67:
                        if (zza(t, i3, i2)) {
                            zzisVar.zze(i3, zze(t, iZzd2 & 1048575));
                        }
                        break;
                    case 68:
                        if (zza(t, i3, i2)) {
                            zzisVar.zzb(i3, com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd2 & 1048575), zza(i2));
                        }
                        break;
                }
            }
            while (entry != null) {
                this.zzr.zza(zzisVar, entry);
                entry = itZzd.hasNext() ? (java.util.Map.Entry) itZzd.next() : null;
            }
            zza(this.zzq, t, zzisVar);
            return;
        }
        zzb((java.lang.Object) t, zzisVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    private final void zzb(T t, com.google.android.gms.internal.measurement.zzis zzisVar) throws java.io.IOException {
        java.util.Iterator itZzd;
        java.util.Map.Entry<?, ?> entry;
        int i;
        if (this.zzh) {
            com.google.android.gms.internal.measurement.zzew<T> zzewVarZza = this.zzr.zza(t);
            if (zzewVarZza.zza.isEmpty()) {
                itZzd = null;
                entry = null;
            } else {
                itZzd = zzewVarZza.zzd();
                entry = (java.util.Map.Entry) itZzd.next();
            }
        } else {
            itZzd = null;
            entry = null;
        }
        int i2 = -1;
        int length = this.zzc.length;
        sun.misc.Unsafe unsafe = zzb;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int iZzd = zzd(i3);
            int[] iArr = this.zzc;
            int i5 = iArr[i3];
            int i6 = (267386880 & iZzd) >>> 20;
            if (this.zzj || i6 > 17) {
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
            while (entry != null && this.zzr.zza(entry) <= i5) {
                this.zzr.zza(zzisVar, entry);
                entry = itZzd.hasNext() ? (java.util.Map.Entry) itZzd.next() : null;
            }
            long j = iZzd & 1048575;
            int i9 = i3;
            switch (i6) {
                case 0:
                    if ((i & i4) != 0) {
                        zzisVar.zza(i5, com.google.android.gms.internal.measurement.zzib.zze(t, j));
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 1:
                    if ((i & i4) != 0) {
                        zzisVar.zza(i5, com.google.android.gms.internal.measurement.zzib.zzd(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 2:
                    if ((i & i4) != 0) {
                        zzisVar.zza(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 3:
                    if ((i & i4) != 0) {
                        zzisVar.zzc(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 4:
                    if ((i & i4) != 0) {
                        zzisVar.zzc(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 5:
                    if ((i & i4) != 0) {
                        zzisVar.zzd(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 6:
                    if ((i & i4) != 0) {
                        zzisVar.zzd(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 7:
                    if ((i & i4) != 0) {
                        zzisVar.zza(i5, com.google.android.gms.internal.measurement.zzib.zzc(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 8:
                    if ((i & i4) != 0) {
                        zza(i5, unsafe.getObject(t, j), zzisVar);
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 9:
                    if ((i & i4) != 0) {
                        zzisVar.zza(i5, unsafe.getObject(t, j), zza(i9));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 10:
                    if ((i & i4) != 0) {
                        zzisVar.zza(i5, (com.google.android.gms.internal.measurement.zzdu) unsafe.getObject(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 11:
                    if ((i & i4) != 0) {
                        zzisVar.zze(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 12:
                    if ((i & i4) != 0) {
                        zzisVar.zzb(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 13:
                    if ((i & i4) != 0) {
                        zzisVar.zza(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 14:
                    if ((i & i4) != 0) {
                        zzisVar.zzb(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 15:
                    if ((i & i4) != 0) {
                        zzisVar.zzf(i5, unsafe.getInt(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 16:
                    if ((i & i4) != 0) {
                        zzisVar.zze(i5, unsafe.getLong(t, j));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 17:
                    if ((i & i4) != 0) {
                        zzisVar.zzb(i5, unsafe.getObject(t, j), zza(i9));
                    } else {
                        continue;
                    }
                    i3 = i9 + 3;
                    break;
                case 18:
                    com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[i9], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 19:
                    com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[i9], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 20:
                    com.google.android.gms.internal.measurement.zzhf.zzc(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 21:
                    com.google.android.gms.internal.measurement.zzhf.zzd(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 22:
                    com.google.android.gms.internal.measurement.zzhf.zzh(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 23:
                    com.google.android.gms.internal.measurement.zzhf.zzf(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 24:
                    com.google.android.gms.internal.measurement.zzhf.zzk(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 25:
                    com.google.android.gms.internal.measurement.zzhf.zzn(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 26:
                    com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[i9], (java.util.List<java.lang.String>) unsafe.getObject(t, j), zzisVar);
                    break;
                case 27:
                    com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[i9], (java.util.List<?>) unsafe.getObject(t, j), zzisVar, zza(i9));
                    break;
                case 28:
                    com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[i9], (java.util.List<com.google.android.gms.internal.measurement.zzdu>) unsafe.getObject(t, j), zzisVar);
                    break;
                case 29:
                    com.google.android.gms.internal.measurement.zzhf.zzi(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 30:
                    com.google.android.gms.internal.measurement.zzhf.zzm(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 31:
                    com.google.android.gms.internal.measurement.zzhf.zzl(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 32:
                    com.google.android.gms.internal.measurement.zzhf.zzg(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 33:
                    com.google.android.gms.internal.measurement.zzhf.zzj(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 34:
                    com.google.android.gms.internal.measurement.zzhf.zze(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, false);
                    continue;
                    i3 = i9 + 3;
                    break;
                case 35:
                    com.google.android.gms.internal.measurement.zzhf.zza(this.zzc[i9], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 36:
                    com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[i9], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 37:
                    com.google.android.gms.internal.measurement.zzhf.zzc(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 38:
                    com.google.android.gms.internal.measurement.zzhf.zzd(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 39:
                    com.google.android.gms.internal.measurement.zzhf.zzh(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 40:
                    com.google.android.gms.internal.measurement.zzhf.zzf(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 41:
                    com.google.android.gms.internal.measurement.zzhf.zzk(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 42:
                    com.google.android.gms.internal.measurement.zzhf.zzn(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 43:
                    com.google.android.gms.internal.measurement.zzhf.zzi(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 44:
                    com.google.android.gms.internal.measurement.zzhf.zzm(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 45:
                    com.google.android.gms.internal.measurement.zzhf.zzl(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 46:
                    com.google.android.gms.internal.measurement.zzhf.zzg(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 47:
                    com.google.android.gms.internal.measurement.zzhf.zzj(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 48:
                    com.google.android.gms.internal.measurement.zzhf.zze(this.zzc[i9], (java.util.List) unsafe.getObject(t, j), zzisVar, true);
                    break;
                case 49:
                    com.google.android.gms.internal.measurement.zzhf.zzb(this.zzc[i9], (java.util.List<?>) unsafe.getObject(t, j), zzisVar, zza(i9));
                    break;
                case 50:
                    zza(zzisVar, i5, unsafe.getObject(t, j), i9);
                    break;
                case 51:
                    if (zza(t, i5, i9)) {
                        zzisVar.zza(i5, zzb(t, j));
                    }
                    break;
                case 52:
                    if (zza(t, i5, i9)) {
                        zzisVar.zza(i5, zzc(t, j));
                    }
                    break;
                case 53:
                    if (zza(t, i5, i9)) {
                        zzisVar.zza(i5, zze(t, j));
                    }
                    break;
                case 54:
                    if (zza(t, i5, i9)) {
                        zzisVar.zzc(i5, zze(t, j));
                    }
                    break;
                case 55:
                    if (zza(t, i5, i9)) {
                        zzisVar.zzc(i5, zzd(t, j));
                    }
                    break;
                case 56:
                    if (zza(t, i5, i9)) {
                        zzisVar.zzd(i5, zze(t, j));
                    }
                    break;
                case 57:
                    if (zza(t, i5, i9)) {
                        zzisVar.zzd(i5, zzd(t, j));
                    }
                    break;
                case 58:
                    if (zza(t, i5, i9)) {
                        zzisVar.zza(i5, zzf(t, j));
                    }
                    break;
                case 59:
                    if (zza(t, i5, i9)) {
                        zza(i5, unsafe.getObject(t, j), zzisVar);
                    }
                    break;
                case 60:
                    if (zza(t, i5, i9)) {
                        zzisVar.zza(i5, unsafe.getObject(t, j), zza(i9));
                    }
                    break;
                case 61:
                    if (zza(t, i5, i9)) {
                        zzisVar.zza(i5, (com.google.android.gms.internal.measurement.zzdu) unsafe.getObject(t, j));
                    }
                    break;
                case 62:
                    if (zza(t, i5, i9)) {
                        zzisVar.zze(i5, zzd(t, j));
                    }
                    break;
                case 63:
                    if (zza(t, i5, i9)) {
                        zzisVar.zzb(i5, zzd(t, j));
                    }
                    break;
                case 64:
                    if (zza(t, i5, i9)) {
                        zzisVar.zza(i5, zzd(t, j));
                    }
                    break;
                case 65:
                    if (zza(t, i5, i9)) {
                        zzisVar.zzb(i5, zze(t, j));
                    }
                    break;
                case 66:
                    if (zza(t, i5, i9)) {
                        zzisVar.zzf(i5, zzd(t, j));
                    }
                    break;
                case 67:
                    if (zza(t, i5, i9)) {
                        zzisVar.zze(i5, zze(t, j));
                    }
                    break;
                case 68:
                    if (zza(t, i5, i9)) {
                        zzisVar.zzb(i5, unsafe.getObject(t, j), zza(i9));
                    }
                    break;
            }
            i3 = i9 + 3;
        }
        while (entry != null) {
            this.zzr.zza(zzisVar, entry);
            entry = itZzd.hasNext() ? (java.util.Map.Entry) itZzd.next() : null;
        }
        zza(this.zzq, t, zzisVar);
    }

    private final <K, V> void zza(com.google.android.gms.internal.measurement.zzis zzisVar, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        if (obj != null) {
            zzisVar.zza(i, this.zzs.zzf(zzb(i2)), this.zzs.zzb(obj));
        }
    }

    private static <UT, UB> void zza(com.google.android.gms.internal.measurement.zzhv<UT, UB> zzhvVar, T t, com.google.android.gms.internal.measurement.zzis zzisVar) throws java.io.IOException {
        zzhvVar.zza(zzhvVar.zzb(t), zzisVar);
    }

    /* JADX WARN: Code duplicated, block: B:164:0x05cc A[LOOP:5: B:162:0x05c8->B:164:0x05cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x05d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zza(T t, com.google.android.gms.internal.measurement.zzhe zzheVar, com.google.android.gms.internal.measurement.zzeq zzeqVar) throws java.io.IOException {
        int i;
        java.util.Objects.requireNonNull(zzeqVar);
        com.google.android.gms.internal.measurement.zzhv<?, ?> zzhvVar = this.zzq;
        com.google.android.gms.internal.measurement.zzes<?> zzesVar = this.zzr;
        com.google.android.gms.internal.measurement.zzew zzewVarZzb = null;
        java.lang.Object objZza = null;
        while (true) {
            try {
                int iZza = zzheVar.zza();
                int iZzg = zzg(iZza);
                if (iZzg >= 0) {
                    int iZzd = zzd(iZzg);
                    switch ((267386880 & iZzd) >>> 20) {
                        case 0:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, zzheVar.zzd());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 1:
                            com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, zzheVar.zze());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 2:
                            com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, zzheVar.zzg());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 3:
                            com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, zzheVar.zzf());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 4:
                            com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, zzheVar.zzh());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 5:
                            com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, zzheVar.zzi());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 6:
                            com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, zzheVar.zzj());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 7:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, zzheVar.zzk());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 8:
                            zza(t, iZzd, zzheVar);
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 9:
                            if (zza((java.lang.Object) t, iZzg)) {
                                long j = iZzd & 1048575;
                                com.google.android.gms.internal.measurement.zzib.zza(t, j, com.google.android.gms.internal.measurement.zzff.zza(com.google.android.gms.internal.measurement.zzib.zzf(t, j), zzheVar.zza(zza(iZzg), zzeqVar)));
                            } else {
                                com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, zzheVar.zza(zza(iZzg), zzeqVar));
                                zzb((java.lang.Object) t, iZzg);
                                continue;
                            }
                            break;
                        case 10:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, zzheVar.zzn());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 11:
                            com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, zzheVar.zzo());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 12:
                            int iZzp = zzheVar.zzp();
                            com.google.android.gms.internal.measurement.zzfk zzfkVarZzc = zzc(iZzg);
                            if (zzfkVarZzc == null || zzfkVarZzc.zza(iZzp)) {
                                com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, iZzp);
                                zzb((java.lang.Object) t, iZzg);
                                continue;
                            } else {
                                objZza = com.google.android.gms.internal.measurement.zzhf.zza(iZza, iZzp, objZza, (com.google.android.gms.internal.measurement.zzhv<UT, java.lang.Object>) zzhvVar);
                            }
                            break;
                        case 13:
                            com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, zzheVar.zzq());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 14:
                            com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, zzheVar.zzr());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 15:
                            com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, zzheVar.zzs());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 16:
                            com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, iZzd & 1048575, zzheVar.zzt());
                            zzb((java.lang.Object) t, iZzg);
                            continue;
                        case 17:
                            if (zza((java.lang.Object) t, iZzg)) {
                                long j2 = iZzd & 1048575;
                                com.google.android.gms.internal.measurement.zzib.zza(t, j2, com.google.android.gms.internal.measurement.zzff.zza(com.google.android.gms.internal.measurement.zzib.zzf(t, j2), zzheVar.zzb(zza(iZzg), zzeqVar)));
                            } else {
                                com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, zzheVar.zzb(zza(iZzg), zzeqVar));
                                zzb((java.lang.Object) t, iZzg);
                                continue;
                            }
                            break;
                        case 18:
                            zzheVar.zza(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 19:
                            zzheVar.zzb(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 20:
                            zzheVar.zzd(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 21:
                            zzheVar.zzc(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 22:
                            zzheVar.zze(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 23:
                            zzheVar.zzf(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 24:
                            zzheVar.zzg(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 25:
                            zzheVar.zzh(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 26:
                            if (zzf(iZzd)) {
                                zzheVar.zzj(this.zzp.zza(t, iZzd & 1048575));
                            } else {
                                zzheVar.zzi(this.zzp.zza(t, iZzd & 1048575));
                                continue;
                            }
                            break;
                        case 27:
                            zzheVar.zza(this.zzp.zza(t, iZzd & 1048575), zza(iZzg), zzeqVar);
                            continue;
                        case 28:
                            zzheVar.zzk(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 29:
                            zzheVar.zzl(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 30:
                            java.util.List<java.lang.Integer> listZza = this.zzp.zza(t, iZzd & 1048575);
                            zzheVar.zzm(listZza);
                            objZza = com.google.android.gms.internal.measurement.zzhf.zza(iZza, listZza, zzc(iZzg), objZza, zzhvVar);
                            continue;
                        case 31:
                            zzheVar.zzn(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 32:
                            zzheVar.zzo(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 33:
                            zzheVar.zzp(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 34:
                            zzheVar.zzq(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 35:
                            zzheVar.zza(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 36:
                            zzheVar.zzb(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 37:
                            zzheVar.zzd(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 38:
                            zzheVar.zzc(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 39:
                            zzheVar.zze(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 40:
                            zzheVar.zzf(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 41:
                            zzheVar.zzg(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 42:
                            zzheVar.zzh(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 43:
                            zzheVar.zzl(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 44:
                            java.util.List<java.lang.Integer> listZza2 = this.zzp.zza(t, iZzd & 1048575);
                            zzheVar.zzm(listZza2);
                            objZza = com.google.android.gms.internal.measurement.zzhf.zza(iZza, listZza2, zzc(iZzg), objZza, zzhvVar);
                            continue;
                        case 45:
                            zzheVar.zzn(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 46:
                            zzheVar.zzo(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 47:
                            zzheVar.zzp(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 48:
                            zzheVar.zzq(this.zzp.zza(t, iZzd & 1048575));
                            continue;
                        case 49:
                            zzheVar.zzb(this.zzp.zza(t, iZzd & 1048575), zza(iZzg), zzeqVar);
                            continue;
                        case 50:
                            java.lang.Object objZzb = zzb(iZzg);
                            long jZzd = zzd(iZzg) & 1048575;
                            java.lang.Object objZzf = com.google.android.gms.internal.measurement.zzib.zzf(t, jZzd);
                            if (objZzf == null) {
                                objZzf = this.zzs.zze(objZzb);
                                com.google.android.gms.internal.measurement.zzib.zza(t, jZzd, objZzf);
                            } else if (this.zzs.zzc(objZzf)) {
                                java.lang.Object objZze = this.zzs.zze(objZzb);
                                this.zzs.zza(objZze, objZzf);
                                com.google.android.gms.internal.measurement.zzib.zza(t, jZzd, objZze);
                                objZzf = objZze;
                            }
                            zzheVar.zza(this.zzs.zza(objZzf), this.zzs.zzf(objZzb), zzeqVar);
                            continue;
                        case 51:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Double.valueOf(zzheVar.zzd()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 52:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Float.valueOf(zzheVar.zze()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 53:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Long.valueOf(zzheVar.zzg()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 54:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Long.valueOf(zzheVar.zzf()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 55:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Integer.valueOf(zzheVar.zzh()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 56:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Long.valueOf(zzheVar.zzi()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 57:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Integer.valueOf(zzheVar.zzj()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 58:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Boolean.valueOf(zzheVar.zzk()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 59:
                            zza(t, iZzd, zzheVar);
                            zzb(t, iZza, iZzg);
                            continue;
                        case 60:
                            if (zza(t, iZza, iZzg)) {
                                long j3 = iZzd & 1048575;
                                com.google.android.gms.internal.measurement.zzib.zza(t, j3, com.google.android.gms.internal.measurement.zzff.zza(com.google.android.gms.internal.measurement.zzib.zzf(t, j3), zzheVar.zza(zza(iZzg), zzeqVar)));
                            } else {
                                com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, zzheVar.zza(zza(iZzg), zzeqVar));
                                zzb((java.lang.Object) t, iZzg);
                            }
                            zzb(t, iZza, iZzg);
                            continue;
                        case 61:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, zzheVar.zzn());
                            zzb(t, iZza, iZzg);
                            continue;
                        case 62:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Integer.valueOf(zzheVar.zzo()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 63:
                            int iZzp2 = zzheVar.zzp();
                            com.google.android.gms.internal.measurement.zzfk zzfkVarZzc2 = zzc(iZzg);
                            if (zzfkVarZzc2 == null || zzfkVarZzc2.zza(iZzp2)) {
                                com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Integer.valueOf(iZzp2));
                                zzb(t, iZza, iZzg);
                                continue;
                            } else {
                                objZza = com.google.android.gms.internal.measurement.zzhf.zza(iZza, iZzp2, objZza, (com.google.android.gms.internal.measurement.zzhv<UT, java.lang.Object>) zzhvVar);
                            }
                            break;
                        case 64:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Integer.valueOf(zzheVar.zzq()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 65:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Long.valueOf(zzheVar.zzr()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 66:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Integer.valueOf(zzheVar.zzs()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 67:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, java.lang.Long.valueOf(zzheVar.zzt()));
                            zzb(t, iZza, iZzg);
                            continue;
                        case 68:
                            com.google.android.gms.internal.measurement.zzib.zza(t, iZzd & 1048575, zzheVar.zzb(zza(iZzg), zzeqVar));
                            zzb(t, iZza, iZzg);
                            continue;
                        default:
                            if (objZza == null) {
                                try {
                                    objZza = zzhvVar.zza();
                                } catch (com.google.android.gms.internal.measurement.zzfn unused) {
                                    zzhvVar.zza(zzheVar);
                                    if (objZza == null) {
                                        objZza = zzhvVar.zzc(t);
                                    }
                                    if (!zzhvVar.zza((java.lang.Object) objZza, zzheVar)) {
                                        for (int i2 = this.zzm; i2 < this.zzn; i2++) {
                                            objZza = zza((java.lang.Object) t, this.zzl[i2], objZza, (com.google.android.gms.internal.measurement.zzhv<UT, java.lang.Object>) zzhvVar);
                                        }
                                        if (objZza != null) {
                                            zzhvVar.zzb(t, (java.lang.Object) objZza);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                break;
                            }
                            if (!zzhvVar.zza((java.lang.Object) objZza, zzheVar)) {
                                for (int i3 = this.zzm; i3 < this.zzn; i3++) {
                                    objZza = zza((java.lang.Object) t, this.zzl[i3], objZza, (com.google.android.gms.internal.measurement.zzhv<UT, java.lang.Object>) zzhvVar);
                                }
                                if (objZza != null) {
                                    zzhvVar.zzb(t, (java.lang.Object) objZza);
                                    return;
                                }
                                return;
                            }
                            break;
                            break;
                    }
                    for (i = this.zzm; i < this.zzn; i++) {
                        objZza = zza((java.lang.Object) t, this.zzl[i], objZza, (com.google.android.gms.internal.measurement.zzhv<UT, java.lang.Object>) zzhvVar);
                    }
                    if (objZza != null) {
                        zzhvVar.zzb(t, (java.lang.Object) objZza);
                    }
                    throw th;
                }
                if (iZza == Integer.MAX_VALUE) {
                    for (int i4 = this.zzm; i4 < this.zzn; i4++) {
                        objZza = zza((java.lang.Object) t, this.zzl[i4], objZza, (com.google.android.gms.internal.measurement.zzhv<UT, java.lang.Object>) zzhvVar);
                    }
                    if (objZza != null) {
                        zzhvVar.zzb(t, (java.lang.Object) objZza);
                        return;
                    }
                    return;
                }
                java.lang.Object objZza2 = !this.zzh ? null : zzesVar.zza(zzeqVar, this.zzg, iZza);
                if (objZza2 != null) {
                    if (zzewVarZzb == null) {
                        zzewVarZzb = zzesVar.zzb(t);
                    }
                    com.google.android.gms.internal.measurement.zzew zzewVar = zzewVarZzb;
                    objZza = zzesVar.zza(zzheVar, objZza2, zzeqVar, zzewVar, objZza, zzhvVar);
                    zzewVarZzb = zzewVar;
                } else {
                    zzhvVar.zza(zzheVar);
                    if (objZza == null) {
                        objZza = zzhvVar.zzc(t);
                    }
                    if (!zzhvVar.zza((java.lang.Object) objZza, zzheVar)) {
                        for (int i5 = this.zzm; i5 < this.zzn; i5++) {
                            objZza = zza((java.lang.Object) t, this.zzl[i5], objZza, (com.google.android.gms.internal.measurement.zzhv<UT, java.lang.Object>) zzhvVar);
                        }
                        if (objZza != null) {
                            zzhvVar.zzb(t, (java.lang.Object) objZza);
                            return;
                        }
                        return;
                    }
                }
            } catch (java.lang.Throwable th) {
                while (i < this.zzn) {
                    objZza = zza((java.lang.Object) t, this.zzl[i], objZza, (com.google.android.gms.internal.measurement.zzhv<UT, java.lang.Object>) zzhvVar);
                }
                if (objZza != null) {
                    zzhvVar.zzb(t, (java.lang.Object) objZza);
                }
                throw th;
            }
        }
    }

    private static com.google.android.gms.internal.measurement.zzhy zze(java.lang.Object obj) {
        com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) obj;
        com.google.android.gms.internal.measurement.zzhy zzhyVar = zzfdVar.zzb;
        if (zzhyVar != com.google.android.gms.internal.measurement.zzhy.zza()) {
            return zzhyVar;
        }
        com.google.android.gms.internal.measurement.zzhy zzhyVarZzb = com.google.android.gms.internal.measurement.zzhy.zzb();
        zzfdVar.zzb = zzhyVarZzb;
        return zzhyVarZzb;
    }

    private static int zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzim zzimVar, java.lang.Class<?> cls, com.google.android.gms.internal.measurement.zzdt zzdtVar) throws java.io.IOException {
        switch (com.google.android.gms.internal.measurement.zzgr.zza[zzimVar.ordinal()]) {
            case 1:
                int iZzb = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, i, zzdtVar);
                zzdtVar.zzc = java.lang.Boolean.valueOf(zzdtVar.zzb != 0);
                return iZzb;
            case 2:
                return com.google.android.gms.internal.measurement.zzdq.zze(bArr, i, zzdtVar);
            case 3:
                zzdtVar.zzc = java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzdq.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzdtVar.zzc = java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzdq.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzdtVar.zzc = java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzdq.zzb(bArr, i));
                return i + 8;
            case 8:
                zzdtVar.zzc = java.lang.Float.valueOf(com.google.android.gms.internal.measurement.zzdq.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iZza = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i, zzdtVar);
                zzdtVar.zzc = java.lang.Integer.valueOf(zzdtVar.zza);
                return iZza;
            case 12:
            case 13:
                int iZzb2 = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, i, zzdtVar);
                zzdtVar.zzc = java.lang.Long.valueOf(zzdtVar.zzb);
                return iZzb2;
            case 14:
                return com.google.android.gms.internal.measurement.zzdq.zza(com.google.android.gms.internal.measurement.zzgz.zza().zza((java.lang.Class) cls), bArr, i, i2, zzdtVar);
            case 15:
                int iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i, zzdtVar);
                zzdtVar.zzc = java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzeg.zze(zzdtVar.zza));
                return iZza2;
            case 16:
                int iZzb3 = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, i, zzdtVar);
                zzdtVar.zzc = java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzeg.zza(zzdtVar.zzb));
                return iZzb3;
            case 17:
                return com.google.android.gms.internal.measurement.zzdq.zzd(bArr, i, zzdtVar);
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, com.google.android.gms.internal.measurement.zzdt zzdtVar) throws java.io.IOException {
        int iZza;
        int iZza2 = i;
        sun.misc.Unsafe unsafe = zzb;
        com.google.android.gms.internal.measurement.zzfl zzflVarZza = (com.google.android.gms.internal.measurement.zzfl) unsafe.getObject(t, j2);
        if (!zzflVarZza.zza()) {
            int size = zzflVarZza.size();
            zzflVarZza = zzflVarZza.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, zzflVarZza);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    com.google.android.gms.internal.measurement.zzeo zzeoVar = (com.google.android.gms.internal.measurement.zzeo) zzflVarZza;
                    int iZza3 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                    int i8 = zzdtVar.zza + iZza3;
                    while (iZza3 < i8) {
                        zzeoVar.zza(com.google.android.gms.internal.measurement.zzdq.zzc(bArr, iZza3));
                        iZza3 += 8;
                    }
                    if (iZza3 == i8) {
                        return iZza3;
                    }
                    throw com.google.android.gms.internal.measurement.zzfo.zza();
                }
                if (i5 == 1) {
                    com.google.android.gms.internal.measurement.zzeo zzeoVar2 = (com.google.android.gms.internal.measurement.zzeo) zzflVarZza;
                    zzeoVar2.zza(com.google.android.gms.internal.measurement.zzdq.zzc(bArr, i));
                    while (true) {
                        int i9 = iZza2 + 8;
                        if (i9 >= i2) {
                            return i9;
                        }
                        iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i9, zzdtVar);
                        if (i3 != zzdtVar.zza) {
                            return i9;
                        }
                        zzeoVar2.zza(com.google.android.gms.internal.measurement.zzdq.zzc(bArr, iZza2));
                    }
                }
                return iZza2;
            case 19:
            case 36:
                if (i5 == 2) {
                    com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) zzflVarZza;
                    int iZza4 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                    int i10 = zzdtVar.zza + iZza4;
                    while (iZza4 < i10) {
                        zzfcVar.zza(com.google.android.gms.internal.measurement.zzdq.zzd(bArr, iZza4));
                        iZza4 += 4;
                    }
                    if (iZza4 == i10) {
                        return iZza4;
                    }
                    throw com.google.android.gms.internal.measurement.zzfo.zza();
                }
                if (i5 == 5) {
                    com.google.android.gms.internal.measurement.zzfc zzfcVar2 = (com.google.android.gms.internal.measurement.zzfc) zzflVarZza;
                    zzfcVar2.zza(com.google.android.gms.internal.measurement.zzdq.zzd(bArr, i));
                    while (true) {
                        int i11 = iZza2 + 4;
                        if (i11 >= i2) {
                            return i11;
                        }
                        iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i11, zzdtVar);
                        if (i3 != zzdtVar.zza) {
                            return i11;
                        }
                        zzfcVar2.zza(com.google.android.gms.internal.measurement.zzdq.zzd(bArr, iZza2));
                    }
                }
                return iZza2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzflVarZza;
                    int iZza5 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                    int i12 = zzdtVar.zza + iZza5;
                    while (iZza5 < i12) {
                        iZza5 = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, iZza5, zzdtVar);
                        zzgcVar.zza(zzdtVar.zzb);
                    }
                    if (iZza5 == i12) {
                        return iZza5;
                    }
                    throw com.google.android.gms.internal.measurement.zzfo.zza();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.measurement.zzgc zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) zzflVarZza;
                    int iZzb = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, iZza2, zzdtVar);
                    zzgcVar2.zza(zzdtVar.zzb);
                    while (iZzb < i2) {
                        int iZza6 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZzb, zzdtVar);
                        if (i3 != zzdtVar.zza) {
                            return iZzb;
                        }
                        iZzb = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, iZza6, zzdtVar);
                        zzgcVar2.zza(zzdtVar.zzb);
                    }
                    return iZzb;
                }
                return iZza2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, (com.google.android.gms.internal.measurement.zzfl<?>) zzflVarZza, zzdtVar);
                }
                if (i5 == 0) {
                    return com.google.android.gms.internal.measurement.zzdq.zza(i3, bArr, i, i2, (com.google.android.gms.internal.measurement.zzfl<?>) zzflVarZza, zzdtVar);
                }
                return iZza2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    com.google.android.gms.internal.measurement.zzgc zzgcVar3 = (com.google.android.gms.internal.measurement.zzgc) zzflVarZza;
                    int iZza7 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                    int i13 = zzdtVar.zza + iZza7;
                    while (iZza7 < i13) {
                        zzgcVar3.zza(com.google.android.gms.internal.measurement.zzdq.zzb(bArr, iZza7));
                        iZza7 += 8;
                    }
                    if (iZza7 == i13) {
                        return iZza7;
                    }
                    throw com.google.android.gms.internal.measurement.zzfo.zza();
                }
                if (i5 == 1) {
                    com.google.android.gms.internal.measurement.zzgc zzgcVar4 = (com.google.android.gms.internal.measurement.zzgc) zzflVarZza;
                    zzgcVar4.zza(com.google.android.gms.internal.measurement.zzdq.zzb(bArr, i));
                    while (true) {
                        int i14 = iZza2 + 8;
                        if (i14 >= i2) {
                            return i14;
                        }
                        iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i14, zzdtVar);
                        if (i3 != zzdtVar.zza) {
                            return i14;
                        }
                        zzgcVar4.zza(com.google.android.gms.internal.measurement.zzdq.zzb(bArr, iZza2));
                    }
                }
                return iZza2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) zzflVarZza;
                    int iZza8 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                    int i15 = zzdtVar.zza + iZza8;
                    while (iZza8 < i15) {
                        zzfgVar.zzd(com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza8));
                        iZza8 += 4;
                    }
                    if (iZza8 == i15) {
                        return iZza8;
                    }
                    throw com.google.android.gms.internal.measurement.zzfo.zza();
                }
                if (i5 == 5) {
                    com.google.android.gms.internal.measurement.zzfg zzfgVar2 = (com.google.android.gms.internal.measurement.zzfg) zzflVarZza;
                    zzfgVar2.zzd(com.google.android.gms.internal.measurement.zzdq.zza(bArr, i));
                    while (true) {
                        int i16 = iZza2 + 4;
                        if (i16 >= i2) {
                            return i16;
                        }
                        iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i16, zzdtVar);
                        if (i3 != zzdtVar.zza) {
                            return i16;
                        }
                        zzfgVar2.zzd(com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2));
                    }
                }
                return iZza2;
            case 25:
            case 42:
                if (i5 == 2) {
                    com.google.android.gms.internal.measurement.zzds zzdsVar = (com.google.android.gms.internal.measurement.zzds) zzflVarZza;
                    iZza = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                    int i17 = zzdtVar.zza + iZza;
                    while (iZza < i17) {
                        iZza = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, iZza, zzdtVar);
                        zzdsVar.zza(zzdtVar.zzb != 0);
                    }
                    if (iZza != i17) {
                        throw com.google.android.gms.internal.measurement.zzfo.zza();
                    }
                    return iZza;
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.measurement.zzds zzdsVar2 = (com.google.android.gms.internal.measurement.zzds) zzflVarZza;
                    iZza2 = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, iZza2, zzdtVar);
                    zzdsVar2.zza(zzdtVar.zzb != 0);
                    while (iZza2 < i2) {
                        int iZza9 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                        if (i3 == zzdtVar.zza) {
                            iZza2 = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, iZza9, zzdtVar);
                            zzdsVar2.zza(zzdtVar.zzb != 0);
                        }
                    }
                }
                return iZza2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                        int i18 = zzdtVar.zza;
                        if (i18 < 0) {
                            throw com.google.android.gms.internal.measurement.zzfo.zzb();
                        }
                        if (i18 == 0) {
                            zzflVarZza.add("");
                        } else {
                            zzflVarZza.add(new java.lang.String(bArr, iZza2, i18, com.google.android.gms.internal.measurement.zzff.zza));
                            iZza2 += i18;
                        }
                        while (iZza2 < i2) {
                            int iZza10 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                            if (i3 == zzdtVar.zza) {
                                iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza10, zzdtVar);
                                int i19 = zzdtVar.zza;
                                if (i19 < 0) {
                                    throw com.google.android.gms.internal.measurement.zzfo.zzb();
                                }
                                if (i19 == 0) {
                                    zzflVarZza.add("");
                                } else {
                                    zzflVarZza.add(new java.lang.String(bArr, iZza2, i19, com.google.android.gms.internal.measurement.zzff.zza));
                                    iZza2 += i19;
                                }
                            }
                        }
                    } else {
                        iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                        int i20 = zzdtVar.zza;
                        if (i20 < 0) {
                            throw com.google.android.gms.internal.measurement.zzfo.zzb();
                        }
                        if (i20 == 0) {
                            zzflVarZza.add("");
                        } else {
                            int i21 = iZza2 + i20;
                            if (!com.google.android.gms.internal.measurement.zzie.zza(bArr, iZza2, i21)) {
                                throw com.google.android.gms.internal.measurement.zzfo.zzh();
                            }
                            zzflVarZza.add(new java.lang.String(bArr, iZza2, i20, com.google.android.gms.internal.measurement.zzff.zza));
                            iZza2 = i21;
                        }
                        while (iZza2 < i2) {
                            int iZza11 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                            if (i3 == zzdtVar.zza) {
                                iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza11, zzdtVar);
                                int i22 = zzdtVar.zza;
                                if (i22 < 0) {
                                    throw com.google.android.gms.internal.measurement.zzfo.zzb();
                                }
                                if (i22 == 0) {
                                    zzflVarZza.add("");
                                } else {
                                    int i23 = iZza2 + i22;
                                    if (!com.google.android.gms.internal.measurement.zzie.zza(bArr, iZza2, i23)) {
                                        throw com.google.android.gms.internal.measurement.zzfo.zzh();
                                    }
                                    zzflVarZza.add(new java.lang.String(bArr, iZza2, i22, com.google.android.gms.internal.measurement.zzff.zza));
                                    iZza2 = i23;
                                }
                            }
                        }
                    }
                }
                return iZza2;
            case 27:
                if (i5 == 2) {
                    return com.google.android.gms.internal.measurement.zzdq.zza(zza(i6), i3, bArr, i, i2, zzflVarZza, zzdtVar);
                }
                return iZza2;
            case 28:
                if (i5 == 2) {
                    int iZza12 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                    int i24 = zzdtVar.zza;
                    if (i24 < 0) {
                        throw com.google.android.gms.internal.measurement.zzfo.zzb();
                    }
                    if (i24 > bArr.length - iZza12) {
                        throw com.google.android.gms.internal.measurement.zzfo.zza();
                    }
                    if (i24 == 0) {
                        zzflVarZza.add(com.google.android.gms.internal.measurement.zzdu.zza);
                    } else {
                        zzflVarZza.add(com.google.android.gms.internal.measurement.zzdu.zza(bArr, iZza12, i24));
                        iZza12 += i24;
                    }
                    while (iZza12 < i2) {
                        int iZza13 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza12, zzdtVar);
                        if (i3 != zzdtVar.zza) {
                            return iZza12;
                        }
                        iZza12 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza13, zzdtVar);
                        int i25 = zzdtVar.zza;
                        if (i25 < 0) {
                            throw com.google.android.gms.internal.measurement.zzfo.zzb();
                        }
                        if (i25 > bArr.length - iZza12) {
                            throw com.google.android.gms.internal.measurement.zzfo.zza();
                        }
                        if (i25 == 0) {
                            zzflVarZza.add(com.google.android.gms.internal.measurement.zzdu.zza);
                        } else {
                            zzflVarZza.add(com.google.android.gms.internal.measurement.zzdu.zza(bArr, iZza12, i25));
                            iZza12 += i25;
                        }
                    }
                    return iZza12;
                }
                return iZza2;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZza = com.google.android.gms.internal.measurement.zzdq.zza(i3, bArr, i, i2, (com.google.android.gms.internal.measurement.zzfl<?>) zzflVarZza, zzdtVar);
                    }
                    return iZza2;
                }
                iZza = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, (com.google.android.gms.internal.measurement.zzfl<?>) zzflVarZza, zzdtVar);
                com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) t;
                com.google.android.gms.internal.measurement.zzhy zzhyVar = zzfdVar.zzb;
                if (zzhyVar == com.google.android.gms.internal.measurement.zzhy.zza()) {
                    zzhyVar = null;
                }
                com.google.android.gms.internal.measurement.zzhy zzhyVar2 = (com.google.android.gms.internal.measurement.zzhy) com.google.android.gms.internal.measurement.zzhf.zza(i4, zzflVarZza, zzc(i6), zzhyVar, this.zzq);
                if (zzhyVar2 != null) {
                    zzfdVar.zzb = zzhyVar2;
                }
                return iZza;
            case 33:
            case 47:
                if (i5 == 2) {
                    com.google.android.gms.internal.measurement.zzfg zzfgVar3 = (com.google.android.gms.internal.measurement.zzfg) zzflVarZza;
                    int iZza14 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                    int i26 = zzdtVar.zza + iZza14;
                    while (iZza14 < i26) {
                        iZza14 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza14, zzdtVar);
                        zzfgVar3.zzd(com.google.android.gms.internal.measurement.zzeg.zze(zzdtVar.zza));
                    }
                    if (iZza14 == i26) {
                        return iZza14;
                    }
                    throw com.google.android.gms.internal.measurement.zzfo.zza();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.measurement.zzfg zzfgVar4 = (com.google.android.gms.internal.measurement.zzfg) zzflVarZza;
                    int iZza15 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                    zzfgVar4.zzd(com.google.android.gms.internal.measurement.zzeg.zze(zzdtVar.zza));
                    while (iZza15 < i2) {
                        int iZza16 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza15, zzdtVar);
                        if (i3 != zzdtVar.zza) {
                            return iZza15;
                        }
                        iZza15 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza16, zzdtVar);
                        zzfgVar4.zzd(com.google.android.gms.internal.measurement.zzeg.zze(zzdtVar.zza));
                    }
                    return iZza15;
                }
                return iZza2;
            case 34:
            case 48:
                if (i5 == 2) {
                    com.google.android.gms.internal.measurement.zzgc zzgcVar5 = (com.google.android.gms.internal.measurement.zzgc) zzflVarZza;
                    int iZza17 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                    int i27 = zzdtVar.zza + iZza17;
                    while (iZza17 < i27) {
                        iZza17 = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, iZza17, zzdtVar);
                        zzgcVar5.zza(com.google.android.gms.internal.measurement.zzeg.zza(zzdtVar.zzb));
                    }
                    if (iZza17 == i27) {
                        return iZza17;
                    }
                    throw com.google.android.gms.internal.measurement.zzfo.zza();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.measurement.zzgc zzgcVar6 = (com.google.android.gms.internal.measurement.zzgc) zzflVarZza;
                    int iZzb2 = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, iZza2, zzdtVar);
                    zzgcVar6.zza(com.google.android.gms.internal.measurement.zzeg.zza(zzdtVar.zzb));
                    while (iZzb2 < i2) {
                        int iZza18 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZzb2, zzdtVar);
                        if (i3 != zzdtVar.zza) {
                            return iZzb2;
                        }
                        iZzb2 = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, iZza18, zzdtVar);
                        zzgcVar6.zza(com.google.android.gms.internal.measurement.zzeg.zza(zzdtVar.zzb));
                    }
                    return iZzb2;
                }
                return iZza2;
            case 49:
                if (i5 == 3) {
                    com.google.android.gms.internal.measurement.zzhd zzhdVarZza = zza(i6);
                    int i28 = (i3 & (-8)) | 4;
                    iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(zzhdVarZza, bArr, i, i2, i28, zzdtVar);
                    zzflVarZza.add(zzdtVar.zzc);
                    while (iZza2 < i2) {
                        int iZza19 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, iZza2, zzdtVar);
                        if (i3 == zzdtVar.zza) {
                            iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(zzhdVarZza, bArr, iZza19, i2, i28, zzdtVar);
                            zzflVarZza.add(zzdtVar.zzc);
                        }
                    }
                }
                return iZza2;
            default:
                return iZza2;
        }
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, com.google.android.gms.internal.measurement.zzdt zzdtVar) throws java.io.IOException {
        sun.misc.Unsafe unsafe = zzb;
        java.lang.Object objZzb = zzb(i3);
        java.lang.Object object = unsafe.getObject(t, j);
        if (this.zzs.zzc(object)) {
            java.lang.Object objZze = this.zzs.zze(objZzb);
            this.zzs.zza(objZze, object);
            unsafe.putObject(t, j, objZze);
            object = objZze;
        }
        com.google.android.gms.internal.measurement.zzgf<?, ?> zzgfVarZzf = this.zzs.zzf(objZzb);
        java.util.Map<?, ?> mapZza = this.zzs.zza(object);
        int iZza = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i, zzdtVar);
        int i4 = zzdtVar.zza;
        if (i4 < 0 || i4 > i2 - iZza) {
            throw com.google.android.gms.internal.measurement.zzfo.zza();
        }
        int i5 = i4 + iZza;
        K k = zzgfVarZzf.zzb;
        V v = zzgfVarZzf.zzd;
        while (iZza < i5) {
            int iZza2 = iZza + 1;
            int i6 = bArr[iZza];
            if (i6 < 0) {
                iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(i6, bArr, iZza2, zzdtVar);
                i6 = zzdtVar.zza;
            }
            int i7 = iZza2;
            int i8 = i6 >>> 3;
            int i9 = i6 & 7;
            if (i8 == 1) {
                if (i9 == zzgfVarZzf.zza.zzb()) {
                    iZza = zza(bArr, i7, i2, zzgfVarZzf.zza, (java.lang.Class<?>) null, zzdtVar);
                    k = (K) zzdtVar.zzc;
                } else {
                    iZza = com.google.android.gms.internal.measurement.zzdq.zza(i6, bArr, i7, i2, zzdtVar);
                }
            } else if (i8 == 2 && i9 == zzgfVarZzf.zzc.zzb()) {
                iZza = zza(bArr, i7, i2, zzgfVarZzf.zzc, zzgfVarZzf.zzd.getClass(), zzdtVar);
                v = zzdtVar.zzc;
            } else {
                iZza = com.google.android.gms.internal.measurement.zzdq.zza(i6, bArr, i7, i2, zzdtVar);
            }
        }
        if (iZza != i5) {
            throw com.google.android.gms.internal.measurement.zzfo.zzg();
        }
        mapZza.put(k, v);
        return i5;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, com.google.android.gms.internal.measurement.zzdt zzdtVar) throws java.io.IOException {
        int iZzb;
        sun.misc.Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Double.valueOf(com.google.android.gms.internal.measurement.zzdq.zzc(bArr, i)));
                iZzb = i + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Float.valueOf(com.google.android.gms.internal.measurement.zzdq.zzd(bArr, i)));
                iZzb = i + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, i, zzdtVar);
                unsafe.putObject(t, j, java.lang.Long.valueOf(zzdtVar.zzb));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i, zzdtVar);
                unsafe.putObject(t, j, java.lang.Integer.valueOf(zzdtVar.zza));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzdq.zzb(bArr, i)));
                iZzb = i + 8;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzdq.zza(bArr, i)));
                iZzb = i + 4;
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, i, zzdtVar);
                unsafe.putObject(t, j, java.lang.Boolean.valueOf(zzdtVar.zzb != 0));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZza = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i, zzdtVar);
                int i9 = zzdtVar.zza;
                if (i9 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !com.google.android.gms.internal.measurement.zzie.zza(bArr, iZza, iZza + i9)) {
                        throw com.google.android.gms.internal.measurement.zzfo.zzh();
                    }
                    unsafe.putObject(t, j, new java.lang.String(bArr, iZza, i9, com.google.android.gms.internal.measurement.zzff.zza));
                    iZza += i9;
                }
                unsafe.putInt(t, j2, i4);
                return iZza;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iZza2 = com.google.android.gms.internal.measurement.zzdq.zza(zza(i8), bArr, i, i2, zzdtVar);
                java.lang.Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object == null) {
                    unsafe.putObject(t, j, zzdtVar.zzc);
                } else {
                    unsafe.putObject(t, j, com.google.android.gms.internal.measurement.zzff.zza(object, zzdtVar.zzc));
                }
                unsafe.putInt(t, j2, i4);
                return iZza2;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.measurement.zzdq.zze(bArr, i, zzdtVar);
                unsafe.putObject(t, j, zzdtVar.zzc);
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iZza3 = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i, zzdtVar);
                int i10 = zzdtVar.zza;
                com.google.android.gms.internal.measurement.zzfk zzfkVarZzc = zzc(i8);
                if (zzfkVarZzc == null || zzfkVarZzc.zza(i10)) {
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(i10));
                    iZzb = iZza3;
                    unsafe.putInt(t, j2, i4);
                    return iZzb;
                }
                zze(t).zza(i3, java.lang.Long.valueOf(i10));
                return iZza3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.measurement.zzdq.zza(bArr, i, zzdtVar);
                unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.android.gms.internal.measurement.zzeg.zze(zzdtVar.zza)));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.measurement.zzdq.zzb(bArr, i, zzdtVar);
                unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.android.gms.internal.measurement.zzeg.zza(zzdtVar.zzb)));
                unsafe.putInt(t, j2, i4);
                return iZzb;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                iZzb = com.google.android.gms.internal.measurement.zzdq.zza(zza(i8), bArr, i, i2, (i3 & (-8)) | 4, zzdtVar);
                java.lang.Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                if (object2 == null) {
                    unsafe.putObject(t, j, zzdtVar.zzc);
                } else {
                    unsafe.putObject(t, j, com.google.android.gms.internal.measurement.zzff.zza(object2, zzdtVar.zzc));
                }
                unsafe.putInt(t, j2, i4);
                return iZzb;
            default:
                return i;
        }
    }

    private final com.google.android.gms.internal.measurement.zzhd zza(int i) {
        int i2 = (i / 3) << 1;
        com.google.android.gms.internal.measurement.zzhd zzhdVar = (com.google.android.gms.internal.measurement.zzhd) this.zzd[i2];
        if (zzhdVar != null) {
            return zzhdVar;
        }
        com.google.android.gms.internal.measurement.zzhd<T> zzhdVarZza = com.google.android.gms.internal.measurement.zzgz.zza().zza((java.lang.Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zzhdVarZza;
        return zzhdVarZza;
    }

    private final java.lang.Object zzb(int i) {
        return this.zzd[(i / 3) << 1];
    }

    private final com.google.android.gms.internal.measurement.zzfk zzc(int i) {
        return (com.google.android.gms.internal.measurement.zzfk) this.zzd[((i / 3) << 1) + 1];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12601. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.zzdt r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgs.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzdt):int");
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
    @Override // com.google.android.gms.internal.measurement.zzhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.measurement.zzdt r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgs.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzdt):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzhd
    public final void zzc(T t) {
        int i;
        int i2 = this.zzm;
        while (true) {
            i = this.zzn;
            if (i2 >= i) {
                break;
            }
            long jZzd = zzd(this.zzl[i2]) & 1048575;
            java.lang.Object objZzf = com.google.android.gms.internal.measurement.zzib.zzf(t, jZzd);
            if (objZzf != null) {
                com.google.android.gms.internal.measurement.zzib.zza(t, jZzd, this.zzs.zzd(objZzf));
            }
            i2++;
        }
        int length = this.zzl.length;
        while (i < length) {
            this.zzp.zzb(t, this.zzl[i]);
            i++;
        }
        this.zzq.zzd(t);
        if (this.zzh) {
            this.zzr.zzc(t);
        }
    }

    private final <UT, UB> UB zza(java.lang.Object obj, int i, UB ub, com.google.android.gms.internal.measurement.zzhv<UT, UB> zzhvVar) {
        com.google.android.gms.internal.measurement.zzfk zzfkVarZzc;
        int i2 = this.zzc[i];
        java.lang.Object objZzf = com.google.android.gms.internal.measurement.zzib.zzf(obj, zzd(i) & 1048575);
        return (objZzf == null || (zzfkVarZzc = zzc(i)) == null) ? ub : (UB) zza(i, i2, this.zzs.zza(objZzf), zzfkVarZzc, ub, zzhvVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, java.util.Map<K, V> map, com.google.android.gms.internal.measurement.zzfk zzfkVar, UB ub, com.google.android.gms.internal.measurement.zzhv<UT, UB> zzhvVar) {
        com.google.android.gms.internal.measurement.zzgf<?, ?> zzgfVarZzf = this.zzs.zzf(zzb(i));
        java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (!zzfkVar.zza(((java.lang.Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzhvVar.zza();
                }
                com.google.android.gms.internal.measurement.zzec zzecVarZzc = com.google.android.gms.internal.measurement.zzdu.zzc(com.google.android.gms.internal.measurement.zzgg.zza(zzgfVarZzf, next.getKey(), next.getValue()));
                try {
                    com.google.android.gms.internal.measurement.zzgg.zza(zzecVarZzc.zzb(), zzgfVarZzf, next.getKey(), next.getValue());
                    zzhvVar.zza(ub, i2, zzecVarZzc.zza());
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
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.measurement.zzhd] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.measurement.zzhd] */
    @Override // com.google.android.gms.internal.measurement.zzhd
    public final boolean zzd(T t) {
        int i;
        java.util.List list;
        ?? Zza;
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= this.zzm) {
                return !this.zzh || this.zzr.zza(t).zzf();
            }
            int i6 = this.zzl[i4];
            int i7 = this.zzc[i6];
            int iZzd = zzd(i6);
            if (this.zzj) {
                i = 0;
            } else {
                int i8 = this.zzc[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i5 = zzb.getInt(t, i9);
                    i3 = i9;
                }
            }
            if (((268435456 & iZzd) != 0) && !zza(t, i6, i5, i)) {
                return false;
            }
            int i10 = (267386880 & iZzd) >>> 20;
            if (i10 == 9 || i10 == 17) {
                if (zza(t, i6, i5, i) && !zza(t, iZzd, zza(i6))) {
                    return false;
                }
            } else if (i10 == 27) {
                list = (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575);
                if (!list.isEmpty()) {
                    Zza = zza(i6);
                    for (i2 = 0; i2 < list.size(); i2++) {
                        if (!Zza.zzd(list.get(i2))) {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (i10 == 60 || i10 == 68) {
                if (zza(t, i7, i6) && !zza(t, iZzd, zza(i6))) {
                    return false;
                }
            } else if (i10 == 49) {
                list = (java.util.List) com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575);
                if (!list.isEmpty()) {
                    Zza = zza(i6);
                    while (i2 < list.size()) {
                        if (!Zza.zzd(list.get(i2))) {
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
                java.util.Map<?, ?> mapZzb = this.zzs.zzb(com.google.android.gms.internal.measurement.zzib.zzf(t, iZzd & 1048575));
                if (!mapZzb.isEmpty()) {
                    if (this.zzs.zzf(zzb(i6)).zzc.zza() == com.google.android.gms.internal.measurement.zzip.MESSAGE) {
                        ?? Zza2 = 0;
                        for (java.lang.Object obj : mapZzb.values()) {
                            if (Zza2 == 0) {
                                Zza2 = Zza2;
                                Zza2 = com.google.android.gms.internal.measurement.zzgz.zza().zza((java.lang.Class) obj.getClass());
                            }
                            Zza2 = Zza2;
                            if (!Zza2.zzd(obj)) {
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
    private static boolean zza(java.lang.Object obj, int i, com.google.android.gms.internal.measurement.zzhd zzhdVar) {
        return zzhdVar.zzd(com.google.android.gms.internal.measurement.zzib.zzf(obj, i & 1048575));
    }

    private static void zza(int i, java.lang.Object obj, com.google.android.gms.internal.measurement.zzis zzisVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zzisVar.zza(i, (java.lang.String) obj);
        } else {
            zzisVar.zza(i, (com.google.android.gms.internal.measurement.zzdu) obj);
        }
    }

    private final void zza(java.lang.Object obj, int i, com.google.android.gms.internal.measurement.zzhe zzheVar) throws java.io.IOException {
        if (zzf(i)) {
            com.google.android.gms.internal.measurement.zzib.zza(obj, i & 1048575, zzheVar.zzm());
        } else if (this.zzi) {
            com.google.android.gms.internal.measurement.zzib.zza(obj, i & 1048575, zzheVar.zzl());
        } else {
            com.google.android.gms.internal.measurement.zzib.zza(obj, i & 1048575, zzheVar.zzn());
        }
    }

    private final int zzd(int i) {
        return this.zzc[i + 1];
    }

    private final int zze(int i) {
        return this.zzc[i + 2];
    }

    private static <T> double zzb(T t, long j) {
        return ((java.lang.Double) com.google.android.gms.internal.measurement.zzib.zzf(t, j)).doubleValue();
    }

    private static <T> float zzc(T t, long j) {
        return ((java.lang.Float) com.google.android.gms.internal.measurement.zzib.zzf(t, j)).floatValue();
    }

    private static <T> int zzd(T t, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.measurement.zzib.zzf(t, j)).intValue();
    }

    private static <T> long zze(T t, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.measurement.zzib.zzf(t, j)).longValue();
    }

    private static <T> boolean zzf(T t, long j) {
        return ((java.lang.Boolean) com.google.android.gms.internal.measurement.zzib.zzf(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((java.lang.Object) t, i) == zza((java.lang.Object) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzj) {
            return zza((java.lang.Object) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzj) {
            int iZzd = zzd(i);
            long j = iZzd & 1048575;
            switch ((iZzd & 267386880) >>> 20) {
                case 0:
                    return com.google.android.gms.internal.measurement.zzib.zze(t, j) != 0.0d;
                case 1:
                    return com.google.android.gms.internal.measurement.zzib.zzd(t, j) != 0.0f;
                case 2:
                    return com.google.android.gms.internal.measurement.zzib.zzb(t, j) != 0;
                case 3:
                    return com.google.android.gms.internal.measurement.zzib.zzb(t, j) != 0;
                case 4:
                    return com.google.android.gms.internal.measurement.zzib.zza(t, j) != 0;
                case 5:
                    return com.google.android.gms.internal.measurement.zzib.zzb(t, j) != 0;
                case 6:
                    return com.google.android.gms.internal.measurement.zzib.zza(t, j) != 0;
                case 7:
                    return com.google.android.gms.internal.measurement.zzib.zzc(t, j);
                case 8:
                    java.lang.Object objZzf = com.google.android.gms.internal.measurement.zzib.zzf(t, j);
                    if (objZzf instanceof java.lang.String) {
                        return !((java.lang.String) objZzf).isEmpty();
                    }
                    if (objZzf instanceof com.google.android.gms.internal.measurement.zzdu) {
                        return !com.google.android.gms.internal.measurement.zzdu.zza.equals(objZzf);
                    }
                    throw new java.lang.IllegalArgumentException();
                case 9:
                    return com.google.android.gms.internal.measurement.zzib.zzf(t, j) != null;
                case 10:
                    return !com.google.android.gms.internal.measurement.zzdu.zza.equals(com.google.android.gms.internal.measurement.zzib.zzf(t, j));
                case 11:
                    return com.google.android.gms.internal.measurement.zzib.zza(t, j) != 0;
                case 12:
                    return com.google.android.gms.internal.measurement.zzib.zza(t, j) != 0;
                case 13:
                    return com.google.android.gms.internal.measurement.zzib.zza(t, j) != 0;
                case 14:
                    return com.google.android.gms.internal.measurement.zzib.zzb(t, j) != 0;
                case 15:
                    return com.google.android.gms.internal.measurement.zzib.zza(t, j) != 0;
                case 16:
                    return com.google.android.gms.internal.measurement.zzib.zzb(t, j) != 0;
                case 17:
                    return com.google.android.gms.internal.measurement.zzib.zzf(t, j) != null;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        int iZze = zze(i);
        return (com.google.android.gms.internal.measurement.zzib.zza(t, (long) (iZze & 1048575)) & (1 << (iZze >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zzj) {
            return;
        }
        int iZze = zze(i);
        long j = iZze & 1048575;
        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, j, com.google.android.gms.internal.measurement.zzib.zza(t, j) | (1 << (iZze >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return com.google.android.gms.internal.measurement.zzib.zza(t, (long) (zze(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        com.google.android.gms.internal.measurement.zzib.zza((java.lang.Object) t, zze(i2) & 1048575, i);
    }

    private final int zzg(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, 0);
    }

    private final int zza(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzb(i, i2);
    }

    private final int zzb(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
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
