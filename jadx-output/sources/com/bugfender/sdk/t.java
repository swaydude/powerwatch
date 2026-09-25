package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class t {
    private final java.util.UUID a;
    private final java.lang.Thread b;
    private final java.lang.Throwable c;
    private final java.util.Date d;

    public static class b {
        private java.lang.Throwable a;
        private java.lang.Thread b;
        private java.util.Date c;

        public com.bugfender.sdk.t.b a(java.lang.Thread thread) {
            this.b = thread;
            return this;
        }

        public com.bugfender.sdk.t.b a(java.lang.Throwable th) {
            this.a = (java.lang.Throwable) com.bugfender.sdk.w1.a(th, "throwable == null");
            return this;
        }

        public com.bugfender.sdk.t.b a(java.util.Date date) {
            this.c = (java.util.Date) com.bugfender.sdk.w1.a(date, "date == null");
            return this;
        }

        public com.bugfender.sdk.t a() {
            return new com.bugfender.sdk.t(this);
        }
    }

    private static class c {
        final java.lang.Throwable a;

        c(java.lang.Throwable th) {
            this.a = th;
        }

        public java.lang.String a() {
            java.lang.String[] strArrSplit = toString().split("\n");
            return strArrSplit.length >= 1 ? strArrSplit[1] : "Crash Report";
        }

        public java.lang.String b() {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.lang.StackTraceElement stackTraceElement : this.a.getStackTrace()) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
                    jSONObject.put("file", stackTraceElement.getFileName() == null ? "Unknown" : stackTraceElement.getFileName());
                    jSONObject.put("lineNumber", stackTraceElement.getLineNumber());
                    jSONArray.put(jSONObject);
                } catch (org.json.JSONException unused) {
                    return "[]";
                }
            }
            return jSONArray.toString();
        }

        public java.lang.String toString() {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            this.a.printStackTrace(new java.io.PrintWriter(stringWriter));
            java.lang.String string = stringWriter.toString();
            if (com.bugfender.sdk.f0.a(string)) {
                string = com.bugfender.sdk.f0.b(string);
            }
            return "``` \n " + string + " \n ```";
        }
    }

    private t(com.bugfender.sdk.t.b bVar) {
        this.a = java.util.UUID.randomUUID();
        this.b = bVar.b;
        this.c = bVar.a;
        this.d = bVar.c;
    }

    public static com.bugfender.sdk.t a(java.lang.Thread thread, java.lang.Throwable th) {
        return new com.bugfender.sdk.t.b().a(th).a(thread).a(new java.util.Date()).a();
    }

    public java.util.UUID a() {
        return this.a;
    }

    public java.lang.Thread b() {
        return this.b;
    }

    public java.lang.Throwable c() {
        return this.c;
    }

    public java.util.Date d() {
        return this.d;
    }

    public java.lang.String e() {
        try {
            com.bugfender.sdk.t.c cVar = new com.bugfender.sdk.t.c(this.c);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("id", this.a.toString());
            jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, cVar.a());
            jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, cVar.toString());
            jSONObject.put("date", new java.util.Date().getTime());
            return jSONObject.toString();
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
