package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels;

/* JADX INFO: compiled from: CaloriesPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesWeekFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "walkingWeekPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;", "restingWeekPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;", "sleepWeekPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "weekCombinedPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;", "configProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/WalkingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/RestingWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/week/SleepWeekPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CaloriesWeekFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider configProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer> weekCombinedPeriodDataProvider;

    public CaloriesWeekFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider walkingWeekPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider restingWeekPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider sleepWeekPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer> weekCombinedPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider configProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeekPeriodProvider, "walkingWeekPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeekPeriodProvider, "restingWeekPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeekPeriodProvider, "sleepWeekPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekCombinedPeriodDataProvider, "weekCombinedPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.weekCombinedPeriodDataProvider = weekCombinedPeriodDataProvider;
        this.configProvider = configProvider;
    }

    public /* synthetic */ CaloriesWeekFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.WalkingWeekPeriodDataProvider walkingWeekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.RestingWeekPeriodDataProvider restingWeekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.week.SleepWeekPeriodDataProvider sleepWeekPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataProviderImpl combinedWeekPeriodDataProviderImpl, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider caloriesPeriodConfigProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingWeekPeriodDataProvider, restingWeekPeriodDataProvider, sleepWeekPeriodDataProvider, goalConfigurationRepository, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataProviderImpl(walkingWeekPeriodDataProvider, restingWeekPeriodDataProvider, sleepWeekPeriodDataProvider) : combinedWeekPeriodDataProviderImpl, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK) : caloriesPeriodConfigProvider);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> getPeriodConfig(java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> observableOnErrorReturn = this.weekCombinedPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityConstantsKt.WEEK_HOURS_PAGE_LIMIT, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekHoursOffsetFromToday(date), 0L, 0, 12, null)).withLatestFrom(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this.goalConfigurationRepository, null, true, 1, null), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.-$$Lambda$CaloriesWeekFormatterViewModel$xpvlHa-VIVPJQ9KV9x2jy4OOWfI
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesWeekFormatterViewModel.m1704getPeriodConfig$lambda0((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer) obj, (java.util.List) obj2);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.-$$Lambda$CaloriesWeekFormatterViewModel$Wngx9RJkQ9k28BOmvJ_8Lqd9TKU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesWeekFormatterViewModel.m1705getPeriodConfig$lambda7(this.f$0, context, (kotlin.Pair) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.-$$Lambda$CaloriesWeekFormatterViewModel$ye7pJBFw3G_GiCzsKYZ9p55DXYM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesWeekFormatterViewModel.m1706getPeriodConfig$lambda8(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "weekCombinedPeriodDataProvider.loadCombinedPeriodData(page)\n                .withLatestFrom(goalConfigurationRepository.all(fromCache = true),\n                        BiFunction<CombinedWeekPeriodDataContainer, List<GoalConfiguration>,\n                                Pair<CombinedWeekPeriodDataContainer, List<GoalConfiguration>>> { periodsContainer, goals -> Pair(periodsContainer, goals) })\n                .map {\n\n                    val periods = it.first\n\n                    // if there is no data, just return default config\n                    if (periods.walkingWeeks.isEmpty() &&\n                            periods.restingWeeks.isEmpty() &&\n                            periods.sleepWeeks.isEmpty()) {\n                        return@map CombinedBarChartConfig(\n                                barConfig = configProvider.getDefaultConfig(context)\n                        )\n                    }\n\n                    val walking = (periods.walkingWeeks.lastOrNull() ?: WalkingWeekPeriod().fillWithEmptyDays())\n                    val resting = (periods.restingWeeks.lastOrNull() ?: RestingWeekPeriod().fillWithEmptyDays())\n                    val sleep = (periods.sleepWeeks.lastOrNull() ?: SleepWeekPeriod().fillWithEmptyDays())\n\n                    val walkingSortedCalories = walking.walkingDays\n                            .sortedBy {\n                                it.dayInWeek\n                            }\n//                            .map { it.activeCalories.plus(it.bmrCalories) }\n\n                    val restingSortedCalories = resting.restingDays\n                            .sortedBy {\n                                it.dayInWeek\n                            }\n//                            .map {\n//                                it.activeCalories.plus(it.bmrCalories)\n//                            }\n\n                    val sleepSortedCalories = sleep.sleepDays\n                            .sortedBy {\n                                it.dayInWeek\n                            }\n//                            .map {\n//                                it.activeCalories.plus(it.bmrCalories)\n//                            }\n\n                    val daysCalories = 0.rangeTo(6)\n                            .map { index ->\n                                val walkingCalories = walkingSortedCalories.getOrNull(index)\n                                val restingCalories = restingSortedCalories.getOrNull(index)\n                                val sleepCalories = sleepSortedCalories.getOrNull(index)\n\n                                CaloriesDataContainer(\n                                        calories = (walkingCalories?.activeCalories?.plus(walkingCalories.bmrCalories) ?: 0) +\n                                                (restingCalories?.activeCalories?.plus(restingCalories.bmrCalories) ?: 0) +\n                                                (sleepCalories?.activeCalories?.plus(sleepCalories.bmrCalories) ?: 0 ),\n                                        malformedContainer = (walkingCalories?.malformed ?: false) ||\n                                                (restingCalories?.malformed ?: false) || (sleepCalories?.malformed ?: false)\n                                )\n                            }\n\n                    val activeCalories = walking.activeCalories\n                            .plus(resting.activeCalories)\n                            .plus(sleep.activeCalories)\n\n                    val bmrCalories = walking.bmrCalories\n                            .plus(resting.bmrCalories)\n                            .plus(sleep.bmrCalories)\n\n                    val barEntries = daysCalories\n                            .mapIndexed { index, dayCalories ->\n                                BarChartEntryData(index.toFloat(), dayCalories.calories.divideRounded(1000).toFloat(), malformed = dayCalories.malformed)\n                            }\n\n                    val max = (daysCalories.map { it.calories }.maxOrNull() ?: 0).divideRounded(1000)\n\n                    val headerValues = listOf(\n                            Pair(context.getString(R.string.active_calories_title), activeCalories.divideRounded(1000).formatByLocale()),\n                            Pair(context.getString(R.string.bmr_calories_title), bmrCalories.divideRounded(1000).formatByLocale())\n                    )\n\n                    var goalThreshold = GoalThreshold()\n\n                    val goalConfig = it.second.lastOrNull()\n                    if (goalConfig != null) {\n                        val goalMax = goalConfig.calories\n                        goalThreshold = GoalThreshold(goalMax, 0, (0.3f * goalMax).roundToInt())\n                    }\n\n                    val yMax = max(max.toFloat(), goalThreshold.max.toFloat())\n\n                    CombinedBarChartConfig(\n                            chartMaximum = 1.2f * yMax,\n                            barConfig = BarChartConfig(\n                            mode = ChartPeriodMode.WEEK,\n                            barEntries = listOf(barEntries),\n                            limitLines = listOf(LimitLineData(goalThreshold.max.toFloat(), goalThreshold.max.toFloat().toString())),\n                            yMinValue = 0f,\n                            yMaxValue = 1.2f * yMax,\n                            multipleColors = true,\n                            headerValues = headerValues,\n                            goalThreshold = goalThreshold,\n                            barColors = listOf(\n                                    R.color.blue_chart,\n                                    R.color.orange_chart,\n                                    R.color.red_chart))\n                    )\n                }\n                .onErrorReturn {\n                    CombinedBarChartConfig(barConfig = configProvider.getDefaultConfig(context))\n                }");
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m1704getPeriodConfig$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer periodsContainer, java.util.List goals) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodsContainer, "periodsContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "goals");
        return new kotlin.Pair(periodsContainer, goals);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x0206  */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-7, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1705getPeriodConfig$lambda7(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesWeekFormatterViewModel this$0, android.content.Context context, kotlin.Pair it) {
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer combinedWeekPeriodDataContainer = (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer) it.getFirst();
        if (combinedWeekPeriodDataContainer.getWalkingWeeks().isEmpty() && combinedWeekPeriodDataContainer.getRestingWeeks().isEmpty() && combinedWeekPeriodDataContainer.getSleepWeeks().isEmpty()) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.configProvider.getDefaultConfig(context), null, false, 0.0f, 59, null);
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
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(walkingWeekPeriodFillWithEmptyDays.getWalkingDays(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesWeekFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t2).getDayInWeek()));
            }
        });
        java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(restingWeekPeriodFillWithEmptyDays.getRestingDays(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesWeekFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t2).getDayInWeek()));
            }
        });
        java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(sleepWeekPeriodFillWithEmptyDays$default.getSleepDays(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesWeekFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t).getDayInWeek()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t2).getDayInWeek()));
            }
        });
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, 6);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRange, 10));
        java.util.Iterator<java.lang.Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it2).nextInt();
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith, iNextInt);
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith2, iNextInt);
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith3, iNextInt);
            java.lang.Integer numValueOf = walkingDayPeriod == null ? null : java.lang.Integer.valueOf(walkingDayPeriod.getActiveCalories());
            int iIntValue = numValueOf == null ? 0 : numValueOf.intValue() + walkingDayPeriod.getBmrCalories();
            java.lang.Integer numValueOf2 = restingDayPeriod == null ? null : java.lang.Integer.valueOf(restingDayPeriod.getActiveCalories());
            int iIntValue2 = iIntValue + (numValueOf2 == null ? 0 : numValueOf2.intValue() + restingDayPeriod.getBmrCalories());
            java.lang.Integer numValueOf3 = sleepDayPeriod == null ? null : java.lang.Integer.valueOf(sleepDayPeriod.getActiveCalories());
            int iIntValue3 = iIntValue2 + (numValueOf3 == null ? 0 : numValueOf3.intValue() + sleepDayPeriod.getBmrCalories());
            if (walkingDayPeriod == null ? false : walkingDayPeriod.getMalformed()) {
                z = true;
            } else if (restingDayPeriod == null ? false : restingDayPeriod.getMalformed()) {
                z = true;
            } else if (sleepDayPeriod == null ? false : sleepDayPeriod.getMalformed()) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer(iIntValue3, false, false, z, 6, null));
        }
        int activeCalories = walkingWeekPeriodFillWithEmptyDays.getActiveCalories() + restingWeekPeriodFillWithEmptyDays.getActiveCalories() + sleepWeekPeriodFillWithEmptyDays$default.getActiveCalories();
        int bmrCalories = walkingWeekPeriodFillWithEmptyDays.getBmrCalories() + restingWeekPeriodFillWithEmptyDays.getBmrCalories() + sleepWeekPeriodFillWithEmptyDays$default.getBmrCalories();
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        int i = 0;
        for (java.lang.Object obj : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer caloriesDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer) obj;
            arrayList3.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData(i, powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(caloriesDataContainer.getCalories()), 1000), caloriesDataContainer.getMalformed()));
            i = i2;
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList5.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer) it3.next()).getCalories()));
        }
        java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList5);
        int iDivideRounded = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(num == null ? 0 : num.intValue()), 1000);
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.active_calories_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.formatByLocale(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(activeCalories), 1000)))), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.bmr_calories_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.formatByLocale(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(bmrCalories), 1000))))});
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold2 = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(0, 0, 0, 7, null);
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) it.getSecond());
        if (goalConfiguration != null) {
            int calories = goalConfiguration.getCalories();
            goalThreshold = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(calories, 0, kotlin.math.MathKt.roundToInt(calories * 0.3f));
        } else {
            goalThreshold = goalThreshold2;
        }
        float fMax = java.lang.Math.max(iDivideRounded, goalThreshold.getMax()) * 1.2f;
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK, kotlin.collections.CollectionsKt.listOf(arrayList4), kotlin.collections.CollectionsKt.listOf(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData(goalThreshold.getMax(), java.lang.String.valueOf(goalThreshold.getMax()))), 0.0f, fMax, false, true, listListOf, goalThreshold, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.blue_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.red_chart)}), false, null, 3104, null), null, false, fMax, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-8, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1706getPeriodConfig$lambda8(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesWeekFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.configProvider.getDefaultConfig(context), null, false, 0.0f, 59, null);
    }
}
