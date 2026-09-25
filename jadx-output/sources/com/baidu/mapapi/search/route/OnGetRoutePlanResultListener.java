package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public interface OnGetRoutePlanResultListener {
    void onGetBikingRouteResult(com.baidu.mapapi.search.route.BikingRouteResult bikingRouteResult);

    void onGetDrivingRouteResult(com.baidu.mapapi.search.route.DrivingRouteResult drivingRouteResult);

    void onGetIndoorRouteResult(com.baidu.mapapi.search.route.IndoorRouteResult indoorRouteResult);

    void onGetMassTransitRouteResult(com.baidu.mapapi.search.route.MassTransitRouteResult massTransitRouteResult);

    void onGetTransitRouteResult(com.baidu.mapapi.search.route.TransitRouteResult transitRouteResult);

    void onGetWalkingRouteResult(com.baidu.mapapi.search.route.WalkingRouteResult walkingRouteResult);
}
