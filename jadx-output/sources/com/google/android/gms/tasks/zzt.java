package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzt implements java.util.concurrent.Executor {
    zzt() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }
}
