package io.reactivex.observers;

/* JADX INFO: loaded from: classes2.dex */
public final class SafeObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    boolean done;
    final io.reactivex.Observer<? super T> downstream;
    io.reactivex.disposables.Disposable upstream;

    public SafeObserver(io.reactivex.Observer<? super T> observer) {
        this.downstream = observer;
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            try {
                this.downstream.onSubscribe(this);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.done = true;
                try {
                    disposable.dispose();
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.upstream.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        if (this.upstream == null) {
            onNextNoSubscription();
            return;
        }
        if (t == null) {
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.upstream.dispose();
                onError(nullPointerException);
                return;
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th));
                return;
            }
        }
        try {
            this.downstream.onNext(t);
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            try {
                this.upstream.dispose();
                onError(th2);
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                onError(new io.reactivex.exceptions.CompositeException(th2, th3));
            }
        }
    }

    void onNextNoSubscription() {
        this.done = true;
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
        try {
            this.downstream.onSubscribe(io.reactivex.internal.disposables.EmptyDisposable.INSTANCE);
            try {
                this.downstream.onError(nullPointerException);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th));
            }
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th2));
        }
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        if (this.done) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.done = true;
        if (this.upstream == null) {
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
            try {
                this.downstream.onSubscribe(io.reactivex.internal.disposables.EmptyDisposable.INSTANCE);
                try {
                    this.downstream.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException));
                    return;
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException, th2));
                    return;
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException, th3));
                return;
            }
        }
        if (th == null) {
            th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.downstream.onError(th);
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th4));
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        if (this.upstream == null) {
            onCompleteNoSubscription();
            return;
        }
        try {
            this.downstream.onComplete();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    void onCompleteNoSubscription() {
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
        try {
            this.downstream.onSubscribe(io.reactivex.internal.disposables.EmptyDisposable.INSTANCE);
            try {
                this.downstream.onError(nullPointerException);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th));
            }
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th2));
        }
    }
}
