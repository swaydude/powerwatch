package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public class NearbySearchInfo extends com.baidu.mapapi.cloud.BaseCloudSearchInfo {
    public java.lang.String location;
    public int radius;

    public NearbySearchInfo() {
        this.a = com.baidu.mapapi.http.HttpClient.isHttpsEnable ? "https://api.map.baidu.com/geosearch/v2/nearby" : "http://api.map.baidu.com/geosearch/v2/nearby";
        this.radius = 1000;
    }

    @Override // com.baidu.mapapi.cloud.BaseCloudSearchInfo, com.baidu.mapapi.cloud.BaseSearchInfo
    java.lang.String a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (super.a() != null) {
            sb.append(super.a());
            java.lang.String str = this.location;
            if (str != null && !str.equals("")) {
                if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                    java.lang.String[] strArrSplit = this.location.split(",");
                    try {
                        com.baidu.mapapi.model.LatLng latLngGcjToBaidu = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(new com.baidu.mapapi.model.LatLng(java.lang.Double.parseDouble(strArrSplit[1]), java.lang.Double.parseDouble(strArrSplit[0])));
                        this.location = latLngGcjToBaidu.longitude + "," + latLngGcjToBaidu.latitude;
                    } catch (java.lang.Exception unused) {
                    }
                }
                sb.append("&");
                sb.append(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
                sb.append("=");
                sb.append(this.location);
                if (this.radius >= 0) {
                    sb.append("&");
                    sb.append("radius");
                    sb.append("=");
                    sb.append(this.radius);
                }
                return sb.toString();
            }
        }
        return null;
    }
}
