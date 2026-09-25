package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class CharacteristicNotificationId extends android.util.Pair<java.util.UUID, java.lang.Integer> {
    public CharacteristicNotificationId(java.util.UUID uuid, java.lang.Integer num) {
        super(uuid, num);
    }

    @Override // android.util.Pair
    public java.lang.String toString() {
        return "CharacteristicNotificationId{UUID=" + ((java.util.UUID) this.first).toString() + ", instanceId=" + ((java.lang.Integer) this.second).toString() + '}';
    }
}
