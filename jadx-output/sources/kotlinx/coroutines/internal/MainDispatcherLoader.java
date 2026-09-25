package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "()V", "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "loadMainDispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class MainDispatcherLoader {
    public static final kotlinx.coroutines.internal.MainDispatcherLoader INSTANCE;
    public static final kotlinx.coroutines.MainCoroutineDispatcher dispatcher;

    static {
        kotlinx.coroutines.internal.MainDispatcherLoader mainDispatcherLoader = new kotlinx.coroutines.internal.MainDispatcherLoader();
        INSTANCE = mainDispatcherLoader;
        dispatcher = mainDispatcherLoader.loadMainDispatcher();
    }

    private MainDispatcherLoader() {
    }

    private final kotlinx.coroutines.MainCoroutineDispatcher loadMainDispatcher() {
        java.lang.Object next;
        kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcherTryCreateDispatcher;
        try {
            java.util.ServiceLoader serviceLoaderLoad = java.util.ServiceLoader.load(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(serviceLoaderLoad, "ServiceLoader.load(clz, clz.classLoader)");
            java.util.List list = kotlin.collections.CollectionsKt.toList(serviceLoaderLoad);
            java.util.Iterator it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                int loadPriority = ((kotlinx.coroutines.internal.MainDispatcherFactory) next).getLoadPriority();
                while (it.hasNext()) {
                    java.lang.Object next2 = it.next();
                    int loadPriority2 = ((kotlinx.coroutines.internal.MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                }
            } else {
                next = null;
            }
            kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory = (kotlinx.coroutines.internal.MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (mainCoroutineDispatcherTryCreateDispatcher = kotlinx.coroutines.internal.MainDispatchersKt.tryCreateDispatcher(mainDispatcherFactory, list)) == null) ? new kotlinx.coroutines.internal.MissingMainCoroutineDispatcher(null, null, 2, null) : mainCoroutineDispatcherTryCreateDispatcher;
        } catch (java.lang.Throwable th) {
            return new kotlinx.coroutines.internal.MissingMainCoroutineDispatcher(th, null, 2, null);
        }
    }
}
