package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzct extends com.google.android.gms.internal.fitness.zzq {
    private final /* synthetic */ com.google.android.gms.fitness.request.zzaf zzmz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzct(com.google.android.gms.internal.fitness.zzcr zzcrVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.zzaf zzafVar) {
        super(googleApiClient);
        this.zzmz = zzafVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbr) ((com.google.android.gms.internal.fitness.zzn) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzbi(this.zzmz, new com.google.android.gms.internal.fitness.zzel(this)));
    }
}
