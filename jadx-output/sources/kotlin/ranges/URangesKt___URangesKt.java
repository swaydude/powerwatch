package kotlin.ranges;

/* JADX INFO: compiled from: _URanges.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001e\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001e\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001e\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\r\u001a&\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a&\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\nø\u0001\u0000¢\u0006\u0002\b*\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\nø\u0001\u0000¢\u0006\u0002\b4\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u001f\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001f\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u001f\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001f\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a\u0015\u0010C\u001a\u00020\u0005*\u00020%H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010D\u001a\u001c\u0010C\u001a\u00020\u0005*\u00020%2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000¢\u0006\u0002\u0010F\u001a\u0015\u0010C\u001a\u00020\b*\u00020/H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010G\u001a\u001c\u0010C\u001a\u00020\b*\u00020/2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000¢\u0006\u0002\u0010H\u001a\u0012\u0010I\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0087\bø\u0001\u0000\u001a\u0019\u0010I\u001a\u0004\u0018\u00010\u0005*\u00020%2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000\u001a\u0012\u0010I\u001a\u0004\u0018\u00010\b*\u00020/H\u0087\bø\u0001\u0000\u001a\u0019\u0010I\u001a\u0004\u0018\u00010\b*\u00020/2\u0006\u0010C\u001a\u00020EH\u0007ø\u0001\u0000\u001a\f\u0010J\u001a\u000208*\u000208H\u0007\u001a\f\u0010J\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010K\u001a\u000208*\u0002082\u0006\u0010K\u001a\u00020LH\u0087\u0004\u001a\u0015\u0010K\u001a\u00020>*\u00020>2\u0006\u0010K\u001a\u00020MH\u0087\u0004\u001a\u001f\u0010N\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a\u001f\u0010N\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a\u001f\u0010N\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a\u001f\u0010N\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", "", "Lkotlin/ranges/UIntRange;", "value", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/ranges/URangesKt")
class URangesKt___URangesKt {
    private static final int random(kotlin.ranges.UIntRange uIntRange) {
        return kotlin.ranges.URangesKt.random(uIntRange, kotlin.random.Random.INSTANCE);
    }

    private static final long random(kotlin.ranges.ULongRange uLongRange) {
        return kotlin.ranges.URangesKt.random(uLongRange, kotlin.random.Random.INSTANCE);
    }

    public static final int random(kotlin.ranges.UIntRange random, kotlin.random.Random random2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "$this$random");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random2, "random");
        try {
            return kotlin.random.URandomKt.nextUInt(random2, random);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public static final long random(kotlin.ranges.ULongRange random, kotlin.random.Random random2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "$this$random");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random2, "random");
        try {
            return kotlin.random.URandomKt.nextULong(random2, random);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    private static final kotlin.UInt randomOrNull(kotlin.ranges.UIntRange uIntRange) {
        return kotlin.ranges.URangesKt.randomOrNull(uIntRange, kotlin.random.Random.INSTANCE);
    }

    private static final kotlin.ULong randomOrNull(kotlin.ranges.ULongRange uLongRange) {
        return kotlin.ranges.URangesKt.randomOrNull(uLongRange, kotlin.random.Random.INSTANCE);
    }

    public static final kotlin.UInt randomOrNull(kotlin.ranges.UIntRange randomOrNull, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return kotlin.UInt.m101boximpl(kotlin.random.URandomKt.nextUInt(random, randomOrNull));
    }

    public static final kotlin.ULong randomOrNull(kotlin.ranges.ULongRange randomOrNull, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(randomOrNull, "$this$randomOrNull");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        if (randomOrNull.isEmpty()) {
            return null;
        }
        return kotlin.ULong.m179boximpl(kotlin.random.URandomKt.nextULong(random, randomOrNull));
    }

    /* JADX INFO: renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m1249containsbiwQdVI(kotlin.ranges.UIntRange contains, kotlin.UInt uInt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uInt != null && contains.m1221containsWZ4Q5Ns(uInt.getData());
    }

    /* JADX INFO: renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m1245containsGYNo2lE(kotlin.ranges.ULongRange contains, kotlin.ULong uLong) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uLong != null && contains.m1227containsVKZWuLQ(uLong.getData());
    }

    /* JADX INFO: renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m1244contains68kG9v0(kotlin.ranges.UIntRange contains, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1221containsWZ4Q5Ns(kotlin.UInt.m107constructorimpl(b & kotlin.UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m1247containsULbyJY(kotlin.ranges.ULongRange contains, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1227containsVKZWuLQ(kotlin.ULong.m185constructorimpl(((long) b) & 255));
    }

    /* JADX INFO: renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m1246containsGab390E(kotlin.ranges.ULongRange contains, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1227containsVKZWuLQ(kotlin.ULong.m185constructorimpl(((long) i) & 4294967295L));
    }

    /* JADX INFO: renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m1250containsfz5IDCE(kotlin.ranges.UIntRange contains, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return kotlin.ULong.m185constructorimpl(j >>> 32) == 0 && contains.m1221containsWZ4Q5Ns(kotlin.UInt.m107constructorimpl((int) j));
    }

    /* JADX INFO: renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m1248containsZsK3CEQ(kotlin.ranges.UIntRange contains, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1221containsWZ4Q5Ns(kotlin.UInt.m107constructorimpl(s & kotlin.UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m1251containsuhHAxoY(kotlin.ranges.ULongRange contains, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1227containsVKZWuLQ(kotlin.ULong.m185constructorimpl(((long) s) & 65535));
    }

    /* JADX INFO: renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m1254downToKr8caGY(byte b, byte b2) {
        return kotlin.ranges.UIntProgression.INSTANCE.m1220fromClosedRangeNkh28Cs(kotlin.UInt.m107constructorimpl(b & kotlin.UByte.MAX_VALUE), kotlin.UInt.m107constructorimpl(b2 & kotlin.UByte.MAX_VALUE), -1);
    }

    /* JADX INFO: renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m1253downToJ1ME1BU(int i, int i2) {
        return kotlin.ranges.UIntProgression.INSTANCE.m1220fromClosedRangeNkh28Cs(i, i2, -1);
    }

    /* JADX INFO: renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final kotlin.ranges.ULongProgression m1255downToeb3DHEI(long j, long j2) {
        return kotlin.ranges.ULongProgression.INSTANCE.m1226fromClosedRange7ftBX0g(j, j2, -1L);
    }

    /* JADX INFO: renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m1252downTo5PvTz6A(short s, short s2) {
        return kotlin.ranges.UIntProgression.INSTANCE.m1220fromClosedRangeNkh28Cs(kotlin.UInt.m107constructorimpl(s & kotlin.UShort.MAX_VALUE), kotlin.UInt.m107constructorimpl(s2 & kotlin.UShort.MAX_VALUE), -1);
    }

    public static final kotlin.ranges.UIntProgression reversed(kotlin.ranges.UIntProgression reversed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        return kotlin.ranges.UIntProgression.INSTANCE.m1220fromClosedRangeNkh28Cs(reversed.getLast(), reversed.getFirst(), -reversed.getStep());
    }

    public static final kotlin.ranges.ULongProgression reversed(kotlin.ranges.ULongProgression reversed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        return kotlin.ranges.ULongProgression.INSTANCE.m1226fromClosedRange7ftBX0g(reversed.getLast(), reversed.getFirst(), -reversed.getStep());
    }

    public static final kotlin.ranges.UIntProgression step(kotlin.ranges.UIntProgression step, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "$this$step");
        kotlin.ranges.RangesKt.checkStepIsPositive(i > 0, java.lang.Integer.valueOf(i));
        kotlin.ranges.UIntProgression.Companion companion = kotlin.ranges.UIntProgression.INSTANCE;
        int first = step.getFirst();
        int last = step.getLast();
        if (step.getStep() <= 0) {
            i = -i;
        }
        return companion.m1220fromClosedRangeNkh28Cs(first, last, i);
    }

    public static final kotlin.ranges.ULongProgression step(kotlin.ranges.ULongProgression step, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "$this$step");
        kotlin.ranges.RangesKt.checkStepIsPositive(j > 0, java.lang.Long.valueOf(j));
        kotlin.ranges.ULongProgression.Companion companion = kotlin.ranges.ULongProgression.INSTANCE;
        long first = step.getFirst();
        long last = step.getLast();
        if (step.getStep() <= 0) {
            j = -j;
        }
        return companion.m1226fromClosedRange7ftBX0g(first, last, j);
    }

    /* JADX INFO: renamed from: until-Kr8caGY, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m1258untilKr8caGY(byte b, byte b2) {
        int i = b2 & kotlin.UByte.MAX_VALUE;
        return kotlin.jvm.internal.Intrinsics.compare(i, 0) <= 0 ? kotlin.ranges.UIntRange.INSTANCE.getEMPTY() : new kotlin.ranges.UIntRange(kotlin.UInt.m107constructorimpl(b & kotlin.UByte.MAX_VALUE), kotlin.UInt.m107constructorimpl(kotlin.UInt.m107constructorimpl(i) - 1), null);
    }

    /* JADX INFO: renamed from: until-J1ME1BU, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m1257untilJ1ME1BU(int i, int i2) {
        return kotlin.UnsignedKt.uintCompare(i2, 0) <= 0 ? kotlin.ranges.UIntRange.INSTANCE.getEMPTY() : new kotlin.ranges.UIntRange(i, kotlin.UInt.m107constructorimpl(i2 - 1), null);
    }

    /* JADX INFO: renamed from: until-eb3DHEI, reason: not valid java name */
    public static final kotlin.ranges.ULongRange m1259untileb3DHEI(long j, long j2) {
        return kotlin.UnsignedKt.ulongCompare(j2, 0L) <= 0 ? kotlin.ranges.ULongRange.INSTANCE.getEMPTY() : new kotlin.ranges.ULongRange(j, kotlin.ULong.m185constructorimpl(j2 - kotlin.ULong.m185constructorimpl(((long) 1) & 4294967295L)), null);
    }

    /* JADX INFO: renamed from: until-5PvTz6A, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m1256until5PvTz6A(short s, short s2) {
        int i = s2 & kotlin.UShort.MAX_VALUE;
        return kotlin.jvm.internal.Intrinsics.compare(i, 0) <= 0 ? kotlin.ranges.UIntRange.INSTANCE.getEMPTY() : new kotlin.ranges.UIntRange(kotlin.UInt.m107constructorimpl(s & kotlin.UShort.MAX_VALUE), kotlin.UInt.m107constructorimpl(kotlin.UInt.m107constructorimpl(i) - 1), null);
    }

    /* JADX INFO: renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m1231coerceAtLeastJ1ME1BU(int i, int i2) {
        return kotlin.UnsignedKt.uintCompare(i, i2) < 0 ? i2 : i;
    }

    /* JADX INFO: renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m1233coerceAtLeasteb3DHEI(long j, long j2) {
        return kotlin.UnsignedKt.ulongCompare(j, j2) < 0 ? j2 : j;
    }

    /* JADX INFO: renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m1232coerceAtLeastKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b & kotlin.UByte.MAX_VALUE, b2 & kotlin.UByte.MAX_VALUE) < 0 ? b2 : b;
    }

    /* JADX INFO: renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m1230coerceAtLeast5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s & kotlin.UShort.MAX_VALUE, 65535 & s2) < 0 ? s2 : s;
    }

    /* JADX INFO: renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m1235coerceAtMostJ1ME1BU(int i, int i2) {
        return kotlin.UnsignedKt.uintCompare(i, i2) > 0 ? i2 : i;
    }

    /* JADX INFO: renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m1237coerceAtMosteb3DHEI(long j, long j2) {
        return kotlin.UnsignedKt.ulongCompare(j, j2) > 0 ? j2 : j;
    }

    /* JADX INFO: renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m1236coerceAtMostKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b & kotlin.UByte.MAX_VALUE, b2 & kotlin.UByte.MAX_VALUE) > 0 ? b2 : b;
    }

    /* JADX INFO: renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m1234coerceAtMost5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s & kotlin.UShort.MAX_VALUE, 65535 & s2) > 0 ? s2 : s;
    }

    /* JADX INFO: renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m1240coerceInWZ9TVnA(int i, int i2, int i3) {
        if (kotlin.UnsignedKt.uintCompare(i2, i3) > 0) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + kotlin.UInt.m152toStringimpl(i3) + " is less than minimum " + kotlin.UInt.m152toStringimpl(i2) + '.');
        }
        if (kotlin.UnsignedKt.uintCompare(i, i2) < 0) {
            return i2;
        }
        return kotlin.UnsignedKt.uintCompare(i, i3) > 0 ? i3 : i;
    }

    /* JADX INFO: renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m1242coerceInsambcqE(long j, long j2, long j3) {
        if (kotlin.UnsignedKt.ulongCompare(j2, j3) > 0) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + kotlin.ULong.m230toStringimpl(j3) + " is less than minimum " + kotlin.ULong.m230toStringimpl(j2) + '.');
        }
        if (kotlin.UnsignedKt.ulongCompare(j, j2) < 0) {
            return j2;
        }
        return kotlin.UnsignedKt.ulongCompare(j, j3) > 0 ? j3 : j;
    }

    /* JADX INFO: renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m1241coerceInb33U2AM(byte b, byte b2, byte b3) {
        int i = b2 & kotlin.UByte.MAX_VALUE;
        int i2 = b3 & kotlin.UByte.MAX_VALUE;
        if (kotlin.jvm.internal.Intrinsics.compare(i, i2) > 0) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + kotlin.UByte.m74toStringimpl(b3) + " is less than minimum " + kotlin.UByte.m74toStringimpl(b2) + '.');
        }
        int i3 = b & kotlin.UByte.MAX_VALUE;
        if (kotlin.jvm.internal.Intrinsics.compare(i3, i) < 0) {
            return b2;
        }
        return kotlin.jvm.internal.Intrinsics.compare(i3, i2) > 0 ? b3 : b;
    }

    /* JADX INFO: renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m1239coerceInVKSA0NQ(short s, short s2, short s3) {
        int i = s2 & kotlin.UShort.MAX_VALUE;
        int i2 = s3 & kotlin.UShort.MAX_VALUE;
        if (kotlin.jvm.internal.Intrinsics.compare(i, i2) > 0) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + kotlin.UShort.m334toStringimpl(s3) + " is less than minimum " + kotlin.UShort.m334toStringimpl(s2) + '.');
        }
        int i3 = 65535 & s;
        if (kotlin.jvm.internal.Intrinsics.compare(i3, i) < 0) {
            return s2;
        }
        return kotlin.jvm.internal.Intrinsics.compare(i3, i2) > 0 ? s3 : s;
    }

    /* JADX INFO: renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m1243coerceInwuiCnnA(int i, kotlin.ranges.ClosedRange<kotlin.UInt> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return ((kotlin.UInt) kotlin.ranges.RangesKt.coerceIn(kotlin.UInt.m101boximpl(i), (kotlin.ranges.ClosedFloatingPointRange<kotlin.UInt>) range)).getData();
        }
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (kotlin.UnsignedKt.uintCompare(i, ((kotlin.UInt) range.getStart()).getData()) < 0) {
            return ((kotlin.UInt) range.getStart()).getData();
        }
        return kotlin.UnsignedKt.uintCompare(i, ((kotlin.UInt) range.getEndInclusive()).getData()) > 0 ? ((kotlin.UInt) range.getEndInclusive()).getData() : i;
    }

    /* JADX INFO: renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m1238coerceInJPwROB0(long j, kotlin.ranges.ClosedRange<kotlin.ULong> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return ((kotlin.ULong) kotlin.ranges.RangesKt.coerceIn(kotlin.ULong.m179boximpl(j), (kotlin.ranges.ClosedFloatingPointRange<kotlin.ULong>) range)).getData();
        }
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        if (kotlin.UnsignedKt.ulongCompare(j, ((kotlin.ULong) range.getStart()).getData()) < 0) {
            return ((kotlin.ULong) range.getStart()).getData();
        }
        return kotlin.UnsignedKt.ulongCompare(j, ((kotlin.ULong) range.getEndInclusive()).getData()) > 0 ? ((kotlin.ULong) range.getEndInclusive()).getData() : j;
    }
}
