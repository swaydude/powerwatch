package com.baidu.mapsdkplatform.comjni.map.basemap;

/* JADX INFO: loaded from: classes.dex */
public class BaseMapCallback {
    private static android.util.LongSparseArray<com.baidu.mapsdkplatform.comjni.map.basemap.b> a = new android.util.LongSparseArray<>();

    public static int ReqLayerData(android.os.Bundle bundle, long j, int i, android.os.Bundle bundle2) {
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.baidu.mapsdkplatform.comjni.map.basemap.b bVarValueAt = a.valueAt(i2);
            if (bVarValueAt != null && bVarValueAt.a(j)) {
                return bVarValueAt.a(bundle, j, i, bundle2);
            }
        }
        return 0;
    }

    public static void addLayerDataInterface(long j, com.baidu.mapsdkplatform.comjni.map.basemap.b bVar) {
        a.put(j, bVar);
    }

    public static void removeLayerDataInterface(long j) {
        a.remove(j);
    }
}
