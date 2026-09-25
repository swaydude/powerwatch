package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaar implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaak zafz;

    private zaar(com.google.android.gms.common.api.internal.zaak zaakVar) {
        this.zafz = zaakVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        if (!this.zafz.zafa.isSignInClientDisconnectFixEnabled()) {
            this.zafz.zagf.zaa(new com.google.android.gms.common.api.internal.zaap(this.zafz));
            return;
        }
        this.zafz.zaer.lock();
        try {
            if (this.zafz.zagf == null) {
                return;
            }
            this.zafz.zagf.zaa(new com.google.android.gms.common.api.internal.zaap(this.zafz));
        } finally {
            this.zafz.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zafz.zaer.lock();
        try {
            if (!this.zafz.zad(connectionResult)) {
                this.zafz.zae(connectionResult);
            } else {
                this.zafz.zaap();
                this.zafz.zaan();
            }
        } finally {
            this.zafz.zaer.unlock();
        }
    }

    /* synthetic */ zaar(com.google.android.gms.common.api.internal.zaak zaakVar, com.google.android.gms.common.api.internal.zaaj zaajVar) {
        this(zaakVar);
    }
}
