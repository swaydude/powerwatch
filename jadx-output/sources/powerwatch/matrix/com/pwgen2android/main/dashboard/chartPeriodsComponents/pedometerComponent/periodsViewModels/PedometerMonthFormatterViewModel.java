package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels;

/* JADX INFO: compiled from: PedometerPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J<\u0010\u001a\u001a&\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00020\u0002 \u001c*\u0012\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u001b0\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerMonthFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "monthPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;", "restingMonthPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;", "sleepMonthPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "combinedMonthPeriodDataProviderImpl", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataProviderImpl;)V", "defaultHeaderWeekMonthValues", "", "Lkotlin/Pair;", "", "context", "Landroid/content/Context;", "defaultMonthConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;", "date", "Ljava/util/Calendar;", "getPeriodConfig", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PedometerMonthFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl combinedMonthPeriodDataProviderImpl;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    public PedometerMonthFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider monthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl combinedMonthPeriodDataProviderImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthPeriodDataProvider, "monthPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriodDataProvider, "restingMonthPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriodDataProvider, "sleepMonthPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedMonthPeriodDataProviderImpl, "combinedMonthPeriodDataProviderImpl");
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.combinedMonthPeriodDataProviderImpl = combinedMonthPeriodDataProviderImpl;
    }

    public /* synthetic */ PedometerMonthFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider walkingMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl combinedMonthPeriodDataProviderImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingMonthPeriodDataProvider, restingMonthPeriodDataProvider, sleepMonthPeriodDataProvider, goalConfigurationRepository, userPrefsUtils, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl(walkingMonthPeriodDataProvider, restingMonthPeriodDataProvider, sleepMonthPeriodDataProvider) : combinedMonthPeriodDataProviderImpl);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> getPeriodConfig(final java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return this.combinedMonthPeriodDataProviderImpl.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.numOfDaysInMonth(date) * 24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthHoursOffsetFromToday(date), 0L, 0, 12, null)).withLatestFrom(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this.goalConfigurationRepository, null, true, 1, null), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.-$$Lambda$PedometerMonthFormatterViewModel$CiwiaUsjuQPY3xZL_NDbwNrw6aU
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerMonthFormatterViewModel.m1730getPeriodConfig$lambda0((powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer) obj, (java.util.List) obj2);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.-$$Lambda$PedometerMonthFormatterViewModel$DFFl2dXqNc0pfqnktDrHmqthhzw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerMonthFormatterViewModel.m1731getPeriodConfig$lambda10(this.f$0, date, context, (kotlin.Pair) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.-$$Lambda$PedometerMonthFormatterViewModel$oJRk4VuTrp7Uitrf1VvHJM7GhpA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerMonthFormatterViewModel.m1732getPeriodConfig$lambda11(this.f$0, date, context, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m1730getPeriodConfig$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer periods, java.util.List configurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        return configurations.isEmpty() ^ true ? new kotlin.Pair(periods, kotlin.collections.CollectionsKt.last(configurations)) : new kotlin.Pair(periods, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-10, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1731getPeriodConfig$lambda10(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerMonthFormatterViewModel this$0, java.util.Calendar date, android.content.Context context, kotlin.Pair walkingMonthsGoalsPair) {
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthsGoalsPair, "walkingMonthsGoalsPair");
        powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer combinedMonthPeriodDataContainer = (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer) walkingMonthsGoalsPair.getFirst();
        if (combinedMonthPeriodDataContainer.getWalkingMonths().isEmpty() && combinedMonthPeriodDataContainer.getRestingMonths().isEmpty() && combinedMonthPeriodDataContainer.getSleepMonths().isEmpty()) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.defaultMonthConfig(date, context), null, false, 0.0f, 59, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold goalThreshold2 = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(0, 0, 0, 7, null);
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) walkingMonthsGoalsPair.getSecond();
        if (goalConfiguration != null) {
            int steps = goalConfiguration.getSteps();
            goalThreshold = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.GoalThreshold(steps, 0, kotlin.math.MathKt.roundToInt(steps * 0.3f));
        } else {
            goalThreshold = goalThreshold2;
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
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.getFilledDays(walkingMonthPeriod), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerMonthFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.getFilledDays(restingMonthPeriod), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerMonthFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.getFilledDays$default(sleepMonthPeriod, 0, 1, null), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerMonthFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$3
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
            boolean malformed = restingDayPeriod == null ? false : restingDayPeriod.getMalformed();
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith3, i);
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData(walkingDayPeriod.getDayInMonth() - 1, walkingDayPeriod.getSteps(), walkingDayPeriod.getMalformed() || malformed || (sleepDayPeriod == null ? false : sleepDayPeriod.getMalformed())));
            i = i2;
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) it.next()).getSteps()));
        }
        java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList3);
        int iIntValue = num == null ? 0 : num.intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) obj2).getStartTime() > 0) {
                arrayList4.add(obj2);
            }
        }
        java.util.ArrayList arrayList5 = arrayList4;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        java.util.Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) it2.next()).getSteps()));
        }
        int iRoundToInt = kotlin.math.MathKt.roundToInt(kotlin.collections.CollectionsKt.averageOfInt(arrayList6));
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) obj3).getStartTime() > 0) {
                arrayList7.add(obj3);
            }
        }
        java.util.ArrayList arrayList8 = arrayList7;
        java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
        java.util.Iterator it3 = arrayList8.iterator();
        while (it3.hasNext()) {
            arrayList9.add(java.lang.Double.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divide((java.lang.Number) java.lang.Double.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) it3.next()).getDistance()), 1000)));
        }
        kotlin.Pair<java.lang.Float, java.lang.String> value = this$0.userPrefsUtils.getValue(java.lang.Float.valueOf((float) kotlin.collections.CollectionsKt.averageOfDouble(arrayList9)), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
        kotlin.Pair<java.lang.Float, java.lang.String> value2 = this$0.userPrefsUtils.getValue(java.lang.Float.valueOf((float) powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divide((java.lang.Number) java.lang.Double.valueOf(walkingMonthPeriod.getDistance()), 1000)), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.avg_steps_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.formatByLocale(java.lang.Integer.valueOf(iRoundToInt))), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_distance_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.twoDecimalsFormat(value2.getFirst().floatValue()) + ' ' + value2.getSecond()), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_steps_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.formatByLocale(java.lang.Integer.valueOf(walkingMonthPeriod.getSteps()))), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.avg_distance_title), powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.twoDecimalsFormat(value.getFirst().floatValue()) + ' ' + value.getSecond())});
        float fMax = java.lang.Math.max((float) iIntValue, (float) goalThreshold.getMax()) * 1.2f;
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH, kotlin.collections.CollectionsKt.listOf(arrayList2), kotlin.collections.CollectionsKt.listOf(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData(goalThreshold.getMax(), java.lang.String.valueOf(goalThreshold.getMax()))), 0.0f, fMax, false, true, listListOf, goalThreshold, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.green_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.red_chart)}), false, null, 3104, null), null, false, fMax, 25, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-11, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1732getPeriodConfig$lambda11(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerMonthFormatterViewModel this$0, java.util.Calendar date, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "$date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.defaultMonthConfig(date, context), null, false, 0.0f, 59, null);
    }

    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> defaultHeaderWeekMonthValues(android.content.Context context) {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_steps_title), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_distance_title), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.avg_steps_title), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.avg_distance_title), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText)});
    }

    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig defaultMonthConfig(java.util.Calendar date, android.content.Context context) {
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH, kotlin.collections.CollectionsKt.emptyList(), null, 0.0f, 0.0f, false, false, defaultHeaderWeekMonthValues(context), null, null, false, null, 3964, null);
    }
}
