package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class e implements com.baidu.mapsdkplatform.comapi.map.ak {
    final /* synthetic */ com.baidu.mapapi.map.BaiduMap a;

    e(com.baidu.mapapi.map.BaiduMap baiduMap) {
        this.a = baiduMap;
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.ak
    public android.os.Bundle a(int i, int i2, int i3, android.content.Context context) {
        com.baidu.mapapi.map.Tile tileA;
        this.a.J.lock();
        try {
            if (this.a.G == null || (tileA = this.a.G.a(i, i2, i3)) == null) {
                return null;
            }
            return tileA.toBundle();
        } finally {
            this.a.J.unlock();
        }
    }
}
