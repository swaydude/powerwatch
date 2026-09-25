package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: DeviceService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u00042\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u00062\b\u0012\u0004\u0012\u00020\u00030\u0007Be\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\u0004\u0018\u0001`\u0018H\u0096\u0001J+\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0\u001a2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0096\u0001J'\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0096\u0001J%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0096\u0001J\u0011\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0001¨\u0006\""}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "deviceConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;", "getService", "deleteService", "addService", "updateService", "getAllService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;)V", "add", "Lio/reactivex/Completable;", "item", "headers", "", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "all", "Lio/reactivex/Single;", "", "queryParams", "delete", "params", "get", "queries", "update", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> $$delegate_0;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> $$delegate_1;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> $$delegate_2;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> $$delegate_3;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> $$delegate_4;

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public io.reactivex.Completable add2(powerwatch.matrix.com.pwgen2android.shared.data.models.Device item, java.util.Map<java.lang.String, java.lang.String> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return this.$$delegate_1.add(item, headers);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>> all(java.util.Map<java.lang.String, java.lang.String> queryParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        return this.$$delegate_4.all(queryParams);
    }

    /* JADX INFO: renamed from: delete, reason: avoid collision after fix types in other method */
    public io.reactivex.Completable delete2(powerwatch.matrix.com.pwgen2android.shared.data.models.Device item, java.util.Map<java.lang.String, java.lang.String> params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        return this.$$delegate_2.delete(item, params);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> get(java.util.Map<java.lang.String, java.lang.String> queries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "queries");
        return this.$$delegate_0.get(queries);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService
    public io.reactivex.Completable update(powerwatch.matrix.com.pwgen2android.shared.data.models.Device item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return this.$$delegate_3.update(item);
    }

    public DeviceServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceConfig deviceConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> getService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> deleteService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> addService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> updateService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> getAllService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceConfig, "deviceConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getService, "getService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteService, "deleteService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addService, "addService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateService, "updateService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllService, "getAllService");
        this.$$delegate_0 = getService;
        this.$$delegate_1 = addService;
        this.$$delegate_2 = deleteService;
        this.$$delegate_3 = updateService;
        this.$$delegate_4 = getAllService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService
    public /* bridge */ /* synthetic */ io.reactivex.Completable add(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, java.util.Map map) {
        return add2(device, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService
    public /* bridge */ /* synthetic */ io.reactivex.Completable delete(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, java.util.Map map) {
        return delete2(device, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public /* synthetic */ DeviceServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.device.DeviceConfig deviceConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService getService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService deleteService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService addService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService updateService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService getAllService, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService getServiceImpl;
        powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService getAllServiceImpl;
        if ((i & 4) != 0) {
            java.lang.String getEndpoint = deviceConfig.getCrudServiceConfig().getGetEndpoint();
            java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.ArrayList<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceServiceImpl.1
            }.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<ArrayList<Device>>() {}.type");
            getServiceImpl = new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetServiceImpl(httpClient, getEndpoint, type);
        } else {
            getServiceImpl = getService;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService deleteServiceImpl = (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteServiceImpl(httpClient, deviceConfig.getCrudServiceConfig().getDeleteEndpoint()) : deleteService;
        powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService addServiceImpl = (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddServiceImpl(httpClient, deviceConfig.getCrudServiceConfig().getAddEndpoint()) : addService;
        powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService updateServiceImpl = (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateServiceImpl(httpClient, deviceConfig.getCrudServiceConfig().getUpdateEndpoint()) : updateService;
        if ((i & 64) != 0) {
            java.lang.String getAllEndpoint = deviceConfig.getCrudServiceConfig().getGetAllEndpoint();
            java.lang.reflect.Type type2 = new com.google.gson.reflect.TypeToken<java.util.ArrayList<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeviceServiceImpl.2
            }.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "object : TypeToken<ArrayList<Device>>() {}.type");
            getAllServiceImpl = new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllServiceImpl(httpClient, getAllEndpoint, type2);
        } else {
            getAllServiceImpl = getAllService;
        }
        this(httpClient, deviceConfig, getServiceImpl, deleteServiceImpl, addServiceImpl, updateServiceImpl, getAllServiceImpl);
    }
}
