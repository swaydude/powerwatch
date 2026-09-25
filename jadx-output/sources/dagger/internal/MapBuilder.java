package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class MapBuilder<K, V> {
    private final java.util.Map<K, V> contributions;

    private MapBuilder(int i) {
        this.contributions = dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(i);
    }

    public static <K, V> dagger.internal.MapBuilder<K, V> newMapBuilder(int i) {
        return new dagger.internal.MapBuilder<>(i);
    }

    public dagger.internal.MapBuilder<K, V> put(K k, V v) {
        this.contributions.put(k, v);
        return this;
    }

    public dagger.internal.MapBuilder<K, V> putAll(java.util.Map<K, V> map) {
        this.contributions.putAll(map);
        return this;
    }

    public java.util.Map<K, V> build() {
        if (this.contributions.size() == 0) {
            return java.util.Collections.emptyMap();
        }
        return java.util.Collections.unmodifiableMap(this.contributions);
    }
}
