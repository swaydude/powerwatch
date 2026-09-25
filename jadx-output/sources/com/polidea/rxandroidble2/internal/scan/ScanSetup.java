package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class ScanSetup {
    public final com.polidea.rxandroidble2.internal.operations.Operation<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> scanOperation;
    public final io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> scanOperationBehaviourEmulatorTransformer;

    public ScanSetup(com.polidea.rxandroidble2.internal.operations.Operation<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> operation, io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observableTransformer) {
        this.scanOperation = operation;
        this.scanOperationBehaviourEmulatorTransformer = observableTransformer;
    }
}
