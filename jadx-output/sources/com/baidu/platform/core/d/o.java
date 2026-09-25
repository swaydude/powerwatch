package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class o extends com.baidu.platform.core.d.k {
    private com.baidu.mapapi.search.core.RouteNode a(org.json.JSONArray jSONArray, java.util.List<com.baidu.mapapi.search.core.RouteNode> list) {
        int length;
        if (jSONArray != null && (length = jSONArray.length()) > 0) {
            for (int i = 0; i < length; i++) {
                com.baidu.mapapi.search.core.RouteNode routeNodeA = a(jSONArray.optJSONObject(i));
                if (i == length - 1) {
                    return routeNodeA;
                }
                if (list == null) {
                    list = new java.util.ArrayList<>();
                }
                if (list == null) {
                    list = new java.util.ArrayList<>();
                }
                list.add(routeNodeA);
            }
        }
        return null;
    }

    private com.baidu.mapapi.search.core.RouteNode a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.baidu.mapapi.search.core.RouteNode routeNode = new com.baidu.mapapi.search.core.RouteNode();
        routeNode.setTitle(jSONObject.optString("wd"));
        routeNode.setUid(jSONObject.optString("uid"));
        routeNode.setLocation(com.baidu.mapapi.model.CoordUtil.decodeLocation(jSONObject.optString("pt")));
        return routeNode;
    }

    private java.util.List<com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep> a(org.json.JSONArray jSONArray) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < length; i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep walkingStep = new com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep();
                walkingStep.setDirection(jSONObjectOptJSONObject.optInt("direction") * 30);
                walkingStep.setDistance(jSONObjectOptJSONObject.optInt("distance"));
                walkingStep.setDuration(jSONObjectOptJSONObject.optInt("duration"));
                walkingStep.setEntrance(com.baidu.mapapi.search.core.RouteNode.location(com.baidu.mapapi.model.CoordUtil.decodeLocation(jSONObjectOptJSONObject.optString("start_location"))));
                walkingStep.setExit(com.baidu.mapapi.search.core.RouteNode.location(com.baidu.mapapi.model.CoordUtil.decodeLocation(jSONObjectOptJSONObject.optString("end_location"))));
                java.lang.String strOptString = jSONObjectOptJSONObject.optString("instructions");
                if (strOptString != null && strOptString.length() >= 4) {
                    strOptString = strOptString.replaceAll("</?[a-z]>", "");
                }
                walkingStep.setInstructions(strOptString);
                walkingStep.setEntranceInstructions(jSONObjectOptJSONObject.optString("start_instructions"));
                walkingStep.setExitInstructions(jSONObjectOptJSONObject.optString("end_instructions"));
                walkingStep.setPathString(jSONObjectOptJSONObject.optString("path"));
                arrayList.add(walkingStep);
            }
        }
        return arrayList;
    }

    private com.baidu.mapapi.search.core.TaxiInfo b(java.lang.String str) {
        org.json.JSONObject jSONObject;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        com.baidu.mapapi.search.core.TaxiInfo taxiInfo = new com.baidu.mapapi.search.core.TaxiInfo();
        taxiInfo.setDesc(jSONObject.optString("remark"));
        taxiInfo.setDistance(jSONObject.optInt("distance"));
        taxiInfo.setDuration(jSONObject.optInt("duration"));
        taxiInfo.setTotalPrice((float) jSONObject.optDouble("total_price"));
        taxiInfo.setStartPrice((float) jSONObject.optDouble("start_price"));
        taxiInfo.setPerKMPrice((float) jSONObject.optDouble("km_price"));
        return taxiInfo;
    }

    private boolean b(java.lang.String str, com.baidu.mapapi.search.route.WalkingRouteResult walkingRouteResult) {
        org.json.JSONArray jSONArrayOptJSONArray;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (walkingRouteResult == null) {
                    return false;
                }
                if (jSONObject.has("taxi")) {
                    walkingRouteResult.setTaxiInfo(b(jSONObject.optString("taxi")));
                }
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                if (jSONObjectOptJSONObject == null) {
                    return false;
                }
                int iOptInt = jSONObjectOptJSONObject.optInt("error");
                if (iOptInt != 0) {
                    if (iOptInt != 4) {
                        return false;
                    }
                    walkingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.ST_EN_TOO_NEAR;
                    return true;
                }
                org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("walk");
                if (jSONObjectOptJSONObject2 == null) {
                    return false;
                }
                org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("routes");
                org.json.JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("option");
                if (jSONObjectOptJSONObject3 == null || jSONArrayOptJSONArray2 == null) {
                    return false;
                }
                com.baidu.mapapi.search.core.RouteNode routeNodeA = a(jSONObjectOptJSONObject3.optJSONObject("start"));
                com.baidu.mapapi.search.core.RouteNode routeNodeA2 = a(jSONObjectOptJSONObject3.optJSONArray("end"), (java.util.List<com.baidu.mapapi.search.core.RouteNode>) null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    org.json.JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i);
                    if (jSONObjectOptJSONObject4 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("legs")) != null && jSONArrayOptJSONArray.length() > 0) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            org.json.JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject5 != null) {
                                com.baidu.mapapi.search.route.WalkingRouteLine walkingRouteLine = new com.baidu.mapapi.search.route.WalkingRouteLine();
                                walkingRouteLine.setStarting(routeNodeA);
                                walkingRouteLine.setTerminal(routeNodeA2);
                                walkingRouteLine.setDistance(jSONObjectOptJSONObject5.optInt("distance"));
                                walkingRouteLine.setDuration(jSONObjectOptJSONObject5.optInt("duration"));
                                walkingRouteLine.setSteps(a(jSONObjectOptJSONObject5.optJSONArray("steps")));
                                arrayList.add(walkingRouteLine);
                            }
                        }
                    }
                }
                walkingRouteResult.setRouteLines(arrayList);
                return true;
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public void a(java.lang.String str, com.baidu.mapapi.search.route.WalkingRouteResult walkingRouteResult) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("SDK_InnerError")) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                    if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        walkingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        return;
                    } else if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno = strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        }
                        walkingRouteResult.error = errorno;
                        return;
                    }
                }
                if (a(str, walkingRouteResult, false) || b(str, walkingRouteResult)) {
                    return;
                }
                walkingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return;
            } catch (java.lang.Exception unused) {
            }
        }
        walkingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
    }
}
