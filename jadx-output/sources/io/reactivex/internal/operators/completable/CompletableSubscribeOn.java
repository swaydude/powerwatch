package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableSubscribeOn extends io.reactivex.Completable {
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.CompletableSource source;

    public CompletableSubscribeOn(io.reactivex.CompletableSource completableSource, io.reactivex.Scheduler scheduler) {
        this.source = completableSource;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.completable.CompletableSubscribeOn.SubscribeOnObserver subscribeOnObserver = new io.reactivex.internal.operators.completable.CompletableSubscribeOn.SubscribeOnObserver(completableObserver, this.source);
        completableObserver.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.scheduler.scheduleDirect(subscribeOnObserver));
    }

    static final class SubscribeOnObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final io.reactivex.CompletableObserver downstream;
        final io.reactivex.CompletableSource source;
        final io.reactivex.internal.disposables.SequentialDisposable task = new io.reactivex.internal.disposables.SequentialDisposable();

        SubscribeOnObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.CompletableSource completableSource) {
            this.downstream = completableObserver;
            this.source = completableSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.subscribe(this);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
