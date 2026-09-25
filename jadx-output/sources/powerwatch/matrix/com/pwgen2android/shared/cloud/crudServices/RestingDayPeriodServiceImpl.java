package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: RestingPeriodServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\tJ+\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f0\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096\u0001¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingDayPeriodServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingDayPeriodService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "periodConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;", "getAllService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V", "all", "Lio/reactivex/Single;", "", "queryParams", "", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RestingDayPeriodServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingDayPeriodService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> $$delegate_0;

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod>> all(java.util.Map<java.lang.String, java.lang.String> queryParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        return this.$$delegate_0.all(queryParams);
    }

    public RestingDayPeriodServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig periodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> getAllService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodConfig, "periodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllService, "getAllService");
        this.$$delegate_0 = getAllService;
    }

    public /* synthetic */ RestingDayPeriodServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodConfig periodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService getAllService, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            java.lang.String getAllEndpoint = periodConfig.getCrudServiceConfig().getGetAllEndpoint();
            java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingDayPeriodServiceImpl.1
            }.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<List<RestingDayPeriod>>() {}.type");
            getAllService = new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllServiceImpl(httpClient, getAllEndpoint, type);
        }
        this(httpClient, periodConfig, getAllService);
    }
}
