package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceModule_ProvideBluetoothDeviceFactory implements bleshadow.dagger.internal.Factory<android.bluetooth.BluetoothDevice> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> adapterWrapperProvider;
    private final bleshadow.javax.inject.Provider<java.lang.String> macAddressProvider;

    public DeviceModule_ProvideBluetoothDeviceFactory(bleshadow.javax.inject.Provider<java.lang.String> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider2) {
        this.macAddressProvider = provider;
        this.adapterWrapperProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public android.bluetooth.BluetoothDevice get() {
        return (android.bluetooth.BluetoothDevice) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.DeviceModule.provideBluetoothDevice(this.macAddressProvider.get(), this.adapterWrapperProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.internal.DeviceModule_ProvideBluetoothDeviceFactory create(bleshadow.javax.inject.Provider<java.lang.String> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> provider2) {
        return new com.polidea.rxandroidble2.internal.DeviceModule_ProvideBluetoothDeviceFactory(provider, provider2);
    }

    public static android.bluetooth.BluetoothDevice proxyProvideBluetoothDevice(java.lang.String str, com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper) {
        return (android.bluetooth.BluetoothDevice) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.DeviceModule.provideBluetoothDevice(str, rxBleAdapterWrapper), "Cannot return null from a non-@Nullable @Provides method");
    }
}
