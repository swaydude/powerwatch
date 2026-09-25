package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type;

/* JADX INFO: compiled from: NotificationTypeController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationApp;", "", "type", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "appIdentifier", "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;Ljava/lang/String;Ljava/lang/String;)V", "getAppIdentifier", "()Ljava/lang/String;", "getTitle", "getType", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationApp {
    private final java.lang.String appIdentifier;
    private final java.lang.String title;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType type;

    public NotificationApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType type, java.lang.String title, java.lang.String appIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appIdentifier, "appIdentifier");
        this.type = type;
        this.title = title;
        this.appIdentifier = appIdentifier;
    }

    public /* synthetic */ NotificationApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType notificationAppType, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(notificationAppType, str, (i & 4) != 0 ? notificationAppType.getLabel() : str2);
    }

    public final java.lang.String getAppIdentifier() {
        return this.appIdentifier;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType getType() {
        return this.type;
    }
}
