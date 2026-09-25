package powerwatch.matrix.com.pwgen2android.setup.verifyaccount;

/* JADX INFO: compiled from: VerifyAccountScreenFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentVerifyAccountBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;", "()V", "verifyAccountViewModel", "getVerifyAccountViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;", "verifyAccountViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class VerifyAccountScreenFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentVerifyAccountBinding, powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment.Companion(null);
    private static final java.lang.String USER_EMAIL_PARAM = "matrix_user_email_param";

    /* JADX INFO: renamed from: verifyAccountViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy verifyAccountViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment newInstance(java.lang.String str) {
        return INSTANCE.newInstance(str);
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_verify_account;
    }

    public VerifyAccountScreenFragment() {
        final powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment verifyAccountScreenFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment$verifyAccountViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = this.this$0.getActivity();
                androidx.fragment.app.FragmentActivity activity = this.this$0.getActivity();
                objArr[1] = activity == null ? null : activity.getSupportFragmentManager();
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(objArr);
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.verifyAccountViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(verifyAccountScreenFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel getVerifyAccountViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel) this.verifyAccountViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel getViewModel() {
        return getVerifyAccountViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        android.widget.Button button;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        setRootView(super.onCreateView(inflater, container, savedInstanceState));
        android.view.View rootView = getRootView();
        if (rootView != null && (button = (android.widget.Button) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button)) != null) {
            button.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.verifyaccount.-$$Lambda$VerifyAccountScreenFragment$yH2AWgHViDMl-B2F6FcqZUDVaUI
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment.m2951onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        if (getArguments() != null) {
            androidx.databinding.ObservableField<java.lang.String> email = getVerifyAccountViewModel().getEmail();
            android.os.Bundle arguments = getArguments();
            kotlin.jvm.internal.Intrinsics.checkNotNull(arguments);
            email.set(arguments.getString(USER_EMAIL_PARAM));
        }
        android.view.View rootView2 = getRootView();
        android.widget.TextView textView = rootView2 == null ? null : (android.widget.TextView) rootView2.findViewById(powerwatch.matrix.com.pwgen2android.R.id.screen_title);
        kotlin.jvm.internal.Intrinsics.checkNotNull(textView);
        textView.setText(getString(powerwatch.matrix.com.pwgen2android.R.string.create_account_title));
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        textView.setTextColor(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.black));
        return getRootView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2951onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getVerifyAccountViewModel().onBackClicked();
    }

    /* JADX INFO: compiled from: VerifyAccountScreenFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment$Companion;", "", "()V", "USER_EMAIL_PARAM", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment;", "email", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment newInstance(java.lang.String email) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
            powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment verifyAccountScreenFragment = new powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment.USER_EMAIL_PARAM, email);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            verifyAccountScreenFragment.setArguments(bundle);
            return verifyAccountScreenFragment;
        }
    }
}
