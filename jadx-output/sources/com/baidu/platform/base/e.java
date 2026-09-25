package com.baidu.platform.base;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    private boolean b = true;
    private boolean c = true;
    protected com.baidu.platform.util.a a = new com.baidu.platform.util.a();

    private java.lang.String a(com.baidu.platform.base.SearchType searchType, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return com.baidu.platform.base.SearchType.REVERSE_GEO_CODER == searchType ? a(str) : str;
    }

    private java.lang.String a(java.lang.String str) {
        java.lang.String strSubstring = str.substring(str.indexOf("location=") + 9, str.indexOf("&", str.indexOf("location=")));
        if (android.text.TextUtils.isEmpty(strSubstring)) {
            return str;
        }
        byte[] urlNeedInfo = {0};
        try {
            urlNeedInfo = com.baidu.mapsdkplatform.comapi.util.AlgorithmUtil.setUrlNeedInfo(com.baidu.mapsdkplatform.comjni.util.AppMD5.getUrlNeedInfo(), com.baidu.mapsdkplatform.comjni.util.AppMD5.getUrlNeedInfo(), strSubstring.getBytes());
        } catch (java.lang.Exception e) {
            android.util.Log.e("BaseSearch", "get location failed", e);
        }
        return str.replace(strSubstring, android.util.Base64.encodeToString(urlNeedInfo, 0).trim());
    }

    private boolean b(com.baidu.platform.base.SearchType searchType) {
        return com.baidu.platform.base.SearchType.REVERSE_GEO_CODER == searchType;
    }

    protected final java.lang.String a(com.baidu.mapapi.search.route.PlanNode planNode) {
        java.lang.StringBuilder sb;
        if (planNode == null) {
            return null;
        }
        java.lang.String str = new java.lang.String("{");
        com.baidu.mapapi.model.LatLng location = planNode.getLocation();
        if (location != null) {
            java.lang.String str2 = str + "\"type\":1,";
            com.baidu.mapapi.model.inner.Point pointLl2point = com.baidu.mapapi.model.CoordUtil.ll2point(location);
            sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append("\"xy\":\"");
            sb.append(pointLl2point.x);
            sb.append(",");
            sb.append(pointLl2point.y);
        } else {
            if (planNode.getName() == null) {
                return str;
            }
            sb = new java.lang.StringBuilder();
            sb.append(str + "\"type\":2,");
            sb.append("\"keyword\":\"");
            sb.append(planNode.getName());
        }
        sb.append("\"}");
        return sb.toString();
    }

    public java.lang.String a(com.baidu.platform.base.SearchType searchType) {
        java.lang.String strA = a(com.baidu.platform.domain.d.a());
        java.lang.String authToken = com.baidu.mapapi.http.HttpClient.getAuthToken();
        if (authToken == null) {
            android.util.Log.e("SearchRequest", "toUrlString get authtoken failed");
            int iPermissionCheck = com.baidu.mapsdkplatform.comapi.util.PermissionCheck.permissionCheck();
            if (iPermissionCheck != 0) {
                android.util.Log.e("SearchRequest", "try permissionCheck result is: " + iPermissionCheck);
                return null;
            }
            authToken = com.baidu.mapapi.http.HttpClient.getAuthToken();
        }
        if (this.b) {
            this.a.a("token", authToken);
        }
        java.lang.String strA2 = this.a.a();
        if (b(searchType)) {
            strA2 = a(searchType, strA2);
        }
        java.lang.String str = strA2 + com.baidu.mapapi.http.HttpClient.getPhoneInfo();
        if (this.c) {
            str = str + "&sign=" + com.baidu.mapsdkplatform.comjni.util.AppMD5.getSignMD5String(str);
        }
        return strA + "?" + str;
    }

    public abstract java.lang.String a(com.baidu.platform.domain.c cVar);

    public void a(boolean z) {
        this.c = z;
    }

    public void b(boolean z) {
        this.b = z;
    }
}
