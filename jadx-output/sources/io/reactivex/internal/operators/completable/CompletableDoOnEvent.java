package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableDoOnEvent extends io.reactivex.Completable {
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onEvent;
    final io.reactivex.CompletableSource source;

    public CompletableDoOnEvent(io.reactivex.CompletableSource completableSource, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer) {
        this.source = completableSource;
        this.onEvent = consumer;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletableDoOnEvent.DoOnEvent(completableObserver));
    }

    final class DoOnEvent implements io.reactivex.CompletableObserver {
        private final io.reactivex.CompletableObserver observer;

        DoOnEvent(io.reactivex.CompletableObserver completableObserver) {
            this.observer = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            try {
                io.reactivex.internal.operators.completable.CompletableDoOnEvent.this.onEvent.accept(null);
                this.observer.onComplete();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.observer.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            try {
                io.reactivex.internal.operators.completable.CompletableDoOnEvent.this.onEvent.accept(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.observer.onError(th);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }
    }
}
