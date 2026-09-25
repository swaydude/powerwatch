package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzbb extends com.google.android.gms.internal.fitness.zzaz<com.google.android.gms.common.api.Status> {
    zzbb(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(!status.isSuccess());
        return status;
    }
}
