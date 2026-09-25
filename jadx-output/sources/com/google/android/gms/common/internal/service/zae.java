package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zae implements com.google.android.gms.common.internal.service.zab {
    @Override // com.google.android.gms.common.internal.service.zab
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zaa(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.common.internal.service.zad(this, googleApiClient));
    }
}
