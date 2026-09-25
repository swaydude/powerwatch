package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzq implements com.google.android.gms.location.FusedLocationProviderApi {
    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> flushLocations(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzv(this, googleApiClient));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final android.location.Location getLastLocation(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        try {
            return com.google.android.gms.location.LocationServices.zza(googleApiClient).getLastLocation();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.location.LocationAvailability getLocationAvailability(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        try {
            return com.google.android.gms.location.LocationServices.zza(googleApiClient).zza();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzaa(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationCallback locationCallback) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzs(this, googleApiClient, locationCallback));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationListener locationListener) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzz(this, googleApiClient, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzy(this, googleApiClient, locationRequest, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationCallback locationCallback, android.os.Looper looper) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzx(this, googleApiClient, locationRequest, locationCallback, looper));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(android.os.Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzr(this, googleApiClient, locationRequest, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.location.LocationListener locationListener, android.os.Looper looper) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzw(this, googleApiClient, locationRequest, locationListener, looper));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setMockLocation(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.location.Location location) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzu(this, googleApiClient, location));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> setMockMode(com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzt(this, googleApiClient, z));
    }
}
