package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdc implements com.google.android.gms.fitness.GoalsApi {
    @Override // com.google.android.gms.fitness.GoalsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.GoalsResult> readCurrentGoals(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.GoalsReadRequest goalsReadRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdf(this, googleApiClient, goalsReadRequest));
    }
}
