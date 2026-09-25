package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinTypeKt {
    public static final boolean isNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType isNullable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isNullable, "$this$isNullable");
        return kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(isNullable);
    }

    public static final boolean isError(kotlin.reflect.jvm.internal.impl.types.KotlinType isError) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isError, "$this$isError");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedTypeUnwrap = isError.unwrap();
        return (unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.ErrorType) || ((unwrappedTypeUnwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) && (((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedTypeUnwrap).getDelegate() instanceof kotlin.reflect.jvm.internal.impl.types.ErrorType));
    }
}
