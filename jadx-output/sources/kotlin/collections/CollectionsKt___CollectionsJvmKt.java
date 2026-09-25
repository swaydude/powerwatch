package kotlin.collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _CollectionsJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001aA\u0010\u0006\u001a\u0002H\u0007\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\b\"\u0004\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\t\u001a\u0002H\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e\u001a5\u0010\u000f\u001a\u00020\u0010\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00100\u0012H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0013\u001a5\u0010\u000f\u001a\u00020\u0014\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00140\u0012H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0015\u001a&\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\r0\u0017\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u0018*\b\u0012\u0004\u0012\u0002H\r0\u0003\u001a8\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\r0\u0017\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00032\u001a\u0010\u0019\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\r0\u001aj\n\u0012\u0006\b\u0000\u0012\u0002H\r`\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"filterIsInstance", "", "R", "", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "reverse", "", "T", "", "sumOf", "Ljava/math/BigDecimal;", "selector", "Lkotlin/Function1;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt___CollectionsJvmKt extends kotlin.collections.CollectionsKt__ReversedViewsKt {
    public static final <R> java.util.List<R> filterIsInstance(java.lang.Iterable<?> filterIsInstance, java.lang.Class<R> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterIsInstance, "$this$filterIsInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "klass");
        return (java.util.List) kotlin.collections.CollectionsKt.filterIsInstanceTo(filterIsInstance, new java.util.ArrayList(), klass);
    }

    public static final <C extends java.util.Collection<? super R>, R> C filterIsInstanceTo(java.lang.Iterable<?> filterIsInstanceTo, C destination, java.lang.Class<R> klass) {
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

    public static final <T> void reverse(java.util.List<T> reverse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reverse, "$this$reverse");
        java.util.Collections.reverse(reverse);
    }

    public static final <T extends java.lang.Comparable<? super T>> java.util.SortedSet<T> toSortedSet(java.lang.Iterable<? extends T> toSortedSet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toSortedSet, "$this$toSortedSet");
        return (java.util.SortedSet) kotlin.collections.CollectionsKt.toCollection(toSortedSet, new java.util.TreeSet());
    }

    public static final <T> java.util.SortedSet<T> toSortedSet(java.lang.Iterable<? extends T> toSortedSet, java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toSortedSet, "$this$toSortedSet");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (java.util.SortedSet) kotlin.collections.CollectionsKt.toCollection(toSortedSet, new java.util.TreeSet(comparator));
    }

    private static final <T> java.math.BigDecimal sumOfBigDecimal(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, ? extends java.math.BigDecimal> function1) {
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "BigDecimal.valueOf(this.toLong())");
        java.util.Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(it.next()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    private static final <T> java.math.BigInteger sumOfBigInteger(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, ? extends java.math.BigInteger> function1) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "BigInteger.valueOf(this.toLong())");
        java.util.Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(it.next()));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }
}
