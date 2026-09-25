package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext$Element;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public interface CoroutineExceptionHandler extends kotlin.coroutines.CoroutineContext.Element {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    public static final kotlinx.coroutines.CoroutineExceptionHandler.Companion INSTANCE = kotlinx.coroutines.CoroutineExceptionHandler.Companion.$$INSTANCE;

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public static final class DefaultImpls {
        public static <R> R fold(kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(operation, "operation");
            return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(coroutineExceptionHandler, r, operation);
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler, kotlin.coroutines.CoroutineContext.Key<E> key) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
            return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(coroutineExceptionHandler, key);
        }

        public static kotlin.coroutines.CoroutineContext minusKey(kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler, kotlin.coroutines.CoroutineContext.Key<?> key) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(coroutineExceptionHandler, key);
        }

        public static kotlin.coroutines.CoroutineContext plus(kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler, kotlin.coroutines.CoroutineContext context) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(coroutineExceptionHandler, context);
        }
    }

    void handleException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception);

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineExceptionHandler$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.CoroutineExceptionHandler> {
        static final /* synthetic */ kotlinx.coroutines.CoroutineExceptionHandler.Companion $$INSTANCE = new kotlinx.coroutines.CoroutineExceptionHandler.Companion();

        private Companion() {
        }
    }
}
