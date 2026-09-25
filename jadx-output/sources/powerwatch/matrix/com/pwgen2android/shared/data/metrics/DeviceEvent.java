package powerwatch.matrix.com.pwgen2android.shared.data.metrics;

/* JADX INFO: compiled from: DeviceEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\u0010\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;", "eventType", "", "eventDetails", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;", "deviceId", "firmwareVersion", "timezone", "region", "username", "host", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "date", "", "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class DeviceEvent extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.HostEvent {

    @com.google.gson.annotations.SerializedName("deviceId")
    private final java.lang.String deviceId;

    @com.google.gson.annotations.SerializedName("eventDetails")
    private final powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails eventDetails;

    @com.google.gson.annotations.SerializedName("eventType")
    private final java.lang.String eventType;

    @com.google.gson.annotations.SerializedName("firmwareVersion")
    private final java.lang.String firmwareVersion;

    @com.google.gson.annotations.SerializedName("region")
    private final java.lang.String region;

    @com.google.gson.annotations.SerializedName("timezone")
    private final java.lang.String timezone;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceEvent(java.lang.String eventType, powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails eventDetails, java.lang.String deviceId, java.lang.String firmwareVersion, java.lang.String timezone, java.lang.String region, java.lang.String username, powerwatch.matrix.com.pwgen2android.shared.host.Host host, long j) {
        super(username, host, j);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDetails, "eventDetails");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timezone, "timezone");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "region");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        this.eventType = eventType;
        this.eventDetails = eventDetails;
        this.deviceId = deviceId;
        this.firmwareVersion = firmwareVersion;
        this.timezone = timezone;
        this.region = region;
    }
}
