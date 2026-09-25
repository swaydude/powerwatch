package com.baidu.platform.core.c;

/* JADX INFO: loaded from: classes.dex */
public class g extends com.baidu.platform.base.d {
    private static final java.lang.String b = "g";
    private int c;
    private int d;

    g(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    private com.baidu.mapapi.model.LatLng a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double dOptDouble = jSONObject.optDouble("lat");
        double dOptDouble2 = jSONObject.optDouble("lng");
        return com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(new com.baidu.mapapi.model.LatLng(dOptDouble, dOptDouble2)) : new com.baidu.mapapi.model.LatLng(dOptDouble, dOptDouble2);
    }

    private boolean a(java.lang.String str, com.baidu.mapapi.search.poi.PoiResult poiResult) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        if (str != null && !str.equals("") && !str.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                int iOptInt = jSONObject.optInt("status");
                if (iOptInt == 0) {
                    return a(jSONObject, poiResult);
                }
                if (iOptInt != 1) {
                    errorno = iOptInt != 2 ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
                } else {
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                }
                poiResult.error = errorno;
                return false;
            } catch (org.json.JSONException e) {
                android.util.Log.e(b, "Parse poi search failed", e);
                poiResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
            }
        }
        return false;
    }

    private boolean a(org.json.JSONObject jSONObject, com.baidu.mapapi.search.poi.PoiResult poiResult) {
        if (jSONObject != null && jSONObject.length() != 0) {
            poiResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("results");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int iOptInt = jSONObject.optInt("total");
                poiResult.setTotalPoiNum(iOptInt);
                int length = jSONArrayOptJSONArray.length();
                poiResult.setCurrentPageCapacity(length);
                poiResult.setCurrentPageNum(this.c);
                if (length != 0) {
                    int i = this.d;
                    poiResult.setTotalPageNum((iOptInt / i) + (iOptInt % i > 0 ? 1 : 0));
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArrayOptJSONArray.opt(i2);
                    if (jSONObject2 != null && jSONObject2.length() != 0) {
                        com.baidu.mapapi.search.core.PoiInfo poiInfo = new com.baidu.mapapi.search.core.PoiInfo();
                        poiInfo.setName(jSONObject2.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                        poiInfo.setAddress(jSONObject2.optString("address"));
                        poiInfo.setProvince(jSONObject2.optString("province"));
                        poiInfo.setCity(jSONObject2.optString("city"));
                        poiInfo.setArea(jSONObject2.optString("area"));
                        poiInfo.setStreetId(jSONObject2.optString("street_id"));
                        poiInfo.setUid(jSONObject2.optString("uid"));
                        poiInfo.setPhoneNum(jSONObject2.optString("telephone"));
                        poiInfo.setDetail(jSONObject2.optInt("detail"));
                        poiInfo.setLocation(a(jSONObject2.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION)));
                        java.lang.String strOptString = jSONObject2.optString("detail_info");
                        if (strOptString != null && strOptString.length() != 0) {
                            poiInfo.setPoiDetailInfo(b(strOptString));
                        }
                        arrayList.add(poiInfo);
                    }
                }
                poiResult.setPoiInfo(arrayList);
                return true;
            }
            poiResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        }
        return false;
    }

    private com.baidu.mapapi.search.core.PoiDetailInfo b(java.lang.String str) {
        com.baidu.mapapi.search.core.PoiDetailInfo poiDetailInfo = new com.baidu.mapapi.search.core.PoiDetailInfo();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.length() == 0) {
                return null;
            }
            poiDetailInfo.setDistance(jSONObject.optInt("distance", 0));
            poiDetailInfo.setTag(jSONObject.optString("tag"));
            poiDetailInfo.setDetailUrl(jSONObject.optString("detail_url"));
            poiDetailInfo.setType(jSONObject.optString("type"));
            poiDetailInfo.setPrice(jSONObject.optDouble(com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE, 0.0d));
            poiDetailInfo.setOverallRating(jSONObject.optDouble("overall_rating", 0.0d));
            poiDetailInfo.setTasteRating(jSONObject.optDouble("taste_rating", 0.0d));
            poiDetailInfo.setServiceRating(jSONObject.optDouble("service_rating", 0.0d));
            poiDetailInfo.setEnvironmentRating(jSONObject.optDouble("environment_rating", 0.0d));
            poiDetailInfo.setFacilityRating(jSONObject.optDouble("facility_rating", 0.0d));
            poiDetailInfo.setHygieneRating(jSONObject.optDouble("hygiene_rating", 0.0d));
            poiDetailInfo.setTechnologyRating(jSONObject.optDouble("technology_rating", 0.0d));
            poiDetailInfo.setImageNum(jSONObject.optInt("image_num"));
            poiDetailInfo.setGrouponNum(jSONObject.optInt("groupon_num"));
            poiDetailInfo.setCommentNum(jSONObject.optInt("comment_num"));
            poiDetailInfo.setDiscountNum(jSONObject.optInt("discount_num"));
            poiDetailInfo.setFavoriteNum(jSONObject.optInt("favorite_num"));
            poiDetailInfo.setCheckinNum(jSONObject.optInt("checkin_num"));
            poiDetailInfo.setShopHours(jSONObject.optString("shop_hours"));
            poiDetailInfo.naviLocation = a(jSONObject.optJSONObject("navi_location"));
            com.baidu.platform.base.SearchType searchTypeA = a();
            if (com.baidu.platform.base.SearchType.POI_IN_CITY_SEARCH == searchTypeA || com.baidu.platform.base.SearchType.POI_NEAR_BY_SEARCH == searchTypeA) {
                poiDetailInfo.setPoiChildrenInfoList(b(jSONObject));
            }
            return poiDetailInfo;
        } catch (org.json.JSONException e) {
            android.util.Log.e(b, "Parse poi search detail info failed", e);
            return null;
        }
    }

    private java.util.List<com.baidu.mapapi.search.core.PoiChildrenInfo> b(org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() != 0) {
                com.baidu.mapapi.search.core.PoiChildrenInfo poiChildrenInfo = new com.baidu.mapapi.search.core.PoiChildrenInfo();
                poiChildrenInfo.setUid(jSONObjectOptJSONObject.optString("uid"));
                poiChildrenInfo.setName(jSONObjectOptJSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                poiChildrenInfo.setShowName(jSONObjectOptJSONObject.optString("show_name"));
                poiChildrenInfo.setTag(jSONObjectOptJSONObject.optString("tag"));
                poiChildrenInfo.setLocation(a(jSONObjectOptJSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION)));
                poiChildrenInfo.setAddress(jSONObjectOptJSONObject.optString("address"));
                arrayList.add(poiChildrenInfo);
            }
        }
        return arrayList;
    }

    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno2;
        com.baidu.mapapi.search.poi.PoiResult poiResult = new com.baidu.mapapi.search.poi.PoiResult();
        if (str == null || str.equals("") || str.isEmpty()) {
            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
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
                        poiResult.error = errorno2;
                        return poiResult;
                    }
                }
                if (a(str, poiResult, false)) {
                    return poiResult;
                }
                poiResult.error = a(str, poiResult) ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return poiResult;
            } catch (org.json.JSONException e) {
                android.util.Log.e(b, "Parse poi search error", e);
                errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
            }
        }
        poiResult.error = errorno;
        return poiResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener)) {
            return;
        }
        int i = com.baidu.platform.core.c.h.a[a().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            ((com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener) obj).onGetPoiResult((com.baidu.mapapi.search.poi.PoiResult) searchResult);
        }
    }
}
