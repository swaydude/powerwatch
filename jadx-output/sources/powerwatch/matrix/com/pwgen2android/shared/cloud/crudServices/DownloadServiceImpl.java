package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: CrudServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;)V", "download", "Lio/reactivex/Single;", "", "downloadUrl", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DownloadServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient;

    public DownloadServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService
    public io.reactivex.Single<byte[]> download(java.lang.String downloadUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        io.reactivex.Single map = this.httpClient.download(downloadUrl).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.-$$Lambda$DownloadServiceImpl$txCEhrRtcyUcx8hjZy6lrPnhtqk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadServiceImpl.m3028download$lambda0((okhttp3.ResponseBody) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "httpClient.download(downloadUrl)\n                .map { it.bytes() }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: download$lambda-0, reason: not valid java name */
    public static final byte[] m3028download$lambda0(okhttp3.ResponseBody it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.bytes();
    }
}
