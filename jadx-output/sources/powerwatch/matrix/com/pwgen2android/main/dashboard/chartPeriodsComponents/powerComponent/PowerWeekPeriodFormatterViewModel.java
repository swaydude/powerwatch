package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent;

/* JADX INFO: compiled from: PowerPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00020\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerWeekPeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "walkingWeekPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;", "restingWeekPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;", "sleepWeekPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;", "goalsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "weekCombinedPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;", "defaultPowerConfigProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PowerWeekPeriodFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider defaultPowerConfigProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalsRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer> weekCombinedPeriodDataProvider;

    public PowerWeekPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider walkingWeekPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider restingWeekPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider sleepWeekPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalsRepository, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer> weekCombinedPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider defaultPowerConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeekPeriodProvider, "walkingWeekPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeekPeriodProvider, "restingWeekPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeekPeriodProvider, "sleepWeekPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsRepository, "goalsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekCombinedPeriodDataProvider, "weekCombinedPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultPowerConfigProvider, "defaultPowerConfigProvider");
        this.goalsRepository = goalsRepository;
        this.weekCombinedPeriodDataProvider = weekCombinedPeriodDataProvider;
        this.defaultPowerConfigProvider = defaultPowerConfigProvider;
    }

    public /* synthetic */ PowerWeekPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider walkingWeekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider restingWeekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider sleepWeekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataProviderImpl combinedWeekPeriodDataProviderImpl, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider defaultPowerConfigProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingWeekPeriodDataProvider, restingWeekPeriodDataProvider, sleepWeekPeriodDataProvider, goalConfigurationRepository, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataProviderImpl(walkingWeekPeriodDataProvider, restingWeekPeriodDataProvider, sleepWeekPeriodDataProvider) : combinedWeekPeriodDataProviderImpl, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK) : defaultPowerConfigProvider);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> getPeriodConfig(java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> observableOnErrorReturn = this.weekCombinedPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityConstantsKt.WEEK_HOURS_PAGE_LIMIT, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekHoursOffsetFromToday(date), 0L, 0, 12, null)).withLatestFrom(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this.goalsRepository, null, true, 1, null), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.-$$Lambda$PowerWeekPeriodFormatterViewModel$ueoKVOMmdBek_3JsLQGPZk2oy80
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerWeekPeriodFormatterViewModel.m1747getPeriodConfig$lambda0((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer) obj, (java.util.List) obj2);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.-$$Lambda$PowerWeekPeriodFormatterViewModel$IoaUS6yZPZNhT7Nn7oluS8galf8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerWeekPeriodFormatterViewModel.m1748getPeriodConfig$lambda12(this.f$0, context, (kotlin.Pair) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.-$$Lambda$PowerWeekPeriodFormatterViewModel$v2r9MhJB8GdYMVmDnR2ReABcl-8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerWeekPeriodFormatterViewModel.m1749getPeriodConfig$lambda13(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(observableOnErrorReturn);
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m1747getPeriodConfig$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer periods, java.util.List configurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        return configurations.isEmpty() ^ true ? new kotlin.Pair(periods, kotlin.collections.CollectionsKt.last(configurations)) : new kotlin.Pair(periods, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x0260  */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-12, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1748getPeriodConfig$lambda12(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerWeekPeriodFormatterViewModel this$0, android.content.Context context, kotlin.Pair periodsGoalsPair) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodsGoalsPair, "periodsGoalsPair");
        powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer combinedWeekPeriodDataContainer = (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer) periodsGoalsPair.getFirst();
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) periodsGoalsPair.getSecond();
        if (combinedWeekPeriodDataContainer.getWalkingWeeks().isEmpty() && combinedWeekPeriodDataContainer.getRestingWeeks().isEmpty() && combinedWeekPeriodDataContainer.getSleepWeeks().isEmpty()) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.defaultPowerConfigProvider.getDefaultWeekConfig(context), null, false, 0.0f, 59, null);
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
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(walkingDays, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerWeekPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t2).getDayInWeek()));
            }
        });
        java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(restingDays, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerWeekPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t2).getDayInWeek()));
            }
        });
        java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(sleepDays, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerWeekPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t2).getDayInWeek()));
            }
        });
        java.util.List list = listSortedWith;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) next;
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith2, i);
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith3, i);
            float bodyPower = walkingDayPeriod.getBodyPower();
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod2 = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith2, i);
            float bodyPower2 = restingDayPeriod2 == null ? 0.0f : restingDayPeriod2.getBodyPower();
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod2 = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith3, i);
            float bodyPower3 = ((bodyPower + bodyPower2) + (sleepDayPeriod2 != null ? sleepDayPeriod2.getBodyPower() : 0.0f)) / 60.0f;
            if (walkingDayPeriod.getMalformed()) {
                z2 = true;
            } else if (restingDayPeriod == null ? false : restingDayPeriod.getMalformed()) {
                z2 = true;
            } else if (sleepDayPeriod == null ? false : sleepDayPeriod.getMalformed()) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer(0.0f, bodyPower3, false, false, z2, 12, null));
            i = i2;
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i3 = 0;
        for (java.lang.Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod2 = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) obj;
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod3 = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith2, i3);
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod3 = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith3, i3);
            float solarPower = walkingDayPeriod2.getSolarPower();
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod4 = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith2, i3);
            float solarPower2 = restingDayPeriod4 == null ? 0.0f : restingDayPeriod4.getSolarPower();
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod4 = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith3, i3);
            float solarPower3 = ((solarPower + solarPower2) + (sleepDayPeriod4 == null ? 0.0f : sleepDayPeriod4.getSolarPower())) / 60.0f;
            if (walkingDayPeriod2.getMalformed()) {
                z = true;
            } else if (restingDayPeriod3 == null ? false : restingDayPeriod3.getMalformed()) {
                z = true;
            } else if (sleepDayPeriod3 == null ? false : sleepDayPeriod3.getMalformed()) {
                z = true;
            } else {
                z = false;
            }
            arrayList3.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer(solarPower3, 0.0f, false, false, z, 12, null));
            i3 = i4;
        }
        java.util.ArrayList arrayList4 = arrayList2;
        java.util.ArrayList arrayList5 = arrayList3;
        java.util.List listZip = kotlin.collections.CollectionsKt.zip(arrayList4, arrayList5);
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip, 10));
        int i5 = 0;
        float f = 0.0f;
        for (java.lang.Object obj2 : listZip) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.Pair pair = (kotlin.Pair) obj2;
            float bodyPower4 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getFirst()).getBodyPower() + ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getSecond()).getSolarPower();
            if (f < bodyPower4) {
                f = bodyPower4;
            }
            arrayList6.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData(i5, new float[]{((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getFirst()).getBodyPower(), ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getSecond()).getSolarPower()}, ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getFirst()).getMalformed() || ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getSecond()).getMalformed()));
            i5 = i6;
        }
        java.util.ArrayList arrayList7 = arrayList6;
        java.util.List<kotlin.Pair> listZip2 = kotlin.collections.CollectionsKt.zip(arrayList4, arrayList5);
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip2, 10));
        for (kotlin.Pair pair2 : listZip2) {
            arrayList8.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair2.getFirst()).getBodyPower() + ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair2.getSecond()).getSolarPower()));
        }
        java.lang.Float fMaxOrNull = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList8);
        float fFloatValue = fMaxOrNull != null ? fMaxOrNull.floatValue() : 0.0f;
        java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        java.util.Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList9.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) it2.next()).getBodyPower()));
        }
        java.util.Iterator it3 = arrayList9.iterator();
        double dFloatValue = 0.0d;
        while (it3.hasNext()) {
            dFloatValue += (double) ((java.lang.Number) it3.next()).floatValue();
        }
        float f2 = (float) dFloatValue;
        java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        java.util.Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            arrayList10.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) it4.next()).getSolarPower()));
        }
        java.util.Iterator it5 = arrayList10.iterator();
        double dFloatValue2 = 0.0d;
        while (it5.hasNext()) {
            dFloatValue2 += (double) ((java.lang.Number) it5.next()).floatValue();
        }
        float f3 = (float) dFloatValue2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        float f4 = 60;
        sb.append(kotlin.math.MathKt.roundToInt((((walkingWeekPeriodFillWithEmptyDays.getBodyPower() + restingWeekPeriodFillWithEmptyDays.getBodyPower()) + sleepWeekPeriodFillWithEmptyDays$default.getBodyPower()) / walkingWeekPeriodFillWithEmptyDays.getWalkingDays().size()) / f4));
        sb.append(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit);
        java.lang.String string = sb.toString();
        java.lang.String str = kotlin.math.MathKt.roundToInt((((walkingWeekPeriodFillWithEmptyDays.getSolarPower() + restingWeekPeriodFillWithEmptyDays.getSolarPower()) + sleepWeekPeriodFillWithEmptyDays$default.getSolarPower()) / walkingWeekPeriodFillWithEmptyDays.getWalkingDays().size()) / f4) + powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit;
        java.lang.String str2 = ((int) f2) + powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit;
        java.lang.String str3 = ((int) f3) + powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit;
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(0, 0, 0, 7, null);
        if (goalConfiguration != null) {
            int power = goalConfiguration.getPower();
            goalThreshold = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(power, 0, kotlin.math.MathKt.roundToInt(power * 0.3f));
        }
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK, kotlin.collections.CollectionsKt.listOf(arrayList7), kotlin.collections.CollectionsKt.listOf(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData(goalThreshold.getMax(), java.lang.String.valueOf(goalThreshold.getMax()))), 0.0f, fFloatValue * 1.2f, false, true, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider.getHeaders$default(this$0.defaultPowerConfigProvider, context, new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues(string, str, str2, str3), false, 4, null), null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.dark_orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.red_chart)}), false, java.lang.String.valueOf(f2 + f3), 1320, null), null, false, f * 1.2f, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-13, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1749getPeriodConfig$lambda13(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerWeekPeriodFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.defaultPowerConfigProvider.getDefaultWeekConfig(context), null, false, 0.0f, 59, null);
    }
}
