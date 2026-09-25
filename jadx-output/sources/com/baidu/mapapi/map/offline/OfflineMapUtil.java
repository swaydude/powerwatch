package com.baidu.mapapi.map.offline;

/* JADX INFO: loaded from: classes.dex */
public class OfflineMapUtil {
    public static com.baidu.mapapi.map.offline.MKOLSearchRecord getSearchRecordFromLocalCityInfo(com.baidu.mapsdkplatform.comapi.map.s sVar) {
        if (sVar == null) {
            return null;
        }
        com.baidu.mapapi.map.offline.MKOLSearchRecord mKOLSearchRecord = new com.baidu.mapapi.map.offline.MKOLSearchRecord();
        mKOLSearchRecord.cityID = sVar.a;
        mKOLSearchRecord.cityName = sVar.b;
        mKOLSearchRecord.cityType = sVar.d;
        long j = 0;
        if (sVar.a() != null) {
            java.util.ArrayList<com.baidu.mapapi.map.offline.MKOLSearchRecord> arrayList = new java.util.ArrayList<>();
            for (com.baidu.mapsdkplatform.comapi.map.s sVar2 : sVar.a()) {
                arrayList.add(getSearchRecordFromLocalCityInfo(sVar2));
                j += (long) sVar2.c;
                mKOLSearchRecord.childCities = arrayList;
            }
        }
        if (mKOLSearchRecord.cityType != 1) {
            j = sVar.c;
        }
        mKOLSearchRecord.dataSize = j;
        return mKOLSearchRecord;
    }

    public static com.baidu.mapapi.map.offline.MKOLUpdateElement getUpdatElementFromLocalMapElement(com.baidu.mapsdkplatform.comapi.map.v vVar) {
        if (vVar == null) {
            return null;
        }
        com.baidu.mapapi.map.offline.MKOLUpdateElement mKOLUpdateElement = new com.baidu.mapapi.map.offline.MKOLUpdateElement();
        mKOLUpdateElement.cityID = vVar.a;
        mKOLUpdateElement.cityName = vVar.b;
        if (vVar.g != null) {
            mKOLUpdateElement.geoPt = com.baidu.mapapi.model.CoordUtil.mc2ll(vVar.g);
        }
        mKOLUpdateElement.level = vVar.e;
        mKOLUpdateElement.ratio = vVar.i;
        mKOLUpdateElement.serversize = vVar.h;
        mKOLUpdateElement.size = vVar.i == 100 ? vVar.h : (vVar.h / 100) * vVar.i;
        mKOLUpdateElement.status = vVar.l;
        mKOLUpdateElement.update = vVar.j;
        return mKOLUpdateElement;
    }
}
