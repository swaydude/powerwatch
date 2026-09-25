package powerwatch.matrix.com.pwgen2android.setup.getstarted;

/* JADX INFO: compiled from: GetStartedScreenFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0014J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCreateAccountBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;", "()V", "biometricsViewModel", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;", "getBiometricsViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;", "biometricsViewModel$delegate", "Lkotlin/Lazy;", "getStartedViewModel", "getGetStartedViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;", "getStartedViewModel$delegate", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GetStartedScreenFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentCreateAccountBinding, powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment.Companion(null);

    /* JADX INFO: renamed from: biometricsViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy biometricsViewModel;

    /* JADX INFO: renamed from: getStartedViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy getStartedViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_get_started_screen;
    }

    public GetStartedScreenFragment() {
        final powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment getStartedScreenFragment = this;
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        this.biometricsViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(getStartedScreenFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel.class), qualifier, function0);
            }
        });
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function1 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment$getStartedViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = this.this$0.getActivity();
                androidx.fragment.app.FragmentActivity activity = this.this$0.getActivity();
                objArr[1] = activity == null ? null : activity.getSupportFragmentManager();
                objArr[2] = this.this$0.getBiometricsViewModel();
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(objArr);
            }
        };
        this.getStartedViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(getStartedScreenFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel.class), qualifier, function1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel getBiometricsViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel) this.biometricsViewModel.getValue();
    }

    private final powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel getGetStartedViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel) this.getStartedViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel getViewModel() {
        return getGetStartedViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        android.widget.Button button = (android.widget.Button) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button);
        if (button != null) {
            button.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.getstarted.-$$Lambda$GetStartedScreenFragment$1YN8sJVGNklRyyx3B0xWEnam13U
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment.m2844onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.biometrics_container) == null) {
            getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.biometrics_container, powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment.INSTANCE.newInstance()).commit();
        }
        android.widget.TextView textView = (android.widget.TextView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.screen_title);
        if (textView != null) {
            textView.setText(getString(powerwatch.matrix.com.pwgen2android.R.string.get_started));
        }
        powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel viewModel = getViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        viewModel.onCreateView(context);
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2844onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getGetStartedViewModel().onBackClicked();
    }

    /* JADX INFO: compiled from: GetStartedScreenFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment();
        }
    }
}
