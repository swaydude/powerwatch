package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zaau implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaak zafz;

    private zaau(com.google.android.gms.common.api.internal.zaak zaakVar) {
        this.zafz = zaakVar;
    }

    protected abstract void zaal();

    @Override // java.lang.Runnable
    public void run() {
        this.zafz.zaer.lock();
        try {
            if (java.lang.Thread.interrupted()) {
                return;
            }
            zaal();
            return;
        } catch (java.lang.RuntimeException e) {
            this.zafz.zafv.zab(e);
            return;
        } finally {
            this.zafz.zaer.unlock();
        }
        this.zafz.zaer.unlock();
    }

    /* synthetic */ zaau(com.google.android.gms.common.api.internal.zaak zaakVar, com.google.android.gms.common.api.internal.zaaj zaajVar) {
        this(zaakVar);
    }
}
