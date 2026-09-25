package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents;

/* JADX INFO: compiled from: TemperaturePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00020\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;", "walkingDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;", "restingDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;", "sleepDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "combinedDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;", "defaultTemperatureConfigProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TemperatureDayPeriodFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> combinedDayPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.DefaultTemperatureConfigProvider defaultTemperatureConfigProvider;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    public TemperatureDayPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodProvider, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> combinedDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.DefaultTemperatureConfigProvider defaultTemperatureConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriodProvider, "walkingDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodProvider, "restingDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodProvider, "sleepDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedDayPeriodDataProvider, "combinedDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultTemperatureConfigProvider, "defaultTemperatureConfigProvider");
        this.userPrefsUtils = userPrefsUtils;
        this.combinedDayPeriodDataProvider = combinedDayPeriodDataProvider;
        this.defaultTemperatureConfigProvider = defaultTemperatureConfigProvider;
    }

    public /* synthetic */ TemperatureDayPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl combinedDayPeriodDataProviderImpl, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.DefaultTemperatureConfigProvider defaultTemperatureConfigProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider, userPrefsUtils, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider) : combinedDayPeriodDataProviderImpl, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.DefaultTemperatureConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY) : defaultTemperatureConfigProvider);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> getPeriodConfig(final java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> observableOnErrorReturn = this.combinedDayPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayHoursOffsetFromToday(date), 0L, 0, 12, null)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.-$$Lambda$TemperatureDayPeriodFormatterViewModel$AS4PxM8v-ruVqARsicK71YcWems
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel.m1773getPeriodConfig$lambda24(this.f$0, date, (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.-$$Lambda$TemperatureDayPeriodFormatterViewModel$UprLBB2PujAFKSxE1vGFzP836IA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel.m1775getPeriodConfig$lambda47(this.f$0, context, (kotlin.Pair) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.-$$Lambda$TemperatureDayPeriodFormatterViewModel$JL-5ZcIxbKmUFxvL-9vDdFjSDUA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.-$$Lambda$TemperatureDayPeriodFormatterViewModel$jd5nmJGnmwcmKyM9jNTVlNyPIjA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel.m1777getPeriodConfig$lambda49(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(observableOnErrorReturn);
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-24, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1773getPeriodConfig$lambda24(final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel this$0, java.util.Calendar date, final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer dayPeriods) {
        io.reactivex.ObservableSource map;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPeriods, "dayPeriods");
        if (dayPeriods.getWalkingDays().isEmpty() && dayPeriods.getRestingDays().isEmpty() && dayPeriods.getSleepDays().isEmpty()) {
            map = io.reactivex.Observable.just(new kotlin.Pair(dayPeriods, kotlin.collections.CollectionsKt.emptyList()));
        } else {
            map = this$0.combinedDayPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityConstantsKt.WEEK_HOURS_PAGE_LIMIT, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayHoursOffsetFromToday(date) + ((long) 24), 0L, 0, 12, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.-$$Lambda$TemperatureDayPeriodFormatterViewModel$hHrMXxclwiy1i-zPuWtg_nbuk_M
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel.m1774getPeriodConfig$lambda24$lambda23(dayPeriods, this$0, (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer) obj);
                }
            });
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-24$lambda-23, reason: not valid java name */
    public static final kotlin.Pair m1774getPeriodConfig$lambda24$lambda23(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer dayPeriods, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer fullDayPeriods) {
        java.util.ArrayList arrayListEmptyList;
        java.util.ArrayList arrayListEmptyList2;
        java.util.ArrayList arrayListEmptyList3;
        kotlin.Pair pair;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData totalHourAverageData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPeriods, "$dayPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
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
            java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t2).getDayInWeek()));
                }
            });
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = listSortedWith.iterator();
            while (it2.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList2, kotlin.collections.CollectionsKt.sortedWith(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) it2.next()).getRestingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-3$$inlined$sortedBy$1
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
            java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(arrayList3, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t2).getDayInWeek()));
                }
            });
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it4 = listSortedWith2.iterator();
            while (it4.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList4, kotlin.collections.CollectionsKt.sortedWith(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) it4.next()).getWalkingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-7$$inlined$sortedBy$1
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
            java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(arrayList5, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t2).getDayInWeek()));
                }
            });
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it6 = listSortedWith3.iterator();
            while (it6.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList6, kotlin.collections.CollectionsKt.sortedWith(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) it6.next()).getSleepHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-11$$inlined$sortedBy$1
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
                double skinTemp = (((double) restingHourPeriod.getSkinTemp()) * (((double) restingHourPeriod.getMinsInPeriod()) / d)) + (((double) walkingHourPeriod.getSkinTemp()) * (((double) walkingHourPeriod.getMinsInPeriod()) / d)) + (((double) sleepHourPeriod.getSkinTemp()) * (((double) sleepHourPeriod.getMinsInPeriod()) / d));
                double maxSkinTemp = (((double) restingHourPeriod.getMaxSkinTemp()) * (((double) restingHourPeriod.getMinsInPeriod()) / d)) + (((double) walkingHourPeriod.getMaxSkinTemp()) * (((double) walkingHourPeriod.getMinsInPeriod()) / d)) + (((double) sleepHourPeriod.getMaxSkinTemp()) * (((double) sleepHourPeriod.getMinsInPeriod()) / d));
                java.util.ArrayList arrayList8 = arrayList7;
                double minSkinTemp = (((double) restingHourPeriod.getMinSkinTemp()) * (((double) restingHourPeriod.getMinsInPeriod()) / d)) + (((double) walkingHourPeriod.getMinSkinTemp()) * (((double) walkingHourPeriod.getMinsInPeriod()) / d)) + (((double) sleepHourPeriod.getMinSkinTemp()) * (((double) sleepHourPeriod.getMinsInPeriod()) / d));
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
                    totalHourAverageData = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData(restingHourPeriod.getStartTime(), ((java.lang.Number) pair.getFirst()).longValue(), ((java.lang.Number) pair.getSecond()).intValue(), new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData((float) maxSkinTemp, (float) skinTemp, (float) minSkinTemp), i, false, 32, null);
                    arrayList7 = arrayList8;
                }
                totalHourAverageData = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData(restingHourPeriod.getStartTime(), ((java.lang.Number) pair.getFirst()).longValue(), ((java.lang.Number) pair.getSecond()).intValue(), new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData((float) maxSkinTemp, (float) skinTemp, (float) minSkinTemp), i, false, 32, null);
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
            java.util.List listSortedWith4 = kotlin.collections.CollectionsKt.sortedWith((java.lang.Iterable) entry.getValue(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$lambda-20$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) t).getStartTime()), java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) t2).getStartTime()));
                }
            });
            java.util.ArrayList arrayList11 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith4, 10));
            java.util.Iterator it8 = listSortedWith4.iterator();
            while (it8.hasNext()) {
                arrayList11.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) it8.next()).getAvgData().getAvg()));
            }
            double dAverageOfFloat = kotlin.collections.CollectionsKt.averageOfFloat(arrayList11);
            java.util.ArrayList arrayList12 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith4, 10));
            java.util.Iterator it9 = listSortedWith4.iterator();
            while (it9.hasNext()) {
                arrayList12.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) it9.next()).getAvgData().getMaxAvg()));
            }
            double dAverageOfFloat2 = kotlin.collections.CollectionsKt.averageOfFloat(arrayList12);
            java.util.ArrayList arrayList13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith4, 10));
            java.util.Iterator it10 = listSortedWith4.iterator();
            while (it10.hasNext()) {
                arrayList13.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) it10.next()).getAvgData().getMinAvg()));
            }
            double dAverageOfFloat3 = kotlin.collections.CollectionsKt.averageOfFloat(arrayList13);
            if (dAverageOfFloat > 255.0d) {
                dAverageOfFloat -= (double) 512;
            }
            if (dAverageOfFloat2 > 255.0d) {
                dAverageOfFloat2 -= (double) 512;
            }
            if (dAverageOfFloat3 > 255.0d) {
                dAverageOfFloat3 -= (double) 512;
            }
            double d2 = 4.0f;
            arrayList10.add(new kotlin.Pair(entry.getKey(), new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData(this$0.userPrefsUtils.getValue(java.lang.Double.valueOf(dAverageOfFloat2 / d2), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.TEMPERATURE.INSTANCE).getFirst().floatValue(), this$0.userPrefsUtils.getValue(java.lang.Double.valueOf(dAverageOfFloat / d2), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.TEMPERATURE.INSTANCE).getFirst().floatValue(), this$0.userPrefsUtils.getValue(java.lang.Double.valueOf(dAverageOfFloat3 / d2), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.TEMPERATURE.INSTANCE).getFirst().floatValue())));
        }
        java.util.List<kotlin.Pair> listSortedWith5 = kotlin.collections.CollectionsKt.sortedWith(arrayList10, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-24$lambda-23$$inlined$sortedBy$4
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
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig m1775getPeriodConfig$lambda47(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel this$0, android.content.Context context, kotlin.Pair dayPeriodPair) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        java.lang.Object next4;
        java.lang.Object next5;
        java.lang.Object next6;
        float fFloatValue;
        int i;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPeriodPair, "dayPeriodPair");
        java.lang.Object first = dayPeriodPair.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(first, "dayPeriodPair.first");
        powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer combinedDayPeriodDataContainer = (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer) first;
        if (combinedDayPeriodDataContainer.getWalkingDays().isEmpty() && combinedDayPeriodDataContainer.getRestingDays().isEmpty() && combinedDayPeriodDataContainer.getSleepDays().isEmpty()) {
            return this$0.defaultTemperatureConfigProvider.getDefaultConfig(context);
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
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(walkingDayPeriodFillWithEmptyHours.getWalkingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(restingDayPeriodFillWithEmptyHours.getRestingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(sleepDayPeriodFillWithEmptyHours.getSleepHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel$getPeriodConfig$lambda-47$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.List list2 = listSortedWith;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            java.lang.Object next7 = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) next7;
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith2, i3);
            if (restingHourPeriod == null) {
                restingHourPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod(0L, 0L, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 1048575, null);
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith3, i3);
            if (sleepHourPeriod == null) {
                sleepHourPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, null, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 8388607, null);
            }
            int minsInPeriod = (walkingHourPeriod.getStartTime() > 0 ? walkingHourPeriod.getMinsInPeriod() : 0) + (restingHourPeriod.getStartTime() > 0 ? restingHourPeriod.getMinsInPeriod() : 0) + (sleepHourPeriod.getStartTime() > 0 ? sleepHourPeriod.getMinsInPeriod() : 0);
            powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog[] baseLogArr = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog[3];
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod2 = walkingHourPeriod;
            baseLogArr[i2] = walkingHourPeriod2;
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod2 = restingHourPeriod;
            baseLogArr[1] = restingHourPeriod2;
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod2 = sleepHourPeriod;
            baseLogArr[2] = sleepHourPeriod2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i5 = 3; i2 < i5; i5 = 3) {
                powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog = baseLogArr[i2];
                if (((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) baseLog).getStartTime() > 0) {
                    arrayList2.add(baseLog);
                }
                i2++;
            }
            java.util.ArrayList arrayList3 = arrayList2;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it2.next())).getMinSkinTemp()));
            }
            java.lang.Float fMinOrNull = kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList4);
            if (fMinOrNull == null) {
                i = 3;
                fFloatValue = 0.0f;
            } else {
                fFloatValue = fMinOrNull.floatValue();
                i = 3;
            }
            powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog[] baseLogArr2 = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog[i];
            baseLogArr2[0] = walkingHourPeriod2;
            baseLogArr2[1] = restingHourPeriod2;
            baseLogArr2[2] = sleepHourPeriod2;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            int i6 = 0;
            while (i6 < i) {
                powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog2 = baseLogArr2[i6];
                if (((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) baseLog2).getStartTime() > 0) {
                    arrayList5.add(baseLog2);
                }
                i6++;
                i = 3;
            }
            java.util.ArrayList arrayList6 = arrayList5;
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
            java.util.Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                arrayList7.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it3.next())).getMaxSkinTemp()));
            }
            java.lang.Float fMaxOrNull = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList7);
            float fFloatValue2 = fMaxOrNull == null ? 0.0f : fMaxOrNull.floatValue();
            boolean zProcessForArtificial = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodFormatterViewModelsKt.processForArtificial(walkingHourPeriod, restingHourPeriod, sleepHourPeriod);
            boolean zProcessForValid = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodFormatterViewModelsKt.processForValid(walkingHourPeriod, restingHourPeriod, sleepHourPeriod);
            if (minsInPeriod == 0) {
                temperatureDataContainer = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer(fFloatValue, 0.0f, fFloatValue2, zProcessForArtificial, false, false, 32, null);
            } else {
                double d = minsInPeriod;
                temperatureDataContainer = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer(fFloatValue, (float) ((((double) walkingHourPeriod.getSkinTemp()) * (((double) walkingHourPeriod.getMinsInPeriod()) / d)) + (((double) restingHourPeriod.getSkinTemp()) * (((double) restingHourPeriod.getMinsInPeriod()) / d)) + (((double) sleepHourPeriod.getSkinTemp()) * (((double) sleepHourPeriod.getMinsInPeriod()) / d))), fFloatValue2, zProcessForArtificial, false, zProcessForValid, 16, null);
            }
            arrayList.add(temperatureDataContainer);
            listSortedWith2 = listSortedWith2;
            it = it;
            i3 = i4;
            i2 = 0;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> listConvertDataTemperature = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodFormatterViewModelsKt.convertDataTemperature(arrayList, this$0.userPrefsUtils);
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> list3 = listConvertDataTemperature;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        for (java.lang.Object obj : list3) {
            if (((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) obj).getValid()) {
                arrayList8.add(obj);
            }
        }
        java.util.Iterator it4 = arrayList8.iterator();
        if (it4.hasNext()) {
            next = it4.next();
            if (it4.hasNext()) {
                float min = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next).getMin();
                do {
                    java.lang.Object next8 = it4.next();
                    float min2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next8).getMin();
                    if (java.lang.Float.compare(min, min2) > 0) {
                        next = next8;
                        min = min2;
                    }
                } while (it4.hasNext());
            }
        } else {
            next = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer2 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next;
        float min3 = temperatureDataContainer2 == null ? 0.0f : temperatureDataContainer2.getMin();
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list3) {
            if (!((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) obj2).getMalformed()) {
                arrayList9.add(obj2);
            }
        }
        java.util.Iterator it5 = arrayList9.iterator();
        if (it5.hasNext()) {
            next2 = it5.next();
            if (it5.hasNext()) {
                float max = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next2).getMax();
                do {
                    java.lang.Object next9 = it5.next();
                    float max2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next9).getMax();
                    if (java.lang.Float.compare(max, max2) < 0) {
                        next2 = next9;
                        max = max2;
                    }
                } while (it5.hasNext());
            }
        } else {
            next2 = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer3 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next2;
        float max3 = temperatureDataContainer3 == null ? 0.0f : temperatureDataContainer3.getMax();
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData> list4 = list;
        java.util.Iterator it6 = list4.iterator();
        if (it6.hasNext()) {
            next3 = it6.next();
            if (it6.hasNext()) {
                float maxAvg = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next3).getAvgData().getMaxAvg();
                do {
                    java.lang.Object next10 = it6.next();
                    float maxAvg2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next10).getAvgData().getMaxAvg();
                    if (java.lang.Float.compare(maxAvg, maxAvg2) < 0) {
                        next3 = next10;
                        maxAvg = maxAvg2;
                    }
                } while (it6.hasNext());
            }
        } else {
            next3 = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next3;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData = avgLineChartData == null ? null : avgLineChartData.getAvgData();
        float fMax = java.lang.Math.max(max3, avgData == null ? max3 : avgData.getMaxAvg());
        java.util.Iterator it7 = list4.iterator();
        if (it7.hasNext()) {
            next4 = it7.next();
            if (it7.hasNext()) {
                float avg = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next4).getAvgData().getAvg();
                do {
                    java.lang.Object next11 = it7.next();
                    float avg2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next11).getAvgData().getAvg();
                    if (java.lang.Float.compare(avg, avg2) > 0) {
                        next4 = next11;
                        avg = avg2;
                    }
                } while (it7.hasNext());
            }
        } else {
            next4 = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData2 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next4;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData2 = avgLineChartData2 == null ? null : avgLineChartData2.getAvgData();
        float avg3 = avgData2 == null ? min3 : avgData2.getAvg();
        java.util.Iterator it8 = list4.iterator();
        if (it8.hasNext()) {
            next5 = it8.next();
            if (it8.hasNext()) {
                float minAvg = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next5).getAvgData().getMinAvg();
                do {
                    java.lang.Object next12 = it8.next();
                    float minAvg2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next12).getAvgData().getMinAvg();
                    if (java.lang.Float.compare(minAvg, minAvg2) > 0) {
                        next5 = next12;
                        minAvg = minAvg2;
                    }
                } while (it8.hasNext());
            }
        } else {
            next5 = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData3 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next5;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData3 = avgLineChartData3 == null ? null : avgLineChartData3.getAvgData();
        float maxAvg3 = avgData3 == null ? min3 : avgData3.getMaxAvg();
        java.util.Iterator it9 = list4.iterator();
        if (it9.hasNext()) {
            next6 = it9.next();
            if (it9.hasNext()) {
                float maxAvg4 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next6).getAvgData().getMaxAvg();
                do {
                    java.lang.Object next13 = it9.next();
                    float maxAvg5 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next13).getAvgData().getMaxAvg();
                    if (java.lang.Float.compare(maxAvg4, maxAvg5) > 0) {
                        next6 = next13;
                        maxAvg4 = maxAvg5;
                    }
                } while (it9.hasNext());
            }
        } else {
            next6 = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData4 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) next6;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData4 = avgLineChartData4 != null ? avgLineChartData4.getAvgData() : null;
        float fMin = java.lang.Math.min(java.lang.Math.min(avg3, java.lang.Math.min(maxAvg3, avgData4 == null ? min3 : avgData4.getMinAvg())), min3);
        java.util.ArrayList<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> arrayList10 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list3) {
            if (!((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) obj3).getValid()) {
                arrayList10.add(obj3);
            }
        }
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer4 : arrayList10) {
            temperatureDataContainer4.setMin(fMin);
            temperatureDataContainer4.setAvg(fMin);
            temperatureDataContainer4.setMax(fMin);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> listBuildEntries = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodFormatterViewModelsKt.buildEntries(listConvertDataTemperature);
        java.lang.String str = !kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this$0.userPrefsUtils.isMetricsUsedOrNull(), (java.lang.Object) false) ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricsTemperatureUnit : powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialTemperatureUnit;
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig candleChartConfig = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY, listBuildEntries, null, 0.0f, 0.0f, false, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.DefaultTemperatureConfigProvider.getHeaders$default(this$0.defaultTemperatureConfigProvider, context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodFormatterViewModelsKt.buildHeaderValues(listConvertDataTemperature, str), false, 4, null), null, powerwatch.matrix.com.pwgen2android.R.color.temperature_color, powerwatch.matrix.com.pwgen2android.R.color.temperature_color, null, false, 3260, null);
        java.util.ArrayList arrayList11 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData5 : list4) {
            arrayList11.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData(avgLineChartData5.getXValue(), avgLineChartData5.getAvgData().getAvg()));
        }
        java.util.ArrayList arrayList12 = arrayList11;
        java.util.ArrayList arrayList13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData6 : list4) {
            arrayList13.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData(avgLineChartData6.getXValue(), avgLineChartData6.getAvgData().getMaxAvg()));
        }
        java.util.ArrayList arrayList14 = arrayList13;
        java.util.ArrayList arrayList15 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData7 : list4) {
            arrayList15.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData(avgLineChartData7.getXValue(), avgLineChartData7.getAvgData().getMinAvg()));
        }
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig(str, fMin, candleChartConfig, arrayList12, arrayList14, arrayList15, null, false, this$0.defaultTemperatureConfigProvider.getLegendValues(context), null, null, fMax * 1.2f, false, 5824, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-49, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig m1777getPeriodConfig$lambda49(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.defaultTemperatureConfigProvider.getDefaultConfig(context);
    }
}
