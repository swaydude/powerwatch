package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public class BoundSearchInfo extends com.baidu.mapapi.cloud.BaseCloudSearchInfo {
    public java.lang.String bound;

    public BoundSearchInfo() {
        this.a = com.baidu.mapapi.http.HttpClient.isHttpsEnable ? "https://api.map.baidu.com/geosearch/v2/bound" : "http://api.map.baidu.com/geosearch/v2/bound";
    }

    @Override // com.baidu.mapapi.cloud.BaseCloudSearchInfo, com.baidu.mapapi.cloud.BaseSearchInfo
    java.lang.String a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (super.a() != null) {
            sb.append(super.a());
            java.lang.String str = this.bound;
            if (str != null && !str.equals("")) {
                if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                    try {
                        java.lang.String[] strArrSplit = this.bound.split(";");
                        java.lang.String[] strArrSplit2 = strArrSplit[0].split(",");
                        java.lang.String[] strArrSplit3 = strArrSplit[1].split(",");
                        com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(java.lang.Double.parseDouble(strArrSplit2[1]), java.lang.Double.parseDouble(strArrSplit2[0]));
                        com.baidu.mapapi.model.LatLng latLng2 = new com.baidu.mapapi.model.LatLng(java.lang.Double.parseDouble(strArrSplit3[1]), java.lang.Double.parseDouble(strArrSplit3[0]));
                        com.baidu.mapapi.model.LatLng latLngGcjToBaidu = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(latLng);
                        com.baidu.mapapi.model.LatLng latLngGcjToBaidu2 = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(latLng2);
                        this.bound = latLngGcjToBaidu.longitude + "," + latLngGcjToBaidu.latitude + ";" + latLngGcjToBaidu2.longitude + "," + latLngGcjToBaidu2.latitude;
                    } catch (java.lang.Exception unused) {
                    }
                }
                sb.append("&");
                sb.append("bounds");
                sb.append("=");
                sb.append(this.bound);
                return sb.toString();
            }
        }
        return null;
    }
}
