package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes2.dex */
public class TypeSubstitutor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor EMPTY = create(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.EMPTY);
    private final kotlin.reflect.jvm.internal.impl.types.TypeSubstitution substitution;

    private enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:19:0x002b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str;
        int i2;
        if (i != 6 && i != 24 && i != 27) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                    break;
                            }
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 9:
                case 10:
                case 11:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 6 && i != 24 && i != 27) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    i2 = 3;
                                    break;
                            }
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            i2 = 2;
                            break;
                    }
                case 9:
                case 10:
                case 11:
                    i2 = 2;
                    break;
            }
        } else {
            i2 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "first";
                break;
            case 2:
                objArr[0] = "second";
                break;
            case 3:
                objArr[0] = "substitutionContext";
                break;
            case 4:
                objArr[0] = "context";
                break;
            case 5:
            default:
                objArr[0] = "substitution";
                break;
            case 6:
            case 9:
            case 10:
            case 11:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
            case 30:
            case 31:
            case 32:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 7:
            case 12:
                objArr[0] = "type";
                break;
            case 8:
            case 13:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 14:
            case 15:
            case 26:
                objArr[0] = "typeProjection";
                break;
            case 16:
                objArr[0] = "originalProjection";
                break;
            case 23:
                objArr[0] = "annotations";
                break;
            case 25:
            case 28:
                objArr[0] = "typeParameterVariance";
                break;
            case 29:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 6) {
            objArr[1] = "getSubstitution";
        } else if (i == 24) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 27) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "combine";
                                    break;
                                default:
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        if (i != 1 && i != 2) {
            switch (i) {
                case 5:
                    objArr[2] = "<init>";
                    break;
                case 6:
                case 9:
                case 10:
                case 11:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 24:
                case 27:
                case 30:
                case 31:
                case 32:
                    break;
                case 7:
                case 8:
                    objArr[2] = "safeSubstitute";
                    break;
                case 12:
                case 13:
                case 14:
                    objArr[2] = "substitute";
                    break;
                case 15:
                    objArr[2] = "substituteWithoutApproximation";
                    break;
                case 16:
                    objArr[2] = "unsafeSubstitute";
                    break;
                case 23:
                    objArr[2] = "filterOutUnsafeVariance";
                    break;
                case 25:
                case 26:
                case 28:
                case 29:
                    objArr[2] = "combine";
                    break;
                default:
                    objArr[2] = "create";
                    break;
            }
        } else {
            objArr[2] = "createChainedSubstitutor";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 6 && i != 24 && i != 27) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            break;
                        default:
                            switch (i) {
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    throw new java.lang.IllegalArgumentException(str2);
                            }
                            break;
                    }
                    break;
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    private static final class SubstitutionException extends java.lang.Exception {
        public SubstitutionException(java.lang.String str) {
            super(str);
        }
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(0);
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor(typeSubstitution);
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor createChainedSubstitutor(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(1);
        }
        if (typeSubstitution2 == null) {
            $$$reportNull$$$0(2);
        }
        return create(kotlin.reflect.jvm.internal.impl.types.DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(4);
        }
        return create(kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.create(kotlinType.getConstructor(), kotlinType.getArguments()));
    }

    protected TypeSubstitutor(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(5);
        }
        this.substitution = typeSubstitution;
    }

    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    public kotlin.reflect.jvm.internal.impl.types.TypeSubstitution getSubstitution() {
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution = this.substitution;
        if (typeSubstitution == null) {
            $$$reportNull$$$0(6);
        }
        return typeSubstitution;
    }

    public kotlin.reflect.jvm.internal.impl.types.KotlinType safeSubstitute(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance variance) {
        if (kotlinType == null) {
            $$$reportNull$$$0(7);
        }
        if (variance == null) {
            $$$reportNull$$$0(8);
        }
        if (isEmpty()) {
            if (kotlinType == null) {
                $$$reportNull$$$0(9);
            }
            return kotlinType;
        }
        try {
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = unsafeSubstitute(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, kotlinType), 0).getType();
            if (type == null) {
                $$$reportNull$$$0(10);
            }
            return type;
        } catch (kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException e) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorType = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType(e.getMessage());
            if (simpleTypeCreateErrorType == null) {
                $$$reportNull$$$0(11);
            }
            return simpleTypeCreateErrorType;
        }
    }

    public kotlin.reflect.jvm.internal.impl.types.KotlinType substitute(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.Variance variance) {
        if (kotlinType == null) {
            $$$reportNull$$$0(12);
        }
        if (variance == null) {
            $$$reportNull$$$0(13);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionSubstitute = substitute(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (typeProjectionSubstitute == null) {
            return null;
        }
        return typeProjectionSubstitute.getType();
    }

    public kotlin.reflect.jvm.internal.impl.types.TypeProjection substitute(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        if (typeProjection == null) {
            $$$reportNull$$$0(14);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionSubstituteWithoutApproximation = substituteWithoutApproximation(typeProjection);
        return (this.substitution.approximateCapturedTypes() || this.substitution.approximateContravariantCapturedTypes()) ? kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(typeProjectionSubstituteWithoutApproximation, this.substitution.approximateContravariantCapturedTypes()) : typeProjectionSubstituteWithoutApproximation;
    }

    public kotlin.reflect.jvm.internal.impl.types.TypeProjection substituteWithoutApproximation(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        if (typeProjection == null) {
            $$$reportNull$$$0(15);
        }
        if (isEmpty()) {
            return typeProjection;
        }
        try {
            return unsafeSubstitute(typeProjection, 0);
        } catch (kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private kotlin.reflect.jvm.internal.impl.types.TypeProjection unsafeSubstitute(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, int i) throws kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException {
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeMakeNullableIfNeeded;
        if (typeProjection == null) {
            $$$reportNull$$$0(16);
        }
        assertRecursionDepth(i, typeProjection, this.substitution);
        if (typeProjection.isStarProjection()) {
            if (typeProjection == null) {
                $$$reportNull$$$0(17);
            }
            return typeProjection;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
        if (type instanceof kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement) {
            kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement typeWithEnhancement = (kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement) type;
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType origin = typeWithEnhancement.getOrigin();
            kotlin.reflect.jvm.internal.impl.types.KotlinType enhancement = typeWithEnhancement.getEnhancement();
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionUnsafeSubstitute = unsafeSubstitute(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(typeProjection.getProjectionKind(), origin), i + 1);
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(typeProjectionUnsafeSubstitute.getProjectionKind(), kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(typeProjectionUnsafeSubstitute.getType().unwrap(), substitute(enhancement, typeProjection.getProjectionKind())));
        }
        if (kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.isDynamic(type) || (type.unwrap() instanceof kotlin.reflect.jvm.internal.impl.types.RawType)) {
            if (typeProjection == null) {
                $$$reportNull$$$0(18);
            }
            return typeProjection;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionMo1273get = this.substitution.mo1273get(type);
        kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
        if (typeProjectionMo1273get == null && kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(type) && !kotlin.reflect.jvm.internal.impl.types.TypeCapabilitiesKt.isCustomTypeVariable(type)) {
            kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleTypeAsFlexibleType = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(type);
            int i2 = i + 1;
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionUnsafeSubstitute2 = unsafeSubstitute(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, flexibleTypeAsFlexibleType.getLowerBound()), i2);
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionUnsafeSubstitute3 = unsafeSubstitute(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, flexibleTypeAsFlexibleType.getUpperBound()), i2);
            kotlin.reflect.jvm.internal.impl.types.Variance projectionKind2 = typeProjectionUnsafeSubstitute2.getProjectionKind();
            if (typeProjectionUnsafeSubstitute2.getType() != flexibleTypeAsFlexibleType.getLowerBound() || typeProjectionUnsafeSubstitute3.getType() != flexibleTypeAsFlexibleType.getUpperBound()) {
                return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind2, kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.asSimpleType(typeProjectionUnsafeSubstitute2.getType()), kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.asSimpleType(typeProjectionUnsafeSubstitute3.getType())));
            }
            if (typeProjection == null) {
                $$$reportNull$$$0(19);
            }
            return typeProjection;
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNothing(type) || kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(type)) {
            if (typeProjection == null) {
                $$$reportNull$$$0(20);
            }
            return typeProjection;
        }
        if (typeProjectionMo1273get != null) {
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType varianceConflictTypeConflictType = conflictType(projectionKind, typeProjectionMo1273get.getProjectionKind());
            if (!kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.isCaptured(type)) {
                int i3 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.AnonymousClass2.$SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType[varianceConflictTypeConflictType.ordinal()];
                if (i3 == 1) {
                    throw new kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException("Out-projection in in-position");
                }
                if (i3 == 2) {
                    return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE, type.getConstructor().getBuiltIns().getNullableAnyType());
                }
            }
            kotlin.reflect.jvm.internal.impl.types.CustomTypeVariable customTypeVariable = kotlin.reflect.jvm.internal.impl.types.TypeCapabilitiesKt.getCustomTypeVariable(type);
            if (typeProjectionMo1273get.isStarProjection()) {
                if (typeProjectionMo1273get == null) {
                    $$$reportNull$$$0(21);
                }
                return typeProjectionMo1273get;
            }
            if (customTypeVariable != null) {
                kotlinTypeMakeNullableIfNeeded = customTypeVariable.substitutionResult(typeProjectionMo1273get.getType());
            } else {
                kotlinTypeMakeNullableIfNeeded = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableIfNeeded(typeProjectionMo1273get.getType(), type.isMarkedNullable());
            }
            if (!type.getAnnotations().isEmpty()) {
                kotlinTypeMakeNullableIfNeeded = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceAnnotations(kotlinTypeMakeNullableIfNeeded, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations(kotlinTypeMakeNullableIfNeeded.getAnnotations(), filterOutUnsafeVariance(this.substitution.filterAnnotations(type.getAnnotations()))));
            }
            if (varianceConflictTypeConflictType == kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.NO_CONFLICT) {
                projectionKind = combine(projectionKind, typeProjectionMo1273get.getProjectionKind());
            }
            return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, kotlinTypeMakeNullableIfNeeded);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionSubstituteCompoundType = substituteCompoundType(typeProjection, i);
        if (typeProjectionSubstituteCompoundType == null) {
            $$$reportNull$$$0(22);
        }
        return typeProjectionSubstituteCompoundType;
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.values().length];
            $SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType = iArr;
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType[kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType[kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations filterOutUnsafeVariance(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        if (annotations == null) {
            $$$reportNull$$$0(23);
        }
        if (annotations.hasAnnotation(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.unsafeVariance)) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations(annotations, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.FqName, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.1
                private static /* synthetic */ void $$$reportNull$$$0(int i) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
                }

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
                    if (fqName == null) {
                        $$$reportNull$$$0(0);
                    }
                    return java.lang.Boolean.valueOf(!fqName.equals(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.unsafeVariance));
                }
            });
        }
        if (annotations == null) {
            $$$reportNull$$$0(24);
        }
        return annotations;
    }

    private kotlin.reflect.jvm.internal.impl.types.TypeProjection substituteCompoundType(kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, int i) throws kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
        kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
        if (type.getConstructor().mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
            return typeProjection;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType abbreviation = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.getAbbreviation(type);
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeSubstitute = abbreviation != null ? substitute(abbreviation, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) : null;
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeReplace = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace(type, substituteTypeArguments(type.getConstructor().getParameters(), type.getArguments(), i), this.substitution.filterAnnotations(type.getAnnotations()));
        if ((kotlinTypeReplace instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) && (kotlinTypeSubstitute instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
            kotlinTypeReplace = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.withAbbreviation((kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlinTypeReplace, (kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlinTypeSubstitute);
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, kotlinTypeReplace);
    }

    private java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> substituteTypeArguments(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> list2, int i) throws kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = list.get(i2);
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = list2.get(i2);
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjectionUnsafeSubstitute = unsafeSubstitute(typeProjection, i + 1);
            int i3 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.AnonymousClass2.$SwitchMap$org$jetbrains$kotlin$types$TypeSubstitutor$VarianceConflictType[conflictType(typeParameterDescriptor.getVariance(), typeProjectionUnsafeSubstitute.getProjectionKind()).ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 && typeParameterDescriptor.getVariance() != kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT && !typeProjectionUnsafeSubstitute.isStarProjection()) {
                    typeProjectionUnsafeSubstitute = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, typeProjectionUnsafeSubstitute.getType());
                }
            } else {
                typeProjectionUnsafeSubstitute = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection(typeParameterDescriptor);
            }
            if (typeProjectionUnsafeSubstitute != typeProjection) {
                z = true;
            }
            arrayList.add(typeProjectionUnsafeSubstitute);
        }
        return !z ? list2 : arrayList;
    }

    public static kotlin.reflect.jvm.internal.impl.types.Variance combine(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection) {
        if (variance == null) {
            $$$reportNull$$$0(25);
        }
        if (typeProjection == null) {
            $$$reportNull$$$0(26);
        }
        if (!typeProjection.isStarProjection()) {
            return combine(variance, typeProjection.getProjectionKind());
        }
        kotlin.reflect.jvm.internal.impl.types.Variance variance2 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
        if (variance2 == null) {
            $$$reportNull$$$0(27);
        }
        return variance2;
    }

    public static kotlin.reflect.jvm.internal.impl.types.Variance combine(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.types.Variance variance2) {
        if (variance == null) {
            $$$reportNull$$$0(28);
        }
        if (variance2 == null) {
            $$$reportNull$$$0(29);
        }
        if (variance == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            if (variance2 == null) {
                $$$reportNull$$$0(30);
            }
            return variance2;
        }
        if (variance2 == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            if (variance == null) {
                $$$reportNull$$$0(31);
            }
            return variance;
        }
        if (variance == variance2) {
            if (variance2 == null) {
                $$$reportNull$$$0(32);
            }
            return variance2;
        }
        throw new java.lang.AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    private static kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType conflictType(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.types.Variance variance2) {
        if (variance == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE && variance2 == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE) {
            return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.OUT_IN_IN_POSITION;
        }
        if (variance == kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE && variance2 == kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE) {
            return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.IN_IN_OUT_POSITION;
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.VarianceConflictType.NO_CONFLICT;
    }

    private static void assertRecursionDepth(int i, kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
        if (i <= 100) {
            return;
        }
        throw new java.lang.IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + safeToString(typeProjection) + "; substitution: " + safeToString(typeSubstitution));
    }

    private static java.lang.String safeToString(java.lang.Object obj) {
        try {
            return obj.toString();
        } catch (java.lang.Throwable th) {
            if (kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }
}
