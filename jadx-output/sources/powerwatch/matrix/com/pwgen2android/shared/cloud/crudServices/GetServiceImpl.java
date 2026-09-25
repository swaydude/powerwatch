package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: CrudServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetServiceImpl;", "Entity", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "endpoint", "", "type", "Ljava/lang/reflect/Type;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Ljava/lang/reflect/Type;)V", "get", "Lio/reactivex/Single;", "queries", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GetServiceImpl<Entity> implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<Entity> {
    private final java.lang.String endpoint;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient;
    private final java.lang.reflect.Type type;

    public GetServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, java.lang.String endpoint, java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        this.httpClient = httpClient;
        this.endpoint = endpoint;
        this.type = type;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService
    public io.reactivex.Single<Entity> get(java.util.Map<java.lang.String, java.lang.String> queries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "queries");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.DefaultImpls.get$default(this.httpClient, this.endpoint, null, queries, this.type, 2, null);
    }
}
