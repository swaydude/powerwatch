package io.fabric.sdk.android.services.concurrency;

/* JADX INFO: loaded from: classes2.dex */
public class PriorityFutureTask<V> extends java.util.concurrent.FutureTask<V> implements io.fabric.sdk.android.services.concurrency.Dependency<io.fabric.sdk.android.services.concurrency.Task>, io.fabric.sdk.android.services.concurrency.PriorityProvider, io.fabric.sdk.android.services.concurrency.Task, io.fabric.sdk.android.services.concurrency.DelegateProvider {
    final java.lang.Object delegate;

    public PriorityFutureTask(java.util.concurrent.Callable<V> callable) {
        super(callable);
        this.delegate = checkAndInitDelegate(callable);
    }

    public PriorityFutureTask(java.lang.Runnable runnable, V v) {
        super(runnable, v);
        this.delegate = checkAndInitDelegate(runnable);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return ((io.fabric.sdk.android.services.concurrency.PriorityProvider) getDelegate()).compareTo(obj);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public void addDependency(io.fabric.sdk.android.services.concurrency.Task task) {
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

    @Override // io.fabric.sdk.android.services.concurrency.PriorityProvider
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
    public io.fabric.sdk.android.services.concurrency.Dependency getDelegate() {
        return (io.fabric.sdk.android.services.concurrency.Dependency) this.delegate;
    }

    /* JADX WARN: Incorrect return type in method signature: <T::Lio/fabric/sdk/android/services/concurrency/Dependency<Lio/fabric/sdk/android/services/concurrency/Task;>;:Lio/fabric/sdk/android/services/concurrency/PriorityProvider;:Lio/fabric/sdk/android/services/concurrency/Task;>(Ljava/lang/Object;)TT; */
    protected io.fabric.sdk.android.services.concurrency.Dependency checkAndInitDelegate(java.lang.Object obj) {
        if (io.fabric.sdk.android.services.concurrency.PriorityTask.isProperDelegate(obj)) {
            return (io.fabric.sdk.android.services.concurrency.Dependency) obj;
        }
        return new io.fabric.sdk.android.services.concurrency.PriorityTask();
    }
}
