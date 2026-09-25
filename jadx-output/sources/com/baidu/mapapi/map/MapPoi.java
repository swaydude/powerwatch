package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class MapPoi {
    private static final java.lang.String d = "MapPoi";
    java.lang.String a;
    com.baidu.mapapi.model.LatLng b;
    java.lang.String c;

    void a(org.json.JSONObject jSONObject) {
        java.lang.String strOptString = jSONObject.optString("tx");
        this.a = strOptString;
        if (strOptString != null && !strOptString.equals("")) {
            this.a = this.a.replaceAll("\\\\", "").replaceAll("/?[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "");
        }
        this.b = com.baidu.mapapi.model.CoordUtil.decodeNodeLocation(jSONObject.optString("geo"));
        this.c = jSONObject.optString("ud");
    }

    public java.lang.String getName() {
        return this.a;
    }

    public com.baidu.mapapi.model.LatLng getPosition() {
        return this.b;
    }

    public java.lang.String getUid() {
        return this.c;
    }
}
