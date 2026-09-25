package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: UpdateInfoService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\tJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH\u0096\u0001¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "updateInfoConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoConfig;", "getService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;)V", "get", "Lio/reactivex/Single;", "queries", "", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UpdateInfoServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> $$delegate_0;

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> get(java.util.Map<java.lang.String, java.lang.String> queries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "queries");
        return this.$$delegate_0.get(queries);
    }

    public UpdateInfoServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoConfig updateInfoConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> getService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoConfig, "updateInfoConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getService, "getService");
        this.$$delegate_0 = getService;
    }

    public /* synthetic */ UpdateInfoServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoConfig updateInfoConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService getService, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            java.lang.String getEndpoint = updateInfoConfig.getCrudServiceConfig().getGetEndpoint();
            java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoServiceImpl.1
            }.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<UpdateInfo>() {}.type");
            getService = new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetServiceImpl(httpClient, getEndpoint, type);
        }
        this(httpClient, updateInfoConfig, getService);
    }
}
