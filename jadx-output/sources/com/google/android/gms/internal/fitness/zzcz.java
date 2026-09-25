package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcz implements com.google.android.gms.fitness.ConfigApi {
    @Override // com.google.android.gms.fitness.ConfigApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataTypeResult> createCustomDataType(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzcy(this, googleApiClient, dataTypeCreateRequest));
    }

    @Override // com.google.android.gms.fitness.ConfigApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataTypeResult> readDataType(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdb(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.fitness.ConfigApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> disableFit(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzda(this, googleApiClient));
    }
}
