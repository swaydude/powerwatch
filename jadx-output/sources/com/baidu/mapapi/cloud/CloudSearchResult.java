package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public class CloudSearchResult extends com.baidu.mapapi.cloud.BaseSearchResult {
    public java.util.List<com.baidu.mapapi.cloud.CloudPoiInfo> poiList;

    @Override // com.baidu.mapapi.cloud.BaseSearchResult
    public void parseFromJSON(org.json.JSONObject jSONObject) throws org.json.JSONException {
        super.parseFromJSON(jSONObject);
        if (this.status != 0) {
            return;
        }
        this.poiList = new java.util.ArrayList();
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("contents");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                com.baidu.mapapi.cloud.CloudPoiInfo cloudPoiInfo = new com.baidu.mapapi.cloud.CloudPoiInfo();
                cloudPoiInfo.a(jSONObjectOptJSONObject);
                this.poiList.add(cloudPoiInfo);
            }
        }
    }
}
