package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zak implements com.google.android.gms.common.api.PendingResult.StatusListener {
    private final /* synthetic */ com.google.android.gms.common.api.PendingResult zaph;
    private final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zapi;
    private final /* synthetic */ com.google.android.gms.common.internal.PendingResultUtil.ResultConverter zapj;
    private final /* synthetic */ com.google.android.gms.common.internal.PendingResultUtil.zaa zapk;

    zak(com.google.android.gms.common.api.PendingResult pendingResult, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.common.internal.PendingResultUtil.ResultConverter resultConverter, com.google.android.gms.common.internal.PendingResultUtil.zaa zaaVar) {
        this.zaph = pendingResult;
        this.zapi = taskCompletionSource;
        this.zapj = resultConverter;
        this.zapk = zaaVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(com.google.android.gms.common.api.Status status) {
        if (!status.isSuccess()) {
            this.zapi.setException(this.zapk.zaf(status));
        } else {
            this.zapi.setResult(this.zapj.convert(this.zaph.await(0L, java.util.concurrent.TimeUnit.MILLISECONDS)));
        }
    }
}
