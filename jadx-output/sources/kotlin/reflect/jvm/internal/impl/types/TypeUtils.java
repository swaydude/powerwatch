package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes2.dex */
public class TypeUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType DONT_CARE = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorTypeWithCustomDebugName("DONT_CARE");
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType CANT_INFER_FUNCTION_PARAM_TYPE = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("Cannot be inferred");
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType NO_EXPECTED_TYPE = new kotlin.reflect.jvm.internal.impl.types.TypeUtils.SpecialType("NO_EXPECTED_TYPE");
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType UNIT_EXPECTED_TYPE = new kotlin.reflect.jvm.internal.impl.types.TypeUtils.SpecialType("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x010e  */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str;
        int i2;
        if (i != 4 && i != 9 && i != 14 && i != 16 && i != 23 && i != 32 && i != 44 && i != 49 && i != 6 && i != 7 && i != 11 && i != 12) {
            switch (i) {
                case 52:
                case 53:
                case 54:
                case 55:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 14 && i != 16 && i != 23 && i != 32 && i != 44 && i != 49 && i != 6 && i != 7 && i != 11 && i != 12) {
            switch (i) {
                case 52:
                case 53:
                case 54:
                case 55:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
            case 14:
            case 16:
            case 23:
            case 32:
            case 44:
            case 49:
            case 52:
            case 53:
            case 54:
            case 55:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 15:
            case 20:
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
            case 35:
            case 37:
            default:
                objArr[0] = "type";
                break;
            case 13:
                objArr[0] = "parameters";
                break;
            case 17:
                objArr[0] = "subType";
                break;
            case 18:
                objArr[0] = "superType";
                break;
            case 19:
                objArr[0] = "substitutor";
                break;
            case 21:
                objArr[0] = "result";
                break;
            case 28:
            case 30:
                objArr[0] = "clazz";
                break;
            case 29:
                objArr[0] = "typeArguments";
                break;
            case 31:
                objArr[0] = "projections";
                break;
            case 33:
                objArr[0] = "a";
                break;
            case 34:
                objArr[0] = "b";
                break;
            case 36:
                objArr[0] = "typeParameters";
                break;
            case 38:
                objArr[0] = "typeParameterConstructors";
                break;
            case 39:
                objArr[0] = "specialType";
                break;
            case 40:
            case 41:
                objArr[0] = "isSpecialType";
                break;
            case 42:
                objArr[0] = "parameterDescriptor";
                break;
            case 43:
            case 47:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 45:
            case 46:
                objArr[0] = "supertypes";
                break;
            case 48:
            case 51:
                objArr[0] = "expectedType";
                break;
            case 50:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 14) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 16) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 23) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 32) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 44) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 49) {
            if (i != 6 && i != 7) {
                if (i != 11 && i != 12) {
                    switch (i) {
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                            objArr[1] = "getPrimitiveNumberType";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                            break;
                    }
                } else {
                    objArr[1] = "makeUnsubstitutedType";
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
            case 14:
            case 16:
            case 23:
            case 32:
            case 44:
            case 49:
            case 52:
            case 53:
            case 54:
            case 55:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 13:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 15:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 17:
            case 18:
            case 19:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 20:
            case 21:
                objArr[2] = "collectAllSupertypes";
                break;
            case 22:
                objArr[2] = "getAllSupertypes";
                break;
            case 24:
                objArr[2] = "isNullableType";
                break;
            case 25:
                objArr[2] = "acceptsNullable";
                break;
            case 26:
                objArr[2] = "hasNullableSuperType";
                break;
            case 27:
                objArr[2] = "getClassDescriptor";
                break;
            case 28:
            case 29:
                objArr[2] = "substituteParameters";
                break;
            case 30:
            case 31:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "equalTypes";
                break;
            case 35:
            case 36:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 37:
            case 38:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 39:
            case 40:
            case 41:
                objArr[2] = "contains";
                break;
            case 42:
                objArr[2] = "makeStarProjection";
                break;
            case 43:
            case 45:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 46:
                objArr[2] = "findByFqName";
                break;
            case 47:
            case 48:
            case 50:
            case 51:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 56:
                objArr[2] = "isTypeParameter";
                break;
            case 57:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 58:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 59:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 9 && i != 14 && i != 16 && i != 23 && i != 32 && i != 44 && i != 49 && i != 6 && i != 7 && i != 11 && i != 12) {
            switch (i) {
                case 52:
                case 53:
                case 54:
                case 55:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static class SpecialType extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType {
        private final java.lang.String name;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "newAnnotations";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "toString";
            }
            if (i != 1) {
                objArr[2] = "replaceAnnotations";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i == 1) {
                throw new java.lang.IllegalStateException(str2);
            }
        }

        public SpecialType(java.lang.String str) {
            this.name = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        protected kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
            throw new java.lang.IllegalStateException(this.name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
            if (annotations == null) {
                $$$reportNull$$$0(0);
            }
            throw new java.lang.IllegalStateException(this.name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
            throw new java.lang.IllegalStateException(this.name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        public java.lang.String toString() {
            java.lang.String str = this.name;
            if (str == null) {
                $$$reportNull$$$0(1);
            }
            return str;
        }
    }

    public static boolean noExpectedType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(0);
        }
        return kotlinType == NO_EXPECTED_TYPE || kotlinType == UNIT_EXPECTED_TYPE;
    }

    public static boolean isDontCarePlaceholder(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return kotlinType != null && kotlinType.getConstructor() == DONT_CARE.getConstructor();
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(1);
        }
        return makeNullableAsSpecified(kotlinType, true);
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType makeNotNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(2);
        }
        return makeNullableAsSpecified(kotlinType, false);
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullableAsSpecified(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            $$$reportNull$$$0(3);
        }
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeMakeNullableAsSpecified = kotlinType.unwrap().makeNullableAsSpecified(z);
        if (unwrappedTypeMakeNullableAsSpecified == null) {
            $$$reportNull$$$0(4);
        }
        return unwrappedTypeMakeNullableAsSpecified;
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullableIfNeeded(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z) {
        if (kotlinType == null) {
            $$$reportNull$$$0(8);
        }
        if (z) {
            return makeNullable(kotlinType);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(9);
        }
        return kotlinType;
    }

    public static kotlin.reflect.jvm.internal.impl.types.SimpleType makeUnsubstitutedType(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope) {
        if (kotlin.reflect.jvm.internal.impl.types.ErrorUtils.isError(classifierDescriptor)) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeCreateErrorType = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType("Unsubstituted type for " + classifierDescriptor);
            if (simpleTypeCreateErrorType == null) {
                $$$reportNull$$$0(11);
            }
            return simpleTypeCreateErrorType;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = classifierDescriptor.getTypeConstructor();
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeSimpleTypeWithNonTrivialMemberScope = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), typeConstructor, getDefaultTypeProjections(typeConstructor.getParameters()), false, memberScope);
        if (simpleTypeSimpleTypeWithNonTrivialMemberScope == null) {
            $$$reportNull$$$0(12);
        }
        return simpleTypeSimpleTypeWithNonTrivialMemberScope;
    }

    public static java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getDefaultTypeProjections(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list) {
        if (list == null) {
            $$$reportNull$$$0(13);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(it.next().getDefaultType()));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> list2 = kotlin.collections.CollectionsKt.toList(arrayList);
        if (list2 == null) {
            $$$reportNull$$$0(14);
        }
        return list2;
    }

    public static java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getImmediateSupertypes(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(15);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutorCreate = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create(kotlinType);
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = kotlinType.getConstructor().mo1269getSupertypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionMo1269getSupertypes.size());
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = collectionMo1269getSupertypes.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeCreateSubstitutedSupertype = createSubstitutedSupertype(kotlinType, it.next(), typeSubstitutorCreate);
            if (kotlinTypeCreateSubstitutedSupertype != null) {
                arrayList.add(kotlinTypeCreateSubstitutedSupertype);
            }
        }
        return arrayList;
    }

    public static kotlin.reflect.jvm.internal.impl.types.KotlinType createSubstitutedSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
        if (kotlinType == null) {
            $$$reportNull$$$0(17);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(18);
        }
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(19);
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeSubstitute = typeSubstitutor.substitute(kotlinType2, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
        if (kotlinTypeSubstitute != null) {
            return makeNullableIfNeeded(kotlinTypeSubstitute, kotlinType.isMarkedNullable());
        }
        return null;
    }

    public static boolean isNullableType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(24);
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        if (kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(kotlinType) && isNullableType(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound())) {
            return true;
        }
        if (isTypeParameter(kotlinType)) {
            return hasNullableSuperType(kotlinType);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        if (!(constructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor)) {
            return false;
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = constructor.mo1269getSupertypes().iterator();
        while (it.hasNext()) {
            if (isNullableType(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean acceptsNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(25);
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(kotlinType) && acceptsNullable(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound());
    }

    public static boolean hasNullableSuperType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(26);
        }
        if (kotlinType.getConstructor().mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return false;
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = getImmediateSupertypes(kotlinType).iterator();
        while (it.hasNext()) {
            if (isNullableType(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClassDescriptor(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(27);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = kotlinType.getConstructor().mo1268getDeclarationDescriptor();
        if (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
        }
        return null;
    }

    public static boolean contains(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.UnwrappedType, java.lang.Boolean> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(40);
        }
        return contains(kotlinType, function1, new java.util.HashSet());
    }

    private static boolean contains(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.UnwrappedType, java.lang.Boolean> function1, java.util.HashSet<kotlin.reflect.jvm.internal.impl.types.KotlinType> hashSet) {
        if (function1 == null) {
            $$$reportNull$$$0(41);
        }
        if (kotlinType == null || hashSet.contains(kotlinType)) {
            return false;
        }
        hashSet.add(kotlinType);
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (function1.invoke(unwrappedTypeUnwrap).booleanValue()) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType ? (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedTypeUnwrap : null;
        if (flexibleType != null && (contains(flexibleType.getLowerBound(), function1, hashSet) || contains(flexibleType.getUpperBound(), function1, hashSet))) {
            return true;
        }
        if ((unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) && contains(((kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) unwrappedTypeUnwrap).getOriginal(), function1, hashSet)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) {
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.KotlinType> it = ((kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) constructor).mo1269getSupertypes().iterator();
            while (it.hasNext()) {
                if (contains(it.next(), function1, hashSet)) {
                    return true;
                }
            }
            return false;
        }
        for (kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection : kotlinType.getArguments()) {
            if (!typeProjection.isStarProjection()) {
                if (contains(typeProjection.getType(), function1, hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeProjection makeStarProjection(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null) {
            $$$reportNull$$$0(42);
        }
        return new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl(typeParameterDescriptor);
    }

    public static boolean isTypeParameter(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(56);
        }
        return getTypeParameterDescriptorOrNull(kotlinType) != null || (kotlinType.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor);
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getTypeParameterDescriptorOrNull(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(59);
        }
        if (kotlinType.getConstructor().mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) kotlinType.getConstructor().mo1268getDeclarationDescriptor();
        }
        return null;
    }
}
