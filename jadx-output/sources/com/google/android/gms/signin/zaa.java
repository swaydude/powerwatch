package com.google.android.gms.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaa extends com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.signin.internal.SignInClientImpl, com.google.android.gms.signin.SignInOptions> {
    zaa() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.signin.SignInOptions signInOptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.signin.SignInOptions signInOptions2 = signInOptions;
        if (signInOptions2 == null) {
            signInOptions2 = com.google.android.gms.signin.SignInOptions.DEFAULT;
        }
        return new com.google.android.gms.signin.internal.SignInClientImpl(context, looper, true, clientSettings, signInOptions2, connectionCallbacks, onConnectionFailedListener);
    }
}
