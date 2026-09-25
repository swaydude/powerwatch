package powerwatch.matrix.com.pwgen2android.sdk.timezone;

/* JADX INFO: compiled from: PWBleServer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J@\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;", "Landroid/bluetooth/BluetoothGattServerCallback;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "bluetoothGattServer", "Landroid/bluetooth/BluetoothGattServer;", "getBluetoothGattServer", "()Landroid/bluetooth/BluetoothGattServer;", "setBluetoothGattServer", "(Landroid/bluetooth/BluetoothGattServer;)V", "registeredDevice", "Landroid/bluetooth/BluetoothDevice;", "getRegisteredDevice", "()Landroid/bluetooth/BluetoothDevice;", "setRegisteredDevice", "(Landroid/bluetooth/BluetoothDevice;)V", "onCharacteristicReadRequest", "", "device", "requestId", "", "offset", "characteristic", "Landroid/bluetooth/BluetoothGattCharacteristic;", "onDescriptorReadRequest", "descriptor", "Landroid/bluetooth/BluetoothGattDescriptor;", "onDescriptorWriteRequest", "preparedWrite", "", "responseNeeded", "value", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CurrentTimeCallback extends android.bluetooth.BluetoothGattServerCallback implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private android.bluetooth.BluetoothGattServer bluetoothGattServer;
    private android.bluetooth.BluetoothDevice registeredDevice;

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final android.bluetooth.BluetoothGattServer getBluetoothGattServer() {
        return this.bluetoothGattServer;
    }

    public final void setBluetoothGattServer(android.bluetooth.BluetoothGattServer bluetoothGattServer) {
        this.bluetoothGattServer = bluetoothGattServer;
    }

    public final android.bluetooth.BluetoothDevice getRegisteredDevice() {
        return this.registeredDevice;
    }

    public final void setRegisteredDevice(android.bluetooth.BluetoothDevice bluetoothDevice) {
        this.registeredDevice = bluetoothDevice;
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onCharacteristicReadRequest(android.bluetooth.BluetoothDevice device, int requestId, int offset, android.bluetooth.BluetoothGattCharacteristic characteristic) {
        android.bluetooth.BluetoothGattServer bluetoothGattServer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile.INSTANCE.getCURRENT_TIME(), characteristic.getUuid())) {
            android.bluetooth.BluetoothGattServer bluetoothGattServer2 = this.bluetoothGattServer;
            if (bluetoothGattServer2 == null) {
                return;
            }
            byte[] exactTime = powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile.INSTANCE.getExactTime(jCurrentTimeMillis, (byte) 0);
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Sending data on time service for time read request: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(exactTime, false, 1, null)), null, 2, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            bluetoothGattServer2.sendResponse(device, requestId, 0, 0, exactTime);
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile.INSTANCE.getLOCAL_TIME_INFO(), characteristic.getUuid()) || (bluetoothGattServer = this.bluetoothGattServer) == null) {
            return;
        }
        byte[] localTimeInfo = powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile.INSTANCE.getLocalTimeInfo(jCurrentTimeMillis);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Sending data on time service for time info read request: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(localTimeInfo, false, 1, null)), null, 2, null);
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        bluetoothGattServer.sendResponse(device, requestId, 0, 0, localTimeInfo);
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onDescriptorReadRequest(android.bluetooth.BluetoothDevice device, int requestId, int offset, android.bluetooth.BluetoothGattDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile.INSTANCE.getCLIENT_CONFIG(), descriptor.getUuid())) {
            byte[] bArr = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Descriptor read request arrived on Config, return value: ", bArr), null, 2, null);
            android.bluetooth.BluetoothGattServer bluetoothGattServer = this.bluetoothGattServer;
            if (bluetoothGattServer == null) {
                return;
            }
            bluetoothGattServer.sendResponse(device, requestId, 0, 0, bArr);
            return;
        }
        android.bluetooth.BluetoothGattServer bluetoothGattServer2 = this.bluetoothGattServer;
        if (bluetoothGattServer2 == null) {
            return;
        }
        bluetoothGattServer2.sendResponse(device, requestId, androidx.core.view.InputDeviceCompat.SOURCE_KEYBOARD, 0, null);
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onDescriptorWriteRequest(android.bluetooth.BluetoothDevice device, int requestId, android.bluetooth.BluetoothGattDescriptor descriptor, boolean preparedWrite, boolean responseNeeded, int offset, byte[] value) {
        android.bluetooth.BluetoothGattServer bluetoothGattServer;
        android.bluetooth.BluetoothGattServer bluetoothGattServer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile.INSTANCE.getCLIENT_CONFIG(), descriptor.getUuid())) {
            if (!responseNeeded || (bluetoothGattServer = this.bluetoothGattServer) == null) {
                return;
            }
            bluetoothGattServer.sendResponse(device, requestId, androidx.core.view.InputDeviceCompat.SOURCE_KEYBOARD, 0, null);
            return;
        }
        if (java.util.Arrays.equals(android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE, value)) {
            this.registeredDevice = device;
        } else if (java.util.Arrays.equals(android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE, value)) {
            this.registeredDevice = null;
        }
        powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeCallback currentTimeCallback = this;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Descriptor write request arrived on Config, sending to ");
        java.lang.Object obj = this.registeredDevice;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", response needed: ");
        sb.append(responseNeeded);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(currentTimeCallback, sb.toString(), null, 2, null);
        if (!responseNeeded || (bluetoothGattServer2 = this.bluetoothGattServer) == null) {
            return;
        }
        bluetoothGattServer2.sendResponse(device, requestId, 0, 0, null);
    }
}
