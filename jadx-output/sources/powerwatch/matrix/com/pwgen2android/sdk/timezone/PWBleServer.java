package powerwatch.matrix.com.pwgen2android.sdk.timezone;

/* JADX INFO: compiled from: PWBleServer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005*\u0001\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0006\u0010\u0019\u001a\u00020\u0011R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "advertiseCallback", "powerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer$advertiseCallback$1", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer$advertiseCallback$1;", "bluetoothGattServer", "Landroid/bluetooth/BluetoothGattServer;", "bluetoothManager", "Landroid/bluetooth/BluetoothManager;", "callback", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;", "notifyRegisteredDevices", "", "timestamp", "", "adjustReason", "", "startAdvertising", "startServer", "stopAdvertising", "stopServer", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PWBleServer implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.sdk.timezone.PWBleServer$advertiseCallback$1 advertiseCallback;
    private android.bluetooth.BluetoothGattServer bluetoothGattServer;
    private final android.bluetooth.BluetoothManager bluetoothManager;
    private final powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeCallback callback;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;

    /* JADX WARN: Type inference failed for: r2v4, types: [powerwatch.matrix.com.pwgen2android.sdk.timezone.PWBleServer$advertiseCallback$1] */
    public PWBleServer(android.content.Context context, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        this.communicator = communicator;
        java.lang.Object systemService = context.getSystemService("bluetooth");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        this.bluetoothManager = (android.bluetooth.BluetoothManager) systemService;
        this.callback = new powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeCallback();
        this.advertiseCallback = new android.bluetooth.le.AdvertiseCallback() { // from class: powerwatch.matrix.com.pwgen2android.sdk.timezone.PWBleServer$advertiseCallback$1
            @Override // android.bluetooth.le.AdvertiseCallback
            public void onStartSuccess(android.bluetooth.le.AdvertiseSettings settingsInEffect) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsInEffect, "settingsInEffect");
                android.util.Log.i("advertize", "LE Advertise Started.");
            }

            @Override // android.bluetooth.le.AdvertiseCallback
            public void onStartFailure(int errorCode) {
                android.util.Log.w("advertize", kotlin.jvm.internal.Intrinsics.stringPlus("LE Advertise Failed: ", java.lang.Integer.valueOf(errorCode)));
            }
        };
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final void startServer(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.bluetooth.BluetoothGattServer bluetoothGattServerOpenGattServer = this.bluetoothManager.openGattServer(context, this.callback);
        this.bluetoothGattServer = bluetoothGattServerOpenGattServer;
        this.callback.setBluetoothGattServer(bluetoothGattServerOpenGattServer);
        android.bluetooth.BluetoothGattServer bluetoothGattServer = this.bluetoothGattServer;
        if (bluetoothGattServer == null) {
            return;
        }
        bluetoothGattServer.addService(powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile.INSTANCE.createTimeService());
    }

    public final void stopServer() {
        android.bluetooth.BluetoothGattServer bluetoothGattServer = this.bluetoothGattServer;
        if (bluetoothGattServer == null) {
            return;
        }
        bluetoothGattServer.close();
    }

    public final void notifyRegisteredDevices(long timestamp, byte adjustReason) {
        android.bluetooth.BluetoothGattService service;
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.communicator.connectedDevices());
        android.bluetooth.BluetoothDevice registeredDevice = this.callback.getRegisteredDevice();
        if (deviceInfo == null || registeredDevice == null || !kotlin.jvm.internal.Intrinsics.areEqual(registeredDevice.getAddress(), deviceInfo.getUid())) {
            return;
        }
        byte[] exactTime = powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile.INSTANCE.getExactTime(timestamp, adjustReason);
        android.bluetooth.BluetoothGattCharacteristic characteristic = null;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Sending on time service : ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(exactTime, false, 1, null)), null, 2, null);
        android.bluetooth.BluetoothGattServer bluetoothGattServer = this.bluetoothGattServer;
        if (bluetoothGattServer != null && (service = bluetoothGattServer.getService(powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile.INSTANCE.getTIME_SERVICE())) != null) {
            characteristic = service.getCharacteristic(powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile.INSTANCE.getCURRENT_TIME());
        }
        if (characteristic != null) {
            characteristic.setValue(exactTime);
        }
        android.bluetooth.BluetoothGattServer bluetoothGattServer2 = this.bluetoothGattServer;
        if (bluetoothGattServer2 == null) {
            return;
        }
        bluetoothGattServer2.notifyCharacteristicChanged(this.bluetoothManager.getAdapter().getRemoteDevice(deviceInfo.getUid()), characteristic, false);
    }

    private final void startAdvertising() {
        android.bluetooth.le.BluetoothLeAdvertiser bluetoothLeAdvertiser = this.bluetoothManager.getAdapter().getBluetoothLeAdvertiser();
        if (bluetoothLeAdvertiser == null) {
            return;
        }
        bluetoothLeAdvertiser.startAdvertising(new android.bluetooth.le.AdvertiseSettings.Builder().setAdvertiseMode(1).setConnectable(true).setTimeout(0).setTxPowerLevel(2).build(), new android.bluetooth.le.AdvertiseData.Builder().setIncludeDeviceName(true).setIncludeTxPowerLevel(false).addServiceUuid(new android.os.ParcelUuid(powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeProfile.INSTANCE.getTIME_SERVICE())).build(), this.advertiseCallback);
    }

    private final void stopAdvertising() {
        android.bluetooth.le.BluetoothLeAdvertiser bluetoothLeAdvertiser = this.bluetoothManager.getAdapter().getBluetoothLeAdvertiser();
        if (bluetoothLeAdvertiser == null) {
            return;
        }
        bluetoothLeAdvertiser.stopAdvertising(this.advertiseCallback);
    }
}
