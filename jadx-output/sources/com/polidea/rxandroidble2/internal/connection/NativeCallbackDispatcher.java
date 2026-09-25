package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
class NativeCallbackDispatcher {
    private android.bluetooth.BluetoothGattCallback nativeCallback;
    private com.polidea.rxandroidble2.HiddenBluetoothGattCallback nativeCallbackHidden;

    @bleshadow.javax.inject.Inject
    NativeCallbackDispatcher() {
    }

    void notifyNativeChangedCallback(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        android.bluetooth.BluetoothGattCallback bluetoothGattCallback = this.nativeCallback;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        }
    }

    void notifyNativeConnectionStateCallback(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
        android.bluetooth.BluetoothGattCallback bluetoothGattCallback = this.nativeCallback;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onConnectionStateChange(bluetoothGatt, i, i2);
        }
    }

    void notifyNativeDescriptorReadCallback(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        android.bluetooth.BluetoothGattCallback bluetoothGattCallback = this.nativeCallback;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
        }
    }

    void notifyNativeDescriptorWriteCallback(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        android.bluetooth.BluetoothGattCallback bluetoothGattCallback = this.nativeCallback;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        }
    }

    void notifyNativeMtuChangedCallback(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
        android.bluetooth.BluetoothGattCallback bluetoothGattCallback = this.nativeCallback;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onMtuChanged(bluetoothGatt, i, i2);
        }
    }

    void notifyNativeReadRssiCallback(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
        android.bluetooth.BluetoothGattCallback bluetoothGattCallback = this.nativeCallback;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onReadRemoteRssi(bluetoothGatt, i, i2);
        }
    }

    void notifyNativeReliableWriteCallback(android.bluetooth.BluetoothGatt bluetoothGatt, int i) {
        android.bluetooth.BluetoothGattCallback bluetoothGattCallback = this.nativeCallback;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onReliableWriteCompleted(bluetoothGatt, i);
        }
    }

    void notifyNativeServicesDiscoveredCallback(android.bluetooth.BluetoothGatt bluetoothGatt, int i) {
        android.bluetooth.BluetoothGattCallback bluetoothGattCallback = this.nativeCallback;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onServicesDiscovered(bluetoothGatt, i);
        }
    }

    void notifyNativeWriteCallback(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        android.bluetooth.BluetoothGattCallback bluetoothGattCallback = this.nativeCallback;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
    }

    void notifyNativeParamsUpdateCallback(android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
        com.polidea.rxandroidble2.HiddenBluetoothGattCallback hiddenBluetoothGattCallback = this.nativeCallbackHidden;
        if (hiddenBluetoothGattCallback != null) {
            hiddenBluetoothGattCallback.onConnectionUpdated(bluetoothGatt, i, i2, i3, i4);
        }
    }

    void setNativeCallback(android.bluetooth.BluetoothGattCallback bluetoothGattCallback) {
        this.nativeCallback = bluetoothGattCallback;
    }

    void notifyNativeReadCallback(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        android.bluetooth.BluetoothGattCallback bluetoothGattCallback = this.nativeCallback;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
    }

    void setNativeCallabackHidden(com.polidea.rxandroidble2.HiddenBluetoothGattCallback hiddenBluetoothGattCallback) {
        this.nativeCallbackHidden = hiddenBluetoothGattCallback;
    }
}
