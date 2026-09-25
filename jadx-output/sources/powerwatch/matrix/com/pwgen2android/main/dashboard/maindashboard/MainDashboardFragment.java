package powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard;

/* JADX INFO: compiled from: MainDashboardFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0003H\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0014J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMainDashboardBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;", "()V", "mainDashboardViewModel", "getMainDashboardViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardViewModel;", "mainDashboardViewModel$delegate", "Lkotlin/Lazy;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "syncViewModel", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;", "getSyncViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/sync/SyncViewModel;", "syncViewModel$delegate", "toolbar", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onResume", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MainDashboardFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentMainDashboardBinding, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.Companion(null);
    private static final java.lang.String MAIN_SCROLL_POSITION = "main_scroll_position";

    /* JADX INFO: renamed from: mainDashboardViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy mainDashboardViewModel;
    private androidx.core.widget.NestedScrollView scrollView;

    /* JADX INFO: renamed from: syncViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy syncViewModel;
    private powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment newInstance() {
        return INSTANCE.newInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1797onCreateView$lambda0(java.lang.Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1798onCreateView$lambda1(java.lang.Throwable th) {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_main_dashboard;
    }

    public MainDashboardFragment() {
        final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment mainDashboardFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment$mainDashboardViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getFragmentManager(), this.this$0.getSyncViewModel(), this.this$0.getActivity());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.mainDashboardViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(mainDashboardFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel.class), qualifier, function0);
            }
        });
        final kotlin.jvm.functions.Function0 function1 = (kotlin.jvm.functions.Function0) null;
        this.syncViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(mainDashboardFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel.class), qualifier, function1);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel getMainDashboardViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel) this.mainDashboardViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel getSyncViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncViewModel) this.syncViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel getViewModel() {
        return getMainDashboardViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        android.content.Context contextRequireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        if (!powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.isBluetoothPermissionGranted(contextRequireContext)) {
            getCompositeDisposable().add(new com.tbruyelle.rxpermissions2.RxPermissions(this).request("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN").subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardFragment$8bIaTg6DtqJX5ovlVp-PBToUaS0
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.m1797onCreateView$lambda0((java.lang.Boolean) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardFragment$3wqniTWjSWaZ3nemKOKTHZOWMdg
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.m1798onCreateView$lambda1((java.lang.Throwable) obj);
                }
            }));
        }
        android.view.View viewFindViewById = viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_scroll);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewFindViewById, "rootView.findViewById(R.id.main_scroll)");
        this.scrollView = (androidx.core.widget.NestedScrollView) viewFindViewById;
        android.os.Bundle arguments = getArguments();
        java.lang.Integer numValueOf = arguments == null ? null : java.lang.Integer.valueOf(arguments.getInt(MAIN_SCROLL_POSITION));
        if (numValueOf != null) {
            androidx.core.widget.NestedScrollView nestedScrollView = this.scrollView;
            if (nestedScrollView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("scrollView");
                throw null;
            }
            nestedScrollView.scrollTo(0, numValueOf.intValue());
        }
        getCompositeDisposable().add(getViewModel().getScrollToTopEvent().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardFragment$SOLj7_1iHy3W-8u7yTgD5FGl_FM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.m1799onCreateView$lambda2(this.f$0, (kotlin.Unit) obj);
            }
        }));
        getCompositeDisposable().add(getViewModel().getRealtimeWidgetTapEvent().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardFragment$lHRzczvsOYHwiua6o5wWqLlqZPs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.m1800onCreateView$lambda3(this.f$0, obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardFragment$3wOOUGHPNviFIR7fuu8I6qLpb48
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        this.toolbar = mainToolbar;
        if (mainToolbar != null) {
            java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.main_dashboard_screen_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.main_dashboard_screen_title)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string);
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar2 = this.toolbar;
        if (mainToolbar2 != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonText(mainToolbar2, "");
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar3 = this.toolbar;
        if (mainToolbar3 != null) {
            java.lang.String str = getMainDashboardViewModel().getBackButtonFieldText().get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonText(mainToolbar3, str);
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar4 = this.toolbar;
        if (mainToolbar4 != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(mainToolbar4, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardFragment$_crOdxRwkmNYKgWMX4UvoS0_Hk0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.m1802onCreateView$lambda5(this.f$0, view);
                }
            });
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar5 = this.toolbar;
        if (mainToolbar5 != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.displayCalendarIcon(mainToolbar5, true);
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar6 = this.toolbar;
        if (mainToolbar6 != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.calendarClickListener(mainToolbar6, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardFragment$r53rwkziovEOhKDRk4myKvYGE9c
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.m1803onCreateView$lambda6(this.f$0, view);
                }
            });
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar7 = this.toolbar;
        if (mainToolbar7 != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonTextClickListener(mainToolbar7, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardFragment$YUqrwI0XZlKKWbNVq7KzO9EIDCM
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.m1804onCreateView$lambda7(this.f$0, view);
                }
            });
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar8 = this.toolbar;
        if (mainToolbar8 != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.rightButtonClickListener(mainToolbar8, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.-$$Lambda$MainDashboardFragment$cx6E9LIRYDyY6tuT0bdgM1CwGuA
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment.m1805onCreateView$lambda8(this.f$0, view);
                }
            });
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncFragment syncFragmentNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.sync.SyncFragment.INSTANCE.newInstance();
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment mainUserActivityFragmentNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.MainUserActivityFragment.INSTANCE.newInstance();
        powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment realTimeFragmentNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment.INSTANCE.newInstance();
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.PedometerDayFragmentDashboard pedometerDayFragmentDashboardNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.PedometerDayFragmentDashboard.INSTANCE.newInstance();
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesDayFragmentDashboard caloriesDayFragmentDashboardNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.caloriesComponent.CaloriesDayFragmentDashboard.INSTANCE.newInstance();
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayFragmentDashboard sleepDayFragmentDashboardNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.sleepComponent.SleepDayFragmentDashboard.INSTANCE.newInstance();
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayFragmentDashboard heartRateDayFragmentDashboardNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDayFragmentDashboard.INSTANCE.newInstance();
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayFragmentDashboard powerDayFragmentDashboardNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDayFragmentDashboard.INSTANCE.newInstance();
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayFragmentDashboard temperatureDayFragmentDashboardNewInstance = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDayFragmentDashboard.INSTANCE.newInstance();
        if (savedInstanceState == null) {
            if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.sync_fragment) == null) {
                getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.sync_fragment, syncFragmentNewInstance, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(syncFragmentNewInstance.getClass()).getSimpleName()).commitAllowingStateLoss();
            }
            if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.user_activity_fragment) == null) {
                getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.user_activity_fragment, mainUserActivityFragmentNewInstance, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(mainUserActivityFragmentNewInstance.getClass()).getSimpleName()).commitAllowingStateLoss();
            }
            if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.real_time_fragment) == null) {
                getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.real_time_fragment, realTimeFragmentNewInstance, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(realTimeFragmentNewInstance.getClass()).getSimpleName()).commitAllowingStateLoss();
            }
            if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.pedometer_day_fragment) == null) {
                getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.pedometer_day_fragment, pedometerDayFragmentDashboardNewInstance, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(pedometerDayFragmentDashboardNewInstance.getClass()).getSimpleName()).commitAllowingStateLoss();
            }
            if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.calories_day_fragment) == null) {
                getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.calories_day_fragment, caloriesDayFragmentDashboardNewInstance, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(caloriesDayFragmentDashboardNewInstance.getClass()).getSimpleName()).commitAllowingStateLoss();
            }
            if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.sleep_day_fragment) == null) {
                getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.sleep_day_fragment, sleepDayFragmentDashboardNewInstance, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(sleepDayFragmentDashboardNewInstance.getClass()).getSimpleName()).commitAllowingStateLoss();
            }
            if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.heart_rate_day_fragment) == null) {
                getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.heart_rate_day_fragment, heartRateDayFragmentDashboardNewInstance, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(heartRateDayFragmentDashboardNewInstance.getClass()).getSimpleName()).commitAllowingStateLoss();
            }
            if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.power_day_fragment) == null) {
                getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.power_day_fragment, powerDayFragmentDashboardNewInstance, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerDayFragmentDashboardNewInstance.getClass()).getSimpleName()).commitAllowingStateLoss();
            }
            if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.temperature_day_fragment) == null) {
                getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.temperature_day_fragment, temperatureDayFragmentDashboardNewInstance, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(temperatureDayFragmentDashboardNewInstance.getClass()).getSimpleName()).commitAllowingStateLoss();
            }
        }
        getViewModel().prepare(this.toolbar);
        powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardViewModel viewModel = getViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        viewModel.onCreateView(context);
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m1799onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment this$0, kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.core.widget.NestedScrollView nestedScrollView = this$0.scrollView;
        if (nestedScrollView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("scrollView");
            throw null;
        }
        if (nestedScrollView.getScrollX() == 0) {
            androidx.core.widget.NestedScrollView nestedScrollView2 = this$0.scrollView;
            if (nestedScrollView2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("scrollView");
                throw null;
            }
            if (nestedScrollView2.getScrollY() == 0) {
                this$0.getMainDashboardViewModel().resetDateToToday();
            }
        }
        androidx.core.widget.NestedScrollView nestedScrollView3 = this$0.scrollView;
        if (nestedScrollView3 != null) {
            nestedScrollView3.smoothScrollTo(0, 0);
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("scrollView");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-3, reason: not valid java name */
    public static final void m1800onCreateView$lambda3(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment this$0, java.lang.Object obj) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (obj instanceof powerwatch.matrix.com.pwgen2android.shared.RealTimeWidgetTap.PowerWidgetTap) {
            i = powerwatch.matrix.com.pwgen2android.R.id.power_day_fragment;
        } else if (obj instanceof powerwatch.matrix.com.pwgen2android.shared.RealTimeWidgetTap.StepsWidgetTap) {
            i = powerwatch.matrix.com.pwgen2android.R.id.pedometer_day_fragment;
        } else if (obj instanceof powerwatch.matrix.com.pwgen2android.shared.RealTimeWidgetTap.CaloriesWidgetTap) {
            i = powerwatch.matrix.com.pwgen2android.R.id.calories_day_fragment;
        } else {
            i = obj instanceof powerwatch.matrix.com.pwgen2android.shared.RealTimeWidgetTap.SleepWidgetTap ? powerwatch.matrix.com.pwgen2android.R.id.sleep_day_fragment : Integer.MAX_VALUE;
        }
        if (i != Integer.MAX_VALUE) {
            android.view.View rootView = super.getRootView();
            android.view.View viewFindViewById = rootView == null ? null : rootView.findViewById(i);
            androidx.core.widget.NestedScrollView nestedScrollView = this$0.scrollView;
            if (nestedScrollView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("scrollView");
                throw null;
            }
            java.lang.Float fValueOf = viewFindViewById != null ? java.lang.Float.valueOf(viewFindViewById.getY()) : null;
            nestedScrollView.smoothScrollTo(0, fValueOf == null ? 0 : (int) fValueOf.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-5, reason: not valid java name */
    public static final void m1802onCreateView$lambda5(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMainDashboardViewModel().onBackButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-6, reason: not valid java name */
    public static final void m1803onCreateView$lambda6(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMainDashboardViewModel().onBackButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-7, reason: not valid java name */
    public static final void m1804onCreateView$lambda7(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMainDashboardViewModel().onBackButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-8, reason: not valid java name */
    public static final void m1805onCreateView$lambda8(powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMainDashboardViewModel().onRightButtonClicked();
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getCompositeDisposable().clear();
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = this.toolbar;
        if (mainToolbar != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.resetRightButtonState(mainToolbar);
        }
        android.os.Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        androidx.core.widget.NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            arguments.putInt(MAIN_SCROLL_POSITION, nestedScrollView.getScrollY());
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("scrollView");
            throw null;
        }
    }

    /* JADX INFO: compiled from: MainDashboardFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment$Companion;", "", "()V", "MAIN_SCROLL_POSITION", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/maindashboard/MainDashboardFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment newInstance() {
            powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment mainDashboardFragment = new powerwatch.matrix.com.pwgen2android.main.dashboard.maindashboard.MainDashboardFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            mainDashboardFragment.setArguments(bundle);
            return mainDashboardFragment;
        }
    }
}
