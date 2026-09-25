package com.baidu.platform.base;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private com.baidu.platform.base.SearchType f;
    private com.baidu.mapapi.http.AsyncHttpClient b = new com.baidu.mapapi.http.AsyncHttpClient();
    private android.os.Handler c = new android.os.Handler(android.os.Looper.getMainLooper());
    protected final java.util.concurrent.locks.Lock a = new java.util.concurrent.locks.ReentrantLock();
    private boolean d = true;
    private com.baidu.mapapi.search.district.DistrictResult e = null;

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a(java.lang.String str) {
        byte[] urlNeedInfo = {102, 97, 105, 108, 100};
        try {
            urlNeedInfo = com.baidu.mapsdkplatform.comapi.util.AlgorithmUtil.getUrlNeedInfo(com.baidu.mapsdkplatform.comjni.util.AppMD5.getUrlNeedInfo(), com.baidu.mapsdkplatform.comjni.util.AppMD5.getUrlNeedInfo(), android.util.Base64.decode(str.getBytes(), 0));
        } catch (java.lang.Exception e) {
            android.util.Log.e("BaseSearch", "transform result failed", e);
        }
        return new java.lang.String(urlNeedInfo).trim();
    }

    private void a(com.baidu.mapapi.http.AsyncHttpClient asyncHttpClient, com.baidu.mapapi.http.HttpClient.ProtoResultCallback protoResultCallback, com.baidu.mapapi.search.core.SearchResult searchResult) {
        asyncHttpClient.get(new com.baidu.platform.core.a.c(((com.baidu.mapapi.search.district.DistrictResult) searchResult).getCityName()).a(this.f), protoResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.baidu.mapapi.http.HttpClient.HttpStateError httpStateError, com.baidu.platform.base.d dVar, java.lang.Object obj) {
        a(dVar.a("{SDK_InnerError:{httpStateError:" + httpStateError + "}}"), obj, dVar);
    }

    private void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj, com.baidu.platform.base.d dVar) {
        this.c.post(new com.baidu.platform.base.c(this, dVar, searchResult, obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, com.baidu.platform.base.d dVar, java.lang.Object obj, com.baidu.mapapi.http.AsyncHttpClient asyncHttpClient, com.baidu.mapapi.http.HttpClient.ProtoResultCallback protoResultCallback) {
        com.baidu.mapapi.search.core.SearchResult searchResultA = dVar.a(str);
        searchResultA.status = b(str);
        if (a(dVar, searchResultA)) {
            a(asyncHttpClient, protoResultCallback, searchResultA);
            return;
        }
        if (!(dVar instanceof com.baidu.platform.core.a.b)) {
            a(searchResultA, obj, dVar);
            return;
        }
        com.baidu.mapapi.search.district.DistrictResult districtResult = this.e;
        if (districtResult != null) {
            com.baidu.mapapi.search.district.DistrictResult districtResult2 = (com.baidu.mapapi.search.district.DistrictResult) searchResultA;
            districtResult2.setCityCode(districtResult.getCityCode());
            districtResult2.setCenterPt(this.e.getCenterPt());
        }
        a(searchResultA, obj, dVar);
        this.d = true;
        this.e = null;
        ((com.baidu.platform.core.a.b) dVar).a(false);
    }

    private boolean a(com.baidu.platform.base.d dVar, com.baidu.mapapi.search.core.SearchResult searchResult) {
        if (!(dVar instanceof com.baidu.platform.core.a.b)) {
            return false;
        }
        com.baidu.mapapi.search.district.DistrictResult districtResult = (com.baidu.mapapi.search.district.DistrictResult) searchResult;
        if (com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND != districtResult.error || districtResult.getCityName() == null || !this.d) {
            return false;
        }
        this.d = false;
        this.e = districtResult;
        ((com.baidu.platform.core.a.b) dVar).a(true);
        return true;
    }

    private int b(java.lang.String str) {
        org.json.JSONObject jSONObjectOptJSONObject;
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("status")) {
                    return jSONObject.getInt("status");
                }
                if (jSONObject.has("status_sp")) {
                    return jSONObject.getInt("status_sp");
                }
                if (!jSONObject.has("result") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("result")) == null) {
                    return 10204;
                }
                return jSONObjectOptJSONObject.optInt("error");
            } catch (org.json.JSONException unused) {
                android.util.Log.e("BaseSearch", "Create JSONObject failed when get response result status");
            }
        }
        return 10204;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(java.lang.String str) {
        int iPermissionCheck;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("status") || jSONObject.has("status_sp")) {
                int i = jSONObject.has("status") ? jSONObject.getInt("status") : jSONObject.getInt("status_sp");
                if ((i == 105 || i == 106) && (iPermissionCheck = com.baidu.mapsdkplatform.comapi.util.PermissionCheck.permissionCheck()) != 0) {
                    android.util.Log.e("BaseSearch", "permissionCheck result is: " + iPermissionCheck);
                }
            }
        } catch (org.json.JSONException e) {
            android.util.Log.e("BaseSearch", "Parse json happened exception", e);
        }
    }

    protected boolean a(com.baidu.platform.base.e eVar, java.lang.Object obj, com.baidu.platform.base.d dVar) {
        if (dVar == null) {
            android.util.Log.e(com.baidu.platform.base.a.class.getSimpleName(), "The SearchParser is null, must be applied.");
            return false;
        }
        com.baidu.platform.base.SearchType searchTypeA = dVar.a();
        this.f = searchTypeA;
        java.lang.String strA = eVar.a(searchTypeA);
        if (strA != null) {
            this.b.get(strA, new com.baidu.platform.base.b(this, dVar, obj));
            return true;
        }
        android.util.Log.e("BaseSearch", "The sendurl is: " + strA);
        a(dVar.a("{SDK_InnerError:{PermissionCheckError:Error}}"), obj, dVar);
        return false;
    }
}
