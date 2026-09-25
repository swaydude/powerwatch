package kotlin.reflect.jvm.internal.pcollections;

/* JADX INFO: loaded from: classes2.dex */
public final class HashPMap<K, V> {
    private static final kotlin.reflect.jvm.internal.pcollections.HashPMap<java.lang.Object, java.lang.Object> EMPTY = new kotlin.reflect.jvm.internal.pcollections.HashPMap<>(kotlin.reflect.jvm.internal.pcollections.IntTreePMap.empty(), 0);
    private final kotlin.reflect.jvm.internal.pcollections.IntTreePMap<kotlin.reflect.jvm.internal.pcollections.ConsPStack<kotlin.reflect.jvm.internal.pcollections.MapEntry<K, V>>> intMap;
    private final int size;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", objArr));
    }

    public static <K, V> kotlin.reflect.jvm.internal.pcollections.HashPMap<K, V> empty() {
        kotlin.reflect.jvm.internal.pcollections.HashPMap<K, V> hashPMap = (kotlin.reflect.jvm.internal.pcollections.HashPMap<K, V>) EMPTY;
        if (hashPMap == null) {
            $$$reportNull$$$0(0);
        }
        return hashPMap;
    }

    private HashPMap(kotlin.reflect.jvm.internal.pcollections.IntTreePMap<kotlin.reflect.jvm.internal.pcollections.ConsPStack<kotlin.reflect.jvm.internal.pcollections.MapEntry<K, V>>> intTreePMap, int i) {
        this.intMap = intTreePMap;
        this.size = i;
    }

    public int size() {
        return this.size;
    }

    public boolean containsKey(java.lang.Object obj) {
        return keyIndexIn(getEntries(obj.hashCode()), obj) != -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V get(java.lang.Object obj) {
        for (kotlin.reflect.jvm.internal.pcollections.ConsPStack entries = getEntries(obj.hashCode()); entries != null && entries.size() > 0; entries = entries.rest) {
            kotlin.reflect.jvm.internal.pcollections.MapEntry mapEntry = (kotlin.reflect.jvm.internal.pcollections.MapEntry) entries.first;
            if (mapEntry.key.equals(obj)) {
                return mapEntry.value;
            }
        }
        return null;
    }

    public kotlin.reflect.jvm.internal.pcollections.HashPMap<K, V> plus(K k, V v) {
        kotlin.reflect.jvm.internal.pcollections.ConsPStack<kotlin.reflect.jvm.internal.pcollections.MapEntry<K, V>> entries = getEntries(k.hashCode());
        int size = entries.size();
        int iKeyIndexIn = keyIndexIn(entries, k);
        if (iKeyIndexIn != -1) {
            entries = entries.minus(iKeyIndexIn);
        }
        kotlin.reflect.jvm.internal.pcollections.ConsPStack<kotlin.reflect.jvm.internal.pcollections.MapEntry<K, V>> consPStackPlus = entries.plus(new kotlin.reflect.jvm.internal.pcollections.MapEntry<>(k, v));
        return new kotlin.reflect.jvm.internal.pcollections.HashPMap<>(this.intMap.plus(k.hashCode(), consPStackPlus), (this.size - size) + consPStackPlus.size());
    }

    public kotlin.reflect.jvm.internal.pcollections.HashPMap<K, V> minus(java.lang.Object obj) {
        kotlin.reflect.jvm.internal.pcollections.ConsPStack<kotlin.reflect.jvm.internal.pcollections.MapEntry<K, V>> entries = getEntries(obj.hashCode());
        int iKeyIndexIn = keyIndexIn(entries, obj);
        if (iKeyIndexIn == -1) {
            return this;
        }
        kotlin.reflect.jvm.internal.pcollections.ConsPStack<kotlin.reflect.jvm.internal.pcollections.MapEntry<K, V>> consPStackMinus = entries.minus(iKeyIndexIn);
        if (consPStackMinus.size() == 0) {
            return new kotlin.reflect.jvm.internal.pcollections.HashPMap<>(this.intMap.minus(obj.hashCode()), this.size - 1);
        }
        return new kotlin.reflect.jvm.internal.pcollections.HashPMap<>(this.intMap.plus(obj.hashCode(), consPStackMinus), this.size - 1);
    }

    private kotlin.reflect.jvm.internal.pcollections.ConsPStack<kotlin.reflect.jvm.internal.pcollections.MapEntry<K, V>> getEntries(int i) {
        kotlin.reflect.jvm.internal.pcollections.ConsPStack<kotlin.reflect.jvm.internal.pcollections.MapEntry<K, V>> consPStack = this.intMap.get(i);
        return consPStack == null ? kotlin.reflect.jvm.internal.pcollections.ConsPStack.empty() : consPStack;
    }

    private static <K, V> int keyIndexIn(kotlin.reflect.jvm.internal.pcollections.ConsPStack<kotlin.reflect.jvm.internal.pcollections.MapEntry<K, V>> consPStack, java.lang.Object obj) {
        int i = 0;
        while (consPStack != null && consPStack.size() > 0) {
            if (consPStack.first.key.equals(obj)) {
                return i;
            }
            consPStack = consPStack.rest;
            i++;
        }
        return -1;
    }
}
