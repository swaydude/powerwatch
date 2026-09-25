package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: LogServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B+\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0002\u0010\nJ5\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011H\u0096\u0001¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "logCloudConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;", "addService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;)V", "add", "Lio/reactivex/Completable;", "item", "headers", "", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepLogServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog>> {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog>> $$delegate_0;

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public io.reactivex.Completable add2(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> item, java.util.Map<java.lang.String, java.lang.String> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return this.$$delegate_0.add(item, headers);
    }

    public SleepLogServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig logCloudConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog>> addService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logCloudConfig, "logCloudConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addService, "addService");
        this.$$delegate_0 = addService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService
    public /* bridge */ /* synthetic */ io.reactivex.Completable add(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> list, java.util.Map map) {
        return add2((java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog>) list, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public /* synthetic */ SleepLogServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.LogCloudConfig logCloudConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddServiceImpl addServiceImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClient, logCloudConfig, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddServiceImpl(httpClient, logCloudConfig.getCrudServiceConfig().getAddEndpoint()) : addServiceImpl);
    }
}
