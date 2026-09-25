package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes2.dex */
public final class TrampolineScheduler extends io.reactivex.Scheduler {
    private static final io.reactivex.internal.schedulers.TrampolineScheduler INSTANCE = new io.reactivex.internal.schedulers.TrampolineScheduler();

    public static io.reactivex.internal.schedulers.TrampolineScheduler instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker();
    }

    TrampolineScheduler() {
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable) {
        io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable).run();
        return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable).run();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            io.reactivex.plugins.RxJavaPlugins.onError(e);
        }
        return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
    }

    static final class TrampolineWorker extends io.reactivex.Scheduler.Worker implements io.reactivex.disposables.Disposable {
        volatile boolean disposed;
        final java.util.concurrent.PriorityBlockingQueue<io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable> queue = new java.util.concurrent.PriorityBlockingQueue<>();
        private final java.util.concurrent.atomic.AtomicInteger wip = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicInteger counter = new java.util.concurrent.atomic.AtomicInteger();

        TrampolineWorker() {
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            return enqueue(runnable, now(java.util.concurrent.TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            long jNow = now(java.util.concurrent.TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return enqueue(new io.reactivex.internal.schedulers.TrampolineScheduler.SleepingRunnable(runnable, this, jNow), jNow);
        }

        io.reactivex.disposables.Disposable enqueue(java.lang.Runnable runnable, long j) {
            if (this.disposed) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable timedRunnable = new io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable(runnable, java.lang.Long.valueOf(j), this.counter.incrementAndGet());
            this.queue.add(timedRunnable);
            if (this.wip.getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.disposed) {
                    io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable timedRunnablePoll = this.queue.poll();
                    if (timedRunnablePoll != null) {
                        if (!timedRunnablePoll.disposed) {
                            timedRunnablePoll.run.run();
                        }
                    } else {
                        iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
                        }
                    }
                }
                this.queue.clear();
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            return io.reactivex.disposables.Disposables.fromRunnable(new io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker.AppendToQueueTask(timedRunnable));
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        final class AppendToQueueTask implements java.lang.Runnable {
            final io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable timedRunnable;

            AppendToQueueTask(io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable timedRunnable) {
                this.timedRunnable = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.timedRunnable.disposed = true;
                io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker.this.queue.remove(this.timedRunnable);
            }
        }
    }

    static final class TimedRunnable implements java.lang.Comparable<io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable> {
        final int count;
        volatile boolean disposed;
        final long execTime;
        final java.lang.Runnable run;

        TimedRunnable(java.lang.Runnable runnable, java.lang.Long l, int i) {
            this.run = runnable;
            this.execTime = l.longValue();
            this.count = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable timedRunnable) {
            int iCompare = io.reactivex.internal.functions.ObjectHelper.compare(this.execTime, timedRunnable.execTime);
            return iCompare == 0 ? io.reactivex.internal.functions.ObjectHelper.compare(this.count, timedRunnable.count) : iCompare;
        }
    }

    static final class SleepingRunnable implements java.lang.Runnable {
        private final long execTime;
        private final java.lang.Runnable run;
        private final io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker worker;

        SleepingRunnable(java.lang.Runnable runnable, io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker trampolineWorker, long j) {
            this.run = runnable;
            this.worker = trampolineWorker;
            this.execTime = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.worker.disposed) {
                return;
            }
            long jNow = this.worker.now(java.util.concurrent.TimeUnit.MILLISECONDS);
            long j = this.execTime;
            if (j > jNow) {
                try {
                    java.lang.Thread.sleep(j - jNow);
                } catch (java.lang.InterruptedException e) {
                    java.lang.Thread.currentThread().interrupt();
                    io.reactivex.plugins.RxJavaPlugins.onError(e);
                    return;
                }
            }
            if (this.worker.disposed) {
                return;
            }
            this.run.run();
        }
    }
}
