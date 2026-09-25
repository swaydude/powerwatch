package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share;

/* JADX INFO: compiled from: ShareActivityFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\f\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/SharedActivity;", "()V", powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.ACTIVITY_ID, "", "rootView", "Landroid/view/View;", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "viewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;", "getViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "Landroidx/lifecycle/ViewModel;", "layoutRes", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ShareActivityFragment extends powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity> {
    private java.lang.String activityId;
    private android.view.View rootView;
    private androidx.databinding.ViewDataBinding viewDataBinding;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment.Companion(null);
    private static final java.lang.String ACTIVITY_ID = "activity_id";

    private final int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_share_activity;
    }

    public ShareActivityFragment() {
        final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment shareActivityFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment$viewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(shareActivityFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel.class), qualifier, function0);
            }
        });
    }

    /* JADX INFO: renamed from: getViewModel, reason: collision with other method in class */
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel m1891getViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareViewModel) this.viewModel.getValue();
    }

    private final androidx.lifecycle.ViewModel getViewModel() {
        return m1891getViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.databinding.ViewDataBinding viewDataBindingInflate = androidx.databinding.DataBindingUtil.inflate(inflater, layoutRes(), container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "inflate(inflater, layoutRes(), container, false)");
        this.viewDataBinding = viewDataBindingInflate;
        if (viewDataBindingInflate != null) {
            this.rootView = viewDataBindingInflate.getRoot();
            android.os.Bundle arguments = getArguments();
            this.activityId = arguments != null ? arguments.getString(ACTIVITY_ID) : null;
            m1891getViewModel().setDialogClose(new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment.onCreateView.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity sharedActivity) {
                    invoke2(sharedActivity);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity sharedActivity) {
                    kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity, kotlin.Unit> dialogClose = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment.this.getDialogClose();
                    if (dialogClose == null) {
                        return;
                    }
                    if (sharedActivity == null) {
                        sharedActivity = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.SharedActivity.GPX.INSTANCE;
                    }
                    dialogClose.invoke(sharedActivity);
                }
            });
            m1891getViewModel().setSessionId(this.activityId);
            return this.rootView;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewDataBinding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        androidx.databinding.ViewDataBinding viewDataBinding = this.viewDataBinding;
        if (viewDataBinding == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewDataBinding");
            throw null;
        }
        viewDataBinding.setVariable(getBindingVariable(), getViewModel());
        androidx.databinding.ViewDataBinding viewDataBinding2 = this.viewDataBinding;
        if (viewDataBinding2 != null) {
            viewDataBinding2.executePendingBindings();
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewDataBinding");
            throw null;
        }
    }

    /* JADX INFO: compiled from: ShareActivityFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment$Companion;", "", "()V", "ACTIVITY_ID", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/share/ShareActivityFragment;", powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.ACTIVITY_ID, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment newInstance(java.lang.String activityId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityId, "activityId");
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment shareActivityFragment = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.share.ShareActivityFragment.ACTIVITY_ID, activityId);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            shareActivityFragment.setArguments(bundle);
            return shareActivityFragment;
        }
    }
}
