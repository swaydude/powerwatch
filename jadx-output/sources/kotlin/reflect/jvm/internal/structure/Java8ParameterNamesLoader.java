package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaMember.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;", "", "()V", "cache", "Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "getCache", "()Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "setCache", "(Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;)V", "buildCache", "member", "Ljava/lang/reflect/Member;", "loadParameterNames", "", "", "Cache", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
final class Java8ParameterNamesLoader {
    public static final kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader INSTANCE = new kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader();
    private static kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader.Cache cache;

    /* JADX INFO: compiled from: ReflectJavaMember.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "", "getParameters", "Ljava/lang/reflect/Method;", "getName", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetName", "()Ljava/lang/reflect/Method;", "getGetParameters", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
    public static final class Cache {
        private final java.lang.reflect.Method getName;
        private final java.lang.reflect.Method getParameters;

        public Cache(java.lang.reflect.Method method, java.lang.reflect.Method method2) {
            this.getParameters = method;
            this.getName = method2;
        }

        public final java.lang.reflect.Method getGetName() {
            return this.getName;
        }

        public final java.lang.reflect.Method getGetParameters() {
            return this.getParameters;
        }
    }

    private Java8ParameterNamesLoader() {
    }

    public final kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader.Cache buildCache(java.lang.reflect.Member member) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(member, "member");
        java.lang.Class<?> cls = member.getClass();
        try {
            return new kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader.Cache(cls.getMethod("getParameters", new java.lang.Class[0]), kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getSafeClassLoader(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new java.lang.Class[0]));
        } catch (java.lang.NoSuchMethodException unused) {
            return new kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader.Cache(null, null);
        }
    }

    public final java.util.List<java.lang.String> loadParameterNames(java.lang.reflect.Member member) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method getName;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(member, "member");
        kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader.Cache cacheBuildCache = cache;
        if (cacheBuildCache == null) {
            cacheBuildCache = buildCache(member);
            cache = cacheBuildCache;
        }
        java.lang.reflect.Method getParameters = cacheBuildCache.getGetParameters();
        if (getParameters == null || (getName = cacheBuildCache.getGetName()) == null) {
            return null;
        }
        java.lang.Object objInvoke = getParameters.invoke(member, new java.lang.Object[0]);
        if (objInvoke == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
        }
        java.lang.Object[] objArr = (java.lang.Object[]) objInvoke;
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            java.lang.Object objInvoke2 = getName.invoke(obj, new java.lang.Object[0]);
            if (objInvoke2 == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
            arrayList.add((java.lang.String) objInvoke2);
        }
        return arrayList;
    }
}
