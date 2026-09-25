package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: GoalsDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H'J\u0016\u0010\b\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000bH'J\b\u0010\f\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rH'J\b\u0010\u0010\u001a\u00020\u0004H'J\b\u0010\u0011\u001a\u00020\tH\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0007J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\u000f\u001a\u00020\rH'J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H'¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;", "", "()V", "add", "", "item", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "addCompletable", "Lio/reactivex/Completable;", "all", "Lio/reactivex/Single;", "count", "", "delete", "id", "deleteAll", "deleteAllCompletable", "deleteCompletable", "get", "Lio/reactivex/Maybe;", "lastByCreated", "Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class GoalConfigurationDao {
    public abstract void add(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> item);

    public abstract void add(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration item);

    public abstract io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>> all();

    public abstract long count();

    public abstract void delete(long id);

    public abstract void deleteAll();

    public abstract io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> get(long id);

    public abstract io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> lastByCreated();

    public final io.reactivex.Completable addCompletable(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$GoalConfigurationDao$A1P4mH_NAWJbJjC9BYwc29nPcqw
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao.m3111addCompletable$lambda0(this.f$0, item);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            add(item)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addCompletable$lambda-0, reason: not valid java name */
    public static final void m3111addCompletable$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao this$0, java.util.List item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$item");
        this$0.add((java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>) item);
    }

    public final io.reactivex.Completable deleteCompletable(final long id) {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$GoalConfigurationDao$S_wLsJy1WiaCY1UrlApEAUZ8IiQ
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao.m3113deleteCompletable$lambda1(this.f$0, id);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            delete(id)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: deleteCompletable$lambda-1, reason: not valid java name */
    public static final void m3113deleteCompletable$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao this$0, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.delete(j);
    }

    public final io.reactivex.Completable deleteAllCompletable() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$GoalConfigurationDao$2TTbmrPSc97xKN5pm5HUq-YdEKw
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao.m3112deleteAllCompletable$lambda2(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            deleteAll()\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: deleteAllCompletable$lambda-2, reason: not valid java name */
    public static final void m3112deleteAllCompletable$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deleteAll();
    }
}
