package powerwatch.matrix.com.pwgen2android.setup.createaccount;

/* JADX INFO: compiled from: LicencePageFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentLicencePageBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageViewModel;", "()V", "licencePageViewModel", "getLicencePageViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageViewModel;", "licencePageViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LicencePageFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentLicencePageBinding, powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageFragment.Companion(null);

    /* JADX INFO: renamed from: licencePageViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy licencePageViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_licence_page;
    }

    public LicencePageFragment() {
        final powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageFragment licencePageFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageFragment$licencePageViewModel$2
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
        this.licencePageViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(licencePageFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel getLicencePageViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel) this.licencePageViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageViewModel getViewModel() {
        return getLicencePageViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        setRootView(super.onCreateView(inflater, container, savedInstanceState));
        android.widget.TextView textView = (android.widget.TextView) getViewDataBinding().mainView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.screen_title);
        if (textView != null) {
            textView.setText(getString(powerwatch.matrix.com.pwgen2android.R.string.terms_and_conditions));
        }
        textView.setLines(2);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) getViewDataBinding().mainView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.conditions_container);
        final android.widget.ProgressBar progressBar = new android.widget.ProgressBar(getContext());
        android.webkit.WebView webView = new android.webkit.WebView(requireContext());
        frameLayout.addView(webView);
        frameLayout.addView(progressBar, new android.widget.FrameLayout.LayoutParams(200, 200, 17));
        webView.loadUrl(getString(powerwatch.matrix.com.pwgen2android.R.string.terms_and_conditions_link));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new android.webkit.WebViewClient() { // from class: powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageFragment.onCreateView.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                super.onPageFinished(view, url);
                progressBar.setVisibility(8);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                super.onReceivedError(view, request, error);
                progressBar.setVisibility(8);
            }
        });
        ((android.widget.Button) getViewDataBinding().mainView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button)).setVisibility(8);
        return getRootView();
    }

    /* JADX INFO: compiled from: LicencePageFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageFragment();
        }
    }
}
