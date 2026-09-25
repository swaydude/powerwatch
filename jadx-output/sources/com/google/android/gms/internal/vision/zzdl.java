package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdl<K, V> extends com.google.android.gms.internal.vision.zzdg<K, V> {
    private static final com.google.android.gms.internal.vision.zzdg<java.lang.Object, java.lang.Object> zzlz = new com.google.android.gms.internal.vision.zzdl(null, new java.lang.Object[0], 0);
    private final transient int size;
    private final transient java.lang.Object[] zzlx;
    private final transient java.lang.Object zzma;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int[]] */
    static <K, V> com.google.android.gms.internal.vision.zzdl<K, V> zza(int i, java.lang.Object[] objArr) {
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        com.google.android.gms.internal.vision.zzct.zzd(4, objArr.length >> 1);
        int iMax = java.lang.Math.max(4, 2);
        int iHighestOneBit = androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY;
        int i5 = 0;
        if (iMax < 751619276) {
            iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            com.google.android.gms.internal.vision.zzct.checkArgument(iMax < 1073741824, "collection too large");
        }
        int i6 = iHighestOneBit - 1;
        if (iHighestOneBit <= 128) {
            bArr = new byte[iHighestOneBit];
            java.util.Arrays.fill(bArr, (byte) -1);
            while (i5 < 4) {
                int i7 = i5 * 2;
                java.lang.Object obj = objArr[i7];
                java.lang.Object obj2 = objArr[i7 ^ 1];
                com.google.android.gms.internal.vision.zzda.zza(obj, obj2);
                int iZzr = com.google.android.gms.internal.vision.zzdd.zzr(obj.hashCode());
                while (true) {
                    i4 = iZzr & i6;
                    int i8 = bArr[i4] & 255;
                    if (i8 == 255) {
                        break;
                    }
                    if (objArr[i8].equals(obj)) {
                        throw zza(obj, obj2, objArr, i8);
                    }
                    iZzr = i4 + 1;
                }
                bArr[i4] = (byte) i7;
                i5++;
            }
        } else if (iHighestOneBit <= 32768) {
            bArr = new short[iHighestOneBit];
            java.util.Arrays.fill(bArr, (short) -1);
            while (i5 < 4) {
                int i9 = i5 * 2;
                java.lang.Object obj3 = objArr[i9];
                java.lang.Object obj4 = objArr[i9 ^ 1];
                com.google.android.gms.internal.vision.zzda.zza(obj3, obj4);
                int iZzr2 = com.google.android.gms.internal.vision.zzdd.zzr(obj3.hashCode());
                while (true) {
                    i3 = iZzr2 & i6;
                    int i10 = bArr[i3] & kotlin.UShort.MAX_VALUE;
                    if (i10 == 65535) {
                        break;
                    }
                    if (objArr[i10].equals(obj3)) {
                        throw zza(obj3, obj4, objArr, i10);
                    }
                    iZzr2 = i3 + 1;
                }
                bArr[i3] = (short) i9;
                i5++;
            }
        } else {
            bArr = new int[iHighestOneBit];
            java.util.Arrays.fill((int[]) bArr, -1);
            while (i5 < 4) {
                int i11 = i5 * 2;
                java.lang.Object obj5 = objArr[i11];
                java.lang.Object obj6 = objArr[i11 ^ 1];
                com.google.android.gms.internal.vision.zzda.zza(obj5, obj6);
                int iZzr3 = com.google.android.gms.internal.vision.zzdd.zzr(obj5.hashCode());
                while (true) {
                    i2 = iZzr3 & i6;
                    char c = bArr[i2];
                    if (c == -1) {
                        break;
                    }
                    if (objArr[c].equals(obj5)) {
                        throw zza(obj5, obj6, objArr, c);
                    }
                    iZzr3 = i2 + 1;
                }
                bArr[i2] = i11;
                i5++;
            }
        }
        return new com.google.android.gms.internal.vision.zzdl<>(bArr, objArr, 4);
    }

    private static java.lang.IllegalArgumentException zza(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, int i) {
        java.lang.String strValueOf = java.lang.String.valueOf(obj);
        java.lang.String strValueOf2 = java.lang.String.valueOf(obj2);
        java.lang.String strValueOf3 = java.lang.String.valueOf(objArr[i]);
        java.lang.String strValueOf4 = java.lang.String.valueOf(objArr[i ^ 1]);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 39 + java.lang.String.valueOf(strValueOf2).length() + java.lang.String.valueOf(strValueOf3).length() + java.lang.String.valueOf(strValueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new java.lang.IllegalArgumentException(sb.toString());
    }

    private zzdl(java.lang.Object obj, java.lang.Object[] objArr, int i) {
        this.zzma = obj;
        this.zzlx = objArr;
        this.size = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.vision.zzdg, java.util.Map
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        java.lang.Object obj2 = this.zzma;
        java.lang.Object[] objArr = this.zzlx;
        int i = this.size;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        }
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int iZzr = com.google.android.gms.internal.vision.zzdd.zzr(obj.hashCode());
            while (true) {
                int i2 = iZzr & length;
                int i3 = bArr[i2] & kotlin.UByte.MAX_VALUE;
                if (i3 == 255) {
                    return null;
                }
                if (objArr[i3].equals(obj)) {
                    return (V) objArr[i3 ^ 1];
                }
                iZzr = i2 + 1;
            }
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int iZzr2 = com.google.android.gms.internal.vision.zzdd.zzr(obj.hashCode());
            while (true) {
                int i4 = iZzr2 & length2;
                int i5 = sArr[i4] & kotlin.UShort.MAX_VALUE;
                if (i5 == 65535) {
                    return null;
                }
                if (objArr[i5].equals(obj)) {
                    return (V) objArr[i5 ^ 1];
                }
                iZzr2 = i4 + 1;
            }
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iZzr3 = com.google.android.gms.internal.vision.zzdd.zzr(obj.hashCode());
            while (true) {
                int i6 = iZzr3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (objArr[i7].equals(obj)) {
                    return (V) objArr[i7 ^ 1];
                }
                iZzr3 = i6 + 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzdg
    final com.google.android.gms.internal.vision.zzdj<java.util.Map.Entry<K, V>> zzce() {
        return new com.google.android.gms.internal.vision.zzdk(this, this.zzlx, 0, this.size);
    }

    @Override // com.google.android.gms.internal.vision.zzdg
    final com.google.android.gms.internal.vision.zzdj<K> zzcf() {
        return new com.google.android.gms.internal.vision.zzdm(this, new com.google.android.gms.internal.vision.zzdp(this.zzlx, 0, this.size));
    }

    @Override // com.google.android.gms.internal.vision.zzdg
    final com.google.android.gms.internal.vision.zzdc<V> zzcg() {
        return new com.google.android.gms.internal.vision.zzdp(this.zzlx, 1, this.size);
    }
}
