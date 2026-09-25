package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type;

/* JADX INFO: compiled from: NotificationTypeController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;", "", "clearMemory", "", "enableApp", "appIdentifier", "", "enable", "", "appType", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;", "getSupportedApps", "", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationApp;", "activityContext", "Landroid/content/Context;", "isAppEnabled", "listenForChange", "Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface NotificationTypeController {
    void clearMemory();

    void enableApp(java.lang.String appIdentifier, boolean enable);

    void enableApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType appType, boolean enable);

    java.util.List<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationApp> getSupportedApps(android.content.Context activityContext);

    boolean isAppEnabled(java.lang.String appIdentifier);

    boolean isAppEnabled(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType appType);

    io.reactivex.Observable<java.lang.Boolean> listenForChange(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType appType);
}
