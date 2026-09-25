package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: flexibleTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FlexibleTypesKt {
    public static final boolean isFlexible(kotlin.reflect.jvm.internal.impl.types.KotlinType isFlexible) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isFlexible, "$this$isFlexible");
        return isFlexible.unwrap() instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.FlexibleType asFlexibleType(kotlin.reflect.jvm.internal.impl.types.KotlinType asFlexibleType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(asFlexibleType, "$this$asFlexibleType");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = asFlexibleType.unwrap();
        if (unwrappedTypeUnwrap != null) {
            return (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedTypeUnwrap;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType lowerIfFlexible(kotlin.reflect.jvm.internal.impl.types.KotlinType lowerIfFlexible) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(lowerIfFlexible, "$this$lowerIfFlexible");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = lowerIfFlexible.unwrap();
        if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            return ((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedTypeUnwrap).getLowerBound();
        }
        if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            return (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedTypeUnwrap;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType upperIfFlexible(kotlin.reflect.jvm.internal.impl.types.KotlinType upperIfFlexible) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(upperIfFlexible, "$this$upperIfFlexible");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = upperIfFlexible.unwrap();
        if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            return ((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedTypeUnwrap).getUpperBound();
        }
        if (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            return (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrappedTypeUnwrap;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
