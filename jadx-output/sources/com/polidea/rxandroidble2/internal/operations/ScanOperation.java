package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ScanOperation<SCAN_RESULT_TYPE, SCAN_CALLBACK_TYPE> extends com.polidea.rxandroidble2.internal.QueueOperation<SCAN_RESULT_TYPE> {
    private final com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper;

    abstract SCAN_CALLBACK_TYPE createScanCallback(io.reactivex.Emitter<SCAN_RESULT_TYPE> emitter);

    abstract boolean startScan(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, SCAN_CALLBACK_TYPE scan_callback_type);

    abstract void stopScan(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, SCAN_CALLBACK_TYPE scan_callback_type);

    ScanOperation(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper) {
        this.rxBleAdapterWrapper = rxBleAdapterWrapper;
    }

    @Override // com.polidea.rxandroidble2.internal.QueueOperation
    protected final void protectedRun(io.reactivex.ObservableEmitter<SCAN_RESULT_TYPE> observableEmitter, com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface) {
        final SCAN_CALLBACK_TYPE scan_callback_typeCreateScanCallback = createScanCallback(observableEmitter);
        try {
            observableEmitter.setCancellable(new io.reactivex.functions.Cancellable() { // from class: com.polidea.rxandroidble2.internal.operations.ScanOperation.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Cancellable
                public void cancel() throws java.lang.Exception {
                    com.polidea.rxandroidble2.internal.RxBleLog.i("Scan operation is requested to stop.", new java.lang.Object[0]);
                    com.polidea.rxandroidble2.internal.operations.ScanOperation scanOperation = com.polidea.rxandroidble2.internal.operations.ScanOperation.this;
                    scanOperation.stopScan(scanOperation.rxBleAdapterWrapper, scan_callback_typeCreateScanCallback);
                }
            });
            com.polidea.rxandroidble2.internal.RxBleLog.i("Scan operation is requested to start.", new java.lang.Object[0]);
            if (!startScan(this.rxBleAdapterWrapper, scan_callback_typeCreateScanCallback)) {
                observableEmitter.tryOnError(new com.polidea.rxandroidble2.exceptions.BleScanException(0));
            }
        } catch (java.lang.Throwable th) {
            try {
                com.polidea.rxandroidble2.internal.RxBleLog.w(th, "Error while calling the start scan function", new java.lang.Object[0]);
                observableEmitter.tryOnError(new com.polidea.rxandroidble2.exceptions.BleScanException(0, th));
            } finally {
                queueReleaseInterface.release();
            }
        }
    }

    @Override // com.polidea.rxandroidble2.internal.QueueOperation
    protected com.polidea.rxandroidble2.exceptions.BleException provideException(android.os.DeadObjectException deadObjectException) {
        return new com.polidea.rxandroidble2.exceptions.BleScanException(1, deadObjectException);
    }
}
