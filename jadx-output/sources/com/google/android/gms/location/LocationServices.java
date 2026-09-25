package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class LocationServices {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.location.zzaz, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.location.zzaz> CLIENT_KEY;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.FusedLocationProviderApi FusedLocationApi;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.GeofencingApi GeofencingApi;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.SettingsApi SettingsApi;

    public static abstract class zza<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, com.google.android.gms.internal.location.zzaz> {
        public zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
            super(com.google.android.gms.location.LocationServices.API, googleApiClient);
        }
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.location.zzaz> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.location.zzad zzadVar = new com.google.android.gms.location.zzad();
        CLIENT_BUILDER = zzadVar;
        API = new com.google.android.gms.common.api.Api<>("LocationServices.API", zzadVar, clientKey);
        FusedLocationApi = new com.google.android.gms.internal.location.zzq();
        GeofencingApi = new com.google.android.gms.internal.location.zzaf();
        SettingsApi = new com.google.android.gms.internal.location.zzbk();
    }

    private LocationServices() {
    }

    public static com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient(android.app.Activity activity) {
        return new com.google.android.gms.location.FusedLocationProviderClient(activity);
    }

    public static com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient(android.content.Context context) {
        return new com.google.android.gms.location.FusedLocationProviderClient(context);
    }

    public static com.google.android.gms.location.GeofencingClient getGeofencingClient(android.app.Activity activity) {
        return new com.google.android.gms.location.GeofencingClient(activity);
    }

    public static com.google.android.gms.location.GeofencingClient getGeofencingClient(android.content.Context context) {
        return new com.google.android.gms.location.GeofencingClient(context);
    }

    public static com.google.android.gms.location.SettingsClient getSettingsClient(android.app.Activity activity) {
        return new com.google.android.gms.location.SettingsClient(activity);
    }

    public static com.google.android.gms.location.SettingsClient getSettingsClient(android.content.Context context) {
        return new com.google.android.gms.location.SettingsClient(context);
    }

    public static com.google.android.gms.internal.location.zzaz zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        com.google.android.gms.internal.location.zzaz zzazVar = (com.google.android.gms.internal.location.zzaz) googleApiClient.getClient(CLIENT_KEY);
        com.google.android.gms.common.internal.Preconditions.checkState(zzazVar != null, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzazVar;
    }
}
