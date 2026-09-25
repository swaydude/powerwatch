package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public class IllegalOperationChecker {
    private com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler resultHandler;

    @bleshadow.javax.inject.Inject
    public IllegalOperationChecker(com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler illegalOperationHandler) {
        this.resultHandler = illegalOperationHandler;
    }

    public io.reactivex.Completable checkAnyPropertyMatches(final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i) {
        return io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker.1
            @Override // io.reactivex.functions.Action
            public void run() {
                com.polidea.rxandroidble2.internal.BleIllegalOperationException bleIllegalOperationExceptionHandleMismatchData;
                if ((bluetoothGattCharacteristic.getProperties() & i) == 0 && (bleIllegalOperationExceptionHandleMismatchData = com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker.this.resultHandler.handleMismatchData(bluetoothGattCharacteristic, i)) != null) {
                    throw bleIllegalOperationExceptionHandleMismatchData;
                }
            }
        });
    }
}
