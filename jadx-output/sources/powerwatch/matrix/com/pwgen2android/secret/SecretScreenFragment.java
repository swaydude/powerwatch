package powerwatch.matrix.com.pwgen2android.secret;

/* JADX INFO: compiled from: SecretScreenFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/SecretScreenFragmentBinding;", "Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;", "()V", "secretScreenViewModel", "getSecretScreenViewModel", "()Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenViewModel;", "secretScreenViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SecretScreenFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.SecretScreenFragmentBinding, powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.secret.SecretScreenFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.secret.SecretScreenFragment.Companion(null);

    /* JADX INFO: renamed from: secretScreenViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy secretScreenViewModel;

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.secret_screen_fragment;
    }

    public SecretScreenFragment() {
        final powerwatch.matrix.com.pwgen2android.secret.SecretScreenFragment secretScreenFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.secret.SecretScreenFragment$secretScreenViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                androidx.fragment.app.FragmentManager fragmentManager = this.this$0.getFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNull(fragmentManager);
                android.content.Context context = this.this$0.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(context);
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(fragmentManager, context);
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.secretScreenViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.secret.SecretScreenFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(secretScreenFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel getSecretScreenViewModel() {
        return (powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel) this.secretScreenViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.secret.SecretScreenViewModel getViewModel() {
        return getSecretScreenViewModel();
    }

    /* JADX INFO: compiled from: SecretScreenFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/secret/SecretScreenFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.secret.SecretScreenFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.secret.SecretScreenFragment();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.app_secret_screen_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.app_secret_screen_title)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(toolbar, string);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.hideRightButton(toolbar);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(toolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.secret.-$$Lambda$SecretScreenFragment$gU-rnQnRRHLYi2v5mIrQ_nCyMhg
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.secret.SecretScreenFragment.m2778onCreateView$lambda0(this.f$0, view);
            }
        });
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2778onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.secret.SecretScreenFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getSecretScreenViewModel().onBackClicked();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        androidx.fragment.app.FragmentActivity activity = getActivity();
        powerwatch.matrix.com.pwgen2android.main.MainActivity mainActivity = activity instanceof powerwatch.matrix.com.pwgen2android.main.MainActivity ? (powerwatch.matrix.com.pwgen2android.main.MainActivity) activity : null;
        if (mainActivity == null) {
            return;
        }
        mainActivity.showTab(false);
    }
}
