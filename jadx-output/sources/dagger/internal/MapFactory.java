package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class MapFactory<K, V> extends dagger.internal.AbstractMapFactory<K, V, V> {
    private static final javax.inject.Provider<java.util.Map<java.lang.Object, java.lang.Object>> EMPTY = dagger.internal.InstanceFactory.create(java.util.Collections.emptyMap());

    public static <K, V> dagger.internal.MapFactory.Builder<K, V> builder(int i) {
        return new dagger.internal.MapFactory.Builder<>(i);
    }

    public static <K, V> javax.inject.Provider<java.util.Map<K, V>> emptyMapProvider() {
        return (javax.inject.Provider<java.util.Map<K, V>>) EMPTY;
    }

    private MapFactory(java.util.Map<K, javax.inject.Provider<V>> map) {
        super(map);
    }

    @Override // javax.inject.Provider
    public java.util.Map<K, V> get() {
        java.util.LinkedHashMap linkedHashMapNewLinkedHashMapWithExpectedSize = dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(contributingMap().size());
        for (java.util.Map.Entry<K, javax.inject.Provider<V>> entry : contributingMap().entrySet()) {
            linkedHashMapNewLinkedHashMapWithExpectedSize.put(entry.getKey(), entry.getValue().get());
        }
        return java.util.Collections.unmodifiableMap(linkedHashMapNewLinkedHashMapWithExpectedSize);
    }

    public static final class Builder<K, V> extends dagger.internal.AbstractMapFactory.Builder<K, V, V> {
        private Builder(int i) {
            super(i);
        }

        @Override // dagger.internal.AbstractMapFactory.Builder
        public dagger.internal.MapFactory.Builder<K, V> put(K k, javax.inject.Provider<V> provider) {
            super.put((java.lang.Object) k, (javax.inject.Provider) provider);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.AbstractMapFactory.Builder
        public dagger.internal.MapFactory.Builder<K, V> putAll(javax.inject.Provider<java.util.Map<K, V>> provider) {
            super.putAll((javax.inject.Provider) provider);
            return this;
        }

        public dagger.internal.MapFactory<K, V> build() {
            return new dagger.internal.MapFactory<>(this.map);
        }
    }
}
