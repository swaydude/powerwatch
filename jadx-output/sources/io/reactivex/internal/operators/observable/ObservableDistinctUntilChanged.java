package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableDistinctUntilChanged<T, K> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.BiPredicate<? super K, ? super K> comparer;
    final io.reactivex.functions.Function<? super T, K> keySelector;

    public ObservableDistinctUntilChanged(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, K> function, io.reactivex.functions.BiPredicate<? super K, ? super K> biPredicate) {
        super(observableSource);
        this.keySelector = function;
        this.comparer = biPredicate;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged.DistinctUntilChangedObserver(observer, this.keySelector, this.comparer));
    }

    static final class DistinctUntilChangedObserver<T, K> extends io.reactivex.internal.observers.BasicFuseableObserver<T, T> {
        final io.reactivex.functions.BiPredicate<? super K, ? super K> comparer;
        boolean hasValue;
        final io.reactivex.functions.Function<? super T, K> keySelector;
        K last;

        DistinctUntilChangedObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, K> function, io.reactivex.functions.BiPredicate<? super K, ? super K> biPredicate) {
            super(observer);
            this.keySelector = function;
            this.comparer = biPredicate;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext((java.lang.Object) t);
                return;
            }
            try {
                K kApply = this.keySelector.apply(t);
                if (this.hasValue) {
                    boolean zTest = this.comparer.test(this.last, kApply);
                    this.last = kApply;
                    if (zTest) {
                        return;
                    }
                } else {
                    this.hasValue = true;
                    this.last = kApply;
                }
                this.downstream.onNext((java.lang.Object) t);
            } catch (java.lang.Throwable th) {
                fail(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
            while (true) {
                T tPoll = this.qd.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.keySelector.apply(tPoll);
                if (!this.hasValue) {
                    this.hasValue = true;
                    this.last = kApply;
                    return tPoll;
                }
                if (!this.comparer.test(this.last, kApply)) {
                    this.last = kApply;
                    return tPoll;
                }
                this.last = kApply;
            }
        }
    }
}
