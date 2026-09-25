package com.google.android.gms.common.api.internal;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaab<TResult> implements com.google.android.gms.tasks.OnCompleteListener<TResult> {
    private final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zafp;
    private final /* synthetic */ com.google.android.gms.common.api.internal.zaz zafq;

    zaab(com.google.android.gms.common.api.internal.zaz zazVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zafq = zazVar;
        this.zafp = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task<TResult> task) {
        this.zafq.zafn.remove(this.zafp);
    }
}
