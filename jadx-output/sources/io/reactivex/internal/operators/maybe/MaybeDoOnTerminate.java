package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeDoOnTerminate<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.functions.Action onTerminate;
    final io.reactivex.MaybeSource<T> source;

    public MaybeDoOnTerminate(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Action action) {
        this.source = maybeSource;
        this.onTerminate = action;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeDoOnTerminate.DoOnTerminate(maybeObserver));
    }

    final class DoOnTerminate implements io.reactivex.MaybeObserver<T> {
        final io.reactivex.MaybeObserver<? super T> downstream;

        DoOnTerminate(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.downstream.onSubscribe(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                io.reactivex.internal.operators.maybe.MaybeDoOnTerminate.this.onTerminate.run();
                this.downstream.onSuccess(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            try {
                io.reactivex.internal.operators.maybe.MaybeDoOnTerminate.this.onTerminate.run();
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            try {
                io.reactivex.internal.operators.maybe.MaybeDoOnTerminate.this.onTerminate.run();
                this.downstream.onComplete();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }
    }
}
