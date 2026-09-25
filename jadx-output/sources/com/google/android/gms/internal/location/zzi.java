package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
final class zzi extends com.google.android.gms.internal.location.zzj {
    private final /* synthetic */ android.app.PendingIntent zzbz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(com.google.android.gms.internal.location.zze zzeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zzbz = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zza(this.zzbz, this);
    }
}
