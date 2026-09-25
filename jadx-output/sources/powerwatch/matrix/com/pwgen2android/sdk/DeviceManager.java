package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: DeviceManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\bH&J\b\u0010\u0010\u001a\u00020\fH&J\b\u0010\u0011\u001a\u00020\fH&J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "", "monitoringEvents", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;", "getMonitoringEvents", "()Lio/reactivex/Observable;", "connect", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "forceRefresh", "", "connectTo", "", "id", "", "defaultDevice", "destroy", "init", "readDeviceInfo", "Lio/reactivex/Single;", "deviceInfo", "device", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface DeviceManager {
    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> connect(boolean forceRefresh);

    void connectTo(java.lang.String id);

    powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo defaultDevice();

    void destroy();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent> getMonitoringEvents();

    void init();

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> readDeviceInfo(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device);

    /* JADX INFO: compiled from: DeviceManager.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ io.reactivex.Observable connect$default(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return deviceManager.connect(z);
        }

        public static /* synthetic */ io.reactivex.Single readDeviceInfo$default(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readDeviceInfo");
            }
            if ((i & 2) != 0) {
                device = null;
            }
            return deviceManager.readDeviceInfo(deviceInfo, device);
        }
    }
}
