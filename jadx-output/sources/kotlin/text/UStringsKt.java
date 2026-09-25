package kotlin.text;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0014\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u0018\u001a\u00020\n*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u0018\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u001c\u001a\u00020\r*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u001c\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\u0011\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class UStringsKt {
    /* JADX INFO: renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final java.lang.String m1299toStringLxnNnR4(byte b, int i) {
        java.lang.String string = java.lang.Integer.toString(b & kotlin.UByte.MAX_VALUE, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return string;
    }

    /* JADX INFO: renamed from: toString-olVBNx4, reason: not valid java name */
    public static final java.lang.String m1301toStringolVBNx4(short s, int i) {
        java.lang.String string = java.lang.Integer.toString(s & kotlin.UShort.MAX_VALUE, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return string;
    }

    /* JADX INFO: renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final java.lang.String m1300toStringV7xB4Y4(int i, int i2) {
        java.lang.String string = java.lang.Long.toString(((long) i) & 4294967295L, kotlin.text.CharsKt.checkRadix(i2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "java.lang.Long.toString(this, checkRadix(radix))");
        return string;
    }

    /* JADX INFO: renamed from: toString-JSWoG40, reason: not valid java name */
    public static final java.lang.String m1298toStringJSWoG40(long j, int i) {
        return kotlin.UnsignedKt.ulongToString(j, kotlin.text.CharsKt.checkRadix(i));
    }

    public static final byte toUByte(java.lang.String toUByte) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUByte, "$this$toUByte");
        kotlin.UByte uByteOrNull = toUByteOrNull(toUByte);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(toUByte);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final byte toUByte(java.lang.String toUByte, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUByte, "$this$toUByte");
        kotlin.UByte uByteOrNull = toUByteOrNull(toUByte, i);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(toUByte);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final short toUShort(java.lang.String toUShort) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUShort, "$this$toUShort");
        kotlin.UShort uShortOrNull = toUShortOrNull(toUShort);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(toUShort);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final short toUShort(java.lang.String toUShort, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUShort, "$this$toUShort");
        kotlin.UShort uShortOrNull = toUShortOrNull(toUShort, i);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(toUShort);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final int toUInt(java.lang.String toUInt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUInt, "$this$toUInt");
        kotlin.UInt uIntOrNull = toUIntOrNull(toUInt);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(toUInt);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final int toUInt(java.lang.String toUInt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUInt, "$this$toUInt");
        kotlin.UInt uIntOrNull = toUIntOrNull(toUInt, i);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(toUInt);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final long toULong(java.lang.String toULong) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toULong, "$this$toULong");
        kotlin.ULong uLongOrNull = toULongOrNull(toULong);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(toULong);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final long toULong(java.lang.String toULong, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toULong, "$this$toULong");
        kotlin.ULong uLongOrNull = toULongOrNull(toULong, i);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(toULong);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlin.UByte toUByteOrNull(java.lang.String toUByteOrNull) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUByteOrNull, "$this$toUByteOrNull");
        return toUByteOrNull(toUByteOrNull, 10);
    }

    public static final kotlin.UByte toUByteOrNull(java.lang.String toUByteOrNull, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUByteOrNull, "$this$toUByteOrNull");
        kotlin.UInt uIntOrNull = toUIntOrNull(toUByteOrNull, i);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (kotlin.UnsignedKt.uintCompare(data, kotlin.UInt.m107constructorimpl(255)) > 0) {
            return null;
        }
        return kotlin.UByte.m25boximpl(kotlin.UByte.m31constructorimpl((byte) data));
    }

    public static final kotlin.UShort toUShortOrNull(java.lang.String toUShortOrNull) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUShortOrNull, "$this$toUShortOrNull");
        return toUShortOrNull(toUShortOrNull, 10);
    }

    public static final kotlin.UShort toUShortOrNull(java.lang.String toUShortOrNull, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUShortOrNull, "$this$toUShortOrNull");
        kotlin.UInt uIntOrNull = toUIntOrNull(toUShortOrNull, i);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (kotlin.UnsignedKt.uintCompare(data, kotlin.UInt.m107constructorimpl(androidx.core.internal.view.SupportMenu.USER_MASK)) > 0) {
            return null;
        }
        return kotlin.UShort.m285boximpl(kotlin.UShort.m291constructorimpl((short) data));
    }

    public static final kotlin.UInt toUIntOrNull(java.lang.String toUIntOrNull) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUIntOrNull, "$this$toUIntOrNull");
        return toUIntOrNull(toUIntOrNull, 10);
    }

    public static final kotlin.UInt toUIntOrNull(java.lang.String toUIntOrNull, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUIntOrNull, "$this$toUIntOrNull");
        kotlin.text.CharsKt.checkRadix(i);
        int length = toUIntOrNull.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = toUIntOrNull.charAt(0);
        int i3 = 1;
        if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 48) >= 0) {
            i3 = 0;
        } else if (length == 1 || cCharAt != '+') {
            return null;
        }
        int iM107constructorimpl = kotlin.UInt.m107constructorimpl(i);
        int iM360uintDivideJ1ME1BU = 119304647;
        while (i3 < length) {
            int iDigitOf = kotlin.text.CharsKt.digitOf(toUIntOrNull.charAt(i3), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (kotlin.UnsignedKt.uintCompare(i2, iM360uintDivideJ1ME1BU) > 0) {
                if (iM360uintDivideJ1ME1BU == 119304647) {
                    iM360uintDivideJ1ME1BU = kotlin.UnsignedKt.m360uintDivideJ1ME1BU(-1, iM107constructorimpl);
                    if (kotlin.UnsignedKt.uintCompare(i2, iM360uintDivideJ1ME1BU) > 0) {
                    }
                }
                return null;
            }
            int iM107constructorimpl2 = kotlin.UInt.m107constructorimpl(i2 * iM107constructorimpl);
            int iM107constructorimpl3 = kotlin.UInt.m107constructorimpl(kotlin.UInt.m107constructorimpl(iDigitOf) + iM107constructorimpl2);
            if (kotlin.UnsignedKt.uintCompare(iM107constructorimpl3, iM107constructorimpl2) < 0) {
                return null;
            }
            i3++;
            i2 = iM107constructorimpl3;
        }
        return kotlin.UInt.m101boximpl(i2);
    }

    public static final kotlin.ULong toULongOrNull(java.lang.String toULongOrNull) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toULongOrNull, "$this$toULongOrNull");
        return toULongOrNull(toULongOrNull, 10);
    }

    public static final kotlin.ULong toULongOrNull(java.lang.String toULongOrNull, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toULongOrNull, "$this$toULongOrNull");
        kotlin.text.CharsKt.checkRadix(i);
        int length = toULongOrNull.length();
        if (length == 0) {
            return null;
        }
        long j = -1;
        int i2 = 0;
        char cCharAt = toULongOrNull.charAt(0);
        if (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 48) < 0) {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i2 = 1;
        }
        long jM185constructorimpl = kotlin.ULong.m185constructorimpl(i);
        long j2 = 0;
        long jM362ulongDivideeb3DHEI = 512409557603043100L;
        while (i2 < length) {
            int iDigitOf = kotlin.text.CharsKt.digitOf(toULongOrNull.charAt(i2), i);
            if (iDigitOf < 0) {
                return null;
            }
            if (kotlin.UnsignedKt.ulongCompare(j2, jM362ulongDivideeb3DHEI) > 0) {
                if (jM362ulongDivideeb3DHEI == 512409557603043100L) {
                    jM362ulongDivideeb3DHEI = kotlin.UnsignedKt.m362ulongDivideeb3DHEI(j, jM185constructorimpl);
                    if (kotlin.UnsignedKt.ulongCompare(j2, jM362ulongDivideeb3DHEI) > 0) {
                    }
                }
                return null;
            }
            long jM185constructorimpl2 = kotlin.ULong.m185constructorimpl(j2 * jM185constructorimpl);
            long jM185constructorimpl3 = kotlin.ULong.m185constructorimpl(kotlin.ULong.m185constructorimpl(((long) kotlin.UInt.m107constructorimpl(iDigitOf)) & 4294967295L) + jM185constructorimpl2);
            if (kotlin.UnsignedKt.ulongCompare(jM185constructorimpl3, jM185constructorimpl2) < 0) {
                return null;
            }
            i2++;
            j2 = jM185constructorimpl3;
            j = -1;
        }
        return kotlin.ULong.m179boximpl(j2);
    }
}
