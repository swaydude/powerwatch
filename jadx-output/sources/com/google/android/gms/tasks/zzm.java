package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzm<TResult> implements com.google.android.gms.tasks.zzq<TResult> {
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.concurrent.Executor zzd;
    private com.google.android.gms.tasks.OnSuccessListener<? super TResult> zzp;

    public zzm(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnSuccessListener<? super TResult> onSuccessListener) {
        this.zzd = executor;
        this.zzp = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(com.google.android.gms.tasks.Task<TResult> task) {
        if (task.isSuccessful()) {
            synchronized (this.mLock) {
                if (this.zzp == null) {
                    return;
                }
                this.zzd.execute(new com.google.android.gms.tasks.zzn(this, task));
            }
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzp = null;
        }
    }
}
