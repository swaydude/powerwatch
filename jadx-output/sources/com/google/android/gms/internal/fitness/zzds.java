package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzds extends com.google.android.gms.internal.fitness.zzap {
    private final /* synthetic */ com.google.android.gms.fitness.data.Subscription zzns;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzds(com.google.android.gms.internal.fitness.zzdr zzdrVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.Subscription subscription) {
        super(googleApiClient);
        this.zzns = subscription;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbz) ((com.google.android.gms.internal.fitness.zzai) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzbk(this.zzns, false, (com.google.android.gms.internal.fitness.zzcm) new com.google.android.gms.internal.fitness.zzel(this)));
    }
}
