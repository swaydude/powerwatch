package kotlinx.coroutines.android;

/* JADX INFO: compiled from: AndroidExceptionPreHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-android"}, k = 1, mv = {1, 1, 13})
public final class AndroidExceptionPreHandler extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
    public AndroidExceptionPreHandler() {
        super(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        java.lang.reflect.Method method = kotlinx.coroutines.android.AndroidExceptionPreHandlerKt.getter;
        java.lang.Object objInvoke = method != null ? method.invoke(null, new java.lang.Object[0]) : null;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (java.lang.Thread.UncaughtExceptionHandler) (objInvoke instanceof java.lang.Thread.UncaughtExceptionHandler ? objInvoke : null);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(java.lang.Thread.currentThread(), exception);
        }
    }
}
