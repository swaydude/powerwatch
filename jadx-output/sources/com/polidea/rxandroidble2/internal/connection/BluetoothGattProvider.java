package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
public class BluetoothGattProvider {
    private final java.util.concurrent.atomic.AtomicReference<android.bluetooth.BluetoothGatt> reference = new java.util.concurrent.atomic.AtomicReference<>();

    @bleshadow.javax.inject.Inject
    BluetoothGattProvider() {
    }

    public android.bluetooth.BluetoothGatt getBluetoothGatt() {
        return this.reference.get();
    }

    public void updateBluetoothGatt(android.bluetooth.BluetoothGatt bluetoothGatt) {
        this.reference.compareAndSet(null, bluetoothGatt);
    }
}
