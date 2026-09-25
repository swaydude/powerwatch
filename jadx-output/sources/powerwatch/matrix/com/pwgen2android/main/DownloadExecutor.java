package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: DownloadExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;", "", "downloadService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadService;)V", "power", "", "getPower", "()F", "setPower", "(F)V", "execute", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "", "url", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class DownloadExecutor {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService downloadService;
    private float power;

    public DownloadExecutor(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadService downloadService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadService, "downloadService");
        this.downloadService = downloadService;
        this.power = 1.0f;
    }

    public final float getPower() {
        return this.power;
    }

    public final void setPower(float f) {
        this.power = f;
    }

    public final io.reactivex.Observable<kotlin.Pair<java.lang.Integer, byte[]>> execute(final java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        io.reactivex.Observable<kotlin.Pair<java.lang.Integer, byte[]>> observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$DownloadExecutor$MrdiV72AzryP66vOfk3i6scfRts
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.main.DownloadExecutor.m1532execute$lambda1(url, this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n            if (url.isEmpty()) {\n                return@defer Observable.error<Pair<Int, ByteArray>>(OTAError.FileDownload(\"Download url not valid.\"))\n            }\n            return@defer downloadService.download(url)\n                    .map { Pair(100, it) }.toObservable()\n        }");
        return observableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1532execute$lambda1(java.lang.String url, powerwatch.matrix.com.pwgen2android.main.DownloadExecutor this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "$url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (url.length() == 0) {
            return io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.main.OTAError.FileDownload("Download url not valid."));
        }
        return this$0.downloadService.download(url).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$DownloadExecutor$mjPA9Om4gV5C-KQlvsedJ-aKKQo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.DownloadExecutor.m1533execute$lambda1$lambda0((byte[]) obj);
            }
        }).toObservable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-1$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m1533execute$lambda1$lambda0(byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(100, it);
    }
}
