package kotlinx.coroutines.intrinsics;

/* JADX INFO: compiled from: Cancellable.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0082\b\u001a>\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0007*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0003H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u001aR\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0007*\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\f2\u0006\u0010\r\u001a\u0002H\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0003H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"runSafely", "", "completion", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function0;", "startCoroutineCancellable", "T", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class CancellableKt {
    public static final <T> void startCoroutineCancellable(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> receiver$0, kotlin.coroutines.Continuation<? super T> completion) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(completion, "completion");
        try {
            kotlinx.coroutines.DispatchedKt.resumeCancellable(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(receiver$0, completion)), kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            completion.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th)));
        }
    }

    public static final <R, T> void startCoroutineCancellable(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> receiver$0, R r, kotlin.coroutines.Continuation<? super T> completion) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(completion, "completion");
        try {
            kotlinx.coroutines.DispatchedKt.resumeCancellable(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(receiver$0, r, completion)), kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            completion.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th)));
        }
    }

    private static final void runSafely(kotlin.coroutines.Continuation<?> continuation, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        try {
            function0.invoke();
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th)));
        }
    }
}
