package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zabc extends com.google.android.gms.common.api.internal.zabp {
    private java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaaw> zahp;

    zabc(com.google.android.gms.common.api.internal.zaaw zaawVar) {
        this.zahp = new java.lang.ref.WeakReference<>(zaawVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabp
    public final void zas() {
        com.google.android.gms.common.api.internal.zaaw zaawVar = this.zahp.get();
        if (zaawVar == null) {
            return;
        }
        zaawVar.resume();
    }
}
