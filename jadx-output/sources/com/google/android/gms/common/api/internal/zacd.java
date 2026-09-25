package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zacd implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zace zakl;

    zacd(com.google.android.gms.common.api.internal.zace zaceVar) {
        this.zakl = zaceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zakl.zakn.zag(new com.google.android.gms.common.ConnectionResult(4));
    }
}
