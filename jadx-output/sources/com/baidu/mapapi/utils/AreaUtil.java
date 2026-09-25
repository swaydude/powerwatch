package com.baidu.mapapi.utils;

/* JADX INFO: loaded from: classes.dex */
public class AreaUtil {
    public static double calculateArea(com.baidu.mapapi.model.LatLng latLng, com.baidu.mapapi.model.LatLng latLng2) {
        if (latLng != null && latLng2 != null) {
            com.baidu.mapapi.model.LatLng latLng3 = new com.baidu.mapapi.model.LatLng(latLng.latitude, latLng2.longitude);
            double distance = com.baidu.mapapi.utils.DistanceUtil.getDistance(latLng3, latLng2);
            double distance2 = com.baidu.mapapi.utils.DistanceUtil.getDistance(latLng, latLng3);
            if (distance != 0.0d && distance2 != 0.0d) {
                return distance * distance2;
            }
        }
        return 0.0d;
    }

    public static double calculateArea(java.util.List<com.baidu.mapapi.model.LatLng> list) {
        double dCos = 0.0d;
        if (list == null || list.size() < 3) {
            return 0.0d;
        }
        double d = 111319.49079327358d;
        int size = list.size();
        int i = 0;
        while (i < size) {
            com.baidu.mapapi.model.LatLng latLng = list.get(i);
            i++;
            com.baidu.mapapi.model.LatLng latLng2 = list.get(i % size);
            dCos += (((latLng.longitude * d) * java.lang.Math.cos(latLng.latitude * 0.017453292519943295d)) * (latLng2.latitude * 111319.49079327358d)) - ((latLng.latitude * d) * ((latLng2.longitude * d) * java.lang.Math.cos(latLng2.latitude * 0.017453292519943295d)));
            d = 111319.49079327358d;
        }
        return (float) java.lang.Math.abs(dCos / 2.0d);
    }
}
