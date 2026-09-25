package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybePeek<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Action onAfterTerminate;
    final io.reactivex.functions.Action onCompleteCall;
    final io.reactivex.functions.Action onDisposeCall;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onErrorCall;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribeCall;
    final io.reactivex.functions.Consumer<? super T> onSuccessCall;

    public MaybePeek(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer, io.reactivex.functions.Consumer<? super T> consumer2, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer3, io.reactivex.functions.Action action, io.reactivex.functions.Action action2, io.reactivex.functions.Action action3) {
        super(maybeSource);
        this.onSubscribeCall = consumer;
        this.onSuccessCall = consumer2;
        this.onErrorCall = consumer3;
        this.onCompleteCall = action;
        this.onAfterTerminate = action2;
        this.onDisposeCall = action3;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybePeek.MaybePeekObserver(maybeObserver, this));
    }

    static final class MaybePeekObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> downstream;
        final io.reactivex.internal.operators.maybe.MaybePeek<T> parent;
        io.reactivex.disposables.Disposable upstream;

        MaybePeekObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.internal.operators.maybe.MaybePeek<T> maybePeek) {
            this.downstream = maybeObserver;
            this.parent = maybePeek;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            try {
                this.parent.onDisposeCall.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            this.upstream.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                try {
                    this.parent.onSubscribeCall.accept(disposable);
                    this.upstream = disposable;
                    this.downstream.onSubscribe(this);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, this.downstream);
                }
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            if (this.upstream == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                this.parent.onSuccessCall.accept(t);
                this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
                this.downstream.onSuccess(t);
                onAfterTerminate();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onErrorInner(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            if (this.upstream == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                onErrorInner(th);
            }
        }

        void onErrorInner(java.lang.Throwable th) {
            try {
                this.parent.onErrorCall.accept(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.downstream.onError(th);
            onAfterTerminate();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.upstream == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                this.parent.onCompleteCall.run();
                this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
                this.downstream.onComplete();
                onAfterTerminate();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onErrorInner(th);
            }
        }

        void onAfterTerminate() {
            try {
                this.parent.onAfterTerminate.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
