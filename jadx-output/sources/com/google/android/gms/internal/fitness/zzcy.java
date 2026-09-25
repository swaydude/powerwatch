package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcy extends com.google.android.gms.internal.fitness.zzu<com.google.android.gms.fitness.result.DataTypeResult> {
    private final /* synthetic */ com.google.android.gms.fitness.request.DataTypeCreateRequest zznc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcy(com.google.android.gms.internal.fitness.zzcz zzczVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest) {
        super(googleApiClient);
        this.zznc = dataTypeCreateRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbt) ((com.google.android.gms.internal.fitness.zzt) anyClient).getService()).zza(new com.google.android.gms.fitness.request.DataTypeCreateRequest(this.zznc, new com.google.android.gms.internal.fitness.zzdd(this, null)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.fitness.result.DataTypeResult.zzc(status);
    }
}
