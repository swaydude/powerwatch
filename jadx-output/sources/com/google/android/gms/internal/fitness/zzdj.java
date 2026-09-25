package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdj extends com.google.android.gms.internal.fitness.zzaj {
    private final /* synthetic */ com.google.android.gms.fitness.request.DataDeleteRequest zznj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdj(com.google.android.gms.internal.fitness.zzdh zzdhVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest) {
        super(googleApiClient);
        this.zznj = dataDeleteRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbx) ((com.google.android.gms.internal.fitness.zzac) anyClient).getService()).zza(new com.google.android.gms.fitness.request.DataDeleteRequest(this.zznj, new com.google.android.gms.internal.fitness.zzel(this)));
    }
}
