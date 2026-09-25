package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzea implements com.google.android.gms.fitness.SessionsApi {
    @Override // com.google.android.gms.fitness.SessionsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.Session session) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(session, "Session cannot be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(session.getEndTime(java.util.concurrent.TimeUnit.MILLISECONDS) == 0, "Cannot start a session which has already ended");
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzed(this, googleApiClient, session));
    }

    @Override // com.google.android.gms.fitness.SessionsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.SessionStopResult> stopSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzec(this, googleApiClient, null, str));
    }

    @Override // com.google.android.gms.fitness.SessionsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> insertSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzef(this, googleApiClient, sessionInsertRequest));
    }

    @Override // com.google.android.gms.fitness.SessionsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.SessionReadResult> readSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzee(this, googleApiClient, sessionReadRequest));
    }

    @Override // com.google.android.gms.fitness.SessionsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> registerForSessions(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzeh(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.fitness.SessionsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unregisterForSessions(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzeg(this, googleApiClient, pendingIntent));
    }
}
