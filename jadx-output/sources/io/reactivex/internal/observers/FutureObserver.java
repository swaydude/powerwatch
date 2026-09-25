package io.reactivex.internal.observers;

/* JADX INFO: loaded from: classes2.dex */
public final class FutureObserver<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.Observer<T>, java.util.concurrent.Future<T>, io.reactivex.disposables.Disposable {
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream;
    T value;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    public FutureObserver() {
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

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.setOnce(this.upstream, disposable);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (this.value != null) {
            this.upstream.get().dispose();
            onError(new java.lang.IndexOutOfBoundsException("More than one element received"));
        } else {
            this.value = t;
        }
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        io.reactivex.disposables.Disposable disposable;
        if (this.error == null) {
            this.error = th;
            do {
                disposable = this.upstream.get();
                if (disposable == this || disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                }
            } while (!this.upstream.compareAndSet(disposable, this));
            countDown();
            return;
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        io.reactivex.disposables.Disposable disposable;
        if (this.value == null) {
            onError(new java.util.NoSuchElementException("The source is empty"));
            return;
        }
        do {
            disposable = this.upstream.get();
            if (disposable == this || disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
        } while (!this.upstream.compareAndSet(disposable, this));
        countDown();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return isDone();
    }
}
