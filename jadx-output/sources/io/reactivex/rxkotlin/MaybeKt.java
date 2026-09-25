package io.reactivex.rxkotlin;

/* JADX INFO: compiled from: maybe.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001aF\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006\u0018\u00010\u00050\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\t0\bH\u0007\u001aF\u0010\n\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006\u0018\u00010\u00050\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0005H\u0007\u001aF\u0010\n\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u0001H\u0006H\u0006\u0018\u00010\u000b0\u000b\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u000bH\u0007\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b¨\u0006\r"}, d2 = {"cast", "Lio/reactivex/Maybe;", "R", "", "concatAll", "Lio/reactivex/Flowable;", "T", "kotlin.jvm.PlatformType", "", "Lio/reactivex/MaybeSource;", "mergeAllMaybes", "Lio/reactivex/Observable;", "ofType", "rxkotlin"}, k = 2, mv = {1, 1, 11})
public final class MaybeKt {
    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    private static final <R> io.reactivex.Maybe<R> cast(io.reactivex.Maybe<?> maybe) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "R");
        io.reactivex.Maybe<R> maybe2 = (io.reactivex.Maybe<R>) maybe.cast(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(maybe2, "cast(R::class.java)");
        return maybe2;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    private static final <R> io.reactivex.Maybe<R> ofType(io.reactivex.Maybe<?> maybe) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "R");
        io.reactivex.Maybe<R> maybe2 = (io.reactivex.Maybe<R>) maybe.ofType(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(maybe2, "ofType(R::class.java)");
        return maybe2;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> mergeAllMaybes(io.reactivex.Observable<io.reactivex.Maybe<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Observable<T>) receiver.flatMapMaybe(new io.reactivex.functions.Function<T, io.reactivex.MaybeSource<? extends R>>() { // from class: io.reactivex.rxkotlin.MaybeKt.mergeAllMaybes.1
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Maybe<T> apply(io.reactivex.Maybe<T> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Flowable<T> mergeAllMaybes(io.reactivex.Flowable<io.reactivex.Maybe<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Flowable<T>) receiver.flatMapMaybe(new io.reactivex.functions.Function<T, io.reactivex.MaybeSource<? extends R>>() { // from class: io.reactivex.rxkotlin.MaybeKt.mergeAllMaybes.2
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Maybe<T> apply(io.reactivex.Maybe<T> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Flowable<T> concatAll(java.lang.Iterable<? extends io.reactivex.MaybeSource<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return io.reactivex.Maybe.concat(receiver);
    }
}
