package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: GoalConfigurationService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u00042\b\u0012\u0004\u0012\u00020\u00030\u0005BE\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014H\u0096\u0001J+\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170\u00162\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001J'\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "goalConfigurationConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;", "deleteService", "addService", "getAllService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V", "add", "Lio/reactivex/Completable;", "item", "headers", "", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "all", "Lio/reactivex/Single;", "", "queryParams", "delete", "params", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GoalConfigurationServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> $$delegate_0;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> $$delegate_1;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> $$delegate_2;

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public io.reactivex.Completable add2(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration item, java.util.Map<java.lang.String, java.lang.String> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return this.$$delegate_0.add(item, headers);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>> all(java.util.Map<java.lang.String, java.lang.String> queryParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        return this.$$delegate_2.all(queryParams);
    }

    /* JADX INFO: renamed from: delete, reason: avoid collision after fix types in other method */
    public io.reactivex.Completable delete2(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration item, java.util.Map<java.lang.String, java.lang.String> params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        return this.$$delegate_1.delete(item, params);
    }

    public GoalConfigurationServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationConfig goalConfigurationConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> deleteService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> addService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> getAllService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationConfig, "goalConfigurationConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteService, "deleteService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addService, "addService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllService, "getAllService");
        this.$$delegate_0 = addService;
        this.$$delegate_1 = deleteService;
        this.$$delegate_2 = getAllService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService
    public /* bridge */ /* synthetic */ io.reactivex.Completable add(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration, java.util.Map map) {
        return add2(goalConfiguration, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService
    public /* bridge */ /* synthetic */ io.reactivex.Completable delete(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration, java.util.Map map) {
        return delete2(goalConfiguration, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public /* synthetic */ GoalConfigurationServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationConfig goalConfigurationConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteServiceImpl deleteServiceImpl, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddServiceImpl addServiceImpl, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService getAllService, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService deleteServiceImpl2 = (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteServiceImpl(httpClient, goalConfigurationConfig.getCrudServiceConfig().getDeleteEndpoint()) : deleteServiceImpl;
        powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService addServiceImpl2 = (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddServiceImpl(httpClient, goalConfigurationConfig.getCrudServiceConfig().getAddEndpoint()) : addServiceImpl;
        if ((i & 16) != 0) {
            java.lang.String getAllEndpoint = goalConfigurationConfig.getCrudServiceConfig().getGetAllEndpoint();
            java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.ArrayList<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationServiceImpl.1
            }.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<ArrayList<GoalConfiguration>>() {}.type");
            getAllService = new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllServiceImpl(httpClient, getAllEndpoint, type);
        }
        this(httpClient, goalConfigurationConfig, deleteServiceImpl2, addServiceImpl2, getAllService);
    }
}
