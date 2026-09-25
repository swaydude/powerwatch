package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzr<TResult> {
    private final java.lang.Object mLock = new java.lang.Object();
    private java.util.Queue<com.google.android.gms.tasks.zzq<TResult>> zzt;
    private boolean zzu;

    zzr() {
    }

    public final void zza(com.google.android.gms.tasks.zzq<TResult> zzqVar) {
        synchronized (this.mLock) {
            if (this.zzt == null) {
                this.zzt = new java.util.ArrayDeque();
            }
            this.zzt.add(zzqVar);
        }
    }

    public final void zza(com.google.android.gms.tasks.Task<TResult> task) {
        com.google.android.gms.tasks.zzq<TResult> zzqVarPoll;
        synchronized (this.mLock) {
            if (this.zzt != null && !this.zzu) {
                this.zzu = true;
                while (true) {
                    synchronized (this.mLock) {
                        zzqVarPoll = this.zzt.poll();
                        if (zzqVarPoll == null) {
                            this.zzu = false;
                            return;
                        }
                    }
                    zzqVarPoll.onComplete(task);
                }
            }
        }
    }
}
