package powerwatch.matrix.com.pwgen2android.shared.cloud.http;

/* JADX INFO: compiled from: HTTP.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'JH\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0018\b\u0001\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nj\u0002`\u000b2\u0014\b\u0003\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH'JB\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0018\b\u0001\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nj\u0002`\u000b2\u0014\b\u0003\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH'JL\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0018\b\u0001\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nj\u0002`\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u00062\u0014\b\u0003\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH'JR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0018\b\u0001\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nj\u0002`\u000b2\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0001\u0010\u0010\u001a\u00020\u0006H'JL\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0018\b\u0001\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nj\u0002`\u000b2\u0014\b\u0003\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0001\u0010\u0013\u001a\u00020\u0014H'JR\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0018\b\u0001\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nj\u0002`\u000b2\u0014\b\u0003\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0001\u0010\u0013\u001a\u00020\u0014H'¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;", "", "downloadFile", "Lio/reactivex/Single;", "Lokhttp3/ResponseBody;", "url", "", "downloadJSONFile", "get", "headers", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "queries", "getCompletable", "Lio/reactivex/Completable;", "postCompletable", "body", "postSingle", "uploadFile", "dataPart", "Lokhttp3/MultipartBody$Part;", "uploadFileWithResponse", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface HTTP {
    @retrofit2.http.Streaming
    @retrofit2.http.GET
    io.reactivex.Single<okhttp3.ResponseBody> downloadFile(@retrofit2.http.Url java.lang.String url);

    @retrofit2.http.GET
    io.reactivex.Single<java.lang.String> downloadJSONFile(@retrofit2.http.Url java.lang.String url);

    @retrofit2.http.GET
    io.reactivex.Single<java.lang.String> get(@retrofit2.http.Url java.lang.String url, @retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> headers, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> queries);

    @retrofit2.http.GET
    io.reactivex.Completable getCompletable(@retrofit2.http.Url java.lang.String url, @retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> headers, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> queries);

    @retrofit2.http.POST
    io.reactivex.Completable postCompletable(@retrofit2.http.Url java.lang.String url, @retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> headers, @retrofit2.http.Body java.lang.String body, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> queries);

    @retrofit2.http.POST
    io.reactivex.Single<java.lang.String> postSingle(@retrofit2.http.Url java.lang.String url, @retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> headers, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> queries, @retrofit2.http.Body java.lang.String body);

    @retrofit2.http.POST
    @retrofit2.http.Multipart
    io.reactivex.Completable uploadFile(@retrofit2.http.Url java.lang.String url, @retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> headers, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> queries, @retrofit2.http.Part okhttp3.MultipartBody.Part dataPart);

    @retrofit2.http.POST
    @retrofit2.http.Multipart
    io.reactivex.Single<java.lang.String> uploadFileWithResponse(@retrofit2.http.Url java.lang.String url, @retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> headers, @retrofit2.http.QueryMap java.util.Map<java.lang.String, java.lang.String> queries, @retrofit2.http.Part okhttp3.MultipartBody.Part dataPart);

    /* JADX INFO: compiled from: HTTP.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Completable postCompletable$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP http, java.lang.String str, java.util.Map map, java.lang.String str2, java.util.Map map2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postCompletable");
            }
            if ((i & 8) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return http.postCompletable(str, map, str2, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Single get$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP http, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i & 4) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return http.get(str, map, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Completable getCompletable$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP http, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCompletable");
            }
            if ((i & 4) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return http.getCompletable(str, map, map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Completable uploadFile$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP http, java.lang.String str, java.util.Map map, java.util.Map map2, okhttp3.MultipartBody.Part part, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadFile");
            }
            if ((i & 4) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return http.uploadFile(str, map, map2, part);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Single uploadFileWithResponse$default(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HTTP http, java.lang.String str, java.util.Map map, java.util.Map map2, okhttp3.MultipartBody.Part part, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadFileWithResponse");
            }
            if ((i & 4) != 0) {
                map2 = kotlin.collections.MapsKt.emptyMap();
            }
            return http.uploadFileWithResponse(str, map, map2, part);
        }
    }
}
