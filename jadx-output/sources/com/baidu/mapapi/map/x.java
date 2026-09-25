package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class x implements android.view.View.OnClickListener {
    final /* synthetic */ com.baidu.mapapi.map.TextureMapView a;

    x(com.baidu.mapapi.map.TextureMapView textureMapView) {
        this.a = textureMapView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        float f = this.a.b.b().a;
        com.baidu.mapsdkplatform.comapi.map.ad adVarE = this.a.b.b().E();
        adVarE.a += 1.0f;
        if (adVarE.a <= f) {
            f = adVarE.a;
        }
        adVarE.a = f;
        com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 16;
        this.a.b.b().a(adVarE, 300);
    }
}
