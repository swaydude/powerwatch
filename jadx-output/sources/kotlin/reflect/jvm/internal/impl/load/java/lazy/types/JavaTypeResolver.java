package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* JADX INFO: compiled from: JavaTypeResolver.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeResolver {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver typeParameterResolver;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1, reason: invalid class name */
    /* JADX INFO: compiled from: JavaTypeResolver.kt */
    static final class AnonymousClass1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType, java.lang.Boolean> {
        public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.AnonymousClass1 INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType javaType) {
            return java.lang.Boolean.valueOf(invoke2(javaType));
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType javaType) {
            if (!(javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType)) {
                javaType = null;
            }
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType javaWildcardType = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType) javaType;
            return (javaWildcardType == null || javaWildcardType.getBound() == null || javaWildcardType.isExtends()) ? false : true;
        }
    }

    public JavaTypeResolver(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c, kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver typeParameterResolver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameterResolver, "typeParameterResolver");
        this.c = c;
        this.typeParameterResolver = typeParameterResolver;
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType transformJavaType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType javaType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes attr) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeTransformJavaType;
        kotlin.reflect.jvm.internal.impl.types.SimpleType unitType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(attr, "attr");
        if (javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType) {
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType type = ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType) javaType).getType();
            if (type != null) {
                unitType = this.c.getModule().getBuiltIns().getPrimitiveKotlinType(type);
            } else {
                unitType = this.c.getModule().getBuiltIns().getUnitType();
            }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unitType, "if (primitiveType != nul….module.builtIns.unitType");
            return unitType;
        }
        if (javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) {
            return transformJavaClassifierType((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) javaType, attr);
        }
        if (javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType) {
            return transformArrayType$default(this, (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType) javaType, attr, false, 4, null);
        }
        if (javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType bound = ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType) javaType).getBound();
            if (bound != null && (kotlinTypeTransformJavaType = transformJavaType(bound, attr)) != null) {
                return kotlinTypeTransformJavaType;
            }
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultBound = this.c.getModule().getBuiltIns().getDefaultBound();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultBound, "c.module.builtIns.defaultBound");
            return defaultBound;
        }
        if (javaType == null) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultBound2 = this.c.getModule().getBuiltIns().getDefaultBound();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultBound2, "c.module.builtIns.defaultBound");
            return defaultBound2;
        }
        throw new java.lang.UnsupportedOperationException("Unsupported type: " + javaType);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType transformArrayType$default(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver javaTypeResolver, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType javaArrayType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z);
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType transformArrayType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType arrayType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes attr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arrayType, "arrayType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(attr, "attr");
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType componentType = arrayType.getComponentType();
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType javaPrimitiveType = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType) (!(componentType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType) ? null : componentType);
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        if (type != null) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveArrayKotlinType = this.c.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(primitiveArrayKotlinType, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            if (attr.isForAnnotationParameter()) {
                return primitiveArrayKotlinType;
            }
            return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(primitiveArrayKotlinType, primitiveArrayKotlinType.makeNullableAsSpecified(true));
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeTransformJavaType = transformJavaType(componentType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON, attr.isForAnnotationParameter(), null, 2, null));
        if (attr.isForAnnotationParameter()) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType2 = this.c.getModule().getBuiltIns().getArrayType(z ? kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE : kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, kotlinTypeTransformJavaType);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(arrayType2, "c.module.builtIns.getArr…ctionKind, componentType)");
            return arrayType2;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType3 = this.c.getModule().getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, kotlinTypeTransformJavaType);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(arrayType3, "c.module.builtIns.getArr…INVARIANT, componentType)");
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(arrayType3, this.c.getModule().getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE, kotlinTypeTransformJavaType).makeNullableAsSpecified(true));
    }

    private final kotlin.reflect.jvm.internal.impl.types.KotlinType transformJavaClassifierType(final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes) {
        kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.SimpleType> function0 = new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.types.SimpleType invoke() {
                kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorType = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("Unresolved java class " + javaClassifierType.getPresentableText());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleTypeCreateErrorType, "ErrorUtils.createErrorTy…vaType.presentableText}\")");
                return simpleTypeCreateErrorType;
            }
        };
        boolean z = (javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.SUPERTYPE) ? false : true;
        boolean zIsRaw = javaClassifierType.isRaw();
        if (!zIsRaw && !z) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeComputeSimpleJavaClassifierType = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes, null);
            if (simpleTypeComputeSimpleJavaClassifierType == null) {
                simpleTypeComputeSimpleJavaClassifierType = function0.invoke();
            }
            return simpleTypeComputeSimpleJavaClassifierType;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeComputeSimpleJavaClassifierType2 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (simpleTypeComputeSimpleJavaClassifierType2 == null) {
            return function0.invoke();
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeComputeSimpleJavaClassifierType3 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), simpleTypeComputeSimpleJavaClassifierType2);
        if (simpleTypeComputeSimpleJavaClassifierType3 == null) {
            return function0.invoke();
        }
        if (zIsRaw) {
            return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(simpleTypeComputeSimpleJavaClassifierType2, simpleTypeComputeSimpleJavaClassifierType3);
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(simpleTypeComputeSimpleJavaClassifierType2, simpleTypeComputeSimpleJavaClassifierType3);
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType computeSimpleJavaClassifierType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations lazyJavaAnnotations;
        if (simpleType == null || (lazyJavaAnnotations = simpleType.getAnnotations()) == null) {
            lazyJavaAnnotations = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations(this.c, javaClassifierType);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructorComputeTypeConstructor = computeTypeConstructor(javaClassifierType, javaTypeAttributes);
        if (typeConstructorComputeTypeConstructor == null) {
            return null;
        }
        boolean zIsNullable = isNullable(javaTypeAttributes);
        if (kotlin.jvm.internal.Intrinsics.areEqual(simpleType != null ? simpleType.getConstructor() : null, typeConstructorComputeTypeConstructor) && !javaClassifierType.isRaw() && zIsNullable) {
            return simpleType.makeNullableAsSpecified(true);
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(lazyJavaAnnotations, typeConstructorComputeTypeConstructor, computeArguments(javaClassifierType, javaTypeAttributes, typeConstructorComputeTypeConstructor), zIsNullable);
    }

    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor computeTypeConstructor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes) {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor;
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier classifier = javaClassifierType.getClassifier();
        if (classifier == null) {
            return createNotFoundClass(javaClassifierType);
        }
        if (classifier instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) classifier;
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = javaClass.getFqName();
            if (fqName == null) {
                throw new java.lang.AssertionError("Class type should have a FQ name: " + classifier);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorMapKotlinClass = mapKotlinClass(javaClassifierType, javaTypeAttributes, fqName);
            if (classDescriptorMapKotlinClass == null) {
                classDescriptorMapKotlinClass = this.c.getComponents().getModuleClassResolver().resolveClass(javaClass);
            }
            return (classDescriptorMapKotlinClass == null || (typeConstructor = classDescriptorMapKotlinClass.getTypeConstructor()) == null) ? createNotFoundClass(javaClassifierType) : typeConstructor;
        }
        if (classifier instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = this.typeParameterResolver.resolveTypeParameter((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter) classifier);
            if (typeParameterDescriptorResolveTypeParameter != null) {
                return typeParameterDescriptorResolveTypeParameter.getTypeConstructor();
            }
            return null;
        }
        throw new java.lang.IllegalStateException("Unknown classifier kind: " + classifier);
    }

    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor createNotFoundClass(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName(javaClassifierType.getClassifierQualifiedName()));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(FqName(…classifierQualifiedName))");
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = this.c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(classId, kotlin.collections.CollectionsKt.listOf(0)).getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "c.components.deserialize…istOf(0)).typeConstructor");
        return typeConstructor;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mapKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        if (javaTypeAttributes.isForAnnotationParameter() && kotlin.jvm.internal.Intrinsics.areEqual(fqName, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.JAVA_LANG_CLASS_FQ_NAME)) {
            return this.c.getComponents().getReflectionTypes().getKClass();
        }
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorMapJavaToKotlin$default = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.mapJavaToKotlin$default(javaToKotlinClassMap, fqName, this.c.getModule().getBuiltIns(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default != null) {
            return (javaToKotlinClassMap.isReadOnly(classDescriptorMapJavaToKotlin$default) && (javaTypeAttributes.getFlexibility() == kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.getHowThisTypeIsUsed() == kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.SUPERTYPE || argumentsMakeSenseOnlyForMutableContainer(javaClassifierType, classDescriptorMapJavaToKotlin$default))) ? javaToKotlinClassMap.convertReadOnlyToMutable(classDescriptorMapJavaToKotlin$default) : classDescriptorMapJavaToKotlin$default;
        }
        return null;
    }

    private final boolean argumentsMakeSenseOnlyForMutableContainer(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.types.Variance variance;
        if (!kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.AnonymousClass1.INSTANCE.invoke2((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) javaClassifierType.getTypeArguments()))) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.convertReadOnlyToMutable(classDescriptor).getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "JavaToKotlinClassMap.con…         .typeConstructor");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "JavaToKotlinClassMap.con…ypeConstructor.parameters");
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) parameters);
        if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(variance, "JavaToKotlinClassMap.con….variance ?: return false");
        return variance != kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> computeArguments(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType javaClassifierType, final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, final kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        final boolean zIsRaw = javaClassifierType.isRaw();
        boolean z = true;
        if (!zIsRaw) {
            if (javaClassifierType.getTypeArguments().isEmpty()) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "constructor.parameters");
                if (!(!parameters.isEmpty())) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters2, "constructor.parameters");
        if (z) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters2;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor parameter : list) {
                kotlin.reflect.jvm.internal.impl.types.LazyWrappedType lazyWrappedType = new kotlin.reflect.jvm.internal.impl.types.LazyWrappedType(this.c.getStorageManager(), new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeArguments$$inlined$map$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlin.reflect.jvm.internal.impl.types.KotlinType invoke() {
                        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor parameter2 = parameter;
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameter2, "parameter");
                        return kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.getErasedUpperBound(parameter2, javaTypeAttributes.getUpperBoundOfTypeParameter(), new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeArguments$$inlined$map$lambda$1.1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final kotlin.reflect.jvm.internal.impl.types.KotlinType invoke() {
                                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = typeConstructor.mo1268getDeclarationDescriptor();
                                if (classifierDescriptorMo1268getDeclarationDescriptor == null) {
                                    kotlin.jvm.internal.Intrinsics.throwNpe();
                                }
                                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classifierDescriptorMo1268getDeclarationDescriptor, "constructor.declarationDescriptor!!");
                                kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = classifierDescriptorMo1268getDeclarationDescriptor.getDefaultType();
                                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultType, "constructor.declarationDescriptor!!.defaultType");
                                return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
                            }
                        });
                    }
                });
                kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution rawSubstitution = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameter, "parameter");
                arrayList.add(rawSubstitution.computeProjection(parameter, zIsRaw ? javaTypeAttributes : javaTypeAttributes.withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE), lazyWrappedType));
            }
            return kotlin.collections.CollectionsKt.toList(arrayList);
        }
        if (parameters2.size() != javaClassifierType.getTypeArguments().size()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2 = parameters2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor p : list2) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(p, "p");
                arrayList2.add(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType(p.getName().asString())));
            }
            return kotlin.collections.CollectionsKt.toList(arrayList2);
        }
        java.lang.Iterable<kotlin.collections.IndexedValue> iterableWithIndex = kotlin.collections.CollectionsKt.withIndex(javaClassifierType.getTypeArguments());
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (kotlin.collections.IndexedValue indexedValue : iterableWithIndex) {
            int index = indexedValue.getIndex();
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType javaType = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType) indexedValue.component2();
            parameters2.size();
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor parameter2 = parameters2.get(index);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes attributes$default = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON, false, null, 3, null);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameter2, "parameter");
            arrayList3.add(transformToTypeProjection(javaType, attributes$default, parameter2));
        }
        return kotlin.collections.CollectionsKt.toList(arrayList3);
    }

    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection transformToTypeProjection(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType javaType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        if (javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType javaWildcardType = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType) javaType;
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType bound = javaWildcardType.getBound();
            kotlin.reflect.jvm.internal.impl.types.Variance variance = javaWildcardType.isExtends() ? kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE : kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
            if (bound == null || isConflictingArgumentFor(variance, typeParameterDescriptor)) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
            }
            return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.createProjection(transformJavaType(bound, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON, false, null, 3, null)), variance, typeParameterDescriptor);
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, transformJavaType(javaType, javaTypeAttributes));
    }

    private final boolean isConflictingArgumentFor(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        return (typeParameterDescriptor.getVariance() == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT || variance == typeParameterDescriptor.getVariance()) ? false : true;
    }

    private final boolean isNullable(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes) {
        return (javaTypeAttributes.getFlexibility() == kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.SUPERTYPE) ? false : true;
    }
}
