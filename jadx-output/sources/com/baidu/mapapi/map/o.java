package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class o implements android.view.View.OnClickListener {
    final /* synthetic */ com.baidu.mapapi.map.MapView a;

    o(com.baidu.mapapi.map.MapView mapView) {
        this.a = mapView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        float f = this.a.e.a().a;
        com.baidu.mapsdkplatform.comapi.map.ad adVarE = this.a.e.a().E();
        adVarE.a += 1.0f;
        if (adVarE.a <= f) {
            f = adVarE.a;
        }
        adVarE.a = f;
        com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 16;
        this.a.e.a().a(adVarE, 300);
    }
}
