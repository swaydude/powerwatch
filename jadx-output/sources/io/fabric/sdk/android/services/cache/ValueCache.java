package io.fabric.sdk.android.services.cache;

/* JADX INFO: loaded from: classes2.dex */
public interface ValueCache<T> {
    T get(android.content.Context context, io.fabric.sdk.android.services.cache.ValueLoader<T> valueLoader) throws java.lang.Exception;

    void invalidate(android.content.Context context);
}
