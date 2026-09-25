package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class WearMapView extends android.view.ViewGroup implements android.view.View.OnApplyWindowInsetsListener {
    public static final int BT_INVIEW = 1;
    private static java.lang.String c;
    private static final android.util.SparseArray<java.lang.Integer> x;
    private float A;
    private com.baidu.mapsdkplatform.comapi.map.n B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    com.baidu.mapapi.map.WearMapView.ScreenShape a;
    private com.baidu.mapsdkplatform.comapi.map.l f;
    private com.baidu.mapapi.map.BaiduMap g;
    private android.widget.ImageView h;
    private android.graphics.Bitmap i;
    private com.baidu.mapsdkplatform.comapi.map.am j;
    private boolean k;
    private android.graphics.Point l;
    private android.graphics.Point m;
    public com.baidu.mapapi.map.WearMapView.AnimationTask mTask;
    public java.util.Timer mTimer;
    public com.baidu.mapapi.map.WearMapView.a mTimerHandler;
    private android.widget.RelativeLayout n;
    private com.baidu.mapapi.map.SwipeDismissView o;
    private android.widget.TextView p;
    private android.widget.TextView q;
    private android.widget.ImageView r;
    private boolean v;
    private android.content.Context w;
    private boolean y;
    private boolean z;
    private static final java.lang.String b = com.baidu.mapapi.map.MapView.class.getSimpleName();
    private static int d = 0;
    private static int e = 0;
    private static int s = 0;
    private static int t = 0;
    private static int u = 10;

    public class AnimationTask extends java.util.TimerTask {
        public AnimationTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            android.os.Message message = new android.os.Message();
            message.what = 1;
            com.baidu.mapapi.map.WearMapView.this.mTimerHandler.sendMessage(message);
        }
    }

    public interface OnDismissCallback {
        void onDismiss();

        void onNotify();
    }

    public enum ScreenShape {
        ROUND,
        RECTANGLE,
        UNDETECTED
    }

    private class a extends android.os.Handler {
        private final java.lang.ref.WeakReference<android.content.Context> b;

        public a(android.content.Context context) {
            this.b = new java.lang.ref.WeakReference<>(context);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (this.b.get() == null) {
                return;
            }
            super.handleMessage(message);
            if (message.what == 1 && com.baidu.mapapi.map.WearMapView.this.j != null) {
                com.baidu.mapapi.map.WearMapView.this.a(true);
            }
        }
    }

    static {
        android.util.SparseArray<java.lang.Integer> sparseArray = new android.util.SparseArray<>();
        x = sparseArray;
        sparseArray.append(3, 2000000);
        sparseArray.append(4, java.lang.Integer.valueOf(kotlin.time.DurationKt.NANOS_IN_MILLIS));
        sparseArray.append(5, 500000);
        sparseArray.append(6, 200000);
        sparseArray.append(7, 100000);
        sparseArray.append(8, java.lang.Integer.valueOf(net.sqlcipher.database.SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH));
        sparseArray.append(9, 25000);
        sparseArray.append(10, 20000);
        sparseArray.append(11, 10000);
        sparseArray.append(12, 5000);
        sparseArray.append(13, 2000);
        sparseArray.append(14, 1000);
        sparseArray.append(15, java.lang.Integer.valueOf(com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL));
        sparseArray.append(16, 200);
        sparseArray.append(17, 100);
        sparseArray.append(18, 50);
        sparseArray.append(19, 20);
        sparseArray.append(20, 10);
        sparseArray.append(21, 5);
        sparseArray.append(22, 2);
    }

    public WearMapView(android.content.Context context) {
        super(context);
        this.k = true;
        this.v = true;
        this.a = com.baidu.mapapi.map.WearMapView.ScreenShape.ROUND;
        this.y = true;
        this.z = true;
        a(context, (com.baidu.mapapi.map.BaiduMapOptions) null);
    }

    public WearMapView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = true;
        this.v = true;
        this.a = com.baidu.mapapi.map.WearMapView.ScreenShape.ROUND;
        this.y = true;
        this.z = true;
        a(context, (com.baidu.mapapi.map.BaiduMapOptions) null);
    }

    public WearMapView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = true;
        this.v = true;
        this.a = com.baidu.mapapi.map.WearMapView.ScreenShape.ROUND;
        this.y = true;
        this.z = true;
        a(context, (com.baidu.mapapi.map.BaiduMapOptions) null);
    }

    public WearMapView(android.content.Context context, com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions) {
        super(context);
        this.k = true;
        this.v = true;
        this.a = com.baidu.mapapi.map.WearMapView.ScreenShape.ROUND;
        this.y = true;
        this.z = true;
        a(context, baiduMapOptions);
    }

    private int a(int i, int i2) {
        return i - ((int) java.lang.Math.sqrt(java.lang.Math.pow(i, 2.0d) - java.lang.Math.pow(i2, 2.0d)));
    }

    private void a(int i) {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.f;
        if (lVar == null) {
            return;
        }
        if (i == 0) {
            lVar.onPause();
            b();
        } else {
            if (i != 1) {
                return;
            }
            lVar.onResume();
            c();
        }
    }

    private static void a(android.content.Context context) {
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        s = point.x;
        t = point.y;
    }

    private void a(android.content.Context context, com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions) {
        com.baidu.mapapi.map.WearMapView.AnimationTask animationTask;
        a(context);
        setOnApplyWindowInsetsListener(this);
        this.w = context;
        this.mTimerHandler = new com.baidu.mapapi.map.WearMapView.a(context);
        java.util.Timer timer = new java.util.Timer();
        this.mTimer = timer;
        if (timer != null && (animationTask = this.mTask) != null) {
            animationTask.cancel();
        }
        com.baidu.mapapi.map.WearMapView.AnimationTask animationTask2 = new com.baidu.mapapi.map.WearMapView.AnimationTask();
        this.mTask = animationTask2;
        this.mTimer.schedule(animationTask2, 5000L);
        com.baidu.mapsdkplatform.comapi.map.k.a();
        com.baidu.mapapi.BMapManager.init();
        a(context, baiduMapOptions, c);
        this.g = new com.baidu.mapapi.map.BaiduMap(this.f);
        this.f.a().u(false);
        this.f.a().t(false);
        c(context);
        d(context);
        b(context);
        if (baiduMapOptions != null && !baiduMapOptions.h) {
            this.j.setVisibility(4);
        }
        e(context);
        if (baiduMapOptions != null && !baiduMapOptions.i) {
            this.n.setVisibility(4);
        }
        if (baiduMapOptions != null && baiduMapOptions.l != null) {
            this.m = baiduMapOptions.l;
        }
        if (baiduMapOptions == null || baiduMapOptions.k == null) {
            return;
        }
        this.l = baiduMapOptions.k;
    }

    private void a(android.content.Context context, com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions, java.lang.String str) {
        if (baiduMapOptions == null) {
            this.f = new com.baidu.mapsdkplatform.comapi.map.l(context, null, str, e);
        } else {
            this.f = new com.baidu.mapsdkplatform.comapi.map.l(context, baiduMapOptions.a(), str, e);
        }
        addView(this.f);
        this.B = new com.baidu.mapapi.map.aa(this);
        this.f.a().a(this.B);
    }

    private void a(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        int i = layoutParams.width;
        int iMakeMeasureSpec = i > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = layoutParams.height;
        view.measure(iMakeMeasureSpec, i2 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    private void a(android.view.View view, boolean z) {
        android.animation.AnimatorSet animatorSet;
        if (z) {
            animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(view, "TranslationY", 0.0f, -50.0f), android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f));
            animatorSet.addListener(new com.baidu.mapapi.map.ad(this, view));
        } else {
            view.setVisibility(0);
            animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(android.animation.ObjectAnimator.ofFloat(view, "TranslationY", -50.0f, 0.0f), android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f));
        }
        animatorSet.setDuration(1200L);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, int i) {
        if (this.f == null) {
            return;
        }
        if (i != 0 && 1 != i) {
            throw new java.lang.RuntimeException("BDMapSDKException: loadCustomStyleFileMode is illegal. Only support 0-local, 1-server");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.RuntimeException("BDMapSDKException: customMapStyleFilePath String is illegal");
        }
        if (!new java.io.File(str).exists()) {
            throw new java.lang.RuntimeException("BDMapSDKException: please check whether the customMapStylePath file exits");
        }
        this.f.a().a(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.k) {
            a(this.j, z);
        }
    }

    private void b() {
        if (this.f == null || this.v) {
            return;
        }
        d();
        this.v = true;
    }

    private void b(android.content.Context context) {
        this.o = new com.baidu.mapapi.map.SwipeDismissView(context, this);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams((int) ((context.getResources().getDisplayMetrics().density * 34.0f) + 0.5f), t);
        this.o.setBackgroundColor(android.graphics.Color.argb(0, 0, 0, 0));
        this.o.setLayoutParams(layoutParams);
        addView(this.o);
    }

    private void c() {
        if (this.f != null && this.v) {
            e();
            this.v = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    private void c(android.content.Context context) {
        android.graphics.Matrix matrix;
        float f;
        int densityDpi = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
        android.graphics.Bitmap bitmapA = com.baidu.mapsdkplatform.comapi.commonutils.a.a(densityDpi < 180 ? "logo_l.png" : "logo_h.png", context);
        if (densityDpi <= 480) {
            if (densityDpi <= 320 || densityDpi > 480) {
                this.i = bitmapA;
            } else {
                matrix = new android.graphics.Matrix();
                f = 1.5f;
            }
            if (this.i != null) {
                android.widget.ImageView imageView = new android.widget.ImageView(context);
                this.h = imageView;
                imageView.setImageBitmap(this.i);
                addView(this.h);
            }
        }
        matrix = new android.graphics.Matrix();
        f = 2.0f;
        matrix.postScale(f, f);
        this.i = android.graphics.Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
        if (this.i != null) {
            android.widget.ImageView imageView2 = new android.widget.ImageView(context);
            this.h = imageView2;
            imageView2.setImageBitmap(this.i);
            addView(this.h);
        }
    }

    private void d() {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.f;
        if (lVar == null) {
            return;
        }
        lVar.b();
    }

    private void d(android.content.Context context) {
        com.baidu.mapsdkplatform.comapi.map.am amVar = new com.baidu.mapsdkplatform.comapi.map.am(context, true);
        this.j = amVar;
        if (amVar.a()) {
            this.j.b(new com.baidu.mapapi.map.ab(this));
            this.j.a(new com.baidu.mapapi.map.ac(this));
            addView(this.j);
        }
    }

    private void e() {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.f;
        if (lVar == null) {
            return;
        }
        lVar.c();
    }

    private void e(android.content.Context context) {
        this.n = new android.widget.RelativeLayout(context);
        this.n.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        this.p = new android.widget.TextView(context);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        this.p.setTextColor(android.graphics.Color.parseColor("#FFFFFF"));
        this.p.setTextSize(2, 11.0f);
        android.widget.TextView textView = this.p;
        textView.setTypeface(textView.getTypeface(), 1);
        this.p.setLayoutParams(layoutParams);
        this.p.setId(Integer.MAX_VALUE);
        this.n.addView(this.p);
        this.q = new android.widget.TextView(context);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.addRule(14);
        this.q.setTextColor(android.graphics.Color.parseColor("#000000"));
        this.q.setTextSize(2, 11.0f);
        this.q.setLayoutParams(layoutParams2);
        this.n.addView(this.q);
        this.r = new android.widget.ImageView(context);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, this.p.getId());
        this.r.setLayoutParams(layoutParams3);
        android.graphics.Bitmap bitmapA = com.baidu.mapsdkplatform.comapi.commonutils.a.a("icon_scale.9.png", context);
        byte[] ninePatchChunk = bitmapA.getNinePatchChunk();
        android.graphics.NinePatch.isNinePatchChunk(ninePatchChunk);
        this.r.setBackgroundDrawable(new android.graphics.drawable.NinePatchDrawable(bitmapA, ninePatchChunk, new android.graphics.Rect(), null));
        this.n.addView(this.r);
        addView(this.n);
    }

    @java.lang.Deprecated
    public static void setCustomMapStylePath(java.lang.String str) {
        if (str == null || str.length() == 0) {
            throw new java.lang.RuntimeException("BDMapSDKException: customMapStylePath String is illegal");
        }
        if (!new java.io.File(str).exists()) {
            throw new java.lang.RuntimeException("BDMapSDKException: please check whether the customMapStylePath file exits");
        }
        c = str;
    }

    @java.lang.Deprecated
    public static void setIconCustom(int i) {
        e = i;
    }

    @java.lang.Deprecated
    public static void setLoadCustomMapStyleFileMode(int i) {
        d = i;
    }

    @java.lang.Deprecated
    public static void setMapCustomEnable(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.k.a(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof com.baidu.mapapi.map.MapViewLayoutParams) {
            super.addView(view, layoutParams);
        }
    }

    public final com.baidu.mapapi.map.BaiduMap getMap() {
        this.g.c = this;
        return this.g;
    }

    public final int getMapLevel() {
        return x.get((int) this.f.a().E().a).intValue();
    }

    public int getScaleControlViewHeight() {
        return this.G;
    }

    public int getScaleControlViewWidth() {
        return this.H;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        this.a = windowInsets.isRound() ? com.baidu.mapapi.map.WearMapView.ScreenShape.ROUND : com.baidu.mapapi.map.WearMapView.ScreenShape.RECTANGLE;
        return windowInsets;
    }

    public void onCreate(android.content.Context context, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        com.baidu.mapapi.map.MapStatus mapStatus = (com.baidu.mapapi.map.MapStatus) bundle.getParcelable("mapstatus");
        if (this.l != null) {
            this.l = (android.graphics.Point) bundle.getParcelable("scalePosition");
        }
        if (this.m != null) {
            this.m = (android.graphics.Point) bundle.getParcelable("zoomPosition");
        }
        this.y = bundle.getBoolean("mZoomControlEnabled");
        this.z = bundle.getBoolean("mScaleControlEnabled");
        setPadding(bundle.getInt("paddingLeft"), bundle.getInt("paddingTop"), bundle.getInt("paddingRight"), bundle.getInt("paddingBottom"));
        a(context, new com.baidu.mapapi.map.BaiduMapOptions().mapStatus(mapStatus));
    }

    public final void onDestroy() {
        android.content.Context context = this.w;
        if (context != null) {
            this.f.b(context.hashCode());
        }
        android.graphics.Bitmap bitmap = this.i;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.i.recycle();
            this.i = null;
        }
        this.j.b();
        com.baidu.mapapi.BMapManager.destroy();
        com.baidu.mapsdkplatform.comapi.map.k.b();
        com.baidu.mapapi.map.WearMapView.AnimationTask animationTask = this.mTask;
        if (animationTask != null) {
            animationTask.cancel();
        }
        this.w = null;
    }

    public final void onDismiss() {
        removeAllViews();
    }

    public final void onEnterAmbient(android.os.Bundle bundle) {
        a(0);
    }

    public void onExitAmbient() {
        a(1);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.baidu.mapapi.map.WearMapView.AnimationTask animationTask;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                java.util.Timer timer = new java.util.Timer();
                this.mTimer = timer;
                if (timer != null && (animationTask = this.mTask) != null) {
                    animationTask.cancel();
                }
                com.baidu.mapapi.map.WearMapView.AnimationTask animationTask2 = new com.baidu.mapapi.map.WearMapView.AnimationTask();
                this.mTask = animationTask2;
                this.mTimer.schedule(animationTask2, 5000L);
            }
        } else if (this.j.getVisibility() == 0) {
            java.util.Timer timer2 = this.mTimer;
            if (timer2 != null) {
                if (this.mTask != null) {
                    timer2.cancel();
                    this.mTask.cancel();
                }
                this.mTimer = null;
                this.mTask = null;
            }
        } else if (this.j.getVisibility() == 4) {
            if (this.mTimer != null) {
                com.baidu.mapapi.map.WearMapView.AnimationTask animationTask3 = this.mTask;
                if (animationTask3 != null) {
                    animationTask3.cancel();
                }
                this.mTimer.cancel();
                this.mTask = null;
                this.mTimer = null;
            }
            a(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int childCount = getChildCount();
        a(this.h);
        float height = 1.0f;
        if (((getWidth() - this.C) - this.D) - this.h.getMeasuredWidth() <= 0 || ((getHeight() - this.E) - this.F) - this.h.getMeasuredHeight() <= 0) {
            this.C = 0;
            this.D = 0;
            this.F = 0;
            this.E = 0;
            f = 1.0f;
        } else {
            float width = ((getWidth() - this.C) - this.D) / getWidth();
            height = ((getHeight() - this.E) - this.F) / getHeight();
            f = width;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            com.baidu.mapsdkplatform.comapi.map.l lVar = this.f;
            if (childAt == lVar) {
                lVar.layout(0, 0, getWidth(), getHeight());
            } else if (childAt == this.h) {
                int i6 = (int) (this.F + (12.0f * height));
                if (this.a == com.baidu.mapapi.map.WearMapView.ScreenShape.ROUND) {
                    a(this.j);
                    int i7 = s / 2;
                    iA3 = a(i7, this.j.getMeasuredWidth() / 2);
                    iA4 = ((s / 2) - a(i7, i7 - iA3)) + u;
                } else {
                    iA3 = 0;
                    iA4 = 0;
                }
                int i8 = (t - iA3) - i6;
                int measuredHeight = i8 - this.h.getMeasuredHeight();
                int i9 = s - iA4;
                this.h.layout(i9 - this.h.getMeasuredWidth(), measuredHeight, i9, i8);
            } else {
                com.baidu.mapsdkplatform.comapi.map.am amVar = this.j;
                if (childAt == amVar) {
                    if (amVar.a()) {
                        a(this.j);
                        android.graphics.Point point = this.m;
                        if (point == null) {
                            int iA5 = (int) ((12.0f * height) + this.E + (this.a == com.baidu.mapapi.map.WearMapView.ScreenShape.ROUND ? a(t / 2, this.j.getMeasuredWidth() / 2) : 0));
                            int measuredWidth = (s - this.j.getMeasuredWidth()) / 2;
                            this.j.layout(measuredWidth, iA5, this.j.getMeasuredWidth() + measuredWidth, this.j.getMeasuredHeight() + iA5);
                        } else {
                            this.j.layout(point.x, this.m.y, this.m.x + this.j.getMeasuredWidth(), this.m.y + this.j.getMeasuredHeight());
                        }
                    }
                } else if (childAt == this.n) {
                    if (this.a == com.baidu.mapapi.map.WearMapView.ScreenShape.ROUND) {
                        a(this.j);
                        int i10 = s / 2;
                        iA = a(i10, this.j.getMeasuredWidth() / 2);
                        iA2 = ((s / 2) - a(i10, i10 - iA)) + u;
                    } else {
                        iA = 0;
                        iA2 = 0;
                    }
                    a(this.n);
                    android.graphics.Point point2 = this.l;
                    if (point2 == null) {
                        int i11 = (int) (this.F + (12.0f * height));
                        this.H = this.n.getMeasuredWidth();
                        this.G = this.n.getMeasuredHeight();
                        int i12 = (int) (this.C + (5.0f * f) + iA2);
                        int i13 = (t - i11) - iA;
                        this.n.layout(i12, i13 - this.n.getMeasuredHeight(), this.H + i12, i13);
                    } else {
                        this.n.layout(point2.x, this.l.y, this.l.x + this.n.getMeasuredWidth(), this.l.y + this.n.getMeasuredHeight());
                    }
                } else {
                    com.baidu.mapapi.map.SwipeDismissView swipeDismissView = this.o;
                    if (childAt == swipeDismissView) {
                        a(swipeDismissView);
                        this.o.layout(0, 0, this.o.getMeasuredWidth(), t);
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        if (layoutParams instanceof com.baidu.mapapi.map.MapViewLayoutParams) {
                            com.baidu.mapapi.map.MapViewLayoutParams mapViewLayoutParams = (com.baidu.mapapi.map.MapViewLayoutParams) layoutParams;
                            android.graphics.Point pointA = mapViewLayoutParams.c == com.baidu.mapapi.map.MapViewLayoutParams.ELayoutMode.absoluteMode ? mapViewLayoutParams.b : this.f.a().a(com.baidu.mapapi.model.CoordUtil.ll2mc(mapViewLayoutParams.a));
                            a(childAt);
                            int measuredWidth2 = childAt.getMeasuredWidth();
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            float f2 = mapViewLayoutParams.d;
                            float f3 = mapViewLayoutParams.e;
                            int i14 = (int) (pointA.x - (f2 * measuredWidth2));
                            int i15 = ((int) (pointA.y - (f3 * measuredHeight2))) + mapViewLayoutParams.f;
                            childAt.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
                        }
                    }
                }
            }
        }
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.baidu.mapapi.map.BaiduMap baiduMap;
        if (bundle == null || (baiduMap = this.g) == null) {
            return;
        }
        bundle.putParcelable("mapstatus", baiduMap.getMapStatus());
        android.graphics.Point point = this.l;
        if (point != null) {
            bundle.putParcelable("scalePosition", point);
        }
        android.graphics.Point point2 = this.m;
        if (point2 != null) {
            bundle.putParcelable("zoomPosition", point2);
        }
        bundle.putBoolean("mZoomControlEnabled", this.y);
        bundle.putBoolean("mScaleControlEnabled", this.z);
        bundle.putInt("paddingLeft", this.C);
        bundle.putInt("paddingTop", this.E);
        bundle.putInt("paddingRight", this.D);
        bundle.putInt("paddingBottom", this.F);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        if (view == this.h) {
            return;
        }
        super.removeView(view);
    }

    public void setCustomStyleFilePathAndMode(java.lang.String str, int i) {
        a(str, i);
    }

    public void setMapCustomStyle(com.baidu.mapapi.map.MapCustomStyleOptions mapCustomStyleOptions, com.baidu.mapapi.map.MapView.CustomMapStyleCallBack customMapStyleCallBack) {
        if (mapCustomStyleOptions == null) {
            return;
        }
        java.lang.String customMapStyleId = mapCustomStyleOptions.getCustomMapStyleId();
        if (customMapStyleId != null && !customMapStyleId.isEmpty()) {
            com.baidu.mapsdkplatform.comapi.map.h.a().a(this.w, customMapStyleId, new com.baidu.mapapi.map.z(this, customMapStyleCallBack, mapCustomStyleOptions));
            return;
        }
        java.lang.String localCustomStyleFilePath = mapCustomStyleOptions.getLocalCustomStyleFilePath();
        if (localCustomStyleFilePath == null || localCustomStyleFilePath.isEmpty()) {
            return;
        }
        a(localCustomStyleFilePath, 0);
    }

    public void setMapCustomStyleEnable(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.f;
        if (lVar == null) {
            return;
        }
        lVar.a().n(z);
    }

    public void setMapCustomStylePath(java.lang.String str) {
        a(str, 0);
    }

    public void setOnDismissCallbackListener(com.baidu.mapapi.map.WearMapView.OnDismissCallback onDismissCallback) {
        com.baidu.mapapi.map.SwipeDismissView swipeDismissView = this.o;
        if (swipeDismissView == null) {
            return;
        }
        swipeDismissView.setCallback(onDismissCallback);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.C = i;
        this.E = i2;
        this.D = i3;
        this.F = i4;
    }

    public void setScaleControlPosition(android.graphics.Point point) {
        if (point != null && point.x >= 0 && point.y >= 0 && point.x <= getWidth() && point.y <= getHeight()) {
            this.l = point;
            requestLayout();
        }
    }

    public void setShape(com.baidu.mapapi.map.WearMapView.ScreenShape screenShape) {
        this.a = screenShape;
    }

    public void setViewAnimitionEnable(boolean z) {
        this.k = z;
    }

    public void setZoomControlsPosition(android.graphics.Point point) {
        if (point != null && point.x >= 0 && point.y >= 0 && point.x <= getWidth() && point.y <= getHeight()) {
            this.m = point;
            requestLayout();
        }
    }

    public void showScaleControl(boolean z) {
        this.n.setVisibility(z ? 0 : 8);
        this.z = z;
    }

    public void showZoomControls(boolean z) {
        if (this.j.a()) {
            this.j.setVisibility(z ? 0 : 8);
            this.y = z;
        }
    }
}
