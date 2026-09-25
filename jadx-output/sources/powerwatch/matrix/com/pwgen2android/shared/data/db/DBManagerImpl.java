package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: DBManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;", "roomDB", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;)V", "clearAllData", "", "clearAllDataCompletable", "Lio/reactivex/Completable;", "clearBackgroundAndActivityLogs", "clearBackgroundAndActivityLogsCompletable", "clearDevices", "clearDevicesCompletable", "clearGoalConfigurations", "clearGoalConfigurationsCompletable", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DBManagerImpl implements powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager {
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB roomDB;

    public DBManagerImpl(powerwatch.matrix.com.pwgen2android.shared.data.db.RoomDB roomDB) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDB, "roomDB");
        this.roomDB = roomDB;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager
    public void clearBackgroundAndActivityLogs() {
        this.roomDB.walkingHourPeriodDao().deleteAll();
        this.roomDB.restingHourPeriodDao().deleteAll();
        this.roomDB.sleepHourPeriodDao().deleteAll();
        this.roomDB.userActivitySessionDao().deleteAll();
        this.roomDB.userActivitySessionDao().deleteAllActivityDates();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager
    public void clearGoalConfigurations() {
        this.roomDB.goalConfigurationDao().deleteAll();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager
    public void clearDevices() {
        this.roomDB.deviceDao().deleteAll();
        this.roomDB.updateInfoDao().deleteAll();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager
    public void clearAllData() {
        this.roomDB.clearAllTables();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager
    public io.reactivex.Completable clearBackgroundAndActivityLogsCompletable() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$DBManagerImpl$ewzN08DnBk1fQEowplsL5u92vBI
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBManagerImpl.m3102clearBackgroundAndActivityLogsCompletable$lambda0(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        clearBackgroundAndActivityLogs()\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: clearBackgroundAndActivityLogsCompletable$lambda-0, reason: not valid java name */
    public static final void m3102clearBackgroundAndActivityLogsCompletable$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.db.DBManagerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clearBackgroundAndActivityLogs();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager
    public io.reactivex.Completable clearGoalConfigurationsCompletable() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$DBManagerImpl$SbVXz28VpAcOKbZpiwV4yislEHw
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBManagerImpl.m3104clearGoalConfigurationsCompletable$lambda1(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        clearGoalConfigurations()\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: clearGoalConfigurationsCompletable$lambda-1, reason: not valid java name */
    public static final void m3104clearGoalConfigurationsCompletable$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.db.DBManagerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clearGoalConfigurations();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager
    public io.reactivex.Completable clearDevicesCompletable() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$DBManagerImpl$63ZjLdETDQn0a-11GZ7WMfOvNpo
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBManagerImpl.m3103clearDevicesCompletable$lambda2(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        clearDevices()\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: clearDevicesCompletable$lambda-2, reason: not valid java name */
    public static final void m3103clearDevicesCompletable$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.db.DBManagerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clearDevices();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DBManager
    public io.reactivex.Completable clearAllDataCompletable() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$DBManagerImpl$ivQHAtJq-rezm5fUHYH9JV5V3ys
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.DBManagerImpl.m3101clearAllDataCompletable$lambda3(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        roomDB.clearAllTables()\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: clearAllDataCompletable$lambda-3, reason: not valid java name */
    public static final void m3101clearAllDataCompletable$lambda3(powerwatch.matrix.com.pwgen2android.shared.data.db.DBManagerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.roomDB.clearAllTables();
    }
}
