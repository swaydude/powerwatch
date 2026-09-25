package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"handlers", "", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleCoroutineExceptionImpl", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class CoroutineExceptionHandlerImplKt {
    private static final java.util.List<kotlinx.coroutines.CoroutineExceptionHandler> handlers;

    static {
        java.util.ServiceLoader serviceLoaderLoad = java.util.ServiceLoader.load(kotlinx.coroutines.CoroutineExceptionHandler.class, kotlinx.coroutines.CoroutineExceptionHandler.class.getClassLoader());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(serviceLoaderLoad, "ServiceLoader.load(servi…serviceClass.classLoader)");
        handlers = kotlin.collections.CollectionsKt.toList(serviceLoaderLoad);
    }

    public static final void handleCoroutineExceptionImpl(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        java.util.Iterator<kotlinx.coroutines.CoroutineExceptionHandler> it = handlers.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(context, exception);
            } catch (java.lang.Throwable th) {
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(currentThread, "currentThread");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, kotlinx.coroutines.CoroutineExceptionHandlerKt.handlerException(exception, th));
            }
        }
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(currentThread2, "currentThread");
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, exception);
    }
}
