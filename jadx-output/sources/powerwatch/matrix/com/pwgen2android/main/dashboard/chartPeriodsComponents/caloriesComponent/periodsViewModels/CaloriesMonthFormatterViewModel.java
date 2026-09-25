package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels;

/* JADX INFO: compiled from: CaloriesPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesMonthFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "walkingMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;", "restingMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;", "sleepMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "combinedMonthPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;", "configProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CaloriesMonthFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer> combinedMonthPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider configProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;

    public CaloriesMonthFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider walkingMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer> combinedMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider configProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthPeriodProvider, "walkingMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriodProvider, "restingMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriodProvider, "sleepMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedMonthPeriodDataProvider, "combinedMonthPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.combinedMonthPeriodDataProvider = combinedMonthPeriodDataProvider;
        this.configProvider = configProvider;
    }

    public /* synthetic */ CaloriesMonthFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider walkingMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl combinedMonthPeriodDataProviderImpl, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider caloriesPeriodConfigProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingMonthPeriodDataProvider, restingMonthPeriodDataProvider, sleepMonthPeriodDataProvider, goalConfigurationRepository, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl(walkingMonthPeriodDataProvider, restingMonthPeriodDataProvider, sleepMonthPeriodDataProvider) : combinedMonthPeriodDataProviderImpl, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH) : caloriesPeriodConfigProvider);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> getPeriodConfig(java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> observableOnErrorReturn = this.combinedMonthPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.numOfDaysInMonth(date) * 24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthHoursOffsetFromToday(date), 0L, 0, 12, null)).withLatestFrom(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this.goalConfigurationRepository, null, true, 1, null), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.-$$Lambda$CaloriesMonthFormatterViewModel$rPLaOcsAxGhPXegy6H1lkNdt_Ps
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesMonthFormatterViewModel.m1701getPeriodConfig$lambda0((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer) obj, (java.util.List) obj2);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.-$$Lambda$CaloriesMonthFormatterViewModel$SrnKMHwCIgI8D0DPQNZ0eKSjYxY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesMonthFormatterViewModel.m1702getPeriodConfig$lambda7(this.f$0, context, (kotlin.Pair) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.-$$Lambda$CaloriesMonthFormatterViewModel$_YlVnFFxOIgFBOcPnrhOk1Ud40o
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesMonthFormatterViewModel.m1703getPeriodConfig$lambda8(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "combinedMonthPeriodDataProvider.loadCombinedPeriodData(page)\n                .withLatestFrom(goalConfigurationRepository.all(fromCache = true),\n                        BiFunction<CombinedMonthPeriodDataContainer, List<GoalConfiguration>, Pair<CombinedMonthPeriodDataContainer, List<GoalConfiguration>>> { periodsContainer, goals -> Pair(periodsContainer, goals) })\n                .map {\n\n                    val periodsContainer = it.first\n                    // if there is no data, just return default config\n                    if (periodsContainer.walkingMonths.isEmpty() && periodsContainer.restingMonths.isEmpty()\n                            && periodsContainer.sleepMonths.isEmpty()) {\n                        return@map CombinedBarChartConfig(\n                                barConfig = configProvider.getDefaultConfig(context)\n                        )\n                    }\n\n                    val walking = periodsContainer.walkingMonths.lastOrNull()\n                            ?: WalkingMonthPeriod()\n                    val resting = periodsContainer.restingMonths.lastOrNull()\n                            ?: RestingMonthPeriod()\n                    val sleep = periodsContainer.sleepMonths.lastOrNull()\n                            ?: SleepMonthPeriod()\n\n\n                    val filledWalkingDays = walking.getFilledDays()\n                    val filledRestingDays = resting.getFilledDays()\n                    val filledSleepDays = sleep.getFilledDays()\n\n                    val walkingCaloriesSorted = filledWalkingDays\n                            .sortedBy { it.dayInMonth }\n//                            .map { it.activeCalories.plus(it.bmrCalories) }\n\n                    val restingCaloriesSorted = filledRestingDays\n                            .sortedBy { it.dayInMonth }\n//                            .map { it.activeCalories.plus(it.bmrCalories) }\n\n                    val sleepCaloriesSorted = filledSleepDays\n                            .sortedBy { it.dayInMonth }\n//                            .map { it.activeCalories.plus(it.bmrCalories) }\n\n                    val daysCalories = walkingCaloriesSorted.mapIndexed { index, walkingCalories ->\n\n                        val restingCalories = restingCaloriesSorted.getOrNull(index)\n                        val sleepCalories = sleepCaloriesSorted.getOrNull(index)\n\n                        CaloriesDataContainer(\n                                calories = (walkingCalories.activeCalories.plus(walkingCalories.bmrCalories)) +\n                                        (restingCalories?.activeCalories?.plus(restingCalories.bmrCalories) ?: 0) +\n                                        (sleepCalories?.activeCalories?.plus(sleepCalories.bmrCalories) ?: 0 ),\n                                malformedContainer = (walkingCalories.malformed) ||\n                                        (restingCalories?.malformed ?: false) || (sleepCalories?.malformed ?: false)\n                        )\n                    }\n\n\n                    val barEntries = daysCalories.mapIndexed { index, dayCalories ->\n                        BarChartEntryData(index.toFloat(), dayCalories.calories.divideRounded(1000).toFloat(), malformed = dayCalories.malformed)\n                    }\n\n                    val bmrCalories = walking.bmrCalories\n                            .plus(resting.bmrCalories)\n                            .plus(sleep.bmrCalories)\n\n                    val activeCalories = walking.activeCalories\n                            .plus(resting.activeCalories)\n                            .plus(sleep.activeCalories)\n\n                    val max = (daysCalories.map { it.calories }.maxOrNull() ?: 0).divideRounded(1000)\n                    val headerValues = listOf(\n                            Pair(context.getString(R.string.active_calories_title), activeCalories.divideRounded(1000).formatByLocale()),\n                            Pair(context.getString(R.string.bmr_calories_title),\n                                    bmrCalories.divideRounded(1000).formatByLocale())\n                    )\n\n                    var goalThreshold = GoalThreshold()\n\n                    val goalConfig = it.second.lastOrNull()\n                    if (goalConfig != null) {\n                        val goalMax = goalConfig.calories\n                        goalThreshold = GoalThreshold(goalMax, 0, (0.3f * goalMax).roundToInt())\n                    }\n\n                    val chartMax = max(max.toFloat(), goalThreshold.max.toFloat())\n                    CombinedBarChartConfig(\n                            chartMaximum = 1.2f * chartMax,\n                            barConfig = BarChartConfig(\n                            mode = ChartPeriodMode.MONTH,\n                            barEntries = listOf(barEntries),\n                            limitLines = listOf(LimitLineData(goalThreshold.max.toFloat(), goalThreshold.max.toFloat().toString())),\n                            yMinValue = 0f,\n                            yMaxValue = 1.2f * chartMax,\n                            multipleColors = true,\n                            headerValues = headerValues,\n                            goalThreshold = goalThreshold,\n                            barColors = listOf(\n                                    R.color.blue_chart,\n                                    R.color.orange_chart,\n                                    R.color.red_chart))\n                    )\n                }.onErrorReturn {\n                    CombinedBarChartConfig(barConfig = configProvider.getDefaultConfig(context))\n                }");
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m1701getPeriodConfig$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer periodsContainer, java.util.List goals) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodsContainer, "periodsContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "goals");
        return new kotlin.Pair(periodsContainer, goals);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:51:0x01d9  */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-7, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1702getPeriodConfig$lambda7(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesMonthFormatterViewModel this$0, android.content.Context context, kotlin.Pair it) {
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer combinedMonthPeriodDataContainer = (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer) it.getFirst();
        if (combinedMonthPeriodDataContainer.getWalkingMonths().isEmpty() && combinedMonthPeriodDataContainer.getRestingMonths().isEmpty() && combinedMonthPeriodDataContainer.getSleepMonths().isEmpty()) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.configProvider.getDefaultConfig(context), null, false, 0.0f, 59, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod walkingMonthPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) combinedMonthPeriodDataContainer.getWalkingMonths());
        if (walkingMonthPeriod == null) {
            walkingMonthPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod(0L, 0L, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0d, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 8388607, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod restingMonthPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) combinedMonthPeriodDataContainer.getRestingMonths());
        if (restingMonthPeriod == null) {
            restingMonthPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 2097151, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod sleepMonthPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) combinedMonthPeriodDataContainer.getSleepMonths());
        if (sleepMonthPeriod == null) {
            sleepMonthPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, 0L, 0, 0.0f, 0, 0.0f, 0.0f, null, 8388607, null);
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> filledDays = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.getFilledDays(walkingMonthPeriod);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> filledDays2 = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.getFilledDays(restingMonthPeriod);
        java.util.List filledDays$default = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.getFilledDays$default(sleepMonthPeriod, 0, 1, null);
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(filledDays, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesMonthFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(filledDays2, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesMonthFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(filledDays$default, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesMonthFormatterViewModel$getPeriodConfig$lambda-7$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List list = listSortedWith;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) obj;
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith2, i);
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith3, i);
            int activeCalories = walkingDayPeriod.getActiveCalories() + walkingDayPeriod.getBmrCalories();
            java.lang.Integer numValueOf = restingDayPeriod == null ? null : java.lang.Integer.valueOf(restingDayPeriod.getActiveCalories());
            int iIntValue = activeCalories + (numValueOf == null ? 0 : numValueOf.intValue() + restingDayPeriod.getBmrCalories());
            java.lang.Integer numValueOf2 = sleepDayPeriod == null ? null : java.lang.Integer.valueOf(sleepDayPeriod.getActiveCalories());
            int iIntValue2 = iIntValue + (numValueOf2 == null ? 0 : numValueOf2.intValue() + sleepDayPeriod.getBmrCalories());
            if (walkingDayPeriod.getMalformed()) {
                z = true;
            } else if (restingDayPeriod == null ? false : restingDayPeriod.getMalformed()) {
                z = true;
            } else if (sleepDayPeriod == null ? false : sleepDayPeriod.getMalformed()) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer(iIntValue2, false, false, z, 6, null));
            i = i2;
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        int i3 = 0;
        for (java.lang.Object obj2 : arrayList2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer caloriesDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer) obj2;
            arrayList3.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData(i3, powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(caloriesDataContainer.getCalories()), 1000), caloriesDataContainer.getMalformed()));
            i3 = i4;
        }
        java.util.ArrayList arrayList4 = arrayList3;
        int bmrCalories = walkingMonthPeriod.getBmrCalories() + restingMonthPeriod.getBmrCalories() + sleepMonthPeriod.getBmrCalories();
        int activeCalories2 = walkingMonthPeriod.getActiveCalories() + restingMonthPeriod.getActiveCalories() + sleepMonthPeriod.getActiveCalories();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList5.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer) it2.next()).getCalories()));
        }
        java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList5);
        int iDivideRounded = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(num == null ? 0 : num.intValue()), 1000);
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.active_calories_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.formatByLocale(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(activeCalories2), 1000)))), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.bmr_calories_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.formatByLocale(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(bmrCalories), 1000))))});
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold2 = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(0, 0, 0, 7, null);
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) it.getSecond());
        if (goalConfiguration != null) {
            int calories = goalConfiguration.getCalories();
            goalThreshold = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(calories, 0, kotlin.math.MathKt.roundToInt(calories * 0.3f));
        } else {
            goalThreshold = goalThreshold2;
        }
        float fMax = java.lang.Math.max(iDivideRounded, goalThreshold.getMax()) * 1.2f;
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH, kotlin.collections.CollectionsKt.listOf(arrayList4), kotlin.collections.CollectionsKt.listOf(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData(goalThreshold.getMax(), java.lang.String.valueOf(goalThreshold.getMax()))), 0.0f, fMax, false, true, listListOf, goalThreshold, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.blue_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.red_chart)}), false, null, 3104, null), null, false, fMax, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-8, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1703getPeriodConfig$lambda8(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesMonthFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.configProvider.getDefaultConfig(context), null, false, 0.0f, 59, null);
    }
}
