package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J0\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\bH&¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutor;", "", "isOtaInProgress", "", "otaOutput", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;", "resetExecutorState", "", "startOTA", "downloadURL", "", "updateInfoData", "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "deviceID", "expectVersionUpgrade", "stopOTA", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface OtaProcessExecutor {
    boolean isOtaInProgress();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAStatus> otaOutput();

    void resetExecutorState();

    void startOTA(java.lang.String downloadURL, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, java.lang.String deviceID, boolean expectVersionUpgrade);

    void stopOTA();

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void startOTA$default(powerwatch.matrix.com.pwgen2android.main.OtaProcessExecutor otaProcessExecutor, java.lang.String str, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData firmwareDisplayData, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startOTA");
            }
            otaProcessExecutor.startOTA((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData(null, null, null, null, 4, null, 47, null) : firmwareDisplayData, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? true : z);
        }
    }
}
