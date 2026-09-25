package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class ac implements android.view.View.OnClickListener {
    final /* synthetic */ com.baidu.mapapi.map.WearMapView a;

    ac(com.baidu.mapapi.map.WearMapView wearMapView) {
        this.a = wearMapView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.baidu.mapsdkplatform.comapi.map.ad adVarE = this.a.f.a().E();
        adVarE.a += 1.0f;
        this.a.f.a().a(adVarE, 300);
    }
}
