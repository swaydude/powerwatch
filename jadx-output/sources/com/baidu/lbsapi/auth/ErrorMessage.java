package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class ErrorMessage {
    ErrorMessage() {
    }

    static java.lang.String a(int i, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("status", i);
            jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, str);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    static java.lang.String a(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("status", -1);
            jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, str);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }
}
