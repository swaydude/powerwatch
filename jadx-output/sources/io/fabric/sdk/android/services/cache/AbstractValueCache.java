package io.fabric.sdk.android.services.cache;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractValueCache<T> implements io.fabric.sdk.android.services.cache.ValueCache<T> {
    private final io.fabric.sdk.android.services.cache.ValueCache<T> childCache;

    protected abstract void cacheValue(android.content.Context context, T t);

    protected abstract void doInvalidate(android.content.Context context);

    protected abstract T getCached(android.content.Context context);

    public AbstractValueCache() {
        this(null);
    }

    public AbstractValueCache(io.fabric.sdk.android.services.cache.ValueCache<T> valueCache) {
        this.childCache = valueCache;
    }

    @Override // io.fabric.sdk.android.services.cache.ValueCache
    public final synchronized T get(android.content.Context context, io.fabric.sdk.android.services.cache.ValueLoader<T> valueLoader) throws java.lang.Exception {
        T cached;
        cached = getCached(context);
        if (cached == null) {
            io.fabric.sdk.android.services.cache.ValueCache<T> valueCache = this.childCache;
            cached = valueCache != null ? valueCache.get(context, valueLoader) : valueLoader.load(context);
            cache(context, cached);
        }
        return cached;
    }

    @Override // io.fabric.sdk.android.services.cache.ValueCache
    public final synchronized void invalidate(android.content.Context context) {
        doInvalidate(context);
    }

    private void cache(android.content.Context context, T t) {
        java.util.Objects.requireNonNull(t);
        cacheValue(context, t);
    }
}
