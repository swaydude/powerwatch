package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class TextureMapView extends android.view.ViewGroup {
    private static final java.lang.String a = "TextureMapView";
    private static java.lang.String i;
    private static int j;
    private static int k;
    private static final android.util.SparseArray<java.lang.Integer> q;
    private int A;
    private int B;
    private com.baidu.mapsdkplatform.comapi.map.ae b;
    private com.baidu.mapapi.map.BaiduMap c;
    private android.widget.ImageView d;
    private android.graphics.Bitmap e;
    private com.baidu.mapsdkplatform.comapi.map.am f;
    private android.graphics.Point g;
    private android.graphics.Point h;
    private android.widget.RelativeLayout l;
    private android.widget.TextView m;
    private android.widget.TextView n;
    private android.widget.ImageView o;
    private android.content.Context p;
    private float r;
    private com.baidu.mapsdkplatform.comapi.map.n s;
    private int t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    static {
        android.util.SparseArray<java.lang.Integer> sparseArray = new android.util.SparseArray<>();
        q = sparseArray;
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

    public TextureMapView(android.content.Context context) {
        super(context);
        this.t = com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom.ordinal();
        this.u = true;
        this.v = true;
        a(context, (com.baidu.mapapi.map.BaiduMapOptions) null);
    }

    public TextureMapView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom.ordinal();
        this.u = true;
        this.v = true;
        a(context, (com.baidu.mapapi.map.BaiduMapOptions) null);
    }

    public TextureMapView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.t = com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom.ordinal();
        this.u = true;
        this.v = true;
        a(context, (com.baidu.mapapi.map.BaiduMapOptions) null);
    }

    public TextureMapView(android.content.Context context, com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions) {
        super(context);
        this.t = com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom.ordinal();
        this.u = true;
        this.v = true;
        a(context, baiduMapOptions);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    private void a(android.content.Context context) {
        android.graphics.Matrix matrix;
        float f;
        int densityDpi = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
        android.graphics.Bitmap bitmapA = com.baidu.mapsdkplatform.comapi.commonutils.a.a(densityDpi < 180 ? "logo_l.png" : "logo_h.png", context);
        if (densityDpi <= 480) {
            if (densityDpi <= 320 || densityDpi > 480) {
                this.e = bitmapA;
            } else {
                matrix = new android.graphics.Matrix();
                f = 1.5f;
            }
            if (this.e != null) {
                android.widget.ImageView imageView = new android.widget.ImageView(context);
                this.d = imageView;
                imageView.setImageBitmap(this.e);
                addView(this.d);
            }
        }
        matrix = new android.graphics.Matrix();
        f = 2.0f;
        matrix.postScale(f, f);
        this.e = android.graphics.Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
        if (this.e != null) {
            android.widget.ImageView imageView2 = new android.widget.ImageView(context);
            this.d = imageView2;
            imageView2.setImageBitmap(this.e);
            addView(this.d);
        }
    }

    private void a(android.content.Context context, com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions) {
        setBackgroundColor(-1);
        this.p = context;
        com.baidu.mapsdkplatform.comapi.map.k.a();
        com.baidu.mapapi.BMapManager.init();
        a(context, baiduMapOptions, i, k);
        this.c = new com.baidu.mapapi.map.BaiduMap(this.b);
        a(context);
        b(context);
        if (baiduMapOptions != null && !baiduMapOptions.h) {
            this.f.setVisibility(4);
        }
        c(context);
        if (baiduMapOptions != null && !baiduMapOptions.i) {
            this.l.setVisibility(4);
        }
        if (baiduMapOptions != null && baiduMapOptions.j != null) {
            this.t = baiduMapOptions.j.ordinal();
        }
        if (baiduMapOptions != null && baiduMapOptions.l != null) {
            this.h = baiduMapOptions.l;
        }
        if (baiduMapOptions == null || baiduMapOptions.k == null) {
            return;
        }
        this.g = baiduMapOptions.k;
    }

    private void a(android.content.Context context, com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions, java.lang.String str, int i2) {
        if (baiduMapOptions == null) {
            this.b = new com.baidu.mapsdkplatform.comapi.map.ae(context, null, str, i2);
        } else {
            this.b = new com.baidu.mapsdkplatform.comapi.map.ae(context, baiduMapOptions.a(), str, i2);
        }
        addView(this.b);
        this.s = new com.baidu.mapapi.map.v(this);
        this.b.b().a(this.s);
    }

    private void a(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        int i2 = layoutParams.width;
        int iMakeMeasureSpec = i2 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i3 = layoutParams.height;
        view.measure(iMakeMeasureSpec, i3 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i3, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, int i2) {
        if (this.b == null) {
            return;
        }
        if (i2 != 0 && 1 != i2) {
            throw new java.lang.RuntimeException("BDMapSDKException: loadCustomStyleFileMode is illegal. Only support 0-local, 1-server");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.RuntimeException("BDMapSDKException: customMapStyleFilePath String is illegal");
        }
        if (!new java.io.File(str).exists()) {
            throw new java.lang.RuntimeException("BDMapSDKException: please check whether the customMapStylePath file exits");
        }
        this.b.b().a(str, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f.a()) {
            float f = this.b.b().E().a;
            this.f.b(f > this.b.b().b);
            this.f.a(f < this.b.b().a);
        }
    }

    private void b(android.content.Context context) {
        com.baidu.mapsdkplatform.comapi.map.am amVar = new com.baidu.mapsdkplatform.comapi.map.am(context);
        this.f = amVar;
        if (amVar.a()) {
            this.f.b(new com.baidu.mapapi.map.w(this));
            this.f.a(new com.baidu.mapapi.map.x(this));
            addView(this.f);
        }
    }

    private void c(android.content.Context context) {
        this.l = new android.widget.RelativeLayout(context);
        this.l.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        this.m = new android.widget.TextView(context);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        this.m.setTextColor(android.graphics.Color.parseColor("#FFFFFF"));
        this.m.setTextSize(2, 11.0f);
        android.widget.TextView textView = this.m;
        textView.setTypeface(textView.getTypeface(), 1);
        this.m.setLayoutParams(layoutParams);
        this.m.setId(Integer.MAX_VALUE);
        this.l.addView(this.m);
        this.n = new android.widget.TextView(context);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.addRule(14);
        this.n.setTextColor(android.graphics.Color.parseColor("#000000"));
        this.n.setTextSize(2, 11.0f);
        this.n.setLayoutParams(layoutParams2);
        this.l.addView(this.n);
        this.o = new android.widget.ImageView(context);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, this.m.getId());
        this.o.setLayoutParams(layoutParams3);
        android.graphics.Bitmap bitmapA = com.baidu.mapsdkplatform.comapi.commonutils.a.a("icon_scale.9.png", context);
        byte[] ninePatchChunk = bitmapA.getNinePatchChunk();
        android.graphics.NinePatch.isNinePatchChunk(ninePatchChunk);
        this.o.setBackgroundDrawable(new android.graphics.drawable.NinePatchDrawable(bitmapA, ninePatchChunk, new android.graphics.Rect(), null));
        this.l.addView(this.o);
        addView(this.l);
    }

    @java.lang.Deprecated
    public static void setCustomMapStylePath(java.lang.String str) {
        if (str == null || str.length() == 0) {
            throw new java.lang.RuntimeException("BDMapSDKException: customMapStylePath String is illegal");
        }
        if (!new java.io.File(str).exists()) {
            throw new java.lang.RuntimeException("BDMapSDKException: please check whether the customMapStylePath file exits");
        }
        i = str;
    }

    @java.lang.Deprecated
    public static void setIconCustom(int i2) {
        k = i2;
    }

    @java.lang.Deprecated
    public static void setLoadCustomMapStyleFileMode(int i2) {
        j = i2;
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

    public final com.baidu.mapapi.map.LogoPosition getLogoPosition() {
        int i2 = this.t;
        if (i2 == 1) {
            return com.baidu.mapapi.map.LogoPosition.logoPostionleftTop;
        }
        if (i2 == 2) {
            return com.baidu.mapapi.map.LogoPosition.logoPostionCenterBottom;
        }
        if (i2 == 3) {
            return com.baidu.mapapi.map.LogoPosition.logoPostionCenterTop;
        }
        if (i2 != 4) {
            return i2 != 5 ? com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom : com.baidu.mapapi.map.LogoPosition.logoPostionRightTop;
        }
        return com.baidu.mapapi.map.LogoPosition.logoPostionRightBottom;
    }

    public final com.baidu.mapapi.map.BaiduMap getMap() {
        this.c.b = this;
        return this.c;
    }

    public final int getMapLevel() {
        return q.get((int) this.b.b().E().a).intValue();
    }

    public int getScaleControlViewHeight() {
        return this.B;
    }

    public int getScaleControlViewWidth() {
        return this.B;
    }

    public void onCreate(android.content.Context context, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        com.baidu.mapapi.map.MapStatus mapStatus = (com.baidu.mapapi.map.MapStatus) bundle.getParcelable("mapstatus");
        if (this.g != null) {
            this.g = (android.graphics.Point) bundle.getParcelable("scalePosition");
        }
        if (this.h != null) {
            this.h = (android.graphics.Point) bundle.getParcelable("zoomPosition");
        }
        this.u = bundle.getBoolean("mZoomControlEnabled");
        this.v = bundle.getBoolean("mScaleControlEnabled");
        this.t = bundle.getInt("logoPosition");
        setPadding(bundle.getInt("paddingLeft"), bundle.getInt("paddingTop"), bundle.getInt("paddingRight"), bundle.getInt("paddingBottom"));
        a(context, new com.baidu.mapapi.map.BaiduMapOptions().mapStatus(mapStatus));
    }

    public final void onDestroy() {
        android.content.Context context = this.p;
        if (context != null) {
            this.b.a(context.hashCode());
        }
        android.graphics.Bitmap bitmap = this.e;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.e.recycle();
        }
        this.f.b();
        com.baidu.mapapi.BMapManager.destroy();
        com.baidu.mapsdkplatform.comapi.map.k.b();
        this.p = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        float height;
        int measuredHeight;
        int measuredWidth;
        int childCount = getChildCount();
        a(this.d);
        float width = 1.0f;
        if (((getWidth() - this.w) - this.x) - this.d.getMeasuredWidth() <= 0 || ((getHeight() - this.y) - this.z) - this.d.getMeasuredHeight() <= 0) {
            this.w = 0;
            this.x = 0;
            this.z = 0;
            this.y = 0;
            height = 1.0f;
        } else {
            width = ((getWidth() - this.w) - this.x) / getWidth();
            height = ((getHeight() - this.y) - this.z) / getHeight();
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            com.baidu.mapsdkplatform.comapi.map.ae aeVar = this.b;
            if (childAt == aeVar) {
                aeVar.layout(0, 0, getWidth(), getHeight());
            } else {
                android.widget.ImageView imageView = this.d;
                if (childAt == imageView) {
                    float f = width * 5.0f;
                    int width2 = (int) (this.w + f);
                    int i7 = (int) (this.x + f);
                    float f2 = 5.0f * height;
                    int measuredHeight2 = (int) (this.y + f2);
                    int i8 = (int) (this.z + f2);
                    int i9 = this.t;
                    if (i9 != 1) {
                        if (i9 == 2) {
                            measuredHeight = getHeight() - i8;
                            measuredHeight2 = measuredHeight - this.d.getMeasuredHeight();
                        } else if (i9 != 3) {
                            if (i9 == 4) {
                                measuredHeight = getHeight() - i8;
                                measuredHeight2 = measuredHeight - this.d.getMeasuredHeight();
                            } else if (i9 != 5) {
                                measuredHeight = getHeight() - i8;
                                measuredWidth = this.d.getMeasuredWidth() + width2;
                                measuredHeight2 = measuredHeight - this.d.getMeasuredHeight();
                            } else {
                                measuredHeight = measuredHeight2 + imageView.getMeasuredHeight();
                            }
                            measuredWidth = getWidth() - i7;
                            width2 = measuredWidth - this.d.getMeasuredWidth();
                        } else {
                            measuredHeight = measuredHeight2 + imageView.getMeasuredHeight();
                        }
                        width2 = (((getWidth() - this.d.getMeasuredWidth()) + this.w) - this.x) / 2;
                        measuredWidth = (((getWidth() + this.d.getMeasuredWidth()) + this.w) - this.x) / 2;
                    } else {
                        measuredHeight = imageView.getMeasuredHeight() + measuredHeight2;
                        measuredWidth = this.d.getMeasuredWidth() + width2;
                    }
                    this.d.layout(width2, measuredHeight2, measuredWidth, measuredHeight);
                } else {
                    com.baidu.mapsdkplatform.comapi.map.am amVar = this.f;
                    if (childAt != amVar) {
                        android.widget.RelativeLayout relativeLayout = this.l;
                        if (childAt == relativeLayout) {
                            a(relativeLayout);
                            android.graphics.Point point = this.g;
                            if (point == null) {
                                int i10 = (int) (this.z + (height * 5.0f) + 56.0f);
                                this.B = this.l.getMeasuredWidth();
                                this.A = this.l.getMeasuredHeight();
                                int i11 = (int) (this.w + (5.0f * width));
                                int height2 = (getHeight() - i10) - this.d.getMeasuredHeight();
                                this.l.layout(i11, height2, this.B + i11, this.A + height2);
                            } else {
                                this.l.layout(point.x, this.g.y, this.g.x + this.l.getMeasuredWidth(), this.g.y + this.l.getMeasuredHeight());
                            }
                        } else {
                            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            if (layoutParams instanceof com.baidu.mapapi.map.MapViewLayoutParams) {
                                com.baidu.mapapi.map.MapViewLayoutParams mapViewLayoutParams = (com.baidu.mapapi.map.MapViewLayoutParams) layoutParams;
                                android.graphics.Point pointA = mapViewLayoutParams.c == com.baidu.mapapi.map.MapViewLayoutParams.ELayoutMode.absoluteMode ? mapViewLayoutParams.b : this.b.b().a(com.baidu.mapapi.model.CoordUtil.ll2mc(mapViewLayoutParams.a));
                                a(childAt);
                                int measuredWidth2 = childAt.getMeasuredWidth();
                                int measuredHeight3 = childAt.getMeasuredHeight();
                                float f3 = mapViewLayoutParams.d;
                                float f4 = mapViewLayoutParams.e;
                                int i12 = (int) (pointA.x - (f3 * measuredWidth2));
                                int i13 = ((int) (pointA.y - (f4 * measuredHeight3))) + mapViewLayoutParams.f;
                                childAt.layout(i12, i13, measuredWidth2 + i12, measuredHeight3 + i13);
                            }
                        }
                    } else if (amVar.a()) {
                        a(this.f);
                        android.graphics.Point point2 = this.h;
                        if (point2 == null) {
                            int height3 = (int) (((getHeight() - 15) * height) + this.y);
                            int width3 = (int) (((getWidth() - 15) * width) + this.w);
                            int measuredWidth3 = width3 - this.f.getMeasuredWidth();
                            int measuredHeight4 = height3 - this.f.getMeasuredHeight();
                            if (this.t == 4) {
                                height3 -= this.d.getMeasuredHeight();
                                measuredHeight4 -= this.d.getMeasuredHeight();
                            }
                            this.f.layout(measuredWidth3, measuredHeight4, width3, height3);
                        } else {
                            this.f.layout(point2.x, this.h.y, this.h.x + this.f.getMeasuredWidth(), this.h.y + this.f.getMeasuredHeight());
                        }
                    }
                }
            }
        }
    }

    public final void onPause() {
        this.b.d();
    }

    public final void onResume() {
        this.b.c();
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.baidu.mapapi.map.BaiduMap baiduMap;
        if (bundle == null || (baiduMap = this.c) == null) {
            return;
        }
        bundle.putParcelable("mapstatus", baiduMap.getMapStatus());
        android.graphics.Point point = this.g;
        if (point != null) {
            bundle.putParcelable("scalePosition", point);
        }
        android.graphics.Point point2 = this.h;
        if (point2 != null) {
            bundle.putParcelable("zoomPosition", point2);
        }
        bundle.putBoolean("mZoomControlEnabled", this.u);
        bundle.putBoolean("mScaleControlEnabled", this.v);
        bundle.putInt("logoPosition", this.t);
        bundle.putInt("paddingLeft", this.w);
        bundle.putInt("paddingTop", this.y);
        bundle.putInt("paddingRight", this.x);
        bundle.putInt("paddingBottom", this.z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        if (view == this.d) {
            return;
        }
        super.removeView(view);
    }

    public void setCustomStyleFilePathAndMode(java.lang.String str, int i2) {
        a(str, i2);
    }

    public final void setLogoPosition(com.baidu.mapapi.map.LogoPosition logoPosition) {
        if (logoPosition == null) {
            logoPosition = com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom;
        }
        this.t = logoPosition.ordinal();
        requestLayout();
    }

    public void setMapCustomStyle(com.baidu.mapapi.map.MapCustomStyleOptions mapCustomStyleOptions, com.baidu.mapapi.map.MapView.CustomMapStyleCallBack customMapStyleCallBack) {
        if (mapCustomStyleOptions == null) {
            return;
        }
        java.lang.String customMapStyleId = mapCustomStyleOptions.getCustomMapStyleId();
        if (customMapStyleId != null && !customMapStyleId.isEmpty()) {
            com.baidu.mapsdkplatform.comapi.map.h.a().a(this.p, customMapStyleId, new com.baidu.mapapi.map.u(this, customMapStyleCallBack, mapCustomStyleOptions));
            return;
        }
        java.lang.String localCustomStyleFilePath = mapCustomStyleOptions.getLocalCustomStyleFilePath();
        if (localCustomStyleFilePath == null || localCustomStyleFilePath.isEmpty()) {
            return;
        }
        a(localCustomStyleFilePath, 0);
    }

    public void setMapCustomStyleEnable(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.ae aeVar = this.b;
        if (aeVar == null) {
            return;
        }
        aeVar.b().n(z);
    }

    public void setMapCustomStylePath(java.lang.String str) {
        a(str, 0);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.w = i2;
        this.y = i3;
        this.x = i4;
        this.z = i5;
    }

    public void setScaleControlPosition(android.graphics.Point point) {
        if (point != null && point.x >= 0 && point.y >= 0 && point.x <= getWidth() && point.y <= getHeight()) {
            this.g = point;
            requestLayout();
        }
    }

    public void setZoomControlsPosition(android.graphics.Point point) {
        if (point != null && point.x >= 0 && point.y >= 0 && point.x <= getWidth() && point.y <= getHeight()) {
            this.h = point;
            requestLayout();
        }
    }

    public void showScaleControl(boolean z) {
        this.l.setVisibility(z ? 0 : 8);
        this.v = z;
    }

    public void showZoomControls(boolean z) {
        if (this.f.a()) {
            this.f.setVisibility(z ? 0 : 8);
            this.u = z;
        }
    }
}
