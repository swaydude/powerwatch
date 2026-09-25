package io.fabric.sdk.android.services.concurrency.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractFuture<V> implements java.util.concurrent.Future<V> {
    private final io.fabric.sdk.android.services.concurrency.internal.AbstractFuture.Sync<V> sync = new io.fabric.sdk.android.services.concurrency.internal.AbstractFuture.Sync<>();

    protected void interruptTask() {
    }

    protected AbstractFuture() {
    }

    static final java.util.concurrent.CancellationException cancellationExceptionWithCause(java.lang.String str, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return this.sync.get(timeUnit.toNanos(j));
    }

    @Override // java.util.concurrent.Future
    public V get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return this.sync.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.sync.isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.sync.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!this.sync.cancel(z)) {
            return false;
        }
        if (!z) {
            return true;
        }
        interruptTask();
        return true;
    }

    protected final boolean wasInterrupted() {
        return this.sync.wasInterrupted();
    }

    protected boolean set(V v) {
        return this.sync.set(v);
    }

    protected boolean setException(java.lang.Throwable th) {
        java.util.Objects.requireNonNull(th);
        return this.sync.setException(th);
    }

    static final class Sync<V> extends java.util.concurrent.locks.AbstractQueuedSynchronizer {
        static final int CANCELLED = 4;
        static final int COMPLETED = 2;
        static final int COMPLETING = 1;
        static final int INTERRUPTED = 8;
        static final int RUNNING = 0;
        private static final long serialVersionUID = 0;
        private java.lang.Throwable exception;
        private V value;

        Sync() {
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        protected int tryAcquireShared(int i) {
            return isDone() ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        protected boolean tryReleaseShared(int i) {
            setState(i);
            return true;
        }

        V get(long j) throws java.util.concurrent.ExecutionException, java.util.concurrent.CancellationException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            if (!tryAcquireSharedNanos(-1, j)) {
                throw new java.util.concurrent.TimeoutException("Timeout waiting for task.");
            }
            return getValue();
        }

        V get() throws java.util.concurrent.ExecutionException, java.util.concurrent.CancellationException, java.lang.InterruptedException {
            acquireSharedInterruptibly(-1);
            return getValue();
        }

        private V getValue() throws java.util.concurrent.ExecutionException, java.util.concurrent.CancellationException {
            int state = getState();
            if (state == 2) {
                if (this.exception != null) {
                    throw new java.util.concurrent.ExecutionException(this.exception);
                }
                return this.value;
            }
            if (state == 4 || state == 8) {
                throw io.fabric.sdk.android.services.concurrency.internal.AbstractFuture.cancellationExceptionWithCause("Task was cancelled.", this.exception);
            }
            throw new java.lang.IllegalStateException("Error, synchronizer in invalid state: " + state);
        }

        boolean isDone() {
            return (getState() & 14) != 0;
        }

        boolean isCancelled() {
            return (getState() & 12) != 0;
        }

        boolean wasInterrupted() {
            return getState() == 8;
        }

        boolean set(V v) {
            return complete(v, null, 2);
        }

        boolean setException(java.lang.Throwable th) {
            return complete(null, th, 2);
        }

        boolean cancel(boolean z) {
            return complete(null, null, z ? 8 : 4);
        }

        private boolean complete(V v, java.lang.Throwable th, int i) {
            boolean zCompareAndSetState = compareAndSetState(0, 1);
            if (zCompareAndSetState) {
                this.value = v;
                if ((i & 12) != 0) {
                    th = new java.util.concurrent.CancellationException("Future.cancel() was called.");
                }
                this.exception = th;
                releaseShared(i);
            } else if (getState() == 1) {
                acquireShared(-1);
            }
            return zCompareAndSetState;
        }
    }
}
