package com.baidu.platform.util;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.baidu.platform.util.ParamBuilder<com.baidu.platform.util.a> {
    protected java.util.Map<java.lang.String, java.lang.String> a;

    public com.baidu.platform.util.a a(java.lang.String str, java.lang.String str2) {
        if (this.a == null) {
            this.a = new java.util.LinkedHashMap();
        }
        this.a.put(str, str2);
        return this;
    }

    public java.lang.String a() {
        java.lang.StringBuilder sb;
        java.util.Map<java.lang.String, java.lang.String> map = this.a;
        if (map == null || map.isEmpty()) {
            return null;
        }
        java.lang.String str = new java.lang.String();
        int i = 0;
        for (java.lang.String str2 : this.a.keySet()) {
            java.lang.String strEncodeUrlParamsValue = com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(this.a.get(str2));
            if (i == 0) {
                sb = new java.lang.StringBuilder();
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(str);
                str = "&";
            }
            sb.append(str);
            sb.append(str2);
            sb.append("=");
            sb.append(strEncodeUrlParamsValue);
            str = sb.toString();
            i++;
        }
        return str;
    }
}
