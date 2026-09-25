package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdz extends com.google.android.gms.internal.fitness.zzat<com.google.android.gms.fitness.result.DataSourcesResult> {
    private final /* synthetic */ com.google.android.gms.fitness.request.DataSourcesRequest zznw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdz(com.google.android.gms.internal.fitness.zzdw zzdwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataSourcesRequest dataSourcesRequest) {
        super(googleApiClient);
        this.zznw = dataSourcesRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcb) ((com.google.android.gms.internal.fitness.zzao) anyClient).getService()).zza(new com.google.android.gms.fitness.request.DataSourcesRequest(this.zznw, new com.google.android.gms.internal.fitness.zzk(this)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.DataSourcesResult(java.util.Collections.emptyList(), status);
    }
}
