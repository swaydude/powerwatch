package powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods;

/* JADX INFO: compiled from: WalkingHourPeriodDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\u0016\u0010\f\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007J\b\u0010\r\u001a\u00020\u0004H'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u000f\u001a\u00020\u0010H'J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H'J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0006H'¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;", "", "()V", "addWalkingHourPeriod", "", "period", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;", "addWalkingHourPeriodCompletable", "Lio/reactivex/Completable;", "addWalkingHourPeriods", "periods", "", "addWalkingHourPeriodsCompletable", "deleteAll", "deleteWalkingHourPeriod", "id", "", "deleteWalkingHourPeriodCompletable", "getWalkingHourPeriod", "Lio/reactivex/Maybe;", "getWalkingHourPeriods", "Lio/reactivex/Single;", "startTime", "endTime", "lastWalkingHour", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class WalkingHourPeriodDao {
    public abstract void addWalkingHourPeriod(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod period);

    public abstract void addWalkingHourPeriods(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> periods);

    public abstract void deleteAll();

    public abstract void deleteWalkingHourPeriod(long id);

    public abstract io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> getWalkingHourPeriod(long id);

    public abstract io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod>> getWalkingHourPeriods(long startTime, long endTime);

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod lastWalkingHour();

    public final io.reactivex.Completable addWalkingHourPeriodCompletable(final powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod period) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(period, "period");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.-$$Lambda$WalkingHourPeriodDao$Mv7Nbdha69AvdNi1oglQHcefhnA
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao.m3134addWalkingHourPeriodCompletable$lambda0(this.f$0, period);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            addWalkingHourPeriod(period)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addWalkingHourPeriodCompletable$lambda-0, reason: not valid java name */
    public static final void m3134addWalkingHourPeriodCompletable$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod period) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(period, "$period");
        this$0.addWalkingHourPeriod(period);
    }

    public final io.reactivex.Completable addWalkingHourPeriodsCompletable(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> periods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.-$$Lambda$WalkingHourPeriodDao$NVvR-DKjJ4sWm-5p4gIUXpHi2ac
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao.m3135addWalkingHourPeriodsCompletable$lambda1(this.f$0, periods);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            addWalkingHourPeriods(periods)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addWalkingHourPeriodsCompletable$lambda-1, reason: not valid java name */
    public static final void m3135addWalkingHourPeriodsCompletable$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao this$0, java.util.List periods) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "$periods");
        this$0.addWalkingHourPeriods(periods);
    }

    public final io.reactivex.Completable deleteWalkingHourPeriodCompletable(final long id) {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.-$$Lambda$WalkingHourPeriodDao$sUmLZ4mmHBr3IICbTM2uaMatZqQ
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao.m3136deleteWalkingHourPeriodCompletable$lambda2(this.f$0, id);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            deleteWalkingHourPeriod(id)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: deleteWalkingHourPeriodCompletable$lambda-2, reason: not valid java name */
    public static final void m3136deleteWalkingHourPeriodCompletable$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao this$0, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deleteWalkingHourPeriod(j);
    }
}
