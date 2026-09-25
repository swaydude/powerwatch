package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
public class h {
    private static final java.lang.String a = "h";
    private com.baidu.mapapi.http.AsyncHttpClient b;

    public interface a {
        void a(int i, java.lang.String str, java.lang.String str2);

        void a(java.lang.String str);

        void a(boolean z, java.lang.String str);
    }

    private static class b {
        private static final com.baidu.mapsdkplatform.comapi.map.h a = new com.baidu.mapsdkplatform.comapi.map.h(null);
    }

    private h() {
        this.b = new com.baidu.mapapi.http.AsyncHttpClient();
    }

    /* synthetic */ h(com.baidu.mapsdkplatform.comapi.map.i iVar) {
        this();
    }

    public static com.baidu.mapsdkplatform.comapi.map.h a() {
        return com.baidu.mapsdkplatform.comapi.map.h.b.a;
    }

    private java.lang.String a(android.content.Context context, java.lang.String str) {
        java.lang.String strNextString = "null";
        if (!a(b(context, str))) {
            return "null";
        }
        try {
            java.io.FileInputStream fileInputStreamOpenFileInput = context.openFileInput("server_custom_style_" + str + ".json");
            android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(fileInputStreamOpenFileInput));
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (jsonReader.nextName().equals("md5")) {
                        strNextString = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return strNextString;
            } catch (java.io.IOException e) {
                android.util.Log.e(a, "Read custom style failed", e);
                return strNextString;
            } finally {
                try {
                    jsonReader.close();
                    fileInputStreamOpenFileInput.close();
                } catch (java.io.IOException e2) {
                    android.util.Log.e(a, "Close custom style failed", e2);
                }
            }
        } catch (java.io.FileNotFoundException e3) {
            android.util.Log.e(a, "Open custom style failed", e3);
            return "null";
        }
    }

    private java.lang.String a(android.content.Context context, java.lang.String str, boolean z) {
        java.lang.String strA = a(context, str);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("style_id", str);
        linkedHashMap.put("type", z ? "publish" : "edit");
        linkedHashMap.put("md5", strA);
        linkedHashMap.put("token", com.baidu.mapsdkplatform.comapi.util.SyncSysInfo.getAuthToken());
        java.lang.String str2 = a(linkedHashMap) + com.baidu.mapsdkplatform.comapi.util.SyncSysInfo.getPhoneInfo();
        return c() + "?" + (str2 + "&sign=" + com.baidu.mapsdkplatform.comjni.util.AppMD5.getSignMD5String(str2));
    }

    private java.lang.String a(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map.isEmpty()) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        for (java.lang.String str : map.keySet()) {
            java.lang.String strEncodeUrlParamsValue = com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(map.get(str));
            if (i != 0) {
                sb.append("&");
            }
            sb.append(str);
            sb.append("=");
            sb.append(strEncodeUrlParamsValue);
            i++;
        }
        return sb.toString();
    }

    private void a(android.content.Context context, java.lang.String str, java.lang.String str2, com.baidu.mapsdkplatform.comapi.map.h.a aVar) {
        this.b.get(str, new com.baidu.mapsdkplatform.comapi.map.i(this, context, str2, aVar));
    }

    private void a(android.content.Context context, java.lang.String str, boolean z, com.baidu.mapsdkplatform.comapi.map.h.a aVar) {
        java.lang.String strB = b(context, str);
        if (!a(strB)) {
            strB = null;
        }
        if (aVar != null) {
            aVar.a(strB);
        }
        if (!com.baidu.mapapi.NetworkUtil.isNetworkAvailable(context)) {
            if (aVar != null) {
                aVar.a(com.baidu.mapapi.http.HttpClient.HttpStateError.NETWORK_ERROR.ordinal(), com.baidu.mapapi.http.HttpClient.HttpStateError.NETWORK_ERROR.name(), strB);
            }
        } else {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            java.lang.String strA = a(context, str, z);
            if (android.text.TextUtils.isEmpty(strA)) {
                android.util.Log.e(a, "build request url failed");
            } else {
                a(context, strA, str, aVar);
            }
        }
    }

    private boolean a(int i, java.lang.String str, java.lang.String str2) {
        return !(103 == i && a(str2)) && i == 0;
    }

    private boolean a(android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.io.File file = new java.io.File(b(context, str));
        if (file.exists()) {
            file.delete();
        }
        try {
            if (file.createNewFile()) {
                file.createNewFile();
            }
            java.lang.String strOptString = jSONObject.optString("json");
            java.lang.String strOptString2 = jSONObject.optString("md5", "null");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("json", strOptString);
                jSONObject2.put("md5", strOptString2);
                java.lang.String string = jSONObject2.toString();
                try {
                    java.io.FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("server_custom_style_" + str + ".json", 0);
                    fileOutputStreamOpenFileOutput.write(string.getBytes());
                    fileOutputStreamOpenFileOutput.flush();
                    fileOutputStreamOpenFileOutput.close();
                    return true;
                } catch (java.io.IOException e) {
                    e = e;
                    str2 = a;
                    str3 = "write style data into file failed";
                    android.util.Log.e(str2, str3, e);
                    return false;
                }
            } catch (org.json.JSONException e2) {
                e = e2;
                str2 = a;
                str3 = "build style data failed";
            }
        } catch (java.io.IOException e3) {
            e = e3;
            str2 = a;
            str3 = "create custom file failed";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return new java.io.File(str).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String b(android.content.Context context, java.lang.String str) {
        return context.getFilesDir().getAbsolutePath() + java.io.File.separator + "server_custom_style_" + str + ".json";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(android.content.Context context, java.lang.String str, java.lang.String str2, com.baidu.mapsdkplatform.comapi.map.h.a aVar) {
        java.lang.String strB = b(context, str2);
        java.lang.String str3 = a(strB) ? strB : null;
        if (android.text.TextUtils.isEmpty(str)) {
            if (aVar != null) {
                aVar.a(com.baidu.mapapi.http.HttpClient.HttpStateError.SERVER_ERROR.ordinal(), com.baidu.mapapi.http.HttpClient.HttpStateError.SERVER_ERROR.name(), str3);
                return;
            }
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (!a(jSONObject.optInt("status"), jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY), strB)) {
                if (aVar != null) {
                    aVar.a(false, str3);
                    return;
                }
                return;
            }
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) {
                android.util.Log.e(a, "custom style data is null");
                if (aVar != null) {
                    aVar.a(com.baidu.mapapi.http.HttpClient.HttpStateError.SERVER_ERROR.ordinal(), "custom style data is null", str3);
                    return;
                }
                return;
            }
            boolean zA = a(context, jSONObjectOptJSONObject, str2);
            if (aVar != null) {
                if (!a(strB)) {
                    strB = null;
                }
                if (zA) {
                    aVar.a(true, strB);
                } else {
                    aVar.a(com.baidu.mapapi.http.HttpClient.HttpStateError.INNER_ERROR.ordinal(), "write style data into file failed", strB);
                }
            }
        } catch (org.json.JSONException e) {
            android.util.Log.e(a, "parse response result failed", e);
            if (aVar != null) {
                aVar.a(com.baidu.mapapi.http.HttpClient.HttpStateError.INNER_ERROR.ordinal(), "parse response result failed", str3);
            }
        }
    }

    private java.lang.String c() {
        return com.baidu.mapapi.http.HttpClient.isHttpsEnable ? "https://api.map.baidu.com/sdkproxy/v2/lbs_androidsdk/custom/v2/getjsonstyle" : "http://api.map.baidu.com/sdkproxy/v2/lbs_androidsdk/custom/v2/getjsonstyle";
    }

    public void a(android.content.Context context, java.lang.String str, com.baidu.mapsdkplatform.comapi.map.h.a aVar) {
        a(context, str, true, aVar);
    }
}
