package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: ConstUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ConstUtil {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ConstUtil INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.ConstUtil();

    private ConstUtil() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean canBeUsedForConstVal(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        return kotlin.reflect.jvm.internal.impl.descriptors.ConstUtilKt.canBeUsedForConstVal(type);
    }
}
