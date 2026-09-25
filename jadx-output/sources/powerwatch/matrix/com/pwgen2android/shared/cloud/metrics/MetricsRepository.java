package powerwatch.matrix.com.pwgen2android.shared.cloud.metrics;

/* JADX INFO: compiled from: MetricsRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "", "logEvent", "", "item", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;", "logOTAEvent", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface MetricsRepository {
    void logEvent(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent item);

    void logOTAEvent(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.DeviceOTALogEvent item);
}
