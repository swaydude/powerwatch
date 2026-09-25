package com.baidu.platform.core.c;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.baidu.platform.base.d {
    private static final java.lang.String b = "d";
    private boolean c = false;

    private com.baidu.mapapi.model.LatLng a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double dOptDouble = jSONObject.optDouble("lat");
        double dOptDouble2 = jSONObject.optDouble("lng");
        return com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(new com.baidu.mapapi.model.LatLng(dOptDouble, dOptDouble2)) : new com.baidu.mapapi.model.LatLng(dOptDouble, dOptDouble2);
    }

    private boolean a(java.lang.String str, com.baidu.mapapi.search.core.SearchResult searchResult) {
        org.json.JSONArray jSONArrayOptJSONArray;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.length() == 0 || jSONObject.optInt("status") != 0 || (jSONArrayOptJSONArray = jSONObject.optJSONArray("result")) == null || jSONArrayOptJSONArray.length() == 0) {
                return false;
            }
            return this.c ? a(jSONArrayOptJSONArray, (com.baidu.mapapi.search.poi.PoiDetailSearchResult) searchResult) : a(jSONArrayOptJSONArray, (com.baidu.mapapi.search.poi.PoiDetailResult) searchResult);
        } catch (org.json.JSONException e) {
            android.util.Log.e(b, "Parse detail search result error", e);
            return false;
        }
    }

    private boolean a(org.json.JSONArray jSONArray, com.baidu.mapapi.search.poi.PoiDetailResult poiDetailResult) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.opt(0);
        if (jSONObject == null || jSONObject.length() == 0) {
            return false;
        }
        poiDetailResult.setName(jSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
        poiDetailResult.setLocation(a(jSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION)));
        poiDetailResult.setAddress(jSONObject.optString("address"));
        poiDetailResult.setTelephone(jSONObject.optString("telephone"));
        poiDetailResult.setUid(jSONObject.optString("uid"));
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("detail_info");
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() != 0) {
            poiDetailResult.setTag(jSONObjectOptJSONObject.optString("tag"));
            poiDetailResult.setDetailUrl(jSONObjectOptJSONObject.optString("detail_url"));
            poiDetailResult.setType(jSONObjectOptJSONObject.optString("type"));
            poiDetailResult.setPrice(jSONObjectOptJSONObject.optDouble(com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE, 0.0d));
            poiDetailResult.setOverallRating(jSONObjectOptJSONObject.optDouble("overall_rating", 0.0d));
            poiDetailResult.setTasteRating(jSONObjectOptJSONObject.optDouble("taste_rating", 0.0d));
            poiDetailResult.setServiceRating(jSONObjectOptJSONObject.optDouble("service_rating", 0.0d));
            poiDetailResult.setEnvironmentRating(jSONObjectOptJSONObject.optDouble("environment_rating", 0.0d));
            poiDetailResult.setFacilityRating(jSONObjectOptJSONObject.optDouble("facility_rating", 0.0d));
            poiDetailResult.setHygieneRating(jSONObjectOptJSONObject.optDouble("hygiene_rating", 0.0d));
            poiDetailResult.setTechnologyRating(jSONObjectOptJSONObject.optDouble("technology_rating", 0.0d));
            poiDetailResult.setImageNum(jSONObjectOptJSONObject.optInt("image_num"));
            poiDetailResult.setGrouponNum(jSONObjectOptJSONObject.optInt("groupon_num", 0));
            poiDetailResult.setCommentNum(jSONObjectOptJSONObject.optInt("comment_num", 0));
            poiDetailResult.setDiscountNum(jSONObjectOptJSONObject.optInt("discount_num", 0));
            poiDetailResult.setFavoriteNum(jSONObjectOptJSONObject.optInt("favorite_num", 0));
            poiDetailResult.setCheckinNum(jSONObjectOptJSONObject.optInt("checkin_num", 0));
            poiDetailResult.setShopHours(jSONObjectOptJSONObject.optString("shop_hours"));
        }
        poiDetailResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
        return true;
    }

    private boolean a(org.json.JSONArray jSONArray, com.baidu.mapapi.search.poi.PoiDetailSearchResult poiDetailSearchResult) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.opt(i);
            if (jSONObject != null && jSONObject.length() != 0) {
                com.baidu.mapapi.search.core.PoiDetailInfo poiDetailInfo = new com.baidu.mapapi.search.core.PoiDetailInfo();
                poiDetailInfo.setName(jSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                poiDetailInfo.setLocation(a(jSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION)));
                poiDetailInfo.setAddress(jSONObject.optString("address"));
                poiDetailInfo.setProvince(jSONObject.optString("province"));
                poiDetailInfo.setCity(jSONObject.optString("city"));
                poiDetailInfo.setArea(jSONObject.optString("area"));
                poiDetailInfo.setTelephone(jSONObject.optString("telephone"));
                poiDetailInfo.setUid(jSONObject.optString("uid"));
                poiDetailInfo.setStreetId(jSONObject.optString("setStreetId"));
                poiDetailInfo.setDetail(jSONObject.optString("detail"));
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("detail_info");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() != 0) {
                    poiDetailInfo.setDistance(jSONObjectOptJSONObject.optInt("distance", 0));
                    poiDetailInfo.setType(jSONObjectOptJSONObject.optString("type"));
                    poiDetailInfo.setTag(jSONObjectOptJSONObject.optString("tag"));
                    poiDetailInfo.setDetailUrl(jSONObjectOptJSONObject.optString("detail_url"));
                    poiDetailInfo.setPrice(jSONObjectOptJSONObject.optDouble(com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE, 0.0d));
                    poiDetailInfo.setShopHours(jSONObjectOptJSONObject.optString("shop_hours"));
                    poiDetailInfo.setOverallRating(jSONObjectOptJSONObject.optDouble("overall_rating", 0.0d));
                    poiDetailInfo.setTasteRating(jSONObjectOptJSONObject.optDouble("taste_rating", 0.0d));
                    poiDetailInfo.setServiceRating(jSONObjectOptJSONObject.optDouble("service_rating", 0.0d));
                    poiDetailInfo.setEnvironmentRating(jSONObjectOptJSONObject.optDouble("environment_rating", 0.0d));
                    poiDetailInfo.setFacilityRating(jSONObjectOptJSONObject.optDouble("facility_rating", 0.0d));
                    poiDetailInfo.setHygieneRating(jSONObjectOptJSONObject.optDouble("hygiene_rating", 0.0d));
                    poiDetailInfo.setTechnologyRating(jSONObjectOptJSONObject.optDouble("technology_rating", 0.0d));
                    poiDetailInfo.setImageNum(jSONObjectOptJSONObject.optInt("image_num"));
                    poiDetailInfo.setGrouponNum(jSONObjectOptJSONObject.optInt("groupon_num", 0));
                    poiDetailInfo.setCommentNum(jSONObjectOptJSONObject.optInt("comment_num", 0));
                    poiDetailInfo.setDiscountNum(jSONObjectOptJSONObject.optInt("discount_num", 0));
                    poiDetailInfo.setFavoriteNum(jSONObjectOptJSONObject.optInt("favorite_num", 0));
                    poiDetailInfo.setCheckinNum(jSONObjectOptJSONObject.optInt("checkin_num", 0));
                }
                arrayList.add(poiDetailInfo);
            }
        }
        poiDetailSearchResult.setPoiDetailInfoList(arrayList);
        poiDetailSearchResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
        return true;
    }

    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno2;
        com.baidu.mapapi.search.core.SearchResult poiDetailSearchResult = this.c ? new com.baidu.mapapi.search.poi.PoiDetailSearchResult() : new com.baidu.mapapi.search.poi.PoiDetailResult();
        if (str == null || str.isEmpty()) {
            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.length() == 0) {
                    poiDetailSearchResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                    return poiDetailSearchResult;
                }
                if (!jSONObject.has("SDK_InnerError")) {
                    if (!a(str, poiDetailSearchResult)) {
                        poiDetailSearchResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                    }
                    return poiDetailSearchResult;
                }
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() != 0) {
                    if (!jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        if (jSONObjectOptJSONObject.has("httpStateError")) {
                            java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                            strOptString.hashCode();
                            if (strOptString.equals("NETWORK_ERROR")) {
                                errorno2 = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                            } else {
                                errorno2 = !strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR;
                            }
                            poiDetailSearchResult.error = errorno2;
                        }
                        return poiDetailSearchResult;
                    }
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                }
            } catch (org.json.JSONException e) {
                android.util.Log.e(b, "Parse detail search result failed", e);
            }
            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        }
        poiDetailSearchResult.error = errorno;
        return poiDetailSearchResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener)) {
            return;
        }
        com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener onGetPoiSearchResultListener = (com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener) obj;
        if (this.c) {
            onGetPoiSearchResultListener.onGetPoiDetailResult((com.baidu.mapapi.search.poi.PoiDetailSearchResult) searchResult);
        } else {
            onGetPoiSearchResultListener.onGetPoiDetailResult((com.baidu.mapapi.search.poi.PoiDetailResult) searchResult);
        }
    }

    void a(boolean z) {
        this.c = z;
    }
}
