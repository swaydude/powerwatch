package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class MapProviderFactory<K, V> extends dagger.internal.AbstractMapFactory<K, V, javax.inject.Provider<V>> implements dagger.Lazy<java.util.Map<K, javax.inject.Provider<V>>> {
    public static <K, V> dagger.internal.MapProviderFactory.Builder<K, V> builder(int i) {
        return new dagger.internal.MapProviderFactory.Builder<>(i);
    }

    private MapProviderFactory(java.util.Map<K, javax.inject.Provider<V>> map) {
        super(map);
    }

    @Override // javax.inject.Provider
    public java.util.Map<K, javax.inject.Provider<V>> get() {
        return contributingMap();
    }

    public static final class Builder<K, V> extends dagger.internal.AbstractMapFactory.Builder<K, V, javax.inject.Provider<V>> {
        private Builder(int i) {
            super(i);
        }

        @Override // dagger.internal.AbstractMapFactory.Builder
        public dagger.internal.MapProviderFactory.Builder<K, V> put(K k, javax.inject.Provider<V> provider) {
            super.put((java.lang.Object) k, (javax.inject.Provider) provider);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dagger.internal.AbstractMapFactory.Builder
        public dagger.internal.MapProviderFactory.Builder<K, V> putAll(javax.inject.Provider<java.util.Map<K, javax.inject.Provider<V>>> provider) {
            super.putAll((javax.inject.Provider) provider);
            return this;
        }

        public dagger.internal.MapProviderFactory<K, V> build() {
            return new dagger.internal.MapProviderFactory<>(this.map);
        }
    }
}
