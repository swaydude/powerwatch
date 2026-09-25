package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AbstractTypeChecker {
    public static final kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker INSTANCE = new kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker();

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy.FORCE_NOT_SUBTYPE.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy.TAKE_FIRST_FOR_SUBTYPING.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy.CHECK_ANY_OF_THEM.ordinal()] = 3;
            iArr[kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN.ordinal()] = 4;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV.ordinal()] = 1;
            iArr2[kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT.ordinal()] = 2;
            iArr2[kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.IN.ordinal()] = 3;
            int[] iArr3 = new int[kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.LowerCapturedTypePolicy.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr3[kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr3[kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
        }
    }

    private AbstractTypeChecker() {
    }

    public final boolean isSubtypeOf(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext context, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker subType, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker superType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(subType, "subType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(superType, "superType");
        if (subType == superType) {
            return true;
        }
        return completeIsSubTypeOf(context, context.prepareType(subType), context.prepareType(superType));
    }

    public final boolean equalTypes(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext context, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker a, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker b) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
        if (a == b) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker abstractTypeChecker = INSTANCE;
        if (abstractTypeChecker.isCommonDenotableType(context, a) && abstractTypeChecker.isCommonDenotableType(context, b)) {
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerLowerBoundIfFlexible = context.lowerBoundIfFlexible(a);
            if (!context.areEqualTypeConstructors(context.typeConstructor(a), context.typeConstructor(b))) {
                return false;
            }
            if (context.argumentsCount(simpleTypeMarkerLowerBoundIfFlexible) == 0) {
                return context.hasFlexibleNullability(a) || context.hasFlexibleNullability(b) || context.isMarkedNullable(simpleTypeMarkerLowerBoundIfFlexible) == context.isMarkedNullable(context.lowerBoundIfFlexible(b));
            }
        }
        return abstractTypeChecker.isSubtypeOf(context, a, b) && abstractTypeChecker.isSubtypeOf(context, b, a);
    }

    private final boolean completeIsSubTypeOf(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2) {
        java.lang.Boolean boolCheckSubtypeForSpecialCases = checkSubtypeForSpecialCases(abstractTypeCheckerContext, abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker), abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker2));
        if (boolCheckSubtypeForSpecialCases != null) {
            boolean zBooleanValue = boolCheckSubtypeForSpecialCases.booleanValue();
            abstractTypeCheckerContext.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2);
            return zBooleanValue;
        }
        java.lang.Boolean boolAddSubtypeConstraint = abstractTypeCheckerContext.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2);
        return boolAddSubtypeConstraint != null ? boolAddSubtypeConstraint.booleanValue() : isSubtypeOfForSingleClassifierType(abstractTypeCheckerContext, abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker), abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker2));
    }

    private final java.lang.Boolean checkSubtypeForIntegerLiteralType(final kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker2) {
        if (!abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker) && !abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2)) {
            return null;
        }
        kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, java.lang.Boolean> function2 = new kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.checkSubtypeForIntegerLiteralType.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker3, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker4) {
                return java.lang.Boolean.valueOf(invoke2(simpleTypeMarker3, simpleTypeMarker4));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker integerLiteralType, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker type) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(integerLiteralType, "integerLiteralType");
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> collectionPossibleIntegerTypes = abstractTypeCheckerContext.possibleIntegerTypes(integerLiteralType);
                if ((collectionPossibleIntegerTypes instanceof java.util.Collection) && collectionPossibleIntegerTypes.isEmpty()) {
                    return false;
                }
                java.util.Iterator<T> it = collectionPossibleIntegerTypes.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(abstractTypeCheckerContext.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) it.next()), abstractTypeCheckerContext.typeConstructor(type))) {
                        return true;
                    }
                }
                return false;
            }
        };
        if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker) && abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2)) {
            return true;
        }
        if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker)) {
            if (function2.invoke2(simpleTypeMarker, simpleTypeMarker2)) {
                return true;
            }
        } else if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2) && function2.invoke2(simpleTypeMarker2, simpleTypeMarker)) {
            return true;
        }
        return null;
    }

    private final boolean hasNothingSupertype(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker) {
        kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible lowerIfFlexible;
        if (abstractTypeCheckerContext.isNothingConstructor(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker))) {
            return true;
        }
        abstractTypeCheckerContext.initialize();
        java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
        if (supertypesDeque == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
        if (supertypesSet == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        supertypesDeque.push(simpleTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() > 1000) {
                throw new java.lang.IllegalStateException(("Too many supertypes for type: " + simpleTypeMarker + ". Supertypes = " + kotlin.collections.CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null)).toString());
            }
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker current = supertypesDeque.pop();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(current, "current");
            if (supertypesSet.add(current)) {
                if (abstractTypeCheckerContext.isClassType(current)) {
                    lowerIfFlexible = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE;
                } else {
                    lowerIfFlexible = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (!(!kotlin.jvm.internal.Intrinsics.areEqual(lowerIfFlexible, kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                    lowerIfFlexible = null;
                }
                if (lowerIfFlexible != null) {
                    java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it = abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(current)).iterator();
                    while (it.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerMo1272transformType = lowerIfFlexible.mo1272transformType(abstractTypeCheckerContext, it.next());
                        if (abstractTypeCheckerContext.isNothingConstructor(abstractTypeCheckerContext.typeConstructor(simpleTypeMarkerMo1272transformType))) {
                            abstractTypeCheckerContext.clear();
                            return true;
                        }
                        supertypesDeque.add(simpleTypeMarkerMo1272transformType);
                    }
                } else {
                    continue;
                }
            }
        }
        abstractTypeCheckerContext.clear();
        return false;
    }

    private final boolean isSubtypeOfForSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker2) {
        boolean z;
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type;
        if (!abstractTypeCheckerContext.isSingleClassifierType(simpleTypeMarker) && !abstractTypeCheckerContext.isIntersection(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker))) {
            abstractTypeCheckerContext.isAllowedTypeVariable(simpleTypeMarker);
        }
        if (!abstractTypeCheckerContext.isSingleClassifierType(simpleTypeMarker2)) {
            abstractTypeCheckerContext.isAllowedTypeVariable(simpleTypeMarker2);
        }
        if (!kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker.INSTANCE.isPossibleSubtype(abstractTypeCheckerContext, simpleTypeMarker, simpleTypeMarker2)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker3 = simpleTypeMarker;
        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker4 = simpleTypeMarker2;
        java.lang.Boolean boolCheckSubtypeForIntegerLiteralType = checkSubtypeForIntegerLiteralType(abstractTypeCheckerContext, abstractTypeCheckerContext.lowerBoundIfFlexible(simpleTypeMarker3), abstractTypeCheckerContext.upperBoundIfFlexible(simpleTypeMarker4));
        if (boolCheckSubtypeForIntegerLiteralType != null) {
            boolean zBooleanValue = boolCheckSubtypeForIntegerLiteralType.booleanValue();
            abstractTypeCheckerContext.addSubtypeConstraint(simpleTypeMarker3, simpleTypeMarker4);
            return zBooleanValue;
        }
        kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarkerTypeConstructor = abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2);
        if ((abstractTypeCheckerContext.isEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker), typeConstructorMarkerTypeConstructor) && abstractTypeCheckerContext.parametersCount(typeConstructorMarkerTypeConstructor) == 0) || abstractTypeCheckerContext.isAnyConstructor(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2))) {
            return true;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> listFindCorrespondingSupertypes = findCorrespondingSupertypes(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarkerTypeConstructor);
        int size = listFindCorrespondingSupertypes.size();
        if (size == 0) {
            return hasNothingSupertype(abstractTypeCheckerContext, simpleTypeMarker);
        }
        if (size == 1) {
            return isSubtypeForSameConstructor(abstractTypeCheckerContext, abstractTypeCheckerContext.asArgumentList((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) kotlin.collections.CollectionsKt.first((java.util.List) listFindCorrespondingSupertypes)), simpleTypeMarker2);
        }
        int i = kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.WhenMappings.$EnumSwitchMapping$0[abstractTypeCheckerContext.getSameConstructorPolicy().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return isSubtypeForSameConstructor(abstractTypeCheckerContext, abstractTypeCheckerContext.asArgumentList((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) kotlin.collections.CollectionsKt.first((java.util.List) listFindCorrespondingSupertypes)), simpleTypeMarker2);
        }
        if (i == 3 || i == 4) {
            java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> list = listFindCorrespondingSupertypes;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (INSTANCE.isSubtypeForSameConstructor(abstractTypeCheckerContext, abstractTypeCheckerContext.asArgumentList((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) it.next()), simpleTypeMarker2)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                return true;
            }
        }
        if (abstractTypeCheckerContext.getSameConstructorPolicy() != kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.model.ArgumentList argumentList = new kotlin.reflect.jvm.internal.impl.types.model.ArgumentList(abstractTypeCheckerContext.parametersCount(typeConstructorMarkerTypeConstructor));
        int iParametersCount = abstractTypeCheckerContext.parametersCount(typeConstructorMarkerTypeConstructor);
        for (int i2 = 0; i2 < iParametersCount; i2++) {
            java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> list2 = listFindCorrespondingSupertypes;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker5 : list2) {
                kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker argumentOrNull = abstractTypeCheckerContext.getArgumentOrNull(simpleTypeMarker5, i2);
                if (argumentOrNull != null) {
                    if (!(abstractTypeCheckerContext.getVariance(argumentOrNull) == kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV)) {
                        argumentOrNull = null;
                    }
                    if (argumentOrNull != null && (type = abstractTypeCheckerContext.getType(argumentOrNull)) != null) {
                        arrayList.add(type);
                    }
                }
                throw new java.lang.IllegalStateException(("Incorrect type: " + simpleTypeMarker5 + ", subType: " + simpleTypeMarker + ", superType: " + simpleTypeMarker2).toString());
            }
            argumentList.add(abstractTypeCheckerContext.asTypeArgument(abstractTypeCheckerContext.intersectTypes(arrayList)));
        }
        return isSubtypeForSameConstructor(abstractTypeCheckerContext, argumentList, simpleTypeMarker2);
    }

    public final boolean isSubtypeForSameConstructor(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext isSubtypeForSameConstructor, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker capturedSubArguments, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker superType) {
        boolean zEqualTypes;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isSubtypeForSameConstructor, "$this$isSubtypeForSameConstructor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(capturedSubArguments, "capturedSubArguments");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(superType, "superType");
        kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarkerTypeConstructor = isSubtypeForSameConstructor.typeConstructor(superType);
        int iParametersCount = isSubtypeForSameConstructor.parametersCount(typeConstructorMarkerTypeConstructor);
        for (int i = 0; i < iParametersCount; i++) {
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker argument = isSubtypeForSameConstructor.getArgument(superType, i);
            if (!isSubtypeForSameConstructor.isStarProjection(argument)) {
                kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type = isSubtypeForSameConstructor.getType(argument);
                kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker = isSubtypeForSameConstructor.get(capturedSubArguments, i);
                isSubtypeForSameConstructor.getVariance(typeArgumentMarker);
                kotlin.reflect.jvm.internal.impl.types.model.TypeVariance typeVariance = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV;
                kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker type2 = isSubtypeForSameConstructor.getType(typeArgumentMarker);
                kotlin.reflect.jvm.internal.impl.types.model.TypeVariance typeVarianceEffectiveVariance = effectiveVariance(isSubtypeForSameConstructor.getVariance(isSubtypeForSameConstructor.getParameter(typeConstructorMarkerTypeConstructor, i)), isSubtypeForSameConstructor.getVariance(argument));
                if (typeVarianceEffectiveVariance != null) {
                    if (isSubtypeForSameConstructor.argumentsDepth > 100) {
                        throw new java.lang.IllegalStateException(("Arguments depth is too high. Some related argument: " + type2).toString());
                    }
                    isSubtypeForSameConstructor.argumentsDepth++;
                    int i2 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.WhenMappings.$EnumSwitchMapping$1[typeVarianceEffectiveVariance.ordinal()];
                    if (i2 == 1) {
                        zEqualTypes = INSTANCE.equalTypes(isSubtypeForSameConstructor, type2, type);
                    } else if (i2 == 2) {
                        zEqualTypes = INSTANCE.isSubtypeOf(isSubtypeForSameConstructor, type2, type);
                    } else {
                        if (i2 != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        zEqualTypes = INSTANCE.isSubtypeOf(isSubtypeForSameConstructor, type, type2);
                    }
                    isSubtypeForSameConstructor.argumentsDepth--;
                    if (!zEqualTypes) {
                        return false;
                    }
                } else {
                    return isSubtypeForSameConstructor.isErrorTypeEqualsToAnything();
                }
            }
        }
        return true;
    }

    private final boolean isCommonDenotableType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
        return abstractTypeCheckerContext.isDenotable(abstractTypeCheckerContext.typeConstructor(kotlinTypeMarker)) && !abstractTypeCheckerContext.isDynamic(kotlinTypeMarker) && !abstractTypeCheckerContext.isDefinitelyNotNullType(kotlinTypeMarker) && kotlin.jvm.internal.Intrinsics.areEqual(abstractTypeCheckerContext.typeConstructor(abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker)), abstractTypeCheckerContext.typeConstructor(abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker)));
    }

    public final kotlin.reflect.jvm.internal.impl.types.model.TypeVariance effectiveVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeVariance declared, kotlin.reflect.jvm.internal.impl.types.model.TypeVariance useSite) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(declared, "declared");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(useSite, "useSite");
        if (declared == kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV) {
            return useSite;
        }
        if (useSite == kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV || declared == useSite) {
            return declared;
        }
        return null;
    }

    private final java.lang.Boolean checkSubtypeForSpecialCases(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker2) {
        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker3 = simpleTypeMarker;
        boolean z = false;
        if (abstractTypeCheckerContext.isError(simpleTypeMarker3) || abstractTypeCheckerContext.isError(simpleTypeMarker2)) {
            if (abstractTypeCheckerContext.isErrorTypeEqualsToAnything()) {
                return true;
            }
            if (!abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker) || abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker2)) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(abstractTypeCheckerContext, abstractTypeCheckerContext.withNullability(simpleTypeMarker, false), abstractTypeCheckerContext.withNullability(simpleTypeMarker2, false)));
            }
            return false;
        }
        if (abstractTypeCheckerContext.isStubType(simpleTypeMarker) || abstractTypeCheckerContext.isStubType(simpleTypeMarker2)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarkerAsCapturedType = abstractTypeCheckerContext.asCapturedType(simpleTypeMarker2);
        kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarkerLowerType = capturedTypeMarkerAsCapturedType != null ? abstractTypeCheckerContext.lowerType(capturedTypeMarkerAsCapturedType) : null;
        if (capturedTypeMarkerAsCapturedType != null && kotlinTypeMarkerLowerType != null) {
            int i = kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.WhenMappings.$EnumSwitchMapping$2[abstractTypeCheckerContext.getLowerCapturedTypePolicy(simpleTypeMarker, capturedTypeMarkerAsCapturedType).ordinal()];
            if (i == 1) {
                return java.lang.Boolean.valueOf(isSubtypeOf(abstractTypeCheckerContext, simpleTypeMarker3, kotlinTypeMarkerLowerType));
            }
            if (i == 2 && isSubtypeOf(abstractTypeCheckerContext, simpleTypeMarker3, kotlinTypeMarkerLowerType)) {
                return true;
            }
        }
        kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarkerTypeConstructor = abstractTypeCheckerContext.typeConstructor(simpleTypeMarker2);
        if (!abstractTypeCheckerContext.isIntersection(typeConstructorMarkerTypeConstructor)) {
            return null;
        }
        abstractTypeCheckerContext.isMarkedNullable(simpleTypeMarker2);
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> collectionSupertypes = abstractTypeCheckerContext.supertypes(typeConstructorMarkerTypeConstructor);
        if ((collectionSupertypes instanceof java.util.Collection) && collectionSupertypes.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator<T> it = collectionSupertypes.iterator();
            while (it.hasNext()) {
                if (!INSTANCE.isSubtypeOf(abstractTypeCheckerContext, simpleTypeMarker3, (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) it.next())) {
                }
            }
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> collectAllSupertypesWithGivenTypeConstructor(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.DoCustomTransform doCustomTransformSubstitutionSupertypePolicy;
        if (abstractTypeCheckerContext.isCommonFinalClassConstructor(typeConstructorMarker)) {
            if (abstractTypeCheckerContext.areEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker), typeConstructorMarker)) {
                kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerCaptureFromArguments = abstractTypeCheckerContext.captureFromArguments(simpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING);
                if (simpleTypeMarkerCaptureFromArguments != null) {
                    simpleTypeMarker = simpleTypeMarkerCaptureFromArguments;
                }
                return kotlin.collections.CollectionsKt.listOf(simpleTypeMarker);
            }
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartList smartList = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
        abstractTypeCheckerContext.initialize();
        java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
        if (supertypesDeque == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
        if (supertypesSet == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        supertypesDeque.push(simpleTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() > 1000) {
                throw new java.lang.IllegalStateException(("Too many supertypes for type: " + simpleTypeMarker + ". Supertypes = " + kotlin.collections.CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null)).toString());
            }
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker current = supertypesDeque.pop();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(current, "current");
            if (supertypesSet.add(current)) {
                kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerCaptureFromArguments2 = abstractTypeCheckerContext.captureFromArguments(current, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING);
                if (simpleTypeMarkerCaptureFromArguments2 == null) {
                    simpleTypeMarkerCaptureFromArguments2 = current;
                }
                if (abstractTypeCheckerContext.areEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(simpleTypeMarkerCaptureFromArguments2), typeConstructorMarker)) {
                    smartList.add(simpleTypeMarkerCaptureFromArguments2);
                    doCustomTransformSubstitutionSupertypePolicy = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE;
                } else if (abstractTypeCheckerContext.argumentsCount(simpleTypeMarkerCaptureFromArguments2) == 0) {
                    doCustomTransformSubstitutionSupertypePolicy = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                } else {
                    doCustomTransformSubstitutionSupertypePolicy = abstractTypeCheckerContext.substitutionSupertypePolicy(simpleTypeMarkerCaptureFromArguments2);
                }
                if (!(!kotlin.jvm.internal.Intrinsics.areEqual(doCustomTransformSubstitutionSupertypePolicy, kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                    doCustomTransformSubstitutionSupertypePolicy = null;
                }
                if (doCustomTransformSubstitutionSupertypePolicy != null) {
                    java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it = abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(current)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(doCustomTransformSubstitutionSupertypePolicy.mo1272transformType(abstractTypeCheckerContext, it.next()));
                    }
                }
            }
        }
        abstractTypeCheckerContext.clear();
        return smartList;
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> collectAndFilter(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
        return selectOnlyPureKotlinSupertypes(abstractTypeCheckerContext, collectAllSupertypesWithGivenTypeConstructor(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarker));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> selectOnlyPureKotlinSupertypes(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> list) {
        if (list.size() < 2) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarkerAsArgumentList = abstractTypeCheckerContext.asArgumentList((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) next);
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext abstractTypeCheckerContext2 = abstractTypeCheckerContext;
            int size = abstractTypeCheckerContext2.size(typeArgumentListMarkerAsArgumentList);
            for (int i = 0; i < size; i++) {
                if (!(abstractTypeCheckerContext.asFlexibleType(abstractTypeCheckerContext.getType(abstractTypeCheckerContext2.get(typeArgumentListMarkerAsArgumentList, i))) == null)) {
                    z = false;
                    break;
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        return arrayList2.isEmpty() ^ true ? arrayList2 : list;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> findCorrespondingSupertypes(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext findCorrespondingSupertypes, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker baseType, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker constructor) {
        kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible lowerIfFlexible;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(findCorrespondingSupertypes, "$this$findCorrespondingSupertypes");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(baseType, "baseType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
        if (findCorrespondingSupertypes.isClassType(baseType)) {
            return collectAndFilter(findCorrespondingSupertypes, baseType, constructor);
        }
        if (!findCorrespondingSupertypes.isClassTypeConstructor(constructor) && !findCorrespondingSupertypes.isIntegerLiteralTypeConstructor(constructor)) {
            return collectAllSupertypesWithGivenTypeConstructor(findCorrespondingSupertypes, baseType, constructor);
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartList<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> smartList = new kotlin.reflect.jvm.internal.impl.utils.SmartList();
        findCorrespondingSupertypes.initialize();
        java.util.ArrayDeque<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesDeque = findCorrespondingSupertypes.getSupertypesDeque();
        if (supertypesDeque == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        java.util.Set<kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker> supertypesSet = findCorrespondingSupertypes.getSupertypesSet();
        if (supertypesSet == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        supertypesDeque.push(baseType);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() > 1000) {
                throw new java.lang.IllegalStateException(("Too many supertypes for type: " + baseType + ". Supertypes = " + kotlin.collections.CollectionsKt.joinToString$default(supertypesSet, null, null, null, 0, null, null, 63, null)).toString());
            }
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker current = supertypesDeque.pop();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(current, "current");
            if (supertypesSet.add(current)) {
                if (findCorrespondingSupertypes.isClassType(current)) {
                    smartList.add(current);
                    lowerIfFlexible = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE;
                } else {
                    lowerIfFlexible = kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (!(!kotlin.jvm.internal.Intrinsics.areEqual(lowerIfFlexible, kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                    lowerIfFlexible = null;
                }
                if (lowerIfFlexible != null) {
                    java.util.Iterator<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> it = findCorrespondingSupertypes.supertypes(findCorrespondingSupertypes.typeConstructor(current)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(lowerIfFlexible.mo1272transformType(findCorrespondingSupertypes, it.next()));
                    }
                }
            }
        }
        findCorrespondingSupertypes.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker it2 : smartList) {
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker abstractTypeChecker = INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
            kotlin.collections.CollectionsKt.addAll(arrayList, abstractTypeChecker.collectAndFilter(findCorrespondingSupertypes, it2, constructor));
        }
        return arrayList;
    }
}
