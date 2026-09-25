package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeSignatureMappingKt {
    private static final <T> T boxTypeIfNeeded(kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> jvmTypeFactory, T t, boolean z) {
        return z ? jvmTypeFactory.boxType(t) : t;
    }

    public static /* synthetic */ java.lang.Object mapType$default(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory jvmTypeFactory, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration typeMappingConfiguration, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter jvmDescriptorTypeWriter, kotlin.jvm.functions.Function3 function3, boolean z, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            function3 = kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.getDO_NOTHING_3();
        }
        return mapType(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v48, types: [T, java.lang.Object] */
    public static final <T> T mapType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> factory, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode mode, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<? extends T> typeMappingConfiguration, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter, kotlin.jvm.functions.Function3<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, ? super T, ? super kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, kotlin.Unit> writeGenericType, boolean z) {
        T predefinedTypeForClass;
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeComputeExpandedTypeForInlineClass;
        java.lang.Object objMapType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinType, "kotlinType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(factory, "factory");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(mode, "mode");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeMappingConfiguration, "typeMappingConfiguration");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(writeGenericType, "writeGenericType");
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypePreprocessType = typeMappingConfiguration.preprocessType(kotlinType);
        if (kotlinTypePreprocessType != null) {
            return (T) mapType(kotlinTypePreprocessType, factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType, z);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(kotlinType)) {
            return (T) mapType(kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.transformSuspendFunctionToRuntimeFunctionType(kotlinType, typeMappingConfiguration.releaseCoroutines()), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType, z);
        }
        java.lang.Object objMapBuiltInType = mapBuiltInType(kotlinType, factory, mode);
        if (objMapBuiltInType != null) {
            ?? r1 = (java.lang.Object) boxTypeIfNeeded(factory, objMapBuiltInType, mode.getNeedPrimitiveBoxing());
            writeGenericType.invoke(kotlinType, r1, mode);
            return r1;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) {
            return (T) mapType(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceArgumentsWithStarProjections(typeMappingConfiguration.commonSupertype(((kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) constructor).mo1269getSupertypes())), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType, z);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = constructor.mo1268getDeclarationDescriptor();
        if (classifierDescriptorMo1268getDeclarationDescriptor != null) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classifierDescriptorMo1268getDeclarationDescriptor, "constructor.declarationD…structor of $kotlinType\")");
            if (kotlin.reflect.jvm.internal.impl.types.ErrorUtils.isError(classifierDescriptorMo1268getDeclarationDescriptor)) {
                T t = (T) factory.createObjectType("error/NonExistentClass");
                if (classifierDescriptorMo1268getDeclarationDescriptor != null) {
                    typeMappingConfiguration.processErrorType(kotlinType, (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor);
                    if (jvmDescriptorTypeWriter != 0) {
                        jvmDescriptorTypeWriter.writeClass(t);
                    }
                    return t;
                }
                throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
            boolean z2 = classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
            if (z2 && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(kotlinType)) {
                if (kotlinType.getArguments().size() != 1) {
                    throw new java.lang.UnsupportedOperationException("arrays must have one type argument");
                }
                kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = kotlinType.getArguments().get(0);
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "memberProjection.type");
                if (typeProjection.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) {
                    objMapType = factory.createObjectType("java/lang/Object");
                    if (jvmDescriptorTypeWriter != 0) {
                        jvmDescriptorTypeWriter.writeArrayType();
                        jvmDescriptorTypeWriter.writeClass(objMapType);
                        jvmDescriptorTypeWriter.writeArrayEnd();
                    }
                } else {
                    if (jvmDescriptorTypeWriter != 0) {
                        jvmDescriptorTypeWriter.writeArrayType();
                    }
                    kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(projectionKind, "memberProjection.projectionKind");
                    objMapType = mapType(type, factory, mode.toGenericArgumentMode(projectionKind), typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType, z);
                    if (jvmDescriptorTypeWriter != 0) {
                        jvmDescriptorTypeWriter.writeArrayEnd();
                    }
                }
                return (T) factory.createFromString("[" + factory.toString(objMapType));
            }
            if (z2) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
                if (classDescriptor.isInline() && !mode.getNeedInlineClassWrapping() && (kotlinTypeComputeExpandedTypeForInlineClass = computeExpandedTypeForInlineClass(kotlinType)) != null) {
                    return (T) mapType(kotlinTypeComputeExpandedTypeForInlineClass, factory, mode.wrapInlineClassesMode(), typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType, z);
                }
                if (mode.isForAnnotationParameter() && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isKClass(classDescriptor)) {
                    predefinedTypeForClass = (java.lang.Object) factory.getJavaLangClassType();
                } else {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor original = classDescriptor.getOriginal();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original, "descriptor.original");
                    predefinedTypeForClass = typeMappingConfiguration.getPredefinedTypeForClass(original);
                    if (predefinedTypeForClass == null) {
                        if (classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY) {
                            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
                            if (containingDeclaration == null) {
                                throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            }
                            classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration;
                        }
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor original2 = classDescriptor.getOriginal();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original2, "enumClassIfEnumEntry.original");
                        predefinedTypeForClass = (java.lang.Object) factory.createObjectType(computeInternalName(original2, typeMappingConfiguration, z));
                    }
                }
                writeGenericType.invoke(kotlinType, predefinedTypeForClass, mode);
                return predefinedTypeForClass;
            }
            if (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                T t2 = (T) mapType(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getRepresentativeUpperBound((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptorMo1268getDeclarationDescriptor), factory, mode, typeMappingConfiguration, null, kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.getDO_NOTHING_3(), z);
                if (jvmDescriptorTypeWriter != 0) {
                    kotlin.reflect.jvm.internal.impl.name.Name name = classifierDescriptorMo1268getDeclarationDescriptor.getName();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "descriptor.getName()");
                    jvmDescriptorTypeWriter.writeTypeVariable(name, t2);
                }
                return t2;
            }
            throw new java.lang.UnsupportedOperationException("Unknown type " + kotlinType);
        }
        throw new java.lang.UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
    }

    public static final boolean hasVoidReturnType(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = descriptor.getReturnType();
        if (returnType == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnit(returnType)) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType returnType2 = descriptor.getReturnType();
            if (returnType2 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            if (!kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(returnType2) && !(descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor)) {
                return true;
            }
        }
        return false;
    }

    private static final java.lang.String continuationInternalName(boolean z) {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName;
        if (z) {
            fqName = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME_RELEASE;
        } else {
            fqName = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL;
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassNameByClassId = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byClassId(kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(fqName));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmClassNameByClassId, "JvmClassName.byClassId(ClassId.topLevel(fqName))");
        java.lang.String internalName = jvmClassNameByClassId.getInternalName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(internalName, "JvmClassName.byClassId(C…vel(fqName)).internalName");
        return internalName;
    }

    private static final <T> T mapBuiltInType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> jvmTypeFactory, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode typeMappingMode) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdMapKotlinToJava;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = kotlinType.getConstructor().mo1268getDeclarationDescriptor();
        if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            classifierDescriptorMo1268getDeclarationDescriptor = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
        if (classDescriptor != null) {
            boolean z = false;
            if (classDescriptor == kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.getFAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL()) {
                return jvmTypeFactory.createObjectType(continuationInternalName(false));
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(classDescriptor, kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.getFAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE())) {
                return jvmTypeFactory.createObjectType(continuationInternalName(true));
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = classDescriptor;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.getPrimitiveType(classDescriptor2);
            if (primitiveType != null) {
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(primitiveType);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmPrimitiveType, "JvmPrimitiveType.get(primitiveType)");
                java.lang.String desc = jvmPrimitiveType.getDesc();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(desc, "JvmPrimitiveType.get(primitiveType).desc");
                return (T) boxTypeIfNeeded(jvmTypeFactory, jvmTypeFactory.createFromString(desc), kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(kotlinType) || kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.hasEnhancedNullability(kotlinType));
            }
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveArrayType = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.getPrimitiveArrayType(classDescriptor2);
            if (primitiveArrayType != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("[");
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(primitiveArrayType);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmPrimitiveType2, "JvmPrimitiveType.get(arrayElementType)");
                sb.append(jvmPrimitiveType2.getDesc());
                return jvmTypeFactory.createFromString(sb.toString());
            }
            if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnderKotlinPackage(classDescriptor2) && (classIdMapKotlinToJava = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(classDescriptor2))) != null) {
                if (!typeMappingMode.getKotlinCollectionsToJavaCollections()) {
                    java.util.List<kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping> mutabilityMappings = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.getMutabilityMappings();
                    if (!(mutabilityMappings instanceof java.util.Collection) || !mutabilityMappings.isEmpty()) {
                        java.util.Iterator<T> it = mutabilityMappings.iterator();
                        while (it.hasNext()) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping) it.next()).getJavaClass(), classIdMapKotlinToJava)) {
                                z = true;
                                break;
                            }
                        }
                    }
                    if (z) {
                        return null;
                    }
                }
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassNameByClassId = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byClassId(classIdMapKotlinToJava);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmClassNameByClassId, "JvmClassName.byClassId(classId)");
                java.lang.String internalName = jvmClassNameByClassId.getInternalName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(internalName, "JvmClassName.byClassId(classId).internalName");
                return jvmTypeFactory.createObjectType(internalName);
            }
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType computeExpandedTypeForInlineClass(kotlin.reflect.jvm.internal.impl.types.KotlinType inlineClassType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(inlineClassType, "inlineClassType");
        return computeExpandedTypeInner(inlineClassType, new java.util.HashSet());
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType computeExpandedTypeInner(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.HashSet<kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor> visitedClassifiers) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeComputeExpandedTypeInner;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinType, "kotlinType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visitedClassifiers, "visitedClassifiers");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = kotlinType.getConstructor().mo1268getDeclarationDescriptor();
        if (classifierDescriptorMo1268getDeclarationDescriptor != null) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classifierDescriptorMo1268getDeclarationDescriptor, "kotlinType.constructor.d…n expected: $kotlinType\")");
            if (!visitedClassifiers.add(classifierDescriptorMo1268getDeclarationDescriptor)) {
                return null;
            }
            if (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                kotlinTypeComputeExpandedTypeInner = computeExpandedTypeInner(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getRepresentativeUpperBound((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptorMo1268getDeclarationDescriptor), visitedClassifiers);
                if (kotlinTypeComputeExpandedTypeInner == null) {
                    return null;
                }
                if (!kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isNullable(kotlinTypeComputeExpandedTypeInner) && kotlinType.isMarkedNullable()) {
                    return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(kotlinTypeComputeExpandedTypeInner);
                }
            } else {
                if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) || !((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor).isInline()) {
                    return kotlinType;
                }
                kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeSubstitutedUnderlyingType = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.substitutedUnderlyingType(kotlinType);
                if (kotlinTypeSubstitutedUnderlyingType == null || (kotlinTypeComputeExpandedTypeInner = computeExpandedTypeInner(kotlinTypeSubstitutedUnderlyingType, visitedClassifiers)) == null) {
                    return null;
                }
                if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isNullable(kotlinType)) {
                    return (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isNullable(kotlinTypeComputeExpandedTypeInner) || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveType(kotlinTypeComputeExpandedTypeInner)) ? kotlinType : kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(kotlinTypeComputeExpandedTypeInner);
                }
            }
            return kotlinTypeComputeExpandedTypeInner;
        }
        throw new java.lang.AssertionError("Type with a declaration expected: " + kotlinType);
    }

    public static /* synthetic */ java.lang.String computeInternalName$default(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration typeMappingConfiguration, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            typeMappingConfiguration = kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfigurationImpl.INSTANCE;
        }
        return computeInternalName(classDescriptor, typeMappingConfiguration, z);
    }

    public static final java.lang.String computeInternalName(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor klass, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<?> typeMappingConfiguration, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(klass, "klass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeMappingConfiguration, "typeMappingConfiguration");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = klass.getContainingDeclaration();
        if (z) {
            containingDeclaration = getContainer(containingDeclaration);
        }
        kotlin.reflect.jvm.internal.impl.name.Name nameSafeIdentifier = kotlin.reflect.jvm.internal.impl.name.SpecialNames.safeIdentifier(klass.getName());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameSafeIdentifier, "SpecialNames.safeIdentifier(klass.name)");
        java.lang.String identifier = nameSafeIdentifier.getIdentifier();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(identifier, "SpecialNames.safeIdentifier(klass.name).identifier");
        if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration).getFqName();
            if (fqName.isRoot()) {
                return identifier;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String strAsString = fqName.asString();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "fqName.asString()");
            sb.append(kotlin.text.StringsKt.replace$default(strAsString, '.', '/', false, 4, (java.lang.Object) null));
            sb.append('/');
            sb.append(identifier);
            return sb.toString();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) ? null : containingDeclaration);
        if (classDescriptor == null) {
            throw new java.lang.IllegalArgumentException("Unexpected container: " + containingDeclaration + " for " + klass);
        }
        java.lang.String predefinedInternalNameForClass = typeMappingConfiguration.getPredefinedInternalNameForClass(classDescriptor);
        if (predefinedInternalNameForClass == null) {
            predefinedInternalNameForClass = computeInternalName(classDescriptor, typeMappingConfiguration, z);
        }
        return predefinedInternalNameForClass + kotlin.text.Typography.dollar + identifier;
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainer(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) (!(declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) ? null : declarationDescriptor);
        if (declarationDescriptor2 == null) {
            declarationDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) (!(declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) ? null : declarationDescriptor);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor3 = declarationDescriptor2;
        if (declarationDescriptor3 != null) {
            return declarationDescriptor3;
        }
        if (declarationDescriptor != null) {
            return getContainer(declarationDescriptor.getContainingDeclaration());
        }
        return null;
    }
}
