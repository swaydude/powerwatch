package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents;

/* JADX INFO: compiled from: TemperatureDayViewModelDashboard.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BW\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002H\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayViewModelDashboard;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedChartConfig;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "walkingDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;", "restingDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;", "sleepDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "selectedDateProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "activityContext", "Landroid/content/Context;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "realTimeDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;", "dayFormatterViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDayPeriodFormatterViewModel;)V", "headerColor", "Landroidx/databinding/ObservableField;", "", "getHeaderColor", "()Landroidx/databinding/ObservableField;", "subtitleText", "", "goToDrillDown", "", "onConfigurationArrived", "configuration", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TemperatureDayViewModelDashboard extends powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final androidx.databinding.ObservableField<java.lang.Integer> headerColor;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider realTimeDataProvider;
    private final java.lang.String subtitleText;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    public /* synthetic */ TemperatureDayViewModelDashboard(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider realTimeDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel temperatureDayPeriodFormatterViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider, selectedDateProvider, rxBus, userPrefsUtils, context, fragmentManager, realTimeDataProvider, (i & 512) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider, userPrefsUtils, null, null, 48, null) : temperatureDayPeriodFormatterViewModel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TemperatureDayViewModelDashboard(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context activityContext, androidx.fragment.app.FragmentManager parentFragmentManager, powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider realTimeDataProvider, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayPeriodFormatterViewModel dayFormatterViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriodDataProvider, "walkingDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodDataProvider, "restingDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodDataProvider, "sleepDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDateProvider, "selectedDateProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realTimeDataProvider, "realTimeDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayFormatterViewModel, "dayFormatterViewModel");
        java.lang.String string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.temperature);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityContext.getString(R.string.temperature)");
        super(string, dayFormatterViewModel, selectedDateProvider, activityContext, parentFragmentManager, rxBus);
        this.userPrefsUtils = userPrefsUtils;
        this.realTimeDataProvider = realTimeDataProvider;
        java.lang.String string2 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.current_temp);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "activityContext.getString(R.string.current_temp)");
        this.subtitleText = string2;
        this.headerColor = new androidx.databinding.ObservableField<>(java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(activityContext, powerwatch.matrix.com.pwgen2android.R.color.temperature_color)));
        getCompositeDisposable().add(realTimeDataProvider.observeCurrentData().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.-$$Lambda$TemperatureDayViewModelDashboard$z6VWeNzNrndOk4Q1uJPVPmzp-j4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayViewModelDashboard.m1781_init_$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.-$$Lambda$TemperatureDayViewModelDashboard$aB_-bKp7QAzkVuyg4_YACPYYNdM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayViewModelDashboard.m1782_init_$lambda1(this.f$0, (java.lang.Float) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.-$$Lambda$TemperatureDayViewModelDashboard$d7tm66VfYQWAEtpYFHvPiNOh6E8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel
    public androidx.databinding.ObservableField<java.lang.Integer> getHeaderColor() {
        return this.headerColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final java.lang.Float m1781_init_$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayViewModelDashboard this$0, powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.userPrefsUtils.getValue(java.lang.Float.valueOf(it.getSkinTemp() / 4.0f), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.TEMPERATURE.INSTANCE).getFirst();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m1782_init_$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayViewModelDashboard this$0, java.lang.Float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.String str = !kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this$0.userPrefsUtils.isMetricsUsedOrNull(), (java.lang.Object) false) ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricsTemperatureUnit : powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialTemperatureUnit;
        androidx.databinding.ObservableField<java.lang.String> subTitle = this$0.getSubTitle();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str2 = this$0.subtitleText;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str3 = java.lang.String.format(kotlin.jvm.internal.Intrinsics.stringPlus("%.2f", str), java.util.Arrays.copyOf(new java.lang.Object[]{f}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(format, *args)");
        java.lang.String str4 = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{str3}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(format, *args)");
        subTitle.set(str4);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel
    public void goToDrillDown() {
        androidx.fragment.app.FragmentManager fragmentManager = getParentFragmentManagerWeakReference().get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperaturePeriodsFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.dashboard_fragment_container, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel
    public void onConfigurationArrived(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedChartConfig configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        super.onConfigurationArrived(configuration);
        java.lang.String str = !kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.userPrefsUtils.isMetricsUsedOrNull(), (java.lang.Object) false) ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricsTemperatureUnit : powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialTemperatureUnit;
        androidx.databinding.ObservableField<java.lang.String> subTitle = getSubTitle();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str2 = java.lang.String.format(this.subtitleText, java.util.Arrays.copyOf(new java.lang.Object[]{kotlin.jvm.internal.Intrinsics.stringPlus("0", str)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        subTitle.set(str2);
    }
}
