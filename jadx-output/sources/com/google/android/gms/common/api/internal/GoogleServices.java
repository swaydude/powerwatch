package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class GoogleServices {
    private static final java.lang.Object sLock = new java.lang.Object();
    private static com.google.android.gms.common.api.internal.GoogleServices zzay;
    private final java.lang.String zzaz;
    private final com.google.android.gms.common.api.Status zzba;
    private final boolean zzbb;
    private final boolean zzbc;

    GoogleServices(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            boolean z2 = resources.getInteger(identifier) != 0;
            this.zzbc = !z2;
            z = z2;
        } else {
            this.zzbc = false;
        }
        this.zzbb = z;
        java.lang.String strZzc = com.google.android.gms.common.internal.zzp.zzc(context);
        strZzc = strZzc == null ? new com.google.android.gms.common.internal.StringResourceValueReader(context).getString("google_app_id") : strZzc;
        if (android.text.TextUtils.isEmpty(strZzc)) {
            this.zzba = new com.google.android.gms.common.api.Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzaz = null;
        } else {
            this.zzaz = strZzc;
            this.zzba = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
    }

    GoogleServices(java.lang.String str, boolean z) {
        this.zzaz = str;
        this.zzba = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        this.zzbb = z;
        this.zzbc = !z;
    }

    public static com.google.android.gms.common.api.Status initialize(android.content.Context context, java.lang.String str, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (sLock) {
            com.google.android.gms.common.api.internal.GoogleServices googleServices = zzay;
            if (googleServices != null) {
                return googleServices.checkGoogleAppId(str);
            }
            com.google.android.gms.common.api.internal.GoogleServices googleServices2 = new com.google.android.gms.common.api.internal.GoogleServices(str, z);
            zzay = googleServices2;
            return googleServices2.zzba;
        }
    }

    final com.google.android.gms.common.api.Status checkGoogleAppId(java.lang.String str) {
        java.lang.String str2 = this.zzaz;
        if (str2 != null && !str2.equals(str)) {
            java.lang.String str3 = this.zzaz;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 97);
            sb.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
            sb.append(str3);
            sb.append("'.");
            return new com.google.android.gms.common.api.Status(10, sb.toString());
        }
        return com.google.android.gms.common.api.Status.RESULT_SUCCESS;
    }

    public static com.google.android.gms.common.api.Status initialize(android.content.Context context) {
        com.google.android.gms.common.api.Status status;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (sLock) {
            if (zzay == null) {
                zzay = new com.google.android.gms.common.api.internal.GoogleServices(context);
            }
            status = zzay.zzba;
        }
        return status;
    }

    public static java.lang.String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzaz;
    }

    public static boolean isMeasurementEnabled() {
        com.google.android.gms.common.api.internal.GoogleServices googleServicesCheckInitialized = checkInitialized("isMeasurementEnabled");
        return googleServicesCheckInitialized.zzba.isSuccess() && googleServicesCheckInitialized.zzbb;
    }

    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzbc;
    }

    static void clearInstanceForTest() {
        synchronized (sLock) {
            zzay = null;
        }
    }

    private static com.google.android.gms.common.api.internal.GoogleServices checkInitialized(java.lang.String str) {
        com.google.android.gms.common.api.internal.GoogleServices googleServices;
        synchronized (sLock) {
            googleServices = zzay;
            if (googleServices == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        return googleServices;
    }
}
