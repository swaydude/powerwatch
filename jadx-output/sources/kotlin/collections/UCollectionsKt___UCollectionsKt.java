package kotlin.collections;

/* JADX INFO: compiled from: _UCollections.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u001a\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001a\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001a\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"sum", "Lkotlin/UInt;", "", "Lkotlin/UByte;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "toUByteArray", "Lkotlin/UByteArray;", "", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "(Ljava/util/Collection;)[S", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/collections/UCollectionsKt")
class UCollectionsKt___UCollectionsKt {
    public static final byte[] toUByteArray(java.util.Collection<kotlin.UByte> toUByteArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUByteArray, "$this$toUByteArray");
        byte[] bArrM82constructorimpl = kotlin.UByteArray.m82constructorimpl(toUByteArray.size());
        java.util.Iterator<kotlin.UByte> it = toUByteArray.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UByteArray.m93setVurrAj0(bArrM82constructorimpl, i, it.next().getData());
            i++;
        }
        return bArrM82constructorimpl;
    }

    public static final int[] toUIntArray(java.util.Collection<kotlin.UInt> toUIntArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUIntArray, "$this$toUIntArray");
        int[] iArrM160constructorimpl = kotlin.UIntArray.m160constructorimpl(toUIntArray.size());
        java.util.Iterator<kotlin.UInt> it = toUIntArray.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UIntArray.m171setVXSXFK8(iArrM160constructorimpl, i, it.next().getData());
            i++;
        }
        return iArrM160constructorimpl;
    }

    public static final long[] toULongArray(java.util.Collection<kotlin.ULong> toULongArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toULongArray, "$this$toULongArray");
        long[] jArrM238constructorimpl = kotlin.ULongArray.m238constructorimpl(toULongArray.size());
        java.util.Iterator<kotlin.ULong> it = toULongArray.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.ULongArray.m249setk8EXiF4(jArrM238constructorimpl, i, it.next().getData());
            i++;
        }
        return jArrM238constructorimpl;
    }

    public static final short[] toUShortArray(java.util.Collection<kotlin.UShort> toUShortArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toUShortArray, "$this$toUShortArray");
        short[] sArrM342constructorimpl = kotlin.UShortArray.m342constructorimpl(toUShortArray.size());
        java.util.Iterator<kotlin.UShort> it = toUShortArray.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UShortArray.m353set01HTLdE(sArrM342constructorimpl, i, it.next().getData());
            i++;
        }
        return sArrM342constructorimpl;
    }

    public static final int sumOfUInt(java.lang.Iterable<kotlin.UInt> sum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sum, "$this$sum");
        java.util.Iterator<kotlin.UInt> it = sum.iterator();
        int iM107constructorimpl = 0;
        while (it.hasNext()) {
            iM107constructorimpl = kotlin.UInt.m107constructorimpl(iM107constructorimpl + it.next().getData());
        }
        return iM107constructorimpl;
    }

    public static final long sumOfULong(java.lang.Iterable<kotlin.ULong> sum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sum, "$this$sum");
        java.util.Iterator<kotlin.ULong> it = sum.iterator();
        long jM185constructorimpl = 0;
        while (it.hasNext()) {
            jM185constructorimpl = kotlin.ULong.m185constructorimpl(jM185constructorimpl + it.next().getData());
        }
        return jM185constructorimpl;
    }

    public static final int sumOfUByte(java.lang.Iterable<kotlin.UByte> sum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sum, "$this$sum");
        java.util.Iterator<kotlin.UByte> it = sum.iterator();
        int iM107constructorimpl = 0;
        while (it.hasNext()) {
            iM107constructorimpl = kotlin.UInt.m107constructorimpl(iM107constructorimpl + kotlin.UInt.m107constructorimpl(it.next().getData() & kotlin.UByte.MAX_VALUE));
        }
        return iM107constructorimpl;
    }

    public static final int sumOfUShort(java.lang.Iterable<kotlin.UShort> sum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sum, "$this$sum");
        java.util.Iterator<kotlin.UShort> it = sum.iterator();
        int iM107constructorimpl = 0;
        while (it.hasNext()) {
            iM107constructorimpl = kotlin.UInt.m107constructorimpl(iM107constructorimpl + kotlin.UInt.m107constructorimpl(it.next().getData() & kotlin.UShort.MAX_VALUE));
        }
        return iM107constructorimpl;
    }
}
