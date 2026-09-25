package com.polidea.rxandroidble2.internal.logger;

/* JADX INFO: loaded from: classes2.dex */
public class LoggerUtil {
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    private static java.lang.String commonCallbackMessage() {
        return " %24s()";
    }

    private static java.lang.String commonStatusMessage() {
        return ", status=%d";
    }

    private static java.lang.String commonValueMessage() {
        return ", value=%s";
    }

    private LoggerUtil() {
    }

    public static java.lang.String bytesToHex(byte[] bArr) {
        if (bArr == null) {
            return java.lang.String.valueOf((char[]) null);
        }
        if (!com.polidea.rxandroidble2.internal.RxBleLog.getShouldLogAttributeValues()) {
            return "[...]";
        }
        int length = bArr.length;
        if (length == 0) {
            return "[]";
        }
        int i = length - 1;
        int i2 = (length * 2) + (i * 2) + 2;
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = bArr[i3] & kotlin.UByte.MAX_VALUE;
            int i5 = i3 * 2;
            int i6 = i5 + 1 + i5;
            char[] cArr2 = HEX_ARRAY;
            cArr[i6] = cArr2[i4 >>> 4];
            cArr[i6 + 1] = cArr2[i4 & 15];
        }
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = i7 * 2;
            int i9 = i8 + 1 + i8 + 2;
            cArr[i9] = ',';
            cArr[i9 + 1] = ' ';
        }
        cArr[0] = '[';
        cArr[i2 - 1] = ']';
        return new java.lang.String(cArr);
    }

    public static void logOperationStarted(com.polidea.rxandroidble2.internal.operations.Operation operation) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(3)) {
            com.polidea.rxandroidble2.internal.RxBleLog.d("STARTED  %s(%d)", operation.getClass().getSimpleName(), java.lang.Integer.valueOf(java.lang.System.identityHashCode(operation)));
        }
    }

    public static void logOperationRunning(com.polidea.rxandroidble2.internal.operations.Operation operation) {
        com.polidea.rxandroidble2.internal.RxBleLog.i("RUNNING  %s", operation);
    }

    public static void logOperationRemoved(com.polidea.rxandroidble2.internal.operations.Operation operation) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(3)) {
            com.polidea.rxandroidble2.internal.RxBleLog.d("REMOVED  %s(%d)", operation.getClass().getSimpleName(), java.lang.Integer.valueOf(java.lang.System.identityHashCode(operation)));
        }
    }

    public static void logOperationQueued(com.polidea.rxandroidble2.internal.operations.Operation operation) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(3)) {
            com.polidea.rxandroidble2.internal.RxBleLog.d("QUEUED   %s(%d)", operation.getClass().getSimpleName(), java.lang.Integer.valueOf(java.lang.System.identityHashCode(operation)));
        }
    }

    public static void logOperationFinished(com.polidea.rxandroidble2.internal.operations.Operation operation, long j, long j2) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(3)) {
            com.polidea.rxandroidble2.internal.RxBleLog.d("FINISHED %s(%d) in %d ms", operation.getClass().getSimpleName(), java.lang.Integer.valueOf(java.lang.System.identityHashCode(operation)), java.lang.Long.valueOf(j2 - j));
        }
    }

    public static void logOperationSkippedBecauseDisposedWhenAboutToRun(com.polidea.rxandroidble2.internal.operations.Operation operation) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(2)) {
            com.polidea.rxandroidble2.internal.RxBleLog.v("SKIPPED  %s(%d) just before running — is disposed", operation.getClass().getSimpleName(), java.lang.Integer.valueOf(java.lang.System.identityHashCode(operation)));
        }
    }

    public static void logCallback(java.lang.String str, android.bluetooth.BluetoothGatt bluetoothGatt, int i, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(4)) {
            com.polidea.rxandroidble2.internal.RxBleLog.i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonStatusMessage() + commonValueMessage(), str, java.lang.Integer.valueOf(i), new com.polidea.rxandroidble2.internal.logger.LoggerUtil.AttributeLogWrapper(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z));
        }
    }

    public static void logCallback(java.lang.String str, android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(4)) {
            com.polidea.rxandroidble2.internal.RxBleLog.i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonValueMessage(), str, new com.polidea.rxandroidble2.internal.logger.LoggerUtil.AttributeLogWrapper(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z));
        }
    }

    public static void logCallback(java.lang.String str, android.bluetooth.BluetoothGatt bluetoothGatt, int i, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, boolean z) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(4)) {
            com.polidea.rxandroidble2.internal.RxBleLog.i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonStatusMessage() + commonValueMessage(), str, java.lang.Integer.valueOf(i), new com.polidea.rxandroidble2.internal.logger.LoggerUtil.AttributeLogWrapper(bluetoothGattDescriptor.getUuid(), bluetoothGattDescriptor.getValue(), z));
        }
    }

    public static void logCallback(java.lang.String str, android.bluetooth.BluetoothGatt bluetoothGatt, int i) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(4)) {
            com.polidea.rxandroidble2.internal.RxBleLog.i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonStatusMessage(), str, java.lang.Integer.valueOf(i));
        }
    }

    public static void logCallback(java.lang.String str, android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(4)) {
            com.polidea.rxandroidble2.internal.RxBleLog.i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonStatusMessage() + commonValueMessage(), str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
    }

    public static void logConnectionUpdateCallback(java.lang.String str, android.bluetooth.BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(4)) {
            com.polidea.rxandroidble2.internal.RxBleLog.i(commonMacMessage(bluetoothGatt) + commonCallbackMessage() + commonStatusMessage() + ", interval=%d (%.2f ms), latency=%d, timeout=%d (%.0f ms)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Float.valueOf(i2 * 1.25f), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Float.valueOf(i4 * 10.0f));
        }
    }

    public static java.lang.String commonMacMessage(android.bluetooth.BluetoothGatt bluetoothGatt) {
        return bluetoothGatt == null ? "MAC=null" : commonMacMessage(bluetoothGatt.getDevice().getAddress());
    }

    public static java.lang.String commonMacMessage(java.lang.String str) {
        if (str == null) {
            return "MAC=null";
        }
        int macAddressLogSetting = com.polidea.rxandroidble2.internal.RxBleLog.getMacAddressLogSetting();
        if (macAddressLogSetting == 3) {
            str = str.substring(0, 15) + "XX";
        } else if (macAddressLogSetting == Integer.MAX_VALUE) {
            str = "XX:XX:XX:XX:XX:XX";
        }
        return java.lang.String.format("MAC='%s'", str);
    }

    public static com.polidea.rxandroidble2.internal.logger.LoggerUtil.AttributeLogWrapper wrap(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        return new com.polidea.rxandroidble2.internal.logger.LoggerUtil.AttributeLogWrapper(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue(), z);
    }

    public static com.polidea.rxandroidble2.internal.logger.LoggerUtil.AttributeLogWrapper wrap(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, boolean z) {
        return new com.polidea.rxandroidble2.internal.logger.LoggerUtil.AttributeLogWrapper(bluetoothGattDescriptor.getUuid(), bluetoothGattDescriptor.getValue(), z);
    }

    public static java.lang.String getUuidToLog(java.util.UUID uuid) {
        return com.polidea.rxandroidble2.internal.RxBleLog.getUuidLogSetting() == 2 ? uuid.toString() : "...";
    }

    public static java.lang.String getUuidSetToLog(java.util.Set<java.util.UUID> set) {
        int size = set.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.util.Iterator<java.util.UUID> it = set.iterator();
        for (int i = 0; i < size; i++) {
            strArr[i] = getUuidToLog(it.next());
        }
        return java.util.Arrays.toString(strArr);
    }

    public static class AttributeLogWrapper {
        private final java.util.UUID uuid;
        private final byte[] value;
        private final boolean valueMatters;

        public AttributeLogWrapper(java.util.UUID uuid, byte[] bArr, boolean z) {
            this.uuid = uuid;
            this.value = bArr;
            this.valueMatters = z;
        }

        public java.lang.String toString() {
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("[uuid='");
            sb.append(com.polidea.rxandroidble2.internal.logger.LoggerUtil.getUuidToLog(this.uuid));
            if (this.valueMatters) {
                str = "', hexValue=" + com.polidea.rxandroidble2.internal.logger.LoggerUtil.bytesToHex(this.value);
            } else {
                str = "'";
            }
            sb.append(str);
            sb.append(']');
            return sb.toString();
        }
    }
}
