package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: moduleByClassLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\bH\u0000\" \u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"moduleByClassLoader", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "Ljava/lang/ref/WeakReference;", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "clearModuleByClassLoaderCache", "", "getOrCreateModule", "Ljava/lang/Class;", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class ModuleByClassLoaderKt {
    private static final java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.WeakClassLoaderBox, java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.components.RuntimeModuleData>> moduleByClassLoader = new java.util.concurrent.ConcurrentHashMap();

    public static final kotlin.reflect.jvm.internal.components.RuntimeModuleData getOrCreateModule(java.lang.Class<?> getOrCreateModule) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getOrCreateModule, "$this$getOrCreateModule");
        java.lang.ClassLoader safeClassLoader = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getSafeClassLoader(getOrCreateModule);
        kotlin.reflect.jvm.internal.WeakClassLoaderBox weakClassLoaderBox = new kotlin.reflect.jvm.internal.WeakClassLoaderBox(safeClassLoader);
        java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.WeakClassLoaderBox, java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.components.RuntimeModuleData>> concurrentMap = moduleByClassLoader;
        java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.components.RuntimeModuleData> weakReference = concurrentMap.get(weakClassLoaderBox);
        if (weakReference != null) {
            kotlin.reflect.jvm.internal.components.RuntimeModuleData it = weakReference.get();
            if (it != null) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                return it;
            }
            concurrentMap.remove(weakClassLoaderBox, weakReference);
        }
        kotlin.reflect.jvm.internal.components.RuntimeModuleData runtimeModuleDataCreate = kotlin.reflect.jvm.internal.components.RuntimeModuleData.INSTANCE.create(safeClassLoader);
        while (true) {
            try {
                java.util.concurrent.ConcurrentMap<kotlin.reflect.jvm.internal.WeakClassLoaderBox, java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.components.RuntimeModuleData>> concurrentMap2 = moduleByClassLoader;
                java.lang.ref.WeakReference<kotlin.reflect.jvm.internal.components.RuntimeModuleData> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(weakClassLoaderBox, new java.lang.ref.WeakReference<>(runtimeModuleDataCreate));
                if (weakReferencePutIfAbsent != null) {
                    kotlin.reflect.jvm.internal.components.RuntimeModuleData runtimeModuleData = weakReferencePutIfAbsent.get();
                    if (runtimeModuleData == null) {
                        concurrentMap2.remove(weakClassLoaderBox, weakReferencePutIfAbsent);
                    } else {
                        weakClassLoaderBox.setTemporaryStrongRef((java.lang.ClassLoader) null);
                        return runtimeModuleData;
                    }
                } else {
                    weakClassLoaderBox.setTemporaryStrongRef((java.lang.ClassLoader) null);
                    return runtimeModuleDataCreate;
                }
            } catch (java.lang.Throwable th) {
                weakClassLoaderBox.setTemporaryStrongRef((java.lang.ClassLoader) null);
                throw th;
            }
        }
    }

    public static final void clearModuleByClassLoaderCache() {
        moduleByClassLoader.clear();
    }
}
