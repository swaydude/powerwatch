package powerwatch.matrix.com.pwgen2android.shared.data.metrics;

/* JADX INFO: compiled from: AppEvents.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventBuilder;", "", "hostInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;)V", "createAppEvent", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEvent;", "appEventType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;", "username", "", "generatedDate", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppEventBuilder {
    private final powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider;

    public AppEventBuilder(powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostInfoProvider, "hostInfoProvider");
        this.hostInfoProvider = hostInfoProvider;
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEvent createAppEvent$default(powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEventBuilder appEventBuilder, powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEventType appEventType, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        return appEventBuilder.createAppEvent(appEventType, str, j);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEvent createAppEvent(powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEventType appEventType, java.lang.String username, long generatedDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEventType, "appEventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        return new powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEvent(appEventType.getEventType(), "", username, this.hostInfoProvider.hostInfo(false), generatedDate);
    }
}
