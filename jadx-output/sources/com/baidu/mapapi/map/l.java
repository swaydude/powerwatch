package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class l implements com.baidu.mapsdkplatform.comapi.map.h.a {
    final /* synthetic */ com.baidu.mapapi.map.MapView.CustomMapStyleCallBack a;
    final /* synthetic */ com.baidu.mapapi.map.MapCustomStyleOptions b;
    final /* synthetic */ com.baidu.mapapi.map.MapView c;

    l(com.baidu.mapapi.map.MapView mapView, com.baidu.mapapi.map.MapView.CustomMapStyleCallBack customMapStyleCallBack, com.baidu.mapapi.map.MapCustomStyleOptions mapCustomStyleOptions) {
        this.c = mapView;
        this.a = customMapStyleCallBack;
        this.b = mapCustomStyleOptions;
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.h.a
    public void a(int i, java.lang.String str, java.lang.String str2) {
        com.baidu.mapapi.map.MapView.CustomMapStyleCallBack customMapStyleCallBack = this.a;
        if (customMapStyleCallBack == null || !customMapStyleCallBack.onCustomMapStyleLoadFailed(i, str, str2)) {
            if (android.text.TextUtils.isEmpty(str2)) {
                java.lang.String localCustomStyleFilePath = this.b.getLocalCustomStyleFilePath();
                if (android.text.TextUtils.isEmpty(localCustomStyleFilePath)) {
                    return;
                } else {
                    this.c.a(localCustomStyleFilePath, 0);
                }
            } else {
                this.c.a(str2, 1);
            }
            this.c.setMapCustomStyleEnable(true);
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.h.a
    public void a(java.lang.String str) {
        com.baidu.mapapi.map.MapView.CustomMapStyleCallBack customMapStyleCallBack = this.a;
        if ((customMapStyleCallBack == null || !customMapStyleCallBack.onPreLoadLastCustomMapStyle(str)) && !android.text.TextUtils.isEmpty(str)) {
            this.c.a(str, 1);
            this.c.setMapCustomStyleEnable(true);
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.h.a
    public void a(boolean z, java.lang.String str) {
        com.baidu.mapapi.map.MapView.CustomMapStyleCallBack customMapStyleCallBack = this.a;
        if ((customMapStyleCallBack == null || !customMapStyleCallBack.onCustomMapStyleLoadSuccess(z, str)) && z && !android.text.TextUtils.isEmpty(str)) {
            this.c.a(str, 1);
            this.c.setMapCustomStyleEnable(true);
        }
    }
}
