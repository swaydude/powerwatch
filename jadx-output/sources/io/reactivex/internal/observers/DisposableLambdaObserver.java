package io.reactivex.internal.observers;

/* JADX INFO: loaded from: classes2.dex */
public final class DisposableLambdaObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    final io.reactivex.Observer<? super T> downstream;
    final io.reactivex.functions.Action onDispose;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;
    io.reactivex.disposables.Disposable upstream;

    public DisposableLambdaObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer, io.reactivex.functions.Action action) {
        this.downstream = observer;
        this.onSubscribe = consumer;
        this.onDispose = action;
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        try {
            this.onSubscribe.accept(disposable);
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            disposable.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.internal.disposables.EmptyDisposable.error(th, this.downstream);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        if (this.upstream != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        } else {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.upstream != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.downstream.onComplete();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        io.reactivex.disposables.Disposable disposable = this.upstream;
        if (disposable != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            try {
                this.onDispose.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            disposable.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }
}
