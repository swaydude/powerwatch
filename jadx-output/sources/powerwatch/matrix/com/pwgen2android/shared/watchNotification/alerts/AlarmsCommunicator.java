package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlarmsCommunicator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;", "", "disableAlarm", "Lio/reactivex/Completable;", "deviceId", "", "enableAlarm", androidx.core.app.NotificationCompat.CATEGORY_ALARM, "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AlarmsCommunicator {
    io.reactivex.Completable disableAlarm(java.lang.String deviceId);

    io.reactivex.Completable enableAlarm(java.lang.String deviceId, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm alarm);
}
