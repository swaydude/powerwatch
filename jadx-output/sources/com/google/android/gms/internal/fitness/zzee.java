package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzee extends com.google.android.gms.internal.fitness.zzaz<com.google.android.gms.fitness.result.SessionReadResult> {
    private final /* synthetic */ com.google.android.gms.fitness.request.SessionReadRequest zzob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzee(com.google.android.gms.internal.fitness.zzea zzeaVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest) {
        super(googleApiClient);
        this.zzob = sessionReadRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcd) ((com.google.android.gms.internal.fitness.zzau) anyClient).getService()).zza(new com.google.android.gms.fitness.request.SessionReadRequest(this.zzob, new com.google.android.gms.internal.fitness.zzej(this, null)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.fitness.result.SessionReadResult.zze(status);
    }
}
