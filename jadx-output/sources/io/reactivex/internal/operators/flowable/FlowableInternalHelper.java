package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableInternalHelper {
    private FlowableInternalHelper() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    static final class SimpleGenerator<T, S> implements io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> {
        final io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> consumer;

        SimpleGenerator(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> consumer) {
            this.consumer = consumer;
        }

        @Override // io.reactivex.functions.BiFunction
        public S apply(S s, io.reactivex.Emitter<T> emitter) throws java.lang.Exception {
            this.consumer.accept(emitter);
            return s;
        }
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleGenerator(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> consumer) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.SimpleGenerator(consumer);
    }

    static final class SimpleBiGenerator<T, S> implements io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> {
        final io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> consumer;

        SimpleBiGenerator(io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> biConsumer) {
            this.consumer = biConsumer;
        }

        @Override // io.reactivex.functions.BiFunction
        public S apply(S s, io.reactivex.Emitter<T> emitter) throws java.lang.Exception {
            this.consumer.accept(s, emitter);
            return s;
        }
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleBiGenerator(io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> biConsumer) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.SimpleBiGenerator(biConsumer);
    }

    static final class ItemDelayFunction<T, U> implements io.reactivex.functions.Function<T, org.reactivestreams.Publisher<T>> {
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> itemDelay;

        ItemDelayFunction(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> function) {
            this.itemDelay = function;
        }

        @Override // io.reactivex.functions.Function
        public org.reactivestreams.Publisher<T> apply(T t) throws java.lang.Exception {
            return new io.reactivex.internal.operators.flowable.FlowableTakePublisher((org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.itemDelay.apply(t), "The itemDelay returned a null Publisher"), 1L).map(io.reactivex.internal.functions.Functions.justFunction(t)).defaultIfEmpty(t);
        }
    }

    public static <T, U> io.reactivex.functions.Function<T, org.reactivestreams.Publisher<T>> itemDelay(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> function) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.ItemDelayFunction(function);
    }

    static final class SubscriberOnNext<T> implements io.reactivex.functions.Consumer<T> {
        final org.reactivestreams.Subscriber<T> subscriber;

        SubscriberOnNext(org.reactivestreams.Subscriber<T> subscriber) {
            this.subscriber = subscriber;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws java.lang.Exception {
            this.subscriber.onNext(t);
        }
    }

    static final class SubscriberOnError<T> implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        final org.reactivestreams.Subscriber<T> subscriber;

        SubscriberOnError(org.reactivestreams.Subscriber<T> subscriber) {
            this.subscriber = subscriber;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(java.lang.Throwable th) throws java.lang.Exception {
            this.subscriber.onError(th);
        }
    }

    static final class SubscriberOnComplete<T> implements io.reactivex.functions.Action {
        final org.reactivestreams.Subscriber<T> subscriber;

        SubscriberOnComplete(org.reactivestreams.Subscriber<T> subscriber) {
            this.subscriber = subscriber;
        }

        @Override // io.reactivex.functions.Action
        public void run() throws java.lang.Exception {
            this.subscriber.onComplete();
        }
    }

    public static <T> io.reactivex.functions.Consumer<T> subscriberOnNext(org.reactivestreams.Subscriber<T> subscriber) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.SubscriberOnNext(subscriber);
    }

    public static <T> io.reactivex.functions.Consumer<java.lang.Throwable> subscriberOnError(org.reactivestreams.Subscriber<T> subscriber) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.SubscriberOnError(subscriber);
    }

    public static <T> io.reactivex.functions.Action subscriberOnComplete(org.reactivestreams.Subscriber<T> subscriber) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.SubscriberOnComplete(subscriber);
    }

    static final class FlatMapWithCombinerInner<U, R, T> implements io.reactivex.functions.Function<U, R> {
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
        private final T t;

        FlatMapWithCombinerInner(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction, T t) {
            this.combiner = biFunction;
            this.t = t;
        }

        @Override // io.reactivex.functions.Function
        public R apply(U u) throws java.lang.Exception {
            return this.combiner.apply(this.t, u);
        }
    }

    static final class FlatMapWithCombinerOuter<T, R, U> implements io.reactivex.functions.Function<T, org.reactivestreams.Publisher<R>> {
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
        private final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> mapper;

        FlatMapWithCombinerOuter(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function) {
            this.combiner = biFunction;
            this.mapper = function;
        }

        @Override // io.reactivex.functions.Function
        public org.reactivestreams.Publisher<R> apply(T t) throws java.lang.Exception {
            return new io.reactivex.internal.operators.flowable.FlowableMapPublisher((org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null Publisher"), new io.reactivex.internal.operators.flowable.FlowableInternalHelper.FlatMapWithCombinerInner(this.combiner, t));
        }
    }

    public static <T, U, R> io.reactivex.functions.Function<T, org.reactivestreams.Publisher<R>> flatMapWithCombiner(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.FlatMapWithCombinerOuter(biFunction, function);
    }

    static final class FlatMapIntoIterable<T, U> implements io.reactivex.functions.Function<T, org.reactivestreams.Publisher<U>> {
        private final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> mapper;

        FlatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> function) {
            this.mapper = function;
        }

        @Override // io.reactivex.functions.Function
        public org.reactivestreams.Publisher<U> apply(T t) throws java.lang.Exception {
            return new io.reactivex.internal.operators.flowable.FlowableFromIterable((java.lang.Iterable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null Iterable"));
        }
    }

    public static <T, U> io.reactivex.functions.Function<T, org.reactivestreams.Publisher<U>> flatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> function) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.FlatMapIntoIterable(function);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> flowable) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.ReplayCallable(flowable);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> flowable, int i) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.BufferedReplayCallable(flowable, i);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> flowable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.BufferedTimedReplay(flowable, i, j, timeUnit, scheduler);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.TimedReplay(flowable, j, timeUnit, scheduler);
    }

    public static <T, R> io.reactivex.functions.Function<io.reactivex.Flowable<T>, org.reactivestreams.Publisher<R>> replayFunction(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> function, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.ReplayFunction(function, scheduler);
    }

    public enum RequestMax implements io.reactivex.functions.Consumer<org.reactivestreams.Subscription> {
        INSTANCE;

        @Override // io.reactivex.functions.Consumer
        public void accept(org.reactivestreams.Subscription subscription) throws java.lang.Exception {
            subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
        }
    }

    static final class ZipIterableFunction<T, R> implements io.reactivex.functions.Function<java.util.List<org.reactivestreams.Publisher<? extends T>>, org.reactivestreams.Publisher<? extends R>> {
        private final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipIterableFunction(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
            this.zipper = function;
        }

        @Override // io.reactivex.functions.Function
        public org.reactivestreams.Publisher<? extends R> apply(java.util.List<org.reactivestreams.Publisher<? extends T>> list) {
            return io.reactivex.Flowable.zipIterable(list, this.zipper, false, io.reactivex.Flowable.bufferSize());
        }
    }

    public static <T, R> io.reactivex.functions.Function<java.util.List<org.reactivestreams.Publisher<? extends T>>, org.reactivestreams.Publisher<? extends R>> zipIterable(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.ZipIterableFunction(function);
    }

    static final class ReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> {
        private final io.reactivex.Flowable<T> parent;

        ReplayCallable(io.reactivex.Flowable<T> flowable) {
            this.parent = flowable;
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.flowables.ConnectableFlowable<T> call() {
            return this.parent.replay();
        }
    }

    static final class BufferedReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> {
        private final int bufferSize;
        private final io.reactivex.Flowable<T> parent;

        BufferedReplayCallable(io.reactivex.Flowable<T> flowable, int i) {
            this.parent = flowable;
            this.bufferSize = i;
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.flowables.ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize);
        }
    }

    static final class BufferedTimedReplay<T> implements java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> {
        private final int bufferSize;
        private final io.reactivex.Flowable<T> parent;
        private final io.reactivex.Scheduler scheduler;
        private final long time;
        private final java.util.concurrent.TimeUnit unit;

        BufferedTimedReplay(io.reactivex.Flowable<T> flowable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.parent = flowable;
            this.bufferSize = i;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.flowables.ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler);
        }
    }

    static final class TimedReplay<T> implements java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> {
        private final io.reactivex.Flowable<T> parent;
        private final io.reactivex.Scheduler scheduler;
        private final long time;
        private final java.util.concurrent.TimeUnit unit;

        TimedReplay(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.parent = flowable;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.flowables.ConnectableFlowable<T> call() {
            return this.parent.replay(this.time, this.unit, this.scheduler);
        }
    }

    static final class ReplayFunction<T, R> implements io.reactivex.functions.Function<io.reactivex.Flowable<T>, org.reactivestreams.Publisher<R>> {
        private final io.reactivex.Scheduler scheduler;
        private final io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> selector;

        ReplayFunction(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> function, io.reactivex.Scheduler scheduler) {
            this.selector = function;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.functions.Function
        public org.reactivestreams.Publisher<R> apply(io.reactivex.Flowable<T> flowable) throws java.lang.Exception {
            return io.reactivex.Flowable.fromPublisher((org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.selector.apply(flowable), "The selector returned a null Publisher")).observeOn(this.scheduler);
        }
    }
}
