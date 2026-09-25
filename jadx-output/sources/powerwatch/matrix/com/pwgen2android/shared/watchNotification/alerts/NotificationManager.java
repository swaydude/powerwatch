package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: NotificationManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationManager;", "", "dismissNotification", "", "context", "Landroid/content/Context;", "notificationID", "", "showConnectionNotification", "showOTAFailedNotification", "showOTAProgressNotification", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "showOTASuccessNotification", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface NotificationManager {
    public static final int CONNECT_NOTIFICATION_ID = 654;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationManager.Companion INSTANCE = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationManager.Companion.$$INSTANCE;
    public static final int OTA_NOTIFICATION_ID = 655;

    void dismissNotification(android.content.Context context, int notificationID);

    void showConnectionNotification(android.content.Context context);

    void showOTAFailedNotification(android.content.Context context);

    void showOTAProgressNotification(android.content.Context context, int progress);

    void showOTASuccessNotification(android.content.Context context);

    /* JADX INFO: compiled from: NotificationManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationManager$Companion;", "", "()V", "CONNECT_NOTIFICATION_ID", "", "OTA_NOTIFICATION_ID", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationManager.Companion $$INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationManager.Companion();
        public static final int CONNECT_NOTIFICATION_ID = 654;
        public static final int OTA_NOTIFICATION_ID = 655;

        private Companion() {
        }
    }
}
