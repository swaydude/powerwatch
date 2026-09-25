package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: CrudServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadJSONServiceImpl;", "", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;)V", "downloadJson", "Lio/reactivex/Single;", "RESPONSE_BODY", "downloadUrl", "", "type", "Ljava/lang/reflect/Type;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DownloadJSONServiceImpl {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient;

    public DownloadJSONServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    public final <RESPONSE_BODY> io.reactivex.Single<RESPONSE_BODY> downloadJson(java.lang.String downloadUrl, java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return this.httpClient.downloadJSON(downloadUrl, type);
    }
}
