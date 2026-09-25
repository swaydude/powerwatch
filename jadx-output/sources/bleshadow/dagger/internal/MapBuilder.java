package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class MapBuilder<K, V> {
    private final java.util.Map<K, V> contributions;

    private MapBuilder(int size) {
        this.contributions = bleshadow.dagger.internal.DaggerCollections.newLinkedHashMapWithExpectedSize(size);
    }

    public static <K, V> bleshadow.dagger.internal.MapBuilder<K, V> newMapBuilder(int size) {
        return new bleshadow.dagger.internal.MapBuilder<>(size);
    }

    public bleshadow.dagger.internal.MapBuilder<K, V> put(K key, V value) {
        this.contributions.put(key, value);
        return this;
    }

    public java.util.Map<K, V> build() {
        if (this.contributions.size() == 0) {
            return java.util.Collections.emptyMap();
        }
        return java.util.Collections.unmodifiableMap(this.contributions);
    }
}
