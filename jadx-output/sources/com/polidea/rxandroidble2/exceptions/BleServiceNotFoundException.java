package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleServiceNotFoundException extends com.polidea.rxandroidble2.exceptions.BleException {
    private final java.util.UUID serviceUUID;

    public BleServiceNotFoundException(java.util.UUID uuid) {
        super("BLE Service not found with UUID " + uuid);
        this.serviceUUID = uuid;
    }

    public java.util.UUID getServiceUUID() {
        return this.serviceUUID;
    }
}
