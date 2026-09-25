package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class m implements com.baidu.mapsdkplatform.comapi.map.n {
    final /* synthetic */ com.baidu.mapapi.map.MapView a;

    m(com.baidu.mapapi.map.MapView mapView) {
        this.a = mapView;
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a() {
        java.lang.String str;
        if (this.a.e == null || this.a.e.a() == null) {
            return;
        }
        float f = this.a.e.a().E().a;
        if (f < this.a.e.a().b) {
            f = this.a.e.a().b;
        } else if (f > this.a.e.a().a) {
            f = this.a.e.a().a;
        }
        if (java.lang.Math.abs(this.a.u - f) > 0.0f) {
            int i = com.baidu.mapapi.map.MapView.q.get(java.lang.Math.round(f));
            int i2 = ((int) (((double) i) / this.a.e.a().E().m)) / 2;
            this.a.o.setPadding(i2, 0, i2, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (i >= 1000) {
                objArr[0] = java.lang.Integer.valueOf(i / 1000);
                str = java.lang.String.format(" %d公里 ", objArr);
            } else {
                objArr[0] = java.lang.Integer.valueOf(i);
                str = java.lang.String.format(" %d米 ", objArr);
            }
            this.a.m.setText(str);
            this.a.n.setText(str);
            this.a.u = f;
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
