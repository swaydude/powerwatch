package powerwatch.matrix.com.pwgen2android.pair.ui.gen2;

/* JADX INFO: compiled from: Gen2PairingProgressViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/PairingFailedError;", "", "deviceId", "", "fwVersion", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getFwVersion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class PairingFailedError extends java.lang.Throwable {
    private final java.lang.String deviceId;
    private final java.lang.String fwVersion;

    public PairingFailedError(java.lang.String str, java.lang.String str2) {
        this.deviceId = str;
        this.fwVersion = str2;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final java.lang.String getFwVersion() {
        return this.fwVersion;
    }
}
