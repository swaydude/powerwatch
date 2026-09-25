package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzab extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.fitness.zzz, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    private zzab() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.Api.ApiOptions.NoOptions noOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.fitness.zzz(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
