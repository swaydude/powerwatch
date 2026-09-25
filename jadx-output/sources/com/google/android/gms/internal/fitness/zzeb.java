package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzeb extends com.google.android.gms.internal.fitness.zzav {
    private final /* synthetic */ android.app.PendingIntent zznk;
    private final /* synthetic */ com.google.android.gms.fitness.data.zzu zznx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzeb(com.google.android.gms.internal.fitness.zzdw zzdwVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.zzu zzuVar, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zznx = zzuVar;
        this.zznk = pendingIntent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.fitness.zzav
    /* JADX INFO: renamed from: zza */
    public final com.google.android.gms.common.api.Status createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcb) ((com.google.android.gms.internal.fitness.zzao) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzas(this.zznx, this.zznk, new com.google.android.gms.internal.fitness.zzel(this)));
    }

    @Override // com.google.android.gms.internal.fitness.zzav, com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return createFailedResult(status);
    }
}
