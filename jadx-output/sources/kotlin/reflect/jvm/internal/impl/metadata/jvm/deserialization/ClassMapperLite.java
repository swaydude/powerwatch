package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* JADX INFO: compiled from: ClassMapperLite.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ClassMapperLite {
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite INSTANCE = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite();
    private static final java.util.Map<java.lang.String, java.lang.String> map;

    static {
        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        kotlin.ranges.IntProgression intProgressionStep = kotlin.ranges.RangesKt.step(kotlin.collections.CollectionsKt.getIndices(listListOf), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if (step < 0 ? first >= last : first <= last) {
            while (true) {
                int i = first + 1;
                linkedHashMap.put("kotlin/" + ((java.lang.String) listListOf.get(first)), listListOf.get(i));
                linkedHashMap.put("kotlin/" + ((java.lang.String) listListOf.get(first)) + "Array", '[' + ((java.lang.String) listListOf.get(i)));
                if (first == last) {
                    break;
                } else {
                    first += step;
                }
            }
        }
        linkedHashMap.put("kotlin/Unit", "V");
        kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> function2 = new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite$map$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.lang.String str2) {
                invoke2(str, str2);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.String kotlinSimpleName, java.lang.String javaInternalName) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinSimpleName, "kotlinSimpleName");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaInternalName, "javaInternalName");
                linkedHashMap.put("kotlin/" + kotlinSimpleName, 'L' + javaInternalName + ';');
            }
        };
        function2.invoke2("Any", "java/lang/Object");
        function2.invoke2("Nothing", "java/lang/Void");
        function2.invoke2("Annotation", "java/lang/annotation/Annotation");
        for (java.lang.String str : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            function2.invoke2(str, "java/lang/" + str);
        }
        for (java.lang.String str2 : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            function2.invoke2("collections/" + str2, "java/util/" + str2);
            function2.invoke2("collections/Mutable" + str2, "java/util/" + str2);
        }
        function2.invoke2("collections/Iterable", "java/lang/Iterable");
        function2.invoke2("collections/MutableIterable", "java/lang/Iterable");
        function2.invoke2("collections/Map.Entry", "java/util/Map$Entry");
        function2.invoke2("collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i2 = 0; i2 <= 22; i2++) {
            function2.invoke2("Function" + i2, "kotlin/jvm/functions/Function" + i2);
            function2.invoke2("reflect/KFunction" + i2, "kotlin/reflect/KFunction");
        }
        for (java.lang.String str3 : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            function2.invoke2(str3 + ".Companion", "kotlin/jvm/internal/" + str3 + "CompanionObject");
        }
        map = linkedHashMap;
    }

    private ClassMapperLite() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String mapClass(java.lang.String classId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        java.lang.String str = map.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + kotlin.text.StringsKt.replace$default(classId, '.', kotlin.text.Typography.dollar, false, 4, (java.lang.Object) null) + ';';
    }
}
