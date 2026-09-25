package powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day;

/* JADX INFO: compiled from: CombinedPeriodDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;", "walkingDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;", "restingDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;", "sleepDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;)V", "loadCombinedPeriodData", "Lio/reactivex/Observable;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CombinedDayPeriodDataProviderImpl implements powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodProvider;

    public CombinedDayPeriodDataProviderImpl(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriodProvider, "walkingDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodProvider, "restingDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodProvider, "sleepDayPeriodProvider");
        this.walkingDayPeriodProvider = walkingDayPeriodProvider;
        this.restingDayPeriodProvider = restingDayPeriodProvider;
        this.sleepDayPeriodProvider = sleepDayPeriodProvider;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> loadCombinedPeriodData(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.-$$Lambda$CombinedDayPeriodDataProviderImpl$9spB2FvDDXRpetkaTTHexU9A6cY
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl.m3179loadCombinedPeriodData$lambda1(this.f$0, page);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n        val walkingData = walkingDayPeriodProvider\n                .loadData(page)\n\n        val restingData = restingDayPeriodProvider\n                .loadData(page)\n\n        val sleepData = sleepDayPeriodProvider\n                .loadData(page)\n\n         Observable.zip(walkingData, restingData, sleepData,\n                Function3<List<WalkingDayPeriod>, List<RestingDayPeriod>, List<SleepDayPeriod>,\n                        CombinedDayPeriodDataContainer> { walking, resting, sleep ->\n                    CombinedDayPeriodDataContainer(walking, resting, sleep)\n                })\n    }");
        return observableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadCombinedPeriodData$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3179loadCombinedPeriodData$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "$page");
        return io.reactivex.Observable.zip(this$0.walkingDayPeriodProvider.loadData(page), this$0.restingDayPeriodProvider.loadData(page), this$0.sleepDayPeriodProvider.loadData(page), new io.reactivex.functions.Function3() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.-$$Lambda$CombinedDayPeriodDataProviderImpl$JWW4hIhOUDTBV9umhf2bsYNnnbQ
            @Override // io.reactivex.functions.Function3
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl.m3180loadCombinedPeriodData$lambda1$lambda0((java.util.List) obj, (java.util.List) obj2, (java.util.List) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadCombinedPeriodData$lambda-1$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer m3180loadCombinedPeriodData$lambda1$lambda0(java.util.List walking, java.util.List resting, java.util.List sleep) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walking, "walking");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resting, "resting");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleep, "sleep");
        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer(walking, resting, sleep);
    }
}
