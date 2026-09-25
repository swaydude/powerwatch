package powerwatch.matrix.com.pwgen2android.setup.editBiometrics;

/* JADX INFO: compiled from: SingleWheelFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditBiometricsBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;", "()V", "singleWheelViewModel", "getSingleWheelViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;", "singleWheelViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SingleWheelFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.Companion(null);
    private static final java.lang.String WHEEL_CONFIG_PARAM = "WHEEL_CONFIG_PARAM";

    /* JADX INFO: renamed from: singleWheelViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy singleWheelViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment newInstance(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig) {
        return INSTANCE.newInstance(wheelConfig);
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_biometrics;
    }

    public SingleWheelFragment() {
        final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment singleWheelFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment$singleWheelViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getContext(), this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.singleWheelViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(singleWheelFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel getSingleWheelViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel) this.singleWheelViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel getViewModel() {
        return getSingleWheelViewModel();
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [T, java.lang.String] */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        final powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        if (mainToolbar != null) {
            java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.button_save);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.button_save)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonText(mainToolbar, string);
        }
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$SingleWheelFragment$nJbeLedimdYFkLzinSupWRg1zVk
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.m2825onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        getViewModel().getShowSaveProgress().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.onCreateView.2
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                java.lang.Boolean bool = powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.this.getViewModel().getShowSaveProgress().get();
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
        com.super_rabbit.wheel_picker.WheelPicker wheelPicker = (com.super_rabbit.wheel_picker.WheelPicker) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.single_biometrics_picker);
        android.os.Bundle arguments = getArguments();
        final powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = arguments == null ? null : (powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig) arguments.getParcelable(WHEEL_CONFIG_PARAM);
        if (wheelConfig == null) {
            throw new java.lang.IllegalArgumentException("Wheel config must be provided.");
        }
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType type = wheelConfig.getType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender.INSTANCE)) {
            if (mainToolbar != null) {
                java.lang.String string2 = getString(powerwatch.matrix.com.pwgen2android.R.string.gender);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.gender)");
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string2);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age.INSTANCE)) {
            if (mainToolbar != null) {
                java.lang.String string3 = getString(powerwatch.matrix.com.pwgen2android.R.string.age);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.age)");
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string3);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight.INSTANCE)) {
            if (mainToolbar != null) {
                java.lang.String string4 = getString(powerwatch.matrix.com.pwgen2android.R.string.weight);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.weight)");
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string4);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height.INSTANCE)) {
            if (mainToolbar != null) {
                java.lang.String string5 = getString(powerwatch.matrix.com.pwgen2android.R.string.height);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.height)");
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string5);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language.INSTANCE)) {
            if (mainToolbar != null) {
                java.lang.String string6 = getString(powerwatch.matrix.com.pwgen2android.R.string.language);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.language)");
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string6);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock.INSTANCE)) {
            if (mainToolbar != null) {
                java.lang.String string7 = getString(powerwatch.matrix.com.pwgen2android.R.string.clock);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.clock)");
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string7);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime.INSTANCE) && mainToolbar != null) {
            java.lang.String string8 = getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_time_header);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.sleep_time_header)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string8);
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = wheelConfig.getCurrentValue();
        wheelPicker.setOnValueChangeListener(new com.super_rabbit.wheel_picker.OnValueChangeListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.onCreateView.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.super_rabbit.wheel_picker.OnValueChangeListener
            public void onValueChange(com.super_rabbit.wheel_picker.WheelPicker picker, java.lang.String oldVal, java.lang.String newVal) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(picker, "picker");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldVal, "oldVal");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newVal, "newVal");
                objectRef.element = newVal;
            }
        });
        wheelPicker.setWheelItemCount(wheelConfig.getWheelItemCount());
        wheelPicker.setMax(wheelConfig.getMaxValue());
        wheelPicker.setMin(wheelConfig.getMinValue());
        wheelPicker.setAdapter(wheelConfig.getAdapter());
        wheelPicker.reset();
        wheelPicker.scrollToValue(wheelConfig.getCurrentValue());
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$SingleWheelFragment$atg4SSv_FvM43GnTY3AqJD4na-k
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.m2826onCreateView$lambda1(this.f$0, wheelConfig, objectRef, view);
                }
            });
        }
        powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel viewModel = getViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        viewModel.onCreateView(context);
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2825onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m2826onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment this$0, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig config, kotlin.jvm.internal.Ref.ObjectRef currentValue, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "$config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentValue, "$currentValue");
        this$0.getViewModel().onSaveClicked(config, (java.lang.String) currentValue.element);
    }

    /* JADX INFO: compiled from: SingleWheelFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment$Companion;", "", "()V", powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.WHEEL_CONFIG_PARAM, "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelFragment;", "wheelConfig", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment newInstance(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wheelConfig, "wheelConfig");
            powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment singleWheelFragment = new powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelFragment.WHEEL_CONFIG_PARAM, wheelConfig);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            singleWheelFragment.setArguments(bundle);
            return singleWheelFragment;
        }
    }
}
