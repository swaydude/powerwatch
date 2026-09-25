package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class RxBleDeviceImpl_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.RxBleDeviceImpl> {
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothDevice> bluetoothDeviceProvider;
    private final bleshadow.javax.inject.Provider<com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState>> connectionStateRelayProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.Connector> connectorProvider;

    public RxBleDeviceImpl_Factory(bleshadow.javax.inject.Provider<android.bluetooth.BluetoothDevice> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.Connector> provider2, bleshadow.javax.inject.Provider<com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState>> provider3) {
        this.bluetoothDeviceProvider = provider;
        this.connectorProvider = provider2;
        this.connectionStateRelayProvider = provider3;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.RxBleDeviceImpl get() {
        return new com.polidea.rxandroidble2.internal.RxBleDeviceImpl(this.bluetoothDeviceProvider.get(), this.connectorProvider.get(), this.connectionStateRelayProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.RxBleDeviceImpl_Factory create(bleshadow.javax.inject.Provider<android.bluetooth.BluetoothDevice> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.Connector> provider2, bleshadow.javax.inject.Provider<com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState>> provider3) {
        return new com.polidea.rxandroidble2.internal.RxBleDeviceImpl_Factory(provider, provider2, provider3);
    }

    public static com.polidea.rxandroidble2.internal.RxBleDeviceImpl newRxBleDeviceImpl(android.bluetooth.BluetoothDevice bluetoothDevice, com.polidea.rxandroidble2.internal.connection.Connector connector, com.jakewharton.rxrelay2.BehaviorRelay<com.polidea.rxandroidble2.RxBleConnection.RxBleConnectionState> behaviorRelay) {
        return new com.polidea.rxandroidble2.internal.RxBleDeviceImpl(bluetoothDevice, connector, behaviorRelay);
    }
}
