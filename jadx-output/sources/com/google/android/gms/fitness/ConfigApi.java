package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface ConfigApi {
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataTypeResult> createCustomDataType(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> disableFit(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataTypeResult> readDataType(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);
}
