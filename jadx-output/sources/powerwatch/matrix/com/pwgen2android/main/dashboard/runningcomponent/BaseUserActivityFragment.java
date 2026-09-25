package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent;

/* JADX INFO: compiled from: BaseUserActivityFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH$J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u0017H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/BaseUserActivityFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentUserActivityBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "controlViewViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;", "getControlViewViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;", "controlViewViewModel$delegate", "Lkotlin/Lazy;", "heartRateViewModel", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;", "getHeartRateViewModel", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/heartrate/ActivityHeartRateViewModel;", "heartRateViewModel$delegate", "mapsViewModel", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;", "getMapsViewModel", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;", "mapsViewModel$delegate", "addControlViewFragment", "", "addHeartRateFragment", "addMapsFragment", "it", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;", "getBindingVariable", "", "isMainScreen", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseUserActivityFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {

    /* JADX INFO: renamed from: controlViewViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy controlViewViewModel;

    /* JADX INFO: renamed from: heartRateViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy heartRateViewModel;

    /* JADX INFO: renamed from: mapsViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy mapsViewModel;

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    protected abstract boolean isMainScreen();

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public BaseUserActivityFragment() {
        final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment baseUserActivityFragment = this;
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        this.controlViewViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(baseUserActivityFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel.class), qualifier, function0);
            }
        });
        this.heartRateViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(baseUserActivityFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel.class), qualifier, function0);
            }
        });
        this.mapsViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(baseUserActivityFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel getControlViewViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel) this.controlViewViewModel.getValue();
    }

    private final powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel getHeartRateViewModel() {
        return (powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateViewModel) this.heartRateViewModel.getValue();
    }

    private final powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel getMapsViewModel() {
        return (powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel) this.mapsViewModel.getValue();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        setRootView(super.onCreateView(inflater, container, savedInstanceState));
        android.view.View rootView = getRootView();
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = rootView == null ? null : (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        if (mainToolbar != null) {
            java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.activity_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.activity_title)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string);
            java.lang.String string2 = getString(powerwatch.matrix.com.pwgen2android.R.string.user_activity_screen_right_text);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.user_activity_screen_right_text)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonText(mainToolbar, string2);
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$BaseUserActivityFragment$UJ_A0ar6FcRd7C0HoZdS-FXfw28
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment.m1851onCreateView$lambda0(this.f$0, view);
                }
            });
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$BaseUserActivityFragment$J-oQcGFkD8jJnxENsaAV-vyrrlo
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment.m1852onCreateView$lambda1(this.f$0, view);
                }
            });
        }
        getViewModel().setControlViewViewModel(getControlViewViewModel());
        getViewModel().setHeartRateChartViewModel(getHeartRateViewModel());
        getViewModel().setMapsViewModel(getMapsViewModel());
        getCompositeDisposable().add(getViewModel().getMapData().skip(1L).retry().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$BaseUserActivityFragment$XiWKwjaIKdrU2KuIct9K0GdrHuc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment.m1853onCreateView$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.-$$Lambda$BaseUserActivityFragment$fBd_QaNj3e8_BaAtGvmYm2AxRSc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment.m1854onCreateView$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        return getRootView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1851onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1852onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().onRightButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m1853onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment this$0, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isAdded()) {
            if (it.getHasLocations()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
                this$0.addMapsFragment(it);
            }
            if (it.getHasHeartRate() && this$0.getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.chart_fragment_container) == null) {
                this$0.addHeartRateFragment();
            }
            if (this$0.isMainScreen()) {
                return;
            }
            if ((it.getHasLocations() || it.getHasHeartRate()) && this$0.getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.control_view_container) == null) {
                this$0.addControlViewFragment();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-3, reason: not valid java name */
    public static final void m1854onCreateView$lambda3(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.BaseUserActivityFragment this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error in BaseActivity Fragment: " + ((java.lang.Object) th.getClass().getSimpleName()) + ", " + ((java.lang.Object) th.getMessage()), th, null, 4, null);
        th.printStackTrace();
    }

    private final void addControlViewFragment() {
        getChildFragmentManager().beginTransaction().replace(powerwatch.matrix.com.pwgen2android.R.id.control_view_container, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewFragment.INSTANCE.newInstance()).commitAllowingStateLoss();
    }

    private final void addHeartRateFragment() {
        getChildFragmentManager().beginTransaction().replace(powerwatch.matrix.com.pwgen2android.R.id.chart_fragment_container, powerwatch.matrix.com.pwgen2android.shared.ui.charts.heartrate.ActivityHeartRateChartFragment.INSTANCE.newInstance()).commitAllowingStateLoss();
    }

    private final void addMapsFragment(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType it) {
        powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment baiduMapsFragmentNewInstance;
        if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.maps_fragment_container) == null) {
            if (it instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType.Google) {
                baiduMapsFragmentNewInstance = powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.INSTANCE.newInstance(!isMainScreen());
            } else {
                if (!(it instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MapType.Baidu)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                baiduMapsFragmentNewInstance = powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment.INSTANCE.newInstance(!isMainScreen());
            }
            getChildFragmentManager().beginTransaction().replace(powerwatch.matrix.com.pwgen2android.R.id.maps_fragment_container, baiduMapsFragmentNewInstance).commitAllowingStateLoss();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getCompositeDisposable().clear();
    }
}
