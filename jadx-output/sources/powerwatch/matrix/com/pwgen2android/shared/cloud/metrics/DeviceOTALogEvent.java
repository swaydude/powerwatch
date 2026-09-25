package powerwatch.matrix.com.pwgen2android.shared.cloud.metrics;

/* JADX INFO: compiled from: MetricsRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;", "deviceEventType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;", "eventStatus", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "logDevice", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;", "firmwareVersionFrom", "", "firmwareVersionTo", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Ljava/lang/String;Ljava/lang/String;)V", "getFirmwareVersionFrom", "()Ljava/lang/String;", "getFirmwareVersionTo", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceOTALogEvent extends powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent {
    private final java.lang.String firmwareVersionFrom;
    private final java.lang.String firmwareVersionTo;

    public /* synthetic */ DeviceOTALogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType deviceEventType, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus deviceEventStatus, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice logDevice, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceEventType, deviceEventStatus, (i & 4) != 0 ? null : logDevice, str, str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceOTALogEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType deviceEventType, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus deviceEventStatus, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice logDevice, java.lang.String firmwareVersionFrom, java.lang.String firmwareVersionTo) {
        super(deviceEventType, deviceEventStatus, logDevice);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceEventType, "deviceEventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionFrom, "firmwareVersionFrom");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionTo, "firmwareVersionTo");
        this.firmwareVersionFrom = firmwareVersionFrom;
        this.firmwareVersionTo = firmwareVersionTo;
    }

    public final java.lang.String getFirmwareVersionFrom() {
        return this.firmwareVersionFrom;
    }

    public final java.lang.String getFirmwareVersionTo() {
        return this.firmwareVersionTo;
    }
}
