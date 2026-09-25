package com.baidu.mapapi.utils;

/* JADX INFO: loaded from: classes.dex */
public class CoordinateConverter {
    private com.baidu.mapapi.model.LatLng a;
    private com.baidu.mapapi.utils.CoordinateConverter.CoordType b;

    public enum CoordType {
        GPS,
        COMMON,
        BD09LL,
        BD09MC
    }

    private static com.baidu.mapapi.model.LatLng a(com.baidu.mapapi.model.LatLng latLng) {
        return a(latLng, com.baidu.mapsdkplatform.comapi.location.CoordinateType.WGS84);
    }

    private static com.baidu.mapapi.model.LatLng a(com.baidu.mapapi.model.LatLng latLng, java.lang.String str) {
        if (latLng == null) {
            return null;
        }
        return com.baidu.mapapi.model.CoordUtil.Coordinate_encryptEx((float) latLng.longitude, (float) latLng.latitude, str);
    }

    private static com.baidu.mapapi.model.LatLng b(com.baidu.mapapi.model.LatLng latLng) {
        return a(latLng, com.baidu.mapsdkplatform.comapi.location.CoordinateType.GCJ02);
    }

    private static com.baidu.mapapi.model.LatLng c(com.baidu.mapapi.model.LatLng latLng) {
        return a(latLng, com.baidu.mapsdkplatform.comapi.location.CoordinateType.BD09MC);
    }

    private static com.baidu.mapapi.model.LatLng d(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLng);
    }

    public com.baidu.mapapi.model.LatLng convert() {
        if (this.a == null) {
            return null;
        }
        if (this.b == null) {
            this.b = com.baidu.mapapi.utils.CoordinateConverter.CoordType.GPS;
        }
        int i = com.baidu.mapapi.utils.a.a[this.b.ordinal()];
        if (i == 1) {
            return b(this.a);
        }
        if (i == 2) {
            return a(this.a);
        }
        if (i == 3) {
            return d(this.a);
        }
        if (i != 4) {
            return null;
        }
        return c(this.a);
    }

    public com.baidu.mapapi.utils.CoordinateConverter coord(com.baidu.mapapi.model.LatLng latLng) {
        this.a = latLng;
        return this;
    }

    public com.baidu.mapapi.utils.CoordinateConverter from(com.baidu.mapapi.utils.CoordinateConverter.CoordType coordType) {
        this.b = coordType;
        return this;
    }
}
