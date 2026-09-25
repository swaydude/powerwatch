package kotlin.reflect;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\"\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0003\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00078BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\b\u001a\u0004\b\u0005\u0010\t¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "typeToString", "", "type", "computeJavaType", "forceWrapper", "", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class TypesJVMKt {

    @kotlin.Metadata(k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kotlin.reflect.KVariance.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.KVariance.IN.ordinal()] = 1;
            iArr[kotlin.reflect.KVariance.INVARIANT.ordinal()] = 2;
            iArr[kotlin.reflect.KVariance.OUT.ordinal()] = 3;
            int[] iArr2 = new int[kotlin.reflect.KVariance.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[kotlin.reflect.KVariance.INVARIANT.ordinal()] = 1;
            iArr2[kotlin.reflect.KVariance.IN.ordinal()] = 2;
            iArr2[kotlin.reflect.KVariance.OUT.ordinal()] = 3;
        }
    }

    public static /* synthetic */ void getJavaType$annotations(kotlin.reflect.KType kType) {
    }

    private static /* synthetic */ void getJavaType$annotations(kotlin.reflect.KTypeProjection kTypeProjection) {
    }

    public static final java.lang.reflect.Type getJavaType(kotlin.reflect.KType javaType) {
        java.lang.reflect.Type javaType2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaType, "$this$javaType");
        return (!(javaType instanceof kotlin.jvm.internal.KTypeBase) || (javaType2 = ((kotlin.jvm.internal.KTypeBase) javaType).getJavaType()) == null) ? computeJavaType$default(javaType, false, 1, null) : javaType2;
    }

    static /* synthetic */ java.lang.reflect.Type computeJavaType$default(kotlin.reflect.KType kType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return computeJavaType(kType, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.Type computeJavaType(kotlin.reflect.KType kType, boolean z) {
        int i;
        kotlin.reflect.KClassifier classifier = kType.getClassifier();
        if (classifier instanceof kotlin.reflect.KTypeParameter) {
            return new kotlin.reflect.TypeVariableImpl((kotlin.reflect.KTypeParameter) classifier);
        }
        if (classifier instanceof kotlin.reflect.KClass) {
            kotlin.reflect.KClass kClass = (kotlin.reflect.KClass) classifier;
            java.lang.Class javaObjectType = z ? kotlin.jvm.JvmClassMappingKt.getJavaObjectType(kClass) : kotlin.jvm.JvmClassMappingKt.getJavaClass(kClass);
            java.util.List<kotlin.reflect.KTypeProjection> arguments = kType.getArguments();
            if (arguments.isEmpty()) {
                return javaObjectType;
            }
            if (javaObjectType.isArray()) {
                java.lang.Class<?> componentType = javaObjectType.getComponentType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(componentType, "jClass.componentType");
                if (componentType.isPrimitive()) {
                    return javaObjectType;
                }
                kotlin.reflect.KTypeProjection kTypeProjection = (kotlin.reflect.KTypeProjection) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) arguments);
                if (kTypeProjection != null) {
                    kotlin.reflect.KVariance variance = kTypeProjection.getVariance();
                    kotlin.reflect.KType type = kTypeProjection.getType();
                    if (variance == null || (i = kotlin.reflect.TypesJVMKt.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()]) == 1) {
                        return javaObjectType;
                    }
                    if (i == 2 || i == 3) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(type);
                        java.lang.reflect.Type typeComputeJavaType$default = computeJavaType$default(type, false, 1, null);
                        java.lang.reflect.Type genericArrayTypeImpl = javaObjectType;
                        if (!(typeComputeJavaType$default instanceof java.lang.Class)) {
                            genericArrayTypeImpl = new kotlin.reflect.GenericArrayTypeImpl(typeComputeJavaType$default);
                        }
                        return genericArrayTypeImpl;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                throw new java.lang.IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
            }
            return createPossiblyInnerType(javaObjectType, arguments);
        }
        throw new java.lang.UnsupportedOperationException("Unsupported type classifier: " + kType);
    }

    private static final java.lang.reflect.Type createPossiblyInnerType(java.lang.Class<?> cls, java.util.List<kotlin.reflect.KTypeProjection> list) {
        java.lang.Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            java.util.List<kotlin.reflect.KTypeProjection> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(getJavaType((kotlin.reflect.KTypeProjection) it.next()));
            }
            return new kotlin.reflect.ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (java.lang.reflect.Modifier.isStatic(cls.getModifiers())) {
            java.lang.Class<?> cls2 = declaringClass;
            java.util.List<kotlin.reflect.KTypeProjection> list3 = list;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(getJavaType((kotlin.reflect.KTypeProjection) it2.next()));
            }
            return new kotlin.reflect.ParameterizedTypeImpl(cls, cls2, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        java.lang.reflect.Type typeCreatePossiblyInnerType = createPossiblyInnerType(declaringClass, list.subList(length, list.size()));
        java.util.List<kotlin.reflect.KTypeProjection> listSubList = list.subList(0, length);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        java.util.Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(getJavaType((kotlin.reflect.KTypeProjection) it3.next()));
        }
        return new kotlin.reflect.ParameterizedTypeImpl(cls, typeCreatePossiblyInnerType, arrayList3);
    }

    private static final java.lang.reflect.Type getJavaType(kotlin.reflect.KTypeProjection kTypeProjection) {
        kotlin.reflect.KVariance variance = kTypeProjection.getVariance();
        if (variance == null) {
            return kotlin.reflect.WildcardTypeImpl.Companion.getSTAR();
        }
        kotlin.reflect.KType type = kTypeProjection.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(type);
        int i = kotlin.reflect.TypesJVMKt.WhenMappings.$EnumSwitchMapping$1[variance.ordinal()];
        if (i == 1) {
            return computeJavaType(type, true);
        }
        if (i == 2) {
            return new kotlin.reflect.WildcardTypeImpl(null, computeJavaType(type, true));
        }
        if (i == 3) {
            return new kotlin.reflect.WildcardTypeImpl(computeJavaType(type, true), null);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String typeToString(java.lang.reflect.Type type) {
        java.lang.String name;
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isArray()) {
                kotlin.sequences.Sequence sequenceGenerateSequence = kotlin.sequences.SequencesKt.generateSequence(type, kotlin.reflect.TypesJVMKt$typeToString$unwrap$1.INSTANCE);
                name = ((java.lang.Class) kotlin.sequences.SequencesKt.last(sequenceGenerateSequence)).getName() + kotlin.text.StringsKt.repeat("[]", kotlin.sequences.SequencesKt.count(sequenceGenerateSequence));
            } else {
                name = cls.getName();
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "if (type.isArray) {\n    …\n        } else type.name");
            return name;
        }
        return type.toString();
    }
}
