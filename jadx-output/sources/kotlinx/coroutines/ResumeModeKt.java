package kotlinx.coroutines;

/* JADX INFO: compiled from: ResumeMode.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a-\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010\u0014\u001a\u0002H\u00122\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0016\u001a-\u0010\u0017\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010\u0014\u001a\u0002H\u00122\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0016\u001a(\u0010\u0018\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a(\u0010\u001b\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0018\u0010\f\u001a\u00020\r*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\r*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"MODE_ATOMIC_DEFAULT", "", "MODE_ATOMIC_DEFAULT$annotations", "()V", "MODE_CANCELLABLE", "MODE_CANCELLABLE$annotations", "MODE_DIRECT", "MODE_DIRECT$annotations", "MODE_IGNORE", "MODE_IGNORE$annotations", "MODE_UNDISPATCHED", "MODE_UNDISPATCHED$annotations", "isCancellableMode", "", "(I)Z", "isDispatchedMode", "resumeMode", "", "T", "Lkotlin/coroutines/Continuation;", "value", "mode", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;I)V", "resumeUninterceptedMode", "resumeUninterceptedWithExceptionMode", "exception", "", "resumeWithExceptionMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class ResumeModeKt {
    public static final int MODE_ATOMIC_DEFAULT = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_DIRECT = 2;
    public static final int MODE_IGNORE = 4;
    public static final int MODE_UNDISPATCHED = 3;

    public static /* synthetic */ void MODE_ATOMIC_DEFAULT$annotations() {
    }

    public static /* synthetic */ void MODE_CANCELLABLE$annotations() {
    }

    public static /* synthetic */ void MODE_DIRECT$annotations() {
    }

    public static /* synthetic */ void MODE_IGNORE$annotations() {
    }

    public static /* synthetic */ void MODE_UNDISPATCHED$annotations() {
    }

    public static final boolean isCancellableMode(int i) {
        return i == 1;
    }

    public static final boolean isDispatchedMode(int i) {
        return i == 0 || i == 1;
    }

    public static final <T> void resumeMode(kotlin.coroutines.Continuation<? super T> receiver$0, T t, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        if (i == 0) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            receiver$0.resumeWith(kotlin.Result.m13constructorimpl(t));
            return;
        }
        if (i == 1) {
            kotlinx.coroutines.DispatchedKt.resumeCancellable(receiver$0, t);
            return;
        }
        if (i == 2) {
            kotlinx.coroutines.DispatchedKt.resumeDirect(receiver$0, t);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            throw new java.lang.IllegalStateException(("Invalid mode " + i).toString());
        }
        kotlinx.coroutines.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.DispatchedContinuation) receiver$0;
        kotlin.coroutines.CoroutineContext context = dispatchedContinuation.getContext();
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, dispatchedContinuation.countOrElement);
        try {
            kotlin.coroutines.Continuation<T> continuation = dispatchedContinuation.continuation;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m13constructorimpl(t));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
        }
    }

    public static final <T> void resumeWithExceptionMode(kotlin.coroutines.Continuation<? super T> receiver$0, java.lang.Throwable exception, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        if (i == 0) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            receiver$0.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(exception)));
            return;
        }
        if (i == 1) {
            kotlinx.coroutines.DispatchedKt.resumeCancellableWithException(receiver$0, exception);
            return;
        }
        if (i == 2) {
            kotlinx.coroutines.DispatchedKt.resumeDirectWithException(receiver$0, exception);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            throw new java.lang.IllegalStateException(("Invalid mode " + i).toString());
        }
        kotlinx.coroutines.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.DispatchedContinuation) receiver$0;
        kotlin.coroutines.CoroutineContext context = dispatchedContinuation.getContext();
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, dispatchedContinuation.countOrElement);
        try {
            kotlin.coroutines.Continuation<T> continuation = dispatchedContinuation.continuation;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(exception, continuation))));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
        }
    }

    public static final <T> void resumeUninterceptedMode(kotlin.coroutines.Continuation<? super T> receiver$0, T t, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        if (i == 0) {
            kotlin.coroutines.Continuation continuationIntercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(receiver$0);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuationIntercepted.resumeWith(kotlin.Result.m13constructorimpl(t));
            return;
        }
        if (i == 1) {
            kotlinx.coroutines.DispatchedKt.resumeCancellable(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(receiver$0), t);
            return;
        }
        if (i == 2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            receiver$0.resumeWith(kotlin.Result.m13constructorimpl(t));
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            throw new java.lang.IllegalStateException(("Invalid mode " + i).toString());
        }
        kotlin.coroutines.CoroutineContext context = receiver$0.getContext();
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, null);
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            receiver$0.resumeWith(kotlin.Result.m13constructorimpl(t));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
        }
    }

    public static final <T> void resumeUninterceptedWithExceptionMode(kotlin.coroutines.Continuation<? super T> receiver$0, java.lang.Throwable exception, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        if (i == 0) {
            kotlin.coroutines.Continuation continuationIntercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(receiver$0);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuationIntercepted.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(exception)));
            return;
        }
        if (i == 1) {
            kotlinx.coroutines.DispatchedKt.resumeCancellableWithException(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(receiver$0), exception);
            return;
        }
        if (i == 2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            receiver$0.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(exception)));
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            throw new java.lang.IllegalStateException(("Invalid mode " + i).toString());
        }
        kotlin.coroutines.CoroutineContext context = receiver$0.getContext();
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, null);
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            receiver$0.resumeWith(kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(exception)));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
        }
    }
}
