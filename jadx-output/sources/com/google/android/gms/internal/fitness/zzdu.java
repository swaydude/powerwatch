package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdu extends com.google.android.gms.internal.fitness.zzap {
    private final /* synthetic */ com.google.android.gms.fitness.data.DataSource zznt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdu(com.google.android.gms.internal.fitness.zzdr zzdrVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSource dataSource) {
        super(googleApiClient);
        this.zznt = dataSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbz) ((com.google.android.gms.internal.fitness.zzai) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzbo((com.google.android.gms.fitness.data.DataType) null, this.zznt, (com.google.android.gms.internal.fitness.zzcm) new com.google.android.gms.internal.fitness.zzel(this)));
    }
}
