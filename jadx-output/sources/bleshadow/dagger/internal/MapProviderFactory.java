package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class MapProviderFactory<K, V> implements bleshadow.dagger.internal.Factory<java.util.Map<K, bleshadow.javax.inject.Provider<V>>>, bleshadow.dagger.Lazy<java.util.Map<K, bleshadow.javax.inject.Provider<V>>> {
    private final java.util.Map<K, bleshadow.javax.inject.Provider<V>> contributingMap;

    public static <K, V> bleshadow.dagger.internal.MapProviderFactory.Builder<K, V> builder(int size) {
        return new bleshadow.dagger.internal.MapProviderFactory.Builder<>(size);
    }

    private MapProviderFactory(java.util.Map<K, bleshadow.javax.inject.Provider<V>> contributingMap) {
        this.contributingMap = java.util.Collections.unmodifiableMap(contributingMap);
    }

    @Override // bleshadow.javax.inject.Provider
    public java.util.Map<K, bleshadow.javax.inject.Provider<V>> get() {
        return this.contributingMap;
    }

    public static final class Builder<K, V> {
        private final java.util.LinkedHashMap<K, bleshadow.javax.inject.Provider<V>> map;

        private Builder(int size) {
            this.map = bleshadow.dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(size);
        }

        public bleshadow.dagger.internal.MapProviderFactory.Builder<K, V> put(K k, bleshadow.javax.inject.Provider<V> provider) {
            this.map.put((K) bleshadow.dagger.internal.Preconditions.checkNotNull(k, "key"), (bleshadow.javax.inject.Provider<V>) bleshadow.dagger.internal.Preconditions.checkNotNull(provider, "provider"));
            return this;
        }

        public bleshadow.dagger.internal.MapProviderFactory<K, V> build() {
            return new bleshadow.dagger.internal.MapProviderFactory<>(this.map);
        }
    }
}
