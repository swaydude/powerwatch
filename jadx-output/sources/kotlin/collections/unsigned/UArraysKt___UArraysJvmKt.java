package kotlin.collections.unsigned;

/* JADX INFO: compiled from: _UArraysJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020\u00032\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010\u001f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010\u001f\u001a\u00020\n*\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010\u001f\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010 \u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a.\u0010)\u001a\u00020**\u00020\u00032\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*0,H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a.\u0010)\u001a\u00020/*\u00020\u00032\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020/0,H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a.\u0010)\u001a\u00020**\u00020\u00072\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*0,H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u00102\u001a.\u0010)\u001a\u00020/*\u00020\u00072\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020/0,H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00103\u001a.\u0010)\u001a\u00020**\u00020\u000b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0,H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u00104\u001a.\u0010)\u001a\u00020/*\u00020\u000b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020/0,H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00105\u001a.\u0010)\u001a\u00020**\u00020\u000f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020*0,H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u00106\u001a.\u0010)\u001a\u00020/*\u00020\u000f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020/0,H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00107\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00068"}, d2 = {"asList", "", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "asList-GBYM_sE", "([B)Ljava/util/List;", "Lkotlin/UInt;", "Lkotlin/UIntArray;", "asList--ajY-9A", "([I)Ljava/util/List;", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "asList-QwZRm1k", "([J)Ljava/util/List;", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", "", "element", "fromIndex", "toIndex", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-EtDCXyQ", "([SSII)I", "elementAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "elementAt-PpDY95g", "([BI)B", "elementAt-qFRl0hI", "([II)I", "elementAt-r7IrZao", "([JI)J", "elementAt-nggk6HY", "([SI)S", "sumOf", "Ljava/math/BigDecimal;", "selector", "Lkotlin/Function1;", "sumOfBigDecimal", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, pn = "kotlin.collections", xi = 1, xs = "kotlin/collections/unsigned/UArraysKt")
class UArraysKt___UArraysJvmKt {
    /* JADX INFO: renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m490elementAtqFRl0hI(int[] iArr, int i) {
        return kotlin.UIntArray.m166getpVg5ArA(iArr, i);
    }

    /* JADX INFO: renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m491elementAtr7IrZao(long[] jArr, int i) {
        return kotlin.ULongArray.m244getsVKNKU(jArr, i);
    }

    /* JADX INFO: renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m488elementAtPpDY95g(byte[] bArr, int i) {
        return kotlin.UByteArray.m88getw2LRezQ(bArr, i);
    }

    /* JADX INFO: renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m489elementAtnggk6HY(short[] sArr, int i) {
        return kotlin.UShortArray.m348getMh2AYeg(sArr, i);
    }

    /* JADX INFO: renamed from: asList--ajY-9A, reason: not valid java name */
    public static final java.util.List<kotlin.UInt> m476asListajY9A(int[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$1(asList);
    }

    /* JADX INFO: renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final java.util.List<kotlin.ULong> m478asListQwZRm1k(long[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$2(asList);
    }

    /* JADX INFO: renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final java.util.List<kotlin.UByte> m477asListGBYM_sE(byte[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$3(asList);
    }

    /* JADX INFO: renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final java.util.List<kotlin.UShort> m479asListrL5Bavg(short[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$4(asList);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m481binarySearch2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = kotlin.UIntArray.m167getSizeimpl(iArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m480binarySearch2fe2U9s(iArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m480binarySearch2fe2U9s(int[] binarySearch, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i2, i3, kotlin.UIntArray.m167getSizeimpl(binarySearch));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iUintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i);
            if (iUintCompare < 0) {
                i2 = i5 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m485binarySearchK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.ULongArray.m245getSizeimpl(jArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m484binarySearchK6DWlUc(jArr, j, i, i2);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m484binarySearchK6DWlUc(long[] binarySearch, long j, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.ULongArray.m245getSizeimpl(binarySearch));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iUlongCompare = kotlin.UnsignedKt.ulongCompare(binarySearch[i4], j);
            if (iUlongCompare < 0) {
                i = i4 + 1;
            } else {
                if (iUlongCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m487binarySearchWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.UByteArray.m89getSizeimpl(bArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m486binarySearchWpHrYlw(bArr, b, i, i2);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m486binarySearchWpHrYlw(byte[] binarySearch, byte b, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.UByteArray.m89getSizeimpl(binarySearch));
        int i3 = b & kotlin.UByte.MAX_VALUE;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int iUintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i3);
            if (iUintCompare < 0) {
                i = i5 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m483binarySearchEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.UShortArray.m349getSizeimpl(sArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m482binarySearchEtDCXyQ(sArr, s, i, i2);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m482binarySearchEtDCXyQ(short[] binarySearch, short s, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.UShortArray.m349getSizeimpl(binarySearch));
        int i3 = s & kotlin.UShort.MAX_VALUE;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int iUintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i3);
            if (iUintCompare < 0) {
                i = i5 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    private static final java.math.BigDecimal sumOfBigDecimal(int[] iArr, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends java.math.BigDecimal> function1) {
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "BigDecimal.valueOf(this.toLong())");
        for (int i : iArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(kotlin.UInt.m101boximpl(i)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(long[] jArr, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends java.math.BigDecimal> function1) {
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "BigDecimal.valueOf(this.toLong())");
        for (long j : jArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(kotlin.ULong.m179boximpl(j)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(byte[] bArr, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends java.math.BigDecimal> function1) {
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "BigDecimal.valueOf(this.toLong())");
        for (byte b : bArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(kotlin.UByte.m25boximpl(b)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(short[] sArr, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends java.math.BigDecimal> function1) {
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "BigDecimal.valueOf(this.toLong())");
        for (short s : sArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(kotlin.UShort.m285boximpl(s)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(int[] iArr, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends java.math.BigInteger> function1) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "BigInteger.valueOf(this.toLong())");
        for (int i : iArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(kotlin.UInt.m101boximpl(i)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(long[] jArr, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends java.math.BigInteger> function1) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "BigInteger.valueOf(this.toLong())");
        for (long j : jArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(kotlin.ULong.m179boximpl(j)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(byte[] bArr, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends java.math.BigInteger> function1) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "BigInteger.valueOf(this.toLong())");
        for (byte b : bArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(kotlin.UByte.m25boximpl(b)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(short[] sArr, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends java.math.BigInteger> function1) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "BigInteger.valueOf(this.toLong())");
        for (short s : sArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(kotlin.UShort.m285boximpl(s)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }
}
