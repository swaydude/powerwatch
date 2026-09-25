package powerwatch.matrix.com.pwgen2android.shared.cloud.metrics;

/* JADX INFO: compiled from: MetricsService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¢\u0006\u0002\u0010\tJ2\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0016R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "metricsConfiguration", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/MetricsConfiguration;", "addService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/MetricsConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;)V", "add", "Lio/reactivex/Completable;", "item", "headers", "", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MetricsService implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.HostEvent>> {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.metrics.HostEvent>> addService;

    public MetricsService(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.MetricsConfiguration metricsConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.metrics.HostEvent>> addService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsConfiguration, "metricsConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addService, "addService");
        this.addService = addService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService
    public /* bridge */ /* synthetic */ io.reactivex.Completable add(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.HostEvent> list, java.util.Map map) {
        return add2(list, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public /* synthetic */ MetricsService(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.MetricsConfiguration metricsConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddServiceImpl addServiceImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClient, metricsConfiguration, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddServiceImpl(httpClient, metricsConfiguration.getDeviceEventConfiguration().getAddEndpoint()) : addServiceImpl);
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public io.reactivex.Completable add2(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.HostEvent> item, java.util.Map<java.lang.String, java.lang.String> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return this.addService.add(item, headers);
    }
}
