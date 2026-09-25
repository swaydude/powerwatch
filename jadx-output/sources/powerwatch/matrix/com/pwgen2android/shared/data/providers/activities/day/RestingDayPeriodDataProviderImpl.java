package powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day;

/* JADX INFO: compiled from: RestingDayPeriodDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;", "restingDayPeriodRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/RestingDayPeriodRepository;", "watchSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;", "cloudSynchronizer", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/day/RestingDayPeriodRepository;Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;)V", "getPeriods", "", "periodsContainer", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;", "loadData", "Lio/reactivex/Observable;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RestingDayPeriodDataProviderImpl extends powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> implements powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider {
    private final powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestingDayPeriodDataProviderImpl(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityPeriods.day.RestingDayPeriodRepository restingDayPeriodRepository, powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer) {
        super(restingDayPeriodRepository, watchSynchronizer, cloudSynchronizer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodRepository, "restingDayPeriodRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchSynchronizer, "watchSynchronizer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudSynchronizer, "cloudSynchronizer");
        this.watchSynchronizer = watchSynchronizer;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider
    public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> getPeriods(powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer periodsContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodsContainer, "periodsContainer");
        return periodsContainer.getRestingDayPeriods();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.BaseActivityDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.DataProvider
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod>> loadData(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod>> map = super.loadData(page).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.-$$Lambda$RestingDayPeriodDataProviderImpl$LK8qwvVtZp3YvuXa3RaWJNutUnU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProviderImpl.m3183loadData$lambda1((java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "super.loadData(page)\n                .map {\n                    it.map { day ->\n                        day.fillWithEmptyHours()\n                    }\n                }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData$lambda-1, reason: not valid java name */
    public static final java.util.List m3183loadData$lambda1(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.util.List list = it;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) it2.next()));
        }
        return arrayList;
    }
}
