package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class MapStatusUpdateFactory {
    MapStatusUpdateFactory() {
    }

    public static com.baidu.mapapi.map.MapStatusUpdate newLatLng(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(2);
        mapStatusUpdate.b = latLng;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate newLatLngBounds(com.baidu.mapapi.model.LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            return null;
        }
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(3);
        mapStatusUpdate.c = latLngBounds;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate newLatLngBounds(com.baidu.mapapi.model.LatLngBounds latLngBounds, int i, int i2) {
        if (latLngBounds == null || i <= 0 || i2 <= 0) {
            return null;
        }
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(9);
        mapStatusUpdate.c = latLngBounds;
        mapStatusUpdate.d = i;
        mapStatusUpdate.e = i2;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate newLatLngBounds(com.baidu.mapapi.model.LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        if (latLngBounds == null) {
            return null;
        }
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(10);
        mapStatusUpdate.c = latLngBounds;
        mapStatusUpdate.k = i;
        mapStatusUpdate.l = i2;
        mapStatusUpdate.m = i3;
        mapStatusUpdate.n = i4;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate newLatLngZoom(com.baidu.mapapi.model.LatLng latLng, float f) {
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(4);
        if (latLng == null) {
            return null;
        }
        mapStatusUpdate.b = latLng;
        mapStatusUpdate.f = f;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate newLatLngZoom(com.baidu.mapapi.model.LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        if (latLngBounds == null) {
            return null;
        }
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(11);
        mapStatusUpdate.c = latLngBounds;
        mapStatusUpdate.k = i;
        mapStatusUpdate.l = i2;
        mapStatusUpdate.m = i3;
        mapStatusUpdate.n = i4;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate newMapStatus(com.baidu.mapapi.map.MapStatus mapStatus) {
        if (mapStatus == null) {
            return null;
        }
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(1);
        mapStatusUpdate.a = mapStatus;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate scrollBy(int i, int i2) {
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(5);
        mapStatusUpdate.g = i;
        mapStatusUpdate.h = i2;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate zoomBy(float f) {
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(6);
        mapStatusUpdate.i = f;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate zoomBy(float f, android.graphics.Point point) {
        if (point == null) {
            return null;
        }
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(7);
        mapStatusUpdate.i = f;
        mapStatusUpdate.j = point;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate zoomIn() {
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(6);
        mapStatusUpdate.i = 1.0f;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate zoomOut() {
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(6);
        mapStatusUpdate.i = -1.0f;
        return mapStatusUpdate;
    }

    public static com.baidu.mapapi.map.MapStatusUpdate zoomTo(float f) {
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate(8);
        mapStatusUpdate.f = f;
        return mapStatusUpdate;
    }
}
