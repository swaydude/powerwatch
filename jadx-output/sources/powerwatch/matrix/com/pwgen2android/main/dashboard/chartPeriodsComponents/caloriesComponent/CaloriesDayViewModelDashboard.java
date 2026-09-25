package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent;

/* JADX INFO: compiled from: CaloriesDayViewModelDashboard.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/CaloriesDayViewModelDashboard;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CombinedBarChartConfig;", "walkingDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;", "restingDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;", "sleepDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "selectedDateProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;", "goalsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "activityContext", "Landroid/content/Context;", "parentFragmentManager", "Landroidx/fragment/app/FragmentManager;", "dayFormatterViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/caloriesComponent/periodsViewModels/CaloriesDayFormatterViewModel;)V", "headerColor", "Landroidx/databinding/ObservableField;", "", "getHeaderColor", "()Landroidx/databinding/ObservableField;", "subtitleText", "", "goToDrillDown", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CaloriesDayViewModelDashboard extends powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CombinedBarChartConfig> {
    private final androidx.databinding.ObservableField<java.lang.Integer> headerColor;
    private final java.lang.String subtitleText;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    public static final void m1696_init_$lambda2(java.lang.Throwable th) {
    }

    public /* synthetic */ CaloriesDayViewModelDashboard(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDayFormatterViewModel caloriesDayFormatterViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider, selectedDateProvider, goalConfigurationRepository, rxBus, userPrefsUtils, context, fragmentManager, (i & 512) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDayFormatterViewModel(walkingDayPeriodDataProvider, restingDayPeriodDataProvider, sleepDayPeriodDataProvider, false, null, null, 48, null) : caloriesDayFormatterViewModel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CaloriesDayViewModelDashboard(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.SelectedDateProvider selectedDateProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalsRepository, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context activityContext, androidx.fragment.app.FragmentManager parentFragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.periodsViewModels.CaloriesDayFormatterViewModel dayFormatterViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriodDataProvider, "walkingDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodDataProvider, "restingDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodDataProvider, "sleepDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDateProvider, "selectedDateProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsRepository, "goalsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentFragmentManager, "parentFragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayFormatterViewModel, "dayFormatterViewModel");
        java.lang.String string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.calories_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityContext.getString(R.string.calories_title)");
        super(string, dayFormatterViewModel, selectedDateProvider, activityContext, parentFragmentManager, rxBus);
        this.headerColor = new androidx.databinding.ObservableField<>(java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(activityContext, powerwatch.matrix.com.pwgen2android.R.color.blue_chart)));
        java.lang.String string2 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.daily_goal_calories);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "activityContext.getString(R.string.daily_goal_calories)");
        this.subtitleText = string2;
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(goalsRepository, false, false, 3, null).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.-$$Lambda$CaloriesDayViewModelDashboard$jihqOR9-I8Vhbo6Rc748OEj_m4Y
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesDayViewModelDashboard.m1694_init_$lambda0((powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.-$$Lambda$CaloriesDayViewModelDashboard$K3bVyPcTCZ3m7IB4s67qVDi72dQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesDayViewModelDashboard.m1695_init_$lambda1(this.f$0, (java.lang.Integer) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.-$$Lambda$CaloriesDayViewModelDashboard$TjuIVXX938CovITBawRt3axywMM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesDayViewModelDashboard.m1696_init_$lambda2((java.lang.Throwable) obj);
            }
        }));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel
    public androidx.databinding.ObservableField<java.lang.Integer> getHeaderColor() {
        return this.headerColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final java.lang.Integer m1694_init_$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return java.lang.Integer.valueOf(it.getCalories());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m1695_init_$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesDayViewModelDashboard this$0, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.databinding.ObservableField<java.lang.String> subTitle = this$0.getSubTitle();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format(this$0.subtitleText, java.util.Arrays.copyOf(new java.lang.Object[]{num}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        subTitle.set(str);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel
    public void goToDrillDown() {
        androidx.fragment.app.FragmentManager fragmentManager = getParentFragmentManagerWeakReference().get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesPeriodsFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.dashboard_fragment_container, true, null, 8, null);
    }
}
