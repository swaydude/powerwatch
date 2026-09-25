package com.baidu.mapapi.cloud;

/* JADX INFO: loaded from: classes.dex */
public class DetailSearchResult extends com.baidu.mapapi.cloud.BaseSearchResult {
    public com.baidu.mapapi.cloud.CloudPoiInfo poiInfo;

    @Override // com.baidu.mapapi.cloud.BaseSearchResult
    public void parseFromJSON(org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONArray jSONArrayOptJSONArray;
        org.json.JSONObject jSONObjectOptJSONObject;
        super.parseFromJSON(jSONObject);
        if (this.status != 0 || (jSONArrayOptJSONArray = jSONObject.optJSONArray("contents")) == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            return;
        }
        com.baidu.mapapi.cloud.CloudPoiInfo cloudPoiInfo = new com.baidu.mapapi.cloud.CloudPoiInfo();
        this.poiInfo = cloudPoiInfo;
        cloudPoiInfo.a(jSONObjectOptJSONObject);
    }
}
