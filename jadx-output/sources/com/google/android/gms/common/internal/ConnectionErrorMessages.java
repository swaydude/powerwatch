package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionErrorMessages {
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> zaor = new androidx.collection.SimpleArrayMap<>();

    public static java.lang.String getErrorTitle(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                android.util.Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zaa(context, "common_google_play_services_invalid_account_title");
            case 7:
                android.util.Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zaa(context, "common_google_play_services_network_error_title");
            case 8:
                android.util.Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                android.util.Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                android.util.Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                android.util.Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                android.util.Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                android.util.Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                android.util.Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zaa(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                android.util.Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zaa(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static java.lang.String getErrorNotificationTitle(android.content.Context context, int i) {
        java.lang.String errorTitle;
        if (i == 6) {
            errorTitle = zaa(context, "common_google_play_services_resolution_required_title");
        } else {
            errorTitle = getErrorTitle(context, i);
        }
        return errorTitle == null ? context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker) : errorTitle;
    }

    public static java.lang.String getErrorMessage(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String appName = getAppName(context);
        if (i == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, appName);
        }
        if (i == 2) {
            return com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, appName);
        }
        if (i == 3) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, appName);
        }
        if (i == 5) {
            return zaa(context, "common_google_play_services_invalid_account_text", appName);
        }
        if (i == 7) {
            return zaa(context, "common_google_play_services_network_error_text", appName);
        }
        if (i == 9) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, appName);
        }
        if (i != 20) {
            switch (i) {
                case 16:
                    return zaa(context, "common_google_play_services_api_unavailable_text", appName);
                case 17:
                    return zaa(context, "common_google_play_services_sign_in_failed_text", appName);
                case 18:
                    return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, appName);
                default:
                    return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, appName);
            }
        }
        return zaa(context, "common_google_play_services_restricted_profile_text", appName);
    }

    public static java.lang.String getErrorNotificationMessage(android.content.Context context, int i) {
        if (i == 6 || i == 19) {
            return zaa(context, "common_google_play_services_resolution_required_text", getAppName(context));
        }
        return getErrorMessage(context, i);
    }

    public static java.lang.String getErrorDialogButtonMessage(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button);
        }
        if (i == 3) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button);
        }
        return resources.getString(android.R.string.ok);
    }

    public static java.lang.String getAppName(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        try {
            return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            java.lang.String str = context.getApplicationInfo().name;
            return android.text.TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    private static java.lang.String zaa(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String strZaa = zaa(context, str);
        if (strZaa == null) {
            strZaa = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return java.lang.String.format(resources.getConfiguration().locale, strZaa, str2);
    }

    private static java.lang.String zaa(android.content.Context context, java.lang.String str) {
        androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> simpleArrayMap = zaor;
        synchronized (simpleArrayMap) {
            java.lang.String str2 = simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            android.content.res.Resources remoteResource = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                java.lang.String strValueOf = java.lang.String.valueOf(str);
                android.util.Log.w("GoogleApiAvailability", strValueOf.length() != 0 ? "Missing resource: ".concat(strValueOf) : new java.lang.String("Missing resource: "));
                return null;
            }
            java.lang.String string = remoteResource.getString(identifier);
            if (android.text.TextUtils.isEmpty(string)) {
                java.lang.String strValueOf2 = java.lang.String.valueOf(str);
                android.util.Log.w("GoogleApiAvailability", strValueOf2.length() != 0 ? "Got empty resource: ".concat(strValueOf2) : new java.lang.String("Got empty resource: "));
                return null;
            }
            simpleArrayMap.put(str, string);
            return string;
        }
    }

    public static java.lang.String getDefaultNotificationChannelName(android.content.Context context) {
        return context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
    }

    private ConnectionErrorMessages() {
    }
}
