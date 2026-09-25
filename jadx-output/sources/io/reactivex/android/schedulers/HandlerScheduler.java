package io.reactivex.android.schedulers;

/* JADX INFO: loaded from: classes2.dex */
final class HandlerScheduler extends io.reactivex.Scheduler {
    private final android.os.Handler handler;

    HandlerScheduler(android.os.Handler handler) {
        this.handler = handler;
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.util.Objects.requireNonNull(runnable, "run == null");
        java.util.Objects.requireNonNull(timeUnit, "unit == null");
        io.reactivex.android.schedulers.HandlerScheduler.ScheduledRunnable scheduledRunnable = new io.reactivex.android.schedulers.HandlerScheduler.ScheduledRunnable(this.handler, io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable));
        this.handler.postDelayed(scheduledRunnable, java.lang.Math.max(0L, timeUnit.toMillis(j)));
        return scheduledRunnable;
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.android.schedulers.HandlerScheduler.HandlerWorker(this.handler);
    }

    private static final class HandlerWorker extends io.reactivex.Scheduler.Worker {
        private volatile boolean disposed;
        private final android.os.Handler handler;

        HandlerWorker(android.os.Handler handler) {
            this.handler = handler;
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            java.util.Objects.requireNonNull(runnable, "run == null");
            java.util.Objects.requireNonNull(timeUnit, "unit == null");
            if (this.disposed) {
                return io.reactivex.disposables.Disposables.disposed();
            }
            io.reactivex.android.schedulers.HandlerScheduler.ScheduledRunnable scheduledRunnable = new io.reactivex.android.schedulers.HandlerScheduler.ScheduledRunnable(this.handler, io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable));
            android.os.Message messageObtain = android.os.Message.obtain(this.handler, scheduledRunnable);
            messageObtain.obj = this;
            this.handler.sendMessageDelayed(messageObtain, java.lang.Math.max(0L, timeUnit.toMillis(j)));
            if (!this.disposed) {
                return scheduledRunnable;
            }
            this.handler.removeCallbacks(scheduledRunnable);
            return io.reactivex.disposables.Disposables.disposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.handler.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }

    private static final class ScheduledRunnable implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        private final java.lang.Runnable delegate;
        private volatile boolean disposed;
        private final android.os.Handler handler;

        ScheduledRunnable(android.os.Handler handler, java.lang.Runnable runnable) {
            this.handler = handler;
            this.delegate = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.delegate.run();
            } catch (java.lang.Throwable th) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Fatal Exception thrown on Scheduler.", th);
                io.reactivex.plugins.RxJavaPlugins.onError(illegalStateException);
                java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, illegalStateException);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.handler.removeCallbacks(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }
}
