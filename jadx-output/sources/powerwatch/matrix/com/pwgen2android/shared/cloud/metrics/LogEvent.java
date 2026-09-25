package powerwatch.matrix.com.pwgen2android.shared.cloud.metrics;

/* JADX INFO: compiled from: MetricsRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;", "", "deviceEventType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;", "eventStatus", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "logDevice", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)V", "getDeviceEventType", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;", "getEventStatus", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "getLogDevice", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class LogEvent {
    private final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType deviceEventType;
    private final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus eventStatus;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice logDevice;

    public LogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType deviceEventType, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus deviceEventStatus, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice logDevice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceEventType, "deviceEventType");
        this.deviceEventType = deviceEventType;
        this.eventStatus = deviceEventStatus;
        this.logDevice = logDevice;
    }

    public /* synthetic */ LogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType deviceEventType, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus deviceEventStatus, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice logDevice, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceEventType, deviceEventStatus, (i & 4) != 0 ? null : logDevice);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType getDeviceEventType() {
        return this.deviceEventType;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus getEventStatus() {
        return this.eventStatus;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice getLogDevice() {
        return this.logDevice;
    }
}
