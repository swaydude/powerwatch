package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdq extends com.google.android.gms.internal.fitness.zzan<com.google.android.gms.fitness.result.ListSubscriptionsResult> {
    zzdq(com.google.android.gms.internal.fitness.zzdr zzdrVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbz) ((com.google.android.gms.internal.fitness.zzai) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzai((com.google.android.gms.fitness.data.DataType) null, (com.google.android.gms.internal.fitness.zzcf) new com.google.android.gms.internal.fitness.zzdx(this, null)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.fitness.result.ListSubscriptionsResult.zzd(status);
    }
}
