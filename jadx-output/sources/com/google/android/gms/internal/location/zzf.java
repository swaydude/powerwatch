package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzf extends com.google.android.gms.internal.location.zzj {
    private final /* synthetic */ long zzbw;
    private final /* synthetic */ android.app.PendingIntent zzbx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(com.google.android.gms.internal.location.zze zzeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, long j, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zzbw = j;
        this.zzbx = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zza(this.zzbw, this.zzbx);
        setResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    }
}
