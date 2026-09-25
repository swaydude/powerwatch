package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public class DetailSearchInfo extends com.baidu.mapapi.cloud.BaseSearchInfo {
    public java.lang.String poiId;
    public int uid;

    public DetailSearchInfo() {
        this.a = com.baidu.mapapi.http.HttpClient.isHttpsEnable ? "https://api.map.baidu.com/geosearch/v2/detail/" : "http://api.map.baidu.com/geosearch/v2/detail/";
    }

    @Override // com.baidu.mapapi.cloud.BaseSearchInfo
    java.lang.String a() {
        java.lang.String str;
        if (this.uid == 0 && ((str = this.poiId) == null || str.equals(""))) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.a);
        java.lang.String str2 = this.poiId;
        if (str2 == null || str2.equals("")) {
            sb.append(this.uid);
        } else {
            sb.append(this.poiId);
        }
        sb.append('?');
        if (this.ak != null && !this.ak.equals("") && this.ak.length() <= 50) {
            sb.append("ak");
            sb.append("=");
            sb.append(this.ak);
            if (this.geoTableId != 0) {
                sb.append("&");
                sb.append("geotable_id");
                sb.append("=");
                sb.append(this.geoTableId);
                if (this.sn != null && !this.sn.equals("") && this.sn.length() <= 50) {
                    sb.append("&");
                    sb.append("sn");
                    sb.append("=");
                    sb.append(this.sn);
                }
                return sb.toString();
            }
        }
        return null;
    }
}
