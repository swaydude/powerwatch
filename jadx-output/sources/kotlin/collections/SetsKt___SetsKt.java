package kotlin.collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Sets.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\r"}, d2 = {"minus", "", "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/collections/SetsKt")
public class SetsKt___SetsKt extends kotlin.collections.SetsKt__SetsKt {
    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> minus, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minus, "$this$minus");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(minus.size()));
        boolean z = false;
        for (T t2 : minus) {
            boolean z2 = true;
            if (!z && kotlin.jvm.internal.Intrinsics.areEqual(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> minus, T[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minus, "$this$minus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(minus);
        kotlin.collections.CollectionsKt.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> minus, java.lang.Iterable<? extends T> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minus, "$this$minus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        java.util.Set<? extends T> set = minus;
        java.util.Collection<?> collectionConvertToSetForSetOperationWith = kotlin.collections.CollectionsKt.convertToSetForSetOperationWith(elements, set);
        if (collectionConvertToSetForSetOperationWith.isEmpty()) {
            return kotlin.collections.CollectionsKt.toSet(set);
        }
        if (collectionConvertToSetForSetOperationWith instanceof java.util.Set) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (T t : set) {
                if (!collectionConvertToSetForSetOperationWith.contains(t)) {
                    linkedHashSet.add(t);
                }
            }
            return linkedHashSet;
        }
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet(minus);
        linkedHashSet2.removeAll(collectionConvertToSetForSetOperationWith);
        return linkedHashSet2;
    }

    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> minus, kotlin.sequences.Sequence<? extends T> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minus, "$this$minus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(minus);
        kotlin.collections.CollectionsKt.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    private static final <T> java.util.Set<T> minusElement(java.util.Set<? extends T> set, T t) {
        return kotlin.collections.SetsKt.minus(set, t);
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> plus, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plus, "$this$plus");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(plus.size() + 1));
        linkedHashSet.addAll(plus);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> plus, T[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plus, "$this$plus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(plus.size() + elements.length));
        linkedHashSet.addAll(plus);
        kotlin.collections.CollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> plus, java.lang.Iterable<? extends T> elements) {
        int size;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plus, "$this$plus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        java.lang.Integer numCollectionSizeOrNull = kotlin.collections.CollectionsKt.collectionSizeOrNull(elements);
        if (numCollectionSizeOrNull != null) {
            size = plus.size() + numCollectionSizeOrNull.intValue();
        } else {
            size = plus.size() * 2;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(size));
        linkedHashSet.addAll(plus);
        kotlin.collections.CollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> plus, kotlin.sequences.Sequence<? extends T> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plus, "$this$plus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(plus.size() * 2));
        linkedHashSet.addAll(plus);
        kotlin.collections.CollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    private static final <T> java.util.Set<T> plusElement(java.util.Set<? extends T> set, T t) {
        return kotlin.collections.SetsKt.plus(set, t);
    }
}
