package com.baidu.platform.core.c;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.baidu.platform.base.d {
    private boolean a(java.lang.String str, com.baidu.mapapi.search.poi.PoiIndoorResult poiIndoorResult) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                int iOptInt = jSONObject.optInt("errNo");
                if (iOptInt == 0) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        return false;
                    }
                    org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("poi_list");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        poiIndoorResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArrayOptJSONArray.opt(i);
                            if (jSONObject2 != null) {
                                com.baidu.mapapi.search.poi.PoiIndoorInfo poiIndoorInfo = new com.baidu.mapapi.search.poi.PoiIndoorInfo();
                                poiIndoorInfo.address = jSONObject2.optString("address");
                                poiIndoorInfo.bid = jSONObject2.optString("bd_id");
                                poiIndoorInfo.cid = jSONObject2.optInt("cid");
                                poiIndoorInfo.discount = jSONObject2.optInt("discount");
                                poiIndoorInfo.floor = jSONObject2.optString("floor");
                                poiIndoorInfo.name = jSONObject2.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                                poiIndoorInfo.phone = jSONObject2.optString("phone");
                                poiIndoorInfo.price = jSONObject2.optInt(com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE);
                                poiIndoorInfo.starLevel = jSONObject2.optInt("star_level");
                                poiIndoorInfo.tag = jSONObject2.optString("tag");
                                poiIndoorInfo.uid = jSONObject2.optString("uid");
                                poiIndoorInfo.groupNum = jSONObject2.optInt("tuan_nums");
                                int i2 = java.lang.Integer.parseInt(jSONObject2.optString("twp"));
                                if ((i2 & 1) == 1) {
                                    poiIndoorInfo.isGroup = true;
                                }
                                if ((i2 & 2) == 1) {
                                    poiIndoorInfo.isTakeOut = true;
                                }
                                if ((i2 & 4) == 1) {
                                    poiIndoorInfo.isWaited = true;
                                }
                                poiIndoorInfo.latLng = com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(jSONObject2.optDouble("pt_y"), jSONObject2.optDouble("pt_x")));
                                arrayList.add(poiIndoorInfo);
                            }
                        }
                        poiIndoorResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
                        poiIndoorResult.setmArrayPoiInfo(arrayList);
                    }
                    poiIndoorResult.pageNum = jSONObjectOptJSONObject.optInt("page_num");
                    poiIndoorResult.poiNum = jSONObjectOptJSONObject.optInt("poi_num");
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
                } else {
                    if (iOptInt != 1) {
                        if (iOptInt != 5) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.POIINDOOR_SERVER_ERROR;
                        }
                        return false;
                    }
                    java.lang.String strOptString = jSONObject.optString("Msg");
                    if (!strOptString.contains("bid")) {
                        if (strOptString.contains("floor")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.POIINDOOR_FLOOR_ERROR;
                        }
                        return false;
                    }
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.POIINDOOR_BID_ERROR;
                }
                poiIndoorResult.error = errorno;
                return true;
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.poi.PoiIndoorResult poiIndoorResult = new com.baidu.mapapi.search.poi.PoiIndoorResult();
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("SDK_InnerError")) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                    if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        poiIndoorResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        return poiIndoorResult;
                    }
                    if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno = strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        }
                        poiIndoorResult.error = errorno;
                        return poiIndoorResult;
                    }
                }
                if (!a(str, poiIndoorResult, false) && !a(str, poiIndoorResult)) {
                    poiIndoorResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                }
                return poiIndoorResult;
            } catch (java.lang.Exception unused) {
            }
        }
        poiIndoorResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return poiIndoorResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener)) {
            return;
        }
        ((com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener) obj).onGetPoiIndoorResult((com.baidu.mapapi.search.poi.PoiIndoorResult) searchResult);
    }
}
