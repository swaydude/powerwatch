package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class v implements com.baidu.mapsdkplatform.comapi.map.n {
    final /* synthetic */ com.baidu.mapapi.map.TextureMapView a;

    v(com.baidu.mapapi.map.TextureMapView textureMapView) {
        this.a = textureMapView;
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a() {
        java.lang.String str;
        if (this.a.b == null || this.a.b.b() == null) {
            return;
        }
        float f = this.a.b.b().E().a;
        if (f < this.a.b.b().b) {
            f = this.a.b.b().b;
        } else if (f > this.a.b.b().a) {
            f = this.a.b.b().a;
        }
        if (java.lang.Math.abs(this.a.r - f) > 0.0f) {
            int iIntValue = ((java.lang.Integer) com.baidu.mapapi.map.TextureMapView.q.get(java.lang.Math.round(f))).intValue();
            int i = ((int) (((double) iIntValue) / this.a.b.b().E().m)) / 2;
            this.a.o.setPadding(i, 0, i, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (iIntValue >= 1000) {
                objArr[0] = java.lang.Integer.valueOf(iIntValue / 1000);
                str = java.lang.String.format(" %d公里 ", objArr);
            } else {
                objArr[0] = java.lang.Integer.valueOf(iIntValue);
                str = java.lang.String.format(" %d米 ", objArr);
            }
            this.a.m.setText(str);
            this.a.n.setText(str);
            this.a.r = f;
        }
        this.a.b();
        this.a.requestLayout();
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(android.graphics.Bitmap bitmap) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(android.view.MotionEvent motionEvent) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(com.baidu.mapsdkplatform.comapi.map.ad adVar) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(java.lang.String str) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(javax.microedition.khronos.opengles.GL10 gl10, com.baidu.mapsdkplatform.comapi.map.ad adVar) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(boolean z) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(boolean z, int i) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void b() {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void b(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void b(com.baidu.mapsdkplatform.comapi.map.ad adVar) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public boolean b(java.lang.String str) {
        return false;
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void c() {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void c(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void c(com.baidu.mapsdkplatform.comapi.map.ad adVar) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void d() {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void d(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void e() {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void e(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void f() {
    }
}
