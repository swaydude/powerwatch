package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeDelayWithCompletable<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.CompletableSource other;
    final io.reactivex.MaybeSource<T> source;

    public MaybeDelayWithCompletable(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.CompletableSource completableSource) {
        this.source = maybeSource;
        this.other = completableSource;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.other.subscribe(new io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable.OtherObserver(maybeObserver, this.source));
    }

    static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 703409937383992161L;
        final io.reactivex.MaybeObserver<? super T> downstream;
        final io.reactivex.MaybeSource<T> source;

        OtherObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.MaybeSource<T> maybeSource) {
            this.downstream = maybeObserver;
            this.source = maybeSource;
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable.DelayWithMainObserver(this, this.downstream));
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }

    static final class DelayWithMainObserver<T> implements io.reactivex.MaybeObserver<T> {
        final io.reactivex.MaybeObserver<? super T> downstream;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> parent;

        DelayWithMainObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.parent = atomicReference;
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this.parent, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
