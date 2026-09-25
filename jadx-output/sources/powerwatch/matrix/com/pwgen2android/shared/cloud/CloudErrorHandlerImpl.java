package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: Cloud.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandlerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;", "authService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;", "cloudConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;", "hostInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;", "tokenProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;)V", "authErrorEmitter", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "authRequiredError", "Lio/reactivex/Observable;", "getAuthRequiredError", "()Lio/reactivex/Observable;", "handleApiError", "Lio/reactivex/Completable;", "error", "handleAuthError", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;", "passwordCredentials", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
final class CloudErrorHandlerImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler {
    private final io.reactivex.subjects.PublishSubject<java.lang.Throwable> authErrorEmitter;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService authService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider tokenProvider;

    public CloudErrorHandlerImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.AuthService authService, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfig, powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider tokenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authService, "authService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudConfig, "cloudConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostInfoProvider, "hostInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        this.authService = authService;
        this.cloudConfig = cloudConfig;
        this.hostInfoProvider = hostInfoProvider;
        this.tokenProvider = tokenProvider;
        io.reactivex.subjects.PublishSubject<java.lang.Throwable> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Throwable>()");
        this.authErrorEmitter = publishSubjectCreate;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler
    public io.reactivex.Observable<java.lang.Throwable> getAuthRequiredError() {
        return this.authErrorEmitter;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> handleAuthError(final java.lang.Throwable error, final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordCredentials, "passwordCredentials");
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> singleDefer = io.reactivex.Single.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudErrorHandlerImpl$MGhIb9cA1-CeBvYlXIpoDv2lsdA
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandlerImpl.m2972handleAuthError$lambda2(error, passwordCredentials, this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDefer, "defer {\n            val cloudErrorType = error.retrofitResponse()?.cloudErrorType\n                    ?: error as? CloudErrorType\n            val tryLogin =\n                    if (passwordCredentials.email != null && passwordCredentials.password != null) {\n                        val config = cloudConfig.authConfig.copy(\n                                email = passwordCredentials.email,\n                                password = passwordCredentials.password\n                        )\n                        authService.authorize(authConfig = config, host = hostInfoProvider.hostInfo())\n                                .flatMap { tokenProvider.add(it).toSingleDefault(it) }\n\n                    } else {\n                        Single.error(error)\n                    }\n                            .doOnError {\n                                if (it == CloudErrorType.InvalidGrant || it.retrofitResponse()?.cloudErrorType != null) {\n                                    // cannot recover, push login authRequiredError event\n                                    authErrorEmitter.onNext(error)\n                                }\n                            }\n             when (cloudErrorType) {\n                CloudErrorType.InvalidGrant -> {\n                    tryLogin\n                }\n                CloudErrorType.Unauthorized -> {\n                    tryLogin\n                }\n                else -> {\n                    Single.error(error)\n                }\n            }\n        }");
        return singleDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleAuthError$lambda-2, reason: not valid java name */
    public static final io.reactivex.SingleSource m2972handleAuthError$lambda2(final java.lang.Throwable error, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials, final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandlerImpl this$0) {
        io.reactivex.Single singleError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordCredentials, "$passwordCredentials");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse retrofitErrorResponseRetrofitResponse = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorResolverKt.retrofitResponse(error);
        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType cloudErrorType = retrofitErrorResponseRetrofitResponse == null ? null : retrofitErrorResponseRetrofitResponse.getCloudErrorType();
        if (cloudErrorType == null) {
            cloudErrorType = error instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType ? (powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType) error : null;
        }
        if (passwordCredentials.getEmail() != null && passwordCredentials.getPassword() != null) {
            powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig = this$0.cloudConfig.getAuthConfig();
            singleError = this$0.authService.authorize(authConfig.copy((kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 1) != 0 ? authConfig.authEndpoint : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 2) != 0 ? authConfig.grantType : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 4) != 0 ? authConfig.scope : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 8) != 0 ? authConfig.clientID : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 16) != 0 ? authConfig.clientSecret : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 32) != 0 ? authConfig.basicAuthorizationTokenType : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 64) != 0 ? authConfig.encodedBasicToken : null, (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 128) != 0 ? authConfig.email : passwordCredentials.getEmail(), (kotlinx.coroutines.scheduling.WorkQueueKt.MASK & 256) != 0 ? authConfig.password : passwordCredentials.getPassword()), powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider.DefaultImpls.hostInfo$default(this$0.hostInfoProvider, false, 1, null)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudErrorHandlerImpl$V2Rhv58RNgxE2enpHZXWg5uk-CA
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandlerImpl.m2973handleAuthError$lambda2$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) obj);
                }
            });
        } else {
            singleError = io.reactivex.Single.error(error);
        }
        io.reactivex.Single singleDoOnError = singleError.doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudErrorHandlerImpl$uLA_hMNZQv4JtoH-0OyoICSUUVE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandlerImpl.m2974handleAuthError$lambda2$lambda1(this.f$0, error, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDoOnError, "if (passwordCredentials.email != null && passwordCredentials.password != null) {\n                        val config = cloudConfig.authConfig.copy(\n                                email = passwordCredentials.email,\n                                password = passwordCredentials.password\n                        )\n                        authService.authorize(authConfig = config, host = hostInfoProvider.hostInfo())\n                                .flatMap { tokenProvider.add(it).toSingleDefault(it) }\n\n                    } else {\n                        Single.error(error)\n                    }\n                            .doOnError {\n                                if (it == CloudErrorType.InvalidGrant || it.retrofitResponse()?.cloudErrorType != null) {\n                                    // cannot recover, push login authRequiredError event\n                                    authErrorEmitter.onNext(error)\n                                }\n                            }");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(cloudErrorType, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.InvalidGrant.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(cloudErrorType, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Unauthorized.INSTANCE)) {
            singleDoOnError = io.reactivex.Single.error(error);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDoOnError, "{\n                    Single.error(error)\n                }");
        }
        return singleDoOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleAuthError$lambda-2$lambda-0, reason: not valid java name */
    public static final io.reactivex.SingleSource m2973handleAuthError$lambda2$lambda0(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandlerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.tokenProvider.add(it).toSingleDefault(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleAuthError$lambda-2$lambda-1, reason: not valid java name */
    public static final void m2974handleAuthError$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandlerImpl this$0, java.lang.Throwable error, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(it, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.InvalidGrant.INSTANCE)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse retrofitErrorResponseRetrofitResponse = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorResolverKt.retrofitResponse(it);
            if ((retrofitErrorResponseRetrofitResponse == null ? null : retrofitErrorResponseRetrofitResponse.getCloudErrorType()) == null) {
                return;
            }
        }
        this$0.authErrorEmitter.onNext(error);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler
    public io.reactivex.Completable handleApiError(final java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        io.reactivex.Completable completableDefer = io.reactivex.Completable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudErrorHandlerImpl$CRL4jC6A7zB89B63RFrEiEymaWE
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandlerImpl.m2970handleApiError$lambda4(error, this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDefer, "defer {\n            val cloudResponse = error.retrofitResponse()\n\n            return@defer when (cloudResponse?.cloudErrorType) {\n                CloudErrorType.Unauthorized -> {\n                    tokenProvider.get()\n                            .firstOrError()\n                            .flatMapCompletable {\n                                if (it.element == null) return@flatMapCompletable Completable.error(\n                                        error\n                                )\n                                if (it.element.hasExpired()) {\n                                    return@flatMapCompletable Completable.error(error)\n                                }\n                                it.element.shouldTryLogin = true\n                                return@flatMapCompletable tokenProvider.add(it.element)\n                            }\n                }\n                else -> {\n                    Completable.error(error)\n                }\n\n            }\n        }");
        return completableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleApiError$lambda-4, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2970handleApiError$lambda4(final java.lang.Throwable error, final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandlerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse retrofitErrorResponseRetrofitResponse = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorResolverKt.retrofitResponse(error);
        if (kotlin.jvm.internal.Intrinsics.areEqual(retrofitErrorResponseRetrofitResponse == null ? null : retrofitErrorResponseRetrofitResponse.getCloudErrorType(), powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.Unauthorized.INSTANCE)) {
            return this$0.tokenProvider.get().firstOrError().flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.-$$Lambda$CloudErrorHandlerImpl$N4KT4gZKq29j5B29HXBk5zY2wZg
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandlerImpl.m2971handleApiError$lambda4$lambda3(error, this$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.Optional) obj);
                }
            });
        }
        return io.reactivex.Completable.error(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleApiError$lambda-4$lambda-3, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2971handleApiError$lambda4$lambda3(java.lang.Throwable error, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandlerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.Optional it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.getElement() == null) {
            return io.reactivex.Completable.error(error);
        }
        if (((powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) it.getElement()).hasExpired()) {
            return io.reactivex.Completable.error(error);
        }
        ((powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) it.getElement()).setShouldTryLogin(true);
        return this$0.tokenProvider.add((powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) it.getElement());
    }
}
