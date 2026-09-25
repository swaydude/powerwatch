package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen2AlertsConfiguration;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;", "()V", "initAlerts", "Lio/reactivex/Completable;", "deviceId", "", "alertsConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2AlertsConfiguration implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration {
    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration
    public io.reactivex.Completable initAlerts(java.lang.String deviceId, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfig alertsConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsConfig, "alertsConfig");
        io.reactivex.Completable completableComplete = io.reactivex.Completable.complete();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete, "complete()");
        return completableComplete;
    }
}
