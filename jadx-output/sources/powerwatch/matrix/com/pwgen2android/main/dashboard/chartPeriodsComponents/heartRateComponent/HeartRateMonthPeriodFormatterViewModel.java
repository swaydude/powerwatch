package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent;

/* JADX INFO: compiled from: HeartRatePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateMonthPeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;", "walkingMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;", "restingMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;", "sleepMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;", "combinedMonthPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;", "defaultHeartRateConfigProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/DefaultHeartRateConfigProvider;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HeartRateMonthPeriodFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer> combinedMonthPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.DefaultHeartRateConfigProvider defaultHeartRateConfigProvider;

    public HeartRateMonthPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider walkingMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer> combinedMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.DefaultHeartRateConfigProvider defaultHeartRateConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthPeriodProvider, "walkingMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriodProvider, "restingMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriodProvider, "sleepMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedMonthPeriodDataProvider, "combinedMonthPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultHeartRateConfigProvider, "defaultHeartRateConfigProvider");
        this.combinedMonthPeriodDataProvider = combinedMonthPeriodDataProvider;
        this.defaultHeartRateConfigProvider = defaultHeartRateConfigProvider;
    }

    public /* synthetic */ HeartRateMonthPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider walkingMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl combinedMonthPeriodDataProviderImpl, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.DefaultHeartRateConfigProvider defaultHeartRateConfigProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingMonthPeriodDataProvider, restingMonthPeriodDataProvider, sleepMonthPeriodDataProvider, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl(walkingMonthPeriodDataProvider, restingMonthPeriodDataProvider, sleepMonthPeriodDataProvider) : combinedMonthPeriodDataProviderImpl, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.DefaultHeartRateConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH, false) : defaultHeartRateConfigProvider);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> getPeriodConfig(java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> observableOnErrorReturn = this.combinedMonthPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.numOfDaysInMonth(date) * 24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthHoursOffsetFromToday(date), 0L, 0, 12, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.-$$Lambda$HeartRateMonthPeriodFormatterViewModel$lR9FY9L6FbKIragTPL3Uw_aOQ3c
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateMonthPeriodFormatterViewModel.m1716getPeriodConfig$lambda15(this.f$0, context, (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.-$$Lambda$HeartRateMonthPeriodFormatterViewModel$9eDicmpL1Sv_OPNIkiQIagNxxgo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateMonthPeriodFormatterViewModel.m1717getPeriodConfig$lambda16(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(observableOnErrorReturn);
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-15, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig m1716getPeriodConfig$lambda15(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateMonthPeriodFormatterViewModel this$0, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer periods) {
        java.lang.Object next;
        int iIntValue;
        int i;
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer heartRateDataContainer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        if (periods.getWalkingMonths().isEmpty() && periods.getRestingMonths().isEmpty() && periods.getSleepMonths().isEmpty()) {
            return this$0.defaultHeartRateConfigProvider.getDefaultConfig(context);
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
        char c = 0;
        java.util.List filledDays$default = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.getFilledDays$default(sleepMonthPeriod, 0, 1, null);
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(filledDays, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateMonthPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(filledDays2, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateMonthPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(filledDays$default, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateMonthPeriodFormatterViewModel$getPeriodConfig$lambda-15$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = listSortedWith;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            java.lang.Object next2 = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) next2;
            powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) listSortedWith2.get(i2);
            powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) listSortedWith3.get(i2);
            int minsInPeriod = (walkingDayPeriod.getHeartRate() > 0.0f ? walkingDayPeriod.getMinsInPeriod() : 0) + (restingDayPeriod.getHeartRate() > 0.0f ? restingDayPeriod.getMinsInPeriod() : 0) + (sleepDayPeriod.getHeartRate() > 0.0f ? sleepDayPeriod.getMinsInPeriod() : 0);
            java.lang.Integer[] numArr = new java.lang.Integer[3];
            numArr[c] = java.lang.Integer.valueOf(walkingDayPeriod.getMinHeartRate());
            numArr[1] = java.lang.Integer.valueOf(restingDayPeriod.getMinHeartRate());
            numArr[2] = java.lang.Integer.valueOf(sleepDayPeriod.getMinHeartRate());
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it2 = it;
            int i4 = 0;
            for (int i5 = 3; i4 < i5; i5 = 3) {
                java.lang.Integer num = numArr[i4];
                if (num.intValue() > 0) {
                    arrayList3.add(num);
                }
                i4++;
            }
            java.lang.Integer num2 = (java.lang.Integer) kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable) arrayList3);
            if (num2 == null) {
                i = 3;
                iIntValue = 0;
            } else {
                iIntValue = num2.intValue();
                i = 3;
            }
            java.lang.Integer[] numArr2 = new java.lang.Integer[i];
            numArr2[0] = java.lang.Integer.valueOf(walkingDayPeriod.getMaxHeartRate());
            numArr2[1] = java.lang.Integer.valueOf(restingDayPeriod.getMaxHeartRate());
            numArr2[2] = java.lang.Integer.valueOf(sleepDayPeriod.getMaxHeartRate());
            java.lang.Integer num3 = (java.lang.Integer) kotlin.collections.ArraysKt.maxOrNull(numArr2);
            int iIntValue2 = num3 == null ? 0 : num3.intValue();
            boolean zProcessWeekPeriod = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodFormatterViewModelsKt.processWeekPeriod(walkingDayPeriod, restingDayPeriod, sleepDayPeriod);
            boolean zProcessForArtificial = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRatePeriodFormatterViewModelsKt.processForArtificial(walkingDayPeriod, restingDayPeriod, sleepDayPeriod);
            java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog[]{walkingDayPeriod, restingDayPeriod, sleepDayPeriod});
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            java.util.Iterator it3 = listListOf.iterator();
            while (it3.hasNext()) {
                arrayList4.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod) ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog) it3.next())).getHrv()));
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList4) {
                if (((java.lang.Number) obj).floatValue() > 0.0f) {
                    arrayList5.add(obj);
                }
            }
            java.util.ArrayList arrayList6 = arrayList5;
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LineChartEntryData(i2, arrayList6.isEmpty() ? 0.0f : (float) kotlin.collections.CollectionsKt.averageOfFloat(arrayList6)));
            if (minsInPeriod == 0) {
                heartRateDataContainer = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer(iIntValue, 0, iIntValue2, zProcessForArtificial, false, zProcessWeekPeriod, 0, 64, null);
            } else {
                double d = minsInPeriod;
                heartRateDataContainer = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer(iIntValue, kotlin.math.MathKt.roundToInt((((double) walkingDayPeriod.getHeartRate()) * (((double) walkingDayPeriod.getMinsInPeriod()) / d)) + (((double) restingDayPeriod.getHeartRate()) * (((double) restingDayPeriod.getMinsInPeriod()) / d)) + (((double) sleepDayPeriod.getHeartRate()) * (((double) sleepDayPeriod.getMinsInPeriod()) / d))), iIntValue2, zProcessForArtificial, true, zProcessWeekPeriod, 0, 64, null);
            }
            arrayList2.add(heartRateDataContainer);
            i2 = i3;
            listSortedWith3 = listSortedWith3;
            it = it2;
            c = 0;
        }
        java.util.ArrayList arrayList7 = arrayList2;
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
        int i6 = 0;
        for (java.lang.Object obj2 : arrayList7) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer heartRateDataContainer2 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) obj2;
            arrayList8.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData(i6, heartRateDataContainer2.getMax(), heartRateDataContainer2.getMin(), heartRateDataContainer2.getMax(), heartRateDataContainer2.getMin(), heartRateDataContainer2.getMalformed()));
            i6 = i7;
        }
        java.util.ArrayList arrayList9 = arrayList8;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList7) {
            if (((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) obj3).getAvg() > 0) {
                arrayList10.add(obj3);
            }
        }
        java.util.ArrayList arrayList11 = arrayList10;
        java.util.ArrayList arrayList12 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList11, 10));
        java.util.Iterator it4 = arrayList11.iterator();
        while (it4.hasNext()) {
            arrayList12.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) it4.next()).getAvg()));
        }
        double dAverageOfInt = kotlin.collections.CollectionsKt.averageOfInt(arrayList12);
        java.lang.String strValueOf = java.lang.Double.isNaN(dAverageOfInt) ? "0" : java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(dAverageOfInt));
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        for (java.lang.Object obj4 : arrayList7) {
            if (((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) obj4).getMin() > 0) {
                arrayList13.add(obj4);
            }
        }
        java.util.ArrayList arrayList14 = arrayList13;
        java.util.ArrayList arrayList15 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList14, 10));
        java.util.Iterator it5 = arrayList14.iterator();
        while (it5.hasNext()) {
            arrayList15.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) it5.next()).getMin()));
        }
        java.lang.Integer num4 = (java.lang.Integer) kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable) arrayList15);
        int iIntValue3 = num4 == null ? 0 : num4.intValue();
        java.util.ArrayList arrayList16 = new java.util.ArrayList();
        for (java.lang.Object obj5 : arrayList7) {
            if (((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) obj5).getMax() > 0) {
                arrayList16.add(obj5);
            }
        }
        java.util.ArrayList arrayList17 = arrayList16;
        java.util.ArrayList arrayList18 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList17, 10));
        java.util.Iterator it6 = arrayList17.iterator();
        while (it6.hasNext()) {
            arrayList18.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) it6.next()).getMax()));
        }
        java.lang.Integer num5 = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) arrayList18);
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig candleChartConfig = new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH, arrayList9, null, 0.0f, 0.0f, false, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.DefaultHeartRateConfigProvider.getHeaders$default(this$0.defaultHeartRateConfigProvider, context, new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues(strValueOf, iIntValue3 + " - " + (num5 == null ? 0 : num5.intValue()), null, 4, null), false, 4, null), null, 0, 0, null, false, 4028, null);
        java.util.Iterator it7 = arrayList7.iterator();
        if (it7.hasNext()) {
            next = it7.next();
            if (it7.hasNext()) {
                int max = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) next).getMax();
                do {
                    java.lang.Object next3 = it7.next();
                    int max2 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) next3).getMax();
                    if (max < max2) {
                        next = next3;
                        max = max2;
                    }
                } while (it7.hasNext());
            }
        } else {
            next = null;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer heartRateDataContainer3 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) next;
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig(null, 0.0f, candleChartConfig, null, null, null, null, false, this$0.defaultHeartRateConfigProvider.getLegendValues(context), arrayList, null, (heartRateDataContainer3 == null ? 0 : heartRateDataContainer3.getMax()) * 1.2f, !arrayList.isEmpty(), 1273, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-16, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig m1717getPeriodConfig$lambda16(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateMonthPeriodFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.defaultHeartRateConfigProvider.getDefaultConfig(context);
    }
}
