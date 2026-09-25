package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableConcatArray extends io.reactivex.Completable {
    final io.reactivex.CompletableSource[] sources;

    public CompletableConcatArray(io.reactivex.CompletableSource[] completableSourceArr) {
        this.sources = completableSourceArr;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.completable.CompletableConcatArray.ConcatInnerObserver concatInnerObserver = new io.reactivex.internal.operators.completable.CompletableConcatArray.ConcatInnerObserver(completableObserver, this.sources);
        completableObserver.onSubscribe(concatInnerObserver.sd);
        concatInnerObserver.next();
    }

    static final class ConcatInnerObserver extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.CompletableObserver {
        private static final long serialVersionUID = -7965400327305809232L;
        final io.reactivex.CompletableObserver downstream;
        int index;
        final io.reactivex.internal.disposables.SequentialDisposable sd = new io.reactivex.internal.disposables.SequentialDisposable();
        final io.reactivex.CompletableSource[] sources;

        ConcatInnerObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.CompletableSource[] completableSourceArr) {
            this.downstream = completableObserver;
            this.sources = completableSourceArr;
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.sd.replace(disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            next();
        }

        void next() {
            if (!this.sd.isDisposed() && getAndIncrement() == 0) {
                io.reactivex.CompletableSource[] completableSourceArr = this.sources;
                while (!this.sd.isDisposed()) {
                    int i = this.index;
                    this.index = i + 1;
                    if (i == completableSourceArr.length) {
                        this.downstream.onComplete();
                        return;
                    } else {
                        completableSourceArr[i].subscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
