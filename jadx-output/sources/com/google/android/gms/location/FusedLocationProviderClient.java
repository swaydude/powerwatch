package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class FusedLocationProviderClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public static final java.lang.String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    /* JADX INFO: Access modifiers changed from: private */
    static class zza extends com.google.android.gms.internal.location.zzak {
        private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> zzac;

        public zza(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
            this.zzac = taskCompletionSource;
        }

        @Override // com.google.android.gms.internal.location.zzaj
        public final void zza(com.google.android.gms.internal.location.zzad zzadVar) {
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(zzadVar.getStatus(), this.zzac);
        }
    }

    public FusedLocationProviderClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.location.LocationServices.API, (com.google.android.gms.common.api.Api.ApiOptions) null, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public FusedLocationProviderClient(android.content.Context context) {
        super(context, com.google.android.gms.location.LocationServices.API, (com.google.android.gms.common.api.Api.ApiOptions) null, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.internal.location.zzaj zza(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) {
        return new com.google.android.gms.location.zzp(this, taskCompletionSource);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> flushLocations() {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.LocationServices.FusedLocationApi.flushLocations(asGoogleApiClient()));
    }

    public com.google.android.gms.tasks.Task<android.location.Location> getLastLocation() {
        return doRead(new com.google.android.gms.location.zzl(this));
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.location.LocationAvailability> getLocationAvailability() {
        return doRead(new com.google.android.gms.location.zzm(this));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.LocationServices.FusedLocationApi.removeLocationUpdates(asGoogleApiClient(), pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeLocationUpdates(com.google.android.gms.location.LocationCallback locationCallback) {
        return com.google.android.gms.common.api.internal.TaskUtil.toVoidTaskThatFailsOnFalse(doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(locationCallback, com.google.android.gms.location.LocationCallback.class.getSimpleName())));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.LocationServices.FusedLocationApi.requestLocationUpdates(asGoogleApiClient(), locationRequest, pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestLocationUpdates(com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper) {
        com.google.android.gms.internal.location.zzbd zzbdVarZza = com.google.android.gms.internal.location.zzbd.zza(locationRequest);
        com.google.android.gms.common.api.internal.ListenerHolder listenerHolderCreateListenerHolder = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(locationCallback, com.google.android.gms.internal.location.zzbm.zza(looper), com.google.android.gms.location.LocationCallback.class.getSimpleName());
        return doRegisterEventListener(new com.google.android.gms.location.zzn(this, listenerHolderCreateListenerHolder, zzbdVarZza, listenerHolderCreateListenerHolder), new com.google.android.gms.location.zzo(this, listenerHolderCreateListenerHolder.getListenerKey()));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setMockLocation(android.location.Location location) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.LocationServices.FusedLocationApi.setMockLocation(asGoogleApiClient(), location));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setMockMode(boolean z) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.LocationServices.FusedLocationApi.setMockMode(asGoogleApiClient(), z));
    }
}
