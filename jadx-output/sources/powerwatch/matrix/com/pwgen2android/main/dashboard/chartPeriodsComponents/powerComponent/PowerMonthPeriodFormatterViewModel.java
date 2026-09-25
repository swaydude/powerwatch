package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent;

/* JADX INFO: compiled from: PowerPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerMonthPeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "walkingMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;", "restingMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;", "sleepMonthPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;", "combinedMonthPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedMonthPeriodDataContainer;", "defaultPowerConfigProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/WalkingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/RestingMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PowerMonthPeriodFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer> combinedMonthPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider defaultPowerConfigProvider;

    public PowerMonthPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider walkingMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer> combinedMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider defaultPowerConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthPeriodProvider, "walkingMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriodProvider, "restingMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriodProvider, "sleepMonthPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedMonthPeriodDataProvider, "combinedMonthPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultPowerConfigProvider, "defaultPowerConfigProvider");
        this.combinedMonthPeriodDataProvider = combinedMonthPeriodDataProvider;
        this.defaultPowerConfigProvider = defaultPowerConfigProvider;
    }

    public /* synthetic */ PowerMonthPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.WalkingMonthPeriodDataProvider walkingMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.RestingMonthPeriodDataProvider restingMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl combinedMonthPeriodDataProviderImpl, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider defaultPowerConfigProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingMonthPeriodDataProvider, restingMonthPeriodDataProvider, sleepMonthPeriodDataProvider, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataProviderImpl(walkingMonthPeriodDataProvider, restingMonthPeriodDataProvider, sleepMonthPeriodDataProvider) : combinedMonthPeriodDataProviderImpl, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH) : defaultPowerConfigProvider);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> getPeriodConfig(java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> observableOnErrorReturn = this.combinedMonthPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.numOfDaysInMonth(date) * 24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthHoursOffsetFromToday(date), 0L, 0, 12, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.-$$Lambda$PowerMonthPeriodFormatterViewModel$QZng4iv5lHiysmQjvQkT_rBfC5E
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerMonthPeriodFormatterViewModel.m1741getPeriodConfig$lambda13(this.f$0, context, (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.-$$Lambda$PowerMonthPeriodFormatterViewModel$RcGSqE6Jftl-LyxNTub9T-wgB5E
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.-$$Lambda$PowerMonthPeriodFormatterViewModel$jSLX7mMyhWb8rvC-tPCWqkWfwYU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerMonthPeriodFormatterViewModel.m1743getPeriodConfig$lambda15(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(observableOnErrorReturn);
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:73:0x0240  */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-13, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1741getPeriodConfig$lambda13(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerMonthPeriodFormatterViewModel this$0, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedMonthPeriodDataContainer periods) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periods, "periods");
        if (periods.getWalkingMonths().isEmpty() && periods.getRestingMonths().isEmpty() && periods.getSleepMonths().isEmpty()) {
            return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.defaultPowerConfigProvider.getDefaultMonthConfig(context), null, false, 0.0f, 59, null);
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
        java.util.List filledDays$default = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.getFilledDays$default(sleepMonthPeriod, 0, 1, null);
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(filledDays, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerMonthPeriodFormatterViewModel$getPeriodConfig$lambda-13$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(filledDays2, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerMonthPeriodFormatterViewModel$getPeriodConfig$lambda-13$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) t2).getDayInMonth()));
            }
        });
        java.util.List listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(filledDays$default, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerMonthPeriodFormatterViewModel$getPeriodConfig$lambda-13$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t).getDayInMonth()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t2).getDayInMonth()));
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
        for (java.lang.Object obj2 : listZip) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.Pair pair = (kotlin.Pair) obj2;
            arrayList6.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData(i5, new float[]{((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getFirst()).getBodyPower(), ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getSecond()).getSolarPower()}, ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getFirst()).getMalformed() || ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getSecond()).getMalformed()));
            i5 = i6;
        }
        java.util.ArrayList arrayList7 = arrayList6;
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        java.util.Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList8.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) it2.next()).getSolarPower()));
        }
        java.lang.Float fMaxOrNull = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList8);
        float fFloatValue = fMaxOrNull == null ? 0.0f : fMaxOrNull.floatValue();
        java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        java.util.Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList9.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) it3.next()).getBodyPower()));
        }
        java.lang.Float fMaxOrNull2 = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList9);
        java.lang.Math.max(fFloatValue, fMaxOrNull2 == null ? 0.0f : fMaxOrNull2.floatValue());
        java.util.List<kotlin.Pair> listZip2 = kotlin.collections.CollectionsKt.zip(arrayList4, arrayList5);
        java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip2, 10));
        for (kotlin.Pair pair2 : listZip2) {
            arrayList10.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair2.getFirst()).getBodyPower() + ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair2.getSecond()).getSolarPower()));
        }
        java.lang.Float fMaxOrNull3 = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList10);
        float fFloatValue2 = fMaxOrNull3 != null ? fMaxOrNull3.floatValue() : 0.0f;
        java.util.ArrayList arrayList11 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        java.util.Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList11.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) it4.next()).getBodyPower()));
        }
        java.util.Iterator it5 = arrayList11.iterator();
        double dFloatValue = 0.0d;
        while (it5.hasNext()) {
            dFloatValue += (double) ((java.lang.Number) it5.next()).floatValue();
        }
        float f = (float) dFloatValue;
        java.util.ArrayList arrayList12 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        java.util.Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            arrayList12.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) it6.next()).getSolarPower()));
        }
        java.util.Iterator it7 = arrayList12.iterator();
        double dFloatValue2 = 0.0d;
        while (it7.hasNext()) {
            dFloatValue2 += (double) ((java.lang.Number) it7.next()).floatValue();
        }
        float f2 = (float) dFloatValue2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        float f3 = 60;
        float f4 = 30;
        sb.append(kotlin.math.MathKt.roundToInt((((walkingMonthPeriod.getBodyPower() + restingMonthPeriod.getBodyPower()) + sleepMonthPeriod.getBodyPower()) / f3) / f4));
        sb.append(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit);
        float f5 = 1.2f * fFloatValue2;
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH, kotlin.collections.CollectionsKt.listOf(arrayList7), null, 0.0f, f5, true, true, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider.getHeaders$default(this$0.defaultPowerConfigProvider, context, new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues(sb.toString(), kotlin.math.MathKt.roundToInt((((walkingMonthPeriod.getSolarPower() + restingMonthPeriod.getSolarPower()) + sleepMonthPeriod.getSolarPower()) / f3) / f4) + powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit, ((int) f) + powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit, ((int) f2) + powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit), false, 4, null), null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.dark_orange_chart), java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.color.red_chart)}), false, java.lang.String.valueOf(f + f2), 1292, null), null, false, f5, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-15, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1743getPeriodConfig$lambda15(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerMonthPeriodFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig(null, 0.0f, this$0.defaultPowerConfigProvider.getDefaultMonthConfig(context), null, false, 0.0f, 59, null);
    }
}
