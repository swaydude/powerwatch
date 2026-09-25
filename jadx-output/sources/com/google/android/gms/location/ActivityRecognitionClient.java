package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class ActivityRecognitionClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public ActivityRecognitionClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.location.LocationServices.API, (com.google.android.gms.common.api.Api.ApiOptions) null, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public ActivityRecognitionClient(android.content.Context context) {
        super(context, com.google.android.gms.location.LocationServices.API, (com.google.android.gms.common.api.Api.ApiOptions) null, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityTransitionUpdates(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.ActivityRecognition.ActivityRecognitionApi.zza(asGoogleApiClient(), pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityUpdates(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.ActivityRecognition.ActivityRecognitionApi.removeActivityUpdates(asGoogleApiClient(), pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityTransitionUpdates(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.ActivityRecognition.ActivityRecognitionApi.zza(asGoogleApiClient(), activityTransitionRequest, pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityUpdates(long j, android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.location.ActivityRecognition.ActivityRecognitionApi.requestActivityUpdates(asGoogleApiClient(), j, pendingIntent));
    }
}
