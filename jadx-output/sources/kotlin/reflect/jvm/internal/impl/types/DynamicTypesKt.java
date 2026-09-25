package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: dynamicTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DynamicTypesKt {
    public static final boolean isDynamic(kotlin.reflect.jvm.internal.impl.types.KotlinType isDynamic) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isDynamic, "$this$isDynamic");
        return isDynamic.unwrap() instanceof kotlin.reflect.jvm.internal.impl.types.DynamicType;
    }
}
