package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels;

/* JADX INFO: compiled from: CaloriesPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "dayWalkingPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;", "dayRestingPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;", "daySleepPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "animate", "", "combinedDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;", "configProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesPeriodConfigProvider;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CaloriesDayFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
    private final boolean animate;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> combinedDayPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider configProvider;

    public CaloriesDayFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider dayWalkingPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider dayRestingPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider daySleepPeriodProvider, boolean z, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> combinedDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider configProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayWalkingPeriodProvider, "dayWalkingPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayRestingPeriodProvider, "dayRestingPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySleepPeriodProvider, "daySleepPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedDayPeriodDataProvider, "combinedDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.animate = z;
        this.combinedDayPeriodDataProvider = combinedDayPeriodDataProvider;
        this.configProvider = configProvider;
    }

    public /* synthetic */ CaloriesDayFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, boolean z, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl combinedDayPeriodDataProviderImpl, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider caloriesPeriodConfigProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider, (i & 8) != 0 ? true : z, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider) : combinedDayPeriodDataProviderImpl, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesPeriodConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY) : caloriesPeriodConfigProvider);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> getPeriodConfig(java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> observableOnErrorReturn = this.combinedDayPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayHoursOffsetFromToday(date), 0L, 0, 12, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.-$$Lambda$CaloriesDayFormatterViewModel$ZnB0w9oIgh95PpS4zOcIZsgn6cQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDayFormatterViewModel.m1699getPeriodConfig$lambda10(this.f$0, context, (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.-$$Lambda$CaloriesDayFormatterViewModel$SdMsH9HY9pvN84kk1DyPBzFXoGY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDayFormatterViewModel.m1700getPeriodConfig$lambda11(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "combinedDayPeriodDataProvider.loadCombinedPeriodData(page)\n                .map { dayPeriods ->\n                    // if there is no data, just return default config\n                    if (dayPeriods.walkingDays.isEmpty() &&\n                            dayPeriods.restingDays.isEmpty() &&\n                            dayPeriods.sleepDays.isEmpty()) {\n                        return@map CombinedBarChartConfig(barConfig = configProvider.getDefaultConfig(context))\n                    }\n\n                    val walking = (dayPeriods.walkingDays.lastOrNull()\n                            ?: WalkingDayPeriod()).fillWithEmptyHours()\n                    val resting = (dayPeriods.restingDays.lastOrNull()\n                            ?: RestingDayPeriod()).fillWithEmptyHours()\n                    val sleep = (dayPeriods.sleepDays.lastOrNull()\n                            ?: SleepDayPeriod()).fillWithEmptyHours()\n\n                    val walkingSortedCalories = walking.walkingHours\n                            .sortedBy {\n                                it.hourInDay\n                            }\n                            .map {\n                                val cals = it.activeCalories.plus(it.bmrCalories)\n                                CaloriesDataContainer(it.activeCalories.plus(it.bmrCalories),\n                                        it.startTime == 0L, it.heartRate != 0F)\n                            }\n\n                    val restingSortedCalories = resting.restingHours\n                            .sortedBy {\n                                it.hourInDay\n                            }\n                            .map {\n                                val cals = it.activeCalories.plus(it.bmrCalories)\n                                CaloriesDataContainer(it.activeCalories.plus(it.bmrCalories),\n                                        it.startTime == 0L, it.heartRate != 0F)\n                            }\n\n                    val sleepSortedCalories = sleep.sleepHours\n                            .sortedBy {\n                                it.hourInDay\n                            }\n                            .map {\n                                val cals = it.activeCalories.plus(it.bmrCalories)\n                                CaloriesDataContainer(it.activeCalories.plus(it.bmrCalories),\n                                        it.startTime == 0L, it.heartRate != 0F)\n                            }\n\n                    val activeCalories = walking.activeCalories\n                            .plus(resting.activeCalories)\n                            .plus(sleep.activeCalories)\n\n                    val bmrCalories = walking.bmrCalories\n                            .plus(resting.bmrCalories)\n                            .plus(sleep.bmrCalories)\n\n                    val headerValues = listOf(\n                            Pair(context.getString(R.string.active_calories_title), activeCalories.divideRounded(1000).formatByLocale()),\n                            Pair(context.getString(R.string.bmr_calories_title), bmrCalories.divideRounded(1000).formatByLocale())\n                    )\n\n                    val entries = 0.until(walking.walkingHours.size)\n                            .map { index ->\n                                val walking = walkingSortedCalories[index]\n                                val resting = restingSortedCalories.getOrNull(index)\n                                val sleeping = sleepSortedCalories.getOrNull(index)\n\n                                val sum = walking.calories + (resting?.calories?: 0) + (sleeping?.calories ?: 0)\n\n                                CaloriesDataContainer(sum, malformedContainer = walking.malformed ||\n                                        (resting?.malformed ?: false) || (sleeping?.malformed ?: false)\n                                )\n                            }\n                            .mapIndexed { index, value ->\n                                BarChartEntryData(index.toFloat(), value.calories.divideRounded(1000).toFloat(), malformed = value.malformed)\n                            }\n                    val max = entries.map { it.createBarEntry() }.maxByOrNull { it.y }?.y ?: 0f\n\n\n\n                    CombinedBarChartConfig(\n                            \"\",\n                            chartMaximum = 1.2f * max,\n                            chartMinimum = 0f,\n                            barConfig = BarChartConfig(\n                                    mode = ChartPeriodMode.DAY,\n                                    barEntries = listOf(entries),\n                                    limitLines = listOf(),\n                                    yMinValue = 0f,\n                                    yMaxValue = 1.2f * max,\n                                    yLinesEnabled = true,\n                                    multipleColors = false,\n                                    headerValues = headerValues,\n                                    barColors = listOf(\n                                            R.color.blue_chart,\n                                            R.color.orange_chart,\n                                            R.color.red_chart),\n                                    performAnimation = animate)\n                    )\n\n                }.onErrorReturn {\n                    CombinedBarChartConfig(\n                     barConfig = configProvider.getDefaultConfig(context)\n                    )\n                }");
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:77:0x033d  */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-10, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1699getPeriodConfig$lambda10(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDayFormatterViewModel this$0, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer dayPeriods) {
        java.lang.Object obj;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPeriods, "dayPeriods");
        if (dayPeriods.getWalkingDays().isEmpty() && dayPeriods.getRestingDays().isEmpty() && dayPeriods.getSleepDays().isEmpty()) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.configProvider.getDefaultConfig(context), null, false, 0.0f, 59, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) dayPeriods.getWalkingDays());
        if (walkingDayPeriod == null) {
            walkingDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod(0L, 0L, 0, 0, null, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0d, 0, 0L, 0, 0.0f, 0.0f, 0.0f, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriodFillWithEmptyHours = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours(walkingDayPeriod);
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) dayPeriods.getRestingDays());
        if (restingDayPeriod == null) {
            restingDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 4194303, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriodFillWithEmptyHours = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours(restingDayPeriod);
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) dayPeriods.getSleepDays());
        if (sleepDayPeriod == null) {
            sleepDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriodFillWithEmptyHours = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours(sleepDayPeriod);
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(walkingDayPeriodFillWithEmptyHours.getWalkingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDayFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        java.util.Iterator it = listSortedWith.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) it.next();
            walkingHourPeriod.getActiveCalories();
            walkingHourPeriod.getBmrCalories();
            int activeCalories = walkingHourPeriod.getActiveCalories() + walkingHourPeriod.getBmrCalories();
            boolean z3 = walkingHourPeriod.getStartTime() == 0;
            if (walkingHourPeriod.getHeartRate() == 0.0f) {
                z2 = true;
            }
            arrayList.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer(activeCalories, z3, !z2, false, 8, null));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(restingDayPeriodFillWithEmptyHours.getRestingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDayFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith2, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod : listSortedWith2) {
            restingHourPeriod.getActiveCalories();
            restingHourPeriod.getBmrCalories();
            arrayList3.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer(restingHourPeriod.getActiveCalories() + restingHourPeriod.getBmrCalories(), restingHourPeriod.getStartTime() == 0, !(restingHourPeriod.getHeartRate() == 0.0f), false, 8, null));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(sleepDayPeriodFillWithEmptyHours.getSleepHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDayFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith3, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod : listSortedWith3) {
            sleepHourPeriod.getActiveCalories();
            sleepHourPeriod.getBmrCalories();
            arrayList5.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer(sleepHourPeriod.getActiveCalories() + sleepHourPeriod.getBmrCalories(), sleepHourPeriod.getStartTime() == 0, !(sleepHourPeriod.getHeartRate() == 0.0f), false, 8, null));
        }
        java.util.ArrayList arrayList6 = arrayList5;
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.active_calories_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.formatByLocale(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(walkingDayPeriodFillWithEmptyHours.getActiveCalories() + restingDayPeriodFillWithEmptyHours.getActiveCalories() + sleepDayPeriodFillWithEmptyHours.getActiveCalories()), 1000)))), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.bmr_calories_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.formatByLocale(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(walkingDayPeriodFillWithEmptyHours.getBmrCalories() + restingDayPeriodFillWithEmptyHours.getBmrCalories() + sleepDayPeriodFillWithEmptyHours.getBmrCalories()), 1000))))});
        kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, walkingDayPeriodFillWithEmptyHours.getWalkingHours().size());
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        java.util.Iterator<java.lang.Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it2).nextInt();
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer caloriesDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer) arrayList2.get(iNextInt);
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer caloriesDataContainer2 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList4, iNextInt);
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer caloriesDataContainer3 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList6, iNextInt);
            int calories = caloriesDataContainer.getCalories() + (caloriesDataContainer2 == null ? 0 : caloriesDataContainer2.getCalories()) + (caloriesDataContainer3 == null ? 0 : caloriesDataContainer3.getCalories());
            if (caloriesDataContainer.getMalformed()) {
                z = true;
            } else if (caloriesDataContainer2 == null ? false : caloriesDataContainer2.getMalformed()) {
                z = true;
            } else if (caloriesDataContainer3 == null ? false : caloriesDataContainer3.getMalformed()) {
                z = true;
            } else {
                z = false;
            }
            arrayList7.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer(calories, false, false, z, 6, null));
        }
        java.util.ArrayList arrayList8 = arrayList7;
        java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
        int i = 0;
        for (java.lang.Object obj2 : arrayList8) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer caloriesDataContainer4 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDataContainer) obj2;
            arrayList9.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData(i, powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(caloriesDataContainer4.getCalories()), 1000), caloriesDataContainer4.getMalformed()));
            i = i2;
        }
        java.util.ArrayList arrayList10 = arrayList9;
        java.util.ArrayList arrayList11 = arrayList10;
        java.util.ArrayList arrayList12 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
        java.util.Iterator it3 = arrayList11.iterator();
        while (it3.hasNext()) {
            arrayList12.add(((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData) it3.next()).createBarEntry());
        }
        java.util.Iterator it4 = arrayList12.iterator();
        if (it4.hasNext()) {
            java.lang.Object next = it4.next();
            if (it4.hasNext()) {
                float y = ((com.github.mikephil.charting.data.BarEntry) next).getY();
                do {
                    java.lang.Object next2 = it4.next();
                    float y2 = ((com.github.mikephil.charting.data.BarEntry) next2).getY();
                    if (java.lang.Float.compare(y, y2) < 0) {
                        next = next2;
                        y = y2;
                    }
                } while (it4.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        com.github.mikephil.charting.data.BarEntry barEntry = (com.github.mikephil.charting.data.BarEntry) obj;
        float y3 = 1.2f * (barEntry != null ? barEntry.getY() : 0.0f);
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig("", 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY, kotlin.collections.CollectionsKt.listOf(arrayList10), kotlin.collections.CollectionsKt.emptyList(), 0.0f, y3, true, false, listListOf, null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.blue_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.red_chart)}), this$0.animate, null, 2304, null), null, false, y3, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-11, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1700getPeriodConfig$lambda11(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDayFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.configProvider.getDefaultConfig(context), null, false, 0.0f, 59, null);
    }
}
