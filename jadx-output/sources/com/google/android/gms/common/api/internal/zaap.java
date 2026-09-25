package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaap extends com.google.android.gms.signin.internal.zad {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zaak> zago;

    zaap(com.google.android.gms.common.api.internal.zaak zaakVar) {
        this.zago = new java.lang.ref.WeakReference<>(zaakVar);
    }

    @Override // com.google.android.gms.signin.internal.zad, com.google.android.gms.signin.internal.zac
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        com.google.android.gms.common.api.internal.zaak zaakVar = this.zago.get();
        if (zaakVar == null) {
            return;
        }
        zaakVar.zafv.zaa(new com.google.android.gms.common.api.internal.zaas(this, zaakVar, zaakVar, zakVar));
    }
}
