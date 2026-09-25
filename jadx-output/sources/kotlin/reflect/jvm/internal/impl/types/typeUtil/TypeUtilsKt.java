package kotlin.reflect.jvm.internal.impl.types.typeUtil;

/* JADX INFO: compiled from: TypeUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeUtilsKt {
    public static final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns(kotlin.reflect.jvm.internal.impl.types.KotlinType builtIns) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(builtIns, "$this$builtIns");
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns2 = builtIns.getConstructor().getBuiltIns();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(builtIns2, "constructor.builtIns");
        return builtIns2;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(makeNullable, "$this$makeNullable");
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeMakeNullable = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullable(makeNullable);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinTypeMakeNullable, "TypeUtils.makeNullable(this)");
        return kotlinTypeMakeNullable;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType makeNotNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType makeNotNullable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(makeNotNullable, "$this$makeNotNullable");
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeMakeNotNullable = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(makeNotNullable);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinTypeMakeNotNullable, "TypeUtils.makeNotNullable(this)");
        return kotlinTypeMakeNotNullable;
    }

    public static final boolean isTypeParameter(kotlin.reflect.jvm.internal.impl.types.KotlinType isTypeParameter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isTypeParameter, "$this$isTypeParameter");
        return kotlin.reflect.jvm.internal.impl.types.TypeUtils.isTypeParameter(isTypeParameter);
    }

    public static final boolean isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.KotlinType isSubtypeOf, kotlin.reflect.jvm.internal.impl.types.KotlinType superType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isSubtypeOf, "$this$isSubtypeOf");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(superType, "superType");
        return kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.isSubtypeOf(isSubtypeOf, superType);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType replaceAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType replaceAnnotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations newAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(replaceAnnotations, "$this$replaceAnnotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(newAnnotations, "newAnnotations");
        return (replaceAnnotations.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? replaceAnnotations : replaceAnnotations.unwrap().replaceAnnotations(newAnnotations);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.TypeProjection createProjection(kotlin.reflect.jvm.internal.impl.types.KotlinType type, kotlin.reflect.jvm.internal.impl.types.Variance projectionKind, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(projectionKind, "projectionKind");
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.getVariance() : null) == projectionKind) {
            projectionKind = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, type);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.TypeProjection asTypeProjection(kotlin.reflect.jvm.internal.impl.types.KotlinType asTypeProjection) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asTypeProjection, "$this$asTypeProjection");
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(asTypeProjection);
    }

    public static final boolean contains(kotlin.reflect.jvm.internal.impl.types.KotlinType contains, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.UnwrappedType, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(contains, "$this$contains");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(predicate, "predicate");
        return kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(contains, predicate);
    }

    public static final boolean canHaveUndefinedNullability(kotlin.reflect.jvm.internal.impl.types.UnwrappedType canHaveUndefinedNullability) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(canHaveUndefinedNullability, "$this$canHaveUndefinedNullability");
        return (canHaveUndefinedNullability.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor) || (canHaveUndefinedNullability.getConstructor().mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) || (canHaveUndefinedNullability instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType getRepresentativeUpperBound(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor representativeUpperBound) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(representativeUpperBound, "$this$representativeUpperBound");
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = representativeUpperBound.getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds2 = representativeUpperBound.getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds2, "upperBounds");
        java.util.Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) next).getConstructor().mo1268getDeclarationDescriptor();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? classifierDescriptorMo1268getDeclarationDescriptor : null);
            boolean z = false;
            if (classDescriptor != null && classDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE && classDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS) {
                z = true;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = (kotlin.reflect.jvm.internal.impl.types.KotlinType) obj;
        if (kotlinType != null) {
            return kotlinType;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds3 = representativeUpperBound.getUpperBounds();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(upperBounds3, "upperBounds");
        java.lang.Object objFirst = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) upperBounds3);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objFirst, "upperBounds.first()");
        return (kotlin.reflect.jvm.internal.impl.types.KotlinType) objFirst;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType replaceArgumentsWithStarProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType replaceArgumentsWithStarProjections) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeFlexibleType;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(replaceArgumentsWithStarProjections, "$this$replaceArgumentsWithStarProjections");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = replaceArgumentsWithStarProjections.unwrap();
        if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedTypeUnwrap;
            kotlin.reflect.jvm.internal.impl.types.SimpleType lowerBound = flexibleType.getLowerBound();
            if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo1268getDeclarationDescriptor() != null) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "constructor.parameters");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it.next()));
                }
                lowerBound = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(lowerBound, (java.util.List) arrayList, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) null, 2, (java.lang.Object) null);
            }
            kotlin.reflect.jvm.internal.impl.types.SimpleType upperBound = flexibleType.getUpperBound();
            if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo1268getDeclarationDescriptor() != null) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters2, "constructor.parameters");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2 = parameters2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it2.next()));
                }
                upperBound = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(upperBound, (java.util.List) arrayList2, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) null, 2, (java.lang.Object) null);
            }
            simpleTypeFlexibleType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(lowerBound, upperBound);
        } else if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeReplace$default = (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedTypeUnwrap;
            if (!simpleTypeReplace$default.getConstructor().getParameters().isEmpty() && simpleTypeReplace$default.getConstructor().mo1268getDeclarationDescriptor() != null) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters3 = simpleTypeReplace$default.getConstructor().getParameters();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters3, "constructor.parameters");
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list3 = parameters3;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) it3.next()));
                }
                simpleTypeReplace$default = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(simpleTypeReplace$default, (java.util.List) arrayList3, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) null, 2, (java.lang.Object) null);
            }
            simpleTypeFlexibleType = simpleTypeReplace$default;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(simpleTypeFlexibleType, unwrappedTypeUnwrap);
    }
}
