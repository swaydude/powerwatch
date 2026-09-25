package kotlin.reflect.jvm.internal.impl.util.collectionUtils;

/* JADX INFO: compiled from: scopeUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ScopeUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.Collection<T> concat(java.util.Collection<? extends T> collection, java.util.Collection<? extends T> collection2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof java.util.LinkedHashSet) {
            ((java.util.LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }
}
