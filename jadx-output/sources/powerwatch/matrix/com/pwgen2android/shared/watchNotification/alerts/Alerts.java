package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;", "", "value", "", "(I)V", "getValue", "()I", "ALARMS", "CALLS", "GOALS", "MESSAGES", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$CALLS;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$MESSAGES;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$ALARMS;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$GOALS;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class Alerts {
    private final int value;

    public /* synthetic */ Alerts(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX INFO: compiled from: AlertsConfiguration.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$CALLS;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CALLS extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts.CALLS INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts.CALLS();

        private CALLS() {
            super(8, null);
        }
    }

    private Alerts(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: AlertsConfiguration.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$MESSAGES;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MESSAGES extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts.MESSAGES INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts.MESSAGES();

        private MESSAGES() {
            super(4, null);
        }
    }

    /* JADX INFO: compiled from: AlertsConfiguration.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$ALARMS;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ALARMS extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts.ALARMS INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts.ALARMS();

        private ALARMS() {
            super(2, null);
        }
    }

    /* JADX INFO: compiled from: AlertsConfiguration.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$GOALS;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class GOALS extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts.GOALS INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alerts.GOALS();

        private GOALS() {
            super(1, null);
        }
    }
}
