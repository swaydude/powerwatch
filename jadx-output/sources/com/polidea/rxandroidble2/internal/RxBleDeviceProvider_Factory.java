package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class RxBleDeviceProvider_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.RxBleDeviceProvider> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.DeviceComponent.Builder> deviceComponentBuilderProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.cache.DeviceComponentCache> deviceComponentCacheProvider;

    public RxBleDeviceProvider_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.cache.DeviceComponentCache> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.DeviceComponent.Builder> provider2) {
        this.deviceComponentCacheProvider = provider;
        this.deviceComponentBuilderProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.RxBleDeviceProvider get() {
        return new com.polidea.rxandroidble2.internal.RxBleDeviceProvider(this.deviceComponentCacheProvider.get(), this.deviceComponentBuilderProvider);
    }

    public static com.polidea.rxandroidble2.internal.RxBleDeviceProvider_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.cache.DeviceComponentCache> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.DeviceComponent.Builder> provider2) {
        return new com.polidea.rxandroidble2.internal.RxBleDeviceProvider_Factory(provider, provider2);
    }
}
