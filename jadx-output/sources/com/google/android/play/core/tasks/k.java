package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class k implements java.util.concurrent.Executor {
    k() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }
}
