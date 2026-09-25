package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class IndoorPlanNode {
    private com.baidu.mapapi.model.LatLng a;
    private java.lang.String b;

    public IndoorPlanNode(com.baidu.mapapi.model.LatLng latLng, java.lang.String str) {
        this.a = null;
        this.b = null;
        this.a = latLng;
        this.b = str;
    }

    public java.lang.String getFloor() {
        return this.b;
    }

    public com.baidu.mapapi.model.LatLng getLocation() {
        return this.a;
    }
}
