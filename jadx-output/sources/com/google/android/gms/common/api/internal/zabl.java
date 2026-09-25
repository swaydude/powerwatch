package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zabl implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zabm zajd;

    zabl(com.google.android.gms.common.api.internal.zabm zabmVar) {
        this.zajd = zabmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zajd.zaiq.zais.disconnect();
    }
}
