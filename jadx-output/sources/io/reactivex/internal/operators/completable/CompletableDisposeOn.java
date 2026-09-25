package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableDisposeOn extends io.reactivex.Completable {
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.CompletableSource source;

    public CompletableDisposeOn(io.reactivex.CompletableSource completableSource, io.reactivex.Scheduler scheduler) {
        this.source = completableSource;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletableDisposeOn.DisposeOnObserver(completableObserver, this.scheduler));
    }

    static final class DisposeOnObserver implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable, java.lang.Runnable {
        volatile boolean disposed;
        final io.reactivex.CompletableObserver downstream;
        final io.reactivex.Scheduler scheduler;
        io.reactivex.disposables.Disposable upstream;

        DisposeOnObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.Scheduler scheduler) {
            this.downstream = completableObserver;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.disposed) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            if (this.disposed) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.scheduler.scheduleDirect(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.upstream.dispose();
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }
}
