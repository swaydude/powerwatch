package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* JADX INFO: compiled from: PrimitiveTypeUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PrimitiveTypeUtilKt {
    public static final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> getAllSignedLiteralTypes(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor allSignedLiteralTypes) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(allSignedLiteralTypes, "$this$allSignedLiteralTypes");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.types.SimpleType[]{allSignedLiteralTypes.getBuiltIns().getIntType(), allSignedLiteralTypes.getBuiltIns().getLongType(), allSignedLiteralTypes.getBuiltIns().getByteType(), allSignedLiteralTypes.getBuiltIns().getShortType()});
    }
}
