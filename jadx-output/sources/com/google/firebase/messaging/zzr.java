package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzr {
    private static final com.google.firebase.encoders.DataEncoder zza = new com.google.firebase.encoders.json.JsonDataEncoderBuilder().registerEncoder(com.google.firebase.messaging.FirelogAnalyticsEvent.zza.class, (com.google.firebase.encoders.ObjectEncoder) new com.google.firebase.messaging.FirelogAnalyticsEvent.zzc()).registerEncoder(com.google.firebase.messaging.FirelogAnalyticsEvent.class, (com.google.firebase.encoders.ObjectEncoder) new com.google.firebase.messaging.FirelogAnalyticsEvent.zzb()).build();

    public static void zza(android.content.Intent intent, com.google.android.datatransport.Transport<java.lang.String> transport) {
        zza("_nr", intent);
        if (transport != null) {
            try {
                transport.send(com.google.android.datatransport.Event.ofTelemetry(zza.encode(new com.google.firebase.messaging.FirelogAnalyticsEvent.zza(new com.google.firebase.messaging.FirelogAnalyticsEvent("MESSAGE_DELIVERED", intent)))));
            } catch (com.google.firebase.encoders.EncodingException unused) {
                android.util.Log.d("FirebaseMessaging", "Failed to encode big query analytics payload. Skip sending");
            }
        }
    }

    public static void zza(android.content.Intent intent) {
        if (intent != null) {
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector = (com.google.firebase.analytics.connector.AnalyticsConnector) com.google.firebase.FirebaseApp.getInstance().get(com.google.firebase.analytics.connector.AnalyticsConnector.class);
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    android.util.Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (analyticsConnector != null) {
                    java.lang.String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    analyticsConnector.setUserProperty("fcm", com.google.android.gms.measurement.AppMeasurement.UserProperty.FIREBASE_LAST_NOTIFICATION, stringExtra);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE, "Firebase");
                    bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.MEDIUM, "notification");
                    bundle.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN, stringExtra);
                    analyticsConnector.logEvent("fcm", "_cmp", bundle);
                } else {
                    android.util.Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            } else if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                android.util.Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
        zza("_no", intent);
    }

    public static void zzb(android.content.Intent intent) {
        zza("_nd", intent);
    }

    public static void zzc(android.content.Intent intent) {
        zza("_nf", intent);
    }

    public static boolean zzd(android.content.Intent intent) {
        if (intent == null || zzn(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    public static boolean zze(android.content.Intent intent) {
        if (intent == null || zzn(intent)) {
            return false;
        }
        return zza();
    }

    private static boolean zzn(android.content.Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    static boolean zza() {
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            com.google.firebase.FirebaseApp.getInstance();
            android.content.Context applicationContext = com.google.firebase.FirebaseApp.getInstance().getApplicationContext();
            android.content.SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (java.lang.IllegalStateException unused2) {
            android.util.Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    private static void zza(java.lang.String str, android.content.Intent intent) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        java.lang.String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        java.lang.String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!android.text.TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        java.lang.String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!android.text.TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        java.lang.String strZzl = zzl(intent);
        if (strZzl != null) {
            bundle.putString("_nt", strZzl);
        }
        java.lang.String stringExtra5 = intent.getStringExtra("google.c.a.ts");
        if (stringExtra5 != null) {
            try {
                bundle.putInt("_nmt", java.lang.Integer.parseInt(stringExtra5));
            } catch (java.lang.NumberFormatException e) {
                android.util.Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        java.lang.String stringExtra6 = intent.hasExtra("google.c.a.udt") ? intent.getStringExtra("google.c.a.udt") : null;
        if (stringExtra6 != null) {
            try {
                bundle.putInt("_ndt", java.lang.Integer.parseInt(stringExtra6));
            } catch (java.lang.NumberFormatException e2) {
                android.util.Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        java.lang.String str2 = (intent.getExtras() == null || !com.google.firebase.messaging.zzt.zza(intent.getExtras())) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", str2);
        }
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            java.lang.String strValueOf = java.lang.String.valueOf(bundle);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 37 + java.lang.String.valueOf(strValueOf).length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(strValueOf);
            android.util.Log.d("FirebaseMessaging", sb.toString());
        }
        com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector = (com.google.firebase.analytics.connector.AnalyticsConnector) com.google.firebase.FirebaseApp.getInstance().get(com.google.firebase.analytics.connector.AnalyticsConnector.class);
        if (analyticsConnector != null) {
            analyticsConnector.logEvent("fcm", str, bundle);
        } else {
            android.util.Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    static void zza(boolean z) {
        com.google.firebase.FirebaseApp.getInstance().getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    static int zzf(android.content.Intent intent) {
        java.lang.Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        if (!(obj instanceof java.lang.String)) {
            return 0;
        }
        try {
            return java.lang.Integer.parseInt((java.lang.String) obj);
        } catch (java.lang.NumberFormatException unused) {
            java.lang.String strValueOf = java.lang.String.valueOf(obj);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(strValueOf);
            android.util.Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    static java.lang.String zzg(android.content.Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    static java.lang.String zzh(android.content.Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    static java.lang.String zzi(android.content.Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    static java.lang.String zzj(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    static java.lang.String zzb() {
        return com.google.firebase.FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    static java.lang.String zzc() {
        return com.google.firebase.iid.FirebaseInstanceId.getInstance(com.google.firebase.FirebaseApp.getInstance()).getId();
    }

    static java.lang.String zzk(android.content.Intent intent) {
        return (intent.getExtras() == null || !com.google.firebase.messaging.zzt.zza(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    static java.lang.String zzl(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    static int zzm(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        if ("high".equals(stringExtra)) {
            return 1;
        }
        return "normal".equals(stringExtra) ? 2 : 0;
    }

    static java.lang.String zzd() {
        com.google.firebase.FirebaseApp firebaseApp = com.google.firebase.FirebaseApp.getInstance();
        java.lang.String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        java.lang.String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        java.lang.String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        java.lang.String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }
}
