package powerwatch.matrix.com.pwgen2android.shared;

/* JADX INFO: compiled from: RxBus.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/NotificationEvent;", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;)V", "getEvent", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationEvent {
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent event;

    public NotificationEvent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        this.event = event;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent getEvent() {
        return this.event;
    }
}
