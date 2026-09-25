package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class b implements com.baidu.mapapi.map.InfoWindow.a {
    final /* synthetic */ com.baidu.mapapi.map.BaiduMap a;

    b(com.baidu.mapapi.map.BaiduMap baiduMap) {
        this.a = baiduMap;
    }

    @Override // com.baidu.mapapi.map.InfoWindow.a
    public void a(com.baidu.mapapi.map.InfoWindow infoWindow) {
        this.a.hideInfoWindow(infoWindow);
    }

    @Override // com.baidu.mapapi.map.InfoWindow.a
    public void b(com.baidu.mapapi.map.InfoWindow infoWindow) {
        this.a.a(infoWindow);
    }
}
