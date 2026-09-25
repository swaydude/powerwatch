package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdn extends com.google.android.gms.internal.fitness.zzah<com.google.android.gms.fitness.result.DataReadResult> {
    private final /* synthetic */ com.google.android.gms.fitness.request.DataReadRequest zzno;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdn(com.google.android.gms.internal.fitness.zzdh zzdhVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataReadRequest dataReadRequest) {
        super(googleApiClient);
        this.zzno = dataReadRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbx) ((com.google.android.gms.internal.fitness.zzac) anyClient).getService()).zza(new com.google.android.gms.fitness.request.DataReadRequest(this.zzno, new com.google.android.gms.internal.fitness.zzdo(this, null)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.fitness.result.DataReadResult.zza(status, this.zzno.getDataTypes(), this.zzno.getDataSources());
    }
}
