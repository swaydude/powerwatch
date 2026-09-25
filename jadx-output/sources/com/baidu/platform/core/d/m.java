package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class m extends com.baidu.platform.core.d.k {
    private com.baidu.mapapi.search.core.RouteNode a(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null || str == null || "".equals(str)) {
            return null;
        }
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        com.baidu.mapapi.search.core.RouteNode routeNode = new com.baidu.mapapi.search.core.RouteNode();
        routeNode.setTitle(jSONObjectOptJSONObject.optString("wd"));
        routeNode.setUid(jSONObjectOptJSONObject.optString("uid"));
        routeNode.setLocation(com.baidu.mapapi.model.CoordUtil.decodeLocation(jSONObjectOptJSONObject.optString("pt")));
        return routeNode;
    }

    private com.baidu.mapapi.search.core.TaxiInfo a(org.json.JSONObject jSONObject) {
        float fOptDouble;
        float fOptDouble2;
        float fOptDouble3;
        if (jSONObject == null) {
            return null;
        }
        com.baidu.mapapi.search.core.TaxiInfo taxiInfo = new com.baidu.mapapi.search.core.TaxiInfo();
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("detail");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        int i = 0;
        while (true) {
            fOptDouble = 0.0f;
            if (i >= length) {
                fOptDouble2 = 0.0f;
                fOptDouble3 = 0.0f;
                break;
            }
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArrayOptJSONArray.opt(i);
            if (jSONObject2 != null && jSONObject2.optString("desc").contains("白天")) {
                fOptDouble2 = (float) jSONObject2.optDouble("km_price");
                fOptDouble3 = (float) jSONObject2.optDouble("start_price");
                fOptDouble = (float) jSONObject2.optDouble("total_price");
                break;
            }
            i++;
        }
        taxiInfo.setDesc(jSONObject.optString("remark"));
        taxiInfo.setDistance(jSONObject.optInt("distance"));
        taxiInfo.setDuration(jSONObject.optInt("duration"));
        taxiInfo.setTotalPrice(fOptDouble);
        taxiInfo.setStartPrice(fOptDouble3);
        taxiInfo.setPerKMPrice(fOptDouble2);
        return taxiInfo;
    }

    private java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '<') {
                z = true;
            } else if (charArray[i] == '>') {
                z = false;
            } else if (!z) {
                sb.append(charArray[i]);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01c8  */
    private boolean b(java.lang.String str, com.baidu.mapapi.search.route.TransitRouteResult transitRouteResult) {
        org.json.JSONArray jSONArray;
        com.baidu.mapapi.search.core.RouteNode routeNode;
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        int i = 0;
        if (str == null || str.length() <= 0) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
            if (jSONObjectOptJSONObject == null) {
                return false;
            }
            int iOptInt = jSONObjectOptJSONObject.optInt("error");
            if (iOptInt != 0) {
                if (iOptInt == 1) {
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.ST_EN_TOO_NEAR;
                } else {
                    if (iOptInt != 200) {
                        return false;
                    }
                    errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NOT_SUPPORT_BUS_2CITY;
                }
                transitRouteResult.error = errorno;
                return true;
            }
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("bus");
            if (jSONObjectOptJSONObject2 == null) {
                return false;
            }
            org.json.JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("taxi");
            if (jSONObjectOptJSONObject3 != null) {
                transitRouteResult.setTaxiInfo(a(jSONObjectOptJSONObject3));
            }
            org.json.JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("option");
            if (jSONObjectOptJSONObject4 == null) {
                return false;
            }
            com.baidu.mapapi.search.core.RouteNode routeNodeA = a(jSONObjectOptJSONObject4, "start");
            com.baidu.mapapi.search.core.RouteNode routeNodeA2 = a(jSONObjectOptJSONObject4, "end");
            org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("routes");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return false;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i2 = 0;
            while (i2 < jSONArrayOptJSONArray.length()) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) ((org.json.JSONObject) jSONArrayOptJSONArray.opt(i2)).optJSONArray("legs").opt(i);
                if (jSONObject2 == null) {
                    jSONArray = jSONArrayOptJSONArray;
                    routeNode = routeNodeA2;
                } else {
                    com.baidu.mapapi.search.route.TransitRouteLine transitRouteLine = new com.baidu.mapapi.search.route.TransitRouteLine();
                    transitRouteLine.setDistance(jSONObject2.optInt("distance"));
                    transitRouteLine.setDuration(jSONObject2.optInt("duration"));
                    transitRouteLine.setStarting(routeNodeA);
                    transitRouteLine.setTerminal(routeNodeA2);
                    org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("steps");
                    if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                        jSONArray = jSONArrayOptJSONArray;
                        routeNode = routeNodeA2;
                    } else {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int i3 = 0;
                        while (i3 < jSONArrayOptJSONArray2.length()) {
                            org.json.JSONArray jSONArrayOptJSONArray3 = jSONArrayOptJSONArray2.optJSONObject(i3).optJSONArray("step");
                            if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                                org.json.JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray3.optJSONObject(i);
                                com.baidu.mapapi.search.route.TransitRouteLine.TransitStep transitStep = new com.baidu.mapapi.search.route.TransitRouteLine.TransitStep();
                                transitStep.setEntrace(com.baidu.mapapi.search.core.RouteNode.location(com.baidu.mapapi.model.CoordUtil.decodeLocation(jSONObjectOptJSONObject5.optString("start_location"))));
                                transitStep.setExit(com.baidu.mapapi.search.core.RouteNode.location(com.baidu.mapapi.model.CoordUtil.decodeLocation(jSONObjectOptJSONObject5.optString("end_location"))));
                                transitStep.setStepType(jSONObjectOptJSONObject5.optInt("type") == 5 ? com.baidu.mapapi.search.route.TransitRouteLine.TransitStep.TransitRouteStepType.WAKLING : com.baidu.mapapi.search.route.TransitRouteLine.TransitStep.TransitRouteStepType.BUSLINE);
                                transitStep.setInstructions(b(jSONObjectOptJSONObject5.optString("instructions")));
                                transitStep.setDistance(jSONObjectOptJSONObject5.optInt("distance"));
                                transitStep.setDuration(jSONObjectOptJSONObject5.optInt("duration"));
                                transitStep.setPathString(jSONObjectOptJSONObject5.optString("path"));
                                if (jSONObjectOptJSONObject5.has("vehicle")) {
                                    transitStep.setVehicleInfo(c(jSONObjectOptJSONObject5.optString("vehicle")));
                                    org.json.JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("vehicle");
                                    transitStep.getEntrance().setUid(jSONObjectOptJSONObject6.optString("start_uid"));
                                    transitStep.getEntrance().setTitle(jSONObjectOptJSONObject6.optString("start_name"));
                                    transitStep.getExit().setUid(jSONObjectOptJSONObject6.optString("end_uid"));
                                    transitStep.getExit().setTitle(jSONObjectOptJSONObject6.optString("end_name"));
                                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(jSONObjectOptJSONObject6.optInt("type"));
                                    transitStep.setStepType((numValueOf == null || numValueOf.intValue() != 1) ? com.baidu.mapapi.search.route.TransitRouteLine.TransitStep.TransitRouteStepType.BUSLINE : com.baidu.mapapi.search.route.TransitRouteLine.TransitStep.TransitRouteStepType.SUBWAY);
                                }
                                arrayList2.add(transitStep);
                            }
                            i3++;
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                            routeNodeA2 = routeNodeA2;
                            i = 0;
                        }
                        jSONArray = jSONArrayOptJSONArray;
                        routeNode = routeNodeA2;
                        transitRouteLine.setSteps(arrayList2);
                        arrayList.add(transitRouteLine);
                    }
                }
                i2++;
                jSONArrayOptJSONArray = jSONArray;
                routeNodeA2 = routeNode;
                i = 0;
            }
            transitRouteResult.setRoutelines(arrayList);
            return true;
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    private com.baidu.mapapi.search.core.VehicleInfo c(java.lang.String str) {
        org.json.JSONObject jSONObject;
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        com.baidu.mapapi.search.core.VehicleInfo vehicleInfo = new com.baidu.mapapi.search.core.VehicleInfo();
        vehicleInfo.setZonePrice(jSONObject.optInt("zone_price"));
        vehicleInfo.setTotalPrice(jSONObject.optInt("total_price"));
        vehicleInfo.setTitle(jSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
        vehicleInfo.setPassStationNum(jSONObject.optInt("stop_num"));
        vehicleInfo.setUid(jSONObject.optString("uid"));
        return vehicleInfo;
    }

    public void a(java.lang.String str, com.baidu.mapapi.search.route.TransitRouteResult transitRouteResult) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("SDK_InnerError")) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                    if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        transitRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        return;
                    } else if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno = strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        }
                        transitRouteResult.error = errorno;
                        return;
                    }
                }
                if (a(str, transitRouteResult, false) || b(str, transitRouteResult)) {
                    return;
                }
                transitRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return;
            } catch (java.lang.Exception unused) {
            }
        }
        transitRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
    }
}
