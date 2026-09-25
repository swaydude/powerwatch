package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableMap<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super T, ? extends U> mapper;

    public FlowableMap(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends U> function) {
        super(flowable);
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableMap.MapConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.mapper));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableMap.MapSubscriber(subscriber, this.mapper));
        }
    }

    static final class MapSubscriber<T, U> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, U> {
        final io.reactivex.functions.Function<? super T, ? extends U> mapper;

        MapSubscriber(org.reactivestreams.Subscriber<? super U> subscriber, io.reactivex.functions.Function<? super T, ? extends U> function) {
            super(subscriber);
            this.mapper = function;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
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
            T tPoll = this.qs.poll();
            if (tPoll != null) {
                return (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    static final class MapConditionalSubscriber<T, U> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, U> {
        final io.reactivex.functions.Function<? super T, ? extends U> mapper;

        MapConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super U> conditionalSubscriber, io.reactivex.functions.Function<? super T, ? extends U> function) {
            super(conditionalSubscriber);
            this.mapper = function;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
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

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t) {
            if (this.done) {
                return false;
            }
            try {
                return this.downstream.tryOnNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                fail(th);
                return true;
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public U poll() throws java.lang.Exception {
            T tPoll = this.qs.poll();
            if (tPoll != null) {
                return (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}
