package powerwatch.matrix.com.pwgen2android.sdk.core;

/* JADX INFO: compiled from: BleScanner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;", "", "scan", "Lio/reactivex/Observable;", "Lcom/polidea/rxandroidble2/scan/ScanResult;", "bleScannerConfiguration", "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface BleScanner {
    io.reactivex.Observable<com.polidea.rxandroidble2.scan.ScanResult> scan(powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration bleScannerConfiguration);
}
