package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class LocationStatusCodes {
    public static final int ERROR = 1;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
    public static final int SUCCESS = 0;

    private LocationStatusCodes() {
    }

    public static int zzc(int i) {
        if ((i < 0 || i > 1) && (1000 > i || i > 1002)) {
            return 1;
        }
        return i;
    }

    public static com.google.android.gms.common.api.Status zzd(int i) {
        if (i == 1) {
            i = 13;
        }
        return new com.google.android.gms.common.api.Status(i);
    }
}
