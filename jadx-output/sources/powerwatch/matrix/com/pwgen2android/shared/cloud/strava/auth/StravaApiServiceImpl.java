package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth;

/* JADX INFO: compiled from: StravaApiService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R$\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaApiService;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "tokenProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProvider;)V", "headerProvider", "Lio/reactivex/Observable;", "", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "uploadActivity", "Lio/reactivex/Completable;", "config", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;", "data", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StravaApiServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiService {
    private final io.reactivex.Observable<java.util.Map<java.lang.String, java.lang.String>> headerProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient;

    public StravaApiServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenProvider tokenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        this.httpClient = httpClient;
        io.reactivex.Observable<java.util.Map<java.lang.String, java.lang.String>> observable = tokenProvider.provideToken().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.-$$Lambda$StravaApiServiceImpl$iSWRC3bfj_PD2m_ci2En28i-9Go
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiServiceImpl.m3091headerProvider$lambda0((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) obj);
            }
        }).toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "tokenProvider\n            .provideToken()\n            .map {\n                mapOf(\n                        Pair(\"Authorization\", \"Bearer ${it.accessToken}\")\n                )\n            }\n            .toObservable()");
        this.headerProvider = observable;
        httpClient.setHeadersProvider(observable, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiServiceImpl.1
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: headerProvider$lambda-0, reason: not valid java name */
    public static final java.util.Map m3091headerProvider$lambda0(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.collections.MapsKt.mapOf(new kotlin.Pair(io.fabric.sdk.android.services.network.HttpRequest.HEADER_AUTHORIZATION, kotlin.jvm.internal.Intrinsics.stringPlus("Bearer ", it.getAccessToken())));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiService
    public io.reactivex.Completable uploadActivity(final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config, final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        io.reactivex.Completable completableFlatMapCompletable = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.-$$Lambda$StravaApiServiceImpl$e93cfx897ppycc5NfQdq2gtN-h0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiServiceImpl.m3094uploadActivity$lambda1(data, config, observableEmitter);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.-$$Lambda$StravaApiServiceImpl$tp108k1PGeUNGX90IVHTLTW47o0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiServiceImpl.m3095uploadActivity$lambda2(this.f$0, (kotlin.Triple) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "create<Triple<String, Headers, MultipartBody.Part>> {\n\n\n            val queryMap = mapOf(Pair(\"name\", data.name),\n//                    Pair(\"file\", data.data),\n                    Pair(\"data_type\", \"tcx\")\n            )\n\n            val requestBody = RequestBody.create(MultipartBody.FORM, data.data)\n            val multipartBody = MultipartBody.Part.createFormData(\"file\", \"default\", requestBody)\n            it.onNext(Triple(config.apiEndpoint, queryMap, multipartBody))\n\n            it.onComplete()\n        }.flatMapCompletable {\n            httpClient.postMultiPart(it.first, headers = null, queries = it.second, dataPart = it.third)\n        }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uploadActivity$lambda-1, reason: not valid java name */
    public static final void m3094uploadActivity$lambda1(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData data, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "$data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.onNext(new kotlin.Triple(config.getApiEndpoint(), kotlin.collections.MapsKt.mapOf(new kotlin.Pair(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, data.getName()), new kotlin.Pair("data_type", "tcx")), okhttp3.MultipartBody.Part.createFormData("file", "default", okhttp3.RequestBody.create(okhttp3.MultipartBody.FORM, data.getData()))));
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uploadActivity$lambda-2, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3095uploadActivity$lambda2(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaApiServiceImpl this$0, kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.httpClient.postMultiPart((java.lang.String) it.getFirst(), null, (java.util.Map) it.getSecond(), (okhttp3.MultipartBody.Part) it.getThird());
    }
}
