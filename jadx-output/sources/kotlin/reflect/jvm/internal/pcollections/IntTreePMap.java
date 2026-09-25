package kotlin.reflect.jvm.internal.pcollections;

/* JADX INFO: loaded from: classes2.dex */
final class IntTreePMap<V> {
    private static final kotlin.reflect.jvm.internal.pcollections.IntTreePMap<java.lang.Object> EMPTY = new kotlin.reflect.jvm.internal.pcollections.IntTreePMap<>(kotlin.reflect.jvm.internal.pcollections.IntTree.EMPTYNODE);
    private final kotlin.reflect.jvm.internal.pcollections.IntTree<V> root;

    public static <V> kotlin.reflect.jvm.internal.pcollections.IntTreePMap<V> empty() {
        return (kotlin.reflect.jvm.internal.pcollections.IntTreePMap<V>) EMPTY;
    }

    private IntTreePMap(kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree) {
        this.root = intTree;
    }

    private kotlin.reflect.jvm.internal.pcollections.IntTreePMap<V> withRoot(kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree) {
        return intTree == this.root ? this : new kotlin.reflect.jvm.internal.pcollections.IntTreePMap<>(intTree);
    }

    public V get(int i) {
        return this.root.get(i);
    }

    public kotlin.reflect.jvm.internal.pcollections.IntTreePMap<V> plus(int i, V v) {
        return withRoot(this.root.plus(i, v));
    }

    public kotlin.reflect.jvm.internal.pcollections.IntTreePMap<V> minus(int i) {
        return withRoot(this.root.minus(i));
    }
}
