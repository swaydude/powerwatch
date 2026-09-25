package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCloudSearchInfo extends com.baidu.mapapi.cloud.BaseSearchInfo {
    public java.lang.String filter;
    public int pageIndex;
    public int pageSize = 10;
    public java.lang.String q;
    public java.lang.String sortby;
    public java.lang.String tags;

    @Override // com.baidu.mapapi.cloud.BaseSearchInfo
    java.lang.String a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (super.a() == null) {
            return null;
        }
        sb.append(super.a());
        java.lang.String str = this.q;
        if (str != null && !str.equals("") && this.q.length() <= 45) {
            sb.append("&");
            sb.append("q");
            sb.append("=");
            try {
                sb.append(java.net.URLEncoder.encode(this.q, io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
            } catch (java.io.UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        java.lang.String str2 = this.tags;
        if (str2 != null && !str2.equals("") && this.tags.length() <= 45) {
            sb.append("&");
            sb.append("tags");
            sb.append("=");
            try {
                sb.append(java.net.URLEncoder.encode(this.tags, io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
            } catch (java.io.UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        java.lang.String str3 = this.sortby;
        if (str3 != null && !str3.equals("")) {
            sb.append("&");
            sb.append("sortby");
            sb.append("=");
            sb.append(this.sortby);
        }
        java.lang.String str4 = this.filter;
        if (str4 != null && !str4.equals("")) {
            sb.append("&");
            sb.append("filter");
            sb.append("=");
            sb.append(this.filter);
        }
        if (this.pageIndex >= 0) {
            sb.append("&");
            sb.append("page_index");
            sb.append("=");
            sb.append(this.pageIndex);
        }
        int i = this.pageSize;
        if (i >= 0 && i <= 50) {
            sb.append("&");
            sb.append("page_size");
            sb.append("=");
            sb.append(this.pageSize);
        }
        return sb.toString();
    }
}
