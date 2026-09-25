package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public class LocalSearchInfo extends com.baidu.mapapi.cloud.BaseCloudSearchInfo {
    public java.lang.String region;

    public LocalSearchInfo() {
        this.a = com.baidu.mapapi.http.HttpClient.isHttpsEnable ? "https://api.map.baidu.com/geosearch/v2/local" : "http://api.map.baidu.com/geosearch/v2/local";
    }

    @Override // com.baidu.mapapi.cloud.BaseCloudSearchInfo, com.baidu.mapapi.cloud.BaseSearchInfo
    java.lang.String a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (super.a() != null) {
            sb.append(super.a());
            java.lang.String str = this.region;
            if (str != null && !str.equals("") && this.region.length() <= 25) {
                sb.append("&");
                sb.append("region");
                sb.append("=");
                try {
                    sb.append(java.net.URLEncoder.encode(this.region, io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
                } catch (java.io.UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                return sb.toString();
            }
        }
        return null;
    }
}
