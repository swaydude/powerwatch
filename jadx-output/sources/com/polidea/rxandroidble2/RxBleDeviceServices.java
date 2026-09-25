package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public class RxBleDeviceServices {
    private final java.util.List<android.bluetooth.BluetoothGattService> bluetoothGattServices;

    public RxBleDeviceServices(java.util.List<android.bluetooth.BluetoothGattService> list) {
        this.bluetoothGattServices = list;
    }

    public java.util.List<android.bluetooth.BluetoothGattService> getBluetoothGattServices() {
        return this.bluetoothGattServices;
    }

    public io.reactivex.Single<android.bluetooth.BluetoothGattService> getService(final java.util.UUID uuid) {
        return io.reactivex.Observable.fromIterable(this.bluetoothGattServices).filter(new io.reactivex.functions.Predicate<android.bluetooth.BluetoothGattService>() { // from class: com.polidea.rxandroidble2.RxBleDeviceServices.1
            @Override // io.reactivex.functions.Predicate
            public boolean test(android.bluetooth.BluetoothGattService bluetoothGattService) throws java.lang.Exception {
                return bluetoothGattService.getUuid().equals(uuid);
            }
        }).firstElement().switchIfEmpty(io.reactivex.Single.error(new com.polidea.rxandroidble2.exceptions.BleServiceNotFoundException(uuid)));
    }

    public io.reactivex.Single<android.bluetooth.BluetoothGattCharacteristic> getCharacteristic(final java.util.UUID uuid) {
        return io.reactivex.Single.fromCallable(new java.util.concurrent.Callable<android.bluetooth.BluetoothGattCharacteristic>() { // from class: com.polidea.rxandroidble2.RxBleDeviceServices.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public android.bluetooth.BluetoothGattCharacteristic call() throws java.lang.Exception {
                java.util.Iterator it = com.polidea.rxandroidble2.RxBleDeviceServices.this.bluetoothGattServices.iterator();
                while (it.hasNext()) {
                    android.bluetooth.BluetoothGattCharacteristic characteristic = ((android.bluetooth.BluetoothGattService) it.next()).getCharacteristic(uuid);
                    if (characteristic != null) {
                        return characteristic;
                    }
                }
                throw new com.polidea.rxandroidble2.exceptions.BleCharacteristicNotFoundException(uuid);
            }
        });
    }

    public io.reactivex.Single<android.bluetooth.BluetoothGattCharacteristic> getCharacteristic(java.util.UUID uuid, final java.util.UUID uuid2) {
        return getService(uuid).map(new io.reactivex.functions.Function<android.bluetooth.BluetoothGattService, android.bluetooth.BluetoothGattCharacteristic>() { // from class: com.polidea.rxandroidble2.RxBleDeviceServices.3
            @Override // io.reactivex.functions.Function
            public android.bluetooth.BluetoothGattCharacteristic apply(android.bluetooth.BluetoothGattService bluetoothGattService) {
                android.bluetooth.BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid2);
                if (characteristic != null) {
                    return characteristic;
                }
                throw new com.polidea.rxandroidble2.exceptions.BleCharacteristicNotFoundException(uuid2);
            }
        });
    }

    public io.reactivex.Single<android.bluetooth.BluetoothGattDescriptor> getDescriptor(java.util.UUID uuid, final java.util.UUID uuid2) {
        return getCharacteristic(uuid).map(new io.reactivex.functions.Function<android.bluetooth.BluetoothGattCharacteristic, android.bluetooth.BluetoothGattDescriptor>() { // from class: com.polidea.rxandroidble2.RxBleDeviceServices.4
            @Override // io.reactivex.functions.Function
            public android.bluetooth.BluetoothGattDescriptor apply(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                android.bluetooth.BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(uuid2);
                if (descriptor != null) {
                    return descriptor;
                }
                throw new com.polidea.rxandroidble2.exceptions.BleDescriptorNotFoundException(uuid2);
            }
        });
    }

    public io.reactivex.Single<android.bluetooth.BluetoothGattDescriptor> getDescriptor(java.util.UUID uuid, final java.util.UUID uuid2, final java.util.UUID uuid3) {
        return getService(uuid).map(new io.reactivex.functions.Function<android.bluetooth.BluetoothGattService, android.bluetooth.BluetoothGattCharacteristic>() { // from class: com.polidea.rxandroidble2.RxBleDeviceServices.6
            @Override // io.reactivex.functions.Function
            public android.bluetooth.BluetoothGattCharacteristic apply(android.bluetooth.BluetoothGattService bluetoothGattService) {
                return bluetoothGattService.getCharacteristic(uuid2);
            }
        }).map(new io.reactivex.functions.Function<android.bluetooth.BluetoothGattCharacteristic, android.bluetooth.BluetoothGattDescriptor>() { // from class: com.polidea.rxandroidble2.RxBleDeviceServices.5
            @Override // io.reactivex.functions.Function
            public android.bluetooth.BluetoothGattDescriptor apply(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                android.bluetooth.BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(uuid3);
                if (descriptor != null) {
                    return descriptor;
                }
                throw new com.polidea.rxandroidble2.exceptions.BleDescriptorNotFoundException(uuid3);
            }
        });
    }
}
