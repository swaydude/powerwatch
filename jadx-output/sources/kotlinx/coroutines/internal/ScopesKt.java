package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"tryRecover", "", "Lkotlinx/coroutines/AbstractCoroutine;", "exception", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class ScopesKt {
    public static final java.lang.Throwable tryRecover(kotlinx.coroutines.AbstractCoroutine<?> receiver$0, java.lang.Throwable exception) {
        kotlin.coroutines.Continuation<T> continuation;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        if (!(receiver$0 instanceof kotlinx.coroutines.internal.ScopeCoroutine)) {
            receiver$0 = null;
        }
        kotlinx.coroutines.internal.ScopeCoroutine scopeCoroutine = (kotlinx.coroutines.internal.ScopeCoroutine) receiver$0;
        return (scopeCoroutine == null || (continuation = scopeCoroutine.uCont) == 0) ? exception : kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(exception, continuation);
    }
}
