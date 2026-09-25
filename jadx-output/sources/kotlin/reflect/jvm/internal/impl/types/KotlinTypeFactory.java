package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinTypeFactory {
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory INSTANCE = new kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory();

    private KotlinTypeFactory() {
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope computeMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = typeConstructor.mo1268getDeclarationDescriptor();
        if (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
            return classifierDescriptorMo1268getDeclarationDescriptor.getDefaultType().getMemberScope();
        }
        if (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            if (list.isEmpty()) {
                return ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor).getDefaultType().getMemberScope();
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor).getMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.create(typeConstructor, list));
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(memberScope, "descriptor.getMemberScop…(constructor, arguments))");
            return memberScope;
        }
        if (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScopeCreateErrorScope = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorScope("Scope for abbreviation: " + ((kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) classifierDescriptorMo1268getDeclarationDescriptor).getName(), true);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(memberScopeCreateErrorScope, "ErrorUtils.createErrorSc…{descriptor.name}\", true)");
            return memberScopeCreateErrorScope;
        }
        throw new java.lang.IllegalStateException("Unsupported classifier: " + classifierDescriptorMo1268getDeclarationDescriptor + " for constructor: " + typeConstructor);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arguments, "arguments");
        if (annotations.isEmpty() && arguments.isEmpty() && !z && constructor.mo1268getDeclarationDescriptor() != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = constructor.mo1268getDeclarationDescriptor();
            if (classifierDescriptorMo1268getDeclarationDescriptor == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classifierDescriptorMo1268getDeclarationDescriptor, "constructor.declarationDescriptor!!");
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = classifierDescriptorMo1268getDeclarationDescriptor.getDefaultType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultType, "constructor.declarationDescriptor!!.defaultType");
            return defaultType;
        }
        return simpleTypeWithNonTrivialMemberScope(annotations, constructor, arguments, z, INSTANCE.computeMemberScope(constructor, arguments));
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeWithNonTrivialMemberScope(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments, boolean z, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arguments, "arguments");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(memberScope, "memberScope");
        kotlin.reflect.jvm.internal.impl.types.SimpleTypeImpl simpleTypeImpl = new kotlin.reflect.jvm.internal.impl.types.SimpleTypeImpl(constructor, arguments, z, memberScope);
        if (annotations.isEmpty()) {
            return simpleTypeImpl;
        }
        return new kotlin.reflect.jvm.internal.impl.types.AnnotatedSimpleType(simpleTypeImpl, annotations);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleNotNullType(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor descriptor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(arguments, "arguments");
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "descriptor.typeConstructor");
        return simpleType(annotations, typeConstructor, arguments, false);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.UnwrappedType flexibleType(kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound, kotlin.reflect.jvm.internal.impl.types.SimpleType upperBound) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBound, "lowerBound");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBound, "upperBound");
        return kotlin.jvm.internal.Intrinsics.areEqual(lowerBound, upperBound) ? lowerBound : new kotlin.reflect.jvm.internal.impl.types.FlexibleTypeImpl(lowerBound, upperBound);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType integerLiteralType(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor constructor, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotations, "annotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
        java.util.List listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScopeCreateErrorScope = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorScope("Scope for integer literal type", true);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(memberScopeCreateErrorScope, "ErrorUtils.createErrorSc…eger literal type\", true)");
        return simpleTypeWithNonTrivialMemberScope(annotations, constructor, listEmptyList, z, memberScopeCreateErrorScope);
    }
}
