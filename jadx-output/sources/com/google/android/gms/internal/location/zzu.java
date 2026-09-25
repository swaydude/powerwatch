package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzu extends com.google.android.gms.internal.location.zzab {
    private final /* synthetic */ android.location.Location zzco;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzu(com.google.android.gms.internal.location.zzq zzqVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.location.Location location) {
        super(googleApiClient);
        this.zzco = location;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zza(this.zzco);
        setResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    }
}
