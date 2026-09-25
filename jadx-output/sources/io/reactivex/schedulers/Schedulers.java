package io.reactivex.schedulers;

/* JADX INFO: loaded from: classes2.dex */
public final class Schedulers {
    static final io.reactivex.Scheduler SINGLE = io.reactivex.plugins.RxJavaPlugins.initSingleScheduler(new io.reactivex.schedulers.Schedulers.SingleTask());
    static final io.reactivex.Scheduler COMPUTATION = io.reactivex.plugins.RxJavaPlugins.initComputationScheduler(new io.reactivex.schedulers.Schedulers.ComputationTask());
    static final io.reactivex.Scheduler IO = io.reactivex.plugins.RxJavaPlugins.initIoScheduler(new io.reactivex.schedulers.Schedulers.IOTask());
    static final io.reactivex.Scheduler TRAMPOLINE = io.reactivex.internal.schedulers.TrampolineScheduler.instance();
    static final io.reactivex.Scheduler NEW_THREAD = io.reactivex.plugins.RxJavaPlugins.initNewThreadScheduler(new io.reactivex.schedulers.Schedulers.NewThreadTask());

    static final class SingleHolder {
        static final io.reactivex.Scheduler DEFAULT = new io.reactivex.internal.schedulers.SingleScheduler();

        SingleHolder() {
        }
    }

    static final class ComputationHolder {
        static final io.reactivex.Scheduler DEFAULT = new io.reactivex.internal.schedulers.ComputationScheduler();

        ComputationHolder() {
        }
    }

    static final class IoHolder {
        static final io.reactivex.Scheduler DEFAULT = new io.reactivex.internal.schedulers.IoScheduler();

        IoHolder() {
        }
    }

    static final class NewThreadHolder {
        static final io.reactivex.Scheduler DEFAULT = new io.reactivex.internal.schedulers.NewThreadScheduler();

        NewThreadHolder() {
        }
    }

    private Schedulers() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static io.reactivex.Scheduler computation() {
        return io.reactivex.plugins.RxJavaPlugins.onComputationScheduler(COMPUTATION);
    }

    public static io.reactivex.Scheduler io() {
        return io.reactivex.plugins.RxJavaPlugins.onIoScheduler(IO);
    }

    public static io.reactivex.Scheduler trampoline() {
        return TRAMPOLINE;
    }

    public static io.reactivex.Scheduler newThread() {
        return io.reactivex.plugins.RxJavaPlugins.onNewThreadScheduler(NEW_THREAD);
    }

    public static io.reactivex.Scheduler single() {
        return io.reactivex.plugins.RxJavaPlugins.onSingleScheduler(SINGLE);
    }

    public static io.reactivex.Scheduler from(java.util.concurrent.Executor executor) {
        return new io.reactivex.internal.schedulers.ExecutorScheduler(executor, false);
    }

    public static io.reactivex.Scheduler from(java.util.concurrent.Executor executor, boolean z) {
        return new io.reactivex.internal.schedulers.ExecutorScheduler(executor, z);
    }

    public static void shutdown() {
        computation().shutdown();
        io().shutdown();
        newThread().shutdown();
        single().shutdown();
        trampoline().shutdown();
        io.reactivex.internal.schedulers.SchedulerPoolFactory.shutdown();
    }

    public static void start() {
        computation().start();
        io().start();
        newThread().start();
        single().start();
        trampoline().start();
        io.reactivex.internal.schedulers.SchedulerPoolFactory.start();
    }

    static final class IOTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        IOTask() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.reactivex.Scheduler call() throws java.lang.Exception {
            return io.reactivex.schedulers.Schedulers.IoHolder.DEFAULT;
        }
    }

    static final class NewThreadTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        NewThreadTask() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.reactivex.Scheduler call() throws java.lang.Exception {
            return io.reactivex.schedulers.Schedulers.NewThreadHolder.DEFAULT;
        }
    }

    static final class SingleTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        SingleTask() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.reactivex.Scheduler call() throws java.lang.Exception {
            return io.reactivex.schedulers.Schedulers.SingleHolder.DEFAULT;
        }
    }

    static final class ComputationTask implements java.util.concurrent.Callable<io.reactivex.Scheduler> {
        ComputationTask() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.reactivex.Scheduler call() throws java.lang.Exception {
            return io.reactivex.schedulers.Schedulers.ComputationHolder.DEFAULT;
        }
    }
}
