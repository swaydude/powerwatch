package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zacg implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.signin.internal.zak zagu;
    private final /* synthetic */ com.google.android.gms.common.api.internal.zace zakl;

    zacg(com.google.android.gms.common.api.internal.zace zaceVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.zakl = zaceVar;
        this.zagu = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zakl.zac(this.zagu);
    }
}
