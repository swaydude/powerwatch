package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed;

/* JADX INFO: compiled from: CellularCallAlertDismissed.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/CellularCallAlertDismissed;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/dismissed/DefaultAlertDismissed;", "isCallNotificationShown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "appContext", "Landroid/content/Context;", "(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;)V", "resolveAlert", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "statusBarNotification", "Landroid/service/notification/StatusBarNotification;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CellularCallAlertDismissed extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed.DefaultAlertDismissed {
    private final java.util.concurrent.atomic.AtomicBoolean isCallNotificationShown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellularCallAlertDismissed(java.util.concurrent.atomic.AtomicBoolean isCallNotificationShown, android.content.Context appContext) {
        super(appContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isCallNotificationShown, "isCallNotificationShown");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.isCallNotificationShown = isCallNotificationShown;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed.DefaultAlertDismissed, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
    public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
        this.isCallNotificationShown.set(false);
        if (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed.CellularCallAlertDismissedKt.getBlockSendingMissedCall()) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed.CellularCallAlertDismissedKt.setBlockSendingMissedCall(!powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed.CellularCallAlertDismissedKt.getBlockSendingMissedCall());
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT < 26 || !kotlin.jvm.internal.Intrinsics.areEqual("phone_ongoing_call", statusBarNotification.getNotification().getChannelId())) {
            return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.DISMISSED, getAppContext());
        }
        return null;
    }
}
