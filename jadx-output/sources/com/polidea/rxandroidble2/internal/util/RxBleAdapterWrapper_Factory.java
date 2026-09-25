package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public final class RxBleAdapterWrapper_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper> {
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothAdapter> bluetoothAdapterProvider;

    public RxBleAdapterWrapper_Factory(bleshadow.javax.inject.Provider<android.bluetooth.BluetoothAdapter> provider) {
        this.bluetoothAdapterProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper get() {
        return new com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper(this.bluetoothAdapterProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper_Factory create(bleshadow.javax.inject.Provider<android.bluetooth.BluetoothAdapter> provider) {
        return new com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper_Factory(provider);
    }
}
