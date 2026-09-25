package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: AbstractStrictEqualityTypeChecker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AbstractStrictEqualityTypeChecker {
    public static final kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker INSTANCE = new kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker();

    private AbstractStrictEqualityTypeChecker() {
    }

    public final boolean strictEqualTypes(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext context, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker a, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker b) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(a, "a");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(b, "b");
        return strictEqualTypesInternal(context, a, b);
    }

    private final boolean strictEqualTypesInternal(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerAsSimpleType = typeSystemContext.asSimpleType(kotlinTypeMarker);
        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarkerAsSimpleType2 = typeSystemContext.asSimpleType(kotlinTypeMarker2);
        if (simpleTypeMarkerAsSimpleType != null && simpleTypeMarkerAsSimpleType2 != null) {
            return strictEqualSimpleTypes(typeSystemContext, simpleTypeMarkerAsSimpleType, simpleTypeMarkerAsSimpleType2);
        }
        kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = typeSystemContext.asFlexibleType(kotlinTypeMarker);
        kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType2 = typeSystemContext.asFlexibleType(kotlinTypeMarker2);
        return flexibleTypeMarkerAsFlexibleType != null && flexibleTypeMarkerAsFlexibleType2 != null && strictEqualSimpleTypes(typeSystemContext, typeSystemContext.lowerBound(flexibleTypeMarkerAsFlexibleType), typeSystemContext.lowerBound(flexibleTypeMarkerAsFlexibleType2)) && strictEqualSimpleTypes(typeSystemContext, typeSystemContext.upperBound(flexibleTypeMarkerAsFlexibleType), typeSystemContext.upperBound(flexibleTypeMarkerAsFlexibleType2));
    }

    private final boolean strictEqualSimpleTypes(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext typeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker2) {
        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker3 = simpleTypeMarker;
        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker4 = simpleTypeMarker2;
        if (typeSystemContext.argumentsCount(simpleTypeMarker3) == typeSystemContext.argumentsCount(simpleTypeMarker4) && typeSystemContext.isMarkedNullable(simpleTypeMarker) == typeSystemContext.isMarkedNullable(simpleTypeMarker2)) {
            if ((typeSystemContext.asDefinitelyNotNullType(simpleTypeMarker) == null) == (typeSystemContext.asDefinitelyNotNullType(simpleTypeMarker2) == null) && typeSystemContext.isEqualTypeConstructors(typeSystemContext.typeConstructor(simpleTypeMarker), typeSystemContext.typeConstructor(simpleTypeMarker2))) {
                if (typeSystemContext.identicalArguments(simpleTypeMarker, simpleTypeMarker2)) {
                    return true;
                }
                int iArgumentsCount = typeSystemContext.argumentsCount(simpleTypeMarker3);
                for (int i = 0; i < iArgumentsCount; i++) {
                    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker argument = typeSystemContext.getArgument(simpleTypeMarker3, i);
                    kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker argument2 = typeSystemContext.getArgument(simpleTypeMarker4, i);
                    if (typeSystemContext.isStarProjection(argument) != typeSystemContext.isStarProjection(argument2)) {
                        return false;
                    }
                    if (!typeSystemContext.isStarProjection(argument) && (typeSystemContext.getVariance(argument) != typeSystemContext.getVariance(argument2) || !strictEqualTypesInternal(typeSystemContext, typeSystemContext.getType(argument), typeSystemContext.getType(argument2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
