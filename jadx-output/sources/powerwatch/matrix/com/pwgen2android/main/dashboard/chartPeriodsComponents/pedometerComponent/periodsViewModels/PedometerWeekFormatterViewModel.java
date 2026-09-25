package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels;

/* JADX INFO: compiled from: PedometerPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J<\u0010\u001a\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00020\u0002 \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u001b0\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerWeekFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "weekPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;", "restingWeekPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;", "sleepWeekPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "combinedWeekPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataProviderImpl;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataProviderImpl;)V", "defaultHeaderWeekMonthValues", "", "Lkotlin/Pair;", "", "context", "Landroid/content/Context;", "defaultWeekConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;", "date", "Ljava/util/Calendar;", "getPeriodConfig", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PedometerWeekFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataProviderImpl combinedWeekPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    public PedometerWeekFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider weekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider restingWeekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider sleepWeekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataProviderImpl combinedWeekPeriodDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekPeriodDataProvider, "weekPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeekPeriodDataProvider, "restingWeekPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeekPeriodDataProvider, "sleepWeekPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedWeekPeriodDataProvider, "combinedWeekPeriodDataProvider");
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.combinedWeekPeriodDataProvider = combinedWeekPeriodDataProvider;
    }

    public /* synthetic */ PedometerWeekFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider walkingWeekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider restingWeekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider sleepWeekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataProviderImpl combinedWeekPeriodDataProviderImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingWeekPeriodDataProvider, restingWeekPeriodDataProvider, sleepWeekPeriodDataProvider, goalConfigurationRepository, userPrefsUtils, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataProviderImpl(walkingWeekPeriodDataProvider, restingWeekPeriodDataProvider, sleepWeekPeriodDataProvider) : combinedWeekPeriodDataProviderImpl);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> getPeriodConfig(final java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return this.combinedWeekPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityConstantsKt.WEEK_HOURS_PAGE_LIMIT, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekHoursOffsetFromToday(date), 0L, 0, 12, null)).withLatestFrom(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this.goalConfigurationRepository, null, true, 1, null), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.-$$Lambda$PedometerWeekFormatterViewModel$cTIdrlRQeC4tHqT4hoCkhcS_MoY
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerWeekFormatterViewModel.m1733getPeriodConfig$lambda0((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer) obj, (java.util.List) obj2);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.-$$Lambda$PedometerWeekFormatterViewModel$vU7Upejh-a_sNgRQpaczn--U7ew
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerWeekFormatterViewModel.m1734getPeriodConfig$lambda10(this.f$0, date, context, (kotlin.Pair) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.-$$Lambda$PedometerWeekFormatterViewModel$N_dYJ63o3BiusXJkUZ1lS-h635M
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerWeekFormatterViewModel.m1735getPeriodConfig$lambda11(this.f$0, date, context, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m1733getPeriodConfig$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer periods, java.util.List configurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        return configurations.isEmpty() ^ true ? new kotlin.Pair(periods, kotlin.collections.CollectionsKt.last(configurations)) : new kotlin.Pair(periods, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x0216  */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-10, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1734getPeriodConfig$lambda10(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerWeekFormatterViewModel this$0, java.util.Calendar date, android.content.Context context, kotlin.Pair walkingWeeksGoalsPair) {
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeeksGoalsPair, "walkingWeeksGoalsPair");
        if (((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer) walkingWeeksGoalsPair.getFirst()).getWalkingWeeks().isEmpty()) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.defaultWeekConfig(date, context), null, false, 0.0f, 59, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold2 = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(0, 0, 0, 7, null);
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) walkingWeeksGoalsPair.getSecond();
        if (goalConfiguration != null) {
            int steps = goalConfiguration.getSteps();
            goalThreshold = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(steps, 0, kotlin.math.MathKt.roundToInt(steps * 0.3f));
        } else {
            goalThreshold = goalThreshold2;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer combinedWeekPeriodDataContainer = (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer) walkingWeeksGoalsPair.getFirst();
        if (combinedWeekPeriodDataContainer.getWalkingWeeks().isEmpty() && combinedWeekPeriodDataContainer.getRestingWeeks().isEmpty() && combinedWeekPeriodDataContainer.getSleepWeeks().isEmpty()) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.defaultWeekConfig(date, context), null, false, 0.0f, 59, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod walkingWeekPeriodFillWithEmptyDays = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) combinedWeekPeriodDataContainer.getWalkingWeeks());
        if (walkingWeekPeriodFillWithEmptyDays == null) {
            walkingWeekPeriodFillWithEmptyDays = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyDays(new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod(0L, 0L, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0d, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 8388607, null));
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod restingWeekPeriodFillWithEmptyDays = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) combinedWeekPeriodDataContainer.getRestingWeeks());
        if (restingWeekPeriodFillWithEmptyDays == null) {
            restingWeekPeriodFillWithEmptyDays = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyDays(new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 2097151, null));
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod sleepWeekPeriodFillWithEmptyDays$default = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) combinedWeekPeriodDataContainer.getSleepWeeks());
        if (sleepWeekPeriodFillWithEmptyDays$default == null) {
            sleepWeekPeriodFillWithEmptyDays$default = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyDays$default(new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, 0L, 0, 0.0f, 0, 0.0f, 0.0f, null, 8388607, null), false, 0, 3, null);
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDays = walkingWeekPeriodFillWithEmptyDays.getWalkingDays();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> restingDays = restingWeekPeriodFillWithEmptyDays.getRestingDays();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> sleepDays = sleepWeekPeriodFillWithEmptyDays$default.getSleepDays();
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(walkingDays, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerWeekFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t2).getDayInWeek()));
            }
        });
        java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(restingDays, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerWeekFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t2).getDayInWeek()));
            }
        });
        java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(sleepDays, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerWeekFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t2).getDayInWeek()));
            }
        });
        kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, listSortedWith.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it).nextInt();
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) listSortedWith.get(iNextInt);
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith2, iNextInt);
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith3, iNextInt);
            int steps2 = walkingDayPeriod.getSteps();
            if (walkingDayPeriod.getMalformed()) {
                z = true;
            } else if (restingDayPeriod == null ? false : restingDayPeriod.getMalformed()) {
                z = true;
            } else if (sleepDayPeriod == null ? false : sleepDayPeriod.getMalformed()) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer(steps2, false, false, z, 6, null));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        int i = 0;
        for (java.lang.Object obj : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer pedometerDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer) obj;
            arrayList3.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData(i, pedometerDataContainer.getSteps(), pedometerDataContainer.getMalformed()));
            i = i2;
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDays2 = walkingWeekPeriodFillWithEmptyDays.getWalkingDays();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj2 : walkingDays2) {
            if (((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) obj2).getStartTime() > 0) {
                arrayList5.add(obj2);
            }
        }
        java.util.ArrayList arrayList6 = arrayList5;
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
        java.util.Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList7.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) it2.next()).getSteps()));
        }
        java.util.ArrayList arrayList8 = arrayList7;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDays3 = walkingWeekPeriodFillWithEmptyDays.getWalkingDays();
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        for (java.lang.Object obj3 : walkingDays3) {
            if (((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) obj3).getStartTime() > 0) {
                arrayList9.add(obj3);
            }
        }
        java.util.ArrayList arrayList10 = arrayList9;
        java.util.ArrayList arrayList11 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList10, 10));
        java.util.Iterator it3 = arrayList10.iterator();
        while (it3.hasNext()) {
            arrayList11.add(java.lang.Double.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divide((java.lang.Number) java.lang.Double.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) it3.next()).getDistance()), 1000)));
        }
        java.util.ArrayList arrayList12 = arrayList8;
        int iRoundToInt = kotlin.math.MathKt.roundToInt(kotlin.collections.CollectionsKt.averageOfInt(arrayList12));
        double dAverageOfDouble = kotlin.collections.CollectionsKt.averageOfDouble(arrayList11);
        java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList12);
        int iIntValue = num == null ? 0 : num.intValue();
        kotlin.Pair<java.lang.Float, java.lang.String> value = this$0.userPrefsUtils.getValue(java.lang.Float.valueOf((float) dAverageOfDouble), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
        kotlin.Pair<java.lang.Float, java.lang.String> value2 = this$0.userPrefsUtils.getValue(java.lang.Float.valueOf((float) powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divide((java.lang.Number) java.lang.Double.valueOf(walkingWeekPeriodFillWithEmptyDays.getDistance()), 1000)), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_steps_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.formatByLocale(java.lang.Integer.valueOf(walkingWeekPeriodFillWithEmptyDays.getSteps()))), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_distance_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.twoDecimalsFormat(value2.getFirst().floatValue()) + ' ' + value2.getSecond()), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.avg_steps_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.formatByLocale(java.lang.Integer.valueOf(iRoundToInt))), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.avg_distance_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.twoDecimalsFormat(value.getFirst().floatValue()) + ' ' + value.getSecond())});
        float fMax = java.lang.Math.max((float) iIntValue, (float) goalThreshold.getMax()) * 1.2f;
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK, kotlin.collections.CollectionsKt.listOf(arrayList4), kotlin.collections.CollectionsKt.listOf(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData(goalThreshold.getMax(), java.lang.String.valueOf(goalThreshold.getMax()))), 0.0f, fMax, false, true, listListOf, goalThreshold, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.green_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.red_chart)}), false, null, 3112, null), null, false, fMax, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-11, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1735getPeriodConfig$lambda11(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerWeekFormatterViewModel this$0, java.util.Calendar date, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.defaultWeekConfig(date, context), null, false, 0.0f, 59, null);
    }

    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig defaultWeekConfig(java.util.Calendar date, android.content.Context context) {
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK, kotlin.collections.CollectionsKt.emptyList(), null, 0.0f, 0.0f, false, false, defaultHeaderWeekMonthValues(context), null, null, false, null, 3964, null);
    }

    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> defaultHeaderWeekMonthValues(android.content.Context context) {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.avg_steps_title), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_steps_title), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_distance_title), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.avg_distance_title), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText)});
    }
}
