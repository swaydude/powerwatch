package io.reactivex.rxkotlin;

/* JADX INFO: compiled from: Observables.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0007\u001ao\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072 \b\u0004\u0010\n\u001a\u001a\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t0\u000bH\u0087\b\u001a\u0089\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\f\"\u0004\b\u0004\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u00072&\b\u0004\u0010\n\u001a \u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\t0\u000eH\u0087\b\u001a£\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005\"\u0004\b\u0003\u0010\f\"\u0004\b\u0004\u0010\u000f\"\u0004\b\u0005\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00072,\b\u0004\u0010\n\u001a&\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\t0\u0011H\u0087\b\u001a>\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00130\u00120\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007H\u0007\u001aU\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00072\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\t0\u0015H\u0087\b\u001a>\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00130\u00120\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007H\u0007\u001aU\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00072\u001a\b\u0004\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\t0\u0015H\u0087\b¨\u0006\u0018"}, d2 = {"withLatestFrom", "Lio/reactivex/Observable;", "Lkotlin/Triple;", "T", "T1", "T2", "o1", "Lio/reactivex/ObservableSource;", "o2", "R", "combiner", "Lkotlin/Function3;", "T3", "o3", "Lkotlin/Function4;", "T4", "o4", "Lkotlin/Function5;", "Lkotlin/Pair;", "U", com.google.android.gms.fitness.FitnessActivities.OTHER, "Lkotlin/Function2;", "zipWith", "zipper", "rxkotlin"}, k = 2, mv = {1, 1, 11})
public final class ObservablesKt {
    /* JADX WARN: Multi-variable type inference failed */
    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, U, R> io.reactivex.Observable<R> withLatestFrom(io.reactivex.Observable<T> receiver, io.reactivex.ObservableSource<U> other, final kotlin.jvm.functions.Function2<? super T, ? super U, ? extends R> combiner) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(combiner, "combiner");
        io.reactivex.Observable<R> observableWithLatestFrom = receiver.withLatestFrom(other, new io.reactivex.functions.BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t, U u) {
                return (R) combiner.invoke(t, u);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableWithLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        return observableWithLatestFrom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, U> io.reactivex.Observable<kotlin.Pair<T, U>> withLatestFrom(io.reactivex.Observable<T> receiver, io.reactivex.ObservableSource<U> other) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
        io.reactivex.Observable<kotlin.Pair<T, U>> observable = (io.reactivex.Observable<kotlin.Pair<T, U>>) receiver.withLatestFrom(other, new io.reactivex.functions.BiFunction<T, U, kotlin.Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.2
            @Override // io.reactivex.functions.BiFunction
            public final kotlin.Pair<T, U> apply(T t, U u) {
                return new kotlin.Pair<>(t, u);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observable, "withLatestFrom(other, Bi…ion{ t, u -> Pair(t,u) })");
        return observable;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, T1, T2, R> io.reactivex.Observable<R> withLatestFrom(io.reactivex.Observable<T> receiver, io.reactivex.ObservableSource<T1> o1, io.reactivex.ObservableSource<T2> o2, final kotlin.jvm.functions.Function3<? super T, ? super T1, ? super T2, ? extends R> combiner) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(o1, "o1");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(o2, "o2");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(combiner, "combiner");
        io.reactivex.Observable<R> observableWithLatestFrom = receiver.withLatestFrom(o1, o2, new io.reactivex.functions.Function3<T, T1, T2, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.3
            @Override // io.reactivex.functions.Function3
            public final R apply(T t, T1 t1, T2 t2) {
                return (R) combiner.invoke(t, t1, t2);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableWithLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        return observableWithLatestFrom;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, T1, T2> io.reactivex.Observable<kotlin.Triple<T, T1, T2>> withLatestFrom(io.reactivex.Observable<T> receiver, io.reactivex.ObservableSource<T1> o1, io.reactivex.ObservableSource<T2> o2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(o1, "o1");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(o2, "o2");
        io.reactivex.Observable<kotlin.Triple<T, T1, T2>> observable = (io.reactivex.Observable<kotlin.Triple<T, T1, T2>>) receiver.withLatestFrom(o1, o2, new io.reactivex.functions.Function3<T, T1, T2, kotlin.Triple<? extends T, ? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.4
            @Override // io.reactivex.functions.Function3
            public final kotlin.Triple<T, T1, T2> apply(T t, T1 t1, T2 t2) {
                return new kotlin.Triple<>(t, t1, t2);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observable, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return observable;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, T1, T2, T3, R> io.reactivex.Observable<R> withLatestFrom(io.reactivex.Observable<T> receiver, io.reactivex.ObservableSource<T1> o1, io.reactivex.ObservableSource<T2> o2, io.reactivex.ObservableSource<T3> o3, final kotlin.jvm.functions.Function4<? super T, ? super T1, ? super T2, ? super T3, ? extends R> combiner) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(o1, "o1");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(o2, "o2");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(o3, "o3");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(combiner, "combiner");
        io.reactivex.Observable<R> observableWithLatestFrom = receiver.withLatestFrom(o1, o2, o3, new io.reactivex.functions.Function4<T, T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.5
            @Override // io.reactivex.functions.Function4
            public final R apply(T t, T1 t1, T2 t2, T3 t3) {
                return (R) combiner.invoke(t, t1, t2, t3);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableWithLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        return observableWithLatestFrom;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, T1, T2, T3, T4, R> io.reactivex.Observable<R> withLatestFrom(io.reactivex.Observable<T> receiver, io.reactivex.ObservableSource<T1> o1, io.reactivex.ObservableSource<T2> o2, io.reactivex.ObservableSource<T3> o3, io.reactivex.ObservableSource<T4> o4, final kotlin.jvm.functions.Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combiner) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(o1, "o1");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(o2, "o2");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(o3, "o3");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(o4, "o4");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(combiner, "combiner");
        io.reactivex.Observable<R> observableWithLatestFrom = receiver.withLatestFrom(o1, o2, o3, o4, new io.reactivex.functions.Function5<T, T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt.withLatestFrom.6
            @Override // io.reactivex.functions.Function5
            public final R apply(T t, T1 t1, T2 t2, T3 t3, T4 t4) {
                return (R) combiner.invoke(t, t1, t2, t3, t4);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableWithLatestFrom, "withLatestFrom(o1, o2, o…oke(t, t1, t2, t3, t4) })");
        return observableWithLatestFrom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, U, R> io.reactivex.Observable<R> zipWith(io.reactivex.Observable<T> receiver, io.reactivex.ObservableSource<U> other, final kotlin.jvm.functions.Function2<? super T, ? super U, ? extends R> zipper) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(zipper, "zipper");
        io.reactivex.Observable<R> observableZipWith = receiver.zipWith(other, new io.reactivex.functions.BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt.zipWith.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t, U u) {
                return (R) zipper.invoke(t, u);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableZipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return observableZipWith;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, U> io.reactivex.Observable<kotlin.Pair<T, U>> zipWith(io.reactivex.Observable<T> receiver, io.reactivex.ObservableSource<U> other) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
        io.reactivex.Observable<kotlin.Pair<T, U>> observable = (io.reactivex.Observable<kotlin.Pair<T, U>>) receiver.zipWith(other, new io.reactivex.functions.BiFunction<T, U, kotlin.Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.ObservablesKt.zipWith.2
            @Override // io.reactivex.functions.BiFunction
            public final kotlin.Pair<T, U> apply(T t, U u) {
                return new kotlin.Pair<>(t, u);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observable, "zipWith(other, BiFunction { t, u -> Pair(t,u) })");
        return observable;
    }
}
