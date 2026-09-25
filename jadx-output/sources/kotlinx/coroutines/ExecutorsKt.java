package kotlinx.coroutines;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0006"}, d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "from", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/ExecutorService;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class ExecutorsKt {
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher from(java.util.concurrent.ExecutorService receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcherFrom = from((java.util.concurrent.Executor) receiver$0);
        if (coroutineDispatcherFrom != null) {
            return (kotlinx.coroutines.ExecutorCoroutineDispatcher) coroutineDispatcherFrom;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ExecutorCoroutineDispatcher");
    }

    public static final kotlinx.coroutines.CoroutineDispatcher from(java.util.concurrent.Executor receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl(receiver$0);
    }
}
