package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MethodSignatureMappingKt {
    public static final java.lang.String computeJvmDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor computeJvmDescriptor, boolean z, boolean z2) {
        java.lang.String strAsString;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(computeJvmDescriptor, "$this$computeJvmDescriptor");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z2) {
            if (computeJvmDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
                strAsString = "<init>";
            } else {
                strAsString = computeJvmDescriptor.getName().asString();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "name.asString()");
            }
            sb.append(strAsString);
        }
        sb.append("(");
        for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor parameter : computeJvmDescriptor.getValueParameters()) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameter, "parameter");
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = parameter.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "parameter.type");
            appendErasedType(sb, type);
        }
        sb.append(")");
        if (z) {
            if (kotlin.reflect.jvm.internal.impl.load.kotlin.TypeSignatureMappingKt.hasVoidReturnType(computeJvmDescriptor)) {
                sb.append("V");
            } else {
                kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = computeJvmDescriptor.getReturnType();
                if (returnType == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType, "returnType!!");
                appendErasedType(sb, returnType);
            }
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ java.lang.String computeJvmDescriptor$default(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return computeJvmDescriptor(functionDescriptor, z, z2);
    }

    public static final boolean forceSingleValueParameterBoxing(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor f) {
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(f, "f");
        if (!(f instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) f;
        if (functionDescriptor.getValueParameters().size() != 1 || kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.isFromJavaOrBuiltins((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) f) || (!kotlin.jvm.internal.Intrinsics.areEqual(functionDescriptor.getName().asString(), "remove"))) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original = functionDescriptor.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original, "f.original");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = original.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "f.original.valueParameters");
        java.lang.Object objSingle = kotlin.collections.CollectionsKt.single((java.util.List<? extends java.lang.Object>) valueParameters);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objSingle, "f.original.valueParameters.single()");
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) objSingle).getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "f.original.valueParameters.single().type");
        kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType jvmTypeMapToJvmType = mapToJvmType(type);
        if (!(jvmTypeMapToJvmType instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive)) {
            jvmTypeMapToJvmType = null;
        }
        kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive primitive = (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive) jvmTypeMapToJvmType;
        if ((primitive != null ? primitive.getJvmPrimitiveType() : null) != kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT || (overriddenBuiltinFunctionWithErasedValueParametersInJava = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(functionDescriptor)) == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original2 = overriddenBuiltinFunctionWithErasedValueParametersInJava.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original2, "overridden.original");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = original2.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters2, "overridden.original.valueParameters");
        java.lang.Object objSingle2 = kotlin.collections.CollectionsKt.single((java.util.List<? extends java.lang.Object>) valueParameters2);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objSingle2, "overridden.original.valueParameters.single()");
        kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) objSingle2).getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "overridden.original.valueParameters.single().type");
        kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType jvmTypeMapToJvmType2 = mapToJvmType(type2);
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = overriddenBuiltinFunctionWithErasedValueParametersInJava.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "overridden.containingDeclaration");
        return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(containingDeclaration), kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.mutableCollection.toUnsafe()) && (jvmTypeMapToJvmType2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object) && kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Object) jvmTypeMapToJvmType2).getInternalName(), "java/lang/Object");
    }

    public static final java.lang.String getInternalName(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor internalName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(internalName, "$this$internalName");
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE;
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(internalName).toUnsafe();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unsafe, "fqNameSafe.toUnsafe()");
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdMapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(unsafe);
        if (classIdMapKotlinToJava != null) {
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassNameByClassId = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byClassId(classIdMapKotlinToJava);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmClassNameByClassId, "JvmClassName.byClassId(it)");
            java.lang.String internalName2 = jvmClassNameByClassId.getInternalName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(internalName2, "JvmClassName.byClassId(it).internalName");
            return internalName2;
        }
        return kotlin.reflect.jvm.internal.impl.load.kotlin.TypeSignatureMappingKt.computeInternalName$default(internalName, null, false, 2, null);
    }

    private static final void appendErasedType(java.lang.StringBuilder sb, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        sb.append(mapToJvmType(kotlinType));
    }

    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType mapToJvmType(kotlin.reflect.jvm.internal.impl.types.KotlinType mapToJvmType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(mapToJvmType, "$this$mapToJvmType");
        return (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType) kotlin.reflect.jvm.internal.impl.load.kotlin.TypeSignatureMappingKt.mapType$default(mapToJvmType, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactoryImpl.INSTANCE, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode.DEFAULT, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfigurationImpl.INSTANCE, null, null, false, 32, null);
    }

    public static final java.lang.String computeJvmSignature(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor computeJvmSignature) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(computeJvmSignature, "$this$computeJvmSignature");
        kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents signatureBuildingComponents = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE;
        if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(computeJvmSignature)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = computeJvmSignature.getContainingDeclaration();
        if (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            containingDeclaration = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration;
        if (classDescriptor != null) {
            kotlin.reflect.jvm.internal.impl.name.Name name = classDescriptor.getName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "classDescriptor.name");
            if (name.isSpecial()) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor original = computeJvmSignature.getOriginal();
            if (!(original instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor)) {
                original = null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) original;
            if (simpleFunctionDescriptor != null) {
                return signatureBuildingComponents.signature(classDescriptor, computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null));
            }
        }
        return null;
    }
}
