package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzag extends com.google.android.gms.internal.location.zzai {
    private final /* synthetic */ android.app.PendingIntent zzbz;
    private final /* synthetic */ com.google.android.gms.location.GeofencingRequest zzcs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzag(com.google.android.gms.internal.location.zzaf zzafVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zzcs = geofencingRequest;
        this.zzbz = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zza(this.zzcs, this.zzbz, this);
    }
}
