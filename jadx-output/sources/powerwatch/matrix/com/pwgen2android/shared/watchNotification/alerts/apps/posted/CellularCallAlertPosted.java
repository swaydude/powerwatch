package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.posted;

/* JADX INFO: compiled from: CellularCallAlertPosted.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/apps/posted/CellularCallAlertPosted;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;", "isCallNotificationShown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "appContext", "Landroid/content/Context;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V", "getAppContext", "()Landroid/content/Context;", "atomicCallReference", "Ljava/util/concurrent/atomic/AtomicReference;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;", "getAtomicCallReference", "()Ljava/util/concurrent/atomic/AtomicReference;", "setAtomicCallReference", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "atomicSamsungIssueCategory", "", "getAtomicSamsungIssueCategory", "setAtomicSamsungIssueCategory", "resolveAlert", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "statusBarNotification", "Landroid/service/notification/StatusBarNotification;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CellularCallAlertPosted implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived {
    private final android.content.Context appContext;
    private java.util.concurrent.atomic.AtomicReference<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> atomicCallReference;
    private java.util.concurrent.atomic.AtomicReference<java.lang.String> atomicSamsungIssueCategory;
    private final java.util.concurrent.atomic.AtomicBoolean isCallNotificationShown;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;

    public CellularCallAlertPosted(java.util.concurrent.atomic.AtomicBoolean isCallNotificationShown, android.content.Context appContext, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isCallNotificationShown, "isCallNotificationShown");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        this.isCallNotificationShown = isCallNotificationShown;
        this.appContext = appContext;
        this.rxBus = rxBus;
        this.atomicCallReference = new java.util.concurrent.atomic.AtomicReference<>();
        this.atomicSamsungIssueCategory = new java.util.concurrent.atomic.AtomicReference<>("");
    }

    protected final android.content.Context getAppContext() {
        return this.appContext;
    }

    public final java.util.concurrent.atomic.AtomicReference<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> getAtomicCallReference() {
        return this.atomicCallReference;
    }

    public final void setAtomicCallReference(java.util.concurrent.atomic.AtomicReference<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> atomicReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "<set-?>");
        this.atomicCallReference = atomicReference;
    }

    public final java.util.concurrent.atomic.AtomicReference<java.lang.String> getAtomicSamsungIssueCategory() {
        return this.atomicSamsungIssueCategory;
    }

    public final void setAtomicSamsungIssueCategory(java.util.concurrent.atomic.AtomicReference<java.lang.String> atomicReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "<set-?>");
        this.atomicSamsungIssueCategory = atomicReference;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
    public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
        android.app.Notification notification = statusBarNotification.getNotification();
        kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), notification.category, true);
        if (kotlin.text.StringsKt.equals("MissedCallGroup", notification.getGroup(), true) || kotlin.text.StringsKt.equals("MissedCallNotifier", statusBarNotification.getTag(), true) || kotlin.text.StringsKt.equals("MissedCallNotification", statusBarNotification.getTag(), true)) {
            return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.MISSED, this.appContext);
        }
        return null;
    }
}
