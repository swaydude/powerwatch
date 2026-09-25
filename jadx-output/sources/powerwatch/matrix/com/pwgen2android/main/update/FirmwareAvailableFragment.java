package powerwatch.matrix.com.pwgen2android.main.update;

/* JADX INFO: compiled from: FirmwareAvailableFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentFirmwareAvailableBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;", "()V", "firmwareAvailableViewModel", "getFirmwareAvailableViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableViewModel;", "firmwareAvailableViewModel$delegate", "Lkotlin/Lazy;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FirmwareAvailableFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding, powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment.Companion(null);
    private static final java.lang.String DEVICE_DATA = "device_data";
    private static final java.lang.String UPDATE_AVAILABLE = "update_available";
    private static final java.lang.String VERSION_FIELD = "firmware_version";

    /* JADX INFO: renamed from: firmwareAvailableViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy firmwareAvailableViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment newInstance(powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData firmwareDisplayData, powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData deviceUpdateData, boolean z) {
        return INSTANCE.newInstance(firmwareDisplayData, deviceUpdateData, z);
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_firmware_available;
    }

    public FirmwareAvailableFragment() {
        final powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment firmwareAvailableFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment$firmwareAvailableViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getFragmentManager(), this.this$0.getActivity());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.firmwareAvailableViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(firmwareAvailableFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel.class), qualifier, function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel getFirmwareAvailableViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel) this.firmwareAvailableViewModel.getValue();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        android.os.Bundle arguments = getArguments();
        powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData firmwareDisplayData = (powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData) (arguments == null ? null : arguments.getSerializable(VERSION_FIELD));
        android.os.Bundle arguments2 = getArguments();
        java.io.Serializable serializable = arguments2 == null ? null : arguments2.getSerializable(DEVICE_DATA);
        java.util.Objects.requireNonNull(serializable, "null cannot be cast to non-null type powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData");
        powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData deviceUpdateData = (powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData) serializable;
        powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel firmwareAvailableViewModel = getFirmwareAvailableViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        firmwareAvailableViewModel.onCreateView(context);
        if (firmwareDisplayData != null) {
            getFirmwareAvailableViewModel().setVersionRelease(firmwareDisplayData);
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) getFirmwareAvailableViewModel().getUpdateAvailable().get(), (java.lang.Object) true)) {
                getFirmwareAvailableViewModel().getReleaseNotes().set(firmwareDisplayData.getReleaseNotes());
                androidx.databinding.ObservableField<java.lang.String> updateInfo = getFirmwareAvailableViewModel().getUpdateInfo();
                android.content.Context context2 = getContext();
                updateInfo.set(context2 != null ? context2.getString(powerwatch.matrix.com.pwgen2android.R.string.new_version_available) : null);
            } else {
                getFirmwareAvailableViewModel().getFirmwareVersion().set(deviceUpdateData.getFirmwareVersion());
                androidx.databinding.ObservableField<java.lang.String> releaseNotes = getFirmwareAvailableViewModel().getReleaseNotes();
                android.content.Context context3 = getContext();
                releaseNotes.set(context3 == null ? null : context3.getString(powerwatch.matrix.com.pwgen2android.R.string.device_up_to_date));
                androidx.databinding.ObservableField<java.lang.String> updateInfo2 = getFirmwareAvailableViewModel().getUpdateInfo();
                android.content.Context context4 = getContext();
                updateInfo2.set(context4 != null ? context4.getString(powerwatch.matrix.com.pwgen2android.R.string.up_to_date) : null);
            }
            boolean zHasUpdate = firmwareDisplayData.hasUpdate();
            powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel firmwareAvailableViewModel2 = getFirmwareAvailableViewModel();
            android.content.Context context5 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context5);
            firmwareAvailableViewModel2.prepareUpdateInfo(context5, zHasUpdate);
        }
        final android.widget.ProgressBar progressBar = (android.widget.ProgressBar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.progressBar);
        getFirmwareAvailableViewModel().getOtaProgressValue().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment.onCreateView.1
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                android.widget.ProgressBar progressBar2 = progressBar;
                java.lang.Integer num = this.getFirmwareAvailableViewModel().getOtaProgressValue().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                progressBar2.setProgress(num.intValue());
            }
        });
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar toolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.hideRightButton(toolbar);
        java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.whats_new);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.whats_new)");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(toolbar, string);
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(toolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.update.-$$Lambda$FirmwareAvailableFragment$ZMq0n17VpDigdrSyIemSRzIVOh8
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment.m1898onCreateView$lambda0(this.f$0, view);
            }
        });
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1898onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getFirmwareAvailableViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel getViewModel() {
        return getFirmwareAvailableViewModel();
    }

    /* JADX INFO: compiled from: FirmwareAvailableFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment$Companion;", "", "()V", "DEVICE_DATA", "", "UPDATE_AVAILABLE", "VERSION_FIELD", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareAvailableFragment;", "version", "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;", "updateAvailable", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment newInstance(powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData version, powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData deviceInfo, boolean updateAvailable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
            powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment firmwareAvailableFragment = new powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment.VERSION_FIELD, version);
            bundle.putSerializable(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment.DEVICE_DATA, deviceInfo);
            bundle.putBoolean(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableFragment.UPDATE_AVAILABLE, updateAvailable);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            firmwareAvailableFragment.setArguments(bundle);
            return firmwareAvailableFragment;
        }
    }
}
