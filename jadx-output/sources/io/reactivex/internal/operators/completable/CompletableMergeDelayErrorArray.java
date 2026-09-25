package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableMergeDelayErrorArray extends io.reactivex.Completable {
    final io.reactivex.CompletableSource[] sources;

    public CompletableMergeDelayErrorArray(io.reactivex.CompletableSource[] completableSourceArr) {
        this.sources = completableSourceArr;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(this.sources.length + 1);
        io.reactivex.internal.util.AtomicThrowable atomicThrowable = new io.reactivex.internal.util.AtomicThrowable();
        completableObserver.onSubscribe(compositeDisposable);
        for (io.reactivex.CompletableSource completableSource : this.sources) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource == null) {
                atomicThrowable.addThrowable(new java.lang.NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completableSource.subscribe(new io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray.MergeInnerCompletableObserver(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            java.lang.Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate == null) {
                completableObserver.onComplete();
            } else {
                completableObserver.onError(thTerminate);
            }
        }
    }

    static final class MergeInnerCompletableObserver implements io.reactivex.CompletableObserver {
        final io.reactivex.CompletableObserver downstream;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.disposables.CompositeDisposable set;
        final java.util.concurrent.atomic.AtomicInteger wip;

        MergeInnerCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.disposables.CompositeDisposable compositeDisposable, io.reactivex.internal.util.AtomicThrowable atomicThrowable, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
            this.downstream = completableObserver;
            this.set = compositeDisposable;
            this.error = atomicThrowable;
            this.wip = atomicInteger;
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.set.add(disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            if (this.error.addThrowable(th)) {
                tryTerminate();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            tryTerminate();
        }

        void tryTerminate() {
            if (this.wip.decrementAndGet() == 0) {
                java.lang.Throwable thTerminate = this.error.terminate();
                if (thTerminate == null) {
                    this.downstream.onComplete();
                } else {
                    this.downstream.onError(thTerminate);
                }
            }
        }
    }
}
