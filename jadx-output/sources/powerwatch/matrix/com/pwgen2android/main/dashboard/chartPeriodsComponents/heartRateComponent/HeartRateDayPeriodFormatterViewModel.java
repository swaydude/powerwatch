package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent;

/* JADX INFO: compiled from: HeartRatePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00020\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDayPeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;", "walkingDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;", "restingDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;", "sleepDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "displayHrv", "", "combinedDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;", "defaultHeartRateConfigProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HeartRateDayPeriodFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> combinedDayPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.DefaultHeartRateConfigProvider defaultHeartRateConfigProvider;

    public HeartRateDayPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodProvider, boolean z, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> combinedDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.DefaultHeartRateConfigProvider defaultHeartRateConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriodProvider, "walkingDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodProvider, "restingDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodProvider, "sleepDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedDayPeriodDataProvider, "combinedDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultHeartRateConfigProvider, "defaultHeartRateConfigProvider");
        this.combinedDayPeriodDataProvider = combinedDayPeriodDataProvider;
        this.defaultHeartRateConfigProvider = defaultHeartRateConfigProvider;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HeartRateDayPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, boolean z, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl combinedDayPeriodDataProviderImpl, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.DefaultHeartRateConfigProvider defaultHeartRateConfigProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2 = (i & 8) != 0 ? true : z;
        this(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider, z2, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider) : combinedDayPeriodDataProviderImpl, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.DefaultHeartRateConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY, z2) : defaultHeartRateConfigProvider);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> getPeriodConfig(final java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> observableOnErrorReturn = this.combinedDayPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayHoursOffsetFromToday(date), 0L, 0, 12, null)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.-$$Lambda$HeartRateDayPeriodFormatterViewModel$04Gx04qVjh_LVirR38T2DoFFKk8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel.m1708getPeriodConfig$lambda25(this.f$0, date, (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.-$$Lambda$HeartRateDayPeriodFormatterViewModel$pfFg1uDNinecOqSV5JnaR5vRpUE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel.m1710getPeriodConfig$lambda47(this.f$0, context, (kotlin.Pair) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.-$$Lambda$HeartRateDayPeriodFormatterViewModel$Eviepatl8-suPyw6p3HeUJKsP7A
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel.m1711getPeriodConfig$lambda48(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(observableOnErrorReturn);
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-25, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1708getPeriodConfig$lambda25(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel this$0, java.util.Calendar date, final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer dayPeriods) {
        io.reactivex.ObservableSource map;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPeriods, "dayPeriods");
        if (dayPeriods.getWalkingDays().isEmpty() && dayPeriods.getRestingDays().isEmpty() && dayPeriods.getSleepDays().isEmpty()) {
            map = io.reactivex.Observable.just(new kotlin.Pair(dayPeriods, kotlin.collections.CollectionsKt.emptyList()));
        } else {
            map = this$0.combinedDayPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityConstantsKt.WEEK_HOURS_PAGE_LIMIT, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayHoursOffsetFromToday(date) + ((long) 24), 0L, 0, 12, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.-$$Lambda$HeartRateDayPeriodFormatterViewModel$s6r2kXLmjPxFV8t5wWJEJejmLGI
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel.m1709getPeriodConfig$lambda25$lambda24(dayPeriods, (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer) obj);
                }
            });
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-25$lambda-24, reason: not valid java name */
    public static final kotlin.Pair m1709getPeriodConfig$lambda25$lambda24(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer dayPeriods, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer fullDayPeriods) {
        java.util.ArrayList arrayListEmptyList;
        java.util.ArrayList arrayListEmptyList2;
        java.util.ArrayList arrayListEmptyList3;
        kotlin.Pair pair;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData totalHourAverageData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPeriods, "$dayPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullDayPeriods, "fullDayPeriods");
        if (fullDayPeriods.getRestingDays().isEmpty()) {
            arrayListEmptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> restingDays = fullDayPeriods.getRestingDays();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(restingDays, 10));
            java.util.Iterator<T> it = restingDays.iterator();
            while (it.hasNext()) {
                arrayList.add(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) it.next()));
            }
            java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel$getPeriodConfig$lambda-25$lambda-24$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t2).getDayInWeek()));
                }
            });
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = listSortedWith.iterator();
            while (it2.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList2, kotlin.collections.CollectionsKt.sortedWith(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) it2.next()).getRestingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel$getPeriodConfig$lambda-25$lambda-24$lambda-3$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t2).getHourInDay()));
                    }
                }));
            }
            arrayListEmptyList = arrayList2;
        }
        if (fullDayPeriods.getWalkingDays().isEmpty()) {
            arrayListEmptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDays = fullDayPeriods.getWalkingDays();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(walkingDays, 10));
            java.util.Iterator<T> it3 = walkingDays.iterator();
            while (it3.hasNext()) {
                arrayList3.add(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) it3.next()));
            }
            java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(arrayList3, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel$getPeriodConfig$lambda-25$lambda-24$$inlined$sortedBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t2).getDayInWeek()));
                }
            });
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it4 = listSortedWith2.iterator();
            while (it4.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList4, kotlin.collections.CollectionsKt.sortedWith(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) it4.next()).getWalkingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel$getPeriodConfig$lambda-25$lambda-24$lambda-7$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t2).getHourInDay()));
                    }
                }));
            }
            arrayListEmptyList2 = arrayList4;
        }
        if (fullDayPeriods.getSleepDays().isEmpty()) {
            arrayListEmptyList3 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> sleepDays = fullDayPeriods.getSleepDays();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(sleepDays, 10));
            java.util.Iterator<T> it5 = sleepDays.iterator();
            while (it5.hasNext()) {
                arrayList5.add(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) it5.next()));
            }
            java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(arrayList5, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel$getPeriodConfig$lambda-25$lambda-24$$inlined$sortedBy$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t2).getDayInWeek()));
                }
            });
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it6 = listSortedWith3.iterator();
            while (it6.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList6, kotlin.collections.CollectionsKt.sortedWith(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) it6.next()).getSleepHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel$getPeriodConfig$lambda-25$lambda-24$lambda-11$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t2).getHourInDay()));
                    }
                }));
            }
            arrayListEmptyList3 = arrayList6;
        }
        java.lang.Iterable iterable = arrayListEmptyList;
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
        int i = 0;
        for (java.util.Iterator it7 = iterable.iterator(); it7.hasNext(); it7 = it7) {
            java.lang.Object next = it7.next();
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) next;
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) kotlin.collections.CollectionsKt.getOrNull(arrayListEmptyList3, i);
            if (sleepHourPeriod == null) {
                sleepHourPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, null, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 8388607, null);
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) ((i < 0 || i > kotlin.collections.CollectionsKt.getLastIndex(arrayListEmptyList2)) ? new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod(0L, 0L, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0d, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 4194303, null) : arrayListEmptyList2.get(i));
            int minsInPeriod = (restingHourPeriod.getStartTime() > 0 ? restingHourPeriod.getMinsInPeriod() : 0) + (walkingHourPeriod.getStartTime() > 0 ? walkingHourPeriod.getMinsInPeriod() : 0) + (sleepHourPeriod.getStartTime() > 0 ? sleepHourPeriod.getMinsInPeriod() : 0);
            if (minsInPeriod == 0) {
                totalHourAverageData = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData(-1L, -1L, -1, new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData(0.0f, 0.0f, 0.0f, 7, null), -1, false);
            } else {
                double d = minsInPeriod;
                double heartRate = (((double) restingHourPeriod.getHeartRate()) * (((double) restingHourPeriod.getMinsInPeriod()) / d)) + (((double) walkingHourPeriod.getHeartRate()) * (((double) walkingHourPeriod.getMinsInPeriod()) / d)) + (((double) sleepHourPeriod.getHeartRate()) * (((double) sleepHourPeriod.getMinsInPeriod()) / d));
                java.util.ArrayList arrayList8 = arrayList7;
                double maxHeartRate = (((double) restingHourPeriod.getMaxHeartRate()) * (((double) restingHourPeriod.getMinsInPeriod()) / d)) + (((double) walkingHourPeriod.getMaxHeartRate()) * (((double) walkingHourPeriod.getMinsInPeriod()) / d)) + (((double) sleepHourPeriod.getMaxHeartRate()) * (((double) sleepHourPeriod.getMinsInPeriod()) / d));
                int i3 = i;
                double minHeartRate = (((double) restingHourPeriod.getMinHeartRate()) * (((double) restingHourPeriod.getMinsInPeriod()) / d)) + (((double) walkingHourPeriod.getMinHeartRate()) * (((double) walkingHourPeriod.getMinsInPeriod()) / d)) + (((double) sleepHourPeriod.getMinHeartRate()) * (((double) sleepHourPeriod.getMinsInPeriod()) / d));
                if (restingHourPeriod.getStartTime() > 0) {
                    pair = new kotlin.Pair(java.lang.Long.valueOf(restingHourPeriod.getStartTime()), java.lang.Integer.valueOf(restingHourPeriod.getHourInDay()));
                } else if (walkingHourPeriod.getStartTime() > 0) {
                    pair = new kotlin.Pair(java.lang.Long.valueOf(walkingHourPeriod.getStartTime()), java.lang.Integer.valueOf(walkingHourPeriod.getHourInDay()));
                } else {
                    if (sleepHourPeriod.getStartTime() > 0) {
                        pair = new kotlin.Pair(java.lang.Long.valueOf(sleepHourPeriod.getStartTime()), java.lang.Integer.valueOf(sleepHourPeriod.getHourInDay()));
                    } else {
                        pair = new kotlin.Pair(-1L, 0);
                    }
                    totalHourAverageData = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData(restingHourPeriod.getStartTime(), ((java.lang.Number) pair.getFirst()).longValue(), ((java.lang.Number) pair.getSecond()).intValue(), new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData((float) maxHeartRate, (float) heartRate, (float) minHeartRate), i3, false, 32, null);
                    arrayList7 = arrayList8;
                }
                totalHourAverageData = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData(restingHourPeriod.getStartTime(), ((java.lang.Number) pair.getFirst()).longValue(), ((java.lang.Number) pair.getSecond()).intValue(), new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData((float) maxHeartRate, (float) heartRate, (float) minHeartRate), i3, false, 32, null);
                arrayList7 = arrayList8;
            }
            arrayList7.add(totalHourAverageData);
            i = i2;
            arrayListEmptyList2 = arrayListEmptyList2;
            arrayListEmptyList3 = arrayListEmptyList3;
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList7) {
            if (((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) obj).getFullTime() > -1) {
                arrayList9.add(obj);
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : arrayList9) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) obj2).getHourInDay());
            java.lang.Object obj3 = linkedHashMap.get(numValueOf);
            if (obj3 == null) {
                obj3 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(numValueOf, obj3);
            }
            ((java.util.List) obj3).add(obj2);
        }
        java.util.ArrayList arrayList10 = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("running avg: hour in period - ", entry.getKey()));
            java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData> listSortedWith4 = kotlin.collections.CollectionsKt.sortedWith((java.lang.Iterable) entry.getValue(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel$getPeriodConfig$lambda-25$lambda-24$lambda-21$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) t).getStartTime()), java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) t2).getStartTime()));
                }
            });
            for (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData totalHourAverageData2 : listSortedWith4) {
                java.lang.System.out.println((java.lang.Object) ("running period: " + powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dateFormat(totalHourAverageData2.getStartTime()) + " - " + powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dateFormat(totalHourAverageData2.getFullTime()) + ", data - " + totalHourAverageData2.getAvgData()));
            }
            java.util.ArrayList arrayList11 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith4, 10));
            java.util.Iterator it8 = listSortedWith4.iterator();
            while (it8.hasNext()) {
                arrayList11.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) it8.next()).getAvgData().getAvg()));
            }
            float fRoundToInt = kotlin.math.MathKt.roundToInt(kotlin.collections.CollectionsKt.averageOfFloat(arrayList11));
            java.util.ArrayList arrayList12 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith4, 10));
            java.util.Iterator it9 = listSortedWith4.iterator();
            while (it9.hasNext()) {
                arrayList12.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) it9.next()).getAvgData().getMaxAvg()));
            }
            float fRoundToInt2 = kotlin.math.MathKt.roundToInt(kotlin.collections.CollectionsKt.averageOfFloat(arrayList12));
            java.util.ArrayList arrayList13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith4, 10));
            java.util.Iterator it10 = listSortedWith4.iterator();
            while (it10.hasNext()) {
                arrayList13.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) it10.next()).getAvgData().getMinAvg()));
            }
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData(kotlin.math.MathKt.roundToInt(fRoundToInt2), fRoundToInt, kotlin.math.MathKt.roundToInt(kotlin.collections.CollectionsKt.averageOfFloat(arrayList13)));
            java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("running avg: result - ", avgData));
            arrayList10.add(new kotlin.Pair(entry.getKey(), avgData));
        }
        java.util.List<kotlin.Pair> listSortedWith5 = kotlin.collections.CollectionsKt.sortedWith(arrayList10, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel$getPeriodConfig$lambda-25$lambda-24$$inlined$sortedBy$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Integer) ((kotlin.Pair) t).getFirst(), (java.lang.Integer) ((kotlin.Pair) t2).getFirst());
            }
        });
        java.util.ArrayList arrayList14 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith5, 10));
        for (kotlin.Pair pair2 : listSortedWith5) {
            arrayList14.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData(((java.lang.Number) pair2.getFirst()).intValue(), (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData) pair2.getSecond()));
        }
        return new kotlin.Pair(dayPeriods, arrayList14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-47, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig m1710getPeriodConfig$lambda47(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel this$0, android.content.Context context, kotlin.Pair dayPeriodPair) {
        java.lang.Object next;
        java.lang.Object next2;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData;
        java.lang.Object next3;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData2;
        java.lang.Object next4;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData3;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer heartRateDataContainer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPeriodPair, "dayPeriodPair");
        java.lang.Object first = dayPeriodPair.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(first, "dayPeriodPair.first");
        powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer combinedDayPeriodDataContainer = (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer) first;
        if (combinedDayPeriodDataContainer.getWalkingDays().isEmpty() && combinedDayPeriodDataContainer.getRestingDays().isEmpty() && combinedDayPeriodDataContainer.getSleepDays().isEmpty()) {
            return this$0.defaultHeartRateConfigProvider.getDefaultConfig(context);
        }
        java.util.List list = (java.util.List) dayPeriodPair.getSecond();
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) combinedDayPeriodDataContainer.getWalkingDays());
        if (walkingDayPeriod == null) {
            walkingDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod(0L, 0L, 0, 0, null, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0d, 0, 0L, 0, 0.0f, 0.0f, 0.0f, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriodFillWithEmptyHours = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours(walkingDayPeriod);
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) combinedDayPeriodDataContainer.getRestingDays());
        if (restingDayPeriod == null) {
            restingDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 4194303, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriodFillWithEmptyHours = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours(restingDayPeriod);
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) combinedDayPeriodDataContainer.getSleepDays());
        if (sleepDayPeriod == null) {
            sleepDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriodFillWithEmptyHours = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours(sleepDayPeriod);
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(walkingDayPeriodFillWithEmptyHours.getWalkingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(restingDayPeriodFillWithEmptyHours.getRestingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(sleepDayPeriodFillWithEmptyHours.getSleepHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.List list2 = listSortedWith;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        char c = 0;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next5 = it.next();
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) next5;
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith2, i);
            if (restingHourPeriod == null) {
                restingHourPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod(0L, 0L, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 1048575, null);
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod2 = restingHourPeriod;
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith3, i);
            if (sleepHourPeriod == null) {
                sleepHourPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, null, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 8388607, null);
            }
            int minsInPeriod = (walkingHourPeriod.getHeartRate() > 0.0f ? walkingHourPeriod.getMinsInPeriod() : 0) + (restingHourPeriod2.getHeartRate() > 0.0f ? restingHourPeriod2.getMinsInPeriod() : 0) + (sleepHourPeriod.getHeartRate() > 0.0f ? sleepHourPeriod.getMinsInPeriod() : 0);
            powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog[] baseLogArr = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog[3];
            baseLogArr[c] = walkingHourPeriod;
            baseLogArr[1] = restingHourPeriod2;
            baseLogArr[2] = sleepHourPeriod;
            java.util.Iterator it2 = it;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.List list3 = listSortedWith2;
            int i3 = 0;
            for (int i4 = 3; i3 < i4; i4 = 3) {
                powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog = baseLogArr[i3];
                if (((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) baseLog).getHeartRate() > 0.0f) {
                    arrayList2.add(baseLog);
                }
                i3++;
            }
            java.util.ArrayList arrayList3 = arrayList2;
            java.util.List list4 = listSortedWith3;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            java.util.Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it3.next())).getMaxHeartRate()));
            }
            java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList4);
            int iIntValue = num == null ? 0 : num.intValue();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (int i5 = 0; i5 < 3; i5++) {
                powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog2 = baseLogArr[i5];
                if (((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) baseLog2).getHeartRate() > 0.0f) {
                    arrayList5.add(baseLog2);
                }
            }
            java.util.ArrayList arrayList6 = arrayList5;
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
            java.util.Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                arrayList7.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it4.next())).getMinHeartRate()));
            }
            java.lang.Integer num2 = (java.lang.Integer) kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable) arrayList7);
            int iIntValue2 = num2 == null ? 0 : num2.intValue();
            int i6 = iIntValue2 == 0 ? iIntValue : iIntValue2;
            boolean zProcessForArtificial = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodFormatterViewModelsKt.processForArtificial(walkingHourPeriod, restingHourPeriod2, sleepHourPeriod);
            if (minsInPeriod == 0) {
                heartRateDataContainer = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer(i6, 0, iIntValue, zProcessForArtificial, false, false, 0, 96, null);
            } else {
                double d = minsInPeriod;
                heartRateDataContainer = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer(i6, kotlin.math.MathKt.roundToInt((((double) walkingHourPeriod.getHeartRate()) * (((double) walkingHourPeriod.getMinsInPeriod()) / d)) + (((double) restingHourPeriod2.getHeartRate()) * (((double) restingHourPeriod2.getMinsInPeriod()) / d)) + (((double) sleepHourPeriod.getHeartRate()) * (((double) sleepHourPeriod.getMinsInPeriod()) / d))), iIntValue, zProcessForArtificial, false, false, 0, 112, null);
            }
            arrayList.add(heartRateDataContainer);
            it = it2;
            i = i2;
            listSortedWith2 = list3;
            listSortedWith3 = list4;
            c = 0;
        }
        java.util.ArrayList arrayList8 = arrayList;
        java.util.ArrayList arrayList9 = arrayList8;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList9) {
            if (!((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) obj).getMalformed()) {
                arrayList10.add(obj);
            }
        }
        java.util.Iterator it5 = arrayList10.iterator();
        if (it5.hasNext()) {
            next = it5.next();
            if (it5.hasNext()) {
                int min = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) next).getMin();
                do {
                    java.lang.Object next6 = it5.next();
                    int min2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) next6).getMin();
                    if (min > min2) {
                        next = next6;
                        min = min2;
                    }
                } while (it5.hasNext());
            }
        } else {
            next = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer heartRateDataContainer2 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) next;
        int min3 = heartRateDataContainer2 == null ? 0 : heartRateDataContainer2.getMin();
        int maximum = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodFormatterViewModelsKt.getMaximum(arrayList8, list);
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData> list5 = list;
        java.util.Iterator it6 = list5.iterator();
        if (it6.hasNext()) {
            next2 = it6.next();
            if (it6.hasNext()) {
                float avg = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next2).getAvgData().getAvg();
                do {
                    java.lang.Object next7 = it6.next();
                    float avg2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next7).getAvgData().getAvg();
                    if (java.lang.Float.compare(avg, avg2) > 0) {
                        next2 = next7;
                        avg = avg2;
                    }
                } while (it6.hasNext());
            }
        } else {
            next2 = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next2;
        java.lang.Float fValueOf = (avgLineChartData == null || (avgData = avgLineChartData.getAvgData()) == null) ? null : java.lang.Float.valueOf(avgData.getAvg());
        int iRoundToInt = fValueOf == null ? min3 : kotlin.math.MathKt.roundToInt(fValueOf.floatValue());
        java.util.Iterator it7 = list5.iterator();
        if (it7.hasNext()) {
            next3 = it7.next();
            if (it7.hasNext()) {
                float minAvg = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next3).getAvgData().getMinAvg();
                do {
                    java.lang.Object next8 = it7.next();
                    float minAvg2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next8).getAvgData().getMinAvg();
                    if (java.lang.Float.compare(minAvg, minAvg2) > 0) {
                        next3 = next8;
                        minAvg = minAvg2;
                    }
                } while (it7.hasNext());
            }
        } else {
            next3 = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData2 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next3;
        java.lang.Float fValueOf2 = (avgLineChartData2 == null || (avgData2 = avgLineChartData2.getAvgData()) == null) ? null : java.lang.Float.valueOf(avgData2.getMaxAvg());
        int iRoundToInt2 = fValueOf2 == null ? min3 : kotlin.math.MathKt.roundToInt(fValueOf2.floatValue());
        java.util.Iterator it8 = list5.iterator();
        if (it8.hasNext()) {
            next4 = it8.next();
            if (it8.hasNext()) {
                float maxAvg = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next4).getAvgData().getMaxAvg();
                do {
                    java.lang.Object next9 = it8.next();
                    float maxAvg2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next9).getAvgData().getMaxAvg();
                    if (java.lang.Float.compare(maxAvg, maxAvg2) > 0) {
                        maxAvg = maxAvg2;
                        next4 = next9;
                    }
                } while (it8.hasNext());
            }
        } else {
            next4 = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData3 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next4;
        java.lang.Float fValueOf3 = (avgLineChartData3 == null || (avgData3 = avgLineChartData3.getAvgData()) == null) ? null : java.lang.Float.valueOf(avgData3.getMinAvg());
        int iMin = java.lang.Math.min(java.lang.Math.min(iRoundToInt, java.lang.Math.min(iRoundToInt2, fValueOf3 == null ? min3 : kotlin.math.MathKt.roundToInt(fValueOf3.floatValue()))), min3);
        java.util.ArrayList<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer> arrayList11 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList9) {
            if (!((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) obj2).getValid()) {
                arrayList11.add(obj2);
            }
        }
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer heartRateDataContainer3 : arrayList11) {
            heartRateDataContainer3.setMin(iMin);
            heartRateDataContainer3.setAvg(iMin);
            heartRateDataContainer3.setMax(iMin);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog[]{walkingDayPeriodFillWithEmptyHours, restingDayPeriodFillWithEmptyHours, sleepDayPeriodFillWithEmptyHours});
        java.util.ArrayList arrayList12 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        java.util.Iterator it9 = listListOf.iterator();
        while (it9.hasNext()) {
            arrayList12.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it9.next())).getHrv()));
        }
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList12) {
            if (((java.lang.Number) obj3).floatValue() > 0.0f) {
                arrayList13.add(obj3);
            }
        }
        java.util.ArrayList arrayList14 = arrayList13;
        double dAverageOfFloat = arrayList14.isEmpty() ? 0.0d : kotlin.collections.CollectionsKt.averageOfFloat(arrayList14);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> listBuildEntries = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodFormatterViewModelsKt.buildEntries(arrayList8);
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues heartRateHeaderValuesBuildHeaderValues = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodFormatterViewModelsKt.buildHeaderValues(arrayList8, dAverageOfFloat);
        float f = iMin;
        float f2 = maximum * 1.2f;
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig candleChartConfig = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY, listBuildEntries, null, 0.0f, 0.0f, false, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.DefaultHeartRateConfigProvider.getHeaders$default(this$0.defaultHeartRateConfigProvider, context, heartRateHeaderValuesBuildHeaderValues, false, 4, null), null, 0, 0, null, false, 4028, null);
        java.util.ArrayList arrayList15 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData4 : list5) {
            arrayList15.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData(avgLineChartData4.getXValue(), avgLineChartData4.getAvgData().getAvg()));
        }
        java.util.ArrayList arrayList16 = arrayList15;
        java.util.ArrayList arrayList17 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData5 : list5) {
            arrayList17.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData(avgLineChartData5.getXValue(), avgLineChartData5.getAvgData().getMaxAvg()));
        }
        java.util.ArrayList arrayList18 = arrayList17;
        java.util.ArrayList arrayList19 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData6 : list5) {
            arrayList19.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData(avgLineChartData6.getXValue(), avgLineChartData6.getAvgData().getMinAvg()));
        }
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig(null, f, candleChartConfig, arrayList16, arrayList18, arrayList19, null, false, this$0.defaultHeartRateConfigProvider.getLegendValues(context), null, dAverageOfFloat == 0.0d ? "" : java.lang.String.valueOf((int) dAverageOfFloat), f2, false, 4801, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-48, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig m1711getPeriodConfig$lambda48(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayPeriodFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.defaultHeartRateConfigProvider.getDefaultConfig(context);
    }
}
