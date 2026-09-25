package com.baidu.mapapi.model;

/* JADX INFO: loaded from: classes.dex */
public class CoordUtil {
    public static com.baidu.mapapi.model.LatLng Coordinate_encryptEx(float f, float f2, java.lang.String str) {
        return com.baidu.mapsdkplatform.comapi.util.b.a(f, f2, str);
    }

    public static com.baidu.mapapi.model.LatLng decodeLocation(java.lang.String str) {
        com.baidu.mapapi.CoordType coordType = com.baidu.mapapi.SDKInitializer.getCoordType();
        com.baidu.mapapi.CoordType coordType2 = com.baidu.mapapi.CoordType.GCJ02;
        com.baidu.mapapi.model.LatLng latLngA = com.baidu.mapsdkplatform.comapi.util.b.a(str);
        return coordType == coordType2 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLngA) : latLngA;
    }

    public static java.util.List<com.baidu.mapapi.model.LatLng> decodeLocationList(java.lang.String str) {
        return com.baidu.mapsdkplatform.comapi.util.b.c(str);
    }

    public static java.util.List<java.util.List<com.baidu.mapapi.model.LatLng>> decodeLocationList2D(java.lang.String str) {
        return com.baidu.mapsdkplatform.comapi.util.b.d(str);
    }

    public static com.baidu.mapapi.model.LatLng decodeNodeLocation(java.lang.String str) {
        com.baidu.mapapi.CoordType coordType = com.baidu.mapapi.SDKInitializer.getCoordType();
        com.baidu.mapapi.CoordType coordType2 = com.baidu.mapapi.CoordType.GCJ02;
        com.baidu.mapapi.model.LatLng latLngB = com.baidu.mapsdkplatform.comapi.util.b.b(str);
        return coordType == coordType2 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLngB) : latLngB;
    }

    public static double getDistance(com.baidu.mapapi.model.inner.Point point, com.baidu.mapapi.model.inner.Point point2) {
        return com.baidu.mapsdkplatform.comjni.tools.a.a(point, point2);
    }

    public static int getMCDistanceByOneLatLngAndRadius(com.baidu.mapapi.model.LatLng latLng, int i) {
        return com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.b.a(com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(latLng), i) : com.baidu.mapsdkplatform.comapi.util.b.a(latLng, i);
    }

    public static com.baidu.mapapi.model.inner.GeoPoint ll2mc(com.baidu.mapapi.model.LatLng latLng) {
        return com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.b.a(com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(latLng)) : com.baidu.mapsdkplatform.comapi.util.b.a(latLng);
    }

    public static com.baidu.mapapi.model.inner.Point ll2point(com.baidu.mapapi.model.LatLng latLng) {
        return com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.b.b(com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(latLng)) : com.baidu.mapsdkplatform.comapi.util.b.b(latLng);
    }

    public static com.baidu.mapapi.model.LatLng mc2ll(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
        com.baidu.mapapi.CoordType coordType = com.baidu.mapapi.SDKInitializer.getCoordType();
        com.baidu.mapapi.CoordType coordType2 = com.baidu.mapapi.CoordType.GCJ02;
        com.baidu.mapapi.model.LatLng latLngA = com.baidu.mapsdkplatform.comapi.util.b.a(geoPoint);
        return coordType == coordType2 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLngA) : latLngA;
    }
}
