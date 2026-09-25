package com.polidea.rxandroidble2.internal.cache;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceComponentCache_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.cache.DeviceComponentCache> {
    private static final com.polidea.rxandroidble2.internal.cache.DeviceComponentCache_Factory INSTANCE = new com.polidea.rxandroidble2.internal.cache.DeviceComponentCache_Factory();

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.cache.DeviceComponentCache get() {
        return new com.polidea.rxandroidble2.internal.cache.DeviceComponentCache();
    }

    public static com.polidea.rxandroidble2.internal.cache.DeviceComponentCache_Factory create() {
        return INSTANCE;
    }
}
