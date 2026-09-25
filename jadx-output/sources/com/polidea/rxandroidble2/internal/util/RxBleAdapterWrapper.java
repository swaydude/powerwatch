package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class RxBleAdapterWrapper {
    private final android.bluetooth.BluetoothAdapter bluetoothAdapter;

    @bleshadow.javax.inject.Inject
    public RxBleAdapterWrapper(android.bluetooth.BluetoothAdapter bluetoothAdapter) {
        this.bluetoothAdapter = bluetoothAdapter;
    }

    public android.bluetooth.BluetoothDevice getRemoteDevice(java.lang.String str) {
        return this.bluetoothAdapter.getRemoteDevice(str);
    }

    public boolean hasBluetoothAdapter() {
        return this.bluetoothAdapter != null;
    }

    public boolean isBluetoothEnabled() {
        android.bluetooth.BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    public boolean startLegacyLeScan(android.bluetooth.BluetoothAdapter.LeScanCallback leScanCallback) {
        return this.bluetoothAdapter.startLeScan(leScanCallback);
    }

    public void stopLegacyLeScan(android.bluetooth.BluetoothAdapter.LeScanCallback leScanCallback) {
        this.bluetoothAdapter.stopLeScan(leScanCallback);
    }

    public void startLeScan(java.util.List<android.bluetooth.le.ScanFilter> list, android.bluetooth.le.ScanSettings scanSettings, android.bluetooth.le.ScanCallback scanCallback) {
        this.bluetoothAdapter.getBluetoothLeScanner().startScan(list, scanSettings, scanCallback);
    }

    public int startLeScan(java.util.List<android.bluetooth.le.ScanFilter> list, android.bluetooth.le.ScanSettings scanSettings, android.app.PendingIntent pendingIntent) {
        return this.bluetoothAdapter.getBluetoothLeScanner().startScan(list, scanSettings, pendingIntent);
    }

    public void stopLeScan(android.app.PendingIntent pendingIntent) {
        this.bluetoothAdapter.getBluetoothLeScanner().stopScan(pendingIntent);
    }

    public void stopLeScan(android.bluetooth.le.ScanCallback scanCallback) {
        android.bluetooth.le.BluetoothLeScanner bluetoothLeScanner = this.bluetoothAdapter.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            com.polidea.rxandroidble2.internal.RxBleLog.v("Cannot call BluetoothLeScanner.stopScan(ScanCallback) on 'null' reference because BluetoothAdapter.isEnabled() == %b", java.lang.Boolean.valueOf(this.bluetoothAdapter.isEnabled()));
        } else {
            bluetoothLeScanner.stopScan(scanCallback);
        }
    }

    public java.util.Set<android.bluetooth.BluetoothDevice> getBondedDevices() {
        return this.bluetoothAdapter.getBondedDevices();
    }
}
