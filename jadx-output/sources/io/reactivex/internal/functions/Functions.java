package io.reactivex.internal.functions;

/* JADX INFO: loaded from: classes2.dex */
public final class Functions {
    static final io.reactivex.functions.Function<java.lang.Object, java.lang.Object> IDENTITY = new io.reactivex.internal.functions.Functions.Identity();
    public static final java.lang.Runnable EMPTY_RUNNABLE = new io.reactivex.internal.functions.Functions.EmptyRunnable();
    public static final io.reactivex.functions.Action EMPTY_ACTION = new io.reactivex.internal.functions.Functions.EmptyAction();
    static final io.reactivex.functions.Consumer<java.lang.Object> EMPTY_CONSUMER = new io.reactivex.internal.functions.Functions.EmptyConsumer();
    public static final io.reactivex.functions.Consumer<java.lang.Throwable> ERROR_CONSUMER = new io.reactivex.internal.functions.Functions.ErrorConsumer();
    public static final io.reactivex.functions.Consumer<java.lang.Throwable> ON_ERROR_MISSING = new io.reactivex.internal.functions.Functions.OnErrorMissingConsumer();
    public static final io.reactivex.functions.LongConsumer EMPTY_LONG_CONSUMER = new io.reactivex.internal.functions.Functions.EmptyLongConsumer();
    static final io.reactivex.functions.Predicate<java.lang.Object> ALWAYS_TRUE = new io.reactivex.internal.functions.Functions.TruePredicate();
    static final io.reactivex.functions.Predicate<java.lang.Object> ALWAYS_FALSE = new io.reactivex.internal.functions.Functions.FalsePredicate();
    static final java.util.concurrent.Callable<java.lang.Object> NULL_SUPPLIER = new io.reactivex.internal.functions.Functions.NullCallable();
    static final java.util.Comparator<java.lang.Object> NATURAL_COMPARATOR = new io.reactivex.internal.functions.Functions.NaturalObjectComparator();
    public static final io.reactivex.functions.Consumer<org.reactivestreams.Subscription> REQUEST_MAX = new io.reactivex.internal.functions.Functions.MaxRequestSubscription();

    private Functions() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T1, T2, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(biFunction, "f is null");
        return new io.reactivex.internal.functions.Functions.Array2Func(biFunction);
    }

    public static <T1, T2, T3, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function3<T1, T2, T3, R> function3) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function3, "f is null");
        return new io.reactivex.internal.functions.Functions.Array3Func(function3);
    }

    public static <T1, T2, T3, T4, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function4<T1, T2, T3, T4, R> function4) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function4, "f is null");
        return new io.reactivex.internal.functions.Functions.Array4Func(function4);
    }

    public static <T1, T2, T3, T4, T5, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R> function5) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function5, "f is null");
        return new io.reactivex.internal.functions.Functions.Array5Func(function5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R> function6) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function6, "f is null");
        return new io.reactivex.internal.functions.Functions.Array6Func(function6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R> function7) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function7, "f is null");
        return new io.reactivex.internal.functions.Functions.Array7Func(function7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function8, "f is null");
        return new io.reactivex.internal.functions.Functions.Array8Func(function8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> io.reactivex.functions.Function<java.lang.Object[], R> toFunction(io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function9, "f is null");
        return new io.reactivex.internal.functions.Functions.Array9Func(function9);
    }

    public static <T> io.reactivex.functions.Function<T, T> identity() {
        return (io.reactivex.functions.Function<T, T>) IDENTITY;
    }

    public static <T> io.reactivex.functions.Consumer<T> emptyConsumer() {
        return (io.reactivex.functions.Consumer<T>) EMPTY_CONSUMER;
    }

    public static <T> io.reactivex.functions.Predicate<T> alwaysTrue() {
        return (io.reactivex.functions.Predicate<T>) ALWAYS_TRUE;
    }

    public static <T> io.reactivex.functions.Predicate<T> alwaysFalse() {
        return (io.reactivex.functions.Predicate<T>) ALWAYS_FALSE;
    }

    public static <T> java.util.concurrent.Callable<T> nullSupplier() {
        return (java.util.concurrent.Callable<T>) NULL_SUPPLIER;
    }

    public static <T> java.util.Comparator<T> naturalOrder() {
        return (java.util.Comparator<T>) NATURAL_COMPARATOR;
    }

    static final class FutureAction implements io.reactivex.functions.Action {
        final java.util.concurrent.Future<?> future;

        FutureAction(java.util.concurrent.Future<?> future) {
            this.future = future;
        }

        @Override // io.reactivex.functions.Action
        public void run() throws java.lang.Exception {
            this.future.get();
        }
    }

    public static io.reactivex.functions.Action futureAction(java.util.concurrent.Future<?> future) {
        return new io.reactivex.internal.functions.Functions.FutureAction(future);
    }

    static final class JustValue<T, U> implements java.util.concurrent.Callable<U>, io.reactivex.functions.Function<T, U> {
        final U value;

        JustValue(U u) {
            this.value = u;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws java.lang.Exception {
            return this.value;
        }

        @Override // io.reactivex.functions.Function
        public U apply(T t) throws java.lang.Exception {
            return this.value;
        }
    }

    public static <T> java.util.concurrent.Callable<T> justCallable(T t) {
        return new io.reactivex.internal.functions.Functions.JustValue(t);
    }

    public static <T, U> io.reactivex.functions.Function<T, U> justFunction(U u) {
        return new io.reactivex.internal.functions.Functions.JustValue(u);
    }

    static final class CastToClass<T, U> implements io.reactivex.functions.Function<T, U> {
        final java.lang.Class<U> clazz;

        CastToClass(java.lang.Class<U> cls) {
            this.clazz = cls;
        }

        @Override // io.reactivex.functions.Function
        public U apply(T t) throws java.lang.Exception {
            return this.clazz.cast(t);
        }
    }

    public static <T, U> io.reactivex.functions.Function<T, U> castFunction(java.lang.Class<U> cls) {
        return new io.reactivex.internal.functions.Functions.CastToClass(cls);
    }

    static final class ArrayListCapacityCallable<T> implements java.util.concurrent.Callable<java.util.List<T>> {
        final int capacity;

        ArrayListCapacityCallable(int i) {
            this.capacity = i;
        }

        @Override // java.util.concurrent.Callable
        public java.util.List<T> call() throws java.lang.Exception {
            return new java.util.ArrayList(this.capacity);
        }
    }

    public static <T> java.util.concurrent.Callable<java.util.List<T>> createArrayList(int i) {
        return new io.reactivex.internal.functions.Functions.ArrayListCapacityCallable(i);
    }

    static final class EqualsPredicate<T> implements io.reactivex.functions.Predicate<T> {
        final T value;

        EqualsPredicate(T t) {
            this.value = t;
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(T t) throws java.lang.Exception {
            return io.reactivex.internal.functions.ObjectHelper.equals(t, this.value);
        }
    }

    public static <T> io.reactivex.functions.Predicate<T> equalsWith(T t) {
        return new io.reactivex.internal.functions.Functions.EqualsPredicate(t);
    }

    enum HashSetCallable implements java.util.concurrent.Callable<java.util.Set<java.lang.Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public java.util.Set<java.lang.Object> call() throws java.lang.Exception {
            return new java.util.HashSet();
        }
    }

    public static <T> java.util.concurrent.Callable<java.util.Set<T>> createHashSet() {
        return io.reactivex.internal.functions.Functions.HashSetCallable.INSTANCE;
    }

    static final class NotificationOnNext<T> implements io.reactivex.functions.Consumer<T> {
        final io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> onNotification;

        NotificationOnNext(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
            this.onNotification = consumer;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws java.lang.Exception {
            this.onNotification.accept(io.reactivex.Notification.createOnNext(t));
        }
    }

    static final class NotificationOnError<T> implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        final io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> onNotification;

        NotificationOnError(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
            this.onNotification = consumer;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(java.lang.Throwable th) throws java.lang.Exception {
            this.onNotification.accept(io.reactivex.Notification.createOnError(th));
        }
    }

    static final class NotificationOnComplete<T> implements io.reactivex.functions.Action {
        final io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> onNotification;

        NotificationOnComplete(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
            this.onNotification = consumer;
        }

        @Override // io.reactivex.functions.Action
        public void run() throws java.lang.Exception {
            this.onNotification.accept(io.reactivex.Notification.createOnComplete());
        }
    }

    public static <T> io.reactivex.functions.Consumer<T> notificationOnNext(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
        return new io.reactivex.internal.functions.Functions.NotificationOnNext(consumer);
    }

    public static <T> io.reactivex.functions.Consumer<java.lang.Throwable> notificationOnError(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
        return new io.reactivex.internal.functions.Functions.NotificationOnError(consumer);
    }

    public static <T> io.reactivex.functions.Action notificationOnComplete(io.reactivex.functions.Consumer<? super io.reactivex.Notification<T>> consumer) {
        return new io.reactivex.internal.functions.Functions.NotificationOnComplete(consumer);
    }

    static final class ActionConsumer<T> implements io.reactivex.functions.Consumer<T> {
        final io.reactivex.functions.Action action;

        ActionConsumer(io.reactivex.functions.Action action) {
            this.action = action;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws java.lang.Exception {
            this.action.run();
        }
    }

    public static <T> io.reactivex.functions.Consumer<T> actionConsumer(io.reactivex.functions.Action action) {
        return new io.reactivex.internal.functions.Functions.ActionConsumer(action);
    }

    static final class ClassFilter<T, U> implements io.reactivex.functions.Predicate<T> {
        final java.lang.Class<U> clazz;

        ClassFilter(java.lang.Class<U> cls) {
            this.clazz = cls;
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(T t) throws java.lang.Exception {
            return this.clazz.isInstance(t);
        }
    }

    public static <T, U> io.reactivex.functions.Predicate<T> isInstanceOf(java.lang.Class<U> cls) {
        return new io.reactivex.internal.functions.Functions.ClassFilter(cls);
    }

    static final class BooleanSupplierPredicateReverse<T> implements io.reactivex.functions.Predicate<T> {
        final io.reactivex.functions.BooleanSupplier supplier;

        BooleanSupplierPredicateReverse(io.reactivex.functions.BooleanSupplier booleanSupplier) {
            this.supplier = booleanSupplier;
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(T t) throws java.lang.Exception {
            return !this.supplier.getAsBoolean();
        }
    }

    public static <T> io.reactivex.functions.Predicate<T> predicateReverseFor(io.reactivex.functions.BooleanSupplier booleanSupplier) {
        return new io.reactivex.internal.functions.Functions.BooleanSupplierPredicateReverse(booleanSupplier);
    }

    static final class TimestampFunction<T> implements io.reactivex.functions.Function<T, io.reactivex.schedulers.Timed<T>> {
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;

        TimestampFunction(java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.schedulers.Timed<T> apply(T t) throws java.lang.Exception {
            return new io.reactivex.schedulers.Timed<>(t, this.scheduler.now(this.unit), this.unit);
        }
    }

    public static <T> io.reactivex.functions.Function<T, io.reactivex.schedulers.Timed<T>> timestampWith(java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.functions.Functions.TimestampFunction(timeUnit, scheduler);
    }

    static final class ToMapKeySelector<K, T> implements io.reactivex.functions.BiConsumer<java.util.Map<K, T>, T> {
        private final io.reactivex.functions.Function<? super T, ? extends K> keySelector;

        ToMapKeySelector(io.reactivex.functions.Function<? super T, ? extends K> function) {
            this.keySelector = function;
        }

        @Override // io.reactivex.functions.BiConsumer
        public void accept(java.util.Map<K, T> map, T t) throws java.lang.Exception {
            map.put(this.keySelector.apply(t), t);
        }
    }

    public static <T, K> io.reactivex.functions.BiConsumer<java.util.Map<K, T>, T> toMapKeySelector(io.reactivex.functions.Function<? super T, ? extends K> function) {
        return new io.reactivex.internal.functions.Functions.ToMapKeySelector(function);
    }

    static final class ToMapKeyValueSelector<K, V, T> implements io.reactivex.functions.BiConsumer<java.util.Map<K, V>, T> {
        private final io.reactivex.functions.Function<? super T, ? extends K> keySelector;
        private final io.reactivex.functions.Function<? super T, ? extends V> valueSelector;

        ToMapKeyValueSelector(io.reactivex.functions.Function<? super T, ? extends V> function, io.reactivex.functions.Function<? super T, ? extends K> function2) {
            this.valueSelector = function;
            this.keySelector = function2;
        }

        @Override // io.reactivex.functions.BiConsumer
        public void accept(java.util.Map<K, V> map, T t) throws java.lang.Exception {
            map.put(this.keySelector.apply(t), this.valueSelector.apply(t));
        }
    }

    public static <T, K, V> io.reactivex.functions.BiConsumer<java.util.Map<K, V>, T> toMapKeyValueSelector(io.reactivex.functions.Function<? super T, ? extends K> function, io.reactivex.functions.Function<? super T, ? extends V> function2) {
        return new io.reactivex.internal.functions.Functions.ToMapKeyValueSelector(function2, function);
    }

    static final class ToMultimapKeyValueSelector<K, V, T> implements io.reactivex.functions.BiConsumer<java.util.Map<K, java.util.Collection<V>>, T> {
        private final io.reactivex.functions.Function<? super K, ? extends java.util.Collection<? super V>> collectionFactory;
        private final io.reactivex.functions.Function<? super T, ? extends K> keySelector;
        private final io.reactivex.functions.Function<? super T, ? extends V> valueSelector;

        ToMultimapKeyValueSelector(io.reactivex.functions.Function<? super K, ? extends java.util.Collection<? super V>> function, io.reactivex.functions.Function<? super T, ? extends V> function2, io.reactivex.functions.Function<? super T, ? extends K> function3) {
            this.collectionFactory = function;
            this.valueSelector = function2;
            this.keySelector = function3;
        }

        @Override // io.reactivex.functions.BiConsumer
        public void accept(java.util.Map<K, java.util.Collection<V>> map, T t) throws java.lang.Exception {
            K kApply = this.keySelector.apply(t);
            java.util.Collection<? super V> collectionApply = (java.util.Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.collectionFactory.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.valueSelector.apply(t));
        }
    }

    public static <T, K, V> io.reactivex.functions.BiConsumer<java.util.Map<K, java.util.Collection<V>>, T> toMultimapKeyValueSelector(io.reactivex.functions.Function<? super T, ? extends K> function, io.reactivex.functions.Function<? super T, ? extends V> function2, io.reactivex.functions.Function<? super K, ? extends java.util.Collection<? super V>> function3) {
        return new io.reactivex.internal.functions.Functions.ToMultimapKeyValueSelector(function3, function2, function);
    }

    enum NaturalComparator implements java.util.Comparator<java.lang.Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(java.lang.Object obj, java.lang.Object obj2) {
            return ((java.lang.Comparable) obj).compareTo(obj2);
        }
    }

    public static <T> java.util.Comparator<T> naturalComparator() {
        return io.reactivex.internal.functions.Functions.NaturalComparator.INSTANCE;
    }

    static final class ListSorter<T> implements io.reactivex.functions.Function<java.util.List<T>, java.util.List<T>> {
        final java.util.Comparator<? super T> comparator;

        ListSorter(java.util.Comparator<? super T> comparator) {
            this.comparator = comparator;
        }

        @Override // io.reactivex.functions.Function
        public java.util.List<T> apply(java.util.List<T> list) {
            java.util.Collections.sort(list, this.comparator);
            return list;
        }
    }

    public static <T> io.reactivex.functions.Function<java.util.List<T>, java.util.List<T>> listSorter(java.util.Comparator<? super T> comparator) {
        return new io.reactivex.internal.functions.Functions.ListSorter(comparator);
    }

    static final class Array2Func<T1, T2, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> f;

        Array2Func(io.reactivex.functions.BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
            this.f = biFunction;
        }

        @Override // io.reactivex.functions.Function
        public R apply(java.lang.Object[] objArr) throws java.lang.Exception {
            if (objArr.length != 2) {
                throw new java.lang.IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
            }
            return this.f.apply(objArr[0], objArr[1]);
        }
    }

    static final class Array3Func<T1, T2, T3, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function3<T1, T2, T3, R> f;

        Array3Func(io.reactivex.functions.Function3<T1, T2, T3, R> function3) {
            this.f = function3;
        }

        @Override // io.reactivex.functions.Function
        public R apply(java.lang.Object[] objArr) throws java.lang.Exception {
            if (objArr.length != 3) {
                throw new java.lang.IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
            }
            return this.f.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
        }
    }

    static final class Array4Func<T1, T2, T3, T4, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function4<T1, T2, T3, T4, R> f;

        Array4Func(io.reactivex.functions.Function4<T1, T2, T3, T4, R> function4) {
            this.f = function4;
        }

        @Override // io.reactivex.functions.Function
        public R apply(java.lang.Object[] objArr) throws java.lang.Exception {
            if (objArr.length != 4) {
                throw new java.lang.IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return this.f.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3]);
        }
    }

    static final class Array5Func<T1, T2, T3, T4, T5, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        private final io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R> f;

        Array5Func(io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R> function5) {
            this.f = function5;
        }

        @Override // io.reactivex.functions.Function
        public R apply(java.lang.Object[] objArr) throws java.lang.Exception {
            if (objArr.length != 5) {
                throw new java.lang.IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return this.f.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4]);
        }
    }

    static final class Array6Func<T1, T2, T3, T4, T5, T6, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R> f;

        Array6Func(io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R> function6) {
            this.f = function6;
        }

        @Override // io.reactivex.functions.Function
        public R apply(java.lang.Object[] objArr) throws java.lang.Exception {
            if (objArr.length != 6) {
                throw new java.lang.IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return this.f.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5]);
        }
    }

    static final class Array7Func<T1, T2, T3, T4, T5, T6, T7, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R> f;

        Array7Func(io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R> function7) {
            this.f = function7;
        }

        @Override // io.reactivex.functions.Function
        public R apply(java.lang.Object[] objArr) throws java.lang.Exception {
            if (objArr.length != 7) {
                throw new java.lang.IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            return this.f.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6]);
        }
    }

    static final class Array8Func<T1, T2, T3, T4, T5, T6, T7, T8, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f;

        Array8Func(io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
            this.f = function8;
        }

        @Override // io.reactivex.functions.Function
        public R apply(java.lang.Object[] objArr) throws java.lang.Exception {
            if (objArr.length != 8) {
                throw new java.lang.IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return this.f.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7]);
        }
    }

    static final class Array9Func<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements io.reactivex.functions.Function<java.lang.Object[], R> {
        final io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f;

        Array9Func(io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9) {
            this.f = function9;
        }

        @Override // io.reactivex.functions.Function
        public R apply(java.lang.Object[] objArr) throws java.lang.Exception {
            if (objArr.length != 9) {
                throw new java.lang.IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            return this.f.apply((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7], (T9) objArr[8]);
        }
    }

    static final class Identity implements io.reactivex.functions.Function<java.lang.Object, java.lang.Object> {
        @Override // io.reactivex.functions.Function
        public java.lang.Object apply(java.lang.Object obj) {
            return obj;
        }

        public java.lang.String toString() {
            return "IdentityFunction";
        }

        Identity() {
        }
    }

    static final class EmptyRunnable implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public java.lang.String toString() {
            return "EmptyRunnable";
        }

        EmptyRunnable() {
        }
    }

    static final class EmptyAction implements io.reactivex.functions.Action {
        @Override // io.reactivex.functions.Action
        public void run() {
        }

        public java.lang.String toString() {
            return "EmptyAction";
        }

        EmptyAction() {
        }
    }

    static final class EmptyConsumer implements io.reactivex.functions.Consumer<java.lang.Object> {
        @Override // io.reactivex.functions.Consumer
        public void accept(java.lang.Object obj) {
        }

        public java.lang.String toString() {
            return "EmptyConsumer";
        }

        EmptyConsumer() {
        }
    }

    static final class ErrorConsumer implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        ErrorConsumer() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(java.lang.Throwable th) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    static final class OnErrorMissingConsumer implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        OnErrorMissingConsumer() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(java.lang.Throwable th) {
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.OnErrorNotImplementedException(th));
        }
    }

    static final class EmptyLongConsumer implements io.reactivex.functions.LongConsumer {
        @Override // io.reactivex.functions.LongConsumer
        public void accept(long j) {
        }

        EmptyLongConsumer() {
        }
    }

    static final class TruePredicate implements io.reactivex.functions.Predicate<java.lang.Object> {
        @Override // io.reactivex.functions.Predicate
        public boolean test(java.lang.Object obj) {
            return true;
        }

        TruePredicate() {
        }
    }

    static final class FalsePredicate implements io.reactivex.functions.Predicate<java.lang.Object> {
        @Override // io.reactivex.functions.Predicate
        public boolean test(java.lang.Object obj) {
            return false;
        }

        FalsePredicate() {
        }
    }

    static final class NullCallable implements java.util.concurrent.Callable<java.lang.Object> {
        @Override // java.util.concurrent.Callable
        public java.lang.Object call() {
            return null;
        }

        NullCallable() {
        }
    }

    static final class NaturalObjectComparator implements java.util.Comparator<java.lang.Object> {
        NaturalObjectComparator() {
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Object obj, java.lang.Object obj2) {
            return ((java.lang.Comparable) obj).compareTo(obj2);
        }
    }

    static final class MaxRequestSubscription implements io.reactivex.functions.Consumer<org.reactivestreams.Subscription> {
        MaxRequestSubscription() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(org.reactivestreams.Subscription subscription) throws java.lang.Exception {
            subscription.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
        }
    }

    public static <T> io.reactivex.functions.Consumer<T> boundedConsumer(int i) {
        return new io.reactivex.internal.functions.Functions.BoundedConsumer(i);
    }

    public static class BoundedConsumer implements io.reactivex.functions.Consumer<org.reactivestreams.Subscription> {
        final int bufferSize;

        BoundedConsumer(int i) {
            this.bufferSize = i;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(org.reactivestreams.Subscription subscription) throws java.lang.Exception {
            subscription.request(this.bufferSize);
        }
    }
}
