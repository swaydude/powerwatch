package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: RoomDB.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;", "Landroidx/room/RoomDatabase;", "()V", "defaultPhoneWatchDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;", "deviceDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;", "goalConfigurationDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;", "restingHourPeriodDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;", "restingLogDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;", "sleepHourPeriodDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;", "sleepLogDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;", "tokenStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;", "updateInfoDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;", "userActivitySessionDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;", "userDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;", "walkingHourPeriodDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;", "walkingLogDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class RoomDB extends androidx.room.RoomDatabase {
    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao defaultPhoneWatchDao();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao deviceDao();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao goalConfigurationDao();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.RestingHourPeriodDao restingHourPeriodDao();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao restingLogDao();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao sleepHourPeriodDao();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao sleepLogDao();

    public abstract powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage tokenStorage();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao updateInfoDao();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao userActivitySessionDao();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao userDao();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao walkingHourPeriodDao();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao walkingLogDao();
}
