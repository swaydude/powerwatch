package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeDoAfterSuccess<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Consumer<? super T> onAfterSuccess;

    public MaybeDoAfterSuccess(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Consumer<? super T> consumer) {
        super(maybeSource);
        this.onAfterSuccess = consumer;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeDoAfterSuccess.DoAfterObserver(maybeObserver, this.onAfterSuccess));
    }

    static final class DoAfterObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> downstream;
        final io.reactivex.functions.Consumer<? super T> onAfterSuccess;
        io.reactivex.disposables.Disposable upstream;

        DoAfterObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.Consumer<? super T> consumer) {
            this.downstream = maybeObserver;
            this.onAfterSuccess = consumer;
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
            try {
                this.onAfterSuccess.accept(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }
    }
}
