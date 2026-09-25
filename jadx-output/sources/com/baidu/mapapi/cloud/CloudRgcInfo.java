package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public class CloudRgcInfo {
    public int geoTableId;
    public java.lang.String location;

    java.lang.String a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.baidu.mapapi.http.HttpClient.isHttpsEnable ? "https://api.map.baidu.com/sdkproxy/lbs_androidsdk/cloudrgc/v1" : "http://api.map.baidu.com/sdkproxy/lbs_androidsdk/cloudrgc/v1");
        sb.append('?');
        java.lang.String str = this.location;
        if (str != null && !str.equals("")) {
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                java.lang.String[] strArrSplit = this.location.split(",");
                try {
                    com.baidu.mapapi.model.LatLng latLngGcjToBaidu = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(new com.baidu.mapapi.model.LatLng(java.lang.Double.parseDouble(strArrSplit[0]), java.lang.Double.parseDouble(strArrSplit[1])));
                    this.location = latLngGcjToBaidu.latitude + "," + latLngGcjToBaidu.longitude;
                } catch (java.lang.Exception unused) {
                }
            }
            sb.append("location=" + this.location);
            if (this.geoTableId != 0) {
                sb.append("&geotable_id=" + this.geoTableId);
                sb.append("&coord_type=bd09ll&extensions=pois&from=android_map_sdk");
                return sb.toString();
            }
        }
        return null;
    }
}
