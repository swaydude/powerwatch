package kotlin.collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MutableCollections.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a9\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001a9\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u000e\u001a(\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0013\u001a.\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a(\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0013\u001a.\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a-\u0010\u0016\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0018\u001a&\u0010\u0016\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0087\b¢\u0006\u0002\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010\u001c\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001dH\u0087\b\u001a*\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a*\u0010\u001c\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a\u001d\u0010\u001e\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001f\u001a\u001d\u0010!\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010\"\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001f\u001a-\u0010#\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010#\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010#\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010#\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0017*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001dH\u0087\b\u001a*\u0010#\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a*\u0010#\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\f\u001a\u0015\u0010$\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0002\b%¨\u0006&"}, d2 = {"addAll", "", "T", "", "elements", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "filterInPlace", "", "predicate", "Lkotlin/Function1;", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "", "minusAssign", "", "element", "(Ljava/util/Collection;Ljava/lang/Object;)V", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "plusAssign", "remove", "Lkotlin/internal/OnlyInputTypes;", "(Ljava/util/Collection;Ljava/lang/Object;)Z", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "(Ljava/util/List;I)Ljava/lang/Object;", "removeAll", "", "removeFirst", "(Ljava/util/List;)Ljava/lang/Object;", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "retainNothing", "retainNothing$CollectionsKt__MutableCollectionsKt", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__MutableCollectionsKt extends kotlin.collections.CollectionsKt__MutableCollectionsJVMKt {
    private static final <T> boolean remove(java.util.Collection<? extends T> collection, T t) {
        java.util.Objects.requireNonNull(collection, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        return kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(collection).remove(t);
    }

    private static final <T> boolean removeAll(java.util.Collection<? extends T> collection, java.util.Collection<? extends T> collection2) {
        java.util.Objects.requireNonNull(collection, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        return kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(collection).removeAll(collection2);
    }

    private static final <T> boolean retainAll(java.util.Collection<? extends T> collection, java.util.Collection<? extends T> collection2) {
        java.util.Objects.requireNonNull(collection, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        return kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(collection).retainAll(collection2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void plusAssign(java.util.Collection<? super T> plusAssign, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plusAssign, "$this$plusAssign");
        plusAssign.add(t);
    }

    private static final <T> void plusAssign(java.util.Collection<? super T> plusAssign, java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plusAssign, "$this$plusAssign");
        kotlin.collections.CollectionsKt.addAll(plusAssign, iterable);
    }

    private static final <T> void plusAssign(java.util.Collection<? super T> plusAssign, T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plusAssign, "$this$plusAssign");
        kotlin.collections.CollectionsKt.addAll(plusAssign, tArr);
    }

    private static final <T> void plusAssign(java.util.Collection<? super T> plusAssign, kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plusAssign, "$this$plusAssign");
        kotlin.collections.CollectionsKt.addAll(plusAssign, sequence);
    }

    private static final <T> void minusAssign(java.util.Collection<? super T> minusAssign, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minusAssign, "$this$minusAssign");
        minusAssign.remove(t);
    }

    private static final <T> void minusAssign(java.util.Collection<? super T> minusAssign, java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minusAssign, "$this$minusAssign");
        kotlin.collections.CollectionsKt.removeAll(minusAssign, iterable);
    }

    private static final <T> void minusAssign(java.util.Collection<? super T> minusAssign, T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minusAssign, "$this$minusAssign");
        kotlin.collections.CollectionsKt.removeAll(minusAssign, tArr);
    }

    private static final <T> void minusAssign(java.util.Collection<? super T> minusAssign, kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minusAssign, "$this$minusAssign");
        kotlin.collections.CollectionsKt.removeAll(minusAssign, sequence);
    }

    public static final <T> boolean addAll(java.util.Collection<? super T> addAll, java.lang.Iterable<? extends T> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addAll, "$this$addAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof java.util.Collection) {
            return addAll.addAll((java.util.Collection) elements);
        }
        boolean z = false;
        java.util.Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            if (addAll.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean addAll(java.util.Collection<? super T> addAll, kotlin.sequences.Sequence<? extends T> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addAll, "$this$addAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        java.util.Iterator<? extends T> it = elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (addAll.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean addAll(java.util.Collection<? super T> addAll, T[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addAll, "$this$addAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll.addAll(kotlin.collections.ArraysKt.asList(elements));
    }

    public static final <T> boolean removeAll(java.util.Collection<? super T> removeAll, java.lang.Iterable<? extends T> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeAll, "$this$removeAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(removeAll).removeAll(kotlin.collections.CollectionsKt.convertToSetForSetOperationWith(elements, removeAll));
    }

    public static final <T> boolean removeAll(java.util.Collection<? super T> removeAll, kotlin.sequences.Sequence<? extends T> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeAll, "$this$removeAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        java.util.HashSet hashSet = kotlin.sequences.SequencesKt.toHashSet(elements);
        return (hashSet.isEmpty() ^ true) && removeAll.removeAll(hashSet);
    }

    public static final <T> boolean removeAll(java.util.Collection<? super T> removeAll, T[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeAll, "$this$removeAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return ((elements.length == 0) ^ true) && removeAll.removeAll(kotlin.collections.ArraysKt.toHashSet(elements));
    }

    public static final <T> boolean retainAll(java.util.Collection<? super T> retainAll, java.lang.Iterable<? extends T> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retainAll, "$this$retainAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(retainAll).retainAll(kotlin.collections.CollectionsKt.convertToSetForSetOperationWith(elements, retainAll));
    }

    public static final <T> boolean retainAll(java.util.Collection<? super T> retainAll, T[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retainAll, "$this$retainAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements.length == 0)) {
            return retainAll.retainAll(kotlin.collections.ArraysKt.toHashSet(elements));
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt(retainAll);
    }

    public static final <T> boolean retainAll(java.util.Collection<? super T> retainAll, kotlin.sequences.Sequence<? extends T> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retainAll, "$this$retainAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        java.util.HashSet hashSet = kotlin.sequences.SequencesKt.toHashSet(elements);
        if (!hashSet.isEmpty()) {
            return retainAll.retainAll(hashSet);
        }
        return retainNothing$CollectionsKt__MutableCollectionsKt(retainAll);
    }

    private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(java.util.Collection<?> collection) {
        boolean z = !collection.isEmpty();
        collection.clear();
        return z;
    }

    public static final <T> boolean removeAll(java.lang.Iterable<? extends T> removeAll, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeAll, "$this$removeAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((java.lang.Iterable) removeAll, (kotlin.jvm.functions.Function1) predicate, true);
    }

    public static final <T> boolean retainAll(java.lang.Iterable<? extends T> retainAll, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retainAll, "$this$retainAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((java.lang.Iterable) retainAll, (kotlin.jvm.functions.Function1) predicate, false);
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, boolean z) {
        java.util.Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @kotlin.ReplaceWith(expression = "removeAt(index)", imports = {}))
    private static final <T> T remove(java.util.List<T> list, int i) {
        return list.remove(i);
    }

    public static final <T> T removeFirst(java.util.List<T> removeFirst) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeFirst, "$this$removeFirst");
        if (removeFirst.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return removeFirst.remove(0);
    }

    public static final <T> T removeFirstOrNull(java.util.List<T> removeFirstOrNull) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeFirstOrNull, "$this$removeFirstOrNull");
        if (removeFirstOrNull.isEmpty()) {
            return null;
        }
        return removeFirstOrNull.remove(0);
    }

    public static final <T> T removeLast(java.util.List<T> removeLast) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeLast, "$this$removeLast");
        if (removeLast.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return removeLast.remove(kotlin.collections.CollectionsKt.getLastIndex(removeLast));
    }

    public static final <T> T removeLastOrNull(java.util.List<T> removeLastOrNull) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeLastOrNull, "$this$removeLastOrNull");
        if (removeLastOrNull.isEmpty()) {
            return null;
        }
        return removeLastOrNull.remove(kotlin.collections.CollectionsKt.getLastIndex(removeLastOrNull));
    }

    public static final <T> boolean removeAll(java.util.List<T> removeAll, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeAll, "$this$removeAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((java.util.List) removeAll, (kotlin.jvm.functions.Function1) predicate, true);
    }

    public static final <T> boolean retainAll(java.util.List<T> retainAll, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retainAll, "$this$retainAll");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        return filterInPlace$CollectionsKt__MutableCollectionsKt((java.util.List) retainAll, (kotlin.jvm.functions.Function1) predicate, false);
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(java.util.List<T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, boolean z) {
        int i;
        if (!(list instanceof java.util.RandomAccess)) {
            java.util.Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
            return filterInPlace$CollectionsKt__MutableCollectionsKt(kotlin.jvm.internal.TypeIntrinsics.asMutableIterable(list), function1, z);
        }
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                T t = list.get(i2);
                if (function1.invoke(t).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex2 < i) {
            return true;
        }
        while (true) {
            list.remove(lastIndex2);
            if (lastIndex2 == i) {
                return true;
            }
            lastIndex2--;
        }
    }
}
