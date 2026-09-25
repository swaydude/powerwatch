package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: CrudServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateServiceImpl;", "Entity", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "endpoint", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;)V", "update", "Lio/reactivex/Completable;", "item", "(Ljava/lang/Object;)Lio/reactivex/Completable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UpdateServiceImpl<Entity> implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<Entity> {
    private final java.lang.String endpoint;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient;

    public UpdateServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, java.lang.String endpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.httpClient = httpClient;
        this.endpoint = endpoint;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService
    public io.reactivex.Completable update(Entity item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.DefaultImpls.postCompletable$default(this.httpClient, this.endpoint, null, item, null, 10, null);
    }
}
