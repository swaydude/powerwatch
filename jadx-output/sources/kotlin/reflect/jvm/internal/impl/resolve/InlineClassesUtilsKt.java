package kotlin.reflect.jvm.internal.impl.resolve;

/* JADX INFO: compiled from: inlineClassesUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InlineClassesUtilsKt {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor underlyingRepresentation(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor underlyingRepresentation) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(underlyingRepresentation, "$this$underlyingRepresentation");
        if (!underlyingRepresentation.isInline() || (classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor = underlyingRepresentation.mo1262getUnsubstitutedPrimaryConstructor()) == null || (valueParameters = classConstructorDescriptorMo1262getUnsubstitutedPrimaryConstructor.getValueParameters()) == null) {
            return null;
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) valueParameters);
    }

    public static final boolean isInlineClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor isInlineClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isInlineClass, "$this$isInlineClass");
        return (isInlineClass instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) isInlineClass).isInline();
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor unsubstitutedUnderlyingParameter(kotlin.reflect.jvm.internal.impl.types.KotlinType unsubstitutedUnderlyingParameter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(unsubstitutedUnderlyingParameter, "$this$unsubstitutedUnderlyingParameter");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = unsubstitutedUnderlyingParameter.getConstructor().mo1268getDeclarationDescriptor();
        if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            classifierDescriptorMo1268getDeclarationDescriptor = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
        if (classDescriptor != null) {
            return underlyingRepresentation(classDescriptor);
        }
        return null;
    }

    public static final boolean isInlineClassType(kotlin.reflect.jvm.internal.impl.types.KotlinType isInlineClassType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isInlineClassType, "$this$isInlineClassType");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = isInlineClassType.getConstructor().mo1268getDeclarationDescriptor();
        if (classifierDescriptorMo1268getDeclarationDescriptor != null) {
            return isInlineClass(classifierDescriptorMo1268getDeclarationDescriptor);
        }
        return false;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType substitutedUnderlyingType(kotlin.reflect.jvm.internal.impl.types.KotlinType substitutedUnderlyingType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(substitutedUnderlyingType, "$this$substitutedUnderlyingType");
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptorUnsubstitutedUnderlyingParameter = unsubstitutedUnderlyingParameter(substitutedUnderlyingType);
        if (valueParameterDescriptorUnsubstitutedUnderlyingParameter == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = substitutedUnderlyingType.getMemberScope();
        kotlin.reflect.jvm.internal.impl.name.Name name = valueParameterDescriptorUnsubstitutedUnderlyingParameter.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "parameter.name");
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) kotlin.collections.CollectionsKt.singleOrNull(memberScope.getContributedVariables(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FOR_ALREADY_TRACKED));
        if (propertyDescriptor != null) {
            return propertyDescriptor.getType();
        }
        return null;
    }

    public static final boolean isGetterOfUnderlyingPropertyOfInlineClass(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor isGetterOfUnderlyingPropertyOfInlineClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isGetterOfUnderlyingPropertyOfInlineClass, "$this$isGetterOfUnderlyingPropertyOfInlineClass");
        if (isGetterOfUnderlyingPropertyOfInlineClass instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor correspondingProperty = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor) isGetterOfUnderlyingPropertyOfInlineClass).getCorrespondingProperty();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(correspondingProperty, "correspondingProperty");
            if (isUnderlyingPropertyOfInlineClass(correspondingProperty)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isUnderlyingPropertyOfInlineClass(kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor isUnderlyingPropertyOfInlineClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isUnderlyingPropertyOfInlineClass, "$this$isUnderlyingPropertyOfInlineClass");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = isUnderlyingPropertyOfInlineClass.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(containingDeclaration, "this.containingDeclaration");
        if (!isInlineClass(containingDeclaration)) {
            return false;
        }
        if (containingDeclaration == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptorUnderlyingRepresentation = underlyingRepresentation((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration);
        return kotlin.jvm.internal.Intrinsics.areEqual(valueParameterDescriptorUnderlyingRepresentation != null ? valueParameterDescriptorUnderlyingRepresentation.getName() : null, isUnderlyingPropertyOfInlineClass.getName());
    }
}
