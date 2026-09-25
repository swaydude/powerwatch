package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final int DEVELOPER_ERROR = 10;

    @java.lang.Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    public static final int UNKNOWN = -1;
    private final int zzg;
    private final int zzh;
    private final android.app.PendingIntent zzi;
    private final java.lang.String zzj;
    public static final com.google.android.gms.common.ConnectionResult RESULT_SUCCESS = new com.google.android.gms.common.ConnectionResult(0);
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.ConnectionResult> CREATOR = new com.google.android.gms.common.zza();

    ConnectionResult(int i, int i2, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.zzg = i;
        this.zzh = i2;
        this.zzi = pendingIntent;
        this.zzj = str;
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, android.app.PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this(1, i, pendingIntent, str);
    }

    public final void startResolutionForResult(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.zzi.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final boolean hasResolution() {
        return (this.zzh == 0 || this.zzi == null) ? false : true;
    }

    public final boolean isSuccess() {
        return this.zzh == 0;
    }

    public final int getErrorCode() {
        return this.zzh;
    }

    public final android.app.PendingIntent getResolution() {
        return this.zzi;
    }

    public final java.lang.String getErrorMessage() {
        return this.zzj;
    }

    static java.lang.String zza(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.ConnectionResult)) {
            return false;
        }
        com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) obj;
        return this.zzh == connectionResult.zzh && com.google.android.gms.common.internal.Objects.equal(this.zzi, connectionResult.zzi) && com.google.android.gms.common.internal.Objects.equal(this.zzj, connectionResult.zzj);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzh), this.zzi, this.zzj);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("statusCode", zza(this.zzh)).add("resolution", this.zzi).add(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, this.zzj).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getErrorCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getResolution(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getErrorMessage(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
