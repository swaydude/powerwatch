package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: UpdateInfoDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0004H'J\b\u0010\n\u001a\u00020\u0004H'J\b\u0010\u000b\u001a\u00020\bH\u0007J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH'¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;", "", "()V", "add", "", "item", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;", "addCompletable", "Lio/reactivex/Completable;", "delete", "deleteAll", "deleteCompletable", "get", "Lio/reactivex/Maybe;", "observeUpdateInfo", "Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class UpdateInfoDao {
    public abstract void add(powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo item);

    public abstract void delete();

    public abstract void deleteAll();

    public abstract io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> get();

    public abstract io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> observeUpdateInfo();

    public final io.reactivex.Completable addCompletable(final powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$UpdateInfoDao$XTYwcrFsufTBhpFakoQVbK-WqsA
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao.m3115addCompletable$lambda0(this.f$0, item);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            add(item)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addCompletable$lambda-0, reason: not valid java name */
    public static final void m3115addCompletable$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$item");
        this$0.add(item);
    }

    public final io.reactivex.Completable deleteCompletable() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$UpdateInfoDao$U4zmhhBcvzqst5fw_mVkAWlfyR0
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao.m3116deleteCompletable$lambda1(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            delete()\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: deleteCompletable$lambda-1, reason: not valid java name */
    public static final void m3116deleteCompletable$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.db.UpdateInfoDao this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.delete();
    }
}
