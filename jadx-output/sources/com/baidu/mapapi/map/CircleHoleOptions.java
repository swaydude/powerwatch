package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class CircleHoleOptions extends com.baidu.mapapi.map.HoleOptions {
    private com.baidu.mapapi.model.LatLng a;
    private int b;

    public CircleHoleOptions() {
        this.mHoleType = "circle";
    }

    public com.baidu.mapapi.map.CircleHoleOptions center(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            android.util.Log.e("baidumapsdk", "CircleHole center can not be null");
            return this;
        }
        this.a = latLng;
        return this;
    }

    public com.baidu.mapapi.model.LatLng getHoleCenter() {
        return this.a;
    }

    public int getHoleRadius() {
        return this.b;
    }

    public com.baidu.mapapi.map.CircleHoleOptions radius(int i) {
        if (i <= 0) {
            android.util.Log.e("baidumapsdk", "CircleHole's radius can not be less than zero");
            return this;
        }
        this.b = i;
        return this;
    }
}
