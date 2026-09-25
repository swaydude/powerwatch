package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaac implements com.google.android.gms.common.api.PendingResult.StatusListener {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaz zafq;
    private final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult zafr;

    zaac(com.google.android.gms.common.api.internal.zaz zazVar, com.google.android.gms.common.api.internal.BasePendingResult basePendingResult) {
        this.zafq = zazVar;
        this.zafr = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status status) {
        this.zafq.zafm.remove(this.zafr);
    }
}
