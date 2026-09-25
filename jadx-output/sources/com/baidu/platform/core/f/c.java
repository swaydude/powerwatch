package com.baidu.platform.core.f;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.baidu.platform.base.d {
    private static final java.lang.String b = "c";

    private com.baidu.mapapi.model.LatLng a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double dOptDouble = jSONObject.optDouble("lat");
        double dOptDouble2 = jSONObject.optDouble("lng");
        return com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(new com.baidu.mapapi.model.LatLng(dOptDouble, dOptDouble2)) : new com.baidu.mapapi.model.LatLng(dOptDouble, dOptDouble2);
    }

    private java.util.List<com.baidu.mapapi.search.core.PoiChildrenInfo> a(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() != 0) {
                com.baidu.mapapi.search.core.PoiChildrenInfo poiChildrenInfo = new com.baidu.mapapi.search.core.PoiChildrenInfo();
                poiChildrenInfo.setUid(jSONObjectOptJSONObject.optString("uid"));
                poiChildrenInfo.setName(jSONObjectOptJSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                poiChildrenInfo.setShowName(jSONObjectOptJSONObject.optString("show_name"));
                poiChildrenInfo.setTag(jSONObjectOptJSONObject.optString("tag"));
                poiChildrenInfo.setAddress(jSONObjectOptJSONObject.optString("address"));
                arrayList.add(poiChildrenInfo);
            }
        }
        return arrayList;
    }

    private boolean a(java.lang.String str, com.baidu.mapapi.search.sug.SuggestionResult suggestionResult) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.length() != 0) {
                int iOptInt = jSONObject.optInt("status");
                if (iOptInt == 0) {
                    return a(jSONObject, suggestionResult);
                }
                if (iOptInt != 1) {
                    errorno = iOptInt != 2 ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
                } else {
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                }
                suggestionResult.error = errorno;
                return false;
            }
        } catch (org.json.JSONException e) {
            android.util.Log.e(b, "Parse sug search error", e);
        }
        suggestionResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return false;
    }

    private boolean a(org.json.JSONObject jSONObject, com.baidu.mapapi.search.sug.SuggestionResult suggestionResult) {
        if (jSONObject != null && jSONObject.length() != 0) {
            suggestionResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("result");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                java.util.ArrayList<com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo> arrayList = new java.util.ArrayList<>();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArrayOptJSONArray.opt(i);
                    if (jSONObject2 != null && jSONObject2.length() != 0) {
                        com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo suggestionInfo = new com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo();
                        suggestionInfo.setKey(jSONObject2.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                        suggestionInfo.setCity(jSONObject2.optString("city"));
                        suggestionInfo.setDistrict(jSONObject2.optString("district"));
                        suggestionInfo.setUid(jSONObject2.optString("uid"));
                        suggestionInfo.setTag(jSONObject2.optString("tag"));
                        suggestionInfo.setAddress(jSONObject2.optString("address"));
                        suggestionInfo.setPt(a(jSONObject2.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION)));
                        org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("children");
                        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0) {
                            suggestionInfo.setPoiChildrenInfoList(a(jSONArrayOptJSONArray2));
                        }
                        arrayList.add(suggestionInfo);
                    }
                }
                suggestionResult.setSuggestionInfo(arrayList);
                return true;
            }
            suggestionResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno2;
        com.baidu.mapapi.search.sug.SuggestionResult suggestionResult = new com.baidu.mapapi.search.sug.SuggestionResult();
        if (str == null || str.isEmpty()) {
            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.length() != 0) {
                    if (jSONObject.has("SDK_InnerError")) {
                        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                        if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        } else if (jSONObjectOptJSONObject.has("httpStateError")) {
                            java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                            strOptString.hashCode();
                            if (strOptString.equals("NETWORK_ERROR")) {
                                errorno2 = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                            } else {
                                errorno2 = !strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR;
                            }
                            suggestionResult.error = errorno2;
                            return suggestionResult;
                        }
                    }
                    if (!a(str, suggestionResult, true)) {
                        a(str, suggestionResult);
                    }
                    return suggestionResult;
                }
                errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
            } catch (org.json.JSONException e) {
                android.util.Log.e(b, "Parse suggestion search result error", e);
            }
        }
        suggestionResult.error = errorno;
        return suggestionResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.sug.OnGetSuggestionResultListener)) {
            return;
        }
        ((com.baidu.mapapi.search.sug.OnGetSuggestionResultListener) obj).onGetSuggestionResult((com.baidu.mapapi.search.sug.SuggestionResult) searchResult);
    }
}
