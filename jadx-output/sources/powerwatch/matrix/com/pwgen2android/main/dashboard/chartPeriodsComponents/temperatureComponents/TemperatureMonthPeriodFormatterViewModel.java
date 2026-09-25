package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents;

/* JADX INFO: compiled from: TemperaturePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J&\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00020\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureMonthPeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;", "walkingMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;", "restingMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;", "sleepMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "combinedMonthPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;", "defaultTemperatureConfigProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/DefaultTemperatureConfigProvider;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TemperatureMonthPeriodFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer> combinedMonthPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.DefaultTemperatureConfigProvider defaultTemperatureConfigProvider;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    public TemperatureMonthPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider walkingMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer> combinedMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.DefaultTemperatureConfigProvider defaultTemperatureConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthPeriodProvider, "walkingMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriodProvider, "restingMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriodProvider, "sleepMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedMonthPeriodDataProvider, "combinedMonthPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultTemperatureConfigProvider, "defaultTemperatureConfigProvider");
        this.userPrefsUtils = userPrefsUtils;
        this.combinedMonthPeriodDataProvider = combinedMonthPeriodDataProvider;
        this.defaultTemperatureConfigProvider = defaultTemperatureConfigProvider;
    }

    public /* synthetic */ TemperatureMonthPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider walkingMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl combinedMonthPeriodDataProviderImpl, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.DefaultTemperatureConfigProvider defaultTemperatureConfigProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingMonthPeriodDataProvider, restingMonthPeriodDataProvider, sleepMonthPeriodDataProvider, userPrefsUtils, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl(walkingMonthPeriodDataProvider, restingMonthPeriodDataProvider, sleepMonthPeriodDataProvider) : combinedMonthPeriodDataProviderImpl, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.DefaultTemperatureConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH) : defaultTemperatureConfigProvider);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> getPeriodConfig(java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> observableOnErrorReturn = this.combinedMonthPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.numOfDaysInMonth(date) * 24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthHoursOffsetFromToday(date), 0L, 0, 12, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.-$$Lambda$TemperatureMonthPeriodFormatterViewModel$sX5plOZHEX48z0fAMr2jcFKQZok
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureMonthPeriodFormatterViewModel.m1786getPeriodConfig$lambda15(this.f$0, context, (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.-$$Lambda$TemperatureMonthPeriodFormatterViewModel$amqWIJjk9wQo5djuApqEmb40ksM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.-$$Lambda$TemperatureMonthPeriodFormatterViewModel$ZuVfvyBffBLEf05d95zjwu-HHRc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureMonthPeriodFormatterViewModel.m1788getPeriodConfig$lambda17(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(observableOnErrorReturn);
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-15, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig m1786getPeriodConfig$lambda15(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureMonthPeriodFormatterViewModel this$0, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer periods) {
        java.lang.Object next;
        java.lang.Object next2;
        float fFloatValue;
        int i;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        if (periods.getWalkingMonths().isEmpty() && periods.getRestingMonths().isEmpty() && periods.getSleepMonths().isEmpty()) {
            return this$0.defaultTemperatureConfigProvider.getDefaultConfig(context);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod walkingMonthPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) periods.getWalkingMonths());
        if (walkingMonthPeriod == null) {
            walkingMonthPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod(0L, 0L, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0d, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 8388607, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod restingMonthPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) periods.getRestingMonths());
        if (restingMonthPeriod == null) {
            restingMonthPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 2097151, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod sleepMonthPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) periods.getSleepMonths());
        if (sleepMonthPeriod == null) {
            sleepMonthPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, 0L, 0, 0.0f, 0, 0.0f, 0.0f, null, 8388607, null);
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> filledDays = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.getFilledDays(walkingMonthPeriod);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> filledDays2 = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.getFilledDays(restingMonthPeriod);
        int i2 = 0;
        char c = 1;
        java.util.List filledDays$default = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.getFilledDays$default(sleepMonthPeriod, 0, 1, null);
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(filledDays, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureMonthPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(filledDays2, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureMonthPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(filledDays$default, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureMonthPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List list = listSortedWith;
        int i3 = 10;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i4 = 0;
        for (java.lang.Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) obj;
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith2, i4);
            if (restingDayPeriod == null) {
                restingDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 4194303, null);
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.getOrNull(listSortedWith3, i4);
            if (sleepDayPeriod == null) {
                sleepDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, null);
            }
            int minsInPeriod = (walkingDayPeriod.getStartTime() > 0 ? walkingDayPeriod.getMinsInPeriod() : 0) + (restingDayPeriod.getStartTime() > 0 ? restingDayPeriod.getMinsInPeriod() : 0) + (sleepDayPeriod.getStartTime() > 0 ? sleepDayPeriod.getMinsInPeriod() : 0);
            powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog[] baseLogArr = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog[3];
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod2 = walkingDayPeriod;
            baseLogArr[i2] = walkingDayPeriod2;
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod2 = restingDayPeriod;
            baseLogArr[c] = restingDayPeriod2;
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod2 = sleepDayPeriod;
            baseLogArr[2] = sleepDayPeriod2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i6 = 3; i2 < i6; i6 = 3) {
                powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog = baseLogArr[i2];
                if (((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) baseLog).getStartTime() > 0) {
                    arrayList2.add(baseLog);
                }
                i2++;
            }
            java.util.ArrayList arrayList3 = arrayList2;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, i3));
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it.next())).getMinSkinTemp()));
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
            baseLogArr2[0] = walkingDayPeriod2;
            baseLogArr2[1] = restingDayPeriod2;
            baseLogArr2[2] = sleepDayPeriod2;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            int i7 = 0;
            while (i7 < i) {
                powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog baseLog2 = baseLogArr2[i7];
                if (((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) baseLog2).getStartTime() > 0) {
                    arrayList5.add(baseLog2);
                }
                i7++;
                i = 3;
            }
            java.util.ArrayList arrayList6 = arrayList5;
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, i3));
            java.util.Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                arrayList7.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it2.next())).getMaxSkinTemp()));
            }
            java.lang.Float fMaxOrNull = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList7);
            float fFloatValue2 = fMaxOrNull == null ? 0.0f : fMaxOrNull.floatValue();
            boolean zProcessWeekPeriod = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodFormatterViewModelsKt.processWeekPeriod(walkingDayPeriod, restingDayPeriod, sleepDayPeriod);
            boolean zProcessForArtificial = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodFormatterViewModelsKt.processForArtificial(walkingDayPeriod, restingDayPeriod, sleepDayPeriod);
            if (minsInPeriod == 0) {
                temperatureDataContainer = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer(fFloatValue, 0.0f, fFloatValue2, zProcessForArtificial, false, zProcessWeekPeriod);
            } else {
                powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod3 = sleepDayPeriod;
                double d = minsInPeriod;
                temperatureDataContainer = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer(fFloatValue, (float) ((((double) walkingDayPeriod.getSkinTemp()) * (((double) walkingDayPeriod.getMinsInPeriod()) / d)) + (((double) restingDayPeriod.getSkinTemp()) * (((double) restingDayPeriod.getMinsInPeriod()) / d)) + (((double) sleepDayPeriod3.getSkinTemp()) * (((double) sleepDayPeriod3.getMinsInPeriod()) / d))), fFloatValue2, zProcessForArtificial, true, zProcessWeekPeriod);
            }
            arrayList.add(temperatureDataContainer);
            i4 = i5;
            i2 = 0;
            c = 1;
            i3 = 10;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> listConvertDataTemperature = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodFormatterViewModelsKt.convertDataTemperature(arrayList, this$0.userPrefsUtils);
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> list2 = listConvertDataTemperature;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            if (((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) obj2).getValid()) {
                arrayList8.add(obj2);
            }
        }
        java.util.Iterator it3 = arrayList8.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                float min = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next).getMin();
                do {
                    java.lang.Object next3 = it3.next();
                    float min2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next3).getMin();
                    if (java.lang.Float.compare(min, min2) > 0) {
                        next = next3;
                        min = min2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer2 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next;
        float min3 = temperatureDataContainer2 == null ? 0.0f : temperatureDataContainer2.getMin();
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list2) {
            if (((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) obj3).getValid()) {
                arrayList9.add(obj3);
            }
        }
        java.util.Iterator it4 = arrayList9.iterator();
        if (it4.hasNext()) {
            next2 = it4.next();
            if (it4.hasNext()) {
                float max = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next2).getMax();
                do {
                    java.lang.Object next4 = it4.next();
                    float max2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next4).getMax();
                    if (java.lang.Float.compare(max, max2) < 0) {
                        next2 = next4;
                        max = max2;
                    }
                } while (it4.hasNext());
            }
        } else {
            next2 = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer3 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) next2;
        float max3 = temperatureDataContainer3 == null ? 0.0f : temperatureDataContainer3.getMax();
        java.util.ArrayList<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> arrayList10 = new java.util.ArrayList();
        for (java.lang.Object obj4 : list2) {
            if (!((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) obj4).getValid()) {
                arrayList10.add(obj4);
            }
        }
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer4 : arrayList10) {
            temperatureDataContainer4.setMin(min3);
            temperatureDataContainer4.setAvg(min3);
            temperatureDataContainer4.setMax(min3);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> listBuildEntries = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodFormatterViewModelsKt.buildEntries(listConvertDataTemperature);
        java.lang.String str = !kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this$0.userPrefsUtils.isMetricsUsedOrNull(), (java.lang.Object) false) ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricsTemperatureUnit : powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialTemperatureUnit;
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig(str, min3, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH, listBuildEntries, null, 0.0f, 0.0f, false, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.DefaultTemperatureConfigProvider.getHeaders$default(this$0.defaultTemperatureConfigProvider, context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodFormatterViewModelsKt.buildHeaderValues(listConvertDataTemperature, str), false, 4, null), null, powerwatch.matrix.com.pwgen2android.R.color.temperature_color, powerwatch.matrix.com.pwgen2android.R.color.temperature_color, null, false, 3260, null), null, null, null, null, false, null, null, null, max3 * 1.2f, false, 6136, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-17, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig m1788getPeriodConfig$lambda17(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureMonthPeriodFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.defaultTemperatureConfigProvider.getDefaultConfig(context);
    }
}
