package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class CharacteristicChangedEvent extends com.polidea.rxandroidble2.internal.util.CharacteristicNotificationId {
    public final byte[] data;

    public CharacteristicChangedEvent(java.util.UUID uuid, java.lang.Integer num, byte[] bArr) {
        super(uuid, num);
        this.data = bArr;
    }

    @Override // android.util.Pair
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.polidea.rxandroidble2.internal.util.CharacteristicChangedEvent)) {
            return (obj instanceof com.polidea.rxandroidble2.internal.util.CharacteristicNotificationId) && super.equals(obj);
        }
        if (super.equals(obj)) {
            return java.util.Arrays.equals(this.data, ((com.polidea.rxandroidble2.internal.util.CharacteristicChangedEvent) obj).data);
        }
        return false;
    }

    @Override // android.util.Pair
    public int hashCode() {
        return (super.hashCode() * 31) + java.util.Arrays.hashCode(this.data);
    }

    @Override // com.polidea.rxandroidble2.internal.util.CharacteristicNotificationId, android.util.Pair
    public java.lang.String toString() {
        return "CharacteristicChangedEvent{UUID=" + ((java.util.UUID) this.first).toString() + ", instanceId=" + ((java.lang.Integer) this.second).toString() + ", data=" + java.util.Arrays.toString(this.data) + '}';
    }
}
