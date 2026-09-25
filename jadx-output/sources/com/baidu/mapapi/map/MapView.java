package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class MapView extends android.view.ViewGroup {
    private static final java.lang.String a = "MapView";
    private static java.lang.String b;
    private static int c;
    private static int d;
    private static final android.util.SparseIntArray q;
    private int A;
    private com.baidu.mapsdkplatform.comapi.map.l e;
    private com.baidu.mapapi.map.BaiduMap f;
    private android.widget.ImageView g;
    private android.graphics.Bitmap h;
    private com.baidu.mapsdkplatform.comapi.map.am i;
    private android.graphics.Point j;
    private android.graphics.Point k;
    private android.widget.RelativeLayout l;
    private android.widget.TextView m;
    private android.widget.TextView n;
    private android.widget.ImageView o;
    private android.content.Context p;
    private int r;
    private boolean s;
    private boolean t;
    private float u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public interface CustomMapStyleCallBack {
        boolean onCustomMapStyleLoadFailed(int i, java.lang.String str, java.lang.String str2);

        boolean onCustomMapStyleLoadSuccess(boolean z, java.lang.String str);

        boolean onPreLoadLastCustomMapStyle(java.lang.String str);
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        q = sparseIntArray;
        sparseIntArray.append(3, 2000000);
        sparseIntArray.append(4, kotlin.time.DurationKt.NANOS_IN_MILLIS);
        sparseIntArray.append(5, 500000);
        sparseIntArray.append(6, 200000);
        sparseIntArray.append(7, 100000);
        sparseIntArray.append(8, net.sqlcipher.database.SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
        sparseIntArray.append(9, 25000);
        sparseIntArray.append(10, 20000);
        sparseIntArray.append(11, 10000);
        sparseIntArray.append(12, 5000);
        sparseIntArray.append(13, 2000);
        sparseIntArray.append(14, 1000);
        sparseIntArray.append(15, com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL);
        sparseIntArray.append(16, 200);
        sparseIntArray.append(17, 100);
        sparseIntArray.append(18, 50);
        sparseIntArray.append(19, 20);
        sparseIntArray.append(20, 10);
        sparseIntArray.append(21, 5);
        sparseIntArray.append(22, 2);
        sparseIntArray.append(23, 2);
        sparseIntArray.append(24, 2);
        sparseIntArray.append(25, 2);
        sparseIntArray.append(26, 2);
    }

    public MapView(android.content.Context context) {
        super(context);
        this.r = com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom.ordinal();
        this.s = true;
        this.t = true;
        a(context, (com.baidu.mapapi.map.BaiduMapOptions) null);
    }

    public MapView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom.ordinal();
        this.s = true;
        this.t = true;
        a(context, (com.baidu.mapapi.map.BaiduMapOptions) null);
    }

    public MapView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom.ordinal();
        this.s = true;
        this.t = true;
        a(context, (com.baidu.mapapi.map.BaiduMapOptions) null);
    }

    public MapView(android.content.Context context, com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions) {
        super(context);
        this.r = com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom.ordinal();
        this.s = true;
        this.t = true;
        a(context, baiduMapOptions);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    private void a(android.content.Context context) {
        android.graphics.Matrix matrix;
        float f;
        int densityDpi = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
        android.graphics.Bitmap bitmapA = com.baidu.mapsdkplatform.comapi.commonutils.a.a(densityDpi < 180 ? "logo_l.png" : "logo_h.png", context);
        if (bitmapA == null) {
            return;
        }
        if (densityDpi <= 480) {
            if (densityDpi > 320) {
                matrix = new android.graphics.Matrix();
                f = 1.5f;
            } else {
                this.h = bitmapA;
            }
            if (this.h != null) {
                android.widget.ImageView imageView = new android.widget.ImageView(context);
                this.g = imageView;
                imageView.setImageBitmap(this.h);
                addView(this.g);
            }
        }
        matrix = new android.graphics.Matrix();
        f = 2.0f;
        matrix.postScale(f, f);
        this.h = android.graphics.Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
        if (this.h != null) {
            android.widget.ImageView imageView2 = new android.widget.ImageView(context);
            this.g = imageView2;
            imageView2.setImageBitmap(this.h);
            addView(this.g);
        }
    }

    private void a(android.content.Context context, com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions) {
        this.p = context;
        com.baidu.mapsdkplatform.comapi.map.k.a();
        com.baidu.mapapi.BMapManager.init();
        a(context, baiduMapOptions, b, c);
        this.f = new com.baidu.mapapi.map.BaiduMap(this.e);
        a(context);
        b(context);
        if (baiduMapOptions != null && !baiduMapOptions.h) {
            this.i.setVisibility(4);
        }
        c(context);
        if (baiduMapOptions != null && !baiduMapOptions.i) {
            this.l.setVisibility(4);
        }
        if (baiduMapOptions != null && baiduMapOptions.j != null) {
            this.r = baiduMapOptions.j.ordinal();
        }
        if (baiduMapOptions != null && baiduMapOptions.l != null) {
            this.k = baiduMapOptions.l;
        }
        if (baiduMapOptions == null || baiduMapOptions.k == null) {
            return;
        }
        this.j = baiduMapOptions.k;
    }

    private void a(android.content.Context context, com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions, java.lang.String str, int i) {
        if (baiduMapOptions == null) {
            this.e = new com.baidu.mapsdkplatform.comapi.map.l(context, null, str, i);
        } else {
            this.e = new com.baidu.mapsdkplatform.comapi.map.l(context, baiduMapOptions.a(), str, i);
        }
        addView(this.e);
        this.e.a().a(new com.baidu.mapapi.map.m(this));
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

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, int i) {
        if (this.e == null) {
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
        this.e.a().a(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.i.a()) {
            float f = this.e.a().E().a;
            this.i.b(f > this.e.a().b);
            this.i.a(f < this.e.a().a);
        }
    }

    private void b(android.content.Context context) {
        com.baidu.mapsdkplatform.comapi.map.am amVar = new com.baidu.mapsdkplatform.comapi.map.am(context, false);
        this.i = amVar;
        if (amVar.a()) {
            this.i.b(new com.baidu.mapapi.map.n(this));
            this.i.a(new com.baidu.mapapi.map.o(this));
            addView(this.i);
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
        if (bitmapA != null) {
            byte[] ninePatchChunk = bitmapA.getNinePatchChunk();
            if (android.graphics.NinePatch.isNinePatchChunk(ninePatchChunk)) {
                this.o.setBackgroundDrawable(new android.graphics.drawable.NinePatchDrawable(bitmapA, ninePatchChunk, new android.graphics.Rect(), null));
            }
        }
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
        b = str;
    }

    @java.lang.Deprecated
    public static void setIconCustom(int i) {
        d = i;
    }

    @java.lang.Deprecated
    public static void setLoadCustomMapStyleFileMode(int i) {
        c = i;
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

    public void cancelRenderMap() {
        this.e.a().x(false);
        this.e.a().P().clear();
    }

    public final com.baidu.mapapi.map.LogoPosition getLogoPosition() {
        int i = this.r;
        if (i == 1) {
            return com.baidu.mapapi.map.LogoPosition.logoPostionleftTop;
        }
        if (i == 2) {
            return com.baidu.mapapi.map.LogoPosition.logoPostionCenterBottom;
        }
        if (i == 3) {
            return com.baidu.mapapi.map.LogoPosition.logoPostionCenterTop;
        }
        if (i != 4) {
            return i != 5 ? com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom : com.baidu.mapapi.map.LogoPosition.logoPostionRightTop;
        }
        return com.baidu.mapapi.map.LogoPosition.logoPostionRightBottom;
    }

    public final com.baidu.mapapi.map.BaiduMap getMap() {
        this.f.a = this;
        return this.f;
    }

    public final int getMapLevel() {
        return q.get((int) this.e.a().E().a);
    }

    public android.graphics.Point getScaleControlPosition() {
        return this.j;
    }

    public int getScaleControlViewHeight() {
        return this.z;
    }

    public int getScaleControlViewWidth() {
        return this.A;
    }

    public android.graphics.Point getZoomControlsPosition() {
        return this.k;
    }

    public boolean handleMultiTouch(float f, float f2, float f3, float f4) {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.e;
        return lVar != null && lVar.a(f, f2, f3, f4);
    }

    public void handleTouchDown(float f, float f2) {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.e;
        if (lVar == null) {
            return;
        }
        lVar.a(f, f2);
    }

    public boolean handleTouchMove(float f, float f2) {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.e;
        return lVar != null && lVar.c(f, f2);
    }

    public boolean handleTouchUp(float f, float f2) {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.e;
        if (lVar == null) {
            return false;
        }
        return lVar.b(f, f2);
    }

    public boolean inRangeOfView(float f, float f2) {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.e;
        return lVar != null && lVar.d(f, f2);
    }

    public void onCreate(android.content.Context context, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        com.baidu.mapapi.map.MapStatus mapStatus = (com.baidu.mapapi.map.MapStatus) bundle.getParcelable("mapstatus");
        if (this.j != null) {
            this.j = (android.graphics.Point) bundle.getParcelable("scalePosition");
        }
        if (this.k != null) {
            this.k = (android.graphics.Point) bundle.getParcelable("zoomPosition");
        }
        this.s = bundle.getBoolean("mZoomControlEnabled");
        this.t = bundle.getBoolean("mScaleControlEnabled");
        this.r = bundle.getInt("logoPosition");
        setPadding(bundle.getInt("paddingLeft"), bundle.getInt("paddingTop"), bundle.getInt("paddingRight"), bundle.getInt("paddingBottom"));
        a(context, new com.baidu.mapapi.map.BaiduMapOptions().mapStatus(mapStatus));
    }

    public final void onDestroy() {
        android.content.Context context = this.p;
        if (context != null) {
            this.e.b(context.hashCode());
        }
        android.graphics.Bitmap bitmap = this.h;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.h.recycle();
            this.h = null;
        }
        if (b != null) {
            b = null;
        }
        this.i.b();
        com.baidu.mapapi.BMapManager.destroy();
        com.baidu.mapsdkplatform.comapi.map.k.b();
        this.p = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float height;
        int measuredHeight;
        int measuredWidth;
        int childCount = getChildCount();
        a(this.g);
        float width = 1.0f;
        if (((getWidth() - this.v) - this.w) - this.g.getMeasuredWidth() <= 0 || ((getHeight() - this.x) - this.y) - this.g.getMeasuredHeight() <= 0) {
            this.v = 0;
            this.w = 0;
            this.y = 0;
            this.x = 0;
            height = 1.0f;
        } else {
            width = ((getWidth() - this.v) - this.w) / getWidth();
            height = ((getHeight() - this.x) - this.y) / getHeight();
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            if (childAt != null) {
                com.baidu.mapsdkplatform.comapi.map.l lVar = this.e;
                if (childAt == lVar) {
                    lVar.layout(0, 0, getWidth(), getHeight());
                } else {
                    android.widget.ImageView imageView = this.g;
                    if (childAt == imageView) {
                        float f = width * 5.0f;
                        int width2 = (int) (this.v + f);
                        int i6 = (int) (this.w + f);
                        float f2 = 5.0f * height;
                        int measuredHeight2 = (int) (this.x + f2);
                        int i7 = (int) (this.y + f2);
                        int i8 = this.r;
                        if (i8 != 1) {
                            if (i8 == 2) {
                                measuredHeight = getHeight() - i7;
                                measuredHeight2 = measuredHeight - this.g.getMeasuredHeight();
                            } else if (i8 != 3) {
                                if (i8 == 4) {
                                    measuredHeight = getHeight() - i7;
                                    measuredHeight2 = measuredHeight - this.g.getMeasuredHeight();
                                } else if (i8 != 5) {
                                    measuredHeight = getHeight() - i7;
                                    measuredWidth = this.g.getMeasuredWidth() + width2;
                                    measuredHeight2 = measuredHeight - this.g.getMeasuredHeight();
                                } else {
                                    measuredHeight = measuredHeight2 + imageView.getMeasuredHeight();
                                }
                                measuredWidth = getWidth() - i6;
                                width2 = measuredWidth - this.g.getMeasuredWidth();
                            } else {
                                measuredHeight = measuredHeight2 + imageView.getMeasuredHeight();
                            }
                            width2 = (((getWidth() - this.g.getMeasuredWidth()) + this.v) - this.w) / 2;
                            measuredWidth = (((getWidth() + this.g.getMeasuredWidth()) + this.v) - this.w) / 2;
                        } else {
                            measuredHeight = imageView.getMeasuredHeight() + measuredHeight2;
                            measuredWidth = this.g.getMeasuredWidth() + width2;
                        }
                        this.g.layout(width2, measuredHeight2, measuredWidth, measuredHeight);
                    } else {
                        com.baidu.mapsdkplatform.comapi.map.am amVar = this.i;
                        if (childAt != amVar) {
                            android.widget.RelativeLayout relativeLayout = this.l;
                            if (childAt == relativeLayout) {
                                a(relativeLayout);
                                android.graphics.Point point = this.j;
                                if (point == null) {
                                    int i9 = (int) (this.y + (height * 5.0f) + 56.0f);
                                    this.A = this.l.getMeasuredWidth();
                                    this.z = this.l.getMeasuredHeight();
                                    int i10 = (int) (this.v + (5.0f * width));
                                    int height2 = (getHeight() - i9) - this.g.getMeasuredHeight();
                                    this.l.layout(i10, height2, this.A + i10, this.z + height2);
                                } else {
                                    this.l.layout(point.x, this.j.y, this.j.x + this.l.getMeasuredWidth(), this.j.y + this.l.getMeasuredHeight());
                                }
                            } else {
                                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams instanceof com.baidu.mapapi.map.MapViewLayoutParams) {
                                    com.baidu.mapapi.map.MapViewLayoutParams mapViewLayoutParams = (com.baidu.mapapi.map.MapViewLayoutParams) layoutParams;
                                    android.graphics.Point pointA = mapViewLayoutParams.c == com.baidu.mapapi.map.MapViewLayoutParams.ELayoutMode.absoluteMode ? mapViewLayoutParams.b : this.e.a().a(com.baidu.mapapi.model.CoordUtil.ll2mc(mapViewLayoutParams.a));
                                    a(childAt);
                                    int measuredWidth2 = childAt.getMeasuredWidth();
                                    int measuredHeight3 = childAt.getMeasuredHeight();
                                    float f3 = mapViewLayoutParams.d;
                                    float f4 = mapViewLayoutParams.e;
                                    int i11 = (int) (pointA.x - (f3 * measuredWidth2));
                                    int i12 = ((int) (pointA.y - (f4 * measuredHeight3))) + mapViewLayoutParams.f;
                                    childAt.layout(i11, i12, measuredWidth2 + i11, measuredHeight3 + i12);
                                }
                            }
                        } else if (amVar.a()) {
                            a(this.i);
                            android.graphics.Point point2 = this.k;
                            if (point2 == null) {
                                int height3 = (int) (((getHeight() - 15) * height) + this.x);
                                int width3 = (int) (((getWidth() - 15) * width) + this.v);
                                int measuredWidth3 = width3 - this.i.getMeasuredWidth();
                                int measuredHeight4 = height3 - this.i.getMeasuredHeight();
                                if (this.r == 4) {
                                    height3 -= this.g.getMeasuredHeight();
                                    measuredHeight4 -= this.g.getMeasuredHeight();
                                }
                                this.i.layout(measuredWidth3, measuredHeight4, width3, height3);
                            } else {
                                this.i.layout(point2.x, this.k.y, this.k.x + this.i.getMeasuredWidth(), this.k.y + this.i.getMeasuredHeight());
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onPause() {
        this.e.onPause();
    }

    public final void onResume() {
        this.e.onResume();
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.baidu.mapapi.map.BaiduMap baiduMap;
        if (bundle == null || (baiduMap = this.f) == null) {
            return;
        }
        bundle.putParcelable("mapstatus", baiduMap.getMapStatus());
        android.graphics.Point point = this.j;
        if (point != null) {
            bundle.putParcelable("scalePosition", point);
        }
        android.graphics.Point point2 = this.k;
        if (point2 != null) {
            bundle.putParcelable("zoomPosition", point2);
        }
        bundle.putBoolean("mZoomControlEnabled", this.s);
        bundle.putBoolean("mScaleControlEnabled", this.t);
        bundle.putInt("logoPosition", this.r);
        bundle.putInt("paddingLeft", this.v);
        bundle.putInt("paddingTop", this.x);
        bundle.putInt("paddingRight", this.w);
        bundle.putInt("paddingBottom", this.y);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        if (view == this.g) {
            return;
        }
        super.removeView(view);
    }

    public void renderMap() {
        com.baidu.mapsdkplatform.comapi.map.e eVarA = this.e.a();
        eVarA.x(true);
        eVarA.Q();
    }

    public void setCustomStyleFilePathAndMode(java.lang.String str, int i) {
        a(str, i);
    }

    public final void setLogoPosition(com.baidu.mapapi.map.LogoPosition logoPosition) {
        if (logoPosition == null) {
            logoPosition = com.baidu.mapapi.map.LogoPosition.logoPostionleftBottom;
        }
        this.r = logoPosition.ordinal();
        requestLayout();
    }

    public void setMapCustomStyle(com.baidu.mapapi.map.MapCustomStyleOptions mapCustomStyleOptions, com.baidu.mapapi.map.MapView.CustomMapStyleCallBack customMapStyleCallBack) {
        if (mapCustomStyleOptions == null) {
            return;
        }
        java.lang.String customMapStyleId = mapCustomStyleOptions.getCustomMapStyleId();
        if (customMapStyleId != null && !customMapStyleId.isEmpty()) {
            com.baidu.mapsdkplatform.comapi.map.h.a().a(this.p, customMapStyleId, new com.baidu.mapapi.map.l(this, customMapStyleCallBack, mapCustomStyleOptions));
            return;
        }
        java.lang.String localCustomStyleFilePath = mapCustomStyleOptions.getLocalCustomStyleFilePath();
        if (localCustomStyleFilePath == null || localCustomStyleFilePath.isEmpty()) {
            return;
        }
        a(localCustomStyleFilePath, 0);
        setMapCustomStyleEnable(true);
    }

    public void setMapCustomStyleEnable(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.e;
        if (lVar == null) {
            return;
        }
        lVar.a().n(z);
    }

    public void setMapCustomStylePath(java.lang.String str) {
        a(str, 0);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.v = i;
        this.x = i2;
        this.w = i3;
        this.y = i4;
    }

    public void setScaleControlPosition(android.graphics.Point point) {
        if (point != null && point.x >= 0 && point.y >= 0 && point.x <= getWidth() && point.y <= getHeight()) {
            this.j = point;
            requestLayout();
        }
    }

    public void setUpViewEventToMapView(android.view.MotionEvent motionEvent) {
        this.e.onTouchEvent(motionEvent);
    }

    public final void setZOrderMediaOverlay(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.e;
        if (lVar == null) {
            return;
        }
        lVar.setZOrderMediaOverlay(z);
    }

    public void setZoomControlsPosition(android.graphics.Point point) {
        if (point != null && point.x >= 0 && point.y >= 0 && point.x <= getWidth() && point.y <= getHeight()) {
            this.k = point;
            requestLayout();
        }
    }

    public void showScaleControl(boolean z) {
        this.l.setVisibility(z ? 0 : 8);
        this.t = z;
    }

    public void showZoomControls(boolean z) {
        if (this.i.a()) {
            this.i.setVisibility(z ? 0 : 8);
            this.s = z;
        }
    }
}
