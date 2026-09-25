package com.baidu.mapapi.map.offline;

/* JADX INFO: loaded from: classes.dex */
class a implements com.baidu.mapsdkplatform.comapi.map.x {
    final /* synthetic */ com.baidu.mapapi.map.offline.MKOfflineMap a;

    a(com.baidu.mapapi.map.offline.MKOfflineMap mKOfflineMap) {
        this.a = mKOfflineMap;
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.x
    public void a(int i, int i2) {
        com.baidu.mapapi.map.offline.MKOfflineMapListener mKOfflineMapListener;
        if (i == 4) {
            java.util.ArrayList<com.baidu.mapapi.map.offline.MKOLUpdateElement> allUpdateInfo = this.a.getAllUpdateInfo();
            if (allUpdateInfo != null) {
                for (com.baidu.mapapi.map.offline.MKOLUpdateElement mKOLUpdateElement : allUpdateInfo) {
                    if (mKOLUpdateElement.update) {
                        this.a.c.onGetOfflineMapState(4, mKOLUpdateElement.cityID);
                    }
                }
                return;
            }
            return;
        }
        int i3 = 6;
        if (i == 6) {
            mKOfflineMapListener = this.a.c;
        } else if (i == 8) {
            this.a.c.onGetOfflineMapState(0, i2 >> 8);
            return;
        } else {
            if (i != 10) {
                if (i != 12) {
                    return;
                }
                this.a.b.a(true, false);
                return;
            }
            mKOfflineMapListener = this.a.c;
            i3 = 2;
        }
        mKOfflineMapListener.onGetOfflineMapState(i3, i2);
    }
}
