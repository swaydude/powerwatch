package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.baidu.platform.core.d.k {
    private com.baidu.mapapi.search.core.RouteNode a(org.json.JSONArray jSONArray, java.util.List<com.baidu.mapapi.search.core.RouteNode> list) {
        int length;
        if (jSONArray != null && (length = jSONArray.length()) > 0) {
            for (int i = 0; i < length; i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    com.baidu.mapapi.search.core.RouteNode routeNodeA = a(jSONObjectOptJSONObject);
                    if (i == length - 1) {
                        return routeNodeA;
                    }
                    list.add(routeNodeA);
                }
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
        com.baidu.mapapi.model.inner.GeoPoint geoPoint = new com.baidu.mapapi.model.inner.GeoPoint(0.0d, 0.0d);
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("spt");
        if (jSONArrayOptJSONArray != null) {
            geoPoint.setLongitudeE6(jSONArrayOptJSONArray.optInt(0));
            geoPoint.setLatitudeE6(jSONArrayOptJSONArray.optInt(1));
        }
        routeNode.setLocation(com.baidu.mapapi.model.CoordUtil.mc2ll(geoPoint));
        return routeNode;
    }

    private java.util.List<com.baidu.mapapi.model.LatLng> a(org.json.JSONArray jSONArray) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) < 6) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        double dOptInt = 0.0d;
        double dOptInt2 = 0.0d;
        for (int i = 5; i < length; i++) {
            if (i % 2 != 0) {
                dOptInt2 += (double) jSONArray.optInt(i);
            } else {
                dOptInt += (double) jSONArray.optInt(i);
                arrayList.add(com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(dOptInt, dOptInt2)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:38:0x0128  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0081, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0098, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00bd, please report this as an issue */
    private java.util.List<com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep> a(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        int length;
        int length2;
        boolean z;
        java.util.ArrayList arrayList;
        int i;
        int i2;
        org.json.JSONObject jSONObjectOptJSONObject;
        com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep drivingStep;
        java.lang.String strOptString;
        java.lang.String strOptString2;
        java.util.List<com.baidu.mapapi.model.LatLng> listA;
        int distance;
        if (jSONArray == null || (length = jSONArray.length()) <= 0) {
            return null;
        }
        if (jSONArray2 != null) {
            length2 = jSONArray2.length();
            if (length2 > 0) {
                z = true;
            }
            arrayList = new java.util.ArrayList();
            i2 = 0;
            for (i = 0; i < length; i++) {
                jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null) {
                    drivingStep = new com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep();
                    drivingStep.setDistance(jSONObjectOptJSONObject.optInt("distance"));
                    drivingStep.setDirection(jSONObjectOptJSONObject.optInt("direction") * 30);
                    strOptString = jSONObjectOptJSONObject.optString("instructions");
                    if (strOptString != null && strOptString.length() >= 4) {
                        strOptString = strOptString.replaceAll("/?[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "");
                    }
                    drivingStep.setInstructions(strOptString);
                    strOptString2 = jSONObjectOptJSONObject.optString("start_instructions");
                    if (strOptString2 == null) {
                        distance = drivingStep.getDistance();
                        if (distance < 1000) {
                            strOptString2 = " - " + distance + "米";
                        } else {
                            strOptString2 = " - " + (((double) distance) / 1000.0d) + "公里";
                        }
                        if (i2 <= arrayList.size()) {
                            strOptString2 = ((com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep) arrayList.get(i2 - 1)).getExitInstructions() + strOptString2;
                        }
                    } else {
                        length2 = length2;
                    }
                    drivingStep.setEntranceInstructions(strOptString2);
                    drivingStep.setExitInstructions(jSONObjectOptJSONObject.optString("end_instructions"));
                    drivingStep.setNumTurns(jSONObjectOptJSONObject.optInt("turn"));
                    listA = a(jSONObjectOptJSONObject.optJSONArray("spath"));
                    drivingStep.setPathList(listA);
                    if (listA != null) {
                        com.baidu.mapapi.search.core.RouteNode routeNode = new com.baidu.mapapi.search.core.RouteNode();
                        routeNode.setLocation(listA.get(0));
                        drivingStep.setEntrance(routeNode);
                        com.baidu.mapapi.search.core.RouteNode routeNode2 = new com.baidu.mapapi.search.core.RouteNode();
                        routeNode2.setLocation(listA.get(listA.size() - 1));
                        drivingStep.setExit(routeNode2);
                    }
                    length2 = length2;
                    if (z && i < length2) {
                        drivingStep.setTrafficList(b(jSONArray2.optJSONObject(i)));
                    }
                    i2++;
                    arrayList.add(drivingStep);
                }
            }
            return arrayList;
        }
        length2 = 0;
        z = false;
        arrayList = new java.util.ArrayList();
        i2 = 0;
        while (i < length) {
            jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                drivingStep = new com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep();
                drivingStep.setDistance(jSONObjectOptJSONObject.optInt("distance"));
                drivingStep.setDirection(jSONObjectOptJSONObject.optInt("direction") * 30);
                strOptString = jSONObjectOptJSONObject.optString("instructions");
                if (strOptString != null) {
                    strOptString = strOptString.replaceAll("/?[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "");
                }
                drivingStep.setInstructions(strOptString);
                strOptString2 = jSONObjectOptJSONObject.optString("start_instructions");
                if (strOptString2 == null) {
                    distance = drivingStep.getDistance();
                    if (distance < 1000) {
                        strOptString2 = " - " + distance + "米";
                    } else {
                        strOptString2 = " - " + (((double) distance) / 1000.0d) + "公里";
                    }
                    if (i2 <= arrayList.size()) {
                        strOptString2 = ((com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep) arrayList.get(i2 - 1)).getExitInstructions() + strOptString2;
                    }
                } else {
                    length2 = length2;
                }
                drivingStep.setEntranceInstructions(strOptString2);
                drivingStep.setExitInstructions(jSONObjectOptJSONObject.optString("end_instructions"));
                drivingStep.setNumTurns(jSONObjectOptJSONObject.optInt("turn"));
                listA = a(jSONObjectOptJSONObject.optJSONArray("spath"));
                drivingStep.setPathList(listA);
                if (listA != null) {
                    com.baidu.mapapi.search.core.RouteNode routeNode3 = new com.baidu.mapapi.search.core.RouteNode();
                    routeNode3.setLocation(listA.get(0));
                    drivingStep.setEntrance(routeNode3);
                    com.baidu.mapapi.search.core.RouteNode routeNode4 = new com.baidu.mapapi.search.core.RouteNode();
                    routeNode4.setLocation(listA.get(listA.size() - 1));
                    drivingStep.setExit(routeNode4);
                }
                length2 = length2;
                if (z) {
                    drivingStep.setTrafficList(b(jSONArray2.optJSONObject(i)));
                }
                i2++;
                arrayList.add(drivingStep);
            }
        }
        return arrayList;
    }

    private java.util.List<com.baidu.mapapi.search.core.TaxiInfo> b(java.lang.String str) {
        if (str != null && str.length() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        com.baidu.mapapi.search.core.TaxiInfo taxiInfo = new com.baidu.mapapi.search.core.TaxiInfo();
                        java.lang.String strOptString = jSONObject.optString("total_price");
                        if (strOptString == null || strOptString.equals("")) {
                            taxiInfo.setTotalPrice(0.0f);
                        } else {
                            taxiInfo.setTotalPrice(java.lang.Float.parseFloat(strOptString));
                        }
                        arrayList.add(taxiInfo);
                    }
                }
                return arrayList;
            } catch (org.json.JSONException e) {
                if (com.baidu.mapapi.common.Logger.debugEnable()) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    private java.util.List<com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep> b(org.json.JSONArray jSONArray, java.util.List<com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep> list) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) <= 0 || list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < length; i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                int iOptInt = jSONObjectOptJSONObject.optInt("n");
                int iOptInt2 = jSONObjectOptJSONObject.optInt("s");
                for (int i2 = 0; i2 < iOptInt; i2++) {
                    int i3 = iOptInt2 + i2;
                    if (i3 < list.size()) {
                        arrayList.add(list.get(i3));
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean b(java.lang.String str, com.baidu.mapapi.search.route.DrivingRouteResult drivingRouteResult) {
        boolean z = false;
        if (str == null || "".equals(str)) {
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
                if (iOptInt != 4) {
                    return false;
                }
                drivingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.ST_EN_TOO_NEAR;
                return true;
            }
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("cars");
            if (jSONObjectOptJSONObject2 == null) {
                return false;
            }
            org.json.JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("option");
            org.json.JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT);
            if (jSONObjectOptJSONObject3 == null || jSONObjectOptJSONObject4 == null) {
                return false;
            }
            com.baidu.mapapi.search.core.RouteNode routeNodeA = a(jSONObjectOptJSONObject3.optJSONObject("start"));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.baidu.mapapi.search.core.RouteNode routeNodeA2 = a(jSONObjectOptJSONObject3.optJSONArray("end"), arrayList);
            java.util.List<com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep> listA = a(jSONObjectOptJSONObject4.optJSONArray("steps"), jSONObjectOptJSONObject4.optJSONArray("stepts"));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("routes");
            if (jSONArrayOptJSONArray == null) {
                return false;
            }
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                com.baidu.mapapi.search.route.DrivingRouteLine drivingRouteLine = new com.baidu.mapapi.search.route.DrivingRouteLine();
                org.json.JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject5 != null) {
                    org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject5.optJSONArray("legs");
                    if (jSONArrayOptJSONArray2 == null) {
                        return z;
                    }
                    int length = jSONArrayOptJSONArray2.length();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    int iOptInt2 = 0;
                    int i2 = 0;
                    int iOptInt3 = 0;
                    while (i2 < length) {
                        int i3 = length;
                        org.json.JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray2.optJSONObject(i2);
                        org.json.JSONArray jSONArray = jSONArrayOptJSONArray2;
                        if (jSONObjectOptJSONObject6 != null) {
                            iOptInt3 += jSONObjectOptJSONObject6.optInt("distance");
                            iOptInt2 += jSONObjectOptJSONObject6.optInt("duration");
                            java.util.List<com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep> listB = b(jSONObjectOptJSONObject6.optJSONArray("stepis"), listA);
                            if (listB != null) {
                                arrayList3.addAll(listB);
                            }
                        }
                        i2++;
                        length = i3;
                        jSONArrayOptJSONArray2 = jSONArray;
                    }
                    drivingRouteLine.setStarting(routeNodeA);
                    drivingRouteLine.setTerminal(routeNodeA2);
                    if (arrayList.size() == 0) {
                        drivingRouteLine.setWayPoints(null);
                    } else {
                        drivingRouteLine.setWayPoints(arrayList);
                    }
                    drivingRouteLine.setDistance(iOptInt3);
                    drivingRouteLine.setDuration(iOptInt2);
                    drivingRouteLine.setCongestionDistance(jSONObjectOptJSONObject5.optInt("congestion_length"));
                    drivingRouteLine.setLightNum(jSONObjectOptJSONObject5.optInt("light_num"));
                    if (arrayList3.size() == 0) {
                        drivingRouteLine.setSteps(null);
                    } else {
                        drivingRouteLine.setSteps(arrayList3);
                    }
                    arrayList2.add(drivingRouteLine);
                }
                i++;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                jSONObjectOptJSONObject4 = jSONObjectOptJSONObject4;
                z = false;
            }
            drivingRouteResult.setRouteLines(arrayList2);
            drivingRouteResult.setTaxiInfos(b(jSONObjectOptJSONObject4.optString("taxis")));
            return true;
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    private int[] b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("end");
        org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("status");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArrayOptJSONArray.length();
        int length2 = jSONArrayOptJSONArray2.length();
        int i = 0;
        while (i < length) {
            int iOptInt = jSONArrayOptJSONArray.optInt(i);
            int iOptInt2 = i < length2 ? jSONArrayOptJSONArray2.optInt(i) : 0;
            for (int i2 = 0; i2 < iOptInt; i2++) {
                arrayList.add(java.lang.Integer.valueOf(iOptInt2));
            }
            i++;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = ((java.lang.Integer) arrayList.get(i3)).intValue();
        }
        return iArr;
    }

    public void a(java.lang.String str, com.baidu.mapapi.search.route.DrivingRouteResult drivingRouteResult) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("SDK_InnerError")) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                    if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        drivingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        return;
                    } else if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno = strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        }
                        drivingRouteResult.error = errorno;
                        return;
                    }
                }
                if (a(str, drivingRouteResult, false) || b(str, drivingRouteResult)) {
                    return;
                }
                drivingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return;
            } catch (java.lang.Exception unused) {
            }
        }
        drivingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
    }
}
