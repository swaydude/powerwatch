package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class y0 {

    public static class a {

        /* JADX INFO: renamed from: com.bugfender.sdk.y0$a$a, reason: collision with other inner class name */
        public static class C0017a {
            public static java.lang.String a(java.lang.String str, com.bugfender.sdk.w wVar, java.util.Map<java.lang.String, ?> map) {
                try {
                    com.bugfender.sdk.w1.a(str, "applicationToken == null");
                    com.bugfender.sdk.w1.a(wVar, "device == null");
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("app_token", str);
                    jSONObject.put("device", a(wVar, map));
                    return jSONObject.toString();
                } catch (org.json.JSONException e) {
                    com.bugfender.sdk.d1.a(e);
                    return null;
                }
            }

            private static org.json.JSONObject a(com.bugfender.sdk.w wVar, java.util.Map<java.lang.String, ?> map) {
                try {
                    com.bugfender.sdk.w1.a(wVar, "device == null");
                    com.bugfender.sdk.w1.a(wVar.l(), "udid == null");
                    com.bugfender.sdk.w1.a(wVar.e(), "name == null");
                    com.bugfender.sdk.w1.a(wVar.f(), "osVersion == null");
                    com.bugfender.sdk.w1.a(wVar.m(), "version == null");
                    com.bugfender.sdk.w1.a(wVar.b(), "build == null");
                    com.bugfender.sdk.w1.a(wVar.d(), "language == null");
                    com.bugfender.sdk.w1.a(wVar.g(), "sdkType == null");
                    com.bugfender.sdk.w1.a(wVar.i(), "timezone == null");
                    com.bugfender.sdk.w1.a(wVar.c(), "device_type == null");
                    com.bugfender.sdk.w1.a(wVar.h(), "sdk_version == null");
                    com.bugfender.sdk.w1.a(java.lang.Long.valueOf(wVar.k()), "total_storage_size == null");
                    com.bugfender.sdk.w1.a(java.lang.Long.valueOf(wVar.j()), "total_storage_available == null");
                    com.bugfender.sdk.w1.a(java.lang.Boolean.valueOf(wVar.n()), "firebase_test_lab == null");
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("udid", wVar.l());
                    jSONObject.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, wVar.e());
                    jSONObject.put("os_version", wVar.f());
                    jSONObject.put("version", wVar.m());
                    jSONObject.put("build", wVar.b());
                    jSONObject.put("language", wVar.d());
                    jSONObject.put("sdk_type", wVar.g());
                    jSONObject.put("timezone", wVar.i());
                    jSONObject.put("device_type", wVar.c());
                    jSONObject.put("sdk_version", wVar.h());
                    jSONObject.put("total_storage_size", wVar.k());
                    jSONObject.put("total_storage_available", wVar.j());
                    jSONObject.put("firebase_test_lab", wVar.n());
                    if (!map.isEmpty()) {
                        if (map.containsKey(com.bugfender.sdk.k1.F)) {
                            jSONObject.put(com.bugfender.sdk.k1.F, map.remove(com.bugfender.sdk.k1.F));
                        }
                        if (map.containsKey(com.bugfender.sdk.k1.E)) {
                            jSONObject.put(com.bugfender.sdk.k1.E, map.remove(com.bugfender.sdk.k1.E));
                        }
                        if (!map.isEmpty()) {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            for (java.util.Map.Entry<java.lang.String, ?> entry : map.entrySet()) {
                                jSONObject2.put(entry.getKey(), entry.getValue());
                            }
                            jSONObject.put("key_values", jSONObject2);
                        }
                    }
                    return jSONObject;
                } catch (org.json.JSONException e) {
                    com.bugfender.sdk.d1.a(e);
                    return null;
                }
            }
        }

        public static class b {
            public static com.bugfender.sdk.b0 a(java.lang.String str) {
                try {
                    com.bugfender.sdk.b0 b0Var = new com.bugfender.sdk.b0();
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    b0Var.b(jSONObject.getBoolean("logger_enabled"));
                    b0Var.a(jSONObject.getBoolean("crashes_enabled"));
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("latest_sdk_version");
                    if (jSONObject2 != null) {
                        b0Var.a(new com.bugfender.sdk.b0.b(jSONObject2.getInt("android"), jSONObject2.getInt("ios")));
                    }
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("error");
                    if (jSONObjectOptJSONObject != null) {
                        b0Var.a(new com.bugfender.sdk.b0.a(jSONObjectOptJSONObject.getString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY), jSONObjectOptJSONObject.getInt("code")));
                    }
                    return b0Var;
                } catch (org.json.JSONException e) {
                    com.bugfender.sdk.d1.a(e);
                    return null;
                }
            }
        }
    }

    public static class b {

        public static class a {
            public static java.lang.String a(com.bugfender.sdk.u0 u0Var, com.bugfender.sdk.k2 k2Var) {
                try {
                    com.bugfender.sdk.w1.a(u0Var, "Issue == null");
                    com.bugfender.sdk.w1.a(u0Var.b(), "Application == null");
                    com.bugfender.sdk.w1.a(u0Var.d(), "sessionId == null");
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt("uid", u0Var.h() != null ? u0Var.h().toString() : null);
                    jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, u0Var.f());
                    jSONObject.put("text", u0Var.e());
                    jSONObject.put("session_id", u0Var.d());
                    jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, com.bugfender.sdk.y0.a(u0Var.b()));
                    jSONObject.putOpt("type", u0Var.g());
                    jSONObject.putOpt("raw", u0Var.c());
                    jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY, new org.json.JSONObject(com.bugfender.sdk.y0.c.a.a(k2Var, java.lang.Boolean.FALSE)));
                    return jSONObject.toString();
                } catch (org.json.JSONException e) {
                    com.bugfender.sdk.d1.a(e);
                    return null;
                }
            }
        }
    }

    public static class c {

        public static class a {
            public static java.lang.String a(com.bugfender.sdk.k2 k2Var, java.lang.Boolean bool) {
                java.lang.String str = com.bugfender.sdk.y1.a().format(k2Var.m());
                try {
                    com.bugfender.sdk.w1.a(k2Var, "session == null");
                    com.bugfender.sdk.w1.a(k2Var.c(), "session.getDevice() == null");
                    com.bugfender.sdk.w1.a(k2Var.a(), "session.getApplicationVersion() == null");
                    com.bugfender.sdk.w1.a(java.lang.Float.valueOf(k2Var.b()), "session.getBatteryLevel() == null");
                    com.bugfender.sdk.w1.a(java.lang.Long.valueOf(k2Var.d()), "session.getFreeRam() == null");
                    com.bugfender.sdk.w1.a(k2Var.m(), "session.getTime() == null");
                    com.bugfender.sdk.w1.a(k2Var.h(), "session.getOsVersion() == null");
                    com.bugfender.sdk.w1.a(k2Var.e(), "session.getLanguage() == null");
                    com.bugfender.sdk.w1.a(k2Var.n(), "session.getTimezone() == null");
                    com.bugfender.sdk.w1.a(java.lang.Long.valueOf(k2Var.o()), "session.getTotalRam() == null");
                    com.bugfender.sdk.w1.a(java.lang.Long.valueOf(k2Var.i()), "session.getRamUsed() == null");
                    com.bugfender.sdk.w1.a(java.lang.Integer.valueOf(k2Var.g()), "session.getOrientation() == null");
                    com.bugfender.sdk.w1.a(k2Var.j(), "session.getSdkType() == null");
                    com.bugfender.sdk.w1.a(k2Var.l(), "session.getSessionIdentifier() == null");
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("device", a(k2Var.c()));
                    jSONObject.put("app_version", a(k2Var.a()));
                    jSONObject.put("battery_level", k2Var.b());
                    jSONObject.put("ram_free", k2Var.d());
                    jSONObject.put("time", str);
                    jSONObject.put("os_version", k2Var.h());
                    jSONObject.put("language", k2Var.e());
                    jSONObject.put("timezone", k2Var.n());
                    jSONObject.put("ram_total", k2Var.o());
                    jSONObject.put("ram_used", k2Var.i());
                    jSONObject.put("orientation", k2Var.g());
                    jSONObject.put("sdk_type", k2Var.j());
                    jSONObject.put("session_uid", k2Var.l());
                    if (bool.booleanValue()) {
                        jSONObject.put("will_resend", true);
                    }
                    return jSONObject.toString();
                } catch (org.json.JSONException e) {
                    com.bugfender.sdk.d1.a(e);
                    return null;
                }
            }

            private static org.json.JSONObject a(com.bugfender.sdk.e eVar) {
                try {
                    com.bugfender.sdk.w1.a(eVar, "application == null");
                    com.bugfender.sdk.w1.a(eVar.a(), "application.getKey() == null");
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("key", eVar.a());
                    return jSONObject;
                } catch (org.json.JSONException e) {
                    com.bugfender.sdk.d1.a(e);
                    return null;
                }
            }

            private static org.json.JSONObject a(com.bugfender.sdk.f fVar) {
                try {
                    com.bugfender.sdk.w1.a(fVar, "applicationVersion == null");
                    com.bugfender.sdk.w1.a(fVar.a(), "applicationVersion.getApplication() == null");
                    com.bugfender.sdk.w1.a(fVar.c(), "applicationVersion.getVersionName() == null");
                    com.bugfender.sdk.w1.a(fVar.b(), "applicationVersion.getVersionCode() == null");
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, a(fVar.a()));
                    jSONObject.put("version", fVar.c());
                    jSONObject.put("build", fVar.b());
                    return jSONObject;
                } catch (org.json.JSONException e) {
                    com.bugfender.sdk.d1.a(e);
                    return null;
                }
            }

            private static org.json.JSONObject a(com.bugfender.sdk.w wVar) {
                try {
                    com.bugfender.sdk.w1.a(wVar, "device == null");
                    com.bugfender.sdk.w1.a(wVar.l(), "device.getUdid() == null");
                    com.bugfender.sdk.w1.a(wVar.e(), "device.getName() == null");
                    com.bugfender.sdk.w1.a(wVar.c(), "device.getDeviceType() == null");
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("udid", wVar.l());
                    jSONObject.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, wVar.e());
                    jSONObject.put("device_type", wVar.c());
                    return jSONObject;
                } catch (org.json.JSONException e) {
                    com.bugfender.sdk.d1.a(e);
                    return null;
                }
            }
        }

        public static class b {
            public static com.bugfender.sdk.m2 a(java.lang.String str) {
                try {
                    return new com.bugfender.sdk.m2(new org.json.JSONObject(str).getInt("id"));
                } catch (org.json.JSONException e) {
                    com.bugfender.sdk.d1.a(e);
                    return null;
                }
            }
        }
    }

    public static class d {

        public static class a {
            public static java.lang.String a(java.lang.String str, java.lang.String str2, com.bugfender.sdk.z0<?> z0Var) {
                try {
                    com.bugfender.sdk.w1.a(str, "applicationKey == null");
                    com.bugfender.sdk.w1.a(str2, "deviceId == null");
                    com.bugfender.sdk.w1.a(z0Var, "keyValuePair == null");
                    com.bugfender.sdk.w1.a(z0Var.a(), "key == null");
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("app_key", str);
                    jSONObject.put("device_id", str2);
                    jSONObject.put("key", z0Var.a());
                    jSONObject.put("value", z0Var.b());
                    return jSONObject.toString();
                } catch (org.json.JSONException e) {
                    com.bugfender.sdk.d1.a(e);
                    return null;
                }
            }
        }
    }

    public static class e {

        public static class a {
            public static java.lang.String a(java.util.List<com.bugfender.sdk.e1> list, com.bugfender.sdk.k2 k2Var) {
                try {
                    com.bugfender.sdk.w1.a(list, "logs == null");
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("session_id", k2Var.k());
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    for (com.bugfender.sdk.e1 e1Var : list) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("l", e1Var.e());
                        jSONObject2.put("ll", e1Var.d());
                        jSONObject2.put("at", e1Var.a());
                        jSONObject2.put("x", com.bugfender.sdk.y1.a().format(e1Var.b()));
                        jSONObject2.put("tg", e1Var.g());
                        jSONObject2.put("m", e1Var.f());
                        jSONObject2.put("f", e1Var.c());
                        jSONObject2.put("t", e1Var.h());
                        jSONObject2.put("thn", e1Var.j());
                        jSONObject2.put("th", e1Var.i());
                        jSONObject2.put(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY, new org.json.JSONObject(com.bugfender.sdk.y0.c.a.a(k2Var, java.lang.Boolean.FALSE)));
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("logs", jSONArray);
                    return jSONObject.toString();
                } catch (org.json.JSONException e) {
                    com.bugfender.sdk.d1.a(e);
                    return null;
                }
            }
        }
    }

    static org.json.JSONObject a(com.bugfender.sdk.e eVar) {
        try {
            com.bugfender.sdk.w1.a(eVar, "application == null");
            com.bugfender.sdk.w1.a(eVar.a(), "application.getKey()");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("key", eVar.a());
            return jSONObject;
        } catch (org.json.JSONException e2) {
            com.bugfender.sdk.d1.a(e2);
            return null;
        }
    }
}
