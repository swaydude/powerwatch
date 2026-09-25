package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel;

/* JADX INFO: compiled from: SleepPeriodsFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepMonthFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;", "sleepMonthPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;", "sleepLogsAdjustment", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;", "sleepTimeCloudStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;", "defaultConfigProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/month/SleepMonthPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepMonthFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider defaultConfigProvider;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage sleepTimeCloudStorage;

    public SleepMonthFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage sleepTimeCloudStorage, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider defaultConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriodDataProvider, "sleepMonthPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogsAdjustment, "sleepLogsAdjustment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepTimeCloudStorage, "sleepTimeCloudStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultConfigProvider, "defaultConfigProvider");
        this.sleepMonthPeriodDataProvider = sleepMonthPeriodDataProvider;
        this.sleepLogsAdjustment = sleepLogsAdjustment;
        this.sleepTimeCloudStorage = sleepTimeCloudStorage;
        this.defaultConfigProvider = defaultConfigProvider;
    }

    public /* synthetic */ SleepMonthFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.month.SleepMonthPeriodDataProvider sleepMonthPeriodDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage sleepTimeCloudStorage, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider defaultConfigProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sleepMonthPeriodDataProvider, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment() : sleepLogsAdjustment, sleepTimeCloudStorage, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH) : defaultConfigProvider);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig> getPeriodConfig(java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig> observableOnErrorReturn = this.sleepMonthPeriodDataProvider.loadData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.numOfDaysInMonth(date) * 24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.monthHoursOffsetFromToday(date), 0L, this.sleepTimeCloudStorage.getSleepTime(), 4, null)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepMonthFormatterViewModel$0fGn2GQaaPE4h8fec2JnnUZGUfc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepMonthFormatterViewModel.m1758getPeriodConfig$lambda10(this.f$0, context, (java.util.List) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepMonthFormatterViewModel$KFm74fNKSV7AUmLU0Ad85Jd6fHM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepMonthFormatterViewModel.m1760getPeriodConfig$lambda11(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "sleepMonthPeriodDataProvider\n                    .loadData(Page(date.numOfDaysInMonth() * DAY_HOURS_PAGE_LIMIT, date.monthHoursOffsetFromToday(), correctedOffset = sleepTimeCloudStorage.getSleepTime()))\n                    .flatMap { sleepMonths ->\n                        if (sleepMonths.isEmpty()) {\n                            return@flatMap Observable.just(defaultConfigProvider.getDefaultConfig(context))\n                        }\n\n                        val sleepMonth = sleepMonths.last()\n                        val days = sleepMonth.sleepWeeks.flatMap { it.sleepDays }.sortedBy { it.startTime }\n\n                        return@flatMap splitSleepDaysToSleepSessions(days.reversed(), sleepLogsAdjustment, sleepTimeCloudStorage.getSleepTime())\n                                .map { dayEntries ->\n\n                                    val avgDuration =\n                                            days\n                                                    .filter { it.minsInPeriod > 0 }\n                                                    .map {\n                                                        it.minsInPeriod\n                                                    }\n                                                    .average()\n                                                    .roundToInt()\n                                                    .minutesToHoursAndMinutesFormat()\n\n                                    val avgRestless = days\n                                            .filter { it.minsInPeriod > 0 }\n                                            .map {\n                                                it.restlessMinutes\n                                            }\n                                            .average().toFloat()\n\n\n                                    val yLabels = DateFormatSymbols().weekDaysByLocale().zip(days)\n                                            .map {\n                                                it.first.plus(\"\\n${it.second.dayInMonth}\")\n                                            }.reversed()\n\n                                    CubicLineChartConfig(\n                                            mode = ChartPeriodMode.MONTH,\n                                            maxValue = dayEntries.size * 260f,\n                                            hourOffset = sleepTimeCloudStorage.getSleepTime(),\n                                            limitLines = listOf(),\n                                            yAxisLabels = yLabels,\n                                            headerValues = defaultConfigProvider.getHeaders(context, SleepHeaderValues(avgDuration = avgDuration,\n                                                    avgRestless = avgRestless.twoDecimalsFormat().plus(\" m\"))),\n                                            dataSetsLabels = dayEntries.map { it.first },\n                                            entries = dayEntries.map { it.second })\n\n                                }\n\n                    }\n                    .onErrorReturn { defaultConfigProvider.getDefaultConfig(context) }");
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-10, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1758getPeriodConfig$lambda10(final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepMonthFormatterViewModel this$0, final android.content.Context context, java.util.List sleepMonths) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonths, "sleepMonths");
        if (sleepMonths.isEmpty()) {
            return io.reactivex.Observable.just(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider.getDefaultConfig$default(this$0.defaultConfigProvider, context, false, 2, null));
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> sleepWeeks = ((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod) kotlin.collections.CollectionsKt.last(sleepMonths)).getSleepWeeks();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = sleepWeeks.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod) it.next()).getSleepDays());
        }
        final java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator<T>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepMonthFormatterViewModel$getPeriodConfig$lambda-10$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t).getStartTime()), java.lang.Long.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) t2).getStartTime()));
            }
        });
        return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt.splitSleepDaysToSleepSessions(kotlin.collections.CollectionsKt.reversed(listSortedWith), this$0.sleepLogsAdjustment, this$0.sleepTimeCloudStorage.getSleepTime()).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepMonthFormatterViewModel$hzysPMxT4xwThtmDuv4xEKkm4gI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepMonthFormatterViewModel.m1759getPeriodConfig$lambda10$lambda9(listSortedWith, this$0, context, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-10$lambda-9, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig m1759getPeriodConfig$lambda10$lambda9(java.util.List days, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepMonthFormatterViewModel this$0, android.content.Context context, java.util.List dayEntries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(days, "$days");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayEntries, "dayEntries");
        java.util.List list = days;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) next).getMinsInPeriod() > 0) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) it2.next()).getMinsInPeriod()));
        }
        java.lang.String strMinutesToHoursAndMinutesFormat$default = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minutesToHoursAndMinutesFormat$default(kotlin.math.MathKt.roundToInt(kotlin.collections.CollectionsKt.averageOfInt(arrayList3)), false, 1, null);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) obj).getMinsInPeriod() > 0) {
                arrayList4.add(obj);
            }
        }
        java.util.ArrayList arrayList5 = arrayList4;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        java.util.Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) it3.next()).getRestlessMinutes()));
        }
        float fAverageOfInt = (float) kotlin.collections.CollectionsKt.averageOfInt(arrayList6);
        java.util.List<kotlin.Pair> listZip = kotlin.collections.CollectionsKt.zip(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.weekDaysByLocale$default(new java.text.DateFormatSymbols(), null, 1, null), list);
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (kotlin.Pair pair : listZip) {
            arrayList7.add(((java.lang.String) pair.getFirst()) + '\n' + ((powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) pair.getSecond()).getDayInMonth());
        }
        java.util.List listReversed = kotlin.collections.CollectionsKt.reversed(arrayList7);
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode chartPeriodMode = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH;
        float size = dayEntries.size() * 260.0f;
        int sleepTime = this$0.sleepTimeCloudStorage.getSleepTime();
        java.util.List listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        java.util.List headers$default = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider.getHeaders$default(this$0.defaultConfigProvider, context, new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues(null, strMinutesToHoursAndMinutesFormat$default, null, null, null, kotlin.jvm.internal.Intrinsics.stringPlus(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.twoDecimalsFormat(fAverageOfInt), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricsMetersUnit), 29, null), false, 4, null);
        java.util.List list2 = dayEntries;
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList8.add((java.lang.String) ((kotlin.Pair) it4.next()).getFirst());
        }
        java.util.ArrayList arrayList9 = arrayList8;
        java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            arrayList10.add((java.util.List) ((kotlin.Pair) it5.next()).getSecond());
        }
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig(chartPeriodMode, listEmptyList, size, headers$default, arrayList10, arrayList9, null, listReversed, false, null, sleepTime, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-11, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig m1760getPeriodConfig$lambda11(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepMonthFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider.getDefaultConfig$default(this$0.defaultConfigProvider, context, false, 2, null);
    }
}
