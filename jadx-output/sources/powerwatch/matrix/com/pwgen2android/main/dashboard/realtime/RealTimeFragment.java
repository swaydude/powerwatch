package powerwatch.matrix.com.pwgen2android.main.dashboard.realtime;

/* JADX INFO: compiled from: RealTimeFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0010H\u0014J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentRealtimeBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;", "()V", "caloriesCircle", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/DashedCircleView;", "powerCircle", "realTimeViewModel", "getRealTimeViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeViewModel;", "realTimeViewModel$delegate", "Lkotlin/Lazy;", "sleepCircle", "stepsCircle", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setRealtimeData", "", "realTimeData", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RealTimeFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentRealtimeBinding, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment.Companion(null);
    private powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView caloriesCircle;
    private powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView powerCircle;

    /* JADX INFO: renamed from: realTimeViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy realTimeViewModel;
    private powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView sleepCircle;
    private powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView stepsCircle;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_realtime;
    }

    public RealTimeFragment() {
        final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment realTimeFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment$realTimeViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getActivity(), this.this$0.getFragmentManager());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.realTimeViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(realTimeFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel.class), qualifier, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel getRealTimeViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel) this.realTimeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel getViewModel() {
        return getRealTimeViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateView(inflater, container, savedInstanceState);
        android.view.View rootView = getRootView();
        if (rootView != null) {
            android.view.View viewFindViewById = rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.steps_circle);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.steps_circle)");
            this.stepsCircle = (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) viewFindViewById;
            android.view.View viewFindViewById2 = rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.calories_circle);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.calories_circle)");
            this.caloriesCircle = (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) viewFindViewById2;
            android.view.View viewFindViewById3 = rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.sleep_circle);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.sleep_circle)");
            this.sleepCircle = (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) viewFindViewById3;
            powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView dashedCircleView = (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_inner_circle);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dashedCircleView, "view.main_inner_circle");
            this.powerCircle = dashedCircleView;
        }
        getRealTimeViewModel().getDataField().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment.onCreateView.1
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment.this.setRealtimeData(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment.this.getRealTimeViewModel().getDataField().get());
            }
        });
        powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeViewModel realTimeViewModel = getRealTimeViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        realTimeViewModel.onCreateView(context);
        return getRootView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRealtimeData(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData realTimeData) {
        if (realTimeData != null) {
            powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView dashedCircleView = this.powerCircle;
            if (dashedCircleView == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("powerCircle");
                throw null;
            }
            dashedCircleView.setMaxValue(realTimeData.getSolarPower().getGoalValue());
            double value = realTimeData.getBodyPower().getValue();
            double value2 = realTimeData.getSolarPower().getValue();
            powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView dashedCircleView2 = this.powerCircle;
            if (dashedCircleView2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("powerCircle");
                throw null;
            }
            dashedCircleView2.setDoubleCurrentValue(new kotlin.Pair<>(java.lang.Double.valueOf(value), java.lang.Double.valueOf(value2)));
            powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView dashedCircleView3 = this.stepsCircle;
            if (dashedCircleView3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("stepsCircle");
                throw null;
            }
            dashedCircleView3.setMaxValue(realTimeData.getStepsData().getGoalValue());
            powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView dashedCircleView4 = this.stepsCircle;
            if (dashedCircleView4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("stepsCircle");
                throw null;
            }
            dashedCircleView4.setCurrentValue(realTimeData.getStepsData().getValue());
            powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView dashedCircleView5 = this.caloriesCircle;
            if (dashedCircleView5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("caloriesCircle");
                throw null;
            }
            dashedCircleView5.setMaxValue(realTimeData.getCaloriesData().getGoalValue());
            powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView dashedCircleView6 = this.caloriesCircle;
            if (dashedCircleView6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("caloriesCircle");
                throw null;
            }
            dashedCircleView6.setCurrentValue(realTimeData.getCaloriesData().getValue());
            powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView dashedCircleView7 = this.sleepCircle;
            if (dashedCircleView7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sleepCircle");
                throw null;
            }
            dashedCircleView7.setMaxValue(realTimeData.getSleepData().getGoalValue());
            powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.DashedCircleView dashedCircleView8 = this.sleepCircle;
            if (dashedCircleView8 != null) {
                dashedCircleView8.setCurrentValue(realTimeData.getSleepData().getValue());
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sleepCircle");
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: RealTimeFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment newInstance() {
            powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment realTimeFragment = new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            realTimeFragment.setArguments(bundle);
            return realTimeFragment;
        }
    }
}
