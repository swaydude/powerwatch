package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent;

/* JADX INFO: compiled from: SleepPeriodsFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0016\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u0016\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014R\u001b\u0010\u0004\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepPeriodsFragment;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepPeriodsViewModel;", "()V", "sleepPeriodsViewModel", "getSleepPeriodsViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepPeriodsViewModel;", "sleepPeriodsViewModel$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "rootView", "Landroid/view/View;", "getDayFragmentInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;", "config", "", "getMonthFragmentInstance", "getViewModel", "getWeekFragmentInstance", "layoutRes", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepPeriodsFragment extends powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsFragment.Companion(null);

    /* JADX INFO: renamed from: sleepPeriodsViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy sleepPeriodsViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsFragment newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment, powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_activity_periods;
    }

    public SleepPeriodsFragment() {
        final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsFragment sleepPeriodsFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsFragment$sleepPeriodsViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.sleepPeriodsViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(sleepPeriodsFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel.class), qualifier, function0);
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment
    protected powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<?> getDayFragmentInstance(java.lang.Object config) {
        return powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.INSTANCE.newInstance(config);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment
    protected powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<?> getWeekFragmentInstance(java.lang.Object config) {
        return powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.INSTANCE.newInstance(config);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment
    protected powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<?> getMonthFragmentInstance(java.lang.Object config) {
        return powerwatch.matrix.com.pwgen2android.shared.ui.charts.CubicLineChartFragment.INSTANCE.newInstance(config);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment
    protected void configureToolbar(android.view.View rootView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        if (mainToolbar != null) {
            java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.sleep_title)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string);
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.-$$Lambda$SleepPeriodsFragment$GUsbKfgNXc4sfLWVvdf8KluBOCA
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsFragment.m1754configureToolbar$lambda0(this.f$0, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: configureToolbar$lambda-0, reason: not valid java name */
    public static final void m1754configureToolbar$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onBackClicked();
    }

    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel getSleepPeriodsViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel) this.sleepPeriodsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsViewModel getViewModel() {
        return getSleepPeriodsViewModel();
    }

    /* JADX INFO: compiled from: SleepPeriodsFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepPeriodsFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/sleepComponent/SleepPeriodsFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepPeriodsFragment();
        }
    }
}
