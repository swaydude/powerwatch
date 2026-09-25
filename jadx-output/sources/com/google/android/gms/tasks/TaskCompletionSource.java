package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
public class TaskCompletionSource<TResult> {
    private final com.google.android.gms.tasks.zzu<TResult> zza = new com.google.android.gms.tasks.zzu<>();

    public TaskCompletionSource() {
    }

    public TaskCompletionSource(com.google.android.gms.tasks.CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new com.google.android.gms.tasks.zzs(this));
    }

    public void setResult(TResult tresult) {
        this.zza.setResult(tresult);
    }

    public boolean trySetResult(TResult tresult) {
        return this.zza.trySetResult(tresult);
    }

    public void setException(java.lang.Exception exc) {
        this.zza.setException(exc);
    }

    public boolean trySetException(java.lang.Exception exc) {
        return this.zza.trySetException(exc);
    }

    public com.google.android.gms.tasks.Task<TResult> getTask() {
        return this.zza;
    }
}
