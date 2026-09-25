package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzd {
    private static final java.util.Set<java.lang.String> zza = new java.util.HashSet(java.util.Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", com.google.firebase.analytics.FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
    private static final java.util.List<java.lang.String> zzb = java.util.Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", com.google.firebase.analytics.FirebaseAnalytics.Event.APP_OPEN);
    private static final java.util.List<java.lang.String> zzc = java.util.Arrays.asList(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, "am");
    private static final java.util.List<java.lang.String> zzd = java.util.Arrays.asList("_r", "_dbg");
    private static final java.util.List<java.lang.String> zze = java.util.Arrays.asList((java.lang.String[]) com.google.android.gms.common.util.ArrayUtils.concat(com.google.android.gms.measurement.AppMeasurement.UserProperty.zza, com.google.android.gms.measurement.AppMeasurement.UserProperty.zzb));
    private static final java.util.List<java.lang.String> zzf = java.util.Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean zza(java.lang.String str) {
        return !zzc.contains(str);
    }

    public static boolean zza(java.lang.String str, android.os.Bundle bundle) {
        if (zzb.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        java.util.Iterator<java.lang.String> it = zzd.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzb(java.lang.String str) {
        return !zza.contains(str);
    }

    public static boolean zza(java.lang.String str, java.lang.String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if (com.google.android.gms.measurement.AppMeasurement.UserProperty.FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (zze.contains(str2)) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = zzf.iterator();
        while (it.hasNext()) {
            if (str2.matches(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean zza(com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        java.lang.String str;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
            return false;
        }
        if ((conditionalUserProperty.value != null && com.google.android.gms.measurement.internal.zziu.zza(conditionalUserProperty.value) == null) || !zza(str) || !zza(str, conditionalUserProperty.name)) {
            return false;
        }
        if (conditionalUserProperty.expiredEventName != null && (!zza(conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams) || !zza(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
            return false;
        }
        if (conditionalUserProperty.triggeredEventName != null && (!zza(conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams) || !zza(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
            return false;
        }
        if (conditionalUserProperty.timedOutEventName != null) {
            return zza(conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams) && zza(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams);
        }
        return true;
    }

    public static boolean zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!zza(str) || bundle == null) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = zzd.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        str.hashCode();
        switch (str) {
            case "fcm":
                bundle.putString("_cis", "fcm_integration");
                return true;
            case "fdl":
                bundle.putString("_cis", "fdl_integration");
                return true;
            case "fiam":
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty zzb(com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty2.mOrigin = conditionalUserProperty.origin;
        conditionalUserProperty2.mActive = conditionalUserProperty.active;
        conditionalUserProperty2.mCreationTimestamp = conditionalUserProperty.creationTimestamp;
        conditionalUserProperty2.mExpiredEventName = conditionalUserProperty.expiredEventName;
        if (conditionalUserProperty.expiredEventParams != null) {
            conditionalUserProperty2.mExpiredEventParams = new android.os.Bundle(conditionalUserProperty.expiredEventParams);
        }
        conditionalUserProperty2.mName = conditionalUserProperty.name;
        conditionalUserProperty2.mTimedOutEventName = conditionalUserProperty.timedOutEventName;
        if (conditionalUserProperty.timedOutEventParams != null) {
            conditionalUserProperty2.mTimedOutEventParams = new android.os.Bundle(conditionalUserProperty.timedOutEventParams);
        }
        conditionalUserProperty2.mTimeToLive = conditionalUserProperty.timeToLive;
        conditionalUserProperty2.mTriggeredEventName = conditionalUserProperty.triggeredEventName;
        if (conditionalUserProperty.triggeredEventParams != null) {
            conditionalUserProperty2.mTriggeredEventParams = new android.os.Bundle(conditionalUserProperty.triggeredEventParams);
        }
        conditionalUserProperty2.mTriggeredTimestamp = conditionalUserProperty.triggeredTimestamp;
        conditionalUserProperty2.mTriggerEventName = conditionalUserProperty.triggerEventName;
        conditionalUserProperty2.mTriggerTimeout = conditionalUserProperty.triggerTimeout;
        if (conditionalUserProperty.value != null) {
            conditionalUserProperty2.mValue = com.google.android.gms.measurement.internal.zziu.zza(conditionalUserProperty.value);
        }
        return conditionalUserProperty2;
    }

    public static com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty zza(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty conditionalUserProperty2 = new com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty2.origin = conditionalUserProperty.mOrigin;
        conditionalUserProperty2.active = conditionalUserProperty.mActive;
        conditionalUserProperty2.creationTimestamp = conditionalUserProperty.mCreationTimestamp;
        conditionalUserProperty2.expiredEventName = conditionalUserProperty.mExpiredEventName;
        if (conditionalUserProperty.mExpiredEventParams != null) {
            conditionalUserProperty2.expiredEventParams = new android.os.Bundle(conditionalUserProperty.mExpiredEventParams);
        }
        conditionalUserProperty2.name = conditionalUserProperty.mName;
        conditionalUserProperty2.timedOutEventName = conditionalUserProperty.mTimedOutEventName;
        if (conditionalUserProperty.mTimedOutEventParams != null) {
            conditionalUserProperty2.timedOutEventParams = new android.os.Bundle(conditionalUserProperty.mTimedOutEventParams);
        }
        conditionalUserProperty2.timeToLive = conditionalUserProperty.mTimeToLive;
        conditionalUserProperty2.triggeredEventName = conditionalUserProperty.mTriggeredEventName;
        if (conditionalUserProperty.mTriggeredEventParams != null) {
            conditionalUserProperty2.triggeredEventParams = new android.os.Bundle(conditionalUserProperty.mTriggeredEventParams);
        }
        conditionalUserProperty2.triggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
        conditionalUserProperty2.triggerEventName = conditionalUserProperty.mTriggerEventName;
        conditionalUserProperty2.triggerTimeout = conditionalUserProperty.mTriggerTimeout;
        if (conditionalUserProperty.mValue != null) {
            conditionalUserProperty2.value = com.google.android.gms.measurement.internal.zziu.zza(conditionalUserProperty.mValue);
        }
        return conditionalUserProperty2;
    }

    public static boolean zzc(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int iCodePointAt = str.codePointAt(0);
        if (!java.lang.Character.isLetter(iCodePointAt)) {
            return false;
        }
        int length = str.length();
        int iCharCount = java.lang.Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(iCodePointAt2)) {
                return false;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public static boolean zzd(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int iCodePointAt = str.codePointAt(0);
        if (!java.lang.Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            return false;
        }
        int length = str.length();
        int iCharCount = java.lang.Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !java.lang.Character.isLetterOrDigit(iCodePointAt2)) {
                return false;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public static java.lang.String zze(java.lang.String str) {
        java.lang.String strZza = com.google.android.gms.measurement.AppMeasurement.Event.zza(str);
        return strZza != null ? strZza : str;
    }

    public static java.lang.String zzf(java.lang.String str) {
        java.lang.String strZzb = com.google.android.gms.measurement.AppMeasurement.Event.zzb(str);
        return strZzb != null ? strZzb : str;
    }

    public static void zzb(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }
}
