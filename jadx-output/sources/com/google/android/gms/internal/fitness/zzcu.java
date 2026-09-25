package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcu extends com.google.android.gms.internal.fitness.zzq {
    private final /* synthetic */ java.lang.String zzna;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcu(com.google.android.gms.internal.fitness.zzcr zzcrVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        super(googleApiClient);
        this.zzna = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbr) ((com.google.android.gms.internal.fitness.zzn) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzbm(this.zzna, (com.google.android.gms.internal.fitness.zzcm) new com.google.android.gms.internal.fitness.zzel(this)));
    }
}
