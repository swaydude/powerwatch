package powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs;

/* JADX INFO: compiled from: LogCloudServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;", "walkingLogService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;)V", "saveAllWalkingLogs", "Lio/reactivex/Completable;", "walkingLogs", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WalkingLogCloudServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingLogService walkingLogService;

    public WalkingLogCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.WalkingLogService walkingLogService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogService, "walkingLogService");
        this.walkingLogService = walkingLogService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs.WalkingLogCloudService
    public io.reactivex.Completable saveAllWalkingLogs(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> walkingLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogs, "walkingLogs");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService.DefaultImpls.add$default(this.walkingLogService, walkingLogs, null, 2, null);
    }
}
