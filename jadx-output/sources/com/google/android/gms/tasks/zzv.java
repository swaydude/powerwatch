package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzv implements java.lang.Runnable {
    private final /* synthetic */ java.util.concurrent.Callable val$callable;
    private final /* synthetic */ com.google.android.gms.tasks.zzu zzad;

    zzv(com.google.android.gms.tasks.zzu zzuVar, java.util.concurrent.Callable callable) {
        this.zzad = zzuVar;
        this.val$callable = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzad.setResult(this.val$callable.call());
        } catch (java.lang.Exception e) {
            this.zzad.setException(e);
        }
    }
}
