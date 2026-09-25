package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzz extends com.google.android.gms.internal.location.zzab {
    private final /* synthetic */ com.google.android.gms.location.LocationListener zzcl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzz(com.google.android.gms.internal.location.zzq zzqVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationListener locationListener) {
        super(googleApiClient);
        this.zzcl = locationListener;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zza(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(this.zzcl, com.google.android.gms.location.LocationListener.class.getSimpleName()), new com.google.android.gms.internal.location.zzac(this));
    }
}
