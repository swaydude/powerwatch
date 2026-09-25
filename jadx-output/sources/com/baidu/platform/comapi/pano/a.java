package com.baidu.platform.comapi.pano;

/* JADX INFO: loaded from: classes.dex */
public class a {
    com.baidu.mapapi.http.AsyncHttpClient a = new com.baidu.mapapi.http.AsyncHttpClient();

    /* JADX INFO: renamed from: com.baidu.platform.comapi.pano.a$a, reason: collision with other inner class name */
    public interface InterfaceC0014a<T> {
        void a(com.baidu.mapapi.http.HttpClient.HttpStateError httpStateError);

        void a(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.baidu.platform.comapi.pano.c a(java.lang.String str) {
        if (str == null || str.equals("")) {
            return new com.baidu.platform.comapi.pano.c(com.baidu.platform.comapi.pano.PanoStateError.PANO_NOT_FOUND);
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
            if (jSONObjectOptJSONObject == null) {
                return new com.baidu.platform.comapi.pano.c(com.baidu.platform.comapi.pano.PanoStateError.PANO_NOT_FOUND);
            }
            if (jSONObjectOptJSONObject.optInt("error") != 0) {
                return new com.baidu.platform.comapi.pano.c(com.baidu.platform.comapi.pano.PanoStateError.PANO_UID_ERROR);
            }
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT);
            if (jSONArrayOptJSONArray == null) {
                return new com.baidu.platform.comapi.pano.c(com.baidu.platform.comapi.pano.PanoStateError.PANO_NOT_FOUND);
            }
            com.baidu.platform.comapi.pano.c cVar = null;
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i).optJSONObject("poiinfo");
                if (jSONObjectOptJSONObject2 != null) {
                    cVar = new com.baidu.platform.comapi.pano.c(com.baidu.platform.comapi.pano.PanoStateError.PANO_NO_ERROR);
                    cVar.a(jSONObjectOptJSONObject2.optString("PID"));
                    cVar.a(jSONObjectOptJSONObject2.optInt("hasstreet"));
                }
            }
            return cVar;
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            return new com.baidu.platform.comapi.pano.c(com.baidu.platform.comapi.pano.PanoStateError.PANO_NOT_FOUND);
        }
    }

    private java.lang.String a(android.net.Uri.Builder builder) {
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse(builder.build().toString() + com.baidu.mapapi.http.HttpClient.getPhoneInfo()).buildUpon();
        builderBuildUpon.appendQueryParameter("sign", com.baidu.mapsdkplatform.comjni.util.AppMD5.getSignMD5String(builderBuildUpon.build().getEncodedQuery()));
        return builderBuildUpon.build().toString();
    }

    private void a(android.net.Uri.Builder builder, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public void a(java.lang.String str, com.baidu.platform.comapi.pano.a.InterfaceC0014a<com.baidu.platform.comapi.pano.c> interfaceC0014a) {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme(com.baidu.mapapi.http.HttpClient.isHttpsEnable ? "https" : "http");
        builder.encodedAuthority("api.map.baidu.com");
        builder.path("/sdkproxy/lbs_androidsdk/pano/v1/");
        a(builder, "qt", "poi");
        a(builder, "uid", str);
        a(builder, "action", "0");
        java.lang.String authToken = com.baidu.mapapi.http.HttpClient.getAuthToken();
        if (authToken == null) {
            interfaceC0014a.a(new com.baidu.platform.comapi.pano.c(com.baidu.platform.comapi.pano.PanoStateError.PANO_NO_TOKEN));
        } else {
            a(builder, "token", authToken);
            this.a.get(a(builder), new com.baidu.platform.comapi.pano.b(this, interfaceC0014a));
        }
    }
}
