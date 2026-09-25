package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class ActivityRecognition {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.ActivityRecognitionApi ActivityRecognitionApi;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.location.zzaz, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.location.zzaz> CLIENT_KEY;
    public static final java.lang.String CLIENT_NAME = "activity_recognition";

    public static abstract class zza<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, com.google.android.gms.internal.location.zzaz> {
        public zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
            super(com.google.android.gms.location.ActivityRecognition.API, googleApiClient);
        }
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.location.zzaz> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.location.zza zzaVar = new com.google.android.gms.location.zza();
        CLIENT_BUILDER = zzaVar;
        API = new com.google.android.gms.common.api.Api<>("ActivityRecognition.API", zzaVar, clientKey);
        ActivityRecognitionApi = new com.google.android.gms.internal.location.zze();
    }

    private ActivityRecognition() {
    }

    public static com.google.android.gms.location.ActivityRecognitionClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.location.ActivityRecognitionClient(activity);
    }

    public static com.google.android.gms.location.ActivityRecognitionClient getClient(android.content.Context context) {
        return new com.google.android.gms.location.ActivityRecognitionClient(context);
    }
}
