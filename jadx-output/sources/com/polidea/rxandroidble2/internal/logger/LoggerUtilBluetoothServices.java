package com.polidea.rxandroidble2.internal.logger;

/* JADX INFO: loaded from: classes2.dex */
public class LoggerUtilBluetoothServices {
    private final com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser characteristicPropertiesParser;

    @bleshadow.javax.inject.Inject
    LoggerUtilBluetoothServices(com.polidea.rxandroidble2.internal.util.CharacteristicPropertiesParser characteristicPropertiesParser) {
        this.characteristicPropertiesParser = characteristicPropertiesParser;
    }

    public void log(com.polidea.rxandroidble2.RxBleDeviceServices rxBleDeviceServices, android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(2)) {
            com.polidea.rxandroidble2.internal.RxBleLog.v("Preparing services description", new java.lang.Object[0]);
            com.polidea.rxandroidble2.internal.RxBleLog.v(prepareServicesDescription(rxBleDeviceServices, bluetoothDevice), new java.lang.Object[0]);
        }
    }

    private java.lang.String prepareServicesDescription(com.polidea.rxandroidble2.RxBleDeviceServices rxBleDeviceServices, android.bluetooth.BluetoothDevice bluetoothDevice) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        appendDeviceHeader(bluetoothDevice, sb);
        for (android.bluetooth.BluetoothGattService bluetoothGattService : rxBleDeviceServices.getBluetoothGattServices()) {
            sb.append('\n');
            appendServiceDescription(sb, bluetoothGattService);
        }
        sb.append("\n--------------- ====== Finished peripheral content ====== ---------------");
        return sb.toString();
    }

    private void appendServiceDescription(java.lang.StringBuilder sb, android.bluetooth.BluetoothGattService bluetoothGattService) {
        appendServiceHeader(sb, bluetoothGattService);
        sb.append("-> Characteristics:");
        for (android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
            appendCharacteristicNameHeader(sb, bluetoothGattCharacteristic);
            appendCharacteristicProperties(sb, bluetoothGattCharacteristic);
            appendDescriptors(sb, bluetoothGattCharacteristic);
        }
    }

    private void appendDescriptors(java.lang.StringBuilder sb, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic.getDescriptors().isEmpty()) {
            return;
        }
        appendDescriptorsHeader(sb);
        java.util.Iterator<android.bluetooth.BluetoothGattDescriptor> it = bluetoothGattCharacteristic.getDescriptors().iterator();
        while (it.hasNext()) {
            appendDescriptorNameHeader(sb, it.next());
        }
    }

    private void appendDescriptorsHeader(java.lang.StringBuilder sb) {
        sb.append('\n');
        sb.append('\t');
        sb.append("  ");
        sb.append("-> Descriptors: ");
    }

    private void appendCharacteristicNameHeader(java.lang.StringBuilder sb, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        sb.append('\n');
        sb.append('\t');
        sb.append("* ");
        sb.append(createCharacteristicName(bluetoothGattCharacteristic));
        sb.append(" (");
        sb.append(com.polidea.rxandroidble2.internal.logger.LoggerUtil.getUuidToLog(bluetoothGattCharacteristic.getUuid()));
        sb.append(")");
    }

    private void appendDescriptorNameHeader(java.lang.StringBuilder sb, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor) {
        sb.append('\n');
        sb.append('\t');
        sb.append('\t');
        sb.append("* ");
        sb.append(createDescriptorName(bluetoothGattDescriptor));
        sb.append(" (");
        sb.append(com.polidea.rxandroidble2.internal.logger.LoggerUtil.getUuidToLog(bluetoothGattDescriptor.getUuid()));
        sb.append(")");
    }

    private java.lang.String createDescriptorName(android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor) {
        java.lang.String descriptorName = com.polidea.rxandroidble2.utils.StandardUUIDsParser.getDescriptorName(bluetoothGattDescriptor.getUuid());
        return descriptorName == null ? "Unknown descriptor" : descriptorName;
    }

    private void appendCharacteristicProperties(java.lang.StringBuilder sb, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        sb.append('\n');
        sb.append('\t');
        sb.append("  ");
        sb.append("Properties: ");
        sb.append(this.characteristicPropertiesParser.propertiesIntToString(bluetoothGattCharacteristic.getProperties()));
    }

    private java.lang.String createCharacteristicName(android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        java.lang.String characteristicName = com.polidea.rxandroidble2.utils.StandardUUIDsParser.getCharacteristicName(bluetoothGattCharacteristic.getUuid());
        return characteristicName == null ? "Unknown characteristic" : characteristicName;
    }

    private void appendDeviceHeader(android.bluetooth.BluetoothDevice bluetoothDevice, java.lang.StringBuilder sb) {
        sb.append("--------------- ====== Printing peripheral content ====== ---------------\n");
        sb.append(com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(bluetoothDevice.getAddress()));
        sb.append('\n');
        sb.append("PERIPHERAL NAME: ");
        sb.append(bluetoothDevice.getName());
        sb.append('\n');
        sb.append("-------------------------------------------------------------------------");
    }

    private void appendServiceHeader(java.lang.StringBuilder sb, android.bluetooth.BluetoothGattService bluetoothGattService) {
        sb.append("\n");
        sb.append(createServiceType(bluetoothGattService));
        sb.append(" - ");
        sb.append(createServiceName(bluetoothGattService));
        sb.append(" (");
        sb.append(com.polidea.rxandroidble2.internal.logger.LoggerUtil.getUuidToLog(bluetoothGattService.getUuid()));
        sb.append(")\n");
        sb.append("Instance ID: ");
        sb.append(bluetoothGattService.getInstanceId());
        sb.append('\n');
    }

    private java.lang.String createServiceName(android.bluetooth.BluetoothGattService bluetoothGattService) {
        java.lang.String serviceName = com.polidea.rxandroidble2.utils.StandardUUIDsParser.getServiceName(bluetoothGattService.getUuid());
        return serviceName == null ? "Unknown service" : serviceName;
    }

    private java.lang.String createServiceType(android.bluetooth.BluetoothGattService bluetoothGattService) {
        return bluetoothGattService.getType() == 0 ? "Primary Service" : "Secondary Service";
    }
}
