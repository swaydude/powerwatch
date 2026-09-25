package powerwatch.matrix.com.pwgen2android.sdk.core;

/* JADX INFO: compiled from: BleScanner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;", "rxBleClient", "Lcom/polidea/rxandroidble2/RxBleClient;", "(Lcom/polidea/rxandroidble2/RxBleClient;)V", "scan", "Lio/reactivex/Observable;", "Lcom/polidea/rxandroidble2/scan/ScanResult;", "bleScannerConfiguration", "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BleScannerImpl implements powerwatch.matrix.com.pwgen2android.sdk.core.BleScanner {
    private final com.polidea.rxandroidble2.RxBleClient rxBleClient;

    public BleScannerImpl(com.polidea.rxandroidble2.RxBleClient rxBleClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        this.rxBleClient = rxBleClient;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.core.BleScanner
    public io.reactivex.Observable<com.polidea.rxandroidble2.scan.ScanResult> scan(final powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration bleScannerConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleScannerConfiguration, "bleScannerConfiguration");
        io.reactivex.Observable<com.polidea.rxandroidble2.scan.ScanResult> observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.core.-$$Lambda$BleScannerImpl$6OF8SJb4CEQ4l6VeXdjAWtn17is
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerImpl.m2276scan$lambda0(bleScannerConfiguration, this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n            val scanSettings = ScanSettings.Builder().setScanMode(bleScannerConfiguration.scanMode.ordinal).build()\n            val filters = bleScannerConfiguration.scanFilters.toTypedArray()\n\n            if (bleScannerConfiguration.scanTimeout != null) {\n                return@defer rxBleClient.scanBleDevices(scanSettings, *filters)\n                        .timeout(bleScannerConfiguration.scanTimeout, TimeUnit.MILLISECONDS)\n            }\n            rxBleClient.scanBleDevices(scanSettings, *filters)\n        }");
        return observableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scan$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2276scan$lambda0(powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration bleScannerConfiguration, powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleScannerConfiguration, "$bleScannerConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.polidea.rxandroidble2.scan.ScanSettings scanSettingsBuild = new com.polidea.rxandroidble2.scan.ScanSettings.Builder().setScanMode(bleScannerConfiguration.getScanMode().ordinal()).build();
        java.lang.Object[] array = bleScannerConfiguration.getScanFilters().toArray(new com.polidea.rxandroidble2.scan.ScanFilter[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        com.polidea.rxandroidble2.scan.ScanFilter[] scanFilterArr = (com.polidea.rxandroidble2.scan.ScanFilter[]) array;
        if (bleScannerConfiguration.getScanTimeout() != null) {
            return this$0.rxBleClient.scanBleDevices(scanSettingsBuild, (com.polidea.rxandroidble2.scan.ScanFilter[]) java.util.Arrays.copyOf(scanFilterArr, scanFilterArr.length)).timeout(bleScannerConfiguration.getScanTimeout().longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        return this$0.rxBleClient.scanBleDevices(scanSettingsBuild, (com.polidea.rxandroidble2.scan.ScanFilter[]) java.util.Arrays.copyOf(scanFilterArr, scanFilterArr.length));
    }
}
