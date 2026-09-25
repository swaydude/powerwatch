package com.google.android.gms.common.internal.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zac extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.common.internal.service.zah, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    zac() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.Api.ApiOptions.NoOptions noOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.common.internal.service.zah(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
