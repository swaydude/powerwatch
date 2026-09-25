package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface ActivityRecognitionApi {
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeActivityUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestActivityUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, long j, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent);
}
