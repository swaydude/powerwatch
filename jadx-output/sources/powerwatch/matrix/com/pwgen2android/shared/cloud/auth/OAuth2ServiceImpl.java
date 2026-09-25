package powerwatch.matrix.com.pwgen2android.shared.cloud.auth;

/* JADX INFO: compiled from: AuthService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2ServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;)V", "authorize", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;", "authConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;", "host", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "refresh", "refreshToken", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OAuth2ServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient;

    public OAuth2ServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> refresh(final java.lang.String refreshToken, final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig, final powerwatch.matrix.com.pwgen2android.shared.host.Host host) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "authConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> singleDefer = io.reactivex.Single.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.auth.-$$Lambda$OAuth2ServiceImpl$gh2LCVpZ8FiHXIZ_Gpej0yeLSS8
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2ServiceImpl.m3023refresh$lambda1(authConfig, refreshToken, host, this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDefer, "defer {\n            val basicAuthHeaders: Headers = mapOf(\n                    Header(\"Authorization\", authConfig.basicAuthorizationTokenType.plus(\" ${authConfig.encodedBasicToken}\")))\n            val queries = mapOf(Pair(\"grant_type\", \"refresh_token\"), Pair(\"refresh_token\", refreshToken),\n                    Pair(\"host\", host.uuid))\n\n            httpClient.postSingle(authConfig.authEndpoint, headers = basicAuthHeaders, body = host, queries = queries, clazz = PasswordCredentials::class.java)\n                    .map {\n                        it.copy(email = authConfig.email, password = authConfig.password)\n                    }\n        }");
        return singleDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: refresh$lambda-1, reason: not valid java name */
    public static final io.reactivex.SingleSource m3023refresh$lambda1(final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig, java.lang.String refreshToken, powerwatch.matrix.com.pwgen2android.shared.host.Host host, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2ServiceImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "$authConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshToken, "$refreshToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "$host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.httpClient.postSingle(authConfig.getAuthEndpoint(), kotlin.collections.MapsKt.mapOf(new kotlin.Pair(io.fabric.sdk.android.services.network.HttpRequest.HEADER_AUTHORIZATION, authConfig.getBasicAuthorizationTokenType() + ' ' + authConfig.getEncodedBasicToken())), host, kotlin.collections.MapsKt.mapOf(new kotlin.Pair("grant_type", "refresh_token"), new kotlin.Pair("refresh_token", refreshToken), new kotlin.Pair("host", host.getUuid())), powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials.class).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.auth.-$$Lambda$OAuth2ServiceImpl$bCzpVUdVnhVQLAwsQ7grSV30sCs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2ServiceImpl.m3024refresh$lambda1$lambda0(authConfig, (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: refresh$lambda-1$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials m3024refresh$lambda1$lambda0(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "$authConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.copy((kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 1) != 0 ? it.uid : 0, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 2) != 0 ? it.accessToken : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 4) != 0 ? it.tokenType : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 8) != 0 ? it.refreshToken : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 16) != 0 ? it.expiresIn : 0L, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 32) != 0 ? it.scope : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 64) != 0 ? it.tokenValidUntil : 0L, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 128) != 0 ? it.email : authConfig.getEmail(), (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 256) != 0 ? it.password : authConfig.getPassword());
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> authorize(final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig, final powerwatch.matrix.com.pwgen2android.shared.host.Host host) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "authConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> singleDefer = io.reactivex.Single.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.auth.-$$Lambda$OAuth2ServiceImpl$V6mD5UrrXLX25LfMjXUYs9K_mXQ
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2ServiceImpl.m3020authorize$lambda4(authConfig, host, this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDefer, "defer {\n            val basicAuthHeaders: Headers = mapOf(\n                    Header(\"Authorization\", authConfig.basicAuthorizationTokenType.plus(\" ${authConfig.encodedBasicToken}\")))\n            val queries = mapOf(Pair(\"grant_type\", authConfig.grantType),\n                    Pair(\"host\", host.uuid),\n                    Pair(\"username\", authConfig.email!!),\n                    Pair(\"password\", authConfig.password!!))\n            httpClient.postSingle(authConfig.authEndpoint, headers = basicAuthHeaders, body = host, queries = queries, clazz = PasswordCredentials::class.java)\n                    .doOnError {\n                        error(\"Cloud Authorization Failed: HTTP response is: \", it)\n                    }\n                    .map {\n                        it.copy(email = authConfig.email, password = authConfig.password)\n                    }\n        }");
        return singleDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: authorize$lambda-4, reason: not valid java name */
    public static final io.reactivex.SingleSource m3020authorize$lambda4(final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig, powerwatch.matrix.com.pwgen2android.shared.host.Host host, final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2ServiceImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "$authConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "$host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.util.Map<java.lang.String, java.lang.String> mapMapOf = kotlin.collections.MapsKt.mapOf(new kotlin.Pair(io.fabric.sdk.android.services.network.HttpRequest.HEADER_AUTHORIZATION, authConfig.getBasicAuthorizationTokenType() + ' ' + authConfig.getEncodedBasicToken()));
        java.lang.String email = authConfig.getEmail();
        kotlin.jvm.internal.Intrinsics.checkNotNull(email);
        java.lang.String password = authConfig.getPassword();
        kotlin.jvm.internal.Intrinsics.checkNotNull(password);
        return this$0.httpClient.postSingle(authConfig.getAuthEndpoint(), mapMapOf, host, kotlin.collections.MapsKt.mapOf(new kotlin.Pair("grant_type", authConfig.getGrantType()), new kotlin.Pair("host", host.getUuid()), new kotlin.Pair("username", email), new kotlin.Pair("password", password)), powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials.class).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.auth.-$$Lambda$OAuth2ServiceImpl$PNxjqUbhoXilgrQ41jkRGM_gDgY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2ServiceImpl.m3021authorize$lambda4$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.auth.-$$Lambda$OAuth2ServiceImpl$l6e6409vajA_spICyRmwshFaPhY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2ServiceImpl.m3022authorize$lambda4$lambda3(authConfig, (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: authorize$lambda-4$lambda-2, reason: not valid java name */
    public static final void m3021authorize$lambda4$lambda2(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2ServiceImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Cloud Authorization Failed: HTTP response is: ", th, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: authorize$lambda-4$lambda-3, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials m3022authorize$lambda4$lambda3(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "$authConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.copy((kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 1) != 0 ? it.uid : 0, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 2) != 0 ? it.accessToken : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 4) != 0 ? it.tokenType : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 8) != 0 ? it.refreshToken : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 16) != 0 ? it.expiresIn : 0L, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 32) != 0 ? it.scope : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 64) != 0 ? it.tokenValidUntil : 0L, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 128) != 0 ? it.email : authConfig.getEmail(), (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 256) != 0 ? it.password : authConfig.getPassword());
    }
}
