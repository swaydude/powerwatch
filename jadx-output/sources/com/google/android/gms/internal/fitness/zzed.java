package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzed extends com.google.android.gms.internal.fitness.zzbb {
    private final /* synthetic */ com.google.android.gms.fitness.data.Session zzoa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzed(com.google.android.gms.internal.fitness.zzea zzeaVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.Session session) {
        super(googleApiClient);
        this.zzoa = session;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcd) ((com.google.android.gms.internal.fitness.zzau) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzba(this.zzoa, (com.google.android.gms.internal.fitness.zzcm) new com.google.android.gms.internal.fitness.zzel(this)));
    }
}
