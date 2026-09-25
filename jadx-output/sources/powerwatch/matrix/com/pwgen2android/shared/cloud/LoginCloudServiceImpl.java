package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: Cloud.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;", "authService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;", "authConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;", "tokenProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;", "hostInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;", "userAccountCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;", "pushMessagingTokenProvider", "Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;", "userDao", "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;)V", "isLoggedIn", "", com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN, "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "email", "", "password", "logout", "Lio/reactivex/Completable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class LoginCloudServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService authService;
    private final powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider;
    private final powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider pushMessagingTokenProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider tokenProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService userAccountCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao userDao;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    public static final void m3015_init_$lambda2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final void m3016_init_$lambda3(java.lang.Throwable th) {
    }

    public LoginCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService authService, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider tokenProvider, powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider, powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountCloudService userAccountCloudService, powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider pushMessagingTokenProvider, powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao userDao) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authService, "authService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "authConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostInfoProvider, "hostInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountCloudService, "userAccountCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushMessagingTokenProvider, "pushMessagingTokenProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userDao, "userDao");
        this.authService = authService;
        this.authConfig = authConfig;
        this.tokenProvider = tokenProvider;
        this.hostInfoProvider = hostInfoProvider;
        this.userAccountCloudService = userAccountCloudService;
        this.pushMessagingTokenProvider = pushMessagingTokenProvider;
        this.userDao = userDao;
        pushMessagingTokenProvider.getToken().firstOrError().flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$LoginCloudServiceImpl$OTpuumO07VQKCUr75nI-d8ITxAg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudServiceImpl.m3014_init_$lambda1(this.f$0, (java.lang.String) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$LoginCloudServiceImpl$WOb1yhbIX0IndwgQ5cAT34_9lzE
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudServiceImpl.m3015_init_$lambda2();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$LoginCloudServiceImpl$2L5_pnWixbBMzzVu0lJr5qX3pe8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudServiceImpl.m3016_init_$lambda3((java.lang.Throwable) obj);
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService
    public boolean isLoggedIn() {
        return this.tokenProvider.hasToken() && this.userDao.user() != null;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> login(java.lang.String email, java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService authService = this.authService;
        powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config oAuth2Config = this.authConfig;
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> singleAndThen = authService.authorize(oAuth2Config.copy((kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 1) != 0 ? oAuth2Config.authEndpoint : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 2) != 0 ? oAuth2Config.grantType : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 4) != 0 ? oAuth2Config.scope : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 8) != 0 ? oAuth2Config.clientID : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 16) != 0 ? oAuth2Config.clientSecret : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 32) != 0 ? oAuth2Config.basicAuthorizationTokenType : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 64) != 0 ? oAuth2Config.encodedBasicToken : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 128) != 0 ? oAuth2Config.email : email, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 256) != 0 ? oAuth2Config.password : password), powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider.DefaultImpls.hostInfo$default(this.hostInfoProvider, false, 1, null)).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$LoginCloudServiceImpl$1LanDXDO6a7fUvvd5NxwBwtYzSI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudServiceImpl.m3018login$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) obj);
            }
        }).andThen(this.userAccountCloudService.getUser());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleAndThen, "authService.authorize(authConfig.copy(email = email, password = password), hostInfoProvider.hostInfo())\n                .flatMapCompletable {\n                    tokenProvider.add(it)\n                }\n//                .andThen(pushMessagingTokenProvider.token.firstOrError())\n//                .flatMapCompletable { userAccountCloudService.addPushNotificationsToken(it) }\n                .andThen(userAccountCloudService.getUser())");
        return singleAndThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: login$lambda-0, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3018login$lambda0(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudServiceImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.tokenProvider.add(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService
    public io.reactivex.Completable logout() {
        return this.tokenProvider.deleteToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3014_init_$lambda1(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudServiceImpl this$0, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userAccountCloudService.addPushNotificationsToken(it);
    }
}
