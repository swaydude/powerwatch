package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zas implements com.google.android.gms.common.api.internal.zabs {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaq zaet;

    private zas(com.google.android.gms.common.api.internal.zaq zaqVar) {
        this.zaet = zaqVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void zab(android.os.Bundle bundle) {
        this.zaet.zaer.lock();
        try {
            this.zaet.zaa(bundle);
            this.zaet.zaeo = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
            this.zaet.zav();
        } finally {
            this.zaet.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void zac(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zaet.zaer.lock();
        try {
            this.zaet.zaeo = connectionResult;
            this.zaet.zav();
        } finally {
            this.zaet.zaer.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void zab(int i, boolean z) {
        this.zaet.zaer.lock();
        try {
            if (!this.zaet.zaeq && this.zaet.zaep != null && this.zaet.zaep.isSuccess()) {
                this.zaet.zaeq = true;
                this.zaet.zaej.onConnectionSuspended(i);
                return;
            }
            this.zaet.zaeq = false;
            this.zaet.zaa(i, z);
        } finally {
            this.zaet.zaer.unlock();
        }
    }

    /* synthetic */ zas(com.google.android.gms.common.api.internal.zaq zaqVar, com.google.android.gms.common.api.internal.zat zatVar) {
        this(zaqVar);
    }
}
