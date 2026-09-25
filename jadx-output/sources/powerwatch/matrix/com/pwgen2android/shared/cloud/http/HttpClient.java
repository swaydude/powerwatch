package powerwatch.matrix.com.pwgen2android.shared.cloud.http;

/* JADX INFO: compiled from: HttpClient.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&JX\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0014\b\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\t\u001a\u00020\nH&JD\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rH&J[\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u0001H\u00132\u0014\b\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rH&¢\u0006\u0002\u0010\u0015JN\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0014\b\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H&Jh\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0014\b\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0001\u0010\u0017\u001a\u00020\u00182\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u001aH&Ju\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00062\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u0001H\u00132\u0014\b\u0003\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\b0\u001aH&¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H&J4\u0010\"\u001a\u00020\u001f2\u001c\u0010#\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u000e0$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0&H&¨\u0006'"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "", "download", "Lio/reactivex/Single;", "Lokhttp3/ResponseBody;", "endpoint", "", "downloadJSON", "RESPONSE_BODY", "type", "Ljava/lang/reflect/Type;", "get", "headers", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "queries", "getCompletable", "Lio/reactivex/Completable;", "postCompletable", "REQUEST_BODY", "body", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;", "postMultiPart", "dataPart", "Lokhttp3/MultipartBody$Part;", "postMultiPartWithResponse", "Ljava/lang/Class;", "postSingle", "clazz", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Class;)Lio/reactivex/Single;", "setErrorHandler", "", "apiErrorHandler", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;", "setHeadersProvider", "headerProvider", "Lio/reactivex/Observable;", "tokenRequest", "Lkotlin/Function0;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface HttpClient {
    io.reactivex.Single<okhttp3.ResponseBody> download(java.lang.String endpoint);

    <RESPONSE_BODY> io.reactivex.Single<RESPONSE_BODY> downloadJSON(java.lang.String endpoint, java.lang.reflect.Type type);

    <RESPONSE_BODY> io.reactivex.Single<RESPONSE_BODY> get(java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> queries, java.lang.reflect.Type type);

    io.reactivex.Completable getCompletable(java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, java.util.Map<java.lang.String, java.lang.String> queries);

    <REQUEST_BODY> io.reactivex.Completable postCompletable(java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, REQUEST_BODY body, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> queries);

    io.reactivex.Completable postMultiPart(java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> queries, @retrofit2.http.Part okhttp3.MultipartBody.Part dataPart);

    <RESPONSE_BODY> io.reactivex.Single<RESPONSE_BODY> postMultiPartWithResponse(java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> queries, @retrofit2.http.Part okhttp3.MultipartBody.Part dataPart, java.lang.Class<RESPONSE_BODY> type);

    <REQUEST_BODY, RESPONSE_BODY> io.reactivex.Single<RESPONSE_BODY> postSingle(java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, REQUEST_BODY body, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> queries, java.lang.Class<RESPONSE_BODY> clazz);

    void setErrorHandler(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorHandler apiErrorHandler);

    void setHeadersProvider(io.reactivex.Observable<java.util.Map<java.lang.String, java.lang.String>> headerProvider, kotlin.jvm.functions.Function0<kotlin.Unit> tokenRequest);

    /* JADX INFO: compiled from: HttpClient.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Completable postCompletable$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, java.lang.String str, java.util.Map map, java.lang.Object obj, java.util.Map map2, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postCompletable");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            if ((i & 4) != 0) {
                obj = null;
            }
            if ((i & 8) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return httpClient.postCompletable(str, map, obj, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Single postSingle$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, java.lang.String str, java.util.Map map, java.lang.Object obj, java.util.Map map2, java.lang.Class cls, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postSingle");
            }
            if ((i & 2) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            java.util.Map map3 = map;
            if ((i & 4) != 0) {
                obj = null;
            }
            java.lang.Object obj3 = obj;
            if ((i & 8) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return httpClient.postSingle(str, map3, obj3, map2, cls);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Single get$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, java.lang.String str, java.util.Map map, java.util.Map map2, java.lang.reflect.Type type, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            if ((i & 4) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return httpClient.get(str, map, map2, type);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Completable getCompletable$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCompletable");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            if ((i & 4) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return httpClient.getCompletable(str, map, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Single postMultiPartWithResponse$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, java.lang.String str, java.util.Map map, java.util.Map map2, okhttp3.MultipartBody.Part part, java.lang.Class cls, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postMultiPartWithResponse");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            java.util.Map map3 = map;
            if ((i & 4) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return httpClient.postMultiPartWithResponse(str, map3, map2, part, cls);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Completable postMultiPart$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, java.lang.String str, java.util.Map map, java.util.Map map2, okhttp3.MultipartBody.Part part, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postMultiPart");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            if ((i & 4) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return httpClient.postMultiPart(str, map, map2, part);
        }
    }
}
