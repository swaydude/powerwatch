package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeFilterSingle<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.functions.Predicate<? super T> predicate;
    final io.reactivex.SingleSource<T> source;

    public MaybeFilterSingle(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Predicate<? super T> predicate) {
        this.source = singleSource;
        this.predicate = predicate;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeFilterSingle.FilterMaybeObserver(maybeObserver, this.predicate));
    }

    static final class FilterMaybeObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> downstream;
        final io.reactivex.functions.Predicate<? super T> predicate;
        io.reactivex.disposables.Disposable upstream;

        FilterMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.Predicate<? super T> predicate) {
            this.downstream = maybeObserver;
            this.predicate = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.disposables.Disposable disposable = this.upstream;
            this.upstream = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            try {
                if (this.predicate.test(t)) {
                    this.downstream.onSuccess(t);
                } else {
                    this.downstream.onComplete();
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.downstream.onError(th);
        }
    }
}
