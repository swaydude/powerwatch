package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public class IllegalOperationMessageCreator {
    private com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser propertiesParser;

    @bleshadow.javax.inject.Inject
    public IllegalOperationMessageCreator(com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser characteristicPropertiesParser) {
        this.propertiesParser = characteristicPropertiesParser;
    }

    public java.lang.String createMismatchMessage(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return java.lang.String.format(java.util.Locale.getDefault(), "Characteristic %s supports properties: %s (%d) does not have any property matching %s (%d)", com.polidea.rxandroidble2.internal.logger.LoggerUtil.getUuidToLog(bluetoothGattCharacteristic.getUuid()), this.propertiesParser.propertiesIntToString(bluetoothGattCharacteristic.getProperties()), java.lang.Integer.valueOf(bluetoothGattCharacteristic.getProperties()), this.propertiesParser.propertiesIntToString(i), java.lang.Integer.valueOf(i));
    }
}
