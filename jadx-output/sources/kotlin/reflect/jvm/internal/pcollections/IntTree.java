package kotlin.reflect.jvm.internal.pcollections;

/* JADX INFO: loaded from: classes2.dex */
final class IntTree<V> {
    static final kotlin.reflect.jvm.internal.pcollections.IntTree<java.lang.Object> EMPTYNODE = new kotlin.reflect.jvm.internal.pcollections.IntTree<>();
    private final long key;
    private final kotlin.reflect.jvm.internal.pcollections.IntTree<V> left;
    private final kotlin.reflect.jvm.internal.pcollections.IntTree<V> right;
    private final int size;
    private final V value;

    private IntTree() {
        this.size = 0;
        this.key = 0L;
        this.value = null;
        this.left = null;
        this.right = null;
    }

    private IntTree(long j, V v, kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree, kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree2) {
        this.key = j;
        this.value = v;
        this.left = intTree;
        this.right = intTree2;
        this.size = intTree.size + 1 + intTree2.size;
    }

    private kotlin.reflect.jvm.internal.pcollections.IntTree<V> withKey(long j) {
        return (this.size == 0 || j == this.key) ? this : new kotlin.reflect.jvm.internal.pcollections.IntTree<>(j, this.value, this.left, this.right);
    }

    V get(long j) {
        if (this.size == 0) {
            return null;
        }
        long j2 = this.key;
        if (j < j2) {
            return this.left.get(j - j2);
        }
        if (j > j2) {
            return this.right.get(j - j2);
        }
        return this.value;
    }

    kotlin.reflect.jvm.internal.pcollections.IntTree<V> plus(long j, V v) {
        if (this.size == 0) {
            return new kotlin.reflect.jvm.internal.pcollections.IntTree<>(j, v, this, this);
        }
        long j2 = this.key;
        if (j < j2) {
            return rebalanced(this.left.plus(j - j2, v), this.right);
        }
        if (j > j2) {
            return rebalanced(this.left, this.right.plus(j - j2, v));
        }
        return v == this.value ? this : new kotlin.reflect.jvm.internal.pcollections.IntTree<>(j, v, this.left, this.right);
    }

    kotlin.reflect.jvm.internal.pcollections.IntTree<V> minus(long j) {
        if (this.size == 0) {
            return this;
        }
        long j2 = this.key;
        if (j < j2) {
            return rebalanced(this.left.minus(j - j2), this.right);
        }
        if (j > j2) {
            return rebalanced(this.left, this.right.minus(j - j2));
        }
        kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree = this.left;
        if (intTree.size == 0) {
            kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree2 = this.right;
            return intTree2.withKey(intTree2.key + j2);
        }
        kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree3 = this.right;
        if (intTree3.size == 0) {
            return intTree.withKey(intTree.key + j2);
        }
        long jMinKey = intTree3.minKey();
        long j3 = this.key;
        long j4 = jMinKey + j3;
        V v = this.right.get(j4 - j3);
        kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTreeMinus = this.right.minus(j4 - this.key);
        kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTreeWithKey = intTreeMinus.withKey((intTreeMinus.key + this.key) - j4);
        kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree4 = this.left;
        return rebalanced(j4, v, intTree4.withKey((intTree4.key + this.key) - j4), intTreeWithKey);
    }

    private long minKey() {
        kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree = this.left;
        if (intTree.size == 0) {
            return this.key;
        }
        return intTree.minKey() + this.key;
    }

    private kotlin.reflect.jvm.internal.pcollections.IntTree<V> rebalanced(kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree, kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree2) {
        return (intTree == this.left && intTree2 == this.right) ? this : rebalanced(this.key, this.value, intTree, intTree2);
    }

    private static <V> kotlin.reflect.jvm.internal.pcollections.IntTree<V> rebalanced(long j, V v, kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree, kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree2) {
        int i = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree).size;
        int i2 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree2).size;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree3 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree).left;
                kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree4 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree).right;
                if (((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree4).size < ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree3).size * 2) {
                    long j2 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree).key + j;
                    V v2 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree).value;
                    long j3 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree).key;
                    return new kotlin.reflect.jvm.internal.pcollections.IntTree<>(j2, v2, intTree3, new kotlin.reflect.jvm.internal.pcollections.IntTree(-j3, v, intTree4.withKey(((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree4).key + j3), intTree2));
                }
                kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree5 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree4).left;
                kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree6 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree4).right;
                long j4 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree4).key + ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree).key + j;
                V v3 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree4).value;
                long j5 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree4).key;
                kotlin.reflect.jvm.internal.pcollections.IntTree intTree7 = new kotlin.reflect.jvm.internal.pcollections.IntTree(-j5, ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree).value, intTree3, intTree5.withKey(((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree5).key + j5));
                long j6 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree).key;
                long j7 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree4).key;
                return new kotlin.reflect.jvm.internal.pcollections.IntTree<>(j4, v3, intTree7, new kotlin.reflect.jvm.internal.pcollections.IntTree((-j6) - j7, v, intTree6.withKey(((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree6).key + j7 + j6), intTree2));
            }
            if (i2 >= i * 5) {
                kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree8 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree2).left;
                kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree9 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree2).right;
                if (((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree8).size < ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree9).size * 2) {
                    long j8 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree2).key + j;
                    V v4 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree2).value;
                    long j9 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree2).key;
                    return new kotlin.reflect.jvm.internal.pcollections.IntTree<>(j8, v4, new kotlin.reflect.jvm.internal.pcollections.IntTree(-j9, v, intTree, intTree8.withKey(((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree8).key + j9)), intTree9);
                }
                kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree10 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree8).left;
                kotlin.reflect.jvm.internal.pcollections.IntTree<V> intTree11 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree8).right;
                long j10 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree8).key + ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree2).key + j;
                V v5 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree8).value;
                long j11 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree2).key;
                long j12 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree8).key;
                kotlin.reflect.jvm.internal.pcollections.IntTree intTree12 = new kotlin.reflect.jvm.internal.pcollections.IntTree((-j11) - j12, v, intTree, intTree10.withKey(((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree10).key + j12 + j11));
                long j13 = ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree8).key;
                return new kotlin.reflect.jvm.internal.pcollections.IntTree<>(j10, v5, intTree12, new kotlin.reflect.jvm.internal.pcollections.IntTree(-j13, ((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree2).value, intTree11.withKey(((kotlin.reflect.jvm.internal.pcollections.IntTree) intTree11).key + j13), intTree9));
            }
        }
        return new kotlin.reflect.jvm.internal.pcollections.IntTree<>(j, v, intTree, intTree2);
    }
}
