package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public class CloudPoiInfo {
    public java.lang.String address;
    public java.lang.String city;
    public java.lang.String direction;
    public int distance;
    public java.lang.String district;
    public java.util.Map<java.lang.String, java.lang.Object> extras;
    public int geotableId;
    public double latitude;
    public double longitude;
    public java.lang.String poiId;
    public java.lang.String province;
    public java.lang.String tags;
    public java.lang.String title;
    public int uid;
    public int weight;

    void a(org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (jSONObject == null) {
            return;
        }
        this.uid = jSONObject.optInt("uid");
        this.poiId = jSONObject.optString("uid");
        jSONObject.remove("uid");
        this.geotableId = jSONObject.optInt("geotable_id");
        jSONObject.remove("geotable_id");
        this.title = jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY);
        jSONObject.remove(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY);
        this.address = jSONObject.optString("address");
        jSONObject.remove("address");
        this.province = jSONObject.optString("province");
        jSONObject.remove("province");
        this.city = jSONObject.optString("city");
        jSONObject.remove("city");
        this.district = jSONObject.optString("district");
        jSONObject.remove("district");
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
        if (jSONArrayOptJSONArray != null) {
            this.longitude = jSONArrayOptJSONArray.optDouble(0);
            this.latitude = jSONArrayOptJSONArray.optDouble(1);
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                com.baidu.mapapi.model.LatLng latLngBaiduToGcj = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(new com.baidu.mapapi.model.LatLng(this.latitude, this.longitude));
                this.longitude = latLngBaiduToGcj.longitude;
                this.latitude = latLngBaiduToGcj.latitude;
            }
        }
        jSONObject.remove(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
        this.tags = jSONObject.optString("tags");
        jSONObject.remove("tags");
        this.distance = jSONObject.optInt("distance");
        jSONObject.remove("distance");
        this.weight = jSONObject.optInt("weight");
        jSONObject.remove("weight");
        this.extras = new java.util.HashMap();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            this.extras.put(next, jSONObject.opt(next));
        }
    }

    void b(org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (jSONObject == null) {
            return;
        }
        this.title = jSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.address = jSONObject.optString("address");
        this.tags = jSONObject.optString("tag");
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
        if (jSONObjectOptJSONObject != null) {
            this.longitude = jSONObjectOptJSONObject.optDouble("lng");
            this.latitude = jSONObjectOptJSONObject.optDouble("lat");
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                com.baidu.mapapi.model.LatLng latLngBaiduToGcj = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(new com.baidu.mapapi.model.LatLng(this.latitude, this.longitude));
                this.longitude = latLngBaiduToGcj.longitude;
                this.latitude = latLngBaiduToGcj.latitude;
            }
        }
        this.direction = jSONObject.optString("direction");
        this.distance = jSONObject.optInt("distance");
    }
}
