package kotlin.sequences;

/* JADX INFO: compiled from: _USequences.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"sum", "Lkotlin/UInt;", "Lkotlin/sequences/Sequence;", "Lkotlin/UByte;", "sumOfUByte", "(Lkotlin/sequences/Sequence;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UShort;", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/sequences/USequencesKt")
class USequencesKt___USequencesKt {
    public static final int sumOfUInt(kotlin.sequences.Sequence<kotlin.UInt> sum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sum, "$this$sum");
        java.util.Iterator<kotlin.UInt> it = sum.iterator();
        int iM107constructorimpl = 0;
        while (it.hasNext()) {
            iM107constructorimpl = kotlin.UInt.m107constructorimpl(iM107constructorimpl + it.next().getData());
        }
        return iM107constructorimpl;
    }

    public static final long sumOfULong(kotlin.sequences.Sequence<kotlin.ULong> sum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sum, "$this$sum");
        java.util.Iterator<kotlin.ULong> it = sum.iterator();
        long jM185constructorimpl = 0;
        while (it.hasNext()) {
            jM185constructorimpl = kotlin.ULong.m185constructorimpl(jM185constructorimpl + it.next().getData());
        }
        return jM185constructorimpl;
    }

    public static final int sumOfUByte(kotlin.sequences.Sequence<kotlin.UByte> sum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sum, "$this$sum");
        java.util.Iterator<kotlin.UByte> it = sum.iterator();
        int iM107constructorimpl = 0;
        while (it.hasNext()) {
            iM107constructorimpl = kotlin.UInt.m107constructorimpl(iM107constructorimpl + kotlin.UInt.m107constructorimpl(it.next().getData() & kotlin.UByte.MAX_VALUE));
        }
        return iM107constructorimpl;
    }

    public static final int sumOfUShort(kotlin.sequences.Sequence<kotlin.UShort> sum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sum, "$this$sum");
        java.util.Iterator<kotlin.UShort> it = sum.iterator();
        int iM107constructorimpl = 0;
        while (it.hasNext()) {
            iM107constructorimpl = kotlin.UInt.m107constructorimpl(iM107constructorimpl + kotlin.UInt.m107constructorimpl(it.next().getData() & kotlin.UShort.MAX_VALUE));
        }
        return iM107constructorimpl;
    }
}
