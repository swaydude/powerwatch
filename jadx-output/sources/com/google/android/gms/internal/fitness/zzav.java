package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzav extends com.google.android.gms.internal.fitness.zzat<com.google.android.gms.common.api.Status> {
    zzav(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.common.api.Status createFailedResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(!status.isSuccess());
        return status;
    }
}
