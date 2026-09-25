package com.baidu.platform.core.a;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.baidu.platform.base.d {
    boolean b = false;
    java.lang.String c = null;

    private boolean a(java.lang.String str, com.baidu.mapapi.search.district.DistrictResult districtResult) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONArray jSONArrayOptJSONArray;
        org.json.JSONArray jSONArray;
        org.json.JSONArray jSONArrayOptJSONArray2;
        int length;
        if (str == null || "".equals(str) || districtResult == null) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("result");
            org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("city_result");
            if (jSONObjectOptJSONObject2 == null || jSONObjectOptJSONObject3 == null) {
                return false;
            }
            if (jSONObjectOptJSONObject2.optInt("error") != 0 || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT)) == null) {
                return false;
            }
            org.json.JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("sgeo");
            if (jSONObjectOptJSONObject4 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("geo_elements")) != null && jSONArrayOptJSONArray.length() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i = 0;
                while (i < jSONArrayOptJSONArray.length()) {
                    org.json.JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject5 == null || (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject5.optJSONArray("point")) == null || (length = jSONArrayOptJSONArray2.length()) <= 0) {
                        jSONArray = jSONArrayOptJSONArray;
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int i2 = 0;
                        int i3 = 0;
                        int i4 = 0;
                        for (length = jSONArrayOptJSONArray2.length(); i2 < length; length = length) {
                            int iOptInt = jSONArrayOptJSONArray2.optInt(i2);
                            if (i2 % 2 == 0) {
                                i4 += iOptInt;
                            } else {
                                i3 += iOptInt;
                                arrayList2.add(com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(i3, i4)));
                            }
                            i2++;
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                            jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                        }
                        jSONArray = jSONArrayOptJSONArray;
                        arrayList.add(arrayList2);
                    }
                    i++;
                    jSONArrayOptJSONArray = jSONArray;
                }
                if (arrayList.size() > 0) {
                    districtResult.setPolylines(arrayList);
                    districtResult.setCenterPt(com.baidu.mapapi.model.CoordUtil.decodeLocation(jSONObjectOptJSONObject.optString("geo")));
                    districtResult.setCityCode(jSONObjectOptJSONObject.optInt("code"));
                    districtResult.setCityName(jSONObjectOptJSONObject.optString("cname"));
                    districtResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
                    return true;
                }
            }
            districtResult.setCityName(jSONObjectOptJSONObject.optString("uid"));
            this.c = jSONObjectOptJSONObject.optString("cname");
            districtResult.setCenterPt(com.baidu.mapapi.model.CoordUtil.decodeLocation(jSONObjectOptJSONObject.optString("geo")));
            districtResult.setCityCode(jSONObjectOptJSONObject.optInt("code"));
            return false;
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean b(java.lang.String str, com.baidu.mapapi.search.district.DistrictResult districtResult) {
        java.util.List<java.util.List<com.baidu.mapapi.model.LatLng>> listDecodeLocationList2D;
        if (str != null && !str.equals("") && districtResult != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT);
                if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject2 == null || jSONObjectOptJSONObject.optInt("error") != 0) {
                    return false;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (this.c != null) {
                    try {
                        listDecodeLocationList2D = com.baidu.mapapi.model.CoordUtil.decodeLocationList2D(jSONObjectOptJSONObject2.optString("geo"));
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                        listDecodeLocationList2D = null;
                    }
                } else {
                    listDecodeLocationList2D = null;
                }
                if (listDecodeLocationList2D != null) {
                    for (java.util.List<com.baidu.mapapi.model.LatLng> list : listDecodeLocationList2D) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator<com.baidu.mapapi.model.LatLng> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(it.next());
                        }
                        arrayList.add(arrayList2);
                    }
                }
                if (arrayList.size() > 0) {
                    districtResult.setPolylines(arrayList);
                }
                districtResult.setCityName(this.c);
                districtResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
                this.c = null;
                return true;
            } catch (org.json.JSONException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.district.DistrictResult districtResult = new com.baidu.mapapi.search.district.DistrictResult();
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("SDK_InnerError")) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                    if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        districtResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        return districtResult;
                    }
                    if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno = strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        }
                        districtResult.error = errorno;
                        return districtResult;
                    }
                }
                if (!a(str, districtResult, false)) {
                    if (this.b) {
                        b(str, districtResult);
                    } else if (!a(str, districtResult)) {
                        districtResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                    }
                }
                return districtResult;
            } catch (java.lang.Exception unused) {
            }
        }
        districtResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return districtResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.district.OnGetDistricSearchResultListener)) {
            return;
        }
        ((com.baidu.mapapi.search.district.OnGetDistricSearchResultListener) obj).onGetDistrictResult((com.baidu.mapapi.search.district.DistrictResult) searchResult);
    }

    public void a(boolean z) {
        this.b = z;
    }
}
