package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractMapFactory<K, V, V2> implements dagger.internal.Factory<java.util.Map<K, V2>> {
    private final java.util.Map<K, javax.inject.Provider<V>> contributingMap;

    AbstractMapFactory(java.util.Map<K, javax.inject.Provider<V>> map) {
        this.contributingMap = java.util.Collections.unmodifiableMap(map);
    }

    final java.util.Map<K, javax.inject.Provider<V>> contributingMap() {
        return this.contributingMap;
    }

    public static abstract class Builder<K, V, V2> {
        final java.util.LinkedHashMap<K, javax.inject.Provider<V>> map;

        Builder(int i) {
            this.map = dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(i);
        }

        dagger.internal.AbstractMapFactory.Builder<K, V, V2> put(K k, javax.inject.Provider<V> provider) {
            this.map.put((K) dagger.internal.Preconditions.checkNotNull(k, "key"), (javax.inject.Provider<V>) dagger.internal.Preconditions.checkNotNull(provider, "provider"));
            return this;
        }

        dagger.internal.AbstractMapFactory.Builder<K, V, V2> putAll(javax.inject.Provider<java.util.Map<K, V2>> provider) {
            if (!(provider instanceof dagger.internal.DelegateFactory)) {
                this.map.putAll(((dagger.internal.AbstractMapFactory) provider).contributingMap);
                return this;
            }
            return putAll(((dagger.internal.DelegateFactory) provider).getDelegate());
        }
    }
}
