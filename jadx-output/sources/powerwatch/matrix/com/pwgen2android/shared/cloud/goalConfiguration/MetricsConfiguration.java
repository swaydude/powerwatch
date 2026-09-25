package powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration;

/* JADX INFO: compiled from: MetricsConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/MetricsConfiguration;", "", "deviceEventConfiguration", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;", "appEventsConfiguration", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V", "getAppEventsConfiguration", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;", "getDeviceEventConfiguration", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MetricsConfiguration {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig appEventsConfiguration;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig deviceEventConfiguration;

    public MetricsConfiguration(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig deviceEventConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig appEventsConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceEventConfiguration, "deviceEventConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appEventsConfiguration, "appEventsConfiguration");
        this.deviceEventConfiguration = deviceEventConfiguration;
        this.appEventsConfiguration = appEventsConfiguration;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig getAppEventsConfiguration() {
        return this.appEventsConfiguration;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig getDeviceEventConfiguration() {
        return this.deviceEventConfiguration;
    }
}
