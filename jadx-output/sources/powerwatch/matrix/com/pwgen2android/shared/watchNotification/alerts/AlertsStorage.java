package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsStorage.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J0\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;", "areAlarmsEnabled", "", "getAreAlarmsEnabled", "()Z", "areCallsEnabled", "getAreCallsEnabled", "areGoalsEnabled", "getAreGoalsEnabled", "areMessagesEnabled", "getAreMessagesEnabled", "setActivityGoalsNotificationEnabled", "Lio/reactivex/Completable;", "isEnabled", "context", "Landroid/content/Context;", "setAlarmsNotificationEnabled", "setCallsNotificationEnabled", "setMessagesNotificationEnabled", "setNotificationTypesEnabled", "calls", "messages", "alarms", "activityGoals", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AlertsStorage extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage {
    boolean getAreAlarmsEnabled();

    boolean getAreCallsEnabled();

    boolean getAreGoalsEnabled();

    boolean getAreMessagesEnabled();

    io.reactivex.Completable setActivityGoalsNotificationEnabled(boolean isEnabled, android.content.Context context);

    io.reactivex.Completable setAlarmsNotificationEnabled(boolean isEnabled, android.content.Context context);

    io.reactivex.Completable setCallsNotificationEnabled(boolean isEnabled, android.content.Context context);

    io.reactivex.Completable setMessagesNotificationEnabled(boolean isEnabled, android.content.Context context);

    io.reactivex.Completable setNotificationTypesEnabled(boolean calls, boolean messages, boolean alarms, boolean activityGoals, android.content.Context context);
}
