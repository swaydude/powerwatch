package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* JADX INFO: compiled from: JavaTypeResolver.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeResolverKt {
    private static final kotlin.reflect.jvm.internal.impl.name.FqName JAVA_LANG_CLASS_FQ_NAME = new kotlin.reflect.jvm.internal.impl.name.FqName("java.lang.Class");

    public static final kotlin.reflect.jvm.internal.impl.types.TypeProjection makeStarProjection(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameter, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes attr) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameter, "typeParameter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(attr, "attr");
        if (attr.getHowThisTypeIsUsed() == kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.SUPERTYPE) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt.starProjectionType(typeParameter));
        }
        return new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl(typeParameter);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage typeUsage, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) null;
        }
        return toAttributes(typeUsage, z, typeParameterDescriptor);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes toAttributes(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage toAttributes, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(toAttributes, "$this$toAttributes");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes(toAttributes, null, z, typeParameterDescriptor, 2, null);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getErasedUpperBound$default(final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            typeParameterDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) null;
        }
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.getErasedUpperBound.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlin.reflect.jvm.internal.impl.types.SimpleType invoke() {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorType = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("Can't compute erased upper bound of type parameter `" + typeParameterDescriptor + '`');
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(simpleTypeCreateErrorType, "ErrorUtils.createErrorTy… type parameter `$this`\")");
                    return simpleTypeCreateErrorType;
                }
            };
        }
        return getErasedUpperBound(typeParameterDescriptor, typeParameterDescriptor2, function0);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType getErasedUpperBound(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getErasedUpperBound, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getErasedUpperBound, "$this$getErasedUpperBound");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(defaultValue, "defaultValue");
        if (getErasedUpperBound == typeParameterDescriptor) {
            return defaultValue.invoke();
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = getErasedUpperBound.getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds, "upperBounds");
        kotlin.reflect.jvm.internal.impl.types.KotlinType firstUpperBound = (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.collections.CollectionsKt.first((java.util.List) upperBounds);
        if (firstUpperBound.getConstructor().mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(firstUpperBound, "firstUpperBound");
            return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceArgumentsWithStarProjections(firstUpperBound);
        }
        if (typeParameterDescriptor != null) {
            getErasedUpperBound = typeParameterDescriptor;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = firstUpperBound.getConstructor().mo1268getDeclarationDescriptor();
        if (classifierDescriptorMo1268getDeclarationDescriptor == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
        do {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(typeParameterDescriptor2, getErasedUpperBound)) {
                java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds2 = typeParameterDescriptor2.getUpperBounds();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds2, "current.upperBounds");
                kotlin.reflect.jvm.internal.impl.types.KotlinType nextUpperBound = (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.collections.CollectionsKt.first((java.util.List) upperBounds2);
                if (nextUpperBound.getConstructor().mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nextUpperBound, "nextUpperBound");
                    return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceArgumentsWithStarProjections(nextUpperBound);
                }
                classifierDescriptorMo1268getDeclarationDescriptor = nextUpperBound.getConstructor().mo1268getDeclarationDescriptor();
            } else {
                return defaultValue.invoke();
            }
        } while (classifierDescriptorMo1268getDeclarationDescriptor != null);
        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
    }
}
