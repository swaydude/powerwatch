package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed;

/* JADX INFO: compiled from: DefaultAlertDismissed.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/DefaultAlertDismissed;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAppContext", "()Landroid/content/Context;", "resolveAlert", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "statusBarNotification", "Landroid/service/notification/StatusBarNotification;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class DefaultAlertDismissed implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived {
    private final android.content.Context appContext;

    public DefaultAlertDismissed(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    protected final android.content.Context getAppContext() {
        return this.appContext;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
    public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
        if (kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true)) {
            return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.DISMISSED, this.appContext);
        }
        return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.DISMISSED, this.appContext);
    }
}
