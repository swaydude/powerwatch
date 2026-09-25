package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class NotificationAndIndicationManager_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager> {
    private final bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> bluetoothGattProvider;
    private final bleshadow.javax.inject.Provider<byte[]> configDisableProvider;
    private final bleshadow.javax.inject.Provider<byte[]> configEnableIndicationProvider;
    private final bleshadow.javax.inject.Provider<byte[]> configEnableNotificationProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DescriptorWriter> descriptorWriterProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> gattCallbackProvider;

    public NotificationAndIndicationManager_Factory(bleshadow.javax.inject.Provider<byte[]> provider, bleshadow.javax.inject.Provider<byte[]> provider2, bleshadow.javax.inject.Provider<byte[]> provider3, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider4, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider5, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DescriptorWriter> provider6) {
        this.configEnableNotificationProvider = provider;
        this.configEnableIndicationProvider = provider2;
        this.configDisableProvider = provider3;
        this.bluetoothGattProvider = provider4;
        this.gattCallbackProvider = provider5;
        this.descriptorWriterProvider = provider6;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager get() {
        return new com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager(this.configEnableNotificationProvider.get(), this.configEnableIndicationProvider.get(), this.configDisableProvider.get(), this.bluetoothGattProvider.get(), this.gattCallbackProvider.get(), this.descriptorWriterProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager_Factory create(bleshadow.javax.inject.Provider<byte[]> provider, bleshadow.javax.inject.Provider<byte[]> provider2, bleshadow.javax.inject.Provider<byte[]> provider3, bleshadow.javax.inject.Provider<android.bluetooth.BluetoothGatt> provider4, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.RxBleGattCallback> provider5, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.DescriptorWriter> provider6) {
        return new com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager newNotificationAndIndicationManager(byte[] bArr, byte[] bArr2, byte[] bArr3, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, java.lang.Object obj) {
        return new com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager(bArr, bArr2, bArr3, bluetoothGatt, rxBleGattCallback, (com.polidea.rxandroidble2.internal.connection.DescriptorWriter) obj);
    }
}
