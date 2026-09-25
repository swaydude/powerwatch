package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class SettingsClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public SettingsClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.location.LocationServices.API, (com.google.android.gms.common.api.Api.ApiOptions) null, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public SettingsClient(android.content.Context context) {
        super(context, com.google.android.gms.location.LocationServices.API, (com.google.android.gms.common.api.Api.ApiOptions) null, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.location.LocationSettingsResponse> checkLocationSettings(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(com.google.android.gms.location.LocationServices.SettingsApi.checkLocationSettings(asGoogleApiClient(), locationSettingsRequest), new com.google.android.gms.location.LocationSettingsResponse());
    }
}
