package powerwatch.matrix.com.pwgen2android.setup.goals;

/* JADX INFO: compiled from: SingleGoalEditFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditBiometricsBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;", "()V", "singleGoalEditViewModel", "getSingleGoalEditViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;", "singleGoalEditViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SingleGoalEditFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentEditBiometricsBinding, powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.Companion(null);
    private static final java.lang.String GOAL_CONFIG_PARAM = "GOAL_CONFIG_PARAM";

    /* JADX INFO: renamed from: singleGoalEditViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy singleGoalEditViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment newInstance(powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig) {
        return INSTANCE.newInstance(editGoalConfig);
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_single_goal_edit;
    }

    public SingleGoalEditFragment() {
        final powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment singleGoalEditFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment$singleGoalEditViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getContext(), this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.singleGoalEditViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(singleGoalEditFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel getSingleGoalEditViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel) this.singleGoalEditViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel getViewModel() {
        return getSingleGoalEditViewModel();
    }

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
        getViewModel().getShowSaveProgress().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.onCreateView.1
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                java.lang.Boolean bool = powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.this.getViewModel().getShowSaveProgress().get();
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
        android.os.Bundle arguments = getArguments();
        powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig = arguments == null ? null : (powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig) arguments.getParcelable(GOAL_CONFIG_PARAM);
        if (editGoalConfig == null) {
            throw new java.lang.IllegalArgumentException("EditGoalConfig must be provided.");
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.GoalType type = editGoalConfig.getType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps.INSTANCE)) {
            if (mainToolbar != null) {
                java.lang.String string2 = getString(powerwatch.matrix.com.pwgen2android.R.string.steps);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.steps)");
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string2);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories.INSTANCE)) {
            if (mainToolbar != null) {
                java.lang.String string3 = getString(powerwatch.matrix.com.pwgen2android.R.string.calories_title);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.calories_title)");
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string3);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep.INSTANCE)) {
            if (mainToolbar != null) {
                java.lang.String string4 = getString(powerwatch.matrix.com.pwgen2android.R.string.sleep_title);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.sleep_title)");
                powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string4);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power.INSTANCE) && mainToolbar != null) {
            java.lang.String string5 = getString(powerwatch.matrix.com.pwgen2android.R.string.power_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.power_title)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string5);
        }
        getViewModel().setConfig(editGoalConfig);
        final android.widget.EditText editText = (android.widget.EditText) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.goal_value_edit_text);
        editText.setShowSoftInputOnFocus(true);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SingleGoalEditFragment$l1IqU7L9f1mc-KfV9ecBfiks1lY
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.m2872onCreateView$lambda0(this.f$0, editText);
            }
        }, 100L);
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SingleGoalEditFragment$4Yt7AbqTrDrtjPdH77wDrBm_Kpw
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.m2873onCreateView$lambda1(this.f$0, editText, view);
                }
            });
        }
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SingleGoalEditFragment$UfNUKVFURGeuSy9clN0EX1krfLk
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.m2874onCreateView$lambda2(this.f$0, editText, view);
                }
            });
        }
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2872onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment this$0, android.widget.EditText editText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.content.Context context = this$0.getContext();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) (context == null ? null : context.getSystemService("input_method"));
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(editText, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m2873onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment this$0, android.widget.EditText editText, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.content.Context context = this$0.getContext();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) (context == null ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
        this$0.getViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m2874onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment this$0, android.widget.EditText editText, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.content.Context context = this$0.getContext();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) (context == null ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
        this$0.getViewModel().onSaveClicked();
    }

    /* JADX INFO: compiled from: SingleGoalEditFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment$Companion;", "", "()V", powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.GOAL_CONFIG_PARAM, "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditFragment;", "goalConfig", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment newInstance(powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig goalConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfig, "goalConfig");
            powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment singleGoalEditFragment = new powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.GOAL_CONFIG_PARAM, goalConfig);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            singleGoalEditFragment.setArguments(bundle);
            return singleGoalEditFragment;
        }
    }
}
