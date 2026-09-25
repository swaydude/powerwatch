package kotlin.reflect.full;

/* JADX INFO: compiled from: KTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¨\u0006\u0007"}, d2 = {"isSubtypeOf", "", "Lkotlin/reflect/KType;", com.google.android.gms.fitness.FitnessActivities.OTHER, "isSupertypeOf", "withNullability", "nullable", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class KTypes {
    public static final kotlin.reflect.KType withNullability(final kotlin.reflect.KType withNullability, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(withNullability, "$this$withNullability");
        if (withNullability.getIsMarkedNullable()) {
            if (z) {
                return withNullability;
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeMakeNotNullable = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(((kotlin.reflect.jvm.internal.KTypeImpl) withNullability).getType());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinTypeMakeNotNullable, "TypeUtils.makeNotNullabl…(this as KTypeImpl).type)");
            return new kotlin.reflect.jvm.internal.KTypeImpl(kotlinTypeMakeNotNullable, new kotlin.jvm.functions.Function0<java.lang.reflect.Type>() { // from class: kotlin.reflect.full.KTypes.withNullability.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.lang.reflect.Type invoke() {
                    return ((kotlin.reflect.jvm.internal.KTypeImpl) withNullability).getJavaType$kotlin_reflection();
                }
            });
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = ((kotlin.reflect.jvm.internal.KTypeImpl) withNullability).getType();
        if (kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(type)) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeMakeNullableAsSpecified = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableAsSpecified(type, z);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinTypeMakeNullableAsSpecified, "TypeUtils.makeNullableAs…ied(kotlinType, nullable)");
            return new kotlin.reflect.jvm.internal.KTypeImpl(kotlinTypeMakeNullableAsSpecified, new kotlin.jvm.functions.Function0<java.lang.reflect.Type>() { // from class: kotlin.reflect.full.KTypes.withNullability.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final java.lang.reflect.Type invoke() {
                    return ((kotlin.reflect.jvm.internal.KTypeImpl) withNullability).getJavaType$kotlin_reflection();
                }
            });
        }
        if (!z) {
            return withNullability;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeMakeNullable = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullable(type);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(kotlinTypeMakeNullable, "TypeUtils.makeNullable(kotlinType)");
        return new kotlin.reflect.jvm.internal.KTypeImpl(kotlinTypeMakeNullable, new kotlin.jvm.functions.Function0<java.lang.reflect.Type>() { // from class: kotlin.reflect.full.KTypes.withNullability.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.reflect.Type invoke() {
                return ((kotlin.reflect.jvm.internal.KTypeImpl) withNullability).getJavaType$kotlin_reflection();
            }
        });
    }

    public static final boolean isSubtypeOf(kotlin.reflect.KType isSubtypeOf, kotlin.reflect.KType other) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isSubtypeOf, "$this$isSubtypeOf");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isSubtypeOf(((kotlin.reflect.jvm.internal.KTypeImpl) isSubtypeOf).getType(), ((kotlin.reflect.jvm.internal.KTypeImpl) other).getType());
    }

    public static final boolean isSupertypeOf(kotlin.reflect.KType isSupertypeOf, kotlin.reflect.KType other) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isSupertypeOf, "$this$isSupertypeOf");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
        return isSubtypeOf(other, isSupertypeOf);
    }
}
