package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: FakePureImplementationsProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FakePureImplementationsProvider {
    public static final kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider INSTANCE;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.FqName> pureImplementations;

    static {
        kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider fakePureImplementationsProvider = new kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider();
        INSTANCE = fakePureImplementationsProvider;
        pureImplementations = new java.util.HashMap<>();
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableList;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "FQ_NAMES.mutableList");
        fakePureImplementationsProvider.implementedWith(fqName, fakePureImplementationsProvider.fqNameListOf("java.util.ArrayList", "java.util.LinkedList"));
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableSet;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName2, "FQ_NAMES.mutableSet");
        fakePureImplementationsProvider.implementedWith(fqName2, fakePureImplementationsProvider.fqNameListOf("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        kotlin.reflect.jvm.internal.impl.name.FqName fqName3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableMap;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName3, "FQ_NAMES.mutableMap");
        fakePureImplementationsProvider.implementedWith(fqName3, fakePureImplementationsProvider.fqNameListOf("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        fakePureImplementationsProvider.implementedWith(new kotlin.reflect.jvm.internal.impl.name.FqName("java.util.function.Function"), fakePureImplementationsProvider.fqNameListOf("java.util.function.UnaryOperator"));
        fakePureImplementationsProvider.implementedWith(new kotlin.reflect.jvm.internal.impl.name.FqName("java.util.function.BiFunction"), fakePureImplementationsProvider.fqNameListOf("java.util.function.BinaryOperator"));
    }

    private FakePureImplementationsProvider() {
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName getPurelyImplementedInterface(kotlin.reflect.jvm.internal.impl.name.FqName classFqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classFqName, "classFqName");
        return pureImplementations.get(classFqName);
    }

    private final void implementedWith(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> list) {
        java.util.AbstractMap abstractMap = pureImplementations;
        for (java.lang.Object obj : list) {
            abstractMap.put(obj, fqName);
        }
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> fqNameListOf(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.name.FqName(str));
        }
        return arrayList;
    }
}
