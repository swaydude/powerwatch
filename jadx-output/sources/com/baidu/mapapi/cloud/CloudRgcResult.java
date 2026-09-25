package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public class CloudRgcResult {
    public com.baidu.mapapi.cloud.CloudRgcResult.AddressCompents addressCompents;
    public java.lang.String customLocationDescription;
    public java.util.List<com.baidu.mapapi.cloud.CloudPoiInfo> customPois;
    public java.lang.String formattedAddress;
    public com.baidu.mapapi.model.LatLng location;
    public java.lang.String message;
    public java.util.List<com.baidu.mapapi.cloud.CloudRgcResult.PoiInfo> pois;
    public java.lang.String recommendedLocationDescription;
    public int status;

    public class AddressCompents {
        public int adminAreaCode;
        public java.lang.String city;
        public java.lang.String country;
        public java.lang.String countryCode;
        public java.lang.String district;
        public java.lang.String province;
        public java.lang.String street;
        public java.lang.String streetNumber;

        public AddressCompents() {
        }

        void a(org.json.JSONObject jSONObject) throws org.json.JSONException {
            if (jSONObject != null) {
                this.country = jSONObject.optString("country");
                this.province = jSONObject.optString("province");
                this.city = jSONObject.optString("city");
                this.district = jSONObject.optString("district");
                this.street = jSONObject.optString("street");
                this.streetNumber = jSONObject.optString("street_number");
                this.adminAreaCode = jSONObject.optInt("admin_area_code");
                this.countryCode = jSONObject.optString("country_code");
            }
        }
    }

    public class PoiInfo {
        public java.lang.String address;
        public java.lang.String direction;
        public int distance;
        public com.baidu.mapapi.model.LatLng location;
        public java.lang.String name;
        public java.lang.String tag;
        public java.lang.String uid;

        public PoiInfo() {
        }

        public void parseFromJSON(org.json.JSONObject jSONObject) throws org.json.JSONException {
            if (jSONObject != null) {
                this.name = jSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                this.uid = jSONObject.optString("id");
                this.address = jSONObject.optString("address");
                this.tag = jSONObject.optString("tag");
                org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
                if (jSONObjectOptJSONObject != null) {
                    this.location = new com.baidu.mapapi.model.LatLng(jSONObjectOptJSONObject.optDouble("lat"), jSONObjectOptJSONObject.optDouble("lng"));
                    if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                        this.location = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(this.location);
                    }
                }
                this.direction = jSONObject.optString("direction");
                this.distance = jSONObject.optInt("distance");
            }
        }
    }

    public void parseFromJSON(org.json.JSONObject jSONObject) throws org.json.JSONException {
        try {
            this.status = jSONObject.optInt("status");
            this.message = jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY);
            int i = this.status;
            if (i == 6 || i == 7 || i == 8 || i == 9) {
                this.status = 1;
            }
            if (this.status != 0) {
                return;
            }
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
            if (jSONObjectOptJSONObject != null) {
                this.location = new com.baidu.mapapi.model.LatLng(jSONObjectOptJSONObject.optDouble("lat"), jSONObjectOptJSONObject.optDouble("lng"));
                if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                    this.location = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(this.location);
                }
            }
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("address_component");
            if (jSONObjectOptJSONObject2 != null) {
                com.baidu.mapapi.cloud.CloudRgcResult.AddressCompents addressCompents = new com.baidu.mapapi.cloud.CloudRgcResult.AddressCompents();
                this.addressCompents = addressCompents;
                addressCompents.a(jSONObjectOptJSONObject2);
            }
            this.formattedAddress = jSONObject.optString("formatted_address");
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pois");
            if (jSONArrayOptJSONArray != null) {
                this.pois = new java.util.ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    org.json.JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject3 != null) {
                        com.baidu.mapapi.cloud.CloudRgcResult.PoiInfo poiInfo = new com.baidu.mapapi.cloud.CloudRgcResult.PoiInfo();
                        poiInfo.parseFromJSON(jSONObjectOptJSONObject3);
                        this.pois.add(poiInfo);
                    }
                }
            }
            org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("custom_pois");
            if (jSONArrayOptJSONArray2 != null) {
                this.customPois = new java.util.ArrayList();
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    org.json.JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i3);
                    if (jSONObjectOptJSONObject4 != null) {
                        com.baidu.mapapi.cloud.CloudPoiInfo cloudPoiInfo = new com.baidu.mapapi.cloud.CloudPoiInfo();
                        cloudPoiInfo.b(jSONObjectOptJSONObject4);
                        this.customPois.add(cloudPoiInfo);
                    }
                }
            }
            this.customLocationDescription = jSONObject.optString("custom_location_description");
            this.recommendedLocationDescription = jSONObject.optString("recommended_location_description");
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
}
