package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: loaded from: classes2.dex */
public class TypeCheckingProcedure {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks constraints;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 7 || i == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 7 || i == 10) ? 2 : 3];
        switch (i) {
            case 1:
            case 3:
            case 16:
            case 18:
                objArr[0] = "supertype";
                break;
            case 2:
            case 15:
            case 17:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 21:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 19:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 20:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i == 7) {
            objArr[1] = "getOutType";
        } else if (i != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 15:
            case 16:
                objArr[2] = "isSubtypeOf";
                break;
            case 17:
            case 18:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 19:
            case 20:
            case 21:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 7 && i != 10) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType findCorrespondingSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        if (kotlinType == null) {
            $$$reportNull$$$0(0);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(1);
        }
        return findCorrespondingSupertype(kotlinType, kotlinType2, new kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerProcedureCallbacksImpl());
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType findCorrespondingSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        if (kotlinType == null) {
            $$$reportNull$$$0(2);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(3);
        }
        if (typeCheckingProcedureCallbacks == null) {
            $$$reportNull$$$0(4);
        }
        return kotlin.reflect.jvm.internal.impl.types.checker.UtilsKt.findCorrespondingSupertype(kotlinType, kotlinType2, typeCheckingProcedureCallbacks);
    }

    private static kotlin.reflect.jvm.internal.impl.types.KotlinType getOutType(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        if (typeParameterDescriptor == null) {
            $$$reportNull$$$0(5);
        }
        if (typeProjection == null) {
            $$$reportNull$$$0(6);
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType nullableAnyType = typeProjection.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE || typeParameterDescriptor.getVariance() == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType() : typeProjection.getType();
        if (nullableAnyType == null) {
            $$$reportNull$$$0(7);
        }
        return nullableAnyType;
    }

    private static kotlin.reflect.jvm.internal.impl.types.KotlinType getInType(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        if (typeParameterDescriptor == null) {
            $$$reportNull$$$0(8);
        }
        if (typeProjection == null) {
            $$$reportNull$$$0(9);
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType nothingType = typeProjection.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE || typeParameterDescriptor.getVariance() == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType() : typeProjection.getType();
        if (nothingType == null) {
            $$$reportNull$$$0(10);
        }
        return nothingType;
    }

    public TypeCheckingProcedure(kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        this.constraints = typeCheckingProcedureCallbacks;
    }

    public boolean equalTypes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        if (kotlinType == null) {
            $$$reportNull$$$0(11);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(12);
        }
        if (kotlinType == kotlinType2) {
            return true;
        }
        if (kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(kotlinType)) {
            if (kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(kotlinType2)) {
                return !kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType) && !kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType2) && isSubtypeOf(kotlinType, kotlinType2) && isSubtypeOf(kotlinType2, kotlinType);
            }
            return heterogeneousEquivalence(kotlinType2, kotlinType);
        }
        if (kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(kotlinType2)) {
            return heterogeneousEquivalence(kotlinType, kotlinType2);
        }
        if (kotlinType.isMarkedNullable() != kotlinType2.isMarkedNullable()) {
            return false;
        }
        if (kotlinType.isMarkedNullable()) {
            return this.constraints.assertEqualTypes(kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(kotlinType), kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(kotlinType2), this);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor2 = kotlinType2.getConstructor();
        if (!this.constraints.assertEqualTypeConstructors(constructor, constructor2)) {
            return false;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = kotlinType.getArguments();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments2 = kotlinType2.getArguments();
        if (arguments.size() != arguments2.size()) {
            return false;
        }
        for (int i = 0; i < arguments.size(); i++) {
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = arguments.get(i);
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection2 = arguments2.get(i);
            if (!typeProjection.isStarProjection() || !typeProjection2.isStarProjection()) {
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = constructor.getParameters().get(i);
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2 = constructor2.getParameters().get(i);
                if (!capture(typeProjection, typeProjection2, typeParameterDescriptor) && (getEffectiveProjectionKind(typeParameterDescriptor, typeProjection) != getEffectiveProjectionKind(typeParameterDescriptor2, typeProjection2) || !this.constraints.assertEqualTypes(typeProjection.getType(), typeProjection2.getType(), this))) {
                    return false;
                }
            }
        }
        return true;
    }

    protected boolean heterogeneousEquivalence(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        return isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(kotlinType2).getLowerBound(), kotlinType) && isSubtypeOf(kotlinType, kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(kotlinType2).getUpperBound());
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$types$Variance;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            $SwitchMap$org$jetbrains$kotlin$types$Variance = iArr;
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$types$Variance[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$types$Variance[kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public enum EnrichedProjectionKind {
        IN,
        OUT,
        INV,
        STAR;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = (i == 1 || i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3) ? 2 : 3];
            if (i == 1 || i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure$EnrichedProjectionKind";
            } else {
                objArr[0] = "variance";
            }
            if (i == 1 || i == 2 || i == 3) {
                objArr[1] = "fromVariance";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure$EnrichedProjectionKind";
            }
            if (i != 1 && i != 2 && i != 3) {
                objArr[2] = "fromVariance";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        public static kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.EnrichedProjectionKind fromVariance(kotlin.reflect.jvm.internal.impl.types.Variance variance) {
            if (variance == null) {
                $$$reportNull$$$0(0);
            }
            int i = kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.AnonymousClass1.$SwitchMap$org$jetbrains$kotlin$types$Variance[variance.ordinal()];
            if (i == 1) {
                kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.EnrichedProjectionKind enrichedProjectionKind = INV;
                if (enrichedProjectionKind == null) {
                    $$$reportNull$$$0(1);
                }
                return enrichedProjectionKind;
            }
            if (i == 2) {
                kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.EnrichedProjectionKind enrichedProjectionKind2 = IN;
                if (enrichedProjectionKind2 == null) {
                    $$$reportNull$$$0(2);
                }
                return enrichedProjectionKind2;
            }
            if (i == 3) {
                kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.EnrichedProjectionKind enrichedProjectionKind3 = OUT;
                if (enrichedProjectionKind3 == null) {
                    $$$reportNull$$$0(3);
                }
                return enrichedProjectionKind3;
            }
            throw new java.lang.IllegalStateException("Unknown variance");
        }
    }

    public static kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.EnrichedProjectionKind getEffectiveProjectionKind(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        if (typeParameterDescriptor == null) {
            $$$reportNull$$$0(13);
        }
        if (typeProjection == null) {
            $$$reportNull$$$0(14);
        }
        kotlin.reflect.jvm.internal.impl.types.Variance variance = typeParameterDescriptor.getVariance();
        kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
        if (projectionKind == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            projectionKind = variance;
            variance = projectionKind;
        }
        if (variance == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE && projectionKind == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE) {
            return kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.EnrichedProjectionKind.STAR;
        }
        if (variance == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE && projectionKind == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) {
            return kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.EnrichedProjectionKind.STAR;
        }
        return kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure.EnrichedProjectionKind.fromVariance(projectionKind);
    }

    public boolean isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        if (kotlinType == null) {
            $$$reportNull$$$0(15);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(16);
        }
        if (kotlin.reflect.jvm.internal.impl.types.TypeCapabilitiesKt.sameTypeConstructors(kotlinType, kotlinType2)) {
            return !kotlinType.isMarkedNullable() || kotlinType2.isMarkedNullable();
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType subtypeRepresentative = kotlin.reflect.jvm.internal.impl.types.TypeCapabilitiesKt.getSubtypeRepresentative(kotlinType);
        kotlin.reflect.jvm.internal.impl.types.KotlinType supertypeRepresentative = kotlin.reflect.jvm.internal.impl.types.TypeCapabilitiesKt.getSupertypeRepresentative(kotlinType2);
        if (subtypeRepresentative != kotlinType || supertypeRepresentative != kotlinType2) {
            return isSubtypeOf(subtypeRepresentative, supertypeRepresentative);
        }
        return isSubtypeOfForRepresentatives(kotlinType, kotlinType2);
    }

    private boolean isSubtypeOfForRepresentatives(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType) || kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType2)) {
            return true;
        }
        if (!kotlinType2.isMarkedNullable() && kotlinType.isMarkedNullable()) {
            return false;
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNothingOrNullableNothing(kotlinType)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeFindCorrespondingSupertype = findCorrespondingSupertype(kotlinType, kotlinType2, this.constraints);
        if (kotlinTypeFindCorrespondingSupertype == null) {
            return this.constraints.noCorrespondingSupertype(kotlinType, kotlinType2);
        }
        if (kotlinType2.isMarkedNullable() || !kotlinTypeFindCorrespondingSupertype.isMarkedNullable()) {
            return checkSubtypeForTheSameConstructor(kotlinTypeFindCorrespondingSupertype, kotlinType2);
        }
        return false;
    }

    private boolean checkSubtypeForTheSameConstructor(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2) {
        if (kotlinType == null) {
            $$$reportNull$$$0(17);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(18);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = kotlinType.getArguments();
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments2 = kotlinType2.getArguments();
        if (arguments.size() != arguments2.size()) {
            return false;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = constructor.getParameters();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= parameters.size()) {
                return true;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = parameters.get(i);
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = arguments2.get(i);
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection2 = arguments.get(i);
            if (!typeProjection.isStarProjection() && !capture(typeProjection2, typeProjection, typeParameterDescriptor)) {
                if (!kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(typeProjection2.getType()) && !kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(typeProjection.getType())) {
                    z = false;
                }
                if (!z && typeParameterDescriptor.getVariance() == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT && typeProjection2.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT && typeProjection.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
                    if (!this.constraints.assertEqualTypes(typeProjection2.getType(), typeProjection.getType(), this)) {
                        return false;
                    }
                } else {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType outType = getOutType(typeParameterDescriptor, typeProjection);
                    if (!this.constraints.assertSubtype(getOutType(typeParameterDescriptor, typeProjection2), outType, this)) {
                        return false;
                    }
                    kotlin.reflect.jvm.internal.impl.types.KotlinType inType = getInType(typeParameterDescriptor, typeProjection);
                    kotlin.reflect.jvm.internal.impl.types.KotlinType inType2 = getInType(typeParameterDescriptor, typeProjection2);
                    if (typeProjection.getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE && !this.constraints.assertSubtype(inType, inType2, this)) {
                        return false;
                    }
                }
            }
            i++;
        }
    }

    private boolean capture(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection2, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        if (typeProjection == null) {
            $$$reportNull$$$0(19);
        }
        if (typeProjection2 == null) {
            $$$reportNull$$$0(20);
        }
        if (typeParameterDescriptor == null) {
            $$$reportNull$$$0(21);
        }
        if (typeParameterDescriptor.getVariance() == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT && typeProjection.getProjectionKind() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT && typeProjection2.getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            return this.constraints.capture(typeProjection2.getType(), typeProjection);
        }
        return false;
    }
}
