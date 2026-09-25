package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlarmsManagerImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsManagerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsManager;", androidx.core.app.NotificationCompat.CATEGORY_ALARM, "Lio/reactivex/Single;", "", "(Lio/reactivex/Single;)V", "getAlarm", "()Lio/reactivex/Single;", "addDeviceAlarm", "Lio/reactivex/Completable;", "repeatDays", "", "", "time", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlarmsManagerImpl implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlarmsManager {
    private final io.reactivex.Single<java.lang.Object> alarm;

    public AlarmsManagerImpl(io.reactivex.Single<java.lang.Object> alarm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarm, "alarm");
        this.alarm = alarm;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlarmsManager
    public io.reactivex.Single<java.lang.Object> getAlarm() {
        return this.alarm;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlarmsManager
    public io.reactivex.Completable addDeviceAlarm(java.util.List<java.lang.Integer> repeatDays, java.lang.String time) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repeatDays, "repeatDays");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "time");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }
}
