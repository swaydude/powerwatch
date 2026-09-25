package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zacn implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zack zaky;
    private final /* synthetic */ com.google.android.gms.common.api.Result zakz;

    zacn(com.google.android.gms.common.api.internal.zack zackVar, com.google.android.gms.common.api.Result result) {
        this.zaky = zackVar;
        this.zakz = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.google.android.gms.common.api.internal.BasePendingResult.zado.set(true);
            this.zaky.zakw.sendMessage(this.zaky.zakw.obtainMessage(0, this.zaky.zakr.onSuccess(this.zakz)));
        } catch (java.lang.RuntimeException e) {
            this.zaky.zakw.sendMessage(this.zaky.zakw.obtainMessage(1, e));
        } finally {
            com.google.android.gms.common.api.internal.BasePendingResult.zado.set(false);
            com.google.android.gms.common.api.internal.zack zackVar = this.zaky;
            com.google.android.gms.common.api.internal.zack.zab(this.zakz);
            com.google.android.gms.common.api.GoogleApiClient googleApiClient = (com.google.android.gms.common.api.GoogleApiClient) this.zaky.zadr.get();
            if (googleApiClient != null) {
                googleApiClient.zab(this.zaky);
            }
        }
    }
}
