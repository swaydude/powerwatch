package com.polidea.rxandroidble2.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public class BleConflictingNotificationAlreadySetException extends com.polidea.rxandroidble2.exceptions.BleException {
    private final boolean alreadySetIsIndication;
    private final java.util.UUID characteristicUuid;

    public BleConflictingNotificationAlreadySetException(java.util.UUID uuid, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Characteristic ");
        sb.append(uuid);
        sb.append(" notification already set to ");
        sb.append(z ? "indication" : "notification");
        super(sb.toString());
        this.characteristicUuid = uuid;
        this.alreadySetIsIndication = z;
    }

    public java.util.UUID getCharacteristicUuid() {
        return this.characteristicUuid;
    }

    public boolean indicationAlreadySet() {
        return this.alreadySetIsIndication;
    }

    public boolean notificationAlreadySet() {
        return !this.alreadySetIsIndication;
    }
}
