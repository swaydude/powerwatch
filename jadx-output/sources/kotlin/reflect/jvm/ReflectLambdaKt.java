package kotlin.reflect.jvm;

/* JADX INFO: compiled from: reflectLambda.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, d2 = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class ReflectLambdaKt {
    public static final <R> kotlin.reflect.KFunction<R> reflect(kotlin.Function<? extends R> reflect) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(reflect, "$this$reflect");
        kotlin.Metadata metadata = (kotlin.Metadata) reflect.getClass().getAnnotation(kotlin.Metadata.class);
        if (metadata != null) {
            java.lang.String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> functionDataFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(strArrD1, metadata.d2());
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver jvmNameResolverComponent1 = functionDataFrom.component1();
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function functionComponent2 = functionDataFrom.component2();
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion jvmMetadataVersion = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion(metadata.mv(), (metadata.xi() & 8) != 0);
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable = functionComponent2.getTypeTable();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeTable, "proto.typeTable");
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor simpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) kotlin.reflect.jvm.internal.UtilKt.deserializeToDescriptor(reflect.getClass(), functionComponent2, jvmNameResolverComponent1, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable), jvmMetadataVersion, kotlin.reflect.jvm.ReflectLambdaKt$reflect$descriptor$1.INSTANCE);
                if (simpleFunctionDescriptor != null) {
                    return new kotlin.reflect.jvm.internal.KFunctionImpl(kotlin.reflect.jvm.internal.EmptyContainerForLocal.INSTANCE, simpleFunctionDescriptor);
                }
            }
        }
        return null;
    }
}
