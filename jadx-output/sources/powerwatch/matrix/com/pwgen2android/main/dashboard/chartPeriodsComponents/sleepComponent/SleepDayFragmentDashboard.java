package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent;

/* JADX INFO: compiled from: SleepDayFragmentDashboard.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0014R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayFragmentDashboard;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/DashboardActivityItemFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/activityPeriods/BaseDashboardActivityPeriodItemViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;", "()V", "sleepDayViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;", "getSleepDayViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayViewModelDashboard;", "sleepDayViewModel$delegate", "Lkotlin/Lazy;", "getChartInstance", "getViewModel", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepDayFragmentDashboard extends powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.DashboardActivityItemFragment<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment, powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.BaseDashboardActivityPeriodItemViewModel<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartConfig>> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayFragmentDashboard.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayFragmentDashboard.Companion(null);

    /* JADX INFO: renamed from: sleepDayViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy sleepDayViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayFragmentDashboard newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.DashboardActivityItemFragment, powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    public SleepDayFragmentDashboard() {
        final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayFragmentDashboard sleepDayFragmentDashboard = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayFragmentDashboard$sleepDayViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = this.this$0.getActivity();
                androidx.fragment.app.Fragment parentFragment = this.this$0.getParentFragment();
                objArr[1] = parentFragment == null ? null : parentFragment.getFragmentManager();
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(objArr);
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.sleepDayViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayFragmentDashboard$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(sleepDayFragmentDashboard, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard.class), qualifier, function0);
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.activityPeriods.DashboardActivityItemFragment
    public powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment getChartInstance() {
        return powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.Companion.newInstance$default(powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.INSTANCE, null, 1, null);
    }

    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard getSleepDayViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard) this.sleepDayViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayViewModelDashboard getViewModel() {
        return getSleepDayViewModel();
    }

    /* JADX INFO: compiled from: SleepDayFragmentDashboard.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayFragmentDashboard$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepDayFragmentDashboard;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayFragmentDashboard newInstance() {
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayFragmentDashboard sleepDayFragmentDashboard = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayFragmentDashboard();
            android.os.Bundle bundle = new android.os.Bundle();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            sleepDayFragmentDashboard.setArguments(bundle);
            return sleepDayFragmentDashboard;
        }
    }
}
