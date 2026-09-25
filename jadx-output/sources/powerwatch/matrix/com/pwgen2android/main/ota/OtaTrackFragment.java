package powerwatch.matrix.com.pwgen2android.main.ota;

/* JADX INFO: compiled from: OtaTrackFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0014J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentOtaTrackBinding;", "Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;", "()V", "downloadCircle", "Landroid/widget/ImageView;", "otaTrackViewModel", "getOtaTrackViewModel", "()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;", "otaTrackViewModel$delegate", "Lkotlin/Lazy;", "syncCircle", "transferCircle", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setupColor", "", "otaUiPhase", "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhase;", "context", "Landroid/content/Context;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OtaTrackFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentOtaTrackBinding, powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackFragment.Companion(null);
    private android.widget.ImageView downloadCircle;

    /* JADX INFO: renamed from: otaTrackViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy otaTrackViewModel;
    private android.widget.ImageView syncCircle;
    private android.widget.ImageView transferCircle;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_ota_track;
    }

    public OtaTrackFragment() {
        final powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackFragment otaTrackFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackFragment$otaTrackViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(this.this$0.getContext());
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.otaTrackViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(otaTrackFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackViewModel getOtaTrackViewModel() {
        return (powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackViewModel) this.otaTrackViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackViewModel getViewModel() {
        return getOtaTrackViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        android.content.Context context;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        if (viewOnCreateView != null && (context = getContext()) != null) {
            getOtaTrackViewModel().onCreateView(context);
        }
        return viewOnCreateView;
    }

    public final void setupColor(powerwatch.matrix.com.pwgen2android.main.OtaUIPhase otaUiPhase, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase phase = otaUiPhase == null ? null : otaUiPhase.getPhase();
        if (kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.CONNECTING.INSTANCE)) {
            android.widget.ImageView imageView = this.downloadCircle;
            if (imageView != null) {
                imageView.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.black)));
            }
            android.widget.ImageView imageView2 = this.syncCircle;
            if (imageView2 != null) {
                imageView2.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.black)));
            }
            android.widget.ImageView imageView3 = this.transferCircle;
            if (imageView3 != null) {
                imageView3.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.black)));
            }
            getOtaTrackViewModel().getOtaPhaseDescription().set(context.getString(powerwatch.matrix.com.pwgen2android.R.string.preparing_update));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.DOWNLOAD_STARTED.INSTANCE)) {
            android.widget.ImageView imageView4 = this.downloadCircle;
            if (imageView4 != null) {
                imageView4.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.darker_gray)));
            }
            getOtaTrackViewModel().getOtaPhaseDescription().set(context.getString(powerwatch.matrix.com.pwgen2android.R.string.preparing_update));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.DOWNLOAD_FINISHED.INSTANCE)) {
            android.widget.ImageView imageView5 = this.downloadCircle;
            if (imageView5 == null) {
                return;
            }
            imageView5.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.holo_green_light)));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.SYNC.INSTANCE)) {
            android.widget.ImageView imageView6 = this.downloadCircle;
            if (imageView6 != null) {
                imageView6.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.holo_green_light)));
            }
            android.widget.ImageView imageView7 = this.syncCircle;
            if (imageView7 != null) {
                imageView7.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.darker_gray)));
            }
            getOtaTrackViewModel().getOtaPhaseDescription().set(context.getString(powerwatch.matrix.com.pwgen2android.R.string.syncing_watch));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.FILE_TRANSFER.INSTANCE)) {
            android.widget.ImageView imageView8 = this.downloadCircle;
            if (imageView8 != null) {
                imageView8.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.holo_green_light)));
            }
            android.widget.ImageView imageView9 = this.syncCircle;
            if (imageView9 != null) {
                imageView9.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.holo_green_light)));
            }
            android.widget.ImageView imageView10 = this.transferCircle;
            if (imageView10 != null) {
                imageView10.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.darker_gray)));
            }
            getOtaTrackViewModel().getOtaPhaseDescription().set(context.getString(powerwatch.matrix.com.pwgen2android.R.string.updating_watch));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE)) {
            android.widget.ImageView imageView11 = this.downloadCircle;
            if (imageView11 != null) {
                imageView11.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.holo_green_light)));
            }
            android.widget.ImageView imageView12 = this.syncCircle;
            if (imageView12 != null) {
                imageView12.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.holo_green_light)));
            }
            android.widget.ImageView imageView13 = this.transferCircle;
            if (imageView13 != null) {
                imageView13.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.holo_green_light)));
            }
            getOtaTrackViewModel().getOtaPhaseDescription().set(context.getString(powerwatch.matrix.com.pwgen2android.R.string.success) + '\n' + context.getString(powerwatch.matrix.com.pwgen2android.R.string.tap_to_continue));
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(phase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.ERROR.INSTANCE)) {
            android.widget.ImageView imageView14 = this.downloadCircle;
            if (imageView14 != null) {
                imageView14.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.black)));
            }
            android.widget.ImageView imageView15 = this.syncCircle;
            if (imageView15 != null) {
                imageView15.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.black)));
            }
            android.widget.ImageView imageView16 = this.transferCircle;
            if (imageView16 != null) {
                imageView16.setBackgroundTintList(android.content.res.ColorStateList.valueOf(androidx.core.content.ContextCompat.getColor(context, android.R.color.black)));
            }
            getOtaTrackViewModel().getOtaProgressField().set(0);
            getOtaTrackViewModel().getOtaPhaseDescription().set(context.getString(powerwatch.matrix.com.pwgen2android.R.string.error) + '\n' + context.getString(powerwatch.matrix.com.pwgen2android.R.string.tap_to_retry));
        }
    }

    /* JADX INFO: compiled from: OtaTrackFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.main.ota.OtaTrackFragment();
        }
    }
}
