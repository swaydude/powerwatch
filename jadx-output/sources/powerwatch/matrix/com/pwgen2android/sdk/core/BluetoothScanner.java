package powerwatch.matrix.com.pwgen2android.sdk.core;

/* JADX INFO: compiled from: BluetoothScanner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;", "", "devices", "Lio/reactivex/Observable;", "Landroid/bluetooth/BluetoothDevice;", "deviceAddresses", "", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface BluetoothScanner {
    io.reactivex.Observable<android.bluetooth.BluetoothDevice> devices();

    io.reactivex.Observable<android.bluetooth.BluetoothDevice> devices(java.util.List<java.lang.String> deviceAddresses);
}
