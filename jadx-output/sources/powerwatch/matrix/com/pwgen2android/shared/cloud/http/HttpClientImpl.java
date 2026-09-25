package powerwatch.matrix.com.pwgen2android.shared.cloud.http;

/* JADX INFO: compiled from: HttpClient.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0015\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0016JT\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0015\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J@\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rH\u0016JW\u0010!\u001a\u00020 \"\u0004\b\u0000\u0010\"2\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\u0010#\u001a\u0004\u0018\u0001H\"2\u0014\b\u0001\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rH\u0016¢\u0006\u0002\u0010$JJ\u0010%\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\b\b\u0001\u0010&\u001a\u00020'H\u0016Jb\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0015\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010&\u001a\u00020'2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190)H\u0016Jo\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0015\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u00192\u0006\u0010\u0017\u001a\u00020\u00052\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\u0010#\u001a\u0004\u0018\u0001H\"2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u00190)H\u0016¢\u0006\u0002\u0010,J:\u0010-\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rj\u0002`\u000e0\u00152\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0002J\u0012\u0010.\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u00010\nH\u0016J4\u00100\u001a\u00020\u00132\u001c\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rj\u0002`\u000e0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\f\u00101\u001a\u00020\u0005*\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rj\u0002`\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClientImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "http", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;", "baseURL", "", "gson", "Lcom/google/gson/Gson;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;Ljava/lang/String;Lcom/google/gson/Gson;)V", "errorHandler", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;", "headerProvider", "Lio/reactivex/Observable;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "getHttp", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;", "tokenRequest", "Lkotlin/Function0;", "", "download", "Lio/reactivex/Single;", "Lokhttp3/ResponseBody;", "endpoint", "downloadJSON", "RESPONSE_BODY", "type", "Ljava/lang/reflect/Type;", "get", "headers", "queries", "getCompletable", "Lio/reactivex/Completable;", "postCompletable", "REQUEST_BODY", "body", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;", "postMultiPart", "dataPart", "Lokhttp3/MultipartBody$Part;", "postMultiPartWithResponse", "Ljava/lang/Class;", "postSingle", "clazz", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;)Lio/reactivex/Single;", "requestToken", "setErrorHandler", "apiErrorHandler", "setHeadersProvider", "appendBaseUrl", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HttpClientImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient {
    private final java.lang.String baseURL;
    private powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler errorHandler;
    private final com.google.gson.Gson gson;
    private io.reactivex.Observable<java.util.Map<java.lang.String, java.lang.String>> headerProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP http;
    private kotlin.jvm.functions.Function0<kotlin.Unit> tokenRequest;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: requestToken$lambda-18$lambda-17, reason: not valid java name */
    public static final java.util.Map m3055requestToken$lambda18$lambda17(java.util.Map responseHeaders, kotlin.Unit noName_1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return responseHeaders;
    }

    public HttpClientImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP http, java.lang.String baseURL, com.google.gson.Gson gson) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(http, "http");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gson, "gson");
        this.http = http;
        this.baseURL = baseURL;
        this.gson = gson;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP getHttp() {
        return this.http;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient
    public io.reactivex.Single<okhttp3.ResponseBody> download(java.lang.String endpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        io.reactivex.Single<okhttp3.ResponseBody> singleSubscribeOn = this.http.downloadFile(endpoint).subscribeOn(io.reactivex.schedulers.Schedulers.io());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "http.downloadFile(endpoint)\n                .subscribeOn(Schedulers.io())");
        return singleSubscribeOn;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient
    public <RESPONSE_BODY> io.reactivex.Single<RESPONSE_BODY> downloadJSON(java.lang.String endpoint, final java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        io.reactivex.Single<RESPONSE_BODY> singleSubscribeOn = this.http.downloadJSONFile(endpoint).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$sRNB4ARaAHxTkjLNNyDEOVguu0U
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3031downloadJSON$lambda0(this.f$0, type, (java.lang.String) obj);
            }
        }).subscribeOn(io.reactivex.schedulers.Schedulers.io());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "http.downloadJSONFile(endpoint)\n                .map { gson.fromJson<RESPONSE_BODY>(it, type) }\n                .subscribeOn(Schedulers.io())");
        return singleSubscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: downloadJSON$lambda-0, reason: not valid java name */
    public static final java.lang.Object m3031downloadJSON$lambda0(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.reflect.Type type, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "$type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.gson.fromJson(it, type);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient
    public void setHeadersProvider(io.reactivex.Observable<java.util.Map<java.lang.String, java.lang.String>> headerProvider, kotlin.jvm.functions.Function0<kotlin.Unit> tokenRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenRequest, "tokenRequest");
        this.headerProvider = headerProvider;
        this.tokenRequest = tokenRequest;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient
    public void setErrorHandler(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler apiErrorHandler) {
        this.errorHandler = apiErrorHandler;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient
    public <REQUEST_BODY, RESPONSE_BODY> io.reactivex.Single<RESPONSE_BODY> postSingle(final java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, final REQUEST_BODY body, final java.util.Map<java.lang.String, java.lang.String> queries, final java.lang.Class<RESPONSE_BODY> clazz) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "queries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        io.reactivex.Single<RESPONSE_BODY> map = requestToken(headers).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$Snvaj5OAg7_iBA1jLL3JvLIHRLQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3050postSingle$lambda1(this.f$0, endpoint, queries, body, (java.util.Map) obj);
            }
        }).onErrorResumeNext((io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends R>>) new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$4IKQ3tZm4tFw7Q1Z76zQEsxCMr4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3051postSingle$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$r5bgc_8HsXGCIz6MO2D0pv3xYUs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3052postSingle$lambda3(this.f$0, clazz, (java.lang.String) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "requestToken(headers)\n                    .flatMap {\n                        http.postSingle(endpoint.appendBaseUrl(),\n                                it\n                                        + mapOf(contentTypeJSON, acceptTypeJSON), queries, gson.toJson(body))\n                                .subscribeOn(Schedulers.io())\n                    }\n                    .onErrorResumeNext {\n                        if (errorHandler != null) {\n                            errorHandler!!.handleApiError(it)\n                                    .andThen(Single.error(it))\n\n                        } else Single.error(it)\n                    }\n                    .map { gson.fromJson(it, clazz) }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postSingle$lambda-1, reason: not valid java name */
    public static final io.reactivex.SingleSource m3050postSingle$lambda1(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.String endpoint, java.util.Map queries, java.lang.Object obj, java.util.Map it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "$endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "$queries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP http = this$0.getHttp();
        java.lang.String strAppendBaseUrl = this$0.appendBaseUrl(endpoint);
        java.util.Map<java.lang.String, java.lang.String> mapPlus = kotlin.collections.MapsKt.plus(it, kotlin.collections.MapsKt.mapOf(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientKt.getContentTypeJSON(), powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientKt.getAcceptTypeJSON()));
        java.lang.String json = this$0.gson.toJson(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(body)");
        return http.postSingle(strAppendBaseUrl, mapPlus, queries, json).subscribeOn(io.reactivex.schedulers.Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postSingle$lambda-2, reason: not valid java name */
    public static final io.reactivex.SingleSource m3051postSingle$lambda2(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler = this$0.errorHandler;
        if (cloudErrorHandler != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cloudErrorHandler);
            return cloudErrorHandler.handleApiError(it).andThen(io.reactivex.Single.error(it));
        }
        return io.reactivex.Single.error(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postSingle$lambda-3, reason: not valid java name */
    public static final java.lang.Object m3052postSingle$lambda3(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.Class clazz, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "$clazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.gson.fromJson(it, clazz);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient
    public <RESPONSE_BODY> io.reactivex.Single<RESPONSE_BODY> get(final java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, final java.util.Map<java.lang.String, java.lang.String> queries, final java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "queries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        io.reactivex.Single<RESPONSE_BODY> map = requestToken(headers).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$BNpCg2MQOqsHwGLut1BjWxkex1c
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3032get$lambda4(this.f$0, endpoint, queries, (java.util.Map) obj);
            }
        }).onErrorResumeNext((io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends R>>) new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$ioFR4HpXwmcFHvpPjEeL77AwbqE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3033get$lambda5(this.f$0, (java.lang.Throwable) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$oZ4AYLN9-lskxfFvEUHqCrLD5OM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3034get$lambda6(this.f$0, type, (java.lang.String) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "requestToken(headers)\n                    .flatMap {\n                        http.get(endpoint.appendBaseUrl(), it\n                                + mapOf(contentTypeJSON, acceptTypeJSON), queries = queries)\n                                .subscribeOn(Schedulers.io())\n                    }\n                    .onErrorResumeNext {\n                        if (errorHandler != null) {\n                            errorHandler!!.handleApiError(it)\n                                    .andThen(Single.error(it))\n\n                        } else Single.error(it)\n                    }\n                    .map {\n                        gson.fromJson<RESPONSE_BODY>(it, type)\n                    }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: get$lambda-4, reason: not valid java name */
    public static final io.reactivex.SingleSource m3032get$lambda4(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.String endpoint, java.util.Map queries, java.util.Map it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "$endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "$queries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.getHttp().get(this$0.appendBaseUrl(endpoint), kotlin.collections.MapsKt.plus(it, kotlin.collections.MapsKt.mapOf(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientKt.getContentTypeJSON(), powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientKt.getAcceptTypeJSON())), queries).subscribeOn(io.reactivex.schedulers.Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: get$lambda-5, reason: not valid java name */
    public static final io.reactivex.SingleSource m3033get$lambda5(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler = this$0.errorHandler;
        if (cloudErrorHandler != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cloudErrorHandler);
            return cloudErrorHandler.handleApiError(it).andThen(io.reactivex.Single.error(it));
        }
        return io.reactivex.Single.error(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: get$lambda-6, reason: not valid java name */
    public static final java.lang.Object m3034get$lambda6(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.reflect.Type type, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "$type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.gson.fromJson(it, type);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient
    public <REQUEST_BODY> io.reactivex.Completable postCompletable(final java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, final REQUEST_BODY body, @retrofit2.http.QueryMap final java.util.Map<java.lang.String, java.lang.String> queries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "queries");
        io.reactivex.Completable completableOnErrorResumeNext = requestToken(headers).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$lG2UX_eJlTRdkra2tCUTJAuvYic
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3043postCompletable$lambda7(this.f$0, endpoint, body, queries, (java.util.Map) obj);
            }
        }).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$4x5ni-bQrrYYOXQtPcazAHKiJzc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3044postCompletable$lambda8(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "requestToken(headers)\n                    .flatMapCompletable {\n                        http.postCompletable(endpoint.appendBaseUrl(), it + mapOf(contentTypeJSON, acceptTypeJSON),\n                                body = gson.toJson(body), queries = queries)\n                                .subscribeOn(Schedulers.io())\n\n                    }.onErrorResumeNext {\n                        if (errorHandler != null) {\n                            errorHandler!!.handleApiError(it)\n                        } else Completable.error(it)\n                    }");
        return completableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postCompletable$lambda-7, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3043postCompletable$lambda7(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.String endpoint, java.lang.Object obj, java.util.Map queries, java.util.Map it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "$endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "$queries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP http = this$0.getHttp();
        java.lang.String strAppendBaseUrl = this$0.appendBaseUrl(endpoint);
        java.util.Map<java.lang.String, java.lang.String> mapPlus = kotlin.collections.MapsKt.plus(it, kotlin.collections.MapsKt.mapOf(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientKt.getContentTypeJSON(), powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientKt.getAcceptTypeJSON()));
        java.lang.String json = this$0.gson.toJson(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(body)");
        return http.postCompletable(strAppendBaseUrl, mapPlus, json, queries).subscribeOn(io.reactivex.schedulers.Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postCompletable$lambda-8, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3044postCompletable$lambda8(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler = this$0.errorHandler;
        if (cloudErrorHandler != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cloudErrorHandler);
            return cloudErrorHandler.handleApiError(it);
        }
        return io.reactivex.Completable.error(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient
    public <RESPONSE_BODY> io.reactivex.Single<RESPONSE_BODY> postMultiPartWithResponse(final java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, final java.util.Map<java.lang.String, java.lang.String> queries, final okhttp3.MultipartBody.Part dataPart, final java.lang.Class<RESPONSE_BODY> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "queries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPart, "dataPart");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        io.reactivex.Single<RESPONSE_BODY> map = requestToken(null).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$hVn-S4RibNV_dc2LPQII0hBB9Ls
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3049postMultiPartWithResponse$lambda9(this.f$0, endpoint, queries, dataPart, (java.util.Map) obj);
            }
        }).onErrorResumeNext((io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends R>>) new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$y_p6nhd5qhrFrt-qiqAhFJWb1OA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3047postMultiPartWithResponse$lambda10(this.f$0, (java.lang.Throwable) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$Fa7AxGx0FnvLVc7BVIc--VSGSoc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3048postMultiPartWithResponse$lambda11(this.f$0, type, (java.lang.String) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "requestToken(null)\n                .flatMap {\n                    //                    val multipartBody = MultipartBody.Builder()\n//                            .setType(MultipartBody.FORM)\n//                            .addPart(RequestBody.create(MultipartBody.FORM, dataParts.get(\"file\")!!))\n//                            .build()\n\n\n                    http.uploadFileWithResponse(endpoint.appendBaseUrl(), it + mimeType, queries = queries, dataPart = dataPart)\n                            .subscribeOn(Schedulers.io())\n\n                }.onErrorResumeNext {\n                    if (errorHandler != null) {\n                        errorHandler!!.handleApiError(it).andThen(Single.error(it))\n                    } else Completable.error(it).andThen(Single.error(it))\n                }\n                .map {\n                    gson.fromJson<RESPONSE_BODY>(it, type)\n                }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postMultiPartWithResponse$lambda-9, reason: not valid java name */
    public static final io.reactivex.SingleSource m3049postMultiPartWithResponse$lambda9(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.String endpoint, java.util.Map queries, okhttp3.MultipartBody.Part dataPart, java.util.Map it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "$endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "$queries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPart, "$dataPart");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.getHttp().uploadFileWithResponse(this$0.appendBaseUrl(endpoint), kotlin.collections.MapsKt.plus(it, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientKt.getMimeType()), queries, dataPart).subscribeOn(io.reactivex.schedulers.Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postMultiPartWithResponse$lambda-10, reason: not valid java name */
    public static final io.reactivex.SingleSource m3047postMultiPartWithResponse$lambda10(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler = this$0.errorHandler;
        if (cloudErrorHandler != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cloudErrorHandler);
            return cloudErrorHandler.handleApiError(it).andThen(io.reactivex.Single.error(it));
        }
        return io.reactivex.Completable.error(it).andThen(io.reactivex.Single.error(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postMultiPartWithResponse$lambda-11, reason: not valid java name */
    public static final java.lang.Object m3048postMultiPartWithResponse$lambda11(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.Class type, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "$type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.gson.fromJson(it, type);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient
    public io.reactivex.Completable postMultiPart(final java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, final java.util.Map<java.lang.String, java.lang.String> queries, @retrofit2.http.Part final okhttp3.MultipartBody.Part dataPart) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "queries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPart, "dataPart");
        io.reactivex.Completable completableOnErrorResumeNext = requestToken(headers).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$M6PXm2ZBCD_AxB6HWvcyADR7p4M
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3045postMultiPart$lambda12(this.f$0, endpoint, queries, dataPart, (java.util.Map) obj);
            }
        }).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$Ex4y3Cwgk52THzzRcQnp2mvslqY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3046postMultiPart$lambda13(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "requestToken(headers)\n                .flatMapCompletable {\n//                    val multipartBody = MultipartBody.Builder()\n//                            .setType(MultipartBody.FORM)\n//                            .addPart(RequestBody.create(MultipartBody.FORM, dataParts.get(\"file\")!!))\n//                            .build()\n\n                    http.uploadFile(endpoint.appendBaseUrl(), it + mimeType, queries = queries, dataPart = dataPart)\n                            .subscribeOn(Schedulers.io())\n\n                }.onErrorResumeNext {\n                    if (errorHandler != null) {\n                        errorHandler!!.handleApiError(it)\n                    } else Completable.error(it)\n                }");
        return completableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postMultiPart$lambda-12, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3045postMultiPart$lambda12(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.String endpoint, java.util.Map queries, okhttp3.MultipartBody.Part dataPart, java.util.Map it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "$endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "$queries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPart, "$dataPart");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.getHttp().uploadFile(this$0.appendBaseUrl(endpoint), kotlin.collections.MapsKt.plus(it, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientKt.getMimeType()), queries, dataPart).subscribeOn(io.reactivex.schedulers.Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: postMultiPart$lambda-13, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3046postMultiPart$lambda13(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler = this$0.errorHandler;
        if (cloudErrorHandler != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cloudErrorHandler);
            return cloudErrorHandler.handleApiError(it);
        }
        return io.reactivex.Completable.error(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient
    public io.reactivex.Completable getCompletable(final java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, final java.util.Map<java.lang.String, java.lang.String> queries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "queries");
        io.reactivex.Completable completableOnErrorResumeNext = requestToken(headers).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$e6TkPP2wnK7WJl08TP_8r4Slwz8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3035getCompletable$lambda14(this.f$0, endpoint, queries, (java.util.Map) obj);
            }
        }).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$l3Acz2EJhdn4vPx7zbPIV9S1HhI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3036getCompletable$lambda15(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "requestToken(headers)\n                    .flatMapCompletable {\n                        http.getCompletable(endpoint.appendBaseUrl(), it\n                                + mapOf(contentTypeJSON, acceptTypeJSON), queries)\n                                .subscribeOn(Schedulers.io())\n                    }.onErrorResumeNext {\n                        if (errorHandler != null) {\n                            errorHandler!!.handleApiError(it)\n                        } else Completable.error(it)\n                    }");
        return completableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCompletable$lambda-14, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3035getCompletable$lambda14(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.String endpoint, java.util.Map queries, java.util.Map it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "$endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "$queries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.getHttp().getCompletable(this$0.appendBaseUrl(endpoint), kotlin.collections.MapsKt.plus(it, kotlin.collections.MapsKt.mapOf(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientKt.getContentTypeJSON(), powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientKt.getAcceptTypeJSON())), queries).subscribeOn(io.reactivex.schedulers.Schedulers.io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCompletable$lambda-15, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3036getCompletable$lambda15(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler cloudErrorHandler = this$0.errorHandler;
        if (cloudErrorHandler != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cloudErrorHandler);
            return cloudErrorHandler.handleApiError(it);
        }
        return io.reactivex.Completable.error(it);
    }

    private final io.reactivex.Single<java.util.Map<java.lang.String, java.lang.String>> requestToken(final java.util.Map<java.lang.String, java.lang.String> headers) {
        io.reactivex.Single<java.util.Map<java.lang.String, java.lang.String>> singleDefer = io.reactivex.Single.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$4rOHCptSraLkmdnrVQGp5LQnF1k
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3053requestToken$lambda18(this.f$0, headers);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDefer, "defer {\n            val response = headerProvider!!.firstOrError()\n\n            val request = Single.create<Unit> {\n                tokenRequest?.invoke()\n                it.onSuccess(Unit)\n            }\n\n            if (headers != null) {\n                return@defer Single.just(headers)\n            }\n            Single.zip(response, request, BiFunction<Headers, Unit, Headers> { responseHeaders, _ ->\n                responseHeaders\n            })\n        }");
        return singleDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: requestToken$lambda-18, reason: not valid java name */
    public static final io.reactivex.SingleSource m3053requestToken$lambda18(final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.reactivex.Observable<java.util.Map<java.lang.String, java.lang.String>> observable = this$0.headerProvider;
        kotlin.jvm.internal.Intrinsics.checkNotNull(observable);
        io.reactivex.Single<java.util.Map<java.lang.String, java.lang.String>> singleFirstOrError = observable.firstOrError();
        io.reactivex.Single singleCreate = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$ZEfzZWCqoNbaWMk5DMkThAFhh9g
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3054requestToken$lambda18$lambda16(this.f$0, singleEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleCreate, "create<Unit> {\n                tokenRequest?.invoke()\n                it.onSuccess(Unit)\n            }");
        if (map != null) {
            return io.reactivex.Single.just(map);
        }
        return io.reactivex.Single.zip(singleFirstOrError, singleCreate, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.http.-$$Lambda$HttpClientImpl$Ro4RRHW4D75mExIJxzakA-OndVo
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl.m3055requestToken$lambda18$lambda17((java.util.Map) obj, (kotlin.Unit) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: requestToken$lambda-18$lambda-16, reason: not valid java name */
    public static final void m3054requestToken$lambda18$lambda16(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClientImpl this$0, io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this$0.tokenRequest;
        if (function0 != null) {
            function0.invoke();
        }
        it.onSuccess(kotlin.Unit.INSTANCE);
    }

    private final java.lang.String appendBaseUrl(java.lang.String str) {
        return kotlin.jvm.internal.Intrinsics.stringPlus(this.baseURL, str);
    }
}
