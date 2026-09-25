package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent;

/* JADX INFO: compiled from: SleepDayViewModelDashboard.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0002H\u0014J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\rH\u0016J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\rH\u0016R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "sleepDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "selectedDateProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "activityContext", "Landroid/content/Context;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "sleepTimeCloudStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;", "dayFormatterViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeCloudStorage;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/periodsViewModel/SleepDayFormatterViewModel;)V", "headerColor", "Landroidx/databinding/ObservableField;", "", "getHeaderColor", "()Landroidx/databinding/ObservableField;", "rxBusDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "sleepHeaderTitleText", "", "goToDrillDown", "", "onConfigurationArrived", "configuration", "onCreateView", "context", "onDestroyView", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepDayViewModelDashboard extends powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepDayFormatterViewModel dayFormatterViewModel;
    private final androidx.databinding.ObservableField<java.lang.Integer> headerColor;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private final io.reactivex.disposables.CompositeDisposable rxBusDisposable;
    private final java.lang.String sleepHeaderTitleText;

    public /* synthetic */ SleepDayViewModelDashboard(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage sleepTimeCloudStorage, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepDayFormatterViewModel sleepDayFormatterViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sleepDayPeriodDataProvider, selectedDateProvider, rxBus, userPrefsUtils, context, fragmentManager, sleepTimeCloudStorage, (i & 128) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepDayFormatterViewModel(sleepDayPeriodDataProvider, true, userPrefsUtils, sleepTimeCloudStorage, null, null, 48, null) : sleepDayFormatterViewModel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SleepDayViewModelDashboard(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context activityContext, androidx.fragment.app.FragmentManager parentFragmentManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeCloudStorage sleepTimeCloudStorage, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.periodsViewModel.SleepDayFormatterViewModel dayFormatterViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodDataProvider, "sleepDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDateProvider, "selectedDateProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepTimeCloudStorage, "sleepTimeCloudStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayFormatterViewModel, "dayFormatterViewModel");
        java.lang.String string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityContext.getString(R.string.sleep_title)");
        super(string, dayFormatterViewModel, selectedDateProvider, activityContext, parentFragmentManager, rxBus);
        this.rxBus = rxBus;
        this.dayFormatterViewModel = dayFormatterViewModel;
        this.headerColor = new androidx.databinding.ObservableField<>(java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(activityContext, powerwatch.matrix.com.pwgen2android.R.color.blue)));
        this.sleepHeaderTitleText = kotlin.jvm.internal.Intrinsics.stringPlus(activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.asleep_header_title), " ");
        this.rxBusDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel
    public androidx.databinding.ObservableField<java.lang.Integer> getHeaderColor() {
        return this.headerColor;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel, powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        this.rxBusDisposable.add(this.rxBus.getEvents().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.-$$Lambda$SleepDayViewModelDashboard$mqDOr24PANmjc7aRhAVBOPpSyS4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard.m1752onCreateView$lambda0(obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.-$$Lambda$SleepDayViewModelDashboard$vDJ8lWkswnbpDnrESRf-1ZUnN-k
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard.m1753onCreateView$lambda1(this.f$0, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final boolean m1752onCreateView$lambda0(java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof powerwatch.matrix.com.pwgen2android.shared.SleepChartClicked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1753onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard this$0, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goToDrillDown();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel
    public void goToDrillDown() {
        androidx.fragment.app.FragmentManager fragmentManager = getParentFragmentManagerWeakReference().get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.dashboard_fragment_container, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel
    public void onConfigurationArrived(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig configuration) {
        java.lang.String strStringPlus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        super.onConfigurationArrived(configuration);
        androidx.databinding.ObservableField<java.lang.String> subTitle = getSubTitle();
        java.lang.String daySubtitle = configuration.getDaySubtitle();
        java.lang.String str = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText;
        if (daySubtitle != null && (strStringPlus = kotlin.jvm.internal.Intrinsics.stringPlus(this.sleepHeaderTitleText, configuration.getDaySubtitle())) != null) {
            str = strStringPlus;
        }
        subTitle.set(str);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel, powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onDestroyView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onDestroyView(context);
        this.rxBusDisposable.clear();
    }
}
