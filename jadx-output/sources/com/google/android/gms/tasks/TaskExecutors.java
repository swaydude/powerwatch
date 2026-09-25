package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
public final class TaskExecutors {
    public static final java.util.concurrent.Executor MAIN_THREAD = new com.google.android.gms.tasks.TaskExecutors.zza();
    static final java.util.concurrent.Executor zzw = new com.google.android.gms.tasks.zzt();

    private TaskExecutors() {
    }

    private static final class zza implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            this.mHandler.post(runnable);
        }
    }
}
