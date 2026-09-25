package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzg<TResult> implements com.google.android.gms.tasks.zzq<TResult> {
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.concurrent.Executor zzd;
    private com.google.android.gms.tasks.OnCanceledListener zzj;

    public zzg(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnCanceledListener onCanceledListener) {
        this.zzd = executor;
        this.zzj = onCanceledListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(com.google.android.gms.tasks.Task task) {
        if (task.isCanceled()) {
            synchronized (this.mLock) {
                if (this.zzj == null) {
                    return;
                }
                this.zzd.execute(new com.google.android.gms.tasks.zzh(this));
            }
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzj = null;
        }
    }
}
