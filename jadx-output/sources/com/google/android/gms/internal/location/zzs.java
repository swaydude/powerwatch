package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzs extends com.google.android.gms.internal.location.zzab {
    private final /* synthetic */ com.google.android.gms.location.LocationCallback zzcm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzs(com.google.android.gms.internal.location.zzq zzqVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationCallback locationCallback) {
        super(googleApiClient);
        this.zzcm = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zzb(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(this.zzcm, com.google.android.gms.location.LocationCallback.class.getSimpleName()), new com.google.android.gms.internal.location.zzac(this));
    }
}
