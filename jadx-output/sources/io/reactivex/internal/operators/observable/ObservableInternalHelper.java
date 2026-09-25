package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableInternalHelper {
    private ObservableInternalHelper() {
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
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.SimpleGenerator(consumer);
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
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.SimpleBiGenerator(biConsumer);
    }

    static final class ItemDelayFunction<T, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<T>> {
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> itemDelay;

        ItemDelayFunction(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> function) {
            this.itemDelay = function;
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.ObservableSource<T> apply(T t) throws java.lang.Exception {
            return new io.reactivex.internal.operators.observable.ObservableTake((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.itemDelay.apply(t), "The itemDelay returned a null ObservableSource"), 1L).map(io.reactivex.internal.functions.Functions.justFunction(t)).defaultIfEmpty(t);
        }
    }

    public static <T, U> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<T>> itemDelay(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> function) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ItemDelayFunction(function);
    }

    static final class ObserverOnNext<T> implements io.reactivex.functions.Consumer<T> {
        final io.reactivex.Observer<T> observer;

        ObserverOnNext(io.reactivex.Observer<T> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws java.lang.Exception {
            this.observer.onNext(t);
        }
    }

    static final class ObserverOnError<T> implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        final io.reactivex.Observer<T> observer;

        ObserverOnError(io.reactivex.Observer<T> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(java.lang.Throwable th) throws java.lang.Exception {
            this.observer.onError(th);
        }
    }

    static final class ObserverOnComplete<T> implements io.reactivex.functions.Action {
        final io.reactivex.Observer<T> observer;

        ObserverOnComplete(io.reactivex.Observer<T> observer) {
            this.observer = observer;
        }

        @Override // io.reactivex.functions.Action
        public void run() throws java.lang.Exception {
            this.observer.onComplete();
        }
    }

    public static <T> io.reactivex.functions.Consumer<T> observerOnNext(io.reactivex.Observer<T> observer) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ObserverOnNext(observer);
    }

    public static <T> io.reactivex.functions.Consumer<java.lang.Throwable> observerOnError(io.reactivex.Observer<T> observer) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ObserverOnError(observer);
    }

    public static <T> io.reactivex.functions.Action observerOnComplete(io.reactivex.Observer<T> observer) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ObserverOnComplete(observer);
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

    static final class FlatMapWithCombinerOuter<T, R, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<R>> {
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
        private final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> mapper;

        FlatMapWithCombinerOuter(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function) {
            this.combiner = biFunction;
            this.mapper = function;
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.ObservableSource<R> apply(T t) throws java.lang.Exception {
            return new io.reactivex.internal.operators.observable.ObservableMap((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null ObservableSource"), new io.reactivex.internal.operators.observable.ObservableInternalHelper.FlatMapWithCombinerInner(this.combiner, t));
        }
    }

    public static <T, U, R> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<R>> flatMapWithCombiner(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.FlatMapWithCombinerOuter(biFunction, function);
    }

    static final class FlatMapIntoIterable<T, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<U>> {
        private final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> mapper;

        FlatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> function) {
            this.mapper = function;
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.ObservableSource<U> apply(T t) throws java.lang.Exception {
            return new io.reactivex.internal.operators.observable.ObservableFromIterable((java.lang.Iterable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null Iterable"));
        }
    }

    public static <T, U> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<U>> flatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> function) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.FlatMapIntoIterable(function);
    }

    enum MapToInt implements io.reactivex.functions.Function<java.lang.Object, java.lang.Object> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return 0;
        }
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> observable) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ReplayCallable(observable);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> observable, int i) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.BufferedReplayCallable(observable, i);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> observable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.BufferedTimedReplayCallable(observable, i, j, timeUnit, scheduler);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> observable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.TimedReplayCallable(observable, j, timeUnit, scheduler);
    }

    public static <T, R> io.reactivex.functions.Function<io.reactivex.Observable<T>, io.reactivex.ObservableSource<R>> replayFunction(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> function, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ReplayFunction(function, scheduler);
    }

    static final class ZipIterableFunction<T, R> implements io.reactivex.functions.Function<java.util.List<io.reactivex.ObservableSource<? extends T>>, io.reactivex.ObservableSource<? extends R>> {
        private final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> zipper;

        ZipIterableFunction(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
            this.zipper = function;
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.ObservableSource<? extends R> apply(java.util.List<io.reactivex.ObservableSource<? extends T>> list) {
            return io.reactivex.Observable.zipIterable(list, this.zipper, false, io.reactivex.Observable.bufferSize());
        }
    }

    public static <T, R> io.reactivex.functions.Function<java.util.List<io.reactivex.ObservableSource<? extends T>>, io.reactivex.ObservableSource<? extends R>> zipIterable(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ZipIterableFunction(function);
    }

    static final class ReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final io.reactivex.Observable<T> parent;

        ReplayCallable(io.reactivex.Observable<T> observable) {
            this.parent = observable;
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.observables.ConnectableObservable<T> call() {
            return this.parent.replay();
        }
    }

    static final class BufferedReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final int bufferSize;
        private final io.reactivex.Observable<T> parent;

        BufferedReplayCallable(io.reactivex.Observable<T> observable, int i) {
            this.parent = observable;
            this.bufferSize = i;
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.observables.ConnectableObservable<T> call() {
            return this.parent.replay(this.bufferSize);
        }
    }

    static final class BufferedTimedReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final int bufferSize;
        private final io.reactivex.Observable<T> parent;
        private final io.reactivex.Scheduler scheduler;
        private final long time;
        private final java.util.concurrent.TimeUnit unit;

        BufferedTimedReplayCallable(io.reactivex.Observable<T> observable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.parent = observable;
            this.bufferSize = i;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.observables.ConnectableObservable<T> call() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler);
        }
    }

    static final class TimedReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final io.reactivex.Observable<T> parent;
        private final io.reactivex.Scheduler scheduler;
        private final long time;
        private final java.util.concurrent.TimeUnit unit;

        TimedReplayCallable(io.reactivex.Observable<T> observable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.parent = observable;
            this.time = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public io.reactivex.observables.ConnectableObservable<T> call() {
            return this.parent.replay(this.time, this.unit, this.scheduler);
        }
    }

    static final class ReplayFunction<T, R> implements io.reactivex.functions.Function<io.reactivex.Observable<T>, io.reactivex.ObservableSource<R>> {
        private final io.reactivex.Scheduler scheduler;
        private final io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> selector;

        ReplayFunction(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> function, io.reactivex.Scheduler scheduler) {
            this.selector = function;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.ObservableSource<R> apply(io.reactivex.Observable<T> observable) throws java.lang.Exception {
            return io.reactivex.Observable.wrap((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.selector.apply(observable), "The selector returned a null ObservableSource")).observeOn(this.scheduler);
        }
    }
}
