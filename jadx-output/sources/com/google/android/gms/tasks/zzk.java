package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzk<TResult> implements com.google.android.gms.tasks.zzq<TResult> {
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.concurrent.Executor zzd;
    private com.google.android.gms.tasks.OnFailureListener zzn;

    public zzk(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnFailureListener onFailureListener) {
        this.zzd = executor;
        this.zzn = onFailureListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(com.google.android.gms.tasks.Task<TResult> task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        synchronized (this.mLock) {
            if (this.zzn == null) {
                return;
            }
            this.zzd.execute(new com.google.android.gms.tasks.zzl(this, task));
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzn = null;
        }
    }
}
