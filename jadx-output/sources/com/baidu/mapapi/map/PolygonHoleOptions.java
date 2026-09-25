package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class PolygonHoleOptions extends com.baidu.mapapi.map.HoleOptions {
    private java.util.List<com.baidu.mapapi.model.LatLng> a;

    public PolygonHoleOptions() {
        this.mHoleType = "polygon";
    }

    public com.baidu.mapapi.map.PolygonHoleOptions addPoints(java.util.List<com.baidu.mapapi.model.LatLng> list) {
        if (list == null || list.size() < 3) {
            android.util.Log.e("baidumapsdk", "PolygonHole's points can not be null or points's size can not be less than three");
            return this;
        }
        this.a = list;
        return this;
    }

    public java.util.List<com.baidu.mapapi.model.LatLng> getHolePoints() {
        return this.a;
    }
}
