package powerwatch.matrix.com.pwgen2android.dialog;

/* JADX INFO: compiled from: BadPlacementDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\t\u001a\u00020\u000fH\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "rootView", "Landroid/view/View;", "viewDataBinding", "Landroidx/databinding/ViewDataBinding;", "viewModel", "Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;", "getViewModel", "()Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialogVM;", "viewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "Landroidx/lifecycle/ViewModel;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BadPlacementDialog extends androidx.fragment.app.DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog.Companion(null);
    private android.view.View rootView;
    private androidx.databinding.ViewDataBinding viewDataBinding;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy viewModel;

    private final int getBindingVariable() {
        return 1;
    }

    public void _$_clearFindViewByIdCache() {
    }

    public BadPlacementDialog() {
        final powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog badPlacementDialog = this;
        final powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog$viewModel$2 badPlacementDialog$viewModel$2 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog$viewModel$2
            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(new java.lang.Object[0]);
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.viewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM>() { // from class: powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(badPlacementDialog, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM.class), qualifier, badPlacementDialog$viewModel$2);
            }
        });
    }

    /* JADX INFO: renamed from: getViewModel, reason: collision with other method in class */
    private final powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM m1425getViewModel() {
        return (powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialogVM) this.viewModel.getValue();
    }

    private final androidx.lifecycle.ViewModel getViewModel() {
        return m1425getViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        androidx.databinding.ViewDataBinding viewDataBindingInflate = androidx.databinding.DataBindingUtil.inflate(inflater, powerwatch.matrix.com.pwgen2android.R.layout.dialog_bad_placement, container, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "inflate(inflater, R.layout.dialog_bad_placement, container, false)");
        this.viewDataBinding = viewDataBindingInflate;
        if (viewDataBindingInflate != null) {
            this.rootView = viewDataBindingInflate.getRoot();
            m1425getViewModel().setDialogClose(new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.main.watch.settings.unpair.UnpairAction, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog.onCreateView.1
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
                    powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog.this.dismissAllowingStateLoss();
                }
            });
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

    /* JADX INFO: compiled from: BadPlacementDialog.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/dialog/BadPlacementDialog;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog newInstance() {
            return new powerwatch.matrix.com.pwgen2android.dialog.BadPlacementDialog();
        }
    }
}
