package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class UUIDUtil {
    public static final android.os.ParcelUuid BASE_UUID = android.os.ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    private static final int DATA_TYPE_FLAGS = 1;
    private static final int DATA_TYPE_LOCAL_NAME_COMPLETE = 9;
    private static final int DATA_TYPE_LOCAL_NAME_SHORT = 8;
    private static final int DATA_TYPE_MANUFACTURER_SPECIFIC_DATA = 255;
    private static final int DATA_TYPE_SERVICE_DATA = 22;
    private static final int DATA_TYPE_SERVICE_UUIDS_128_BIT_COMPLETE = 7;
    private static final int DATA_TYPE_SERVICE_UUIDS_128_BIT_PARTIAL = 6;
    private static final int DATA_TYPE_SERVICE_UUIDS_16_BIT_COMPLETE = 3;
    private static final int DATA_TYPE_SERVICE_UUIDS_16_BIT_PARTIAL = 2;
    private static final int DATA_TYPE_SERVICE_UUIDS_32_BIT_COMPLETE = 5;
    private static final int DATA_TYPE_SERVICE_UUIDS_32_BIT_PARTIAL = 4;
    private static final int DATA_TYPE_TX_POWER_LEVEL = 10;
    private static final java.lang.String UUID_BASE_FORMAT = "%08x-0000-1000-8000-00805f9b34fb";
    public static final int UUID_BYTES_128_BIT = 16;
    public static final int UUID_BYTES_16_BIT = 2;
    public static final int UUID_BYTES_32_BIT = 4;

    @bleshadow.javax.inject.Inject
    public UUIDUtil() {
    }

    public java.util.List<java.util.UUID> extractUUIDs(byte[] bArr) {
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.remaining() > 2 && (i = byteBufferOrder.get() & kotlin.UByte.MAX_VALUE) != 0) {
            switch (byteBufferOrder.get()) {
                case 2:
                case 3:
                    while (i >= 2) {
                        arrayList.add(java.util.UUID.fromString(java.lang.String.format(UUID_BASE_FORMAT, java.lang.Short.valueOf(byteBufferOrder.getShort()))));
                        i -= 2;
                    }
                    break;
                case 4:
                case 5:
                    while (i >= 4) {
                        arrayList.add(java.util.UUID.fromString(java.lang.String.format(UUID_BASE_FORMAT, java.lang.Integer.valueOf(byteBufferOrder.getInt()))));
                        i -= 4;
                    }
                    break;
                case 6:
                case 7:
                    while (i >= 16) {
                        arrayList.add(new java.util.UUID(byteBufferOrder.getLong(), byteBufferOrder.getLong()));
                        i -= 16;
                    }
                    break;
                default:
                    byteBufferOrder.position(byteBufferOrder.position() + java.lang.Math.min(i - 1, byteBufferOrder.remaining()));
                    break;
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

    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    public com.polidea.rxandroidble2.scan.ScanRecord parseFromBytes(byte[] bArr) {
        java.util.ArrayList arrayList;
        if (bArr == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String str = null;
        int i = 0;
        int i2 = -1;
        byte b = -2147483648;
        while (i < bArr.length) {
            try {
                int i3 = i + 1;
                int i4 = bArr[i] & kotlin.UByte.MAX_VALUE;
                if (i4 != 0) {
                    int i5 = i4 - 1;
                    int i6 = i3 + 1;
                    int i7 = bArr[i3] & kotlin.UByte.MAX_VALUE;
                    if (i7 == 22) {
                        map.put(parseUuidFrom(extractBytes(bArr, i6, 2)), extractBytes(bArr, i6 + 2, i5 - 2));
                    } else if (i7 != 255) {
                        switch (i7) {
                            case 1:
                                i2 = bArr[i6] & kotlin.UByte.MAX_VALUE;
                                break;
                            case 2:
                            case 3:
                                parseServiceUuid(bArr, i6, i5, 2, arrayList2);
                                break;
                            case 4:
                            case 5:
                                parseServiceUuid(bArr, i6, i5, 4, arrayList2);
                                break;
                            case 6:
                            case 7:
                                parseServiceUuid(bArr, i6, i5, 16, arrayList2);
                                break;
                            case 8:
                            case 9:
                                str = new java.lang.String(extractBytes(bArr, i6, i5));
                                break;
                            case 10:
                                b = bArr[i6];
                                break;
                        }
                    } else {
                        sparseArray.put(((bArr[i6 + 1] & kotlin.UByte.MAX_VALUE) << 8) + (255 & bArr[i6]), extractBytes(bArr, i6 + 2, i5 - 2));
                    }
                    i = i5 + i6;
                } else {
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    return new com.polidea.rxandroidble2.internal.scan.ScanRecordImplCompat(arrayList, sparseArray, map, i2, b, str, bArr);
                }
            } catch (java.lang.Exception e) {
                com.polidea.rxandroidble2.internal.RxBleLog.e(e, "Unable to parse scan record: %s", com.polidea.rxandroidble2.internal.logger.LoggerUtil.bytesToHex(bArr));
                return new com.polidea.rxandroidble2.internal.scan.ScanRecordImplCompat(null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = arrayList2;
        }
        return new com.polidea.rxandroidble2.internal.scan.ScanRecordImplCompat(arrayList, sparseArray, map, i2, b, str, bArr);
    }

    private static android.os.ParcelUuid parseUuidFrom(byte[] bArr) {
        long j;
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("uuidBytes cannot be null");
        }
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new java.lang.IllegalArgumentException("uuidBytes length invalid - " + length);
        }
        if (length == 16) {
            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            return new android.os.ParcelUuid(new java.util.UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j = ((long) (bArr[0] & kotlin.UByte.MAX_VALUE)) + ((long) ((bArr[1] & kotlin.UByte.MAX_VALUE) << 8));
        } else {
            j = ((long) ((bArr[3] & kotlin.UByte.MAX_VALUE) << 24)) + ((long) (bArr[0] & kotlin.UByte.MAX_VALUE)) + ((long) ((bArr[1] & kotlin.UByte.MAX_VALUE) << 8)) + ((long) ((bArr[2] & kotlin.UByte.MAX_VALUE) << 16));
        }
        android.os.ParcelUuid parcelUuid = BASE_UUID;
        return new android.os.ParcelUuid(new java.util.UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }

    private static int parseServiceUuid(byte[] bArr, int i, int i2, int i3, java.util.List<android.os.ParcelUuid> list) {
        while (i2 > 0) {
            list.add(parseUuidFrom(extractBytes(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    private static byte[] extractBytes(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
