package com.baidu.platform.core.b;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.baidu.platform.base.d {
    private static final java.lang.String b = "b";
    private java.lang.String c;

    private com.baidu.mapapi.model.LatLng a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double dOptDouble = jSONObject.optDouble("lat");
        double dOptDouble2 = jSONObject.optDouble("lng");
        return com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(new com.baidu.mapapi.model.LatLng(dOptDouble, dOptDouble2)) : new com.baidu.mapapi.model.LatLng(dOptDouble, dOptDouble2);
    }

    private boolean a(java.lang.String str, com.baidu.mapapi.search.geocode.GeoCodeResult geoCodeResult) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        if (android.text.TextUtils.isEmpty(str) || geoCodeResult == null) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int iOptInt = jSONObject.optInt("status");
            if (iOptInt != 0) {
                if (iOptInt != 1) {
                    errorno = iOptInt != 2 ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
                } else {
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                }
                geoCodeResult.error = errorno;
                return false;
            }
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
            if (jSONObjectOptJSONObject == null) {
                geoCodeResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return false;
            }
            geoCodeResult.setLocation(a(jSONObjectOptJSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION)));
            geoCodeResult.setAddress(this.c);
            geoCodeResult.setPrecise(jSONObjectOptJSONObject.optInt("precise"));
            geoCodeResult.setConfidence(jSONObjectOptJSONObject.optInt("confidence"));
            geoCodeResult.setLevel(jSONObjectOptJSONObject.optString(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL));
            geoCodeResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
            return true;
        } catch (org.json.JSONException e) {
            geoCodeResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
            android.util.Log.e(b, "Parse GeoCodeResult catch JSONException", e);
            return true;
        }
    }

    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno2;
        com.baidu.mapapi.search.geocode.GeoCodeResult geoCodeResult = new com.baidu.mapapi.search.geocode.GeoCodeResult();
        if (str == null || str.equals("")) {
            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (!jSONObject.has("SDK_InnerError")) {
                    if (!a(str, geoCodeResult, false) && !a(str, geoCodeResult)) {
                        geoCodeResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                    }
                    return geoCodeResult;
                }
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                } else {
                    if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        strOptString.hashCode();
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno2 = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno2 = !strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR;
                        }
                        geoCodeResult.error = errorno2;
                        return geoCodeResult;
                    }
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                }
            } catch (org.json.JSONException e) {
                android.util.Log.e(b, "JSONException caught", e);
            }
        }
        geoCodeResult.error = errorno;
        return geoCodeResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener)) {
            return;
        }
        ((com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener) obj).onGetGeoCodeResult((com.baidu.mapapi.search.geocode.GeoCodeResult) searchResult);
    }

    public void b(java.lang.String str) {
        this.c = str;
    }
}
