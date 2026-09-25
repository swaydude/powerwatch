package kotlin.sequences;

/* JADX INFO: compiled from: _SequencesJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001aA\u0010\u0005\u001a\u0002H\u0006\"\u0010\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0007\"\u0004\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\b\u001a\u0002H\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¢\u0006\u0002\u0010\t\u001a5\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000b0\u000eH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000f\u001a5\u0010\n\u001a\u00020\u0010\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00100\u000eH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0011\u001a&\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\f0\u0013\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0014*\b\u0012\u0004\u0012\u0002H\f0\u0001\u001a8\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\f0\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00012\u001a\u0010\u0015\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\f0\u0016j\n\u0012\u0006\b\u0000\u0012\u0002H\f`\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"filterIsInstance", "Lkotlin/sequences/Sequence;", "R", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "(Lkotlin/sequences/Sequence;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "sumOf", "Ljava/math/BigDecimal;", "T", "selector", "Lkotlin/Function1;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/sequences/SequencesKt")
class SequencesKt___SequencesJvmKt extends kotlin.sequences.SequencesKt__SequencesKt {
    public static final <R> kotlin.sequences.Sequence<R> filterIsInstance(kotlin.sequences.Sequence<?> filterIsInstance, final java.lang.Class<R> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterIsInstance, "$this$filterIsInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
        kotlin.sequences.Sequence<R> sequenceFilter = kotlin.sequences.SequencesKt.filter(filterIsInstance, new kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(invoke2(obj));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(java.lang.Object obj) {
                return klass.isInstance(obj);
            }
        });
        java.util.Objects.requireNonNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
        return sequenceFilter;
    }

    public static final <C extends java.util.Collection<? super R>, R> C filterIsInstanceTo(kotlin.sequences.Sequence<?> filterIsInstanceTo, C destination, java.lang.Class<R> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterIsInstanceTo, "$this$filterIsInstanceTo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
        for (java.lang.Object obj : filterIsInstanceTo) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T extends java.lang.Comparable<? super T>> java.util.SortedSet<T> toSortedSet(kotlin.sequences.Sequence<? extends T> toSortedSet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toSortedSet, "$this$toSortedSet");
        return (java.util.SortedSet) kotlin.sequences.SequencesKt.toCollection(toSortedSet, new java.util.TreeSet());
    }

    public static final <T> java.util.SortedSet<T> toSortedSet(kotlin.sequences.Sequence<? extends T> toSortedSet, java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toSortedSet, "$this$toSortedSet");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (java.util.SortedSet) kotlin.sequences.SequencesKt.toCollection(toSortedSet, new java.util.TreeSet(comparator));
    }

    private static final <T> java.math.BigDecimal sumOfBigDecimal(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function1<? super T, ? extends java.math.BigDecimal> function1) {
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "BigDecimal.valueOf(this.toLong())");
        java.util.Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(it.next()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    private static final <T> java.math.BigInteger sumOfBigInteger(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function1<? super T, ? extends java.math.BigInteger> function1) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "BigInteger.valueOf(this.toLong())");
        java.util.Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(it.next()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }
}
