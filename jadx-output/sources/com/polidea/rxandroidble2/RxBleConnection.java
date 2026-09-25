package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public interface RxBleConnection {
    public static final int GATT_MTU_MAXIMUM = 517;
    public static final int GATT_MTU_MINIMUM = 23;
    public static final int GATT_READ_MTU_OVERHEAD = 1;
    public static final int GATT_WRITE_MTU_OVERHEAD = 3;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ConnectionPriority {
    }

    @java.lang.Deprecated
    public interface Connector {
        io.reactivex.Single<com.polidea.rxandroidble2.RxBleConnection> prepareConnection(boolean z);
    }

    public interface LongWriteOperationBuilder {
        io.reactivex.Observable<byte[]> build();

        com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setBytes(byte[] bArr);

        com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setCharacteristic(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic);

        com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setCharacteristicUuid(java.util.UUID uuid);

        com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setMaxBatchSize(int i);

        com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setWriteOperationAckStrategy(com.polidea.rxandroidble2.RxBleConnection.WriteOperationAckStrategy writeOperationAckStrategy);

        com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder setWriteOperationRetryStrategy(com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy writeOperationRetryStrategy);
    }

    public interface WriteOperationAckStrategy extends io.reactivex.ObservableTransformer<java.lang.Boolean, java.lang.Boolean> {
    }

    com.polidea.rxandroidble2.RxBleConnection.LongWriteOperationBuilder createNewLongWriteBuilder();

    io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices> discoverServices();

    io.reactivex.Single<com.polidea.rxandroidble2.RxBleDeviceServices> discoverServices(long j, java.util.concurrent.TimeUnit timeUnit);

    @java.lang.Deprecated
    io.reactivex.Single<android.bluetooth.BluetoothGattCharacteristic> getCharacteristic(java.util.UUID uuid);

    int getMtu();

    io.reactivex.Observable<com.polidea.rxandroidble2.ConnectionParameters> observeConnectionParametersUpdates();

    <T> io.reactivex.Observable<T> queue(com.polidea.rxandroidble2.RxBleCustomOperation<T> rxBleCustomOperation);

    <T> io.reactivex.Observable<T> queue(com.polidea.rxandroidble2.RxBleCustomOperation<T> rxBleCustomOperation, com.polidea.rxandroidble2.internal.Priority priority);

    io.reactivex.Single<byte[]> readCharacteristic(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic);

    io.reactivex.Single<byte[]> readCharacteristic(java.util.UUID uuid);

    io.reactivex.Single<byte[]> readDescriptor(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor);

    io.reactivex.Single<byte[]> readDescriptor(java.util.UUID uuid, java.util.UUID uuid2, java.util.UUID uuid3);

    io.reactivex.Single<java.lang.Integer> readRssi();

    io.reactivex.Completable requestConnectionPriority(int i, long j, java.util.concurrent.TimeUnit timeUnit);

    io.reactivex.Single<java.lang.Integer> requestMtu(int i);

    io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupIndication(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic);

    io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupIndication(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, com.polidea.rxandroidble2.NotificationSetupMode notificationSetupMode);

    io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupIndication(java.util.UUID uuid);

    io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupIndication(java.util.UUID uuid, com.polidea.rxandroidble2.NotificationSetupMode notificationSetupMode);

    io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupNotification(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic);

    io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupNotification(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, com.polidea.rxandroidble2.NotificationSetupMode notificationSetupMode);

    io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupNotification(java.util.UUID uuid);

    io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupNotification(java.util.UUID uuid, com.polidea.rxandroidble2.NotificationSetupMode notificationSetupMode);

    io.reactivex.Single<byte[]> writeCharacteristic(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    io.reactivex.Single<byte[]> writeCharacteristic(java.util.UUID uuid, byte[] bArr);

    io.reactivex.Completable writeDescriptor(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr);

    io.reactivex.Completable writeDescriptor(java.util.UUID uuid, java.util.UUID uuid2, java.util.UUID uuid3, byte[] bArr);

    public enum RxBleConnectionState {
        CONNECTING("CONNECTING"),
        CONNECTED("CONNECTED"),
        DISCONNECTED("DISCONNECTED"),
        DISCONNECTING("DISCONNECTING");

        private final java.lang.String description;

        RxBleConnectionState(java.lang.String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "RxBleConnectionState{" + this.description + '}';
        }
    }

    public interface WriteOperationRetryStrategy extends io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure, com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure> {

        public static class LongWriteFailure {
            final int batchIndex;
            final com.polidea.rxandroidble2.exceptions.BleGattException cause;

            public LongWriteFailure(int i, com.polidea.rxandroidble2.exceptions.BleGattException bleGattException) {
                this.batchIndex = i;
                this.cause = bleGattException;
            }

            public int getBatchIndex() {
                return this.batchIndex;
            }

            public com.polidea.rxandroidble2.exceptions.BleGattException getCause() {
                return this.cause;
            }
        }
    }
}
