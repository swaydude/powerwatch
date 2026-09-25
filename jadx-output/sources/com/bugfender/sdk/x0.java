package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class x0 implements com.bugfender.sdk.a<com.bugfender.sdk.u0, java.lang.String> {
    private org.json.JSONObject a(com.bugfender.sdk.u0 u0Var) {
        if (u0Var.b() != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("key", u0Var.b().a());
                return jSONObject;
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.bugfender.sdk.a
    public com.bugfender.sdk.u0 a(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String strOptString = jSONObject.optString("uid");
            java.lang.String string = jSONObject.getString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY);
            java.lang.String string2 = jSONObject.getString("text");
            long j = jSONObject.getLong("sessionId");
            java.lang.String strOptString2 = jSONObject.optString("type");
            if (strOptString2 == null) {
                strOptString2 = jSONObject.optString("tag");
            }
            java.lang.String strOptString3 = jSONObject.optString("raw");
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("application");
            java.lang.String string3 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.getString("key") : null;
            if (string3 != null) {
                com.bugfender.sdk.u0.b bVarA = com.bugfender.sdk.u0.a().c(string).b(string2).a(j).a(new com.bugfender.sdk.e(string3)).d(strOptString2).a(strOptString3);
                if (!android.text.TextUtils.isEmpty(strOptString)) {
                    bVarA.a(java.util.UUID.fromString(strOptString));
                }
                return bVarA.a();
            }
            com.bugfender.sdk.u0.b bVarA2 = com.bugfender.sdk.u0.a().c(string).b(string2).a(j).d(strOptString2).a(strOptString3);
            if (!android.text.TextUtils.isEmpty(strOptString)) {
                bVarA2.a(java.util.UUID.fromString(strOptString));
            }
            return bVarA2.a();
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    @Override // com.bugfender.sdk.a
    public java.lang.String b(com.bugfender.sdk.u0 u0Var) {
        org.json.JSONObject jSONObjectA = a(u0Var);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("uid", u0Var.h().toString());
            jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, u0Var.f());
            jSONObject.put("text", u0Var.e());
            jSONObject.put("sessionId", u0Var.d());
            jSONObject.put("application", jSONObjectA);
            jSONObject.putOpt("type", u0Var.g());
            jSONObject.putOpt("raw", u0Var.c());
            return jSONObject.toString();
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
