package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableMergeDelayErrorIterable extends io.reactivex.Completable {
    final java.lang.Iterable<? extends io.reactivex.CompletableSource> sources;

    public CompletableMergeDelayErrorIterable(java.lang.Iterable<? extends io.reactivex.CompletableSource> iterable) {
        this.sources = iterable;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        try {
            java.util.Iterator it = (java.util.Iterator) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.sources.iterator(), "The source iterator returned is null");
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(1);
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = new io.reactivex.internal.util.AtomicThrowable();
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (it.hasNext()) {
                        if (compositeDisposable.isDisposed()) {
                            return;
                        }
                        try {
                            io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
                            if (compositeDisposable.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            completableSource.subscribe(new io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray.MergeInnerCompletableObserver(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            atomicThrowable.addThrowable(th);
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    atomicThrowable.addThrowable(th2);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    java.lang.Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate == null) {
                        completableObserver.onComplete();
                        return;
                    } else {
                        completableObserver.onError(thTerminate);
                        return;
                    }
                }
                return;
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            completableObserver.onError(th3);
        }
    }
}
