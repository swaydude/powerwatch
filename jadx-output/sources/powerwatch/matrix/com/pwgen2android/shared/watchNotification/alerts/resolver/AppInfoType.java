package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver;

/* JADX INFO: compiled from: OtherAppsResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;", "", "()V", "NotificationType", "OtherApp", "OtherAppMasterSwitch", "Whitelist", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$Whitelist;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherApp;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherAppMasterSwitch;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$NotificationType;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class AppInfoType {
    public /* synthetic */ AppInfoType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: OtherAppsResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$Whitelist;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Whitelist extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.Whitelist INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.Whitelist();

        private Whitelist() {
            super(null);
        }
    }

    private AppInfoType() {
    }

    /* JADX INFO: compiled from: OtherAppsResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherApp;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class OtherApp extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.OtherApp INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.OtherApp();

        private OtherApp() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtherAppsResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$OtherAppMasterSwitch;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class OtherAppMasterSwitch extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.OtherAppMasterSwitch INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.OtherAppMasterSwitch();

        private OtherAppMasterSwitch() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: OtherAppsResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType$NotificationType;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfoType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NotificationType extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType {
        public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.NotificationType INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfoType.NotificationType();

        private NotificationType() {
            super(null);
        }
    }
}
