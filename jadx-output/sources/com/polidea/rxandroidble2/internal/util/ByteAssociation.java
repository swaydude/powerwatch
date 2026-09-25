package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class ByteAssociation<T> {
    public final T first;
    public final byte[] second;

    public ByteAssociation(T t, byte[] bArr) {
        this.first = t;
        this.second = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.polidea.rxandroidble2.internal.util.ByteAssociation)) {
            return false;
        }
        com.polidea.rxandroidble2.internal.util.ByteAssociation byteAssociation = (com.polidea.rxandroidble2.internal.util.ByteAssociation) obj;
        return java.util.Arrays.equals(byteAssociation.second, this.second) && byteAssociation.first.equals(this.first);
    }

    public int hashCode() {
        return this.first.hashCode() ^ java.util.Arrays.hashCode(this.second);
    }

    public java.lang.String toString() {
        java.lang.String simpleName;
        T t = this.first;
        if (t instanceof android.bluetooth.BluetoothGattCharacteristic) {
            simpleName = android.bluetooth.BluetoothGattCharacteristic.class.getSimpleName() + "(" + ((android.bluetooth.BluetoothGattCharacteristic) this.first).getUuid().toString() + ")";
        } else if (t instanceof android.bluetooth.BluetoothGattDescriptor) {
            simpleName = android.bluetooth.BluetoothGattDescriptor.class.getSimpleName() + "(" + ((android.bluetooth.BluetoothGattDescriptor) this.first).getUuid().toString() + ")";
        } else if (t instanceof java.util.UUID) {
            simpleName = java.util.UUID.class.getSimpleName() + "(" + this.first.toString() + ")";
        } else {
            simpleName = t.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "[first=" + simpleName + ", second=" + java.util.Arrays.toString(this.second) + "]";
    }

    public static <T> com.polidea.rxandroidble2.internal.util.ByteAssociation<T> create(T t, byte[] bArr) {
        return new com.polidea.rxandroidble2.internal.util.ByteAssociation<>(t, bArr);
    }
}
