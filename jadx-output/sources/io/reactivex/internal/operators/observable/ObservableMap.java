package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableMap<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super T, ? extends U> function;

    public ObservableMap(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends U> function) {
        super(observableSource);
        this.function = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super U> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableMap.MapObserver(observer, this.function));
    }

    static final class MapObserver<T, U> extends io.reactivex.internal.observers.BasicFuseableObserver<T, U> {
        final io.reactivex.functions.Function<? super T, ? extends U> mapper;

        MapObserver(io.reactivex.Observer<? super U> observer, io.reactivex.functions.Function<? super T, ? extends U> function) {
            super(observer);
            this.mapper = function;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.downstream.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                fail(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public U poll() throws java.lang.Exception {
            T tPoll = this.qd.poll();
            if (tPoll != null) {
                return (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}
