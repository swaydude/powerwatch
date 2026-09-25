package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* JADX INFO: compiled from: inlineClassManglingRules.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InlineClassManglingRulesKt {
    public static final boolean shouldHideConstructorDueToInlineClassTypeValueParameters(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        if (!(descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor)) {
            descriptor = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) descriptor;
        if (classConstructorDescriptor == null || kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.isPrivate(classConstructorDescriptor.getVisibility())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor constructedClass = classConstructorDescriptor.getConstructedClass();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructedClass, "constructorDescriptor.constructedClass");
        if (constructedClass.isInline() || kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSealedClass(classConstructorDescriptor.getConstructedClass())) {
            return false;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameters, "constructorDescriptor.valueParameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor it : list) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = it.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
            if (requiresFunctionNameMangling(type)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isInlineClassThatRequiresMangling(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor isInlineClassThatRequiresMangling) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isInlineClassThatRequiresMangling, "$this$isInlineClassThatRequiresMangling");
        return kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClass(isInlineClassThatRequiresMangling) && !isDontMangleClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) isInlineClassThatRequiresMangling);
    }

    public static final boolean isInlineClassThatRequiresMangling(kotlin.reflect.jvm.internal.impl.types.KotlinType isInlineClassThatRequiresMangling) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isInlineClassThatRequiresMangling, "$this$isInlineClassThatRequiresMangling");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = isInlineClassThatRequiresMangling.getConstructor().mo1268getDeclarationDescriptor();
        return classifierDescriptorMo1268getDeclarationDescriptor != null && isInlineClassThatRequiresMangling(classifierDescriptorMo1268getDeclarationDescriptor);
    }

    private static final boolean requiresFunctionNameMangling(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return isInlineClassThatRequiresMangling(kotlinType) || isTypeParameterWithUpperBoundThatRequiresMangling(kotlinType);
    }

    private static final boolean isDontMangleClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(classDescriptor), kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.RESULT_FQ_NAME);
    }

    private static final boolean isTypeParameterWithUpperBoundThatRequiresMangling(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = kotlinType.getConstructor().mo1268getDeclarationDescriptor();
        if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor)) {
            classifierDescriptorMo1268getDeclarationDescriptor = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
        if (typeParameterDescriptor != null) {
            return requiresFunctionNameMangling(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getRepresentativeUpperBound(typeParameterDescriptor));
        }
        return false;
    }
}
