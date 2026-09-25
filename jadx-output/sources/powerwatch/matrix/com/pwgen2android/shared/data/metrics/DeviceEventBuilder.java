package powerwatch.matrix.com.pwgen2android.shared.data.metrics;

/* JADX INFO: compiled from: DeviceEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J^\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014JJ\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;", "", "hostInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;)V", "createDeviceOTAEvent", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceOTAEvent;", "eventType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;", "eventStatus", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "username", "", "deviceId", "firmwareVersion", "firmwareVersionFrom", "firmwareVersionTo", "timezone", "region", "date", "", "createEvent", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceEventBuilder {
    private final powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider;

    public DeviceEventBuilder(powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostInfoProvider, "hostInfoProvider");
        this.hostInfoProvider = hostInfoProvider;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEvent createEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType eventType, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus eventStatus, java.lang.String username, java.lang.String deviceId, java.lang.String firmwareVersion, java.lang.String timezone, java.lang.String region, long date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timezone, "timezone");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "region");
        return new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEvent(eventType.getEventType(), eventStatus != null ? new powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails(eventStatus.getValue()) : new powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails(null, 1, null), deviceId, firmwareVersion, timezone, region, username, this.hostInfoProvider.hostInfo(false), date);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceOTAEvent createDeviceOTAEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType eventType, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus eventStatus, java.lang.String username, java.lang.String deviceId, java.lang.String firmwareVersion, java.lang.String firmwareVersionFrom, java.lang.String firmwareVersionTo, java.lang.String timezone, java.lang.String region, long date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timezone, "timezone");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "region");
        return new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceOTAEvent(eventType.getEventType(), eventStatus != null ? new powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails(eventStatus.getValue()) : new powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails(null, 1, null), deviceId, firmwareVersion, firmwareVersionFrom, firmwareVersionTo, timezone, region, username, this.hostInfoProvider.hostInfo(false), date);
    }
}
