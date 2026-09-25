package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zat implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaq zaet;

    zat(com.google.android.gms.common.api.internal.zaq zaqVar) {
        this.zaet = zaqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaet.zaer.lock();
        try {
            this.zaet.zav();
        } finally {
            this.zaet.zaer.unlock();
        }
    }
}
