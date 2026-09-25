package powerwatch.matrix.com.pwgen2android.setup.units;

/* JADX INFO: compiled from: ChooseUnitsFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseUnitsBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;", "()V", "chooseUnitsViewModel", "getChooseUnitsViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;", "chooseUnitsViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ChooseUnitsFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseUnitsBinding, powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment.Companion(null);

    /* JADX INFO: renamed from: chooseUnitsViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy chooseUnitsViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_units;
    }

    public ChooseUnitsFragment() {
        final powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment chooseUnitsFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment$chooseUnitsViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.chooseUnitsViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(chooseUnitsFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel getChooseUnitsViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel) this.chooseUnitsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel getViewModel() {
        return getChooseUnitsViewModel();
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
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.units.-$$Lambda$ChooseUnitsFragment$eG_S-OsskTLrRnJBLdqfj4liYpM
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment.m2941onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.units.-$$Lambda$ChooseUnitsFragment$k87dXplMkuD9BhlCHPrClUXBxss
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment.m2942onCreateView$lambda1(this.f$0, view);
                }
            });
        }
        if (mainToolbar != null) {
            java.lang.String string2 = getString(powerwatch.matrix.com.pwgen2android.R.string.units);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.units)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string2);
        }
        getViewModel().getShowSaveProgress().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment.onCreateView.3
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                java.lang.Boolean bool = powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment.this.getViewModel().getShowSaveProgress().get();
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
        return getRootView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2941onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getChooseUnitsViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m2942onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getChooseUnitsViewModel().onSaveClicked();
    }

    /* JADX INFO: compiled from: ChooseUnitsFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsFragment();
        }
    }
}
