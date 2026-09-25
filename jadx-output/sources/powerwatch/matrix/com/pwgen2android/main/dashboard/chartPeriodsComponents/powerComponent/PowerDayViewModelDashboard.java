package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent;

/* JADX INFO: compiled from: PowerDayViewModelDashboard.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002H\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayViewModelDashboard;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "walkingDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;", "restingDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;", "sleepDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "selectedDateProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "activityContext", "Landroid/content/Context;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "dayFormatterViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayPeriodFormatterViewModel;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDayPeriodFormatterViewModel;)V", "headerColor", "Landroidx/databinding/ObservableField;", "", "getHeaderColor", "()Landroidx/databinding/ObservableField;", "powerGeneratedToday", "", "goToDrillDown", "", "onConfigurationArrived", "configuration", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PowerDayViewModelDashboard extends powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
    private final androidx.databinding.ObservableField<java.lang.Integer> headerColor;
    private final java.lang.String powerGeneratedToday;

    public /* synthetic */ PowerDayViewModelDashboard(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayPeriodFormatterViewModel powerDayPeriodFormatterViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider, selectedDateProvider, rxBus, userPrefsUtils, context, fragmentManager, (i & 256) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayPeriodFormatterViewModel(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider, null, null, 24, null) : powerDayPeriodFormatterViewModel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PowerDayViewModelDashboard(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context activityContext, androidx.fragment.app.FragmentManager parentFragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayPeriodFormatterViewModel dayFormatterViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriodDataProvider, "walkingDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodDataProvider, "restingDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodDataProvider, "sleepDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDateProvider, "selectedDateProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayFormatterViewModel, "dayFormatterViewModel");
        java.lang.String string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.power_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityContext.getString(R.string.power_title)");
        super(string, dayFormatterViewModel, selectedDateProvider, activityContext, parentFragmentManager, rxBus);
        java.lang.String string2 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.power_generated);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "activityContext.getString(R.string.power_generated)");
        this.powerGeneratedToday = string2;
        this.headerColor = new androidx.databinding.ObservableField<>(java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(activityContext, powerwatch.matrix.com.pwgen2android.R.color.color_7_yellow)));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel
    public androidx.databinding.ObservableField<java.lang.Integer> getHeaderColor() {
        return this.headerColor;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel
    public void goToDrillDown() {
        androidx.fragment.app.FragmentManager fragmentManager = getParentFragmentManagerWeakReference().get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerPeriodsFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.dashboard_fragment_container, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel
    public void onConfigurationArrived(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        super.onConfigurationArrived(configuration);
        androidx.databinding.ObservableField<java.lang.String> subTitle = getSubTitle();
        java.lang.String daySubtitle = configuration.getBarConfig().getDaySubtitle();
        java.lang.String str = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText;
        if (daySubtitle != null) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str2 = java.lang.String.format(this.powerGeneratedToday, java.util.Arrays.copyOf(new java.lang.Object[]{configuration.getBarConfig().getDaySubtitle()}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
            if (str2 != null) {
                str = str2;
            }
        }
        subTitle.set(str);
    }
}
