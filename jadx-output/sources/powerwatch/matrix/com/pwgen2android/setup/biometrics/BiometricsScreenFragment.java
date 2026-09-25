package powerwatch.matrix.com.pwgen2android.setup.biometrics;

/* JADX INFO: compiled from: BiometricsScreenFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBinding;", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;", "()V", "biometricsViewModel", "getBiometricsViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;", "biometricsViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BiometricsScreenFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragementBiometricsBinding, powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment.Companion(null);

    /* JADX INFO: renamed from: biometricsViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy biometricsViewModel = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment$biometricsViewModel$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel invoke() {
            androidx.fragment.app.Fragment parentFragment = this.this$0.getParentFragment();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parentFragment);
            androidx.lifecycle.ViewModel viewModel = androidx.lifecycle.ViewModelProviders.of(parentFragment).get(powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewModel, "of(parentFragment!!).get(BiometricsViewModel::class.java)");
            return (powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel) viewModel;
        }
    });

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragement_biometrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel getBiometricsViewModel() {
        return (powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel) this.biometricsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel getViewModel() {
        return getBiometricsViewModel();
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [T, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig] */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.$$Lambda$BiometricsScreenFragment$3pK56mUZ3ecd5A6Li99esU2Z9Y __lambda_biometricsscreenfragment_3pk56muz3ecd5a6li99esu2z9y = new android.view.View.OnTouchListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.biometrics.-$$Lambda$BiometricsScreenFragment$3pK56mUZ3ecd5-A6Li99esU2Z9Y
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment.m2794onCreateView$lambda0(view, motionEvent);
            }
        };
        android.view.View viewInflate = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.fragment_biometrics_bottom_sheet, (android.view.ViewGroup) null);
        final com.super_rabbit.wheel_picker.WheelPicker wheelPicker = (com.super_rabbit.wheel_picker.WheelPicker) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.biometrics_picker);
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        final com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog = new com.google.android.material.bottomsheet.BottomSheetDialog(context);
        bottomSheetDialog.setContentView(viewInflate);
        bottomSheetDialog.setCancelable(false);
        ((android.widget.ImageView) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.close_button)).setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.biometrics.-$$Lambda$BiometricsScreenFragment$MuosfboD-SZe3lZwaZjykFT7Z7U
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment.m2795onCreateView$lambda1(bottomSheetDialog, view);
            }
        });
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = new powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight.INSTANCE, null, null, 0, 0, 0, 62, null);
        wheelPicker.setOnTouchListener(__lambda_biometricsscreenfragment_3pk56muz3ecd5a6li99esu2z9y);
        wheelPicker.setOnValueChangeListener(new com.super_rabbit.wheel_picker.OnValueChangeListener() { // from class: powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment.onCreateView.2
            @Override // com.super_rabbit.wheel_picker.OnValueChangeListener
            public void onValueChange(com.super_rabbit.wheel_picker.WheelPicker picker, java.lang.String oldVal, java.lang.String newVal) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(picker, "picker");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldVal, "oldVal");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newVal, "newVal");
                powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType type = objectRef.element.getType();
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight.INSTANCE)) {
                    this.getBiometricsViewModel().getWeight().set(newVal);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height.INSTANCE)) {
                    this.getBiometricsViewModel().getHeight().set(newVal);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age.INSTANCE)) {
                    this.getBiometricsViewModel().getAge().set(newVal);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender.INSTANCE)) {
                    this.getBiometricsViewModel().getGender().set(newVal);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language.INSTANCE)) {
                    this.getBiometricsViewModel().getLanguage().set(newVal);
                }
            }
        });
        getViewModel().getWheelConfig().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment.onCreateView.3
            /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Object, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig] */
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                wheelPicker.scrollTo(0);
                kotlin.jvm.internal.Ref.ObjectRef<powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig> objectRef2 = objectRef;
                powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig = this.getViewModel().getWheelConfig().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(wheelConfig);
                objectRef2.element = wheelConfig;
                wheelPicker.setWheelItemCount(objectRef.element.getWheelItemCount());
                wheelPicker.setMax(objectRef.element.getMaxValue());
                wheelPicker.setMin(objectRef.element.getMinValue());
                wheelPicker.setAdapter(objectRef.element.getAdapter());
                wheelPicker.reset();
                wheelPicker.scrollToValue(objectRef.element.getCurrentValue());
                bottomSheetDialog.show();
            }
        });
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final boolean m2794onCreateView$lambda0(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        view.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m2795onCreateView$lambda1(com.google.android.material.bottomsheet.BottomSheetDialog dialog, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    /* JADX INFO: compiled from: BiometricsScreenFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsScreenFragment();
        }
    }
}
