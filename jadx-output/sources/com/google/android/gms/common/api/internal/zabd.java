package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zabd {
    private final com.google.android.gms.common.api.internal.zabb zahq;

    protected zabd(com.google.android.gms.common.api.internal.zabb zabbVar) {
        this.zahq = zabbVar;
    }

    protected abstract void zaal();

    public final void zaa(com.google.android.gms.common.api.internal.zabe zabeVar) {
        zabeVar.zaer.lock();
        try {
            if (zabeVar.zahu != this.zahq) {
                return;
            }
            zaal();
        } finally {
            zabeVar.zaer.unlock();
        }
    }
}
