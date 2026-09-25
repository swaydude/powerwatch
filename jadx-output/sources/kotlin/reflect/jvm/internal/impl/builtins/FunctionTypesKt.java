package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX INFO: compiled from: functionTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FunctionTypesKt {
    public static final boolean isFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType isFunctionType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isFunctionType, "$this$isFunctionType");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = isFunctionType.getConstructor().mo1268getDeclarationDescriptor();
        return (classifierDescriptorMo1268getDeclarationDescriptor != null ? getFunctionalClassKind(classifierDescriptorMo1268getDeclarationDescriptor) : null) == kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.Function;
    }

    public static final boolean isSuspendFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType isSuspendFunctionType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isSuspendFunctionType, "$this$isSuspendFunctionType");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = isSuspendFunctionType.getConstructor().mo1268getDeclarationDescriptor();
        return (classifierDescriptorMo1268getDeclarationDescriptor != null ? getFunctionalClassKind(classifierDescriptorMo1268getDeclarationDescriptor) : null) == kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.SuspendFunction;
    }

    public static final boolean isBuiltinFunctionalType(kotlin.reflect.jvm.internal.impl.types.KotlinType isBuiltinFunctionalType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isBuiltinFunctionalType, "$this$isBuiltinFunctionalType");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = isBuiltinFunctionalType.getConstructor().mo1268getDeclarationDescriptor();
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind functionalClassKind = classifierDescriptorMo1268getDeclarationDescriptor != null ? getFunctionalClassKind(classifierDescriptorMo1268getDeclarationDescriptor) : null;
        return functionalClassKind == kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.Function || functionalClassKind == kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.SuspendFunction;
    }

    public static final boolean isBuiltinExtensionFunctionalType(kotlin.reflect.jvm.internal.impl.types.KotlinType isBuiltinExtensionFunctionalType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isBuiltinExtensionFunctionalType, "$this$isBuiltinExtensionFunctionalType");
        return isBuiltinFunctionalType(isBuiltinExtensionFunctionalType) && isTypeAnnotatedWithExtensionFunctionType(isBuiltinExtensionFunctionalType);
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = kotlinType.getAnnotations();
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        return annotations.mo1263findAnnotation(fqName) != null;
    }

    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind getFunctionalClassKind(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getFunctionalClassKind) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getFunctionalClassKind, "$this$getFunctionalClassKind");
        if ((getFunctionalClassKind instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnderKotlinPackage(getFunctionalClassKind)) {
            return getFunctionalClassKind(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(getFunctionalClassKind));
        }
        return null;
    }

    private static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind getFunctionalClassKind(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.Companion companion = kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.Companion;
        java.lang.String strAsString = fqNameUnsafe.shortName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "shortName().asString()");
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameParent = fqNameUnsafe.toSafe().parent();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameParent, "toSafe().parent()");
        return companion.getFunctionalClassKind(strAsString, fqNameParent);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType getReceiverTypeFromFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType getReceiverTypeFromFunctionType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getReceiverTypeFromFunctionType, "$this$getReceiverTypeFromFunctionType");
        isBuiltinFunctionalType(getReceiverTypeFromFunctionType);
        if (isTypeAnnotatedWithExtensionFunctionType(getReceiverTypeFromFunctionType)) {
            return ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.first((java.util.List) getReceiverTypeFromFunctionType.getArguments())).getType();
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnTypeFromFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnTypeFromFunctionType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getReturnTypeFromFunctionType, "$this$getReturnTypeFromFunctionType");
        isBuiltinFunctionalType(getReturnTypeFromFunctionType);
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.last((java.util.List) getReturnTypeFromFunctionType.getArguments())).getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "arguments.last().type");
        return type;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getValueParameterTypesFromFunctionType(kotlin.reflect.jvm.internal.impl.types.KotlinType getValueParameterTypesFromFunctionType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getValueParameterTypesFromFunctionType, "$this$getValueParameterTypesFromFunctionType");
        isBuiltinFunctionalType(getValueParameterTypesFromFunctionType);
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = getValueParameterTypesFromFunctionType.getArguments();
        return arguments.subList(isBuiltinExtensionFunctionalType(getValueParameterTypesFromFunctionType) ? 1 : 0, arguments.size() - 1);
    }

    public static final kotlin.reflect.jvm.internal.impl.name.Name extractParameterNameFromFunctionTypeArgument(kotlin.reflect.jvm.internal.impl.types.KotlinType extractParameterNameFromFunctionTypeArgument) {
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(extractParameterNameFromFunctionTypeArgument, "$this$extractParameterNameFromFunctionTypeArgument");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = extractParameterNameFromFunctionTypeArgument.getAnnotations();
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.parameterName;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.parameterName");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptorMo1263findAnnotation = annotations.mo1263findAnnotation(fqName);
        if (annotationDescriptorMo1263findAnnotation != null) {
            java.lang.Object objSingleOrNull = kotlin.collections.CollectionsKt.singleOrNull(annotationDescriptorMo1263findAnnotation.getAllValueArguments().values());
            if (!(objSingleOrNull instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue)) {
                objSingleOrNull = null;
            }
            kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue stringValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue) objSingleOrNull;
            if (stringValue != null && (value = stringValue.getValue()) != null) {
                if (!kotlin.reflect.jvm.internal.impl.name.Name.isValidIdentifier(value)) {
                    value = null;
                }
                if (value != null) {
                    return kotlin.reflect.jvm.internal.impl.name.Name.identifier(value);
                }
            }
        }
        return null;
    }

    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getFunctionTypeArgumentProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> parameterTypes, java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> list, kotlin.reflect.jvm.internal.impl.types.KotlinType returnType, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns) {
        kotlin.reflect.jvm.internal.impl.name.Name name;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameterTypes, "parameterTypes");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(returnType, "returnType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builtIns, "builtIns");
        int i = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(parameterTypes.size() + (kotlinType != null ? 1 : 0) + 1);
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList2, kotlinType != null ? kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(kotlinType) : null);
        for (java.lang.Object obj : parameterTypes) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeReplaceAnnotations = (kotlin.reflect.jvm.internal.impl.types.KotlinType) obj;
            if (list == null || (name = list.get(i)) == null || name.isSpecial()) {
                name = null;
            }
            if (name != null) {
                kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.parameterName;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.parameterName");
                kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                java.lang.String strAsString = name.asString();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "name.asString()");
                kotlinTypeReplaceAnnotations = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceAnnotations(kotlinTypeReplaceAnnotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.create(kotlin.collections.CollectionsKt.plus(kotlinTypeReplaceAnnotations.getAnnotations(), new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor(builtIns, fqName, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(nameIdentifier, new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue(strAsString)))))));
            }
            arrayList2.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(kotlinTypeReplaceAnnotations));
            i = i2;
        }
        arrayList.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(returnType));
        return arrayList;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType createFunctionType(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> parameterTypes, java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> list, kotlin.reflect.jvm.internal.impl.types.KotlinType returnType, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builtIns, "builtIns");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameterTypes, "parameterTypes");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(returnType, "returnType");
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, parameterTypes, list, returnType, builtIns);
        int size = parameterTypes.size();
        if (kotlinType != null) {
            size++;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor suspendFunction = z ? builtIns.getSuspendFunction(size) : builtIns.getFunction(size);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(suspendFunction, "if (suspendFunction) bui…tFunction(parameterCount)");
        if (kotlinType != null) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
            if (annotations.mo1263findAnnotation(fqName) == null) {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion companion = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion;
                kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.extensionFunctionType;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqName2, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
                annotations = companion.create(kotlin.collections.CollectionsKt.plus(annotations, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor(builtIns, fqName2, kotlin.collections.MapsKt.emptyMap())));
            }
        }
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(annotations, suspendFunction, functionTypeArgumentProjections);
    }
}
