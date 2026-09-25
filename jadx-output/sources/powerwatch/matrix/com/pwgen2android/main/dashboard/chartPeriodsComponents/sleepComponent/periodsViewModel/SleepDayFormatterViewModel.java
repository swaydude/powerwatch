package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel;

/* JADX INFO: compiled from: SleepPeriodsFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ&\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00020\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/PeriodFormatterViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;", "sleepDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "shortLegend", "", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "sleepTimeCloudStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;", "defaultConfigProvider", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;", "sleepLogsAdjustment", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;ZLpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/DefaultConfigProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepLogsAdjustment;)V", "getPeriodConfig", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "date", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepDayFormatterViewModel implements powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig> {
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider defaultConfigProvider;
    private final boolean shortLegend;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage sleepTimeCloudStorage;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    public SleepDayFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, boolean z, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage sleepTimeCloudStorage, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider defaultConfigProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodDataProvider, "sleepDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepTimeCloudStorage, "sleepTimeCloudStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultConfigProvider, "defaultConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogsAdjustment, "sleepLogsAdjustment");
        this.sleepDayPeriodDataProvider = sleepDayPeriodDataProvider;
        this.shortLegend = z;
        this.userPrefsUtils = userPrefsUtils;
        this.sleepTimeCloudStorage = sleepTimeCloudStorage;
        this.defaultConfigProvider = defaultConfigProvider;
        this.sleepLogsAdjustment = sleepLogsAdjustment;
    }

    public /* synthetic */ SleepDayFormatterViewModel(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, boolean z, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage sleepTimeCloudStorage, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider defaultConfigProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment sleepLogsAdjustment, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sleepDayPeriodDataProvider, (i & 2) != 0 ? false : z, userPrefsUtils, sleepTimeCloudStorage, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.DefaultConfigProvider(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY) : defaultConfigProvider, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepLogsAdjustment() : sleepLogsAdjustment);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.PeriodFormatterViewModel
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig> getPeriodConfig(java.util.Calendar date, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig> observableOnErrorReturn = this.sleepDayPeriodDataProvider.loadData(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(24, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dayHoursOffsetFromToday(date), 0L, this.sleepTimeCloudStorage.getSleepTime(), 4, null)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepDayFormatterViewModel$BiGJaFnYJ_cHc8lpYDKwFamj4uY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepDayFormatterViewModel.m1755getPeriodConfig$lambda1(this.f$0, context, (java.util.List) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepDayFormatterViewModel$Z38LmWIA7XPL6iduQeKhb3_AdKw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepDayFormatterViewModel.m1757getPeriodConfig$lambda2(this.f$0, context, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(observableOnErrorReturn);
        return observableOnErrorReturn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1755getPeriodConfig$lambda1(final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepDayFormatterViewModel this$0, final android.content.Context context, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.isEmpty()) {
            return io.reactivex.Observable.just(this$0.defaultConfigProvider.getDefaultConfig(context, this$0.shortLegend));
        }
        final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.last(it);
        return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepPeriodsFormatterViewModelsKt.splitSleepDayToSleepSessions(sleepDayPeriod, this$0.sleepLogsAdjustment, this$0.sleepTimeCloudStorage.getSleepTime()).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.-$$Lambda$SleepDayFormatterViewModel$KUPgCkBOiOWKS71TEutduBvaK9I
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepDayFormatterViewModel.m1756getPeriodConfig$lambda1$lambda0(context, this$0, sleepDayPeriod, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-1$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig m1756getPeriodConfig$lambda1$lambda0(android.content.Context context, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepDayFormatterViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDay, java.util.List sleepSessions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDay, "$sleepDay");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepSessions, "sleepSessions");
        java.lang.String string = context.getString(powerwatch.matrix.com.pwgen2android.R.string.awake_state);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.awake_state)");
        java.lang.String string2 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.restless);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.restless)");
        java.lang.String lowerCase = string2.toLowerCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        java.lang.String string3 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.sleep_title)");
        java.lang.String string4 = context.getString(powerwatch.matrix.com.pwgen2android.R.string.deep_sleep_state);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.string.deep_sleep_state)");
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData[]{new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData(150.0f, string), new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData(100.0f, kotlin.text.StringsKt.capitalize(lowerCase)), new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData(50.0f, string3), new powerwatch.matrix.com.pwgen2android.shared.ui.charts.LimitLineData(0.0f, string4)});
        boolean zIsTwelveHourFormatUsed = this$0.userPrefsUtils.isTwelveHourFormatUsed();
        java.lang.String strHoursMinutesTimeFormat = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hoursMinutesTimeFormat(sleepDay.getStartTime(), zIsTwelveHourFormatUsed);
        java.lang.String strHoursMinutesTimeFormat2 = powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hoursMinutesTimeFormat(sleepDay.getEndTime(), zIsTwelveHourFormatUsed);
        java.util.List listListOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{strHoursMinutesTimeFormat, strHoursMinutesTimeFormat2});
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode chartPeriodMode = powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY;
        int sleepTime = this$0.sleepTimeCloudStorage.getSleepTime();
        return new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig(chartPeriodMode, listListOf, 410.0f, this$0.defaultConfigProvider.getHeaders(context, new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepHeaderValues(strHoursMinutesTimeFormat, null, strHoursMinutesTimeFormat2, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minutesToHoursAndMinutesFormat$default(sleepDay.getMinsInPeriod(), false, 1, null), sleepDay.getRestlessMinutes() + powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricsMetersUnit, null, 34, null), this$0.shortLegend), kotlin.collections.CollectionsKt.listOf(sleepSessions), null, listListOf2, null, !this$0.shortLegend, strHoursMinutesTimeFormat + " - " + strHoursMinutesTimeFormat2, sleepTime, 160, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getPeriodConfig$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig m1757getPeriodConfig$lambda2(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepDayFormatterViewModel this$0, android.content.Context context, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.defaultConfigProvider.getDefaultConfig(context, this$0.shortLegend);
    }
}
