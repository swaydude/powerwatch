package powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs;

/* JADX INFO: compiled from: RestingLogDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH'J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0007J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0004H'J\b\u0010\r\u001a\u00020\u000eH'J\u0016\u0010\u000f\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH'J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0007¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;", "", "()V", "all", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;", "delete", "", "restingLogs", "", "deleteCompletable", "Lio/reactivex/Completable;", "notSyncedLogs", "notSyncedLogsCount", "", "save", "saveCompletable", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class RestingLogDao {
    public abstract io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> all();

    public abstract void delete(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> restingLogs);

    public abstract io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog>> notSyncedLogs();

    public abstract long notSyncedLogsCount();

    public abstract void save(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> restingLogs);

    public final io.reactivex.Completable saveCompletable(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> restingLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogs, "restingLogs");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.-$$Lambda$RestingLogDao$VhRYa4d1UzZFXxsCLnbITSnYojg
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao.m3120saveCompletable$lambda0(this.f$0, restingLogs);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        save(restingLogs)\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveCompletable$lambda-0, reason: not valid java name */
    public static final void m3120saveCompletable$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao this$0, java.util.List restingLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogs, "$restingLogs");
        this$0.save(restingLogs);
    }

    public final io.reactivex.Completable deleteCompletable(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> restingLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogs, "restingLogs");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.-$$Lambda$RestingLogDao$N725dv99n3mED5fub1wxo8AxI8M
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao.m3119deleteCompletable$lambda1(this.f$0, restingLogs);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        delete(restingLogs)\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: deleteCompletable$lambda-1, reason: not valid java name */
    public static final void m3119deleteCompletable$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao this$0, java.util.List restingLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogs, "$restingLogs");
        this$0.delete(restingLogs);
    }
}
