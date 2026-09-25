package com.baidu.platform.core.e;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.baidu.platform.base.d {
    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno2;
        com.baidu.mapapi.search.share.ShareUrlResult shareUrlResult = new com.baidu.mapapi.search.share.ShareUrlResult();
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("SDK_InnerError")) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                    if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        shareUrlResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        return shareUrlResult;
                    }
                    if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno2 = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno2 = strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        }
                        shareUrlResult.error = errorno2;
                        return shareUrlResult;
                    }
                }
                if (!a(str, shareUrlResult, false)) {
                    if (str == null) {
                        shareUrlResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                    }
                    try {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
                        if (str != null) {
                            if (jSONObject2.optInt("status_sdk") != 0) {
                                errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                            } else {
                                shareUrlResult.setUrl(jSONObject2.optString("shorturl"));
                                shareUrlResult.setType(a().ordinal());
                                errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
                            }
                            shareUrlResult.error = errorno;
                        }
                    } catch (org.json.JSONException e) {
                        e.printStackTrace();
                        shareUrlResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                    }
                }
                return shareUrlResult;
            } catch (java.lang.Exception unused) {
            }
        }
        shareUrlResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return shareUrlResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.share.OnGetShareUrlResultListener)) {
            return;
        }
        ((com.baidu.mapapi.search.share.OnGetShareUrlResultListener) obj).onGetRouteShareUrlResult((com.baidu.mapapi.search.share.ShareUrlResult) searchResult);
    }
}
