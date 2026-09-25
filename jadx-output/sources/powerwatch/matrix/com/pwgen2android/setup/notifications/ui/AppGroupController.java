package powerwatch.matrix.com.pwgen2android.setup.notifications.ui;

/* JADX INFO: compiled from: NotificationsRecyclerViewAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppGroupController;", "", "enableApp", "", "appInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "enable", "", "getAppGroups", "", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$HeaderState;", "", "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/AppListItemState$ItemState;", "activityContext", "Landroid/content/Context;", "isAppEnabled", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AppGroupController {
    void enableApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo, boolean enable);

    java.util.Map<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.HeaderState, java.util.List<powerwatch.matrix.com.pwgen2android.setup.notifications.ui.AppListItemState.ItemState>> getAppGroups(android.content.Context activityContext);

    boolean isAppEnabled(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo);
}
