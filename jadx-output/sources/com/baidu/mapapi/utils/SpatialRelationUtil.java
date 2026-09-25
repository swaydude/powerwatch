package com.baidu.mapapi.utils;

/* JADX INFO: loaded from: classes.dex */
public class SpatialRelationUtil {
    private static com.baidu.mapapi.model.LatLng a(com.baidu.mapapi.model.LatLng latLng, com.baidu.mapapi.model.LatLng latLng2, com.baidu.mapapi.model.LatLng latLng3) {
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(latLng);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc2 = com.baidu.mapapi.model.CoordUtil.ll2mc(latLng2);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc3 = com.baidu.mapapi.model.CoordUtil.ll2mc(latLng3);
        double dSqrt = java.lang.Math.sqrt(((geoPointLl2mc.getLongitudeE6() - geoPointLl2mc.getLongitudeE6()) * (geoPointLl2mc2.getLongitudeE6() - geoPointLl2mc.getLongitudeE6())) + ((geoPointLl2mc2.getLatitudeE6() - geoPointLl2mc.getLatitudeE6()) * (geoPointLl2mc2.getLatitudeE6() - geoPointLl2mc.getLatitudeE6())));
        double longitudeE6 = (((geoPointLl2mc2.getLongitudeE6() - geoPointLl2mc.getLongitudeE6()) * (geoPointLl2mc3.getLongitudeE6() - geoPointLl2mc.getLongitudeE6())) + ((geoPointLl2mc2.getLatitudeE6() - geoPointLl2mc.getLatitudeE6()) * (geoPointLl2mc3.getLatitudeE6() - geoPointLl2mc.getLatitudeE6()))) / (dSqrt * dSqrt);
        return com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(geoPointLl2mc.getLatitudeE6() + ((geoPointLl2mc2.getLatitudeE6() - geoPointLl2mc.getLatitudeE6()) * longitudeE6), geoPointLl2mc.getLongitudeE6() + ((geoPointLl2mc2.getLongitudeE6() - geoPointLl2mc.getLongitudeE6()) * longitudeE6)));
    }

    public static com.baidu.mapapi.model.LatLng getNearestPointFromLine(java.util.List<com.baidu.mapapi.model.LatLng> list, com.baidu.mapapi.model.LatLng latLng) {
        com.baidu.mapapi.model.LatLng latLng2 = null;
        if (list != null && list.size() != 0 && latLng != null) {
            int i = 0;
            while (i < list.size() - 1) {
                int i2 = i + 1;
                com.baidu.mapapi.model.LatLng latLngA = a(list.get(i), list.get(i2), latLng);
                if ((latLngA.latitude - list.get(i).latitude) * (latLngA.latitude - list.get(i2).latitude) > 0.0d || (latLngA.longitude - list.get(i).longitude) * (latLngA.longitude - list.get(i2).longitude) > 0.0d) {
                    latLngA = com.baidu.mapapi.utils.DistanceUtil.getDistance(latLng, list.get(i)) < com.baidu.mapapi.utils.DistanceUtil.getDistance(latLng, list.get(i2)) ? list.get(i) : list.get(i2);
                }
                if (latLng2 == null || com.baidu.mapapi.utils.DistanceUtil.getDistance(latLng, latLngA) < com.baidu.mapapi.utils.DistanceUtil.getDistance(latLng, latLng2)) {
                    latLng2 = latLngA;
                }
                i = i2;
            }
        }
        return latLng2;
    }

    public static boolean isCircleContainsPoint(com.baidu.mapapi.model.LatLng latLng, int i, com.baidu.mapapi.model.LatLng latLng2) {
        return (latLng == null || i == 0 || latLng2 == null || com.baidu.mapapi.utils.DistanceUtil.getDistance(latLng, latLng2) > ((double) i)) ? false : true;
    }

    public static boolean isPolygonContainsPoint(java.util.List<com.baidu.mapapi.model.LatLng> list, com.baidu.mapapi.model.LatLng latLng) {
        if (list == null || list.size() == 0 || latLng == null) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (latLng.longitude == list.get(i).longitude && latLng.latitude == list.get(i).latitude) {
                return true;
            }
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            com.baidu.mapapi.model.LatLng latLng2 = list.get(i2);
            i2++;
            com.baidu.mapapi.model.LatLng latLng3 = list.get(i2 % size);
            if (latLng2.latitude != latLng3.latitude && latLng.latitude >= java.lang.Math.min(latLng2.latitude, latLng3.latitude) && latLng.latitude < java.lang.Math.max(latLng2.latitude, latLng3.latitude)) {
                double d = (((latLng.latitude - latLng2.latitude) * (latLng3.longitude - latLng2.longitude)) / (latLng3.latitude - latLng2.latitude)) + latLng2.longitude;
                if (d == latLng.longitude) {
                    return true;
                }
                if (d < latLng.longitude) {
                    i3++;
                }
            }
        }
        return i3 % 2 == 1;
    }
}
