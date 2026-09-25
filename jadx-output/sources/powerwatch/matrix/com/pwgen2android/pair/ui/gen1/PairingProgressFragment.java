package powerwatch.matrix.com.pwgen2android.pair.ui.gen1;

/* JADX INFO: compiled from: PairingProgressFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentPairingProgressBinding;", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;", "()V", "pairingProgressViewModel", "getPairingProgressViewModel", "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;", "pairingProgressViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PairingProgressFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentPairingProgressBinding, powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressFragment.Companion(null);
    private static final java.lang.String DEVICE_INFO_KEY = "deviceInfoKey";

    /* JADX INFO: renamed from: pairingProgressViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy pairingProgressViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressFragment newInstance(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        return INSTANCE.newInstance(deviceInfo);
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_pairing_progress;
    }

    public PairingProgressFragment() {
        final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressFragment pairingProgressFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressFragment$pairingProgressViewModel$2
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
        this.pairingProgressViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(pairingProgressFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel getPairingProgressViewModel() {
        return (powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel) this.pairingProgressViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressViewModel getViewModel() {
        return getPairingProgressViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        android.os.Bundle arguments = getArguments();
        getPairingProgressViewModel().startPairing(arguments == null ? null : (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) arguments.getParcelable(DEVICE_INFO_KEY));
        return viewOnCreateView;
    }

    /* JADX INFO: compiled from: PairingProgressFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment$Companion;", "", "()V", "DEVICE_INFO_KEY", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressFragment;", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressFragment newInstance(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
            powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressFragment pairingProgressFragment = new powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(powerwatch.matrix.com.pwgen2android.pair.ui.gen1.PairingProgressFragment.DEVICE_INFO_KEY, deviceInfo);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            pairingProgressFragment.setArguments(bundle);
            return pairingProgressFragment;
        }
    }
}
