package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition {
    public static final kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion(null);

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result isOverridable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor superDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor subDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(subDescriptor, "subDescriptor");
        if (isIncompatibleInAccordanceWithBuiltInOverridabilityRules(superDescriptor, subDescriptor, classDescriptor)) {
            return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        if (Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(superDescriptor, subDescriptor)) {
            return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    private final boolean isIncompatibleInAccordanceWithBuiltInOverridabilityRules(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if ((callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) && (callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) && !kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(callableDescriptor2)) {
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor2;
            kotlin.reflect.jvm.internal.impl.name.Name name = functionDescriptor.getName();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "subDescriptor.name");
            if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
                kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.INSTANCE;
                kotlin.reflect.jvm.internal.impl.name.Name name2 = functionDescriptor.getName();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name2, "subDescriptor.name");
                if (!builtinMethodsWithDifferentJvmName.getSameAsRenamedInJvmBuiltin(name2)) {
                    return false;
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor overriddenSpecialBuiltin = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenSpecialBuiltin((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) callableDescriptor);
            boolean zIsHiddenToOvercomeSignatureClash = functionDescriptor.isHiddenToOvercomeSignatureClash();
            boolean z = callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) (!z ? null : callableDescriptor);
            if ((functionDescriptor2 == null || zIsHiddenToOvercomeSignatureClash != functionDescriptor2.isHiddenToOvercomeSignatureClash()) && (overriddenSpecialBuiltin == null || !functionDescriptor.isHiddenToOvercomeSignatureClash())) {
                return true;
            }
            if ((classDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor) && functionDescriptor.getInitialSignatureDescriptor() == null && overriddenSpecialBuiltin != null && !kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(classDescriptor, overriddenSpecialBuiltin)) {
                if ((overriddenSpecialBuiltin instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) && z && kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) overriddenSpecialBuiltin) != null) {
                    java.lang.String strComputeJvmDescriptor$default = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 2, null);
                    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original = ((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor).getOriginal();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original, "superDescriptor.original");
                    if (kotlin.jvm.internal.Intrinsics.areEqual(strComputeJvmDescriptor$default, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract getContract() {
        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    /* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor superDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor subDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(superDescriptor, "superDescriptor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) && (superDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor)) {
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptor = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) subDescriptor;
                javaMethodDescriptor.getValueParameters().size();
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) superDescriptor;
                functionDescriptor.getValueParameters().size();
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor original = javaMethodDescriptor.getOriginal();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original, "subDescriptor.original");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = original.getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "subDescriptor.original.valueParameters");
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor original2 = functionDescriptor.getOriginal();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(original2, "superDescriptor.original");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = original2.getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters2, "superDescriptor.original.valueParameters");
                for (kotlin.Pair pair : kotlin.collections.CollectionsKt.zip(valueParameters, valueParameters2)) {
                    kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor subParameter = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) pair.component1();
                    kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor superParameter = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) pair.component2();
                    kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion companion = this;
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(subParameter, "subParameter");
                    boolean z = companion.mapValueParameterType((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) subDescriptor, subParameter) instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive;
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(superParameter, "superParameter");
                    if (z != (companion.mapValueParameterType(functionDescriptor, superParameter) instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType mapValueParameterType(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor) {
            if (kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.forceSingleValueParameterBoxing(functionDescriptor) || isPrimitiveCompareTo(functionDescriptor)) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = valueParameterDescriptor.getType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "valueParameterDescriptor.type");
                return kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.mapToJvmType(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(type));
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = valueParameterDescriptor.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "valueParameterDescriptor.type");
            return kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.mapToJvmType(type2);
        }

        private final boolean isPrimitiveCompareTo(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            if (functionDescriptor.getValueParameters().size() != 1) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
            if (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                containingDeclaration = null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration;
            if (classDescriptor != null) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "f.valueParameters");
                java.lang.Object objSingle = kotlin.collections.CollectionsKt.single((java.util.List<? extends java.lang.Object>) valueParameters);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objSingle, "f.valueParameters.single()");
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) objSingle).getType().getConstructor().mo1268getDeclarationDescriptor();
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? classifierDescriptorMo1268getDeclarationDescriptor : null);
                return classDescriptor2 != null && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveClass(classDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(classDescriptor), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(classDescriptor2));
            }
            return false;
        }
    }
}
