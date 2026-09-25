package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.baidu.platform.base.d {
    private com.baidu.mapapi.search.core.TransitResultNode a(int i, org.json.JSONObject jSONObject) {
        com.baidu.mapapi.model.LatLng latLng = null;
        if (jSONObject == null) {
            return null;
        }
        java.lang.String strOptString = jSONObject.optString("wd");
        java.lang.String strOptString2 = jSONObject.optString("city_name");
        int iOptInt = jSONObject.optInt(i == 1 ? "city_code" : "city_id");
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
        if (jSONObjectOptJSONObject != null) {
            latLng = new com.baidu.mapapi.model.LatLng(jSONObjectOptJSONObject.optDouble("lat"), jSONObjectOptJSONObject.optDouble("lng"));
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                latLng = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLng);
            }
        }
        return new com.baidu.mapapi.search.core.TransitResultNode(iOptInt, strOptString2, latLng, strOptString);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep a(org.json.JSONObject jSONObject) {
        com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType stepVehicleInfoType;
        if (jSONObject == null) {
            return null;
        }
        com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep transitStep = new com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep();
        transitStep.setDistance((int) jSONObject.optDouble("distance"));
        transitStep.setDuration((int) jSONObject.optDouble("duration"));
        transitStep.setInstructions(jSONObject.optString("instructions"));
        transitStep.setPathString(jSONObject.optString("path"));
        transitStep.setTrafficConditions(b(jSONObject.optJSONArray("traffic_condition")));
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("start_location");
        if (jSONObjectOptJSONObject != null) {
            com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(jSONObjectOptJSONObject.optDouble("lat"), jSONObjectOptJSONObject.optDouble("lng"));
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                latLng = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLng);
            }
            transitStep.setStartLocation(latLng);
        }
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("end_location");
        if (jSONObjectOptJSONObject2 != null) {
            com.baidu.mapapi.model.LatLng latLng2 = new com.baidu.mapapi.model.LatLng(jSONObjectOptJSONObject2.optDouble("lat"), jSONObjectOptJSONObject2.optDouble("lng"));
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                latLng2 = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLng2);
            }
            transitStep.setEndLocation(latLng2);
        }
        org.json.JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("vehicle_info");
        if (jSONObjectOptJSONObject3 != null) {
            int iOptInt = jSONObjectOptJSONObject3.optInt("type");
            org.json.JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("detail");
            switch (iOptInt) {
                case 1:
                    transitStep.setVehileType(com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_TRAIN);
                    if (jSONObjectOptJSONObject4 != null) {
                        com.baidu.mapapi.search.core.n nVar = new com.baidu.mapapi.search.core.n();
                        nVar.setName(jSONObjectOptJSONObject4.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                        nVar.a(jSONObjectOptJSONObject4.optDouble(com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE));
                        nVar.a(jSONObjectOptJSONObject4.optString("booking"));
                        nVar.setDepartureStation(jSONObjectOptJSONObject4.optString("departure_station"));
                        nVar.setArriveStation(jSONObjectOptJSONObject4.optString("arrive_station"));
                        nVar.setDepartureTime(jSONObjectOptJSONObject4.optString("departure_time"));
                        nVar.setArriveTime(jSONObjectOptJSONObject4.optString("arrive_time"));
                        transitStep.setTrainInfo(nVar);
                    }
                    break;
                case 2:
                    transitStep.setVehileType(com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_PLANE);
                    if (jSONObjectOptJSONObject4 != null) {
                        com.baidu.mapapi.search.core.PlaneInfo planeInfo = new com.baidu.mapapi.search.core.PlaneInfo();
                        planeInfo.setName(jSONObjectOptJSONObject4.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                        planeInfo.setPrice(jSONObjectOptJSONObject4.optDouble(com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE));
                        planeInfo.setDiscount(jSONObjectOptJSONObject4.optDouble("discount"));
                        planeInfo.setAirlines(jSONObjectOptJSONObject4.optString("airlines"));
                        planeInfo.setBooking(jSONObjectOptJSONObject4.optString("booking"));
                        planeInfo.setDepartureStation(jSONObjectOptJSONObject4.optString("departure_station"));
                        planeInfo.setArriveStation(jSONObjectOptJSONObject4.optString("arrive_station"));
                        planeInfo.setDepartureTime(jSONObjectOptJSONObject4.optString("departure_time"));
                        planeInfo.setArriveTime(jSONObjectOptJSONObject4.optString("arrive_time"));
                        transitStep.setPlaneInfo(planeInfo);
                    }
                    break;
                case 3:
                    transitStep.setVehileType(com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_BUS);
                    if (jSONObjectOptJSONObject4 != null) {
                        com.baidu.mapapi.search.core.BusInfo busInfo = new com.baidu.mapapi.search.core.BusInfo();
                        busInfo.setName(jSONObjectOptJSONObject4.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                        busInfo.setType(jSONObjectOptJSONObject4.optInt("type"));
                        busInfo.setStopNum(jSONObjectOptJSONObject4.optInt("stop_num"));
                        busInfo.setDepartureStation(jSONObjectOptJSONObject4.optString("on_station"));
                        busInfo.setArriveStation(jSONObjectOptJSONObject4.optString("off_station"));
                        busInfo.setDepartureTime(jSONObjectOptJSONObject4.optString("first_time"));
                        busInfo.setArriveTime(jSONObjectOptJSONObject4.optString("last_time"));
                        transitStep.setBusInfo(busInfo);
                    }
                    break;
                case 4:
                    stepVehicleInfoType = com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_DRIVING;
                    transitStep.setVehileType(stepVehicleInfoType);
                    break;
                case 5:
                    stepVehicleInfoType = com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_WALK;
                    transitStep.setVehileType(stepVehicleInfoType);
                    break;
                case 6:
                    transitStep.setVehileType(com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_COACH);
                    if (jSONObjectOptJSONObject4 != null) {
                        com.baidu.mapapi.search.core.CoachInfo coachInfo = new com.baidu.mapapi.search.core.CoachInfo();
                        coachInfo.setName(jSONObjectOptJSONObject4.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
                        coachInfo.setPrice(jSONObjectOptJSONObject4.optDouble(com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE));
                        coachInfo.setBooking(jSONObjectOptJSONObject4.optString("booking"));
                        coachInfo.setProviderName(jSONObjectOptJSONObject4.optString("provider_name"));
                        coachInfo.setProviderUrl(jSONObjectOptJSONObject4.optString("provider_url"));
                        coachInfo.setDepartureStation(jSONObjectOptJSONObject4.optString("departure_station"));
                        coachInfo.setArriveStation(jSONObjectOptJSONObject4.optString("arrive_station"));
                        coachInfo.setDepartureTime(jSONObjectOptJSONObject4.optString("departure_time"));
                        coachInfo.setArriveTime(jSONObjectOptJSONObject4.optString("arrive_time"));
                        transitStep.setCoachInfo(coachInfo);
                    }
                    break;
            }
        }
        return transitStep;
    }

    private java.util.List<java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep>> a(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray == null || jSONArray.length() < 0) {
            return null;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(i);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList2.add(a(jSONObjectOptJSONObject));
                    }
                }
                arrayList.add(arrayList2);
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

    private com.baidu.mapapi.search.route.SuggestAddrInfo b(org.json.JSONObject jSONObject) {
        com.baidu.mapapi.search.route.SuggestAddrInfo suggestAddrInfo = new com.baidu.mapapi.search.route.SuggestAddrInfo();
        suggestAddrInfo.setSuggestStartNode(d(jSONObject.optJSONArray("origin_list")));
        suggestAddrInfo.setSuggestEndNode(d(jSONObject.optJSONArray("destination_list")));
        return suggestAddrInfo;
    }

    private java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition> b(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() < 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition trafficCondition = new com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition();
                trafficCondition.setTrafficStatus(jSONObjectOptJSONObject.optInt("status"));
                trafficCondition.setTrafficGeoCnt(jSONObjectOptJSONObject.optInt("geo_cnt"));
                arrayList.add(trafficCondition);
            }
        }
        return arrayList;
    }

    private java.util.List<com.baidu.mapapi.search.core.PriceInfo> c(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            com.baidu.mapapi.search.core.PriceInfo priceInfo = new com.baidu.mapapi.search.core.PriceInfo();
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                priceInfo.setTicketType(jSONObjectOptJSONObject.optInt("ticket_type"));
                priceInfo.setTicketPrice(jSONObjectOptJSONObject.optDouble("ticket_price"));
            }
            arrayList.add(priceInfo);
        }
        return arrayList;
    }

    private java.util.List<com.baidu.mapapi.search.core.PoiInfo> d(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.opt(i);
            if (jSONObject != null) {
                com.baidu.mapapi.search.core.PoiInfo poiInfo = new com.baidu.mapapi.search.core.PoiInfo();
                poiInfo.address = jSONObject.optString("address");
                poiInfo.uid = jSONObject.optString("uid");
                poiInfo.name = jSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
                if (jSONObjectOptJSONObject != null) {
                    poiInfo.location = new com.baidu.mapapi.model.LatLng(jSONObjectOptJSONObject.optDouble("lat"), jSONObjectOptJSONObject.optDouble("lng"));
                    if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                        poiInfo.location = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(poiInfo.location);
                    }
                }
                arrayList.add(poiInfo);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.route.MassTransitRouteResult massTransitRouteResult = new com.baidu.mapapi.search.route.MassTransitRouteResult();
        if (str != null && !str.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("SDK_InnerError")) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                    if (jSONObjectOptJSONObject.has("PermissionCheckError")) {
                        massTransitRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                        return massTransitRouteResult;
                    }
                    if (jSONObjectOptJSONObject.has("httpStateError")) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("httpStateError");
                        if (strOptString.equals("NETWORK_ERROR")) {
                            errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NETWORK_ERROR;
                        } else {
                            errorno = strOptString.equals("REQUEST_ERROR") ? com.baidu.mapapi.search.core.SearchResult.ERRORNO.REQUEST_ERROR : com.baidu.mapapi.search.core.SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        }
                        massTransitRouteResult.error = errorno;
                        return massTransitRouteResult;
                    }
                }
                if (!a(str, massTransitRouteResult, false) && !a(str, massTransitRouteResult)) {
                    massTransitRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
                }
                return massTransitRouteResult;
            } catch (java.lang.Exception unused) {
            }
        }
        massTransitRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return massTransitRouteResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.route.OnGetRoutePlanResultListener)) {
            return;
        }
        ((com.baidu.mapapi.search.route.OnGetRoutePlanResultListener) obj).onGetMassTransitRouteResult((com.baidu.mapapi.search.route.MassTransitRouteResult) searchResult);
    }

    public boolean a(java.lang.String str, com.baidu.mapapi.search.route.MassTransitRouteResult massTransitRouteResult) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno;
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno2;
        if (str != null && str.length() > 0) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                int iOptInt = jSONObject.optInt("status_sdk");
                if (iOptInt != 0) {
                    if (iOptInt == 1) {
                        errorno2 = com.baidu.mapapi.search.core.SearchResult.ERRORNO.MASS_TRANSIT_SERVER_ERROR;
                    } else if (iOptInt == 2) {
                        errorno2 = com.baidu.mapapi.search.core.SearchResult.ERRORNO.MASS_TRANSIT_OPTION_ERROR;
                    } else {
                        if (iOptInt != 1002) {
                            return false;
                        }
                        errorno2 = com.baidu.mapapi.search.core.SearchResult.ERRORNO.MASS_TRANSIT_NO_POI_ERROR;
                    }
                    massTransitRouteResult.error = errorno2;
                    return true;
                }
                int iOptInt2 = jSONObject.optInt("type");
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                if (jSONObjectOptJSONObject == null) {
                    return false;
                }
                if (iOptInt2 != 1) {
                    if (iOptInt2 == 2) {
                        com.baidu.mapapi.search.core.TransitResultNode transitResultNodeA = a(iOptInt2, jSONObjectOptJSONObject.optJSONObject("origin"));
                        massTransitRouteResult.setOrigin(transitResultNodeA);
                        com.baidu.mapapi.search.core.TransitResultNode transitResultNodeA2 = a(iOptInt2, jSONObjectOptJSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION));
                        massTransitRouteResult.setDestination(transitResultNodeA2);
                        massTransitRouteResult.setTotal(jSONObjectOptJSONObject.optInt("total"));
                        massTransitRouteResult.setTaxiInfo(b(jSONObjectOptJSONObject.optString("taxi")));
                        org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("routes");
                        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                            return false;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            org.json.JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject2 != null) {
                                com.baidu.mapapi.search.route.MassTransitRouteLine massTransitRouteLine = new com.baidu.mapapi.search.route.MassTransitRouteLine();
                                massTransitRouteLine.setDistance(jSONObjectOptJSONObject2.optInt("distance"));
                                massTransitRouteLine.setDuration(jSONObjectOptJSONObject2.optInt("duration"));
                                massTransitRouteLine.setArriveTime(jSONObjectOptJSONObject2.optString("arrive_time"));
                                massTransitRouteLine.setPrice(jSONObjectOptJSONObject2.optDouble(com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE));
                                massTransitRouteLine.setPriceInfo(c(jSONObjectOptJSONObject2.optJSONArray("price_detail")));
                                if (transitResultNodeA != null) {
                                    com.baidu.mapapi.search.core.RouteNode routeNode = new com.baidu.mapapi.search.core.RouteNode();
                                    routeNode.setLocation(transitResultNodeA.getLocation());
                                    massTransitRouteLine.setStarting(routeNode);
                                }
                                if (transitResultNodeA2 != null) {
                                    com.baidu.mapapi.search.core.RouteNode routeNode2 = new com.baidu.mapapi.search.core.RouteNode();
                                    routeNode2.setLocation(transitResultNodeA2.getLocation());
                                    massTransitRouteLine.setTerminal(routeNode2);
                                }
                                org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("steps");
                                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                                    massTransitRouteLine.setNewSteps(a(jSONArrayOptJSONArray2));
                                    arrayList.add(massTransitRouteLine);
                                }
                            }
                        }
                        massTransitRouteResult.setRoutelines(arrayList);
                        errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
                    }
                    return true;
                }
                massTransitRouteResult.setOrigin(a(iOptInt2, jSONObjectOptJSONObject.optJSONObject("origin_info")));
                massTransitRouteResult.setDestination(a(iOptInt2, jSONObjectOptJSONObject.optJSONObject("destination_info")));
                massTransitRouteResult.setSuggestAddrInfo(b(jSONObjectOptJSONObject));
                errorno = com.baidu.mapapi.search.core.SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR;
                massTransitRouteResult.error = errorno;
                return true;
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
