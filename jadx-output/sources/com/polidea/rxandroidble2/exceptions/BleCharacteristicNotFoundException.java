package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleCharacteristicNotFoundException extends com.polidea.rxandroidble2.exceptions.BleException {
    private final java.util.UUID charactersisticUUID;

    public BleCharacteristicNotFoundException(java.util.UUID uuid) {
        super("Characteristic not found with UUID " + uuid);
        this.charactersisticUUID = uuid;
    }

    public java.util.UUID getCharactersisticUUID() {
        return this.charactersisticUUID;
    }
}
