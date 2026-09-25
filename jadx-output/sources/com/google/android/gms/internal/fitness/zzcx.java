package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcx extends com.google.android.gms.internal.fitness.zzo<com.google.android.gms.fitness.result.BleDevicesResult> {
    zzcx(com.google.android.gms.internal.fitness.zzcr zzcrVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbr) ((com.google.android.gms.internal.fitness.zzn) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzag((com.google.android.gms.internal.fitness.zzep) new com.google.android.gms.internal.fitness.zzcw(this, null)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.fitness.result.BleDevicesResult.zzb(status);
    }
}
