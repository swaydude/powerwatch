package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u001a\b\u0004\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086\b\u001a$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u001a\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0000¨\u0006\u0010"}, d2 = {"CoroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handler", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext;", "", "", "handleCoroutineException", "context", "exception", "caller", "Lkotlinx/coroutines/Job;", "handleExceptionViaHandler", "handlerException", "originalException", "thrownException", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class CoroutineExceptionHandlerKt {
    public static /* synthetic */ void handleCoroutineException$default(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th, kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            job = (kotlinx.coroutines.Job) null;
        }
        handleCoroutineException(coroutineContext, th, job);
    }

    public static final void handleCoroutineException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception, kotlinx.coroutines.Job job) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        if (exception instanceof java.util.concurrent.CancellationException) {
            return;
        }
        kotlinx.coroutines.Job job2 = (kotlinx.coroutines.Job) context.get(kotlinx.coroutines.Job.INSTANCE);
        if (job2 == null || job2 == job || !job2.cancel(exception)) {
            handleExceptionViaHandler(context, exception);
        }
    }

    public static final void handleExceptionViaHandler(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        try {
            kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = (kotlinx.coroutines.CoroutineExceptionHandler) context.get(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(context, exception);
            } else {
                kotlinx.coroutines.CoroutineExceptionHandlerImplKt.handleCoroutineExceptionImpl(context, exception);
            }
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerImplKt.handleCoroutineExceptionImpl(context, handlerException(exception, th));
        }
    }

    public static final java.lang.Throwable handlerException(java.lang.Throwable originalException, java.lang.Throwable thrownException) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(originalException, "originalException");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(thrownException, "thrownException");
        if (originalException == thrownException) {
            return originalException;
        }
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", thrownException);
        kotlin.ExceptionsKt.addSuppressed(runtimeException, originalException);
        return runtimeException;
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static final class AnonymousClass1 extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
        final /* synthetic */ kotlin.jvm.functions.Function2 $handler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kotlin.jvm.functions.Function2 function2, kotlin.coroutines.CoroutineContext.Key key) {
            super(key);
            this.$handler = function2;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
            this.$handler.invoke(context, exception);
        }
    }

    public static final kotlinx.coroutines.CoroutineExceptionHandler CoroutineExceptionHandler(kotlin.jvm.functions.Function2<? super kotlin.coroutines.CoroutineContext, ? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(handler, "handler");
        return new kotlinx.coroutines.CoroutineExceptionHandlerKt.AnonymousClass1(handler, kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
    }
}
