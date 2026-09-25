package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver;

/* JADX INFO: compiled from: OtherAppsResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;", "", "enableApp", "", "packageName", "", "enable", "", "getAppInfo", "", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "activityContext", "Landroid/content/Context;", "isAppEnabled", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AppsController {
    void enableApp(java.lang.String packageName, boolean enable);

    java.util.List<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo> getAppInfo(android.content.Context activityContext);

    boolean isAppEnabled(java.lang.String packageName);
}
