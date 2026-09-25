package powerwatch.matrix.com.pwgen2android.shared.cloud.activityLogs;

/* JADX INFO: compiled from: LogCloudServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;", "", "saveAllWalkingLogs", "Lio/reactivex/Completable;", "walkingLogs", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface WalkingLogCloudService {
    io.reactivex.Completable saveAllWalkingLogs(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> walkingLogs);
}
