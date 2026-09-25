package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.posted;

/* JADX INFO: compiled from: ViberPostedAlert.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/ViberPostedAlert;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/DefaultAlertPosted;", "isCallNotificationShown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "appContext", "Landroid/content/Context;", "(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;)V", "resolveAlert", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "statusBarNotification", "Landroid/service/notification/StatusBarNotification;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ViberPostedAlert extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.posted.DefaultAlertPosted {
    private final java.util.concurrent.atomic.AtomicBoolean isCallNotificationShown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViberPostedAlert(java.util.concurrent.atomic.AtomicBoolean isCallNotificationShown, android.content.Context appContext) {
        super(appContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isCallNotificationShown, "isCallNotificationShown");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.isCallNotificationShown = isCallNotificationShown;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.posted.DefaultAlertPosted, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
    public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
        if (!this.isCallNotificationShown.get() && kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category)) {
            this.isCallNotificationShown.set(true);
            return super.resolveAlert(statusBarNotification);
        }
        if (statusBarNotification.getNotification().category != null) {
            return super.resolveAlert(statusBarNotification);
        }
        return null;
    }
}
