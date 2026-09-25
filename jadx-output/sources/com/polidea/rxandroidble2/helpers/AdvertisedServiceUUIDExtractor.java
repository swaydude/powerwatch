package com.polidea.rxandroidble2.helpers;

/* JADX INFO: loaded from: classes2.dex */
public class AdvertisedServiceUUIDExtractor {
    private static final java.lang.String UUID_BASE = "%08x-0000-1000-8000-00805f9b34fb";

    public java.util.List<java.util.UUID> extractUUIDs(byte[] bArr) {
        byte b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.remaining() > 2 && (b = byteBufferOrder.get()) != 0) {
            switch (byteBufferOrder.get()) {
                case 2:
                case 3:
                    while (b >= 2) {
                        arrayList.add(java.util.UUID.fromString(java.lang.String.format(UUID_BASE, java.lang.Short.valueOf(byteBufferOrder.getShort()))));
                        b = (byte) (b - 2);
                    }
                    continue;
                case 4:
                case 5:
                    while (b >= 4) {
                        arrayList.add(java.util.UUID.fromString(java.lang.String.format(UUID_BASE, java.lang.Integer.valueOf(byteBufferOrder.getInt()))));
                        b = (byte) (b - 4);
                    }
                    break;
                case 6:
                case 7:
                    break;
                default:
                    byteBufferOrder.position((byteBufferOrder.position() + b) - 1);
                    continue;
            }
            while (b >= 16) {
                arrayList.add(new java.util.UUID(byteBufferOrder.getLong(), byteBufferOrder.getLong()));
                b = (byte) (b - 16);
            }
        }
        return arrayList;
    }

    public java.util.Set<java.util.UUID> toDistinctSet(java.util.UUID[] uuidArr) {
        if (uuidArr == null) {
            uuidArr = new java.util.UUID[0];
        }
        return new java.util.HashSet(java.util.Arrays.asList(uuidArr));
    }
}
