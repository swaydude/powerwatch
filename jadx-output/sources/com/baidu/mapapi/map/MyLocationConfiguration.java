package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class MyLocationConfiguration {
    public int accuracyCircleFillColor;
    public int accuracyCircleStrokeColor;
    public final com.baidu.mapapi.map.BitmapDescriptor customMarker;
    public final boolean enableDirection;
    public final com.baidu.mapapi.map.MyLocationConfiguration.LocationMode locationMode;

    public enum LocationMode {
        NORMAL,
        FOLLOWING,
        COMPASS
    }

    public MyLocationConfiguration(com.baidu.mapapi.map.MyLocationConfiguration.LocationMode locationMode, boolean z, com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor) {
        this.accuracyCircleFillColor = 4521984;
        this.accuracyCircleStrokeColor = 4653056;
        this.locationMode = locationMode == null ? com.baidu.mapapi.map.MyLocationConfiguration.LocationMode.NORMAL : locationMode;
        this.enableDirection = z;
        this.customMarker = bitmapDescriptor;
        this.accuracyCircleFillColor = a(this.accuracyCircleFillColor);
        this.accuracyCircleStrokeColor = a(this.accuracyCircleStrokeColor);
    }

    public MyLocationConfiguration(com.baidu.mapapi.map.MyLocationConfiguration.LocationMode locationMode, boolean z, com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor, int i, int i2) {
        this.accuracyCircleFillColor = 4521984;
        this.accuracyCircleStrokeColor = 4653056;
        this.locationMode = locationMode == null ? com.baidu.mapapi.map.MyLocationConfiguration.LocationMode.NORMAL : locationMode;
        this.enableDirection = z;
        this.customMarker = bitmapDescriptor;
        this.accuracyCircleFillColor = a(i);
        this.accuracyCircleStrokeColor = a(i2);
    }

    private int a(int i) {
        return android.graphics.Color.argb(((-16777216) & i) >> 24, i & 255, (65280 & i) >> 8, (16711680 & i) >> 16);
    }
}
