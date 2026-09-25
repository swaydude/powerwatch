package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableOnErrorComplete extends io.reactivex.Completable {
    final io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate;
    final io.reactivex.CompletableSource source;

    public CompletableOnErrorComplete(io.reactivex.CompletableSource completableSource, io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate) {
        this.source = completableSource;
        this.predicate = predicate;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletableOnErrorComplete.OnError(completableObserver));
    }

    final class OnError implements io.reactivex.CompletableObserver {
        private final io.reactivex.CompletableObserver downstream;

        OnError(io.reactivex.CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            try {
                if (io.reactivex.internal.operators.completable.CompletableOnErrorComplete.this.predicate.test(th)) {
                    this.downstream.onComplete();
                } else {
                    this.downstream.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.downstream.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.downstream.onSubscribe(disposable);
        }
    }
}
