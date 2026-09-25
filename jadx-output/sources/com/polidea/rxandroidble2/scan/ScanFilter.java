package com.polidea.rxandroidble2.scan;

/* JADX INFO: loaded from: classes2.dex */
public class ScanFilter implements android.os.Parcelable, com.polidea.rxandroidble2.internal.scan.ScanFilterInterface {
    private final java.lang.String mDeviceAddress;
    private final java.lang.String mDeviceName;
    private final byte[] mManufacturerData;
    private final byte[] mManufacturerDataMask;
    private final int mManufacturerId;
    private final byte[] mServiceData;
    private final byte[] mServiceDataMask;
    private final android.os.ParcelUuid mServiceDataUuid;
    private final android.os.ParcelUuid mServiceUuid;
    private final android.os.ParcelUuid mServiceUuidMask;
    private static final com.polidea.rxandroidble2.scan.ScanFilter EMPTY = new com.polidea.rxandroidble2.scan.ScanFilter.Builder().build();
    public static final android.os.Parcelable.Creator<com.polidea.rxandroidble2.scan.ScanFilter> CREATOR = new android.os.Parcelable.Creator<com.polidea.rxandroidble2.scan.ScanFilter>() { // from class: com.polidea.rxandroidble2.scan.ScanFilter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.polidea.rxandroidble2.scan.ScanFilter[] newArray(int i) {
            return new com.polidea.rxandroidble2.scan.ScanFilter[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.polidea.rxandroidble2.scan.ScanFilter createFromParcel(android.os.Parcel parcel) {
            com.polidea.rxandroidble2.scan.ScanFilter.Builder builder = new com.polidea.rxandroidble2.scan.ScanFilter.Builder();
            if (parcel.readInt() == 1) {
                builder.setDeviceName(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                builder.setDeviceAddress(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                android.os.ParcelUuid parcelUuid = (android.os.ParcelUuid) parcel.readParcelable(android.os.ParcelUuid.class.getClassLoader());
                builder.setServiceUuid(parcelUuid);
                if (parcel.readInt() == 1) {
                    builder.setServiceUuid(parcelUuid, (android.os.ParcelUuid) parcel.readParcelable(android.os.ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                android.os.ParcelUuid parcelUuid2 = (android.os.ParcelUuid) parcel.readParcelable(android.os.ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        builder.setServiceData(parcelUuid2, bArr);
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        builder.setServiceData(parcelUuid2, bArr, bArr2);
                    }
                }
            }
            int i = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr3 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr3);
                if (parcel.readInt() == 0) {
                    builder.setManufacturerData(i, bArr3);
                } else {
                    byte[] bArr4 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr4);
                    builder.setManufacturerData(i, bArr3, bArr4);
                }
            }
            return builder.build();
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ScanFilter(java.lang.String str, java.lang.String str2, android.os.ParcelUuid parcelUuid, android.os.ParcelUuid parcelUuid2, android.os.ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        this.mDeviceName = str;
        this.mServiceUuid = parcelUuid;
        this.mServiceUuidMask = parcelUuid2;
        this.mDeviceAddress = str2;
        this.mServiceDataUuid = parcelUuid3;
        this.mServiceData = bArr;
        this.mServiceDataMask = bArr2;
        this.mManufacturerId = i;
        this.mManufacturerData = bArr3;
        this.mManufacturerDataMask = bArr4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.mDeviceName == null ? 0 : 1);
        java.lang.String str = this.mDeviceName;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.mDeviceAddress == null ? 0 : 1);
        java.lang.String str2 = this.mDeviceAddress;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.mServiceUuid == null ? 0 : 1);
        android.os.ParcelUuid parcelUuid = this.mServiceUuid;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i);
            parcel.writeInt(this.mServiceUuidMask == null ? 0 : 1);
            android.os.ParcelUuid parcelUuid2 = this.mServiceUuidMask;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i);
            }
        }
        parcel.writeInt(this.mServiceDataUuid == null ? 0 : 1);
        android.os.ParcelUuid parcelUuid3 = this.mServiceDataUuid;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i);
            parcel.writeInt(this.mServiceData == null ? 0 : 1);
            byte[] bArr = this.mServiceData;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.mServiceData);
                parcel.writeInt(this.mServiceDataMask == null ? 0 : 1);
                byte[] bArr2 = this.mServiceDataMask;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.mServiceDataMask);
                }
            }
        }
        parcel.writeInt(this.mManufacturerId);
        parcel.writeInt(this.mManufacturerData == null ? 0 : 1);
        byte[] bArr3 = this.mManufacturerData;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.mManufacturerData);
            parcel.writeInt(this.mManufacturerDataMask != null ? 1 : 0);
            byte[] bArr4 = this.mManufacturerDataMask;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.mManufacturerDataMask);
            }
        }
    }

    public java.lang.String getDeviceName() {
        return this.mDeviceName;
    }

    public android.os.ParcelUuid getServiceUuid() {
        return this.mServiceUuid;
    }

    public android.os.ParcelUuid getServiceUuidMask() {
        return this.mServiceUuidMask;
    }

    public java.lang.String getDeviceAddress() {
        return this.mDeviceAddress;
    }

    public byte[] getServiceData() {
        return this.mServiceData;
    }

    public byte[] getServiceDataMask() {
        return this.mServiceDataMask;
    }

    public android.os.ParcelUuid getServiceDataUuid() {
        return this.mServiceDataUuid;
    }

    public int getManufacturerId() {
        return this.mManufacturerId;
    }

    public byte[] getManufacturerData() {
        return this.mManufacturerData;
    }

    public byte[] getManufacturerDataMask() {
        return this.mManufacturerDataMask;
    }

    @Override // com.polidea.rxandroidble2.internal.scan.ScanFilterInterface
    public boolean matches(com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult rxBleInternalScanResult) {
        if (rxBleInternalScanResult == null) {
            return false;
        }
        android.bluetooth.BluetoothDevice bluetoothDevice = rxBleInternalScanResult.getBluetoothDevice();
        java.lang.String str = this.mDeviceAddress;
        if (str != null && (bluetoothDevice == null || !str.equals(bluetoothDevice.getAddress()))) {
            return false;
        }
        com.polidea.rxandroidble2.scan.ScanRecord scanRecord = rxBleInternalScanResult.getScanRecord();
        if (scanRecord == null && (this.mDeviceName != null || this.mServiceUuid != null || this.mManufacturerData != null || this.mServiceData != null)) {
            return false;
        }
        java.lang.String str2 = this.mDeviceName;
        if (str2 != null && !str2.equals(scanRecord.getDeviceName()) && !this.mDeviceName.equals(bluetoothDevice.getName())) {
            return false;
        }
        android.os.ParcelUuid parcelUuid = this.mServiceUuid;
        if (parcelUuid != null && !matchesServiceUuids(parcelUuid, this.mServiceUuidMask, scanRecord.getServiceUuids())) {
            return false;
        }
        android.os.ParcelUuid parcelUuid2 = this.mServiceDataUuid;
        if (parcelUuid2 != null && !matchesPartialData(this.mServiceData, this.mServiceDataMask, scanRecord.getServiceData(parcelUuid2))) {
            return false;
        }
        int i = this.mManufacturerId;
        return i < 0 || matchesPartialData(this.mManufacturerData, this.mManufacturerDataMask, scanRecord.getManufacturerSpecificData(i));
    }

    private boolean matchesServiceUuids(android.os.ParcelUuid parcelUuid, android.os.ParcelUuid parcelUuid2, java.util.List<android.os.ParcelUuid> list) {
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        java.util.Iterator<android.os.ParcelUuid> it = list.iterator();
        while (it.hasNext()) {
            if (matchesServiceUuid(parcelUuid.getUuid(), parcelUuid2 == null ? null : parcelUuid2.getUuid(), it.next().getUuid())) {
                return true;
            }
        }
        return false;
    }

    private boolean matchesServiceUuid(java.util.UUID uuid, java.util.UUID uuid2, java.util.UUID uuid3) {
        if (uuid2 == null) {
            return uuid.equals(uuid3);
        }
        if ((uuid.getLeastSignificantBits() & uuid2.getLeastSignificantBits()) != (uuid3.getLeastSignificantBits() & uuid2.getLeastSignificantBits())) {
            return false;
        }
        return (uuid.getMostSignificantBits() & uuid2.getMostSignificantBits()) == (uuid2.getMostSignificantBits() & uuid3.getMostSignificantBits());
    }

    private boolean matchesPartialData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr3[i] != bArr[i]) {
                    return false;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if ((bArr2[i2] & bArr3[i2]) != (bArr2[i2] & bArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BluetoothLeScanFilter [mDeviceName=");
        sb.append(this.mDeviceName);
        sb.append(", ");
        sb.append(com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(this.mDeviceAddress));
        sb.append(", mUuid=");
        android.os.ParcelUuid parcelUuid = this.mServiceUuid;
        sb.append(parcelUuid == null ? null : com.polidea.rxandroidble2.internal.logger.LoggerUtil.getUuidToLog(parcelUuid.getUuid()));
        sb.append(", mUuidMask=");
        android.os.ParcelUuid parcelUuid2 = this.mServiceUuidMask;
        sb.append(parcelUuid2 == null ? null : com.polidea.rxandroidble2.internal.logger.LoggerUtil.getUuidToLog(parcelUuid2.getUuid()));
        sb.append(", mServiceDataUuid=");
        android.os.ParcelUuid parcelUuid3 = this.mServiceDataUuid;
        sb.append(parcelUuid3 != null ? com.polidea.rxandroidble2.internal.logger.LoggerUtil.getUuidToLog(parcelUuid3.getUuid()) : null);
        sb.append(", mServiceData=");
        sb.append(java.util.Arrays.toString(this.mServiceData));
        sb.append(", mServiceDataMask=");
        sb.append(java.util.Arrays.toString(this.mServiceDataMask));
        sb.append(", mManufacturerId=");
        sb.append(this.mManufacturerId);
        sb.append(", mManufacturerData=");
        sb.append(java.util.Arrays.toString(this.mManufacturerData));
        sb.append(", mManufacturerDataMask=");
        sb.append(java.util.Arrays.toString(this.mManufacturerDataMask));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.mDeviceName, this.mDeviceAddress, java.lang.Integer.valueOf(this.mManufacturerId), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.mManufacturerData)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.mManufacturerDataMask)), this.mServiceDataUuid, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.mServiceData)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.mServiceDataMask)), this.mServiceUuid, this.mServiceUuidMask});
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.polidea.rxandroidble2.scan.ScanFilter scanFilter = (com.polidea.rxandroidble2.scan.ScanFilter) obj;
        return equals(this.mDeviceName, scanFilter.mDeviceName) && equals(this.mDeviceAddress, scanFilter.mDeviceAddress) && this.mManufacturerId == scanFilter.mManufacturerId && deepEquals(this.mManufacturerData, scanFilter.mManufacturerData) && deepEquals(this.mManufacturerDataMask, scanFilter.mManufacturerDataMask) && equals(this.mServiceDataUuid, scanFilter.mServiceDataUuid) && deepEquals(this.mServiceData, scanFilter.mServiceData) && deepEquals(this.mServiceDataMask, scanFilter.mServiceDataMask) && equals(this.mServiceUuid, scanFilter.mServiceUuid) && equals(this.mServiceUuidMask, scanFilter.mServiceUuidMask);
    }

    private static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private static boolean deepEquals(byte[] bArr, byte[] bArr2) {
        return bArr == bArr2 || !(bArr == null || bArr2 == null || !java.util.Arrays.equals(bArr, bArr2));
    }

    @Override // com.polidea.rxandroidble2.internal.scan.ScanFilterInterface
    public boolean isAllFieldsEmpty() {
        return equals(EMPTY);
    }

    public static com.polidea.rxandroidble2.scan.ScanFilter empty() {
        return new com.polidea.rxandroidble2.scan.ScanFilter.Builder().build();
    }

    public static final class Builder {
        private java.lang.String mDeviceAddress;
        private java.lang.String mDeviceName;
        private byte[] mManufacturerData;
        private byte[] mManufacturerDataMask;
        private int mManufacturerId = -1;
        private byte[] mServiceData;
        private byte[] mServiceDataMask;
        private android.os.ParcelUuid mServiceDataUuid;
        private android.os.ParcelUuid mServiceUuid;
        private android.os.ParcelUuid mUuidMask;

        public com.polidea.rxandroidble2.scan.ScanFilter.Builder setDeviceName(java.lang.String str) {
            this.mDeviceName = str;
            return this;
        }

        public com.polidea.rxandroidble2.scan.ScanFilter.Builder setDeviceAddress(java.lang.String str) {
            if (str != null && !android.bluetooth.BluetoothAdapter.checkBluetoothAddress(str)) {
                throw new java.lang.IllegalArgumentException("invalid device address " + str);
            }
            this.mDeviceAddress = str;
            return this;
        }

        public com.polidea.rxandroidble2.scan.ScanFilter.Builder setServiceUuid(android.os.ParcelUuid parcelUuid) {
            this.mServiceUuid = parcelUuid;
            this.mUuidMask = null;
            return this;
        }

        public com.polidea.rxandroidble2.scan.ScanFilter.Builder setServiceUuid(android.os.ParcelUuid parcelUuid, android.os.ParcelUuid parcelUuid2) {
            if (this.mUuidMask != null && this.mServiceUuid == null) {
                throw new java.lang.IllegalArgumentException("uuid is null while uuidMask is not null!");
            }
            this.mServiceUuid = parcelUuid;
            this.mUuidMask = parcelUuid2;
            return this;
        }

        public com.polidea.rxandroidble2.scan.ScanFilter.Builder setServiceData(android.os.ParcelUuid parcelUuid, byte[] bArr) {
            if (parcelUuid == null) {
                throw new java.lang.IllegalArgumentException("serviceDataUuid is null");
            }
            this.mServiceDataUuid = parcelUuid;
            this.mServiceData = bArr;
            this.mServiceDataMask = null;
            return this;
        }

        public com.polidea.rxandroidble2.scan.ScanFilter.Builder setServiceData(android.os.ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
            if (parcelUuid == null) {
                throw new java.lang.IllegalArgumentException("serviceDataUuid is null");
            }
            byte[] bArr3 = this.mServiceDataMask;
            if (bArr3 != null) {
                byte[] bArr4 = this.mServiceData;
                if (bArr4 == null) {
                    throw new java.lang.IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                }
                if (bArr4.length != bArr3.length) {
                    throw new java.lang.IllegalArgumentException("size mismatch for service data and service data mask");
                }
            }
            this.mServiceDataUuid = parcelUuid;
            this.mServiceData = bArr;
            this.mServiceDataMask = bArr2;
            return this;
        }

        public com.polidea.rxandroidble2.scan.ScanFilter.Builder setManufacturerData(int i, byte[] bArr) {
            if (bArr != null && i < 0) {
                throw new java.lang.IllegalArgumentException("invalid manufacture id");
            }
            this.mManufacturerId = i;
            this.mManufacturerData = bArr;
            this.mManufacturerDataMask = null;
            return this;
        }

        public com.polidea.rxandroidble2.scan.ScanFilter.Builder setManufacturerData(int i, byte[] bArr, byte[] bArr2) {
            if (bArr != null && i < 0) {
                throw new java.lang.IllegalArgumentException("invalid manufacture id");
            }
            byte[] bArr3 = this.mManufacturerDataMask;
            if (bArr3 != null) {
                byte[] bArr4 = this.mManufacturerData;
                if (bArr4 == null) {
                    throw new java.lang.IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                }
                if (bArr4.length != bArr3.length) {
                    throw new java.lang.IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                }
            }
            this.mManufacturerId = i;
            this.mManufacturerData = bArr;
            this.mManufacturerDataMask = bArr2;
            return this;
        }

        public com.polidea.rxandroidble2.scan.ScanFilter build() {
            return new com.polidea.rxandroidble2.scan.ScanFilter(this.mDeviceName, this.mDeviceAddress, this.mServiceUuid, this.mUuidMask, this.mServiceDataUuid, this.mServiceData, this.mServiceDataMask, this.mManufacturerId, this.mManufacturerData, this.mManufacturerDataMask);
        }
    }
}
