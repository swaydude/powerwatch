package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ClassicTypeSystemContext extends kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext {
    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asSimpleType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isNothingConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
    public static final class DefaultImpls {
        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker get(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker get, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(get, "$this$get");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.get(classicTypeSystemContext, get, i);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgumentOrNull(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker getArgumentOrNull, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getArgumentOrNull, "$this$getArgumentOrNull");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.getArgumentOrNull(classicTypeSystemContext, getArgumentOrNull, i);
        }

        public static boolean hasFlexibleNullability(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker hasFlexibleNullability) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(hasFlexibleNullability, "$this$hasFlexibleNullability");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.hasFlexibleNullability(classicTypeSystemContext, hasFlexibleNullability);
        }

        public static boolean isClassType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isClassType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isClassType, "$this$isClassType");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.isClassType(classicTypeSystemContext, isClassType);
        }

        public static boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isDefinitelyNotNullType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDefinitelyNotNullType, "$this$isDefinitelyNotNullType");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.isDefinitelyNotNullType(classicTypeSystemContext, isDefinitelyNotNullType);
        }

        public static boolean isDynamic(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isDynamic) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDynamic, "$this$isDynamic");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.isDynamic(classicTypeSystemContext, isDynamic);
        }

        public static boolean isIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isIntegerLiteralType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isIntegerLiteralType, "$this$isIntegerLiteralType");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.isIntegerLiteralType(classicTypeSystemContext, isIntegerLiteralType);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerBoundIfFlexible) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBoundIfFlexible, "$this$lowerBoundIfFlexible");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.lowerBoundIfFlexible(classicTypeSystemContext, lowerBoundIfFlexible);
        }

        public static int size(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker size) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(size, "$this$size");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.size(classicTypeSystemContext, size);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker typeConstructor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeConstructor, "$this$typeConstructor");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.typeConstructor(classicTypeSystemContext, typeConstructor);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker upperBoundIfFlexible) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBoundIfFlexible, "$this$upperBoundIfFlexible");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext.DefaultImpls.upperBoundIfFlexible(classicTypeSystemContext, upperBoundIfFlexible);
        }

        public static boolean isDenotable(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isDenotable) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDenotable, "$this$isDenotable");
            if (isDenotable instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) isDenotable).isDenotable();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isDenotable + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isDenotable.getClass())).toString());
        }

        public static boolean isIntegerLiteralTypeConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isIntegerLiteralTypeConstructor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isIntegerLiteralTypeConstructor, "$this$isIntegerLiteralTypeConstructor");
            if (isIntegerLiteralTypeConstructor instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return isIntegerLiteralTypeConstructor instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isIntegerLiteralTypeConstructor + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isIntegerLiteralTypeConstructor.getClass())).toString());
        }

        public static java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> possibleIntegerTypes(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker possibleIntegerTypes) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(possibleIntegerTypes, "$this$possibleIntegerTypes");
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarkerTypeConstructor = classicTypeSystemContext.typeConstructor(possibleIntegerTypes);
            if (typeConstructorMarkerTypeConstructor instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) {
                return ((kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) typeConstructorMarkerTypeConstructor).getPossibleTypes();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + possibleIntegerTypes + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(possibleIntegerTypes.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker withNullability, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(withNullability, "$this$withNullability");
            if (withNullability instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return ((kotlin.reflect.jvm.internal.impl.types.SimpleType) withNullability).makeNullableAsSpecified(z);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + withNullability + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(withNullability.getClass())).toString());
        }

        public static boolean isError(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isError) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isError, "$this$isError");
            if (isError instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError((kotlin.reflect.jvm.internal.impl.types.KotlinType) isError);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isError + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isError.getClass())).toString());
        }

        public static boolean isStubType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isStubType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isStubType, "$this$isStubType");
            if (isStubType instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return isStubType instanceof kotlin.reflect.jvm.internal.impl.types.StubType;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isStubType + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isStubType.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker lowerType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerType, "$this$lowerType");
            if (lowerType instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) {
                return ((kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) lowerType).getLowerType();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lowerType + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(lowerType.getClass())).toString());
        }

        public static boolean isIntersection(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isIntersection) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isIntersection, "$this$isIntersection");
            if (isIntersection instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return isIntersection instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isIntersection + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isIntersection.getClass())).toString());
        }

        public static boolean identicalArguments(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker a, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker b) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
            if (a instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                if (b instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                    return ((kotlin.reflect.jvm.internal.impl.types.SimpleType) a).getArguments() == ((kotlin.reflect.jvm.internal.impl.types.SimpleType) b).getArguments();
                }
                throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(b.getClass())).toString());
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(a.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asSimpleType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker asSimpleType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asSimpleType, "$this$asSimpleType");
            if (asSimpleType instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) asSimpleType).unwrap();
                if (!(unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
                    unwrappedTypeUnwrap = null;
                }
                return (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedTypeUnwrap;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + asSimpleType + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(asSimpleType.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker asFlexibleType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asFlexibleType, "$this$asFlexibleType");
            if (asFlexibleType instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) asFlexibleType).unwrap();
                if (!(unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType)) {
                    unwrappedTypeUnwrap = null;
                }
                return (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedTypeUnwrap;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + asFlexibleType + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(asFlexibleType.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker asDynamicType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asDynamicType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asDynamicType, "$this$asDynamicType");
            if (asDynamicType instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
                if (!(asDynamicType instanceof kotlin.reflect.jvm.internal.impl.types.DynamicType)) {
                    asDynamicType = null;
                }
                return (kotlin.reflect.jvm.internal.impl.types.DynamicType) asDynamicType;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + asDynamicType + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(asDynamicType.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBound(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker upperBound) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBound, "$this$upperBound");
            if (upperBound instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
                return ((kotlin.reflect.jvm.internal.impl.types.FlexibleType) upperBound).getUpperBound();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + upperBound + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(upperBound.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBound(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker lowerBound) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBound, "$this$lowerBound");
            if (lowerBound instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
                return ((kotlin.reflect.jvm.internal.impl.types.FlexibleType) lowerBound).getLowerBound();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + lowerBound + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(lowerBound.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker asCapturedType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asCapturedType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asCapturedType, "$this$asCapturedType");
            if (asCapturedType instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                if (!(asCapturedType instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType)) {
                    asCapturedType = null;
                }
                return (kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) asCapturedType;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + asCapturedType + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(asCapturedType.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker asDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asDefinitelyNotNullType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asDefinitelyNotNullType, "$this$asDefinitelyNotNullType");
            if (asDefinitelyNotNullType instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                if (!(asDefinitelyNotNullType instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType)) {
                    asDefinitelyNotNullType = null;
                }
                return (kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) asDefinitelyNotNullType;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + asDefinitelyNotNullType + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(asDefinitelyNotNullType.getClass())).toString());
        }

        public static boolean isMarkedNullable(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isMarkedNullable) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isMarkedNullable, "$this$isMarkedNullable");
            if (isMarkedNullable instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return ((kotlin.reflect.jvm.internal.impl.types.SimpleType) isMarkedNullable).isMarkedNullable();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isMarkedNullable + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isMarkedNullable.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker typeConstructor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeConstructor, "$this$typeConstructor");
            if (typeConstructor instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return ((kotlin.reflect.jvm.internal.impl.types.SimpleType) typeConstructor).getConstructor();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + typeConstructor + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructor.getClass())).toString());
        }

        public static int argumentsCount(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker argumentsCount) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(argumentsCount, "$this$argumentsCount");
            if (argumentsCount instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return ((kotlin.reflect.jvm.internal.impl.types.KotlinType) argumentsCount).getArguments().size();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + argumentsCount + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(argumentsCount.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgument(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getArgument, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getArgument, "$this$getArgument");
            if (getArgument instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return ((kotlin.reflect.jvm.internal.impl.types.KotlinType) getArgument).getArguments().get(i);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + getArgument + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getArgument.getClass())).toString());
        }

        public static boolean isStarProjection(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker isStarProjection) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isStarProjection, "$this$isStarProjection");
            if (isStarProjection instanceof kotlin.reflect.jvm.internal.impl.types.TypeProjection) {
                return ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) isStarProjection).isStarProjection();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isStarProjection + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isStarProjection.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getVariance) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getVariance, "$this$getVariance");
            if (getVariance instanceof kotlin.reflect.jvm.internal.impl.types.TypeProjection) {
                kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) getVariance).getProjectionKind();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(projectionKind, "this.projectionKind");
                return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContextKt.convertVariance(projectionKind);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + getVariance + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getVariance.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getType, "$this$getType");
            if (getType instanceof kotlin.reflect.jvm.internal.impl.types.TypeProjection) {
                return ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) getType).getType().unwrap();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + getType + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getType.getClass())).toString());
        }

        public static int parametersCount(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker parametersCount) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parametersCount, "$this$parametersCount");
            if (parametersCount instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) parametersCount).getParameters().size();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + parametersCount + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(parametersCount.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getParameter(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker getParameter, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getParameter, "$this$getParameter");
            if (getParameter instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) getParameter).getParameters().get(i);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameterDescriptor, "this.parameters[index]");
                return typeParameterDescriptor;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + getParameter + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getParameter.getClass())).toString());
        }

        public static java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> supertypes(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker supertypes) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(supertypes, "$this$supertypes");
            if (supertypes instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) supertypes).mo1269getSupertypes();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionMo1269getSupertypes, "this.supertypes");
                return collectionMo1269getSupertypes;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + supertypes + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(supertypes.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getVariance) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getVariance, "$this$getVariance");
            if (getVariance instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                kotlin.reflect.jvm.internal.impl.types.Variance variance = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) getVariance).getVariance();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(variance, "this.variance");
                return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContextKt.convertVariance(variance);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + getVariance + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getVariance.getClass())).toString());
        }

        public static boolean isEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker c1, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker c2) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c1, "c1");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c2, "c2");
            if (c1 instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                if (c2 instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                    return kotlin.jvm.internal.Intrinsics.areEqual(c1, c2);
                }
                throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c2 + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(c2.getClass())).toString());
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c1 + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(c1.getClass())).toString());
        }

        public static boolean isClassTypeConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isClassTypeConstructor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isClassTypeConstructor, "$this$isClassTypeConstructor");
            if (isClassTypeConstructor instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) isClassTypeConstructor).mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isClassTypeConstructor + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isClassTypeConstructor.getClass())).toString());
        }

        public static boolean isCommonFinalClassConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isCommonFinalClassConstructor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isCommonFinalClassConstructor, "$this$isCommonFinalClassConstructor");
            if (isCommonFinalClassConstructor instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) isCommonFinalClassConstructor).mo1268getDeclarationDescriptor();
                if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                    classifierDescriptorMo1268getDeclarationDescriptor = null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
                return (classDescriptor == null || !kotlin.reflect.jvm.internal.impl.descriptors.ModalityKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY || classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isCommonFinalClassConstructor + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isCommonFinalClassConstructor.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker asArgumentList(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asArgumentList) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asArgumentList, "$this$asArgumentList");
            if (asArgumentList instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return (kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker) asArgumentList;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + asArgumentList + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(asArgumentList.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker captureFromArguments(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker type, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus status) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(status, "status");
            if (type instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeKt.captureFromArguments$default((kotlin.reflect.jvm.internal.impl.types.SimpleType) type, status, null, 4, null);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(type.getClass())).toString());
        }

        public static boolean isAnyConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isAnyConstructor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isAnyConstructor, "$this$isAnyConstructor");
            if (isAnyConstructor instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isTypeConstructorForGivenClass((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) isAnyConstructor, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.any);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isAnyConstructor + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isAnyConstructor.getClass())).toString());
        }

        public static boolean isNothingConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker isNothingConstructor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isNothingConstructor, "$this$isNothingConstructor");
            if (isNothingConstructor instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isTypeConstructorForGivenClass((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) isNothingConstructor, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.nothing);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isNothingConstructor + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isNothingConstructor.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker asTypeArgument(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker asTypeArgument) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asTypeArgument, "$this$asTypeArgument");
            if (asTypeArgument instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection((kotlin.reflect.jvm.internal.impl.types.KotlinType) asTypeArgument);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + asTypeArgument + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(asTypeArgument.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isSingleClassifierType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isSingleClassifierType, "$this$isSingleClassifierType");
            if (isSingleClassifierType instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                if (!kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError((kotlin.reflect.jvm.internal.impl.types.KotlinType) isSingleClassifierType)) {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) isSingleClassifierType;
                    if (!(simpleType.getConstructor().mo1268getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) && (simpleType.getConstructor().mo1268getDeclarationDescriptor() != null || (isSingleClassifierType instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType) || (isSingleClassifierType instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) || (isSingleClassifierType instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) || (simpleType.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor))) {
                        return true;
                    }
                }
                return false;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isSingleClassifierType + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isSingleClassifierType.getClass())).toString());
        }

        public static boolean isNotNullNothing(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isNotNullNothing) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isNotNullNothing, "$this$isNotNullNothing");
            if (isNotNullNothing instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return classicTypeSystemContext.isNothingConstructor(classicTypeSystemContext.typeConstructor(isNotNullNothing)) && !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType((kotlin.reflect.jvm.internal.impl.types.KotlinType) isNotNullNothing);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + isNotNullNothing + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(isNotNullNothing.getClass())).toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker intersectTypes(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> types) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(types, "types");
            return kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt.intersectTypes(types);
        }

        public static kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext newBaseTypeCheckerContext(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, boolean z) {
            return new kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerContext(z, false, 2, null);
        }
    }
}
