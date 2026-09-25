package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzah extends com.google.android.gms.internal.location.zzai {
    private final /* synthetic */ com.google.android.gms.location.zzal zzct;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzah(com.google.android.gms.internal.location.zzaf zzafVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.zzal zzalVar) {
        super(googleApiClient);
        this.zzct = zzalVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zza(this.zzct, this);
    }
}
