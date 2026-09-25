package powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month;

/* JADX INFO: compiled from: RestingMonthPeriodDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;", "restingMonthPeriodRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepository;", "watchSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;", "cloudSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V", "getPeriods", "", "periodsContainer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;", "loadData", "Lio/reactivex/Observable;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RestingMonthPeriodDataProviderImpl extends powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod> implements powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestingMonthPeriodDataProviderImpl(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.month.RestingMonthPeriodRepository restingMonthPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer) {
        super(restingMonthPeriodRepository, watchSynchronizer, cloudSynchronizer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriodRepository, "restingMonthPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchSynchronizer, "watchSynchronizer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudSynchronizer, "cloudSynchronizer");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.DataProvider
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod>> loadData(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        return super.loadData(page);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider
    public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod> getPeriods(powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer periodsContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodsContainer, "periodsContainer");
        return periodsContainer.getRestingMonthPeriods();
    }
}
