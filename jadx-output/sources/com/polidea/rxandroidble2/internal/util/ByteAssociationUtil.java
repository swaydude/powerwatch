package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class ByteAssociationUtil {
    private ByteAssociationUtil() {
    }

    public static io.reactivex.functions.Predicate<? super com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>> characteristicUUIDPredicate(final java.util.UUID uuid) {
        return new io.reactivex.functions.Predicate<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>>() { // from class: com.polidea.rxandroidble2.internal.util.ByteAssociationUtil.1
            @Override // io.reactivex.functions.Predicate
            public boolean test(com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID> byteAssociation) {
                return byteAssociation.first.equals(uuid);
            }
        };
    }

    public static io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.util.ByteAssociation<?>, byte[]> getBytesFromAssociation() {
        return new io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.util.ByteAssociation<?>, byte[]>() { // from class: com.polidea.rxandroidble2.internal.util.ByteAssociationUtil.2
            @Override // io.reactivex.functions.Function
            public byte[] apply(com.polidea.rxandroidble2.internal.util.ByteAssociation<?> byteAssociation) {
                return byteAssociation.second;
            }
        };
    }

    public static io.reactivex.functions.Predicate<? super com.polidea.rxandroidble2.internal.util.ByteAssociation<android.bluetooth.BluetoothGattDescriptor>> descriptorPredicate(final android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor) {
        return new io.reactivex.functions.Predicate<com.polidea.rxandroidble2.internal.util.ByteAssociation<android.bluetooth.BluetoothGattDescriptor>>() { // from class: com.polidea.rxandroidble2.internal.util.ByteAssociationUtil.3
            @Override // io.reactivex.functions.Predicate
            public boolean test(com.polidea.rxandroidble2.internal.util.ByteAssociation<android.bluetooth.BluetoothGattDescriptor> byteAssociation) throws java.lang.Exception {
                return byteAssociation.first.equals(bluetoothGattDescriptor);
            }
        };
    }
}
