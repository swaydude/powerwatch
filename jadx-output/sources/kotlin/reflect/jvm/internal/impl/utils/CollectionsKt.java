package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: compiled from: collections.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CollectionsKt {
    public static final <K> java.util.Map<K, java.lang.Integer> mapToIndex(java.lang.Iterable<? extends K> mapToIndex) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(mapToIndex, "$this$mapToIndex");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<? extends K> it = mapToIndex.iterator();
        int i = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), java.lang.Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    public static final <T> void addIfNotNull(java.util.Collection<T> addIfNotNull, T t) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(addIfNotNull, "$this$addIfNotNull");
        if (t != null) {
            addIfNotNull.add(t);
        }
    }

    public static final <K, V> java.util.HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new java.util.HashMap<>(capacity(i));
    }

    public static final <E> java.util.HashSet<E> newHashSetWithExpectedSize(int i) {
        return new java.util.HashSet<>(capacity(i));
    }

    public static final <E> java.util.LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
        return new java.util.LinkedHashSet<>(capacity(i));
    }

    private static final int capacity(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    public static final <T> java.util.List<T> compact(java.util.ArrayList<T> compact) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(compact, "$this$compact");
        int size = compact.size();
        if (size == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (size == 1) {
            return kotlin.collections.CollectionsKt.listOf(kotlin.collections.CollectionsKt.first((java.util.List) compact));
        }
        compact.trimToSize();
        return compact;
    }
}
