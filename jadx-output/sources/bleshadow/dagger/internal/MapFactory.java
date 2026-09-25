package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class MapFactory<K, V> implements bleshadow.dagger.internal.Factory<java.util.Map<K, V>> {
    private static final bleshadow.javax.inject.Provider<java.util.Map<java.lang.Object, java.lang.Object>> EMPTY = bleshadow.dagger.internal.InstanceFactory.create(java.util.Collections.emptyMap());
    private final java.util.Map<K, bleshadow.javax.inject.Provider<V>> contributingMap;

    public static <K, V> bleshadow.dagger.internal.MapFactory.Builder<K, V> builder(int size) {
        return new bleshadow.dagger.internal.MapFactory.Builder<>(size);
    }

    public static <K, V> bleshadow.javax.inject.Provider<java.util.Map<K, V>> emptyMapProvider() {
        return (bleshadow.javax.inject.Provider<java.util.Map<K, V>>) EMPTY;
    }

    private MapFactory(java.util.Map<K, bleshadow.javax.inject.Provider<V>> map) {
        this.contributingMap = java.util.Collections.unmodifiableMap(map);
    }

    @Override // bleshadow.javax.inject.Provider
    public java.util.Map<K, V> get() {
        java.util.LinkedHashMap linkedHashMapNewLinkedHashMapWithExpectedSize = bleshadow.dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(this.contributingMap.size());
        for (java.util.Map.Entry<K, bleshadow.javax.inject.Provider<V>> entry : this.contributingMap.entrySet()) {
            linkedHashMapNewLinkedHashMapWithExpectedSize.put(entry.getKey(), entry.getValue().get());
        }
        return java.util.Collections.unmodifiableMap(linkedHashMapNewLinkedHashMapWithExpectedSize);
    }

    public static final class Builder<K, V> {
        private final java.util.LinkedHashMap<K, bleshadow.javax.inject.Provider<V>> map;

        private Builder(int size) {
            this.map = bleshadow.dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(size);
        }

        public bleshadow.dagger.internal.MapFactory.Builder<K, V> put(K k, bleshadow.javax.inject.Provider<V> provider) {
            this.map.put((K) bleshadow.dagger.internal.Preconditions.checkNotNull(k, "key"), (bleshadow.javax.inject.Provider<V>) bleshadow.dagger.internal.Preconditions.checkNotNull(provider, "provider"));
            return this;
        }

        public bleshadow.dagger.internal.MapFactory<K, V> build() {
            return new bleshadow.dagger.internal.MapFactory<>(this.map);
        }
    }
}
