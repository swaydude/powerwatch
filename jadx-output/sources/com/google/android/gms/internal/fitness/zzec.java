package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzec extends com.google.android.gms.internal.fitness.zzaz<com.google.android.gms.fitness.result.SessionStopResult> {
    private final /* synthetic */ java.lang.String zzny = null;
    private final /* synthetic */ java.lang.String zznz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzec(com.google.android.gms.internal.fitness.zzea zzeaVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2) {
        super(googleApiClient);
        this.zznz = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcd) ((com.google.android.gms.internal.fitness.zzau) anyClient).getService()).zza(new com.google.android.gms.fitness.request.zzbc(this.zzny, this.zznz, (com.google.android.gms.internal.fitness.zzcl) new com.google.android.gms.internal.fitness.zzei(this, null)));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.fitness.result.SessionStopResult(status, java.util.Collections.emptyList());
    }
}
