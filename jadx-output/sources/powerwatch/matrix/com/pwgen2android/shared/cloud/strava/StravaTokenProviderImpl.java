package powerwatch.matrix.com.pwgen2android.shared.cloud.strava;

/* JADX INFO: compiled from: StravaTokenProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProvider;", "stravaTokenStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;", "authService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;", "config", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;", "appContext", "Landroid/content/Context;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;Landroid/content/Context;)V", "clientID", "", "clientSecret", "provideToken", "Lio/reactivex/Maybe;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StravaTokenProviderImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProvider {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService authService;
    private final java.lang.String clientID;
    private final java.lang.String clientSecret;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage stravaTokenStorage;

    public StravaTokenProviderImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage stravaTokenStorage, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaAuthService authService, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config, android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaTokenStorage, "stravaTokenStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authService, "authService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.stravaTokenStorage = stravaTokenStorage;
        this.authService = authService;
        this.config = config;
        java.lang.String string = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.client_id);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "appContext.getString(R.string.client_id)");
        this.clientID = string;
        java.lang.String string2 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.client_secret);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "appContext.getString(R.string.client_secret)");
        this.clientSecret = string2;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProvider
    public io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> provideToken() {
        io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> maybeFirstElement = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaTokenProviderImpl$7ejn82qadrx-AZXTNhN4QOSlcG4
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProviderImpl.m3086provideToken$lambda0(this.f$0, observableEmitter);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaTokenProviderImpl$HWA4jeNU06YH7GiC_Ye-CpGLn38
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProviderImpl.m3087provideToken$lambda3(this.f$0, (kotlin.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaTokenProviderImpl$DUSbh7wO_NCDC2jH6UpksgcN244
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProviderImpl.m3090provideToken$lambda4((kotlin.Pair) obj);
            }
        }).firstElement();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "create<Pair<Boolean, StravaPasswordCredentials>> {\n            val credentials = stravaTokenStorage.loadCredentials()\n            if (credentials == null) {\n                it.onComplete()\n            } else {\n                it.onNext(Pair(true, credentials))\n                it.onComplete()\n            }\n        }.flatMap { passCredentials ->\n            if (passCredentials.second.hasExpired()) {\n                return@flatMap authService.refresh(passCredentials.second.refreshToken, config, StravaHost(clientID, clientSecret, \"\"))\n                        .toObservable()\n                        .map { Pair(false, it) }\n                        .doOnNext {\n                            stravaTokenStorage.storeCredentials(it.second)\n                        }\n            }\n            return@flatMap Observable.just(passCredentials)\n        }.map {\n            it.second\n        }.firstElement()");
        return maybeFirstElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: provideToken$lambda-0, reason: not valid java name */
    public static final void m3086provideToken$lambda0(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProviderImpl this$0, io.reactivex.ObservableEmitter it) {
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
    /* JADX INFO: renamed from: provideToken$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3087provideToken$lambda3(final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProviderImpl this$0, kotlin.Pair passCredentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passCredentials, "passCredentials");
        if (((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) passCredentials.getSecond()).hasExpired()) {
            return this$0.authService.refresh(((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) passCredentials.getSecond()).getRefreshToken(), this$0.config, new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost(this$0.clientID, this$0.clientSecret, "", null, 8, null)).toObservable().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaTokenProviderImpl$7IzyiL9aKCWPUU3xDLgtgegYOcM
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProviderImpl.m3088provideToken$lambda3$lambda1((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) obj);
                }
            }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.-$$Lambda$StravaTokenProviderImpl$xSsahBf2eAqa80JD8eHACLDd5zE
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProviderImpl.m3089provideToken$lambda3$lambda2(this.f$0, (kotlin.Pair) obj);
                }
            });
        }
        return io.reactivex.Observable.just(passCredentials);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: provideToken$lambda-3$lambda-1, reason: not valid java name */
    public static final kotlin.Pair m3088provideToken$lambda3$lambda1(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(false, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: provideToken$lambda-3$lambda-2, reason: not valid java name */
    public static final void m3089provideToken$lambda3$lambda2(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProviderImpl this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stravaTokenStorage.storeCredentials((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) pair.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: provideToken$lambda-4, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials m3090provideToken$lambda4(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) it.getSecond();
    }
}
