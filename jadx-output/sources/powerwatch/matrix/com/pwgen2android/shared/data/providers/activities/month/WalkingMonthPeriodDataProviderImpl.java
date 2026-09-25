package powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month;

/* JADX INFO: compiled from: WalkingMonthPeriodDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;", "walkingMonthPeriodRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/WalkingMonthPeriodRepository;", "watchSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;", "cloudSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/WalkingMonthPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V", "getPeriods", "", "periodsContainer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WalkingMonthPeriodDataProviderImpl extends powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod> implements powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkingMonthPeriodDataProviderImpl(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.WalkingMonthPeriodRepository walkingMonthPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer) {
        super(walkingMonthPeriodRepository, watchSynchronizer, cloudSynchronizer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthPeriodRepository, "walkingMonthPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchSynchronizer, "watchSynchronizer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudSynchronizer, "cloudSynchronizer");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider
    public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod> getPeriods(powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer periodsContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodsContainer, "periodsContainer");
        return periodsContainer.getWalkingMonthPeriods();
    }
}
