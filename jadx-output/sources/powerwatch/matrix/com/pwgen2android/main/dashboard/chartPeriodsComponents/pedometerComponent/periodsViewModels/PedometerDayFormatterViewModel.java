package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels;

/* JADX INFO: compiled from: PedometerPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\"\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J<\u0010\u0018\u001a&\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00020\u0002 \u001a*\u0012\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00190\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerDayFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "walkingDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;", "restingDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;", "sleepDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "shortLegend", "", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "combinedDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;)V", "defaultDayConfig", "context", "Landroid/content/Context;", "defaultHeaderDayValues", "", "Lkotlin/Pair;", "", "getPeriodConfig", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "date", "Ljava/util/Calendar;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PedometerDayFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> combinedDayPeriodDataProvider;
    private final boolean shortLegend;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    public PedometerDayFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodProvider, boolean z, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> combinedDayPeriodDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriodProvider, "walkingDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodProvider, "restingDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodProvider, "sleepDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedDayPeriodDataProvider, "combinedDayPeriodDataProvider");
        this.shortLegend = z;
        this.userPrefsUtils = userPrefsUtils;
        this.combinedDayPeriodDataProvider = combinedDayPeriodDataProvider;
    }

    public /* synthetic */ PedometerDayFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, boolean z, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl combinedDayPeriodDataProviderImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider, z, userPrefsUtils, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider) : combinedDayPeriodDataProviderImpl);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> getPeriodConfig(java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return this.combinedDayPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayHoursOffsetFromToday(date), 0L, 0, 12, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.-$$Lambda$PedometerDayFormatterViewModel$Fz7ioUsqD6NNo8HH7Tfj_dVUDQQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDayFormatterViewModel.m1729getPeriodConfig$lambda9(this.f$0, context, (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.-$$Lambda$PedometerDayFormatterViewModel$aWPKXhGhAyPFkbhwhNdXAwWYgOI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDayFormatterViewModel.m1728getPeriodConfig$lambda10(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:70:0x0280  */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-9, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1729getPeriodConfig$lambda9(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDayFormatterViewModel this$0, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer dataPeriods) {
        float f;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPeriods, "dataPeriods");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDays = dataPeriods.getWalkingDays();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> restingDays = dataPeriods.getRestingDays();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> sleepDays = dataPeriods.getSleepDays();
        if (walkingDays.isEmpty() && restingDays.isEmpty() && sleepDays.isEmpty()) {
            return this$0.defaultDayConfig(context);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) walkingDays);
        if (walkingDayPeriod == null) {
            walkingDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod(0L, 0L, 0, 0, null, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0d, 0, 0L, 0, 0.0f, 0.0f, 0.0f, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriodFillWithEmptyHours = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours(walkingDayPeriod);
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) restingDays);
        if (restingDayPeriod == null) {
            restingDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 4194303, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriodFillWithEmptyHours = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours(restingDayPeriod);
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) sleepDays);
        if (sleepDayPeriod == null) {
            sleepDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, null);
        }
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.fillWithEmptyHours(sleepDayPeriod).getSleepHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDayFormatterViewModel$getPeriodConfig$lambda-9$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        java.util.Iterator it = listSortedWith.iterator();
        while (true) {
            f = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) it.next();
            arrayList.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer(0, sleepHourPeriod.getStartTime() == 0, !(sleepHourPeriod.getHeartRate() == 0.0f), false, 8, null));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(walkingDayPeriodFillWithEmptyHours.getWalkingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDayFormatterViewModel$getPeriodConfig$lambda-9$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith2, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod : listSortedWith2) {
            arrayList3.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer(walkingHourPeriod.getSteps(), walkingHourPeriod.getStartTime() == 0, !(walkingHourPeriod.getHeartRate() == 0.0f), false, 8, null));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(restingDayPeriodFillWithEmptyHours.getRestingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDayFormatterViewModel$getPeriodConfig$lambda-9$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith3, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod : listSortedWith3) {
            arrayList5.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer(0, restingHourPeriod.getStartTime() == 0, !(restingHourPeriod.getHeartRate() == f), false, 8, null));
            f = 0.0f;
        }
        java.util.ArrayList arrayList6 = arrayList5;
        kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, walkingDayPeriodFillWithEmptyHours.getWalkingHours().size());
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        java.util.Iterator<java.lang.Integer> it2 = intRangeUntil.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it2).nextInt();
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer pedometerDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer) arrayList4.get(iNextInt);
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer pedometerDataContainer2 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList6, iNextInt);
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer pedometerDataContainer3 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList2, iNextInt);
            int steps = pedometerDataContainer.getSteps();
            if (pedometerDataContainer.getMalformed()) {
                z = true;
            } else if (pedometerDataContainer2 == null ? false : pedometerDataContainer2.getMalformed()) {
                z = true;
            } else if (pedometerDataContainer3 == null ? false : pedometerDataContainer3.getMalformed()) {
                z = true;
            } else {
                z = false;
            }
            arrayList7.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer(steps, false, false, z, 6, null));
        }
        java.util.ArrayList arrayList8 = arrayList7;
        java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
        int i = 0;
        for (java.lang.Object obj : arrayList8) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer pedometerDataContainer4 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer) obj;
            arrayList9.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData(i, pedometerDataContainer4.getSteps(), pedometerDataContainer4.getMalformed()));
            i = i2;
        }
        java.util.ArrayList arrayList10 = arrayList9;
        kotlin.Pair<java.lang.Float, java.lang.String> value = this$0.userPrefsUtils.getValue(java.lang.Float.valueOf((float) powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divide((java.lang.Number) java.lang.Double.valueOf(walkingDayPeriodFillWithEmptyHours.getDistance()), 1000)), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
        java.lang.String string = context.getString(powerwatch.matrix.com.pwgen2android.R.string.steps);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.steps)");
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        java.lang.String upperCase = string.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        java.lang.String string2 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.distance);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.distance)");
        java.util.Locale locale2 = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
        java.lang.String upperCase2 = string2.toUpperCase(locale2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{new kotlin.Pair(upperCase, powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.formatByLocale(java.lang.Integer.valueOf(walkingDayPeriodFillWithEmptyHours.getSteps()))), new kotlin.Pair(upperCase2, powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.twoDecimalsFormat(value.getFirst().floatValue()) + ' ' + value.getSecond())});
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> walkingHours = walkingDayPeriodFillWithEmptyHours.getWalkingHours();
        java.util.ArrayList arrayList11 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(walkingHours, 10));
        java.util.Iterator<T> it3 = walkingHours.iterator();
        while (it3.hasNext()) {
            arrayList11.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) it3.next()).getSteps()));
        }
        java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) kotlin.collections.CollectionsKt.toList(arrayList11));
        float fIntValue = (num == null ? 0 : num.intValue()) * 1.2f;
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY, kotlin.collections.CollectionsKt.listOf(arrayList10), kotlin.collections.CollectionsKt.emptyList(), 0.0f, fIntValue, true, false, listListOf, null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.green_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.red_chart)}), !this$0.shortLegend, null, 2304, null), null, false, fIntValue, 25, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-10, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1728getPeriodConfig$lambda10(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDayFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.defaultDayConfig(context);
    }

    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig defaultDayConfig(android.content.Context context) {
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY, kotlin.collections.CollectionsKt.emptyList(), null, 0.0f, 0.0f, false, false, defaultHeaderDayValues(context), null, null, false, null, 3964, null), null, false, 0.0f, 59, null);
    }

    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> defaultHeaderDayValues(android.content.Context context) {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_steps_title), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText), new kotlin.Pair(context.getString(powerwatch.matrix.com.pwgen2android.R.string.total_distance_title), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText)});
    }
}
