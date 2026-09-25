package kotlin.streams.jdk8;

/* JADX INFO: compiled from: Streams.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0001H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0003H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f*\u00020\u0005H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\u0007H\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007¨\u0006\r"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "", "Ljava/util/stream/DoubleStream;", "", "Ljava/util/stream/IntStream;", "", "Ljava/util/stream/LongStream;", "T", "Ljava/util/stream/Stream;", "asStream", "toList", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 1, 13}, pn = "kotlin.streams")
public final class StreamsKt {
    public static final <T> kotlin.sequences.Sequence<T> asSequence(final java.util.stream.Stream<T> receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new kotlin.sequences.Sequence<T>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<T> iterator() {
                return receiver$0.iterator();
            }
        };
    }

    public static final kotlin.sequences.Sequence<java.lang.Integer> asSequence(final java.util.stream.IntStream receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new kotlin.sequences.Sequence<java.lang.Integer>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$2
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<java.lang.Integer> iterator() {
                return receiver$0.iterator();
            }
        };
    }

    public static final kotlin.sequences.Sequence<java.lang.Long> asSequence(final java.util.stream.LongStream receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new kotlin.sequences.Sequence<java.lang.Long>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$3
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<java.lang.Long> iterator() {
                return receiver$0.iterator();
            }
        };
    }

    public static final kotlin.sequences.Sequence<java.lang.Double> asSequence(final java.util.stream.DoubleStream receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new kotlin.sequences.Sequence<java.lang.Double>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$4
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<java.lang.Double> iterator() {
                return receiver$0.iterator();
            }
        };
    }

    public static final <T> java.util.stream.Stream<T> asStream(final kotlin.sequences.Sequence<? extends T> receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        java.util.stream.Stream<T> stream = java.util.stream.StreamSupport.stream(new java.util.function.Supplier<java.util.Spliterator<T>>() { // from class: kotlin.streams.jdk8.StreamsKt.asStream.1
            @Override // java.util.function.Supplier
            public final java.util.Spliterator<T> get() {
                return java.util.Spliterators.spliteratorUnknownSize(receiver$0.iterator(), 16);
            }
        }, 16, false);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(stream, "StreamSupport.stream({ S…literator.ORDERED, false)");
        return stream;
    }

    public static final <T> java.util.List<T> toList(java.util.stream.Stream<T> receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        java.lang.Object objCollect = receiver$0.collect(java.util.stream.Collectors.toList());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objCollect, "collect(Collectors.toList<T>())");
        return (java.util.List) objCollect;
    }

    public static final java.util.List<java.lang.Integer> toList(java.util.stream.IntStream receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        int[] array = receiver$0.toArray();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(array, "toArray()");
        return kotlin.collections.ArraysKt.asList(array);
    }

    public static final java.util.List<java.lang.Long> toList(java.util.stream.LongStream receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        long[] array = receiver$0.toArray();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(array, "toArray()");
        return kotlin.collections.ArraysKt.asList(array);
    }

    public static final java.util.List<java.lang.Double> toList(java.util.stream.DoubleStream receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        double[] array = receiver$0.toArray();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(array, "toArray()");
        return kotlin.collections.ArraysKt.asList(array);
    }
}
