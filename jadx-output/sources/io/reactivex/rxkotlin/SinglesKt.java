package io.reactivex.rxkotlin;

/* JADX INFO: compiled from: Singles.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a>\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u0007\u001aU\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\u001a\b\u0004\u0010\b\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00070\tH\u0087\b¨\u0006\n"}, d2 = {"zipWith", "Lio/reactivex/Single;", "Lkotlin/Pair;", "T", "U", com.google.android.gms.fitness.FitnessActivities.OTHER, "Lio/reactivex/SingleSource;", "R", "zipper", "Lkotlin/Function2;", "rxkotlin"}, k = 2, mv = {1, 1, 11})
public final class SinglesKt {
    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, U, R> io.reactivex.Single<R> zipWith(io.reactivex.Single<T> receiver, io.reactivex.SingleSource<U> other, final kotlin.jvm.functions.Function2<? super T, ? super U, ? extends R> zipper) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(zipper, "zipper");
        io.reactivex.Single<R> singleZipWith = receiver.zipWith(other, new io.reactivex.functions.BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.SinglesKt.zipWith.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t, U u) {
                return (R) zipper.invoke(t, u);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(singleZipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return singleZipWith;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, U> io.reactivex.Single<kotlin.Pair<T, U>> zipWith(io.reactivex.Single<T> receiver, io.reactivex.SingleSource<U> other) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
        io.reactivex.Single<kotlin.Pair<T, U>> single = (io.reactivex.Single<kotlin.Pair<T, U>>) receiver.zipWith(other, new io.reactivex.functions.BiFunction<T, U, kotlin.Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.SinglesKt.zipWith.2
            @Override // io.reactivex.functions.BiFunction
            public final kotlin.Pair<T, U> apply(T t, U u) {
                return new kotlin.Pair<>(t, u);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(single, "zipWith(other, BiFunction { t, u -> Pair(t,u) })");
        return single;
    }
}
