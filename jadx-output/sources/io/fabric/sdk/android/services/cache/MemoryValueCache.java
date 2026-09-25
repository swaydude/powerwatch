package io.fabric.sdk.android.services.cache;

/* JADX INFO: loaded from: classes2.dex */
public class MemoryValueCache<T> extends io.fabric.sdk.android.services.cache.AbstractValueCache<T> {
    private T value;

    public MemoryValueCache() {
        this(null);
    }

    public MemoryValueCache(io.fabric.sdk.android.services.cache.ValueCache<T> valueCache) {
        super(valueCache);
    }

    @Override // io.fabric.sdk.android.services.cache.AbstractValueCache
    protected void doInvalidate(android.content.Context context) {
        this.value = null;
    }

    @Override // io.fabric.sdk.android.services.cache.AbstractValueCache
    protected T getCached(android.content.Context context) {
        return this.value;
    }

    @Override // io.fabric.sdk.android.services.cache.AbstractValueCache
    protected void cacheValue(android.content.Context context, T t) {
        this.value = t;
    }
}
