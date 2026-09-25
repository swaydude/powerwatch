package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH&¢\u0006\u0002\u0010\fJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\n\"\u00020\u0010H&¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003H&J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH&¢\u0006\u0002\u0010\fJ'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\n\"\u00020\u0010H&¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;", "", "getActivityGoalsNotification", "Lio/reactivex/Observable;", "", "getAlarmsNotification", "getCallsNotification", "getCurrentCallNotifications", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;", "callState", "", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;", "([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;", "getCurrentMessagesNotifications", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;", "smsState", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;", "([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;", "getMessagesNotification", "getNotificationsEnabledGlobally", "getNumOfMissedCalls", "", "getNumOfUnreadSMS", "getRealtimeCallEvents", "getSMSRealtimeEvent", "invalidateNotifications", "", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AlertsManager {
    io.reactivex.Observable<java.lang.Boolean> getActivityGoalsNotification();

    io.reactivex.Observable<java.lang.Boolean> getAlarmsNotification();

    io.reactivex.Observable<java.lang.Boolean> getCallsNotification();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> getCurrentCallNotifications(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState... callState);

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> getCurrentMessagesNotifications(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState... smsState);

    io.reactivex.Observable<java.lang.Boolean> getMessagesNotification();

    io.reactivex.Observable<java.lang.Boolean> getNotificationsEnabledGlobally();

    io.reactivex.Observable<java.lang.Integer> getNumOfMissedCalls();

    io.reactivex.Observable<java.lang.Integer> getNumOfUnreadSMS();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> getRealtimeCallEvents(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState... callState);

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> getSMSRealtimeEvent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState... smsState);

    void invalidateNotifications(android.content.Context context);
}
