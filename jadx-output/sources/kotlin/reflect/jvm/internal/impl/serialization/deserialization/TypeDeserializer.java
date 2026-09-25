package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: TypeDeserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeDeserializer {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> classDescriptors;
    private final java.lang.String containerPresentableName;
    private final java.lang.String debugName;
    private boolean experimentalSuspendFunctionTypeEncountered;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer parent;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor> typeAliasDescriptors;
    private final java.util.Map<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameterDescriptors;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TypeDeserializer.kt */
    static final class C01381 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type $proto;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01381(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
            super(1);
            this.$proto = type;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke(java.lang.Integer num) {
            return invoke(num.intValue());
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke(int i) {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.this.c.getNameResolver(), i);
            java.util.List<java.lang.Integer> mutableList = kotlin.sequences.SequencesKt.toMutableList(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.generateSequence(this.$proto, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$1$typeParametersCount$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type invoke(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    return kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.outerType(it, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.this.c.getTypeTable());
                }
            }), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, java.lang.Integer>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$1$typeParametersCount$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Integer invoke(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
                    return java.lang.Integer.valueOf(invoke2(type));
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final int invoke2(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type it) {
                    kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                    return it.getArgumentCount();
                }
            }));
            int iCount = kotlin.sequences.SequencesKt.count(kotlin.sequences.SequencesKt.generateSequence(classId, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$1$classNestingLevel$1.INSTANCE));
            while (mutableList.size() < iCount) {
                mutableList.add(0);
            }
            return kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.this.c.getComponents().getNotFoundClasses().getClass(classId, mutableList);
        }
    }

    public TypeDeserializer(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext c, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterProtos, java.lang.String debugName, java.lang.String containerPresentableName, boolean z) {
        java.util.LinkedHashMap linkedHashMapEmptyMap;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(debugName, "debugName");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containerPresentableName, "containerPresentableName");
        this.c = c;
        this.parent = typeDeserializer;
        this.debugName = debugName;
        this.containerPresentableName = containerPresentableName;
        this.experimentalSuspendFunctionTypeEncountered = z;
        this.classDescriptors = c.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$classDescriptors$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke(int i) {
                return this.this$0.computeClassDescriptor(i);
            }
        });
        this.typeAliasDescriptors = c.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeAliasDescriptors$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor invoke(int i) {
                return this.this$0.computeTypeAliasDescriptor(i);
            }
        });
        if (typeParameterProtos.isEmpty()) {
            linkedHashMapEmptyMap = kotlin.collections.MapsKt.emptyMap();
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            int i = 0;
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(java.lang.Integer.valueOf(typeParameter.getId()), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor(this.c, typeParameter, i));
                i++;
            }
            linkedHashMapEmptyMap = linkedHashMap;
        }
        this.typeParameterDescriptors = linkedHashMapEmptyMap;
    }

    public /* synthetic */ TypeDeserializer(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext deserializationContext, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer, java.util.List list, java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(deserializationContext, typeDeserializer, list, str, str2, (i & 32) != 0 ? false : z);
    }

    public final boolean getExperimentalSuspendFunctionTypeEncountered() {
        return this.experimentalSuspendFunctionTypeEncountered;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getOwnTypeParameters() {
        return kotlin.collections.CollectionsKt.toList(this.typeParameterDescriptors.values());
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType type(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type proto) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        if (proto.hasFlexibleTypeCapabilitiesId()) {
            java.lang.String string = this.c.getNameResolver().getString(proto.getFlexibleTypeCapabilitiesId());
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = simpleType(proto);
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type typeFlexibleUpperBound = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.flexibleUpperBound(proto, this.c.getTypeTable());
            if (typeFlexibleUpperBound == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            return this.c.getComponents().getFlexibleTypeDeserializer().create(proto, string, simpleType, simpleType(typeFlexibleUpperBound));
        }
        return simpleType(proto);
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType(final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type proto) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeComputeLocalClassifierReplacementType;
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        if (proto.hasClassName()) {
            simpleTypeComputeLocalClassifierReplacementType = computeLocalClassifierReplacementType(proto.getClassName());
        } else {
            simpleTypeComputeLocalClassifierReplacementType = proto.hasTypeAliasName() ? computeLocalClassifierReplacementType(proto.getTypeAliasName()) : null;
        }
        if (simpleTypeComputeLocalClassifierReplacementType != null) {
            return simpleTypeComputeLocalClassifierReplacementType;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = typeConstructor(proto);
        if (kotlin.reflect.jvm.internal.impl.types.ErrorUtils.isError(typeConstructor.mo1268getDeclarationDescriptor())) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorTypeWithCustomConstructor = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorTypeWithCustomConstructor(typeConstructor.toString(), typeConstructor);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleTypeCreateErrorTypeWithCustomConstructor, "ErrorUtils.createErrorTy….toString(), constructor)");
            return simpleTypeCreateErrorTypeWithCustomConstructor;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations deserializedAnnotations = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations(this.c.getStorageManager(), new kotlin.jvm.functions.Function0<java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> invoke() {
                return this.this$0.c.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations(proto, this.this$0.c.getNameResolver());
            }
        });
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> listInvoke = new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type, java.util.List<? extends kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.simpleType.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> invoke(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type collectAllArguments) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(collectAllArguments, "$this$collectAllArguments");
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> argumentList = collectAllArguments.getArgumentList();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(argumentList, "argumentList");
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> list = argumentList;
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type typeOuterType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.outerType(collectAllArguments, kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.this.c.getTypeTable());
                java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument> listInvoke2 = typeOuterType != null ? invoke(typeOuterType) : null;
                if (listInvoke2 == null) {
                    listInvoke2 = kotlin.collections.CollectionsKt.emptyList();
                }
                return kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) listInvoke2);
            }
        }.invoke(proto);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listInvoke, 10));
        int i = 0;
        for (java.lang.Object obj : listInvoke) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "constructor.parameters");
            arrayList.add(typeArgument((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlin.collections.CollectionsKt.getOrNull(parameters, i), (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) obj));
            i = i2;
        }
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list = kotlin.collections.CollectionsKt.toList(arrayList);
        java.lang.Boolean bool = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.SUSPEND_TYPE.get(proto.getFlags());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "Flags.SUSPEND_TYPE.get(proto.flags)");
        if (bool.booleanValue()) {
            simpleType = createSuspendFunctionType(deserializedAnnotations, typeConstructor, list, proto.getNullable());
        } else {
            simpleType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(deserializedAnnotations, typeConstructor, list, proto.getNullable());
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type typeAbbreviatedType = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.abbreviatedType(proto, this.c.getTypeTable());
        return typeAbbreviatedType != null ? kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.withAbbreviation(simpleType, simpleType(typeAbbreviatedType)) : simpleType;
    }

    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type) {
        java.lang.Object next;
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.C01381 c01381 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.C01381(type);
        if (type.hasClassName()) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorInvoke = this.classDescriptors.invoke(java.lang.Integer.valueOf(type.getClassName()));
            if (classDescriptorInvoke == null) {
                classDescriptorInvoke = c01381.invoke(type.getClassName());
            }
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2 = classDescriptorInvoke.getTypeConstructor();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor2, "(classDescriptors(proto.…assName)).typeConstructor");
            return typeConstructor2;
        }
        if (type.hasTypeParameter()) {
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructorTypeParameterTypeConstructor = typeParameterTypeConstructor(type.getTypeParameter());
            if (typeConstructorTypeParameterTypeConstructor != null) {
                return typeConstructorTypeParameterTypeConstructor;
            }
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructorCreateErrorTypeConstructor = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorTypeConstructor("Unknown type parameter " + type.getTypeParameter() + ". Please try recompiling module containing \"" + this.containerPresentableName + kotlin.text.Typography.quote);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructorCreateErrorTypeConstructor, "ErrorUtils.createErrorTy…\\\"\"\n                    )");
            return typeConstructorCreateErrorTypeConstructor;
        }
        if (type.hasTypeParameterName()) {
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.c.getContainingDeclaration();
            java.lang.String string = this.c.getNameResolver().getString(type.getTypeParameterName());
            java.util.Iterator<T> it = getOwnTypeParameters().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) next).getName().asString(), string));
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) next;
            if (typeParameterDescriptor != null && (typeConstructor = typeParameterDescriptor.getTypeConstructor()) != null) {
                return typeConstructor;
            }
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructorCreateErrorTypeConstructor2 = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorTypeConstructor("Deserialized type parameter " + string + " in " + containingDeclaration);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructorCreateErrorTypeConstructor2, "ErrorUtils.createErrorTy…ter $name in $container\")");
            return typeConstructorCreateErrorTypeConstructor2;
        }
        if (!type.hasTypeAliasName()) {
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructorCreateErrorTypeConstructor3 = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorTypeConstructor("Unknown type");
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructorCreateErrorTypeConstructor3, "ErrorUtils.createErrorTy…nstructor(\"Unknown type\")");
            return typeConstructorCreateErrorTypeConstructor3;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorInvoke2 = this.typeAliasDescriptors.invoke(java.lang.Integer.valueOf(type.getTypeAliasName()));
        if (classDescriptorInvoke2 == null) {
            classDescriptorInvoke2 = c01381.invoke(type.getTypeAliasName());
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor3 = classDescriptorInvoke2.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor3, "(typeAliasDescriptors(pr…iasName)).typeConstructor");
        return typeConstructor3;
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType createSuspendFunctionType(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, boolean z) {
        int size;
        int size2 = typeConstructor.getParameters().size() - list.size();
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateSuspendFunctionTypeForBasicCase = null;
        if (size2 == 0) {
            simpleTypeCreateSuspendFunctionTypeForBasicCase = createSuspendFunctionTypeForBasicCase(annotations, typeConstructor, list, z);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor suspendFunction = typeConstructor.getBuiltIns().getSuspendFunction(size);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(suspendFunction, "functionTypeConstructor.…getSuspendFunction(arity)");
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2 = suspendFunction.getTypeConstructor();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor2, "functionTypeConstructor.…on(arity).typeConstructor");
            simpleTypeCreateSuspendFunctionTypeForBasicCase = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(annotations, typeConstructor2, list, z);
        }
        if (simpleTypeCreateSuspendFunctionTypeForBasicCase != null) {
            return simpleTypeCreateSuspendFunctionTypeForBasicCase;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorTypeWithArguments = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorTypeWithArguments("Bad suspend function in metadata with constructor: " + typeConstructor, list);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleTypeCreateErrorTypeWithArguments, "ErrorUtils.createErrorTy…      arguments\n        )");
        return simpleTypeCreateErrorTypeWithArguments;
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType createSuspendFunctionTypeForBasicCase(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, boolean z) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(annotations, typeConstructor, list, z);
        if (kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isFunctionType(simpleType)) {
            return transformRuntimeFunctionTypeToSuspendFunction(simpleType);
        }
        return null;
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType transformRuntimeFunctionTypeToSuspendFunction(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        boolean releaseCoroutines = this.c.getComponents().getConfiguration().getReleaseCoroutines();
        kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType));
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "funType.getValueParamete…ll()?.type ?: return null");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = type.getConstructor().mo1268getDeclarationDescriptor();
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameSafe = classifierDescriptorMo1268getDeclarationDescriptor != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo1268getDeclarationDescriptor) : null;
        boolean z = true;
        if (type.getArguments().size() != 1 || (!kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.isContinuation(fqNameSafe, true) && !kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.isContinuation(fqNameSafe, false))) {
            return (kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlinType;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.single((java.util.List) type.getArguments())).getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "continuationArgumentType.arguments.single().type");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.c.getContainingDeclaration();
        if (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor)) {
            containingDeclaration = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) containingDeclaration;
        if (kotlin.jvm.internal.Intrinsics.areEqual(callableDescriptor != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.fqNameOrNull(callableDescriptor) : null, kotlin.reflect.jvm.internal.impl.serialization.deserialization.SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
            return createSimpleSuspendFunctionType(kotlinType, type2);
        }
        if (!this.experimentalSuspendFunctionTypeEncountered && (!releaseCoroutines || !kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.isContinuation(fqNameSafe, !releaseCoroutines))) {
            z = false;
        }
        this.experimentalSuspendFunctionTypeEncountered = z;
        return createSimpleSuspendFunctionType(kotlinType, type2);
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType createSimpleSuspendFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(kotlinType);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = kotlinType.getAnnotations();
        kotlin.reflect.jvm.internal.impl.types.KotlinType receiverTypeFromFunctionType = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        java.util.List listDropLast = kotlin.collections.CollectionsKt.dropLast(kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listDropLast, 10));
        java.util.Iterator it = listDropLast.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.TypeProjection) it.next()).getType());
        }
        return kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, arrayList, null, kotlinType2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }

    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeParameterTypeConstructor(int i) {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor;
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = this.typeParameterDescriptors.get(java.lang.Integer.valueOf(i));
        if (typeParameterDescriptor != null && (typeConstructor = typeParameterDescriptor.getTypeConstructor()) != null) {
            return typeConstructor;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer typeDeserializer = this.parent;
        if (typeDeserializer != null) {
            return typeDeserializer.typeParameterTypeConstructor(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor computeClassDescriptor(int i) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(this.c.getNameResolver(), i);
        if (classId.isLocal()) {
            return this.c.getComponents().deserializeClass(classId);
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(this.c.getComponents().getModuleDescriptor(), classId);
    }

    private final kotlin.reflect.jvm.internal.impl.types.SimpleType computeLocalClassifierReplacementType(int i) {
        if (kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(this.c.getNameResolver(), i).isLocal()) {
            return this.c.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor computeTypeAliasDescriptor(int i) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(this.c.getNameResolver(), i);
        if (classId.isLocal()) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(this.c.getComponents().getModuleDescriptor(), classId);
    }

    private final kotlin.reflect.jvm.internal.impl.types.TypeProjection typeArgument(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() == kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.STAR) {
            if (typeParameterDescriptor == null) {
                kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = this.c.getComponents().getModuleDescriptor().getBuiltIns().getNullableAnyType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nullableAnyType, "c.components.moduleDescr….builtIns.nullableAnyType");
                return new kotlin.reflect.jvm.internal.impl.types.TypeBasedStarProjectionImpl(nullableAnyType);
            }
            return new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl(typeParameterDescriptor);
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags protoEnumFlags = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE;
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(projection, "typeArgumentProto.projection");
        kotlin.reflect.jvm.internal.impl.types.Variance variance = protoEnumFlags.variance(projection);
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(argument, this.c.getTypeTable());
        if (type == null) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("No type recorded"));
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, type(type));
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.debugName);
        if (this.parent == null) {
            str = "";
        } else {
            str = ". Child of " + this.parent.debugName;
        }
        sb.append(str);
        return sb.toString();
    }
}
