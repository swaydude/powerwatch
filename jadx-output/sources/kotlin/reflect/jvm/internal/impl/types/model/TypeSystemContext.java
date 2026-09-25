package kotlin.reflect.jvm.internal.impl.types.model;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface TypeSystemContext extends kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext {
    int argumentsCount(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker asArgumentList(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker asCapturedType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker asDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker asDynamicType(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asSimpleType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker asTypeArgument(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker captureFromArguments(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus);

    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker get(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarker, int i);

    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgument(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, int i);

    kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getParameter(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker, int i);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getType(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker intersectTypes(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> list);

    boolean isAnyConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isClassTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isCommonFinalClassConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isDenotable(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker2);

    boolean isError(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isIntegerLiteralTypeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isIntersection(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isMarkedNullable(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    boolean isNotNullNothing(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    boolean isNothingConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    boolean isSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    boolean isStarProjection(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker);

    boolean isStubType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBound(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerType(kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker);

    int parametersCount(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> possibleIntegerTypes(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    int size(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker typeArgumentListMarker);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> supertypes(kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBound(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker, boolean z);

    /* JADX INFO: compiled from: TypeSystemContext.kt */
    public static final class DefaultImpls {
        public static boolean identicalArguments(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker a, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker b) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
            return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext.DefaultImpls.identicalArguments(typeSystemContext, a, b);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgumentOrNull(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker getArgumentOrNull, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getArgumentOrNull, "$this$getArgumentOrNull");
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker = getArgumentOrNull;
            int iArgumentsCount = typeSystemContext.argumentsCount(simpleTypeMarker);
            if (i >= 0 && iArgumentsCount > i) {
                return typeSystemContext.getArgument(simpleTypeMarker, i);
            }
            return null;
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerBoundIfFlexible) {
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerAsSimpleType;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerBoundIfFlexible, "$this$lowerBoundIfFlexible");
            kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = typeSystemContext.asFlexibleType(lowerBoundIfFlexible);
            if ((flexibleTypeMarkerAsFlexibleType == null || (simpleTypeMarkerAsSimpleType = typeSystemContext.lowerBound(flexibleTypeMarkerAsFlexibleType)) == null) && (simpleTypeMarkerAsSimpleType = typeSystemContext.asSimpleType(lowerBoundIfFlexible)) == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            return simpleTypeMarkerAsSimpleType;
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBoundIfFlexible(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker upperBoundIfFlexible) {
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerAsSimpleType;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperBoundIfFlexible, "$this$upperBoundIfFlexible");
            kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = typeSystemContext.asFlexibleType(upperBoundIfFlexible);
            if ((flexibleTypeMarkerAsFlexibleType == null || (simpleTypeMarkerAsSimpleType = typeSystemContext.upperBound(flexibleTypeMarkerAsFlexibleType)) == null) && (simpleTypeMarkerAsSimpleType = typeSystemContext.asSimpleType(upperBoundIfFlexible)) == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            return simpleTypeMarkerAsSimpleType;
        }

        public static boolean isDynamic(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isDynamic) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDynamic, "$this$isDynamic");
            kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = typeSystemContext.asFlexibleType(isDynamic);
            return (flexibleTypeMarkerAsFlexibleType != null ? typeSystemContext.asDynamicType(flexibleTypeMarkerAsFlexibleType) : null) != null;
        }

        public static boolean isDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker isDefinitelyNotNullType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDefinitelyNotNullType, "$this$isDefinitelyNotNullType");
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerAsSimpleType = typeSystemContext.asSimpleType(isDefinitelyNotNullType);
            return (simpleTypeMarkerAsSimpleType != null ? typeSystemContext.asDefinitelyNotNullType(simpleTypeMarkerAsSimpleType) : null) != null;
        }

        public static boolean hasFlexibleNullability(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker hasFlexibleNullability) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(hasFlexibleNullability, "$this$hasFlexibleNullability");
            return typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(hasFlexibleNullability)) != typeSystemContext.isMarkedNullable(typeSystemContext.upperBoundIfFlexible(hasFlexibleNullability));
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker typeConstructor) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeConstructor, "$this$typeConstructor");
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerAsSimpleType = typeSystemContext.asSimpleType(typeConstructor);
            if (simpleTypeMarkerAsSimpleType == null) {
                simpleTypeMarkerAsSimpleType = typeSystemContext.lowerBoundIfFlexible(typeConstructor);
            }
            return typeSystemContext.typeConstructor(simpleTypeMarkerAsSimpleType);
        }

        public static boolean isClassType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isClassType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isClassType, "$this$isClassType");
            return typeSystemContext.isClassTypeConstructor(typeSystemContext.typeConstructor(isClassType));
        }

        public static boolean isIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker isIntegerLiteralType) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isIntegerLiteralType, "$this$isIntegerLiteralType");
            return typeSystemContext.isIntegerLiteralTypeConstructor(typeSystemContext.typeConstructor(isIntegerLiteralType));
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker get(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker get, int i) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(get, "$this$get");
            if (get instanceof kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) {
                return typeSystemContext.getArgument((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) get, i);
            }
            if (get instanceof kotlin.reflect.jvm.internal.impl.types.model.ArgumentList) {
                kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker = ((kotlin.reflect.jvm.internal.impl.types.model.ArgumentList) get).get(i);
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeArgumentMarker, "get(index)");
                return typeArgumentMarker;
            }
            throw new java.lang.IllegalStateException(("unknown type argument list type: " + get + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(get.getClass())).toString());
        }

        public static int size(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker size) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(size, "$this$size");
            if (size instanceof kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) {
                return typeSystemContext.argumentsCount((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) size);
            }
            if (size instanceof kotlin.reflect.jvm.internal.impl.types.model.ArgumentList) {
                return ((kotlin.reflect.jvm.internal.impl.types.model.ArgumentList) size).size();
            }
            throw new java.lang.IllegalStateException(("unknown type argument list type: " + size + ", " + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(size.getClass())).toString());
        }
    }
}
