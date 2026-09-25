package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeEqualSingle<T> extends io.reactivex.Single<java.lang.Boolean> {
    final io.reactivex.functions.BiPredicate<? super T, ? super T> isEqual;
    final io.reactivex.MaybeSource<? extends T> source1;
    final io.reactivex.MaybeSource<? extends T> source2;

    public MaybeEqualSingle(io.reactivex.MaybeSource<? extends T> maybeSource, io.reactivex.MaybeSource<? extends T> maybeSource2, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate) {
        this.source1 = maybeSource;
        this.source2 = maybeSource2;
        this.isEqual = biPredicate;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualCoordinator equalCoordinator = new io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualCoordinator(singleObserver, this.isEqual);
        singleObserver.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe(this.source1, this.source2);
    }

    static final class EqualCoordinator<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super java.lang.Boolean> downstream;
        final io.reactivex.functions.BiPredicate<? super T, ? super T> isEqual;
        final io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<T> observer1;
        final io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<T> observer2;

        EqualCoordinator(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate) {
            super(2);
            this.downstream = singleObserver;
            this.isEqual = biPredicate;
            this.observer1 = new io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<>(this);
            this.observer2 = new io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<>(this);
        }

        void subscribe(io.reactivex.MaybeSource<? extends T> maybeSource, io.reactivex.MaybeSource<? extends T> maybeSource2) {
            maybeSource.subscribe(this.observer1);
            maybeSource2.subscribe(this.observer2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.observer1.dispose();
            this.observer2.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.observer1.get());
        }

        void done() {
            if (decrementAndGet() == 0) {
                java.lang.Object obj = this.observer1.value;
                java.lang.Object obj2 = this.observer2.value;
                if (obj != null && obj2 != null) {
                    try {
                        this.downstream.onSuccess(java.lang.Boolean.valueOf(this.isEqual.test(obj, obj2)));
                        return;
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                this.downstream.onSuccess(java.lang.Boolean.valueOf(obj == null && obj2 == null));
            }
        }

        void error(io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<T> equalObserver, java.lang.Throwable th) {
            if (getAndSet(0) > 0) {
                io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<T> equalObserver2 = this.observer1;
                if (equalObserver == equalObserver2) {
                    this.observer2.dispose();
                } else {
                    equalObserver2.dispose();
                }
                this.downstream.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    static final class EqualObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = -3031974433025990931L;
        final io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualCoordinator<T> parent;
        java.lang.Object value;

        EqualObserver(io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualCoordinator<T> equalCoordinator) {
            this.parent = equalCoordinator;
        }

        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.value = t;
            this.parent.done();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable th) {
            this.parent.error(this, th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.parent.done();
        }
    }
}
