package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class SessionsClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.SessionsApi zzih = new com.google.android.gms.internal.fitness.zzea();

    protected SessionsClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, com.google.android.gms.internal.fitness.zzau.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    SessionsClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, com.google.android.gms.internal.fitness.zzau.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> startSession(com.google.android.gms.fitness.data.Session session) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzih.startSession(asGoogleApiClient(), session));
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.Session>> stopSession(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzih.stopSession(asGoogleApiClient(), str), com.google.android.gms.fitness.zzq.zzho);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> insertSession(com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzih.insertSession(asGoogleApiClient(), sessionInsertRequest));
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.result.SessionReadResponse> readSession(com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(zzih.readSession(asGoogleApiClient(), sessionReadRequest), new com.google.android.gms.fitness.result.SessionReadResponse());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> registerForSessions(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzih.registerForSessions(asGoogleApiClient(), pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unregisterForSessions(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzih.unregisterForSessions(asGoogleApiClient(), pendingIntent));
    }
}
