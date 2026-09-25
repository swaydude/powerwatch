package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: UserDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0004H'J\b\u0010\n\u001a\u00020\u0004H'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH'J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;", "", "()V", "addUser", "", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "addUserCompletable", "Lio/reactivex/Completable;", "delete", "deleteAll", "getUser", "Lio/reactivex/Maybe;", "observeUser", "Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class UserDao {
    public abstract void addUser(powerwatch.matrix.com.pwgen2android.shared.data.models.User user);

    public abstract void delete();

    public abstract void deleteAll();

    public abstract io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.User> getUser();

    public abstract io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.User> observeUser();

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.models.User user();

    public final io.reactivex.Completable addUserCompletable(final powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$UserDao$AI86tPcR4JxnnIlDXSx15LNhDQ0
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao.m3118addUserCompletable$lambda0(this.f$0, user);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            addUser(user)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addUserCompletable$lambda-0, reason: not valid java name */
    public static final void m3118addUserCompletable$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "$user");
        this$0.addUser(user);
    }
}
