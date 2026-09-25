package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlarmsManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsManager;", "", androidx.core.app.NotificationCompat.CATEGORY_ALARM, "Lio/reactivex/Single;", "getAlarm", "()Lio/reactivex/Single;", "addDeviceAlarm", "Lio/reactivex/Completable;", "repeatDays", "", "", "time", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AlarmsManager {
    io.reactivex.Completable addDeviceAlarm(java.util.List<java.lang.Integer> repeatDays, java.lang.String time);

    io.reactivex.Single<java.lang.Object> getAlarm();
}
