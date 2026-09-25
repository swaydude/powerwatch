package io.reactivex.internal.observers;

/* JADX INFO: loaded from: classes2.dex */
public final class FutureSingleObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.SingleObserver<T>, java.util.concurrent.Future<T>, io.reactivex.disposables.Disposable {
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream;
    T value;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    public FutureSingleObserver() {
        super(1);
        this.upstream = new java.util.concurrent.atomic.AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        io.reactivex.disposables.Disposable disposable;
        do {
            disposable = this.upstream.get();
            if (disposable == this || disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return false;
            }
        } while (!this.upstream.compareAndSet(disposable, io.reactivex.internal.disposables.DisposableHelper.DISPOSED));
        if (disposable != null) {
            disposable.dispose();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public T get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        if (getCount() != 0) {
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new java.util.concurrent.CancellationException();
        }
        java.lang.Throwable th = this.error;
        if (th != null) {
            throw new java.util.concurrent.ExecutionException(th);
        }
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (getCount() != 0) {
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
            if (!await(j, timeUnit)) {
                throw new java.util.concurrent.TimeoutException(io.reactivex.internal.util.ExceptionHelper.timeoutMessage(j, timeUnit));
            }
        }
        if (isCancelled()) {
            throw new java.util.concurrent.CancellationException();
        }
        java.lang.Throwable th = this.error;
        if (th != null) {
            throw new java.util.concurrent.ExecutionException(th);
        }
        return this.value;
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.setOnce(this.upstream, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        io.reactivex.disposables.Disposable disposable = this.upstream.get();
        if (disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
            return;
        }
        this.value = t;
        this.upstream.compareAndSet(disposable, this);
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onError(java.lang.Throwable th) {
        io.reactivex.disposables.Disposable disposable;
        do {
            disposable = this.upstream.get();
            if (disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
        } while (!this.upstream.compareAndSet(disposable, this));
        countDown();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return isDone();
    }
}
