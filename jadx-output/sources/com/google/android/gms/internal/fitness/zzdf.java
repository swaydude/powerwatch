package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdf extends com.google.android.gms.internal.fitness.zzaa<com.google.android.gms.fitness.result.GoalsResult> {
    private final /* synthetic */ com.google.android.gms.fitness.request.GoalsReadRequest zznf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdf(com.google.android.gms.internal.fitness.zzdc zzdcVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.GoalsReadRequest goalsReadRequest) {
        super(googleApiClient);
        this.zznf = goalsReadRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbv) ((com.google.android.gms.internal.fitness.zzz) anyClient).getService()).zza(new com.google.android.gms.fitness.request.GoalsReadRequest(this.zznf, new com.google.android.gms.internal.fitness.zzde(this)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.GoalsResult(status, java.util.Collections.emptyList());
    }
}
