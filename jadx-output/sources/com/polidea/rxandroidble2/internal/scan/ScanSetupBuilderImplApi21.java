package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class ScanSetupBuilderImplApi21 implements com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder {
    private final com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter androidScanObjectsConverter;
    private final com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator internalScanResultCreator;
    private final com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper;
    private final com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator scanSettingsEmulator;

    @bleshadow.javax.inject.Inject
    ScanSetupBuilderImplApi21(com.polidea.rxandroidble2.internal.util.RxBleAdapterWrapper rxBleAdapterWrapper, com.polidea.rxandroidble2.internal.scan.InternalScanResultCreator internalScanResultCreator, com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator scanSettingsEmulator, com.polidea.rxandroidble2.internal.scan.AndroidScanObjectsConverter androidScanObjectsConverter) {
        this.rxBleAdapterWrapper = rxBleAdapterWrapper;
        this.internalScanResultCreator = internalScanResultCreator;
        this.scanSettingsEmulator = scanSettingsEmulator;
        this.androidScanObjectsConverter = androidScanObjectsConverter;
    }

    @Override // com.polidea.rxandroidble2.internal.scan.ScanSetupBuilder
    public com.polidea.rxandroidble2.internal.scan.ScanSetup build(com.polidea.rxandroidble2.scan.ScanSettings scanSettings, com.polidea.rxandroidble2.scan.ScanFilter... scanFilterArr) {
        final io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observableTransformerEmulateCallbackType = this.scanSettingsEmulator.emulateCallbackType(scanSettings.getCallbackType());
        return new com.polidea.rxandroidble2.internal.scan.ScanSetup(new com.polidea.rxandroidble2.internal.operations.ScanOperationApi21(this.rxBleAdapterWrapper, this.internalScanResultCreator, this.androidScanObjectsConverter, scanSettings, new com.polidea.rxandroidble2.internal.scan.EmulatedScanFilterMatcher(scanFilterArr), null), new io.reactivex.ObservableTransformer<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult, com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult>() { // from class: com.polidea.rxandroidble2.internal.scan.ScanSetupBuilderImplApi21.1
            @Override // io.reactivex.ObservableTransformer
            /* JADX INFO: renamed from: apply */
            public io.reactivex.ObservableSource<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> apply2(io.reactivex.Observable<com.polidea.rxandroidble2.internal.scan.RxBleInternalScanResult> observable) {
                return observable.compose(observableTransformerEmulateCallbackType);
            }
        });
    }
}
