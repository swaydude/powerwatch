package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class MapStatusUpdate {
    private static final java.lang.String o = "MapStatusUpdate";
    com.baidu.mapapi.map.MapStatus a;
    com.baidu.mapapi.model.LatLng b;
    com.baidu.mapapi.model.LatLngBounds c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    android.graphics.Point j;
    int k = 0;
    int l = 0;
    int m = 0;
    int n = 0;
    private int p;

    private MapStatusUpdate() {
    }

    MapStatusUpdate(int i) {
        this.p = i;
    }

    private float a(float f) {
        return (float) (java.lang.Math.pow(2.0d, 18.0f - f) / ((double) (com.baidu.mapapi.common.SysOSUtil.getDensityDpi() / 310.0f)));
    }

    private float a(com.baidu.mapapi.model.LatLngBounds latLngBounds, com.baidu.mapsdkplatform.comapi.map.e eVar, int i, int i2) {
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(latLngBounds.southwest);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc2 = com.baidu.mapapi.model.CoordUtil.ll2mc(latLngBounds.northeast);
        int longitudeE6 = (int) geoPointLl2mc.getLongitudeE6();
        int latitudeE6 = (int) geoPointLl2mc.getLatitudeE6();
        return eVar.a(longitudeE6, (int) geoPointLl2mc2.getLatitudeE6(), (int) geoPointLl2mc2.getLongitudeE6(), latitudeE6, i, i2);
    }

    private com.baidu.mapapi.map.MapStatusUpdate a(com.baidu.mapapi.map.MapStatus mapStatus) {
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate = new com.baidu.mapapi.map.MapStatusUpdate();
        synchronized (this) {
            mapStatusUpdate.a = mapStatus;
            mapStatusUpdate.c = this.c;
            mapStatusUpdate.k = this.k;
            mapStatusUpdate.l = this.l;
            mapStatusUpdate.m = this.m;
            mapStatusUpdate.n = this.n;
        }
        return mapStatusUpdate;
    }

    private com.baidu.mapapi.model.LatLng a(com.baidu.mapapi.model.LatLngBounds latLngBounds, com.baidu.mapsdkplatform.comapi.map.e eVar, float f) {
        double longitudeE6;
        double latitudeE6;
        double latitudeE7;
        if (latLngBounds == null || eVar == null) {
            return null;
        }
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(latLngBounds.getCenter());
        int i = this.k;
        double d = i * f;
        int i2 = this.m;
        double d2 = i2 * f;
        double d3 = this.l * f;
        double d4 = this.n * f;
        if (i > i2) {
            longitudeE6 = geoPointLl2mc.getLongitudeE6() - ((d - d2) / 2.0d);
        } else {
            longitudeE6 = i < i2 ? geoPointLl2mc.getLongitudeE6() + ((d2 - d) / 2.0d) : geoPointLl2mc.getLongitudeE6();
        }
        int i3 = this.l;
        int i4 = this.n;
        if (i3 >= i4) {
            if (i3 > i4) {
                latitudeE7 = geoPointLl2mc.getLatitudeE6();
                d3 -= d4;
            } else {
                latitudeE6 = geoPointLl2mc.getLatitudeE6();
            }
            return com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(latitudeE6, longitudeE6));
        }
        latitudeE7 = geoPointLl2mc.getLatitudeE6() - ((d4 - d3) / 2.0d);
        latitudeE6 = latitudeE7 + (d3 / 2.0d);
        return com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(latitudeE6, longitudeE6));
    }

    private boolean a(int i, int i2, int i3, int i4, com.baidu.mapsdkplatform.comapi.map.e eVar) {
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdateG = eVar.G();
        return (mapStatusUpdateG != null && i == mapStatusUpdateG.k && i2 == mapStatusUpdateG.l && i3 == mapStatusUpdateG.m && i4 == mapStatusUpdateG.n) ? false : true;
    }

    private boolean a(com.baidu.mapapi.model.LatLngBounds latLngBounds, com.baidu.mapsdkplatform.comapi.map.e eVar) {
        com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdateG = eVar.G();
        if (mapStatusUpdateG == null) {
            return true;
        }
        return (latLngBounds.southwest.latitude == mapStatusUpdateG.c.southwest.latitude && latLngBounds.southwest.longitude == mapStatusUpdateG.c.southwest.longitude && latLngBounds.northeast.latitude == mapStatusUpdateG.c.northeast.latitude && latLngBounds.northeast.longitude == mapStatusUpdateG.c.northeast.longitude) ? false : true;
    }

    com.baidu.mapapi.map.MapStatus a(com.baidu.mapsdkplatform.comapi.map.e eVar, com.baidu.mapapi.map.MapStatus mapStatus) {
        if (eVar == null || mapStatus == null) {
            return null;
        }
        switch (this.p) {
            case 1:
                return this.a;
            case 2:
                return new com.baidu.mapapi.map.MapStatus(mapStatus.rotate, this.b, mapStatus.overlook, mapStatus.zoom, mapStatus.targetScreen, null);
            case 3:
                com.baidu.mapapi.model.LatLngBounds latLngBounds = this.c;
                if (latLngBounds == null) {
                    return null;
                }
                com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(latLngBounds.southwest);
                com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc2 = com.baidu.mapapi.model.CoordUtil.ll2mc(this.c.northeast);
                float fA = eVar.a((int) geoPointLl2mc.getLongitudeE6(), (int) geoPointLl2mc2.getLatitudeE6(), (int) geoPointLl2mc2.getLongitudeE6(), (int) geoPointLl2mc.getLatitudeE6(), mapStatus.a.j.right - mapStatus.a.j.left, mapStatus.a.j.bottom - mapStatus.a.j.top);
                return new com.baidu.mapapi.map.MapStatus(mapStatus.rotate, this.c.getCenter(), mapStatus.overlook, fA, mapStatus.targetScreen, null);
            case 4:
                return new com.baidu.mapapi.map.MapStatus(mapStatus.rotate, this.b, mapStatus.overlook, this.f, mapStatus.targetScreen, null);
            case 5:
                com.baidu.mapapi.model.inner.GeoPoint geoPointB = eVar.b((eVar.H() / 2) + this.g, (eVar.I() / 2) + this.h);
                return new com.baidu.mapapi.map.MapStatus(mapStatus.rotate, com.baidu.mapapi.model.CoordUtil.mc2ll(geoPointB), mapStatus.overlook, mapStatus.zoom, mapStatus.targetScreen, geoPointB.getLongitudeE6(), geoPointB.getLatitudeE6(), null);
            case 6:
                return new com.baidu.mapapi.map.MapStatus(mapStatus.rotate, mapStatus.target, mapStatus.overlook, mapStatus.zoom + this.i, mapStatus.targetScreen, mapStatus.a(), mapStatus.b(), null);
            case 7:
                return new com.baidu.mapapi.map.MapStatus(mapStatus.rotate, com.baidu.mapapi.model.CoordUtil.mc2ll(eVar.b(this.j.x, this.j.y)), mapStatus.overlook, mapStatus.zoom + this.i, this.j, null);
            case 8:
                return new com.baidu.mapapi.map.MapStatus(mapStatus.rotate, mapStatus.target, mapStatus.overlook, this.f, mapStatus.targetScreen, mapStatus.a(), mapStatus.b(), null);
            case 9:
                com.baidu.mapapi.model.LatLngBounds latLngBounds2 = this.c;
                if (latLngBounds2 == null) {
                    return null;
                }
                com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc3 = com.baidu.mapapi.model.CoordUtil.ll2mc(latLngBounds2.southwest);
                com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc4 = com.baidu.mapapi.model.CoordUtil.ll2mc(this.c.northeast);
                float fA2 = eVar.a((int) geoPointLl2mc3.getLongitudeE6(), (int) geoPointLl2mc4.getLatitudeE6(), (int) geoPointLl2mc4.getLongitudeE6(), (int) geoPointLl2mc3.getLatitudeE6(), this.d, this.e);
                return new com.baidu.mapapi.map.MapStatus(mapStatus.rotate, this.c.getCenter(), mapStatus.overlook, fA2, mapStatus.targetScreen, null);
            case 10:
                if (this.c == null) {
                    return null;
                }
                int iH = (eVar.H() - this.k) - this.m;
                if (iH < 0) {
                    iH = eVar.H();
                    android.util.Log.e(o, "Bound paddingLeft or paddingRight too larger, please check");
                }
                int I = (eVar.I() - this.l) - this.n;
                if (I < 0) {
                    I = eVar.I();
                    android.util.Log.e(o, "Bound paddingTop or paddingBottom too larger, please check");
                }
                float fA3 = a(this.c, eVar, iH, I);
                com.baidu.mapapi.model.LatLng latLngA = a(this.c, eVar, a(fA3));
                if (latLngA == null) {
                    android.util.Log.e(o, "Bound center error");
                    return null;
                }
                boolean zA = a(this.c, eVar);
                boolean zA2 = a(this.k, this.l, this.m, this.n, eVar);
                if (zA || zA2) {
                    com.baidu.mapapi.map.MapStatus mapStatus2 = new com.baidu.mapapi.map.MapStatus(mapStatus.rotate, latLngA, mapStatus.overlook, fA3, null, null);
                    eVar.a(a(mapStatus2));
                    return mapStatus2;
                }
                if (eVar.G() != null) {
                    return eVar.G().a;
                }
                return null;
            case 11:
                if (this.c == null) {
                    return null;
                }
                int iH2 = (eVar.H() - this.k) - this.m;
                if (iH2 < 0) {
                    iH2 = eVar.H();
                    android.util.Log.e(o, "Bound paddingLeft or paddingRight too larger, please check");
                }
                int I2 = (eVar.I() - this.l) - this.n;
                if (I2 < 0) {
                    I2 = eVar.I();
                    android.util.Log.e(o, "Bound paddingTop or paddingBottom too larger, please check");
                }
                com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc5 = com.baidu.mapapi.model.CoordUtil.ll2mc(this.c.southwest);
                com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc6 = com.baidu.mapapi.model.CoordUtil.ll2mc(this.c.northeast);
                float fA4 = eVar.a((int) geoPointLl2mc5.getLongitudeE6(), (int) geoPointLl2mc6.getLatitudeE6(), (int) geoPointLl2mc6.getLongitudeE6(), (int) geoPointLl2mc5.getLatitudeE6(), iH2, I2);
                android.graphics.Point point = new android.graphics.Point(this.k + (iH2 / 2), this.l + (I2 / 2));
                return new com.baidu.mapapi.map.MapStatus(mapStatus.rotate, this.c.getCenter(), mapStatus.overlook, fA4, point, null);
            default:
                return null;
        }
    }
}
