package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity;

/* JADX INFO: compiled from: EditUserActivityFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentEditUserActivityBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;", "()V", "editUserActivityViewModel", "getEditUserActivityViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityViewModel;", "editUserActivityViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EditUserActivityFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentEditUserActivityBinding, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel> {
    private static final java.lang.String ACTIVITY_ID = "activityId";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment.Companion(null);
    public static final java.lang.String SELECTED_ACTIVITY_TYPE = "selectedActivityType";

    /* JADX INFO: renamed from: editUserActivityViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy editUserActivityViewModel;

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_edit_user_activity;
    }

    public EditUserActivityFragment() {
        final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment editUserActivityFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment$editUserActivityViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getFragmentManager(), this.this$0.getActivity());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.editUserActivityViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(editUserActivityFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel getEditUserActivityViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel) this.editUserActivityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityViewModel getViewModel() {
        return getEditUserActivityViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        android.widget.LinearLayout linearLayout;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        setRootView(super.onCreateView(inflater, container, savedInstanceState));
        android.view.View rootView = getRootView();
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = rootView == null ? null : (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        if (mainToolbar != null) {
            java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.edit_activity_screen_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.edit_activity_screen_title)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string);
            java.lang.String string2 = getString(powerwatch.matrix.com.pwgen2android.R.string.button_done);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.button_done)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonText(mainToolbar, string2);
            java.lang.String string3 = getString(powerwatch.matrix.com.pwgen2android.R.string.button_cancel);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.button_cancel)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonText(mainToolbar, string3);
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.removeBackButtonDrawable$default(mainToolbar, false, 1, null);
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonTextClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityFragment$6oOOV-I3kmfJDrbG_AOsZtLbBYM
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment.m1869onCreateView$lambda0(this.f$0, view);
                }
            });
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityFragment$3XXo_-JI2YbO-zAtsNs62HFm_7o
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment.m1870onCreateView$lambda1(this.f$0, view);
                }
            });
            android.os.Bundle arguments = getArguments();
            java.lang.String string4 = arguments == null ? null : arguments.getString("activityId");
            if (string4 == null) {
                throw new java.lang.IllegalArgumentException("Activity ID must be provided.");
            }
            android.os.Bundle arguments2 = getArguments();
            java.lang.String string5 = arguments2 == null ? null : arguments2.getString(SELECTED_ACTIVITY_TYPE);
            if (string5 != null) {
                getViewModel().getTypeField().set(string5);
            }
            getEditUserActivityViewModel().loadActivitySession(string4);
        }
        android.view.View rootView2 = getRootView();
        final android.widget.EditText editText = rootView2 == null ? null : (android.widget.EditText) rootView2.findViewById(powerwatch.matrix.com.pwgen2android.R.id.name_edit_text);
        android.view.View rootView3 = getRootView();
        final android.widget.EditText editText2 = rootView3 != null ? (android.widget.EditText) rootView3.findViewById(powerwatch.matrix.com.pwgen2android.R.id.location_edit_text) : null;
        android.view.View rootView4 = getRootView();
        if (rootView4 != null && (linearLayout = (android.widget.LinearLayout) rootView4.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_view)) != null) {
            linearLayout.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.-$$Lambda$EditUserActivityFragment$Aph1ksfy025axv8aHpUNo2Ibw2g
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment.m1871onCreateView$lambda2(editText, editText2, this, view);
                }
            });
        }
        return getRootView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1869onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getEditUserActivityViewModel().onBackButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1870onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getEditUserActivityViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m1871onCreateView$lambda2(android.widget.EditText editText, android.widget.EditText editText2, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (editText != null) {
            editText.clearFocus();
        }
        if (editText2 != null) {
            editText2.clearFocus();
        }
        android.content.Context context = this$0.getContext();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) (context == null ? null : context.getSystemService("input_method"));
        if (inputMethodManager == null) {
            return;
        }
        android.view.View view2 = this$0.getView();
        inputMethodManager.hideSoftInputFromWindow(view2 != null ? view2.getWindowToken() : null, 0);
    }

    /* JADX INFO: compiled from: EditUserActivityFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityFragment$Companion;", "", "()V", "ACTIVITY_ID", "", "SELECTED_ACTIVITY_TYPE", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditUserActivityFragment;", "activityId", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment newInstance(java.lang.String activityId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityId, "activityId");
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment editUserActivityFragment = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("activityId", activityId);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            editUserActivityFragment.setArguments(bundle);
            return editUserActivityFragment;
        }
    }
}
