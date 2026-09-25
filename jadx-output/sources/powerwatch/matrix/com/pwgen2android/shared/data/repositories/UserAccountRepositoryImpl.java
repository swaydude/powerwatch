package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: UserAccountRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "userDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;", "userAccountCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;", "tokenProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V", "delete", "Lio/reactivex/Completable;", "item", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "forgotPassword", "email", "", "getFirst", "Lio/reactivex/Single;", "fromCache", "", "forceCache", "load", "Lio/reactivex/Observable;", "resendEmail", "resetPassword", "oldPassword", "newPassword", "save", "toCacheOnly", "update", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserAccountRepositoryImpl implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider tokenProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService userAccountCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao userDao;

    public UserAccountRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao userDao, powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService userAccountCloudService, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider tokenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userDao, "userDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountCloudService, "userAccountCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        this.userDao = userDao;
        this.userAccountCloudService = userAccountCloudService;
        this.tokenProvider = tokenProvider;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository
    public io.reactivex.Completable resendEmail(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return this.userAccountCloudService.resendVerifyEmail(email);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository
    public io.reactivex.Completable forgotPassword(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return this.userAccountCloudService.forgotUserPassword(email);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository
    public io.reactivex.Completable resetPassword(java.lang.String oldPassword, java.lang.String newPassword) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldPassword, "oldPassword");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        io.reactivex.Completable completableAndThen = this.userAccountCloudService.resetUserPassword(oldPassword, newPassword).andThen(this.tokenProvider.updatePassword(newPassword));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "userAccountCloudService.resetUserPassword(oldPassword, newPassword)\n                .andThen(tokenProvider.updatePassword(newPassword))");
        return completableAndThen;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeleteRepository
    public io.reactivex.Completable delete(powerwatch.matrix.com.pwgen2android.shared.data.models.User item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserAccountRepositoryImpl$npLwLiGLGT52yPvaBFqqi7eQZzM
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepositoryImpl.m3212delete$lambda0(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            userDao.delete()\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: delete$lambda-0, reason: not valid java name */
    public static final void m3212delete$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepositoryImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.userDao.delete();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateRepository
    public io.reactivex.Completable update(final powerwatch.matrix.com.pwgen2android.shared.data.models.User item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        io.reactivex.Completable completableOnErrorResumeNext = this.userAccountCloudService.updateUser(item).andThen(this.userDao.addUserCompletable(item)).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserAccountRepositoryImpl$e0M7Ma7La22OKRLmr_hFAr54c9g
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepositoryImpl.m3214update$lambda1(this.f$0, item, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "userAccountCloudService.updateUser(item)\n                .andThen(userDao.addUserCompletable(item))\n                .onErrorResumeNext { userDao.addUserCompletable(item.copy(shouldSync = true)) }");
        return completableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: update$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3214update$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User item, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userDao.addUserCompletable(item.copy((1023 & 1) != 0 ? item.uid : 0L, (1023 & 2) != 0 ? item.enabled : false, (1023 & 4) != 0 ? item.name : null, (1023 & 8) != 0 ? item.email : null, (1023 & 16) != 0 ? item.password : null, (1023 & 32) != 0 ? item.age : 0, (1023 & 64) != 0 ? item.height : 0, (1023 & 128) != 0 ? item.weight : 0.0f, (1023 & 256) != 0 ? item.gender : null, (1023 & 512) != 0 ? item.shouldSync : true, (1023 & 1024) != 0 ? item.accountSettings : null));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddRepository
    public io.reactivex.Completable save(powerwatch.matrix.com.pwgen2android.shared.data.models.User item, boolean toCacheOnly) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        io.reactivex.Completable completableAndThen = this.userAccountCloudService.addUser(item).andThen(this.userDao.addUserCompletable(item));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "userAccountCloudService.addUser(item)\n                .andThen(userDao.addUserCompletable(item))");
        return completableAndThen;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> getFirst(boolean fromCache, boolean forceCache) {
        if (!fromCache) {
            io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> singleOnErrorResumeNext = this.userAccountCloudService.getUser().onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.-$$Lambda$UserAccountRepositoryImpl$pQL01qHAqT97CaMUzPkyT8mS6dg
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepositoryImpl.m3213getFirst$lambda2(this.f$0, (java.lang.Throwable) obj);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleOnErrorResumeNext, "{\n            userAccountCloudService.getUser()\n                    .onErrorResumeNext { userDao.getUser().toSingle() }\n        }");
            return singleOnErrorResumeNext;
        }
        if (forceCache) {
            io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> singleSwitchIfEmpty = this.userDao.getUser().switchIfEmpty(io.reactivex.Single.error(new java.lang.Throwable("User doesn't exist")));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleSwitchIfEmpty, "{\n            userDao.getUser()\n                    .switchIfEmpty(Single.error(Throwable(\"User doesn't exist\")))\n        }");
            return singleSwitchIfEmpty;
        }
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> singleSwitchIfEmpty2 = this.userDao.getUser().switchIfEmpty(this.userAccountCloudService.getUser());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleSwitchIfEmpty2, "{\n            userDao.getUser()\n                    .switchIfEmpty(userAccountCloudService.getUser())\n        }");
        return singleSwitchIfEmpty2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getFirst$lambda-2, reason: not valid java name */
    public static final io.reactivex.SingleSource m3213getFirst$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepositoryImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userDao.getUser().toSingle();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.User> load(boolean fromCache, boolean forceCache) {
        if (!fromCache) {
            io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.User> observableOnErrorResumeNext = this.userAccountCloudService.getUser().toObservable().onErrorResumeNext(this.userDao.observeUser());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "{\n            userAccountCloudService.getUser()\n                    .toObservable()\n                    .onErrorResumeNext(userDao.observeUser())\n        }");
            return observableOnErrorResumeNext;
        }
        if (forceCache) {
            io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.User> observableSwitchIfEmpty = this.userDao.observeUser().switchIfEmpty(io.reactivex.Observable.error(new java.lang.Throwable("User doesn't exist")));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableSwitchIfEmpty, "{\n            userDao.observeUser()\n                    .switchIfEmpty(Observable.error(Throwable(\"User doesn't exist\")))\n        }");
            return observableSwitchIfEmpty;
        }
        return this.userDao.observeUser();
    }
}
