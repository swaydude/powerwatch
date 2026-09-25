package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: UserActivityServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\u0012\u0004\u0012\u00020\u00040\u00052\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0012\u0004\u0012\u00020\u00040\u0007B[\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0002\u0010\u0010J5\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\u0096\u0001J+\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0096\u0001J'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0096\u0001J(\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00030\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0011\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0096\u0001R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "config", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;", "getAllService", "addService", "deleteService", "updateService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;)V", "add", "Lio/reactivex/Completable;", "item", "headers", "", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "all", "Lio/reactivex/Single;", "queryParams", "delete", "params", "getAllUserActivityDates", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;", "update", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserActivityServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> $$delegate_0;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> $$delegate_1;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> $$delegate_2;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> $$delegate_3;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig config;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient;

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public io.reactivex.Completable add2(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> item, java.util.Map<java.lang.String, java.lang.String> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return this.$$delegate_0.add(item, headers);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> all(java.util.Map<java.lang.String, java.lang.String> queryParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        return this.$$delegate_1.all(queryParams);
    }

    /* JADX INFO: renamed from: delete, reason: avoid collision after fix types in other method */
    public io.reactivex.Completable delete2(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession item, java.util.Map<java.lang.String, java.lang.String> params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        return this.$$delegate_2.delete(item, params);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService
    public io.reactivex.Completable update(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return this.$$delegate_3.update(item);
    }

    public UserActivityServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig config, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> getAllService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> addService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> deleteService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> updateService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllService, "getAllService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addService, "addService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteService, "deleteService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateService, "updateService");
        this.httpClient = httpClient;
        this.config = config;
        this.$$delegate_0 = addService;
        this.$$delegate_1 = getAllService;
        this.$$delegate_2 = deleteService;
        this.$$delegate_3 = updateService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService
    public /* bridge */ /* synthetic */ io.reactivex.Completable add(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> list, java.util.Map map) {
        return add2((java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>) list, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService
    public /* bridge */ /* synthetic */ io.reactivex.Completable delete(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession, java.util.Map map) {
        return delete2(userActivitySession, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public /* synthetic */ UserActivityServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityConfig userActivityConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService getAllService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddServiceImpl addServiceImpl, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteServiceImpl deleteServiceImpl, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateServiceImpl updateServiceImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            java.lang.String dayEndpoint = userActivityConfig.getDayEndpoint();
            java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityServiceImpl.1
            }.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<List<UserActivitySession>>() {}.type");
            getAllService = new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllServiceImpl(httpClient, dayEndpoint, type);
        }
        this(httpClient, userActivityConfig, getAllService, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddServiceImpl(httpClient, userActivityConfig.getCrudServiceConfig().getAddEndpoint()) : addServiceImpl, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteServiceImpl(httpClient, userActivityConfig.getCrudServiceConfig().getDeleteEndpoint()) : deleteServiceImpl, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateServiceImpl(httpClient, userActivityConfig.getCrudServiceConfig().getUpdateEndpoint()) : updateServiceImpl);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>> getAllUserActivityDates(java.util.Map<java.lang.String, java.lang.String> params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient = this.httpClient;
        java.lang.String activityDatesEndpoint = this.config.getActivityDatesEndpoint();
        java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityServiceImpl.getAllUserActivityDates.1
        }.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<List<UserActivityDate>>() {}.type");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.DefaultImpls.get$default(httpClient, activityDatesEndpoint, null, params, type, 2, null);
    }
}
