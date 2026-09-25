package powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs;

/* JADX INFO: compiled from: WalkingLogRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/WalkingLogRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SyncDataRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface WalkingLogRepository extends powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog>, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SyncDataRepository, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {

    /* JADX INFO: compiled from: WalkingLogRepository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static org.koin.core.Koin getKoin(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.WalkingLogRepository walkingLogRepository) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogRepository, "this");
            return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(walkingLogRepository);
        }
    }
}
