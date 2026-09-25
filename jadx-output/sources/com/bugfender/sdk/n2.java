package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class n2 implements com.bugfender.sdk.a<com.bugfender.sdk.k2, java.lang.String> {
    private org.json.JSONObject a(com.bugfender.sdk.e eVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("key", eVar.a());
        return jSONObject;
    }

    private org.json.JSONObject a(com.bugfender.sdk.f fVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("application", a(fVar.a()));
        jSONObject.put("versionName", fVar.c());
        jSONObject.put("versionCode", fVar.b());
        return jSONObject;
    }

    private org.json.JSONObject a(com.bugfender.sdk.w wVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("udid", wVar.l());
        jSONObject.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, wVar.e());
        jSONObject.put("deviceType", wVar.c());
        jSONObject.put("osVersion", wVar.f());
        jSONObject.put("version", wVar.m());
        jSONObject.put("build", wVar.b());
        jSONObject.put("language", wVar.d());
        jSONObject.put("timezone", wVar.i());
        jSONObject.put("sdkType", wVar.g());
        jSONObject.put("applicationToken", wVar.a());
        jSONObject.put("sdkVersion", wVar.h());
        return jSONObject;
    }

    @Override // com.bugfender.sdk.a
    public com.bugfender.sdk.k2 a(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.bugfender.sdk.k2.a aVar = new com.bugfender.sdk.k2.a();
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("device");
            if (jSONObjectOptJSONObject != null) {
                java.lang.String string = jSONObjectOptJSONObject.getString("udid");
                java.lang.String string2 = jSONObjectOptJSONObject.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                java.lang.String string3 = jSONObjectOptJSONObject.getString("deviceType");
                java.lang.String strOptString = jSONObjectOptJSONObject.optString("osVersion");
                java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("version");
                java.lang.String strOptString3 = jSONObjectOptJSONObject.optString("build");
                java.lang.String strOptString4 = jSONObjectOptJSONObject.optString("language");
                java.lang.String strOptString5 = jSONObjectOptJSONObject.optString("timezone");
                java.lang.String strOptString6 = jSONObjectOptJSONObject.optString("sdkType");
                aVar.a(new com.bugfender.sdk.w.b().j(string).e(string2).c(string3).f(strOptString).k(strOptString2).b(strOptString3).d(strOptString4).i(strOptString5).g(strOptString6).a(jSONObjectOptJSONObject.getString("applicationToken")).h(jSONObjectOptJSONObject.optString("sdkVersion")).a());
            }
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("applicationVersion");
            if (jSONObjectOptJSONObject2 != null) {
                java.lang.String string4 = jSONObjectOptJSONObject2.getString("versionName");
                java.lang.String string5 = jSONObjectOptJSONObject2.getString("versionCode");
                org.json.JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("application");
                aVar.a(com.bugfender.sdk.f.b(new com.bugfender.sdk.e(jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.getString("key") : null), string4, string5));
            }
            java.lang.Double dValueOf = java.lang.Double.valueOf(jSONObject.optDouble("batteryLevel"));
            aVar.a(dValueOf.isNaN() ? 0.0f : java.math.BigDecimal.valueOf(dValueOf.doubleValue()).floatValue());
            aVar.a(jSONObject.optLong("freeRam"));
            java.lang.String strOptString7 = jSONObject.optString("time", null);
            try {
                aVar.a(strOptString7 != null ? com.bugfender.sdk.y1.a().parse(strOptString7) : new java.util.Date());
            } catch (java.text.ParseException unused) {
                aVar.a(new java.util.Date());
            }
            aVar.e(jSONObject.getString("timezone"));
            aVar.e(jSONObject.getLong("totalRam"));
            aVar.c(jSONObject.getLong("ramUsed"));
            aVar.a(jSONObject.getInt("orientation"));
            aVar.c(jSONObject.getString("sdkType"));
            aVar.b(jSONObject.getLong("localSessionId"));
            aVar.d(jSONObject.getLong("sessionId"));
            aVar.b(jSONObject.optString("osVersion"));
            aVar.a(jSONObject.optString("language"));
            java.lang.String strOptString8 = jSONObject.optString("sessionIdentifier");
            if (strOptString8 != null) {
                aVar.d(strOptString8);
            }
            return aVar.a();
        } catch (org.json.JSONException e) {
            com.bugfender.sdk.d1.a(e);
            return null;
        }
    }

    @Override // com.bugfender.sdk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.String b(com.bugfender.sdk.k2 k2Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("device", a(k2Var.c()));
            jSONObject.put("applicationVersion", a(k2Var.a()));
            jSONObject.put("batteryLevel", k2Var.b());
            jSONObject.put("freeRam", k2Var.d());
            jSONObject.put("time", com.bugfender.sdk.y1.a().format(k2Var.m()));
            jSONObject.put("osVersion", k2Var.h());
            jSONObject.put("language", k2Var.e());
            jSONObject.put("timezone", k2Var.n());
            jSONObject.put("totalRam", k2Var.o());
            jSONObject.put("ramUsed", k2Var.i());
            jSONObject.put("orientation", k2Var.g());
            jSONObject.put("sdkType", k2Var.j());
            jSONObject.put("localSessionId", k2Var.f());
            jSONObject.put("sessionId", k2Var.k());
            jSONObject.put("sessionIdentifier", k2Var.l());
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            com.bugfender.sdk.d1.a(e);
            return null;
        }
    }
}
