package com.baidu.mapapi.map.offline;

/* JADX INFO: loaded from: classes.dex */
public class MKOfflineMap {
    public static final int TYPE_DOWNLOAD_UPDATE = 0;
    public static final int TYPE_NETWORK_ERROR = 2;
    public static final int TYPE_NEW_OFFLINE = 6;
    public static final int TYPE_VER_UPDATE = 4;
    private static final java.lang.String a = "MKOfflineMap";
    private com.baidu.mapsdkplatform.comapi.map.t b;
    private com.baidu.mapapi.map.offline.MKOfflineMapListener c;

    public void destroy() {
        this.b.d(0);
        this.b.b((com.baidu.mapsdkplatform.comapi.map.x) null);
        this.b.b();
        com.baidu.mapsdkplatform.comapi.map.k.b();
    }

    public java.util.ArrayList<com.baidu.mapapi.map.offline.MKOLUpdateElement> getAllUpdateInfo() {
        java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.w> arrayListE = this.b.e();
        if (arrayListE == null) {
            return null;
        }
        java.util.ArrayList<com.baidu.mapapi.map.offline.MKOLUpdateElement> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.baidu.mapsdkplatform.comapi.map.w> it = arrayListE.iterator();
        while (it.hasNext()) {
            arrayList.add(com.baidu.mapapi.map.offline.OfflineMapUtil.getUpdatElementFromLocalMapElement(it.next().a()));
        }
        return arrayList;
    }

    public java.util.ArrayList<com.baidu.mapapi.map.offline.MKOLSearchRecord> getHotCityList() {
        java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> arrayListC = this.b.c();
        if (arrayListC == null) {
            return null;
        }
        java.util.ArrayList<com.baidu.mapapi.map.offline.MKOLSearchRecord> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.baidu.mapsdkplatform.comapi.map.s> it = arrayListC.iterator();
        while (it.hasNext()) {
            arrayList.add(com.baidu.mapapi.map.offline.OfflineMapUtil.getSearchRecordFromLocalCityInfo(it.next()));
        }
        return arrayList;
    }

    public java.util.ArrayList<com.baidu.mapapi.map.offline.MKOLSearchRecord> getOfflineCityList() {
        java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> arrayListD = this.b.d();
        if (arrayListD == null) {
            return null;
        }
        java.util.ArrayList<com.baidu.mapapi.map.offline.MKOLSearchRecord> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.baidu.mapsdkplatform.comapi.map.s> it = arrayListD.iterator();
        while (it.hasNext()) {
            arrayList.add(com.baidu.mapapi.map.offline.OfflineMapUtil.getSearchRecordFromLocalCityInfo(it.next()));
        }
        return arrayList;
    }

    public com.baidu.mapapi.map.offline.MKOLUpdateElement getUpdateInfo(int i) {
        com.baidu.mapsdkplatform.comapi.map.w wVarG = this.b.g(i);
        if (wVarG == null) {
            return null;
        }
        return com.baidu.mapapi.map.offline.OfflineMapUtil.getUpdatElementFromLocalMapElement(wVarG.a());
    }

    @java.lang.Deprecated
    public int importOfflineData() {
        return importOfflineData(false);
    }

    @java.lang.Deprecated
    public int importOfflineData(boolean z) {
        int size;
        java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.w> arrayListE = this.b.e();
        int size2 = 0;
        if (arrayListE != null) {
            size2 = arrayListE.size();
            size = size2;
        } else {
            size = 0;
        }
        this.b.a(z, true);
        java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.w> arrayListE2 = this.b.e();
        if (arrayListE2 != null) {
            size = arrayListE2.size();
        }
        return size - size2;
    }

    public boolean init(com.baidu.mapapi.map.offline.MKOfflineMapListener mKOfflineMapListener) throws java.lang.Throwable {
        com.baidu.mapsdkplatform.comapi.map.k.a();
        com.baidu.mapsdkplatform.comapi.map.t tVarA = com.baidu.mapsdkplatform.comapi.map.t.a();
        this.b = tVarA;
        if (tVarA == null) {
            return false;
        }
        tVarA.a(new com.baidu.mapapi.map.offline.a(this));
        this.c = mKOfflineMapListener;
        return true;
    }

    public boolean pause(int i) {
        return this.b.c(i);
    }

    public boolean remove(int i) {
        return this.b.e(i);
    }

    public java.util.ArrayList<com.baidu.mapapi.map.offline.MKOLSearchRecord> searchCity(java.lang.String str) {
        java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> arrayListA = this.b.a(str);
        if (arrayListA == null) {
            return null;
        }
        java.util.ArrayList<com.baidu.mapapi.map.offline.MKOLSearchRecord> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.baidu.mapsdkplatform.comapi.map.s> it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add(com.baidu.mapapi.map.offline.OfflineMapUtil.getSearchRecordFromLocalCityInfo(it.next()));
        }
        return arrayList;
    }

    public boolean start(int i) {
        com.baidu.mapsdkplatform.comapi.map.t tVar = this.b;
        if (tVar == null) {
            return false;
        }
        if (tVar.e() != null) {
            for (com.baidu.mapsdkplatform.comapi.map.w wVar : this.b.e()) {
                if (wVar.a.a == i) {
                    if (wVar.a.j || wVar.a.l == 2 || wVar.a.l == 3 || wVar.a.l == 6) {
                        return this.b.b(i);
                    }
                    return false;
                }
            }
        }
        return this.b.a(i);
    }

    public boolean update(int i) {
        com.baidu.mapsdkplatform.comapi.map.t tVar = this.b;
        if (tVar != null && tVar.e() != null) {
            for (com.baidu.mapsdkplatform.comapi.map.w wVar : this.b.e()) {
                if (wVar.a.a == i) {
                    if (!wVar.a.j) {
                        break;
                    }
                    return this.b.f(i);
                }
            }
        }
        return false;
    }
}
