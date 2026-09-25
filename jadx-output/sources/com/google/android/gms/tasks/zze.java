package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zze<TResult, TContinuationResult> implements com.google.android.gms.tasks.OnCanceledListener, com.google.android.gms.tasks.OnFailureListener, com.google.android.gms.tasks.OnSuccessListener<TContinuationResult>, com.google.android.gms.tasks.zzq<TResult> {
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> zze;
    private final com.google.android.gms.tasks.zzu<TContinuationResult> zzf;

    public zze(java.util.concurrent.Executor executor, com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> continuation, com.google.android.gms.tasks.zzu<TContinuationResult> zzuVar) {
        this.zzd = executor;
        this.zze = continuation;
        this.zzf = zzuVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(com.google.android.gms.tasks.Task<TResult> task) {
        this.zzd.execute(new com.google.android.gms.tasks.zzf(this, task));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.zzf.setResult(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception exc) {
        this.zzf.setException(exc);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zzf.zza();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        throw new java.lang.UnsupportedOperationException();
    }
}
