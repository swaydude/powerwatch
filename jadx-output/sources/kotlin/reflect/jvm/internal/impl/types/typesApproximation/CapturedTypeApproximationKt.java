package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CapturedTypeApproximationKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE.ordinal()] = 3;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 1;
            iArr2[kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE.ordinal()] = 2;
        }
    }

    private static final kotlin.reflect.jvm.internal.impl.types.TypeProjection toTypeProjection(final kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument typeArgument) {
        typeArgument.isConsistent();
        kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.Variance, kotlin.reflect.jvm.internal.impl.types.Variance> function1 = new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.Variance, kotlin.reflect.jvm.internal.impl.types.Variance>() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.toTypeProjection.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.types.Variance invoke(kotlin.reflect.jvm.internal.impl.types.Variance variance) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(variance, "variance");
                return variance == typeArgument.getTypeParameter().getVariance() ? kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT : variance;
            }
        };
        if (kotlin.jvm.internal.Intrinsics.areEqual(typeArgument.getInProjection(), typeArgument.getOutProjection())) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(typeArgument.getInProjection());
        }
        if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNothing(typeArgument.getInProjection()) || typeArgument.getTypeParameter().getVariance() == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) {
            return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNullableAny(typeArgument.getOutProjection()) ? new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(function1.invoke(kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE), typeArgument.getInProjection()) : new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(function1.invoke(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE), typeArgument.getOutProjection());
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(function1.invoke(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE), typeArgument.getOutProjection());
    }

    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument toTypeArgument(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        int i = kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.WhenMappings.$EnumSwitchMapping$0[kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
        if (i == 1) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "type");
            kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = typeProjection.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "type");
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument(typeParameterDescriptor, type, type2);
        }
        if (i == 2) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType type3 = typeProjection.getType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type3, "type");
            kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nullableAnyType, "typeParameter.builtIns.nullableAnyType");
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument(typeParameterDescriptor, type3, nullableAnyType);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType nothingType = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nothingType, "typeParameter.builtIns.nothingType");
        kotlin.reflect.jvm.internal.impl.types.KotlinType type4 = typeProjection.getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type4, "type");
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument(typeParameterDescriptor, nothingType, type4);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.TypeProjection approximateCapturedTypesIfNecessary(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "typeProjection.type");
        if (!kotlin.reflect.jvm.internal.impl.types.TypeUtils.contains(type, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.UnwrappedType, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType) {
                return java.lang.Boolean.valueOf(invoke2(unwrappedType));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.types.UnwrappedType it) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                return kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.isCaptured(it);
            }
        })) {
            return typeProjection;
        }
        kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(projectionKind, "typeProjection.projectionKind");
        if (projectionKind == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getUpper());
        }
        if (z) {
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getLower());
        }
        return substituteCapturedTypesWithProjections(typeProjection);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.TypeProjection substituteCapturedTypesWithProjections(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutorCreate = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(new kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            public kotlin.reflect.jvm.internal.impl.types.TypeProjection get(kotlin.reflect.jvm.internal.impl.types.TypeConstructor key) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
                if (!(key instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor)) {
                    key = null;
                }
                kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor capturedTypeConstructor = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor) key;
                if (capturedTypeConstructor == null) {
                    return null;
                }
                if (capturedTypeConstructor.getProjection().isStarProjection()) {
                    return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE, capturedTypeConstructor.getProjection().getType());
                }
                return capturedTypeConstructor.getProjection();
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeSubstitutorCreate, "TypeSubstitutor.create(o…ojection\n        }\n    })");
        return typeSubstitutorCreate.substituteWithoutApproximation(typeProjection);
    }

    public static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.KotlinType> approximateCapturedTypes(final kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeReplaceTypeArguments;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        if (kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(type)) {
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.KotlinType> approximationBoundsApproximateCapturedTypes = approximateCapturedTypes(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(type));
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.KotlinType> approximationBoundsApproximateCapturedTypes2 = approximateCapturedTypes(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(type));
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<>(kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getLower()), kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getLower())), type), kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getUpper()), kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getUpper())), type));
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = type.getConstructor();
        boolean z = true;
        if (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.isCaptured(type)) {
            if (constructor != null) {
                kotlin.reflect.jvm.internal.impl.types.TypeProjection projection = ((kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor) constructor).getProjection();
                kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType> function1 = new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.approximateCapturedTypes.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final kotlin.reflect.jvm.internal.impl.types.KotlinType invoke(kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullableIfNeeded) {
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(makeNullableIfNeeded, "$this$makeNullableIfNeeded");
                        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeMakeNullableIfNeeded = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableIfNeeded(makeNullableIfNeeded, type.isMarkedNullable());
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinTypeMakeNullableIfNeeded, "TypeUtils.makeNullableIf…s, type.isMarkedNullable)");
                        return kotlinTypeMakeNullableIfNeeded;
                    }
                };
                kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = projection.getType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "typeProjection.type");
                kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeInvoke = function1.invoke(type2);
                int i = kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.WhenMappings.$EnumSwitchMapping$1[projection.getProjectionKind().ordinal()];
                if (i == 1) {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(type).getNullableAnyType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nullableAnyType, "type.builtIns.nullableAnyType");
                    return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<>(kotlinTypeInvoke, nullableAnyType);
                }
                if (i == 2) {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType nothingType = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(type).getNothingType();
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nothingType, "type.builtIns.nothingType");
                    return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<>(function1.invoke((kotlin.reflect.jvm.internal.impl.types.KotlinType) nothingType), kotlinTypeInvoke);
                }
                throw new java.lang.AssertionError("Only nontrivial projections should have been captured, not: " + projection);
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
        }
        if (type.getArguments().isEmpty() || type.getArguments().size() != constructor.getParameters().size()) {
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<>(type, type);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = type.getArguments();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = constructor.getParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameters, "typeConstructor.parameters");
        for (kotlin.Pair pair : kotlin.collections.CollectionsKt.zip(arguments, parameters)) {
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) pair.component1();
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameter = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) pair.component2();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameter, "typeParameter");
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument typeArgument = toTypeArgument(typeProjection, typeParameter);
            if (typeProjection.isStarProjection()) {
                arrayList.add(typeArgument);
                arrayList2.add(typeArgument);
            } else {
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument> approximationBoundsApproximateProjection = approximateProjection(typeArgument);
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument typeArgumentComponent1 = approximationBoundsApproximateProjection.component1();
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument typeArgumentComponent2 = approximationBoundsApproximateProjection.component2();
                arrayList.add(typeArgumentComponent1);
                arrayList2.add(typeArgumentComponent2);
            }
        }
        java.util.ArrayList arrayList3 = arrayList;
        if (!(arrayList3 instanceof java.util.Collection) || !arrayList3.isEmpty()) {
            java.util.Iterator it = arrayList3.iterator();
            do {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
            } while (!(!((kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument) it.next()).isConsistent()));
        } else {
            z = false;
            break;
        }
        if (z) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType nothingType2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(type).getNothingType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nothingType2, "type.builtIns.nothingType");
            simpleTypeReplaceTypeArguments = nothingType2;
        } else {
            simpleTypeReplaceTypeArguments = replaceTypeArguments(type, arrayList);
        }
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<>(simpleTypeReplaceTypeArguments, replaceTypeArguments(type, arrayList2));
    }

    private static final kotlin.reflect.jvm.internal.impl.types.KotlinType replaceTypeArguments(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument> list) {
        kotlinType.getArguments().size();
        list.size();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toTypeProjection((kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument) it.next()));
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(kotlinType, arrayList, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) null, 2, (java.lang.Object) null);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument> approximateProjection(kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument typeArgument) {
        kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.KotlinType> approximationBoundsApproximateCapturedTypes = approximateCapturedTypes(typeArgument.getInProjection());
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeComponent1 = approximationBoundsApproximateCapturedTypes.component1();
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeComponent2 = approximationBoundsApproximateCapturedTypes.component2();
        kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.KotlinType> approximationBoundsApproximateCapturedTypes2 = approximateCapturedTypes(typeArgument.getOutProjection());
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds<>(new kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument(typeArgument.getTypeParameter(), kotlinTypeComponent2, approximationBoundsApproximateCapturedTypes2.component1()), new kotlin.reflect.jvm.internal.impl.types.typesApproximation.TypeArgument(typeArgument.getTypeParameter(), kotlinTypeComponent1, approximationBoundsApproximateCapturedTypes2.component2()));
    }
}
