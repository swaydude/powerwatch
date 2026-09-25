package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
public class l extends android.opengl.GLSurfaceView implements android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener, com.baidu.mapsdkplatform.comapi.map.MapRenderer.a {
    private static final java.lang.String a = "l";
    private android.os.Handler b;
    private com.baidu.mapsdkplatform.comapi.map.MapRenderer c;
    private int d;
    private int e;
    private android.view.GestureDetector f;
    private com.baidu.mapsdkplatform.comapi.map.e g;

    static class a {
        float a;
        float b;
        float c;
        float d;
        boolean e;
        float f;
        float g;
        double h;

        a() {
        }

        public java.lang.String toString() {
            return "MultiTouch{x1=" + this.a + ", x2=" + this.b + ", y1=" + this.c + ", y2=" + this.d + ", mTwoTouch=" + this.e + ", centerX=" + this.f + ", centerY=" + this.g + ", length=" + this.h + '}';
        }
    }

    public l(android.content.Context context, com.baidu.mapsdkplatform.comapi.map.ab abVar, java.lang.String str, int i) throws java.lang.Throwable {
        super(context);
        if (context == null) {
            throw new java.lang.RuntimeException("BDMapSDKException: when you create an mapview, the context can not be null");
        }
        setEGLContextClientVersion(2);
        this.f = new android.view.GestureDetector(context, this);
        com.baidu.mapapi.common.EnvironmentUtilities.initAppDirectory(context);
        if (this.g == null) {
            this.g = new com.baidu.mapsdkplatform.comapi.map.e(context, str, i);
        }
        this.g.a(context.hashCode());
        g();
        this.g.a();
        this.g.a(abVar);
        h();
        this.g.a(this.b);
        this.g.f();
        setBackgroundColor(0);
    }

    private static boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        javax.microedition.khronos.egl.EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        int[] iArr = new int[1];
        return egl10.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344}, new javax.microedition.khronos.egl.EGLConfig[100], 100, iArr) && iArr[0] > 0;
    }

    private void g() {
        try {
            if (a(8, 8, 8, 8, 24, 0)) {
                setEGLConfigChooser(8, 8, 8, 8, 24, 0);
            } else if (a(5, 6, 5, 0, 24, 0)) {
                setEGLConfigChooser(5, 6, 5, 0, 24, 0);
            } else {
                setEGLConfigChooser(true);
            }
        } catch (java.lang.IllegalArgumentException unused) {
            setEGLConfigChooser(true);
        }
        com.baidu.mapsdkplatform.comapi.map.MapRenderer mapRenderer = new com.baidu.mapsdkplatform.comapi.map.MapRenderer(this, this);
        this.c = mapRenderer;
        mapRenderer.a(this.g.j);
        setRenderer(this.c);
        setRenderMode(1);
    }

    private void h() {
        this.b = new com.baidu.mapsdkplatform.comapi.map.m(this);
    }

    public com.baidu.mapsdkplatform.comapi.map.e a() {
        return this.g;
    }

    public void a(float f, float f2) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null) {
            return;
        }
        this.g.b(f, f2);
    }

    public void a(int i) {
        int i2;
        if (this.g == null) {
            return;
        }
        android.os.Message message = new android.os.Message();
        message.what = 50;
        message.obj = java.lang.Long.valueOf(this.g.j);
        boolean zQ = this.g.q();
        if (i != 3) {
            i2 = zQ ? 1 : 0;
            this.b.sendMessage(message);
        }
        message.arg1 = i2;
        this.b.sendMessage(message);
    }

    public void a(java.lang.String str, android.graphics.Rect rect) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null) {
            return;
        }
        if (rect != null) {
            int i = rect.left;
            int i2 = this.e < rect.bottom ? 0 : this.e - rect.bottom;
            int iWidth = rect.width();
            int iHeight = rect.height();
            if (i < 0 || i2 < 0 || iWidth <= 0 || iHeight <= 0) {
                return;
            }
            if (iWidth > this.d) {
                iWidth = java.lang.Math.abs(rect.width()) - (rect.right - this.d);
            }
            if (iHeight > this.e) {
                iHeight = java.lang.Math.abs(rect.height()) - (rect.bottom - this.e);
            }
            if (i > com.baidu.mapapi.common.SysOSUtil.getScreenSizeX() || i2 > com.baidu.mapapi.common.SysOSUtil.getScreenSizeY()) {
                this.g.i.a(str, (android.os.Bundle) null);
                requestRender();
                return;
            }
            this.d = iWidth;
            this.e = iHeight;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("x", i);
            bundle.putInt("y", i2);
            bundle.putInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, iWidth);
            bundle.putInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, iHeight);
            this.g.i.a(str, bundle);
        } else {
            this.g.i.a(str, (android.os.Bundle) null);
        }
        requestRender();
    }

    public boolean a(float f, float f2, float f3, float f4) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null) {
            return false;
        }
        return this.g.a(f, f2, f3, f4);
    }

    public void b() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null) {
            return;
        }
        eVar.u();
    }

    public void b(int i) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar != null) {
            if (eVar.h != null) {
                for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.g.h) {
                    if (nVar != null) {
                        nVar.f();
                    }
                }
            }
            this.g.b(this.b);
            this.g.c(i);
            this.g = null;
        }
        android.os.Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public boolean b(float f, float f2) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null) {
            return false;
        }
        return this.g.d(f, f2);
    }

    public void c() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null) {
            return;
        }
        eVar.v();
    }

    public boolean c(float f, float f2) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null) {
            return false;
        }
        return this.g.c(f, f2);
    }

    public void d() {
        getHolder().setFormat(-3);
        this.g.i.s();
    }

    public boolean d(float f, float f2) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null) {
            return false;
        }
        return this.g.c((int) f, (int) f2);
    }

    public void e() {
        getHolder().setFormat(-1);
        this.g.i.t();
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.MapRenderer.a
    public void f() {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null || !this.g.k) {
            return true;
        }
        com.baidu.mapapi.model.inner.GeoPoint geoPointB = this.g.b((int) motionEvent.getX(), (int) motionEvent.getY());
        if (geoPointB != null) {
            if (this.g.h != null) {
                for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.g.h) {
                    if (nVar != null) {
                        nVar.b(geoPointB);
                    }
                }
            }
            if (this.g.f) {
                com.baidu.mapsdkplatform.comapi.map.ad adVarE = this.g.E();
                adVarE.a += 1.0f;
                if (!this.g.g) {
                    adVarE.d = geoPointB.getLongitudeE6();
                    adVarE.e = geoPointB.getLatitudeE6();
                }
                com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 1;
                this.g.a(adVarE, 300);
                com.baidu.mapsdkplatform.comapi.map.e.m = java.lang.System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null || !this.g.k) {
            return true;
        }
        if (!this.g.e) {
            return false;
        }
        float fSqrt = (float) java.lang.Math.sqrt((f * f) + (f2 * f2));
        if (fSqrt <= 500.0f) {
            return false;
        }
        com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 1;
        this.g.A();
        this.g.a(34, (int) (fSqrt * 0.6f), ((int) motionEvent2.getX()) | (((int) motionEvent2.getY()) << 16));
        this.g.M();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null || !this.g.k) {
            return;
        }
        java.lang.String strA = this.g.i.a(-1, (int) motionEvent.getX(), (int) motionEvent.getY(), this.g.l);
        if (strA == null || strA.equals("")) {
            if (this.g.h != null) {
                for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.g.h) {
                    com.baidu.mapapi.model.inner.GeoPoint geoPointB = this.g.b((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (nVar != null) {
                        nVar.c(geoPointB);
                    }
                }
                return;
            }
            return;
        }
        if (this.g.h != null) {
            for (com.baidu.mapsdkplatform.comapi.map.n nVar2 : this.g.h) {
                if (nVar2 != null) {
                    if (nVar2.b(strA)) {
                        this.g.p = true;
                    } else {
                        nVar2.c(this.g.b((int) motionEvent.getX(), (int) motionEvent.getY()));
                    }
                }
            }
        }
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        super.onPause();
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null) {
            return;
        }
        this.g.i.c();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null) {
            return;
        }
        if (this.g.h != null) {
            for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.g.h) {
                if (nVar != null) {
                    nVar.d();
                }
            }
        }
        this.g.i.g();
        this.g.i.d();
        this.g.i.n();
        setRenderMode(1);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        org.json.JSONObject jSONObject;
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar != null && eVar.i != null && this.g.k) {
            java.lang.String strA = this.g.i.a(-1, (int) motionEvent.getX(), (int) motionEvent.getY(), this.g.l);
            org.json.JSONObject jSONObject2 = null;
            if (strA != null && !strA.equals("")) {
                try {
                    jSONObject = new org.json.JSONObject(strA);
                    try {
                        jSONObject.put("px", (int) motionEvent.getX());
                        jSONObject.put("py", (int) motionEvent.getY());
                    } catch (org.json.JSONException e) {
                        e = e;
                        jSONObject2 = jSONObject;
                        e.printStackTrace();
                        jSONObject = jSONObject2;
                    }
                } catch (org.json.JSONException e2) {
                    e = e2;
                }
                if (this.g.h != null) {
                    for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.g.h) {
                        if (jSONObject != null && nVar != null) {
                            nVar.a(jSONObject.toString());
                        }
                    }
                }
            } else if (this.g.h != null) {
                for (com.baidu.mapsdkplatform.comapi.map.n nVar2 : this.g.h) {
                    if (nVar2 != null) {
                        nVar2.a(this.g.b((int) motionEvent.getX(), (int) motionEvent.getY()));
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null) {
            return true;
        }
        super.onTouchEvent(motionEvent);
        if (this.g.h != null) {
            for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.g.h) {
                if (nVar != null) {
                    nVar.a(motionEvent);
                }
            }
        }
        if (this.f.onTouchEvent(motionEvent)) {
            return true;
        }
        return this.g.a(motionEvent);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.g;
        if (eVar == null || eVar.i == null) {
            return;
        }
        this.c.a = i2;
        this.c.b = i3;
        this.d = i2;
        this.e = i3;
        this.c.c = 0;
        com.baidu.mapsdkplatform.comapi.map.ad adVarE = this.g.E();
        if (adVarE.f == 0 || adVarE.f == -1 || adVarE.f == (adVarE.j.left - adVarE.j.right) / 2) {
            adVarE.f = -1;
        }
        if (adVarE.g == 0 || adVarE.g == -1 || adVarE.g == (adVarE.j.bottom - adVarE.j.top) / 2) {
            adVarE.g = -1;
        }
        adVarE.j.left = 0;
        adVarE.j.top = 0;
        adVarE.j.bottom = i3;
        adVarE.j.right = i2;
        this.g.a(adVarE);
        this.g.a(this.d, this.e);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        if (surfaceHolder == null || surfaceHolder.getSurface().isValid()) {
            return;
        }
        surfaceDestroyed(surfaceHolder);
    }
}
