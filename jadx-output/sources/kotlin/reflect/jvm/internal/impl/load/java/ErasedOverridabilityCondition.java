package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: compiled from: ErasedOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ErasedOverridabilityCondition implements kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result isOverridable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor superDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor subDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor javaMethodDescriptor = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) subDescriptor;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = javaMethodDescriptor.getTypeParameters();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo basicOverridabilityProblem = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.getBasicOverridabilityProblem(superDescriptor, subDescriptor);
                if ((basicOverridabilityProblem != null ? basicOverridabilityProblem.getResult() : null) != null) {
                    return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "subDescriptor.valueParameters");
                kotlin.sequences.Sequence map = kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(valueParameters), new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.ErasedOverridabilityCondition$isOverridable$signatureTypes$1
                    @Override // kotlin.jvm.functions.Function1
                    public final kotlin.reflect.jvm.internal.impl.types.KotlinType invoke(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it) {
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                        return it.getType();
                    }
                });
                kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = javaMethodDescriptor.getReturnType();
                if (returnType == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                kotlin.sequences.Sequence sequencePlus = kotlin.sequences.SequencesKt.plus((kotlin.sequences.Sequence<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType>) map, returnType);
                kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = javaMethodDescriptor.getExtensionReceiverParameter();
                java.util.Iterator it = kotlin.sequences.SequencesKt.plus(sequencePlus, (java.lang.Iterable) kotlin.collections.CollectionsKt.listOfNotNull(extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = (kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next();
                    if ((kotlinType.getArguments().isEmpty() ^ true) && !(kotlinType.unwrap() instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl)) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptorSubstitute = superDescriptor.substitute(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution.INSTANCE.buildSubstitutor());
                if (functionDescriptorSubstitute == null) {
                    return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (functionDescriptorSubstitute instanceof kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) {
                    kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) functionDescriptorSubstitute;
                    java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = simpleFunctionDescriptor.getTypeParameters();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters2, "erasedSuper.typeParameters");
                    if (!typeParameters2.isEmpty()) {
                        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptorBuild = simpleFunctionDescriptor.newCopyBuilder().setTypeParameters(kotlin.collections.CollectionsKt.emptyList()).build();
                        if (functionDescriptorBuild == null) {
                            kotlin.jvm.internal.Intrinsics.throwNpe();
                        }
                        functionDescriptorSubstitute = functionDescriptorBuild;
                    }
                }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableByWithoutExternalConditions = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(functionDescriptorSubstitute, subDescriptor, false);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(overrideCompatibilityInfoIsOverridableByWithoutExternalConditions, "OverridingUtil.DEFAULT.i…er, subDescriptor, false)");
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result = overrideCompatibilityInfoIsOverridableByWithoutExternalConditions.getResult();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(result, "OverridingUtil.DEFAULT.i…Descriptor, false).result");
                if (kotlin.reflect.jvm.internal.impl.load.java.ErasedOverridabilityCondition.WhenMappings.$EnumSwitchMapping$0[result.ordinal()] == 1) {
                    return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE;
                }
                return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract getContract() {
        return kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }
}
