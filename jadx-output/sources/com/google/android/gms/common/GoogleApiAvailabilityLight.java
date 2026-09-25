package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiAvailabilityLight {
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final java.lang.String TRACKING_SOURCE_DIALOG = "d";
    static final java.lang.String TRACKING_SOURCE_NOTIFICATION = "n";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zzm = new com.google.android.gms.common.GoogleApiAvailabilityLight();

    public static com.google.android.gms.common.GoogleApiAvailabilityLight getInstance() {
        return zzm;
    }

    GoogleApiAvailabilityLight() {
    }

    public int isGooglePlayServicesAvailable(android.content.Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public int isGooglePlayServicesAvailable(android.content.Context context, int i) {
        int iIsGooglePlayServicesAvailable = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
        if (com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, iIsGooglePlayServicesAvailable)) {
            return 18;
        }
        return iIsGooglePlayServicesAvailable;
    }

    public void verifyGooglePlayServicesIsAvailable(android.content.Context context, int i) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
        com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i);
    }

    public boolean isUserResolvableError(int i) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    @java.lang.Deprecated
    public android.content.Intent getErrorResolutionIntent(int i) {
        return getErrorResolutionIntent(null, i, null);
    }

    public android.content.Intent getErrorResolutionIntent(android.content.Context context, int i, java.lang.String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return com.google.android.gms.common.internal.zzg.zzg("com.google.android.gms");
        }
        if (context != null && com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context)) {
            return com.google.android.gms.common.internal.zzg.zzs();
        }
        return com.google.android.gms.common.internal.zzg.zza("com.google.android.gms", zza(context, str));
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, int i, int i2) {
        return getErrorResolutionPendingIntent(context, i, i2, null);
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, int i, int i2, java.lang.String str) {
        android.content.Intent errorResolutionIntent = getErrorResolutionIntent(context, i, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(context, i2, errorResolutionIntent, 134217728);
    }

    public void cancelAvailabilityErrorNotifications(android.content.Context context) {
        com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    public int getClientVersion(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getClientVersion(context);
    }

    public int getApkVersion(android.content.Context context) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getApkVersion(context);
    }

    public boolean isPlayServicesPossiblyUpdating(android.content.Context context, int i) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i);
    }

    public boolean isPlayStorePossiblyUpdating(android.content.Context context, int i) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i);
    }

    public boolean isUninstalledAppPossiblyUpdating(android.content.Context context, java.lang.String str) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isUninstalledAppPossiblyUpdating(context, str);
    }

    public java.lang.String getErrorString(int i) {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(i);
    }

    private static java.lang.String zza(android.content.Context context, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("gcore_");
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb.append("-");
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }
}
