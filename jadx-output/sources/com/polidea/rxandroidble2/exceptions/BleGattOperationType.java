package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleGattOperationType {
    private final java.lang.String description;
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType CONNECTION_STATE = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("CONNECTION_STATE");
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType SERVICE_DISCOVERY = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("SERVICE_DISCOVERY");
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType CHARACTERISTIC_READ = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("CHARACTERISTIC_READ");
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType CHARACTERISTIC_WRITE = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("CHARACTERISTIC_WRITE");
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType CHARACTERISTIC_LONG_WRITE = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("CHARACTERISTIC_LONG_WRITE");
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType CHARACTERISTIC_CHANGED = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("CHARACTERISTIC_CHANGED");
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType DESCRIPTOR_READ = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("DESCRIPTOR_READ");
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType DESCRIPTOR_WRITE = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("DESCRIPTOR_WRITE");
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType RELIABLE_WRITE_COMPLETED = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("RELIABLE_WRITE_COMPLETED");
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType READ_RSSI = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("READ_RSSI");
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType ON_MTU_CHANGED = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("ON_MTU_CHANGED");
    public static final com.polidea.rxandroidble2.exceptions.BleGattOperationType CONNECTION_PRIORITY_CHANGE = new com.polidea.rxandroidble2.exceptions.BleGattOperationType("CONNECTION_PRIORITY_CHANGE");

    private BleGattOperationType(java.lang.String str) {
        this.description = str;
    }

    public java.lang.String toString() {
        return "BleGattOperation{description='" + this.description + "'}";
    }
}
