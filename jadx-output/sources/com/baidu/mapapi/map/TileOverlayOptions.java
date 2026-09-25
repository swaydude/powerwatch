package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class TileOverlayOptions {
    private static android.os.Bundle c = null;
    private static final java.lang.String j = "TileOverlayOptions";
    private com.baidu.mapapi.map.TileProvider b;
    public int datasource;
    public java.lang.String urlString;
    private int a = 209715200;
    private int d = 20;
    private int e = 3;
    private int f = 15786414;
    private int g = -20037726;
    private int h = -15786414;
    private int i = 20037726;

    public TileOverlayOptions() {
        android.os.Bundle bundle = new android.os.Bundle();
        c = bundle;
        bundle.putInt("rectr", this.f);
        c.putInt("rectb", this.g);
        c.putInt("rectl", this.h);
        c.putInt("rectt", this.i);
    }

    private com.baidu.mapapi.map.TileOverlayOptions a(int i, int i2) {
        this.d = i;
        this.e = i2;
        return this;
    }

    android.os.Bundle a() {
        c.putString("url", this.urlString);
        c.putInt("datasource", this.datasource);
        c.putInt("maxDisplay", this.d);
        c.putInt("minDisplay", this.e);
        c.putInt("sdktiletmpmax", this.a);
        return c;
    }

    com.baidu.mapapi.map.TileOverlay a(com.baidu.mapapi.map.BaiduMap baiduMap) {
        return new com.baidu.mapapi.map.TileOverlay(baiduMap, this.b);
    }

    public com.baidu.mapapi.map.TileOverlayOptions setMaxTileTmp(int i) {
        this.a = i;
        return this;
    }

    public com.baidu.mapapi.map.TileOverlayOptions setPositionFromBounds(com.baidu.mapapi.model.LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: bound can not be null");
        }
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(latLngBounds.northeast);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc2 = com.baidu.mapapi.model.CoordUtil.ll2mc(latLngBounds.southwest);
        double latitudeE6 = geoPointLl2mc.getLatitudeE6();
        double longitudeE6 = geoPointLl2mc2.getLongitudeE6();
        double latitudeE7 = geoPointLl2mc2.getLatitudeE6();
        double longitudeE7 = geoPointLl2mc.getLongitudeE6();
        if (latitudeE6 <= latitudeE7 || longitudeE7 <= longitudeE6) {
            android.util.Log.e(j, "BDMapSDKException: bounds is illegal, use default bounds");
        } else {
            c.putInt("rectr", (int) longitudeE7);
            c.putInt("rectb", (int) latitudeE7);
            c.putInt("rectl", (int) longitudeE6);
            c.putInt("rectt", (int) latitudeE6);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    public com.baidu.mapapi.map.TileOverlayOptions tileProvider(com.baidu.mapapi.map.TileProvider tileProvider) {
        java.lang.String str;
        java.lang.String str2;
        int maxDisLevel;
        if (tileProvider == null) {
            return null;
        }
        if (!(tileProvider instanceof com.baidu.mapapi.map.UrlTileProvider)) {
            if (!(tileProvider instanceof com.baidu.mapapi.map.FileTileProvider)) {
                str = j;
                str2 = "tileProvider must be UrlTileProvider or FileTileProvider";
                android.util.Log.e(str, str2);
                return null;
            }
            this.datasource = 0;
            this.b = tileProvider;
            maxDisLevel = tileProvider.getMaxDisLevel();
            int minDisLevel = tileProvider.getMinDisLevel();
            if (maxDisLevel <= 21) {
                android.util.Log.e(j, "display level is illegal");
            } else {
                android.util.Log.e(j, "display level is illegal");
            }
            return this;
        }
        this.datasource = 1;
        java.lang.String tileUrl = ((com.baidu.mapapi.map.UrlTileProvider) tileProvider).getTileUrl();
        if (tileUrl == null || "".equals(tileUrl) || !tileUrl.contains("{x}") || !tileUrl.contains("{y}") || !tileUrl.contains("{z}")) {
            str = j;
            str2 = "tile url template is illegal, must contains {x}、{y}、{z}";
            android.util.Log.e(str, str2);
            return null;
        }
        this.urlString = tileUrl;
        this.b = tileProvider;
        maxDisLevel = tileProvider.getMaxDisLevel();
        int minDisLevel2 = tileProvider.getMinDisLevel();
        if (maxDisLevel <= 21 || minDisLevel2 < 3) {
            android.util.Log.e(j, "display level is illegal");
        } else {
            a(maxDisLevel, minDisLevel2);
        }
        return this;
    }
}
