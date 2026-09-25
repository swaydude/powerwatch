package powerwatch.matrix.com.pwgen2android.main.update;

/* JADX INFO: compiled from: FirmwareAvailableFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/update/UpdateAvailableData;", "Ljava/io/Serializable;", "version", "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;", "updateAvailable", "", "(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;Z)V", "getDeviceInfo", "()Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;", "getUpdateAvailable", "()Z", "getVersion", "()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UpdateAvailableData implements java.io.Serializable {
    private final powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData deviceInfo;
    private final boolean updateAvailable;
    private final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData version;

    public UpdateAvailableData(powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData version, powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData deviceInfo, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.version = version;
        this.deviceInfo = deviceInfo;
        this.updateAvailable = z;
    }

    public final powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData getDeviceInfo() {
        return this.deviceInfo;
    }

    public final boolean getUpdateAvailable() {
        return this.updateAvailable;
    }

    public final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData getVersion() {
        return this.version;
    }
}
