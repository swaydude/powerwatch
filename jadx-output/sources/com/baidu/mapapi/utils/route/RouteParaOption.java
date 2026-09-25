package com.baidu.mapapi.utils.route;

/* JADX INFO: loaded from: classes.dex */
public class RouteParaOption {
    com.baidu.mapapi.model.LatLng a;
    com.baidu.mapapi.model.LatLng b;
    java.lang.String c;
    java.lang.String d;
    java.lang.String e;
    com.baidu.mapapi.utils.route.RouteParaOption.EBusStrategyType f = com.baidu.mapapi.utils.route.RouteParaOption.EBusStrategyType.bus_recommend_way;

    public enum EBusStrategyType {
        bus_time_first,
        bus_transfer_little,
        bus_walk_little,
        bus_no_subway,
        bus_recommend_way
    }

    public com.baidu.mapapi.utils.route.RouteParaOption busStrategyType(com.baidu.mapapi.utils.route.RouteParaOption.EBusStrategyType eBusStrategyType) {
        this.f = eBusStrategyType;
        return this;
    }

    public com.baidu.mapapi.utils.route.RouteParaOption cityName(java.lang.String str) {
        this.e = str;
        return this;
    }

    public com.baidu.mapapi.utils.route.RouteParaOption endName(java.lang.String str) {
        this.d = str;
        return this;
    }

    public com.baidu.mapapi.utils.route.RouteParaOption endPoint(com.baidu.mapapi.model.LatLng latLng) {
        this.b = latLng;
        return this;
    }

    public com.baidu.mapapi.utils.route.RouteParaOption.EBusStrategyType getBusStrategyType() {
        return this.f;
    }

    public java.lang.String getCityName() {
        return this.e;
    }

    public java.lang.String getEndName() {
        return this.d;
    }

    public com.baidu.mapapi.model.LatLng getEndPoint() {
        return this.b;
    }

    public java.lang.String getStartName() {
        return this.c;
    }

    public com.baidu.mapapi.model.LatLng getStartPoint() {
        return this.a;
    }

    public com.baidu.mapapi.utils.route.RouteParaOption startName(java.lang.String str) {
        this.c = str;
        return this;
    }

    public com.baidu.mapapi.utils.route.RouteParaOption startPoint(com.baidu.mapapi.model.LatLng latLng) {
        this.a = latLng;
        return this;
    }
}
