package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.ClientScope
public class RxBleDeviceProvider {
    private final java.util.Map<java.lang.String, com.polidea.rxandroidble2.internal.DeviceComponent> cachedDeviceComponents;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.DeviceComponent.Builder> deviceComponentBuilder;

    @bleshadow.javax.inject.Inject
    public RxBleDeviceProvider(com.polidea.rxandroidble2.internal.cache.DeviceComponentCache deviceComponentCache, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.DeviceComponent.Builder> provider) {
        this.cachedDeviceComponents = deviceComponentCache;
        this.deviceComponentBuilder = provider;
    }

    public com.polidea.rxandroidble2.RxBleDevice getBleDevice(java.lang.String str) {
        com.polidea.rxandroidble2.internal.DeviceComponent deviceComponent = this.cachedDeviceComponents.get(str);
        if (deviceComponent != null) {
            return deviceComponent.provideDevice();
        }
        synchronized (this.cachedDeviceComponents) {
            com.polidea.rxandroidble2.internal.DeviceComponent deviceComponent2 = this.cachedDeviceComponents.get(str);
            if (deviceComponent2 != null) {
                return deviceComponent2.provideDevice();
            }
            com.polidea.rxandroidble2.internal.DeviceComponent deviceComponentBuild = this.deviceComponentBuilder.get().macAddress(str).build();
            com.polidea.rxandroidble2.RxBleDevice rxBleDeviceProvideDevice = deviceComponentBuild.provideDevice();
            this.cachedDeviceComponents.put(str, deviceComponentBuild);
            return rxBleDeviceProvideDevice;
        }
    }
}
