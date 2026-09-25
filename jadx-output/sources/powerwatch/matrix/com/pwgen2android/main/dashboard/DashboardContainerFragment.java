package powerwatch.matrix.com.pwgen2android.main.dashboard;

/* JADX INFO: compiled from: DashboardContainerFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseContainerFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentDashboardContainerBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;", "()V", "dashboardContainerViewModel", "getDashboardContainerViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerViewModel;", "dashboardContainerViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DashboardContainerFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseContainerFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentDashboardContainerBinding, powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerFragment.Companion(null);

    /* JADX INFO: renamed from: dashboardContainerViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy dashboardContainerViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerFragment newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseContainerFragment, powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_dashboard_container;
    }

    public DashboardContainerFragment() {
        final powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerFragment dashboardContainerFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerFragment$dashboardContainerViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), this.this$0.getChildFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.dashboardContainerViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(dashboardContainerFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel getDashboardContainerViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel) this.dashboardContainerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerViewModel getViewModel() {
        return getDashboardContainerViewModel();
    }

    /* JADX INFO: compiled from: DashboardContainerFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/DashboardContainerFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.DashboardContainerFragment();
        }
    }
}
