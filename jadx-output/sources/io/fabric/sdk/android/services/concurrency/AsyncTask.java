package io.fabric.sdk.android.services.concurrency;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsyncTask<Params, Progress, Result> {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE = 1;
    private static final java.lang.String LOG_TAG = "AsyncTask";
    private static final int MAXIMUM_POOL_SIZE;
    private static final int MESSAGE_POST_PROGRESS = 2;
    private static final int MESSAGE_POST_RESULT = 1;
    public static final java.util.concurrent.Executor SERIAL_EXECUTOR;
    public static final java.util.concurrent.Executor THREAD_POOL_EXECUTOR;
    private static volatile java.util.concurrent.Executor defaultExecutor;
    private static final io.fabric.sdk.android.services.concurrency.AsyncTask.InternalHandler handler;
    private static final java.util.concurrent.BlockingQueue<java.lang.Runnable> poolWorkQueue;
    private static final java.util.concurrent.ThreadFactory threadFactory;
    private final java.util.concurrent.FutureTask<Result> future;
    private final io.fabric.sdk.android.services.concurrency.AsyncTask.WorkerRunnable<Params, Result> worker;
    private volatile io.fabric.sdk.android.services.concurrency.AsyncTask.Status status = io.fabric.sdk.android.services.concurrency.AsyncTask.Status.PENDING;
    private final java.util.concurrent.atomic.AtomicBoolean cancelled = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean taskInvoked = new java.util.concurrent.atomic.AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected abstract Result doInBackground(Params... paramsArr);

    protected void onCancelled() {
    }

    protected void onPostExecute(Result result) {
    }

    protected void onPreExecute() {
    }

    protected void onProgressUpdate(Progress... progressArr) {
    }

    static {
        int iAvailableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int i = iAvailableProcessors + 1;
        CORE_POOL_SIZE = i;
        int i2 = (iAvailableProcessors * 2) + 1;
        MAXIMUM_POOL_SIZE = i2;
        java.util.concurrent.ThreadFactory threadFactory2 = new java.util.concurrent.ThreadFactory() { // from class: io.fabric.sdk.android.services.concurrency.AsyncTask.1
            private final java.util.concurrent.atomic.AtomicInteger count = new java.util.concurrent.atomic.AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                return new java.lang.Thread(runnable, "AsyncTask #" + this.count.getAndIncrement());
            }
        };
        threadFactory = threadFactory2;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue(128);
        poolWorkQueue = linkedBlockingQueue;
        THREAD_POOL_EXECUTOR = new java.util.concurrent.ThreadPoolExecutor(i, i2, 1L, java.util.concurrent.TimeUnit.SECONDS, linkedBlockingQueue, threadFactory2);
        io.fabric.sdk.android.services.concurrency.AsyncTask.SerialExecutor serialExecutor = new io.fabric.sdk.android.services.concurrency.AsyncTask.SerialExecutor();
        SERIAL_EXECUTOR = serialExecutor;
        handler = new io.fabric.sdk.android.services.concurrency.AsyncTask.InternalHandler();
        defaultExecutor = serialExecutor;
    }

    private static class SerialExecutor implements java.util.concurrent.Executor {
        java.lang.Runnable active;
        final java.util.LinkedList<java.lang.Runnable> tasks;

        private SerialExecutor() {
            this.tasks = new java.util.LinkedList<>();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final java.lang.Runnable runnable) {
            this.tasks.offer(new java.lang.Runnable() { // from class: io.fabric.sdk.android.services.concurrency.AsyncTask.SerialExecutor.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        io.fabric.sdk.android.services.concurrency.AsyncTask.SerialExecutor.this.scheduleNext();
                    }
                }
            });
            if (this.active == null) {
                scheduleNext();
            }
        }

        protected synchronized void scheduleNext() {
            java.lang.Runnable runnablePoll = this.tasks.poll();
            this.active = runnablePoll;
            if (runnablePoll != null) {
                io.fabric.sdk.android.services.concurrency.AsyncTask.THREAD_POOL_EXECUTOR.execute(this.active);
            }
        }
    }

    public static void init() {
        handler.getLooper();
    }

    public static void setDefaultExecutor(java.util.concurrent.Executor executor) {
        defaultExecutor = executor;
    }

    public AsyncTask() {
        io.fabric.sdk.android.services.concurrency.AsyncTask.WorkerRunnable<Params, Result> workerRunnable = new io.fabric.sdk.android.services.concurrency.AsyncTask.WorkerRunnable<Params, Result>() { // from class: io.fabric.sdk.android.services.concurrency.AsyncTask.2
            @Override // java.util.concurrent.Callable
            public Result call() throws java.lang.Exception {
                io.fabric.sdk.android.services.concurrency.AsyncTask.this.taskInvoked.set(true);
                android.os.Process.setThreadPriority(10);
                io.fabric.sdk.android.services.concurrency.AsyncTask asyncTask = io.fabric.sdk.android.services.concurrency.AsyncTask.this;
                return (Result) asyncTask.postResult(asyncTask.doInBackground(this.params));
            }
        };
        this.worker = workerRunnable;
        this.future = new java.util.concurrent.FutureTask<Result>(workerRunnable) { // from class: io.fabric.sdk.android.services.concurrency.AsyncTask.3
            @Override // java.util.concurrent.FutureTask
            protected void done() {
                try {
                    io.fabric.sdk.android.services.concurrency.AsyncTask.this.postResultIfNotInvoked(get());
                } catch (java.lang.InterruptedException e) {
                    android.util.Log.w(io.fabric.sdk.android.services.concurrency.AsyncTask.LOG_TAG, e);
                } catch (java.util.concurrent.CancellationException unused) {
                    io.fabric.sdk.android.services.concurrency.AsyncTask.this.postResultIfNotInvoked(null);
                } catch (java.util.concurrent.ExecutionException e2) {
                    throw new java.lang.RuntimeException("An error occured while executing doInBackground()", e2.getCause());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postResultIfNotInvoked(Result result) {
        if (this.taskInvoked.get()) {
            return;
        }
        postResult(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Result postResult(Result result) {
        handler.obtainMessage(1, new io.fabric.sdk.android.services.concurrency.AsyncTask.AsyncTaskResult(this, result)).sendToTarget();
        return result;
    }

    public final io.fabric.sdk.android.services.concurrency.AsyncTask.Status getStatus() {
        return this.status;
    }

    protected void onCancelled(Result result) {
        onCancelled();
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final boolean cancel(boolean z) {
        this.cancelled.set(true);
        return this.future.cancel(z);
    }

    public final Result get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return this.future.get();
    }

    public final Result get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return this.future.get(j, timeUnit);
    }

    public final io.fabric.sdk.android.services.concurrency.AsyncTask<Params, Progress, Result> execute(Params... paramsArr) {
        return executeOnExecutor(defaultExecutor, paramsArr);
    }

    /* JADX INFO: renamed from: io.fabric.sdk.android.services.concurrency.AsyncTask$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status;

        static {
            int[] iArr = new int[io.fabric.sdk.android.services.concurrency.AsyncTask.Status.values().length];
            $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status = iArr;
            try {
                iArr[io.fabric.sdk.android.services.concurrency.AsyncTask.Status.RUNNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[io.fabric.sdk.android.services.concurrency.AsyncTask.Status.FINISHED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public final io.fabric.sdk.android.services.concurrency.AsyncTask<Params, Progress, Result> executeOnExecutor(java.util.concurrent.Executor executor, Params... paramsArr) {
        if (this.status != io.fabric.sdk.android.services.concurrency.AsyncTask.Status.PENDING) {
            int i = io.fabric.sdk.android.services.concurrency.AsyncTask.AnonymousClass4.$SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[this.status.ordinal()];
            if (i == 1) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.status = io.fabric.sdk.android.services.concurrency.AsyncTask.Status.RUNNING;
        onPreExecute();
        this.worker.params = paramsArr;
        executor.execute(this.future);
        return this;
    }

    public static void execute(java.lang.Runnable runnable) {
        defaultExecutor.execute(runnable);
    }

    protected final void publishProgress(Progress... progressArr) {
        if (isCancelled()) {
            return;
        }
        handler.obtainMessage(2, new io.fabric.sdk.android.services.concurrency.AsyncTask.AsyncTaskResult(this, progressArr)).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish(Result result) {
        if (isCancelled()) {
            onCancelled(result);
        } else {
            onPostExecute(result);
        }
        this.status = io.fabric.sdk.android.services.concurrency.AsyncTask.Status.FINISHED;
    }

    private static class InternalHandler extends android.os.Handler {
        public InternalHandler() {
            super(android.os.Looper.getMainLooper());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            io.fabric.sdk.android.services.concurrency.AsyncTask.AsyncTaskResult asyncTaskResult = (io.fabric.sdk.android.services.concurrency.AsyncTask.AsyncTaskResult) message.obj;
            int i = message.what;
            if (i == 1) {
                asyncTaskResult.task.finish(asyncTaskResult.data[0]);
            } else {
                if (i != 2) {
                    return;
                }
                asyncTaskResult.task.onProgressUpdate(asyncTaskResult.data);
            }
        }
    }

    private static abstract class WorkerRunnable<Params, Result> implements java.util.concurrent.Callable<Result> {
        Params[] params;

        private WorkerRunnable() {
        }
    }

    private static class AsyncTaskResult<Data> {
        final Data[] data;
        final io.fabric.sdk.android.services.concurrency.AsyncTask task;

        AsyncTaskResult(io.fabric.sdk.android.services.concurrency.AsyncTask asyncTask, Data... dataArr) {
            this.task = asyncTask;
            this.data = dataArr;
        }
    }
}
