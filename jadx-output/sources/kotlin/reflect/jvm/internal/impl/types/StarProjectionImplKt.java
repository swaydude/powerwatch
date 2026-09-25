package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StarProjectionImplKt {
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType starProjectionType(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor starProjectionType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(starProjectionType, "$this$starProjectionType");
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = starProjectionType.getContainingDeclaration();
        if (containingDeclaration == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) containingDeclaration).getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeConstructor, "classDescriptor.typeConstructor");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "classDescriptor.typeConstructor.parameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor it : list) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            arrayList.add(it.getTypeConstructor());
        }
        final java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutorCreate = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(new kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt.starProjectionType.1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            public kotlin.reflect.jvm.internal.impl.types.TypeProjection get(kotlin.reflect.jvm.internal.impl.types.TypeConstructor key) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
                if (!arrayList2.contains(key)) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = key.mo1268getDeclarationDescriptor();
                if (classifierDescriptorMo1268getDeclarationDescriptor != null) {
                    return kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptorMo1268getDeclarationDescriptor);
                }
                throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            }
        });
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = starProjectionType.getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds, "this.upperBounds");
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeSubstitute = typeSubstitutorCreate.substitute((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlin.collections.CollectionsKt.first((java.util.List) upperBounds), kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE);
        if (kotlinTypeSubstitute != null) {
            return kotlinTypeSubstitute;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultBound = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(starProjectionType).getDefaultBound();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(defaultBound, "builtIns.defaultBound");
        return defaultBound;
    }
}
