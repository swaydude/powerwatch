package com.google.android.gms.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zza extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.internal.clearcut.zzj, com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    zza() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.Api.ApiOptions.NoOptions noOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.clearcut.zzj(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
