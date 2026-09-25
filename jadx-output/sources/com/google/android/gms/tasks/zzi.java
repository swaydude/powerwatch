package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzi<TResult> implements com.google.android.gms.tasks.zzq<TResult> {
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.concurrent.Executor zzd;
    private com.google.android.gms.tasks.OnCompleteListener<TResult> zzl;

    public zzi(java.util.concurrent.Executor executor, com.google.android.gms.tasks.OnCompleteListener<TResult> onCompleteListener) {
        this.zzd = executor;
        this.zzl = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(com.google.android.gms.tasks.Task<TResult> task) {
        synchronized (this.mLock) {
            if (this.zzl == null) {
                return;
            }
            this.zzd.execute(new com.google.android.gms.tasks.zzj(this, task));
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzl = null;
        }
    }
}
