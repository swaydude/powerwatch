package com.baidu.mapapi.utils;

/* JADX INFO: loaded from: classes.dex */
public class DistanceUtil {
    public static double getDistance(com.baidu.mapapi.model.LatLng latLng, com.baidu.mapapi.model.LatLng latLng2) {
        if (latLng != null && latLng2 != null) {
            com.baidu.mapapi.model.inner.Point pointLl2point = com.baidu.mapapi.model.CoordUtil.ll2point(latLng);
            com.baidu.mapapi.model.inner.Point pointLl2point2 = com.baidu.mapapi.model.CoordUtil.ll2point(latLng2);
            if (pointLl2point != null && pointLl2point2 != null) {
                return com.baidu.mapapi.model.CoordUtil.getDistance(pointLl2point, pointLl2point2);
            }
        }
        return -1.0d;
    }
}
