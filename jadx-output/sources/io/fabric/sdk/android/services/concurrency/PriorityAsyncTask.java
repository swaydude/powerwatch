package io.fabric.sdk.android.services.concurrency;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PriorityAsyncTask<Params, Progress, Result> extends io.fabric.sdk.android.services.concurrency.AsyncTask<Params, Progress, Result> implements io.fabric.sdk.android.services.concurrency.Dependency<io.fabric.sdk.android.services.concurrency.Task>, io.fabric.sdk.android.services.concurrency.PriorityProvider, io.fabric.sdk.android.services.concurrency.Task, io.fabric.sdk.android.services.concurrency.DelegateProvider {
    private final io.fabric.sdk.android.services.concurrency.PriorityTask priorityTask = new io.fabric.sdk.android.services.concurrency.PriorityTask();

    public final void executeOnExecutor(java.util.concurrent.ExecutorService executorService, Params... paramsArr) {
        super.executeOnExecutor(new io.fabric.sdk.android.services.concurrency.PriorityAsyncTask.ProxyExecutor(executorService, this), paramsArr);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return io.fabric.sdk.android.services.concurrency.Priority.compareTo(this, obj);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public void addDependency(io.fabric.sdk.android.services.concurrency.Task task) {
        if (getStatus() != io.fabric.sdk.android.services.concurrency.AsyncTask.Status.PENDING) {
            throw new java.lang.IllegalStateException("Must not add Dependency after task is running");
        }
        ((io.fabric.sdk.android.services.concurrency.Dependency) ((io.fabric.sdk.android.services.concurrency.PriorityProvider) getDelegate())).addDependency(task);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public java.util.Collection<io.fabric.sdk.android.services.concurrency.Task> getDependencies() {
        return ((io.fabric.sdk.android.services.concurrency.Dependency) ((io.fabric.sdk.android.services.concurrency.PriorityProvider) getDelegate())).getDependencies();
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public boolean areDependenciesMet() {
        return ((io.fabric.sdk.android.services.concurrency.Dependency) ((io.fabric.sdk.android.services.concurrency.PriorityProvider) getDelegate())).areDependenciesMet();
    }

    public io.fabric.sdk.android.services.concurrency.Priority getPriority() {
        return ((io.fabric.sdk.android.services.concurrency.PriorityProvider) getDelegate()).getPriority();
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public void setFinished(boolean z) {
        ((io.fabric.sdk.android.services.concurrency.Task) ((io.fabric.sdk.android.services.concurrency.PriorityProvider) getDelegate())).setFinished(z);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public boolean isFinished() {
        return ((io.fabric.sdk.android.services.concurrency.Task) ((io.fabric.sdk.android.services.concurrency.PriorityProvider) getDelegate())).isFinished();
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public void setError(java.lang.Throwable th) {
        ((io.fabric.sdk.android.services.concurrency.Task) ((io.fabric.sdk.android.services.concurrency.PriorityProvider) getDelegate())).setError(th);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public java.lang.Throwable getError() {
        return ((io.fabric.sdk.android.services.concurrency.Task) ((io.fabric.sdk.android.services.concurrency.PriorityProvider) getDelegate())).getError();
    }

    /* JADX WARN: Incorrect return type in method signature: <T::Lio/fabric/sdk/android/services/concurrency/Dependency<Lio/fabric/sdk/android/services/concurrency/Task;>;:Lio/fabric/sdk/android/services/concurrency/PriorityProvider;:Lio/fabric/sdk/android/services/concurrency/Task;>()TT; */
    @Override // io.fabric.sdk.android.services.concurrency.DelegateProvider
    public io.fabric.sdk.android.services.concurrency.Dependency getDelegate() {
        return this.priorityTask;
    }

    private static class ProxyExecutor<Result> implements java.util.concurrent.Executor {
        private final java.util.concurrent.Executor executor;
        private final io.fabric.sdk.android.services.concurrency.PriorityAsyncTask task;

        public ProxyExecutor(java.util.concurrent.Executor executor, io.fabric.sdk.android.services.concurrency.PriorityAsyncTask priorityAsyncTask) {
            this.executor = executor;
            this.task = priorityAsyncTask;
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            this.executor.execute(new io.fabric.sdk.android.services.concurrency.PriorityFutureTask<Result>(runnable, null) { // from class: io.fabric.sdk.android.services.concurrency.PriorityAsyncTask.ProxyExecutor.1
                /* JADX WARN: Incorrect return type in method signature: <T::Lio/fabric/sdk/android/services/concurrency/Dependency<Lio/fabric/sdk/android/services/concurrency/Task;>;:Lio/fabric/sdk/android/services/concurrency/PriorityProvider;:Lio/fabric/sdk/android/services/concurrency/Task;>()TT; */
                @Override // io.fabric.sdk.android.services.concurrency.PriorityFutureTask, io.fabric.sdk.android.services.concurrency.DelegateProvider
                public io.fabric.sdk.android.services.concurrency.Dependency getDelegate() {
                    return io.fabric.sdk.android.services.concurrency.PriorityAsyncTask.ProxyExecutor.this.task;
                }
            });
        }
    }
}
