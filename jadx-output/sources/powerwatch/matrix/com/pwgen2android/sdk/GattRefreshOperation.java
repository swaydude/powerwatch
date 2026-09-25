package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: loaded from: classes2.dex */
public class GattRefreshOperation implements com.polidea.rxandroidble2.RxBleCustomOperation<java.lang.Boolean> {
    @Override // com.polidea.rxandroidble2.RxBleCustomOperation
    public io.reactivex.Observable<java.lang.Boolean> asObservable(final android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, io.reactivex.Scheduler scheduler) throws java.lang.Throwable {
        return io.reactivex.Observable.just(refreshDeviceCache(bluetoothGatt)).delay(2700L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribeOn(scheduler);
    }

    private java.lang.Boolean refreshDeviceCache(android.bluetooth.BluetoothGatt gatt) {
        try {
            java.lang.reflect.Method method = gatt.getClass().getMethod("refresh", new java.lang.Class[0]);
            if (method != null) {
                boolean zBooleanValue = ((java.lang.Boolean) method.invoke(gatt, new java.lang.Object[0])).booleanValue();
                android.util.Log.i(powerwatch.matrix.com.pwgen2android.sdk.GattRefreshOperation.class.getSimpleName(), "Gatt cache refresh successful: [%b]" + zBooleanValue);
            }
            return true;
        } catch (java.lang.Exception unused) {
            android.util.Log.e(powerwatch.matrix.com.pwgen2android.sdk.GattRefreshOperation.class.getSimpleName(), "An exception occurred while refreshing device");
            return false;
        }
    }
}
