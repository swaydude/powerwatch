package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: ConstUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ConstUtilKt {
    public static final boolean canBeUsedForConstVal(kotlin.reflect.jvm.internal.impl.types.KotlinType canBeUsedForConstVal) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(canBeUsedForConstVal, "$this$canBeUsedForConstVal");
        return ((kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveType(canBeUsedForConstVal) || kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE.isUnsignedType(canBeUsedForConstVal)) && !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(canBeUsedForConstVal)) || kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(canBeUsedForConstVal);
    }
}
