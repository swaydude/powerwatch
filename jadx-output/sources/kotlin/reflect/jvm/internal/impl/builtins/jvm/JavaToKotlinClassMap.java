package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* JADX INFO: compiled from: JavaToKotlinClassMap.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaToKotlinClassMap {
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId FUNCTION_N_CLASS_ID;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName FUNCTION_N_FQ_NAME;
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap INSTANCE;
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId K_FUNCTION_CLASS_ID;
    private static final java.lang.String NUMBERED_FUNCTION_PREFIX;
    private static final java.lang.String NUMBERED_K_FUNCTION_PREFIX;
    private static final java.lang.String NUMBERED_K_SUSPEND_FUNCTION_PREFIX;
    private static final java.lang.String NUMBERED_SUSPEND_FUNCTION_PREFIX;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.ClassId> javaToKotlin;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.ClassId> kotlinToJava;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping> mutabilityMappings;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.FqName> mutableToReadOnly;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.FqName> readOnlyToMutable;

    static {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        NUMBERED_FUNCTION_PREFIX = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.Function.getPackageFqName().toString() + "." + kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.Function.getClassNamePrefix();
        NUMBERED_K_FUNCTION_PREFIX = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.KFunction.getPackageFqName().toString() + "." + kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.KFunction.getClassNamePrefix();
        NUMBERED_SUSPEND_FUNCTION_PREFIX = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.SuspendFunction.getPackageFqName().toString() + "." + kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.SuspendFunction.getClassNamePrefix();
        NUMBERED_K_SUSPEND_FUNCTION_PREFIX = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.KSuspendFunction.getPackageFqName().toString() + "." + kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.KSuspendFunction.getClassNamePrefix();
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.functions.FunctionN"));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(FqName(…vm.functions.FunctionN\"))");
        FUNCTION_N_CLASS_ID = classId;
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameAsSingleFqName = classId.asSingleFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameAsSingleFqName, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        FUNCTION_N_FQ_NAME = fqNameAsSingleFqName;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.reflect.KFunction"));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId2, "ClassId.topLevel(FqName(…tlin.reflect.KFunction\"))");
        K_FUNCTION_CLASS_ID = classId2;
        javaToKotlin = new java.util.HashMap<>();
        kotlinToJava = new java.util.HashMap<>();
        mutableToReadOnly = new java.util.HashMap<>();
        readOnlyToMutable = new java.util.HashMap<>();
        kotlin.reflect.jvm.internal.impl.name.ClassId classId3 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.iterable);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId3, "ClassId.topLevel(FQ_NAMES.iterable)");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableIterable;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "FQ_NAMES.mutableIterable");
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId3.getPackageFqName();
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName2 = classId3.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName2, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameTail = kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(fqName, packageFqName2);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId4 = new kotlin.reflect.jvm.internal.impl.name.ClassId(packageFqName, fqNameTail, false);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId5 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.iterator);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId5, "ClassId.topLevel(FQ_NAMES.iterator)");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableIterator;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName2, "FQ_NAMES.mutableIterator");
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName3 = classId5.getPackageFqName();
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName4 = classId5.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName4, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId6 = new kotlin.reflect.jvm.internal.impl.name.ClassId(packageFqName3, kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(fqName2, packageFqName4), false);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId7 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.collection);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId7, "ClassId.topLevel(FQ_NAMES.collection)");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableCollection;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName3, "FQ_NAMES.mutableCollection");
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName5 = classId7.getPackageFqName();
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName6 = classId7.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName6, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId8 = new kotlin.reflect.jvm.internal.impl.name.ClassId(packageFqName5, kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(fqName3, packageFqName6), false);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId9 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.list);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId9, "ClassId.topLevel(FQ_NAMES.list)");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableList;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName4, "FQ_NAMES.mutableList");
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName7 = classId9.getPackageFqName();
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName8 = classId9.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName8, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId10 = new kotlin.reflect.jvm.internal.impl.name.ClassId(packageFqName7, kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(fqName4, packageFqName8), false);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId11 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.set);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId11, "ClassId.topLevel(FQ_NAMES.set)");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName5 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableSet;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName5, "FQ_NAMES.mutableSet");
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName9 = classId11.getPackageFqName();
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName10 = classId11.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName10, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId12 = new kotlin.reflect.jvm.internal.impl.name.ClassId(packageFqName9, kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(fqName5, packageFqName10), false);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId13 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.listIterator);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId13, "ClassId.topLevel(FQ_NAMES.listIterator)");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName6 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableListIterator;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName6, "FQ_NAMES.mutableListIterator");
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName11 = classId13.getPackageFqName();
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName12 = classId13.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName12, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId14 = new kotlin.reflect.jvm.internal.impl.name.ClassId(packageFqName11, kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(fqName6, packageFqName12), false);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId15 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.map);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId15, "ClassId.topLevel(FQ_NAMES.map)");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName7 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableMap;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName7, "FQ_NAMES.mutableMap");
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName13 = classId15.getPackageFqName();
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName14 = classId15.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName14, "kotlinReadOnly.packageFqName");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId16 = new kotlin.reflect.jvm.internal.impl.name.ClassId(packageFqName13, kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(fqName7, packageFqName14), false);
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdCreateNestedClassId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.map).createNestedClassId(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mapEntry.shortName());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classIdCreateNestedClassId, "ClassId.topLevel(FQ_NAME…MES.mapEntry.shortName())");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName8 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableMapEntry;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName8, "FQ_NAMES.mutableMapEntry");
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName15 = classIdCreateNestedClassId.getPackageFqName();
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName16 = classIdCreateNestedClassId.getPackageFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(packageFqName16, "kotlinReadOnly.packageFqName");
        java.util.List<kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping> listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping[]{new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.classId(java.lang.Iterable.class), classId3, classId4), new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.classId(java.util.Iterator.class), classId5, classId6), new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.classId(java.util.Collection.class), classId7, classId8), new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.classId(java.util.List.class), classId9, classId10), new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.classId(java.util.Set.class), classId11, classId12), new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.classId(java.util.ListIterator.class), classId13, classId14), new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.classId(java.util.Map.class), classId15, classId16), new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.classId(java.util.Map.Entry.class), classIdCreateNestedClassId, new kotlin.reflect.jvm.internal.impl.name.ClassId(packageFqName15, kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(fqName8, packageFqName16), false))});
        mutabilityMappings = listListOf;
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.any;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameUnsafe, "FQ_NAMES.any");
        javaToKotlinClassMap.addTopLevel(java.lang.Object.class, fqNameUnsafe);
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.string;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameUnsafe2, "FQ_NAMES.string");
        javaToKotlinClassMap.addTopLevel(java.lang.String.class, fqNameUnsafe2);
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.charSequence;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameUnsafe3, "FQ_NAMES.charSequence");
        javaToKotlinClassMap.addTopLevel(java.lang.CharSequence.class, fqNameUnsafe3);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName9 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.throwable;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName9, "FQ_NAMES.throwable");
        javaToKotlinClassMap.addTopLevel(java.lang.Throwable.class, fqName9);
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.cloneable;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameUnsafe4, "FQ_NAMES.cloneable");
        javaToKotlinClassMap.addTopLevel(java.lang.Cloneable.class, fqNameUnsafe4);
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe5 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.number;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameUnsafe5, "FQ_NAMES.number");
        javaToKotlinClassMap.addTopLevel(java.lang.Number.class, fqNameUnsafe5);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName10 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.comparable;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName10, "FQ_NAMES.comparable");
        javaToKotlinClassMap.addTopLevel(java.lang.Comparable.class, fqName10);
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe6 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES._enum;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameUnsafe6, "FQ_NAMES._enum");
        javaToKotlinClassMap.addTopLevel(java.lang.Enum.class, fqNameUnsafe6);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName11 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.annotation;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName11, "FQ_NAMES.annotation");
        javaToKotlinClassMap.addTopLevel(java.lang.annotation.Annotation.class, fqName11);
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping> it = listListOf.iterator();
        while (it.hasNext()) {
            javaToKotlinClassMap.addMapping(it.next());
        }
        for (kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType : kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.values()) {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId17 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(jvmPrimitiveType.getWrapperFqName());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId17, "ClassId.topLevel(jvmType.wrapperFqName)");
            kotlin.reflect.jvm.internal.impl.name.ClassId classId18 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.getPrimitiveFqName(jvmPrimitiveType.getPrimitiveType()));
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId18, "ClassId.topLevel(KotlinB…e(jvmType.primitiveType))");
            javaToKotlinClassMap.add(classId17, classId18);
        }
        for (kotlin.reflect.jvm.internal.impl.name.ClassId classId19 : kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId20 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.internal." + classId19.getShortClassName().asString() + "CompanionObject"));
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId20, "ClassId.topLevel(FqName(…g() + \"CompanionObject\"))");
            kotlin.reflect.jvm.internal.impl.name.ClassId classIdCreateNestedClassId2 = classId19.createNestedClassId(kotlin.reflect.jvm.internal.impl.name.SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classIdCreateNestedClassId2, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            javaToKotlinClassMap.add(classId20, classIdCreateNestedClassId2);
        }
        for (int i = 0; i < 23; i++) {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId21 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.functions.Function" + i));
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId21, "ClassId.topLevel(FqName(…m.functions.Function$i\"))");
            kotlin.reflect.jvm.internal.impl.name.ClassId functionClassId = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.getFunctionClassId(i);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(functionClassId, "KotlinBuiltIns.getFunctionClassId(i)");
            javaToKotlinClassMap.add(classId21, functionClassId);
            javaToKotlinClassMap.addKotlinToJava(new kotlin.reflect.jvm.internal.impl.name.FqName(NUMBERED_K_FUNCTION_PREFIX + i), K_FUNCTION_CLASS_ID);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind kind = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.KSuspendFunction;
            javaToKotlinClassMap.addKotlinToJava(new kotlin.reflect.jvm.internal.impl.name.FqName((kind.getPackageFqName().toString() + "." + kind.getClassNamePrefix()) + i2), K_FUNCTION_CLASS_ID);
        }
        kotlin.reflect.jvm.internal.impl.name.FqName safe = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.nothing.toSafe();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(safe, "FQ_NAMES.nothing.toSafe()");
        javaToKotlinClassMap.addKotlinToJava(safe, javaToKotlinClassMap.classId(java.lang.Void.class));
    }

    private JavaToKotlinClassMap() {
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName getFUNCTION_N_FQ_NAME() {
        return FUNCTION_N_FQ_NAME;
    }

    /* JADX INFO: compiled from: JavaToKotlinClassMap.kt */
    public static final class PlatformMutabilityMapping {
        private final kotlin.reflect.jvm.internal.impl.name.ClassId javaClass;
        private final kotlin.reflect.jvm.internal.impl.name.ClassId kotlinMutable;
        private final kotlin.reflect.jvm.internal.impl.name.ClassId kotlinReadOnly;

        public final kotlin.reflect.jvm.internal.impl.name.ClassId component1() {
            return this.javaClass;
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId component2() {
            return this.kotlinReadOnly;
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId component3() {
            return this.kotlinMutable;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.javaClass, platformMutabilityMapping.javaClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.kotlinReadOnly, platformMutabilityMapping.kotlinReadOnly) && kotlin.jvm.internal.Intrinsics.areEqual(this.kotlinMutable, platformMutabilityMapping.kotlinMutable);
        }

        public int hashCode() {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = this.javaClass;
            int iHashCode = (classId != null ? classId.hashCode() : 0) * 31;
            kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = this.kotlinReadOnly;
            int iHashCode2 = (iHashCode + (classId2 != null ? classId2.hashCode() : 0)) * 31;
            kotlin.reflect.jvm.internal.impl.name.ClassId classId3 = this.kotlinMutable;
            return iHashCode2 + (classId3 != null ? classId3.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.javaClass + ", kotlinReadOnly=" + this.kotlinReadOnly + ", kotlinMutable=" + this.kotlinMutable + ")";
        }

        public PlatformMutabilityMapping(kotlin.reflect.jvm.internal.impl.name.ClassId javaClass, kotlin.reflect.jvm.internal.impl.name.ClassId kotlinReadOnly, kotlin.reflect.jvm.internal.impl.name.ClassId kotlinMutable) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaClass, "javaClass");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinReadOnly, "kotlinReadOnly");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinMutable, "kotlinMutable");
            this.javaClass = javaClass;
            this.kotlinReadOnly = kotlinReadOnly;
            this.kotlinMutable = kotlinMutable;
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId getJavaClass() {
            return this.javaClass;
        }
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping> getMutabilityMappings() {
        return mutabilityMappings;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId mapJavaToKotlin(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return javaToKotlin.get(fqName.toUnsafe());
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mapJavaToKotlin$default(kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap, kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = (java.lang.Integer) null;
        }
        return javaToKotlinClassMap.mapJavaToKotlin(fqName, kotlinBuiltIns, num);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mapJavaToKotlin(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builtIns, "builtIns");
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdMapJavaToKotlin = (num == null || !kotlin.jvm.internal.Intrinsics.areEqual(fqName, FUNCTION_N_FQ_NAME)) ? mapJavaToKotlin(fqName) : kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.getFunctionClassId(num.intValue());
        if (classIdMapJavaToKotlin != null) {
            return builtIns.getBuiltInClassByFqName(classIdMapJavaToKotlin.asSingleFqName());
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId mapKotlinToJava(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kotlinFqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinFqName, "kotlinFqName");
        if (!isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_FUNCTION_PREFIX) && !isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_SUSPEND_FUNCTION_PREFIX)) {
            if (!isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_K_FUNCTION_PREFIX) && !isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_K_SUSPEND_FUNCTION_PREFIX)) {
                return kotlinToJava.get(kotlinFqName);
            }
            return K_FUNCTION_CLASS_ID;
        }
        return FUNCTION_N_CLASS_ID;
    }

    private final boolean isKotlinFunctionWithBigArity(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe, java.lang.String str) {
        java.lang.Integer intOrNull;
        java.lang.String strAsString = fqNameUnsafe.asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "kotlinFqName.asString()");
        java.lang.String strSubstringAfter = kotlin.text.StringsKt.substringAfter(strAsString, str, "");
        java.lang.String str2 = strSubstringAfter;
        return (str2.length() > 0) && !kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) str2, '0', false, 2, (java.lang.Object) null) && (intOrNull = kotlin.text.StringsKt.toIntOrNull(strSubstringAfter)) != null && intOrNull.intValue() >= 23;
    }

    private final void addMapping(kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdComponent1 = platformMutabilityMapping.component1();
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdComponent2 = platformMutabilityMapping.component2();
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdComponent3 = platformMutabilityMapping.component3();
        add(classIdComponent1, classIdComponent2);
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameAsSingleFqName = classIdComponent3.asSingleFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameAsSingleFqName, "mutableClassId.asSingleFqName()");
        addKotlinToJava(fqNameAsSingleFqName, classIdComponent1);
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameAsSingleFqName2 = classIdComponent2.asSingleFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameAsSingleFqName2, "readOnlyClassId.asSingleFqName()");
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameAsSingleFqName3 = classIdComponent3.asSingleFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameAsSingleFqName3, "mutableClassId.asSingleFqName()");
        java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.FqName> map = mutableToReadOnly;
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe = classIdComponent3.asSingleFqName().toUnsafe();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unsafe, "mutableClassId.asSingleFqName().toUnsafe()");
        map.put(unsafe, fqNameAsSingleFqName2);
        java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.FqName> map2 = readOnlyToMutable;
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe2 = fqNameAsSingleFqName2.toUnsafe();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unsafe2, "readOnlyFqName.toUnsafe()");
        map2.put(unsafe2, fqNameAsSingleFqName3);
    }

    private final void add(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.ClassId classId2) {
        addJavaToKotlin(classId, classId2);
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameAsSingleFqName = classId2.asSingleFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameAsSingleFqName, "kotlinClassId.asSingleFqName()");
        addKotlinToJava(fqNameAsSingleFqName, classId);
    }

    private final void addTopLevel(java.lang.Class<?> cls, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        kotlin.reflect.jvm.internal.impl.name.FqName safe = fqNameUnsafe.toSafe();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(safe, "kotlinFqName.toSafe()");
        addTopLevel(cls, safe);
    }

    private final void addTopLevel(java.lang.Class<?> cls, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = classId(cls);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(fqName);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId2, "ClassId.topLevel(kotlinFqName)");
        add(classId, classId2);
    }

    private final void addJavaToKotlin(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.ClassId classId2) {
        java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.ClassId> map = javaToKotlin;
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe = classId.asSingleFqName().toUnsafe();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unsafe, "javaClassId.asSingleFqName().toUnsafe()");
        map.put(unsafe, classId2);
    }

    private final void addKotlinToJava(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.ClassId> map = kotlinToJava;
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe = fqName.toUnsafe();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unsafe, "kotlinFqNameUnsafe.toUnsafe()");
        map.put(unsafe, classId);
    }

    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> mapPlatformClass(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builtIns, "builtIns");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorMapJavaToKotlin$default = mapJavaToKotlin$default(this, fqName, builtIns, null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            return kotlin.collections.SetsKt.emptySet();
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = readOnlyToMutable.get(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(classDescriptorMapJavaToKotlin$default));
        if (fqName2 == null) {
            return kotlin.collections.SetsKt.setOf(classDescriptorMapJavaToKotlin$default);
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName2, "readOnlyToMutable[kotlin…eturn setOf(kotlinAnalog)");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = builtIns.getBuiltInClassByFqName(fqName2);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(builtInClassByFqName, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor[]{classDescriptorMapJavaToKotlin$default, builtInClassByFqName});
    }

    public final boolean isMutable(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.FqName> map = mutableToReadOnly;
        if (map != null) {
            return map.containsKey(fqNameUnsafe);
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    public final boolean isMutable(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mutable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(mutable, "mutable");
        return isMutable(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(mutable));
    }

    public final boolean isMutable(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = kotlin.reflect.jvm.internal.impl.types.TypeUtils.getClassDescriptor(type);
        return classDescriptor != null && isMutable(classDescriptor);
    }

    public final boolean isReadOnly(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.FqName> map = readOnlyToMutable;
        if (map != null) {
            return map.containsKey(fqNameUnsafe);
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    public final boolean isReadOnly(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor readOnly) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(readOnly, "readOnly");
        return isReadOnly(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(readOnly));
    }

    public final boolean isReadOnly(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = kotlin.reflect.jvm.internal.impl.types.TypeUtils.getClassDescriptor(type);
        return classDescriptor != null && isReadOnly(classDescriptor);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor convertMutableToReadOnly(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mutable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(mutable, "mutable");
        return convertToOppositeMutability(mutable, mutableToReadOnly, "mutable");
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor convertReadOnlyToMutable(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor readOnly) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(readOnly, "readOnly");
        return convertToOppositeMutability(readOnly, readOnlyToMutable, "read-only");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.name.ClassId classId(java.lang.Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        java.lang.Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName(cls.getCanonicalName()));
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(FqName(clazz.canonicalName))");
            return classId;
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdCreateNestedClassId = classId(declaringClass).createNestedClassId(kotlin.reflect.jvm.internal.impl.name.Name.identifier(cls.getSimpleName()));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classIdCreateNestedClassId, "classId(outer).createNes…tifier(clazz.simpleName))");
        return classIdCreateNestedClassId;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor convertToOppositeMutability(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.FqName> map, java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = classDescriptor;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = map.get(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classDescriptor2));
        if (fqName == null) {
            throw new java.lang.IllegalArgumentException("Given class " + classDescriptor + " is not a " + str + " collection");
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(classDescriptor2).getBuiltInClassByFqName(fqName);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(builtInClassByFqName, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
        return builtInClassByFqName;
    }
}
