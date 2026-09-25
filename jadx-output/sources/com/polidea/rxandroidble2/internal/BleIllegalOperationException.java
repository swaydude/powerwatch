package com.polidea.rxandroidble2.internal;

/* JADX INFO: loaded from: classes2.dex */
public class BleIllegalOperationException extends java.lang.RuntimeException {
    public final java.util.UUID characteristicUUID;
    public final int neededProperties;
    public final int supportedProperties;

    public BleIllegalOperationException(java.lang.String str, java.util.UUID uuid, int i, int i2) {
        super(str);
        this.characteristicUUID = uuid;
        this.supportedProperties = i;
        this.neededProperties = i2;
    }
}
