package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdk extends com.google.android.gms.internal.fitness.zzaj {
    private final /* synthetic */ android.app.PendingIntent zznk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdk(com.google.android.gms.internal.fitness.zzdh zzdhVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zznk = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbx) ((com.google.android.gms.internal.fitness.zzac) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzx(this.zznk, new com.google.android.gms.internal.fitness.zzel(this)));
    }
}
