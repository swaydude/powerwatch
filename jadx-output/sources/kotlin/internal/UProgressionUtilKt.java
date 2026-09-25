package kotlin.internal;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1201differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int iM361uintRemainderJ1ME1BU = kotlin.UnsignedKt.m361uintRemainderJ1ME1BU(i, i3);
        int iM361uintRemainderJ1ME1BU2 = kotlin.UnsignedKt.m361uintRemainderJ1ME1BU(i2, i3);
        int iUintCompare = kotlin.UnsignedKt.uintCompare(iM361uintRemainderJ1ME1BU, iM361uintRemainderJ1ME1BU2);
        int iM107constructorimpl = kotlin.UInt.m107constructorimpl(iM361uintRemainderJ1ME1BU - iM361uintRemainderJ1ME1BU2);
        return iUintCompare >= 0 ? iM107constructorimpl : kotlin.UInt.m107constructorimpl(iM107constructorimpl + i3);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1202differenceModulosambcqE(long j, long j2, long j3) {
        long jM363ulongRemaindereb3DHEI = kotlin.UnsignedKt.m363ulongRemaindereb3DHEI(j, j3);
        long jM363ulongRemaindereb3DHEI2 = kotlin.UnsignedKt.m363ulongRemaindereb3DHEI(j2, j3);
        int iUlongCompare = kotlin.UnsignedKt.ulongCompare(jM363ulongRemaindereb3DHEI, jM363ulongRemaindereb3DHEI2);
        long jM185constructorimpl = kotlin.ULong.m185constructorimpl(jM363ulongRemaindereb3DHEI - jM363ulongRemaindereb3DHEI2);
        return iUlongCompare >= 0 ? jM185constructorimpl : kotlin.ULong.m185constructorimpl(jM185constructorimpl + j3);
    }

    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1204getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return kotlin.UnsignedKt.uintCompare(i, i2) >= 0 ? i2 : kotlin.UInt.m107constructorimpl(i2 - m1201differenceModuloWZ9TVnA(i2, i, kotlin.UInt.m107constructorimpl(i3)));
        }
        if (i3 < 0) {
            return kotlin.UnsignedKt.uintCompare(i, i2) <= 0 ? i2 : kotlin.UInt.m107constructorimpl(i2 + m1201differenceModuloWZ9TVnA(i, i2, kotlin.UInt.m107constructorimpl(-i3)));
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }

    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1203getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return kotlin.UnsignedKt.ulongCompare(j, j2) >= 0 ? j2 : kotlin.ULong.m185constructorimpl(j2 - m1202differenceModulosambcqE(j2, j, kotlin.ULong.m185constructorimpl(j3)));
        }
        if (j3 < 0) {
            return kotlin.UnsignedKt.ulongCompare(j, j2) <= 0 ? j2 : kotlin.ULong.m185constructorimpl(j2 + m1202differenceModulosambcqE(j, j2, kotlin.ULong.m185constructorimpl(-j3)));
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }
}
