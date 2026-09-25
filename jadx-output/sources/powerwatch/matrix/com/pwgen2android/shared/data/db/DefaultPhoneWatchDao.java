package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: DefaultPhoneWatchDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\u0006H'¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;", "", "()V", "add", "", "item", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;", "addCompletable", "Lio/reactivex/Completable;", "getFirst", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class DefaultPhoneWatchDao {
    public abstract void add(powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch item);

    public abstract powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch getFirst();

    public final io.reactivex.Completable addCompletable(final powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.-$$Lambda$DefaultPhoneWatchDao$f4oCoC1C70fcqO-r8nW_G-SCHJ4
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao.m3107addCompletable$lambda0(this.f$0, item);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n        add(item)\n    }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: addCompletable$lambda-0, reason: not valid java name */
    public static final void m3107addCompletable$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$item");
        this$0.add(item);
    }
}
