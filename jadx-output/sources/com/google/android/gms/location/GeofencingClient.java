package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class GeofencingClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public GeofencingClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.location.LocationServices.API, (com.google.android.gms.common.api.Api.ApiOptions) null, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public GeofencingClient(android.content.Context context) {
        super(context, com.google.android.gms.location.LocationServices.API, (com.google.android.gms.common.api.Api.ApiOptions) null, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> addGeofences(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.LocationServices.GeofencingApi.addGeofences(asGoogleApiClient(), geofencingRequest, pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeGeofences(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.LocationServices.GeofencingApi.removeGeofences(asGoogleApiClient(), pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeGeofences(java.util.List<java.lang.String> list) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.LocationServices.GeofencingApi.removeGeofences(asGoogleApiClient(), list));
    }
}
