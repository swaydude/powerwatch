package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* JADX INFO: compiled from: RawType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RawSubstitution extends kotlin.reflect.jvm.internal.impl.types.TypeSubstitution {
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution();
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes lowerTypeAttr = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON, false, null, 3, null).withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes upperTypeAttr = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON, false, null, 3, null).withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    private RawSubstitution() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl mo1273get(kotlin.reflect.jvm.internal.impl.types.KotlinType key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(eraseType(key));
    }

    private final kotlin.reflect.jvm.internal.impl.types.KotlinType eraseType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl rawTypeImpl;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = kotlinType.getConstructor().mo1268getDeclarationDescriptor();
        if (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
            return eraseType(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.getErasedUpperBound$default((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptorMo1268getDeclarationDescriptor, null, null, 3, null));
        }
        if (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
            kotlin.Pair<kotlin.reflect.jvm.internal.impl.types.SimpleType, java.lang.Boolean> pairEraseInflexibleBasedOnClassDescriptor = eraseInflexibleBasedOnClassDescriptor(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(kotlinType), classDescriptor, lowerTypeAttr);
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeComponent1 = pairEraseInflexibleBasedOnClassDescriptor.component1();
            boolean zBooleanValue = pairEraseInflexibleBasedOnClassDescriptor.component2().booleanValue();
            kotlin.Pair<kotlin.reflect.jvm.internal.impl.types.SimpleType, java.lang.Boolean> pairEraseInflexibleBasedOnClassDescriptor2 = eraseInflexibleBasedOnClassDescriptor(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(kotlinType), classDescriptor, upperTypeAttr);
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeComponent2 = pairEraseInflexibleBasedOnClassDescriptor2.component1();
            boolean zBooleanValue2 = pairEraseInflexibleBasedOnClassDescriptor2.component2().booleanValue();
            if (zBooleanValue || zBooleanValue2) {
                rawTypeImpl = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(simpleTypeComponent1, simpleTypeComponent2);
            } else {
                rawTypeImpl = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(simpleTypeComponent1, simpleTypeComponent2);
            }
            return rawTypeImpl;
        }
        throw new java.lang.IllegalStateException(("Unexpected declaration kind: " + classifierDescriptorMo1268getDeclarationDescriptor).toString());
    }

    private final kotlin.Pair<kotlin.reflect.jvm.internal.impl.types.SimpleType, java.lang.Boolean> eraseInflexibleBasedOnClassDescriptor(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.getConstructor().getParameters().isEmpty()) {
            return kotlin.TuplesKt.to(simpleType, false);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2 = simpleType;
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(simpleType2)) {
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = simpleType.getArguments().get(0);
            kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "componentTypeProjection.type");
            return kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(simpleType.getAnnotations(), simpleType.getConstructor(), kotlin.collections.CollectionsKt.listOf(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, eraseType(type))), simpleType.isMarkedNullable()), false);
        }
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(simpleType2)) {
            return kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("Raw error type: " + simpleType.getConstructor()), false);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = simpleType.getAnnotations();
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = simpleType.getConstructor();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = simpleType.getConstructor().getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "type.constructor.parameters");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor parameter : list) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution rawSubstitution = INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameter, "parameter");
            arrayList.add(computeProjection$default(rawSubstitution, parameter, javaTypeAttributes, null, 4, null));
        }
        boolean zIsMarkedNullable = simpleType.isMarkedNullable();
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = classDescriptor.getMemberScope(INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(memberScope, "declaration.getMemberScope(RawSubstitution)");
        return kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(annotations, constructor, arrayList, zIsMarkedNullable, memberScope), true);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.TypeProjection computeProjection$default(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution rawSubstitution, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            kotlinType = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.getErasedUpperBound$default(typeParameterDescriptor, null, null, 3, null);
        }
        return rawSubstitution.computeProjection(typeParameterDescriptor, javaTypeAttributes, kotlinType);
    }

    public final kotlin.reflect.jvm.internal.impl.types.TypeProjection computeProjection(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor parameter, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes attr, kotlin.reflect.jvm.internal.impl.types.KotlinType erasedUpperBound) {
        kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl typeProjectionImplMakeStarProjection;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameter, "parameter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(attr, "attr");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(erasedUpperBound, "erasedUpperBound");
        int i = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution.WhenMappings.$EnumSwitchMapping$0[attr.getFlexibility().ordinal()];
        if (i == 1) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, erasedUpperBound);
        }
        if (i != 2 && i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (!parameter.getVariance().getAllowsOutPosition()) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(parameter).getNothingType());
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = erasedUpperBound.getConstructor().getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "erasedUpperBound.constructor.parameters");
        if (!parameters.isEmpty()) {
            typeProjectionImplMakeStarProjection = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE, erasedUpperBound);
        } else {
            typeProjectionImplMakeStarProjection = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.makeStarProjection(parameter, attr);
        }
        return typeProjectionImplMakeStarProjection;
    }
}
