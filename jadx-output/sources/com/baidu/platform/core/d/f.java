package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.baidu.platform.base.d {
    private com.baidu.mapapi.model.LatLng a(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        com.baidu.mapapi.model.inner.GeoPoint geoPoint = new com.baidu.mapapi.model.inner.GeoPoint(0.0d, 0.0d);
        geoPoint.setLatitudeE6(jSONArrayOptJSONArray.optDouble(1));
        geoPoint.setLongitudeE6(jSONArrayOptJSONArray.optDouble(0));
        return com.baidu.mapapi.model.CoordUtil.mc2ll(geoPoint);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    private boolean a(java.lang.String str, com.baidu.mapapi.search.route.IndoorRouteResult indoorRouteResult) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONObject jSONObjectOptJSONObject2;
        org.json.JSONArray jSONArray;
        int i;
        com.baidu.mapapi.search.route.IndoorRouteLine indoorRouteLine;
        int i2;
        com.baidu.mapapi.search.route.IndoorRouteLine indoorRouteLine2;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        if (str == null || "".equals(str)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObjectOptJSONObject3 = new org.json.JSONObject(str).optJSONObject("indoor_navi");
            if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("option")) == null) {
                return false;
            }
            int iOptInt = jSONObjectOptJSONObject.optInt("error");
            if (iOptInt != 0) {
                if (iOptInt == 6) {
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.INDOOR_ROUTE_NO_IN_BUILDING;
                } else {
                    if (iOptInt != 7) {
                        return false;
                    }
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.INDOOR_ROUTE_NO_IN_SAME_BUILDING;
                }
                indoorRouteResult.error = errorno;
                return true;
            }
            org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("routes");
            if (jSONArrayOptJSONArray == null || (jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                return false;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("legs");
            if (jSONArrayOptJSONArray2 == null) {
                return false;
            }
            int i3 = 0;
            while (i3 < jSONArrayOptJSONArray2.length()) {
                com.baidu.mapapi.search.route.IndoorRouteLine indoorRouteLine3 = new com.baidu.mapapi.search.route.IndoorRouteLine();
                org.json.JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i3);
                if (jSONObjectOptJSONObject4 == null) {
                    jSONArray = jSONArrayOptJSONArray2;
                    i = i3;
                } else {
                    java.lang.String str5 = "distance";
                    indoorRouteLine3.setDistance(jSONObjectOptJSONObject4.optInt("distance"));
                    java.lang.String str6 = "duration";
                    indoorRouteLine3.setDuration(jSONObjectOptJSONObject4.optInt("duration"));
                    java.lang.String str7 = "sstart_location";
                    indoorRouteLine3.setStarting(com.baidu.mapapi.search.core.RouteNode.location(a(jSONObjectOptJSONObject4, "sstart_location")));
                    java.lang.String str8 = "send_location";
                    indoorRouteLine3.setTerminal(com.baidu.mapapi.search.core.RouteNode.location(a(jSONObjectOptJSONObject4, "send_location")));
                    org.json.JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject4.optJSONArray("steps");
                    if (jSONArrayOptJSONArray3 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int i4 = 0;
                        while (i4 < jSONArrayOptJSONArray3.length()) {
                            com.baidu.mapapi.search.route.IndoorRouteLine.IndoorRouteStep indoorRouteStep = new com.baidu.mapapi.search.route.IndoorRouteLine.IndoorRouteStep();
                            org.json.JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray3.optJSONObject(i4);
                            if (jSONObjectOptJSONObject5 == null) {
                                i2 = i3;
                                indoorRouteLine2 = indoorRouteLine3;
                                str2 = str6;
                                str3 = str7;
                                str4 = str8;
                            } else {
                                indoorRouteStep.setDistance(jSONObjectOptJSONObject5.optInt(str5));
                                indoorRouteStep.setDuration(jSONObjectOptJSONObject5.optInt(str6));
                                indoorRouteStep.setBuildingId(jSONObjectOptJSONObject5.optString("buildingid"));
                                indoorRouteStep.setFloorId(jSONObjectOptJSONObject5.optString("floorid"));
                                indoorRouteStep.setEntrace(com.baidu.mapapi.search.core.RouteNode.location(a(jSONObjectOptJSONObject5, str7)));
                                indoorRouteStep.setExit(com.baidu.mapapi.search.core.RouteNode.location(a(jSONObjectOptJSONObject5, str8)));
                                org.json.JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject5.optJSONArray("spath");
                                if (jSONArrayOptJSONArray4 == null) {
                                    i2 = i3;
                                    indoorRouteLine2 = indoorRouteLine3;
                                    str2 = str6;
                                    str3 = str7;
                                    str4 = str8;
                                } else {
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    int i5 = 5;
                                    double d = 0.0d;
                                    double d2 = 0.0d;
                                    while (i5 < jSONArrayOptJSONArray4.length()) {
                                        double dOptDouble = d + jSONArrayOptJSONArray4.optDouble(i5 + 1);
                                        java.lang.String str9 = str7;
                                        double dOptDouble2 = d2 + jSONArrayOptJSONArray4.optDouble(i5);
                                        org.json.JSONArray jSONArray2 = jSONArrayOptJSONArray4;
                                        com.baidu.mapapi.model.inner.GeoPoint geoPoint = new com.baidu.mapapi.model.inner.GeoPoint(0.0d, 0.0d);
                                        geoPoint.setLatitudeE6(dOptDouble);
                                        geoPoint.setLongitudeE6(dOptDouble2);
                                        com.baidu.mapapi.model.LatLng latLngMc2ll = com.baidu.mapapi.model.CoordUtil.mc2ll(geoPoint);
                                        arrayList3.add(java.lang.Double.valueOf(latLngMc2ll.latitude));
                                        arrayList3.add(java.lang.Double.valueOf(latLngMc2ll.longitude));
                                        i5 += 2;
                                        jSONArrayOptJSONArray4 = jSONArray2;
                                        i3 = i3;
                                        indoorRouteLine3 = indoorRouteLine3;
                                        d = dOptDouble;
                                        d2 = dOptDouble2;
                                        str6 = str6;
                                        str7 = str9;
                                        str8 = str8;
                                    }
                                    i2 = i3;
                                    indoorRouteLine2 = indoorRouteLine3;
                                    str2 = str6;
                                    str3 = str7;
                                    str4 = str8;
                                    indoorRouteStep.setPath(arrayList3);
                                    indoorRouteStep.setInstructions(jSONObjectOptJSONObject5.optString("instructions"));
                                    org.json.JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject5.optJSONArray("pois");
                                    if (jSONArrayOptJSONArray5 != null) {
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                        for (int i6 = 0; i6 < jSONArrayOptJSONArray5.length(); i6++) {
                                            org.json.JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray5.optJSONObject(i6);
                                            if (jSONObjectOptJSONObject6 != null) {
                                                com.baidu.mapapi.search.route.IndoorRouteLine.IndoorRouteStep.IndoorStepNode indoorStepNode = new com.baidu.mapapi.search.route.IndoorRouteLine.IndoorRouteStep.IndoorStepNode();
                                                indoorStepNode.setDetail(jSONObjectOptJSONObject6.optString("detail"));
                                                indoorStepNode.setName(jSONObjectOptJSONObject6.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                                                indoorStepNode.setType(jSONObjectOptJSONObject6.optInt("type"));
                                                indoorStepNode.setLocation(a(jSONObjectOptJSONObject6, com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION));
                                                arrayList4.add(indoorStepNode);
                                            }
                                        }
                                        indoorRouteStep.setStepNodes(arrayList4);
                                    }
                                    arrayList2.add(indoorRouteStep);
                                }
                            }
                            i4++;
                            jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                            str6 = str2;
                            str5 = str5;
                            jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                            i3 = i2;
                            indoorRouteLine3 = indoorRouteLine2;
                            str7 = str3;
                            str8 = str4;
                        }
                        jSONArray = jSONArrayOptJSONArray2;
                        i = i3;
                        com.baidu.mapapi.search.route.IndoorRouteLine indoorRouteLine4 = indoorRouteLine3;
                        if (arrayList2.size() > 0) {
                            indoorRouteLine = indoorRouteLine4;
                            indoorRouteLine.setSteps(arrayList2);
                        } else {
                            indoorRouteLine = indoorRouteLine4;
                        }
                    } else {
                        jSONArray = jSONArrayOptJSONArray2;
                        i = i3;
                        indoorRouteLine = indoorRouteLine3;
                    }
                    arrayList.add(indoorRouteLine);
                }
                i3 = i + 1;
                jSONArrayOptJSONArray2 = jSONArray;
            }
            indoorRouteResult.setRouteLines(arrayList);
            return true;
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.route.IndoorRouteResult indoorRouteResult = new com.baidu.mapapi.search.route.IndoorRouteResult();
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("SDK_InnerError")) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                    if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        indoorRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        return indoorRouteResult;
                    }
                    if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno = strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        }
                        indoorRouteResult.error = errorno;
                        return indoorRouteResult;
                    }
                }
                if (!a(str, indoorRouteResult)) {
                    indoorRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                }
                return indoorRouteResult;
            } catch (java.lang.Exception unused) {
            }
        }
        indoorRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return indoorRouteResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.route.OnGetRoutePlanResultListener)) {
            return;
        }
        ((com.baidu.mapapi.search.route.OnGetRoutePlanResultListener) obj).onGetIndoorRouteResult((com.baidu.mapapi.search.route.IndoorRouteResult) searchResult);
    }
}
