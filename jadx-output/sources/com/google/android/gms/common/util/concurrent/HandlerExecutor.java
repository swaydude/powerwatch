package com.google.android.gms.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public class HandlerExecutor implements java.util.concurrent.Executor {
    private final android.os.Handler handler;

    public HandlerExecutor(android.os.Looper looper) {
        this.handler = new com.google.android.gms.internal.common.zze(looper);
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.handler.post(runnable);
    }
}
