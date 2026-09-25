package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzbk implements com.google.android.gms.location.SettingsApi {
    @Override // com.google.android.gms.location.SettingsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.location.LocationSettingsResult> checkLocationSettings(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.location.zzbl(this, googleApiClient, locationSettingsRequest, null));
    }
}
