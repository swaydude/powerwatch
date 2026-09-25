package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: DeviceManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;", "", "()V", "observingEnded", "observingStarted", "Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent$observingStarted;", "Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent$observingEnded;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class MonitoringEvent {
    public /* synthetic */ MonitoringEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: DeviceManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent$observingStarted;", "Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class observingStarted extends powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent {
        public static final powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent.observingStarted INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent.observingStarted();

        private observingStarted() {
            super(null);
        }
    }

    private MonitoringEvent() {
    }

    /* JADX INFO: compiled from: DeviceManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent$observingEnded;", "Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class observingEnded extends powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent {
        public static final powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent.observingEnded INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent.observingEnded();

        private observingEnded() {
            super(null);
        }
    }
}
