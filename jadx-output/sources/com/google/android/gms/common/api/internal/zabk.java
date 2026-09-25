package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zabk implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager.zaa zaiq;

    zabk(com.google.android.gms.common.api.internal.GoogleApiManager.zaa zaaVar) {
        this.zaiq = zaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaiq.zabf();
    }
}
