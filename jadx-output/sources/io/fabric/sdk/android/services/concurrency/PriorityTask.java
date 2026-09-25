package io.fabric.sdk.android.services.concurrency;

/* JADX INFO: loaded from: classes2.dex */
public class PriorityTask implements io.fabric.sdk.android.services.concurrency.Dependency<io.fabric.sdk.android.services.concurrency.Task>, io.fabric.sdk.android.services.concurrency.PriorityProvider, io.fabric.sdk.android.services.concurrency.Task {
    private final java.util.List<io.fabric.sdk.android.services.concurrency.Task> dependencies = new java.util.ArrayList();
    private final java.util.concurrent.atomic.AtomicBoolean hasRun = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> throwable = new java.util.concurrent.atomic.AtomicReference<>(null);

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public synchronized java.util.Collection<io.fabric.sdk.android.services.concurrency.Task> getDependencies() {
        return java.util.Collections.unmodifiableCollection(this.dependencies);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public synchronized void addDependency(io.fabric.sdk.android.services.concurrency.Task task) {
        this.dependencies.add(task);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Dependency
    public boolean areDependenciesMet() {
        java.util.Iterator<io.fabric.sdk.android.services.concurrency.Task> it = getDependencies().iterator();
        while (it.hasNext()) {
            if (!it.next().isFinished()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public synchronized void setFinished(boolean z) {
        this.hasRun.set(z);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public boolean isFinished() {
        return this.hasRun.get();
    }

    public io.fabric.sdk.android.services.concurrency.Priority getPriority() {
        return io.fabric.sdk.android.services.concurrency.Priority.NORMAL;
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public void setError(java.lang.Throwable th) {
        this.throwable.set(th);
    }

    @Override // io.fabric.sdk.android.services.concurrency.Task
    public java.lang.Throwable getError() {
        return this.throwable.get();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return io.fabric.sdk.android.services.concurrency.Priority.compareTo(this, obj);
    }

    public static boolean isProperDelegate(java.lang.Object obj) {
        try {
            return (((io.fabric.sdk.android.services.concurrency.Dependency) obj) == null || ((io.fabric.sdk.android.services.concurrency.Task) obj) == null || ((io.fabric.sdk.android.services.concurrency.PriorityProvider) obj) == null) ? false : true;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }
}
