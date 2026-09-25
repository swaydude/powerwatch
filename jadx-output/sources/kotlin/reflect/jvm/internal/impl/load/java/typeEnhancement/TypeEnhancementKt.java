package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeEnhancementKt {
    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancedTypeAnnotations ENHANCED_MUTABILITY_ANNOTATIONS;
    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancedTypeAnnotations ENHANCED_NULLABILITY_ANNOTATIONS;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE.ordinal()] = 2;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE.ordinal()] = 1;
            iArr2[kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL.ordinal()] = 2;
        }
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType enhance(kotlin.reflect.jvm.internal.impl.types.KotlinType enhance, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> qualifiers) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(enhance, "$this$enhance");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(qualifiers, "qualifiers");
        return enhancePossiblyFlexible(enhance.unwrap(), qualifiers, 0).getTypeIfChanged();
    }

    public static final boolean hasEnhancedNullability(kotlin.reflect.jvm.internal.impl.types.KotlinType hasEnhancedNullability) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(hasEnhancedNullability, "$this$hasEnhancedNullability");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = hasEnhancedNullability.getAnnotations();
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        return annotations.mo1263findAnnotation(fqName) != null;
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.Result enhancePossiblyFlexible(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> function1, int i) {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType2 = unwrappedType;
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(unwrappedType2)) {
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.Result(unwrappedType2, 1, false);
        }
        if (unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedType;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult simpleResultEnhanceInflexible = enhanceInflexible(flexibleType.getLowerBound(), function1, i, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER);
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult simpleResultEnhanceInflexible2 = enhanceInflexible(flexibleType.getUpperBound(), function1, i, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER);
            simpleResultEnhanceInflexible.getSubtreeSize();
            simpleResultEnhanceInflexible2.getSubtreeSize();
            boolean z = simpleResultEnhanceInflexible.getWereChanges() || simpleResultEnhanceInflexible2.getWereChanges();
            kotlin.reflect.jvm.internal.impl.types.KotlinType enhancement = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.getEnhancement(simpleResultEnhanceInflexible.getType());
            if (enhancement == null) {
                enhancement = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.getEnhancement(simpleResultEnhanceInflexible2.getType());
            }
            if (z) {
                unwrappedType = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(unwrappedType instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl ? new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(simpleResultEnhanceInflexible.getType(), simpleResultEnhanceInflexible2.getType()) : kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(simpleResultEnhanceInflexible.getType(), simpleResultEnhanceInflexible2.getType()), enhancement);
            }
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.Result(unwrappedType, simpleResultEnhanceInflexible.getSubtreeSize(), z);
        }
        if (unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            return enhanceInflexible((kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedType, function1, i, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult enhanceInflexible(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> function1, int i, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition typeComponentPosition) {
        kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionCreateProjection;
        if (!shouldEnhance(typeComponentPosition) && simpleType.getArguments().isEmpty()) {
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult(simpleType, 1, false);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = simpleType.getConstructor().mo1268getDeclarationDescriptor();
        if (classifierDescriptorMo1268getDeclarationDescriptor != null) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classifierDescriptorMo1268getDeclarationDescriptor, "constructor.declarationD…pleResult(this, 1, false)");
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiersInvoke = function1.invoke(java.lang.Integer.valueOf(i));
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult<kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor> enhancementResultEnhanceMutability = enhanceMutability(classifierDescriptorMo1268getDeclarationDescriptor, javaTypeQualifiersInvoke, typeComponentPosition);
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorComponent1 = enhancementResultEnhanceMutability.component1();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotationsComponent2 = enhancementResultEnhanceMutability.component2();
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = classifierDescriptorComponent1.getTypeConstructor();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "enhancedClassifier.typeConstructor");
            int subtreeSize = i + 1;
            boolean z = annotationsComponent2 != null;
            java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = simpleType.getArguments();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arguments, 10));
            int i2 = 0;
            for (java.lang.Object obj : arguments) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) obj;
                if (typeProjection.isStarProjection()) {
                    subtreeSize++;
                    kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2 = classifierDescriptorComponent1.getTypeConstructor();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor2, "enhancedClassifier.typeConstructor");
                    typeProjectionCreateProjection = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection(typeConstructor2.getParameters().get(i2));
                } else {
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.Result resultEnhancePossiblyFlexible = enhancePossiblyFlexible(typeProjection.getType().unwrap(), function1, subtreeSize);
                    z = z || resultEnhancePossiblyFlexible.getWereChanges();
                    subtreeSize += resultEnhancePossiblyFlexible.getSubtreeSize();
                    kotlin.reflect.jvm.internal.impl.types.KotlinType type = resultEnhancePossiblyFlexible.getType();
                    kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(projectionKind, "arg.projectionKind");
                    typeProjectionCreateProjection = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.createProjection(type, projectionKind, typeConstructor.getParameters().get(i2));
                }
                arrayList.add(typeProjectionCreateProjection);
                i2 = i3;
            }
            java.util.ArrayList arrayList2 = arrayList;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult<java.lang.Boolean> enhancedNullability = getEnhancedNullability(simpleType, javaTypeQualifiersInvoke, typeComponentPosition);
            boolean zBooleanValue = enhancedNullability.component1().booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotationsComponent3 = enhancedNullability.component2();
            int i4 = subtreeSize - i;
            if (!(z || annotationsComponent3 != null)) {
                return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult(simpleType, i4, false);
            }
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter notNullTypeParameterSimpleType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(compositeAnnotationsOrSingle(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations[]{simpleType.getAnnotations(), annotationsComponent2, annotationsComponent3})), typeConstructor, arrayList2, zBooleanValue);
            if (javaTypeQualifiersInvoke.isNotNullTypeParameter()) {
                notNullTypeParameterSimpleType = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter(notNullTypeParameterSimpleType);
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeWrapEnhancement = annotationsComponent3 != null && javaTypeQualifiersInvoke.isNullabilityQualifierForWarning() ? kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(simpleType, notNullTypeParameterSimpleType) : notNullTypeParameterSimpleType;
            if (kotlinTypeWrapEnhancement != null) {
                return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult((kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlinTypeWrapEnhancement, i4, true);
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult(simpleType, 1, false);
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations compositeAnnotationsOrSingle(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations> list) {
        int size = list.size();
        if (size == 0) {
            throw new java.lang.IllegalStateException("At least one Annotations object expected".toString());
        }
        if (size == 1) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) kotlin.collections.CollectionsKt.single((java.util.List) list);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations((java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations>) kotlin.collections.CollectionsKt.toList(list));
    }

    public static final boolean shouldEnhance(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition shouldEnhance) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(shouldEnhance, "$this$shouldEnhance");
        return shouldEnhance != kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.INFLEXIBLE;
    }

    private static final <T> kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult<T> noChange(T t) {
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult<>(t, null);
    }

    private static final <T> kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult<T> enhancedNullability(T t) {
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult<>(t, ENHANCED_NULLABILITY_ANNOTATIONS);
    }

    private static final <T> kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult<T> enhancedMutability(T t) {
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult<>(t, ENHANCED_MUTABILITY_ANNOTATIONS);
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult<kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor> enhanceMutability(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition typeComponentPosition) {
        if (shouldEnhance(typeComponentPosition) && (classifierDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutability = javaTypeQualifiers.getMutability();
            if (mutability != null) {
                int i = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.WhenMappings.$EnumSwitchMapping$0[mutability.ordinal()];
                if (i == 1) {
                    if (typeComponentPosition == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_LOWER) {
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptor;
                        if (javaToKotlinClassMap.isMutable(classDescriptor)) {
                            return enhancedMutability(javaToKotlinClassMap.convertMutableToReadOnly(classDescriptor));
                        }
                    }
                } else if (i == 2 && typeComponentPosition == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition.FLEXIBLE_UPPER) {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptor;
                    if (javaToKotlinClassMap.isReadOnly(classDescriptor2)) {
                        return enhancedMutability(javaToKotlinClassMap.convertReadOnlyToMutable(classDescriptor2));
                    }
                }
            }
            return noChange(classifierDescriptor);
        }
        return noChange(classifierDescriptor);
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult<java.lang.Boolean> getEnhancedNullability(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers javaTypeQualifiers, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition typeComponentPosition) {
        if (!shouldEnhance(typeComponentPosition)) {
            return noChange(java.lang.Boolean.valueOf(kotlinType.isMarkedNullable()));
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullability = javaTypeQualifiers.getNullability();
        if (nullability != null) {
            int i = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.WhenMappings.$EnumSwitchMapping$1[nullability.ordinal()];
            if (i == 1) {
                return enhancedNullability(true);
            }
            if (i == 2) {
                return enhancedNullability(false);
            }
        }
        return noChange(java.lang.Boolean.valueOf(kotlinType.isMarkedNullable()));
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        ENHANCED_NULLABILITY_ANNOTATIONS = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancedTypeAnnotations(fqName);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName2, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
        ENHANCED_MUTABILITY_ANNOTATIONS = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancedTypeAnnotations(fqName2);
    }
}
