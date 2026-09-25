package powerwatch.matrix.com.pwgen2android.pair.camera;

/* JADX INFO: compiled from: CameraPreview.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u00018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010#\u001a\u00020\u001f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u001fH\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0014J\u0018\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0014J\u0006\u0010-\u001a\u00020%J\u0018\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0002J\u0010\u00101\u001a\u00020%2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u00102\u001a\u00020%H\u0003J\u0006\u00103\u001a\u00020%J\u000e\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u0016J\u000e\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;", "Landroid/view/SurfaceView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cameraSource", "Lcom/google/android/gms/vision/CameraSource;", "getCameraSource", "()Lcom/google/android/gms/vision/CameraSource;", "setCameraSource", "(Lcom/google/android/gms/vision/CameraSource;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "mHeight", "", "mHeightScaleFactor", "mHolder", "Landroid/view/SurfaceHolder;", "mLock", "", "mPreviewHeight", "mPreviewWidth", "mStartRequested", "", "mSurfaceAvailable", "mWidth", "mWidthScaleFactor", "checkCameraHardware", "init", "", "isPortraitMode", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "release", "setupScales", io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, "start", "startIfReady", "stop", "translateX", "x", "translateY", "y", "SurfaceCallback", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CameraPreview extends android.view.SurfaceView {
    private com.google.android.gms.vision.CameraSource cameraSource;
    public android.content.Context mContext;
    private float mHeight;
    private float mHeightScaleFactor;
    private android.view.SurfaceHolder mHolder;
    private final java.lang.Object mLock;
    private int mPreviewHeight;
    private int mPreviewWidth;
    private boolean mStartRequested;
    private boolean mSurfaceAvailable;
    private float mWidth;
    private float mWidthScaleFactor;

    public void _$_clearFindViewByIdCache() {
    }

    public final com.google.android.gms.vision.CameraSource getCameraSource() {
        return this.cameraSource;
    }

    public final void setCameraSource(com.google.android.gms.vision.CameraSource cameraSource) {
        this.cameraSource = cameraSource;
    }

    public final android.content.Context getMContext() {
        android.content.Context context = this.mContext;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mContext");
        throw null;
    }

    public final void setMContext(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        synchronized (this.mLock) {
            if (this.mPreviewWidth != 0 && this.mPreviewHeight != 0) {
                this.mWidthScaleFactor = canvas.getWidth() / this.mPreviewWidth;
                this.mHeightScaleFactor = canvas.getHeight() / this.mPreviewHeight;
                android.util.Log.d("rect_issue", "Scales - X: " + this.mWidthScaleFactor + ", Y: " + this.mHeightScaleFactor);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void setupScales(int width, int height) {
        int i;
        int i2 = this.mPreviewWidth;
        if (i2 == 0 || (i = this.mPreviewHeight) == 0) {
            return;
        }
        this.mWidthScaleFactor = width / i2;
        this.mHeightScaleFactor = height / i;
        android.util.Log.d("rect_issue", "Scales - X: " + this.mWidthScaleFactor + ", Y: " + this.mHeightScaleFactor);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mWidth = getMeasuredWidth();
        this.mHeight = getMeasuredHeight();
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    public final float translateX(float x) {
        return x * this.mWidthScaleFactor;
    }

    public final float translateY(float y) {
        return y * this.mHeightScaleFactor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPreview(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.mWidthScaleFactor = 1.0f;
        this.mHeightScaleFactor = 1.0f;
        this.mLock = new java.lang.Object();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPreview(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mWidthScaleFactor = 1.0f;
        this.mHeightScaleFactor = 1.0f;
        this.mLock = new java.lang.Object();
        setMContext(context);
        init();
    }

    private final void init() {
        if (checkCameraHardware(getContext())) {
            this.mHolder = getHolder();
            getHolder().addCallback(new powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview.SurfaceCallback(this));
        } else {
            android.util.Log.e("camera_error", "Error: Camera not found");
        }
    }

    private final boolean checkCameraHardware(android.content.Context context) {
        android.content.pm.PackageManager packageManager;
        java.lang.Boolean boolValueOf = (context == null || (packageManager = context.getPackageManager()) == null) ? null : java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.camera"));
        kotlin.jvm.internal.Intrinsics.checkNotNull(boolValueOf);
        if (boolValueOf.booleanValue()) {
            return true;
        }
        android.content.pm.PackageManager packageManager2 = context.getPackageManager();
        java.lang.Boolean boolValueOf2 = packageManager2 == null ? null : java.lang.Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.camera.front"));
        kotlin.jvm.internal.Intrinsics.checkNotNull(boolValueOf2);
        if (boolValueOf2.booleanValue()) {
            return true;
        }
        android.content.pm.PackageManager packageManager3 = context.getPackageManager();
        java.lang.Boolean boolValueOf3 = packageManager3 != null ? java.lang.Boolean.valueOf(packageManager3.hasSystemFeature("android.hardware.camera.any")) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(boolValueOf3);
        return boolValueOf3.booleanValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPreview(android.content.Context context, android.util.AttributeSet attrs, int i) {
        super(context, attrs, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.mWidthScaleFactor = 1.0f;
        this.mHeightScaleFactor = 1.0f;
        this.mLock = new java.lang.Object();
    }

    public final void start(com.google.android.gms.vision.CameraSource cameraSource) throws java.io.IOException {
        if (cameraSource == null) {
            stop();
        }
        this.cameraSource = cameraSource;
        if (cameraSource != null) {
            this.mStartRequested = true;
            startIfReady();
        }
    }

    public final void stop() {
        com.google.android.gms.vision.CameraSource cameraSource = this.cameraSource;
        if (cameraSource == null || cameraSource == null) {
            return;
        }
        cameraSource.stop();
    }

    public final void release() {
        com.google.android.gms.vision.CameraSource cameraSource = this.cameraSource;
        if (cameraSource != null) {
            if (cameraSource != null) {
                cameraSource.release();
            }
            this.cameraSource = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startIfReady() throws java.io.IOException {
        if (this.mStartRequested && this.mSurfaceAvailable) {
            com.google.android.gms.vision.CameraSource cameraSource = this.cameraSource;
            if (cameraSource != null) {
                cameraSource.start(getHolder());
            }
            com.google.android.gms.vision.CameraSource cameraSource2 = this.cameraSource;
            com.google.android.gms.common.images.Size previewSize = cameraSource2 == null ? null : cameraSource2.getPreviewSize();
            kotlin.jvm.internal.Intrinsics.checkNotNull(previewSize);
            int iMin = java.lang.Math.min(previewSize.getWidth(), previewSize.getHeight());
            int iMax = java.lang.Math.max(previewSize.getWidth(), previewSize.getHeight());
            this.mPreviewWidth = iMin;
            this.mPreviewHeight = iMax;
            float f = this.mWidth;
            if (f > 0.0f) {
                float f2 = this.mHeight;
                if (f2 > 0.0f) {
                    setupScales((int) f, (int) f2);
                }
            }
            this.mStartRequested = false;
        }
    }

    /* JADX INFO: compiled from: CameraPreview.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview$SurfaceCallback;", "Landroid/view/SurfaceHolder$Callback;", "(Lpowerwatch/matrix/com/pwgen2android/pair/camera/CameraPreview;)V", "surfaceChanged", "", "holder", "Landroid/view/SurfaceHolder;", "format", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, "surfaceCreated", "surface", "surfaceDestroyed", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class SurfaceCallback implements android.view.SurfaceHolder.Callback {
        final /* synthetic */ powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview this$0;

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holder, "holder");
        }

        public SurfaceCallback(powerwatch.matrix.com.pwgen2android.pair.camera.CameraPreview this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder surface) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "surface");
            this.this$0.mSurfaceAvailable = true;
            try {
                this.this$0.startIfReady();
            } catch (java.io.IOException e) {
                android.util.Log.e("error_camera", "Could not start camera source.", e);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder surface) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "surface");
            this.this$0.mSurfaceAvailable = false;
        }
    }

    private final boolean isPortraitMode() {
        int i = getMContext().getResources().getConfiguration().orientation;
        if (i == 2) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        android.util.Log.d("error_camera", "isPortraitMode returning false by default");
        return false;
    }
}
