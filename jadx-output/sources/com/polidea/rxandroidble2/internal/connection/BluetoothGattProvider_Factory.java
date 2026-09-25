package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class BluetoothGattProvider_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider> {
    private static final com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider_Factory INSTANCE = new com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider_Factory();

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider get() {
        return new com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider();
    }

    public static com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider_Factory create() {
        return INSTANCE;
    }

    public static com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider newBluetoothGattProvider() {
        return new com.polidea.rxandroidble2.internal.connection.BluetoothGattProvider();
    }
}
