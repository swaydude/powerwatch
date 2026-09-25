package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: ReportIssueFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0014J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/WebViewContainerBinding;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;", "()V", "angularWebViewContainer", "Landroid/widget/FrameLayout;", "appWebView", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;", "getAppWebView", "()Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;", "appWebView$delegate", "Lkotlin/Lazy;", "reportIssueViewModel", "getReportIssueViewModel", "()Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueViewModel;", "reportIssueViewModel$delegate", "reportingModule", "Lorg/koin/core/module/Module;", "getReportingModule", "()Lorg/koin/core/module/Module;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ReportIssueFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.WebViewContainerBinding, powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment.Companion(null);
    private android.widget.FrameLayout angularWebViewContainer;

    /* JADX INFO: renamed from: appWebView$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy appWebView;

    /* JADX INFO: renamed from: reportIssueViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy reportIssueViewModel;
    private final org.koin.core.module.Module reportingModule;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-3, reason: not valid java name */
    public static final void m2106onCreateView$lambda3(java.lang.Throwable th) {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.web_view_container;
    }

    public ReportIssueFragment() {
        final powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment reportIssueFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment$reportIssueViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), this.this$0.getFragmentManager(), this.this$0);
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.reportIssueViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(reportIssueFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel.class), qualifier, function0);
            }
        });
        final powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment reportIssueFragment2 = this;
        final kotlin.jvm.functions.Function0 function1 = (kotlin.jvm.functions.Function0) null;
        this.appWebView = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView>() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView invoke() {
                android.content.ComponentCallbacks componentCallbacks = reportIssueFragment2;
                return org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(componentCallbacks).getRootScope().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView.class), qualifier, function1);
            }
        });
        this.reportingModule = powerwatch.matrix.com.pwgen2android.report.ReportingModuleKt.reportingModule();
    }

    private final powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel getReportIssueViewModel() {
        return (powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel) this.reportIssueViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel getViewModel() {
        return getReportIssueViewModel();
    }

    private final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView getAppWebView() {
        return (powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebView) this.appWebView.getValue();
    }

    public final org.koin.core.module.Module getReportingModule() {
        return this.reportingModule;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        org.koin.core.context.GlobalContextKt.loadKoinModules(this.reportingModule);
        android.view.View rootView = getRootView();
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = rootView == null ? null : (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueFragment$3Nw0gto9AF4MTxpBrDIuqY5u7xU
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment.m2103onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        if (mainToolbar != null) {
            java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.contact_support);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.contact_support)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string);
        }
        if (viewOnCreateView != null) {
            android.view.View viewFindViewById = viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.web_view_container);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.web_view_container)");
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewFindViewById;
            this.angularWebViewContainer = frameLayout;
            if (frameLayout != null) {
                frameLayout.addView((powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppWebViewImpl) getAppWebView());
                getCompositeDisposable().add(getAppWebView().pageProgress().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueFragment$I8ZVA-VIRlRVod9jjScmr4A7lzM
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment.m2104onCreateView$lambda1((java.lang.Integer) obj);
                    }
                }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueFragment$rCphE_8Fd00_QL95JF-QaIzoa1w
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(java.lang.Object obj) {
                        powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment.m2105onCreateView$lambda2(this.f$0, (java.lang.Integer) obj);
                    }
                }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.report.ui.bridge.-$$Lambda$ReportIssueFragment$yXDMNc5NdFy5qGnujBwxLu6mBnw
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(java.lang.Object obj) {
                        powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment.m2106onCreateView$lambda3((java.lang.Throwable) obj);
                    }
                }));
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("angularWebViewContainer");
                throw null;
            }
        }
        powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueViewModel reportIssueViewModel = getReportIssueViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        reportIssueViewModel.onCreateView(context);
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2103onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getReportIssueViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final boolean m2104onCreateView$lambda1(java.lang.Integer it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.intValue() == 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m2105onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment this$0, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getReportIssueViewModel().onPageLoaded();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getCompositeDisposable().clear();
        org.koin.core.context.GlobalContextKt.unloadKoinModules(this.reportingModule);
        android.widget.FrameLayout frameLayout = this.angularWebViewContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("angularWebViewContainer");
            throw null;
        }
    }

    /* JADX INFO: compiled from: ReportIssueFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/ReportIssueFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment newInstance() {
            android.os.Bundle bundle = new android.os.Bundle();
            powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment reportIssueFragment = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.ReportIssueFragment();
            reportIssueFragment.setArguments(bundle);
            return reportIssueFragment;
        }
    }
}
