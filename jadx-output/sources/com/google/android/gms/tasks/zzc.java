package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzc<TResult, TContinuationResult> implements com.google.android.gms.tasks.zzq<TResult> {
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> zze;
    private final com.google.android.gms.tasks.zzu<TContinuationResult> zzf;

    public zzc(java.util.concurrent.Executor executor, com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> continuation, com.google.android.gms.tasks.zzu<TContinuationResult> zzuVar) {
        this.zzd = executor;
        this.zze = continuation;
        this.zzf = zzuVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(com.google.android.gms.tasks.Task<TResult> task) {
        this.zzd.execute(new com.google.android.gms.tasks.zzd(this, task));
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        throw new java.lang.UnsupportedOperationException();
    }
}
