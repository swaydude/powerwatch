package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent;

/* JADX INFO: compiled from: MainUserActivityFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;", "()V", "userActivityViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;", "getUserActivityViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;", "userActivityViewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "isMainScreen", "", "layoutRes", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MainUserActivityFragment extends powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment.Companion(null);

    /* JADX INFO: renamed from: userActivityViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy userActivityViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment, powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment
    protected boolean isMainScreen() {
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_main_user_activity;
    }

    public MainUserActivityFragment() {
        final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment mainUserActivityFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment$userActivityViewModel$2
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
        this.userActivityViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(mainUserActivityFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel getUserActivityViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel) this.userActivityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel getViewModel() {
        return getUserActivityViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment, powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments == null ? null : arguments.getString(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.ACTIVITY_ID);
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel userActivityViewModel = getUserActivityViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        userActivityViewModel.loadActivitySession(string, context);
        return viewOnCreateView;
    }

    /* JADX INFO: compiled from: MainUserActivityFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MainUserActivityFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment newInstance() {
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment mainUserActivityFragment = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment();
            mainUserActivityFragment.setArguments(new android.os.Bundle());
            return mainUserActivityFragment;
        }
    }
}
