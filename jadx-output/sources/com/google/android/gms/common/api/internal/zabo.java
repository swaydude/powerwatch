package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zabo implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.common.ConnectionResult zajc;
    private final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager.zab zajk;

    zabo(com.google.android.gms.common.api.internal.GoogleApiManager.zab zabVar, com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zajk = zabVar;
        this.zajc = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.GoogleApiManager.zaa zaaVar = (com.google.android.gms.common.api.internal.GoogleApiManager.zaa) com.google.android.gms.common.api.internal.GoogleApiManager.this.zaim.get(this.zajk.zaft);
        if (zaaVar == null) {
            return;
        }
        if (!this.zajc.isSuccess()) {
            zaaVar.onConnectionFailed(this.zajc);
            return;
        }
        com.google.android.gms.common.api.internal.GoogleApiManager.zab.zaa(this.zajk, true);
        if (this.zajk.zais.requiresSignIn()) {
            this.zajk.zabp();
            return;
        }
        try {
            this.zajk.zais.getRemoteService(null, this.zajk.zais.getScopesForConnectionlessNonSignIn());
        } catch (java.lang.SecurityException e) {
            android.util.Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            zaaVar.onConnectionFailed(new com.google.android.gms.common.ConnectionResult(10));
        }
    }
}
