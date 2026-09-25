package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class g1 implements com.bugfender.sdk.a<com.bugfender.sdk.e1, java.lang.String> {
    @Override // com.bugfender.sdk.a
    public com.bugfender.sdk.e1 a(java.lang.String str) {
        java.util.Date date;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int i = jSONObject.getInt("line");
            int i2 = jSONObject.getInt(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL);
            long j = jSONObject.getLong("absoluteTime");
            try {
                date = com.bugfender.sdk.y1.a().parse(jSONObject.optString("date"));
            } catch (java.text.ParseException unused) {
                date = null;
            }
            java.lang.String string = jSONObject.has("tag") ? jSONObject.getString("tag") : "";
            java.lang.String string2 = jSONObject.has(com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD) ? jSONObject.getString(com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD) : "";
            java.lang.String string3 = jSONObject.has("file") ? jSONObject.getString("file") : "";
            return new com.bugfender.sdk.e1.b().b(i).a(i2).a(j).a(date).c(string).b(string2).a(string3).d(jSONObject.has("text") ? jSONObject.getString("text") : "").f(jSONObject.has("thn") ? jSONObject.getString("thn") : "").e(jSONObject.has("th") ? jSONObject.getString("th") : "").a();
        } catch (org.json.JSONException unused2) {
            return null;
        }
    }

    @Override // com.bugfender.sdk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.String b(com.bugfender.sdk.e1 e1Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("line", e1Var.e());
            jSONObject.put(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, e1Var.d());
            jSONObject.put("absoluteTime", e1Var.a());
            jSONObject.put("date", com.bugfender.sdk.y1.a().format(e1Var.b()));
            java.lang.String strG = e1Var.g();
            java.lang.String str = "";
            if (strG == null) {
                strG = "";
            }
            jSONObject.put("tag", strG);
            java.lang.String strF = e1Var.f();
            if (strF == null) {
                strF = "";
            }
            jSONObject.put(com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, strF);
            java.lang.String strC = e1Var.c();
            if (strC == null) {
                strC = "";
            }
            jSONObject.put("file", strC);
            java.lang.String strH = e1Var.h();
            if (strH == null) {
                strH = "";
            }
            jSONObject.put("text", strH);
            java.lang.String strJ = e1Var.j();
            if (strJ == null) {
                strJ = "";
            }
            jSONObject.put("thn", strJ);
            java.lang.String strI = e1Var.i();
            if (strI != null) {
                str = strI;
            }
            jSONObject.put("th", str);
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            com.bugfender.sdk.d1.a(e);
            return null;
        }
    }
}
