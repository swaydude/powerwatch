package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdm extends com.google.android.gms.internal.fitness.zzah<com.google.android.gms.fitness.result.DailyTotalResult> {
    private final /* synthetic */ com.google.android.gms.fitness.data.DataType zznm;
    private final /* synthetic */ boolean zznn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdm(com.google.android.gms.internal.fitness.zzdh zzdhVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType, boolean z) {
        super(googleApiClient);
        this.zznm = dataType;
        this.zznn = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbx) ((com.google.android.gms.internal.fitness.zzac) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzh((com.google.android.gms.internal.fitness.zzba) new com.google.android.gms.internal.fitness.zzdp(this), this.zznm, this.zznn));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.fitness.result.DailyTotalResult.zza(status, this.zznm);
    }
}
