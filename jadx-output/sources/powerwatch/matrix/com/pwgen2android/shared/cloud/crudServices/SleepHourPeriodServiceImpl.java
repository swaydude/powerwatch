package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: SleepPeriodServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\tJ+\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f0\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000eH\u0096\u0001¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepHourPeriodServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepHourPeriodService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "endpoint", "", "getAllService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V", "all", "Lio/reactivex/Single;", "", "queryParams", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepHourPeriodServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> $$delegate_0;

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod>> all(java.util.Map<java.lang.String, java.lang.String> queryParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        return this.$$delegate_0.all(queryParams);
    }

    public SleepHourPeriodServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, java.lang.String endpoint, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> getAllService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllService, "getAllService");
        this.$$delegate_0 = getAllService;
    }

    public /* synthetic */ SleepHourPeriodServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, java.lang.String str, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService getAllService, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodServiceImpl.1
            }.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<List<SleepHourPeriod>>() {}.type");
            getAllService = new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllServiceImpl(httpClient, str, type);
        }
        this(httpClient, str, getAllService);
    }
}
