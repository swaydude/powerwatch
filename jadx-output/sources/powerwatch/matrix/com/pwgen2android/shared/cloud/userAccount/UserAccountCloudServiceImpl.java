package powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount;

/* JADX INFO: compiled from: UserAccountCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;", "userAccountService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;", "cloudConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;", "userDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;)V", "addPushNotificationsToken", "Lio/reactivex/CompletableSource;", "token", "", "addUser", "Lio/reactivex/Completable;", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "forgotUserPassword", "email", "getUser", "Lio/reactivex/Single;", "resendVerifyEmail", "resetUserPassword", "oldPassword", "newPassword", "updateUser", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserAccountCloudServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService userAccountService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao userDao;

    public UserAccountCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService userAccountService, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig, powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao userDao) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountService, "userAccountService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudConfig, "cloudConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userDao, "userDao");
        this.userAccountService = userAccountService;
        this.cloudConfig = cloudConfig;
        this.userDao = userDao;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.CompletableSource addPushNotificationsToken(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        return this.userAccountService.addFirebaseToken(token);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Completable resendVerifyEmail(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return this.userAccountService.resendVerifyEmail(email);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Completable resetUserPassword(java.lang.String oldPassword, java.lang.String newPassword) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldPassword, "oldPassword");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newPassword, "newPassword");
        return this.userAccountService.resetPassword(new powerwatch.matrix.com.pwgen2android.shared.data.models.ResetPassword(oldPassword, newPassword));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Completable updateUser(powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
        return this.userAccountService.update(user);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> getUser() {
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> singleFlatMap = powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService.DefaultImpls.get$default(this.userAccountService, null, 1, null).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.-$$Lambda$UserAccountCloudServiceImpl$26RGRE1SYyALMRtOMLg5BxugInw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudServiceImpl.m3100getUser$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "userAccountService.get()\n                .flatMap {\n                    userDao.addUserCompletable(it)\n                            .toSingleDefault(it)\n                }");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getUser$lambda-0, reason: not valid java name */
    public static final io.reactivex.SingleSource m3100getUser$lambda0(powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudServiceImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userDao.addUserCompletable(it).toSingleDefault(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Completable forgotUserPassword(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return this.userAccountService.forgotPassword(email);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService
    public io.reactivex.Completable addUser(powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
        return this.userAccountService.add(user, kotlin.collections.MapsKt.mapOf(new kotlin.Pair(io.fabric.sdk.android.services.network.HttpRequest.HEADER_AUTHORIZATION, kotlin.jvm.internal.Intrinsics.stringPlus("Basic ", this.cloudConfig.getAuthConfig().getEncodedBasicToken()))));
    }
}
