package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeWithEnhancement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeWithEnhancementKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType getEnhancement(kotlin.reflect.jvm.internal.impl.types.KotlinType getEnhancement) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getEnhancement, "$this$getEnhancement");
        if (getEnhancement instanceof kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement) {
            return ((kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement) getEnhancement).getEnhancement();
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType unwrapEnhancement(kotlin.reflect.jvm.internal.impl.types.KotlinType unwrapEnhancement) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(unwrapEnhancement, "$this$unwrapEnhancement");
        kotlin.reflect.jvm.internal.impl.types.KotlinType enhancement = getEnhancement(unwrapEnhancement);
        return enhancement != null ? enhancement : unwrapEnhancement;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.UnwrappedType inheritEnhancement(kotlin.reflect.jvm.internal.impl.types.UnwrappedType inheritEnhancement, kotlin.reflect.jvm.internal.impl.types.KotlinType origin) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(inheritEnhancement, "$this$inheritEnhancement");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(origin, "origin");
        return wrapEnhancement(inheritEnhancement, getEnhancement(origin));
    }

    public static final kotlin.reflect.jvm.internal.impl.types.UnwrappedType wrapEnhancement(kotlin.reflect.jvm.internal.impl.types.UnwrappedType wrapEnhancement, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(wrapEnhancement, "$this$wrapEnhancement");
        if (kotlinType == null) {
            return wrapEnhancement;
        }
        if (wrapEnhancement instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
            return new kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement((kotlin.reflect.jvm.internal.impl.types.SimpleType) wrapEnhancement, kotlinType);
        }
        if (wrapEnhancement instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            return new kotlin.reflect.jvm.internal.impl.types.FlexibleTypeWithEnhancement((kotlin.reflect.jvm.internal.impl.types.FlexibleType) wrapEnhancement, kotlinType);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
