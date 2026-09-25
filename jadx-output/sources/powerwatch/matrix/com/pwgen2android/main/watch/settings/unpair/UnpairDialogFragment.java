package powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair;

/* JADX INFO: compiled from: UnpairDialogFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\n\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0014J&\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairAction;", "()V", "rootView", "Landroid/view/View;", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "viewModel", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;", "getViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogVM;", "viewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "Landroidx/lifecycle/ViewModel;", "layoutRes", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UnpairDialogFragment extends powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog<powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogFragment.Companion(null);
    private android.view.View rootView;
    private androidx.databinding.ViewDataBinding viewDataBinding;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    private final int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_unpair_watch;
    }

    public UnpairDialogFragment() {
        final powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogFragment unpairDialogFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogFragment$viewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(unpairDialogFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM.class), qualifier, function0);
            }
        });
    }

    /* JADX INFO: renamed from: getViewModel, reason: collision with other method in class */
    private final powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM m2000getViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogVM) this.viewModel.getValue();
    }

    private final androidx.lifecycle.ViewModel getViewModel() {
        return m2000getViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.ui.dialogManager.dialogs.BaseDialog, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.databinding.ViewDataBinding viewDataBindingInflate = androidx.databinding.DataBindingUtil.inflate(inflater, layoutRes(), container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "inflate(inflater, layoutRes(), container, false)");
        this.viewDataBinding = viewDataBindingInflate;
        if (viewDataBindingInflate != null) {
            this.rootView = viewDataBindingInflate.getRoot();
            m2000getViewModel().setDialogClose(new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogFragment.onCreateView.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction unpairAction) {
                    invoke2(unpairAction);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction unpairAction) {
                    powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogFragment.this.dismissAllowingStateLoss();
                }
            });
            m2000getViewModel().onCreateView();
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

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m2000getViewModel().onDestroyView();
    }

    /* JADX INFO: compiled from: UnpairDialogFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/unpair/UnpairDialogFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairDialogFragment();
        }
    }
}
