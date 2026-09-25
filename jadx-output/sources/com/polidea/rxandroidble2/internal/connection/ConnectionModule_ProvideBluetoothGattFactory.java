package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionModule_ProvideBluetoothGattFactory implements bleshadow.dagger.internal.Factory<android.bluetooth.BluetoothGatt> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> bluetoothGattProvider;

    public ConnectionModule_ProvideBluetoothGattFactory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> provider) {
        this.bluetoothGattProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public android.bluetooth.BluetoothGatt get() {
        return (android.bluetooth.BluetoothGatt) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.connection.ConnectionModule.provideBluetoothGatt(this.bluetoothGattProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideBluetoothGattFactory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> provider) {
        return new com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideBluetoothGattFactory(provider);
    }

    public static android.bluetooth.BluetoothGatt proxyProvideBluetoothGatt(com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider bluetoothGattProvider) {
        return (android.bluetooth.BluetoothGatt) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.connection.ConnectionModule.provideBluetoothGatt(bluetoothGattProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
