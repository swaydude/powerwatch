package com.baidu.platform.core.b;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.baidu.platform.base.d {
    private com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo a(org.json.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo parentPoiInfo = new com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo();
        parentPoiInfo.setParentPoiAddress(jSONObject.optString("addr"));
        parentPoiInfo.setParentPoiDirection(jSONObject.optString("direction"));
        parentPoiInfo.setParentPoiDistance(jSONObject.optInt("distance"));
        parentPoiInfo.setParentPoiName(jSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
        parentPoiInfo.setParentPoiTag(jSONObject.optString("tag"));
        parentPoiInfo.setParentPoiUid(jSONObject.optString("uid"));
        parentPoiInfo.setParentPoiLocation(c(jSONObject, "point"));
        return parentPoiInfo;
    }

    private com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent a(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || android.text.TextUtils.isEmpty(str) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent addressComponent = new com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent();
        addressComponent.city = jSONObjectOptJSONObject.optString("city");
        addressComponent.setTown(jSONObjectOptJSONObject.optString("town"));
        addressComponent.district = jSONObjectOptJSONObject.optString("district");
        addressComponent.province = jSONObjectOptJSONObject.optString("province");
        addressComponent.adcode = jSONObjectOptJSONObject.optInt("adcode");
        addressComponent.street = jSONObjectOptJSONObject.optString("street");
        addressComponent.streetNumber = jSONObjectOptJSONObject.optString("street_number");
        addressComponent.countryName = jSONObjectOptJSONObject.optString("country");
        addressComponent.countryCode = jSONObjectOptJSONObject.optInt("country_code");
        addressComponent.setDirection(jSONObjectOptJSONObject.optString("direction"));
        addressComponent.setDistance(jSONObjectOptJSONObject.optString("distance"));
        return addressComponent;
    }

    private java.util.List<com.baidu.mapapi.search.core.PoiInfo> a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        org.json.JSONArray jSONArrayOptJSONArray;
        if (jSONObject == null || str == null || "".equals(str) || (jSONArrayOptJSONArray = jSONObject.optJSONArray(str)) == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                com.baidu.mapapi.search.core.PoiInfo poiInfo = new com.baidu.mapapi.search.core.PoiInfo();
                poiInfo.setAddress(jSONObjectOptJSONObject.optString("addr"));
                poiInfo.setPhoneNum(jSONObjectOptJSONObject.optString("tel"));
                poiInfo.setUid(jSONObjectOptJSONObject.optString("uid"));
                poiInfo.setPostCode(jSONObjectOptJSONObject.optString("zip"));
                poiInfo.setName(jSONObjectOptJSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                poiInfo.setLocation(c(jSONObjectOptJSONObject, "point"));
                poiInfo.setCity(str2);
                poiInfo.setDirection(jSONObjectOptJSONObject.optString("direction"));
                poiInfo.setDistance(jSONObjectOptJSONObject.optInt("distance"));
                poiInfo.setTag(jSONObjectOptJSONObject.optString("tag"));
                poiInfo.setParentPoi(a(jSONObjectOptJSONObject.optJSONObject("parent_poi")));
                arrayList.add(poiInfo);
            }
        }
        return arrayList;
    }

    private boolean a(java.lang.String str, com.baidu.mapapi.search.geocode.ReverseGeoCodeResult reverseGeoCodeResult) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    int iOptInt = jSONObject.optInt("status");
                    if (iOptInt == 0) {
                        if (a(jSONObject, reverseGeoCodeResult)) {
                            return true;
                        }
                        reverseGeoCodeResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                        return false;
                    }
                    if (iOptInt != 1) {
                        errorno = iOptInt != 2 ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
                    } else {
                        errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    reverseGeoCodeResult.error = errorno;
                    return false;
                }
            } catch (org.json.JSONException e) {
                e.printStackTrace();
                reverseGeoCodeResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return false;
            }
        }
        reverseGeoCodeResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
        return false;
    }

    private boolean a(org.json.JSONObject jSONObject, com.baidu.mapapi.search.geocode.ReverseGeoCodeResult reverseGeoCodeResult) {
        org.json.JSONObject jSONObjectOptJSONObject;
        java.lang.String str;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("result")) == null) {
            return false;
        }
        reverseGeoCodeResult.setCityCode(jSONObjectOptJSONObject.optInt("cityCode"));
        reverseGeoCodeResult.setAddress(jSONObjectOptJSONObject.optString("formatted_address"));
        reverseGeoCodeResult.setBusinessCircle(jSONObjectOptJSONObject.optString("business"));
        com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.AddressComponent addressComponentA = a(jSONObjectOptJSONObject, "addressComponent");
        reverseGeoCodeResult.setAddressDetail(addressComponentA);
        reverseGeoCodeResult.setLocation(d(jSONObjectOptJSONObject, com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION));
        if (addressComponentA != null) {
            str = addressComponentA.city;
            reverseGeoCodeResult.setAdcode(addressComponentA.adcode);
        } else {
            str = "";
        }
        reverseGeoCodeResult.setPoiList(a(jSONObjectOptJSONObject, "pois", str));
        reverseGeoCodeResult.setSematicDescription(jSONObjectOptJSONObject.optString("sematic_description"));
        reverseGeoCodeResult.setPoiRegionsInfoList(b(jSONObjectOptJSONObject, "poiRegions"));
        reverseGeoCodeResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
        return true;
    }

    private java.util.List<com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo> b(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONArray jSONArrayOptJSONArray;
        if (jSONObject == null || android.text.TextUtils.isEmpty(str) || (jSONArrayOptJSONArray = jSONObject.optJSONArray(str)) == null || jSONArrayOptJSONArray.length() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo poiRegionsInfo = new com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo();
                poiRegionsInfo.setDirectionDesc(jSONObjectOptJSONObject.optString("direction_desc"));
                poiRegionsInfo.setRegionName(jSONObjectOptJSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                poiRegionsInfo.setRegionTag(jSONObjectOptJSONObject.optString("tag"));
                arrayList.add(poiRegionsInfo);
            }
        }
        return arrayList;
    }

    private com.baidu.mapapi.model.LatLng c(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || str == null || "".equals(str) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(jSONObjectOptJSONObject.optDouble("y"), jSONObjectOptJSONObject.optDouble("x"));
        return com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLng) : latLng;
    }

    private com.baidu.mapapi.model.LatLng d(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || str == null || "".equals(str) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(jSONObjectOptJSONObject.optDouble("lat"), jSONObjectOptJSONObject.optDouble("lng"));
        return com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLng) : latLng;
    }

    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.geocode.ReverseGeoCodeResult reverseGeoCodeResult = new com.baidu.mapapi.search.geocode.ReverseGeoCodeResult();
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("SDK_InnerError")) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                    if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        reverseGeoCodeResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        return reverseGeoCodeResult;
                    }
                    if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno = strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        }
                        reverseGeoCodeResult.error = errorno;
                        return reverseGeoCodeResult;
                    }
                }
                if (!a(str, (com.baidu.mapapi.search.core.SearchResult) reverseGeoCodeResult, true)) {
                    a(str, reverseGeoCodeResult);
                }
                return reverseGeoCodeResult;
            } catch (java.lang.Exception unused) {
            }
        }
        reverseGeoCodeResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return reverseGeoCodeResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener)) {
            return;
        }
        ((com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener) obj).onGetReverseGeoCodeResult((com.baidu.mapapi.search.geocode.ReverseGeoCodeResult) searchResult);
    }
}
