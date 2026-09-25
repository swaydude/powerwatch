package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcv extends com.google.android.gms.internal.fitness.zzq {
    private final /* synthetic */ com.google.android.gms.fitness.data.BleDevice zznb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcv(com.google.android.gms.internal.fitness.zzcr zzcrVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice) {
        super(googleApiClient);
        this.zznb = bleDevice;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbr) ((com.google.android.gms.internal.fitness.zzn) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzf(this.zznb.getAddress(), this.zznb, (com.google.android.gms.internal.fitness.zzcm) new com.google.android.gms.internal.fitness.zzel(this)));
    }
}
