package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzaa extends com.google.android.gms.internal.location.zzab {
    private final /* synthetic */ android.app.PendingIntent zzbx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(com.google.android.gms.internal.location.zzq zzqVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zzbx = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zza(this.zzbx, new com.google.android.gms.internal.location.zzac(this));
    }
}
