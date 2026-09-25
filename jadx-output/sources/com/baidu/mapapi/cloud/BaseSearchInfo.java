package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseSearchInfo {
    java.lang.String a;
    public java.lang.String ak;
    public int geoTableId;
    public java.lang.String sn;

    java.lang.String a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.a);
        sb.append("?");
        java.lang.String str = this.ak;
        if (str != null && !str.equals("") && this.ak.length() <= 50) {
            sb.append("ak");
            sb.append("=");
            sb.append(this.ak);
            if (this.geoTableId != 0) {
                sb.append("&");
                sb.append("geotable_id");
                sb.append("=");
                sb.append(this.geoTableId);
                java.lang.String str2 = this.sn;
                if (str2 != null && !str2.equals("") && this.sn.length() <= 50) {
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
