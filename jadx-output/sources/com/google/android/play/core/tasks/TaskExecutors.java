package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskExecutors {
    public static final java.util.concurrent.Executor MAIN_THREAD = new com.google.android.play.core.tasks.TaskExecutors.a();
    static final java.util.concurrent.Executor a = new com.google.android.play.core.tasks.k();

    static final class a implements java.util.concurrent.Executor {
        private final android.os.Handler a = new android.os.Handler(android.os.Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            this.a.post(runnable);
        }
    }

    private TaskExecutors() {
    }
}
