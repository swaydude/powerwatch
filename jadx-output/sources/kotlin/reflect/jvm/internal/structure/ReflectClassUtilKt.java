package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: reflectClassUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010#\u001a\u0006\u0012\u0002\b\u00030\u0002*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010$\u001a\u00020%*\u0006\u0012\u0002\b\u00030\u0002\"&\u0010\u0000\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\t\u001a \u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\n\u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0002\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0019\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001c¨\u0006&"}, d2 = {"FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "PRIMITIVE_CLASSES", "", "Lkotlin/reflect/KClass;", "", "PRIMITIVE_TO_WRAPPER", "WRAPPER_TO_PRIMITIVE", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/name/ClassId;", "desc", "", "getDesc", "(Ljava/lang/Class;)Ljava/lang/String;", "functionClassArity", "getFunctionClassArity", "(Ljava/lang/Class;)Ljava/lang/Integer;", "parameterizedTypeArguments", "Ljava/lang/reflect/Type;", "getParameterizedTypeArguments", "(Ljava/lang/reflect/Type;)Ljava/util/List;", "primitiveByWrapper", "getPrimitiveByWrapper", "(Ljava/lang/Class;)Ljava/lang/Class;", "safeClassLoader", "Ljava/lang/ClassLoader;", "getSafeClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "wrapperByPrimitive", "getWrapperByPrimitive", "createArrayType", "isEnumClassOrSpecializedEnumEntryClass", "", "descriptors.runtime"}, k = 2, mv = {1, 1, 15})
public final class ReflectClassUtilKt {
    private static final java.util.Map<java.lang.Class<? extends kotlin.Function<?>>, java.lang.Integer> FUNCTION_CLASSES;
    private static final java.util.List<kotlin.reflect.KClass<? extends java.lang.Object>> PRIMITIVE_CLASSES;
    private static final java.util.Map<java.lang.Class<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> PRIMITIVE_TO_WRAPPER;
    private static final java.util.Map<java.lang.Class<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> WRAPPER_TO_PRIMITIVE;

    public static final java.lang.ClassLoader getSafeClassLoader(java.lang.Class<?> safeClassLoader) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(safeClassLoader, "$this$safeClassLoader");
        java.lang.ClassLoader classLoader = safeClassLoader.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(systemClassLoader, "ClassLoader.getSystemClassLoader()");
        return systemClassLoader;
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(java.lang.Class<?> isEnumClassOrSpecializedEnumEntryClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isEnumClassOrSpecializedEnumEntryClass, "$this$isEnumClassOrSpecializedEnumEntryClass");
        return java.lang.Enum.class.isAssignableFrom(isEnumClassOrSpecializedEnumEntryClass);
    }

    static {
        int i = 0;
        java.util.List<kotlin.reflect.KClass<? extends java.lang.Object>> listListOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Byte.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Character.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Short.TYPE)});
        PRIMITIVE_CLASSES = listListOf;
        java.util.List<kotlin.reflect.KClass<? extends java.lang.Object>> list = listListOf;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.reflect.KClass kClass = (kotlin.reflect.KClass) it.next();
            arrayList.add(kotlin.TuplesKt.to(kotlin.jvm.JvmClassMappingKt.getJavaObjectType(kClass), kotlin.jvm.JvmClassMappingKt.getJavaPrimitiveType(kClass)));
        }
        WRAPPER_TO_PRIMITIVE = kotlin.collections.MapsKt.toMap(arrayList);
        java.util.List<kotlin.reflect.KClass<? extends java.lang.Object>> list2 = PRIMITIVE_CLASSES;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.KClass kClass2 = (kotlin.reflect.KClass) it2.next();
            arrayList2.add(kotlin.TuplesKt.to(kotlin.jvm.JvmClassMappingKt.getJavaPrimitiveType(kClass2), kotlin.jvm.JvmClassMappingKt.getJavaObjectType(kClass2)));
        }
        PRIMITIVE_TO_WRAPPER = kotlin.collections.MapsKt.toMap(arrayList2);
        java.util.List listListOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Class[]{kotlin.jvm.functions.Function0.class, kotlin.jvm.functions.Function1.class, kotlin.jvm.functions.Function2.class, kotlin.jvm.functions.Function3.class, kotlin.jvm.functions.Function4.class, kotlin.jvm.functions.Function5.class, kotlin.jvm.functions.Function6.class, kotlin.jvm.functions.Function7.class, kotlin.jvm.functions.Function8.class, kotlin.jvm.functions.Function9.class, kotlin.jvm.functions.Function10.class, kotlin.jvm.functions.Function11.class, kotlin.jvm.functions.Function12.class, kotlin.jvm.functions.Function13.class, kotlin.jvm.functions.Function14.class, kotlin.jvm.functions.Function15.class, kotlin.jvm.functions.Function16.class, kotlin.jvm.functions.Function17.class, kotlin.jvm.functions.Function18.class, kotlin.jvm.functions.Function19.class, kotlin.jvm.functions.Function20.class, kotlin.jvm.functions.Function21.class, kotlin.jvm.functions.Function22.class});
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
        for (java.lang.Object obj : listListOf2) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(kotlin.TuplesKt.to((java.lang.Class) obj, java.lang.Integer.valueOf(i)));
            i = i2;
        }
        FUNCTION_CLASSES = kotlin.collections.MapsKt.toMap(arrayList3);
    }

    public static final java.lang.Class<?> getPrimitiveByWrapper(java.lang.Class<?> primitiveByWrapper) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(primitiveByWrapper, "$this$primitiveByWrapper");
        return WRAPPER_TO_PRIMITIVE.get(primitiveByWrapper);
    }

    public static final java.lang.Class<?> getWrapperByPrimitive(java.lang.Class<?> wrapperByPrimitive) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(wrapperByPrimitive, "$this$wrapperByPrimitive");
        return PRIMITIVE_TO_WRAPPER.get(wrapperByPrimitive);
    }

    public static final java.lang.Integer getFunctionClassArity(java.lang.Class<?> functionClassArity) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(functionClassArity, "$this$functionClassArity");
        return FUNCTION_CLASSES.get(functionClassArity);
    }

    public static final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId(java.lang.Class<?> classId) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId2;
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdCreateNestedClassId;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "$this$classId");
        if (classId.isPrimitive()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for primitive type: " + classId);
        }
        if (classId.isArray()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for array type: " + classId);
        }
        if (classId.getEnclosingMethod() == null && classId.getEnclosingConstructor() == null) {
            java.lang.String simpleName = classId.getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleName, "simpleName");
            if (!(simpleName.length() == 0)) {
                java.lang.Class<?> declaringClass = classId.getDeclaringClass();
                if (declaringClass != null && (classId2 = getClassId(declaringClass)) != null && (classIdCreateNestedClassId = classId2.createNestedClassId(kotlin.reflect.jvm.internal.impl.name.Name.identifier(classId.getSimpleName()))) != null) {
                    return classIdCreateNestedClassId;
                }
                kotlin.reflect.jvm.internal.impl.name.ClassId classId3 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName(classId.getName()));
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId3, "ClassId.topLevel(FqName(name))");
                return classId3;
            }
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = new kotlin.reflect.jvm.internal.impl.name.FqName(classId.getName());
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(fqName.parent(), kotlin.reflect.jvm.internal.impl.name.FqName.topLevel(fqName.shortName()), true);
    }

    public static final java.lang.String getDesc(java.lang.Class<?> desc) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(desc, "$this$desc");
        if (kotlin.jvm.internal.Intrinsics.areEqual(desc, java.lang.Void.TYPE)) {
            return "V";
        }
        java.lang.String name = createArrayType(desc).getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "createArrayType().name");
        if (name == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        java.lang.String strSubstring = name.substring(1);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return kotlin.text.StringsKt.replace$default(strSubstring, '.', '/', false, 4, (java.lang.Object) null);
    }

    public static final java.lang.Class<?> createArrayType(java.lang.Class<?> createArrayType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(createArrayType, "$this$createArrayType");
        return java.lang.reflect.Array.newInstance(createArrayType, 0).getClass();
    }

    public static final java.util.List<java.lang.reflect.Type> getParameterizedTypeArguments(java.lang.reflect.Type parameterizedTypeArguments) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameterizedTypeArguments, "$this$parameterizedTypeArguments");
        if (!(parameterizedTypeArguments instanceof java.lang.reflect.ParameterizedType)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) parameterizedTypeArguments;
        if (parameterizedType.getOwnerType() != null) {
            return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.flatMap(kotlin.sequences.SequencesKt.generateSequence(parameterizedTypeArguments, new kotlin.jvm.functions.Function1<java.lang.reflect.ParameterizedType, java.lang.reflect.ParameterizedType>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt$parameterizedTypeArguments$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.reflect.ParameterizedType invoke(java.lang.reflect.ParameterizedType it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    java.lang.reflect.Type ownerType = it.getOwnerType();
                    if (!(ownerType instanceof java.lang.reflect.ParameterizedType)) {
                        ownerType = null;
                    }
                    return (java.lang.reflect.ParameterizedType) ownerType;
                }
            }), new kotlin.jvm.functions.Function1<java.lang.reflect.ParameterizedType, kotlin.sequences.Sequence<? extends java.lang.reflect.Type>>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt$parameterizedTypeArguments$2
                @Override // kotlin.jvm.functions.Function1
                public final kotlin.sequences.Sequence<java.lang.reflect.Type> invoke(java.lang.reflect.ParameterizedType it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    java.lang.reflect.Type[] actualTypeArguments = it.getActualTypeArguments();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(actualTypeArguments, "it.actualTypeArguments");
                    return kotlin.collections.ArraysKt.asSequence(actualTypeArguments);
                }
            }));
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(actualTypeArguments, "actualTypeArguments");
        return kotlin.collections.ArraysKt.toList(actualTypeArguments);
    }
}
