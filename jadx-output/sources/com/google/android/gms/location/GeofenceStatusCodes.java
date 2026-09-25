package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class GeofenceStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;

    private GeofenceStatusCodes() {
    }

    public static java.lang.String getStatusCodeString(int i) {
        switch (i) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            default:
                return com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(i);
        }
    }
}
