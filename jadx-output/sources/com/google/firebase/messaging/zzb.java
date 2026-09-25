package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzb {
    private static final java.util.concurrent.atomic.AtomicInteger zza = new java.util.concurrent.atomic.AtomicInteger((int) android.os.SystemClock.elapsedRealtime());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    static com.google.firebase.messaging.zza zza(android.content.Context context, com.google.firebase.messaging.zzt zztVar) {
        android.net.Uri defaultUri;
        android.content.Intent intent;
        android.app.PendingIntent activity;
        android.os.Bundle bundleZza = zza(context.getPackageManager(), context.getPackageName());
        java.lang.String packageName = context.getPackageName();
        java.lang.String strZzb = zzb(context, zztVar.zza("gcm.n.android_channel_id"), bundleZza);
        android.content.res.Resources resources = context.getResources();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(context, strZzb);
        java.lang.CharSequence charSequenceZza = zztVar.zza(resources, packageName, "gcm.n.title");
        if (!android.text.TextUtils.isEmpty(charSequenceZza)) {
            builder.setContentTitle(charSequenceZza);
        }
        java.lang.CharSequence charSequenceZza2 = zztVar.zza(resources, packageName, "gcm.n.body");
        if (!android.text.TextUtils.isEmpty(charSequenceZza2)) {
            builder.setContentText(charSequenceZza2);
            builder.setStyle(new androidx.core.app.NotificationCompat.BigTextStyle().bigText(charSequenceZza2));
        }
        builder.setSmallIcon(zza(packageManager, resources, packageName, zztVar.zza("gcm.n.icon"), bundleZza));
        java.lang.String strZzb2 = zztVar.zzb();
        java.lang.Integer num = null;
        if (android.text.TextUtils.isEmpty(strZzb2)) {
            defaultUri = null;
        } else if ("default".equals(strZzb2) || resources.getIdentifier(strZzb2, "raw", packageName) == 0) {
            defaultUri = android.media.RingtoneManager.getDefaultUri(2);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 24 + java.lang.String.valueOf(strZzb2).length());
            sb.append("android.resource://");
            sb.append(packageName);
            sb.append("/raw/");
            sb.append(strZzb2);
            defaultUri = android.net.Uri.parse(sb.toString());
        }
        if (defaultUri != null) {
            builder.setSound(defaultUri);
        }
        java.lang.String strZza = zztVar.zza("gcm.n.click_action");
        if (android.text.TextUtils.isEmpty(strZza)) {
            android.net.Uri uriZza = zztVar.zza();
            if (uriZza != null) {
                intent = new android.content.Intent("android.intent.action.VIEW");
                intent.setPackage(packageName);
                intent.setData(uriZza);
            } else {
                android.content.Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    android.util.Log.w("FirebaseMessaging", "No activity found to launch app");
                }
                intent = launchIntentForPackage;
            }
        } else {
            intent = new android.content.Intent(strZza);
            intent.setPackage(packageName);
            intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        }
        if (intent == null) {
            activity = null;
        } else {
            intent.addFlags(67108864);
            intent.putExtras(zztVar.zze());
            activity = android.app.PendingIntent.getActivity(context, zza.incrementAndGet(), intent, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
            if (zztVar.zzb("google.c.a.e")) {
                activity = zza(context, new android.content.Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(zztVar.zzf()).putExtra("pending_intent", activity));
            }
        }
        builder.setContentIntent(activity);
        android.app.PendingIntent pendingIntentZza = !zztVar.zzb("google.c.a.e") ? null : zza(context, new android.content.Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(zztVar.zzf()));
        if (pendingIntentZza != null) {
            builder.setDeleteIntent(pendingIntentZza);
        }
        java.lang.Integer numZza = zza(context, zztVar.zza("gcm.n.color"), bundleZza);
        if (numZza != null) {
            builder.setColor(numZza.intValue());
        }
        builder.setAutoCancel(!zztVar.zzb("gcm.n.sticky"));
        builder.setLocalOnly(zztVar.zzb("gcm.n.local_only"));
        java.lang.CharSequence charSequenceZza3 = zztVar.zza("gcm.n.ticker");
        if (charSequenceZza3 != null) {
            builder.setTicker(charSequenceZza3);
        }
        java.lang.Integer numZzc = zztVar.zzc("gcm.n.notification_priority");
        if (numZzc == null) {
            numZzc = null;
        } else if (numZzc.intValue() < -2 || numZzc.intValue() > 2) {
            java.lang.String strValueOf = java.lang.String.valueOf(numZzc);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 72);
            sb2.append("notificationPriority is invalid ");
            sb2.append(strValueOf);
            sb2.append(". Skipping setting notificationPriority.");
            android.util.Log.w("FirebaseMessaging", sb2.toString());
            numZzc = null;
        }
        if (numZzc != null) {
            builder.setPriority(numZzc.intValue());
        }
        java.lang.Integer numZzc2 = zztVar.zzc("gcm.n.visibility");
        if (numZzc2 == null) {
            numZzc2 = null;
        } else if (numZzc2.intValue() < -1 || numZzc2.intValue() > 1) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(numZzc2);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 53);
            sb3.append("visibility is invalid: ");
            sb3.append(strValueOf2);
            sb3.append(". Skipping setting visibility.");
            android.util.Log.w("NotificationParams", sb3.toString());
            numZzc2 = null;
        }
        if (numZzc2 != null) {
            builder.setVisibility(numZzc2.intValue());
        }
        java.lang.Integer numZzc3 = zztVar.zzc("gcm.n.notification_count");
        if (numZzc3 != null) {
            if (numZzc3.intValue() < 0) {
                java.lang.String strValueOf3 = java.lang.String.valueOf(numZzc3);
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf3).length() + 67);
                sb4.append("notificationCount is invalid: ");
                sb4.append(strValueOf3);
                sb4.append(". Skipping setting notificationCount.");
                android.util.Log.w("FirebaseMessaging", sb4.toString());
            } else {
                num = numZzc3;
            }
        }
        if (num != null) {
            builder.setNumber(num.intValue());
        }
        java.lang.Long lZzd = zztVar.zzd("gcm.n.event_time");
        if (lZzd != null) {
            builder.setShowWhen(true);
            builder.setWhen(lZzd.longValue());
        }
        long[] jArrZzc = zztVar.zzc();
        if (jArrZzc != null) {
            builder.setVibrate(jArrZzc);
        }
        int[] iArrZzd = zztVar.zzd();
        if (iArrZzd != null) {
            builder.setLights(iArrZzd[0], iArrZzd[1], iArrZzd[2]);
        }
        boolean zZzb = zztVar.zzb("gcm.n.default_sound");
        ?? r9 = zZzb;
        if (zztVar.zzb("gcm.n.default_vibrate_timings")) {
            r9 = (zZzb ? 1 : 0) | 2;
        }
        int i = r9;
        if (zztVar.zzb("gcm.n.default_light_settings")) {
            i = (r9 == true ? 1 : 0) | 4;
        }
        builder.setDefaults(i);
        java.lang.String strZza2 = zztVar.zza("gcm.n.tag");
        if (android.text.TextUtils.isEmpty(strZza2)) {
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(37);
            sb5.append("FCM-Notification:");
            sb5.append(jUptimeMillis);
            strZza2 = sb5.toString();
        }
        return new com.google.firebase.messaging.zza(builder, strZza2, 0);
    }

    private static boolean zza(android.content.res.Resources resources, int i) {
        if (android.os.Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof android.graphics.drawable.AdaptiveIconDrawable)) {
                return true;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            android.util.Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (android.content.res.Resources.NotFoundException unused) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            android.util.Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    private static int zza(android.content.pm.PackageManager packageManager, android.content.res.Resources resources, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (!android.text.TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && zza(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && zza(resources, identifier2)) {
                return identifier2;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            android.util.Log.w("FirebaseMessaging", sb.toString());
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !zza(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                java.lang.String strValueOf = java.lang.String.valueOf(e);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(strValueOf);
                android.util.Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        return (i == 0 || !zza(resources, i)) ? android.R.drawable.sym_def_app_icon : i;
    }

    private static java.lang.Integer zza(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Integer.valueOf(android.graphics.Color.parseColor(str));
            } catch (java.lang.IllegalArgumentException unused) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                android.util.Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(context, i));
            } catch (android.content.res.Resources.NotFoundException unused2) {
                android.util.Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    private static android.os.Bundle zza(android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(strValueOf);
            android.util.Log.w("FirebaseMessaging", sb.toString());
        }
        return android.os.Bundle.EMPTY;
    }

    private static java.lang.String zzb(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
            if (!android.text.TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 122);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                android.util.Log.w("FirebaseMessaging", sb.toString());
            }
            java.lang.String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!android.text.TextUtils.isEmpty(string)) {
                if (notificationManager.getNotificationChannel(string) != null) {
                    return string;
                }
                android.util.Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                android.util.Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                notificationManager.createNotificationChannel(new android.app.NotificationChannel("fcm_fallback_notification_channel", context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static android.app.PendingIntent zza(android.content.Context context, android.content.Intent intent) {
        return android.app.PendingIntent.getBroadcast(context, zza.incrementAndGet(), new android.content.Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new android.content.ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
    }
}
