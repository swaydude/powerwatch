package com.baidu.mapapi.search.geocode;

/* JADX INFO: loaded from: classes.dex */
public class GeoCoder extends com.baidu.mapapi.search.core.l {
    private com.baidu.platform.core.b.d a = new com.baidu.platform.core.b.a();
    private boolean b;

    private GeoCoder() {
    }

    public static com.baidu.mapapi.search.geocode.GeoCoder newInstance() {
        com.baidu.mapapi.BMapManager.init();
        return new com.baidu.mapapi.search.geocode.GeoCoder();
    }

    public void destroy() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a();
        com.baidu.mapapi.BMapManager.destroy();
    }

    public boolean geocode(com.baidu.mapapi.search.geocode.GeoCodeOption geoCodeOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: GeoCoder is null, please call newInstance() first.");
        }
        if (geoCodeOption == null || geoCodeOption.mAddress == null || geoCodeOption.mCity == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or address or city can not be null");
        }
        return this.a.a(geoCodeOption);
    }

    public boolean reverseGeoCode(com.baidu.mapapi.search.geocode.ReverseGeoCodeOption reverseGeoCodeOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: GeoCoder is null, please call newInstance() first.");
        }
        if (reverseGeoCodeOption == null || reverseGeoCodeOption.getLocation() == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or mLocation can not be null");
        }
        return this.a.a(reverseGeoCodeOption);
    }

    public void setOnGetGeoCodeResultListener(com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener onGetGeoCoderResultListener) {
        com.baidu.platform.core.b.d dVar = this.a;
        if (dVar == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: GeoCoder is null, please call newInstance() first.");
        }
        if (onGetGeoCoderResultListener == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        dVar.a(onGetGeoCoderResultListener);
    }
}
