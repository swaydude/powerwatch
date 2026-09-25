package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent;

/* JADX INFO: compiled from: PowerPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ&\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00020\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayPeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "walkingDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;", "restingDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;", "sleepDayPeriodProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "combinedDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedDayPeriodDataContainer;", "defaultPowerConfigProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/DefaultPowerConfigProvider;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PowerDayPeriodFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig>, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> combinedDayPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider defaultPowerConfigProvider;

    public PowerDayPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedPeriodDataProvider<powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer> combinedDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider defaultPowerConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriodProvider, "walkingDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodProvider, "restingDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodProvider, "sleepDayPeriodProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedDayPeriodDataProvider, "combinedDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultPowerConfigProvider, "defaultPowerConfigProvider");
        this.combinedDayPeriodDataProvider = combinedDayPeriodDataProvider;
        this.defaultPowerConfigProvider = defaultPowerConfigProvider;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public /* synthetic */ PowerDayPeriodFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl combinedDayPeriodDataProviderImpl, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider defaultPowerConfigProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataProviderImpl(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider) : combinedDayPeriodDataProviderImpl, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY) : defaultPowerConfigProvider);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> getPeriodConfig(java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> observableOnErrorReturn = this.combinedDayPeriodDataProvider.loadCombinedPeriodData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayHoursOffsetFromToday(date), 0L, 0, 12, null)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.-$$Lambda$PowerDayPeriodFormatterViewModel$pnjMqYnhAi7akaDQwlZOCOr1jJ0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayPeriodFormatterViewModel.m1738getPeriodConfig$lambda12(this.f$0, context, (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.-$$Lambda$PowerDayPeriodFormatterViewModel$cRDG03WI4V73cDg-Gf7kx946NRk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayPeriodFormatterViewModel.m1739getPeriodConfig$lambda13(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(observableOnErrorReturn);
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:109:0x0345  */
    /* JADX WARN: Code duplicated, block: B:81:0x02bf  */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-12, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1738getPeriodConfig$lambda12(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayPeriodFormatterViewModel this$0, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedDayPeriodDataContainer dayPeriods) {
        long j;
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayPeriods, "dayPeriods");
        if (dayPeriods.getWalkingDays().isEmpty() && dayPeriods.getRestingDays().isEmpty() && dayPeriods.getSleepDays().isEmpty()) {
            return this$0.defaultPowerConfigProvider.getDefaultDayConfig(context);
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
        java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(walkingDayPeriodFillWithEmptyHours.getWalkingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        java.util.Iterator it = listSortedWith.iterator();
        while (true) {
            j = 0;
            if (!it.hasNext()) {
                break;
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod) it.next();
            arrayList.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer(walkingHourPeriod.getSolarPower(), walkingHourPeriod.getBodyPower(), walkingHourPeriod.getStartTime() == 0, !(walkingHourPeriod.getHeartRate() == 0.0f), false, 16, null));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> listSortedWith2 = kotlin.collections.CollectionsKt.sortedWith(restingDayPeriodFillWithEmptyHours.getRestingHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith2, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod : listSortedWith2) {
            arrayList3.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer(restingHourPeriod.getSolarPower(), restingHourPeriod.getBodyPower(), restingHourPeriod.getStartTime() == 0, !(restingHourPeriod.getHeartRate() == 0.0f), false, 16, null));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> listSortedWith3 = kotlin.collections.CollectionsKt.sortedWith(sleepDayPeriodFillWithEmptyHours.getSleepHours(), new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayPeriodFormatterViewModel$getPeriodConfig$lambda-12$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t).getHourInDay()), java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod) t2).getHourInDay()));
            }
        });
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSortedWith3, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod : listSortedWith3) {
            arrayList5.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer(sleepHourPeriod.getSolarPower(), sleepHourPeriod.getBodyPower(), sleepHourPeriod.getStartTime() == j, !(sleepHourPeriod.getHeartRate() == 0.0f), false, 16, null));
            j = 0;
        }
        java.util.ArrayList arrayList6 = arrayList5;
        java.util.ArrayList arrayList7 = arrayList2;
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
        int i = 0;
        for (java.lang.Object obj : arrayList7) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) obj;
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer2 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList4, i);
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer3 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList6, i);
            float bodyPower = powerDataContainer.getBodyPower();
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer4 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList4, i);
            float bodyPower2 = powerDataContainer4 == null ? 0.0f : powerDataContainer4.getBodyPower();
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer5 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList6, i);
            float bodyPower3 = ((bodyPower + bodyPower2) + (powerDataContainer5 == null ? 0.0f : powerDataContainer5.getBodyPower())) / 60.0f;
            if (powerDataContainer.getMalformed()) {
                z2 = true;
            } else if (powerDataContainer2 == null ? false : powerDataContainer2.getMalformed()) {
                z2 = true;
            } else if (powerDataContainer3 == null ? false : powerDataContainer3.getMalformed()) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList8.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer(0.0f, bodyPower3, false, false, z2, 12, null));
            i = i2;
        }
        java.util.ArrayList arrayList9 = arrayList8;
        java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
        int i3 = 0;
        for (java.lang.Object obj2 : arrayList7) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer6 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) obj2;
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer7 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList4, i3);
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer8 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList6, i3);
            float solarPower = powerDataContainer6.getSolarPower();
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer9 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList4, i3);
            float solarPower2 = powerDataContainer9 == null ? 0.0f : powerDataContainer9.getSolarPower();
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer10 = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) kotlin.collections.CollectionsKt.getOrNull(arrayList6, i3);
            float solarPower3 = ((solarPower + solarPower2) + (powerDataContainer10 == null ? 0.0f : powerDataContainer10.getSolarPower())) / 60.0f;
            if (powerDataContainer6.getMalformed()) {
                z = true;
            } else if (powerDataContainer7 == null ? false : powerDataContainer7.getMalformed()) {
                z = true;
            } else if (powerDataContainer8 == null ? false : powerDataContainer8.getMalformed()) {
                z = true;
            } else {
                z = false;
            }
            arrayList10.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer(solarPower3, 0.0f, false, false, z, 12, null));
            i3 = i4;
        }
        java.util.ArrayList arrayList11 = arrayList9;
        java.util.ArrayList arrayList12 = arrayList10;
        java.util.List<kotlin.Pair> listZip = kotlin.collections.CollectionsKt.zip(arrayList11, arrayList12);
        java.util.ArrayList arrayList13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (kotlin.Pair pair : listZip) {
            arrayList13.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getFirst()).getBodyPower() + ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair.getSecond()).getSolarPower()));
        }
        java.lang.Float fMaxOrNull = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList13);
        float fFloatValue = fMaxOrNull != null ? fMaxOrNull.floatValue() : 0.0f;
        java.util.ArrayList arrayList14 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip, 10));
        int i5 = 0;
        for (java.lang.Object obj3 : listZip) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.Pair pair2 = (kotlin.Pair) obj3;
            arrayList14.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartEntryData(i5, new float[]{((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair2.getFirst()).getBodyPower(), ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair2.getSecond()).getSolarPower()}, ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair2.getFirst()).getMalformed() || ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) pair2.getSecond()).getMalformed()));
            i5 = i6;
        }
        java.util.ArrayList arrayList15 = arrayList14;
        java.util.Iterator it2 = arrayList11.iterator();
        double bodyPower4 = 0.0d;
        while (it2.hasNext()) {
            bodyPower4 += (double) ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) it2.next()).getBodyPower();
        }
        java.util.Iterator it3 = arrayList12.iterator();
        double solarPower4 = 0.0d;
        while (it3.hasNext()) {
            solarPower4 += (double) ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) it3.next()).getSolarPower();
        }
        float f = fFloatValue * 1.2f;
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig("", 0.0f, new powerwatch.matrix.com.pwgen2android.shared.ui.charts.BarChartConfig(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY, kotlin.collections.CollectionsKt.listOf(arrayList15), null, 0.0f, f, true, false, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.DefaultPowerConfigProvider.getHeaders$default(this$0.defaultPowerConfigProvider, context, new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerHeaderValues(null, null, kotlin.math.MathKt.roundToInt(bodyPower4) + powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit, kotlin.math.MathKt.roundToInt(solarPower4) + powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit, 3, null), false, 4, null), null, null, false, java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(bodyPower4 + solarPower4)), 1868, null), null, false, f, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-13, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig m1739getPeriodConfig$lambda13(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayPeriodFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.defaultPowerConfigProvider.getDefaultDayConfig(context);
    }
}
