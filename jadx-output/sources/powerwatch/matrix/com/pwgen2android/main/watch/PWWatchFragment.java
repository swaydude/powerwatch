package powerwatch.matrix.com.pwgen2android.main.watch;

/* JADX INFO: compiled from: PWWatchFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001!B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0014J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\""}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "scrollView", "Landroid/widget/ScrollView;", "watchViewModel", "getWatchViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;", "watchViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PWWatchFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentMyPowerwatchBinding, powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.watch.PWWatchFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.watch.PWWatchFragment.Companion(null);
    private static final java.lang.String WATCH_SCROLL_POSITION = "watch_scroll_position";
    private android.widget.ScrollView scrollView;

    /* JADX INFO: renamed from: watchViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy watchViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.watch.PWWatchFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_my_powerwatch;
    }

    public PWWatchFragment() {
        final powerwatch.matrix.com.pwgen2android.main.watch.PWWatchFragment pWWatchFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.PWWatchFragment$watchViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                powerwatch.matrix.com.pwgen2android.main.watch.PWWatchFragment pWWatchFragment2 = this.this$0;
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), pWWatchFragment2, pWWatchFragment2.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.watchViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.PWWatchFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(pWWatchFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.class), qualifier, function0);
            }
        });
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel getWatchViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel) this.watchViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel getViewModel() {
        return getWatchViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        android.view.View viewFindViewById = viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.pw_watch_scroll);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewFindViewById, "rootView.findViewById(R.id.pw_watch_scroll)");
        this.scrollView = (android.widget.ScrollView) viewFindViewById;
        android.os.Bundle arguments = getArguments();
        java.lang.Integer numValueOf = arguments == null ? null : java.lang.Integer.valueOf(arguments.getInt(WATCH_SCROLL_POSITION));
        if (numValueOf != null) {
            android.widget.ScrollView scrollView = this.scrollView;
            if (scrollView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("scrollView");
                throw null;
            }
            scrollView.scrollTo(0, numValueOf.intValue());
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.my_powerwatch_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.my_powerwatch_title)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(toolbar, string);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.hideRightButton(toolbar);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.hideBackButton(toolbar);
        powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel watchViewModel = getWatchViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        watchViewModel.onCreateView(context);
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.banner_pager);
        if (getActivity() != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
            viewPager.setAdapter(new powerwatch.matrix.com.pwgen2android.main.watch.BannerAdapter(childFragmentManager));
        }
        return viewOnCreateView;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        android.os.Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        android.widget.ScrollView scrollView = this.scrollView;
        if (scrollView != null) {
            arguments.putInt(WATCH_SCROLL_POSITION, scrollView.getScrollY());
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("scrollView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1234) {
            if (resultCode == -1) {
                getWatchViewModel().authorizationSuccess();
            } else {
                getWatchViewModel().authorizationCanceled();
            }
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        androidx.fragment.app.FragmentActivity activity = getActivity();
        powerwatch.matrix.com.pwgen2android.main.MainActivity mainActivity = activity instanceof powerwatch.matrix.com.pwgen2android.main.MainActivity ? (powerwatch.matrix.com.pwgen2android.main.MainActivity) activity : null;
        if (mainActivity == null) {
            return;
        }
        mainActivity.showTab(true);
    }

    /* JADX INFO: compiled from: PWWatchFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment$Companion;", "", "()V", "WATCH_SCROLL_POSITION", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.watch.PWWatchFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.main.watch.PWWatchFragment();
        }
    }
}
