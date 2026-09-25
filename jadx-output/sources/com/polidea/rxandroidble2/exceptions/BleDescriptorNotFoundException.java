package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleDescriptorNotFoundException extends com.polidea.rxandroidble2.exceptions.BleException {
    private final java.util.UUID descriptorUUID;

    public BleDescriptorNotFoundException(java.util.UUID uuid) {
        super("Descriptor not found with UUID " + uuid);
        this.descriptorUUID = uuid;
    }

    public java.util.UUID getDescriptorUUID() {
        return this.descriptorUUID;
    }
}
