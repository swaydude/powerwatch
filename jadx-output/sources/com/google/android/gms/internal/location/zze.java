package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zze implements com.google.android.gms.location.ActivityRecognitionApi {
    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeActivityUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzg(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestActivityUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, long j, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzf(this, googleApiClient, j, pendingIntent));
    }

    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzi(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.location.zzh(this, googleApiClient, activityTransitionRequest, pendingIntent));
    }
}
