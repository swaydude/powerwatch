package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
public class ah {
    private com.baidu.mapsdkplatform.comjni.map.basemap.a a;

    public ah(com.baidu.mapsdkplatform.comjni.map.basemap.a aVar) {
        this.a = aVar;
    }

    public android.graphics.Point a(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
        if (geoPoint == null) {
            return null;
        }
        android.graphics.Point point = new android.graphics.Point(0, 0);
        java.lang.String strB = this.a.b((int) geoPoint.getLongitudeE6(), (int) geoPoint.getLatitudeE6());
        if (strB != null && !strB.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(strB);
                point.x = jSONObject.getInt("scrx");
                point.y = jSONObject.getInt("scry");
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        return point;
    }

    public com.baidu.mapapi.model.inner.GeoPoint a(int i, int i2) {
        com.baidu.mapapi.model.inner.GeoPoint geoPoint = new com.baidu.mapapi.model.inner.GeoPoint(0.0d, 0.0d);
        java.lang.String strA = this.a.a(i, i2);
        if (strA != null && !strA.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(strA);
                geoPoint.setLongitudeE6(jSONObject.getInt("geox"));
                geoPoint.setLatitudeE6(jSONObject.getInt("geoy"));
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        return geoPoint;
    }
}
