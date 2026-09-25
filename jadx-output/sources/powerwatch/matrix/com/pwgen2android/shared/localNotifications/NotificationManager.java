package powerwatch.matrix.com.pwgen2android.shared.localNotifications;

/* JADX INFO: compiled from: NotificationManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J(\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\bH&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;", "", "dismissBatteryNotification", "", "context", "Landroid/content/Context;", "dismissNotification", "notificationID", "", "showBatteryNotification", "deviceID", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "showConnectionNotification", "realtimeDataNotification", "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;", "showGoalsAchievedMessage", "showOTAFailedNotification", "showOTAProgressNotification", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "showOTASuccessNotification", "showWatchConnectedMessage", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface NotificationManager {
    void dismissBatteryNotification(android.content.Context context);

    void dismissNotification(android.content.Context context, int notificationID);

    void showBatteryNotification(java.lang.String deviceID, android.content.Context context, java.lang.String title, java.lang.String message);

    void showConnectionNotification(android.content.Context context, java.lang.String title, powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification realtimeDataNotification);

    void showGoalsAchievedMessage(java.lang.String deviceID, android.content.Context context, java.lang.String title, java.lang.String message);

    void showOTAFailedNotification(android.content.Context context);

    void showOTAProgressNotification(android.content.Context context, int progress);

    void showOTASuccessNotification(android.content.Context context);

    void showWatchConnectedMessage(java.lang.String deviceID, android.content.Context context, java.lang.String title, java.lang.String message);

    /* JADX INFO: compiled from: NotificationManager.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void showConnectionNotification$default(powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager, android.content.Context context, java.lang.String str, powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification uIRealtimeDataNotification, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showConnectionNotification");
            }
            if ((i & 4) != 0) {
                uIRealtimeDataNotification = null;
            }
            notificationManager.showConnectionNotification(context, str, uIRealtimeDataNotification);
        }
    }
}
