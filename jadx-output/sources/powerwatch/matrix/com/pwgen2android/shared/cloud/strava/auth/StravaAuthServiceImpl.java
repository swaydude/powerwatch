package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth;

/* JADX INFO: compiled from: StravaAuthServiceImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;)V", "authorize", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;", "config", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;", "host", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;", "logout", "Lio/reactivex/Completable;", "stravaHost", "refresh", "refreshToken", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StravaAuthServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient;

    public StravaAuthServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.httpClient = httpClient;
        io.reactivex.Observable<java.util.Map<java.lang.String, java.lang.String>> observableJust = io.reactivex.Observable.just(kotlin.collections.MapsKt.emptyMap());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(emptyMap())");
        httpClient.setHeadersProvider(observableJust, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthServiceImpl.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }
        });
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> refresh(java.lang.String refreshToken, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost host) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> singleDoOnError = powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.DefaultImpls.postSingle$default(this.httpClient, config.getAuthEndpoint(), null, null, kotlin.collections.MapsKt.mapOf(new kotlin.Pair("grant_type", "refresh_token"), new kotlin.Pair("refresh_token", refreshToken), new kotlin.Pair("client_id", host.getClientID()), new kotlin.Pair("client_secret", host.getClientSecret())), powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials.class, 2, null).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.-$$Lambda$StravaAuthServiceImpl$i_dZ9XW9iHORLmOEtKrRzYYBP78
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthServiceImpl.m3099refresh$lambda0(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDoOnError, "httpClient.postSingle(config.authEndpoint, body = null, queries = queries, clazz = StravaPasswordCredentials::class.java)\n                .doOnError {\n                    error(\"Strava Cloud Refresh token Failed: HTTP response is: \", it)\n                }");
        return singleDoOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: refresh$lambda-0, reason: not valid java name */
    public static final void m3099refresh$lambda0(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthServiceImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Strava Cloud Refresh token Failed: HTTP response is: ", th, null, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> authorize(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost host) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> singleDoOnError = powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.DefaultImpls.postSingle$default(this.httpClient, config.getAuthEndpoint(), null, null, kotlin.collections.MapsKt.mapOf(new kotlin.Pair("grant_type", "authorization_code"), new kotlin.Pair("client_id", host.getClientID()), new kotlin.Pair("client_secret", host.getClientSecret()), new kotlin.Pair("code", host.getCode())), powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials.class, 2, null).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.-$$Lambda$StravaAuthServiceImpl$-GrVSU84DwTjQGF82RJvRyMfRAI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthServiceImpl.m3096authorize$lambda1(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDoOnError, "httpClient.postSingle(config.authEndpoint, body = null, queries = queries, clazz = StravaPasswordCredentials::class.java)\n                .doOnError {\n                    error(\"Strava Cloud Authorization Failed: HTTP response is: \", it)\n                }");
        return singleDoOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: authorize$lambda-1, reason: not valid java name */
    public static final void m3096authorize$lambda1(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthServiceImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Strava Cloud Authorization Failed: HTTP response is: ", th, null, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService
    public io.reactivex.Completable logout(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost stravaHost, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaHost, "stravaHost");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        io.reactivex.Completable completableDoOnError = powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.DefaultImpls.postCompletable$default(this.httpClient, config.getRevokeEndpoint(), null, null, kotlin.collections.MapsKt.mapOf(new kotlin.Pair("access_token", stravaHost.getAccessToken()), new kotlin.Pair("client_id", stravaHost.getClientID()), new kotlin.Pair("client_secret", stravaHost.getClientSecret()), new kotlin.Pair("code", stravaHost.getCode())), 2, null).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.-$$Lambda$StravaAuthServiceImpl$7fy6I9Ff14d2PaC5iif_rbgIJYU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthServiceImpl.m3098logout$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnError, "httpClient.postCompletable(config.revokeEndpoint, body = null, queries = queries)\n                .doOnError {\n                    error(\"Strava Cloud Authorization Failed: HTTP response is: \", it)\n                }");
        return completableDoOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logout$lambda-2, reason: not valid java name */
    public static final void m3098logout$lambda2(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthServiceImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Strava Cloud Authorization Failed: HTTP response is: ", th, null, 4, null);
    }
}
