package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableTimeout extends io.reactivex.Completable {
    final io.reactivex.CompletableSource other;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.CompletableSource source;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public CompletableTimeout(io.reactivex.CompletableSource completableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, io.reactivex.CompletableSource completableSource2) {
        this.source = completableSource;
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.other = completableSource2;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        compositeDisposable.add(this.scheduler.scheduleDirect(new io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask(atomicBoolean, compositeDisposable, completableObserver), this.timeout, this.unit));
        this.source.subscribe(new io.reactivex.internal.operators.completable.CompletableTimeout.TimeOutObserver(compositeDisposable, atomicBoolean, completableObserver));
    }

    static final class TimeOutObserver implements io.reactivex.CompletableObserver {
        private final io.reactivex.CompletableObserver downstream;
        private final java.util.concurrent.atomic.AtomicBoolean once;
        private final io.reactivex.disposables.CompositeDisposable set;

        TimeOutObserver(io.reactivex.disposables.CompositeDisposable compositeDisposable, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, io.reactivex.CompletableObserver completableObserver) {
            this.set = compositeDisposable;
            this.once = atomicBoolean;
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.set.add(disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            if (this.once.compareAndSet(false, true)) {
                this.set.dispose();
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.once.compareAndSet(false, true)) {
                this.set.dispose();
                this.downstream.onComplete();
            }
        }
    }

    final class DisposeTask implements java.lang.Runnable {
        final io.reactivex.CompletableObserver downstream;
        private final java.util.concurrent.atomic.AtomicBoolean once;
        final io.reactivex.disposables.CompositeDisposable set;

        DisposeTask(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, io.reactivex.disposables.CompositeDisposable compositeDisposable, io.reactivex.CompletableObserver completableObserver) {
            this.once = atomicBoolean;
            this.set = compositeDisposable;
            this.downstream = completableObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.set.clear();
                if (io.reactivex.internal.operators.completable.CompletableTimeout.this.other == null) {
                    this.downstream.onError(new java.util.concurrent.TimeoutException(io.reactivex.internal.util.ExceptionHelper.timeoutMessage(io.reactivex.internal.operators.completable.CompletableTimeout.this.timeout, io.reactivex.internal.operators.completable.CompletableTimeout.this.unit)));
                } else {
                    io.reactivex.internal.operators.completable.CompletableTimeout.this.other.subscribe(new io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.DisposeObserver());
                }
            }
        }

        final class DisposeObserver implements io.reactivex.CompletableObserver {
            DisposeObserver() {
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.this.set.add(disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.this.set.dispose();
                io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.this.downstream.onError(th);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.this.set.dispose();
                io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.this.downstream.onComplete();
            }
        }
    }
}
