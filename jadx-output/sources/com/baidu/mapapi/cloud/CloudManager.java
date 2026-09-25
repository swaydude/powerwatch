package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public class CloudManager {
    private static final java.lang.String a = "CloudManager";
    private static com.baidu.mapapi.cloud.CloudManager b;
    private com.baidu.platform.comjni.map.cloud.ICloudCenter c;

    private CloudManager() {
    }

    private boolean a(com.baidu.mapapi.cloud.BaseCloudSearchInfo baseCloudSearchInfo) {
        java.lang.String strA;
        if (baseCloudSearchInfo == null || (strA = baseCloudSearchInfo.a()) == null || strA.equals("")) {
            return false;
        }
        return this.c.a(strA);
    }

    public static com.baidu.mapapi.cloud.CloudManager getInstance() {
        if (b == null) {
            b = new com.baidu.mapapi.cloud.CloudManager();
        }
        return b;
    }

    public boolean boundSearch(com.baidu.mapapi.cloud.BoundSearchInfo boundSearchInfo) {
        return a(boundSearchInfo);
    }

    public void destroy() {
        if (this.c != null) {
            this.c = null;
            com.baidu.mapapi.BMapManager.destroy();
        }
    }

    public boolean detailSearch(com.baidu.mapapi.cloud.DetailSearchInfo detailSearchInfo) {
        java.lang.String strA;
        if (detailSearchInfo == null || (strA = detailSearchInfo.a()) == null || strA.equals("")) {
            return false;
        }
        return this.c.b(strA);
    }

    public void init() {
        if (this.c == null) {
            com.baidu.mapapi.BMapManager.init();
            this.c = new com.baidu.platform.comjni.map.cloud.a();
        }
    }

    public void init(com.baidu.mapapi.cloud.CloudListener cloudListener) {
        if (this.c == null) {
            com.baidu.mapapi.BMapManager.init();
            com.baidu.platform.comjni.map.cloud.a aVar = new com.baidu.platform.comjni.map.cloud.a();
            this.c = aVar;
            aVar.a(cloudListener);
        }
    }

    public boolean localSearch(com.baidu.mapapi.cloud.LocalSearchInfo localSearchInfo) {
        return a(localSearchInfo);
    }

    public boolean nearbySearch(com.baidu.mapapi.cloud.NearbySearchInfo nearbySearchInfo) {
        return a(nearbySearchInfo);
    }

    public void registerListener(com.baidu.mapapi.cloud.CloudListener cloudListener) {
        com.baidu.platform.comjni.map.cloud.ICloudCenter iCloudCenter = this.c;
        if (iCloudCenter == null) {
            return;
        }
        if (cloudListener == null) {
            throw new com.baidu.mapapi.common.BaiduMapSDKException("the CloudListener should not be null.");
        }
        iCloudCenter.a(cloudListener);
    }

    public boolean rgcSearch(com.baidu.mapapi.cloud.CloudRgcInfo cloudRgcInfo) {
        java.lang.String strA;
        if (cloudRgcInfo == null || (strA = cloudRgcInfo.a()) == null || strA.equals("")) {
            return false;
        }
        return this.c.c(strA);
    }

    public void unregisterListener() {
        com.baidu.platform.comjni.map.cloud.ICloudCenter iCloudCenter = this.c;
        if (iCloudCenter == null) {
            return;
        }
        iCloudCenter.a((com.baidu.mapapi.cloud.CloudListener) null);
    }
}
