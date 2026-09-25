package powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day;

/* JADX INFO: compiled from: CombinedPeriodDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;", "walkingMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;", "restingMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;", "sleepMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;)V", "loadCombinedPeriodData", "Lio/reactivex/Observable;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CombinedMonthPeriodDataProviderImpl implements powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider walkingMonthPeriodProvider;

    public CombinedMonthPeriodDataProviderImpl(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider walkingMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthPeriodProvider, "walkingMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriodProvider, "restingMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriodProvider, "sleepMonthPeriodProvider");
        this.walkingMonthPeriodProvider = walkingMonthPeriodProvider;
        this.restingMonthPeriodProvider = restingMonthPeriodProvider;
        this.sleepMonthPeriodProvider = sleepMonthPeriodProvider;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer> loadCombinedPeriodData(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer> observableZip = io.reactivex.Observable.zip(this.walkingMonthPeriodProvider.loadData(page), this.restingMonthPeriodProvider.loadData(page), this.sleepMonthPeriodProvider.loadData(page), new io.reactivex.functions.Function3() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.-$$Lambda$CombinedMonthPeriodDataProviderImpl$tRsv8D_pqxfuAKpyLowO4lBPGqk
            @Override // io.reactivex.functions.Function3
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl.m3181loadCombinedPeriodData$lambda0((java.util.List) obj, (java.util.List) obj2, (java.util.List) obj3);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableZip, "zip(walkingData, restingData, sleepData,\n                Function3<List<WalkingMonthPeriod>, List<RestingMonthPeriod>, List<SleepMonthPeriod>,\n                        CombinedMonthPeriodDataContainer> { walking, resting, sleep ->\n                    CombinedMonthPeriodDataContainer(walking, resting, sleep)\n                })");
        return observableZip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadCombinedPeriodData$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer m3181loadCombinedPeriodData$lambda0(java.util.List walking, java.util.List resting, java.util.List sleep) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walking, "walking");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resting, "resting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleep, "sleep");
        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer(walking, resting, sleep);
    }
}
