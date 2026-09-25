package powerwatch.matrix.com.pwgen2android.shared.data.metrics;

/* JADX INFO: compiled from: DeviceEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceOTAEvent;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;", "eventType", "", "eventDetails", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;", "deviceId", "firmwareVersion", "firmwareVersionFrom", "firmwareVersionTo", "timezone", "region", "username", "host", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "date", "", "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceOTAEvent extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEvent {

    @com.google.gson.annotations.SerializedName("firmwareVersionFrom")
    private final java.lang.String firmwareVersionFrom;

    @com.google.gson.annotations.SerializedName("firmwareVersionTo")
    private final java.lang.String firmwareVersionTo;

    public /* synthetic */ DeviceOTAEvent(java.lang.String str, powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails eventDetails, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, powerwatch.matrix.com.pwgen2android.shared.host.Host host, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eventDetails, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, str6, str7, str8, host, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceOTAEvent(java.lang.String eventType, powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails eventDetails, java.lang.String deviceId, java.lang.String firmwareVersion, java.lang.String str, java.lang.String str2, java.lang.String timezone, java.lang.String region, java.lang.String username, powerwatch.matrix.com.pwgen2android.shared.host.Host host, long j) {
        super(eventType, eventDetails, deviceId, firmwareVersion, timezone, region, username, host, j);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDetails, "eventDetails");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timezone, "timezone");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(region, "region");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        this.firmwareVersionFrom = str;
        this.firmwareVersionTo = str2;
    }
}
