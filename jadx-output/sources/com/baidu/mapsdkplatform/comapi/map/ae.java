package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
public class ae extends android.view.TextureView implements android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener, android.view.TextureView.SurfaceTextureListener, com.baidu.mapsdkplatform.comapi.map.o.a {
    public static int a;
    public static int b;
    public static int c;
    private android.view.GestureDetector d;
    private android.os.Handler e;
    private boolean f;
    private android.graphics.SurfaceTexture g;
    private com.baidu.mapsdkplatform.comapi.map.o h;
    private com.baidu.mapsdkplatform.comapi.map.e i;

    public ae(android.content.Context context, com.baidu.mapsdkplatform.comapi.map.ab abVar, java.lang.String str, int i) throws java.lang.Throwable {
        super(context);
        this.f = false;
        this.h = null;
        a(context, abVar, str, i);
    }

    private void a(android.content.Context context, com.baidu.mapsdkplatform.comapi.map.ab abVar, java.lang.String str, int i) throws java.lang.Throwable {
        setSurfaceTextureListener(this);
        if (context == null) {
            throw new java.lang.RuntimeException("BDMapSDKException: when you create an mapview, the context can not be null");
        }
        this.d = new android.view.GestureDetector(context, this);
        com.baidu.mapapi.common.EnvironmentUtilities.initAppDirectory(context);
        if (this.i == null) {
            this.i = new com.baidu.mapsdkplatform.comapi.map.e(context, str, i);
        }
        this.i.a(context.hashCode());
        this.i.a();
        this.i.a(abVar);
        e();
        this.i.a(this.e);
        this.i.f();
    }

    private void e() {
        this.e = new com.baidu.mapsdkplatform.comapi.map.af(this);
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.o.a
    public int a() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return 0;
        }
        if (c <= 1) {
            com.baidu.mapsdkplatform.comapi.map.MapRenderer.nativeResize(eVar.j, a, b);
            c++;
        }
        return com.baidu.mapsdkplatform.comapi.map.MapRenderer.nativeRender(this.i.j);
    }

    public void a(int i) {
        synchronized (this) {
            if (this.i.h != null) {
                for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.i.h) {
                    if (nVar != null) {
                        nVar.f();
                    }
                }
            }
            com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
            if (eVar != null) {
                eVar.b(this.e);
                this.i.c(i);
                this.i = null;
            }
            this.e.removeCallbacksAndMessages(null);
            com.baidu.mapsdkplatform.comapi.map.o oVar = this.h;
            if (oVar != null) {
                oVar.c();
                this.h = null;
            }
            if (this.g != null) {
                if (android.os.Build.VERSION.SDK_INT >= 19) {
                    this.g.release();
                }
                this.g = null;
            }
        }
    }

    public void a(java.lang.String str, android.graphics.Rect rect) {
        com.baidu.mapsdkplatform.comapi.map.o oVar;
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null || eVar.i == null) {
            return;
        }
        if (rect != null) {
            int i = rect.left;
            int i2 = b < rect.bottom ? 0 : b - rect.bottom;
            int iWidth = rect.width();
            int iHeight = rect.height();
            if (i < 0 || i2 < 0 || iWidth <= 0 || iHeight <= 0) {
                return;
            }
            if (iWidth > a) {
                iWidth = java.lang.Math.abs(rect.width()) - (rect.right - a);
            }
            if (iHeight > b) {
                iHeight = java.lang.Math.abs(rect.height()) - (rect.bottom - b);
            }
            if (i > com.baidu.mapapi.common.SysOSUtil.getScreenSizeX() || i2 > com.baidu.mapapi.common.SysOSUtil.getScreenSizeY()) {
                this.i.i.a(str, (android.os.Bundle) null);
                com.baidu.mapsdkplatform.comapi.map.o oVar2 = this.h;
                if (oVar2 != null) {
                    oVar2.a();
                    return;
                }
                return;
            }
            a = iWidth;
            b = iHeight;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("x", i);
            bundle.putInt("y", i2);
            bundle.putInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, iWidth);
            bundle.putInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, iHeight);
            this.i.i.a(str, bundle);
            oVar = this.h;
            if (oVar == null) {
                return;
            }
        } else {
            this.i.i.a(str, (android.os.Bundle) null);
            oVar = this.h;
            if (oVar == null) {
                return;
            }
        }
        oVar.a();
    }

    public com.baidu.mapsdkplatform.comapi.map.e b() {
        return this.i;
    }

    public void c() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null || eVar.i == null) {
            return;
        }
        if (this.i.h != null) {
            for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.i.h) {
                if (nVar != null) {
                    nVar.d();
                }
            }
        }
        this.i.i.g();
        this.i.i.d();
        this.i.i.n();
        com.baidu.mapsdkplatform.comapi.map.o oVar = this.h;
        if (oVar != null) {
            oVar.a();
        }
        if (this.i.b()) {
            this.f = true;
        }
    }

    public void d() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null || eVar.i == null) {
            return;
        }
        this.f = false;
        this.i.i.c();
        synchronized (this) {
            this.i.i.c();
            com.baidu.mapsdkplatform.comapi.map.o oVar = this.h;
            if (oVar != null) {
                oVar.b();
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null || eVar.i == null || !this.i.k) {
            return true;
        }
        com.baidu.mapapi.model.inner.GeoPoint geoPointB = this.i.b((int) motionEvent.getX(), (int) motionEvent.getY());
        if (geoPointB != null) {
            if (this.i.h != null) {
                for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.i.h) {
                    if (nVar != null) {
                        nVar.b(geoPointB);
                    }
                }
            }
            if (this.i.f) {
                com.baidu.mapsdkplatform.comapi.map.ad adVarE = this.i.E();
                adVarE.a += 1.0f;
                if (!this.i.g) {
                    adVarE.d = geoPointB.getLongitudeE6();
                    adVarE.e = geoPointB.getLatitudeE6();
                }
                com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 1;
                this.i.a(adVarE, 300);
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
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null || eVar.i == null || !this.i.k) {
            return true;
        }
        if (!this.i.e) {
            return false;
        }
        float fSqrt = (float) java.lang.Math.sqrt((f * f) + (f2 * f2));
        if (fSqrt <= 500.0f) {
            return false;
        }
        com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 1;
        this.i.A();
        this.i.a(34, (int) (fSqrt * 0.6f), ((int) motionEvent2.getX()) | (((int) motionEvent2.getY()) << 16));
        this.i.M();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null || eVar.i == null || !this.i.k) {
            return;
        }
        java.lang.String strA = this.i.i.a(-1, (int) motionEvent.getX(), (int) motionEvent.getY(), this.i.l);
        if (this.i.h == null) {
            return;
        }
        if (strA == null || strA.equals("")) {
            for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.i.h) {
                com.baidu.mapapi.model.inner.GeoPoint geoPointB = this.i.b((int) motionEvent.getX(), (int) motionEvent.getY());
                if (nVar != null) {
                    nVar.c(geoPointB);
                }
            }
            return;
        }
        for (com.baidu.mapsdkplatform.comapi.map.n nVar2 : this.i.h) {
            if (nVar2.b(strA)) {
                this.i.p = true;
            } else {
                nVar2.c(this.i.b((int) motionEvent.getX(), (int) motionEvent.getY()));
            }
        }
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
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null || eVar.i == null || !this.i.k || this.i.h == null) {
            return true;
        }
        java.lang.String strA = this.i.i.a(-1, (int) motionEvent.getX(), (int) motionEvent.getY(), this.i.l);
        org.json.JSONObject jSONObject2 = null;
        if (strA == null || strA.equals("")) {
            for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.i.h) {
                if (nVar != null) {
                    nVar.a(this.i.b((int) motionEvent.getX(), (int) motionEvent.getY()));
                }
            }
        } else {
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
            for (com.baidu.mapsdkplatform.comapi.map.n nVar2 : this.i.h) {
                if (jSONObject != null && nVar2 != null) {
                    nVar2.a(jSONObject.toString());
                }
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.i == null) {
            return;
        }
        android.graphics.SurfaceTexture surfaceTexture2 = this.g;
        if (surfaceTexture2 != null) {
            setSurfaceTexture(surfaceTexture2);
            return;
        }
        this.g = surfaceTexture;
        com.baidu.mapsdkplatform.comapi.map.o oVar = new com.baidu.mapsdkplatform.comapi.map.o(this.g, this, new java.util.concurrent.atomic.AtomicBoolean(true), this);
        this.h = oVar;
        oVar.start();
        a = i;
        b = i2;
        com.baidu.mapsdkplatform.comapi.map.ad adVarE = this.i.E();
        if (adVarE == null) {
            return;
        }
        if (adVarE.f == 0 || adVarE.f == -1 || adVarE.f == (adVarE.j.left - adVarE.j.right) / 2) {
            adVarE.f = -1;
        }
        if (adVarE.g == 0 || adVarE.g == -1 || adVarE.g == (adVarE.j.bottom - adVarE.j.top) / 2) {
            adVarE.g = -1;
        }
        adVarE.j.left = 0;
        adVarE.j.top = 0;
        adVarE.j.bottom = i2;
        adVarE.j.right = i;
        this.i.a(adVarE);
        this.i.a(a, b);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        a = i;
        b = i2;
        c = 1;
        com.baidu.mapsdkplatform.comapi.map.ad adVarE = eVar.E();
        if (adVarE.f == 0 || adVarE.f == -1 || adVarE.f == (adVarE.j.left - adVarE.j.right) / 2) {
            adVarE.f = -1;
        }
        if (adVarE.g == 0 || adVarE.g == -1 || adVarE.g == (adVarE.j.bottom - adVarE.j.top) / 2) {
            adVarE.g = -1;
        }
        adVarE.j.left = 0;
        adVarE.j.top = 0;
        adVarE.j.bottom = i2;
        adVarE.j.right = i;
        this.i.a(adVarE);
        this.i.a(a, b);
        com.baidu.mapsdkplatform.comapi.map.MapRenderer.nativeResize(this.i.j, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        com.baidu.mapsdkplatform.comapi.map.o oVar;
        if (!this.f || (oVar = this.h) == null) {
            return;
        }
        oVar.a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null || eVar.i == null) {
            return true;
        }
        super.onTouchEvent(motionEvent);
        if (this.i.h != null) {
            for (com.baidu.mapsdkplatform.comapi.map.n nVar : this.i.h) {
                if (nVar != null) {
                    nVar.a(motionEvent);
                }
            }
        }
        if (this.d.onTouchEvent(motionEvent)) {
            return true;
        }
        return this.i.a(motionEvent);
    }
}
