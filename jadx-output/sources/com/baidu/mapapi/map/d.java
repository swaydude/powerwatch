package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class d implements com.baidu.mapsdkplatform.comapi.map.q {
    final /* synthetic */ com.baidu.mapapi.map.BaiduMap a;

    d(com.baidu.mapapi.map.BaiduMap baiduMap) {
        this.a = baiduMap;
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.q
    public android.os.Bundle a(int i, int i2, int i3) {
        com.baidu.mapapi.map.Tile tileA;
        this.a.I.lock();
        try {
            if (this.a.H == null || (tileA = this.a.H.a(i, i2, i3)) == null) {
                return null;
            }
            return tileA.toBundle();
        } finally {
            this.a.I.unlock();
        }
    }
}
