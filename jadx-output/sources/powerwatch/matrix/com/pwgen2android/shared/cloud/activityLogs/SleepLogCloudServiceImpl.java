package powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs;

/* JADX INFO: compiled from: LogCloudServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;", "sleepLogService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;)V", "saveAllSleepLogs", "Lio/reactivex/Completable;", "sleepLogs", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepLogCloudServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogService sleepLogService;

    public SleepLogCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepLogService sleepLogService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogService, "sleepLogService");
        this.sleepLogService = sleepLogService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.SleepLogCloudService
    public io.reactivex.Completable saveAllSleepLogs(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> sleepLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogs, "sleepLogs");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService.DefaultImpls.add$default(this.sleepLogService, sleepLogs, null, 2, null);
    }
}
