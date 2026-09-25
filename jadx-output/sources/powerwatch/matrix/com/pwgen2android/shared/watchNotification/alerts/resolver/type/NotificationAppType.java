package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type;

/* JADX INFO: compiled from: NotificationTypeController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;", "", "titleResourceId", "", "label", "", "(ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getTitleResourceId", "()I", "Calls", "SMS", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class NotificationAppType {
    private final java.lang.String label;
    private final int titleResourceId;

    public /* synthetic */ NotificationAppType(int i, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    /* JADX INFO: compiled from: NotificationTypeController.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Calls extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.Calls INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.Calls();

        private Calls() {
            super(powerwatch.matrix.com.pwgen2android.R.string.calls, "Calls", null);
        }
    }

    private NotificationAppType(int i, java.lang.String str) {
        this.titleResourceId = i;
        this.label = str;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final int getTitleResourceId() {
        return this.titleResourceId;
    }

    /* JADX INFO: compiled from: NotificationTypeController.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SMS extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.SMS INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.SMS();

        private SMS() {
            super(powerwatch.matrix.com.pwgen2android.R.string.messages, "Messages", null);
        }
    }
}
