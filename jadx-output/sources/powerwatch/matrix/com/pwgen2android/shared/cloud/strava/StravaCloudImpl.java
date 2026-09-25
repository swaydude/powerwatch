package powerwatch.matrix.com.pwgen2android.shared.cloud.strava;

/* JADX INFO: compiled from: StravaCloud.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloudImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "config", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;", "authService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;", "stravaTokenStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;", "apiService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;)V", "hasToken", "", "loadStoredCredentials", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;", com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN, "Lio/reactivex/Single;", "stravaHost", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;", "logout", "Lio/reactivex/Completable;", "uploadActivity", "data", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StravaCloudImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiService apiService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService authService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage stravaTokenStorage;

    public StravaCloudImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService authService, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage stravaTokenStorage, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiService apiService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authService, "authService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaTokenStorage, "stravaTokenStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.config = config;
        this.authService = authService;
        this.stravaTokenStorage = stravaTokenStorage;
        this.apiService = apiService;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud
    public boolean hasToken() {
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials stravaPasswordCredentialsLoadCredentials = this.stravaTokenStorage.loadCredentials();
        return (stravaPasswordCredentialsLoadCredentials == null ? null : stravaPasswordCredentialsLoadCredentials.getAccessToken()) != null;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud
    public io.reactivex.Completable uploadActivity(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        io.reactivex.Completable completableDoOnError = this.apiService.uploadActivity(this.config, data).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaCloudImpl$xlKLm5DUm4yfDSuaHolejYlcgfE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl.m3083uploadActivity$lambda0(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnError, "apiService.uploadActivity(config, data)\n                .doOnError {\n                    error(\"Error occurred during upload: ${it.javaClass.simpleName}\", it)\n                    it.printStackTrace()\n                }");
        return completableDoOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uploadActivity$lambda-0, reason: not valid java name */
    public static final void m3083uploadActivity$lambda0(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Error occurred during upload: ", th.getClass().getSimpleName()), th, null, 4, null);
        th.printStackTrace();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud
    public io.reactivex.Completable logout(final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost stravaHost) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaHost, "stravaHost");
        io.reactivex.Completable completableDoOnEvent = loadStoredCredentials().flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaCloudImpl$ENplg1zIHHi-YteDPE5D2JMstnY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl.m3081logout$lambda1(this.f$0, stravaHost, (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) obj);
            }
        }).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaCloudImpl$pL5MLaWNvK3pUdMKH1p5ZOC-M3w
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl.m3082logout$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnEvent, "loadStoredCredentials()\n                .flatMapCompletable {\n                    authService.logout(stravaHost.copy(code = it.code, accessToken = it.accessToken), config)\n                }.doOnEvent {\n                    stravaTokenStorage.clearCredentials()\n                }");
        return completableDoOnEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logout$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3081logout$lambda1(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost stravaHost, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaHost, "$stravaHost");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.authService.logout(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost.copy$default(stravaHost, null, null, it.getCode(), it.getAccessToken(), 3, null), this$0.config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logout$lambda-2, reason: not valid java name */
    public static final void m3082logout$lambda2(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stravaTokenStorage.clearCredentials();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> loadStoredCredentials() {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> observableCreate = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaCloudImpl$ZZ3cNrYCyLGpsFAJQHBzSCcrXOc
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl.m3073loadStoredCredentials$lambda3(this.f$0, observableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableCreate, "create {\n            val credentials = stravaTokenStorage.loadCredentials()\n            if (credentials != null) {\n                it.onNext(credentials)\n            }\n            it.onComplete()\n        }");
        return observableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadStoredCredentials$lambda-3, reason: not valid java name */
    public static final void m3073loadStoredCredentials$lambda3(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl this$0, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials stravaPasswordCredentialsLoadCredentials = this$0.stravaTokenStorage.loadCredentials();
        if (stravaPasswordCredentialsLoadCredentials != null) {
            it.onNext(stravaPasswordCredentialsLoadCredentials);
        }
        it.onComplete();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> login(final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost stravaHost) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaHost, "stravaHost");
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> singleDoOnError = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaCloudImpl$CubKBQBJlCtgt_MTyouLLJ1T-0I
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl.m3075login$lambda4(this.f$0, observableEmitter);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaCloudImpl$QxMbFmhtx9sBbY4t6oEUXH90HM8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl.m3076login$lambda6(this.f$0, stravaHost, (kotlin.Pair) obj);
            }
        }).switchIfEmpty(this.authService.authorize(this.config, stravaHost).toObservable().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaCloudImpl$AbR5szaqXtOMIkljUSEqx9NJqZc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl.m3078login$lambda7((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) obj);
            }
        })).firstOrError().doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaCloudImpl$dOhUJXAhE_eiycBG6bqWmxGK8GQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl.m3079login$lambda8(this.f$0, stravaHost, (kotlin.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaCloudImpl$tk2CpLtwWPdQUvmuiDKkjt87RU8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl.m3080login$lambda9((kotlin.Pair) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaCloudImpl$dIsTQysJCT4LOtXVB1CV4K_qsK0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl.m3074login$lambda10(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDoOnError, "create<Pair<Boolean, StravaPasswordCredentials>> {\n            val credentials = stravaTokenStorage.loadCredentials()\n            if (credentials == null) {\n                it.onComplete()\n            } else {\n                it.onNext(Pair(true, credentials))\n                it.onComplete()\n            }\n        }.flatMap { passCredentials ->\n            if (passCredentials.second.hasExpired()) {\n                return@flatMap authService.refresh(passCredentials.second.refreshToken, config, stravaHost)\n                        .toObservable()\n                        .map { Pair(false, it) }\n            }\n            return@flatMap Observable.just(passCredentials)\n        }.switchIfEmpty(authService.authorize(config, stravaHost).toObservable().map { Pair(false, it) })\n                .firstOrError()\n                .doOnSuccess {\n                    if (!it.first) {\n                        stravaTokenStorage.storeCredentials(it.second.copy(code = stravaHost.code))\n                    }\n                }\n                .map { it.second }\n                .doOnError {\n                    error(\"Error during Strava login: ${it.javaClass.simpleName}\", it)\n                    it.printStackTrace()\n                }");
        return singleDoOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: login$lambda-4, reason: not valid java name */
    public static final void m3075login$lambda4(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl this$0, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials stravaPasswordCredentialsLoadCredentials = this$0.stravaTokenStorage.loadCredentials();
        if (stravaPasswordCredentialsLoadCredentials == null) {
            it.onComplete();
        } else {
            it.onNext(new kotlin.Pair(true, stravaPasswordCredentialsLoadCredentials));
            it.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: login$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3076login$lambda6(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost stravaHost, kotlin.Pair passCredentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaHost, "$stravaHost");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passCredentials, "passCredentials");
        if (((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) passCredentials.getSecond()).hasExpired()) {
            return this$0.authService.refresh(((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) passCredentials.getSecond()).getRefreshToken(), this$0.config, stravaHost).toObservable().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaCloudImpl$GAse6FS8gHTHbxKhfh7D1EYcdXI
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl.m3077login$lambda6$lambda5((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) obj);
                }
            });
        }
        return io.reactivex.Observable.just(passCredentials);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: login$lambda-6$lambda-5, reason: not valid java name */
    public static final kotlin.Pair m3077login$lambda6$lambda5(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(false, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: login$lambda-7, reason: not valid java name */
    public static final kotlin.Pair m3078login$lambda7(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(false, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: login$lambda-8, reason: not valid java name */
    public static final void m3079login$lambda8(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost stravaHost, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaHost, "$stravaHost");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage stravaTokenStorage = this$0.stravaTokenStorage;
        java.lang.Object second = pair.getSecond();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(second, "it.second");
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials stravaPasswordCredentials = (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) second;
        stravaTokenStorage.storeCredentials(stravaPasswordCredentials.copy((63 & 1) != 0 ? stravaPasswordCredentials.uid : 0, (63 & 2) != 0 ? stravaPasswordCredentials.accessToken : null, (63 & 4) != 0 ? stravaPasswordCredentials.tokenType : null, (63 & 8) != 0 ? stravaPasswordCredentials.refreshToken : null, (63 & 16) != 0 ? stravaPasswordCredentials.expiresIn : 0L, (63 & 32) != 0 ? stravaPasswordCredentials.expiresAt : 0L, (63 & 64) != 0 ? stravaPasswordCredentials.code : stravaHost.getCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: login$lambda-9, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials m3080login$lambda9(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) it.getSecond();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: login$lambda-10, reason: not valid java name */
    public static final void m3074login$lambda10(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloudImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Error during Strava login: ", th.getClass().getSimpleName()), th, null, 4, null);
        th.printStackTrace();
    }
}
