package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.baidu.platform.base.d {
    private com.baidu.mapapi.model.LatLng a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(jSONObject.optDouble("lat"), jSONObject.optDouble("lng"));
        return com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLng) : latLng;
    }

    private com.baidu.mapapi.search.core.RouteNode a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || str == null || "".equals(str) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        com.baidu.mapapi.search.core.RouteNode routeNode = new com.baidu.mapapi.search.core.RouteNode();
        routeNode.setTitle(jSONObjectOptJSONObject.optString("cname"));
        routeNode.setUid(jSONObjectOptJSONObject.optString("uid"));
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str2);
        if (jSONObjectOptJSONObject2 != null) {
            com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(jSONObjectOptJSONObject2.optDouble("lat"), jSONObjectOptJSONObject2.optDouble("lng"));
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                latLng = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLng);
            }
            routeNode.setLocation(latLng);
        }
        return routeNode;
    }

    private java.util.List<com.baidu.mapapi.search.route.BikingRouteLine.BikingStep> a(org.json.JSONArray jSONArray) {
        boolean z = jSONArray == null;
        int length = jSONArray.length();
        if ((length <= 0) || z) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < length; i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                com.baidu.mapapi.search.route.BikingRouteLine.BikingStep bikingStep = new com.baidu.mapapi.search.route.BikingRouteLine.BikingStep();
                bikingStep.setDirection(jSONObjectOptJSONObject.optInt("direction") * 30);
                bikingStep.setDistance(jSONObjectOptJSONObject.optInt("distance"));
                bikingStep.setDuration(jSONObjectOptJSONObject.optInt("duration"));
                bikingStep.setName(jSONObjectOptJSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                bikingStep.setTurnType(jSONObjectOptJSONObject.optString("turn_type"));
                bikingStep.setEntrance(com.baidu.mapapi.search.core.RouteNode.location(a(jSONObjectOptJSONObject.optJSONObject("stepOriginLocation"))));
                bikingStep.setExit(com.baidu.mapapi.search.core.RouteNode.location(a(jSONObjectOptJSONObject.optJSONObject("stepDestinationLocation"))));
                java.lang.String strOptString = jSONObjectOptJSONObject.optString("instructions");
                if (strOptString != null && strOptString.length() >= 4) {
                    strOptString = strOptString.replaceAll("</?[a-z]>", "");
                }
                bikingStep.setInstructions(strOptString);
                bikingStep.setEntranceInstructions(jSONObjectOptJSONObject.optString("stepOriginInstruction"));
                bikingStep.setExitInstructions(jSONObjectOptJSONObject.optString("stepDestinationInstruction"));
                bikingStep.setPathString(jSONObjectOptJSONObject.optString("path"));
                arrayList.add(bikingStep);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    private boolean a(java.lang.String str, com.baidu.mapapi.search.route.BikingRouteResult bikingRouteResult) {
        org.json.JSONArray jSONArrayOptJSONArray;
        if (str != null && str.length() > 0) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                int iOptInt = jSONObject.optInt("status_sdk");
                if (iOptInt != 0) {
                    if (iOptInt == 1) {
                        bikingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        return true;
                    }
                    if (iOptInt == 2) {
                        bikingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
                    }
                    return false;
                }
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                if (jSONObjectOptJSONObject == null) {
                    return false;
                }
                int iOptInt2 = jSONObject.optInt("type");
                if (iOptInt2 == 1) {
                    bikingRouteResult.setSuggestAddrInfo(b(jSONObjectOptJSONObject));
                    bikingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR;
                } else {
                    if (iOptInt2 != 2 || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("routes")) == null || jSONArrayOptJSONArray.length() <= 0) {
                        return false;
                    }
                    com.baidu.mapapi.search.core.RouteNode routeNodeA = a(jSONObjectOptJSONObject, "origin", "originPt");
                    com.baidu.mapapi.search.core.RouteNode routeNodeA2 = a(jSONObjectOptJSONObject, com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "destinationPt");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        com.baidu.mapapi.search.route.BikingRouteLine bikingRouteLine = new com.baidu.mapapi.search.route.BikingRouteLine();
                        try {
                            org.json.JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject2 == null) {
                                return false;
                            }
                            bikingRouteLine.setStarting(routeNodeA);
                            bikingRouteLine.setTerminal(routeNodeA2);
                            bikingRouteLine.setDistance(jSONObjectOptJSONObject2.optInt("distance"));
                            bikingRouteLine.setDuration(jSONObjectOptJSONObject2.optInt("duration"));
                            bikingRouteLine.setSteps(a(jSONObjectOptJSONObject2.optJSONArray("steps")));
                            arrayList.add(bikingRouteLine);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    bikingRouteResult.setRouteLines(arrayList);
                }
                return true;
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private com.baidu.mapapi.search.route.SuggestAddrInfo b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.baidu.mapapi.search.route.SuggestAddrInfo suggestAddrInfo = new com.baidu.mapapi.search.route.SuggestAddrInfo();
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("origin");
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION);
        if (jSONObjectOptJSONObject != null) {
            int iOptInt = jSONObjectOptJSONObject.optInt("listType");
            java.lang.String strOptString = jSONObjectOptJSONObject.optString("cityName");
            if (iOptInt == 1) {
                suggestAddrInfo.setSuggestStartCity(a(jSONObjectOptJSONObject, com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT));
            } else if (iOptInt == 0) {
                suggestAddrInfo.setSuggestStartNode(b(jSONObjectOptJSONObject, com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT, strOptString));
            }
        }
        if (jSONObjectOptJSONObject2 != null) {
            int iOptInt2 = jSONObjectOptJSONObject2.optInt("listType");
            java.lang.String strOptString2 = jSONObjectOptJSONObject2.optString("cityName");
            if (iOptInt2 == 1) {
                suggestAddrInfo.setSuggestEndCity(a(jSONObjectOptJSONObject2, com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT));
            } else if (iOptInt2 == 0) {
                suggestAddrInfo.setSuggestEndNode(b(jSONObjectOptJSONObject2, com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT, strOptString2));
            }
        }
        return suggestAddrInfo;
    }

    private java.util.List<com.baidu.mapapi.search.core.PoiInfo> b(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) {
        org.json.JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && str != null && !"".equals(str) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArrayOptJSONArray.opt(i);
                if (jSONObject2 != null) {
                    com.baidu.mapapi.search.core.PoiInfo poiInfo = new com.baidu.mapapi.search.core.PoiInfo();
                    if (jSONObject2.has("address")) {
                        poiInfo.address = jSONObject2.optString("address");
                    }
                    poiInfo.uid = jSONObject2.optString("uid");
                    poiInfo.name = jSONObject2.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
                    if (jSONObjectOptJSONObject != null) {
                        poiInfo.location = new com.baidu.mapapi.model.LatLng(jSONObjectOptJSONObject.optDouble("lat"), jSONObjectOptJSONObject.optDouble("lng"));
                        if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                            poiInfo.location = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(poiInfo.location);
                        }
                    }
                    poiInfo.city = str2;
                    arrayList.add(poiInfo);
                }
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
        }
        return null;
    }

    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.route.BikingRouteResult bikingRouteResult = new com.baidu.mapapi.search.route.BikingRouteResult();
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("SDK_InnerError")) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                    if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        bikingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        return bikingRouteResult;
                    }
                    if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno = strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        }
                        bikingRouteResult.error = errorno;
                        return bikingRouteResult;
                    }
                }
                if (!a(str, (com.baidu.mapapi.search.core.SearchResult) bikingRouteResult, false) && !a(str, bikingRouteResult)) {
                    bikingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                }
                return bikingRouteResult;
            } catch (java.lang.Exception unused) {
            }
        }
        bikingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return bikingRouteResult;
    }

    public java.util.List<com.baidu.mapapi.search.core.CityInfo> a(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONArray jSONArrayOptJSONArray;
        if (jSONObject == null || str == null || str.equals("") || (jSONArrayOptJSONArray = jSONObject.optJSONArray(str)) == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArrayOptJSONArray.opt(i);
            if (jSONObject2 != null) {
                com.baidu.mapapi.search.core.CityInfo cityInfo = new com.baidu.mapapi.search.core.CityInfo();
                cityInfo.num = jSONObject2.optInt("number");
                cityInfo.city = jSONObject2.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                arrayList.add(cityInfo);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.route.OnGetRoutePlanResultListener)) {
            return;
        }
        ((com.baidu.mapapi.search.route.OnGetRoutePlanResultListener) obj).onGetBikingRouteResult((com.baidu.mapapi.search.route.BikingRouteResult) searchResult);
    }
}
