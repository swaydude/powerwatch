package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zad extends com.google.android.gms.common.internal.service.zai {
    zad(com.google.android.gms.common.internal.service.zae zaeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.common.internal.service.zam) ((com.google.android.gms.common.internal.service.zah) anyClient).getService()).zaa(new com.google.android.gms.common.internal.service.zag(this));
    }
}
