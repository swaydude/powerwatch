package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: DownloadFileService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0096\u0001¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadFileServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "downloadService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;)V", "download", "Lio/reactivex/Single;", "", "downloadUrl", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DownloadFileServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService $$delegate_0;

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService
    public io.reactivex.Single<byte[]> download(java.lang.String downloadUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        return this.$$delegate_0.download(downloadUrl);
    }

    public DownloadFileServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService downloadService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadService, "downloadService");
        this.$$delegate_0 = downloadService;
    }

    public /* synthetic */ DownloadFileServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadServiceImpl downloadServiceImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClient, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadServiceImpl(httpClient) : downloadServiceImpl);
    }
}
