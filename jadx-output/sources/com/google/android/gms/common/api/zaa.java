package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaa implements com.google.android.gms.common.api.PendingResult.StatusListener {
    private final /* synthetic */ com.google.android.gms.common.api.Batch zabb;

    zaa(com.google.android.gms.common.api.Batch batch) {
        this.zabb = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status status) {
        synchronized (this.zabb.mLock) {
            if (this.zabb.isCanceled()) {
                return;
            }
            if (status.isCanceled()) {
                com.google.android.gms.common.api.Batch.zaa(this.zabb, true);
            } else if (!status.isSuccess()) {
                com.google.android.gms.common.api.Batch.zab(this.zabb, true);
            }
            com.google.android.gms.common.api.Batch.zab(this.zabb);
            if (this.zabb.zabc == 0) {
                if (this.zabb.zabe) {
                    super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                } else {
                    com.google.android.gms.common.api.Status status2 = this.zabb.zabd ? new com.google.android.gms.common.api.Status(13) : com.google.android.gms.common.api.Status.RESULT_SUCCESS;
                    com.google.android.gms.common.api.Batch batch = this.zabb;
                    batch.setResult(new com.google.android.gms.common.api.BatchResult(status2, batch.zabf));
                }
            }
        }
    }
}
