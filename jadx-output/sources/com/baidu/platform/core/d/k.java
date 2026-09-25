package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
public class k extends com.baidu.platform.base.d {
    com.baidu.mapapi.search.route.SuggestAddrInfo b = null;
    protected boolean c;

    private com.baidu.mapapi.search.route.SuggestAddrInfo a(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONObject jSONObject2;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("traffic_pois")) == null) {
            return null;
        }
        org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("option");
        org.json.JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT);
        if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject3 != null) {
            org.json.JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("start_city");
            java.lang.String strOptString = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("cname") : null;
            org.json.JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("end_city");
            java.lang.String strOptString2 = (jSONArrayOptJSONArray == null || (jSONObject2 = (org.json.JSONObject) jSONArrayOptJSONArray.opt(0)) == null) ? null : jSONObject2.optString("cname");
            org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("city_list");
            org.json.JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("prio_flag");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray3 != null) {
                int length = jSONArrayOptJSONArray2.length();
                boolean[] zArr = new boolean[length];
                boolean[] zArr2 = new boolean[length];
                for (int i = 0; i < length; i++) {
                    int i2 = java.lang.Integer.parseInt(jSONArrayOptJSONArray2.optString(i));
                    int i3 = java.lang.Integer.parseInt(jSONArrayOptJSONArray3.optString(i));
                    boolean z = true;
                    zArr[i] = i2 == 1;
                    if (i3 != 1) {
                        z = false;
                    }
                    zArr2[i] = z;
                }
                com.baidu.mapapi.search.route.SuggestAddrInfo suggestAddrInfo = new com.baidu.mapapi.search.route.SuggestAddrInfo();
                for (int i4 = 0; i4 < length; i4++) {
                    if (!zArr2[i4]) {
                        if (zArr[i4]) {
                            if (i4 == 0) {
                                suggestAddrInfo.setSuggestStartCity(a(jSONObjectOptJSONObject3.optJSONArray("start")));
                            } else if (i4 != length - 1 || i4 <= 0) {
                                suggestAddrInfo.setSuggestWpCity(a(jSONObjectOptJSONObject3, "multi_waypoints"));
                            } else {
                                suggestAddrInfo.setSuggestEndCity(a(jSONObjectOptJSONObject3.optJSONArray("end")));
                            }
                        } else if (i4 == 0) {
                            suggestAddrInfo.setSuggestStartNode(a(jSONObjectOptJSONObject3.optJSONArray("start"), strOptString));
                        } else if (i4 != length - 1 || i4 <= 0) {
                            suggestAddrInfo.setSuggestWpNode(b(jSONObjectOptJSONObject3, "multi_waypoints"));
                        } else {
                            suggestAddrInfo.setSuggestEndNode(a(jSONObjectOptJSONObject3.optJSONArray("end"), strOptString2));
                        }
                    }
                }
                return suggestAddrInfo;
            }
        }
        return null;
    }

    private java.util.List<com.baidu.mapapi.search.core.CityInfo> a(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.opt(i);
            if (jSONObject != null) {
                com.baidu.mapapi.search.core.CityInfo cityInfo = new com.baidu.mapapi.search.core.CityInfo();
                cityInfo.num = jSONObject.optInt("num");
                cityInfo.city = jSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                arrayList.add(cityInfo);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    private java.util.List<com.baidu.mapapi.search.core.PoiInfo> a(org.json.JSONArray jSONArray, java.lang.String str) {
        if (jSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.opt(i);
            if (jSONObject != null) {
                com.baidu.mapapi.search.core.PoiInfo poiInfo = new com.baidu.mapapi.search.core.PoiInfo();
                poiInfo.address = jSONObject.optString("addr");
                poiInfo.uid = jSONObject.optString("uid");
                poiInfo.name = jSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                poiInfo.location = com.baidu.mapapi.model.CoordUtil.decodeLocation(jSONObject.optString("geo"));
                poiInfo.city = str;
                arrayList.add(poiInfo);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    private java.util.List<java.util.List<com.baidu.mapapi.search.core.CityInfo>> a(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONArray jSONArrayOptJSONArray;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray(str)) == null) {
            return null;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            java.util.List<com.baidu.mapapi.search.core.CityInfo> listA = a((org.json.JSONArray) jSONArrayOptJSONArray.opt(i));
            if (listA != null) {
                arrayList.add(listA);
            }
        }
        return arrayList;
    }

    private java.util.List<java.util.List<com.baidu.mapapi.search.core.PoiInfo>> b(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONArray jSONArrayOptJSONArray;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray(str)) == null) {
            return null;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            java.util.List<com.baidu.mapapi.search.core.PoiInfo> listA = a(((org.json.JSONObject) jSONArrayOptJSONArray.opt(i)).optJSONArray("way_ponits"), "");
            if (listA != null) {
                arrayList.add(listA);
            }
        }
        return arrayList;
    }

    private boolean b(java.lang.String str) {
        if (str != null && str.length() > 0) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.optInt("type") != 23 || jSONObjectOptJSONObject.optInt("error") != 0) {
                    return false;
                }
                com.baidu.mapapi.search.route.SuggestAddrInfo suggestAddrInfoA = a(jSONObject);
                this.b = suggestAddrInfoA;
                return suggestAddrInfoA != null;
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.baidu.platform.base.d
    public com.baidu.mapapi.search.core.SearchResult a(java.lang.String str) {
        com.baidu.mapapi.search.core.SearchResult searchResult;
        com.baidu.platform.base.SearchType searchTypeA = a();
        if (b(str)) {
            this.c = true;
        } else {
            this.c = false;
        }
        int i = com.baidu.platform.core.d.l.a[searchTypeA.ordinal()];
        if (i == 1) {
            com.baidu.mapapi.search.route.TransitRouteResult transitRouteResult = new com.baidu.mapapi.search.route.TransitRouteResult();
            if (this.c) {
                transitRouteResult.setSuggestAddrInfo(this.b);
                transitRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR;
                searchResult = transitRouteResult;
            } else {
                ((com.baidu.platform.core.d.m) this).a(str, transitRouteResult);
                searchResult = transitRouteResult;
            }
        } else if (i == 2) {
            com.baidu.mapapi.search.route.DrivingRouteResult drivingRouteResult = new com.baidu.mapapi.search.route.DrivingRouteResult();
            if (this.c) {
                drivingRouteResult.setSuggestAddrInfo(this.b);
                drivingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR;
                searchResult = drivingRouteResult;
            } else {
                ((com.baidu.platform.core.d.c) this).a(str, drivingRouteResult);
                searchResult = drivingRouteResult;
            }
        } else {
            if (i != 3) {
                return null;
            }
            com.baidu.mapapi.search.route.WalkingRouteResult walkingRouteResult = new com.baidu.mapapi.search.route.WalkingRouteResult();
            if (this.c) {
                walkingRouteResult.setSuggestAddrInfo(this.b);
                walkingRouteResult.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR;
                searchResult = walkingRouteResult;
            } else {
                ((com.baidu.platform.core.d.o) this).a(str, walkingRouteResult);
                searchResult = walkingRouteResult;
            }
        }
        return searchResult;
    }

    @Override // com.baidu.platform.base.d
    public void a(com.baidu.mapapi.search.core.SearchResult searchResult, java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.baidu.mapapi.search.route.OnGetRoutePlanResultListener)) {
            return;
        }
        com.baidu.mapapi.search.route.OnGetRoutePlanResultListener onGetRoutePlanResultListener = (com.baidu.mapapi.search.route.OnGetRoutePlanResultListener) obj;
        int i = com.baidu.platform.core.d.l.a[a().ordinal()];
        if (i == 1) {
            onGetRoutePlanResultListener.onGetTransitRouteResult((com.baidu.mapapi.search.route.TransitRouteResult) searchResult);
        } else if (i == 2) {
            onGetRoutePlanResultListener.onGetDrivingRouteResult((com.baidu.mapapi.search.route.DrivingRouteResult) searchResult);
        } else {
            if (i != 3) {
                return;
            }
            onGetRoutePlanResultListener.onGetWalkingRouteResult((com.baidu.mapapi.search.route.WalkingRouteResult) searchResult);
        }
    }
}
