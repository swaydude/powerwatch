package powerwatch.matrix.com.pwgen2android.pair.ui.gen2;

/* JADX INFO: compiled from: QRPairingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001,B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0003H\u0014J\b\u0010\u001c\u001a\u00020\u001aH\u0014J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\u0012\u0010&\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u0018H\u0016J\b\u0010*\u001a\u00020\u0018H\u0003J\b\u0010+\u001a\u00020\u0018H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006-"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentScanBinding;", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;", "Lpowerwatch/matrix/com/pwgen2android/pair/camera/Listen;", "()V", "cPreview", "Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;", "cameraStopThread", "Ljava/lang/Thread;", "circleOverlayView", "Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;", "mCameraSource", "Lcom/google/android/gms/vision/CameraSource;", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "scanFinished", "Ljava/util/concurrent/atomic/AtomicBoolean;", "scanViewModel", "getScanViewModel", "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;", "scanViewModel$delegate", "Lkotlin/Lazy;", "createCameraSource", "", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResult", "barcode", "Lcom/google/android/gms/vision/barcode/Barcode;", "onResume", "requestCameraPermission", "startCameraSource", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class QRPairingFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentScanBinding, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel> implements powerwatch.matrix.com.pwgen2android.pair.camera.Listen {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment.Companion(null);
    private powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview cPreview;
    private java.lang.Thread cameraStopThread;
    private powerwatch.matrix.com.pwgen2android.pair.camera.OverlayView circleOverlayView;
    private com.google.android.gms.vision.CameraSource mCameraSource;
    private com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;
    private final java.util.concurrent.atomic.AtomicBoolean scanFinished = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: scanViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy scanViewModel;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment newInstance() {
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_scan;
    }

    public QRPairingFragment() {
        final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment qRPairingFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment$scanViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                java.lang.Object[] objArr = new java.lang.Object[1];
                androidx.fragment.app.FragmentActivity activity = this.this$0.getActivity();
                objArr[0] = activity == null ? null : activity.getSupportFragmentManager();
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(objArr);
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.scanViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(qRPairingFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel getScanViewModel() {
        return (powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel) this.scanViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel getViewModel() {
        return getScanViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        android.widget.TextView textView = (android.widget.TextView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.screen_title);
        if (textView != null) {
            textView.setText(getString(powerwatch.matrix.com.pwgen2android.R.string.scan_title));
        }
        if (textView != null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            textView.setTextColor(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.black));
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.LoginToolbar loginToolbar = (powerwatch.matrix.com.pwgen2android.shared.ui.LoginToolbar) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.login_toolbar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(loginToolbar, "loginToolbar");
        powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.removeBackground(loginToolbar);
        ((android.widget.Button) loginToolbar.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button)).setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$QRPairingFragment$DzTVneI3fXuN56lSyFk9z1xcxYg
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment.m2090onCreateView$lambda0(this.f$0, view);
            }
        });
        this.rxPermissions = new com.tbruyelle.rxpermissions2.RxPermissions(this);
        this.cPreview = (powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.camera_preview);
        this.circleOverlayView = (powerwatch.matrix.com.pwgen2android.pair.camera.OverlayView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.cicleOverlay);
        com.tbruyelle.rxpermissions2.RxPermissions rxPermissions = this.rxPermissions;
        if (rxPermissions == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rxPermissions");
            throw null;
        }
        if (!rxPermissions.isRevoked("android.permission.CAMERA")) {
            createCameraSource();
        }
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2090onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getScanViewModel().onBackClicked();
    }

    private final void requestCameraPermission() {
        com.tbruyelle.rxpermissions2.RxPermissions rxPermissions = this.rxPermissions;
        if (rxPermissions == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rxPermissions");
            throw null;
        }
        rxPermissions.request("android.permission.CAMERA").subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$QRPairingFragment$vXpGPXE08EL4yCfWvMZ9qvCC31k
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment.m2091requestCameraPermission$lambda1(this.f$0, (java.lang.Boolean) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$QRPairingFragment$rpx5Kumz4CXIURmFlKs0KlsKdVs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: requestCameraPermission$lambda-1, reason: not valid java name */
    public static final void m2091requestCameraPermission$lambda1(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment this$0, java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            this$0.createCameraSource();
        }
    }

    private final void createCameraSource() {
        this.cameraStopThread = new java.lang.Thread(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.gen2.-$$Lambda$QRPairingFragment$zoWSyczAmLjf3p1E497mTT_tly8
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment.m2089createCameraSource$lambda3(this.f$0);
            }
        });
        android.content.Context context = getContext();
        com.google.android.gms.vision.barcode.BarcodeDetector barcodeDetectorBuild = new com.google.android.gms.vision.barcode.BarcodeDetector.Builder(context == null ? null : context.getApplicationContext()).build();
        barcodeDetectorBuild.setProcessor(new com.google.android.gms.vision.MultiProcessor.Builder(new powerwatch.matrix.com.pwgen2android.pair.camera.BarcodeTrackerFactory(this)).build());
        android.content.Context context2 = getContext();
        this.mCameraSource = new com.google.android.gms.vision.CameraSource.Builder(context2 != null ? context2.getApplicationContext() : null, barcodeDetectorBuild).setFacing(0).setAutoFocusEnabled(true).setRequestedFps(15.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createCameraSource$lambda-3, reason: not valid java name */
    public static final void m2089createCameraSource$lambda3(powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview cameraPreview = this$0.cPreview;
        if (cameraPreview != null) {
            cameraPreview.stop();
        }
        powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview cameraPreview2 = this$0.cPreview;
        if (cameraPreview2 == null) {
            return;
        }
        cameraPreview2.release();
    }

    @Override // powerwatch.matrix.com.pwgen2android.pair.camera.Listen
    public void onResult(com.google.android.gms.vision.barcode.Barcode barcode) {
        android.graphics.Rect boundingBox;
        java.lang.Integer numValueOf = (barcode == null || (boundingBox = barcode.getBoundingBox()) == null) ? null : java.lang.Integer.valueOf(boundingBox.left);
        kotlin.jvm.internal.Intrinsics.checkNotNull(numValueOf);
        android.graphics.RectF rectF = new android.graphics.RectF(numValueOf.intValue(), barcode.getBoundingBox().top, barcode.getBoundingBox().right, barcode.getBoundingBox().bottom);
        powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview cameraPreview = this.cPreview;
        java.lang.Float fValueOf = cameraPreview == null ? null : java.lang.Float.valueOf(cameraPreview.translateY(rectF.top));
        kotlin.jvm.internal.Intrinsics.checkNotNull(fValueOf);
        rectF.top = fValueOf.floatValue();
        powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview cameraPreview2 = this.cPreview;
        java.lang.Float fValueOf2 = cameraPreview2 == null ? null : java.lang.Float.valueOf(cameraPreview2.translateX(rectF.left));
        kotlin.jvm.internal.Intrinsics.checkNotNull(fValueOf2);
        rectF.left = fValueOf2.floatValue();
        powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview cameraPreview3 = this.cPreview;
        java.lang.Float fValueOf3 = cameraPreview3 == null ? null : java.lang.Float.valueOf(cameraPreview3.translateX(rectF.right));
        kotlin.jvm.internal.Intrinsics.checkNotNull(fValueOf3);
        rectF.right = fValueOf3.floatValue();
        powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview cameraPreview4 = this.cPreview;
        java.lang.Float fValueOf4 = cameraPreview4 == null ? null : java.lang.Float.valueOf(cameraPreview4.translateY(rectF.bottom));
        kotlin.jvm.internal.Intrinsics.checkNotNull(fValueOf4);
        rectF.bottom = fValueOf4.floatValue();
        powerwatch.matrix.com.pwgen2android.pair.camera.OverlayView overlayView = this.circleOverlayView;
        java.lang.Boolean boolValueOf = overlayView == null ? null : java.lang.Boolean.valueOf(overlayView.shouldDecode(new android.graphics.Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom)));
        kotlin.jvm.internal.Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            android.util.Log.d("rect_issue", barcode.rawValue);
            if (this.scanFinished.getAndSet(true)) {
                return;
            }
            java.lang.Thread thread = this.cameraStopThread;
            if (thread == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("cameraStopThread");
                throw null;
            }
            thread.start();
            powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingViewModel scanViewModel = getScanViewModel();
            java.lang.String str = barcode.rawValue;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "barcode.rawValue");
            scanViewModel.onQRCodeResolved(str);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.scanFinished.set(false);
        startCameraSource();
    }

    private final void startCameraSource() {
        com.google.android.gms.vision.CameraSource cameraSource = this.mCameraSource;
        if (cameraSource != null) {
            try {
                powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview cameraPreview = this.cPreview;
                if (cameraPreview == null) {
                    return;
                }
                cameraPreview.start(cameraSource);
            } catch (java.io.IOException e) {
                android.util.Log.e("error_camera", "Unable to start camera source.", e);
                com.google.android.gms.vision.CameraSource cameraSource2 = this.mCameraSource;
                if (cameraSource2 != null) {
                    cameraSource2.release();
                }
                this.mCameraSource = null;
            }
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview cameraPreview = this.cPreview;
        if (cameraPreview == null) {
            return;
        }
        cameraPreview.stop();
    }

    /* JADX INFO: compiled from: QRPairingFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.pair.ui.gen2.QRPairingFragment();
        }
    }
}
