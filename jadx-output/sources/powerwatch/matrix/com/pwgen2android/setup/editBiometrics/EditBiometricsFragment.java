package powerwatch.matrix.com.pwgen2android.setup.editBiometrics;

/* JADX INFO: compiled from: EditBiometricsFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditBiometricsBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;", "()V", "editBiometricsViewModel", "getEditBiometricsViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;", "editBiometricsViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release", "biometricsViewModel", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EditBiometricsFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment.Companion(null);

    /* JADX INFO: renamed from: editBiometricsViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy editBiometricsViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_biometrics;
    }

    public EditBiometricsFragment() {
        final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment editBiometricsFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment$editBiometricsViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getContext(), this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.editBiometricsViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(editBiometricsFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel getEditBiometricsViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel) this.editBiometricsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel getViewModel() {
        return getEditBiometricsViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        setRootView(super.onCreateView(inflater, container, savedInstanceState));
        android.view.View rootView = getRootView();
        final powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = rootView == null ? null : (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        if (mainToolbar != null) {
            java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.button_save);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.button_save)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonText(mainToolbar, string);
        }
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$EditBiometricsFragment$uHDxHDGpkIu2k102kJgwEkuQIyo
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment.m2816onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$EditBiometricsFragment$DWbWyWPE677ja2Dk59ORRVEtkgY
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment.m2817onCreateView$lambda1(this.f$0, view);
                }
            });
        }
        if (mainToolbar != null) {
            java.lang.String string2 = getString(powerwatch.matrix.com.pwgen2android.R.string.user_biometrics);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.user_biometrics)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string2);
        }
        final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment editBiometricsFragment = this;
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        getViewModel().setBiometricsViewModel(m2818onCreateView$lambda2(kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment$onCreateView$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(editBiometricsFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel.class), qualifier, function0);
            }
        })));
        if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.biometrics_container) == null) {
            getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.biometrics_container, powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment.INSTANCE.newInstance()).commit();
        }
        getViewModel().getShowSaveProgress().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment.onCreateView.3
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                java.lang.Boolean bool = powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment.this.getViewModel().getShowSaveProgress().get();
                if (bool == null) {
                    bool = false;
                }
                if (bool.booleanValue()) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar2 = mainToolbar;
                    if (mainToolbar2 == null) {
                        return;
                    }
                    mainToolbar2.showRightProgress();
                    return;
                }
                powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar3 = mainToolbar;
                if (mainToolbar3 == null) {
                    return;
                }
                mainToolbar3.hideRightProgress();
            }
        });
        powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel viewModel = getViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        viewModel.onCreateView(context);
        return getRootView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2816onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m2817onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onSaveClicked();
    }

    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel m2818onCreateView$lambda2(kotlin.Lazy<powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: compiled from: EditBiometricsFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsFragment();
        }
    }
}
