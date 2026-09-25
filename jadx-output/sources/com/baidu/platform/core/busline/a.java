package com.baidu.platform.core.busline;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.baidu.platform.base.d {
    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.busline.BusLineResult busLineResult = new com.baidu.mapapi.search.busline.BusLineResult();
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("SDK_InnerError")) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                    if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        busLineResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        return busLineResult;
                    }
                    if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno = strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        }
                        busLineResult.error = errorno;
                        return busLineResult;
                    }
                }
                if (!a(str, busLineResult, false) && !a(str, busLineResult)) {
                    busLineResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                }
                return busLineResult;
            } catch (java.lang.Exception unused) {
            }
        }
        busLineResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return busLineResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.busline.OnGetBusLineSearchResultListener)) {
            return;
        }
        ((com.baidu.mapapi.search.busline.OnGetBusLineSearchResultListener) obj).onGetBusLineResult((com.baidu.mapapi.search.busline.BusLineResult) searchResult);
    }

    public boolean a(java.lang.String str, com.baidu.mapapi.search.busline.BusLineResult busLineResult) {
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT);
                if (jSONObjectOptJSONObject == null || jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                    return false;
                }
                org.json.JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0);
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("HH:mm");
                try {
                    busLineResult.setStartTime(simpleDateFormat.parse(jSONObjectOptJSONObject2.optString("startTime")));
                    busLineResult.setEndTime(simpleDateFormat.parse(jSONObjectOptJSONObject2.optString("endTime")));
                } catch (java.text.ParseException e) {
                    e.printStackTrace();
                }
                busLineResult.setBusLineName(jSONObjectOptJSONObject2.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                busLineResult.setMonthTicket(jSONObjectOptJSONObject2.optInt("isMonTicket") == 1);
                busLineResult.setUid(jSONObjectOptJSONObject2.optString("uid"));
                busLineResult.setBasePrice(jSONObjectOptJSONObject2.optInt("ticketPrice") / 100.0f);
                busLineResult.setLineDirection(jSONObjectOptJSONObject2.optString("line_direction"));
                busLineResult.setMaxPrice(jSONObjectOptJSONObject2.optInt("maxPrice") / 100.0f);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.List<java.util.List<com.baidu.mapapi.model.LatLng>> listDecodeLocationList2D = com.baidu.mapapi.model.CoordUtil.decodeLocationList2D(jSONObjectOptJSONObject2.optString("geo"));
                if (listDecodeLocationList2D != null) {
                    for (java.util.List<com.baidu.mapapi.model.LatLng> list : listDecodeLocationList2D) {
                        com.baidu.mapapi.search.busline.BusLineResult.BusStep busStep = new com.baidu.mapapi.search.busline.BusLineResult.BusStep();
                        busStep.setWayPoints(list);
                        arrayList.add(busStep);
                    }
                }
                if (arrayList.size() > 0) {
                    busLineResult.setSteps(arrayList);
                }
                org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("stations");
                if (jSONArrayOptJSONArray2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                        org.json.JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i);
                        if (jSONObjectOptJSONObject3 != null) {
                            com.baidu.mapapi.search.busline.BusLineResult.BusStation busStation = new com.baidu.mapapi.search.busline.BusLineResult.BusStation();
                            busStation.setTitle(jSONObjectOptJSONObject3.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                            busStation.setLocation(com.baidu.mapapi.model.CoordUtil.decodeLocation(jSONObjectOptJSONObject3.optString("geo")));
                            busStation.setUid(jSONObjectOptJSONObject3.optString("uid"));
                            arrayList2.add(busStation);
                        }
                    }
                    if (arrayList2.size() > 0) {
                        busLineResult.setStations(arrayList2);
                    }
                }
                busLineResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
                return true;
            } catch (org.json.JSONException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}
