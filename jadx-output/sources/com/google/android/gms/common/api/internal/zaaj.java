package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaaj implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaak zafz;

    zaaj(com.google.android.gms.common.api.internal.zaak zaakVar) {
        this.zafz = zaakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zafz.zaey.cancelAvailabilityErrorNotifications(this.zafz.mContext);
    }
}
