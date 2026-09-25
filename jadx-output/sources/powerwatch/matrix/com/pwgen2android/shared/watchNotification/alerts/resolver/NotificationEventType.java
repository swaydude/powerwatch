package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver;

/* JADX INFO: compiled from: OtherAppsResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType;", "", "typeIdentifier", "", "(Ljava/lang/String;)V", "getTypeIdentifier", "()Ljava/lang/String;", "DISMISSED", "POSTED", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType$POSTED;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType$DISMISSED;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class NotificationEventType {
    private final java.lang.String typeIdentifier;

    public /* synthetic */ NotificationEventType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: OtherAppsResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType$POSTED;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class POSTED extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType.POSTED INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType.POSTED();

        private POSTED() {
            super("POSTED", null);
        }
    }

    private NotificationEventType(java.lang.String str) {
        this.typeIdentifier = str;
    }

    public final java.lang.String getTypeIdentifier() {
        return this.typeIdentifier;
    }

    /* JADX INFO: compiled from: OtherAppsResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType$DISMISSED;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DISMISSED extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType.DISMISSED INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType.DISMISSED();

        private DISMISSED() {
            super("DISMISSED", null);
        }
    }
}
