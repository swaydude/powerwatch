package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: kClassCache.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0000\"*\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/pcollections/HashPMap;", "", "kotlin.jvm.PlatformType", "", "clearKClassCache", "", "getOrCreateKotlinClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "jClass", "Ljava/lang/Class;", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class KClassCacheKt {
    private static kotlin.reflect.jvm.internal.pcollections.HashPMap<java.lang.String, java.lang.Object> K_CLASS_CACHE;

    static {
        kotlin.reflect.jvm.internal.pcollections.HashPMap<java.lang.String, java.lang.Object> hashPMapEmpty = kotlin.reflect.jvm.internal.pcollections.HashPMap.empty();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(hashPMapEmpty, "HashPMap.empty<String, Any>()");
        K_CLASS_CACHE = hashPMapEmpty;
    }

    public static final <T> kotlin.reflect.jvm.internal.KClassImpl<T> getOrCreateKotlinClass(java.lang.Class<T> jClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jClass, "jClass");
        java.lang.String name = jClass.getName();
        java.lang.Object obj = K_CLASS_CACHE.get(name);
        if (obj instanceof java.lang.ref.WeakReference) {
            kotlin.reflect.jvm.internal.KClassImpl<T> kClassImpl = (kotlin.reflect.jvm.internal.KClassImpl) ((java.lang.ref.WeakReference) obj).get();
            if (kotlin.jvm.internal.Intrinsics.areEqual(kClassImpl != null ? kClassImpl.getJClass() : null, jClass)) {
                return kClassImpl;
            }
        } else if (obj != null) {
            for (java.lang.ref.WeakReference weakReference : (java.lang.ref.WeakReference[]) obj) {
                kotlin.reflect.jvm.internal.KClassImpl<T> kClassImpl2 = (kotlin.reflect.jvm.internal.KClassImpl) weakReference.get();
                if (kotlin.jvm.internal.Intrinsics.areEqual(kClassImpl2 != null ? kClassImpl2.getJClass() : null, jClass)) {
                    return kClassImpl2;
                }
            }
            int length = ((java.lang.Object[]) obj).length;
            java.lang.ref.WeakReference[] weakReferenceArr = new java.lang.ref.WeakReference[length + 1];
            java.lang.System.arraycopy(obj, 0, weakReferenceArr, 0, length);
            kotlin.reflect.jvm.internal.KClassImpl<T> kClassImpl3 = new kotlin.reflect.jvm.internal.KClassImpl<>(jClass);
            weakReferenceArr[length] = new java.lang.ref.WeakReference(kClassImpl3);
            kotlin.reflect.jvm.internal.pcollections.HashPMap<java.lang.String, java.lang.Object> hashPMapPlus = K_CLASS_CACHE.plus(name, weakReferenceArr);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(hashPMapPlus, "K_CLASS_CACHE.plus(name, newArray)");
            K_CLASS_CACHE = hashPMapPlus;
            return kClassImpl3;
        }
        kotlin.reflect.jvm.internal.KClassImpl<T> kClassImpl4 = new kotlin.reflect.jvm.internal.KClassImpl<>(jClass);
        kotlin.reflect.jvm.internal.pcollections.HashPMap<java.lang.String, java.lang.Object> hashPMapPlus2 = K_CLASS_CACHE.plus(name, new java.lang.ref.WeakReference(kClassImpl4));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(hashPMapPlus2, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        K_CLASS_CACHE = hashPMapPlus2;
        return kClassImpl4;
    }

    public static final void clearKClassCache() {
        kotlin.reflect.jvm.internal.pcollections.HashPMap<java.lang.String, java.lang.Object> hashPMapEmpty = kotlin.reflect.jvm.internal.pcollections.HashPMap.empty();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(hashPMapEmpty, "HashPMap.empty()");
        K_CLASS_CACHE = hashPMapEmpty;
    }
}
