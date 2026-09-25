package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaco implements com.google.android.gms.common.api.internal.zacq {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zacp zala;

    zaco(com.google.android.gms.common.api.internal.zacp zacpVar) {
        this.zala = zacpVar;
    }

    @Override // com.google.android.gms.common.api.internal.zacq
    public final void zab(com.google.android.gms.common.api.internal.BasePendingResult<?> basePendingResult) {
        this.zala.zald.remove(basePendingResult);
        basePendingResult.zal();
    }
}
