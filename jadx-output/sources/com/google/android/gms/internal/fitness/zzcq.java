package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcq extends com.google.android.gms.internal.fitness.zzq {
    private final /* synthetic */ com.google.android.gms.fitness.request.StartBleScanRequest zzmy;
    private final /* synthetic */ com.google.android.gms.fitness.request.zzaf zzmz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcq(com.google.android.gms.internal.fitness.zzcr zzcrVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.StartBleScanRequest startBleScanRequest, com.google.android.gms.fitness.request.zzaf zzafVar) {
        super(googleApiClient);
        this.zzmy = startBleScanRequest;
        this.zzmz = zzafVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbr) ((com.google.android.gms.internal.fitness.zzn) anyClient).getService()).zza(new com.google.android.gms.fitness.request.StartBleScanRequest(this.zzmy.getDataTypes(), this.zzmz, this.zzmy.getTimeoutSecs(), new com.google.android.gms.internal.fitness.zzel(this)));
    }
}
