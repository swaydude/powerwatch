package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: LogUploadService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J2\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UploadService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadResponse;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "configuration", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadConfiguration;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/LogUploadConfiguration;)V", "uploadFile", "Lio/reactivex/Single;", "binaryStream", "", "filename", "", "queryMap", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LogUploadService implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UploadService<powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadResponse> {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadConfiguration configuration;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient;

    public LogUploadService(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadConfiguration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.httpClient = httpClient;
        this.configuration = configuration;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UploadService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadResponse> uploadFile(final byte[] binaryStream, final java.lang.String filename, final java.util.Map<java.lang.String, java.lang.String> queryMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryStream, "binaryStream");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filename, "filename");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryMap, "queryMap");
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadResponse> singleFlatMap = io.reactivex.Single.just(binaryStream).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.-$$Lambda$LogUploadService$h2W3mLpb4mdTX2cNDytZk2UAaFk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService.m3029uploadFile$lambda0(filename, binaryStream, queryMap, (byte[]) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.-$$Lambda$LogUploadService$3QpMF72jKlpnCfEauoT2pGkj6AM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService.m3030uploadFile$lambda1(this.f$0, (kotlin.Pair) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "just(binaryStream)\n                .map {\n                    val multipartBody = MultipartBody.Part.createFormData(\n                            \"file\", filename,\n                            RequestBody.create(MultipartBody.FORM, binaryStream)\n                    )\n                    Pair(queryMap, multipartBody)\n                    //val multiPart = Pair(\"Content-Type\", \"multipart/form-data\")\n                }.flatMap {\n                    httpClient.postMultiPartWithResponse(configuration.uploadFileURL, headers = null,\n                            queries = it.first, dataPart = it.second, type = LogUploadResponse::class.java)\n                }");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uploadFile$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m3029uploadFile$lambda0(java.lang.String filename, byte[] binaryStream, java.util.Map queryMap, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filename, "$filename");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryStream, "$binaryStream");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryMap, "$queryMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(queryMap, okhttp3.MultipartBody.Part.createFormData("file", filename, okhttp3.RequestBody.create(okhttp3.MultipartBody.FORM, binaryStream)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uploadFile$lambda-1, reason: not valid java name */
    public static final io.reactivex.SingleSource m3030uploadFile$lambda1(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadService this$0, kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient = this$0.httpClient;
        java.lang.String uploadFileURL = this$0.configuration.getUploadFileURL();
        java.util.Map<java.lang.String, java.lang.String> map = (java.util.Map) it.getFirst();
        java.lang.Object second = it.getSecond();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(second, "it.second");
        return httpClient.postMultiPartWithResponse(uploadFileURL, null, map, (okhttp3.MultipartBody.Part) second, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.LogUploadResponse.class);
    }
}
