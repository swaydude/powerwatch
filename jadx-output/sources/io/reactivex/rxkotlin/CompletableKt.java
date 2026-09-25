package io.reactivex.rxkotlin;

/* JADX INFO: compiled from: completable.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a\u001a\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\u001a\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a\u0010\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\t\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u000b\u001a\u0012\u0010\b\u001a\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\n0\f\u001a\u0012\u0010\b\u001a\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\n0\r¨\u0006\u000e"}, d2 = {"concatAll", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "", "Lio/reactivex/CompletableSource;", "mergeAllCompletables", "Lio/reactivex/Flowable;", "Lio/reactivex/Observable;", "toCompletable", "Lkotlin/Function0;", "", "Lio/reactivex/functions/Action;", "Ljava/util/concurrent/Callable;", "Ljava/util/concurrent/Future;", "rxkotlin"}, k = 2, mv = {1, 1, 11})
public final class CompletableKt {
    public static final io.reactivex.Completable toCompletable(io.reactivex.functions.Action receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(receiver);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(completableFromAction, "Completable.fromAction(this)");
        return completableFromAction;
    }

    public static final io.reactivex.Completable toCompletable(java.util.concurrent.Callable<? extends java.lang.Object> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Completable completableFromCallable = io.reactivex.Completable.fromCallable(receiver);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(completableFromCallable, "Completable.fromCallable(this)");
        return completableFromCallable;
    }

    public static final io.reactivex.Completable toCompletable(java.util.concurrent.Future<? extends java.lang.Object> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Completable completableFromFuture = io.reactivex.Completable.fromFuture(receiver);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(completableFromFuture, "Completable.fromFuture(this)");
        return completableFromFuture;
    }

    public static final io.reactivex.Completable toCompletable(final kotlin.jvm.functions.Function0<? extends java.lang.Object> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Completable completableFromCallable = io.reactivex.Completable.fromCallable(new java.util.concurrent.Callable() { // from class: io.reactivex.rxkotlin.CompletableKt$sam$java_util_concurrent_Callable$0
            /* JADX WARN: Type inference failed for: r0v1, types: [V, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ V call() {
                return receiver.invoke();
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(completableFromCallable, "Completable.fromCallable(this)");
        return completableFromCallable;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Completable mergeAllCompletables(io.reactivex.Observable<io.reactivex.Completable> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return receiver.flatMapCompletable(new io.reactivex.functions.Function<io.reactivex.Completable, io.reactivex.CompletableSource>() { // from class: io.reactivex.rxkotlin.CompletableKt.mergeAllCompletables.1
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Completable apply(io.reactivex.Completable it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Completable mergeAllCompletables(io.reactivex.Flowable<io.reactivex.Completable> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return receiver.flatMapCompletable(new io.reactivex.functions.Function<io.reactivex.Completable, io.reactivex.CompletableSource>() { // from class: io.reactivex.rxkotlin.CompletableKt.mergeAllCompletables.2
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Completable apply(io.reactivex.Completable it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Completable concatAll(java.lang.Iterable<? extends io.reactivex.CompletableSource> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return io.reactivex.Completable.concat(receiver);
    }
}
