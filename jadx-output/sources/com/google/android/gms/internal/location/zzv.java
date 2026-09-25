package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzv extends com.google.android.gms.internal.location.zzab {
    zzv(com.google.android.gms.internal.location.zzq zzqVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zza(new com.google.android.gms.internal.location.zzac(this));
    }
}
